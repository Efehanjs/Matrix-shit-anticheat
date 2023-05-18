package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FilteringSequence$iterator$1 implements Iterator, KMappedMarker {
  @NotNull
  private final Iterator iterator;
  
  private int nextState;
  
  @Nullable
  private Object nextItem;
  
  private static final long a = o3.a(-3196662451789264398L, 2822513848897496461L, null).a(88566700853630L);
  
  public FilteringSequence$iterator$1() {
    this.iterator = FilteringSequence.access$getSequence$p(paramFilteringSequence).iterator();
    this.nextState = -1;
  }
  
  public void remove() {
    long l = a ^ 0x3135E03C904DL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @Nullable
  public final Object getNextItem() {
    return this.nextItem;
  }
  
  public Object next() {
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
    Object object = this.nextItem;
    this.nextItem = null;
    this.nextState = -1;
    return object;
  }
  
  public final int getNextState() {
    return this.nextState;
  }
  
  @NotNull
  public final Iterator getIterator() {
    return this.iterator;
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
  
  public final void setNextState(int paramInt) {
    this.nextState = paramInt;
  }
  
  public final void setNextItem(@Nullable Object paramObject) {
    this.nextItem = paramObject;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\FilteringSequence$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */