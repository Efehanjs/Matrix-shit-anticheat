package me.rerere.matrix.thirdparty.kotlin.collections.unsigned;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.kotlin.UByte;
import me.rerere.matrix.thirdparty.kotlin.UByteArray;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;

public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList implements RandomAccess {
  public int lastIndexOf-7apg3OU(byte paramByte) {
    return ArraysKt.lastIndexOf(this.$this_asList, paramByte);
  }
  
  public int getSize() {
    return UByteArray.getSize-impl(this.$this_asList);
  }
  
  public boolean isEmpty() {
    return UByteArray.isEmpty-impl(this.$this_asList);
  }
  
  public boolean contains-7apg3OU(byte paramByte) {
    return UByteArray.contains-7apg3OU(this.$this_asList, paramByte);
  }
  
  public UArraysKt___UArraysJvmKt$asList$3(byte[] paramArrayOfbyte) {}
  
  public byte get-w2LRezQ(int paramInt) {
    return UByteArray.get-w2LRezQ(this.$this_asList, paramInt);
  }
  
  public int indexOf-7apg3OU(byte paramByte) {
    return ArraysKt.indexOf(this.$this_asList, paramByte);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collection\\unsigned\UArraysKt___UArraysJvmKt$asList$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */