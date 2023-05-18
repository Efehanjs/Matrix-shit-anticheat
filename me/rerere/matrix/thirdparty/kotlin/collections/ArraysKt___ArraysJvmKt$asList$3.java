package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList implements RandomAccess {
  public int lastIndexOf(int paramInt) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramInt);
  }
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public ArraysKt___ArraysJvmKt$asList$3(int[] paramArrayOfint) {}
  
  public int indexOf(int paramInt) {
    return ArraysKt.indexOf(this.$this_asList, paramInt);
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  @NotNull
  public Integer get(int paramInt) {
    return Integer.valueOf(this.$this_asList[paramInt]);
  }
  
  public boolean contains(int paramInt) {
    return ArraysKt.contains(this.$this_asList, paramInt);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */