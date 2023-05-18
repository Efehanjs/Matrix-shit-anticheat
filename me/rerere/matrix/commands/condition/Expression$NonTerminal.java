package me.rerere.matrix.commands.condition;

public abstract class Expression$NonTerminal implements Expression$BooleanExpression {
  public Expression$BooleanExpression left;
  
  public Expression$BooleanExpression right;
  
  public void setLeft(Expression$BooleanExpression paramExpression$BooleanExpression) {
    this.left = paramExpression$BooleanExpression;
  }
  
  public void setRight(Expression$BooleanExpression paramExpression$BooleanExpression) {
    this.right = paramExpression$BooleanExpression;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$NonTerminal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */