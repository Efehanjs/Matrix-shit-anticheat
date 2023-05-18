package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MatcherMatchResult implements MatchResult {
  @NotNull
  private final MatchGroupCollection groups;
  
  @NotNull
  private final CharSequence input;
  
  @NotNull
  private final Matcher matcher;
  
  @Nullable
  private List groupValues_;
  
  private static final long a = o3.a(-3668299206040321640L, -5028457965664387115L, null).a(279300930116295L);
  
  @NotNull
  public List getGroupValues() {
    try {
      if (this.groupValues_ == null)
        this.groupValues_ = (List)new MatcherMatchResult$groupValues$1(this); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.groupValues_);
    return this.groupValues_;
  }
  
  @NotNull
  public MatchResult$Destructured getDestructured() {
    return MatchResult$DefaultImpls.getDestructured(this);
  }
  
  @NotNull
  public String getValue() {
    long l = a ^ 0x52E0BD9CCD3FL;
    Intrinsics.checkNotNullExpressionValue(getMatchResult().group(), "matchResult.group()");
    return getMatchResult().group();
  }
  
  public MatcherMatchResult(@NotNull Matcher paramMatcher, @NotNull CharSequence paramCharSequence) {
    this.matcher = paramMatcher;
    this.input = paramCharSequence;
    this.groups = new MatcherMatchResult$groups$1(this);
  }
  
  @NotNull
  public MatchGroupCollection getGroups() {
    return this.groups;
  }
  
  @NotNull
  public IntRange getRange() {
    return RegexKt.access$range(getMatchResult());
  }
  
  @Nullable
  public MatchResult next() {
    long l = a ^ 0x116B178480F7L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = getMatchResult().end() + ((getMatchResult().end() == getMatchResult().start()) ? 1 : 0);
    try {
      Intrinsics.checkNotNullExpressionValue(this.matcher.pattern().matcher(this.input), "matcher.pattern().matcher(input)");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i <= this.input.length()) ? RegexKt.access$findNext(this.matcher.pattern().matcher(this.input), i, this.input) : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatcherMatchResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */