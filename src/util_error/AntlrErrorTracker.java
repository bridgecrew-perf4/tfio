package util_error;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import dom_github.GithubRoot;
import util_error.AntlrExceptionThrower;
import util_error.AntlrRecognitionError;

@SuppressWarnings("unused")
public class AntlrErrorTracker {
	
	private static HashMap<String, ArrayList<String>> offendingTokenHistogram = new HashMap<String, ArrayList<String>>();
	private static HashMap<String, ArrayList<String>> offenseTypeHistogram = new HashMap<String, ArrayList<String>>();
	
	public static void SaveAndPrint(ParseCancellationException e, CommonTokenStream tokens)
	{	
		String key = e.getMessage();
		AntlrRecognitionError error = getError(key);
		/*
		if ( ! addErrorToHistogram(error.getOffendingToken(), offenseTypeHistogram, error.getDetailedErrorMessage())) {
		
			return;
		}
		*/
		addErrorToHistogram(error.getOffenseType(), offendingTokenHistogram, error.getDetailedErrorMessage());
		
		System.out.println(String.format("%s\n", error.getDetailedErrorMessage()));
		int whitespace = 3;
		int listSize = tokens.getTokens().size();
		for (Token token : tokens.getTokens().subList(listSize - 100, listSize - 1)) {
			if (token.getType() != whitespace) {
				System.out.print(token.getText() + ' ');
			}
		}
		System.out.println("\n");
	}
	
	private static AntlrRecognitionError getError(String key)
	{
		if (AntlrExceptionThrower.saveParserErrors.containsKey(key)) {
			return AntlrExceptionThrower.saveParserErrors.get(key).get(AntlrExceptionThrower.saveParserErrors.size()-1);
		} else {
			return AntlrExceptionThrower.saveLexerErrors.get(key).get(AntlrExceptionThrower.saveLexerErrors.size()-1);
		}
	}
	
	private static boolean addErrorToHistogram(String errorKey, HashMap<String, ArrayList<String>> histogram, String errorMsg)
	{
		if ( ! histogram.containsKey(errorKey)) {
			histogram.put(errorKey, new ArrayList<String>());
		}
		// I'm getting weird duplication errors
		// This code is officially buggy
		if ( ! histogram.get(errorKey).contains(errorMsg)) {
			histogram.get(errorKey).add(errorMsg);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void printOffendingTokenHistogram()
	{
		System.out.println("OFFENDING TOKENS:\n\n");
		
		HashSet<String> skiplist = new HashSet<String>();
		/*
		skiplist.add("dyanca\\terraform-something-clever\\0baab66906b547ccd1e189f99f757b6718e293a7\\variables.tf");
		skiplist.add("chavo1\\terraform-aws-module-output\\0.0.1\\.git\\logs\\refs\\remotes\\origin\\add-main.tf");
		skiplist.add("chavo1\\terraform-aws-module-output\\0.0.1\\.git\\logs\\refs\\remotes\\origin\\add-vars.tf");
		skiplist.add("chavo1\\terraform-aws-module-output\\0.0.1\\.git\\refs\\remotes\\origin\\add-main.tf");
		skiplist.add("ivandres73\\terraform-aws-nested-folder\\v0.0.3\\variables.tf");
		skiplist.add("cloudposse\\terraform-aws-ec2-admin-server\\0.4.3\\variables.tf");
		skiplist.add("ptsgr\\terraform-libvirt-kubernetes\\v0.1\\kubernetes\\variables.tf");
		skiplist.add("briansunter\\terraform-aws-static-site\\0.1\\modules\\site\\.#main.tf");
		skiplist.add("chavo1\\terraform-aws-module-output\\0.0.1\\.git\\refs\\remotes\\origin\\add-vars.tf");
		skiplist.add("terraform-flexibleengine-modules\\terraform-flexibleengine-ecs\\v1.1.0\\examples\\basic-ecs-with-existing-eip\\variables.tf");
		skiplist.add("terraform-flexibleengine-modules\\terraform-flexibleengine-ecs\\v1.1.0\\examples\\basic-ecs-with-new-eip\\variables.tf");
		*/
		
		// I really want an array so I can sort it
		ArrayList<Entry<String, ArrayList<String>>> tokens = new ArrayList<Entry<String, ArrayList<String>>>();
		for (Entry<String, ArrayList<String>> tokenMessage : offendingTokenHistogram.entrySet())
		{
			tokens.add(tokenMessage);
		}
		
		quickSort(tokens, 0, tokens.size() - 1);
		
		for (Entry<String, ArrayList<String>> token : tokens)
		{
			System.out.println(String.format("%-4d %s\n", token.getValue().size(), token.getKey()));
			for (String errorMessage : token.getValue())
			{
				String filepath = errorMessage.substring(0, errorMessage.indexOf('\n'));
				if (!skiplist.contains(filepath))
				{
					System.out.println(String.format("%s\n", errorMessage));
				}
			}
		}
		System.out.println("\n");
		moveErrorsToNewFolder(tokens);
	}
	
	private static void quickSort(ArrayList<Entry<String, ArrayList<String>>> arr, int begin, int end) 
	{
		// if list is big, break it up using quicksort
		if (end - begin > 16)
		{
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
		}
		// if list is small, finish it up using insertion sort
		else 
		{
			insertionSort(arr, begin, end);
	    }
	}
	
	private static int partition(ArrayList<Entry<String, ArrayList<String>>> arr, int begin, int end) 
	{
	    int pivot = arr.get(end).getValue().size();
	    int i = (begin-1);
	    int check = 0;
	    
	    for (int j = begin; j < end; j++) 
	    {
	    	check = arr.get(j).getValue().size();
	        if (check <= pivot) {
	            i++;

	            Entry<String, ArrayList<String>> swapTemp = arr.get(i);
	            arr.set(i + 1, arr.get(j));
	            arr.set(j, swapTemp);
	        }
	    }
	    
	    Entry<String, ArrayList<String>> swapTemp = arr.get(i+1);
	    arr.set(i+1, arr.get(end));
	    arr.set(end, swapTemp);

	    return i+1;
	}
	
	// insertion sort is good for small lists
	// arguably better than quick sort for list of size < cutoff size (~ 16)
	public static ArrayList<Entry<String, ArrayList<String>>> insertionSort(ArrayList<Entry<String, ArrayList<String>>> arr, int begin, int end)
	{
	    for (int i = begin + 1; i < end; ++i) { 
	        Entry<String, ArrayList<String>> key = arr.get(i); 
	        int j = i - 1; 

	        int compare = key.getValue().size();
	        while (j >= 0 && arr.get(j).getValue().size() < compare) { 
	            arr.set(j + 1, arr.get(j)); 
	            j = j - 1; 
	        } 
	        arr.set(j + 1, key); 
	    } 
	    return arr;
	}
	
	// move the errors into a new folder
	public static void moveErrorsToNewFolder(ArrayList<Entry<String, ArrayList<String>>> tokens)
	{
		// only if we're in the test set
		if (true || GithubRoot.path.toString().endsWith("_fails"))
		{
			// don't save a new _fails folder to the _fails folder
			return;
		}
		for (Entry<String, ArrayList<String>> token : tokens)
		{
			for (String message : token.getValue())
			{
				int pathEnd = message.lastIndexOf('\\');
				int lineEnd = message.indexOf('\n');
				String filepath = message.substring(0, pathEnd);
				String filename = message.substring(pathEnd+1, lineEnd);
				
				Path folderpath = Paths.get(GithubRoot.path.toString(), "_fails", filepath);
				if (!Files.exists(folderpath))
				{
					try {
						Files.createDirectories(Paths.get(GithubRoot.path.toString(), "_fails", filepath));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				Path fileDest = Paths.get(GithubRoot.path.toString(), "_fails", filepath, filename);
				if (!Files.exists(fileDest)) 
				{
					try {
						Files.copy(Paths.get(GithubRoot.path.toString(), filepath, filename), Paths.get(GithubRoot.path.toString(), "_fails", filepath, filename));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				Path errDest = Paths.get(GithubRoot.path.toString(), filepath, filename.replaceAll(".tf", "") + "stderr.txt");
				if (!Files.exists(errDest))
				{
					try {
						Files.write(errDest, message.substring(message.indexOf('\n')+1).getBytes());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
