package tf2json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;

import antlr4.tfParserBaseListener;
import data.Block;
import data.Module;
import listener.Antlr;
import listener.ModuleBuilderListener;

public class Tf2Json {
	
	// arg[0] == "tf2json"
	// arg[1] == read directory
	// arg[2] == write directory (as of now we assume it equals 
	public static void execute(String[] args) {
		
		String workingDirectoryString = args[1];
		Path workingDirectoryPath = Paths.get(workingDirectoryString).toAbsolutePath();
		File workingDirectory = workingDirectoryPath.toFile();
		
		if ( ! validExecution(workingDirectory)) {
			return;
		}
		
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
		ModuleWriterJson jsonPrinter = new ModuleWriterJson(rootModule);
		
		try {
			FileOutputStream fileStream = new FileOutputStream(new File(Paths.get(workingDirectory.getPath(), "_my_config.json").toString()));
			jsonPrinter.printJson(fileStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static File getModuleWorkingDirectory(Path rootModulePath, Block childModuleBlock) {
		String sourceString = childModuleBlock.getArguments().get("source").getText();
		Path absoluteSourcePath = rootModulePath.resolve(sourceString.substring(1, sourceString.length()-1));
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
	
	private static Boolean validExecution(File workingDirectory) {
		if ( ! workingDirectory.exists()) {
			String errMsg = String.format("The file or directory \"%s\" does not exist", workingDirectory.getPath());
			System.out.println("Error: " + errMsg);
		} else if ( ! workingDirectory.isDirectory()) {
			String errMsg = String.format("The file \"%s\" is not a directory", workingDirectory.getPath());
			System.out.println("Error: " + errMsg);
		} else {
			for (File file : workingDirectory.listFiles()) {
				if (file.getName().endsWith(".tf")) {
					return true;
				}
			}
			String errMsg = String.format("The directory \"%s\" does not contain a file ending in .tf", workingDirectory.getPath());
			System.out.println("Error: " + errMsg);
		}
		return false;
	}
}
