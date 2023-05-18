package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
  @NotNull
  public static final StandardAndroidSocketAdapter$Companion Companion;
  
  @NotNull
  private final Class sslSocketFactoryClass;
  
  @NotNull
  private final Class paramClass;
  
  private static final long b = o3.a(-2672265423335496356L, -6215548542696876746L, MethodHandles.lookup().lookupClass()).a(9630527416315L);
  
  public StandardAndroidSocketAdapter(@NotNull Class paramClass1, @NotNull Class paramClass2, @NotNull Class paramClass3) {
    super(paramClass1);
    this.sslSocketFactoryClass = paramClass2;
    this.paramClass = paramClass3;
  }
  
  static {
    Companion = new StandardAndroidSocketAdapter$Companion(null);
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = b ^ 0x2D342288EC45L;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    Object object = Util.readFieldOrNull(paramSSLSocketFactory, this.paramClass, "sslParameters");
    Intrinsics.checkNotNull(object);
    X509TrustManager x509TrustManager = (X509TrustManager)Util.readFieldOrNull(object, X509TrustManager.class, "x509TrustManager");
    try {
      if (x509TrustManager == null);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (X509TrustManager)Util.readFieldOrNull(object, X509TrustManager.class, "trustManager");
  }
  
  public boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = b ^ 0x4C50A1B36E9DL;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    return this.sslSocketFactoryClass.isInstance(paramSSLSocketFactory);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\StandardAndroidSocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */