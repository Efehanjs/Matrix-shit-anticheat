package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {
  public long runOnce() {
    boolean bool = false;
    Http2Connection.access$getPushObserver$p(Http2Connection.this).onReset(this.$streamId$inlined, this.$errorCode$inlined);
    synchronized (Http2Connection.this) {
      boolean bool1 = false;
      Http2Connection.access$getCurrentPushRequests$p(Http2Connection.this).remove(Integer.valueOf(this.$streamId$inlined));
      Unit unit = Unit.INSTANCE;
    } 
    return -1L;
  }
  
  public Http2Connection$pushResetLater$$inlined$execute$default$1(boolean paramBoolean, Http2Connection paramHttp2Connection, int paramInt, ErrorCode paramErrorCode) {
    super(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$pushResetLater$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */