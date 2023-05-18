package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 extends Task {
  public long runOnce() {
    boolean bool = false;
    Http2Connection.this.writePing(false, 2, 0);
    return -1L;
  }
  
  public Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(boolean paramBoolean, Http2Connection paramHttp2Connection) {
    super(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$sendDegradedPingLater$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */