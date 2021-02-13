package tfexec;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TerraformExec {
	
	private static HashSet<String> acceptedCommands = new HashSet<>(Arrays.asList("fmt", "version", "providers"));
	
	/* User must have the terraform binary ready to be called (listed in $PATH) */
	public static void execute(String command, File workingDirectory) throws Exception {
		
		if (acceptedCommands.contains(command)) {
			execTerraform(workingDirectory, command);
		} else {
			String errMsg = commandNotSupportedErrMsg(command);
			throw new Exception(errMsg);
		}
	}		
	
	private static void execTerraform(File workingDirectory, String command) {
		try {
			Runtime runTime = Runtime.getRuntime();
			String[] commandArgs = new String[] {"terraform " + command};
			String[] envVariables = null;
			Process process = runTime.exec(commandArgs, envVariables, workingDirectory);
			process.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String commandNotSupportedErrMsg(String command) {
		StringBuilder acceptedCommandsStringer = new StringBuilder();
		Iterator<String> iter = acceptedCommands.iterator();
		if (iter.hasNext()) {
			acceptedCommandsStringer.append(iter.next());
			while (iter.hasNext()) {
				acceptedCommandsStringer.append("," + iter.next());
			}
		}
		return String.format(
			"The command '%s' is not in the set of available commands: %s",
			command, acceptedCommandsStringer.toString());
	}
	
}
