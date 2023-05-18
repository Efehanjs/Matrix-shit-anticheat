package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;

public final class Http2Connection$pushDataLater$$inlined$execute$default$1 extends Task {
  public Http2Connection$pushDataLater$$inlined$execute$default$1(boolean paramBoolean1, Http2Connection paramHttp2Connection, int paramInt1, Buffer paramBuffer, int paramInt2, boolean paramBoolean2) {
    super(paramString, paramBoolean1);
  }
  
  public long runOnce() {
    boolean bool1 = false;
    boolean bool2 = false;
    try {
      boolean bool = false;
      boolean bool3 = Http2Connection.access$getPushObserver$p(Http2Connection.this).onData(this.$streamId$inlined, (BufferedSource)this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
      try {
        if (bool3)
          Http2Connection.this.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (bool3 || this.$inFinished$inlined)
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
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$pushDataLater$$inlined$execute$default$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */