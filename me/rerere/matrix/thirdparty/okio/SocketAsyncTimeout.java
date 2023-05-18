package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SocketAsyncTimeout extends AsyncTimeout {
  @NotNull
  private final Socket socket;
  
  private static final long a = o3.a(-89533207714754925L, 8264381798725595469L, MethodHandles.lookup().lookupClass()).a(261964382452387L);
  
  @NotNull
  public IOException newTimeoutException(@Nullable IOException paramIOException) {
    long l = a ^ 0x6E5E014E930DL;
    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
    try {
      if (paramIOException != null)
        socketTimeoutException.initCause(paramIOException); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return socketTimeoutException;
  }
  
  public void timedOut() {
    long l = a ^ 0x2D1E9A3E8F54L;
    try {
      this.socket.close();
    } catch (Exception exception) {
      Okio__JvmOkioKt.access$getLogger$p().log(Level.WARNING, Intrinsics.stringPlus("Failed to close timed out socket ", this.socket), exception);
    } catch (AssertionError assertionError) {
      try {
        if (Okio.isAndroidGetsocknameError(assertionError)) {
          Okio__JvmOkioKt.access$getLogger$p().log(Level.WARNING, Intrinsics.stringPlus("Failed to close timed out socket ", this.socket), assertionError);
        } else {
          throw assertionError;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
  }
  
  public SocketAsyncTimeout(@NotNull Socket paramSocket) {
    this.socket = paramSocket;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\SocketAsyncTimeout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */