package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import dom_terraform.Module;
import util_listener.SyntaxFrequencyDistribution;

public class ParseAll {
	
	public static void main(String[] args) {
		
		// Temporary testing
		// We want this to be pluggable
		args = new String[] { "C:\\Users\\nichb\\Anaconda\\repos_modules-specified" };
		
		if (args.length != 1) { 
			System.exit(1);
		}
		// Take a folder as an argument
		// Parse all files in the folder into the primary Module
		// Parse all files in subfolders into child Modules
		
		Module module = new Module();
		SyntaxFrequencyDistribution parseListener = new SyntaxFrequencyDistribution(module);
		WalkFolder walkFolder = new WalkFolder(module, parseListener);
		
		try {
			Files.walkFileTree(Paths.get(args[0]), walkFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Rule distribution");
		parseListener.printRule1d();
		
		System.out.println("\nToken distribution");
		parseListener.printToken1d();
		
		System.out.println("\nToken Text distribution");
		parseListener.printContextDistribution();
	}
}
