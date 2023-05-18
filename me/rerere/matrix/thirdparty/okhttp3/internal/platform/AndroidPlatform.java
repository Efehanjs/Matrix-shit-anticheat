package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.AndroidSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.CloseGuard;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.ConscryptSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.DeferredSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.SocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.CertificateChainCleaner;
import me.rerere.matrix.thirdparty.okhttp3.internal.tls.TrustRootIndex;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SuppressSignatureCheck
public final class AndroidPlatform extends Platform {
  @NotNull
  public static final AndroidPlatform$Companion Companion;
  
  @NotNull
  private final CloseGuard closeGuard;
  
  @NotNull
  private final List socketAdapters;
  
  private static final boolean isSupported;
  
  private static final long a = o3.a(-893488817340216270L, -237105404320191570L, MethodHandles.lookup().lookupClass()).a(203202057040027L);
  
  public AndroidPlatform() {
    SocketAdapter[] arrayOfSocketAdapter = new SocketAdapter[4];
    arrayOfSocketAdapter[0] = StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, null, 1, null);
    arrayOfSocketAdapter[1] = (SocketAdapter)new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory());
    arrayOfSocketAdapter[2] = (SocketAdapter)new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory());
    arrayOfSocketAdapter[3] = (SocketAdapter)new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory());
    List list1 = CollectionsKt.listOfNotNull((Object[])arrayOfSocketAdapter);
    AndroidPlatform androidPlatform = this;
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
    androidPlatform.socketAdapters = arrayList;
    this.closeGuard = CloseGuard.Companion.get();
  }
  
  static {
    long l = a ^ 0x298B25F08856L;
    Companion = new AndroidPlatform$Companion(null);
    try {
      try {
        if (!((Build.VERSION.SDK_INT >= 21) ? 1 : 0)) {
          boolean bool = false;
          String str = Intrinsics.stringPlus("Expected Android API level 21+ but was ", Integer.valueOf(Build.VERSION.SDK_INT));
          throw new IllegalStateException(str.toString());
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    isSupported = !Platform.Companion.isAndroid() ? false : (!(Build.VERSION.SDK_INT >= 30));
  }
  
  @Nullable
  public Object getStackTraceForCloseable(@NotNull String paramString) {
    long l = a ^ 0x9ECE7BE512AL;
    Intrinsics.checkNotNullParameter(paramString, "closer");
    return this.closeGuard.createAndOpen(paramString);
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/AndroidPlatform.a : J
    //   3: ldc2_w 128903511133810
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
    //   74	86	86	java/lang/IllegalStateException
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/AndroidPlatform.a : J
    //   3: ldc2_w 54514178630668
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
    //   79	88	88	java/lang/IllegalStateException
  }
  
  public void logCloseableLeak(@NotNull String paramString, @Nullable Object paramObject) {
    long l = a ^ 0x2E432F750D6DL;
    Intrinsics.checkNotNullParameter(paramString, "message");
    boolean bool = this.closeGuard.warnIfOpen(paramObject);
    try {
      if (!bool)
        Platform.log$default(this, paramString, 5, null, 4, null); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/AndroidPlatform.a : J
    //   3: ldc2_w 102734994551446
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'sslSocket'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_3
    //   16: ldc_w 'protocols'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_0
    //   23: getfield socketAdapters : Ljava/util/List;
    //   26: checkcast java/lang/Iterable
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #7
    //   36: aload #7
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 81
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: astore #8
    //   55: aload #8
    //   57: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   60: astore #9
    //   62: iconst_0
    //   63: istore #10
    //   65: aload #9
    //   67: aload_1
    //   68: invokeinterface matchesSocket : (Ljavax/net/ssl/SSLSocket;)Z
    //   73: ifeq -> 36
    //   76: aload #8
    //   78: goto -> 82
    //   81: aconst_null
    //   82: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/SocketAdapter
    //   85: astore #6
    //   87: aload #6
    //   89: ifnonnull -> 99
    //   92: goto -> 109
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload #6
    //   101: aload_1
    //   102: aload_2
    //   103: aload_3
    //   104: invokeinterface configureTlsExtensions : (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    //   109: return
    // Exception table:
    //   from	to	target	type
    //   87	95	95	java/lang/IllegalStateException
  }
  
  @NotNull
  public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager paramX509TrustManager) {
    long l = a ^ 0x3F09D6E0F289L;
    try {
      Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
      AndroidCertificateChainCleaner.Companion.buildIfSupported(paramX509TrustManager);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (AndroidCertificateChainCleaner.Companion.buildIfSupported(paramX509TrustManager) == null) ? super.buildCertificateChainCleaner(paramX509TrustManager) : (CertificateChainCleaner)AndroidCertificateChainCleaner.Companion.buildIfSupported(paramX509TrustManager);
  }
  
  public boolean isCleartextTrafficPermitted(@NotNull String paramString) {
    long l = a ^ 0x7199533A2DBBL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "hostname");
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Build.VERSION.SDK_INT >= 24) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(paramString) : ((Build.VERSION.SDK_INT >= 23) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true);
  }
  
  public void connectSocket(@NotNull Socket paramSocket, @NotNull InetSocketAddress paramInetSocketAddress, int paramInt) throws IOException {
    long l = a ^ 0x6F81AC8F69ACL;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    Intrinsics.checkNotNullParameter(paramInetSocketAddress, "address");
    try {
      paramSocket.connect(paramInetSocketAddress, paramInt);
    } catch (ClassCastException classCastException) {
      try {
        if (Build.VERSION.SDK_INT == 26)
          throw new IOException("Exception in connect", (Throwable)classCastException); 
      } catch (ClassCastException classCastException1) {
        throw a(null);
      } 
      throw classCastException;
    } 
  }
  
  @NotNull
  public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager paramX509TrustManager) {
    TrustRootIndex trustRootIndex;
    long l = a ^ 0x198F53EB0226L;
    Intrinsics.checkNotNullParameter(paramX509TrustManager, "trustManager");
    try {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = X509Certificate.class;
      "findTrustAnchorByIssuerAndSignature";
      Method method = paramX509TrustManager.getClass().getDeclaredMethod(av.b("findTrustAnchorByIssuerAndSignature", paramX509TrustManager.getClass(), arrayOfClass), arrayOfClass);
      method.setAccessible(true);
      Intrinsics.checkNotNullExpressionValue(method, "method");
      trustRootIndex = new AndroidPlatform$CustomTrustRootIndex(paramX509TrustManager, method);
    } catch (NoSuchMethodException noSuchMethodException) {
      trustRootIndex = super.buildTrustRootIndex(paramX509TrustManager);
    } 
    return trustRootIndex;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\AndroidPlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */