package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class AccessDeniedException extends FileSystemException {
  private static final long a = o3.a(8504293430143553172L, 3972599331026585961L, null).a(29234311741610L);
  
  public AccessDeniedException(@NotNull File paramFile1, @Nullable File paramFile2, @Nullable String paramString) {
    super(paramFile1, paramFile2, paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\AccessDeniedException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */