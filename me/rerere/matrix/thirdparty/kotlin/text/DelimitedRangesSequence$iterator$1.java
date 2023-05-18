package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DelimitedRangesSequence$iterator$1 implements Iterator, KMappedMarker {
  private int currentStartIndex;
  
  private int counter;
  
  @Nullable
  private IntRange nextItem;
  
  private int nextSearchIndex;
  
  private int nextState = -1;
  
  private static final long a = o3.a(8039989076813063083L, -3947092373096591101L, null).a(19364972594577L);
  
  public final void setNextItem(@Nullable IntRange paramIntRange) {
    this.nextItem = paramIntRange;
  }
  
  public final void setCounter(int paramInt) {
    this.counter = paramInt;
  }
  
  public final void setNextState(int paramInt) {
    this.nextState = paramInt;
  }
  
  public final int getCounter() {
    return this.counter;
  }
  
  @Nullable
  public final IntRange getNextItem() {
    return this.nextItem;
  }
  
  public final int getCurrentStartIndex() {
    return this.currentStartIndex;
  }
  
  public boolean hasNext() {
    try {
      if (this.nextState == -1)
        calcNext(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.nextState == 1);
  }
  
  @NotNull
  public IntRange next() {
    long l = a ^ 0x54DCBE094918L;
    try {
      if (this.nextState == -1)
        calcNext(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (this.nextState == 0)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.nextItem, "null cannot be cast to non-null type kotlin.ranges.IntRange");
    IntRange intRange = this.nextItem;
    this.nextItem = null;
    this.nextState = -1;
    return intRange;
  }
  
  public void remove() {
    long l = a ^ 0x650F5662CD04L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void setNextSearchIndex(int paramInt) {
    this.nextSearchIndex = paramInt;
  }
  
  public final int getNextState() {
    return this.nextState;
  }
  
  public final void setCurrentStartIndex(int paramInt) {
    this.currentStartIndex = paramInt;
  }
  
  public final int getNextSearchIndex() {
    return this.nextSearchIndex;
  }
  
  public DelimitedRangesSequence$iterator$1() {
    this.currentStartIndex = RangesKt.coerceIn(DelimitedRangesSequence.access$getStartIndex$p(paramDelimitedRangesSequence), 0, DelimitedRangesSequence.access$getInput$p(paramDelimitedRangesSequence).length());
    this.nextSearchIndex = this.currentStartIndex;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\DelimitedRangesSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */