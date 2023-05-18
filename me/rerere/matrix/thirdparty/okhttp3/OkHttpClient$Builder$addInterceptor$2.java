package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class OkHttpClient$Builder$addInterceptor$2 implements Interceptor {
  private static final long a = o3.a(-596948306569454920L, -4126961021218303217L, MethodHandles.lookup().lookupClass()).a(121979891992749L);
  
  public OkHttpClient$Builder$addInterceptor$2(Function1 paramFunction1) {}
  
  @NotNull
  public final Response intercept(@NotNull Interceptor$Chain paramInterceptor$Chain) {
    long l = a ^ 0x573F223471A4L;
    Intrinsics.checkNotNullParameter(paramInterceptor$Chain, "chain");
    return (Response)this.$block.invoke(paramInterceptor$Chain);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\OkHttpClient$Builder$addInterceptor$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */