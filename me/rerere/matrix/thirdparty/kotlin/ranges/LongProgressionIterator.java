package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.NoSuchElementException;
import me.rerere.matrix.thirdparty.kotlin.collections.LongIterator;

public final class LongProgressionIterator extends LongIterator {
  private final long finalElement;
  
  private long next;
  
  private final long step;
  
  private boolean hasNext;
  
  public long nextLong() {
    long l = this.next;
    try {
      if (l == this.finalElement) {
        try {
          if (!this.hasNext)
            throw new NoSuchElementException(); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        this.hasNext = false;
      } else {
        this.next += this.step;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return l;
  }
  
  public boolean hasNext() {
    return this.hasNext;
  }
  
  public LongProgressionIterator(long paramLong1, long paramLong2, long paramLong3) {
    this.step = paramLong3;
    this.finalElement = paramLong2;
    if (this.step > 0L) {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } else {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    try {
      this.hasNext = (paramLong1 >= paramLong2);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.next = this.hasNext ? paramLong1 : this.finalElement;
  }
  
  public final long getStep() {
    return this.step;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\LongProgressionIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */