package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
public interface MatchNamedGroupCollection extends MatchGroupCollection {
  @Nullable
  MatchGroup get(@NotNull String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatchNamedGroupCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */