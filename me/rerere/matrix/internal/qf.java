package me.rerere.matrix.internal;

import java.io.File;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class qf extends Lambda implements Function1 {
  public static final qf i = new qf();
  
  @NotNull
  public final Boolean b(@NotNull File paramFile) {
    return Boolean.valueOf(paramFile.isFile());
  }
  
  public qf() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */