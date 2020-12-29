grammar Hello;

// 字母小写的是解析规则
r : 'hello'  ID ;

// 字母大写的是词法规则
ID : [a-z]+ ;

// -> 是命令执行 ，其中skip是antlr里面的跳过命令
WS : [ \t\r\n]+ -> skip ;