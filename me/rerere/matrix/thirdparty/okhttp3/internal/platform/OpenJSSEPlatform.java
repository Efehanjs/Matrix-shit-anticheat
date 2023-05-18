package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.openjsse.javax.net.ssl.SSLSocket;
import org.openjsse.net.ssl.OpenJSSE;

public final class OpenJSSEPlatform extends Platform {
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x20F7EF9FAF39L;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    if (paramSSLSocket instanceof SSLSocket) {
      String str = ((SSLSocket)paramSSLSocket).getApplicationProtocol();
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
    long l = a ^ 0x8A49AB953DDL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    if (paramSSLSocket instanceof SSLSocket) {
      SSLParameters sSLParameters = ((SSLSocket)paramSSLSocket).getSSLParameters();
      if (sSLParameters instanceof org.openjsse.javax.net.ssl.SSLParameters) {
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
        ((SSLSocket)paramSSLSocket).setSSLParameters(sSLParameters);
      } 
    } else {
      super.configureTlsExtensions(paramSSLSocket, paramString, paramList);
    } 
  }
  
  static {
    long l = a ^ 0x69B14B37DD8AL;
    Companion = new OpenJSSEPlatform$Companion(null);
    try {
      Class.forName("org.openjsse.net.ssl.OpenJSSE", false, Companion.getClass().getClassLoader());
      bool = true;
    } catch (ClassNotFoundException classNotFoundException) {
      bool = false;
    } 
    isSupported = bool;
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x645FD222C547L;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
  }
  
  @NotNull
  public SSLContext newSSLContext() {
    long l = a ^ 0x57B6B80AC701L;
    SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.provider);
    Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
    return sSLContext;
  }
  
  @NotNull
  public X509TrustManager platformTrustManager() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/OpenJSSEPlatform.a : J
    //   3: ldc2_w 57780242635722
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic getDefaultAlgorithm : ()Ljava/lang/String;
    //   11: aload_0
    //   12: getfield provider : Ljava/security/Provider;
    //   15: invokestatic getInstance : (Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/TrustManagerFactory;
    //   18: astore_3
    //   19: aload_3
    //   20: aconst_null
    //   21: checkcast java/security/KeyStore
    //   24: invokevirtual init : (Ljava/security/KeyStore;)V
    //   27: aload_3
    //   28: invokevirtual getTrustManagers : ()[Ljavax/net/ssl/TrustManager;
    //   31: dup
    //   32: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   35: astore #4
    //   37: aload #4
    //   39: arraylength
    //   40: iconst_1
    //   41: if_icmpne -> 69
    //   44: aload #4
    //   46: iconst_0
    //   47: aaload
    //   48: instanceof javax/net/ssl/X509TrustManager
    //   51: ifeq -> 69
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   60: athrow
    //   61: iconst_1
    //   62: goto -> 70
    //   65: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   68: athrow
    //   69: iconst_0
    //   70: ifne -> 107
    //   73: iconst_0
    //   74: istore #5
    //   76: ldc 'Unexpected default trust managers: '
    //   78: aload #4
    //   80: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   83: dup
    //   84: ldc 'toString(this)'
    //   86: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   89: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore #5
    //   94: new java/lang/IllegalStateException
    //   97: dup
    //   98: aload #5
    //   100: invokevirtual toString : ()Ljava/lang/String;
    //   103: invokespecial <init> : (Ljava/lang/String;)V
    //   106: athrow
    //   107: aload #4
    //   109: iconst_0
    //   110: aaload
    //   111: dup
    //   112: ifnonnull -> 130
    //   115: pop
    //   116: new java/lang/NullPointerException
    //   119: dup
    //   120: ldc 'null cannot be cast to non-null type javax.net.ssl.X509TrustManager'
    //   122: invokespecial <init> : (Ljava/lang/String;)V
    //   125: athrow
    //   126: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   129: athrow
    //   130: checkcast javax/net/ssl/X509TrustManager
    //   133: areturn
    // Exception table:
    //   from	to	target	type
    //   37	54	57	java/lang/NullPointerException
    //   44	65	65	java/lang/NullPointerException
    //   107	126	126	java/lang/NullPointerException
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    boolean bool;
  }
  
  private static final boolean isSupported;
  
  @NotNull
  private final Provider provider = (Provider)new OpenJSSE();
  
  @NotNull
  public static final OpenJSSEPlatform$Companion Companion;
  
  private static final long a = o3.a(-6336093214425119935L, 4158642940097562500L, MethodHandles.lookup().lookupClass()).a(37515444841988L);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\OpenJSSEPlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */