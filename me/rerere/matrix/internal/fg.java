package me.rerere.matrix.internal;

import java.io.File;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class fg extends Lambda implements Function1 {
  public static final fg i = new fg();
  
  public final String b(@NotNull File paramFile) {
    return paramFile.getName();
  }
  
  public fg() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */