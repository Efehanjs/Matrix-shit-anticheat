package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okio.ForwardingSource;
import me.rerere.matrix.thirdparty.okio.Source;

public final class Cache$CacheResponseBody$1 extends ForwardingSource {
  public Cache$CacheResponseBody$1(Cache$CacheResponseBody paramCache$CacheResponseBody) {
    super(paramSource);
  }
  
  public void close() throws IOException {
    Cache$CacheResponseBody.this.getSnapshot().close();
    super.close();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$CacheResponseBody$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */