package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.ConscryptPlatform;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.conscrypt.Conscrypt;

public final class ConscryptSocketAdapter implements SocketAdapter {
  @NotNull
  private static final DeferredSocketAdapter$Factory factory;
  
  @NotNull
  public static final ConscryptSocketAdapter$Companion Companion;
  
  private static final long a = o3.a(1336249288930527923L, 7929077049489057510L, MethodHandles.lookup().lookupClass()).a(101197268430379L);
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x2594B7E36649L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return Conscrypt.isConscrypt(paramSSLSocket);
  }
  
  public boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.matchesSocketFactory(this, paramSSLSocketFactory);
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x6FCE8008A8FEL;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return matchesSocket(paramSSLSocket) ? Conscrypt.getApplicationProtocol(paramSSLSocket) : null;
  }
  
  public boolean isSupported() {
    return ConscryptPlatform.Companion.isSupported();
  }
  
  static {
    Companion = new ConscryptSocketAdapter$Companion(null);
    factory = new ConscryptSocketAdapter$Companion$factory$1();
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x6FCEAA02154DL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    if (matchesSocket(paramSSLSocket)) {
      Conscrypt.setUseSessionTickets(paramSSLSocket, true);
      List list1 = Platform.Companion.alpnProtocolNames(paramList);
      List list2 = list1;
      boolean bool = false;
      List list3 = list2;
      try {
        if (list3.toArray((Object[])new String[0]) == null) {
          list3.toArray((Object[])new String[0]);
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      Conscrypt.setApplicationProtocols((SSLSocket)list3.toArray((Object[])new String[0]), (String[])list3.toArray((Object[])new String[0]));
    } 
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.trustManager(this, paramSSLSocketFactory);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\ConscryptSocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */