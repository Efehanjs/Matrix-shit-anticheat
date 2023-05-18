package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MatchResult$Destructured {
  @NotNull
  private final MatchResult match;
  
  private static final long a = o3.a(-3922446822602703821L, 2821268959083285692L, null).a(158866915390404L);
  
  @NotNull
  public final MatchResult getMatch() {
    return this.match;
  }
  
  @NotNull
  public final List toList() {
    return this.match.getGroupValues().subList(1, this.match.getGroupValues().size());
  }
  
  public MatchResult$Destructured(@NotNull MatchResult paramMatchResult) {
    this.match = paramMatchResult;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatchResult$Destructured.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */