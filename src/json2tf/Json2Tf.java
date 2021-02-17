package json2tf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Json2Tf {
	
	// arg[0] == "tf2json"
	// arg[1] == read file
	// arg[2] == write directory 
	public static void execute(String[] args) {
		
		String inputFileString = args[1];
		Path inputFilePath = Paths.get(inputFileString).toAbsolutePath();
		File inputFile = inputFilePath.toFile();
		
		if ( ! validExecution(inputFile)) {
			return;
		}
		
		// Path inputPath = Paths.get(inputFile);
		// check valid
		
		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(inputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JsonReader reader = Json.createReader(fileStream);
		JsonObject config = reader.readObject();
		ModuleWriterTf tfWriter = new ModuleWriterTf(config);
	}

	private static boolean validExecution(File workingDirectory) {
		// TODO Auto-generated method stub
		return true;
	}
}
