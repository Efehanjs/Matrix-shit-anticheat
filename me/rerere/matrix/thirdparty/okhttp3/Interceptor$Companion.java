package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Interceptor$Companion {
  private static final long a = o3.a(-7045439648904432111L, 6173451783430683218L, MethodHandles.lookup().lookupClass()).a(89733937963520L);
  
  static {
    $$INSTANCE = new Interceptor$Companion();
  }
  
  @NotNull
  public final Interceptor invoke(@NotNull Function1 paramFunction1) {
    long l = a ^ 0x3D39CA5A99B4L;
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    boolean bool = false;
    return new Interceptor$Companion$invoke$1(paramFunction1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Interceptor$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */