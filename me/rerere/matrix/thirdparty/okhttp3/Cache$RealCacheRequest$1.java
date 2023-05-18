package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okio.ForwardingSink;
import me.rerere.matrix.thirdparty.okio.Sink;

public final class Cache$RealCacheRequest$1 extends ForwardingSink {
  public void close() throws IOException {
    Cache cache1 = this.this$0;
    Cache$RealCacheRequest cache$RealCacheRequest = Cache$RealCacheRequest.this;
    Cache cache2 = this.this$0;
    synchronized (cache1) {
      int i = 0;
      if (cache$RealCacheRequest.getDone())
        return; 
      cache$RealCacheRequest.setDone(true);
      int j = cache2.getWriteSuccessCount$okhttp();
      cache2.setWriteSuccessCount$okhttp(j + 1);
      i = j;
    } 
    super.close();
    Cache$RealCacheRequest.access$getEditor$p(Cache$RealCacheRequest.this).commit();
  }
  
  public Cache$RealCacheRequest$1(Cache$RealCacheRequest paramCache$RealCacheRequest, Sink paramSink) {
    super(paramSink);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$RealCacheRequest$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */