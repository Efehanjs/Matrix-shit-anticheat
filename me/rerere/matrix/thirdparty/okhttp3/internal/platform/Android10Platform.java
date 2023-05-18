package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.Android10SocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.AndroidSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.ConscryptSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.DeferredSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.SocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SuppressSignatureCheck
public final class Android10Platform extends Platform {
  @NotNull
  public static final Android10Platform$Companion Companion;
  
  @NotNull
  private final List socketAdapters;
  
  private static final boolean isSupported;
  
  private static final long a;
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform.a : J
    //   3: ldc2_w 88387527605100
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sslSocket'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_3
    //   16: ldc 'protocols'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield socketAdapters : Ljava/util/List;
    //   25: checkcast java/lang/Iterable
    //   28: invokeinterface iterator : ()Ljava/util/Iterator;
    //   33: astore #7
    //   35: aload #7
    //   37: invokeinterface hasNext : ()Z
    //   42: ifeq -> 80
    //   45: aload #7
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: astore #8
    //   54: aload #8
    //   56: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   59: astore #9
    //   61: iconst_0
    //   62: istore #10
    //   64: aload #9
    //   66: aload_1
    //   67: invokeinterface matchesSocket : (Ljavax/net/ssl/SSLSocket;)Z
    //   72: ifeq -> 35
    //   75: aload #8
    //   77: goto -> 81
    //   80: aconst_null
    //   81: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   84: astore #6
    //   86: aload #6
    //   88: ifnonnull -> 98
    //   91: goto -> 108
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: aload #6
    //   100: aload_1
    //   101: aload_2
    //   102: aload_3
    //   103: invokeinterface configureTlsExtensions : (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    //   108: return
    // Exception table:
    //   from	to	target	type
    //   86	94	94	java/lang/RuntimeException
  }
  
  @NotNull
  public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager paramX509TrustManager) {
    long l = a ^ 0x32055F14BB73L;
    try {
      Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
      AndroidCertificateChainCleaner.Companion.buildIfSupported(paramX509TrustManager);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (AndroidCertificateChainCleaner.Companion.buildIfSupported(paramX509TrustManager) == null) ? super.buildCertificateChainCleaner(paramX509TrustManager) : (CertificateChainCleaner)AndroidCertificateChainCleaner.Companion.buildIfSupported(paramX509TrustManager);
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform.a : J
    //   3: ldc2_w 66623997537782
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'sslSocketFactory'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield socketAdapters : Ljava/util/List;
    //   18: checkcast java/lang/Iterable
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #5
    //   28: aload #5
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 73
    //   38: aload #5
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: astore #6
    //   47: aload #6
    //   49: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   52: astore #7
    //   54: iconst_0
    //   55: istore #8
    //   57: aload #7
    //   59: aload_1
    //   60: invokeinterface matchesSocketFactory : (Ljavax/net/ssl/SSLSocketFactory;)Z
    //   65: ifeq -> 28
    //   68: aload #6
    //   70: goto -> 74
    //   73: aconst_null
    //   74: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   77: astore #4
    //   79: aload #4
    //   81: ifnonnull -> 92
    //   84: aconst_null
    //   85: goto -> 100
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: aload #4
    //   94: aload_1
    //   95: invokeinterface trustManager : (Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    //   100: areturn
    // Exception table:
    //   from	to	target	type
    //   79	88	88	java/lang/RuntimeException
  }
  
  public Android10Platform() {
    SocketAdapter[] arrayOfSocketAdapter = new SocketAdapter[4];
    arrayOfSocketAdapter[0] = Android10SocketAdapter.Companion.buildIfSupported();
    arrayOfSocketAdapter[1] = (SocketAdapter)new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory());
    arrayOfSocketAdapter[2] = (SocketAdapter)new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory());
    arrayOfSocketAdapter[3] = (SocketAdapter)new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory());
    List list1 = CollectionsKt.listOfNotNull((Object[])arrayOfSocketAdapter);
    Android10Platform android10Platform = this;
    boolean bool1 = false;
    List list2 = list1;
    ArrayList<SocketAdapter> arrayList = new ArrayList();
    boolean bool2 = false;
    for (SocketAdapter socketAdapter1 : list2) {
      SocketAdapter socketAdapter2 = socketAdapter1;
      boolean bool = false;
      if (socketAdapter2.isSupported())
        arrayList.add(socketAdapter1); 
    } 
    android10Platform.socketAdapters = arrayList;
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 833946895262592347
    //   3: ldc2_w 5629149480460103867
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 142682474854219
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform.a : J
    //   26: new me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform$Companion
    //   29: dup
    //   30: aconst_null
    //   31: invokespecial <init> : (Lme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   34: putstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform$Companion;
    //   37: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/platform/Platform$Companion;
    //   40: invokevirtual isAndroid : ()Z
    //   43: ifeq -> 62
    //   46: getstatic android/os/Build$VERSION.SDK_INT : I
    //   49: bipush #29
    //   51: if_icmplt -> 62
    //   54: iconst_1
    //   55: goto -> 63
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: iconst_0
    //   63: putstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform.isSupported : Z
    //   66: return
    // Exception table:
    //   from	to	target	type
    //   46	58	58	java/lang/RuntimeException
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Android10Platform.a : J
    //   3: ldc2_w 132148191922056
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'sslSocket'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield socketAdapters : Ljava/util/List;
    //   18: checkcast java/lang/Iterable
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #4
    //   28: aload #4
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 73
    //   38: aload #4
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: astore #5
    //   47: aload #5
    //   49: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   52: astore #6
    //   54: iconst_0
    //   55: istore #7
    //   57: aload #6
    //   59: aload_1
    //   60: invokeinterface matchesSocket : (Ljavax/net/ssl/SSLSocket;)Z
    //   65: ifeq -> 28
    //   68: aload #5
    //   70: goto -> 74
    //   73: aconst_null
    //   74: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   77: dup
    //   78: ifnonnull -> 90
    //   81: pop
    //   82: aconst_null
    //   83: goto -> 96
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload_1
    //   91: invokeinterface getSelectedProtocol : (Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    //   96: areturn
    // Exception table:
    //   from	to	target	type
    //   74	86	86	java/lang/RuntimeException
  }
  
  public boolean isCleartextTrafficPermitted(@NotNull String paramString) {
    long l = a ^ 0x7C95DACE6441L;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(paramString);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Android10Platform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */