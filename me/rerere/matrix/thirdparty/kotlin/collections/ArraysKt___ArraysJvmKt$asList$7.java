package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$7 extends AbstractList implements RandomAccess {
  public boolean contains(boolean paramBoolean) {
    return ArraysKt.contains(this.$this_asList, paramBoolean);
  }
  
  public int lastIndexOf(boolean paramBoolean) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramBoolean);
  }
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  public int indexOf(boolean paramBoolean) {
    return ArraysKt.indexOf(this.$this_asList, paramBoolean);
  }
  
  @NotNull
  public Boolean get(int paramInt) {
    return Boolean.valueOf(this.$this_asList[paramInt]);
  }
  
  public ArraysKt___ArraysJvmKt$asList$7(boolean[] paramArrayOfboolean) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */