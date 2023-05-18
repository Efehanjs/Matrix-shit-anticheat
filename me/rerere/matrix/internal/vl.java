package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class vl extends Lambda implements Function1 {
  public static final vl i = new vl();
  
  @NotNull
  public final CharSequence b(@NotNull Pair paramPair) {
    return (CharSequence)paramPair.getFirst();
  }
  
  public vl() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */