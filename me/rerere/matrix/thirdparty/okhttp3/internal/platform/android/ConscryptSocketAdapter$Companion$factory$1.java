package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.ConscryptPlatform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.conscrypt.Conscrypt;

public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter$Factory {
  private static final long a = o3.a(-2661410940874073301L, 8183592757717023503L, MethodHandles.lookup().lookupClass()).a(206605382378545L);
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x53DE23CAB59CL;
    try {
      Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
      if (ConscryptPlatform.Companion.isSupported())
        try {
          if (Conscrypt.isConscrypt(paramSSLSocket));
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
    long l = a ^ 0x3EAFE32B3D6DL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return new ConscryptSocketAdapter();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\ConscryptSocketAdapter$Companion$factory$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */