package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$8 extends AbstractList implements RandomAccess {
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  @NotNull
  public Character get(int paramInt) {
    return Character.valueOf(this.$this_asList[paramInt]);
  }
  
  public int lastIndexOf(char paramChar) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramChar);
  }
  
  public int indexOf(char paramChar) {
    return ArraysKt.indexOf(this.$this_asList, paramChar);
  }
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public boolean contains(char paramChar) {
    return ArraysKt.contains(this.$this_asList, paramChar);
  }
  
  public ArraysKt___ArraysJvmKt$asList$8(char[] paramArrayOfchar) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */