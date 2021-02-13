package tf2json;

import java.io.File;
import java.nio.file.Path;
import java.util.Map.Entry;

import antlr4.tfParserBaseListener;
import data.Block;
import data.Module;
import listener.Antlr;
import listener.ModuleBuilderListener;

public class Tf2Json {

	public static void execute(File workingDirectory) {
		
		// Until we allow relative path resolution, 
		// This is always just the user's current working directory
		// Or, one of our test directories
		checkValidExecution(workingDirectory);
		
		// Give the working directory to the Module
		// The main data structure
		Module rootModule = new Module(workingDirectory);
		
		// Give the module to the parseListener
		// A modifier of the the data structure
		tfParserBaseListener parseListener = new ModuleBuilderListener(rootModule);
		
		// Parse the root module
		parseModule(parseListener);
		
		// Parse the child modules
		for (Entry<String, Block> moduleBlockEntry : rootModule.getModuleBlocks().entrySet()) {
			
			File childWorkingDirectory = getModuleWorkingDirectory(rootModule.getModuleDirectory().toPath(), moduleBlockEntry.getValue());
			Module childModule = new Module(childWorkingDirectory);
			rootModule.addChildModule(childModule);
			
			ModuleBuilderListener parseListener2 = new ModuleBuilderListener(childModule);
			parseModule(parseListener2);
		}
		
		// Write to json!
		ModulePrinterJson jsonPrinter = new ModulePrinterJson(rootModule);
		jsonPrinter.printJson(System.out);
	}
	
	private static File getModuleWorkingDirectory(Path rootModulePath, Block childModuleBlock) {
		String sourceString = childModuleBlock.getArguments().get("source").getText();
		Path absoluteSourcePath = rootModulePath.resolve(sourceString);
		// I think "relativize" is useful for making better module keys, filesystem independent
		// But I haven't quite figured it out yet
		// Right now, we're just doing absolute paths as keys
		// Path relativeSourcePath = rootModulePath.relativize(absoluteSourcePath);
		return absoluteSourcePath.toFile();
	}
	
	private static void parseModule(tfParserBaseListener listener) {
		Module module = listener.getModule();
		for (File file : module.getModuleDirectory().listFiles()) {
			if (file.isFile() && file.getName().endsWith(".tf")) {
				try {
					Antlr.parseFileIntoModule(file.toPath(), listener);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void checkValidExecution(File workingDirectory) {
		if ( ! workingDirectory.exists()) {
			String errMsg = String.format("The file or directory \"%s\" does not exist", workingDirectory.getPath());
			System.out.println("Error: " + errMsg);
		} else if ( ! workingDirectory.isDirectory()) {
			String errMsg = String.format("The file \"%s\" is not a directory", workingDirectory.getPath());
			System.out.println("Error: " + errMsg);
		}
	}
}
