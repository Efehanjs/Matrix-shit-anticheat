package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.KotlinNothingValueException;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DiskLruCache$Entry {
  @NotNull
  private final List cleanFiles;
  
  @NotNull
  private final List dirtyFiles;
  
  private boolean readable;
  
  @NotNull
  private final String key;
  
  private long sequenceNumber;
  
  @Nullable
  private DiskLruCache$Editor currentEditor;
  
  private boolean zombie;
  
  private int lockingSourceCount;
  
  @NotNull
  private final long[] lengths;
  
  private static final long a = o3.a(4628678513589727889L, 830695354121653313L, MethodHandles.lookup().lookupClass()).a(253408335004284L);
  
  @Nullable
  public final DiskLruCache$Editor getCurrentEditor$okhttp() {
    return this.currentEditor;
  }
  
  public final long getSequenceNumber$okhttp() {
    return this.sequenceNumber;
  }
  
  public final int getLockingSourceCount$okhttp() {
    return this.lockingSourceCount;
  }
  
  @NotNull
  public final String getKey$okhttp() {
    return this.key;
  }
  
  public final void setSequenceNumber$okhttp(long paramLong) {
    this.sequenceNumber = paramLong;
  }
  
  @NotNull
  public final List getDirtyFiles$okhttp() {
    return this.dirtyFiles;
  }
  
  public final void setLockingSourceCount$okhttp(int paramInt) {
    this.lockingSourceCount = paramInt;
  }
  
  public final boolean getZombie$okhttp() {
    return this.zombie;
  }
  
  @Nullable
  public final DiskLruCache$Snapshot snapshot$okhttp() {
    long l = a ^ 0x57A9036C2E2AL;
    DiskLruCache diskLruCache = DiskLruCache.this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(diskLruCache))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!this.readable)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!DiskLruCache.access$getCivilizedFileSystem$p(DiskLruCache.this))
        try {
          if (this.currentEditor == null) {
            try {
              if (this.zombie)
                return null; 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            return null;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    ArrayList<Source> arrayList = new ArrayList();
    long[] arrayOfLong = (long[])this.lengths.clone();
    try {
      byte b = 0;
      int i = DiskLruCache.this.getValueCount$okhttp();
      while (b < i) {
        byte b1 = b;
        b++;
        arrayList.add(newSource(b1));
      } 
      return new DiskLruCache$Snapshot(DiskLruCache.this, this.key, this.sequenceNumber, arrayList, arrayOfLong);
    } catch (FileNotFoundException fileNotFoundException) {
      for (Source source : arrayList)
        Util.closeQuietly((Closeable)source); 
      try {
        DiskLruCache.this.removeEntry$okhttp(this);
      } catch (IOException iOException) {}
      return null;
    } 
  }
  
  public final boolean getReadable$okhttp() {
    return this.readable;
  }
  
  public DiskLruCache$Entry(String paramString) {
    this.key = paramString;
    this.lengths = new long[DiskLruCache.this.getValueCount$okhttp()];
    this.cleanFiles = new ArrayList();
    this.dirtyFiles = new ArrayList();
    StringBuilder stringBuilder = (new StringBuilder(this.key)).append('.');
    int i = stringBuilder.length();
    byte b = 0;
    int j = DiskLruCache.this.getValueCount$okhttp();
    while (b < j) {
      byte b1 = b;
      b++;
      stringBuilder.append(b1);
      this.cleanFiles.add(new File(DiskLruCache.this.getDirectory(), stringBuilder.toString()));
      stringBuilder.append(".tmp");
      this.dirtyFiles.add(new File(DiskLruCache.this.getDirectory(), stringBuilder.toString()));
      stringBuilder.setLength(i);
    } 
  }
  
  @NotNull
  public final long[] getLengths$okhttp() {
    return this.lengths;
  }
  
  public final void setZombie$okhttp(boolean paramBoolean) {
    this.zombie = paramBoolean;
  }
  
  @NotNull
  public final List getCleanFiles$okhttp() {
    return this.cleanFiles;
  }
  
  public final void setCurrentEditor$okhttp(@Nullable DiskLruCache$Editor paramDiskLruCache$Editor) {
    this.currentEditor = paramDiskLruCache$Editor;
  }
  
  public final void setLengths$okhttp(@NotNull List paramList) throws IOException {
    long l = a ^ 0x33D58CEC634FL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "strings");
      if (paramList.size() != DiskLruCache.this.getValueCount$okhttp()) {
        invalidLengths(paramList);
        throw new KotlinNothingValueException();
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      byte b = 0;
      int i = paramList.size();
      while (b < i) {
        byte b1 = b;
        b++;
        this.lengths[b1] = Long.parseLong((String)paramList.get(b1));
      } 
    } catch (NumberFormatException numberFormatException) {
      invalidLengths(paramList);
      throw new KotlinNothingValueException();
    } 
  }
  
  public final void setReadable$okhttp(boolean paramBoolean) {
    this.readable = paramBoolean;
  }
  
  public final void writeLengths$okhttp(@NotNull BufferedSink paramBufferedSink) throws IOException {
    long l = a ^ 0x6788B9EC3706L;
    Intrinsics.checkNotNullParameter(paramBufferedSink, "writer");
    long[] arrayOfLong = this.lengths;
    byte b = 0;
    int i = arrayOfLong.length;
    while (b < i) {
      long l1 = arrayOfLong[b];
      b++;
      paramBufferedSink.writeByte(32).writeDecimalLong(l1);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$Entry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */