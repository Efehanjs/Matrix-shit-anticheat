package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.DiskLruCache;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Cache$CacheResponseBody extends ResponseBody {
  @NotNull
  private final DiskLruCache.Snapshot snapshot;
  
  @Nullable
  private final String contentType;
  
  @Nullable
  private final String contentLength;
  
  @NotNull
  private final BufferedSource bodySource;
  
  private static final long a = o3.a(1138859573060516670L, -251176461913223001L, MethodHandles.lookup().lookupClass()).a(130843943809021L);
  
  @NotNull
  public BufferedSource source() {
    return this.bodySource;
  }
  
  public long contentLength() {
    try {
      long l = Util.toLongOrDefault(this.contentLength, -1L);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.contentLength == null) ? -1L : l;
  }
  
  @Nullable
  public MediaType contentType() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.contentType == null) ? null : MediaType.Companion.parse(this.contentType);
  }
  
  @NotNull
  public final DiskLruCache.Snapshot getSnapshot() {
    return this.snapshot;
  }
  
  public Cache$CacheResponseBody(@NotNull DiskLruCache.Snapshot paramSnapshot, @Nullable String paramString1, @Nullable String paramString2) {
    this.snapshot = paramSnapshot;
    this.contentType = paramString1;
    this.contentLength = paramString2;
    Source source = this.snapshot.getSource(1);
    this.bodySource = Okio.buffer((Source)new Cache$CacheResponseBody$1(source, this));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$CacheResponseBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */