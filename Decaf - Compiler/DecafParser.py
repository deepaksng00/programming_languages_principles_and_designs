# Generated from Decaf.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+")
        buf.write("c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3\2\7\2\31\n\2\f\2\16")
        buf.write("\2\34\13\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2\3\2")
        buf.write("\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62")
        buf.write("\13\5\3\6\3\6\7\6\66\n\6\f\6\16\69\13\6\3\6\3\6\3\7\3")
        buf.write("\7\3\7\3\7\3\7\3\7\5\7C\n\7\3\b\3\b\3\b\3\b\3\b\7\bJ\n")
        buf.write("\b\f\b\16\bM\13\b\3\t\3\t\3\t\3\n\3\n\5\nT\n\n\3\n\3\n")
        buf.write("\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\n\3\n\3\n\3\n\2")
        buf.write("\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\35\36\3\2)*\2a\2\24")
        buf.write("\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n\63\3\2\2\2")
        buf.write("\fB\3\2\2\2\16D\3\2\2\2\20N\3\2\2\2\22S\3\2\2\2\24\25")
        buf.write("\7\37\2\2\25\26\7(\2\2\26\32\7\3\2\2\27\31\5\16\b\2\30")
        buf.write("\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2")
        buf.write("\33 \3\2\2\2\34\32\3\2\2\2\35\37\5\22\n\2\36\35\3\2\2")
        buf.write("\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2")
        buf.write("\2\2#$\7\4\2\2$%\7\2\2\3%\3\3\2\2\2&\'\t\2\2\2\'\5\3\2")
        buf.write("\2\2()\t\3\2\2)\7\3\2\2\2*+\5\4\3\2+\60\7(\2\2,-\7\30")
        buf.write("\2\2-/\7(\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61")
        buf.write("\3\2\2\2\61\t\3\2\2\2\62\60\3\2\2\2\63\67\7\3\2\2\64\66")
        buf.write("\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3")
        buf.write("\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\4\2\2;\13\3\2\2\2<C\7")
        buf.write("(\2\2=>\7(\2\2>?\7\5\2\2?@\5\6\4\2@A\7\6\2\2AC\3\2\2\2")
        buf.write("B<\3\2\2\2B=\3\2\2\2C\r\3\2\2\2DE\5\4\3\2EF\7(\2\2FK\5")
        buf.write("\f\7\2GH\7\30\2\2HJ\5\f\7\2IG\3\2\2\2JM\3\2\2\2KI\3\2")
        buf.write("\2\2KL\3\2\2\2L\17\3\2\2\2MK\3\2\2\2NO\5\4\3\2OP\7(\2")
        buf.write("\2P\21\3\2\2\2QT\5\4\3\2RT\7\34\2\2SQ\3\2\2\2SR\3\2\2")
        buf.write("\2TU\3\2\2\2UV\7(\2\2VW\7\7\2\2W\\\5\20\t\2XY\7\30\2\2")
        buf.write("Y[\5\20\t\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2")
        buf.write("]_\3\2\2\2^\\\3\2\2\2_`\7\b\2\2`a\5\n\6\2a\23\3\2\2\2")
        buf.write("\n\32 \60\67BKS\\")
        return buf.getvalue()


class DecafParser ( Parser ):

    grammarFileName = "Decaf.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'{'", "'}'", "'['", "']'", "'('", "')'", 
                     "'='", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
                     "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
                     "','", "'0x'", "'true'", "'false'", "'void'", "'int'", 
                     "'boolean'", "'class'", "'if'", "'else'", "'for'", 
                     "'return'", "'break'", "'continue'", "'callout'", "'Program'" ]

    symbolicNames = [ "<INVALID>", "LCURLY", "RCURLY", "LSQR", "RSQR", "LBRACE", 
                      "RBRACE", "EQ", "EXCL", "PLUS", "MIN", "TIMES", "DIV", 
                      "MOD", "LESSOP", "MOREOP", "LESSEQOP", "MOREEQOP", 
                      "EQEQ", "NOTEQ", "AND", "OR", "COMMA", "HEX", "TRUE", 
                      "FALSE", "VOID", "INT", "BOOL", "CLASS", "IF", "ELSE", 
                      "FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", "PROGRAM", 
                      "ID", "NUMBER", "HEXNUMBER", "WS" ]

    RULE_program = 0
    RULE_data_type = 1
    RULE_int_literal = 2
    RULE_var_decl = 3
    RULE_block = 4
    RULE_field_decl_args = 5
    RULE_field_decl = 6
    RULE_method_decl_args = 7
    RULE_method_decl = 8

    ruleNames =  [ "program", "data_type", "int_literal", "var_decl", "block", 
                   "field_decl_args", "field_decl", "method_decl_args", 
                   "method_decl" ]

    EOF = Token.EOF
    LCURLY=1
    RCURLY=2
    LSQR=3
    RSQR=4
    LBRACE=5
    RBRACE=6
    EQ=7
    EXCL=8
    PLUS=9
    MIN=10
    TIMES=11
    DIV=12
    MOD=13
    LESSOP=14
    MOREOP=15
    LESSEQOP=16
    MOREEQOP=17
    EQEQ=18
    NOTEQ=19
    AND=20
    OR=21
    COMMA=22
    HEX=23
    TRUE=24
    FALSE=25
    VOID=26
    INT=27
    BOOL=28
    CLASS=29
    IF=30
    ELSE=31
    FOR=32
    RETURN=33
    BREAK=34
    CONTINUE=35
    CALLOUT=36
    PROGRAM=37
    ID=38
    NUMBER=39
    HEXNUMBER=40
    WS=41

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS(self):
            return self.getToken(DecafParser.CLASS, 0)

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LCURLY(self):
            return self.getToken(DecafParser.LCURLY, 0)

        def RCURLY(self):
            return self.getToken(DecafParser.RCURLY, 0)

        def EOF(self):
            return self.getToken(DecafParser.EOF, 0)

        def field_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Field_declContext)
            else:
                return self.getTypedRuleContext(DecafParser.Field_declContext,i)


        def method_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Method_declContext)
            else:
                return self.getTypedRuleContext(DecafParser.Method_declContext,i)


        def getRuleIndex(self):
            return DecafParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = DecafParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(DecafParser.CLASS)
            self.state = 19
            self.match(DecafParser.ID)
            self.state = 20
            self.match(DecafParser.LCURLY)
            self.state = 24
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 21
                    self.field_decl() 
                self.state = 26
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

            self.state = 30
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << DecafParser.VOID) | (1 << DecafParser.INT) | (1 << DecafParser.BOOL))) != 0):
                self.state = 27
                self.method_decl()
                self.state = 32
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 33
            self.match(DecafParser.RCURLY)
            self.state = 34
            self.match(DecafParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Data_typeContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(DecafParser.INT, 0)

        def BOOL(self):
            return self.getToken(DecafParser.BOOL, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_data_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterData_type" ):
                listener.enterData_type(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitData_type" ):
                listener.exitData_type(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitData_type" ):
                return visitor.visitData_type(self)
            else:
                return visitor.visitChildren(self)




    def data_type(self):

        localctx = DecafParser.Data_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_data_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            _la = self._input.LA(1)
            if not(_la==DecafParser.INT or _la==DecafParser.BOOL):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Int_literalContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(DecafParser.NUMBER, 0)

        def HEXNUMBER(self):
            return self.getToken(DecafParser.HEXNUMBER, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_int_literal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInt_literal" ):
                listener.enterInt_literal(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInt_literal" ):
                listener.exitInt_literal(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInt_literal" ):
                return visitor.visitInt_literal(self)
            else:
                return visitor.visitChildren(self)




    def int_literal(self):

        localctx = DecafParser.Int_literalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_int_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            _la = self._input.LA(1)
            if not(_la==DecafParser.NUMBER or _la==DecafParser.HEXNUMBER):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(DecafParser.ID)
            else:
                return self.getToken(DecafParser.ID, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(DecafParser.COMMA)
            else:
                return self.getToken(DecafParser.COMMA, i)

        def getRuleIndex(self):
            return DecafParser.RULE_var_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_decl" ):
                listener.enterVar_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_decl" ):
                listener.exitVar_decl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVar_decl" ):
                return visitor.visitVar_decl(self)
            else:
                return visitor.visitChildren(self)




    def var_decl(self):

        localctx = DecafParser.Var_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_var_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.data_type()
            self.state = 41
            self.match(DecafParser.ID)
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==DecafParser.COMMA:
                self.state = 42
                self.match(DecafParser.COMMA)
                self.state = 43
                self.match(DecafParser.ID)
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LCURLY(self):
            return self.getToken(DecafParser.LCURLY, 0)

        def RCURLY(self):
            return self.getToken(DecafParser.RCURLY, 0)

        def var_decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Var_declContext)
            else:
                return self.getTypedRuleContext(DecafParser.Var_declContext,i)


        def getRuleIndex(self):
            return DecafParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)




    def block(self):

        localctx = DecafParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(DecafParser.LCURLY)
            self.state = 53
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==DecafParser.INT or _la==DecafParser.BOOL:
                self.state = 50
                self.var_decl()
                self.state = 55
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 56
            self.match(DecafParser.RCURLY)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Field_decl_argsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LSQR(self):
            return self.getToken(DecafParser.LSQR, 0)

        def int_literal(self):
            return self.getTypedRuleContext(DecafParser.Int_literalContext,0)


        def RSQR(self):
            return self.getToken(DecafParser.RSQR, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_field_decl_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterField_decl_args" ):
                listener.enterField_decl_args(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitField_decl_args" ):
                listener.exitField_decl_args(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitField_decl_args" ):
                return visitor.visitField_decl_args(self)
            else:
                return visitor.visitChildren(self)




    def field_decl_args(self):

        localctx = DecafParser.Field_decl_argsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_field_decl_args)
        try:
            self.state = 64
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 58
                self.match(DecafParser.ID)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 59
                self.match(DecafParser.ID)
                self.state = 60
                self.match(DecafParser.LSQR)
                self.state = 61
                self.int_literal()
                self.state = 62
                self.match(DecafParser.RSQR)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Field_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def field_decl_args(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Field_decl_argsContext)
            else:
                return self.getTypedRuleContext(DecafParser.Field_decl_argsContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(DecafParser.COMMA)
            else:
                return self.getToken(DecafParser.COMMA, i)

        def getRuleIndex(self):
            return DecafParser.RULE_field_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterField_decl" ):
                listener.enterField_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitField_decl" ):
                listener.exitField_decl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitField_decl" ):
                return visitor.visitField_decl(self)
            else:
                return visitor.visitChildren(self)




    def field_decl(self):

        localctx = DecafParser.Field_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_field_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.data_type()

            self.state = 67
            self.match(DecafParser.ID)

            self.state = 68
            self.field_decl_args()
            self.state = 73
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==DecafParser.COMMA:
                self.state = 69
                self.match(DecafParser.COMMA)
                self.state = 70
                self.field_decl_args()
                self.state = 75
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_decl_argsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_method_decl_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethod_decl_args" ):
                listener.enterMethod_decl_args(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethod_decl_args" ):
                listener.exitMethod_decl_args(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod_decl_args" ):
                return visitor.visitMethod_decl_args(self)
            else:
                return visitor.visitChildren(self)




    def method_decl_args(self):

        localctx = DecafParser.Method_decl_argsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_method_decl_args)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self.data_type()
            self.state = 77
            self.match(DecafParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LBRACE(self):
            return self.getToken(DecafParser.LBRACE, 0)

        def method_decl_args(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DecafParser.Method_decl_argsContext)
            else:
                return self.getTypedRuleContext(DecafParser.Method_decl_argsContext,i)


        def RBRACE(self):
            return self.getToken(DecafParser.RBRACE, 0)

        def block(self):
            return self.getTypedRuleContext(DecafParser.BlockContext,0)


        def data_type(self):
            return self.getTypedRuleContext(DecafParser.Data_typeContext,0)


        def VOID(self):
            return self.getToken(DecafParser.VOID, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(DecafParser.COMMA)
            else:
                return self.getToken(DecafParser.COMMA, i)

        def getRuleIndex(self):
            return DecafParser.RULE_method_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethod_decl" ):
                listener.enterMethod_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethod_decl" ):
                listener.exitMethod_decl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod_decl" ):
                return visitor.visitMethod_decl(self)
            else:
                return visitor.visitChildren(self)




    def method_decl(self):

        localctx = DecafParser.Method_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_method_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [DecafParser.INT, DecafParser.BOOL]:
                self.state = 79
                self.data_type()
                pass
            elif token in [DecafParser.VOID]:
                self.state = 80
                self.match(DecafParser.VOID)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 83
            self.match(DecafParser.ID)
            self.state = 84
            self.match(DecafParser.LBRACE)
            self.state = 85
            self.method_decl_args()
            self.state = 90
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==DecafParser.COMMA:
                self.state = 86
                self.match(DecafParser.COMMA)
                self.state = 87
                self.method_decl_args()
                self.state = 92
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 93
            self.match(DecafParser.RBRACE)
            self.state = 94
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





