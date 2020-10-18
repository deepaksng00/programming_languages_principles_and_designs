grammar Decaf;

/*LEXER RULES*/

L_CURLY : '{';
R_CURLY : '}';
L_SQR : '[';
R_SQR : ']';
L_BRACE : '(';
R_BRACE : ')';
EQ : '=';
PLUS_EQ : '+=';
MIN_EQ : '-=';
EXCL : '!';
PLUS : '+';
MIN : '-';
TIMES : '*';
DIV : '/';
MOD : '%';
LESS_OP : '<';
MORE_OP : '>';
LESS_EQ_OP : '<=';
MORE_EQ_OP : '>=';
EQ_EQ : '==';
NOT_EQ : '!=';
AND : '&&';
OR : '||';
COMMA : ',';
SEMI_COL : ';';

HEX : '0x';
TRUE : 'true';
FALSE : 'false';
VOID : 'void';
INT : 'int';
BOOL : 'boolean';
CLASS : 'class';
IF : 'if';
ELSE : 'else';
FOR : 'for';
RETURN : 'return';
BREAK : 'break';
CONTINUE : 'continue';
CALLOUT : 'callout';

fragment ALPHA : [a-zA-Z_];
fragment DIGIT : [0-9];
fragment ALPHA_NUM : ALPHA | DIGIT;

ID : ALPHA ALPHA_NUM*;
NUMBER : DIGIT DIGIT*;
HEX_NUMBER : DIGIT [a-fA-F];

fragment GOOD_CHARS : [ -~];
fragment DOUBLE_CHARS : '\\' ('n' | '"' | '\'' | '\\');
CHAR : '\'' (GOOD_CHARS | DOUBLE_CHARS) '\'';

STRING_LITERAL : '"' (GOOD_CHARS | DOUBLE_CHARS)* '"';

COMMENT : '//' ~'\n'* '\n' -> skip;
WS : [ \t\r\n]+ -> skip;

/*parser rules*/

program : CLASS ID L_CURLY field_decl* method_decl* R_CURLY EOF;

data_type : INT | BOOL;

literal : int_literal | char_literal | bool_literal;

int_literal : NUMBER
        	    | HEX_NUMBER;

char_literal : CHAR;

bool_literal: TRUE | FALSE;

var_decl : data_type ID (COMMA ID)*;

expr : location
     | method_call
     | literal
     | expr bin_op expr
     | MIN expr
     | EXCL expr
     | L_BRACE expr R_BRACE; 

location : ID 
        	 | ID L_SQR expr R_SQR;

method_name : ID;

callout_arg : expr
        	    | STRING_LITERAL;

bin_op : arith_op
       | rel_op
       | eq_op
       | cond_op;

arith_op : PLUS | MIN | TIMES | DIV | MOD;
rel_op : LESS_OP | MORE_OP | LESS_EQ_OP | MORE_EQ_OP;
eq_op : EQ_EQ | NOT_EQ;
cond_op : AND OR;

method_call : method_name L_BRACE expr (COMMA expr)* R_BRACE
        	    | CALLOUT L_BRACE STRING_LITERAL (COMMA callout_arg)* R_BRACE; 

assign_op : EQ
        	  | PLUS_EQ
          | MIN_EQ;

statement : location assign_op expr SEMI_COL
        	  | method_call SEMI_COL
        	  | IF L_BRACE expr R_BRACE block ELSE block
        	  | FOR ID EQ expr COMMA expr block
        	  | RETURN expr
        	  | BREAK SEMI_COL
        	  | CONTINUE SEMI_COL
        	  | block;

block : L_CURLY var_decl* statement* R_CURLY;

field_decl_args : ID
            		| ID L_SQR int_literal R_SQR;

field_decl : data_type field_decl_args (COMMA field_decl_args)* SEMI_COL;

method_decl_args : data_type ID;

method_decl : (data_type | VOID) ID L_BRACE method_decl_args (COMMA method_decl_args)* R_BRACE block; 
