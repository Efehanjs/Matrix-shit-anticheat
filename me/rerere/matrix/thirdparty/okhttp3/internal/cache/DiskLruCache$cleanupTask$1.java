package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;
import me.rerere.matrix.thirdparty.okio.Okio;

public final class DiskLruCache$cleanupTask$1 extends Task {
  public DiskLruCache$cleanupTask$1(String paramString) {
    super(paramString, false, 2, null);
  }
  
  public long runOnce() {
    DiskLruCache diskLruCache1 = DiskLruCache.this;
    DiskLruCache diskLruCache2 = DiskLruCache.this;
    synchronized (diskLruCache1) {
      boolean bool = false;
      try {
        if (!DiskLruCache.access$getInitialized$p(diskLruCache2) || diskLruCache2.getClosed$okhttp())
          return -1L; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        diskLruCache2.trimToSize();
      } catch (IOException iOException) {
        DiskLruCache.access$setMostRecentTrimFailed$p(diskLruCache2, true);
      } 
      try {
        try {
          if (DiskLruCache.access$journalRebuildRequired(diskLruCache2)) {
            diskLruCache2.rebuildJournal$okhttp();
            DiskLruCache.access$setRedundantOpCount$p(diskLruCache2, 0);
          } 
        } catch (IOException iOException) {
          DiskLruCache.access$setMostRecentRebuildFailed$p(diskLruCache2, true);
          DiskLruCache.access$setJournalWriter$p(diskLruCache2, Okio.buffer(Okio.blackhole()));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$cleanupTask$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */