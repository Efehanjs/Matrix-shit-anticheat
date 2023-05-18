package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.lang.invoke.MethodHandles;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
  @NotNull
  public static final AndroidCertificateChainCleaner$Companion Companion;
  
  @NotNull
  private final X509TrustManagerExtensions x509TrustManagerExtensions;
  
  @NotNull
  private final X509TrustManager trustManager;
  
  private static final long a = o3.a(-1329724959663809179L, -3925626179589375914L, MethodHandles.lookup().lookupClass()).a(260377960530833L);
  
  public int hashCode() {
    return System.identityHashCode(this.trustManager);
  }
  
  static {
    Companion = new AndroidCertificateChainCleaner$Companion(null);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof AndroidCertificateChainCleaner)
        try {
          if (((AndroidCertificateChainCleaner)paramObject).trustManager == this.trustManager);
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  @SuppressSignatureCheck
  @NotNull
  public List clean(@NotNull List paramList, @NotNull String paramString) throws SSLPeerUnverifiedException {
    long l = a ^ 0x551D93543026L;
    Intrinsics.checkNotNullParameter(paramList, "chain");
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    List list1 = paramList;
    boolean bool = false;
    List list2 = list1;
    try {
      if (list2.toArray((Object[])new X509Certificate[0]) == null) {
        list2.toArray((Object[])new X509Certificate[0]);
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      } 
    } catch (CertificateException certificateException) {
      throw a(null);
    } 
    X509Certificate[] arrayOfX509Certificate = (X509Certificate[])list2.toArray((Object[])new X509Certificate[0]);
    try {
      list1 = this.x509TrustManagerExtensions.checkServerTrusted(arrayOfX509Certificate, "RSA", paramString);
      Intrinsics.checkNotNullExpressionValue(list1, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
      return list1;
    } catch (CertificateException certificateException) {
      SSLPeerUnverifiedException sSLPeerUnverifiedException1 = new SSLPeerUnverifiedException(certificateException.getMessage());
      SSLPeerUnverifiedException sSLPeerUnverifiedException2 = sSLPeerUnverifiedException1;
      boolean bool1 = false;
      sSLPeerUnverifiedException2.initCause(certificateException);
      throw sSLPeerUnverifiedException1;
    } 
  }
  
  public AndroidCertificateChainCleaner(@NotNull X509TrustManager paramX509TrustManager, @NotNull X509TrustManagerExtensions paramX509TrustManagerExtensions) {
    this.trustManager = paramX509TrustManager;
    this.x509TrustManagerExtensions = paramX509TrustManagerExtensions;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidCertificateChainCleaner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */