package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.FloatIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayFloatIterator extends FloatIterator {
  @NotNull
  private final float[] array;
  
  private int index;
  
  private static final long b = o3.a(2449522724322954380L, -2439261314262510061L, null).a(18057086896225L);
  
  public boolean hasNext() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  public ArrayFloatIterator(@NotNull float[] paramArrayOffloat) {
    this.array = paramArrayOffloat;
  }
  
  public float nextFloat() {
    float f;
    try {
      int i = this.index;
      this.index = i + 1;
      f = this.array[i];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      this.index--;
      throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
    } 
    return f;
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayFloatIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */