package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ShortIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayShortIterator extends ShortIterator {
  private int index;
  
  @NotNull
  private final short[] array;
  
  private static final long b = o3.a(-723811915873164416L, 4845056444331773363L, null).a(71017542016341L);
  
  public short nextShort() {
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
  
  public ArrayShortIterator(@NotNull short[] paramArrayOfshort) {
    this.array = paramArrayOfshort;
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayShortIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */