package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.NoSuchElementException;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;

public final class IntProgressionIterator extends IntIterator {
  private int next;
  
  private final int step;
  
  private boolean hasNext;
  
  private final int finalElement;
  
  public IntProgressionIterator(int paramInt1, int paramInt2, int paramInt3) {
    this.step = paramInt3;
    this.finalElement = paramInt2;
    if (this.step > 0) {
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
      this.hasNext = (paramInt1 >= paramInt2);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.next = this.hasNext ? paramInt1 : this.finalElement;
  }
  
  public boolean hasNext() {
    return this.hasNext;
  }
  
  public final int getStep() {
    return this.step;
  }
  
  public int nextInt() {
    int i = this.next;
    try {
      if (i == this.finalElement) {
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
    return i;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\IntProgressionIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */