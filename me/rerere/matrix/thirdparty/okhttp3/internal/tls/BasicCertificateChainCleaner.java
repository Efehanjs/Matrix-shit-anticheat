package me.rerere.matrix.thirdparty.okhttp3.internal.tls;

import java.lang.invoke.MethodHandles;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
  @NotNull
  public static final BasicCertificateChainCleaner$Companion Companion;
  
  private static final int MAX_SIGNERS = 9;
  
  @NotNull
  private final TrustRootIndex trustRootIndex;
  
  private static final long a = o3.a(7684141487773140725L, 5728869061670287883L, MethodHandles.lookup().lookupClass()).a(119914262316408L);
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      try {
        if (paramObject instanceof BasicCertificateChainCleaner)
          try {
            if (Intrinsics.areEqual(((BasicCertificateChainCleaner)paramObject).trustRootIndex, this.trustRootIndex));
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          }  
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (paramObject == this);
  }
  
  public BasicCertificateChainCleaner(@NotNull TrustRootIndex paramTrustRootIndex) {
    this.trustRootIndex = paramTrustRootIndex;
  }
  
  public int hashCode() {
    return this.trustRootIndex.hashCode();
  }
  
  static {
    Companion = new BasicCertificateChainCleaner$Companion(null);
  }
  
  @NotNull
  public List clean(@NotNull List paramList, @NotNull String paramString) throws SSLPeerUnverifiedException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/tls/BasicCertificateChainCleaner.a : J
    //   3: ldc2_w 13053151353331
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc 'chain'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_2
    //   15: ldc 'hostname'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: new java/util/ArrayDeque
    //   23: dup
    //   24: aload_1
    //   25: checkcast java/util/Collection
    //   28: invokespecial <init> : (Ljava/util/Collection;)V
    //   31: checkcast java/util/Deque
    //   34: astore #5
    //   36: new java/util/ArrayList
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: checkcast java/util/List
    //   46: astore #6
    //   48: aload #6
    //   50: aload #5
    //   52: invokeinterface removeFirst : ()Ljava/lang/Object;
    //   57: astore #7
    //   59: aload #7
    //   61: ldc 'queue.removeFirst()'
    //   63: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   66: aload #7
    //   68: invokeinterface add : (Ljava/lang/Object;)Z
    //   73: pop
    //   74: iconst_0
    //   75: istore #7
    //   77: iconst_0
    //   78: istore #8
    //   80: iload #8
    //   82: bipush #9
    //   84: if_icmpge -> 328
    //   87: iload #8
    //   89: istore #9
    //   91: iinc #8, 1
    //   94: aload #6
    //   96: aload #6
    //   98: invokeinterface size : ()I
    //   103: iconst_1
    //   104: isub
    //   105: invokeinterface get : (I)Ljava/lang/Object;
    //   110: checkcast java/security/cert/X509Certificate
    //   113: astore #10
    //   115: aload_0
    //   116: getfield trustRootIndex : Lme/rerere/matrix/thirdparty/okhttp3/internal/tls/TrustRootIndex;
    //   119: aload #10
    //   121: invokeinterface findByIssuerAndSignature : (Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;
    //   126: astore #11
    //   128: aload #11
    //   130: ifnull -> 209
    //   133: aload #6
    //   135: invokeinterface size : ()I
    //   140: iconst_1
    //   141: if_icmpgt -> 168
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload #10
    //   153: aload #11
    //   155: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   158: ifne -> 185
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   167: athrow
    //   168: aload #6
    //   170: aload #11
    //   172: invokeinterface add : (Ljava/lang/Object;)Z
    //   177: pop
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: aload_0
    //   186: aload #11
    //   188: aload #11
    //   190: invokespecial verifySignature : (Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z
    //   193: ifeq -> 203
    //   196: aload #6
    //   198: areturn
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: iconst_1
    //   204: istore #7
    //   206: goto -> 80
    //   209: aload #5
    //   211: invokeinterface iterator : ()Ljava/util/Iterator;
    //   216: astore #13
    //   218: aload #13
    //   220: ldc 'queue.iterator()'
    //   222: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   225: aload #13
    //   227: astore #12
    //   229: aload #12
    //   231: invokeinterface hasNext : ()Z
    //   236: ifeq -> 301
    //   239: aload #12
    //   241: invokeinterface next : ()Ljava/lang/Object;
    //   246: dup
    //   247: ifnonnull -> 265
    //   250: pop
    //   251: new java/lang/NullPointerException
    //   254: dup
    //   255: ldc 'null cannot be cast to non-null type java.security.cert.X509Certificate'
    //   257: invokespecial <init> : (Ljava/lang/String;)V
    //   260: athrow
    //   261: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   264: athrow
    //   265: checkcast java/security/cert/X509Certificate
    //   268: astore #13
    //   270: aload_0
    //   271: aload #10
    //   273: aload #13
    //   275: invokespecial verifySignature : (Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z
    //   278: ifeq -> 229
    //   281: aload #12
    //   283: invokeinterface remove : ()V
    //   288: aload #6
    //   290: aload #13
    //   292: invokeinterface add : (Ljava/lang/Object;)Z
    //   297: pop
    //   298: goto -> 80
    //   301: iload #7
    //   303: ifeq -> 313
    //   306: aload #6
    //   308: areturn
    //   309: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   312: athrow
    //   313: new javax/net/ssl/SSLPeerUnverifiedException
    //   316: dup
    //   317: ldc 'Failed to find a trusted cert that signed '
    //   319: aload #10
    //   321: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   324: invokespecial <init> : (Ljava/lang/String;)V
    //   327: athrow
    //   328: new javax/net/ssl/SSLPeerUnverifiedException
    //   331: dup
    //   332: ldc 'Certificate chain too long: '
    //   334: aload #6
    //   336: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   339: invokespecial <init> : (Ljava/lang/String;)V
    //   342: athrow
    // Exception table:
    //   from	to	target	type
    //   128	144	147	javax/net/ssl/SSLPeerUnverifiedException
    //   133	161	164	javax/net/ssl/SSLPeerUnverifiedException
    //   151	178	181	javax/net/ssl/SSLPeerUnverifiedException
    //   185	199	199	javax/net/ssl/SSLPeerUnverifiedException
    //   239	261	261	javax/net/ssl/SSLPeerUnverifiedException
    //   301	309	309	javax/net/ssl/SSLPeerUnverifiedException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\tls\BasicCertificateChainCleaner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */