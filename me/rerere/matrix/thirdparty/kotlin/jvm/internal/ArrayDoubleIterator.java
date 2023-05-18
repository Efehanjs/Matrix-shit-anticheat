package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.DoubleIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayDoubleIterator extends DoubleIterator {
  @NotNull
  private final double[] array;
  
  private int index;
  
  private static final long b = o3.a(-552839235871775992L, -7305620157865954454L, null).a(27234339389140L);
  
  public boolean hasNext() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  public double nextDouble() {
    double d;
    try {
      int i = this.index;
      this.index = i + 1;
      d = this.array[i];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      this.index--;
      throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
    } 
    return d;
  }
  
  public ArrayDoubleIterator(@NotNull double[] paramArrayOfdouble) {
    this.array = paramArrayOfdouble;
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayDoubleIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */