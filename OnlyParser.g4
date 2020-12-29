// parser grammar 只允许定义语法规则，不允许定义词法规则。
parser grammar OnlyParser ; 

expr:ID('*'|'+')';';
ID:[0-9]+;
