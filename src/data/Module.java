package data;

import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.atn.ParseInfo;

import antlr4.tfParser.ArgumentContext;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Module {
	
	String key;
	
	// A module is simply a folder which contains *.tf files
	private File moduleDirectory;
	
	private HashMap<String, ArrayList<String>> fileBlocksInOrder;
	
	// this tracks all sorts of info about the parser's behavior?
	private ParseInfo parseInfo;
	
	// There may be *.tf files in a child folder of this Module
	// Those child folders containing *.tf files will become child Modules
	private Map<String, Module> childModules;
	// Fyi: The String key of the child Module is the relative path to the Module from this Module
	// source = "./modules/db_subnet_group" 
	// key = "modules/db_subnet_group"
	
	/* Now begin the "top-level" Blocks */
	
	private Map<String, Block> moduleBlocks;
	// module "db_subnet_group" { ... } 
	// key = "db_subnet_group"
	
	private Block terraformBlock;
	
	private Map<String, Block> providerBlocks;
	// provider "aws" { ... }
	// key = "aws"
	
	private Map<String, Block> resourceBlocks;
	// resource "aws_instance" "pet_name" { ... }
	// key = "aws_instance.pet_name"
	
	private Map<String, Block> dataBlocks;
	// data "aws_data" "pet_name" { ... }
	// key = "aws_data.pet_name"
	
	private Map<String, Block> outputBlocks;
	// output "instance_ip_addr" { ... }
	// key = "instance_ip_addr"
	
	private Map<String, Block> variableBlocks;
	// variable "storage_type" { ... }
	// key = "storage_type"
	
	/* The module-shared temporary values stored in arguments declared in locals blocks */
	private Map<String, Expression> locals;
	// locals { 
	//   db_subnet_group_name = ... 
	// }
	// key = "db_subnet_group_name" 
	
	private TreeMap<Integer, String> comments;
	
	public Module(File moduleDirectory) {
		
		key = moduleDirectory.getAbsolutePath();
		
		// A module is a directory of .tf files
		this.moduleDirectory = moduleDirectory;
		
		// A module can have child modules
		childModules = new HashMap<String, Module>();
		
		// If so, it probably references those child modules here
		moduleBlocks = new HashMap<String, Block>();
		
		// Here are the top-level blocks defined by providers
		providerBlocks = new HashMap<String, Block>();
		resourceBlocks = new HashMap<String, Block>();
		dataBlocks = new HashMap<String, Block>();
		
		// Here are the top-level blocks defined by this user
		variableBlocks = new HashMap<String, Block>();
		outputBlocks = new HashMap<String, Block>();
		
		// And modules can share these "local" arguments across itself
		locals = new HashMap<String, Expression>();
		
		// Don't forget about me
		terraformBlock = null;
		
		// And me
		fileBlocksInOrder = new HashMap<String, ArrayList<String>>();
		
		// And me
		comments = new TreeMap<Integer, String>();
	}

	/* Adders and Setters - for ModuleBuilder */
	public void addChildModule(Module childModule) {
		String childKey = childModule.getKey();
		childKey = Paths.get(key).relativize(Paths.get(childKey)).toString();
		childModules.put(childKey, childModule);
	}
	public void addModuleBlock(Block block, String fileName) {
		String key = block.getKey();
		moduleBlocks.put(key, block);
		fileBlocksInOrder.get(fileName).add("module." + key);
	}
	public void addProviderBlock(Block block, String fileName) {
		String key = block.getKey();
		providerBlocks.put(key, block);
		fileBlocksInOrder.get(fileName).add(key);
	}
	public void addResourceBlock(Block block, String fileName) {
		String key = block.getKey();
		resourceBlocks.put(key, block);
		fileBlocksInOrder.get(fileName).add(key);
	}
	public void addDataBlock(Block block, String fileName) {
		String key = block.getKey();
		dataBlocks.put(key, block);
		fileBlocksInOrder.get(fileName).add("data." + key);
	}
	public void addVariableBlock(Block block, String fileName) {
		String key = block.getKey();
		variableBlocks.put(key, block);
		fileBlocksInOrder.get(fileName).add("var." + key);
	}
	public void addOutputBlock(Block block, String fileName) {
		String key = block.getKey();
		outputBlocks.put(key, block);
		fileBlocksInOrder.get(fileName).add(key);
	}
	public void addLocalArgument(ArgumentContext argument, String fileName) {
		// This behavior needs checking
		String key = argument.identifier().getText();
		locals.put(key, new Expression(argument.expression()));
		fileBlocksInOrder.get(fileName).add("local." + key);
	}
	public void setTerraformBlock(Block block, String fileName) {
		// As does this one
		terraformBlock = block;
		fileBlocksInOrder.get(fileName).add("terraform");
	}
	public void addComment(int lineNumber, String comment) {
		comments.put(lineNumber, comment);
	}

	/* Getters - for ModulePrinterJson */
	public File getModuleDirectory() {
		return moduleDirectory;
	}
	public Map<String, Module> getChildModules() {
		return childModules;
	}
	public Map<String, Block> getModuleBlocks() {
		return moduleBlocks;
	}
	public Block getTerraformBlock() {
		return terraformBlock;
	}
	public Map<String, Block> getProviderBlocks() {
		return providerBlocks;
	}
	public Map<String, Block> getResourceBlocks() {
		return resourceBlocks;
	}
	public Map<String, Block> getDataBlocks() {
		return dataBlocks;
	}
	public Map<String, Block> getVariableBlocks() {
		return variableBlocks;
	}
	public Map<String, Block> getOutputBlocks() {
		return outputBlocks;
	}
	public Map<String, Expression> getLocals() {
		return locals;
	}
	public String getKey() {
		return key.startsWith("\"") ? key.substring(1, key.length()-1) : key;
	}
	
	/* Adding file */
	public void addFileBlockList(String filenameString) {
		fileBlocksInOrder.put(filenameString, new ArrayList<String>());
	}
	
	public Map<String, ArrayList<String>> getFileBlockInOrder() {
		return fileBlocksInOrder;
	}

	public TreeMap<Integer, String> getComments() {
		return comments;
	}
	
	public ParseInfo getParseInfo() {
		return parseInfo;
	}

	public void setParseInfo(ParseInfo parseInfo) {
		this.parseInfo = parseInfo;
	}
}
