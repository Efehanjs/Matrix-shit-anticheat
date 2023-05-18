package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class wb extends Lambda implements Function1 {
  public static final wb i;
  
  private static final long a = o3.a(1616745625816123818L, 3835361751266881990L, MethodHandles.lookup().lookupClass()).a(221622734582037L);
  
  public wb() {
    super(1);
  }
  
  static {
    i = new wb();
  }
  
  @NotNull
  public final CharSequence b(boolean paramBoolean, long paramLong) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x471CB1734F8AL;
    return nb.b(paramBoolean, l);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */