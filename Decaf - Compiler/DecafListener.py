# Generated from Decaf.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DecafParser import DecafParser
else:
    from DecafParser import DecafParser

# This class defines a complete listener for a parse tree produced by DecafParser.
class DecafListener(ParseTreeListener):

    # Enter a parse tree produced by DecafParser#program.
    def enterProgram(self, ctx:DecafParser.ProgramContext):
        pass

    # Exit a parse tree produced by DecafParser#program.
    def exitProgram(self, ctx:DecafParser.ProgramContext):
        pass


    # Enter a parse tree produced by DecafParser#data_type.
    def enterData_type(self, ctx:DecafParser.Data_typeContext):
        pass

    # Exit a parse tree produced by DecafParser#data_type.
    def exitData_type(self, ctx:DecafParser.Data_typeContext):
        pass


    # Enter a parse tree produced by DecafParser#int_literal.
    def enterInt_literal(self, ctx:DecafParser.Int_literalContext):
        pass

    # Exit a parse tree produced by DecafParser#int_literal.
    def exitInt_literal(self, ctx:DecafParser.Int_literalContext):
        pass


    # Enter a parse tree produced by DecafParser#var_decl.
    def enterVar_decl(self, ctx:DecafParser.Var_declContext):
        pass

    # Exit a parse tree produced by DecafParser#var_decl.
    def exitVar_decl(self, ctx:DecafParser.Var_declContext):
        pass


    # Enter a parse tree produced by DecafParser#block.
    def enterBlock(self, ctx:DecafParser.BlockContext):
        pass

    # Exit a parse tree produced by DecafParser#block.
    def exitBlock(self, ctx:DecafParser.BlockContext):
        pass


    # Enter a parse tree produced by DecafParser#field_decl_args.
    def enterField_decl_args(self, ctx:DecafParser.Field_decl_argsContext):
        pass

    # Exit a parse tree produced by DecafParser#field_decl_args.
    def exitField_decl_args(self, ctx:DecafParser.Field_decl_argsContext):
        pass


    # Enter a parse tree produced by DecafParser#field_decl.
    def enterField_decl(self, ctx:DecafParser.Field_declContext):
        pass

    # Exit a parse tree produced by DecafParser#field_decl.
    def exitField_decl(self, ctx:DecafParser.Field_declContext):
        pass


    # Enter a parse tree produced by DecafParser#method_decl_args.
    def enterMethod_decl_args(self, ctx:DecafParser.Method_decl_argsContext):
        pass

    # Exit a parse tree produced by DecafParser#method_decl_args.
    def exitMethod_decl_args(self, ctx:DecafParser.Method_decl_argsContext):
        pass


    # Enter a parse tree produced by DecafParser#method_decl.
    def enterMethod_decl(self, ctx:DecafParser.Method_declContext):
        pass

    # Exit a parse tree produced by DecafParser#method_decl.
    def exitMethod_decl(self, ctx:DecafParser.Method_declContext):
        pass



del DecafParser