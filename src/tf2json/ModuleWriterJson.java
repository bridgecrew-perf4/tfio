package tf2json;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

import org.antlr.v4.runtime.atn.AmbiguityInfo;
import org.antlr.v4.runtime.atn.ContextSensitivityInfo;
import org.antlr.v4.runtime.atn.DecisionInfo;
import org.antlr.v4.runtime.atn.ParseInfo;

import data.Block;
import data.Expression;
import data.Module;

public class ModuleWriterJson {
	
	private Module module;
	
	public ModuleWriterJson(Module module) {
		this.module = module;
	}
	
	public void printJson(OutputStream stream) {
		JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
		jsonBuilder.add(module.getKey(), buildJsonObjectModule(module));
		for (Entry<String, Module> childModuleEntry : module.getChildModules().entrySet()) {
			jsonBuilder.add(childModuleEntry.getKey(), buildJsonObjectModule(childModuleEntry.getValue()));
		}
		Json.createWriter(stream).writeObject(jsonBuilder.build());
	}
	
	private JsonObject buildJsonObjectModule(Module module) {
		JsonObjectBuilder moduleBuilder = Json.createObjectBuilder();
		moduleBuilder.add("terraform", buildJsonObjectFromBlock(module.getTerraformBlock()));
		moduleBuilder.add("providers", buildJsonObjectsFromBlocks(module.getProviderBlocks()));
		moduleBuilder.add("resources", buildJsonObjectsFromBlocks(module.getResourceBlocks()));
		moduleBuilder.add("datas", buildJsonObjectsFromBlocks(module.getDataBlocks()));
		moduleBuilder.add("variables", buildJsonObjectsFromBlocks(module.getVariableBlocks()));
		moduleBuilder.add("outputs", buildJsonObjectsFromBlocks(module.getOutputBlocks()));
		moduleBuilder.add("locals", buildJsonObjectFromArguments(module.getLocals()));
		moduleBuilder.add("modules", buildJsonObjectsFromBlocks(module.getModuleBlocks()));
		moduleBuilder.add("comments", buildJsonObjectFromMap(module.getComments()));
		moduleBuilder.add("parseInfo", buildJsonObjectFromParseInfo(module.getParseInfo()));
		moduleBuilder.add("filesToBlocks", buildFileBlockMap(module.getFileBlockInOrder()));
		return moduleBuilder.build();
	}
	
	private JsonValue buildFileBlockMap(Map<String, ArrayList<String>> fileBlockInOrder) {
		JsonObjectBuilder builder = Json.createObjectBuilder();
		for (Map.Entry<String, ArrayList<String>> entry : fileBlockInOrder.entrySet()) {
			builder.add(entry.getKey(), buildJsonArray(entry.getValue()));
		}
		return builder.build();
	}

	private JsonObject buildJsonObjectFromParseInfo(ParseInfo parseInfo) {
		JsonObjectBuilder blockBuilder = Json.createObjectBuilder();
		blockBuilder.add("dfaSize", parseInfo.getDFASize());
		blockBuilder.add("totalTime", parseInfo.getTotalTimeInPrediction());
		blockBuilder.add("totalATNLookaheadOps", parseInfo.getTotalATNLookaheadOps());
		blockBuilder.add("totalLLLookaheadOps", parseInfo.getTotalLLLookaheadOps());
		blockBuilder.add("totalLLATNLookaheadOps", parseInfo.getTotalLLATNLookaheadOps());
		blockBuilder.add("totalSLLLookaheadOps", parseInfo.getTotalSLLLookaheadOps());
		blockBuilder.add("totalSLLATNLookaheadOps", parseInfo.getTotalSLLATNLookaheadOps());
		
		blockBuilder.add("decisions", buildJsonArray3(parseInfo.getLLDecisions()));
		for (DecisionInfo info : parseInfo.getDecisionInfo()) {
			blockBuilder.add("sensitivities", buildJsonArray1(info.contextSensitivities));
			blockBuilder.add("ambiguities", buildJsonArray2(info.ambiguities));
		}
		
		return blockBuilder.build();
	}

	private JsonValue buildJsonArray3(List<Integer> decisions) {
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		for (int string : decisions) {
			arrayBuilder.add(string);
		}
		return arrayBuilder.build();
	}

	private JsonArray buildJsonArray1(List<ContextSensitivityInfo> contextSensitivities) {
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		for (ContextSensitivityInfo string : contextSensitivities) {
			arrayBuilder.add(string.decision);
		}
		return arrayBuilder.build();
	}

	private JsonArray buildJsonArray2(List<AmbiguityInfo> ambiguities) {
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		for (AmbiguityInfo string : ambiguities) {
			arrayBuilder.add(string.decision);
		}
		return arrayBuilder.build();
	}

	private JsonObject buildJsonObjectFromMap(TreeMap<Integer, String> comments) {
		JsonObjectBuilder blockBuilder = Json.createObjectBuilder();
		for (Map.Entry<Integer, String> lineNumberToComment : comments.entrySet()) {
			blockBuilder.add(lineNumberToComment.getKey().toString(), lineNumberToComment.getValue());
		}
		return blockBuilder.build();
	}

	private JsonObject buildJsonObjectsFromBlocks(Map<String, Block> blocks) {
		JsonObjectBuilder blockBuilder = Json.createObjectBuilder();
		for (Map.Entry<String, Block> block : blocks.entrySet()) {
			blockBuilder.add(block.getKey(), buildJsonObjectFromBlock(block.getValue()));
		}
		return blockBuilder.build();
	}
	
	private JsonObject buildJsonObjectFromBlock(Block block) { 
		JsonObjectBuilder blockBuilder = Json.createObjectBuilder();
		blockBuilder.add("#line", block.getLineNumber());
		for (Map.Entry<String, Expression> argument : block.getArguments().entrySet()) {
			blockBuilder.add(argument.getKey(), buildJsonObjectFromExpressions(argument.getValue()));
		}
		for (Map.Entry<String, Block> childBlock : block.getBlocks().entrySet()) {
			blockBuilder.add(childBlock.getKey(), buildJsonObjectFromBlock(childBlock.getValue()));
		}
		return blockBuilder.build();
	}
	
	private JsonObject buildJsonObjectFromArguments(Map<String, Expression> arguments) {
		JsonObjectBuilder blockBuilder = Json.createObjectBuilder();
		for (Map.Entry<String, Expression> argument : arguments.entrySet()) {
			blockBuilder.add(argument.getKey(), buildJsonObjectFromExpressions(argument.getValue()));
			
		}
		return blockBuilder.build();
	}
	
	private JsonObject buildJsonObjectFromExpressions(Expression expr) {
		JsonObjectBuilder blockBuilder = Json.createObjectBuilder();
		
		blockBuilder.add("#line", expr.getLineNumber());
		blockBuilder.add("text", expr.getText());
		blockBuilder.add("parseTree", expr.getParseTree());
		blockBuilder.add("tokenTextSequence", buildJsonArray(expr.getTokenTextSequence()));
		blockBuilder.add("tokenRuleSequence", buildJsonArray(expr.getTokenRuleSequence()));
		blockBuilder.add("parserRuleSequence", buildJsonArray(expr.getParserRuleSequence()));

		return blockBuilder.build();
	}

	private JsonArray buildJsonArray(ArrayList<String> stringSequence) {
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		for (String string : stringSequence) {
			arrayBuilder.add(string);
		}
		return arrayBuilder.build();
	}
}
