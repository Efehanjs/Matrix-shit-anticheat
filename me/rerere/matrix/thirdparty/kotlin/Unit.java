package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Unit {
  @NotNull
  public static final Unit INSTANCE;
  
  private static final long a = o3.a(4119139541205590580L, -2660249844616301517L, null).a(60664389473313L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x43275962335CL;
    return "me.rerere.matrix.thirdparty.kotlin.Unit";
  }
  
  static {
    INSTANCE = new Unit();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\Unit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */