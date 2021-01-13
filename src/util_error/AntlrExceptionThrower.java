package util_error;
import java.util.ArrayList;
import java.util.TreeMap;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNType;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/* Brad Mace, Aug-2013
 * https://stackoverflow.com/a/18137301/1796523
 */
public class AntlrExceptionThrower extends BaseErrorListener {

	public static final AntlrExceptionThrower INSTANCE = new AntlrExceptionThrower();
	
	public static TreeMap<String, ArrayList<AntlrRecognitionError>> saveParserErrors = new TreeMap<String, ArrayList<AntlrRecognitionError>>();
	public static TreeMap<String, ArrayList<AntlrRecognitionError>> saveLexerErrors = new TreeMap<String, ArrayList<AntlrRecognitionError>>();
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) throws ParseCancellationException 
	{
	    AntlrRecognitionError error = new AntlrRecognitionError(recognizer, line, charPositionInLine, msg, e);
		String errorKey = saveError(error);
		
		// we must return the errorKey as the message... or else we'll lose this object.
		throw new ParseCancellationException(errorKey);
	}
	
	private String saveError(AntlrRecognitionError error)
	{
		// save in either the parser or lexer error tree
		TreeMap<String, ArrayList<AntlrRecognitionError>> saveErrors = 
				(error.lexerOrParser == ATNType.PARSER) ? saveParserErrors : saveLexerErrors;
		
		// get the key (offense type)
		String key = error.getKey();
		
		// create arraylist if it does not exist
		if (!saveErrors.containsKey(key))
		{
			saveErrors.put(key, new ArrayList<AntlrRecognitionError>());
		}
		
		saveErrors.get(key).add(error);
		return key;
	}
	
}
