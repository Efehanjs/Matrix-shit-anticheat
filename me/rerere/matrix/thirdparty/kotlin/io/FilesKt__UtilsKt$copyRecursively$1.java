package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements Function2 {
  public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE;
  
  private static final long a = o3.a(-8065356045223344756L, -8017034194780317853L, null).a(274464096282497L);
  
  static {
    INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();
  }
  
  public FilesKt__UtilsKt$copyRecursively$1() {
    super(2);
  }
  
  @NotNull
  public final Void invoke(@NotNull File paramFile, @NotNull IOException paramIOException) {
    long l = a ^ 0x7FA8ED16FD9BL;
    Intrinsics.checkNotNullParameter(paramFile, "<anonymous parameter 0>");
    Intrinsics.checkNotNullParameter(paramIOException, "exception");
    throw paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__UtilsKt$copyRecursively$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */