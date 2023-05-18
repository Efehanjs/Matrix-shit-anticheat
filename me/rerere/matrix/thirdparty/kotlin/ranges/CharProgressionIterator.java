package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.NoSuchElementException;
import me.rerere.matrix.thirdparty.kotlin.collections.CharIterator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;

public final class CharProgressionIterator extends CharIterator {
  private boolean hasNext;
  
  private final int step;
  
  private final int finalElement;
  
  private int next;
  
  public boolean hasNext() {
    return this.hasNext;
  }
  
  public CharProgressionIterator(char paramChar1, char paramChar2, int paramInt) {
    this.step = paramInt;
    this.finalElement = paramChar2;
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
      this.hasNext = (Intrinsics.compare(paramChar1, paramChar2) >= 0);
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.next = this.hasNext ? paramChar1 : this.finalElement;
  }
  
  public char nextChar() {
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
    return (char)i;
  }
  
  public final int getStep() {
    return this.step;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\CharProgressionIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */