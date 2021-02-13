package tf2json;

import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import data.Block;
import data.Expression;
import data.Module;

public class ModulePrinterJson {
	
	private Module module;
	
	public ModulePrinterJson(Module module) {
		this.module = module;
	}
	
	public void printJson(OutputStream stream) {
		JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
		jsonBuilder.add(".", buildJsonObjectModule(module));
		for (Entry<String, Module> childModuleEntry : module.getChildModules().entrySet()) {
			jsonBuilder.add(childModuleEntry.getKey(), buildJsonObjectModule(childModuleEntry.getValue()));
		}
		Json.createWriter(stream).writeObject(jsonBuilder.build());
	}
	
	private JsonObject buildJsonObjectModule(Module module) {
		JsonObjectBuilder moduleBuilder = Json.createObjectBuilder();
		moduleBuilder.add("path", module.getKey());
		moduleBuilder.add("terraform", buildJsonObjectFromBlock(module.getTerraformBlock()));
		moduleBuilder.add("providers", buildJsonObjectsFromBlocks(module.getProviderBlocks()));
		moduleBuilder.add("resources", buildJsonObjectsFromBlocks(module.getResourceBlocks()));
		moduleBuilder.add("datas", buildJsonObjectsFromBlocks(module.getDataBlocks()));
		moduleBuilder.add("variables", buildJsonObjectsFromBlocks(module.getVariableBlocks()));
		moduleBuilder.add("outputs", buildJsonObjectsFromBlocks(module.getOutputBlocks()));
		moduleBuilder.add("locals", buildJsonObjectFromArguments(module.getLocals()));
		moduleBuilder.add("modules", buildJsonObjectsFromBlocks(module.getModuleBlocks()));
		return moduleBuilder.build();
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
		blockBuilder.add("text", expr.getText());
		blockBuilder.add("flat", expr.getFlat());
		// blockBuilder.add("string", expr.getString());
		return blockBuilder.build();
	}
}
