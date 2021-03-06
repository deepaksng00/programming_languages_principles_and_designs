// Generated from Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"L_CURLY", "R_CURLY", "L_SQR", "R_SQR", "L_BRACE", "R_BRACE", "EQ", "PLUS_EQ", 
			"MIN_EQ", "EXCL", "PLUS", "MIN", "TIMES", "DIV", "MOD", "LESS_OP", "MORE_OP", 
			"LESS_EQ_OP", "MORE_EQ_OP", "EQ_EQ", "NOT_EQ", "AND", "OR", "COMMA", 
			"SEMI_COL", "HEX", "TRUE", "FALSE", "VOID", "INT", "BOOL", "CLASS", "IF", 
			"ELSE", "FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", "ALPHA", "DIGIT", 
			"ALPHA_NUM", "ID", "NUMBER", "HEX_NUMBER", "GOOD_CHARS", "DOUBLE_CHARS", 
			"CHAR", "STRING_LITERAL", "COMMENT", "WS"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0135\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3*\3*\3+\3+\5+\u00f9\n+\3,\3,\7,\u00fd\n,\f,\16,\u0100"+
		"\13,\3-\3-\7-\u0104\n-\f-\16-\u0107\13-\3.\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\5\61\u0114\n\61\3\61\3\61\3\62\3\62\3\62\7\62\u011b\n"+
		"\62\f\62\16\62\u011e\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0126\n"+
		"\63\f\63\16\63\u0129\13\63\3\63\3\63\3\63\3\63\3\64\6\64\u0130\n\64\r"+
		"\64\16\64\u0131\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U\2W*Y+[,"+
		"]\2_\2a-c.e/g\60\3\2\t\5\2C\\aac|\3\2\62;\4\2CHch\3\2\"\u0080\6\2$$))"+
		"^^pp\3\2\f\f\5\2\13\f\17\17\"\"\2\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13"+
		"q\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23z\3\2\2\2\25}\3\2\2\2\27"+
		"\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087"+
		"\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u0090\3\2\2\2"+
		")\u0093\3\2\2\2+\u0096\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61\u009f"+
		"\3\2\2\2\63\u00a1\3\2\2\2\65\u00a3\3\2\2\2\67\u00a6\3\2\2\29\u00ab\3\2"+
		"\2\2;\u00b1\3\2\2\2=\u00b6\3\2\2\2?\u00ba\3\2\2\2A\u00c2\3\2\2\2C\u00c8"+
		"\3\2\2\2E\u00cb\3\2\2\2G\u00d0\3\2\2\2I\u00d4\3\2\2\2K\u00db\3\2\2\2M"+
		"\u00e1\3\2\2\2O\u00ea\3\2\2\2Q\u00f2\3\2\2\2S\u00f4\3\2\2\2U\u00f8\3\2"+
		"\2\2W\u00fa\3\2\2\2Y\u0101\3\2\2\2[\u0108\3\2\2\2]\u010b\3\2\2\2_\u010d"+
		"\3\2\2\2a\u0110\3\2\2\2c\u0117\3\2\2\2e\u0121\3\2\2\2g\u012f\3\2\2\2i"+
		"j\7}\2\2j\4\3\2\2\2kl\7\177\2\2l\6\3\2\2\2mn\7]\2\2n\b\3\2\2\2op\7_\2"+
		"\2p\n\3\2\2\2qr\7*\2\2r\f\3\2\2\2st\7+\2\2t\16\3\2\2\2uv\7?\2\2v\20\3"+
		"\2\2\2wx\7-\2\2xy\7?\2\2y\22\3\2\2\2z{\7/\2\2{|\7?\2\2|\24\3\2\2\2}~\7"+
		"#\2\2~\26\3\2\2\2\177\u0080\7-\2\2\u0080\30\3\2\2\2\u0081\u0082\7/\2\2"+
		"\u0082\32\3\2\2\2\u0083\u0084\7,\2\2\u0084\34\3\2\2\2\u0085\u0086\7\61"+
		"\2\2\u0086\36\3\2\2\2\u0087\u0088\7\'\2\2\u0088 \3\2\2\2\u0089\u008a\7"+
		">\2\2\u008a\"\3\2\2\2\u008b\u008c\7@\2\2\u008c$\3\2\2\2\u008d\u008e\7"+
		">\2\2\u008e\u008f\7?\2\2\u008f&\3\2\2\2\u0090\u0091\7@\2\2\u0091\u0092"+
		"\7?\2\2\u0092(\3\2\2\2\u0093\u0094\7?\2\2\u0094\u0095\7?\2\2\u0095*\3"+
		"\2\2\2\u0096\u0097\7#\2\2\u0097\u0098\7?\2\2\u0098,\3\2\2\2\u0099\u009a"+
		"\7(\2\2\u009a\u009b\7(\2\2\u009b.\3\2\2\2\u009c\u009d\7~\2\2\u009d\u009e"+
		"\7~\2\2\u009e\60\3\2\2\2\u009f\u00a0\7.\2\2\u00a0\62\3\2\2\2\u00a1\u00a2"+
		"\7=\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7\62\2\2\u00a4\u00a5\7z\2\2\u00a5"+
		"\66\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0:\3\2\2\2\u00b1"+
		"\u00b2\7x\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2"+
		"\u00b5<\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2"+
		"\2\u00b9>\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7"+
		"q\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7u\2\2\u00c7B\3\2\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7h\2\2\u00caD\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cfF\3\2\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3H\3\2\2\2\u00d4\u00d5"+
		"\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7p\2\2\u00daJ\3\2\2\2\u00db\u00dc\7d\2\2\u00dc"+
		"\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7m\2\2"+
		"\u00e0L\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2"+
		"\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7g\2\2\u00e9N\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7q\2\2\u00ef"+
		"\u00f0\7w\2\2\u00f0\u00f1\7v\2\2\u00f1P\3\2\2\2\u00f2\u00f3\t\2\2\2\u00f3"+
		"R\3\2\2\2\u00f4\u00f5\t\3\2\2\u00f5T\3\2\2\2\u00f6\u00f9\5Q)\2\u00f7\u00f9"+
		"\5S*\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9V\3\2\2\2\u00fa\u00fe"+
		"\5Q)\2\u00fb\u00fd\5U+\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffX\3\2\2\2\u0100\u00fe\3\2\2\2"+
		"\u0101\u0105\5S*\2\u0102\u0104\5S*\2\u0103\u0102\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106Z\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u0109\5S*\2\u0109\u010a\t\4\2\2\u010a\\\3\2\2\2\u010b\u010c"+
		"\t\5\2\2\u010c^\3\2\2\2\u010d\u010e\7^\2\2\u010e\u010f\t\6\2\2\u010f`"+
		"\3\2\2\2\u0110\u0113\7)\2\2\u0111\u0114\5]/\2\u0112\u0114\5_\60\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7)"+
		"\2\2\u0116b\3\2\2\2\u0117\u011c\7$\2\2\u0118\u011b\5]/\2\u0119\u011b\5"+
		"_\60\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0120\7$\2\2\u0120d\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123"+
		"\7\61\2\2\u0123\u0127\3\2\2\2\u0124\u0126\n\7\2\2\u0125\u0124\3\2\2\2"+
		"\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\f\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\b\63\2\2\u012df\3\2\2\2\u012e\u0130\t\b\2\2\u012f\u012e\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\b\64\2\2\u0134h\3\2\2\2\13\2\u00f8\u00fe\u0105\u0113"+
		"\u011a\u011c\u0127\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}