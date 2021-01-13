package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import dom_github.GithubRoot;
import dom_github.Repo;
import dom_github.User;
import dom_github.Version;
import util_error.AntlrErrorTracker;
import util_listener.SyntaxFrequencyDistribution;

public class ParseGithub {
	
	public static void main(String[] args) {
		
		for (File userFolder : GithubRoot.path.toFile().listFiles())
		{
			User user = new User(userFolder.toPath());
			for (File repoFolder : userFolder.listFiles())
			{
				Repo repo = new Repo(user, repoFolder.toPath());
				for (File versionFolder : repoFolder.listFiles()) 
				{
					Version module = new Version(repo, versionFolder.toPath());
					
					// 1. 
					// We're going to call a "File Visitor" object (WalkFolder) on the Version's root folder 
					// to execute a recursive traversal of that folder
					
					// 2. 
					// The File Visitor object "Walk Folder" is going to parse all the ".tf" files in this folder
					// It needs either a ParseListener or a ParseVisitor
					// And the reference of the Module it's attaching the results to
					SyntaxFrequencyDistribution parseListener = new SyntaxFrequencyDistribution(module);
					WalkFolder moduleWalker = new WalkFolder(module, parseListener);
					
					// 3. 
					// Execute the walk
					// Parse all the files
					try {
						Files.walkFileTree(module.getPath(), moduleWalker);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
				
		// Print the tokens that offended us the most
		// This is a method of patching and debugging errors, ideally:
		AntlrErrorTracker.printOffendingTokenHistogram();
		
	}
}
