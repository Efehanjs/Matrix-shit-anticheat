package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

public final class BouncyCastlePlatform extends Platform {
  @NotNull
  public SSLContext newSSLContext() {
    long l = a ^ 0x4EA4E0F7E256L;
    SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
    Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
    return sSLContext;
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x39E5B7628A6EL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    if (paramSSLSocket instanceof BCSSLSocket) {
      String str = ((BCSSLSocket)paramSSLSocket).getApplicationProtocol();
      try {
      
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      try {
      
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } else {
    
    } 
    return super.getSelectedProtocol(paramSSLSocket);
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x11B6C244768AL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    if (paramSSLSocket instanceof BCSSLSocket) {
      BCSSLParameters bCSSLParameters = ((BCSSLSocket)paramSSLSocket).getParameters();
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
      list3.toArray((Object[])new String[0]).setApplicationProtocols((String[])list3.toArray((Object[])new String[0]));
      ((BCSSLSocket)paramSSLSocket).setParameters(bCSSLParameters);
    } else {
      super.configureTlsExtensions(paramSSLSocket, paramString, paramList);
    } 
  }
  
  @NotNull
  public X509TrustManager platformTrustManager() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/BouncyCastlePlatform.a : J
    //   3: ldc2_w 50162435849885
    //   6: lxor
    //   7: lstore_1
    //   8: ldc 'PKIX'
    //   10: ldc 'BCJSSE'
    //   12: invokestatic getInstance : (Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   15: astore_3
    //   16: aload_3
    //   17: aconst_null
    //   18: checkcast java/security/KeyStore
    //   21: invokevirtual init : (Ljava/security/KeyStore;)V
    //   24: aload_3
    //   25: invokevirtual getTrustManagers : ()[Ljavax/net/ssl/TrustManager;
    //   28: dup
    //   29: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   32: astore #4
    //   34: aload #4
    //   36: arraylength
    //   37: iconst_1
    //   38: if_icmpne -> 66
    //   41: aload #4
    //   43: iconst_0
    //   44: aaload
    //   45: instanceof javax/net/ssl/X509TrustManager
    //   48: ifeq -> 66
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   57: athrow
    //   58: iconst_1
    //   59: goto -> 67
    //   62: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   65: athrow
    //   66: iconst_0
    //   67: ifne -> 104
    //   70: iconst_0
    //   71: istore #5
    //   73: ldc 'Unexpected default trust managers: '
    //   75: aload #4
    //   77: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   80: dup
    //   81: ldc 'toString(this)'
    //   83: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   86: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   89: astore #5
    //   91: new java/lang/IllegalStateException
    //   94: dup
    //   95: aload #5
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: athrow
    //   104: aload #4
    //   106: iconst_0
    //   107: aaload
    //   108: dup
    //   109: ifnonnull -> 127
    //   112: pop
    //   113: new java/lang/NullPointerException
    //   116: dup
    //   117: ldc 'null cannot be cast to non-null type javax.net.ssl.X509TrustManager'
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   126: athrow
    //   127: checkcast javax/net/ssl/X509TrustManager
    //   130: areturn
    // Exception table:
    //   from	to	target	type
    //   34	51	54	java/lang/NullPointerException
    //   41	62	62	java/lang/NullPointerException
    //   104	123	123	java/lang/NullPointerException
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x7D4D8ADFE010L;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
  }
  
  static {
    long l = a ^ 0x2BCBAB77C799L;
    Companion = new BouncyCastlePlatform$Companion(null);
    try {
      Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, Companion.getClass().getClassLoader());
      bool = true;
    } catch (ClassNotFoundException classNotFoundException) {
      bool = false;
    } 
    isSupported = bool;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    boolean bool;
  }
  
  @NotNull
  private final Provider provider = (Provider)new BouncyCastleJsseProvider();
  
  @NotNull
  public static final BouncyCastlePlatform$Companion Companion;
  
  private static final boolean isSupported;
  
  private static final long a = o3.a(2027270507728637913L, -3815654971291694793L, MethodHandles.lookup().lookupClass()).a(71167304503596L);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\BouncyCastlePlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */