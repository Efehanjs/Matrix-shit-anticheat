package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MatchGroup {
  @NotNull
  private final IntRange range;
  
  @NotNull
  private final String value;
  
  private static final long a = o3.a(-712225988081707726L, -5220933986270752353L, null).a(48255112119232L);
  
  public int hashCode() {
    null = this.value.hashCode();
    return null * 31 + this.range.hashCode();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof MatchGroup))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    MatchGroup matchGroup = (MatchGroup)paramObject;
    try {
      if (!Intrinsics.areEqual(this.value, matchGroup.value))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.range, matchGroup.range))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final String getValue() {
    return this.value;
  }
  
  @NotNull
  public final IntRange getRange() {
    return this.range;
  }
  
  public MatchGroup(@NotNull String paramString, @NotNull IntRange paramIntRange) {
    this.value = paramString;
    this.range = paramIntRange;
  }
  
  @NotNull
  public final MatchGroup copy(@NotNull String paramString, @NotNull IntRange paramIntRange) {
    long l = a ^ 0x8C4E1C2BA99L;
    Intrinsics.checkNotNullParameter(paramString, "value");
    Intrinsics.checkNotNullParameter(paramIntRange, "range");
    return new MatchGroup(paramString, paramIntRange);
  }
  
  @NotNull
  public final IntRange component2() {
    return this.range;
  }
  
  @NotNull
  public final String component1() {
    return this.value;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0xAE966CFF7B0L;
    return "MatchGroup(value=" + this.value + ", range=" + this.range + ')';
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatchGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */