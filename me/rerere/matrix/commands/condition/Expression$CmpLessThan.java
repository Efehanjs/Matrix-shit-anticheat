package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Expression$CmpLessThan extends Expression$NonTerminal {
  private static final long a = o3.a(84809125237139098L, 3687122597696786588L, MethodHandles.lookup().lookupClass()).a(80726197378421L);
  
  @NotNull
  public Object interpret() {
    double d1 = ((Double)this.left.interpret()).doubleValue();
    double d2 = ((Double)this.right.interpret()).doubleValue();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((d1 < d2));
  }
  
  public String toString() {
    long l = a ^ 0x2FA33A3FBAC8L;
    return String.format("(%s < %s)", new Object[] { this.left, this.right });
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\Expression$CmpLessThan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */