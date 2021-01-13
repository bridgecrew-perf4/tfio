// Generated from tfLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, WS=2, LINECOMMENT=3, INLINECOMMENT=4, FOR=5, IN=6, IF=7, BOOL=8, 
		NULL=9, TERRAFORM=10, MODULE=11, PROVIDER=12, RESOURCE=13, DATA=14, LOCALS=15, 
		VARIABLE=16, OUTPUT=17, PLUS=18, MINUS=19, STAR=20, DIVIDE=21, LT=22, 
		GT=23, LTE=24, GTE=25, DEQUAL=26, NEQUAL=27, AND=28, OR=29, NOT=30, QUESTION=31, 
		COLON=32, EQUALS=33, ARROW=34, LCURL=35, RCURL=36, LBRACKET=37, RBRACKET=38, 
		LPAREN=39, RPAREN=40, DOTS=41, DOT=42, COMMA=43, INTEGER=44, FLOAT=45, 
		EXPONENTIAL=46, IDENTIFIER=47, HEREDOC_INDENT=48, HEREDOC=49, ESCAPE_INTERPO=50, 
		INTERPO_PUSH=51, ESCAPE_DIRECTIVE=52, DIRECTIVE_PUSH=53, DOLLAR=54, MODULO=55, 
		QUOTE=56, STRING_TEXT=57, ESCAPE_CHAR=58, HEREDOC_TEXT=59, CLOSE_HEREDOC=60;
	public static final int
		PARSE_QUOTEDTEMPLATE=1, PARSE_HEREDOC=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PARSE_QUOTEDTEMPLATE", "PARSE_HEREDOC"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "WS", "LINECOMMENT", "INLINECOMMENT", "FOR", "IN", "IF", "BOOL", 
			"NULL", "TERRAFORM", "MODULE", "PROVIDER", "RESOURCE", "DATA", "LOCALS", 
			"VARIABLE", "OUTPUT", "PLUS", "MINUS", "STAR", "DIVIDE", "LT", "GT", 
			"LTE", "GTE", "DEQUAL", "NEQUAL", "AND", "OR", "NOT", "QUESTION", "COLON", 
			"EQUALS", "ARROW", "LCURL", "RCURL", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "DOTS", "DOT", "COMMA", "INTEGER", "FLOAT", "EXPONENTIAL", 
			"IDENTIFIER", "HEREDOC_INDENT", "HEREDOC", "ESCAPE_INTERPO", "INTERPO_PUSH", 
			"ESCAPE_DIRECTIVE", "DIRECTIVE_PUSH", "DOLLAR", "MODULO", "QUOTE", "STRING_TEXT", 
			"ESCAPE_CHAR", "DOLLAR_", "PERCENT_", "QUOTE_", "ESCAPE_INTERPO_", "INTERPO_PUSH_", 
			"ESCAPE_DIRECTIVE_", "DIRECTIVE_PUSH_", "HEREDOC_TEXT", "EOL_", "CLOSE_HEREDOC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'for'", "'in'", "'if'", null, "'null'", 
			"'terraform'", "'module'", "'provider'", "'resource'", "'data'", "'locals'", 
			"'variable'", "'output'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'?'", "':'", "'='", "'=>'", 
			"'{'", null, "'['", "']'", "'('", "')'", "'...'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "WS", "LINECOMMENT", "INLINECOMMENT", "FOR", "IN", "IF", 
			"BOOL", "NULL", "TERRAFORM", "MODULE", "PROVIDER", "RESOURCE", "DATA", 
			"LOCALS", "VARIABLE", "OUTPUT", "PLUS", "MINUS", "STAR", "DIVIDE", "LT", 
			"GT", "LTE", "GTE", "DEQUAL", "NEQUAL", "AND", "OR", "NOT", "QUESTION", 
			"COLON", "EQUALS", "ARROW", "LCURL", "RCURL", "LBRACKET", "RBRACKET", 
			"LPAREN", "RPAREN", "DOTS", "DOT", "COMMA", "INTEGER", "FLOAT", "EXPONENTIAL", 
			"IDENTIFIER", "HEREDOC_INDENT", "HEREDOC", "ESCAPE_INTERPO", "INTERPO_PUSH", 
			"ESCAPE_DIRECTIVE", "DIRECTIVE_PUSH", "DOLLAR", "MODULO", "QUOTE", "STRING_TEXT", 
			"ESCAPE_CHAR", "HEREDOC_TEXT", "CLOSE_HEREDOC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    int nesting = 0;
	    String heredocId = "";


	public tfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tfLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35:
			RCURL_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			HEREDOC_INDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			HEREDOC_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			INTERPO_PUSH_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			DIRECTIVE_PUSH_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			INTERPO_PUSH__action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			DIRECTIVE_PUSH__action((RuleContext)_localctx, actionIndex);
			break;
		case 67:
			CLOSE_HEREDOC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void RCURL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

				if (nesting > 0) {
			        nesting--;
			        popMode();
			    }

			break;
		}
	}
	private void HEREDOC_INDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

				heredocId = getText().substring(3);
				pushMode(PARSE_HEREDOC);

			break;
		}
	}
	private void HEREDOC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

				heredocId = getText().substring(2);
				pushMode(PARSE_HEREDOC);

			break;
		}
	}
	private void INTERPO_PUSH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    nesting++;
			    pushMode(DEFAULT_MODE);

			break;
		}
	}
	private void DIRECTIVE_PUSH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    nesting++;
			    pushMode(DEFAULT_MODE);

			break;
		}
	}
	private void INTERPO_PUSH__action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    nesting++;
			    pushMode(DEFAULT_MODE);

			break;
		}
	}
	private void DIRECTIVE_PUSH__action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    nesting++;
			    pushMode(DEFAULT_MODE);

			break;
		}
	}
	private void CLOSE_HEREDOC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 
				popMode();

			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 67:
			return CLOSE_HEREDOC_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean CLOSE_HEREDOC_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  getText().trim().equals(heredocId) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0202\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\5"+
		"\2\u0091\n\2\3\2\3\2\3\3\6\3\u0096\n\3\r\3\16\3\u0097\3\3\3\3\3\4\3\4"+
		"\6\4\u009e\n\4\r\4\16\4\u009f\3\4\6\4\u00a3\n\4\r\4\16\4\u00a4\5\4\u00a7"+
		"\n\4\3\4\7\4\u00aa\n\4\f\4\16\4\u00ad\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5"+
		"\u00b5\n\5\f\5\16\5\u00b8\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d2\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\5%\u0144\n%\3%\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\6-\u015a\n-\r-\16-\u015b\3.\6.\u015f"+
		"\n.\r.\16.\u0160\3.\3.\6.\u0165\n.\r.\16.\u0166\3/\6/\u016a\n/\r/\16/"+
		"\u016b\3/\3/\6/\u0170\n/\r/\16/\u0171\5/\u0174\n/\3/\3/\5/\u0178\n/\3"+
		"/\6/\u017b\n/\r/\16/\u017c\3\60\3\60\7\60\u0181\n\60\f\60\16\60\u0184"+
		"\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u019b\n\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u01a7\n\66\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\39\39\3:\6:\u01b4\n:\r:\16:\u01b5\3;\3;\3;\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\5@\u01d2\n@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\5B\u01e2\nB\3B\3B\3B\3B\3C\6"+
		"C\u01e9\nC\rC\16C\u01ea\3D\3D\3D\5D\u01f0\nD\3D\3D\3E\6E\u01f5\nE\rE\16"+
		"E\u01f6\3E\7E\u01fa\nE\fE\16E\u01fd\13E\3E\3E\3E\3E\4\u00b6\u01fb\2F\5"+
		"\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!"+
		"\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37?"+
		" A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9"+
		"s:u;w<y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087=\u0089\2\u008b>\5"+
		"\2\3\4\13\4\2\f\f\17\17\4\2\13\13\"\"\3\2\62;\4\2GGgg\4\2--//\5\2C\\a"+
		"ac|\7\2//\62;C\\aac|\4\2$$))\6\2$$&\'))^^\2\u021a\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\3u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\3{\3\2\2\2\3}\3\2\2\2\3\177\3\2\2"+
		"\2\3\u0081\3\2\2\2\3\u0083\3\2\2\2\3\u0085\3\2\2\2\4\u0087\3\2\2\2\4\u0089"+
		"\3\2\2\2\4\u008b\3\2\2\2\5\u0090\3\2\2\2\7\u0095\3\2\2\2\t\u00a6\3\2\2"+
		"\2\13\u00b0\3\2\2\2\r\u00be\3\2\2\2\17\u00c2\3\2\2\2\21\u00c5\3\2\2\2"+
		"\23\u00d1\3\2\2\2\25\u00d3\3\2\2\2\27\u00d8\3\2\2\2\31\u00e2\3\2\2\2\33"+
		"\u00e9\3\2\2\2\35\u00f2\3\2\2\2\37\u00fb\3\2\2\2!\u0100\3\2\2\2#\u0107"+
		"\3\2\2\2%\u0110\3\2\2\2\'\u0117\3\2\2\2)\u0119\3\2\2\2+\u011b\3\2\2\2"+
		"-\u011d\3\2\2\2/\u011f\3\2\2\2\61\u0121\3\2\2\2\63\u0123\3\2\2\2\65\u0126"+
		"\3\2\2\2\67\u0129\3\2\2\29\u012c\3\2\2\2;\u012f\3\2\2\2=\u0132\3\2\2\2"+
		"?\u0135\3\2\2\2A\u0137\3\2\2\2C\u0139\3\2\2\2E\u013b\3\2\2\2G\u013d\3"+
		"\2\2\2I\u0140\3\2\2\2K\u0143\3\2\2\2M\u0148\3\2\2\2O\u014a\3\2\2\2Q\u014c"+
		"\3\2\2\2S\u014e\3\2\2\2U\u0150\3\2\2\2W\u0154\3\2\2\2Y\u0156\3\2\2\2["+
		"\u0159\3\2\2\2]\u015e\3\2\2\2_\u0169\3\2\2\2a\u017e\3\2\2\2c\u0185\3\2"+
		"\2\2e\u018c\3\2\2\2g\u0192\3\2\2\2i\u0196\3\2\2\2k\u019e\3\2\2\2m\u01a2"+
		"\3\2\2\2o\u01aa\3\2\2\2q\u01ac\3\2\2\2s\u01ae\3\2\2\2u\u01b3\3\2\2\2w"+
		"\u01b7\3\2\2\2y\u01ba\3\2\2\2{\u01be\3\2\2\2}\u01c2\3\2\2\2\177\u01c7"+
		"\3\2\2\2\u0081\u01cd\3\2\2\2\u0083\u01d7\3\2\2\2\u0085\u01dd\3\2\2\2\u0087"+
		"\u01e8\3\2\2\2\u0089\u01ef\3\2\2\2\u008b\u01f4\3\2\2\2\u008d\u008e\7\17"+
		"\2\2\u008e\u0091\7\f\2\2\u008f\u0091\t\2\2\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\2\2\2\u0093\6\3\2\2\2"+
		"\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\3\3\2\u009a"+
		"\b\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009e\7\61\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a7"+
		"\3\2\2\2\u00a1\u00a3\7%\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009d\3\2"+
		"\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\4\4\2\u00af"+
		"\n\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b6\3\2\2\2"+
		"\u00b3\u00b5\13\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7,\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\5"+
		"\4\2\u00bd\f\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\20"+
		"\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7h\2\2\u00c7\22\3\2\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00d2\7g\2\2"+
		"\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0"+
		"\7u\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2"+
		"\24\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7n\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\26\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7h\2\2"+
		"\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7o\2\2\u00e1\30\3\2"+
		"\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\32\3\2\2\2\u00e9\u00ea"+
		"\7r\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7x\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2"+
		"\u00f1\34\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7"+
		"u\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7e\2\2\u00f9\u00fa\7g\2\2\u00fa\36\3\2\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd"+
		"\7c\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7c\2\2\u00ff \3\2\2\2\u0100\u0101"+
		"\7n\2\2\u0101\u0102\7q\2\2\u0102\u0103\7e\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7u\2\2\u0106\"\3\2\2\2\u0107\u0108\7x\2\2\u0108"+
		"\u0109\7c\2\2\u0109\u010a\7t\2\2\u010a\u010b\7k\2\2\u010b\u010c\7c\2\2"+
		"\u010c\u010d\7d\2\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2\u010f$\3\2\2"+
		"\2\u0110\u0111\7q\2\2\u0111\u0112\7w\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7r\2\2\u0114\u0115\7w\2\2\u0115\u0116\7v\2\2\u0116&\3\2\2\2\u0117\u0118"+
		"\7-\2\2\u0118(\3\2\2\2\u0119\u011a\7/\2\2\u011a*\3\2\2\2\u011b\u011c\7"+
		",\2\2\u011c,\3\2\2\2\u011d\u011e\7\61\2\2\u011e.\3\2\2\2\u011f\u0120\7"+
		">\2\2\u0120\60\3\2\2\2\u0121\u0122\7@\2\2\u0122\62\3\2\2\2\u0123\u0124"+
		"\7>\2\2\u0124\u0125\7?\2\2\u0125\64\3\2\2\2\u0126\u0127\7@\2\2\u0127\u0128"+
		"\7?\2\2\u0128\66\3\2\2\2\u0129\u012a\7?\2\2\u012a\u012b\7?\2\2\u012b8"+
		"\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e\7?\2\2\u012e:\3\2\2\2\u012f\u0130"+
		"\7(\2\2\u0130\u0131\7(\2\2\u0131<\3\2\2\2\u0132\u0133\7~\2\2\u0133\u0134"+
		"\7~\2\2\u0134>\3\2\2\2\u0135\u0136\7#\2\2\u0136@\3\2\2\2\u0137\u0138\7"+
		"A\2\2\u0138B\3\2\2\2\u0139\u013a\7<\2\2\u013aD\3\2\2\2\u013b\u013c\7?"+
		"\2\2\u013cF\3\2\2\2\u013d\u013e\7?\2\2\u013e\u013f\7@\2\2\u013fH\3\2\2"+
		"\2\u0140\u0141\7}\2\2\u0141J\3\2\2\2\u0142\u0144\7\u0080\2\2\u0143\u0142"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\177\2\2"+
		"\u0146\u0147\b%\5\2\u0147L\3\2\2\2\u0148\u0149\7]\2\2\u0149N\3\2\2\2\u014a"+
		"\u014b\7_\2\2\u014bP\3\2\2\2\u014c\u014d\7*\2\2\u014dR\3\2\2\2\u014e\u014f"+
		"\7+\2\2\u014fT\3\2\2\2\u0150\u0151\7\60\2\2\u0151\u0152\7\60\2\2\u0152"+
		"\u0153\7\60\2\2\u0153V\3\2\2\2\u0154\u0155\7\60\2\2\u0155X\3\2\2\2\u0156"+
		"\u0157\7.\2\2\u0157Z\3\2\2\2\u0158\u015a\t\4\2\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\\\3\2\2\2"+
		"\u015d\u015f\t\4\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\7\60\2\2"+
		"\u0163\u0165\t\4\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167^\3\2\2\2\u0168\u016a\t\4\2\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u0173\3\2\2\2\u016d\u016f\7\60\2\2\u016e\u0170\t\4\2\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0174\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\t\5\2\2\u0176\u0178\t\6\2\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\t\4\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d`\3\2\2\2\u017e\u0182\t\7\2\2\u017f\u0181\t\b\2\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"b\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7>\2\2\u0186\u0187\7>\2\2\u0187"+
		"\u0188\7/\2\2\u0188\u0189\3\2\2\2\u0189\u018a\5a\60\2\u018a\u018b\b\61"+
		"\6\2\u018bd\3\2\2\2\u018c\u018d\7>\2\2\u018d\u018e\7>\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\5a\60\2\u0190\u0191\b\62\7\2\u0191f\3\2\2\2\u0192"+
		"\u0193\7&\2\2\u0193\u0194\7&\2\2\u0194\u0195\7}\2\2\u0195h\3\2\2\2\u0196"+
		"\u0197\7&\2\2\u0197\u0198\7}\2\2\u0198\u019a\3\2\2\2\u0199\u019b\7\u0080"+
		"\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\b\64\b\2\u019dj\3\2\2\2\u019e\u019f\7\'\2\2\u019f\u01a0\7\'\2\2"+
		"\u01a0\u01a1\7}\2\2\u01a1l\3\2\2\2\u01a2\u01a3\7\'\2\2\u01a3\u01a4\7}"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\7\u0080\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\b\66\t\2\u01a9n\3\2\2\2"+
		"\u01aa\u01ab\7&\2\2\u01abp\3\2\2\2\u01ac\u01ad\7\'\2\2\u01adr\3\2\2\2"+
		"\u01ae\u01af\t\t\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\b9\n\2\u01b1t\3\2"+
		"\2\2\u01b2\u01b4\n\n\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6v\3\2\2\2\u01b7\u01b8\7^\2\2\u01b8"+
		"\u01b9\13\2\2\2\u01b9x\3\2\2\2\u01ba\u01bb\7&\2\2\u01bb\u01bc\3\2\2\2"+
		"\u01bc\u01bd\b<\13\2\u01bdz\3\2\2\2\u01be\u01bf\7\'\2\2\u01bf\u01c0\3"+
		"\2\2\2\u01c0\u01c1\b=\f\2\u01c1|\3\2\2\2\u01c2\u01c3\t\t\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\b>\r\2\u01c5\u01c6\b>\16\2\u01c6~\3\2\2\2\u01c7\u01c8"+
		"\7&\2\2\u01c8\u01c9\7&\2\2\u01c9\u01ca\7}\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cc\b?\17\2\u01cc\u0080\3\2\2\2\u01cd\u01ce\7&\2\2\u01ce\u01cf\7}\2"+
		"\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\7\u0080\2\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\b@\20\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d6\b@\21\2\u01d6\u0082\3\2\2\2\u01d7\u01d8\7\'\2\2\u01d8"+
		"\u01d9\7\'\2\2\u01d9\u01da\7}\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\bA\22"+
		"\2\u01dc\u0084\3\2\2\2\u01dd\u01de\7\'\2\2\u01de\u01df\7}\2\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01e2\7\u0080\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\bB\23\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\bB\24\2\u01e6\u0086\3\2\2\2\u01e7\u01e9\n\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u0088\3\2"+
		"\2\2\u01ec\u01ed\7\17\2\2\u01ed\u01f0\7\f\2\2\u01ee\u01f0\t\2\2\2\u01ef"+
		"\u01ec\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\bD"+
		"\25\2\u01f2\u008a\3\2\2\2\u01f3\u01f5\5\u0089D\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb\3\2"+
		"\2\2\u01f8\u01fa\t\3\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fe\u01ff\5a\60\2\u01ff\u0200\6E\2\2\u0200\u0201\bE\26\2\u0201"+
		"\u008c\3\2\2\2 \2\3\4\u0090\u0097\u009f\u00a4\u00a6\u00ab\u00b6\u00d1"+
		"\u0143\u015b\u0160\u0166\u016b\u0171\u0173\u0177\u017c\u0182\u019a\u01a6"+
		"\u01b5\u01d1\u01e1\u01ea\u01ef\u01f6\u01fb\27\2\3\2\2\4\2\2\5\2\3%\2\3"+
		"\61\3\3\62\4\3\64\5\3\66\6\7\3\2\t8\2\t9\2\t:\2\6\2\2\t\64\2\3@\7\t\65"+
		"\2\t\66\2\3B\b\t\67\2\t\3\2\3E\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}