package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Expression$Or extends Expression$NonTerminal {
  private static final long a = o3.a(4340804890558816582L, -5291907502367379970L, MethodHandles.lookup().lookupClass()).a(232292480945649L);
  
  public String toString() {
    long l = a ^ 0x467C6D07183AL;
    return String.format("(%s | %s)", new Object[] { this.left, this.right });
  }
  
  @NotNull
  public Object interpret() {
    boolean bool1 = ((Boolean)this.left.interpret()).booleanValue();
    boolean bool2 = ((Boolean)this.right.interpret()).booleanValue();
    try {
      if (!bool1) {
        try {
          if (bool2);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return Boolean.valueOf(false);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$Or.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */