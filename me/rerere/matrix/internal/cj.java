package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class cj extends Lambda implements Function1 {
  public static final cj i;
  
  private static final long a = o3.a(-6899779623013174603L, -5833451754893907447L, MethodHandles.lookup().lookupClass()).a(89473891116881L);
  
  static {
    i = new cj();
  }
  
  @NotNull
  public final Boolean b(@NotNull Pair paramPair, long paramLong) {
    paramLong = a ^ paramLong;
    int i = (int)((paramLong ^ 0x56E74D2FA85L) >>> 32L);
    int j = (int)((paramLong ^ 0x56E74D2FA85L) << 32L >>> 32L);
    paramLong ^ 0x56E74D2FA85L;
    int k = yl.r();
    yl yl = (yl)paramPair.component2();
    try {
      if (k != 0)
        if (yl.b().b(i, j) > 0) {
        
        } else {
          return Boolean.valueOf(false);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public cj() {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */