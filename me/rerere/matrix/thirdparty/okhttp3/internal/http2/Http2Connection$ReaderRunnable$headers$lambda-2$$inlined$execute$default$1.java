package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;

public final class Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1 extends Task {
  private static final long b = o3.a(5796028188481354507L, 8563504597901688L, MethodHandles.lookup().lookupClass()).a(80132140002755L);
  
  public long runOnce() {
    long l = b ^ 0x7A0CBB645737L;
    boolean bool = false;
    try {
      Http2Connection.this.getListener$okhttp().onStream(this.$newStream$inlined);
    } catch (IOException iOException) {
      Platform.Companion.get().log(Intrinsics.stringPlus("Http2Connection.Listener failure for ", Http2Connection.this.getConnectionName$okhttp()), 4, iOException);
      boolean bool1 = false;
      try {
        boolean bool2 = false;
        this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, iOException);
      } catch (IOException iOException1) {}
    } 
    return -1L;
  }
  
  public Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1(boolean paramBoolean, Http2Connection paramHttp2Connection, Http2Stream paramHttp2Stream) {
    super(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */