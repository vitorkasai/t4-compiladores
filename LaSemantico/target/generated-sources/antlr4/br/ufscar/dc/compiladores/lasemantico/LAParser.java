// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.lasemantico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ALGORITMO=2, FIM_ALGORITMO=3, REGISTRO=4, FIM_REGISTRO=5, FALSO=6, 
		VERDADEIRO=7, NAO=8, FACA=9, FUNCAO=10, FIM_FUNCAO=11, PROCEDIMENTO=12, 
		FIM_PROCEDIMENTO=13, RETORNE=14, LEIA=15, ESCREVA=16, DECLARE=17, TIPO=18, 
		LITERAL=19, VAR=20, LOGICO=21, INTEIRO=22, CONSTANTE=23, REAL=24, SE=25, 
		SENAO=26, FIM_SE=27, ENTAO=28, CASO=29, FIM_CASO=30, PARA=31, FIM_PARA=32, 
		ATE=33, SEJA=34, ENQUANTO=35, FIM_ENQUANTO=36, E=37, OU=38, IGUAL=39, 
		DIFERENTE=40, ATRIBUICAO=41, MENOR=42, MAIOR=43, MENOR_IGUAL=44, MAIOR_IGUAL=45, 
		SOMA=46, MOD=47, SUBTRACAO=48, DIVISAO=49, MULTIPLICACAO=50, ENDERECO=51, 
		PONT=52, NUM_INT=53, NUM_REAL=54, IDENT=55, CADEIA=56, CADEIA_NAO_FECHADA=57, 
		PONTO=58, INTERVALO=59, DOIS_PONTOS=60, ABREPAR=61, FECHAPAR=62, VIRGULA=63, 
		ABRECOL=64, FECHACOL=65, COMENTARIO=66, COMENTARIO_NAO_FECHADO=67, WS=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_declaracao_constante = 4, RULE_declaracao_tipo = 5, RULE_declaracao_variavel = 6, 
		RULE_variavel = 7, RULE_identificador = 8, RULE_dimensao = 9, RULE_tipo = 10, 
		RULE_tipo_basico = 11, RULE_tipo_basico_ident = 12, RULE_tipo_estendido = 13, 
		RULE_valor_constante = 14, RULE_registro = 15, RULE_declaracao_global = 16, 
		RULE_parametro = 17, RULE_parametros = 18, RULE_corpo = 19, RULE_cmd = 20, 
		RULE_cmdLeia = 21, RULE_cmdEscreva = 22, RULE_cmdSe = 23, RULE_cmdCaso = 24, 
		RULE_cmdPara = 25, RULE_cmdEnquanto = 26, RULE_cmdFaca = 27, RULE_cmdAtribuicao = 28, 
		RULE_cmdChamada = 29, RULE_cmdRetorne = 30, RULE_selecao = 31, RULE_item_selecao = 32, 
		RULE_constantes = 33, RULE_numero_intervalo = 34, RULE_op_unario = 35, 
		RULE_exp_aritmetica = 36, RULE_termo = 37, RULE_fator = 38, RULE_op1 = 39, 
		RULE_op2 = 40, RULE_op3 = 41, RULE_parcela = 42, RULE_parcela_unario = 43, 
		RULE_parcela_nao_unario = 44, RULE_exp_relacional = 45, RULE_op_relacional = 46, 
		RULE_expressao = 47, RULE_termo_logico = 48, RULE_fator_logico = 49, RULE_parcela_logica = 50, 
		RULE_op_logico_1 = 51, RULE_op_logico_2 = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "declaracao_constante", 
			"declaracao_tipo", "declaracao_variavel", "variavel", "identificador", 
			"dimensao", "tipo", "tipo_basico", "tipo_basico_ident", "tipo_estendido", 
			"valor_constante", "registro", "declaracao_global", "parametro", "parametros", 
			"corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", "cmdCaso", "cmdPara", 
			"cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", "cmdRetorne", 
			"selecao", "item_selecao", "constantes", "numero_intervalo", "op_unario", 
			"exp_aritmetica", "termo", "fator", "op1", "op2", "op3", "parcela", "parcela_unario", 
			"parcela_nao_unario", "exp_relacional", "op_relacional", "expressao", 
			"termo_logico", "fator_logico", "parcela_logica", "op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'. .'", "'algoritmo'", "'fim_algoritmo'", "'registro'", "'fim_registro'", 
			"'falso'", "'verdadeiro'", "'nao'", "'faca'", "'funcao'", "'fim_funcao'", 
			"'procedimento'", "'fim_procedimento'", "'retorne'", "'leia'", "'escreva'", 
			"'declare'", "'tipo'", "'literal'", "'var'", "'logico'", "'inteiro'", 
			"'constante'", "'real'", "'se'", "'senao'", "'fim_se'", "'entao'", "'caso'", 
			"'fim_caso'", "'para'", "'fim_para'", "'ate'", "'seja'", "'enquanto'", 
			"'fim_enquanto'", "'e'", "'ou'", "'='", "'<>'", "'<-'", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'%'", "'-'", "'/'", "'*'", "'&'", "'^'", null, 
			null, null, null, null, "'.'", "'..'", "':'", "'('", "')'", "','", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ALGORITMO", "FIM_ALGORITMO", "REGISTRO", "FIM_REGISTRO", 
			"FALSO", "VERDADEIRO", "NAO", "FACA", "FUNCAO", "FIM_FUNCAO", "PROCEDIMENTO", 
			"FIM_PROCEDIMENTO", "RETORNE", "LEIA", "ESCREVA", "DECLARE", "TIPO", 
			"LITERAL", "VAR", "LOGICO", "INTEIRO", "CONSTANTE", "REAL", "SE", "SENAO", 
			"FIM_SE", "ENTAO", "CASO", "FIM_CASO", "PARA", "FIM_PARA", "ATE", "SEJA", 
			"ENQUANTO", "FIM_ENQUANTO", "E", "OU", "IGUAL", "DIFERENTE", "ATRIBUICAO", 
			"MENOR", "MAIOR", "MENOR_IGUAL", "MAIOR_IGUAL", "SOMA", "MOD", "SUBTRACAO", 
			"DIVISAO", "MULTIPLICACAO", "ENDERECO", "PONT", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_NAO_FECHADA", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABREPAR", "FECHAPAR", "VIRGULA", "ABRECOL", "FECHACOL", "COMENTARIO", 
			"COMENTARIO_NAO_FECHADO", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(LAParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(LAParser.FIM_ALGORITMO, 0); }
		public TerminalNode EOF() { return getToken(LAParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			declaracoes();
			setState(107);
			match(ALGORITMO);
			setState(108);
			corpo();
			setState(109);
			match(FIM_ALGORITMO);
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8786944L) != 0) {
				{
				{
				setState(112);
				decl_local_global();
				}
				}
				setState(117);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case TIPO:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				declaracao_local();
				}
				break;
			case FUNCAO:
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				declaracao_global();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public Declaracao_constanteContext declaracao_constante() {
			return getRuleContext(Declaracao_constanteContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				declaracao_variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				declaracao_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				declaracao_tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_constanteContext extends ParserRuleContext {
		public TerminalNode CONSTANTE() { return getToken(LAParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LAParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public Declaracao_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_constanteContext declaracao_constante() throws RecognitionException {
		Declaracao_constanteContext _localctx = new Declaracao_constanteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CONSTANTE);
			setState(128);
			match(IDENT);
			setState(129);
			match(DOIS_PONTOS);
			setState(130);
			tipo_basico();
			setState(131);
			match(IGUAL);
			setState(132);
			valor_constante();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_tipoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(LAParser.TIPO, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_tipoContext declaracao_tipo() throws RecognitionException {
		Declaracao_tipoContext _localctx = new Declaracao_tipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TIPO);
			setState(135);
			match(IDENT);
			setState(136);
			match(DOIS_PONTOS);
			setState(137);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_variavelContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(LAParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DECLARE);
			setState(140);
			variavel();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			identificador();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(143);
				match(VIRGULA);
				setState(144);
				identificador();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(DOIS_PONTOS);
			setState(151);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(LAParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(LAParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IDENT);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(154);
				match(PONTO);
				setState(155);
				match(IDENT);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			dimensao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> ABRECOL() { return getTokens(LAParser.ABRECOL); }
		public TerminalNode ABRECOL(int i) {
			return getToken(LAParser.ABRECOL, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHACOL() { return getTokens(LAParser.FECHACOL); }
		public TerminalNode FECHACOL(int i) {
			return getToken(LAParser.FECHACOL, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRECOL) {
				{
				{
				setState(163);
				match(ABRECOL);
				setState(164);
				exp_aritmetica();
				setState(165);
				match(FECHACOL);
				}
				}
				setState(171);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				registro();
				}
				break;
			case LITERAL:
			case LOGICO:
			case INTEIRO:
			case REAL:
			case PONT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(LAParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(LAParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 23592960L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_basico_ident);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case LOGICO:
			case INTEIRO:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode PONT() { return getToken(LAParser.PONT, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONT) {
				{
				setState(182);
				match(PONT);
				}
			}

			setState(185);
			tipo_basico_ident();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LAParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 99079191802151104L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(LAParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(LAParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(REGISTRO);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(190);
				variavel();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(FIM_REGISTRO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(LAParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LAParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(LAParser.FECHAPAR, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LAParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(LAParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(LAParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracao_global);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(PROCEDIMENTO);
				setState(199);
				match(IDENT);
				setState(200);
				match(ABREPAR);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(201);
					parametros();
					}
				}

				setState(204);
				match(FECHAPAR);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8781824L) != 0) {
					{
					{
					setState(205);
					declaracao_local();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
					{
					{
					setState(211);
					cmd();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(FUNCAO);
				setState(219);
				match(IDENT);
				setState(220);
				match(ABREPAR);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(221);
					parametros();
					}
				}

				setState(224);
				match(FECHAPAR);
				setState(225);
				match(DOIS_PONTOS);
				setState(226);
				tipo_estendido();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8781824L) != 0) {
					{
					{
					setState(227);
					declaracao_local();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
					{
					{
					setState(233);
					cmd();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(FIM_FUNCAO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(LAParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(243);
				match(VAR);
				}
			}

			setState(246);
			identificador();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(247);
				match(VIRGULA);
				setState(248);
				identificador();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(DOIS_PONTOS);
			setState(255);
			tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			parametro();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(258);
				match(VIRGULA);
				setState(259);
				parametro();
				}
				}
				setState(264);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8781824L) != 0) {
				{
				{
				setState(265);
				declaracao_local();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
				{
				{
				setState(271);
				cmd();
				}
				}
				setState(276);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(285);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(286);
				cmdRetorne();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(LAParser.LEIA, 0); }
		public TerminalNode ABREPAR() { return getToken(LAParser.ABREPAR, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LAParser.FECHAPAR, 0); }
		public List<TerminalNode> PONT() { return getTokens(LAParser.PONT); }
		public TerminalNode PONT(int i) {
			return getToken(LAParser.PONT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LEIA);
			setState(290);
			match(ABREPAR);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONT) {
				{
				setState(291);
				match(PONT);
				}
			}

			setState(294);
			identificador();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(295);
				match(VIRGULA);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONT) {
					{
					setState(296);
					match(PONT);
					}
				}

				setState(299);
				identificador();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(LAParser.ESCREVA, 0); }
		public TerminalNode ABREPAR() { return getToken(LAParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LAParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ESCREVA);
			setState(308);
			match(ABREPAR);
			setState(309);
			expressao();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(310);
				match(VIRGULA);
				setState(311);
				expressao();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LAParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(LAParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(LAParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(LAParser.SENAO, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(SE);
			setState(320);
			expressao();
			setState(321);
			match(ENTAO);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
				{
				{
				setState(322);
				cmd();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(328);
				match(SENAO);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
					{
					{
					setState(329);
					cmd();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			match(FIM_SE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(LAParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(LAParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(LAParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(LAParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(CASO);
			setState(340);
			exp_aritmetica();
			setState(341);
			match(SEJA);
			setState(342);
			selecao();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(343);
				match(SENAO);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
					{
					{
					setState(344);
					cmd();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
			match(FIM_CASO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LAParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(LAParser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(LAParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(LAParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(LAParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(PARA);
			setState(355);
			match(IDENT);
			setState(356);
			match(ATRIBUICAO);
			setState(357);
			exp_aritmetica();
			setState(358);
			match(ATE);
			setState(359);
			exp_aritmetica();
			setState(360);
			match(FACA);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
				{
				{
				setState(361);
				cmd();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(FIM_PARA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(LAParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(LAParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(LAParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ENQUANTO);
			setState(370);
			expressao();
			setState(371);
			match(FACA);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
				{
				{
				setState(372);
				cmd();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(FIM_ENQUANTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(LAParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(LAParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(FACA);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
				{
				{
				setState(381);
				cmd();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(ATE);
			setState(388);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(LAParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONT() { return getToken(LAParser.PONT, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONT) {
				{
				setState(390);
				match(PONT);
				}
			}

			setState(393);
			identificador();
			setState(394);
			match(ATRIBUICAO);
			setState(395);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LAParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LAParser.FECHAPAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(IDENT);
			setState(398);
			match(ABREPAR);
			setState(399);
			expressao();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(400);
				match(VIRGULA);
				setState(401);
				expressao();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(LAParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(RETORNE);
			setState(410);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBTRACAO || _la==NUM_INT) {
				{
				{
				setState(412);
				item_selecao();
				}
				}
				setState(417);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			constantes();
			setState(419);
			match(DOIS_PONTOS);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 40532433724097024L) != 0) {
				{
				{
				setState(420);
				cmd();
				}
				}
				setState(425);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> INTERVALO() { return getTokens(LAParser.INTERVALO); }
		public TerminalNode INTERVALO(int i) {
			return getToken(LAParser.INTERVALO, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			numero_intervalo();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERVALO) {
				{
				{
				setState(427);
				match(INTERVALO);
				setState(428);
				numero_intervalo();
				}
				}
				setState(433);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(LAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LAParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(434);
				op_unario();
				}
			}

			setState(437);
			match(NUM_INT);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(438);
				match(T__0);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(439);
					op_unario();
					}
				}

				setState(442);
				match(NUM_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(LAParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(SUBTRACAO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			termo();
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					op1();
					setState(449);
					termo();
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			fator();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVISAO || _la==MULTIPLICACAO) {
				{
				{
				setState(457);
				op2();
				setState(458);
				fator();
				}
				}
				setState(464);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			parcela();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOD) {
				{
				{
				setState(466);
				op3();
				setState(467);
				parcela();
				}
				}
				setState(473);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LAParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(LAParser.SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(LAParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(LAParser.DIVISAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(_la==DIVISAO || _la==MULTIPLICACAO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(LAParser.MOD, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(MOD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parcela);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBTRACAO:
			case PONT:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case ABREPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(480);
					op_unario();
					}
				}

				setState(483);
				parcela_unario();
				}
				break;
			case ENDERECO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				parcela_nao_unario();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONT() { return getToken(LAParser.PONT, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode ABREPAR() { return getToken(LAParser.ABREPAR, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPAR() { return getToken(LAParser.FECHAPAR, 0); }
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parcela_unario);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONT) {
					{
					setState(487);
					match(PONT);
					}
				}

				setState(490);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(IDENT);
				setState(492);
				match(ABREPAR);
				setState(493);
				expressao();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULA) {
					{
					setState(494);
					match(VIRGULA);
					setState(495);
					expressao();
					}
				}

				setState(498);
				match(FECHAPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(ABREPAR);
				setState(503);
				expressao();
				setState(504);
				match(FECHAPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ENDERECO() { return getToken(LAParser.ENDERECO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parcela_nao_unario);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(ENDERECO);
				setState(509);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			exp_aritmetica();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 67619965108224L) != 0) {
				{
				setState(514);
				op_relacional();
				setState(515);
				exp_aritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(LAParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(LAParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(LAParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LAParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(LAParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(LAParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 67619965108224L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			termo_logico();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(522);
				op_logico_1();
				setState(523);
				termo_logico();
				}
				}
				setState(529);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			fator_logico();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(531);
				op_logico_2();
				setState(532);
				fator_logico();
				}
				}
				setState(538);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NAO() { return getToken(LAParser.NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(539);
				match(NAO);
				}
			}

			setState(542);
			parcela_logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(LAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LAParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parcela_logica);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSO:
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==FALSO || _la==VERDADEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SUBTRACAO:
			case ENDERECO:
			case PONT:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case CADEIA:
			case ABREPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				exp_relacional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(LAParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(OU);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(LAParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(E);
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
		"\u0004\u0001D\u0229\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001r\b\u0001"+
		"\n\u0001\f\u0001u\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003~\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0092\b\u0007\n\u0007\f\u0007\u0095\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u009d\b\b\n\b\f\b\u00a0\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab"+
		"\t\t\u0001\n\u0001\n\u0003\n\u00af\b\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00b5\b\f\u0001\r\u0003\r\u00b8\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00c0\b\u000f\n"+
		"\u000f\f\u000f\u00c3\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cb\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00cf\b\u0010\n\u0010\f\u0010\u00d2\t\u0010\u0001\u0010"+
		"\u0005\u0010\u00d5\b\u0010\n\u0010\f\u0010\u00d8\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00df\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e5\b\u0010\n"+
		"\u0010\f\u0010\u00e8\t\u0010\u0001\u0010\u0005\u0010\u00eb\b\u0010\n\u0010"+
		"\f\u0010\u00ee\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00f2\b\u0010"+
		"\u0001\u0011\u0003\u0011\u00f5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00fa\b\u0011\n\u0011\f\u0011\u00fd\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0105"+
		"\b\u0012\n\u0012\f\u0012\u0108\t\u0012\u0001\u0013\u0005\u0013\u010b\b"+
		"\u0013\n\u0013\f\u0013\u010e\t\u0013\u0001\u0013\u0005\u0013\u0111\b\u0013"+
		"\n\u0013\f\u0013\u0114\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0120\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0125\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012a"+
		"\b\u0015\u0001\u0015\u0005\u0015\u012d\b\u0015\n\u0015\f\u0015\u0130\t"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0139\b\u0016\n\u0016\f\u0016\u013c\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0144\b\u0017\n\u0017\f\u0017\u0147\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u014b\b\u0017\n\u0017\f\u0017\u014e\t\u0017\u0003\u0017"+
		"\u0150\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u015a\b\u0018\n\u0018"+
		"\f\u0018\u015d\t\u0018\u0003\u0018\u015f\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u016b\b\u0019\n\u0019\f\u0019\u016e"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0176\b\u001a\n\u001a\f\u001a\u0179\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u017f\b\u001b\n\u001b"+
		"\f\u001b\u0182\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0003\u001c\u0188\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0193\b\u001d\n\u001d\f\u001d\u0196\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u019e\b\u001f\n"+
		"\u001f\f\u001f\u01a1\t\u001f\u0001 \u0001 \u0001 \u0005 \u01a6\b \n \f"+
		" \u01a9\t \u0001!\u0001!\u0001!\u0005!\u01ae\b!\n!\f!\u01b1\t!\u0001\""+
		"\u0003\"\u01b4\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u01b9\b\"\u0001\"\u0003"+
		"\"\u01bc\b\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u01c4\b"+
		"$\n$\f$\u01c7\t$\u0001%\u0001%\u0001%\u0001%\u0005%\u01cd\b%\n%\f%\u01d0"+
		"\t%\u0001&\u0001&\u0001&\u0001&\u0005&\u01d6\b&\n&\f&\u01d9\t&\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0003*\u01e2\b*\u0001*\u0001"+
		"*\u0003*\u01e6\b*\u0001+\u0003+\u01e9\b+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u01f1\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u01fb\b+\u0001,\u0001,\u0001,\u0003,\u0200\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0206\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u020e\b/\n/\f/\u0211\t/\u00010\u00010\u00010\u00010\u00050\u0217"+
		"\b0\n0\f0\u021a\t0\u00011\u00031\u021d\b1\u00011\u00011\u00012\u00012"+
		"\u00032\u0223\b2\u00013\u00013\u00014\u00014\u00014\u0000\u00005\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh\u0000\u0006\u0003\u0000"+
		"\u0013\u0013\u0015\u0016\u0018\u0018\u0003\u0000\u0006\u00075688\u0002"+
		"\u0000..00\u0001\u000012\u0002\u0000\'(*-\u0001\u0000\u0006\u0007\u0238"+
		"\u0000j\u0001\u0000\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004x"+
		"\u0001\u0000\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u007f\u0001"+
		"\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u008e\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000"+
		"\u0000\u0000\u0012\u00a9\u0001\u0000\u0000\u0000\u0014\u00ae\u0001\u0000"+
		"\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b4\u0001\u0000"+
		"\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000"+
		"\u0000\u0000\u001e\u00bd\u0001\u0000\u0000\u0000 \u00f1\u0001\u0000\u0000"+
		"\u0000\"\u00f4\u0001\u0000\u0000\u0000$\u0101\u0001\u0000\u0000\u0000"+
		"&\u010c\u0001\u0000\u0000\u0000(\u011f\u0001\u0000\u0000\u0000*\u0121"+
		"\u0001\u0000\u0000\u0000,\u0133\u0001\u0000\u0000\u0000.\u013f\u0001\u0000"+
		"\u0000\u00000\u0153\u0001\u0000\u0000\u00002\u0162\u0001\u0000\u0000\u0000"+
		"4\u0171\u0001\u0000\u0000\u00006\u017c\u0001\u0000\u0000\u00008\u0187"+
		"\u0001\u0000\u0000\u0000:\u018d\u0001\u0000\u0000\u0000<\u0199\u0001\u0000"+
		"\u0000\u0000>\u019f\u0001\u0000\u0000\u0000@\u01a2\u0001\u0000\u0000\u0000"+
		"B\u01aa\u0001\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000F\u01bd"+
		"\u0001\u0000\u0000\u0000H\u01bf\u0001\u0000\u0000\u0000J\u01c8\u0001\u0000"+
		"\u0000\u0000L\u01d1\u0001\u0000\u0000\u0000N\u01da\u0001\u0000\u0000\u0000"+
		"P\u01dc\u0001\u0000\u0000\u0000R\u01de\u0001\u0000\u0000\u0000T\u01e5"+
		"\u0001\u0000\u0000\u0000V\u01fa\u0001\u0000\u0000\u0000X\u01ff\u0001\u0000"+
		"\u0000\u0000Z\u0201\u0001\u0000\u0000\u0000\\\u0207\u0001\u0000\u0000"+
		"\u0000^\u0209\u0001\u0000\u0000\u0000`\u0212\u0001\u0000\u0000\u0000b"+
		"\u021c\u0001\u0000\u0000\u0000d\u0222\u0001\u0000\u0000\u0000f\u0224\u0001"+
		"\u0000\u0000\u0000h\u0226\u0001\u0000\u0000\u0000jk\u0003\u0002\u0001"+
		"\u0000kl\u0005\u0002\u0000\u0000lm\u0003&\u0013\u0000mn\u0005\u0003\u0000"+
		"\u0000no\u0005\u0000\u0000\u0001o\u0001\u0001\u0000\u0000\u0000pr\u0003"+
		"\u0004\u0002\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0003\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0003\u0006\u0003\u0000wy\u0003"+
		" \u0010\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0005"+
		"\u0001\u0000\u0000\u0000z~\u0003\f\u0006\u0000{~\u0003\b\u0004\u0000|"+
		"~\u0003\n\u0005\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0017\u0000\u0000\u0080\u0081\u00057\u0000\u0000\u0081\u0082\u0005"+
		"<\u0000\u0000\u0082\u0083\u0003\u0016\u000b\u0000\u0083\u0084\u0005\'"+
		"\u0000\u0000\u0084\u0085\u0003\u001c\u000e\u0000\u0085\t\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087\u0088\u00057\u0000\u0000"+
		"\u0088\u0089\u0005<\u0000\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a"+
		"\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0011\u0000\u0000\u008c"+
		"\u008d\u0003\u000e\u0007\u0000\u008d\r\u0001\u0000\u0000\u0000\u008e\u0093"+
		"\u0003\u0010\b\u0000\u008f\u0090\u0005?\u0000\u0000\u0090\u0092\u0003"+
		"\u0010\b\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005<\u0000\u0000\u0097\u0098\u0003\u0014\n"+
		"\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009e\u00057\u0000\u0000"+
		"\u009a\u009b\u0005:\u0000\u0000\u009b\u009d\u00057\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0003\u0012\t\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"@\u0000\u0000\u00a4\u00a5\u0003H$\u0000\u00a5\u00a6\u0005A\u0000\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0003\u001e\u000f\u0000"+
		"\u00ad\u00af\u0003\u001a\r\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0007\u0000\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0003\u0016\u000b\u0000\u00b3\u00b5\u00057\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u0019"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b8\u00054\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0003\u0018\f\u0000\u00ba\u001b\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc\u001d\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c1\u0005\u0004\u0000\u0000\u00be\u00c0\u0003\u000e"+
		"\u0007\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0005\u0000\u0000\u00c5\u001f\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\f\u0000\u0000\u00c7\u00c8\u00057\u0000"+
		"\u0000\u00c8\u00ca\u0005=\u0000\u0000\u00c9\u00cb\u0003$\u0012\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d0\u0005>\u0000\u0000\u00cd\u00cf"+
		"\u0003\u0006\u0003\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d6\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003(\u0014\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00f2\u0005"+
		"\r\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc\u00057\u0000"+
		"\u0000\u00dc\u00de\u0005=\u0000\u0000\u00dd\u00df\u0003$\u0012\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005>\u0000\u0000\u00e1\u00e2"+
		"\u0005<\u0000\u0000\u00e2\u00e6\u0003\u001a\r\u0000\u00e3\u00e5\u0003"+
		"\u0006\u0003\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ec\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0003(\u0014\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u000b"+
		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00c6\u0001\u0000"+
		"\u0000\u0000\u00f1\u00da\u0001\u0000\u0000\u0000\u00f2!\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0005\u0014\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00fb\u0003\u0010\b\u0000\u00f7\u00f8\u0005?\u0000\u0000"+
		"\u00f8\u00fa\u0003\u0010\b\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005<\u0000\u0000\u00ff\u0100"+
		"\u0003\u001a\r\u0000\u0100#\u0001\u0000\u0000\u0000\u0101\u0106\u0003"+
		"\"\u0011\u0000\u0102\u0103\u0005?\u0000\u0000\u0103\u0105\u0003\"\u0011"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107%\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0003\u0006\u0003\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0112\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111\u0003(\u0014\u0000\u0110"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\'\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0120"+
		"\u0003*\u0015\u0000\u0116\u0120\u0003,\u0016\u0000\u0117\u0120\u0003."+
		"\u0017\u0000\u0118\u0120\u00030\u0018\u0000\u0119\u0120\u00032\u0019\u0000"+
		"\u011a\u0120\u00034\u001a\u0000\u011b\u0120\u00036\u001b\u0000\u011c\u0120"+
		"\u00038\u001c\u0000\u011d\u0120\u0003:\u001d\u0000\u011e\u0120\u0003<"+
		"\u001e\u0000\u011f\u0115\u0001\u0000\u0000\u0000\u011f\u0116\u0001\u0000"+
		"\u0000\u0000\u011f\u0117\u0001\u0000\u0000\u0000\u011f\u0118\u0001\u0000"+
		"\u0000\u0000\u011f\u0119\u0001\u0000\u0000\u0000\u011f\u011a\u0001\u0000"+
		"\u0000\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u0120)\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u000f\u0000"+
		"\u0000\u0122\u0124\u0005=\u0000\u0000\u0123\u0125\u00054\u0000\u0000\u0124"+
		"\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u012e\u0003\u0010\b\u0000\u0127\u0129"+
		"\u0005?\u0000\u0000\u0128\u012a\u00054\u0000\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012d\u0003\u0010\b\u0000\u012c\u0127\u0001\u0000\u0000"+
		"\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005>\u0000\u0000"+
		"\u0132+\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0010\u0000\u0000\u0134"+
		"\u0135\u0005=\u0000\u0000\u0135\u013a\u0003^/\u0000\u0136\u0137\u0005"+
		"?\u0000\u0000\u0137\u0139\u0003^/\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u0005>\u0000\u0000"+
		"\u013e-\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0019\u0000\u0000\u0140"+
		"\u0141\u0003^/\u0000\u0141\u0145\u0005\u001c\u0000\u0000\u0142\u0144\u0003"+
		"(\u0014\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u014f\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u014c\u0005\u001a\u0000\u0000\u0149\u014b\u0003(\u0014"+
		"\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0148\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u001b\u0000"+
		"\u0000\u0152/\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u001d\u0000\u0000"+
		"\u0154\u0155\u0003H$\u0000\u0155\u0156\u0005\"\u0000\u0000\u0156\u015e"+
		"\u0003>\u001f\u0000\u0157\u015b\u0005\u001a\u0000\u0000\u0158\u015a\u0003"+
		"(\u0014\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u0157\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u001e"+
		"\u0000\u0000\u01611\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u001f\u0000"+
		"\u0000\u0163\u0164\u00057\u0000\u0000\u0164\u0165\u0005)\u0000\u0000\u0165"+
		"\u0166\u0003H$\u0000\u0166\u0167\u0005!\u0000\u0000\u0167\u0168\u0003"+
		"H$\u0000\u0168\u016c\u0005\t\u0000\u0000\u0169\u016b\u0003(\u0014\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0005 \u0000\u0000\u01703\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0005#\u0000\u0000\u0172\u0173\u0003^/\u0000\u0173\u0177\u0005\t\u0000"+
		"\u0000\u0174\u0176\u0003(\u0014\u0000\u0175\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017b\u0005$\u0000\u0000\u017b"+
		"5\u0001\u0000\u0000\u0000\u017c\u0180\u0005\t\u0000\u0000\u017d\u017f"+
		"\u0003(\u0014\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005!\u0000\u0000\u0184\u0185\u0003^/"+
		"\u0000\u01857\u0001\u0000\u0000\u0000\u0186\u0188\u00054\u0000\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0003\u0010\b\u0000\u018a\u018b"+
		"\u0005)\u0000\u0000\u018b\u018c\u0003^/\u0000\u018c9\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u00057\u0000\u0000\u018e\u018f\u0005=\u0000\u0000\u018f"+
		"\u0194\u0003^/\u0000\u0190\u0191\u0005?\u0000\u0000\u0191\u0193\u0003"+
		"^/\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0005>\u0000\u0000\u0198;\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005\u000e\u0000\u0000\u019a\u019b\u0003^/\u0000\u019b=\u0001"+
		"\u0000\u0000\u0000\u019c\u019e\u0003@ \u0000\u019d\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0?\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003B!\u0000\u01a3\u01a7"+
		"\u0005<\u0000\u0000\u01a4\u01a6\u0003(\u0014\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8A\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01af\u0003D\"\u0000"+
		"\u01ab\u01ac\u0005;\u0000\u0000\u01ac\u01ae\u0003D\"\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0C\u0001"+
		"\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b4\u0003"+
		"F#\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01bb\u00055\u0000\u0000"+
		"\u01b6\u01b8\u0005\u0001\u0000\u0000\u01b7\u01b9\u0003F#\u0000\u01b8\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bc\u00055\u0000\u0000\u01bb\u01b6\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcE\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u00050\u0000\u0000\u01beG\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c5\u0003J%\u0000\u01c0\u01c1\u0003N\'\u0000\u01c1\u01c2\u0003"+
		"J%\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6I\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01ce\u0003L&\u0000\u01c9\u01ca"+
		"\u0003P(\u0000\u01ca\u01cb\u0003L&\u0000\u01cb\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cfK\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d7\u0003T*\u0000\u01d2\u01d3\u0003R)\u0000\u01d3\u01d4\u0003"+
		"T*\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8M\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01db\u0007\u0002\u0000\u0000"+
		"\u01dbO\u0001\u0000\u0000\u0000\u01dc\u01dd\u0007\u0003\u0000\u0000\u01dd"+
		"Q\u0001\u0000\u0000\u0000\u01de\u01df\u0005/\u0000\u0000\u01dfS\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e2\u0003F#\u0000\u01e1\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e6\u0003V+\u0000\u01e4\u01e6\u0003X,\u0000\u01e5\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6U\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e9\u00054\u0000\u0000\u01e8\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea\u01fb\u0003\u0010\b\u0000\u01eb\u01ec\u00057\u0000"+
		"\u0000\u01ec\u01ed\u0005=\u0000\u0000\u01ed\u01f0\u0003^/\u0000\u01ee"+
		"\u01ef\u0005?\u0000\u0000\u01ef\u01f1\u0003^/\u0000\u01f0\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0005>\u0000\u0000\u01f3\u01fb\u0001\u0000"+
		"\u0000\u0000\u01f4\u01fb\u00055\u0000\u0000\u01f5\u01fb\u00056\u0000\u0000"+
		"\u01f6\u01f7\u0005=\u0000\u0000\u01f7\u01f8\u0003^/\u0000\u01f8\u01f9"+
		"\u0005>\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01e8\u0001"+
		"\u0000\u0000\u0000\u01fa\u01eb\u0001\u0000\u0000\u0000\u01fa\u01f4\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f5\u0001\u0000\u0000\u0000\u01fa\u01f6\u0001"+
		"\u0000\u0000\u0000\u01fbW\u0001\u0000\u0000\u0000\u01fc\u01fd\u00053\u0000"+
		"\u0000\u01fd\u0200\u0003\u0010\b\u0000\u01fe\u0200\u00058\u0000\u0000"+
		"\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000"+
		"\u0200Y\u0001\u0000\u0000\u0000\u0201\u0205\u0003H$\u0000\u0202\u0203"+
		"\u0003\\.\u0000\u0203\u0204\u0003H$\u0000\u0204\u0206\u0001\u0000\u0000"+
		"\u0000\u0205\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206[\u0001\u0000\u0000\u0000\u0207\u0208\u0007\u0004\u0000\u0000"+
		"\u0208]\u0001\u0000\u0000\u0000\u0209\u020f\u0003`0\u0000\u020a\u020b"+
		"\u0003f3\u0000\u020b\u020c\u0003`0\u0000\u020c\u020e\u0001\u0000\u0000"+
		"\u0000\u020d\u020a\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210_\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0212\u0218\u0003b1\u0000\u0213\u0214\u0003h4\u0000\u0214\u0215\u0003"+
		"b1\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0213\u0001\u0000\u0000"+
		"\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219a\u0001\u0000\u0000\u0000"+
		"\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021d\u0005\b\u0000\u0000\u021c"+
		"\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0003d2\u0000\u021fc\u0001"+
		"\u0000\u0000\u0000\u0220\u0223\u0007\u0005\u0000\u0000\u0221\u0223\u0003"+
		"Z-\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0221\u0001\u0000\u0000"+
		"\u0000\u0223e\u0001\u0000\u0000\u0000\u0224\u0225\u0005&\u0000\u0000\u0225"+
		"g\u0001\u0000\u0000\u0000\u0226\u0227\u0005%\u0000\u0000\u0227i\u0001"+
		"\u0000\u0000\u00009sx}\u0093\u009e\u00a9\u00ae\u00b4\u00b7\u00c1\u00ca"+
		"\u00d0\u00d6\u00de\u00e6\u00ec\u00f1\u00f4\u00fb\u0106\u010c\u0112\u011f"+
		"\u0124\u0129\u012e\u013a\u0145\u014c\u014f\u015b\u015e\u016c\u0177\u0180"+
		"\u0187\u0194\u019f\u01a7\u01af\u01b3\u01b8\u01bb\u01c5\u01ce\u01d7\u01e1"+
		"\u01e5\u01e8\u01f0\u01fa\u01ff\u0205\u020f\u0218\u021c\u0222";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}