package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.entity.Player;

public final class aj extends Lambda implements Function1 {
  public static final aj i = new aj();
  
  public aj() {
    super(1);
  }
  
  @Nullable
  public final Player b(@NotNull Pair paramPair) {
    return (Player)paramPair.component1();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */