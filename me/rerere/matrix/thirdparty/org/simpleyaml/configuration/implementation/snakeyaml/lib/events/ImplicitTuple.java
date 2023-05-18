package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class ImplicitTuple {
  private final boolean nonPlain;
  
  private final boolean plain;
  
  private static final long a = o3.a(7001420935553389891L, -4706830777262418655L, MethodHandles.lookup().lookupClass()).a(54809781518431L);
  
  public boolean canOmitTagInPlainScalar() {
    return this.plain;
  }
  
  public boolean bothFalse() {
    try {
      if (!this.plain)
        try {
          if (!this.nonPlain);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean canOmitTagInNonPlainScalar() {
    return this.nonPlain;
  }
  
  public ImplicitTuple(boolean paramBoolean1, boolean paramBoolean2) {
    this.plain = paramBoolean1;
    this.nonPlain = paramBoolean2;
  }
  
  public String toString() {
    long l = a ^ 0x3203B6432E89L;
    return "implicit=[" + this.plain + ", " + this.nonPlain + "]";
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\ImplicitTuple.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */