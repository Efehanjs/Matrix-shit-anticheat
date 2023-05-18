package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterator;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.DiskLruCache;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Cache$urls$1 implements Iterator, KMutableIterator {
  @Nullable
  private String nextUrl;
  
  @NotNull
  private final Iterator delegate = Cache.this.getCache$okhttp().snapshots();
  
  private boolean canRemove;
  
  private static final long a = o3.a(-5466885323848774572L, -6482815998845749054L, MethodHandles.lookup().lookupClass()).a(140680224725849L);
  
  @NotNull
  public String next() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.nextUrl);
    String str = this.nextUrl;
    this.nextUrl = null;
    this.canRemove = true;
    return str;
  }
  
  public boolean hasNext() {
    try {
      if (this.nextUrl != null)
        return true; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.canRemove = false;
    while (this.delegate.hasNext()) {
      try {
        Closeable closeable = this.delegate.next();
        Throwable throwable = null;
        try {
          DiskLruCache.Snapshot snapshot = (DiskLruCache.Snapshot)closeable;
          boolean bool = false;
          BufferedSource bufferedSource = Okio.buffer(snapshot.getSource(0));
          this.nextUrl = bufferedSource.readUtf8LineStrict();
          return true;
        } catch (Throwable throwable1) {
          throwable = throwable1;
          throw throwable1;
        } finally {
          CloseableKt.closeFinally(closeable, throwable);
        } 
      } catch (IOException iOException) {}
    } 
    return false;
  }
  
  public void remove() {
    long l = a ^ 0x17658558ADCDL;
    if (!this.canRemove) {
      boolean bool = false;
      String str = "remove() before next()";
      throw new IllegalStateException(str.toString());
    } 
    this.delegate.remove();
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$urls$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */