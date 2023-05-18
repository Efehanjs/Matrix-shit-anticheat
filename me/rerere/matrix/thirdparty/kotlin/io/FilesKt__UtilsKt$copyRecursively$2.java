package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.io.IOException;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements Function2 {
  public FilesKt__UtilsKt$copyRecursively$2(Function2 paramFunction2) {
    super(2);
  }
  
  public final void invoke(@NotNull File paramFile, @NotNull IOException paramIOException) {
    try {
      Intrinsics.checkNotNullParameter(paramFile, "f");
      Intrinsics.checkNotNullParameter(paramIOException, "e");
      if (this.$onError.invoke(paramFile, paramIOException) == OnErrorAction.TERMINATE)
        throw new TerminateException(paramFile); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__UtilsKt$copyRecursively$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */