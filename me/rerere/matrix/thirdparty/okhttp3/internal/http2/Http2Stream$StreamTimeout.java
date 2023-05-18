package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.SocketTimeoutException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okio.AsyncTimeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Http2Stream$StreamTimeout extends AsyncTimeout {
  private static final long a = o3.a(5453074362610399658L, -2945479720728183999L, MethodHandles.lookup().lookupClass()).a(20479035354915L);
  
  public void timedOut() {
    Http2Stream.this.closeLater(ErrorCode.CANCEL);
    Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
  }
  
  public final void exitAndThrowIfTimedOut() throws IOException {
    try {
      if (exit())
        throw newTimeoutException(null); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public IOException newTimeoutException(@Nullable IOException paramIOException) {
    long l = a ^ 0x134F2C75AD5FL;
    SocketTimeoutException socketTimeoutException1 = new SocketTimeoutException("timeout");
    SocketTimeoutException socketTimeoutException2 = socketTimeoutException1;
    boolean bool = false;
    try {
      if (paramIOException != null)
        socketTimeoutException2.initCause(paramIOException); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return socketTimeoutException1;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Stream$StreamTimeout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */