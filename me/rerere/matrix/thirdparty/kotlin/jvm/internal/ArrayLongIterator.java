package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.LongIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayLongIterator extends LongIterator {
  private int index;
  
  @NotNull
  private final long[] array;
  
  private static final long b = o3.a(8572382899953351280L, -6694744249455630309L, null).a(68385857992478L);
  
  public ArrayLongIterator(@NotNull long[] paramArrayOflong) {
    this.array = paramArrayOflong;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  public long nextLong() {
    long l;
    try {
      int i = this.index;
      this.index = i + 1;
      l = this.array[i];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      this.index--;
      throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
    } 
    return l;
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayLongIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */