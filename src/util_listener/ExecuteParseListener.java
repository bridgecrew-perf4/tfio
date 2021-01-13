package util_listener;
import java.io.IOException;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.tfLexer;
import antlr4.tfParser;
import antlr4.tfParserListener;
import dom_terraform.Module;
import util_error.AntlrErrorTracker;
import util_error.AntlrExceptionThrower;

/**
 * Parse a single terraform file
 * Attach a listener (publish-subscribe)
 * 
 * @author nichb
 */
@SuppressWarnings("unused")
public final class ExecuteParseListener {
	
	/*
	 * This is a static utility class, no fields
	 * 
	 * Parse a single terraform file
	 * Using the listener (publish-subscribe) pattern
	 */
	/**
	 * 
	 * @param path 
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static void listen(Path path, Module module, tfParserListener listener) throws Exception
	{
		// 1. 
		// Make this an absolute path if it is not already
		// Path path = file.getPath().isAbsolute() ? file.getPath() : Root.path.resolve(file.getPath());
		if ( ! path.isAbsolute()) {
			System.out.println("Currently only supporting absolute paths");
			System.exit(1);
		}
		
		// 2. 
		// Try and get the token stream, catch an IO Exception or Lexer Cancellation Exception
		CommonTokenStream tokens = null;
		try {
			tokens = GetTokens(path);
		} catch (IOException e) {
			throw e;
		} catch (ParseCancellationException e) {
			AntlrErrorTracker.SaveAndPrint(e, tokens);
			throw e;
		}
		
		// 3. 
		// Execute the parse
		try {
			parse(tokens, listener);
		} catch (ParseCancellationException e) {
			AntlrErrorTracker.SaveAndPrint(e, tokens);
			throw e;
		}
	}
	
	/**
	 * Get the token stream for this file
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	private static CommonTokenStream GetTokens(Path filePath) throws IOException {
		// 1. 
		// Create a CharStream
		// This will throw an IOException
		CharStream charStream = CharStreams.fromPath(filePath);
		
		// 2. 
		// Pass the characters to the Lexer
		tfLexer lexer = new tfLexer(charStream);
		
		// 3. 
		// Override error listener so it throws exceptions rather than crashes
		lexer.removeErrorListeners();
		lexer.addErrorListener(AntlrExceptionThrower.INSTANCE);
		
		// 3. 
		// Tokenize the stream
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		return tokens;
	}
	
	/**
	 * Get the ParseTree for this token stream
	 * @param tokens
	 * @throws ParseCancellationException
	 */
	private static void parse(CommonTokenStream tokens, tfParserListener listener) throws ParseCancellationException {
		// 1. 
		// Pass the tokens to the parser
		tfParser parser = new tfParser(tokens);
		
		// 2. 
		// Override error listener so it throws exceptions rather than crashes
		parser.removeErrorListeners();
		parser.addErrorListener(AntlrExceptionThrower.INSTANCE);
		
		// 3.
		// Add listener, listen
		parser.addParseListener(listener);
		listener.setParser(parser);
		parser.file();
	}
}
