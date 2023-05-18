package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.lang.invoke.MethodHandles;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class AndroidCertificateChainCleaner$Companion {
  private static final long a = o3.a(6608099531014723630L, -6375375681005579346L, MethodHandles.lookup().lookupClass()).a(275902082534601L);
  
  @SuppressSignatureCheck
  @Nullable
  public final AndroidCertificateChainCleaner buildIfSupported(@NotNull X509TrustManager paramX509TrustManager) {
    X509TrustManagerExtensions x509TrustManagerExtensions2;
    long l = a ^ 0x279D786C675EL;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    try {
      x509TrustManagerExtensions2 = new X509TrustManagerExtensions(paramX509TrustManager);
    } catch (IllegalArgumentException illegalArgumentException) {
      x509TrustManagerExtensions2 = (X509TrustManagerExtensions)null;
    } 
    X509TrustManagerExtensions x509TrustManagerExtensions1 = x509TrustManagerExtensions2;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (x509TrustManagerExtensions1 != null) ? new AndroidCertificateChainCleaner(paramX509TrustManager, x509TrustManagerExtensions1) : null;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidCertificateChainCleaner$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */