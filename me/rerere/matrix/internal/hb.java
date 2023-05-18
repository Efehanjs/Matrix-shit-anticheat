package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class hb extends Lambda implements Function1 {
  public static final hb i;
  
  private static final long a = o3.a(5786509358420797751L, -4137566787102146262L, MethodHandles.lookup().lookupClass()).a(187966677288152L);
  
  @NotNull
  public final CharSequence b(long paramLong, boolean paramBoolean) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x143254A05752L;
    return nb.b(paramBoolean, l);
  }
  
  public hb() {
    super(1);
  }
  
  static {
    i = new hb();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\hb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */