// Generated from Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_CURLY=1, R_CURLY=2, L_SQR=3, R_SQR=4, L_BRACE=5, R_BRACE=6, EQ=7, PLUS_EQ=8, 
		MIN_EQ=9, EXCL=10, PLUS=11, MIN=12, TIMES=13, DIV=14, MOD=15, LESS_OP=16, 
		MORE_OP=17, LESS_EQ_OP=18, MORE_EQ_OP=19, EQ_EQ=20, NOT_EQ=21, AND=22, 
		OR=23, COMMA=24, SEMI_COL=25, HEX=26, TRUE=27, FALSE=28, VOID=29, INT=30, 
		BOOL=31, CLASS=32, IF=33, ELSE=34, FOR=35, RETURN=36, BREAK=37, CONTINUE=38, 
		CALLOUT=39, ID=40, NUMBER=41, HEX_NUMBER=42, CHAR=43, STRING_LITERAL=44, 
		COMMENT=45, WS=46;
	public static final int
		RULE_program = 0, RULE_data_type = 1, RULE_literal = 2, RULE_int_literal = 3, 
		RULE_char_literal = 4, RULE_bool_literal = 5, RULE_var_decl = 6, RULE_expr = 7, 
		RULE_location = 8, RULE_method_name = 9, RULE_callout_arg = 10, RULE_bin_op = 11, 
		RULE_arith_op = 12, RULE_rel_op = 13, RULE_eq_op = 14, RULE_cond_op = 15, 
		RULE_method_call = 16, RULE_assign_op = 17, RULE_statement = 18, RULE_block = 19, 
		RULE_field_decl_args = 20, RULE_field_decl = 21, RULE_method_decl_args = 22, 
		RULE_method_decl = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "data_type", "literal", "int_literal", "char_literal", "bool_literal", 
			"var_decl", "expr", "location", "method_name", "callout_arg", "bin_op", 
			"arith_op", "rel_op", "eq_op", "cond_op", "method_call", "assign_op", 
			"statement", "block", "field_decl_args", "field_decl", "method_decl_args", 
			"method_decl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'+='", "'-='", 
			"'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'&&'", "'||'", "','", "';'", "'0x'", "'true'", "'false'", 
			"'void'", "'int'", "'boolean'", "'class'", "'if'", "'else'", "'for'", 
			"'return'", "'break'", "'continue'", "'callout'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_CURLY", "R_CURLY", "L_SQR", "R_SQR", "L_BRACE", "R_BRACE", "EQ", 
			"PLUS_EQ", "MIN_EQ", "EXCL", "PLUS", "MIN", "TIMES", "DIV", "MOD", "LESS_OP", 
			"MORE_OP", "LESS_EQ_OP", "MORE_EQ_OP", "EQ_EQ", "NOT_EQ", "AND", "OR", 
			"COMMA", "SEMI_COL", "HEX", "TRUE", "FALSE", "VOID", "INT", "BOOL", "CLASS", 
			"IF", "ELSE", "FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", "ID", 
			"NUMBER", "HEX_NUMBER", "CHAR", "STRING_LITERAL", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode L_CURLY() { return getToken(DecafParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(DecafParser.R_CURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CLASS);
			setState(49);
			match(ID);
			setState(50);
			match(L_CURLY);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					field_decl();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL))) != 0)) {
				{
				{
				setState(57);
				method_decl();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(R_CURLY);
			setState(64);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(DecafParser.BOOL, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOL) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				int_literal();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				char_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				bool_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DecafParser.NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(DecafParser.HEX_NUMBER, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==HEX_NUMBER) ) {
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CHAR);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DecafParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DecafParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			data_type();
			setState(80);
			match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				match(ID);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MIN() { return getToken(DecafParser.MIN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXCL() { return getToken(DecafParser.EXCL, 0); }
		public TerminalNode L_BRACE() { return getToken(DecafParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(DecafParser.R_BRACE, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89);
				location();
				}
				break;
			case 2:
				{
				setState(90);
				method_call();
				}
				break;
			case 3:
				{
				setState(91);
				literal();
				}
				break;
			case 4:
				{
				setState(92);
				match(MIN);
				setState(93);
				expr(3);
				}
				break;
			case 5:
				{
				setState(94);
				match(EXCL);
				setState(95);
				expr(2);
				}
				break;
			case 6:
				{
				setState(96);
				match(L_BRACE);
				setState(97);
				expr(0);
				setState(98);
				match(R_BRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(102);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(103);
					bin_op();
					setState(104);
					expr(5);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode L_SQR() { return getToken(DecafParser.L_SQR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_SQR() { return getToken(DecafParser.R_SQR, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_location);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(ID);
				setState(113);
				match(L_SQR);
				setState(114);
				expr(0);
				setState(115);
				match(R_SQR);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callout_arg);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
			case EXCL:
			case MIN:
			case TRUE:
			case FALSE:
			case CALLOUT:
			case ID:
			case NUMBER:
			case HEX_NUMBER:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				expr(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(STRING_LITERAL);
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

	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bin_op);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MIN:
			case TIMES:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				arith_op();
				}
				break;
			case LESS_OP:
			case MORE_OP:
			case LESS_EQ_OP:
			case MORE_EQ_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				rel_op();
				}
				break;
			case EQ_EQ:
			case NOT_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				eq_op();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				cond_op();
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

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DecafParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(DecafParser.MIN, 0); }
		public TerminalNode TIMES() { return getToken(DecafParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DecafParser.MOD, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << TIMES) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode LESS_OP() { return getToken(DecafParser.LESS_OP, 0); }
		public TerminalNode MORE_OP() { return getToken(DecafParser.MORE_OP, 0); }
		public TerminalNode LESS_EQ_OP() { return getToken(DecafParser.LESS_EQ_OP, 0); }
		public TerminalNode MORE_EQ_OP() { return getToken(DecafParser.MORE_EQ_OP, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_OP) | (1L << MORE_OP) | (1L << LESS_EQ_OP) | (1L << MORE_EQ_OP))) != 0)) ) {
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQ_EQ() { return getToken(DecafParser.EQ_EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(DecafParser.NOT_EQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==EQ_EQ || _la==NOT_EQ) ) {
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecafParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cond_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(AND);
			setState(138);
			match(OR);
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

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(DecafParser.L_BRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(DecafParser.R_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_call);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				method_name();
				setState(141);
				match(L_BRACE);
				setState(142);
				expr(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					expr(0);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(R_BRACE);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(CALLOUT);
				setState(153);
				match(L_BRACE);
				setState(154);
				match(STRING_LITERAL);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(155);
					match(COMMA);
					setState(156);
					callout_arg();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(R_BRACE);
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public TerminalNode PLUS_EQ() { return getToken(DecafParser.PLUS_EQ, 0); }
		public TerminalNode MIN_EQ() { return getToken(DecafParser.MIN_EQ, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUS_EQ) | (1L << MIN_EQ))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMI_COL() { return getToken(DecafParser.SEMI_COL, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode L_BRACE() { return getToken(DecafParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(DecafParser.R_BRACE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				location();
				setState(168);
				assign_op();
				setState(169);
				expr(0);
				setState(170);
				match(SEMI_COL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				method_call();
				setState(173);
				match(SEMI_COL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(IF);
				setState(176);
				match(L_BRACE);
				setState(177);
				expr(0);
				setState(178);
				match(R_BRACE);
				setState(179);
				block();
				setState(180);
				match(ELSE);
				setState(181);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(FOR);
				setState(184);
				match(ID);
				setState(185);
				match(EQ);
				setState(186);
				expr(0);
				setState(187);
				match(COMMA);
				setState(188);
				expr(0);
				setState(189);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(RETURN);
				setState(192);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				match(BREAK);
				setState(194);
				match(SEMI_COL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				match(CONTINUE);
				setState(196);
				match(SEMI_COL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(DecafParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(DecafParser.R_CURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(L_CURLY);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOL) {
				{
				{
				setState(201);
				var_decl();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_CURLY) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << ID))) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(R_CURLY);
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

	public static class Field_decl_argsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode L_SQR() { return getToken(DecafParser.L_SQR, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode R_SQR() { return getToken(DecafParser.R_SQR, 0); }
		public Field_decl_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl_args(this);
		}
	}

	public final Field_decl_argsContext field_decl_args() throws RecognitionException {
		Field_decl_argsContext _localctx = new Field_decl_argsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field_decl_args);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ID);
				setState(217);
				match(L_SQR);
				setState(218);
				int_literal();
				setState(219);
				match(R_SQR);
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

	public static class Field_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Field_decl_argsContext> field_decl_args() {
			return getRuleContexts(Field_decl_argsContext.class);
		}
		public Field_decl_argsContext field_decl_args(int i) {
			return getRuleContext(Field_decl_argsContext.class,i);
		}
		public TerminalNode SEMI_COL() { return getToken(DecafParser.SEMI_COL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			data_type();
			setState(224);
			field_decl_args();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225);
				match(COMMA);
				setState(226);
				field_decl_args();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(SEMI_COL);
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

	public static class Method_decl_argsContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_decl_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decl_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decl_args(this);
		}
	}

	public final Method_decl_argsContext method_decl_args() throws RecognitionException {
		Method_decl_argsContext _localctx = new Method_decl_argsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_decl_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			data_type();
			setState(235);
			match(ID);
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

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode L_BRACE() { return getToken(DecafParser.L_BRACE, 0); }
		public List<Method_decl_argsContext> method_decl_args() {
			return getRuleContexts(Method_decl_argsContext.class);
		}
		public Method_decl_argsContext method_decl_args(int i) {
			return getRuleContext(Method_decl_argsContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(DecafParser.R_BRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				{
				setState(237);
				data_type();
				}
				break;
			case VOID:
				{
				setState(238);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
			match(ID);
			setState(242);
			match(L_BRACE);
			setState(243);
			method_decl_args();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				method_decl_args();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(R_BRACE);
			setState(252);
			block();
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0101\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tg\n\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\nx\n\n\3\13\3\13\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3\r"+
		"\5\r\u0084\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0094\n\22\f\22\16\22\u0097\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00a0\n\22\f\22\16\22\u00a3\13\22\3\22\5\22"+
		"\u00a6\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c9\n\24\3\25\3\25\7\25\u00cd"+
		"\n\25\f\25\16\25\u00d0\13\25\3\25\7\25\u00d3\n\25\f\25\16\25\u00d6\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e0\n\26\3\27\3\27"+
		"\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9\13\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\5\31\u00f2\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u00f9\n"+
		"\31\f\31\16\31\u00fc\13\31\3\31\3\31\3\31\3\31\2\3\20\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\3\2 !\3\2+,\3\2\35\36\3\2\r\21"+
		"\3\2\22\25\3\2\26\27\3\2\t\13\2\u0108\2\62\3\2\2\2\4D\3\2\2\2\6I\3\2\2"+
		"\2\bK\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16Q\3\2\2\2\20f\3\2\2\2\22w\3\2\2"+
		"\2\24y\3\2\2\2\26}\3\2\2\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34\u0087"+
		"\3\2\2\2\36\u0089\3\2\2\2 \u008b\3\2\2\2\"\u00a5\3\2\2\2$\u00a7\3\2\2"+
		"\2&\u00c8\3\2\2\2(\u00ca\3\2\2\2*\u00df\3\2\2\2,\u00e1\3\2\2\2.\u00ec"+
		"\3\2\2\2\60\u00f1\3\2\2\2\62\63\7\"\2\2\63\64\7*\2\2\648\7\3\2\2\65\67"+
		"\5,\27\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3"+
		"\2\2\2;=\5\60\31\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@"+
		">\3\2\2\2AB\7\4\2\2BC\7\2\2\3C\3\3\2\2\2DE\t\2\2\2E\5\3\2\2\2FJ\5\b\5"+
		"\2GJ\5\n\6\2HJ\5\f\7\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\7\3\2\2\2KL\t\3"+
		"\2\2L\t\3\2\2\2MN\7-\2\2N\13\3\2\2\2OP\t\4\2\2P\r\3\2\2\2QR\5\4\3\2RW"+
		"\7*\2\2ST\7\32\2\2TV\7*\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\17"+
		"\3\2\2\2YW\3\2\2\2Z[\b\t\1\2[g\5\22\n\2\\g\5\"\22\2]g\5\6\4\2^_\7\16\2"+
		"\2_g\5\20\t\5`a\7\f\2\2ag\5\20\t\4bc\7\7\2\2cd\5\20\t\2de\7\b\2\2eg\3"+
		"\2\2\2fZ\3\2\2\2f\\\3\2\2\2f]\3\2\2\2f^\3\2\2\2f`\3\2\2\2fb\3\2\2\2gn"+
		"\3\2\2\2hi\f\6\2\2ij\5\30\r\2jk\5\20\t\7km\3\2\2\2lh\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2no\3\2\2\2o\21\3\2\2\2pn\3\2\2\2qx\7*\2\2rs\7*\2\2st\7\5\2\2"+
		"tu\5\20\t\2uv\7\6\2\2vx\3\2\2\2wq\3\2\2\2wr\3\2\2\2x\23\3\2\2\2yz\7*\2"+
		"\2z\25\3\2\2\2{~\5\20\t\2|~\7.\2\2}{\3\2\2\2}|\3\2\2\2~\27\3\2\2\2\177"+
		"\u0084\5\32\16\2\u0080\u0084\5\34\17\2\u0081\u0084\5\36\20\2\u0082\u0084"+
		"\5 \21\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\31\3\2\2\2\u0085\u0086\t\5\2\2\u0086\33\3\2\2\2\u0087"+
		"\u0088\t\6\2\2\u0088\35\3\2\2\2\u0089\u008a\t\7\2\2\u008a\37\3\2\2\2\u008b"+
		"\u008c\7\30\2\2\u008c\u008d\7\31\2\2\u008d!\3\2\2\2\u008e\u008f\5\24\13"+
		"\2\u008f\u0090\7\7\2\2\u0090\u0095\5\20\t\2\u0091\u0092\7\32\2\2\u0092"+
		"\u0094\5\20\t\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7\b\2\2\u0099\u00a6\3\2\2\2\u009a\u009b\7)\2\2\u009b\u009c\7\7"+
		"\2\2\u009c\u00a1\7.\2\2\u009d\u009e\7\32\2\2\u009e\u00a0\5\26\f\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7\b\2\2\u00a5"+
		"\u008e\3\2\2\2\u00a5\u009a\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a8\t\b\2\2"+
		"\u00a8%\3\2\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\5$\23\2\u00ab\u00ac\5"+
		"\20\t\2\u00ac\u00ad\7\33\2\2\u00ad\u00c9\3\2\2\2\u00ae\u00af\5\"\22\2"+
		"\u00af\u00b0\7\33\2\2\u00b0\u00c9\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3"+
		"\7\7\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5(\25\2"+
		"\u00b6\u00b7\7$\2\2\u00b7\u00b8\5(\25\2\u00b8\u00c9\3\2\2\2\u00b9\u00ba"+
		"\7%\2\2\u00ba\u00bb\7*\2\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd\5\20\t\2\u00bd"+
		"\u00be\7\32\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\5(\25\2\u00c0\u00c9\3"+
		"\2\2\2\u00c1\u00c2\7&\2\2\u00c2\u00c9\5\20\t\2\u00c3\u00c4\7\'\2\2\u00c4"+
		"\u00c9\7\33\2\2\u00c5\u00c6\7(\2\2\u00c6\u00c9\7\33\2\2\u00c7\u00c9\5"+
		"(\25\2\u00c8\u00a9\3\2\2\2\u00c8\u00ae\3\2\2\2\u00c8\u00b1\3\2\2\2\u00c8"+
		"\u00b9\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c5\3\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\'\3\2\2\2\u00ca\u00ce\7\3\2\2\u00cb\u00cd"+
		"\5\16\b\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3"+
		"\5&\24\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\4"+
		"\2\2\u00d8)\3\2\2\2\u00d9\u00e0\7*\2\2\u00da\u00db\7*\2\2\u00db\u00dc"+
		"\7\5\2\2\u00dc\u00dd\5\b\5\2\u00dd\u00de\7\6\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00e0+\3\2\2\2\u00e1\u00e2\5\4\3\2"+
		"\u00e2\u00e7\5*\26\2\u00e3\u00e4\7\32\2\2\u00e4\u00e6\5*\26\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\33\2\2\u00eb-\3\2\2\2"+
		"\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7*\2\2\u00ee/\3\2\2\2\u00ef\u00f2\5\4"+
		"\3\2\u00f0\u00f2\7\37\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4\u00f5\7\7\2\2\u00f5\u00fa\5.\30"+
		"\2\u00f6\u00f7\7\32\2\2\u00f7\u00f9\5.\30\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\b\2\2\u00fe\u00ff\5(\25\2\u00ff"+
		"\61\3\2\2\2\258>IWfnw}\u0083\u0095\u00a1\u00a5\u00c8\u00ce\u00d4\u00df"+
		"\u00e7\u00f1\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}