package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractCollection;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MatcherMatchResult$groups$1 extends AbstractCollection implements MatchNamedGroupCollection {
  private static final long b = o3.a(2835123326884451520L, 402484613885879742L, null).a(155151279450551L);
  
  @NotNull
  public Iterator iterator() {
    return SequencesKt.map(CollectionsKt.asSequence((Iterable)CollectionsKt.getIndices(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
  }
  
  public int getSize() {
    return MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this).groupCount() + 1;
  }
  
  @Nullable
  public MatchGroup get(int paramInt) {
    long l = b ^ 0x3D4F72A85C51L;
    IntRange intRange = RegexKt.access$range(MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this), paramInt);
    try {
      Intrinsics.checkNotNullExpressionValue(MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this).group(paramInt), "matchResult.group(index)");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (intRange.getStart().intValue() >= 0) ? new MatchGroup(MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this).group(paramInt), intRange) : null;
  }
  
  public boolean isEmpty() {
    return false;
  }
  
  @Nullable
  public MatchGroup get(@NotNull String paramString) {
    long l = b ^ 0x6B8A2AD59500L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(MatcherMatchResult.access$getMatchResult(MatcherMatchResult.this), paramString);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatcherMatchResult$groups$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */