package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FilePathComponents {
  @NotNull
  private final List segments;
  
  @NotNull
  private final File root;
  
  private static final long a = o3.a(-8820207509027387099L, -7080369625382312942L, null).a(50413485478993L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x5151F47B23FEL;
    return "FilePathComponents(root=" + this.root + ", segments=" + this.segments + ')';
  }
  
  @NotNull
  public final List getSegments() {
    return this.segments;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof FilePathComponents))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    FilePathComponents filePathComponents = (FilePathComponents)paramObject;
    try {
      if (!Intrinsics.areEqual(this.root, filePathComponents.root))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.segments, filePathComponents.segments))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final File getRoot() {
    return this.root;
  }
  
  public final int getSize() {
    return this.segments.size();
  }
  
  public int hashCode() {
    null = this.root.hashCode();
    return null * 31 + this.segments.hashCode();
  }
  
  @NotNull
  public final String getRootName() {
    long l = a ^ 0x258A3BB9C7D2L;
    Intrinsics.checkNotNullExpressionValue(this.root.getPath(), "root.path");
    return this.root.getPath();
  }
  
  @NotNull
  public final File component1() {
    return this.root;
  }
  
  public FilePathComponents(@NotNull File paramFile, @NotNull List paramList) {
    this.root = paramFile;
    this.segments = paramList;
  }
  
  @NotNull
  public final File subPath(int paramInt1, int paramInt2) {
    long l = a ^ 0x3EA385C00A75L;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= paramInt2)
            try {
              if (paramInt2 <= getSize()) {
                Intrinsics.checkNotNullExpressionValue(File.separator, "separator");
                return new File(CollectionsKt.joinToString$default(this.segments.subList(paramInt1, paramInt2), File.separator, null, null, 0, null, null, 62, null));
              } 
              throw new IllegalArgumentException();
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException();
  }
  
  public final boolean isRooted() {
    long l = a ^ 0x3469FD968A8AL;
    try {
      Intrinsics.checkNotNullExpressionValue(this.root.getPath(), "root.path");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (((CharSequence)this.root.getPath()).length() > 0);
  }
  
  @NotNull
  public final FilePathComponents copy(@NotNull File paramFile, @NotNull List paramList) {
    long l = a ^ 0xF438C751EB4L;
    Intrinsics.checkNotNullParameter(paramFile, "root");
    Intrinsics.checkNotNullParameter(paramList, "segments");
    return new FilePathComponents(paramFile, paramList);
  }
  
  @NotNull
  public final List component2() {
    return this.segments;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilePathComponents.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */