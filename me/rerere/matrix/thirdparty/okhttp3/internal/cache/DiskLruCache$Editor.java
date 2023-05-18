package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DiskLruCache$Editor {
  @NotNull
  private final DiskLruCache$Entry entry;
  
  @Nullable
  private final boolean[] written;
  
  private boolean done;
  
  private static final long a = o3.a(7786504628713500672L, 5989449612990677884L, MethodHandles.lookup().lookupClass()).a(151014384706706L);
  
  @NotNull
  public final Sink newSink(int paramInt) {
    long l = a ^ 0x11B429CFD85FL;
    DiskLruCache diskLruCache1 = DiskLruCache.this;
    DiskLruCache diskLruCache2 = DiskLruCache.this;
    synchronized (diskLruCache1) {
      boolean bool = false;
      try {
        if (!(!this.done ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        throw a(null);
      } 
      if (!Intrinsics.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this))
        return Okio.blackhole(); 
      try {
        if (!getEntry$okhttp().getReadable$okhttp()) {
          Intrinsics.checkNotNull(getWritten$okhttp());
          getWritten$okhttp()[paramInt] = true;
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        throw a(null);
      } 
      File file = getEntry$okhttp().getDirtyFiles$okhttp().get(paramInt);
      Sink sink = null;
      try {
        sink = diskLruCache2.getFileSystem$okhttp().sink(file);
      } catch (FileNotFoundException fileNotFoundException) {
        return Okio.blackhole();
      } 
      return (Sink)new FaultHidingSink(sink, new DiskLruCache$Editor$newSink$1$1(diskLruCache2, this));
    } 
  }
  
  public final void detach$okhttp() {
    try {
      if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this))
        try {
          if (DiskLruCache.access$getCivilizedFileSystem$p(DiskLruCache.this)) {
            DiskLruCache.this.completeEdit$okhttp(this, false);
          } else {
            this.entry.setZombie$okhttp(true);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  @Nullable
  public final boolean[] getWritten$okhttp() {
    return this.written;
  }
  
  public final void commit() throws IOException {
    long l = a ^ 0x36839CA472E2L;
    DiskLruCache diskLruCache1 = DiskLruCache.this;
    DiskLruCache diskLruCache2 = DiskLruCache.this;
    synchronized (diskLruCache1) {
      boolean bool = false;
      try {
        if (!(!this.done ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (Intrinsics.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this))
          diskLruCache2.completeEdit$okhttp(this, true); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.done = true;
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  @Nullable
  public final Source newSource(int paramInt) {
    long l = a ^ 0x2A98702E7FC9L;
    DiskLruCache diskLruCache1 = DiskLruCache.this;
    DiskLruCache diskLruCache2 = DiskLruCache.this;
    synchronized (diskLruCache1) {
      boolean bool = false;
      try {
        if (!(!this.done ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        throw a(null);
      } 
      try {
        if (getEntry$okhttp().getReadable$okhttp())
          try {
            if (Intrinsics.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this) && !getEntry$okhttp().getZombie$okhttp()) {
              Source source;
              try {
                source = diskLruCache2.getFileSystem$okhttp().source(getEntry$okhttp().getCleanFiles$okhttp().get(paramInt));
              } catch (FileNotFoundException fileNotFoundException) {
                source = (Source)null;
              } 
              return source;
            } 
          } catch (FileNotFoundException fileNotFoundException) {
            throw a(null);
          }  
      } catch (FileNotFoundException fileNotFoundException) {
        throw a(null);
      } 
      return null;
    } 
  }
  
  @NotNull
  public final DiskLruCache$Entry getEntry$okhttp() {
    return this.entry;
  }
  
  public DiskLruCache$Editor(DiskLruCache$Entry paramDiskLruCache$Entry) {
    this.entry = paramDiskLruCache$Entry;
    this.written = this.entry.getReadable$okhttp() ? null : new boolean[DiskLruCache.this.getValueCount$okhttp()];
  }
  
  public final void abort() throws IOException {
    long l = a ^ 0x44B357AE436BL;
    DiskLruCache diskLruCache1 = DiskLruCache.this;
    DiskLruCache diskLruCache2 = DiskLruCache.this;
    synchronized (diskLruCache1) {
      boolean bool = false;
      try {
        if (!(!this.done ? 1 : 0)) {
          String str = "Check failed.";
          throw new IllegalStateException(str.toString());
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (Intrinsics.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this))
          diskLruCache2.completeEdit$okhttp(this, false); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.done = true;
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$Editor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */