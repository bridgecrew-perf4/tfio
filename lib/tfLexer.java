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
		DQUOTE=56, SQUOTE=57, STRING_TEXT=58, ESCAPE_CHAR=59, STRING_TEXT_=60, 
		ESCAPE_CHAR_=61, HEREDOC_TEXT=62, CLOSE_HEREDOC=63;
	public static final int
		PARSE_DQUOTEDTEMPLATE=1, PARSE_SQUOTEDTEMPLATE=2, PARSE_HEREDOC=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PARSE_DQUOTEDTEMPLATE", "PARSE_SQUOTEDTEMPLATE", "PARSE_HEREDOC"
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
			"ESCAPE_DIRECTIVE", "DIRECTIVE_PUSH", "DOLLAR", "MODULO", "DQUOTE", "SQUOTE", 
			"STRING_TEXT", "ESCAPE_CHAR", "DOLLAR_", "PERCENT_", "DQUOTE_", "ESCAPE_INTERPO_", 
			"INTERPO_PUSH_", "ESCAPE_DIRECTIVE_", "DIRECTIVE_PUSH_", "STRING_TEXT_", 
			"ESCAPE_CHAR_", "DOLLAR__", "PERCENT__", "SQUOTE__", "ESCAPE_INTERPO__", 
			"INTERPO_PUSH__", "ESCAPE_DIRECTIVE__", "DIRECTIVE_PUSH__", "HEREDOC_TEXT", 
			"EOL_", "CLOSE_HEREDOC"
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
			"ESCAPE_DIRECTIVE", "DIRECTIVE_PUSH", "DOLLAR", "MODULO", "DQUOTE", "SQUOTE", 
			"STRING_TEXT", "ESCAPE_CHAR", "STRING_TEXT_", "ESCAPE_CHAR_", "HEREDOC_TEXT", 
			"CLOSE_HEREDOC"
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
		case 63:
			INTERPO_PUSH__action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			DIRECTIVE_PUSH__action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			INTERPO_PUSH___action((RuleContext)_localctx, actionIndex);
			break;
		case 74:
			DIRECTIVE_PUSH___action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
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
	private void INTERPO_PUSH___action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:

			    nesting++;	
			    pushMode(DEFAULT_MODE);

			break;
		}
	}
	private void DIRECTIVE_PUSH___action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:

			    nesting++;
			    pushMode(DEFAULT_MODE);

			break;
		}
	}
	private void CLOSE_HEREDOC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			 
				popMode();

			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 77:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0250\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\5\2\u00a6"+
		"\n\2\3\2\3\2\3\3\6\3\u00ab\n\3\r\3\16\3\u00ac\3\3\3\3\3\4\3\4\6\4\u00b3"+
		"\n\4\r\4\16\4\u00b4\3\4\6\4\u00b8\n\4\r\4\16\4\u00b9\5\4\u00bc\n\4\3\4"+
		"\7\4\u00bf\n\4\f\4\16\4\u00c2\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00ca\n"+
		"\5\f\5\16\5\u00cd\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e7\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3#\3$\3$\3%\5%\u0159\n%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3*\3*\3+\3+\3,\3,\3-\6-\u016f\n-\r-\16-\u0170\3.\6.\u0174\n.\r.\16."+
		"\u0175\3.\3.\6.\u017a\n.\r.\16.\u017b\3/\6/\u017f\n/\r/\16/\u0180\3/\3"+
		"/\6/\u0185\n/\r/\16/\u0186\5/\u0189\n/\3/\3/\5/\u018d\n/\3/\6/\u0190\n"+
		"/\r/\16/\u0191\3\60\3\60\7\60\u0196\n\60\f\60\16\60\u0199\13\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\5\64\u01b0\n\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\5\66\u01bc\n\66\3\66\3\66\3\67\3\67\38\38\3"+
		"9\39\39\39\3:\3:\3:\3:\3;\6;\u01cd\n;\r;\16;\u01ce\3<\3<\3<\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\5A\u01eb\n"+
		"A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\5C\u01fb\nC\3C\3C\3C\3C\3"+
		"D\6D\u0202\nD\rD\16D\u0203\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\5J\u0220\nJ\3J\3J\3J\3J\3K\3K\3K\3"+
		"K\3K\3K\3L\3L\3L\3L\5L\u0230\nL\3L\3L\3L\3L\3M\6M\u0237\nM\rM\16M\u0238"+
		"\3N\3N\3N\5N\u023e\nN\3N\3N\3O\6O\u0243\nO\rO\16O\u0244\3O\7O\u0248\n"+
		"O\fO\16O\u024b\13O\3O\3O\3O\3O\4\u00cb\u0249\2P\6\3\b\4\n\5\f\6\16\7\20"+
		"\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26"+
		".\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V"+
		"+X,Z-\\.^/`\60b\61d\62f\63h\64j\65l\66n\67p8r9t:v;x<z=|\2~\2\u0080\2\u0082"+
		"\2\u0084\2\u0086\2\u0088\2\u008a>\u008c?\u008e\2\u0090\2\u0092\2\u0094"+
		"\2\u0096\2\u0098\2\u009a\2\u009c@\u009e\2\u00a0A\6\2\3\4\5\13\4\2\f\f"+
		"\17\17\4\2\13\13\"\"\3\2\62;\4\2GGgg\4\2--//\5\2C\\aac|\7\2//\62;C\\a"+
		"ac|\5\2$$&\'^^\5\2&\'))^^\2\u026a\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2"+
		"\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2"+
		"\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2"+
		"\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\3"+
		"x\3\2\2\2\3z\3\2\2\2\3|\3\2\2\2\3~\3\2\2\2\3\u0080\3\2\2\2\3\u0082\3\2"+
		"\2\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\3\u0088\3\2\2\2\4\u008a\3\2\2\2\4"+
		"\u008c\3\2\2\2\4\u008e\3\2\2\2\4\u0090\3\2\2\2\4\u0092\3\2\2\2\4\u0094"+
		"\3\2\2\2\4\u0096\3\2\2\2\4\u0098\3\2\2\2\4\u009a\3\2\2\2\5\u009c\3\2\2"+
		"\2\5\u009e\3\2\2\2\5\u00a0\3\2\2\2\6\u00a5\3\2\2\2\b\u00aa\3\2\2\2\n\u00bb"+
		"\3\2\2\2\f\u00c5\3\2\2\2\16\u00d3\3\2\2\2\20\u00d7\3\2\2\2\22\u00da\3"+
		"\2\2\2\24\u00e6\3\2\2\2\26\u00e8\3\2\2\2\30\u00ed\3\2\2\2\32\u00f7\3\2"+
		"\2\2\34\u00fe\3\2\2\2\36\u0107\3\2\2\2 \u0110\3\2\2\2\"\u0115\3\2\2\2"+
		"$\u011c\3\2\2\2&\u0125\3\2\2\2(\u012c\3\2\2\2*\u012e\3\2\2\2,\u0130\3"+
		"\2\2\2.\u0132\3\2\2\2\60\u0134\3\2\2\2\62\u0136\3\2\2\2\64\u0138\3\2\2"+
		"\2\66\u013b\3\2\2\28\u013e\3\2\2\2:\u0141\3\2\2\2<\u0144\3\2\2\2>\u0147"+
		"\3\2\2\2@\u014a\3\2\2\2B\u014c\3\2\2\2D\u014e\3\2\2\2F\u0150\3\2\2\2H"+
		"\u0152\3\2\2\2J\u0155\3\2\2\2L\u0158\3\2\2\2N\u015d\3\2\2\2P\u015f\3\2"+
		"\2\2R\u0161\3\2\2\2T\u0163\3\2\2\2V\u0165\3\2\2\2X\u0169\3\2\2\2Z\u016b"+
		"\3\2\2\2\\\u016e\3\2\2\2^\u0173\3\2\2\2`\u017e\3\2\2\2b\u0193\3\2\2\2"+
		"d\u019a\3\2\2\2f\u01a1\3\2\2\2h\u01a7\3\2\2\2j\u01ab\3\2\2\2l\u01b3\3"+
		"\2\2\2n\u01b7\3\2\2\2p\u01bf\3\2\2\2r\u01c1\3\2\2\2t\u01c3\3\2\2\2v\u01c7"+
		"\3\2\2\2x\u01cc\3\2\2\2z\u01d0\3\2\2\2|\u01d3\3\2\2\2~\u01d7\3\2\2\2\u0080"+
		"\u01db\3\2\2\2\u0082\u01e0\3\2\2\2\u0084\u01e6\3\2\2\2\u0086\u01f0\3\2"+
		"\2\2\u0088\u01f6\3\2\2\2\u008a\u0201\3\2\2\2\u008c\u0205\3\2\2\2\u008e"+
		"\u0208\3\2\2\2\u0090\u020c\3\2\2\2\u0092\u0210\3\2\2\2\u0094\u0215\3\2"+
		"\2\2\u0096\u021b\3\2\2\2\u0098\u0225\3\2\2\2\u009a\u022b\3\2\2\2\u009c"+
		"\u0236\3\2\2\2\u009e\u023d\3\2\2\2\u00a0\u0242\3\2\2\2\u00a2\u00a3\7\17"+
		"\2\2\u00a3\u00a6\7\f\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\2\2\2\u00a8\7\3\2\2\2"+
		"\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\3\3\2\u00af"+
		"\t\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b3\7\61\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bc"+
		"\3\2\2\2\u00b6\u00b8\7%\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b2\3\2"+
		"\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\n\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\4\4\2\u00c4"+
		"\13\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7,\2\2\u00c7\u00cb\3\2\2"+
		"\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\b\5\4\2\u00d2\r\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7q\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\17\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\21\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dc\23\3\2\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0\u00e7\7g\2\2"+
		"\u00e1\u00e2\7h\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5"+
		"\7u\2\2\u00e5\u00e7\7g\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7"+
		"\25\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\27\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7h\2\2"+
		"\u00f3\u00f4\7q\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7o\2\2\u00f6\31\3\2"+
		"\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb"+
		"\7w\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd\33\3\2\2\2\u00fe\u00ff"+
		"\7r\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101\u0102\7x\2\2\u0102"+
		"\u0103\7k\2\2\u0103\u0104\7f\2\2\u0104\u0105\7g\2\2\u0105\u0106\7t\2\2"+
		"\u0106\35\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7"+
		"u\2\2\u010a\u010b\7q\2\2\u010b\u010c\7w\2\2\u010c\u010d\7t\2\2\u010d\u010e"+
		"\7e\2\2\u010e\u010f\7g\2\2\u010f\37\3\2\2\2\u0110\u0111\7f\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114\7c\2\2\u0114!\3\2\2\2\u0115\u0116"+
		"\7n\2\2\u0116\u0117\7q\2\2\u0117\u0118\7e\2\2\u0118\u0119\7c\2\2\u0119"+
		"\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b#\3\2\2\2\u011c\u011d\7x\2\2\u011d"+
		"\u011e\7c\2\2\u011e\u011f\7t\2\2\u011f\u0120\7k\2\2\u0120\u0121\7c\2\2"+
		"\u0121\u0122\7d\2\2\u0122\u0123\7n\2\2\u0123\u0124\7g\2\2\u0124%\3\2\2"+
		"\2\u0125\u0126\7q\2\2\u0126\u0127\7w\2\2\u0127\u0128\7v\2\2\u0128\u0129"+
		"\7r\2\2\u0129\u012a\7w\2\2\u012a\u012b\7v\2\2\u012b\'\3\2\2\2\u012c\u012d"+
		"\7-\2\2\u012d)\3\2\2\2\u012e\u012f\7/\2\2\u012f+\3\2\2\2\u0130\u0131\7"+
		",\2\2\u0131-\3\2\2\2\u0132\u0133\7\61\2\2\u0133/\3\2\2\2\u0134\u0135\7"+
		">\2\2\u0135\61\3\2\2\2\u0136\u0137\7@\2\2\u0137\63\3\2\2\2\u0138\u0139"+
		"\7>\2\2\u0139\u013a\7?\2\2\u013a\65\3\2\2\2\u013b\u013c\7@\2\2\u013c\u013d"+
		"\7?\2\2\u013d\67\3\2\2\2\u013e\u013f\7?\2\2\u013f\u0140\7?\2\2\u01409"+
		"\3\2\2\2\u0141\u0142\7#\2\2\u0142\u0143\7?\2\2\u0143;\3\2\2\2\u0144\u0145"+
		"\7(\2\2\u0145\u0146\7(\2\2\u0146=\3\2\2\2\u0147\u0148\7~\2\2\u0148\u0149"+
		"\7~\2\2\u0149?\3\2\2\2\u014a\u014b\7#\2\2\u014bA\3\2\2\2\u014c\u014d\7"+
		"A\2\2\u014dC\3\2\2\2\u014e\u014f\7<\2\2\u014fE\3\2\2\2\u0150\u0151\7?"+
		"\2\2\u0151G\3\2\2\2\u0152\u0153\7?\2\2\u0153\u0154\7@\2\2\u0154I\3\2\2"+
		"\2\u0155\u0156\7}\2\2\u0156K\3\2\2\2\u0157\u0159\7\u0080\2\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\177\2\2"+
		"\u015b\u015c\b%\5\2\u015cM\3\2\2\2\u015d\u015e\7]\2\2\u015eO\3\2\2\2\u015f"+
		"\u0160\7_\2\2\u0160Q\3\2\2\2\u0161\u0162\7*\2\2\u0162S\3\2\2\2\u0163\u0164"+
		"\7+\2\2\u0164U\3\2\2\2\u0165\u0166\7\60\2\2\u0166\u0167\7\60\2\2\u0167"+
		"\u0168\7\60\2\2\u0168W\3\2\2\2\u0169\u016a\7\60\2\2\u016aY\3\2\2\2\u016b"+
		"\u016c\7.\2\2\u016c[\3\2\2\2\u016d\u016f\t\4\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171]\3\2\2\2"+
		"\u0172\u0174\t\4\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\7\60\2\2"+
		"\u0178\u017a\t\4\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c_\3\2\2\2\u017d\u017f\t\4\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0188\3\2\2\2\u0182\u0184\7\60\2\2\u0183\u0185\t\4\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\t\5\2\2\u018b\u018d\t\6\2\2\u018c\u018b\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0190\t\4\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192a\3\2\2\2\u0193\u0197\t\7\2\2\u0194\u0196\t\b\2\2\u0195\u0194"+
		"\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"c\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7>\2\2\u019b\u019c\7>\2\2\u019c"+
		"\u019d\7/\2\2\u019d\u019e\3\2\2\2\u019e\u019f\5b\60\2\u019f\u01a0\b\61"+
		"\6\2\u01a0e\3\2\2\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7>\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\5b\60\2\u01a5\u01a6\b\62\7\2\u01a6g\3\2\2\2\u01a7"+
		"\u01a8\7&\2\2\u01a8\u01a9\7&\2\2\u01a9\u01aa\7}\2\2\u01aai\3\2\2\2\u01ab"+
		"\u01ac\7&\2\2\u01ac\u01ad\7}\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0\7\u0080"+
		"\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\b\64\b\2\u01b2k\3\2\2\2\u01b3\u01b4\7\'\2\2\u01b4\u01b5\7\'\2\2"+
		"\u01b5\u01b6\7}\2\2\u01b6m\3\2\2\2\u01b7\u01b8\7\'\2\2\u01b8\u01b9\7}"+
		"\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\7\u0080\2\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\b\66\t\2\u01beo\3\2\2\2"+
		"\u01bf\u01c0\7&\2\2\u01c0q\3\2\2\2\u01c1\u01c2\7\'\2\2\u01c2s\3\2\2\2"+
		"\u01c3\u01c4\7$\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\b9\n\2\u01c6u\3\2"+
		"\2\2\u01c7\u01c8\7)\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\b:\13\2\u01ca"+
		"w\3\2\2\2\u01cb\u01cd\n\t\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2"+
		"\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfy\3\2\2\2\u01d0\u01d1\7"+
		"^\2\2\u01d1\u01d2\13\2\2\2\u01d2{\3\2\2\2\u01d3\u01d4\7&\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\b=\f\2\u01d6}\3\2\2\2\u01d7\u01d8\7\'\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\b>\r\2\u01da\177\3\2\2\2\u01db\u01dc\7$\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\b?\16\2\u01de\u01df\b?\17\2\u01df\u0081\3\2"+
		"\2\2\u01e0\u01e1\7&\2\2\u01e1\u01e2\7&\2\2\u01e2\u01e3\7}\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\b@\20\2\u01e5\u0083\3\2\2\2\u01e6\u01e7\7&\2\2\u01e7"+
		"\u01e8\7}\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01eb\7\u0080\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\bA\21\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\bA\22\2\u01ef\u0085\3\2\2\2\u01f0\u01f1\7\'"+
		"\2\2\u01f1\u01f2\7\'\2\2\u01f2\u01f3\7}\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\bB\23\2\u01f5\u0087\3\2\2\2\u01f6\u01f7\7\'\2\2\u01f7\u01f8\7}"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\7\u0080\2\2\u01fa\u01f9\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\bC\24\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u01ff\bC\25\2\u01ff\u0089\3\2\2\2\u0200\u0202\n\n\2\2\u0201"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u008b\3\2\2\2\u0205\u0206\7^\2\2\u0206\u0207\13\2\2\2\u0207"+
		"\u008d\3\2\2\2\u0208\u0209\7&\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bF\f"+
		"\2\u020b\u008f\3\2\2\2\u020c\u020d\7\'\2\2\u020d\u020e\3\2\2\2\u020e\u020f"+
		"\bG\r\2\u020f\u0091\3\2\2\2\u0210\u0211\7)\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0213\bH\26\2\u0213\u0214\bH\17\2\u0214\u0093\3\2\2\2\u0215\u0216\7&"+
		"\2\2\u0216\u0217\7&\2\2\u0217\u0218\7}\2\2\u0218\u0219\3\2\2\2\u0219\u021a"+
		"\bI\20\2\u021a\u0095\3\2\2\2\u021b\u021c\7&\2\2\u021c\u021d\7}\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0220\7\u0080\2\2\u021f\u021e\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\bJ\27\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\bJ\22\2\u0224\u0097\3\2\2\2\u0225\u0226\7\'\2\2\u0226\u0227\7\'"+
		"\2\2\u0227\u0228\7}\2\2\u0228\u0229\3\2\2\2\u0229\u022a\bK\23\2\u022a"+
		"\u0099\3\2\2\2\u022b\u022c\7\'\2\2\u022c\u022d\7}\2\2\u022d\u022f\3\2"+
		"\2\2\u022e\u0230\7\u0080\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\bL\30\2\u0232\u0233\3\2\2\2\u0233\u0234\bL"+
		"\25\2\u0234\u009b\3\2\2\2\u0235\u0237\n\2\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u009d\3\2"+
		"\2\2\u023a\u023b\7\17\2\2\u023b\u023e\7\f\2\2\u023c\u023e\t\2\2\2\u023d"+
		"\u023a\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\bN"+
		"\31\2\u0240\u009f\3\2\2\2\u0241\u0243\5\u009eN\2\u0242\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2"+
		"\2\2\u0246\u0248\t\3\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024c\u024d\5b\60\2\u024d\u024e\6O\2\2\u024e\u024f\bO\32\2\u024f"+
		"\u00a1\3\2\2\2$\2\3\4\5\u00a5\u00ac\u00b4\u00b9\u00bb\u00c0\u00cb\u00e6"+
		"\u0158\u0170\u0175\u017b\u0180\u0186\u0188\u018c\u0191\u0197\u01af\u01bb"+
		"\u01ce\u01ea\u01fa\u0203\u021f\u022f\u0238\u023d\u0244\u0249\33\2\3\2"+
		"\2\4\2\2\5\2\3%\2\3\61\3\3\62\4\3\64\5\3\66\6\7\3\2\7\4\2\t8\2\t9\2\t"+
		":\2\6\2\2\t\64\2\3A\7\t\65\2\t\66\2\3C\b\t\67\2\t;\2\3J\t\3L\n\t\3\2\3"+
		"O\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}