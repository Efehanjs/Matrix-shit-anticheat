package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.CacheRequest;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.DiskLruCache;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Cache$RealCacheRequest implements CacheRequest {
  @NotNull
  private final Sink body;
  
  private boolean done;
  
  @NotNull
  private final Sink cacheOut;
  
  @NotNull
  private final DiskLruCache.Editor editor;
  
  private static final long a = o3.a(-3234992256950868265L, -2186170133111195016L, MethodHandles.lookup().lookupClass()).a(59515012639847L);
  
  public final void setDone(boolean paramBoolean) {
    this.done = paramBoolean;
  }
  
  @NotNull
  public Sink body() {
    return this.body;
  }
  
  public Cache$RealCacheRequest(DiskLruCache.Editor paramEditor) {
    this.editor = paramEditor;
    this.cacheOut = this.editor.newSink(1);
    Sink sink = this.cacheOut;
    this.body = (Sink)new Cache$RealCacheRequest$1(Cache.this, this, sink);
  }
  
  public void abort() {
    Cache cache1 = Cache.this;
    Cache cache2 = Cache.this;
    synchronized (cache1) {
      int i = 0;
      if (getDone())
        return; 
      setDone(true);
      int j = cache2.getWriteAbortCount$okhttp();
      cache2.setWriteAbortCount$okhttp(j + 1);
      i = j;
    } 
    Util.closeQuietly((Closeable)this.cacheOut);
    try {
      this.editor.abort();
    } catch (IOException iOException) {}
  }
  
  public final boolean getDone() {
    return this.done;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$RealCacheRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */