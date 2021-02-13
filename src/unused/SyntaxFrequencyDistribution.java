package unused;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import antlr4.tfParser;
import data.Module;
import antlr4.tfParserBaseListener;

/**
 * This class aims to mine the AST for information 
 * That, with enough statistics, math, machine learning, etc...
 * May enable us to "learn" and predict syntactic patterns.
 * 
 * A worthy goal of this class
 * (or some downstream class using its statistics)
 * is to randomly generate terraform files which are:
 * 1. syntactically-valid
 * 2. conditioned on the learned syntactic patterns 
 *  
 * @author nichb
 *
 */
@SuppressWarnings("unused")
public class SyntaxFrequencyDistribution extends tfParserBaseListener {
	
	// Refs
	private Module module;
	private tfParser recognizer;
	
	// Vocabulary
	private String[] tokenVocab;
	private String[] ruleVocab;
	
	// 1d distributions
	private int[] tokenDistribution;
	private int[] ruleDistribution;
	
	// 2d distributions
	private int[][] rulePredictChildren;
	private int[][] tokenPredictSibling;
	private int[][] rulePredictSibling;
	
	// 2d dynamic distributions
	private ArrayList<TreeMap<String, Integer>> tokenPredictText;
	
	// 3d dynamic distributions
	// 1. TreeMap which contains:
	// # of occurences for each unique combination of Lexical Token (~50) && AST Parental Context (many) && Exact Text (very many)
	// (In ~ 30k files there were ~ 250k unique combinations)
	// The memory size of this object has not been checked, but it seems surprisingly small? < 100MB. 
	private ArrayList<TreeMap<String, TreeMap<String, Integer>>> tokenContextPredictText;
	
	public SyntaxFrequencyDistribution(Module module) {
		
		this.module = module;
		
		initializeVocabs();
		initialize1d();
		initialize2d();
		initializeDynamic2d();
		initializeDynamic3d();
	}
	
	/*
	 * It's hard to get a tfParser object in here! But it's a very helpful object (for "interpreting" rules / tokens)
	 * 
	 * 1. Create a tfParser object using a CommonTokenStream on a TokenSource (text file)
	 *    That is happening in ExecuteParseListener.java
	 *    
	 * 2. Where this SyntaxFrequencyDistribution object is in the form of a tfParserListener
	 *    hence the need for the @Override
	 *    
	 * Since we're only using the recognizer for token / rule interpretation tasks that should be static
	 * It seems we could just create our own tfParser on a dummy text file and get all the benefits, TBD
	 */
	/*
	@Override
	public void setParser(tfParser recognizer) {
		this.recognizer = recognizer;
	}
	*/
	
	/*
	 * One-time Initializers 
	 */
	private void initializeVocabs() {
		tokenVocab = new String[tfParser.VOCABULARY.getMaxTokenType()];
		for (int i = 0; i < tokenVocab.length; i++) {
			tokenVocab[i] = tfParser.VOCABULARY.getSymbolicName(i);
		}
		ruleVocab = tfParser.ruleNames;
	}
	private void initialize1d() {
		tokenDistribution = new int[tokenVocab.length];
		ruleDistribution = new int[ruleVocab.length];
	}
	private void initialize2d() {
		rulePredictChildren = new int[ruleVocab.length][ruleVocab.length];
		tokenPredictSibling = new int[tokenVocab.length][tokenVocab.length];
		rulePredictSibling = new int[ruleVocab.length][ruleVocab.length];
	}
	private void initializeDynamic2d() {
		tokenPredictText = new ArrayList<TreeMap<String, Integer>>();
		for (int i = 0; i < tokenVocab.length; i++) {
			tokenPredictText.add(new TreeMap<String, Integer>());
		}
	}
	private void initializeDynamic3d() {
		tokenContextPredictText = new ArrayList<TreeMap<String, TreeMap<String, Integer>>>();
		for (int i = 0; i < tokenVocab.length; i++) {
			tokenContextPredictText.add(new TreeMap<String, TreeMap<String, Integer>>());
		}
	}
	
	/*
	 * 1d savers
	 */
	private void save1dRuleOccurence(ParserRuleContext ctx) {
		ruleDistribution[ctx.getRuleIndex()]++;
	}
	private void save1dTokenOccurence(TerminalNode node) {
		tokenDistribution[node.getSymbol().getType()]++;
	}
	
	/*
	 * 2d savers
	 */
	private void save2dRulePredictChildOccurence(ParserRuleContext ctx) {
		int childIndex = ctx.getRuleIndex();
		int parentIndex = ctx.getParent().getRuleIndex();
		rulePredictChildren[parentIndex][childIndex]++;
	}
	
	/*
	 * Dynamic 2d savers
	 */
	private void saveDynamic2dTokenTextOccurence(TerminalNode node) {
		/* This is computationally expensive for massively-arbitrary strings
		
		int tokenIndex = node.getSymbol().getType();
		String tokenText = node.getText();
		TreeMap<String, Integer> textDistribution = tokenPredictText.get(tokenIndex);
		Integer occurences = textDistribution.get(tokenText);
		textDistribution.put(tokenText, (occurences == null) ? 1 : occurences + 1);
		*/
	}
	
	/*
	 * Dynamic 3d savers
	 */
	private void saveFullContext(TerminalNode node) {
		/*
		// 1. 
		// Grab the Map(Context --> Map(Text --> # of occurences)) for this Token
		int tokenIndex = node.getSymbol().getType();
		TreeMap<String, TreeMap<String, Integer>> contextTextOccurences = 
				tokenContextPredictText.get(tokenIndex);
		
		// 2. 
		// Generate the string that describes this TerminalNode's ancestors
		// Get the text for this token
		String parentalContext = saveFullContext_getFullContext(node);
		String nodeText = node.getText();
		
		// 3.
		// Save this combination of Token && ParentalContext && Text
		
		// 3? If this Token does not contain this Context
		TreeMap<String, Integer> textOccurences = contextTextOccurences.get(parentalContext);
		if (textOccurences == null) {
			
			// 3a1. Create a new Mapping for this Token-Context's Text --> 1
			textOccurences = new TreeMap<String, Integer>();
			textOccurences.put(nodeText, 1);
			
			// 3a2. Create a new Mapping for this Token's Context-Text
			contextTextOccurences.put(parentalContext, textOccurences);
		} else {
			// 3b. Increment Token-Context-Text += 1
			textOccurences.put(nodeText, textOccurences.get(nodeText) + 1);
		}
		*/
	}
	private String saveFullContext_getFullContext(TerminalNode node) {
		
		// 1. 
		// Linked List because we're prepending and iterating
		LinkedList<String> list = new LinkedList<String>();
		
		// 2. 
		// Every TerminalNode has 1 ParseTree as a parent
		// All ParseTree parent's lead to the root ParseTree, "FileContext"
		// We want that ordered sequence of parents
		ParseTree parentRule = node.getParent();
		do {
			list.addFirst(saveFullContext_getParentRuleName(parentRule));
			parentRule = node.getParent();
		} while (parentRule.getClass() != tfParser.FileContext.class);
		
		// 3. 
		// Now we want to generate a unique Id for that parent sequence 
		// As a string? Sure
		StringBuilder builder = new StringBuilder();
		for (String parentRuleName : list) {
			builder.append(parentRuleName);
			builder.append(":");
		}
		return builder.toString();
	}
	private String saveFullContext_getParentRuleName(ParseTree parentRule) {
		// Is this really the best way to get the rule name?
		// It's kind of a hack, but it works.
		String ruleName = parentRule.getClass().toString();
		return ruleName.substring(ruleName.indexOf("$") + 1, ruleName.indexOf("Context"));
	}
	
	/*
	 * Output 1d
	 */
	public void printRule1d() {
		for (int i = 0; i < ruleVocab.length; i++) {
			System.out.println(ruleVocab[i] + "\t" + ruleDistribution[i]);
		}
	}
	public void printToken1d() {
		for (int i = 0; i < tokenVocab.length; i++) {
			System.out.println(tokenVocab[i] + "\t" + tokenDistribution[i]);
		}
	}
	
	/*
	 * Output 2d
	 */
	public void printRulePredictChildren() {
		System.out.println();
		for (int i = 0; i < ruleVocab.length; i++) {
			System.out.print(ruleVocab[i] + " " + ruleDistribution[i] + " --> ");
			for (int j = 0; j < ruleVocab.length; j++) {
				int occurences = rulePredictChildren[i][j];
				if (occurences != 0) {
					System.out.print(ruleVocab[j] + "." + occurences + " ");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Redirect system.out to file
	 */
	private void redirectOutput(String filename) {
		try {
			System.setOut(new PrintStream(new File(filename)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	/*
	 * Output dynamic 2d
	 */
	public void printTokenTextDistribution() {
		PrintStream out = System.out;
		redirectOutput("outputs/tokenTextDistribution.txt");
		for (int i = 0; i < tokenPredictText.size(); i++) {
			String tokenName = tokenVocab[i];
			TreeMap<String, Integer> textDistribution = tokenPredictText.get(i);
			for (Map.Entry<String, Integer> entry : textDistribution.entrySet()) {
				System.out.println(tokenName + "\t" + entry.getKey() + "\t" + entry.getValue());
			}
		}
		System.setOut(out);
	}
	
	/*
	 * Output dynamic 3d
	 */
	public void printContextDistribution() {
		PrintStream out = System.out;
		redirectOutput("outputs/contextDistribution.txt");
		for (int i = 0; i < tokenContextPredictText.size(); i++) {
			String tokenName = tokenVocab[i];
			TreeMap<String, TreeMap<String, Integer>> contextTextTree = tokenContextPredictText.get(i);
			for (Map.Entry<String, TreeMap<String, Integer>> contextText : contextTextTree.entrySet()) {
				String context = contextText.getKey();
				for (Map.Entry<String, Integer> textOccurence : contextText.getValue().entrySet()) {
					String text = textOccurence.getKey();
					int num = textOccurence.getValue();
					System.out.println(String.format("%s,%s,%s,%d", tokenName, context, text, num));
				}
			}
		}
		System.setOut(out);
	}
	
	/*
	 * Listener events
	 */
	
	/**
	 * When we exit the "file" rule - we have parsed the entire parse tree!
	 */
	@Override
	public void exitFile(tfParser.FileContext ctx) {
		/*
		String tree = ctx.toStringTree(recognizer);
		String[] tokens = tree.split(" ");
		
		for (String token : tokens) {
			System.out.println(token);
		}
		System.exit(0);
		*/
	}
	
	/**
	 * When we hit a (terminal, Text) Lexical Token
	 */
	@Override
	public void visitTerminal(TerminalNode node) { 
		save1dTokenOccurence(node);
		saveDynamic2dTokenTextOccurence(node);
		saveFullContext(node);
	}
	
	/**
	 * When we exit a (non-terminal, AST) Parser Rule
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) { 
		save1dRuleOccurence(ctx);
		save2dRulePredictChildOccurence(ctx);
	}
}
