package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$4 extends AbstractList implements RandomAccess {
  public ArraysKt___ArraysJvmKt$asList$4(long[] paramArrayOflong) {}
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public int lastIndexOf(long paramLong) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramLong);
  }
  
  public int indexOf(long paramLong) {
    return ArraysKt.indexOf(this.$this_asList, paramLong);
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  @NotNull
  public Long get(int paramInt) {
    return Long.valueOf(this.$this_asList[paramInt]);
  }
  
  public boolean contains(long paramLong) {
    return ArraysKt.contains(this.$this_asList, paramLong);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */