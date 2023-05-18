package me.rerere.matrix.thirdparty.okhttp3.internal.tls;

import java.lang.invoke.MethodHandles;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Utf8;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class OkHostnameVerifier implements HostnameVerifier {
  @NotNull
  public static final OkHostnameVerifier INSTANCE;
  
  private static final int ALT_DNS_NAME = 2;
  
  private static final int ALT_IPA_NAME = 7;
  
  private static final long a = o3.a(3798736339746089960L, 5441903113814297614L, MethodHandles.lookup().lookupClass()).a(109062825903847L);
  
  static {
    INSTANCE = new OkHostnameVerifier();
  }
  
  public final boolean verify(@NotNull String paramString, @NotNull X509Certificate paramX509Certificate) {
    long l = a ^ 0x4B64ED866A8DL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "host");
      Intrinsics.checkNotNullParameter(paramX509Certificate, "certificate");
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Util.canParseAsIpAddress(paramString) ? verifyIpAddress(paramString, paramX509Certificate) : verifyHostname(paramString, paramX509Certificate);
  }
  
  @NotNull
  public final List allSubjectAltNames(@NotNull X509Certificate paramX509Certificate) {
    long l = a ^ 0x135B116C6419L;
    Intrinsics.checkNotNullParameter(paramX509Certificate, "certificate");
    List list1 = getSubjectAltNames(paramX509Certificate, 7);
    List list2 = getSubjectAltNames(paramX509Certificate, 2);
    return CollectionsKt.plus(list1, list2);
  }
  
  public boolean verify(@NotNull String paramString, @NotNull SSLSession paramSSLSession) {
    long l = a ^ 0x388DF442D3C4L;
    try {
      boolean bool;
      Intrinsics.checkNotNullParameter(paramString, "host");
      Intrinsics.checkNotNullParameter(paramSSLSession, "session");
      try {
        try {
          if (paramSSLSession.getPeerCertificates()[0] == null) {
            paramSSLSession.getPeerCertificates()[0];
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
          } 
        } catch (SSLException sSLException) {
          throw a(null);
        } 
        bool = paramString.verify((String)paramSSLSession.getPeerCertificates()[0], (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
      } catch (SSLException sSLException) {
        bool = false;
      } 
    } catch (SSLException sSLException) {
      throw a(null);
    } 
    return !isAscii(paramString) ? false : bool;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\tls\OkHostnameVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */