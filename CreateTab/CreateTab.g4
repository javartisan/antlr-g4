grammar CreateTab;
@header{
 package CreateTab ;
}


@members{
Interpreter  interp = new Interpreter();
}

table: 'create' 'table' tabName=ID '('
'primary' 'key' key=ID type=ID (',' columns+=ID types+=ID)+ ')'
'location' '=' path=PATH
';'
{
    interp.createTable($tabName.text,$key.text,$columns,$types,$path.text);
}
;


ID : [a-z_]+;
PATH : [a-z/_]+;
WS : [ \t\r\n] -> skip;