package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Android10SocketAdapter implements SocketAdapter {
  @NotNull
  public static final Android10SocketAdapter$Companion Companion;
  
  private static final long a = o3.a(5844611446210966142L, 2416591109847923094L, MethodHandles.lookup().lookupClass()).a(229491017073159L);
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x2139CA3F61EDL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return SSLSockets.isSupportedSocket(paramSSLSocket);
  }
  
  static {
    Companion = new Android10SocketAdapter$Companion(null);
  }
  
  public boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.matchesSocketFactory(this, paramSSLSocketFactory);
  }
  
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x6B63FDD4AF5AL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    String str = paramSSLSocket.getApplicationProtocol();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ((str == null) ? true : Intrinsics.areEqual(str, "")) ? null : str;
  }
  
  public boolean isSupported() {
    return Companion.isSupported();
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.trustManager(this, paramSSLSocketFactory);
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x6B63D7DE12E9L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    try {
      SSLSockets.setUseSessionTickets(paramSSLSocket, true);
      SSLParameters sSLParameters = paramSSLSocket.getSSLParameters();
      List list1 = Platform.Companion.alpnProtocolNames(paramList);
      boolean bool = false;
      List list2 = list1;
      try {
        if (list2.toArray((Object[])new String[0]) == null) {
          list2.toArray((Object[])new String[0]);
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      list2.toArray((Object[])new String[0]).setApplicationProtocols((String[])list2.toArray((Object[])new String[0]));
      paramSSLSocket.setSSLParameters(sSLParameters);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new IOException("Android internal error", (Throwable)illegalArgumentException);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\Android10SocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */