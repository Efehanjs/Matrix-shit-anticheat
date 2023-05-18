package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2Reader$Companion {
  private static final long a = o3.a(-2764151474242941997L, -3709413933387914498L, MethodHandles.lookup().lookupClass()).a(164294461548087L);
  
  public final int lengthWithoutPadding(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    long l = a ^ 0x720FA65DCA80L;
    int i = paramInt1;
    if ((paramInt2 & 0x8) != 0) {
      int j = i;
      i = j + -1;
    } 
    try {
      if (paramInt3 > i)
        throw new IOException("PROTOCOL_ERROR padding " + paramInt3 + " > remaining length " + i); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    i -= paramInt3;
    return i;
  }
  
  @NotNull
  public final Logger getLogger() {
    return Http2Reader.access$getLogger$cp();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Reader$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */