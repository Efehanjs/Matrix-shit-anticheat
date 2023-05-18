package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.BasicCertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.BasicTrustRootIndex;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.TrustRootIndex;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class Platform {
  @NotNull
  private static volatile Platform platform;
  
  private static final Logger logger;
  
  public static final int INFO = 4;
  
  public static final int WARN = 5;
  
  @NotNull
  public static final Platform$Companion Companion;
  
  private static final long b = o3.a(2311441009431108834L, -2115250846354558667L, MethodHandles.lookup().lookupClass()).a(223775282768844L);
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    X509TrustManager x509TrustManager;
    long l = b ^ 0x385A3C66AA8EL;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    try {
      Object object;
      Class<?> clazz = Class.forName("sun.security.ssl.SSLContextImpl");
      try {
        Intrinsics.checkNotNullExpressionValue(clazz, "sslContextClass");
        if (Util.readFieldOrNull(paramSSLSocketFactory, clazz, "context") == null) {
          Util.readFieldOrNull(paramSSLSocketFactory, clazz, "context");
          return null;
        } 
      } catch (ClassNotFoundException classNotFoundException) {
        throw b(null);
      } 
      x509TrustManager = (X509TrustManager)Util.readFieldOrNull(object, X509TrustManager.class, "trustManager");
    } catch (ClassNotFoundException classNotFoundException) {
      x509TrustManager = (X509TrustManager)null;
    } catch (RuntimeException runtimeException) {
      try {
        if (!Intrinsics.areEqual(runtimeException.getClass().getName(), "java.lang.reflect.InaccessibleObjectException"))
          throw runtimeException; 
      } catch (ClassNotFoundException classNotFoundException) {
        throw b(null);
      } 
      x509TrustManager = (X509TrustManager)null;
    } 
    return x509TrustManager;
  }
  
  @NotNull
  public final String getPrefix() {
    long l = b ^ 0x6C20A578F983L;
    return "OkHttp";
  }
  
  public boolean isCleartextTrafficPermitted(@NotNull String paramString) {
    long l = b ^ 0x7857FD1C2339L;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    return true;
  }
  
  public void afterHandshake(@NotNull SSLSocket paramSSLSocket) {
    long l = b ^ 0x381B47AA1FD1L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
  }
  
  @NotNull
  public static final Platform get() {
    return Companion.get();
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x54D8CE6E09EAL;
    String str = getClass().getSimpleName();
    Intrinsics.checkNotNullExpressionValue(str, "javaClass.simpleName");
    return str;
  }
  
  @NotNull
  public SSLContext newSSLContext() {
    long l = b ^ 0xBB3564EA8C8L;
    SSLContext sSLContext = SSLContext.getInstance("TLS");
    Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
    return sSLContext;
  }
  
  @NotNull
  public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager paramX509TrustManager) {
    long l = b ^ 0x36C778C6FC0BL;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    return (CertificateChainCleaner)new BasicCertificateChainCleaner(buildTrustRootIndex(paramX509TrustManager));
  }
  
  @NotNull
  public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager paramX509TrustManager) {
    long l = b ^ 0x1041FDCD0CA4L;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    X509Certificate[] arrayOfX509Certificate2 = paramX509TrustManager.getAcceptedIssuers();
    Intrinsics.checkNotNullExpressionValue(arrayOfX509Certificate2, "trustManager.acceptedIssuers");
    X509Certificate[] arrayOfX509Certificate1 = arrayOfX509Certificate2;
    return (TrustRootIndex)new BasicTrustRootIndex(Arrays.<X509Certificate>copyOf(arrayOfX509Certificate1, arrayOfX509Certificate1.length));
  }
  
  public void connectSocket(@NotNull Socket paramSocket, @NotNull InetSocketAddress paramInetSocketAddress, int paramInt) throws IOException {
    long l = b ^ 0x664F02A9672EL;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    Intrinsics.checkNotNullParameter(paramInetSocketAddress, "address");
    paramSocket.connect(paramInetSocketAddress, paramInt);
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = b ^ 0x54A174FD3C14L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
  }
  
  @Nullable
  public Object getStackTraceForCloseable(@NotNull String paramString) {
    long l = b ^ 0x2249985FA8L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "closer");
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return logger.isLoggable(Level.FINE) ? new Throwable(paramString) : null;
  }
  
  public void logCloseableLeak(@NotNull String paramString, @Nullable Object paramObject) {
    long l = b ^ 0x278D815303EFL;
    Intrinsics.checkNotNullParameter(paramString, "message");
    String str = paramString;
    if (paramObject == null)
      str = Intrinsics.stringPlus(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"); 
    log(str, 5, (Throwable)paramObject);
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = b ^ 0x7CF201DBC0F0L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return null;
  }
  
  @NotNull
  public X509TrustManager platformTrustManager() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform.b : J
    //   3: ldc2_w 114937293845507
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic getDefaultAlgorithm : ()Ljava/lang/String;
    //   11: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   14: astore_3
    //   15: aload_3
    //   16: aconst_null
    //   17: checkcast java/security/KeyStore
    //   20: invokevirtual init : (Ljava/security/KeyStore;)V
    //   23: aload_3
    //   24: invokevirtual getTrustManagers : ()[Ljavax/net/ssl/TrustManager;
    //   27: dup
    //   28: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   31: astore #4
    //   33: aload #4
    //   35: arraylength
    //   36: iconst_1
    //   37: if_icmpne -> 65
    //   40: aload #4
    //   42: iconst_0
    //   43: aaload
    //   44: instanceof javax/net/ssl/X509TrustManager
    //   47: ifeq -> 65
    //   50: goto -> 57
    //   53: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: iconst_1
    //   58: goto -> 66
    //   61: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: iconst_0
    //   66: ifne -> 105
    //   69: iconst_0
    //   70: istore #5
    //   72: ldc_w 'Unexpected default trust managers: '
    //   75: aload #4
    //   77: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   80: dup
    //   81: ldc_w 'toString(this)'
    //   84: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   87: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   90: astore #5
    //   92: new java/lang/IllegalStateException
    //   95: dup
    //   96: aload #5
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: athrow
    //   105: aload #4
    //   107: iconst_0
    //   108: aaload
    //   109: dup
    //   110: ifnonnull -> 129
    //   113: pop
    //   114: new java/lang/NullPointerException
    //   117: dup
    //   118: ldc_w 'null cannot be cast to non-null type javax.net.ssl.X509TrustManager'
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: athrow
    //   125: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: checkcast javax/net/ssl/X509TrustManager
    //   132: areturn
    // Exception table:
    //   from	to	target	type
    //   33	50	53	java/lang/RuntimeException
    //   40	61	61	java/lang/RuntimeException
    //   105	125	125	java/lang/RuntimeException
  }
  
  public void log(@NotNull String paramString, int paramInt, @Nullable Throwable paramThrowable) {
    long l = b ^ 0x7AD407E3B5D2L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "message");
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Level level = (paramInt == 5) ? Level.WARNING : Level.INFO;
    logger.log(level, paramString, paramThrowable);
  }
  
  @NotNull
  public SSLSocketFactory newSslSocketFactory(@NotNull X509TrustManager paramX509TrustManager) {
    long l = b ^ 0x45C5BA46FEC4L;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    try {
      SSLContext sSLContext1 = newSSLContext();
      SSLContext sSLContext2 = sSLContext1;
      boolean bool = false;
      TrustManager[] arrayOfTrustManager = new TrustManager[1];
      arrayOfTrustManager[0] = paramX509TrustManager;
      sSLContext2.init(null, arrayOfTrustManager, null);
      SSLSocketFactory sSLSocketFactory = sSLContext1.getSocketFactory();
      Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
      return sSLSocketFactory;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", generalSecurityException), (Throwable)generalSecurityException);
    } 
  }
  
  static {
    Companion = new Platform$Companion(null);
    platform = Platform$Companion.access$findPlatform(Companion);
    logger = Logger.getLogger(OkHttpClient.class.getName());
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Platform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */