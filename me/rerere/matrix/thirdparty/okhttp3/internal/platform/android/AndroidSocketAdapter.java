package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.AndroidPlatform;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class AndroidSocketAdapter implements SocketAdapter {
  private final Method setAlpnProtocols;
  
  private final Method setHostname;
  
  @NotNull
  public static final AndroidSocketAdapter$Companion Companion;
  
  private final Method getAlpnSelectedProtocol;
  
  @NotNull
  private final Class sslSocketClass;
  
  @NotNull
  private final Method setUseSessionTickets;
  
  @NotNull
  private static final DeferredSocketAdapter$Factory playProviderFactory;
  
  private static final long a = o3.a(227036855387357915L, -9075350476690551239L, MethodHandles.lookup().lookupClass()).a(108824914171387L);
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.trustManager(this, paramSSLSocketFactory);
  }
  
  public boolean isSupported() {
    return AndroidPlatform.Companion.isSupported();
  }
  
  public boolean matchesSocketFactory(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    return SocketAdapter$DefaultImpls.matchesSocketFactory(this, paramSSLSocketFactory);
  }
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x779EB4B8DDDBL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return this.sslSocketClass.isInstance(paramSSLSocket);
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/android/AndroidSocketAdapter.a : J
    //   3: ldc2_w 67914226144108
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'sslSocket'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual matchesSocket : (Ljavax/net/ssl/SSLSocket;)Z
    //   19: ifne -> 28
    //   22: aconst_null
    //   23: areturn
    //   24: invokestatic a : (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
    //   27: athrow
    //   28: nop
    //   29: aload_0
    //   30: getfield getAlpnSelectedProtocol : Ljava/lang/reflect/Method;
    //   33: aload_1
    //   34: iconst_0
    //   35: anewarray java/lang/Object
    //   38: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast [B
    //   44: astore #4
    //   46: aload #4
    //   48: astore #5
    //   50: aload #5
    //   52: ifnonnull -> 63
    //   55: aconst_null
    //   56: goto -> 75
    //   59: invokestatic a : (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
    //   62: athrow
    //   63: new java/lang/String
    //   66: dup
    //   67: aload #5
    //   69: getstatic me/rerere/matrix/thirdparty/kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
    //   72: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   75: astore #4
    //   77: goto -> 156
    //   80: astore #5
    //   82: new java/lang/AssertionError
    //   85: dup
    //   86: aload #5
    //   88: invokespecial <init> : (Ljava/lang/Object;)V
    //   91: athrow
    //   92: astore #5
    //   94: aload #5
    //   96: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   99: astore #6
    //   101: nop
    //   102: aload #6
    //   104: instanceof java/lang/NullPointerException
    //   107: ifeq -> 141
    //   110: aload #6
    //   112: checkcast java/lang/NullPointerException
    //   115: invokevirtual getMessage : ()Ljava/lang/String;
    //   118: ldc 'ssl == null'
    //   120: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   123: ifeq -> 141
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
    //   132: athrow
    //   133: aconst_null
    //   134: goto -> 151
    //   137: invokestatic a : (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
    //   140: athrow
    //   141: new java/lang/AssertionError
    //   144: dup
    //   145: aload #5
    //   147: invokespecial <init> : (Ljava/lang/Object;)V
    //   150: athrow
    //   151: checkcast java/lang/String
    //   154: astore #4
    //   156: aload #4
    //   158: areturn
    // Exception table:
    //   from	to	target	type
    //   8	24	24	java/lang/IllegalAccessException
    //   28	77	80	java/lang/IllegalAccessException
    //   28	77	92	java/lang/reflect/InvocationTargetException
    //   50	59	59	java/lang/IllegalAccessException
    //   101	126	129	java/lang/IllegalAccessException
    //   110	137	137	java/lang/IllegalAccessException
  }
  
  static {
    long l = a ^ 0x1E82556A3FFEL;
    Companion = new AndroidSocketAdapter$Companion(null);
    playProviderFactory = Companion.factory("com.google.android.gms.org.conscrypt");
  }
  
  public AndroidSocketAdapter(@NotNull Class paramClass) {
    this.sslSocketClass = paramClass;
    Class[] arrayOfClass2 = new Class[1];
    arrayOfClass2[0] = boolean.class;
    "setUseSessionTickets";
    Method method = this.sslSocketClass.getDeclaredMethod(av.b("setUseSessionTickets", this.sslSocketClass, arrayOfClass2), arrayOfClass2);
    Intrinsics.checkNotNullExpressionValue(method, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
    this.setUseSessionTickets = method;
    Class[] arrayOfClass1 = new Class[1];
    arrayOfClass1[0] = String.class;
    "setHostname";
    this.setHostname = this.sslSocketClass.getMethod(av.b("setHostname", this.sslSocketClass, arrayOfClass1), arrayOfClass1);
    "getAlpnSelectedProtocol";
    this.getAlpnSelectedProtocol = this.sslSocketClass.getMethod(av.b("getAlpnSelectedProtocol", this.sslSocketClass, new Class[0]), new Class[0]);
    arrayOfClass1 = new Class[1];
    arrayOfClass1[0] = byte[].class;
    "setAlpnProtocols";
    this.setAlpnProtocols = this.sslSocketClass.getMethod(av.b("setAlpnProtocols", this.sslSocketClass, arrayOfClass1), arrayOfClass1);
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x3DC4A959AEDFL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    if (matchesSocket(paramSSLSocket))
      try {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(true);
        this.setUseSessionTickets.invoke(paramSSLSocket, arrayOfObject);
        if (paramString != null) {
          arrayOfObject = new Object[1];
          arrayOfObject[0] = paramString;
          this.setHostname.invoke(paramSSLSocket, arrayOfObject);
        } 
        arrayOfObject = new Object[1];
        arrayOfObject[0] = Platform.Companion.concatLengthPrefixed(paramList);
        this.setAlpnProtocols.invoke(paramSSLSocket, arrayOfObject);
      } catch (IllegalAccessException illegalAccessException) {
        throw new AssertionError(illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new AssertionError(invocationTargetException);
      }  
  }
  
  private static IllegalAccessException a(IllegalAccessException paramIllegalAccessException) {
    return paramIllegalAccessException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidSocketAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */