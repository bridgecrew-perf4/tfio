package tf2tokens;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import antlr4.tfLexer;
import antlr4.tfParser;
import listener.Antlr;

public class PrintDelimitedTokens {

	/* We've got delimiters, what about line breaks? */
	public static void execute(String[] args) {
		
		char delim = ' ';
		
		String modulePathString = "C:\\Users\\nichb\\Anaconda\\repos_modules-specified\\terraform-aws-modules";
		Path modulePath = Paths.get(modulePathString);
		File directory = modulePath.toFile();
		
		List<File> files = new LinkedList<File>();
		getAllTfFilesRecursive(directory, files);
		
		Path outputPath = Paths.get("C:/Users/nichb/Desktop", modulePath.getFileName().toString() + "_tokenized_nospaces.txt");
		File outputFile = new File(outputPath.toString());
		PrintStream printStream = initPrintStream(outputFile);
		
		CommonTokenStream tokens = null;
		for (File file : files) {
			try {
				tokens = getTokens(file);
				for (Token token : tokens.getTokens()) {
					printStream.append(token.getText() + delim);
				}
				printStream.append("\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static CommonTokenStream getTokens(File file) throws IOException {
		tfLexer lexer = Antlr.getLexer(file.toPath());
		CommonTokenStream tokens = Antlr.getTokens(lexer);
		tfParser parser = Antlr.getParser(tokens);
		parser.file();
		return tokens;
	}
	
	public static void getAllTfFilesRecursive(File directory, List<File> files) {
		for (File file : directory.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".tf")) {
				files.add(file);
			} else if (file.isDirectory()) {
				getAllTfFilesRecursive(file, files);
			}
		}
	}
	
	private static PrintStream initPrintStream(File outputFile) {
		try {
			return new PrintStream(outputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
