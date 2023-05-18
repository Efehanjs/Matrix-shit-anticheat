package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TlsVersion$Companion {
  private static final long a = o3.a(3759756569076089936L, 2284596476968268422L, MethodHandles.lookup().lookupClass()).a(262149018946078L);
  
  @NotNull
  public final TlsVersion forJavaName(@NotNull String paramString) {
    long l = a ^ 0x77E8C6FC44F1L;
    Intrinsics.checkNotNullParameter(paramString, "javaName");
    String str = paramString;
    try {
      switch (str.hashCode()) {
        case 79201641:
          try {
            if (!str.equals("SSLv3"))
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        case 79923350:
          try {
            if (!str.equals("TLSv1"))
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        case -503070501:
          try {
            if (!str.equals("TLSv1.3"))
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        case -503070502:
          try {
            if (!str.equals("TLSv1.2"))
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        case -503070503:
          try {
            if (!str.equals("TLSv1.1"))
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", paramString));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\TlsVersion$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */