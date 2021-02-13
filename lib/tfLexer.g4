lexer grammar tfLexer;

@lexer::members {
    int nesting = 0;
    String heredocId = "";
}

// HCL Native Syntax Specification
// https://github.com/hashicorp/hcl/blob/hcl2/hclsyntax/spec.md

/// Whitespace and newlines
//
// [1] = all EOL chars
// [2] = all WS chars
//
EOL				: ('\r\n' | '\n' | '\r') -> channel(1) ;
WS 				: [ \t]+ -> channel(2) ;
//
// [3] = all Comments
//
LINECOMMENT		: ('//'+ | '#'+) ~[\r\n]*  -> channel(3) ;
INLINECOMMENT 	: '/*' .*? '*/' -> channel(3) ;

/// Keywords (also valid identifiers, in certain contexts, but not others?)
// 
FOR 			: 'for' ;
IN 				: 'in' ;
IF				: 'if' ;
BOOL 			: 'true' | 'false' ;
NULL			: 'null' ;
//
TERRAFORM 		: 'terraform' ;
MODULE 			: 'module' ;
PROVIDER 		: 'provider' ;
RESOURCE 		: 'resource' ;
DATA 			: 'data' ;
LOCALS 			: 'locals' ;
VARIABLE 		: 'variable' ;
OUTPUT 			: 'output' ;

//// Operators
/// 
/// Arithmetic
//
PLUS			: '+' ;
MINUS			: '-' ;
STAR 			: '*' ;
DIVIDE			: '/' ;
///
/// Comparison
//
LT				: '<' ;
GT				: '>' ;
LTE				: '<=' ;
GTE				: '>=' ;
DEQUAL			: '==' ;
NEQUAL			: '!=' ;
///
/// Logic
// 
AND				: '&&' ;
OR				: '||' ;
NOT				: '!' ;
///
/// Ternary
//
QUESTION	 	: '?' ;
COLON 			: ':' ;
///
/// Assignments
//
EQUALS 			: '=' ;
ARROW			: '=>' ;
///
/// Blocks
//
LCURL 			: '{' ;
RCURL 			: '~'? '}' {
	if (nesting > 0) {
        nesting--;
        popMode();
    }
};
///
/// Lists
//
LBRACKET 		: '[' ;
RBRACKET 		: ']' ;
///
//
LPAREN 			: '(' ;
RPAREN 			: ')' ;
///
/// Misc
//
DOTS			: '...' ;
DOT				: '.' ;
COMMA 			: ',' ;

/// Numbers
//
INTEGER			: [0-9]+ ;
FLOAT			: [0-9]+ ('.' [0-9]+) ;
EXPONENTIAL		: [0-9]+ ('.' [0-9]+)? ('e' | 'E') ('+' | '-')? [0-9]+ ;

/// Identifiers
//
IDENTIFIER 		: [a-zA-Z_] ([a-zA-Z0-9_-])* ;

/// Heredocs
//
HEREDOC_INDENT	: '<<-' IDENTIFIER {
	heredocId = getText().substring(3);
	pushMode(PARSE_HEREDOC);
} ;
HEREDOC	: '<<' IDENTIFIER {
	heredocId = getText().substring(2);
	pushMode(PARSE_HEREDOC);
} ;

/// Interpolations
//
ESCAPE_INTERPO	: '$${' ;
INTERPO_PUSH	: '${' '~'? {
    nesting++;
    pushMode(DEFAULT_MODE);
};

/// Directives
//
ESCAPE_DIRECTIVE	: '%%{' ;
DIRECTIVE_PUSH		: '%{' '~'? {
    nesting++;
    pushMode(DEFAULT_MODE);
};

/// Specials
//
DOLLAR			: '$' ;
MODULO			: '%' ;

/// Strings
//
DQUOTE			: '"' -> pushMode(PARSE_DQUOTEDTEMPLATE) ;
SQUOTE			: '\''-> pushMode(PARSE_SQUOTEDTEMPLATE) ;

mode PARSE_DQUOTEDTEMPLATE ;

/// Text
//
STRING_TEXT		: ~('$'|'%'|'\\'|'"')+ ;

/// Specials
//
// Bug : A string started with '"' could be ended with '\''
//
ESCAPE_CHAR		: '\\' . ;
DOLLAR_			: '$' -> type(DOLLAR);
PERCENT_		: '%' -> type(MODULO);
DQUOTE_			: '"'  -> type(DQUOTE), popMode ;

/// Interpolations
//
ESCAPE_INTERPO_	: '$${' -> type(ESCAPE_INTERPO);
INTERPO_PUSH_	: '${' '~'? {
    nesting++;
    pushMode(DEFAULT_MODE);
} -> type(INTERPO_PUSH);

/// Directives
//
ESCAPE_DIRECTIVE_	: '%%{' -> type(ESCAPE_DIRECTIVE);
DIRECTIVE_PUSH_		: '%{' '~'? {
    nesting++;
    pushMode(DEFAULT_MODE);
} -> type(DIRECTIVE_PUSH);

mode PARSE_SQUOTEDTEMPLATE ;

/// Text
//
STRING_TEXT_		: ~('$'|'%'|'\\'|'\'')+ ;

/// Specials
//
// Bug : A string started with '"' could be ended with '\''
//
ESCAPE_CHAR_	: '\\' . ;
DOLLAR__		: '$' -> type(DOLLAR);
PERCENT__		: '%' -> type(MODULO);
SQUOTE__		: '\''  -> type(SQUOTE), popMode ;

/// Interpolations
//
ESCAPE_INTERPO__	: '$${' -> type(ESCAPE_INTERPO);
INTERPO_PUSH__		: '${' '~'? {
    nesting++;	
    pushMode(DEFAULT_MODE);
} -> type(INTERPO_PUSH);

/// Directives
//
ESCAPE_DIRECTIVE__	: '%%{' -> type(ESCAPE_DIRECTIVE);
DIRECTIVE_PUSH__	: '%{' '~'? {
    nesting++;
    pushMode(DEFAULT_MODE);
} -> type(DIRECTIVE_PUSH);


/// Heredocs actually contain expressions
// 
// Right now I'm just parsing them as plaintext
//
mode PARSE_HEREDOC;

/// Heredoc Text
//
HEREDOC_TEXT	: ~('\r'|'\n')+ ;

/// In Heredocs we read EOL in main channel
//
EOL_			: ('\r\n' | '\n' | '\r') -> type(EOL);

CLOSE_HEREDOC	: EOL_+ [ \t]*? IDENTIFIER { getText().trim().equals(heredocId) }? { 
	popMode();
};