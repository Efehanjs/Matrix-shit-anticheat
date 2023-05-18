package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Expression$Not extends Expression$NonTerminal {
  private static final long a = o3.a(-7990835407633435200L, 1660960404015195033L, MethodHandles.lookup().lookupClass()).a(227797652421474L);
  
  @NotNull
  public Object interpret() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return Boolean.valueOf(!((Boolean)this.left.interpret()).booleanValue());
  }
  
  public String toString() {
    long l = a ^ 0x6E028E5365B9L;
    return String.format("!%s", new Object[] { this.left });
  }
  
  public void setRight(Expression$BooleanExpression paramExpression$BooleanExpression) {
    throw new UnsupportedOperationException();
  }
  
  public void setChild(Expression$BooleanExpression paramExpression$BooleanExpression) {
    setLeft(paramExpression$BooleanExpression);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$Not.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */