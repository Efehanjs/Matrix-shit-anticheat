package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.BouncyCastlePlatform;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class BouncyCastleSocketAdapter implements SocketAdapter {
  @NotNull
  public static final BouncyCastleSocketAdapter$Companion Companion;
  
  @NotNull
  private static final DeferredSocketAdapter$Factory factory;
  
  private static final long a = o3.a(-2359921823344555090L, 3138181068713585164L, MethodHandles.lookup().lookupClass()).a(34034179408896L);
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x121255EB71B1L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    if (matchesSocket(paramSSLSocket)) {
      BCSSLSocket bCSSLSocket = (BCSSLSocket)paramSSLSocket;
      BCSSLParameters bCSSLParameters = bCSSLSocket.getParameters();
      List list1 = Platform.Companion.alpnProtocolNames(paramList);
      boolean bool = false;
      List list2 = list1;
      try {
        if (list2.toArray((Object[])new String[0]) == null) {
          list2.toArray((Object[])new String[0]);
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      list2.toArray((Object[])new String[0]).setApplicationProtocols((String[])list2.toArray((Object[])new String[0]));
      bCSSLSocket.setParameters(bCSSLParameters);
    } 
  }
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x5848480A02B5L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return paramSSLSocket instanceof BCSSLSocket;
  }
  
  public boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.matchesSocketFactory(this, paramSSLSocketFactory);
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x12127FE1CC02L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    BCSSLSocket bCSSLSocket = (BCSSLSocket)paramSSLSocket;
    String str = bCSSLSocket.getApplicationProtocol();
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return ((str == null) ? true : Intrinsics.areEqual(str, "")) ? null : str;
  }
  
  static {
    Companion = new BouncyCastleSocketAdapter$Companion(null);
    factory = new BouncyCastleSocketAdapter$Companion$factory$1();
  }
  
  public boolean isSupported() {
    return BouncyCastlePlatform.Companion.isSupported();
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.trustManager(this, paramSSLSocketFactory);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\BouncyCastleSocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */