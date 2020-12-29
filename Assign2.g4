/**
 * assign 方法是根据 assign 规则生成的
 */
void assign() {
  match(ID);  // compare ID to current input symbol then consume
  match('=');
  expr();     // match an expression by calling expr()
  match(';');
}

