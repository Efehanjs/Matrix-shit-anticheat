package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.BouncyCastlePlatform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class BouncyCastleSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter$Factory {
  private static final long a = o3.a(-1975737102918705506L, 1278929904168537713L, MethodHandles.lookup().lookupClass()).a(240197504863157L);
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x1C270C1F7EBAL;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
      if (BouncyCastlePlatform.Companion.isSupported())
        try {
          if (paramSSLSocket instanceof org.bouncycastle.jsse.BCSSLSocket);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public SocketAdapter create(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x7156CCFEF64BL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return new BouncyCastleSocketAdapter();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\BouncyCastleSocketAdapter$Companion$factory$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */