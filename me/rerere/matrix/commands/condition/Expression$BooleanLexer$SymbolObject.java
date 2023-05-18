package me.rerere.matrix.commands.condition;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class Expression$BooleanLexer$SymbolObject {
  private final Expression$BooleanLexer$Symbol symbol;
  
  private final Double data;
  
  public Expression$BooleanLexer$SymbolObject(Expression$BooleanLexer$Symbol paramExpression$BooleanLexer$Symbol, @Nullable Double paramDouble) {
    this.symbol = paramExpression$BooleanLexer$Symbol;
    this.data = Double.valueOf((paramDouble == null) ? 0.0D : paramDouble.doubleValue());
  }
  
  public Expression$BooleanLexer$Symbol getSymbol() {
    return this.symbol;
  }
  
  public double getData() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.data != null) ? this.data.doubleValue() : 0.0D;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$BooleanLexer$SymbolObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */