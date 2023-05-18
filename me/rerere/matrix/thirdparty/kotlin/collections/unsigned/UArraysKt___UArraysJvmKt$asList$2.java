package me.rerere.matrix.thirdparty.kotlin.collections.unsigned;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.ULongArray;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;

public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList implements RandomAccess {
  public int getSize() {
    return ULongArray.getSize-impl(this.$this_asList);
  }
  
  public boolean isEmpty() {
    return ULongArray.isEmpty-impl(this.$this_asList);
  }
  
  public UArraysKt___UArraysJvmKt$asList$2(long[] paramArrayOflong) {}
  
  public long get-s-VKNKU(int paramInt) {
    return ULongArray.get-s-VKNKU(this.$this_asList, paramInt);
  }
  
  public boolean contains-VKZWuLQ(long paramLong) {
    return ULongArray.contains-VKZWuLQ(this.$this_asList, paramLong);
  }
  
  public int lastIndexOf-VKZWuLQ(long paramLong) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramLong);
  }
  
  public int indexOf-VKZWuLQ(long paramLong) {
    return ArraysKt.indexOf(this.$this_asList, paramLong);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collection\\unsigned\UArraysKt___UArraysJvmKt$asList$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */