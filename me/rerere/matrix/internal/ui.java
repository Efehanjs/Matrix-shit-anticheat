package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ui extends Lambda implements Function1 {
  private static final long a = o3.a(-2579372795771406921L, 4291404992483370533L, MethodHandles.lookup().lookupClass()).a(88600334220090L);
  
  @NotNull
  public final Boolean b(@NotNull bh parambh, long paramLong) {
    paramLong = a ^ paramLong;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          parambh.j().invoke(parambh);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((this.i - parambh.j() > 5000L));
  }
  
  public ui(long paramLong) {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\ui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */