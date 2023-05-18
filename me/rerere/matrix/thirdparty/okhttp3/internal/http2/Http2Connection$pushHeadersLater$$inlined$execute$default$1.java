package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class Http2Connection$pushHeadersLater$$inlined$execute$default$1 extends Task {
  public long runOnce() {
    boolean bool1 = false;
    boolean bool = Http2Connection.access$getPushObserver$p(Http2Connection.this).onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
    boolean bool2 = false;
    try {
      boolean bool3 = false;
      try {
        if (bool)
          Http2Connection.this.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (bool || this.$inFinished$inlined)
          synchronized (Http2Connection.this) {
            boolean bool4 = false;
            bool4 = Http2Connection.access$getCurrentPushRequests$p(Http2Connection.this).remove(Integer.valueOf(this.$streamId$inlined));
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {}
    return -1L;
  }
  
  public Http2Connection$pushHeadersLater$$inlined$execute$default$1(boolean paramBoolean1, Http2Connection paramHttp2Connection, int paramInt, List paramList, boolean paramBoolean2) {
    super(paramString, paramBoolean1);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$pushHeadersLater$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */