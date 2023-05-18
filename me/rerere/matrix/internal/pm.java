package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.time.Duration;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class pm extends Lambda implements Function1 {
  private static final long a = o3.a(-7315470058105056617L, -7591731927531610917L, MethodHandles.lookup().lookupClass()).a(193215869253254L);
  
  public pm(long paramLong1, long paramLong2) {
    super(1);
  }
  
  @NotNull
  public final Boolean b(short paramShort1, short paramShort2, int paramInt, @NotNull d paramd) {
    long l = (paramShort1 << 48L | paramShort2 << 48L >>> 16L | paramInt << 32L >>> 32L) ^ a;
    int i = yl.r();
    try {
      if (i != 0)
        if (paramd.j() + Duration.getInWholeMilliseconds-impl(this.b) < this.i) {
        
        } else {
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */