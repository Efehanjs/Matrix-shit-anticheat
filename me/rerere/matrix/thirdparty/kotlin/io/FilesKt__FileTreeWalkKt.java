package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class FilesKt__FileTreeWalkKt extends FilesKt__FileReadWriteKt {
  private static final long c = o3.a(-8323378329862340028L, -4377614202616159286L, null).a(70019983908286L);
  
  @NotNull
  public static final FileTreeWalk walkTopDown(@NotNull File paramFile) {
    long l = c ^ 0x3582D8A25390L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return FilesKt.walk(paramFile, FileWalkDirection.TOP_DOWN);
  }
  
  @NotNull
  public static final FileTreeWalk walkBottomUp(@NotNull File paramFile) {
    long l = c ^ 0x3EAC729B4E07L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return FilesKt.walk(paramFile, FileWalkDirection.BOTTOM_UP);
  }
  
  @NotNull
  public static final FileTreeWalk walk(@NotNull File paramFile, @NotNull FileWalkDirection paramFileWalkDirection) {
    long l = c ^ 0x73A2A97E480L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramFileWalkDirection, "direction");
    return new FileTreeWalk(paramFile, paramFileWalkDirection);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__FileTreeWalkKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */