package main;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import json2tf.Json2Tf;
import tf2json.Tf2Json;

public class tfio {

	public static void main(String[] args) throws Exception {
		
		// I really would like a command line interface
		
		// There's a few primary commands:
		// "tf2json"
		// "json2tf"
		
		// We operate on the user's working directory
		// Later we'll add support for relative paths to other directories
		// String workingDirectoryString = System.getProperty("user.dir");
		String workingDirectoryString = "C:\\Users\\nichb\\Anaconda\\terraform-aws-rds";
		Path workingDirectoryPath = Paths.get(workingDirectoryString).toAbsolutePath();
		File workingDirectory = workingDirectoryPath.toFile();
		
		// The first argument is the subprogram we're going to run
		// It's a simple switch statement
		if (args == null || args.length == 0 || args[0].length() == 0) {
			// throw new Exception("Hey man, what the fuck");
			args = new String[] { "tf2json", workingDirectory.toPath().toAbsolutePath().toString(), "..\\terraform-aws-rds" + "_json" };
		}
		
		String subprogramId = args[0];
		switch (subprogramId) {
		case "tf2json": Tf2Json.execute(args);
			break;
		case "json2tf": Json2Tf.execute(args);
		}
	}
}
