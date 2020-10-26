import antlr4 as ant
from DecafLexer import DecafLexer
from DecafParser import DecafParser
from DecafVisitor import DecafVisitor
from SymbolTable import HEAP, STACK, SymbolTable, VarSymbol, MethodSymbol

class DecafSemanticChecker(DecafVisitor):
    def __init__(self):
        super().__init__()
        self.st = SymbolTable()
        
        
    def visitProgram(self, ctx:DecafParser.ProgramContext):
        self.st.enterScope()
        self.visitChildren(ctx)
        self.st.exitScope()
    
    def visitField_decl(self, ctx:DecafParser.Field_declContext):
        data_type = ctx.data_type().getText()
        line_num = ctx.start.line
        
        array_size = len(ctx.field_decl_args())
        
        array_size_decl = 1 # memory allocation for array declarations
            
        # checking for multiple array declarations and arrays of size 0 or less
        for i in range(array_size):
            field_symbol = self.st.probe(ctx.field_decl_args(i).getText())
            if field_symbol != None:
                print("ERROR: On line", str(line_num) + ", field", "'" + ctx.field_decl_args(i).getText() + "'", "already declared on line", field_symbol.line)
            elif ctx.field_decl_args(i).int_literal() != None:
                if int(ctx.field_decl_args(i).int_literal().getText()) <= 0:
                    array_size_decl = ctx.field_decl_args(i).int_literal().getText();
                    print("ERROR: On line", str(line_num) + ", field", "'" + ctx.field_decl_args(i).getText() + "'.", "Cannot declare array of size", ctx.field_decl_args(i).int_literal().getText())
                else:
                    array_size_decl = 1;
            else:
                field_symbol = VarSymbol(id=ctx.field_decl_args(i).getText(),
                                         type=data_type,
                                         line=line_num,
                                         size=8 * array_size_decl,
                                         mem=HEAP)
                
                self.st.addSymbol(field_symbol)
        
        self.visitChildren(ctx)
        
    def visitMethod_decl(self, ctx:DecafParser.Method_declContext):
        self.st.enterScope() # creating new scope for method
        
        method_args = len(ctx.method_decl_args())
        line_num = ctx.start.line
        
        for i in range(method_args):
            field_symbol = self.st.probe(ctx.method_decl_args(i).ID().getText())
            if field_symbol != None:
                print("ERROR: on line", str(line_num) + ", field '" + ctx.method_decl_args(i).ID().getText() + "'.", "Argument already declared for method '" + ctx.ID().getText() + "'")
            else:
                field_symbol = VarSymbol(id=ctx.method_decl_args(i).ID().getText(),
                                         type=ctx.method_decl_args(i).data_type().getText(),
                                         line=line_num,
                                         size=8,
                                         mem=HEAP)    
                self.st.addSymbol(field_symbol)
                
        method_symbol = MethodSymbol(id=ctx.ID().getText(),
                                     type=ctx.data_type().getText(),
                                     line=line_num,
                                     params=ctx.method_decl_args())
        
        self.self.addSymbol(method_symbol)
            
        self.visitChildren(ctx)
        
        self.st.exitScope()

filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

stream = ant.CommonTokenStream(lexer)

parser = DecafParser(stream)
tree = parser.program()

visitor = DecafSemanticChecker()
visitor.visit(tree)
