grammar Assign;
assign : ID '=' INT ';' ;
ID : [a-zA-Z]+;
INT : [0-9]+;
WS : [ \t\r\n]+ -> skip ;
