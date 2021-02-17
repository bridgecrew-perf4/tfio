package data;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import antlr4.tfParser;

/**
 * Build this out as much as we can
 */
public class Expression {
	
	private static tfParser recognizer;
	private static Vocabulary vocab;
	
	public static void setRecognizer(tfParser parser) {
		recognizer = parser;
		vocab = recognizer.getVocabulary();
	}
	
	private int lineNumber;
	private String text;
	private String parseTree;
	
	private ArrayList<String> tokenTextSequence;
	private ArrayList<String> tokenRuleSequence;
	private ArrayList<String> parserRuleSequence;
	
	public Expression(tfParser.ExpressionContext expr) {
		tokenTextSequence = new ArrayList<String>();
		tokenRuleSequence = new ArrayList<String>();
		parserRuleSequence = new ArrayList<String>();
		
		text = buildText(expr.start, expr.stop);
		buildTokenSequence(true, tokenTextSequence, expr.start.getTokenIndex(), expr.stop.getTokenIndex());
		buildTokenSequence(false, tokenRuleSequence, expr.start.getTokenIndex(), expr.stop.getTokenIndex());
		
		parseTree = expr.toStringTree(recognizer);
		buildParserRuleSequence(parseTree, parserRuleSequence);
		
		lineNumber = expr.start.getLine();
	}

	private String buildText(Token start, Token stop) {
		return recognizer.getTokenStream().getText(start, stop);
	}
	
	private void buildTokenSequence(Boolean isText, ArrayList<String> sequence, int start, int stop) {
		TokenStream tokenStream = recognizer.getTokenStream();
		if (isText) {
			while (start <= stop) {
				sequence.add(tokenStream.get(start++).getText());
			}
		} else {
			while (start <= stop) {
				sequence.add(vocab.getDisplayName(tokenStream.get(start++).getType()));
			}
		}
	}
	
	private void buildParserRuleSequence(String tree, ArrayList<String> parserRuleSequence) {
		Pattern pattern = Pattern.compile("\\([^ ]+ ");
		Matcher matcher = pattern.matcher(tree);
		
		// skip the first rule everyone has "expression"
		matcher.find();
        
		while (matcher.find()) {
        	parserRuleSequence.add(matcher.group().substring(1).trim());
        }
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	
	public String getText() {
		return text;
	}
	
	public String getParseTree() {
		return parseTree;
	}
	
	public ArrayList<String> getTokenTextSequence() {
		return tokenTextSequence;
	}
	
	public ArrayList<String> getTokenRuleSequence() {
		return tokenRuleSequence;
	}
	
	public ArrayList<String> getParserRuleSequence() {
		return parserRuleSequence;
	}
}
