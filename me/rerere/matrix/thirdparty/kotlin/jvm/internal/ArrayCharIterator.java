package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CharIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayCharIterator extends CharIterator {
  private int index;
  
  @NotNull
  private final char[] array;
  
  private static final long b = o3.a(2883573019882335440L, 2500321314404950438L, null).a(69992299959361L);
  
  public ArrayCharIterator(@NotNull char[] paramArrayOfchar) {
    this.array = paramArrayOfchar;
  }
  
  public char nextChar() {
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayCharIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */