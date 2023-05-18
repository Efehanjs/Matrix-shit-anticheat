package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.TrustRootIndex;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class AndroidPlatform$CustomTrustRootIndex implements TrustRootIndex {
  @NotNull
  private final X509TrustManager trustManager;
  
  @NotNull
  private final Method findByIssuerAndSignatureMethod;
  
  private static final long a = o3.a(-2723693292102037050L, 2683965470981027523L, MethodHandles.lookup().lookupClass()).a(236771788682825L);
  
  @NotNull
  public final AndroidPlatform$CustomTrustRootIndex copy(@NotNull X509TrustManager paramX509TrustManager, @NotNull Method paramMethod) {
    long l = a ^ 0x708A19FD8A60L;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    Intrinsics.checkNotNullParameter(paramMethod, "findByIssuerAndSignatureMethod");
    return new AndroidPlatform$CustomTrustRootIndex(paramX509TrustManager, paramMethod);
  }
  
  public int hashCode() {
    null = this.trustManager.hashCode();
    return null * 31 + this.findByIssuerAndSignatureMethod.hashCode();
  }
  
  @Nullable
  public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate paramX509Certificate) {
    X509Certificate x509Certificate;
    long l = a ^ 0x3F0E8783E306L;
    Intrinsics.checkNotNullParameter(paramX509Certificate, "cert");
    try {
      Object[] arrayOfObject = new Object[1];
      try {
        arrayOfObject[0] = paramX509Certificate;
        if (this.findByIssuerAndSignatureMethod.invoke(this.trustManager, arrayOfObject) == null) {
          this.findByIssuerAndSignatureMethod.invoke(this.trustManager, arrayOfObject);
          throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } 
      } catch (IllegalAccessException illegalAccessException) {
        throw a(null);
      } 
      TrustAnchor trustAnchor = (TrustAnchor)this.findByIssuerAndSignatureMethod.invoke(this.trustManager, arrayOfObject);
      x509Certificate = trustAnchor.getTrustedCert();
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError("unable to get issues and signature", (Throwable)illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      x509Certificate = (X509Certificate)null;
    } 
    return x509Certificate;
  }
  
  public AndroidPlatform$CustomTrustRootIndex(@NotNull X509TrustManager paramX509TrustManager, @NotNull Method paramMethod) {
    this.trustManager = paramX509TrustManager;
    this.findByIssuerAndSignatureMethod = paramMethod;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof AndroidPlatform$CustomTrustRootIndex))
        return false; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    AndroidPlatform$CustomTrustRootIndex androidPlatform$CustomTrustRootIndex = (AndroidPlatform$CustomTrustRootIndex)paramObject;
    try {
      if (!Intrinsics.areEqual(this.trustManager, androidPlatform$CustomTrustRootIndex.trustManager))
        return false; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.findByIssuerAndSignatureMethod, androidPlatform$CustomTrustRootIndex.findByIssuerAndSignatureMethod))
        return false; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x7911D6106AAFL;
    return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\AndroidPlatform$CustomTrustRootIndex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */