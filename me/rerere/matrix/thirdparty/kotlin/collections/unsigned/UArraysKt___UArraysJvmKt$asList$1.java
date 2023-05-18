package me.rerere.matrix.thirdparty.kotlin.collections.unsigned;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.UIntArray;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;

public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList implements RandomAccess {
  public int indexOf-WZ4Q5Ns(int paramInt) {
    return ArraysKt.indexOf(this.$this_asList, paramInt);
  }
  
  public boolean isEmpty() {
    return UIntArray.isEmpty-impl(this.$this_asList);
  }
  
  public int lastIndexOf-WZ4Q5Ns(int paramInt) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramInt);
  }
  
  public UArraysKt___UArraysJvmKt$asList$1(int[] paramArrayOfint) {}
  
  public int getSize() {
    return UIntArray.getSize-impl(this.$this_asList);
  }
  
  public int get-pVg5ArA(int paramInt) {
    return UIntArray.get-pVg5ArA(this.$this_asList, paramInt);
  }
  
  public boolean contains-WZ4Q5Ns(int paramInt) {
    return UIntArray.contains-WZ4Q5Ns(this.$this_asList, paramInt);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collection\\unsigned\UArraysKt___UArraysJvmKt$asList$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */