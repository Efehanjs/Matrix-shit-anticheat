package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Jdk8WithJettyBootPlatform extends Platform {
  @NotNull
  private final Method removeMethod;
  
  @NotNull
  private final Class clientProviderClass;
  
  @NotNull
  public static final Jdk8WithJettyBootPlatform$Companion Companion;
  
  @NotNull
  private final Method putMethod;
  
  @NotNull
  private final Class serverProviderClass;
  
  @NotNull
  private final Method getMethod;
  
  private static final long a = o3.a(1809296697470224824L, 1705015107346346856L, MethodHandles.lookup().lookupClass()).a(60019697847546L);
  
  static {
    Companion = new Jdk8WithJettyBootPlatform$Companion(null);
  }
  
  public void afterHandshake(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x2747815F04ABL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    try {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramSSLSocket;
      this.removeMethod.invoke(null, arrayOfObject);
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError("failed to remove ALPN", (Throwable)illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      throw new AssertionError("failed to remove ALPN", (Throwable)invocationTargetException);
    } 
  }
  
  public Jdk8WithJettyBootPlatform(@NotNull Method paramMethod1, @NotNull Method paramMethod2, @NotNull Method paramMethod3, @NotNull Class paramClass1, @NotNull Class paramClass2) {
    this.putMethod = paramMethod1;
    this.getMethod = paramMethod2;
    this.removeMethod = paramMethod3;
    this.clientProviderClass = paramClass1;
    this.serverProviderClass = paramClass2;
  }
  
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x63AEC72EDB8AL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    try {
      Object[] arrayOfObject = new Object[1];
      try {
        arrayOfObject[0] = paramSSLSocket;
        if (Proxy.getInvocationHandler(this.getMethod.invoke(null, arrayOfObject)) == null) {
          Proxy.getInvocationHandler(this.getMethod.invoke(null, arrayOfObject));
          throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } 
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      Jdk8WithJettyBootPlatform$AlpnProvider jdk8WithJettyBootPlatform$AlpnProvider = (Jdk8WithJettyBootPlatform$AlpnProvider)Proxy.getInvocationHandler(this.getMethod.invoke(null, arrayOfObject));
      try {
        if (!jdk8WithJettyBootPlatform$AlpnProvider.getUnsupported())
          try {
            if (jdk8WithJettyBootPlatform$AlpnProvider.getSelected() == null) {
              Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
              return null;
            } 
          } catch (InvocationTargetException invocationTargetException) {
            throw a(null);
          }  
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      try {
      
      } catch (InvocationTargetException invocationTargetException) {
        throw a(null);
      } 
      return jdk8WithJettyBootPlatform$AlpnProvider.getUnsupported() ? null : jdk8WithJettyBootPlatform$AlpnProvider.getSelected();
    } catch (InvocationTargetException invocationTargetException) {
      throw new AssertionError("failed to get ALPN selected protocol", (Throwable)invocationTargetException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError("failed to get ALPN selected protocol", (Throwable)illegalAccessException);
    } 
  }
  
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x4BFDB208276EL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    List list = Platform.Companion.alpnProtocolNames(paramList);
    try {
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = this.clientProviderClass;
      arrayOfClass[1] = this.serverProviderClass;
      Object object = Proxy.newProxyInstance(Platform.class.getClassLoader(), arrayOfClass, new Jdk8WithJettyBootPlatform$AlpnProvider(list));
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramSSLSocket;
      arrayOfObject[1] = object;
      this.putMethod.invoke(null, arrayOfObject);
    } catch (InvocationTargetException invocationTargetException) {
      throw new AssertionError("failed to set ALPN", (Throwable)invocationTargetException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError("failed to set ALPN", (Throwable)illegalAccessException);
    } 
  }
  
  private static InvocationTargetException a(InvocationTargetException paramInvocationTargetException) {
    return paramInvocationTargetException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Jdk8WithJettyBootPlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */