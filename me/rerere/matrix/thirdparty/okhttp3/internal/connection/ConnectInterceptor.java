package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Interceptor;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RealInterceptorChain;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ConnectInterceptor implements Interceptor {
  @NotNull
  public static final ConnectInterceptor INSTANCE;
  
  private static final long a = o3.a(4878301572370786401L, 6957030133907096985L, MethodHandles.lookup().lookupClass()).a(260865609322282L);
  
  @NotNull
  public Response intercept(@NotNull Interceptor.Chain paramChain) throws IOException {
    long l = a ^ 0x2CDFE003AB7L;
    Intrinsics.checkNotNullParameter(paramChain, "chain");
    RealInterceptorChain realInterceptorChain1 = (RealInterceptorChain)paramChain;
    Exchange exchange = realInterceptorChain1.getCall$okhttp().initExchange$okhttp((RealInterceptorChain)paramChain);
    RealInterceptorChain realInterceptorChain2 = RealInterceptorChain.copy$okhttp$default(realInterceptorChain1, 0, exchange, null, 0, 0, 0, 61, null);
    return realInterceptorChain2.proceed(realInterceptorChain1.getRequest$okhttp());
  }
  
  static {
    INSTANCE = new ConnectInterceptor();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\ConnectInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */