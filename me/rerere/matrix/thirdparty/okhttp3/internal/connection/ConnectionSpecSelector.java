package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.ConnectionSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ConnectionSpecSelector {
  private boolean isFallback;
  
  @NotNull
  private final List connectionSpecs;
  
  private int nextModeIndex;
  
  private boolean isFallbackPossible;
  
  private static final long a = o3.a(4723109582920387661L, -4135370577726170362L, MethodHandles.lookup().lookupClass()).a(120792869463958L);
  
  @NotNull
  public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket paramSSLSocket) throws IOException {
    long l = a ^ 0xA71BF93B181L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    ConnectionSpec connectionSpec = null;
    int i = this.nextModeIndex;
    int j = this.connectionSpecs.size();
    while (i < j) {
      int k = i;
      i++;
      ConnectionSpec connectionSpec1 = this.connectionSpecs.get(k);
      if (connectionSpec1.isCompatible(paramSSLSocket)) {
        connectionSpec = connectionSpec1;
        this.nextModeIndex = k + 1;
        break;
      } 
    } 
    try {
      if (connectionSpec == null) {
        Intrinsics.checkNotNull(paramSSLSocket.getEnabledProtocols());
        Intrinsics.checkNotNullExpressionValue(Arrays.toString((Object[])paramSSLSocket.getEnabledProtocols()), "toString(this)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + Arrays.toString((Object[])paramSSLSocket.getEnabledProtocols()));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.isFallbackPossible = isFallbackPossible(paramSSLSocket);
    connectionSpec.apply$okhttp(paramSSLSocket, this.isFallback);
    return connectionSpec;
  }
  
  public ConnectionSpecSelector(@NotNull List paramList) {
    this.connectionSpecs = paramList;
  }
  
  public final boolean connectionFailed(@NotNull IOException paramIOException) {
    try {
      Intrinsics.checkNotNullParameter(paramIOException, "e");
      this.isFallback = true;
      try {
        try {
          try {
            if (paramIOException instanceof javax.net.ssl.SSLHandshakeException)
              try {
                if (paramIOException.getCause() instanceof java.security.cert.CertificateException);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !this.isFallbackPossible ? false : ((paramIOException instanceof java.net.ProtocolException) ? false : ((paramIOException instanceof java.io.InterruptedIOException) ? false : ((paramIOException instanceof javax.net.ssl.SSLPeerUnverifiedException) ? false : ((paramIOException instanceof javax.net.ssl.SSLException)))));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\ConnectionSpecSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */