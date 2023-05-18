package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DeferredSocketAdapter implements SocketAdapter {
  @NotNull
  private final DeferredSocketAdapter$Factory socketAdapterFactory;
  
  @Nullable
  private SocketAdapter delegate;
  
  private static final long a = o3.a(1852563295011660616L, -8315981582707109223L, MethodHandles.lookup().lookupClass()).a(241779779156351L);
  
  public boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.matchesSocketFactory(this, paramSSLSocketFactory);
  }
  
  public DeferredSocketAdapter(@NotNull DeferredSocketAdapter$Factory paramDeferredSocketAdapter$Factory) {
    this.socketAdapterFactory = paramDeferredSocketAdapter$Factory;
  }
  
  public boolean isSupported() {
    return true;
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x7B4977A94E96L;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
      Intrinsics.checkNotNullParameter(paramList, "protocols");
      if (getDelegate(paramSSLSocket) == null) {
        getDelegate(paramSSLSocket);
      } else {
        getDelegate(paramSSLSocket).configureTlsExtensions(paramSSLSocket, paramString, paramList);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x31136A483D92L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return this.socketAdapterFactory.matchesSocket(paramSSLSocket);
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.trustManager(this, paramSSLSocketFactory);
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x7B495DA3F325L;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
      getDelegate(paramSSLSocket);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (getDelegate(paramSSLSocket) == null) ? null : getDelegate(paramSSLSocket).getSelectedProtocol(paramSSLSocket);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\DeferredSocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */