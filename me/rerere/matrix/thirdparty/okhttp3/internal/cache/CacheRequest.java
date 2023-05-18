package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface CacheRequest {
  @NotNull
  Sink body() throws IOException;
  
  void abort();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\CacheRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */