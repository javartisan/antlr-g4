// Generated from CreateTab.g4 by ANTLR 4.8

 package CreateTab ;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, PATH=12, WS=13;
	public static final int
		RULE_table = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"table"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'table'", "'('", "'primary'", "'key'", "','", "')'", 
			"'location'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"PATH", "WS"
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
	public String getGrammarFileName() { return "CreateTab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Interpreter  interp = new Interpreter();

	public CreateTabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TableContext extends ParserRuleContext {
		public Token tabName;
		public Token key;
		public Token type;
		public Token ID;
		public List<Token> columns = new ArrayList<Token>();
		public List<Token> types = new ArrayList<Token>();
		public Token path;
		public List<TerminalNode> ID() { return getTokens(CreateTabParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CreateTabParser.ID, i);
		}
		public TerminalNode PATH() { return getToken(CreateTabParser.PATH, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTabListener ) ((CreateTabListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTabListener ) ((CreateTabListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(T__1);
			setState(4);
			((TableContext)_localctx).tabName = match(ID);
			setState(5);
			match(T__2);
			setState(6);
			match(T__3);
			setState(7);
			match(T__4);
			setState(8);
			((TableContext)_localctx).key = match(ID);
			setState(9);
			((TableContext)_localctx).type = match(ID);
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				match(T__5);
				setState(11);
				((TableContext)_localctx).ID = match(ID);
				((TableContext)_localctx).columns.add(((TableContext)_localctx).ID);
				setState(12);
				((TableContext)_localctx).ID = match(ID);
				((TableContext)_localctx).types.add(((TableContext)_localctx).ID);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(17);
			match(T__6);
			setState(18);
			match(T__7);
			setState(19);
			match(T__8);
			setState(20);
			((TableContext)_localctx).path = match(PATH);
			setState(21);
			match(T__9);

			    interp.createTable((((TableContext)_localctx).tabName!=null?((TableContext)_localctx).tabName.getText():null),(((TableContext)_localctx).key!=null?((TableContext)_localctx).key.getText():null),((TableContext)_localctx).columns,((TableContext)_localctx).types,(((TableContext)_localctx).path!=null?((TableContext)_localctx).path.getText():null));

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\33\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\32\2\4\3\2\2\2\4\5\7\3\2\2\5"+
		"\6\7\4\2\2\6\7\7\r\2\2\7\b\7\5\2\2\b\t\7\6\2\2\t\n\7\7\2\2\n\13\7\r\2"+
		"\2\13\17\7\r\2\2\f\r\7\b\2\2\r\16\7\r\2\2\16\20\7\r\2\2\17\f\3\2\2\2\20"+
		"\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\t\2\2\24"+
		"\25\7\n\2\2\25\26\7\13\2\2\26\27\7\16\2\2\27\30\7\f\2\2\30\31\b\2\1\2"+
		"\31\3\3\2\2\2\3\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}