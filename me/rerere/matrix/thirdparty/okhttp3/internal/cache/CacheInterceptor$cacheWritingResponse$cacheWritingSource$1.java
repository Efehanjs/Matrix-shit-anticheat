package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements Source {
  private boolean cacheRequestClosed;
  
  private static final long a = o3.a(542702275057362177L, 4977903835138074178L, MethodHandles.lookup().lookupClass()).a(270558769790155L);
  
  public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(BufferedSource paramBufferedSource, CacheRequest paramCacheRequest, BufferedSink paramBufferedSink) {}
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l1 = a ^ 0x6112610644E7L;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    long l2 = 0L;
    try {
      l2 = this.$source.read(paramBuffer, paramLong);
    } catch (IOException iOException) {
      try {
        if (!this.cacheRequestClosed) {
          this.cacheRequestClosed = true;
          this.$cacheRequest.abort();
        } 
      } catch (IOException iOException1) {
        throw a(null);
      } 
      throw iOException;
    } 
    try {
      if (l2 == -1L) {
        try {
          if (!this.cacheRequestClosed) {
            this.cacheRequestClosed = true;
            this.$cacheBody.close();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return -1L;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramBuffer.copyTo(this.$cacheBody.getBuffer(), paramBuffer.size() - l2, l2);
    this.$cacheBody.emitCompleteSegments();
    return l2;
  }
  
  public void close() throws IOException {
    try {
      if (!this.cacheRequestClosed)
        try {
          if (!Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.$source.close();
  }
  
  @NotNull
  public Timeout timeout() {
    return this.$source.timeout();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\CacheInterceptor$cacheWritingResponse$cacheWritingSource$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */