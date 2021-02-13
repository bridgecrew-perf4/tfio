parser grammar tfParser;

/* HCL Native Syntax Specification */
// https://github.com/hashicorp/hcl/blob/hcl2/hclsyntax/spec.md
// Terraform syntax is derived from HCL

options {
    tokenVocab = 'tfLexer';
}

@parser::members {
	
	/* Solution for context-dependent EOL detection citation: */
	// https://stackoverflow.com/questions/41667217/antlr4-how-can-i-both-hide-and-use-tokens-in-a-grammar
	//
	// Backtrack through token channels until we find either : 
	// 1. EOL Channel 	   --> isEOL() = true
	// 2. Default Channel  --> isEOL() = false
		
	boolean isEOL()
	{
        int channel = getCurrentToken().getChannel();
        int index = getCurrentToken().getTokenIndex();
        
        do {
        	channel = getTokenStream().get(--index).getChannel();
        } while (channel != 0 && channel != 1);
        
        return (channel == 1);
	}
}

/// File --> Blocks
//
file		: (terraform | module | provider | resource | data | local | variable | output)* EOF
			;
			
/// Blocks
//
/* Question */
// 
// Do we ever allow an equals sign prior to a block body?
// Answer : No. That makes it a map :  https://github.com/hashicorp/hcl/blob/hcl2/guide/language_design.rst#blocks-vs-object-values)
// Answer : Yes. They are interchangeable : https://www.terraform.io/upgrade-guides/0-12.html
// Answer : Idk. If yes, this parser has bugs in it. Blocks can have nested blocks, while Maps cannot.
//
block			: identifier ( identifier | string )* bodyBegin ( argument | block )* bodyEnd
				;
bodyBegin		// : LCURL { isEOL() }?
 				: LCURL
				;
bodyEnd			// : RCURL { isEOL() }?
 				: RCURL
				;
				
// Terraform's specific top-level Blocks
// 
// Rules of convenience, helps with autocomplete, prediction
//
terraform 		: TERRAFORM               		bodyBegin ( argument | block )* bodyEnd ;
local     		: LOCALS                    	bodyBegin ( argument | block )* bodyEnd ;
module    		: MODULE   blockName  			bodyBegin ( argument | block )* bodyEnd ;   
variable  		: VARIABLE blockName  			bodyBegin ( argument | block )* bodyEnd ;
output    		: OUTPUT   blockName  			bodyBegin ( argument | block )* bodyEnd ;
provider  		: PROVIDER blockType  			bodyBegin ( argument | block )* bodyEnd ; 
resource  		: RESOURCE blockType blockName 	bodyBegin ( argument | block )* bodyEnd ;
data      		: DATA     blockType blockName  bodyBegin ( argument | block )* bodyEnd ;  
blockName		: identifier | string ;
blockType		: identifier | string ;

/// argument
//
argument	: identifier EQUALS expression { isEOL() }?
			;

/// identifiers 
//
/* Question */
// Are keywords on their own, invalid identifiers?
// I may need be stricter here, not allowing solo keywords
// For example:
// validkeyword_prefix	: identifier DOT keyword
// validkeyword_postfix	: keyword DOT identifier
//
identifier	: IDENTIFIER 
			| keyword
			;
keyword		: (FOR | IN | IF | BOOL | NULL)
			| (TERRAFORM | MODULE | PROVIDER | RESOURCE | DATA | LOCALS | VARIABLE | OUTPUT)
			;
			
/// Expressions
//
expression	: negateOp expression
			| expression (arithmeticOp | compareOp | logicOp) expression
			| expression QUESTION expression COLON expression
			| exprTerm accessor*
			;

/// Operators
//
negateOp		: MINUS | NOT
				;
arithmeticOp	: (STAR | DIVIDE | MODULO)
                | (PLUS | MINUS)
				;
compareOp		: (LT | GT | LTE | GTE)
				| (DEQUAL | NEQUAL) 
				;
logicOp			: AND | OR | NOT
				;
			
/// Accessors
//
accessor		: index
				| attr
				| splat
				;
index			: LBRACKET expression RBRACKET
				| DOT INTEGER
				;
attr			: DOT identifier
				;
splat			: attrSplat 
				| fullSplat
				;
attrSplat		: DOT STAR attr*
				;
fullSplat		: LBRACKET STAR RBRACKET ( attr | index )*
				;
				
/// Terms
// 
exprTerm	: literal
			| reference
			| string
			| heredoc
			| function
			| list
			| map
			| forExpr
			| LPAREN expression RPAREN
			;
				
/// Literals
//
literal		: INTEGER
			| FLOAT
			| EXPONENTIAL
			| BOOL
			| NULL
			;
			
/// Reference
//
reference	: identifier
			;
			
/// Functions
//
function		: identifier LPAREN args? RPAREN
				;
args			: expression ( COMMA expression )* ( COMMA | DOTS )?
				;

/// Collections
//
list		: LBRACKET items? RBRACKET 
			;
map			: LCURL (elements | elementsEOL)? RCURL 
			;
items		: expression ( COMMA expression )* COMMA?
			;
elements	: element ( COMMA element )* COMMA?
			;
element		: ( identifier | expression ) ( EQUALS | COLON ) expression
			; 
// this enables map elements delimited by new lines instead of commas
elementsEOL	: elementEOL+ element?
			;
elementEOL	: ( identifier | expression ) ( EQUALS | COLON ) expression { isEOL() }?
			;

/// ForExpr
// 
forExpr			: forList 
				| forMap
				;
forList			: LBRACKET FOR identifier ( COMMA identifier )? IN expression COLON expression (IF expression)? RBRACKET
				;
forMap			: LCURL FOR identifier ( COMMA identifier )? IN expression COLON expression ARROW expression DOTS? (IF expression)? RCURL
				;

/// Quoted Templates
//
string     		: DQUOTE ( STRING_TEXT | ESCAPE_CHAR | interpo | directive )* DQUOTE 
				| SQUOTE ( STRING_TEXT | ESCAPE_CHAR | interpo | directive )* SQUOTE 
				;
heredoc 		: ( HEREDOC_INDENT | HEREDOC ) ( HEREDOC_TEXT | EOL )* CLOSE_HEREDOC 
				;

/// Interpos and Directives
//
interpo		 	: ESCAPE_INTERPO
				| INTERPO_PUSH expression? RCURL
				| DOLLAR 
				;
directive		: ESCAPE_DIRECTIVE
		   		| DIRECTIVE_PUSH expression? RCURL
		   		| MODULO
		   		;