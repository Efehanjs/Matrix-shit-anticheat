package me.rerere.matrix.thirdparty.kotlin.io;

import java.util.ArrayList;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FilesKt__FileReadWriteKt$readLines$1 extends Lambda implements Function1 {
  private static final long a = o3.a(-4500254550480862059L, 3836520741908362122L, null).a(164169195455613L);
  
  public FilesKt__FileReadWriteKt$readLines$1(ArrayList paramArrayList) {
    super(1);
  }
  
  public final void invoke(@NotNull String paramString) {
    long l = a ^ 0xAB34CCDC246L;
    Intrinsics.checkNotNullParameter(paramString, "it");
    this.$result.add(paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__FileReadWriteKt$readLines$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */