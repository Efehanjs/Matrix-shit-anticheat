package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Jdk8WithJettyBootPlatform$Companion {
  private static final long a = o3.a(7067303932350773467L, -3116865567516673782L, MethodHandles.lookup().lookupClass()).a(10053443539736L);
  
  @Nullable
  public final Platform buildIfSupported() {
    long l = a ^ 0x2FFF0B0E29E6L;
    String str = System.getProperty("java.specification.version", "unknown");
    try {
      Intrinsics.checkNotNullExpressionValue(str, "jvmVersion");
      int i = Integer.parseInt(str);
      try {
        if (i >= 9)
          return null; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } catch (NumberFormatException numberFormatException) {}
    try {
      String str1 = "org.eclipse.jetty.alpn.ALPN";
      Class<?> clazz1 = Class.forName(str1, true, null);
      Class<?> clazz2 = Class.forName(Intrinsics.stringPlus(str1, "$Provider"), true, null);
      Class<?> clazz3 = Class.forName(Intrinsics.stringPlus(str1, "$ClientProvider"), true, null);
      Class<?> clazz4 = Class.forName(Intrinsics.stringPlus(str1, "$ServerProvider"), true, null);
      Class[] arrayOfClass1 = new Class[2];
      arrayOfClass1[0] = SSLSocket.class;
      arrayOfClass1[1] = clazz2;
      "put";
      Method method1 = clazz1.getMethod(av.b("put", clazz1, arrayOfClass1), arrayOfClass1);
      Class[] arrayOfClass2 = new Class[1];
      arrayOfClass2[0] = SSLSocket.class;
      Method method2 = clazz1.getMethod("get", arrayOfClass2);
      Class[] arrayOfClass3 = new Class[1];
      arrayOfClass3[0] = SSLSocket.class;
      Method method3 = clazz1.getMethod("remove", arrayOfClass3);
      Intrinsics.checkNotNullExpressionValue(method1, "putMethod");
      Intrinsics.checkNotNullExpressionValue(method2, "getMethod");
      Intrinsics.checkNotNullExpressionValue(method3, "removeMethod");
      Intrinsics.checkNotNullExpressionValue(clazz3, "clientProviderClass");
      Intrinsics.checkNotNullExpressionValue(clazz4, "serverProviderClass");
      return new Jdk8WithJettyBootPlatform(method1, method2, method3, clazz3, clazz4);
    } catch (ClassNotFoundException classNotFoundException) {
    
    } catch (NoSuchMethodException noSuchMethodException) {}
    return null;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Jdk8WithJettyBootPlatform$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */