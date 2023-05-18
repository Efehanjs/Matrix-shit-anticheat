package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Protocol$Companion {
  private static final long a = o3.a(-6735751875476322405L, 8287765189426619449L, MethodHandles.lookup().lookupClass()).a(57827891040001L);
  
  @NotNull
  public final Protocol get(@NotNull String paramString) throws IOException {
    long l = a ^ 0x2CE90D0E5B12L;
    Intrinsics.checkNotNullParameter(paramString, "protocol");
    String str = paramString;
    try {
      try {
        try {
          try {
            try {
              try {
                if (Intrinsics.areEqual(str, Protocol.access$getProtocol$p(Protocol.QUIC))) {
                
                } else {
                  throw new IOException(Intrinsics.stringPlus("Unexpected protocol: ", paramString));
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Intrinsics.areEqual(str, Protocol.access$getProtocol$p(Protocol.HTTP_1_0)) ? Protocol.HTTP_1_0 : (Intrinsics.areEqual(str, Protocol.access$getProtocol$p(Protocol.HTTP_1_1)) ? Protocol.HTTP_1_1 : (Intrinsics.areEqual(str, Protocol.access$getProtocol$p(Protocol.H2_PRIOR_KNOWLEDGE)) ? Protocol.H2_PRIOR_KNOWLEDGE : (Intrinsics.areEqual(str, Protocol.access$getProtocol$p(Protocol.HTTP_2)) ? Protocol.HTTP_2 : (Intrinsics.areEqual(str, Protocol.access$getProtocol$p(Protocol.SPDY_3)) ? Protocol.SPDY_3 : (Protocol)"JD-Core does not support Kotlin"))));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Protocol$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */