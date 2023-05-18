package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 extends Task {
  public long runOnce() {
    boolean bool = false;
    try {
      Http2Connection.this.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
    } catch (IOException iOException) {
      Http2Connection.access$failConnection(Http2Connection.this, iOException);
    } 
    return -1L;
  }
  
  public Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(boolean paramBoolean, Http2Connection paramHttp2Connection, int paramInt, long paramLong) {
    super(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */