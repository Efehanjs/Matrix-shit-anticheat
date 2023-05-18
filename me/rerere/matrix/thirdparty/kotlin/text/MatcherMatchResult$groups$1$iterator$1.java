package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements Function1 {
  public MatcherMatchResult$groups$1$iterator$1() {
    super(1);
  }
  
  @Nullable
  public final MatchGroup invoke(int paramInt) {
    return MatcherMatchResult$groups$1.this.get(paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatcherMatchResult$groups$1$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */