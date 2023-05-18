package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.BooleanIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayBooleanIterator extends BooleanIterator {
  @NotNull
  private final boolean[] array;
  
  private int index;
  
  private static final long b = o3.a(557534051901607985L, 3606697681215228167L, null).a(1521665503571L);
  
  public ArrayBooleanIterator(@NotNull boolean[] paramArrayOfboolean) {
    this.array = paramArrayOfboolean;
  }
  
  public boolean nextBoolean() {
    boolean bool;
    try {
      int i = this.index;
      this.index = i + 1;
      bool = this.array[i];
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      this.index--;
      throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
    } 
    return bool;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayBooleanIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */