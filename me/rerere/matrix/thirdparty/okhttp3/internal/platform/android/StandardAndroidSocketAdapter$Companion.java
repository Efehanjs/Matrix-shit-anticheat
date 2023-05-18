package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class StandardAndroidSocketAdapter$Companion {
  private static final long a = o3.a(-7695186994087227710L, -9217838683906220269L, MethodHandles.lookup().lookupClass()).a(229584563159058L);
  
  @Nullable
  public final SocketAdapter buildIfSupported(@NotNull String paramString) {
    SocketAdapter socketAdapter;
    long l = a ^ 0x7708F359C2FDL;
    Intrinsics.checkNotNullParameter(paramString, "packageName");
    try {
      Class<?> clazz1;
      Class<?> clazz2;
      if (Class.forName(Intrinsics.stringPlus(paramString, ".OpenSSLSocketImpl")) == null) {
        Class.forName(Intrinsics.stringPlus(paramString, ".OpenSSLSocketImpl"));
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
      } 
      try {
        if (Class.forName(Intrinsics.stringPlus(paramString, ".OpenSSLSocketFactoryImpl")) == null) {
          Class.forName(Intrinsics.stringPlus(paramString, ".OpenSSLSocketFactoryImpl"));
          throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      Class<?> clazz3 = Class.forName(Intrinsics.stringPlus(paramString, ".SSLParametersImpl"));
      Intrinsics.checkNotNullExpressionValue(clazz3, "paramsClass");
      socketAdapter = new StandardAndroidSocketAdapter(clazz1, clazz2, clazz3);
    } catch (Exception exception) {
      Platform.Companion.get().log("unable to load android socket classes", 5, exception);
      socketAdapter = (SocketAdapter)null;
    } 
    return socketAdapter;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\StandardAndroidSocketAdapter$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */