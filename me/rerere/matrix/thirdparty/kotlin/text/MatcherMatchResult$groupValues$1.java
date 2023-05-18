package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MatcherMatchResult$groupValues$1 extends AbstractList {
  @NotNull
  public String get(int paramInt) {
    try {
      if (MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this).group(paramInt) == null)
        MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this).group(paramInt); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "";
  }
  
  public int getSize() {
    return MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this).groupCount() + 1;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatcherMatchResult$groupValues$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */