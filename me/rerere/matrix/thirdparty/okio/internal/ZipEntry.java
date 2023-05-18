package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ZipEntry {
  @NotNull
  private final List children;
  
  private final long compressedSize;
  
  @Nullable
  private final Long lastModifiedAtMillis;
  
  private final int compressionMethod;
  
  private final long offset;
  
  private final boolean isDirectory;
  
  private final long size;
  
  @NotNull
  private final Path canonicalPath;
  
  @NotNull
  private final String comment;
  
  private final long crc;
  
  private static final long a = o3.a(3653101254786617275L, -1066753738752618055L, MethodHandles.lookup().lookupClass()).a(117953661757577L);
  
  public final long getSize() {
    return this.size;
  }
  
  public final long getCrc() {
    return this.crc;
  }
  
  public final boolean isDirectory() {
    return this.isDirectory;
  }
  
  @NotNull
  public final List getChildren() {
    return this.children;
  }
  
  @Nullable
  public final Long getLastModifiedAtMillis() {
    return this.lastModifiedAtMillis;
  }
  
  public final long getCompressedSize() {
    return this.compressedSize;
  }
  
  public ZipEntry(@NotNull Path paramPath, boolean paramBoolean, @NotNull String paramString, long paramLong1, long paramLong2, long paramLong3, int paramInt, @Nullable Long paramLong, long paramLong4) {
    this.canonicalPath = paramPath;
    this.isDirectory = paramBoolean;
    this.comment = paramString;
    this.crc = paramLong1;
    this.compressedSize = paramLong2;
    this.size = paramLong3;
    this.compressionMethod = paramInt;
    this.lastModifiedAtMillis = paramLong;
    this.offset = paramLong4;
    boolean bool = false;
    this.children = new ArrayList();
  }
  
  public final int getCompressionMethod() {
    return this.compressionMethod;
  }
  
  public final long getOffset() {
    return this.offset;
  }
  
  @NotNull
  public final Path getCanonicalPath() {
    return this.canonicalPath;
  }
  
  @NotNull
  public final String getComment() {
    return this.comment;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ZipEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */