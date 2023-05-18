package me.rerere.matrix.thirdparty.kotlin.collections.unsigned;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.kotlin.UShort;
import me.rerere.matrix.thirdparty.kotlin.UShortArray;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;

public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList implements RandomAccess {
  public int getSize() {
    return UShortArray.getSize-impl(this.$this_asList);
  }
  
  public boolean isEmpty() {
    return UShortArray.isEmpty-impl(this.$this_asList);
  }
  
  public int lastIndexOf-xj2QHRw(short paramShort) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramShort);
  }
  
  public int indexOf-xj2QHRw(short paramShort) {
    return ArraysKt.indexOf(this.$this_asList, paramShort);
  }
  
  public UArraysKt___UArraysJvmKt$asList$4(short[] paramArrayOfshort) {}
  
  public boolean contains-xj2QHRw(short paramShort) {
    return UShortArray.contains-xj2QHRw(this.$this_asList, paramShort);
  }
  
  public short get-Mh2AYeg(int paramInt) {
    return UShortArray.get-Mh2AYeg(this.$this_asList, paramInt);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collection\\unsigned\UArraysKt___UArraysJvmKt$asList$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */