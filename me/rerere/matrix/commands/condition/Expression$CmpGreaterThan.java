package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Expression$CmpGreaterThan extends Expression$NonTerminal {
  private static final long a = o3.a(6890704528434933182L, -3814250670498169411L, MethodHandles.lookup().lookupClass()).a(66816471913241L);
  
  public String toString() {
    long l = a ^ 0x154F7140ECE7L;
    return String.format("(%s > %s)", new Object[] { this.left, this.right });
  }
  
  @NotNull
  public Object interpret() {
    double d1 = ((Double)this.left.interpret()).doubleValue();
    double d2 = ((Double)this.right.interpret()).doubleValue();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((d1 > d2));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$CmpGreaterThan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */