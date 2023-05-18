package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class fd extends Lambda implements Function1 {
  public static final fd i = new fd();
  
  public fd() {
    super(1);
  }
  
  @NotNull
  public final CharSequence b(@NotNull ef paramef) {
    return paramef.b();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */