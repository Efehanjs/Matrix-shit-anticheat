package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayIntIterator extends IntIterator {
  private int index;
  
  @NotNull
  private final int[] array;
  
  private static final long b = o3.a(-8336196267446770735L, -5507009011386733281L, null).a(172861261052815L);
  
  public int nextInt() {
    int i;
    try {
      i = this.index;
      this.index = i + 1;
      i = this.array[i];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      this.index--;
      throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
    } 
    return i;
  }
  
  public ArrayIntIterator(@NotNull int[] paramArrayOfint) {
    this.array = paramArrayOfint;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayIntIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */