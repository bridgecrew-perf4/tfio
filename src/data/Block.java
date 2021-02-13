package data;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.tfParser;
import antlr4.tfParser.ModuleContext;

@SuppressWarnings("unused")
public class Block {
	
	// This is how we identify a block in the Map
	private String key;
	
	// We really care about a block's arguments
	private Map<String, Expression> arguments;
	
	// And its nested blocks
	private Map<String, Block> childBlocks;
	
	// And its parent, if it is nested
	private Block parentBlock;
	
	/* Optional fields */
	
	// We're also keeping track of the filenames, for no reason yet
	private String fileName;
	
	// And this too, interestingly
	private Interval sourceInterval;
	
	// Plus, it's also nice to keep the "objectType" easy to access
	// For statistics
	private String objectType;
	
	/* 
	 * Block contructor polymorphism on ParseTree argument type
	 * 1. Different block keys (fileName, blockType, blockId, blockName)
	 * That's it
	 */
	public Block(tfParser.TerraformContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(tfParser.ProviderContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		objectType = x.blockType().getText();
		key = objectType;
		// if we find an argument called "alias", we need to add that as a 2nd id to the key, "<key>.<alias>"
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(tfParser.ResourceContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		objectType = x.blockType().getText();
		key = objectType + "." + x.blockName().getText();
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(tfParser.DataContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		objectType = x.blockType().getText();
		key = objectType + "." + x.blockName().getText();
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(tfParser.VariableContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		key = x.blockName().getText();
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(tfParser.OutputContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		key = x.blockName().getText();
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(tfParser.BlockContext x, Block parentBlock) {
		fileName = x.getStart().getTokenSource().getSourceName(); 
		sourceInterval = x.getSourceInterval();
		
		this.parentBlock = parentBlock;
		key = getBlockKey(x);
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public Block(ModuleContext x) {
		fileName = x.getStart().getTokenSource().getSourceName();
		sourceInterval = x.getSourceInterval();
		
		key = x.blockName().getText();
		
		addArguments(x.argument());
		addBlocks(x.block());
	}
	public void addArguments(List<tfParser.ArgumentContext> arguments) {
		this.arguments = new HashMap<String, Expression>();
		for (tfParser.ArgumentContext argument : arguments) {
			addArgument(argument);
		}
	}
	public void addArgument(tfParser.ArgumentContext argument) {
		String key = argument.identifier().getText();
		
		// We want a very good expression parser:
		// 1. Categorize, classify, and measure expressions. 
		// Expressions should become learnable features of the argument
		// 1a. Does it have an arithmetic operation? A logical operation? 
		// 1b. What is its evaluation depth, and breadth? 
		// 1c. Does it reference another variable? To whom? How many?
		tfParser.ExpressionContext expr = argument.expression();
		Expression value = new Expression(expr);
		arguments.put(key, value);
	}
	public void addBlocks(List<tfParser.BlockContext> blocks) {
		if (blocks != null) {
			childBlocks = new HashMap<String, Block>();
			for (tfParser.BlockContext block : blocks) {
				addBlock(block);
			}
		}
	}
	public void addBlock(tfParser.BlockContext x) {
		Block block = new Block(x, this);
		childBlocks.put(block.key, block);
	}
	
	public String getKey() {
		return key.replaceAll("\"", "");
	}
	private String getBlockKey(tfParser.BlockContext block) {
		StringBuilder keyBuilder = new StringBuilder();
		Iterator<tfParser.IdentifierContext> iter = block.identifier().iterator();
		keyBuilder.append(iter.next().getText().replaceAll("\"", ""));
		while (iter.hasNext()) {
			keyBuilder.append("." + iter.next().getText().replaceAll("\"", ""));
		}
		return keyBuilder.toString();
	}
	
	public Map<String, Expression> getArguments() {
		return arguments;
	}
	
	public Map<String, Block> getBlocks() {
		return childBlocks;
	}
}
