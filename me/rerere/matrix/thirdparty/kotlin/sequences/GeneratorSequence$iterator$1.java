package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class GeneratorSequence$iterator$1 implements Iterator, KMappedMarker {
  private int nextState = -2;
  
  @Nullable
  private Object nextItem;
  
  private static final long a = o3.a(8553633523441411311L, 2306251807288287300L, null).a(62666883760446L);
  
  public boolean hasNext() {
    try {
      if (this.nextState < 0)
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
  
  public final void setNextItem(@Nullable Object paramObject) {
    this.nextItem = paramObject;
  }
  
  public final void setNextState(int paramInt) {
    this.nextState = paramInt;
  }
  
  public final int getNextState() {
    return this.nextState;
  }
  
  @Nullable
  public final Object getNextItem() {
    return this.nextItem;
  }
  
  @NotNull
  public Object next() {
    long l = a ^ 0x559C549CD624L;
    try {
      if (this.nextState < 0)
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
    Intrinsics.checkNotNull(this.nextItem, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
    Object object = this.nextItem;
    this.nextState = -1;
    return object;
  }
  
  public void remove() {
    long l = a ^ 0x4CF94939CF88L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\GeneratorSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */