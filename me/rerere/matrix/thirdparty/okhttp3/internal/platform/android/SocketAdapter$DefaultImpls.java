package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SocketAdapter$DefaultImpls {
  private static final long a = o3.a(-5829086010017608935L, -4719380410409841304L, MethodHandles.lookup().lookupClass()).a(229590617832833L);
  
  @Nullable
  public static X509TrustManager trustManager(@NotNull SocketAdapter paramSocketAdapter, @NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x6482593D89DFL;
    Intrinsics.checkNotNullParameter(paramSocketAdapter, "this");
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    return null;
  }
  
  public static boolean matchesSocketFactory(@NotNull SocketAdapter paramSocketAdapter, @NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x6322F0037F55L;
    Intrinsics.checkNotNullParameter(paramSocketAdapter, "this");
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    return false;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\SocketAdapter$DefaultImpls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */