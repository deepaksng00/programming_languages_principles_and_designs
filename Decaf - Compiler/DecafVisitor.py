# Generated from Decaf.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .DecafParser import DecafParser
else:
    from DecafParser import DecafParser

# This class defines a complete generic visitor for a parse tree produced by DecafParser.

class DecafVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by DecafParser#program.
    def visitProgram(self, ctx:DecafParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#data_type.
    def visitData_type(self, ctx:DecafParser.Data_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#int_literal.
    def visitInt_literal(self, ctx:DecafParser.Int_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#var_decl.
    def visitVar_decl(self, ctx:DecafParser.Var_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#block.
    def visitBlock(self, ctx:DecafParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#field_decl_args.
    def visitField_decl_args(self, ctx:DecafParser.Field_decl_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#field_decl.
    def visitField_decl(self, ctx:DecafParser.Field_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#method_decl_args.
    def visitMethod_decl_args(self, ctx:DecafParser.Method_decl_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by DecafParser#method_decl.
    def visitMethod_decl(self, ctx:DecafParser.Method_declContext):
        return self.visitChildren(ctx)



del DecafParser