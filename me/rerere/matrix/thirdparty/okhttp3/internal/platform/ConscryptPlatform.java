package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.conscrypt.Conscrypt;

public final class ConscryptPlatform extends Platform {
  @NotNull
  private final Provider provider;
  
  @NotNull
  public static final ConscryptPlatform$Companion Companion;
  
  private static final boolean isSupported;
  
  private static final long a;
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x2F5D49520D54L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    if (Conscrypt.isConscrypt(paramSSLSocket)) {
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
    } else {
      super.configureTlsExtensions(paramSSLSocket, paramString, paramList);
    } 
  }
  
  @NotNull
  public SSLSocketFactory newSslSocketFactory(@NotNull X509TrustManager paramX509TrustManager) {
    long l = a ^ 0x3E3987E9CF84L;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    SSLContext sSLContext1 = newSSLContext();
    SSLContext sSLContext2 = sSLContext1;
    boolean bool = false;
    TrustManager[] arrayOfTrustManager = new TrustManager[1];
    arrayOfTrustManager[0] = paramX509TrustManager;
    sSLContext2.init(null, arrayOfTrustManager, null);
    SSLSocketFactory sSLSocketFactory = sSLContext1.getSocketFactory();
    Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
    return sSLSocketFactory;
  }
  
  @NotNull
  public X509TrustManager platformTrustManager() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.a : J
    //   3: ldc2_w 21392447571267
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic getDefaultAlgorithm : ()Ljava/lang/String;
    //   11: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   14: astore #4
    //   16: aload #4
    //   18: astore #5
    //   20: iconst_0
    //   21: istore #6
    //   23: aload #5
    //   25: aconst_null
    //   26: checkcast java/security/KeyStore
    //   29: invokevirtual init : (Ljava/security/KeyStore;)V
    //   32: nop
    //   33: aload #4
    //   35: invokevirtual getTrustManagers : ()[Ljavax/net/ssl/TrustManager;
    //   38: dup
    //   39: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   42: astore_3
    //   43: aload_3
    //   44: arraylength
    //   45: iconst_1
    //   46: if_icmpne -> 73
    //   49: aload_3
    //   50: iconst_0
    //   51: aaload
    //   52: instanceof javax/net/ssl/X509TrustManager
    //   55: ifeq -> 73
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   64: athrow
    //   65: iconst_1
    //   66: goto -> 74
    //   69: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   72: athrow
    //   73: iconst_0
    //   74: ifne -> 110
    //   77: iconst_0
    //   78: istore #5
    //   80: ldc 'Unexpected default trust managers: '
    //   82: aload_3
    //   83: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   86: dup
    //   87: ldc 'toString(this)'
    //   89: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   92: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   95: astore #5
    //   97: new java/lang/IllegalStateException
    //   100: dup
    //   101: aload #5
    //   103: invokevirtual toString : ()Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: aload_3
    //   111: iconst_0
    //   112: aaload
    //   113: dup
    //   114: ifnonnull -> 132
    //   117: pop
    //   118: new java/lang/NullPointerException
    //   121: dup
    //   122: ldc 'null cannot be cast to non-null type javax.net.ssl.X509TrustManager'
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: athrow
    //   128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   131: athrow
    //   132: checkcast javax/net/ssl/X509TrustManager
    //   135: astore #4
    //   137: aload #4
    //   139: checkcast javax/net/ssl/TrustManager
    //   142: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform$DisabledHostnameVerifier.INSTANCE : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform$DisabledHostnameVerifier;
    //   145: checkcast org/conscrypt/ConscryptHostnameVerifier
    //   148: invokestatic setHostnameVerifier : (Ljavax/net/ssl/TrustManager;Lorg/conscrypt/ConscryptHostnameVerifier;)V
    //   151: aload #4
    //   153: areturn
    // Exception table:
    //   from	to	target	type
    //   43	58	61	java/lang/NullPointerException
    //   49	69	69	java/lang/NullPointerException
    //   110	128	128	java/lang/NullPointerException
  }
  
  @NotNull
  public SSLContext newSSLContext() {
    long l = a ^ 0x704F6BE19988L;
    SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
    Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
    return sSLContext;
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x70E3C74F1B0L;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Conscrypt.isConscrypt(paramSSLSocket) ? Conscrypt.getApplicationProtocol(paramSSLSocket) : super.getSelectedProtocol(paramSSLSocket);
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -968243856801288815
    //   3: ldc2_w -8425755778110379830
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 246358238848952
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.a : J
    //   26: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.a : J
    //   29: ldc2_w 64181434309718
    //   32: lxor
    //   33: lstore_0
    //   34: new me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform$Companion
    //   37: dup
    //   38: aconst_null
    //   39: invokespecial <init> : (Lme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   42: putstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform$Companion;
    //   45: nop
    //   46: ldc 'org.conscrypt.Conscrypt$Version'
    //   48: iconst_0
    //   49: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform$Companion;
    //   52: invokevirtual getClass : ()Ljava/lang/Class;
    //   55: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   58: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   61: pop
    //   62: nop
    //   63: invokestatic isAvailable : ()Z
    //   66: ifeq -> 89
    //   69: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform$Companion;
    //   72: iconst_2
    //   73: iconst_1
    //   74: iconst_0
    //   75: invokevirtual atLeastVersion : (III)Z
    //   78: ifeq -> 89
    //   81: iconst_1
    //   82: goto -> 90
    //   85: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   88: athrow
    //   89: iconst_0
    //   90: istore_2
    //   91: goto -> 103
    //   94: astore_3
    //   95: iconst_0
    //   96: istore_2
    //   97: goto -> 103
    //   100: astore_3
    //   101: iconst_0
    //   102: istore_2
    //   103: iload_2
    //   104: putstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/ConscryptPlatform.isSupported : Z
    //   107: return
    // Exception table:
    //   from	to	target	type
    //   45	91	94	java/lang/NoClassDefFoundError
    //   45	91	100	java/lang/ClassNotFoundException
    //   69	85	85	java/lang/NoClassDefFoundError
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x43A601C99BCEL;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    return null;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\ConscryptPlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */