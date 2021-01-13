// Generated from tfParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tfParser extends Parser {
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
		RULE_file = 0, RULE_block = 1, RULE_bodyBegin = 2, RULE_bodyEnd = 3, RULE_terraform = 4, 
		RULE_local = 5, RULE_module = 6, RULE_variable = 7, RULE_output = 8, RULE_provider = 9, 
		RULE_resource = 10, RULE_data = 11, RULE_blockName = 12, RULE_blockType = 13, 
		RULE_argument = 14, RULE_identifier = 15, RULE_keyword = 16, RULE_expression = 17, 
		RULE_negateOp = 18, RULE_arithmeticOp = 19, RULE_compareOp = 20, RULE_logicOp = 21, 
		RULE_accessor = 22, RULE_index = 23, RULE_attr = 24, RULE_splat = 25, 
		RULE_attrSplat = 26, RULE_fullSplat = 27, RULE_exprTerm = 28, RULE_literal = 29, 
		RULE_reference = 30, RULE_function = 31, RULE_args = 32, RULE_list = 33, 
		RULE_map = 34, RULE_items = 35, RULE_elements = 36, RULE_element = 37, 
		RULE_elementsEOL = 38, RULE_elementEOL = 39, RULE_forExpr = 40, RULE_forList = 41, 
		RULE_forMap = 42, RULE_string = 43, RULE_heredoc = 44, RULE_interpo = 45, 
		RULE_directive = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "bodyBegin", "bodyEnd", "terraform", "local", "module", 
			"variable", "output", "provider", "resource", "data", "blockName", "blockType", 
			"argument", "identifier", "keyword", "expression", "negateOp", "arithmeticOp", 
			"compareOp", "logicOp", "accessor", "index", "attr", "splat", "attrSplat", 
			"fullSplat", "exprTerm", "literal", "reference", "function", "args", 
			"list", "map", "items", "elements", "element", "elementsEOL", "elementEOL", 
			"forExpr", "forList", "forMap", "string", "heredoc", "interpo", "directive"
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

	@Override
	public String getGrammarFileName() { return "tfParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		
		/* Solution for context-dependent EOL detection citation: */
		// https://stackoverflow.com/questions/41667217/antlr4-how-can-i-both-hide-and-use-tokens-in-a-grammar
		//
		// Backtrack through token channels until we find either : 
			1. EOL Channel 	   --> isEOL() = true
			2. Default Channel --> isEOL() = false
			
		boolean isEOL()
		{
	        int channel = getCurrentToken().getChannel();
	        int index = getCurrentToken().getTokenIndex();
	        
	        do {
	        	channel = getTokenStream().get(--index).getChannel();
	        } while (channel != 0 && channel != 1);
	        
	        return (channel == 1);
		}

	public tfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tfParser.EOF, 0); }
		public List<TerraformContext> terraform() {
			return getRuleContexts(TerraformContext.class);
		}
		public TerraformContext terraform(int i) {
			return getRuleContext(TerraformContext.class,i);
		}
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<ProviderContext> provider() {
			return getRuleContexts(ProviderContext.class);
		}
		public ProviderContext provider(int i) {
			return getRuleContext(ProviderContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<LocalContext> local() {
			return getRuleContexts(LocalContext.class);
		}
		public LocalContext local(int i) {
			return getRuleContext(LocalContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TERRAFORM:
					{
					setState(94);
					terraform();
					}
					break;
				case MODULE:
					{
					setState(95);
					module();
					}
					break;
				case PROVIDER:
					{
					setState(96);
					provider();
					}
					break;
				case RESOURCE:
					{
					setState(97);
					resource();
					}
					break;
				case DATA:
					{
					setState(98);
					data();
					}
					break;
				case LOCALS:
					{
					setState(99);
					local();
					}
					break;
				case VARIABLE:
					{
					setState(100);
					variable();
					}
					break;
				case OUTPUT:
					{
					setState(101);
					output();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			identifier();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER) | (1L << QUOTE))) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case IN:
				case IF:
				case BOOL:
				case NULL:
				case TERRAFORM:
				case MODULE:
				case PROVIDER:
				case RESOURCE:
				case DATA:
				case LOCALS:
				case VARIABLE:
				case OUTPUT:
				case IDENTIFIER:
					{
					setState(110);
					identifier();
					}
					break;
				case QUOTE:
					{
					setState(111);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			bodyBegin();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(118);
					argument();
					}
					break;
				case 2:
					{
					setState(119);
					block();
					}
					break;
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyBeginContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(tfParser.LCURL, 0); }
		public BodyBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterBodyBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitBodyBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitBodyBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyBeginContext bodyBegin() throws RecognitionException {
		BodyBeginContext _localctx = new BodyBeginContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bodyBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LCURL);
			setState(128);
			if (!( isEOL() )) throw new FailedPredicateException(this, " isEOL() ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyEndContext extends ParserRuleContext {
		public TerminalNode RCURL() { return getToken(tfParser.RCURL, 0); }
		public BodyEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterBodyEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitBodyEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitBodyEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyEndContext bodyEnd() throws RecognitionException {
		BodyEndContext _localctx = new BodyEndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bodyEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(RCURL);
			setState(131);
			if (!( isEOL() )) throw new FailedPredicateException(this, " isEOL() ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerraformContext extends ParserRuleContext {
		public TerminalNode TERRAFORM() { return getToken(tfParser.TERRAFORM, 0); }
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerraformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terraform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterTerraform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitTerraform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitTerraform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerraformContext terraform() throws RecognitionException {
		TerraformContext _localctx = new TerraformContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_terraform);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(TERRAFORM);
			setState(134);
			bodyBegin();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(135);
					argument();
					}
					break;
				case 2:
					{
					setState(136);
					block();
					}
					break;
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalContext extends ParserRuleContext {
		public TerminalNode LOCALS() { return getToken(tfParser.LOCALS, 0); }
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LOCALS);
			setState(145);
			bodyBegin();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(146);
					argument();
					}
					break;
				case 2:
					{
					setState(147);
					block();
					}
					break;
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(tfParser.MODULE, 0); }
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(MODULE);
			setState(156);
			blockName();
			setState(157);
			bodyBegin();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(158);
					argument();
					}
					break;
				case 2:
					{
					setState(159);
					block();
					}
					break;
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(tfParser.VARIABLE, 0); }
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(VARIABLE);
			setState(168);
			blockName();
			setState(169);
			bodyBegin();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(170);
					argument();
					}
					break;
				case 2:
					{
					setState(171);
					block();
					}
					break;
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(tfParser.OUTPUT, 0); }
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(OUTPUT);
			setState(180);
			blockName();
			setState(181);
			bodyBegin();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(182);
					argument();
					}
					break;
				case 2:
					{
					setState(183);
					block();
					}
					break;
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProviderContext extends ParserRuleContext {
		public TerminalNode PROVIDER() { return getToken(tfParser.PROVIDER, 0); }
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProviderContext provider() throws RecognitionException {
		ProviderContext _localctx = new ProviderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_provider);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(PROVIDER);
			setState(192);
			blockType();
			setState(193);
			bodyBegin();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(194);
					argument();
					}
					break;
				case 2:
					{
					setState(195);
					block();
					}
					break;
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode RESOURCE() { return getToken(tfParser.RESOURCE, 0); }
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(RESOURCE);
			setState(204);
			blockType();
			setState(205);
			blockName();
			setState(206);
			bodyBegin();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(207);
					argument();
					}
					break;
				case 2:
					{
					setState(208);
					block();
					}
					break;
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(tfParser.DATA, 0); }
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public BlockNameContext blockName() {
			return getRuleContext(BlockNameContext.class,0);
		}
		public BodyBeginContext bodyBegin() {
			return getRuleContext(BodyBeginContext.class,0);
		}
		public BodyEndContext bodyEnd() {
			return getRuleContext(BodyEndContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DATA);
			setState(217);
			blockType();
			setState(218);
			blockName();
			setState(219);
			bodyBegin();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(220);
					argument();
					}
					break;
				case 2:
					{
					setState(221);
					block();
					}
					break;
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			bodyEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BlockNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterBlockName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitBlockName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitBlockName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNameContext blockName() throws RecognitionException {
		BlockNameContext _localctx = new BlockNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockName);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IN:
			case IF:
			case BOOL:
			case NULL:
			case TERRAFORM:
			case MODULE:
			case PROVIDER:
			case RESOURCE:
			case DATA:
			case LOCALS:
			case VARIABLE:
			case OUTPUT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				identifier();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BlockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterBlockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitBlockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitBlockType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockTypeContext blockType() throws RecognitionException {
		BlockTypeContext _localctx = new BlockTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockType);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IN:
			case IF:
			case BOOL:
			case NULL:
			case TERRAFORM:
			case MODULE:
			case PROVIDER:
			case RESOURCE:
			case DATA:
			case LOCALS:
			case VARIABLE:
			case OUTPUT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				identifier();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(tfParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			identifier();
			setState(238);
			match(EQUALS);
			setState(239);
			expression(0);
			setState(240);
			if (!( isEOL() )) throw new FailedPredicateException(this, " isEOL() ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(tfParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(IDENTIFIER);
				}
				break;
			case FOR:
			case IN:
			case IF:
			case BOOL:
			case NULL:
			case TERRAFORM:
			case MODULE:
			case PROVIDER:
			case RESOURCE:
			case DATA:
			case LOCALS:
			case VARIABLE:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tfParser.FOR, 0); }
		public TerminalNode IN() { return getToken(tfParser.IN, 0); }
		public TerminalNode IF() { return getToken(tfParser.IF, 0); }
		public TerminalNode BOOL() { return getToken(tfParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(tfParser.NULL, 0); }
		public TerminalNode TERRAFORM() { return getToken(tfParser.TERRAFORM, 0); }
		public TerminalNode MODULE() { return getToken(tfParser.MODULE, 0); }
		public TerminalNode PROVIDER() { return getToken(tfParser.PROVIDER, 0); }
		public TerminalNode RESOURCE() { return getToken(tfParser.RESOURCE, 0); }
		public TerminalNode DATA() { return getToken(tfParser.DATA, 0); }
		public TerminalNode LOCALS() { return getToken(tfParser.LOCALS, 0); }
		public TerminalNode VARIABLE() { return getToken(tfParser.VARIABLE, 0); }
		public TerminalNode OUTPUT() { return getToken(tfParser.OUTPUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyword);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IN:
			case IF:
			case BOOL:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TERRAFORM:
			case MODULE:
			case PROVIDER:
			case RESOURCE:
			case DATA:
			case LOCALS:
			case VARIABLE:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public NegateOpContext negateOp() {
			return getRuleContext(NegateOpContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprTermContext exprTerm() {
			return getRuleContext(ExprTermContext.class,0);
		}
		public List<AccessorContext> accessor() {
			return getRuleContexts(AccessorContext.class);
		}
		public AccessorContext accessor(int i) {
			return getRuleContext(AccessorContext.class,i);
		}
		public ArithmeticOpContext arithmeticOp() {
			return getRuleContext(ArithmeticOpContext.class,0);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(tfParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(tfParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				{
				setState(251);
				negateOp();
				setState(252);
				expression(4);
				}
				break;
			case FOR:
			case IN:
			case IF:
			case BOOL:
			case NULL:
			case TERRAFORM:
			case MODULE:
			case PROVIDER:
			case RESOURCE:
			case DATA:
			case LOCALS:
			case VARIABLE:
			case OUTPUT:
			case LCURL:
			case LBRACKET:
			case LPAREN:
			case INTEGER:
			case FLOAT:
			case EXPONENTIAL:
			case IDENTIFIER:
			case HEREDOC_INDENT:
			case HEREDOC:
			case QUOTE:
				{
				setState(254);
				exprTerm();
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						accessor();
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
						case MINUS:
						case STAR:
						case DIVIDE:
						case MODULO:
							{
							setState(264);
							arithmeticOp();
							}
							break;
						case LT:
						case GT:
						case LTE:
						case GTE:
						case DEQUAL:
						case NEQUAL:
							{
							setState(265);
							compareOp();
							}
							break;
						case AND:
						case OR:
						case NOT:
							{
							setState(266);
							logicOp();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(269);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						match(QUESTION);
						setState(273);
						expression(0);
						setState(274);
						match(COLON);
						setState(275);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NegateOpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(tfParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(tfParser.NOT, 0); }
		public NegateOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negateOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterNegateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitNegateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitNegateOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegateOpContext negateOp() throws RecognitionException {
		NegateOpContext _localctx = new NegateOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_negateOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(tfParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(tfParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(tfParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(tfParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(tfParser.MINUS, 0); }
		public ArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOpContext arithmeticOp() throws RecognitionException {
		ArithmeticOpContext _localctx = new ArithmeticOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arithmeticOp);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case DIVIDE:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(tfParser.LT, 0); }
		public TerminalNode GT() { return getToken(tfParser.GT, 0); }
		public TerminalNode LTE() { return getToken(tfParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(tfParser.GTE, 0); }
		public TerminalNode DEQUAL() { return getToken(tfParser.DEQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(tfParser.NEQUAL, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareOp);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case LTE:
			case GTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DEQUAL:
			case NEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==DEQUAL || _la==NEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(tfParser.AND, 0); }
		public TerminalNode OR() { return getToken(tfParser.OR, 0); }
		public TerminalNode NOT() { return getToken(tfParser.NOT, 0); }
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessorContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public SplatContext splat() {
			return getRuleContext(SplatContext.class,0);
		}
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_accessor);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				attr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				splat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(tfParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(tfParser.RBRACKET, 0); }
		public TerminalNode DOT() { return getToken(tfParser.DOT, 0); }
		public TerminalNode INTEGER() { return getToken(tfParser.INTEGER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_index);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(LBRACKET);
				setState(300);
				expression(0);
				setState(301);
				match(RBRACKET);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(DOT);
				setState(304);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(tfParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(DOT);
			setState(308);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SplatContext extends ParserRuleContext {
		public AttrSplatContext attrSplat() {
			return getRuleContext(AttrSplatContext.class,0);
		}
		public FullSplatContext fullSplat() {
			return getRuleContext(FullSplatContext.class,0);
		}
		public SplatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterSplat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitSplat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitSplat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplatContext splat() throws RecognitionException {
		SplatContext _localctx = new SplatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_splat);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				attrSplat();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				fullSplat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrSplatContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(tfParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(tfParser.STAR, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public AttrSplatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrSplat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterAttrSplat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitAttrSplat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitAttrSplat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrSplatContext attrSplat() throws RecognitionException {
		AttrSplatContext _localctx = new AttrSplatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attrSplat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(DOT);
			setState(315);
			match(STAR);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					attr();
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullSplatContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(tfParser.LBRACKET, 0); }
		public TerminalNode STAR() { return getToken(tfParser.STAR, 0); }
		public TerminalNode RBRACKET() { return getToken(tfParser.RBRACKET, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public FullSplatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullSplat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterFullSplat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitFullSplat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitFullSplat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullSplatContext fullSplat() throws RecognitionException {
		FullSplatContext _localctx = new FullSplatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fullSplat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(LBRACKET);
			setState(323);
			match(STAR);
			setState(324);
			match(RBRACKET);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(325);
						attr();
						}
						break;
					case 2:
						{
						setState(326);
						index();
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprTermContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public HeredocContext heredoc() {
			return getRuleContext(HeredocContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(tfParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(tfParser.RPAREN, 0); }
		public ExprTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprTermContext exprTerm() throws RecognitionException {
		ExprTermContext _localctx = new ExprTermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exprTerm);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				reference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				heredoc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				map();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
				forExpr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
				match(LPAREN);
				setState(341);
				expression(0);
				setState(342);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(tfParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(tfParser.FLOAT, 0); }
		public TerminalNode EXPONENTIAL() { return getToken(tfParser.EXPONENTIAL, 0); }
		public TerminalNode BOOL() { return getToken(tfParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(tfParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NULL) | (1L << INTEGER) | (1L << FLOAT) | (1L << EXPONENTIAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(tfParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(tfParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			identifier();
			setState(351);
			match(LPAREN);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << MINUS) | (1L << NOT) | (1L << LCURL) | (1L << LBRACKET) | (1L << LPAREN) | (1L << INTEGER) | (1L << FLOAT) | (1L << EXPONENTIAL) | (1L << IDENTIFIER) | (1L << HEREDOC_INDENT) | (1L << HEREDOC) | (1L << QUOTE))) != 0)) {
				{
				setState(352);
				args();
				}
			}

			setState(355);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tfParser.COMMA, i);
		}
		public TerminalNode DOTS() { return getToken(tfParser.DOTS, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			expression(0);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(COMMA);
					setState(359);
					expression(0);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTS || _la==COMMA) {
				{
				setState(365);
				_la = _input.LA(1);
				if ( !(_la==DOTS || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(tfParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(tfParser.RBRACKET, 0); }
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LBRACKET);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << MINUS) | (1L << NOT) | (1L << LCURL) | (1L << LBRACKET) | (1L << LPAREN) | (1L << INTEGER) | (1L << FLOAT) | (1L << EXPONENTIAL) | (1L << IDENTIFIER) | (1L << HEREDOC_INDENT) | (1L << HEREDOC) | (1L << QUOTE))) != 0)) {
				{
				setState(369);
				items();
				}
			}

			setState(372);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(tfParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(tfParser.RCURL, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsEOLContext elementsEOL() {
			return getRuleContext(ElementsEOLContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LCURL);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(375);
				elements();
				}
				break;
			case 2:
				{
				setState(376);
				elementsEOL();
				}
				break;
			}
			setState(379);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tfParser.COMMA, i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expression(0);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					match(COMMA);
					setState(383);
					expression(0);
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(389);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tfParser.COMMA, i);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			element();
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(393);
					match(COMMA);
					setState(394);
					element();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(400);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(tfParser.EQUALS, 0); }
		public TerminalNode COLON() { return getToken(tfParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(403);
				identifier();
				}
				break;
			case 2:
				{
				setState(404);
				expression(0);
				}
				break;
			}
			setState(407);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(408);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsEOLContext extends ParserRuleContext {
		public List<ElementEOLContext> elementEOL() {
			return getRuleContexts(ElementEOLContext.class);
		}
		public ElementEOLContext elementEOL(int i) {
			return getRuleContext(ElementEOLContext.class,i);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementsEOLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementsEOL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterElementsEOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitElementsEOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitElementsEOL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsEOLContext elementsEOL() throws RecognitionException {
		ElementsEOLContext _localctx = new ElementsEOLContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elementsEOL);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(410);
					elementEOL();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(413); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << MINUS) | (1L << NOT) | (1L << LCURL) | (1L << LBRACKET) | (1L << LPAREN) | (1L << INTEGER) | (1L << FLOAT) | (1L << EXPONENTIAL) | (1L << IDENTIFIER) | (1L << HEREDOC_INDENT) | (1L << HEREDOC) | (1L << QUOTE))) != 0)) {
				{
				setState(415);
				element();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementEOLContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(tfParser.EQUALS, 0); }
		public TerminalNode COLON() { return getToken(tfParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementEOLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementEOL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterElementEOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitElementEOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitElementEOL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementEOLContext elementEOL() throws RecognitionException {
		ElementEOLContext _localctx = new ElementEOLContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elementEOL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(418);
				identifier();
				}
				break;
			case 2:
				{
				setState(419);
				expression(0);
				}
				break;
			}
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(423);
			expression(0);
			setState(424);
			if (!( isEOL() )) throw new FailedPredicateException(this, " isEOL() ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExprContext extends ParserRuleContext {
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public ForMapContext forMap() {
			return getRuleContext(ForMapContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitForExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forExpr);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				forList();
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				forMap();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(tfParser.LBRACKET, 0); }
		public TerminalNode FOR() { return getToken(tfParser.FOR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(tfParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(tfParser.COLON, 0); }
		public TerminalNode RBRACKET() { return getToken(tfParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(tfParser.COMMA, 0); }
		public TerminalNode IF() { return getToken(tfParser.IF, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(LBRACKET);
			setState(431);
			match(FOR);
			setState(432);
			identifier();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(433);
				match(COMMA);
				setState(434);
				identifier();
				}
			}

			setState(437);
			match(IN);
			setState(438);
			expression(0);
			setState(439);
			match(COLON);
			setState(440);
			expression(0);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(441);
				match(IF);
				setState(442);
				expression(0);
				}
			}

			setState(445);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForMapContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(tfParser.LCURL, 0); }
		public TerminalNode FOR() { return getToken(tfParser.FOR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(tfParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(tfParser.COLON, 0); }
		public TerminalNode ARROW() { return getToken(tfParser.ARROW, 0); }
		public TerminalNode RCURL() { return getToken(tfParser.RCURL, 0); }
		public TerminalNode COMMA() { return getToken(tfParser.COMMA, 0); }
		public TerminalNode DOTS() { return getToken(tfParser.DOTS, 0); }
		public TerminalNode IF() { return getToken(tfParser.IF, 0); }
		public ForMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterForMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitForMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitForMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForMapContext forMap() throws RecognitionException {
		ForMapContext _localctx = new ForMapContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LCURL);
			setState(448);
			match(FOR);
			setState(449);
			identifier();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(450);
				match(COMMA);
				setState(451);
				identifier();
				}
			}

			setState(454);
			match(IN);
			setState(455);
			expression(0);
			setState(456);
			match(COLON);
			setState(457);
			expression(0);
			setState(458);
			match(ARROW);
			setState(459);
			expression(0);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTS) {
				{
				setState(460);
				match(DOTS);
				}
			}

			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(463);
				match(IF);
				setState(464);
				expression(0);
				}
			}

			setState(467);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(tfParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(tfParser.QUOTE, i);
		}
		public List<TerminalNode> STRING_TEXT() { return getTokens(tfParser.STRING_TEXT); }
		public TerminalNode STRING_TEXT(int i) {
			return getToken(tfParser.STRING_TEXT, i);
		}
		public List<TerminalNode> ESCAPE_CHAR() { return getTokens(tfParser.ESCAPE_CHAR); }
		public TerminalNode ESCAPE_CHAR(int i) {
			return getToken(tfParser.ESCAPE_CHAR, i);
		}
		public List<InterpoContext> interpo() {
			return getRuleContexts(InterpoContext.class);
		}
		public InterpoContext interpo(int i) {
			return getRuleContext(InterpoContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(QUOTE);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCAPE_INTERPO) | (1L << INTERPO_PUSH) | (1L << ESCAPE_DIRECTIVE) | (1L << DIRECTIVE_PUSH) | (1L << DOLLAR) | (1L << MODULO) | (1L << STRING_TEXT) | (1L << ESCAPE_CHAR))) != 0)) {
				{
				setState(474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_TEXT:
					{
					setState(470);
					match(STRING_TEXT);
					}
					break;
				case ESCAPE_CHAR:
					{
					setState(471);
					match(ESCAPE_CHAR);
					}
					break;
				case ESCAPE_INTERPO:
				case INTERPO_PUSH:
				case DOLLAR:
					{
					setState(472);
					interpo();
					}
					break;
				case ESCAPE_DIRECTIVE:
				case DIRECTIVE_PUSH:
				case MODULO:
					{
					setState(473);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeredocContext extends ParserRuleContext {
		public TerminalNode CLOSE_HEREDOC() { return getToken(tfParser.CLOSE_HEREDOC, 0); }
		public TerminalNode HEREDOC_INDENT() { return getToken(tfParser.HEREDOC_INDENT, 0); }
		public TerminalNode HEREDOC() { return getToken(tfParser.HEREDOC, 0); }
		public List<TerminalNode> HEREDOC_TEXT() { return getTokens(tfParser.HEREDOC_TEXT); }
		public TerminalNode HEREDOC_TEXT(int i) {
			return getToken(tfParser.HEREDOC_TEXT, i);
		}
		public List<TerminalNode> EOL() { return getTokens(tfParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(tfParser.EOL, i);
		}
		public HeredocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heredoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterHeredoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitHeredoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitHeredoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeredocContext heredoc() throws RecognitionException {
		HeredocContext _localctx = new HeredocContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_heredoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !(_la==HEREDOC_INDENT || _la==HEREDOC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL || _la==HEREDOC_TEXT) {
				{
				{
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==EOL || _la==HEREDOC_TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(CLOSE_HEREDOC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpoContext extends ParserRuleContext {
		public TerminalNode ESCAPE_INTERPO() { return getToken(tfParser.ESCAPE_INTERPO, 0); }
		public TerminalNode INTERPO_PUSH() { return getToken(tfParser.INTERPO_PUSH, 0); }
		public TerminalNode RCURL() { return getToken(tfParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(tfParser.DOLLAR, 0); }
		public InterpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterInterpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitInterpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitInterpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpoContext interpo() throws RecognitionException {
		InterpoContext _localctx = new InterpoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interpo);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCAPE_INTERPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(ESCAPE_INTERPO);
				}
				break;
			case INTERPO_PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(INTERPO_PUSH);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << MINUS) | (1L << NOT) | (1L << LCURL) | (1L << LBRACKET) | (1L << LPAREN) | (1L << INTEGER) | (1L << FLOAT) | (1L << EXPONENTIAL) | (1L << IDENTIFIER) | (1L << HEREDOC_INDENT) | (1L << HEREDOC) | (1L << QUOTE))) != 0)) {
					{
					setState(492);
					expression(0);
					}
				}

				setState(495);
				match(RCURL);
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(DOLLAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode ESCAPE_DIRECTIVE() { return getToken(tfParser.ESCAPE_DIRECTIVE, 0); }
		public TerminalNode DIRECTIVE_PUSH() { return getToken(tfParser.DIRECTIVE_PUSH, 0); }
		public TerminalNode RCURL() { return getToken(tfParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MODULO() { return getToken(tfParser.MODULO, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tfParserListener ) ((tfParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tfParserVisitor ) return ((tfParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_directive);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCAPE_DIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(ESCAPE_DIRECTIVE);
				}
				break;
			case DIRECTIVE_PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(DIRECTIVE_PUSH);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IN) | (1L << IF) | (1L << BOOL) | (1L << NULL) | (1L << TERRAFORM) | (1L << MODULE) | (1L << PROVIDER) | (1L << RESOURCE) | (1L << DATA) | (1L << LOCALS) | (1L << VARIABLE) | (1L << OUTPUT) | (1L << MINUS) | (1L << NOT) | (1L << LCURL) | (1L << LBRACKET) | (1L << LPAREN) | (1L << INTEGER) | (1L << FLOAT) | (1L << EXPONENTIAL) | (1L << IDENTIFIER) | (1L << HEREDOC_INDENT) | (1L << HEREDOC) | (1L << QUOTE))) != 0)) {
					{
					setState(501);
					expression(0);
					}
				}

				setState(504);
				match(RCURL);
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(MODULO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return bodyBegin_sempred((BodyBeginContext)_localctx, predIndex);
		case 3:
			return bodyEnd_sempred((BodyEndContext)_localctx, predIndex);
		case 14:
			return argument_sempred((ArgumentContext)_localctx, predIndex);
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39:
			return elementEOL_sempred((ElementEOLContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bodyBegin_sempred(BodyBeginContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  isEOL() ;
		}
		return true;
	}
	private boolean bodyEnd_sempred(BodyEndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  isEOL() ;
		}
		return true;
	}
	private boolean argument_sempred(ArgumentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  isEOL() ;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean elementEOL_sempred(ElementEOLContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return  isEOL() ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2i"+
		"\n\2\f\2\16\2l\13\2\3\2\3\2\3\3\3\3\3\3\7\3s\n\3\f\3\16\3v\13\3\3\3\3"+
		"\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7"+
		"\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00a3\n"+
		"\b\f\b\16\b\u00a6\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00af\n\t\f\t\16"+
		"\t\u00b2\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00bb\n\n\f\n\16\n\u00be"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00c7\n\13\f\13\16\13\u00ca"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d4\n\f\f\f\16\f\u00d7"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e1\n\r\f\r\16\r\u00e4\13"+
		"\r\3\r\3\r\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\5\17\u00ee\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\5\22\u00fb\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0103\n\23\f\23\16\23\u0106\13\23"+
		"\5\23\u0108\n\23\3\23\3\23\3\23\3\23\5\23\u010e\n\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u0118\n\23\f\23\16\23\u011b\13\23\3\24\3"+
		"\24\3\25\3\25\5\25\u0121\n\25\3\26\3\26\5\26\u0125\n\26\3\27\3\27\3\30"+
		"\3\30\3\30\5\30\u012c\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0134\n"+
		"\31\3\32\3\32\3\32\3\33\3\33\5\33\u013b\n\33\3\34\3\34\3\34\7\34\u0140"+
		"\n\34\f\34\16\34\u0143\13\34\3\35\3\35\3\35\3\35\3\35\7\35\u014a\n\35"+
		"\f\35\16\35\u014d\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u015b\n\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u0164\n!\3!"+
		"\3!\3\"\3\"\3\"\7\"\u016b\n\"\f\"\16\"\u016e\13\"\3\"\5\"\u0171\n\"\3"+
		"#\3#\5#\u0175\n#\3#\3#\3$\3$\3$\5$\u017c\n$\3$\3$\3%\3%\3%\7%\u0183\n"+
		"%\f%\16%\u0186\13%\3%\5%\u0189\n%\3&\3&\3&\7&\u018e\n&\f&\16&\u0191\13"+
		"&\3&\5&\u0194\n&\3\'\3\'\5\'\u0198\n\'\3\'\3\'\3\'\3(\6(\u019e\n(\r(\16"+
		"(\u019f\3(\5(\u01a3\n(\3)\3)\5)\u01a7\n)\3)\3)\3)\3)\3*\3*\5*\u01af\n"+
		"*\3+\3+\3+\3+\3+\5+\u01b6\n+\3+\3+\3+\3+\3+\3+\5+\u01be\n+\3+\3+\3,\3"+
		",\3,\3,\3,\5,\u01c7\n,\3,\3,\3,\3,\3,\3,\3,\5,\u01d0\n,\3,\3,\5,\u01d4"+
		"\n,\3,\3,\3-\3-\3-\3-\3-\7-\u01dd\n-\f-\16-\u01e0\13-\3-\3-\3.\3.\7.\u01e6"+
		"\n.\f.\16.\u01e9\13.\3.\3.\3/\3/\3/\5/\u01f0\n/\3/\3/\5/\u01f4\n/\3\60"+
		"\3\60\3\60\5\60\u01f9\n\60\3\60\3\60\5\60\u01fd\n\60\3\60\2\3$\61\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^\2\17\3\2\7\13\3\2\f\23\4\2\25\25  \4\2\26\2799\3\2\24\25\3\2"+
		"\30\33\3\2\34\35\3\2\36 \4\2\n\13.\60\4\2++--\3\2\"#\3\2\62\63\4\2\3\3"+
		"==\2\u0225\2j\3\2\2\2\4o\3\2\2\2\6\u0081\3\2\2\2\b\u0084\3\2\2\2\n\u0087"+
		"\3\2\2\2\f\u0092\3\2\2\2\16\u009d\3\2\2\2\20\u00a9\3\2\2\2\22\u00b5\3"+
		"\2\2\2\24\u00c1\3\2\2\2\26\u00cd\3\2\2\2\30\u00da\3\2\2\2\32\u00e9\3\2"+
		"\2\2\34\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f6\3\2\2\2\"\u00fa\3\2\2\2"+
		"$\u0107\3\2\2\2&\u011c\3\2\2\2(\u0120\3\2\2\2*\u0124\3\2\2\2,\u0126\3"+
		"\2\2\2.\u012b\3\2\2\2\60\u0133\3\2\2\2\62\u0135\3\2\2\2\64\u013a\3\2\2"+
		"\2\66\u013c\3\2\2\28\u0144\3\2\2\2:\u015a\3\2\2\2<\u015c\3\2\2\2>\u015e"+
		"\3\2\2\2@\u0160\3\2\2\2B\u0167\3\2\2\2D\u0172\3\2\2\2F\u0178\3\2\2\2H"+
		"\u017f\3\2\2\2J\u018a\3\2\2\2L\u0197\3\2\2\2N\u019d\3\2\2\2P\u01a6\3\2"+
		"\2\2R\u01ae\3\2\2\2T\u01b0\3\2\2\2V\u01c1\3\2\2\2X\u01d7\3\2\2\2Z\u01e3"+
		"\3\2\2\2\\\u01f3\3\2\2\2^\u01fc\3\2\2\2`i\5\n\6\2ai\5\16\b\2bi\5\24\13"+
		"\2ci\5\26\f\2di\5\30\r\2ei\5\f\7\2fi\5\20\t\2gi\5\22\n\2h`\3\2\2\2ha\3"+
		"\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\2\2\3n\3\3\2\2\2ot"+
		"\5 \21\2ps\5 \21\2qs\5X-\2rp\3\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vt\3\2\2\2w|\5\6\4\2x{\5\36\20\2y{\5\4\3\2zx\3\2\2\2z"+
		"y\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\5\b\5\2\u0080\5\3\2\2\2\u0081\u0082\7%\2\2\u0082\u0083\6\4\2\2\u0083"+
		"\7\3\2\2\2\u0084\u0085\7&\2\2\u0085\u0086\6\5\3\2\u0086\t\3\2\2\2\u0087"+
		"\u0088\7\f\2\2\u0088\u008d\5\6\4\2\u0089\u008c\5\36\20\2\u008a\u008c\5"+
		"\4\3\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\5\b\5\2\u0091\13\3\2\2\2\u0092\u0093\7\21\2\2\u0093\u0098"+
		"\5\6\4\2\u0094\u0097\5\36\20\2\u0095\u0097\5\4\3\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\b\5\2\u009c"+
		"\r\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\32\16\2\u009f\u00a4\5\6\4"+
		"\2\u00a0\u00a3\5\36\20\2\u00a1\u00a3\5\4\3\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5\b\5\2\u00a8"+
		"\17\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00b0\5\6"+
		"\4\2\u00ac\u00af\5\36\20\2\u00ad\u00af\5\4\3\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\b\5\2\u00b4"+
		"\21\3\2\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00bc\5\6"+
		"\4\2\u00b8\u00bb\5\36\20\2\u00b9\u00bb\5\4\3\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5\b\5\2\u00c0"+
		"\23\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c8\5\6"+
		"\4\2\u00c4\u00c7\5\36\20\2\u00c5\u00c7\5\4\3\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\b\5\2\u00cc"+
		"\25\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0\5\32"+
		"\16\2\u00d0\u00d5\5\6\4\2\u00d1\u00d4\5\36\20\2\u00d2\u00d4\5\4\3\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\5\b\5\2\u00d9\27\3\2\2\2\u00da\u00db\7\20\2\2\u00db\u00dc\5\34"+
		"\17\2\u00dc\u00dd\5\32\16\2\u00dd\u00e2\5\6\4\2\u00de\u00e1\5\36\20\2"+
		"\u00df\u00e1\5\4\3\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5\b\5\2\u00e6\31\3\2\2\2\u00e7\u00ea\5 \21"+
		"\2\u00e8\u00ea\5X-\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\33"+
		"\3\2\2\2\u00eb\u00ee\5 \21\2\u00ec\u00ee\5X-\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\35\3\2\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\7#\2\2"+
		"\u00f1\u00f2\5$\23\2\u00f2\u00f3\6\20\4\2\u00f3\37\3\2\2\2\u00f4\u00f7"+
		"\7\61\2\2\u00f5\u00f7\5\"\22\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7!\3\2\2\2\u00f8\u00fb\t\2\2\2\u00f9\u00fb\t\3\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00f9\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fd\b\23\1\2\u00fd\u00fe"+
		"\5&\24\2\u00fe\u00ff\5$\23\6\u00ff\u0108\3\2\2\2\u0100\u0104\5:\36\2\u0101"+
		"\u0103\5.\30\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u00fc\3\2\2\2\u0107\u0100\3\2\2\2\u0108\u0119\3\2\2\2\u0109\u010d\f\5"+
		"\2\2\u010a\u010e\5(\25\2\u010b\u010e\5*\26\2\u010c\u010e\5,\27\2\u010d"+
		"\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\5$\23\6\u0110\u0118\3\2\2\2\u0111\u0112\f\4\2\2\u0112"+
		"\u0113\7!\2\2\u0113\u0114\5$\23\2\u0114\u0115\7\"\2\2\u0115\u0116\5$\23"+
		"\5\u0116\u0118\3\2\2\2\u0117\u0109\3\2\2\2\u0117\u0111\3\2\2\2\u0118\u011b"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a%\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011d\t\4\2\2\u011d\'\3\2\2\2\u011e\u0121\t\5\2\2"+
		"\u011f\u0121\t\6\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121)\3"+
		"\2\2\2\u0122\u0125\t\7\2\2\u0123\u0125\t\b\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125+\3\2\2\2\u0126\u0127\t\t\2\2\u0127-\3\2\2\2\u0128"+
		"\u012c\5\60\31\2\u0129\u012c\5\62\32\2\u012a\u012c\5\64\33\2\u012b\u0128"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c/\3\2\2\2\u012d"+
		"\u012e\7\'\2\2\u012e\u012f\5$\23\2\u012f\u0130\7(\2\2\u0130\u0134\3\2"+
		"\2\2\u0131\u0132\7,\2\2\u0132\u0134\7.\2\2\u0133\u012d\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\61\3\2\2\2\u0135\u0136\7,\2\2\u0136\u0137\5 \21\2\u0137"+
		"\63\3\2\2\2\u0138\u013b\5\66\34\2\u0139\u013b\58\35\2\u013a\u0138\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\65\3\2\2\2\u013c\u013d\7,\2\2\u013d\u0141"+
		"\7\26\2\2\u013e\u0140\5\62\32\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2"+
		"\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\67\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0145\7\'\2\2\u0145\u0146\7\26\2\2\u0146\u014b\7(\2\2\u0147"+
		"\u014a\5\62\32\2\u0148\u014a\5\60\31\2\u0149\u0147\3\2\2\2\u0149\u0148"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"9\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u015b\5<\37\2\u014f\u015b\5> \2\u0150"+
		"\u015b\5X-\2\u0151\u015b\5Z.\2\u0152\u015b\5@!\2\u0153\u015b\5D#\2\u0154"+
		"\u015b\5F$\2\u0155\u015b\5R*\2\u0156\u0157\7)\2\2\u0157\u0158\5$\23\2"+
		"\u0158\u0159\7*\2\2\u0159\u015b\3\2\2\2\u015a\u014e\3\2\2\2\u015a\u014f"+
		"\3\2\2\2\u015a\u0150\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0152\3\2\2\2\u015a"+
		"\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2"+
		"\2\2\u015b;\3\2\2\2\u015c\u015d\t\n\2\2\u015d=\3\2\2\2\u015e\u015f\5 "+
		"\21\2\u015f?\3\2\2\2\u0160\u0161\5 \21\2\u0161\u0163\7)\2\2\u0162\u0164"+
		"\5B\"\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\7*\2\2\u0166A\3\2\2\2\u0167\u016c\5$\23\2\u0168\u0169\7-\2\2\u0169"+
		"\u016b\5$\23\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0171\t\13\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171C\3\2\2\2"+
		"\u0172\u0174\7\'\2\2\u0173\u0175\5H%\2\u0174\u0173\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7(\2\2\u0177E\3\2\2\2\u0178\u017b"+
		"\7%\2\2\u0179\u017c\5J&\2\u017a\u017c\5N(\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7&"+
		"\2\2\u017eG\3\2\2\2\u017f\u0184\5$\23\2\u0180\u0181\7-\2\2\u0181\u0183"+
		"\5$\23\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\7-"+
		"\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189I\3\2\2\2\u018a\u018f"+
		"\5L\'\2\u018b\u018c\7-\2\2\u018c\u018e\5L\'\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0194\7-\2\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194K\3\2\2\2\u0195\u0198\5 \21\2\u0196\u0198\5$\23\2"+
		"\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a"+
		"\t\f\2\2\u019a\u019b\5$\23\2\u019bM\3\2\2\2\u019c\u019e\5P)\2\u019d\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u01a3\5L\'\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3O\3\2\2\2\u01a4\u01a7\5 \21\2\u01a5\u01a7\5$\23\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\t\f\2\2\u01a9"+
		"\u01aa\5$\23\2\u01aa\u01ab\6)\7\2\u01abQ\3\2\2\2\u01ac\u01af\5T+\2\u01ad"+
		"\u01af\5V,\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afS\3\2\2\2\u01b0"+
		"\u01b1\7\'\2\2\u01b1\u01b2\7\7\2\2\u01b2\u01b5\5 \21\2\u01b3\u01b4\7-"+
		"\2\2\u01b4\u01b6\5 \21\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\7\b\2\2\u01b8\u01b9\5$\23\2\u01b9\u01ba\7\""+
		"\2\2\u01ba\u01bd\5$\23\2\u01bb\u01bc\7\t\2\2\u01bc\u01be\5$\23\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7("+
		"\2\2\u01c0U\3\2\2\2\u01c1\u01c2\7%\2\2\u01c2\u01c3\7\7\2\2\u01c3\u01c6"+
		"\5 \21\2\u01c4\u01c5\7-\2\2\u01c5\u01c7\5 \21\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\b\2\2\u01c9\u01ca\5$"+
		"\23\2\u01ca\u01cb\7\"\2\2\u01cb\u01cc\5$\23\2\u01cc\u01cd\7$\2\2\u01cd"+
		"\u01cf\5$\23\2\u01ce\u01d0\7+\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d2\7\t\2\2\u01d2\u01d4\5$\23\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7&"+
		"\2\2\u01d6W\3\2\2\2\u01d7\u01de\7:\2\2\u01d8\u01dd\7;\2\2\u01d9\u01dd"+
		"\7<\2\2\u01da\u01dd\5\\/\2\u01db\u01dd\5^\60\2\u01dc\u01d8\3\2\2\2\u01dc"+
		"\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e2\7:\2\2\u01e2Y\3\2\2\2\u01e3\u01e7\t\r\2\2\u01e4"+
		"\u01e6\t\16\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3"+
		"\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u01eb\7>\2\2\u01eb[\3\2\2\2\u01ec\u01f4\7\64\2\2\u01ed\u01ef\7\65\2\2"+
		"\u01ee\u01f0\5$\23\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f4\7&\2\2\u01f2\u01f4\78\2\2\u01f3\u01ec\3\2\2\2\u01f3"+
		"\u01ed\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4]\3\2\2\2\u01f5\u01fd\7\66\2\2"+
		"\u01f6\u01f8\7\67\2\2\u01f7\u01f9\5$\23\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd\7&\2\2\u01fb\u01fd\79\2\2\u01fc"+
		"\u01f5\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd_\3\2\2\2"+
		"Dhjrtz|\u008b\u008d\u0096\u0098\u00a2\u00a4\u00ae\u00b0\u00ba\u00bc\u00c6"+
		"\u00c8\u00d3\u00d5\u00e0\u00e2\u00e9\u00ed\u00f6\u00fa\u0104\u0107\u010d"+
		"\u0117\u0119\u0120\u0124\u012b\u0133\u013a\u0141\u0149\u014b\u015a\u0163"+
		"\u016c\u0170\u0174\u017b\u0184\u0188\u018f\u0193\u0197\u019f\u01a2\u01a6"+
		"\u01ae\u01b5\u01bd\u01c6\u01cf\u01d3\u01dc\u01de\u01e7\u01ef\u01f3\u01f8"+
		"\u01fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}