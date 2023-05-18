package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ByteIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayByteIterator extends ByteIterator {
  @NotNull
  private final byte[] array;
  
  private int index;
  
  private static final long b = o3.a(2432156589358405274L, 2681409804491166701L, null).a(5086625072501L);
  
  public boolean hasNext() {
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  public ArrayByteIterator(@NotNull byte[] paramArrayOfbyte) {
    this.array = paramArrayOfbyte;
  }
  
  public byte nextByte() {
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
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayByteIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */