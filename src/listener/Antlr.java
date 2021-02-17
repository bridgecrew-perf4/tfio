package listener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.tfLexer;
import antlr4.tfParser;
import antlr4.tfParserBaseListener;
import antlr4.tfParserListener;
import antlr4_error.AntlrErrorTracker;
import antlr4_error.AntlrExceptionThrower;
import data.Expression;
import data.Module;

/**
 * Parse a single terraform file
 * Attach a listener (publish-subscribe)
 * 
 * @author nichb
 */
@SuppressWarnings("unused")
public class Antlr {
	
	public static tfLexer getLexer(Path filePath) {
		CharStream charStream = null;
		try {
			charStream = CharStreams.fromPath(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		tfLexer lexer = new tfLexer(charStream);
		return lexer;
	}
	
	public static CommonTokenStream getTokens(tfLexer lexer) {
		lexer.removeErrorListeners();
		lexer.addErrorListener(AntlrExceptionThrower.INSTANCE);
		CommonTokenStream tokens = null;
		try {
			tokens = new CommonTokenStream(lexer);
		} catch (ParseCancellationException e) {
			// do more, later
			System.out.println(e.getMessage());
		}
		return new CommonTokenStream(lexer);
	}
	
	public static tfParser getParser(CommonTokenStream tokens) {
		return new tfParser(tokens);
	}
	
	public static void linkParserAndListener(tfParser parser, tfParserListener listener) {
		parser.addParseListener(listener);
		listener.setParser(parser);
	}
	
	public static void executeParseListen(tfParser parser, tfParserBaseListener listener) {
		
		parser.addParseListener(listener);
		listener.setParser(parser);
		
		parser.removeErrorListeners();
		parser.addErrorListener(AntlrExceptionThrower.INSTANCE);
		try {
			parser.file();
			listener.addComments(parser.getTokenStream());
			// need to toggle "profiling" somehow?
			// listener.setParseInfo(parser.getParseInfo());
		} catch (ParseCancellationException e) {
			// do more, later
			System.out.println(e.getMessage());
		}
	}

	public static void parseFileIntoModule(Path filePath, tfParserBaseListener listener) {
		tfLexer lexer = getLexer(filePath);
		CommonTokenStream tokens = getTokens(lexer);
		tfParser parser = getParser(tokens);
		Expression.setRecognizer(parser);
		executeParseListen(parser, listener);
	}
}
