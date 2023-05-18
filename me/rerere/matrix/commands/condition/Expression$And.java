package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Expression$And extends Expression$NonTerminal {
  private static final long a = o3.a(-1223806969323682870L, 4292505328487449601L, MethodHandles.lookup().lookupClass()).a(93975236132261L);
  
  public String toString() {
    long l = a ^ 0x247F271F3F55L;
    return String.format("(%s & %s)", new Object[] { this.left, this.right });
  }
  
  @NotNull
  public Object interpret() {
    boolean bool1 = ((Boolean)this.left.interpret()).booleanValue();
    boolean bool2 = ((Boolean)this.right.interpret()).booleanValue();
    try {
      if (bool1)
        try {
          if (bool2);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf(false);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$And.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */