package me.rerere.matrix.thirdparty.kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class UIntArray$Iterator implements Iterator, KMappedMarker {
  @NotNull
  private final int[] array;
  
  private int index;
  
  private static final long a = o3.a(3399060424041386157L, 3247179768550105941L, null).a(243312967359166L);
  
  public UIntArray$Iterator(@NotNull int[] paramArrayOfint) {
    this.array = paramArrayOfint;
  }
  
  public int next-pVg5ArA() {
    // Byte code:
    //   0: aload_0
    //   1: getfield index : I
    //   4: aload_0
    //   5: getfield array : [I
    //   8: arraylength
    //   9: if_icmpge -> 36
    //   12: aload_0
    //   13: getfield array : [I
    //   16: aload_0
    //   17: getfield index : I
    //   20: istore_1
    //   21: aload_0
    //   22: iload_1
    //   23: iconst_1
    //   24: iadd
    //   25: putfield index : I
    //   28: iload_1
    //   29: iaload
    //   30: invokestatic constructor-impl : (I)I
    //   33: goto -> 51
    //   36: new java/util/NoSuchElementException
    //   39: dup
    //   40: aload_0
    //   41: getfield index : I
    //   44: invokestatic valueOf : (I)Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: ireturn
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.index < this.array.length);
  }
  
  public void remove() {
    long l = a ^ 0x540183E3FB6L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UIntArray$Iterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */