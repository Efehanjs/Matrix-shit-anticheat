package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DiskLruCache$Snapshot implements Closeable {
  private final long sequenceNumber;
  
  @NotNull
  private final String key;
  
  @NotNull
  private final long[] lengths;
  
  @NotNull
  private final List sources;
  
  private static final long a = o3.a(722629337553566020L, 7906049123320410503L, MethodHandles.lookup().lookupClass()).a(31944250277108L);
  
  @NotNull
  public final Source getSource(int paramInt) {
    return this.sources.get(paramInt);
  }
  
  public void close() {
    for (Source source : this.sources)
      Util.closeQuietly((Closeable)source); 
  }
  
  public final long getLength(int paramInt) {
    return this.lengths[paramInt];
  }
  
  @NotNull
  public final String key() {
    return this.key;
  }
  
  @Nullable
  public final DiskLruCache$Editor edit() throws IOException {
    return DiskLruCache.this.edit(this.key, this.sequenceNumber);
  }
  
  public DiskLruCache$Snapshot(String paramString, @NotNull long paramLong, @NotNull List paramList, long[] paramArrayOflong) {
    this.key = paramString;
    this.sequenceNumber = paramLong;
    this.sources = paramList;
    this.lengths = paramArrayOflong;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$Snapshot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */