package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Interceptor$Companion$invoke$1 implements Interceptor {
  private static final long a = o3.a(1234994705022028288L, 8771354783246146630L, MethodHandles.lookup().lookupClass()).a(98236153473146L);
  
  public Interceptor$Companion$invoke$1(Function1 paramFunction1) {}
  
  @NotNull
  public final Response intercept(@NotNull Interceptor$Chain paramInterceptor$Chain) {
    long l = a ^ 0x21D762604952L;
    Intrinsics.checkNotNullParameter(paramInterceptor$Chain, "it");
    return (Response)this.$block.invoke(paramInterceptor$Chain);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Interceptor$Companion$invoke$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */