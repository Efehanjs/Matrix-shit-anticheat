package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.CacheRequest;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.CacheStrategy;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.DiskLruCache;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.HttpMethod;
import me.rerere.matrix.thirdparty.okhttp3.internal.io.FileSystem;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Cache implements Closeable, Flushable {
  private static final int ENTRY_METADATA = 0;
  
  private int hitCount;
  
  private static final int ENTRY_BODY = 1;
  
  @NotNull
  private final DiskLruCache cache;
  
  private int writeAbortCount;
  
  private int networkCount;
  
  @NotNull
  public static final Cache$Companion Companion;
  
  private static final int ENTRY_COUNT = 2;
  
  private static final int VERSION = 201105;
  
  private int requestCount;
  
  private int writeSuccessCount;
  
  private static final long a = o3.a(6450471114334120942L, -390742684201421162L, MethodHandles.lookup().lookupClass()).a(218018576388816L);
  
  public final synchronized int networkCount() {
    return this.networkCount;
  }
  
  public Cache(@NotNull File paramFile, long paramLong, @NotNull FileSystem paramFileSystem) {
    this.cache = new DiskLruCache(paramFileSystem, paramFile, 201105, 2, paramLong, TaskRunner.INSTANCE);
  }
  
  @Nullable
  public final CacheRequest put$okhttp(@NotNull Response paramResponse) {
    long l = a ^ 0x31702CB30A06L;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    String str = paramResponse.request().method();
    try {
      if (HttpMethod.INSTANCE.invalidatesCache(paramResponse.request().method())) {
        try {
          remove$okhttp(paramResponse.request());
        } catch (IOException iOException) {}
        return null;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(str, "GET"))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (Companion.hasVaryAll(paramResponse))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Cache$Entry cache$Entry = new Cache$Entry(paramResponse);
    DiskLruCache.Editor editor = null;
    try {
      try {
        if (DiskLruCache.edit$default(this.cache, Companion.key(paramResponse.request().url()), 0L, 2, null) == null) {
          DiskLruCache.edit$default(this.cache, Companion.key(paramResponse.request().url()), 0L, 2, null);
          return null;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      cache$Entry.writeTo(editor);
      return new Cache$RealCacheRequest(this, editor);
    } catch (IOException iOException) {
      abortQuietly(editor);
      return null;
    } 
  }
  
  @NotNull
  public final Iterator urls() throws IOException {
    return new Cache$urls$1(this);
  }
  
  static {
    Companion = new Cache$Companion(null);
  }
  
  public final void setWriteSuccessCount$okhttp(int paramInt) {
    this.writeSuccessCount = paramInt;
  }
  
  public final void remove$okhttp(@NotNull Request paramRequest) throws IOException {
    long l = a ^ 0x616E24DDAC37L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    this.cache.remove(Companion.key(paramRequest.url()));
  }
  
  @NotNull
  public final DiskLruCache getCache$okhttp() {
    return this.cache;
  }
  
  public final void delete() throws IOException {
    this.cache.delete();
  }
  
  @Nullable
  public final Response get$okhttp(@NotNull Request paramRequest) {
    DiskLruCache.Snapshot snapshot2;
    Cache$Entry cache$Entry2;
    long l = a ^ 0x670E99D3FC57L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    String str = Companion.key(paramRequest.url());
    try {
      try {
        if (this.cache.get(str) == null) {
          this.cache.get(str);
          return null;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      return null;
    } 
    DiskLruCache.Snapshot snapshot1 = snapshot2;
    try {
      cache$Entry2 = new Cache$Entry(snapshot1.getSource(0));
    } catch (IOException iOException) {
      Util.closeQuietly((Closeable)snapshot1);
      return null;
    } 
    Cache$Entry cache$Entry1 = cache$Entry2;
    Response response = cache$Entry1.response(snapshot1);
    try {
      if (!cache$Entry1.matches(paramRequest, response)) {
        try {
          if (response.body() == null) {
            response.body();
          } else {
            Util.closeQuietly(response.body());
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return response;
  }
  
  public final synchronized int requestCount() {
    return this.requestCount;
  }
  
  public final boolean isClosed() {
    return this.cache.isClosed();
  }
  
  public void close() throws IOException {
    this.cache.close();
  }
  
  public final void initialize() throws IOException {
    this.cache.initialize();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final File -deprecated_directory() {
    return this.cache.getDirectory();
  }
  
  public final void evictAll() throws IOException {
    this.cache.evictAll();
  }
  
  public final long size() throws IOException {
    return this.cache.size();
  }
  
  public final synchronized void trackConditionalCacheHit$okhttp() {
    int i = this.hitCount;
    this.hitCount = i + 1;
  }
  
  public final long maxSize() {
    return this.cache.getMaxSize();
  }
  
  public final int getWriteSuccessCount$okhttp() {
    return this.writeSuccessCount;
  }
  
  public Cache(@NotNull File paramFile, long paramLong) {
    this(paramFile, paramLong, FileSystem.SYSTEM);
  }
  
  public final int getWriteAbortCount$okhttp() {
    return this.writeAbortCount;
  }
  
  public final void setWriteAbortCount$okhttp(int paramInt) {
    this.writeAbortCount = paramInt;
  }
  
  public final synchronized int hitCount() {
    return this.hitCount;
  }
  
  public final synchronized int writeAbortCount() {
    return this.writeAbortCount;
  }
  
  public void flush() throws IOException {
    this.cache.flush();
  }
  
  @NotNull
  public final File directory() {
    return this.cache.getDirectory();
  }
  
  public final void update$okhttp(@NotNull Response paramResponse1, @NotNull Response paramResponse2) {
    long l = a ^ 0x554FF372EFFDL;
    Intrinsics.checkNotNullParameter(paramResponse1, "cached");
    Intrinsics.checkNotNullParameter(paramResponse2, "network");
    Cache$Entry cache$Entry = new Cache$Entry(paramResponse2);
    try {
      if (paramResponse1.body() == null) {
        paramResponse1.body();
        throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    DiskLruCache.Snapshot snapshot = ((Cache$CacheResponseBody)paramResponse1.body()).getSnapshot();
    DiskLruCache.Editor editor = null;
    try {
      try {
        if (snapshot.edit() == null) {
          snapshot.edit();
          return;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      cache$Entry.writeTo(editor);
      editor.commit();
    } catch (IOException iOException) {
      abortQuietly(editor);
    } 
  }
  
  public final synchronized int writeSuccessCount() {
    return this.writeSuccessCount;
  }
  
  @NotNull
  public static final String key(@NotNull HttpUrl paramHttpUrl) {
    return Companion.key(paramHttpUrl);
  }
  
  public final synchronized void trackResponse$okhttp(@NotNull CacheStrategy paramCacheStrategy) {
    long l = a ^ 0x7995A70AA60DL;
    Intrinsics.checkNotNullParameter(paramCacheStrategy, "cacheStrategy");
    int i = this.requestCount;
    this.requestCount = i + 1;
    if (paramCacheStrategy.getNetworkRequest() != null) {
      i = this.networkCount;
      this.networkCount = i + 1;
    } else if (paramCacheStrategy.getCacheResponse() != null) {
      i = this.hitCount;
      this.hitCount = i + 1;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */