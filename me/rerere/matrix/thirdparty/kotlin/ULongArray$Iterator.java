package me.rerere.matrix.thirdparty.kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ULongArray$Iterator implements Iterator, KMappedMarker {
  @NotNull
  private final long[] array;
  
  private int index;
  
  private static final long a = o3.a(-3410557716879624861L, 1164739129025013642L, null).a(53509211322607L);
  
  public void remove() {
    long l = a ^ 0x40A6CB995BF6L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  public long next-s-VKNKU() {
    // Byte code:
    //   0: aload_0
    //   1: getfield index : I
    //   4: aload_0
    //   5: getfield array : [J
    //   8: arraylength
    //   9: if_icmpge -> 36
    //   12: aload_0
    //   13: getfield array : [J
    //   16: aload_0
    //   17: getfield index : I
    //   20: istore_1
    //   21: aload_0
    //   22: iload_1
    //   23: iconst_1
    //   24: iadd
    //   25: putfield index : I
    //   28: iload_1
    //   29: laload
    //   30: invokestatic constructor-impl : (J)J
    //   33: goto -> 51
    //   36: new java/util/NoSuchElementException
    //   39: dup
    //   40: aload_0
    //   41: getfield index : I
    //   44: invokestatic valueOf : (I)Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: lreturn
  }
  
  public ULongArray$Iterator(@NotNull long[] paramArrayOflong) {
    this.array = paramArrayOflong;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ULongArray$Iterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */