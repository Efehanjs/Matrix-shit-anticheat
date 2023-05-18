package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Handshake$Companion {
  private static final long a = o3.a(-1793439651809915928L, 413463535851425965L, MethodHandles.lookup().lookupClass()).a(87757054862474L);
  
  @NotNull
  public final Handshake get(@NotNull SSLSession paramSSLSession) throws IOException {
    String str1;
    List list2;
    long l = a ^ 0x5E237F3C73E8L;
    Intrinsics.checkNotNullParameter(paramSSLSession, "<this>");
    if (paramSSLSession.getCipherSuite() == null) {
      paramSSLSession.getCipherSuite();
      boolean bool = false;
      String str = "cipherSuite == null";
      throw new IllegalStateException(str.toString());
    } 
    String str2 = str1;
    try {
    
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    try {
      if (Intrinsics.areEqual(str2, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(str2, "SSL_NULL_WITH_NULL_NULL"))
        throw new IOException(Intrinsics.stringPlus("cipherSuite == ", str1)); 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    CipherSuite cipherSuite = CipherSuite.Companion.forJavaName(str1);
    if (paramSSLSession.getProtocol() == null) {
      paramSSLSession.getProtocol();
      boolean bool = false;
      String str = "tlsVersion == null";
      throw new IllegalStateException(str.toString());
    } 
    try {
      if (Intrinsics.areEqual("NONE", str2))
        throw new IOException("tlsVersion == NONE"); 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    TlsVersion tlsVersion = TlsVersion.Companion.forJavaName(str2);
    try {
      list2 = toImmutableList(paramSSLSession.getPeerCertificates());
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      list2 = CollectionsKt.emptyList();
    } 
    List list1 = list2;
    return new Handshake(tlsVersion, cipherSuite, toImmutableList(paramSSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list1));
  }
  
  @NotNull
  public final Handshake get(@NotNull TlsVersion paramTlsVersion, @NotNull CipherSuite paramCipherSuite, @NotNull List paramList1, @NotNull List paramList2) {
    long l = a ^ 0x4915491104FFL;
    Intrinsics.checkNotNullParameter(paramTlsVersion, "tlsVersion");
    Intrinsics.checkNotNullParameter(paramCipherSuite, "cipherSuite");
    Intrinsics.checkNotNullParameter(paramList1, "peerCertificates");
    Intrinsics.checkNotNullParameter(paramList2, "localCertificates");
    List list = Util.toImmutableList(paramList1);
    return new Handshake(paramTlsVersion, paramCipherSuite, Util.toImmutableList(paramList2), new Handshake$Companion$get$1(list));
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sslSession.handshake()", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Handshake -deprecated_get(@NotNull SSLSession paramSSLSession) throws IOException {
    long l = a ^ 0x6196AAED7E4AL;
    Intrinsics.checkNotNullParameter(paramSSLSession, "sslSession");
    return get(paramSSLSession);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Handshake$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */