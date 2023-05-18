package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DiskLruCache$snapshots$1 implements Iterator, KMutableIterator {
  @Nullable
  private DiskLruCache$Snapshot removeSnapshot;
  
  @NotNull
  private final Iterator delegate;
  
  @Nullable
  private DiskLruCache$Snapshot nextSnapshot;
  
  private static final long a = o3.a(-5114618044580740126L, -1137051296622079116L, MethodHandles.lookup().lookupClass()).a(10193089395923L);
  
  public void remove() {
    long l = a ^ 0xF8FABDEF07L;
    DiskLruCache$Snapshot diskLruCache$Snapshot = this.removeSnapshot;
    if (diskLruCache$Snapshot == null) {
      boolean bool = false;
      String str = "remove() before next()";
      throw new IllegalStateException(str.toString());
    } 
    try {
      DiskLruCache.this.remove(diskLruCache$Snapshot.key());
    } catch (IOException iOException) {
    
    } finally {
      this.removeSnapshot = null;
    } 
  }
  
  public DiskLruCache$snapshots$1() {
    Iterator<?> iterator = (new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values())).iterator();
    Intrinsics.checkNotNullExpressionValue(iterator, "ArrayList(lruEntries.values).iterator()");
    this.delegate = iterator;
  }
  
  public boolean hasNext() {
    try {
      if (this.nextSnapshot != null)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    DiskLruCache diskLruCache1 = DiskLruCache.this;
    DiskLruCache diskLruCache2 = DiskLruCache.this;
    synchronized (diskLruCache1) {
      boolean bool = false;
      if (diskLruCache2.getClosed$okhttp())
        return false; 
      while (true) {
        try {
          if (this.delegate.hasNext()) {
            try {
              (DiskLruCache$Entry)this.delegate.next();
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            try {
              if ((((DiskLruCache$Entry)this.delegate.next() == null) ? null : ((DiskLruCache$Entry)this.delegate.next()).snapshot$okhttp()) == null) {
                ((DiskLruCache$Entry)this.delegate.next() == null) ? null : ((DiskLruCache$Entry)this.delegate.next()).snapshot$okhttp();
                ((DiskLruCache$Entry)this.delegate.next() == null) ? null : ((DiskLruCache$Entry)this.delegate.next()).snapshot$okhttp();
                continue;
              } 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            ((DiskLruCache$snapshots$1)(((DiskLruCache$Entry)this.delegate.next() == null) ? null : ((DiskLruCache$Entry)this.delegate.next()).snapshot$okhttp())).nextSnapshot = ((DiskLruCache$Entry)this.delegate.next() == null) ? null : ((DiskLruCache$Entry)this.delegate.next()).snapshot$okhttp();
            return true;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Unit unit = Unit.INSTANCE;
        return false;
      } 
    } 
  }
  
  @NotNull
  public DiskLruCache$Snapshot next() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.removeSnapshot = this.nextSnapshot;
    this.nextSnapshot = null;
    Intrinsics.checkNotNull(this.removeSnapshot);
    return this.removeSnapshot;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$snapshots$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */