package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$pushRequestLater$$inlined$execute$default$1 extends Task {
  public long runOnce() {
    boolean bool1 = false;
    boolean bool = Http2Connection.access$getPushObserver$p(Http2Connection.this).onRequest(this.$streamId$inlined, this.$requestHeaders$inlined);
    boolean bool2 = false;
    try {
      boolean bool3 = false;
      if (bool) {
        Http2Connection.this.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
        synchronized (Http2Connection.this) {
          boolean bool4 = false;
          bool4 = Http2Connection.access$getCurrentPushRequests$p(Http2Connection.this).remove(Integer.valueOf(this.$streamId$inlined));
        } 
      } 
    } catch (IOException iOException) {}
    return -1L;
  }
  
  public Http2Connection$pushRequestLater$$inlined$execute$default$1(boolean paramBoolean, Http2Connection paramHttp2Connection, int paramInt, List paramList) {
    super(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$pushRequestLater$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */