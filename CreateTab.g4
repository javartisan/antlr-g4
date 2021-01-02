grammar CreateTab;
table: 'create' 'table' tabName=ID '{'
'primary' 'key' key=ID (',' columns+=ID)+ '}' ';'
{ interp.createTable($tabName.text,$key.text,$columns);}
;


ID : [a-z]+;