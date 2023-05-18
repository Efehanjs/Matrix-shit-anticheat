package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$special$$inlined$schedule$1 extends Task {
  public Http2Connection$special$$inlined$schedule$1(Http2Connection paramHttp2Connection, long paramLong) {
    super(paramString, false, 2, null);
  }
  
  public long runOnce() {
    boolean bool1 = false;
    synchronized (Http2Connection.this) {
      boolean bool = false;
      try {
        long l = Http2Connection.access$getIntervalPingsSent$p(Http2Connection.this);
        Http2Connection.access$setIntervalPingsSent$p(Http2Connection.this, l + 1L);
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      bool = (Http2Connection.access$getIntervalPongsReceived$p(Http2Connection.this) < Http2Connection.access$getIntervalPingsSent$p(Http2Connection.this)) ? true : false;
    } 
    boolean bool2 = bool;
    try {
      Http2Connection.access$failConnection(Http2Connection.this, null);
      Http2Connection.this.writePing(false, 1, 0);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return bool2 ? -1L : this.$pingIntervalNanos$inlined;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$special$$inlined$schedule$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */