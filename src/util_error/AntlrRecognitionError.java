package util_error;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNType;

public class AntlrRecognitionError {
	
	Recognizer<?,?> recognizer;
	String errorMessage;
	RecognitionException e;
	
	String filename;
	int lineNumber;
	int charPosition;
	
	String offendingToken;
	String offenseType; // finite and enumerable, "extraneous input", "mismatch", etc.
	ATNType lexerOrParser;
	
	public AntlrRecognitionError(Recognizer<?, ?> recognizer, int lineNumber, int charPosition, String msg, RecognitionException e)
	{
		filename = recognizer.getInputStream().getSourceName();
		this.lineNumber = lineNumber;
		this.charPosition = charPosition;
		this.errorMessage = msg;
		lexerOrParser = recognizer.getATN().grammarType;
		offenseType = getOffenseType(msg);
		offendingToken = getOffendingToken(msg);
	}
	
	public String getOffendingToken(String errorMessage)
	{
		int firstSingleQuote = errorMessage.indexOf("'");
		int secondSingleQuote = errorMessage.indexOf("'", firstSingleQuote + 1);
		return errorMessage.substring(firstSingleQuote, secondSingleQuote + 1);
	}
	
	public String getOffenseType(String errorMessage)
	{
		int firstSingleQuote = errorMessage.indexOf("'");
		return errorMessage.substring(0, firstSingleQuote - 1);
	}
	
	public String getOffendingToken()
	{
		return offendingToken;
	}
	
	public String getOffenseType()
	{
		return offenseType;
	}

	public String getKey() 
	{
		return offenseType;
	}

	public String getDetailedErrorMessage() 
	{
		try {
			String errorMessage = String.format("%s\nline %d : %d\n%-10s%-30s %s", filename, lineNumber, charPosition, lexerOrParser.name(), offenseType, offendingToken);
			return errorMessage;
		} 
		catch (Exception e)
		{
			return e.getMessage();
		}
	}
	
	public String getOffendingSection()
	{
		return "";
	}
}
