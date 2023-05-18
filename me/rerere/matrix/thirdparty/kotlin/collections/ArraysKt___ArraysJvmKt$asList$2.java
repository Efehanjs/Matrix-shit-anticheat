package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$2 extends AbstractList implements RandomAccess {
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public ArraysKt___ArraysJvmKt$asList$2(short[] paramArrayOfshort) {}
  
  public int lastIndexOf(short paramShort) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramShort);
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  public boolean contains(short paramShort) {
    return ArraysKt.contains(this.$this_asList, paramShort);
  }
  
  public int indexOf(short paramShort) {
    return ArraysKt.indexOf(this.$this_asList, paramShort);
  }
  
  @NotNull
  public Short get(int paramInt) {
    return Short.valueOf(this.$this_asList[paramInt]);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */