// Generated from /home/lu/Downloads/nginx_demo_v2_20201226_by_lyuqiang/nginx_demo/grammar/NginxParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USER=1, WORKER_PROCESSES=2, ERROR_LOG=3, WORKER_RLIMIT_NOFILE=4, DEFAULT_TYPE=5, 
		LOG_FORMAT=6, ACCESS_LOG=7, SERVER_NAMES_HASH_BUCKET_SIZE=8, SERVER_NAME_IN_REDIRECT=9, 
		CLIENT_HEADER_BUFFER_SIZE=10, LARGE_CLIENT_HEADER_BUFFERS=11, SENDFILE=12, 
		TCP_NOPUSH=13, KEEPALIVE_TIMEOUT=14, CLIENT_HEADER_TIMEOUT=15, CLIENT_BODY_TIMEOUT=16, 
		SEND_TIMEOUT=17, GZIP=18, GZIP_MIN_LENGTH=19, GZIP_BUFFERS=20, GZIP_HTTP_VERSION=21, 
		GZIP_COMP_LEVEL=22, GZIP_TYPES=23, GZIP_VARY=24, PROXY_REDIRECT=25, PROXY_SET_HEADER=26, 
		CLIENT_MAX_BODY_SIZE=27, CLIENT_BODY_BUFFER_SIZE=28, PROXY_CONNECT_TIMEOUT=29, 
		PROXY_SEND_TIMEOUT=30, PROXY_READ_TIMEOUT=31, PROXY_BUFFER_SIZE=32, PROXY_BUFFERS=33, 
		PROXY_BUSY_BUFFERS_SIZE=34, PROXY_TEMP_FILE_WRITE_SIZE=35, PROXY_NEXT_UPSTREAM=36, 
		PROXY_MAX_TEMP_FILE_SIZE=37, INDEX=38, SERVER=39, LOCATION=40, LEFT_OPENING_BRACE=41, 
		RIGTH_OPENING_BRACE=42, LOWER_STRING_WITH_UNDER_LINE=43, LOWER_STRING=44, 
		SPACE=45, STRING_WITH_OTHER=46, STRING=47, LOWER_ALPHABET=48, UPPER_ALPHABET=49, 
		ALPHABET=50, UNDER_LINE=51, NUMBER=52, SLASH=53, PLUS=54, MINUS=55, DOT=56, 
		EQUALS_SIGN=57, S1_DELIMITER=58, WS=59, SINGLE_QUOTATION_MARK=60, DOUBLE_QUOTATION_MARK=61, 
		NOTES=62, LINE_FEED=63, DOLLER=64, LEFT_BRACKET=65, RIGHT_BRACKET=66;
	public static final int
		RULE_input = 0, RULE_context = 1, RULE_context_name = 2, RULE_context_value = 3, 
		RULE_location = 4, RULE_location_left_field = 5, RULE_location_middle_field = 6, 
		RULE_location_right_field = 7, RULE_field_group = 8, RULE_fg_left = 9, 
		RULE_fg_right = 10, RULE_notes_string = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "context", "context_name", "context_value", "location", "location_left_field", 
			"location_middle_field", "location_right_field", "field_group", "fg_left", 
			"fg_right", "notes_string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'user'", "'worker_processes'", "'error_log'", "'worker_rlimit_nofile'", 
			"'default_type'", "'log_format'", "'access_log'", "'server_names_hash_bucket_size'", 
			"'server_name_in_redirect'", "'client_header_buffer_size'", "'large_client_header_buffers'", 
			"'sendfile'", "'tcp_nopush'", "'keepalive_timeout'", "'client_header_timeout'", 
			"'CLIENT_BODY_TIMEOUT'", "'SEND_TIMEOUT'", "'GZIP'", "'GZIP_MIN_LENGTH'", 
			"'gzip_buffers'", "'gzip_http_version'", "'gzip_comp_level'", "'gzip_types'", 
			"'gzip_vary'", "'proxy_redirect'", "'proxy_set_header'", "'client_max_body_size'", 
			"'client_body_buffer_size'", "'proxy_connect_timeout'", "'proxy_send_timeout'", 
			"'proxy_read_timeout'", "'proxy_buffer_size'", "'proxy_buffers'", "'proxy_busy_buffers_size'", 
			"'proxy_temp_file_write_size'", "'proxy_next_upstream'", "'proxy_max_temp_file_size'", 
			"'index'", "'server'", "'location'", "'{'", "'}'", null, null, "' '", 
			null, null, null, null, null, "'_'", null, "'/'", "'+'", "'-'", "'.'", 
			"'='", "';'", null, null, null, "'#'", null, "'$'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USER", "WORKER_PROCESSES", "ERROR_LOG", "WORKER_RLIMIT_NOFILE", 
			"DEFAULT_TYPE", "LOG_FORMAT", "ACCESS_LOG", "SERVER_NAMES_HASH_BUCKET_SIZE", 
			"SERVER_NAME_IN_REDIRECT", "CLIENT_HEADER_BUFFER_SIZE", "LARGE_CLIENT_HEADER_BUFFERS", 
			"SENDFILE", "TCP_NOPUSH", "KEEPALIVE_TIMEOUT", "CLIENT_HEADER_TIMEOUT", 
			"CLIENT_BODY_TIMEOUT", "SEND_TIMEOUT", "GZIP", "GZIP_MIN_LENGTH", "GZIP_BUFFERS", 
			"GZIP_HTTP_VERSION", "GZIP_COMP_LEVEL", "GZIP_TYPES", "GZIP_VARY", "PROXY_REDIRECT", 
			"PROXY_SET_HEADER", "CLIENT_MAX_BODY_SIZE", "CLIENT_BODY_BUFFER_SIZE", 
			"PROXY_CONNECT_TIMEOUT", "PROXY_SEND_TIMEOUT", "PROXY_READ_TIMEOUT", 
			"PROXY_BUFFER_SIZE", "PROXY_BUFFERS", "PROXY_BUSY_BUFFERS_SIZE", "PROXY_TEMP_FILE_WRITE_SIZE", 
			"PROXY_NEXT_UPSTREAM", "PROXY_MAX_TEMP_FILE_SIZE", "INDEX", "SERVER", 
			"LOCATION", "LEFT_OPENING_BRACE", "RIGTH_OPENING_BRACE", "LOWER_STRING_WITH_UNDER_LINE", 
			"LOWER_STRING", "SPACE", "STRING_WITH_OTHER", "STRING", "LOWER_ALPHABET", 
			"UPPER_ALPHABET", "ALPHABET", "UNDER_LINE", "NUMBER", "SLASH", "PLUS", 
			"MINUS", "DOT", "EQUALS_SIGN", "S1_DELIMITER", "WS", "SINGLE_QUOTATION_MARK", 
			"DOUBLE_QUOTATION_MARK", "NOTES", "LINE_FEED", "DOLLER", "LEFT_BRACKET", 
			"RIGHT_BRACKET"
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
	public String getGrammarFileName() { return "NginxParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NginxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public List<ContextContext> context() {
			return getRuleContexts(ContextContext.class);
		}
		public ContextContext context(int i) {
			return getRuleContext(ContextContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				context();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCATION) | (1L << LOWER_STRING) | (1L << SPACE) | (1L << NOTES))) != 0) );
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

	public static class ContextContext extends ParserRuleContext {
		public Context_nameContext context_name() {
			return getRuleContext(Context_nameContext.class,0);
		}
		public Context_valueContext context_value() {
			return getRuleContext(Context_valueContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NginxParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NginxParser.SPACE, i);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWER_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				context_name();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(30);
					match(SPACE);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				context_value();
				}
				break;
			case LOCATION:
			case SPACE:
			case NOTES:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				location();
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

	public static class Context_nameContext extends ParserRuleContext {
		public TerminalNode LOWER_STRING() { return getToken(NginxParser.LOWER_STRING, 0); }
		public Context_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterContext_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitContext_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitContext_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_nameContext context_name() throws RecognitionException {
		Context_nameContext _localctx = new Context_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_context_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LOWER_STRING);
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

	public static class Context_valueContext extends ParserRuleContext {
		public TerminalNode LEFT_OPENING_BRACE() { return getToken(NginxParser.LEFT_OPENING_BRACE, 0); }
		public List<TerminalNode> LINE_FEED() { return getTokens(NginxParser.LINE_FEED); }
		public TerminalNode LINE_FEED(int i) {
			return getToken(NginxParser.LINE_FEED, i);
		}
		public TerminalNode RIGTH_OPENING_BRACE() { return getToken(NginxParser.RIGTH_OPENING_BRACE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NginxParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NginxParser.SPACE, i);
		}
		public List<Field_groupContext> field_group() {
			return getRuleContexts(Field_groupContext.class);
		}
		public Field_groupContext field_group(int i) {
			return getRuleContext(Field_groupContext.class,i);
		}
		public List<ContextContext> context() {
			return getRuleContexts(ContextContext.class);
		}
		public ContextContext context(int i) {
			return getRuleContext(ContextContext.class,i);
		}
		public List<Notes_stringContext> notes_string() {
			return getRuleContexts(Notes_stringContext.class);
		}
		public Notes_stringContext notes_string(int i) {
			return getRuleContext(Notes_stringContext.class,i);
		}
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public Context_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterContext_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitContext_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitContext_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_valueContext context_value() throws RecognitionException {
		Context_valueContext _localctx = new Context_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_context_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(LEFT_OPENING_BRACE);
			setState(44);
			match(LINE_FEED);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCATION) | (1L << LOWER_STRING) | (1L << SPACE) | (1L << NOTES))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(45);
					match(SPACE);
					}
					break;
				case 2:
					{
					setState(46);
					field_group();
					}
					break;
				case 3:
					{
					setState(47);
					context();
					}
					break;
				case 4:
					{
					setState(48);
					notes_string();
					}
					break;
				case 5:
					{
					setState(50); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(49);
							location();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(52); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(RIGTH_OPENING_BRACE);
			setState(60);
			match(LINE_FEED);
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

	public static class LocationContext extends ParserRuleContext {
		public Token op;
		public Location_left_fieldContext location_left_field() {
			return getRuleContext(Location_left_fieldContext.class,0);
		}
		public Location_middle_fieldContext location_middle_field() {
			return getRuleContext(Location_middle_fieldContext.class,0);
		}
		public Location_right_fieldContext location_right_field() {
			return getRuleContext(Location_right_fieldContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(NginxParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NginxParser.SPACE, i);
		}
		public Field_groupContext field_group() {
			return getRuleContext(Field_groupContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_location);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				location_left_field();
				setState(63);
				((LocationContext)_localctx).op = match(SPACE);
				setState(64);
				location_middle_field();
				setState(65);
				((LocationContext)_localctx).op = match(SPACE);
				setState(66);
				location_right_field();
				}
				break;
			case SPACE:
			case NOTES:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				field_group();
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

	public static class Location_left_fieldContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(NginxParser.LOCATION, 0); }
		public Location_left_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_left_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterLocation_left_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitLocation_left_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitLocation_left_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_left_fieldContext location_left_field() throws RecognitionException {
		Location_left_fieldContext _localctx = new Location_left_fieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_location_left_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(LOCATION);
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

	public static class Location_middle_fieldContext extends ParserRuleContext {
		public TerminalNode STRING_WITH_OTHER() { return getToken(NginxParser.STRING_WITH_OTHER, 0); }
		public Location_middle_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_middle_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterLocation_middle_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitLocation_middle_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitLocation_middle_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_middle_fieldContext location_middle_field() throws RecognitionException {
		Location_middle_fieldContext _localctx = new Location_middle_fieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_location_middle_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING_WITH_OTHER);
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

	public static class Location_right_fieldContext extends ParserRuleContext {
		public TerminalNode LEFT_OPENING_BRACE() { return getToken(NginxParser.LEFT_OPENING_BRACE, 0); }
		public List<TerminalNode> LINE_FEED() { return getTokens(NginxParser.LINE_FEED); }
		public TerminalNode LINE_FEED(int i) {
			return getToken(NginxParser.LINE_FEED, i);
		}
		public TerminalNode RIGTH_OPENING_BRACE() { return getToken(NginxParser.RIGTH_OPENING_BRACE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(NginxParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NginxParser.SPACE, i);
		}
		public List<Field_groupContext> field_group() {
			return getRuleContexts(Field_groupContext.class);
		}
		public Field_groupContext field_group(int i) {
			return getRuleContext(Field_groupContext.class,i);
		}
		public List<Notes_stringContext> notes_string() {
			return getRuleContexts(Notes_stringContext.class);
		}
		public Notes_stringContext notes_string(int i) {
			return getRuleContext(Notes_stringContext.class,i);
		}
		public Location_right_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_right_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterLocation_right_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitLocation_right_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitLocation_right_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_right_fieldContext location_right_field() throws RecognitionException {
		Location_right_fieldContext _localctx = new Location_right_fieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location_right_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LEFT_OPENING_BRACE);
			setState(76);
			match(LINE_FEED);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==NOTES) {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(77);
					match(SPACE);
					}
					break;
				case 2:
					{
					setState(78);
					field_group();
					}
					break;
				case 3:
					{
					setState(79);
					notes_string();
					}
					break;
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(RIGTH_OPENING_BRACE);
			setState(86);
			match(LINE_FEED);
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

	public static class Field_groupContext extends ParserRuleContext {
		public Token op;
		public Fg_leftContext fg_left() {
			return getRuleContext(Fg_leftContext.class,0);
		}
		public TerminalNode S1_DELIMITER() { return getToken(NginxParser.S1_DELIMITER, 0); }
		public TerminalNode LINE_FEED() { return getToken(NginxParser.LINE_FEED, 0); }
		public List<Fg_rightContext> fg_right() {
			return getRuleContexts(Fg_rightContext.class);
		}
		public Fg_rightContext fg_right(int i) {
			return getRuleContext(Fg_rightContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(NginxParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NginxParser.SPACE, i);
		}
		public Notes_stringContext notes_string() {
			return getRuleContext(Notes_stringContext.class,0);
		}
		public Field_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterField_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitField_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitField_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_groupContext field_group() throws RecognitionException {
		Field_groupContext _localctx = new Field_groupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_group);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				fg_left();
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(89);
						((Field_groupContext)_localctx).op = match(SPACE);
						}
						}
						setState(92); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(94);
						fg_right();
						}
						}
						setState(97); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER_STRING_WITH_UNDER_LINE) | (1L << LOWER_STRING) | (1L << STRING_WITH_OTHER) | (1L << STRING) | (1L << SINGLE_QUOTATION_MARK))) != 0) );
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(103);
				match(S1_DELIMITER);
				setState(104);
				match(LINE_FEED);
				}
				break;
			case NOTES:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				notes_string();
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

	public static class Fg_leftContext extends ParserRuleContext {
		public Fg_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fg_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterFg_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitFg_left(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitFg_left(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fg_leftContext fg_left() throws RecognitionException {
		Fg_leftContext _localctx = new Fg_leftContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fg_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Fg_rightContext extends ParserRuleContext {
		public TerminalNode LOWER_STRING() { return getToken(NginxParser.LOWER_STRING, 0); }
		public TerminalNode LOWER_STRING_WITH_UNDER_LINE() { return getToken(NginxParser.LOWER_STRING_WITH_UNDER_LINE, 0); }
		public TerminalNode STRING() { return getToken(NginxParser.STRING, 0); }
		public List<TerminalNode> STRING_WITH_OTHER() { return getTokens(NginxParser.STRING_WITH_OTHER); }
		public TerminalNode STRING_WITH_OTHER(int i) {
			return getToken(NginxParser.STRING_WITH_OTHER, i);
		}
		public List<TerminalNode> SINGLE_QUOTATION_MARK() { return getTokens(NginxParser.SINGLE_QUOTATION_MARK); }
		public TerminalNode SINGLE_QUOTATION_MARK(int i) {
			return getToken(NginxParser.SINGLE_QUOTATION_MARK, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(NginxParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NginxParser.SPACE, i);
		}
		public Fg_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fg_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterFg_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitFg_right(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitFg_right(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fg_rightContext fg_right() throws RecognitionException {
		Fg_rightContext _localctx = new Fg_rightContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fg_right);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWER_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(LOWER_STRING);
				}
				break;
			case LOWER_STRING_WITH_UNDER_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(LOWER_STRING_WITH_UNDER_LINE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(STRING);
				}
				break;
			case STRING_WITH_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(STRING_WITH_OTHER);
				}
				break;
			case SINGLE_QUOTATION_MARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(SINGLE_QUOTATION_MARK);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					match(STRING_WITH_OTHER);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(117);
						match(SPACE);
						}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_WITH_OTHER );
				setState(127);
				match(SINGLE_QUOTATION_MARK);
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

	public static class Notes_stringContext extends ParserRuleContext {
		public TerminalNode NOTES() { return getToken(NginxParser.NOTES, 0); }
		public Field_groupContext field_group() {
			return getRuleContext(Field_groupContext.class,0);
		}
		public Notes_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).enterNotes_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxParserListener ) ((NginxParserListener)listener).exitNotes_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxParserVisitor ) return ((NginxParserVisitor<? extends T>)visitor).visitNotes_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Notes_stringContext notes_string() throws RecognitionException {
		Notes_stringContext _localctx = new Notes_stringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notes_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(NOTES);
			setState(131);
			field_group();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\7\3\"\n\3\f\3\16"+
		"\3%\13\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5"+
		"\65\n\5\r\5\16\5\66\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tS\n\t\f"+
		"\t\16\tV\13\t\3\t\3\t\3\t\3\n\3\n\6\n]\n\n\r\n\16\n^\3\n\6\nb\n\n\r\n"+
		"\16\nc\6\nf\n\n\r\n\16\ng\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\6\f~\n\f\r\f\16\f\177\3\f\5"+
		"\f\u0083\n\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2"+
		"\2\u0092\2\33\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\nG\3\2\2\2\fI\3"+
		"\2\2\2\16K\3\2\2\2\20M\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26\u0082\3\2\2"+
		"\2\30\u0084\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37#\5\6\4\2 \"\7/\2\2! \3\2\2\2\"%\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\5\b\5\2\'*\3\2\2\2("+
		"*\5\n\6\2)\37\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7.\2\2,\7\3\2\2\2-.\7+\2"+
		"\2.:\7A\2\2/9\7/\2\2\609\5\22\n\2\619\5\4\3\2\629\5\30\r\2\63\65\5\n\6"+
		"\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\2"+
		"8/\3\2\2\28\60\3\2\2\28\61\3\2\2\28\62\3\2\2\28\64\3\2\2\29<\3\2\2\2:"+
		"8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7,\2\2>?\7A\2\2?\t\3\2\2\2@"+
		"A\5\f\7\2AB\7/\2\2BC\5\16\b\2CD\7/\2\2DE\5\20\t\2EH\3\2\2\2FH\5\22\n\2"+
		"G@\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IJ\7*\2\2J\r\3\2\2\2KL\7\60\2\2L\17\3"+
		"\2\2\2MN\7+\2\2NT\7A\2\2OS\7/\2\2PS\5\22\n\2QS\5\30\r\2RO\3\2\2\2RP\3"+
		"\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7"+
		",\2\2XY\7A\2\2Y\21\3\2\2\2Ze\5\24\13\2[]\7/\2\2\\[\3\2\2\2]^\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\26\f\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2df\3\2\2\2e\\\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2"+
		"\2\2ij\7<\2\2jk\7A\2\2kn\3\2\2\2ln\5\30\r\2mZ\3\2\2\2ml\3\2\2\2n\23\3"+
		"\2\2\2op\3\2\2\2p\25\3\2\2\2q\u0083\7.\2\2r\u0083\7-\2\2s\u0083\7\61\2"+
		"\2t\u0083\7\60\2\2u}\7>\2\2vz\7\60\2\2wy\7/\2\2xw\3\2\2\2y|\3\2\2\2zx"+
		"\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}v\3\2\2\2~\177\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7>\2\2\u0082q\3"+
		"\2\2\2\u0082r\3\2\2\2\u0082s\3\2\2\2\u0082t\3\2\2\2\u0082u\3\2\2\2\u0083"+
		"\27\3\2\2\2\u0084\u0085\7@\2\2\u0085\u0086\5\22\n\2\u0086\31\3\2\2\2\22"+
		"\35#)\668:GRT^cgmz\177\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}