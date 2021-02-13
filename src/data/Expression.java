package data;

import antlr4.tfParser;

/**
 * Build this out as much as we can
 */
public class Expression {
	
	private static tfParser recognizer;
	
	public static void setRecognizer(tfParser parser) {
		recognizer = parser;
	}
	
	private String text;
	private String flat;
	
	public Expression(tfParser.ExpressionContext expr) {
		
		String text = expr.getText();
		if (text.startsWith("\"") || text.startsWith("\'")) {
			text = text.substring(1, text.length()-1);
		}
		this.text = text;
		getFeatures(expr);
	}
	
	private void getFeatures(tfParser.ExpressionContext expr) {
		/*
		for (TerminalNode node : expr.getTokens(0)) {
			symbols.add(node.getSymbol().getType());
			tokens.add(node.getText());
		}
		*/
		flat = expr.toStringTree(recognizer);
	}

	public String getText() {
		return text;
	}

	public String getFlat() {
		return flat;
	}
}
