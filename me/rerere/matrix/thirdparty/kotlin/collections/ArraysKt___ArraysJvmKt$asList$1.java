package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$1 extends AbstractList implements RandomAccess {
  public boolean contains(byte paramByte) {
    return ArraysKt.contains(this.$this_asList, paramByte);
  }
  
  public int lastIndexOf(byte paramByte) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramByte);
  }
  
  public int indexOf(byte paramByte) {
    return ArraysKt.indexOf(this.$this_asList, paramByte);
  }
  
  @NotNull
  public Byte get(int paramInt) {
    return Byte.valueOf(this.$this_asList[paramInt]);
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  public ArraysKt___ArraysJvmKt$asList$1(byte[] paramArrayOfbyte) {}
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */