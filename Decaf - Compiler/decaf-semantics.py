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
        
        array_size = ctx.field_decl_args(0)
        
        print(array_size.int_literal().getText())
        # checking for multiple array declarations
        for i in range(len(ctx.field_decl_args())):
            field_symbol = self.st.probe(ctx.field_decl_args(i).getText())
            if field_symbol != None:
                print("Error on line", str(line_num) + ", field", "'" + str(ctx.field_decl_args(i).getText()) + "'", "already declared on line", field_symbol.line)
            else:
                field_symbol = VarSymbol(id=ctx.field_decl_args(i).getText(),
                                         type=data_type,
                                         line=line_num,
                                         size=8,
                                         mem=HEAP)
                
                self.st.addSymbol(field_symbol)
        
        # checking for arrays of size 0
        
        self.visitChildren(ctx)

filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

stream = ant.CommonTokenStream(lexer)

parser = DecafParser(stream)
tree = parser.program()

visitor = DecafSemanticChecker()
visitor.visit(tree)
