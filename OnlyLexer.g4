// lexer grammar 表示仅允许词法定义，允许预发定义
lexer grammar OnlyLexer;

// expr:ID('*'|'+')';';
ID:[0-9]+;
