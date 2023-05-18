package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class hi extends Lambda implements Function1 {
  private static final long a = o3.a(-762001010793498481L, -996425844131291851L, MethodHandles.lookup().lookupClass()).a(49970260663951L);
  
  public hi(long paramLong) {
    super(1);
  }
  
  @NotNull
  public final Boolean b(long paramLong, @NotNull dk paramdk) {
    paramLong = a ^ paramLong;
    int i = yl.a();
    try {
      if (i == 0)
        if (this.i - paramdk.b() >= 2500L) {
        
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\hi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */