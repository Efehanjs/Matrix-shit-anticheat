package me.rerere.matrix.thirdparty.kotlin.internal.jdk8;

import java.lang.invoke.MethodHandles;
import java.util.regex.MatchResult;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.jdk7.JDK7PlatformImplementations;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.random.jdk8.PlatformThreadLocalRandom;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.text.MatchGroup;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class JDK8PlatformImplementations extends JDK7PlatformImplementations {
  private static final long c = o3.a(4210912320461926872L, 5092644502376073958L, MethodHandles.lookup().lookupClass()).a(192403281761493L);
  
  @NotNull
  public Random defaultPlatformRandom() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return sdkIsNullOrAtLeast(34) ? (Random)new PlatformThreadLocalRandom() : super.defaultPlatformRandom();
  }
  
  @Nullable
  public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult paramMatchResult, @NotNull String paramString) {
    Object object;
    long l = c ^ 0x84CEE82C44L;
    try {
      Intrinsics.checkNotNullParameter(paramMatchResult, "matchResult");
      Intrinsics.checkNotNullParameter(paramString, "name");
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (((paramMatchResult instanceof java.util.regex.Matcher) ? paramMatchResult : null) == null) {
        (paramMatchResult instanceof java.util.regex.Matcher) ? paramMatchResult : null;
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    IntRange intRange = new IntRange(object.start(paramString), object.end(paramString) - 1);
    try {
      Intrinsics.checkNotNullExpressionValue(object.group(paramString), "matcher.group(name)");
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (intRange.getStart().intValue() >= 0) ? new MatchGroup(object.group(paramString), intRange) : null;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\jdk8\JDK8PlatformImplementations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */