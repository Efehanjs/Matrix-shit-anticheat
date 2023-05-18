package me.rerere.matrix.thirdparty.okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.internal.FixedLengthSource;
import me.rerere.matrix.thirdparty.okio.internal.ZipEntry;
import me.rerere.matrix.thirdparty.okio.internal.ZipKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ZipFileSystem extends FileSystem {
  @Nullable
  private final String comment;
  
  @NotNull
  private final Path zipPath;
  
  @NotNull
  private static final ZipFileSystem$Companion Companion;
  
  @Deprecated
  @NotNull
  private static final Path ROOT;
  
  @NotNull
  private final Map entries;
  
  @NotNull
  private final FileSystem fileSystem;
  
  private static final long b = o3.a(-71321851567482603L, -8789043505459382504L, MethodHandles.lookup().lookupClass()).a(215612124090734L);
  
  @NotNull
  public Path canonicalize(@NotNull Path paramPath) {
    long l = b ^ 0x7646249796C4L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    return canonicalizeInternal(paramPath);
  }
  
  @Nullable
  public FileMetadata metadataOrNull(@NotNull Path paramPath) {
    long l = b ^ 0x20A179767220L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    Path path = canonicalizeInternal(paramPath);
    ZipEntry zipEntry2 = (ZipEntry)this.entries.get(path);
    try {
      if (zipEntry2 == null)
        return null; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    ZipEntry zipEntry1 = zipEntry2;
    try {
    
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    FileMetadata fileMetadata = new FileMetadata(!zipEntry1.isDirectory(), zipEntry1.isDirectory(), null, zipEntry1.isDirectory() ? null : Long.valueOf(zipEntry1.getSize()), null, zipEntry1.getLastModifiedAtMillis(), null, null, 128, null);
    try {
      if (zipEntry1.getOffset() == -1L)
        return fileMetadata; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    FileHandle fileHandle = this.fileSystem.openReadOnly(this.zipPath);
    boolean bool = false;
    BufferedSource bufferedSource2 = null;
    Throwable throwable = null;
    try {
      FileHandle fileHandle1 = fileHandle;
      boolean bool1 = false;
      bufferedSource2 = Okio.buffer(fileHandle1.source(zipEntry1.getOffset()));
    } catch (Throwable throwable1) {
      throwable = throwable1;
    } 
    try {
      FileHandle fileHandle1 = fileHandle;
      try {
        if (fileHandle1 != null)
          fileHandle1.close(); 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
    } catch (Throwable throwable1) {
      if (throwable == null) {
        throwable = throwable1;
      } else {
        ExceptionsKt.addSuppressed(throwable, throwable1);
      } 
    } 
    try {
      if (throwable != null)
        throw throwable; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(bufferedSource2);
    BufferedSource bufferedSource1 = bufferedSource2;
    return ZipKt.readLocalHeader(bufferedSource1, fileMetadata);
  }
  
  @NotNull
  public Sink sink(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x47C0C7C2E1B2L;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new IOException("zip file systems are read-only");
  }
  
  @NotNull
  public List list(@NotNull Path paramPath) {
    long l = b ^ 0x591A3776EE42L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    Intrinsics.checkNotNull(list(paramPath, true));
    return list(paramPath, true);
  }
  
  static {
    Companion = new ZipFileSystem$Companion(null);
    ROOT = Path$Companion.get$default(Path.Companion, "/", false, 1, (Object)null);
  }
  
  public void delete(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x42379C762C34L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    throw new IOException("zip file systems are read-only");
  }
  
  @NotNull
  public FileHandle openReadOnly(@NotNull Path paramPath) {
    long l = b ^ 0x12B0AC8A5D5CL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new UnsupportedOperationException("not implemented yet!");
  }
  
  public void createSymlink(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = b ^ 0x72820D7E852FL;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    throw new IOException("zip file systems are read-only");
  }
  
  @NotNull
  public Source source(@NotNull Path paramPath) throws IOException {
    long l = b ^ 0x63543561199BL;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    Path path = canonicalizeInternal(paramPath);
    ZipEntry zipEntry2 = (ZipEntry)this.entries.get(path);
    try {
      if (zipEntry2 == null)
        throw new FileNotFoundException(Intrinsics.stringPlus("no such file: ", paramPath)); 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    ZipEntry zipEntry1 = zipEntry2;
    FileHandle fileHandle = this.fileSystem.openReadOnly(this.zipPath);
    boolean bool = false;
    BufferedSource bufferedSource2 = null;
    Throwable throwable = null;
    try {
      FileHandle fileHandle1 = fileHandle;
      boolean bool1 = false;
      bufferedSource2 = Okio.buffer(fileHandle1.source(zipEntry1.getOffset()));
    } catch (Throwable throwable1) {
      throwable = throwable1;
    } 
    try {
      FileHandle fileHandle1 = fileHandle;
      try {
        if (fileHandle1 != null)
          fileHandle1.close(); 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
    } catch (Throwable throwable1) {
      if (throwable == null) {
        throwable = throwable1;
      } else {
        ExceptionsKt.addSuppressed(throwable, throwable1);
      } 
    } 
    try {
      if (throwable != null)
        throw throwable; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(bufferedSource2);
    BufferedSource bufferedSource1 = bufferedSource2;
    ZipKt.skipLocalHeader(bufferedSource1);
    int i = zipEntry1.getCompressionMethod();
    try {
      InflaterSource inflaterSource = new InflaterSource((Source)new FixedLengthSource(bufferedSource1, zipEntry1.getCompressedSize(), true), new Inflater(true));
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    return (i == 0) ? (Source)new FixedLengthSource(bufferedSource1, zipEntry1.getSize(), true) : (Source)new FixedLengthSource(inflaterSource, zipEntry1.getSize(), false);
  }
  
  public void createDirectory(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x1F4CA0A374DEL;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    throw new IOException("zip file systems are read-only");
  }
  
  @NotNull
  public FileHandle openReadWrite(@NotNull Path paramPath, boolean paramBoolean1, boolean paramBoolean2) {
    long l = b ^ 0x4D6D1B0E5216L;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new IOException("zip entries are not writable");
  }
  
  @Nullable
  public List listOrNull(@NotNull Path paramPath) {
    long l = b ^ 0x6B227A33FD17L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    return list(paramPath, false);
  }
  
  @NotNull
  public Sink appendingSink(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x18932C8377FFL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new IOException("zip file systems are read-only");
  }
  
  public ZipFileSystem(@NotNull Path paramPath, @NotNull FileSystem paramFileSystem, @NotNull Map paramMap, @Nullable String paramString) {
    this.zipPath = paramPath;
    this.fileSystem = paramFileSystem;
    this.entries = paramMap;
    this.comment = paramString;
  }
  
  public void atomicMove(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = b ^ 0x596C80568DA3L;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    throw new IOException("zip file systems are read-only");
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\ZipFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */