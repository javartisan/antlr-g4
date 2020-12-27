grammar Hello;

// 字母小写的是规则
// 字母大写的是词法

r : 'hello'  ID ;
ID : [a-z]+ ;

// -> 是命令执行 ，其中skip是antlr里面的跳过命令
WS : [ \t\r\n]+ -> skip ;