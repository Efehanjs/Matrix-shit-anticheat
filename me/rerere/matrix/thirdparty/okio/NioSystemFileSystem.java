package me.rerere.matrix.thirdparty.okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class NioSystemFileSystem extends JvmSystemFileSystem {
  private static final long c = o3.a(798458402542425939L, -4282794564309794813L, MethodHandles.lookup().lookupClass()).a(13379266467691L);
  
  public void createSymlink(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = c ^ 0x6B7FA560AF7DL;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    Files.createSymbolicLink(paramPath1.toNioPath(), paramPath2.toNioPath(), (FileAttribute<?>[])new FileAttribute[0]);
  }
  
  public void atomicMove(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = c ^ 0x40912848A7F1L;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    try {
      CopyOption[] arrayOfCopyOption = new CopyOption[2];
      arrayOfCopyOption[0] = StandardCopyOption.ATOMIC_MOVE;
      arrayOfCopyOption[1] = StandardCopyOption.REPLACE_EXISTING;
      Files.move(paramPath1.toNioPath(), paramPath2.toNioPath(), arrayOfCopyOption);
    } catch (NoSuchFileException noSuchFileException) {
      throw new FileNotFoundException(noSuchFileException.getMessage());
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw new IOException("atomic move not supported");
    } 
  }
  
  @NotNull
  public String toString() {
    long l = c ^ 0x638B572E3426L;
    return "NioSystemFileSystem";
  }
  
  @Nullable
  public FileMetadata metadataOrNull(@NotNull Path paramPath) {
    LinkOption[] arrayOfLinkOption2;
    long l = c ^ 0x395CD1685872L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    Path path1 = paramPath.toNioPath();
    try {
      arrayOfLinkOption2 = new LinkOption[1];
      arrayOfLinkOption2[0] = LinkOption.NOFOLLOW_LINKS;
      arrayOfLinkOption2 = Files.readAttributes(path1, BasicFileAttributes.class, arrayOfLinkOption2);
    } catch (NoSuchFileException noSuchFileException) {
      return null;
    } catch (FileSystemException fileSystemException) {
      return null;
    } 
    LinkOption[] arrayOfLinkOption1 = arrayOfLinkOption2;
    try {
    
    } catch (NoSuchFileException noSuchFileException) {
      throw a(null);
    } 
    Path path2 = arrayOfLinkOption1.isSymbolicLink() ? Files.readSymbolicLink(path1) : (Path)null;
    Path path3 = path2;
    FileTime fileTime = arrayOfLinkOption1.creationTime();
    fileTime = arrayOfLinkOption1.lastModifiedTime();
    fileTime = arrayOfLinkOption1.lastAccessTime();
    return new FileMetadata(arrayOfLinkOption1.isRegularFile(), arrayOfLinkOption1.isDirectory(), (path3 == null) ? null : Path$Companion.get$default(Path.Companion, path3, false, 1, (Object)null), Long.valueOf(arrayOfLinkOption1.size()), (fileTime == null) ? null : zeroToNull(fileTime), (fileTime == null) ? null : zeroToNull(fileTime), (fileTime == null) ? null : zeroToNull(fileTime), null, 128, null);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\NioSystemFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */