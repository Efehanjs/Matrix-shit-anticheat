package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.okio.ForwardingSource;
import me.rerere.matrix.thirdparty.okio.Source;

public final class DiskLruCache$Entry$newSource$1 extends ForwardingSource {
  private boolean closed;
  
  public DiskLruCache$Entry$newSource$1(DiskLruCache paramDiskLruCache, DiskLruCache$Entry paramDiskLruCache$Entry) {
    super(paramSource);
  }
  
  public void close() {
    super.close();
    if (!this.closed) {
      this.closed = true;
      DiskLruCache diskLruCache1 = this.this$0;
      DiskLruCache$Entry diskLruCache$Entry = DiskLruCache$Entry.this;
      DiskLruCache diskLruCache2 = this.this$0;
      synchronized (diskLruCache1) {
        boolean bool = false;
        int i = diskLruCache$Entry.getLockingSourceCount$okhttp();
        try {
          diskLruCache$Entry.setLockingSourceCount$okhttp(i + -1);
          if (diskLruCache$Entry.getLockingSourceCount$okhttp() == 0)
            try {
              if (diskLruCache$Entry.getZombie$okhttp())
                diskLruCache2.removeEntry$okhttp(diskLruCache$Entry); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        Unit unit = Unit.INSTANCE;
      } 
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$Entry$newSource$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */