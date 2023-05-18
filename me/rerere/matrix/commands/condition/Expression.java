package me.rerere.matrix.commands.condition;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class Expression {
  private final Expression$BooleanExpression expression;
  
  public Expression(@NotNull String paramString) {
    Expression$BooleanLexer expression$BooleanLexer = new Expression$BooleanLexer(paramString);
    Expression$BooleanParser expression$BooleanParser = new Expression$BooleanParser(expression$BooleanLexer);
    this.expression = expression$BooleanParser.build();
  }
  
  public String toString() {
    return this.expression.toString();
  }
  
  public boolean evaluate() {
    return ((Boolean)this.expression.interpret()).booleanValue();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */