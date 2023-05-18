package me.rerere.matrix.thirdparty.kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.CollectionToArray;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public final class UByteArray implements Collection, KMappedMarker {
  @NotNull
  private final byte[] storage;
  
  private static final long a = o3.a(-7997510195226457410L, -2658755108826803435L, null).a(35718860735923L);
  
  public int getSize() {
    return getSize-impl(this.storage);
  }
  
  public int hashCode() {
    return hashCode-impl(this.storage);
  }
  
  public static final boolean equals-impl0(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Intrinsics.areEqual(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x745C476B07A2L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static String toString-impl(byte[] paramArrayOfbyte) {
    long l = a ^ 0xE9EFC6C20F3L;
    return "UByteArray(storage=" + Arrays.toString(paramArrayOfbyte) + ')';
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x34C4E91B816FL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return containsAll-impl(this.storage, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x2D984456BFBDL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static boolean contains-7apg3OU(byte[] paramArrayOfbyte, byte paramByte) {
    return ArraysKt.contains(paramArrayOfbyte, paramByte);
  }
  
  @NotNull
  public static byte[] constructor-impl(int paramInt) {
    return constructor-impl(new byte[paramInt]);
  }
  
  @NotNull
  public static Iterator iterator-impl(byte[] paramArrayOfbyte) {
    return new UByteArray$Iterator(paramArrayOfbyte);
  }
  
  public String toString() {
    return toString-impl(this.storage);
  }
  
  public void clear() {
    long l = a ^ 0x60D0BE64E52AL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x7B6068D2F07DL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static boolean equals-impl(byte[] paramArrayOfbyte, Object paramObject) {
    try {
      if (!(paramObject instanceof UByteArray))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(paramArrayOfbyte, ((UByteArray)paramObject).unbox-impl()))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return true;
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.storage, paramObject);
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x3D5631716125L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static final void set-VurrAj0(byte[] paramArrayOfbyte, int paramInt, byte paramByte) {
    paramArrayOfbyte[paramInt] = paramByte;
  }
  
  public static boolean containsAll-impl(byte[] paramArrayOfbyte, @NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/UByteArray.a : J
    //   3: ldc2_w 15170777142167
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'elements'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: checkcast java/lang/Iterable
    //   18: astore #4
    //   20: iconst_0
    //   21: istore #5
    //   23: aload #4
    //   25: checkcast java/util/Collection
    //   28: invokeinterface isEmpty : ()Z
    //   33: ifeq -> 44
    //   36: iconst_1
    //   37: goto -> 126
    //   40: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   43: athrow
    //   44: aload #4
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #6
    //   53: aload #6
    //   55: invokeinterface hasNext : ()Z
    //   60: ifeq -> 125
    //   63: aload #6
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: astore #7
    //   72: aload #7
    //   74: astore #8
    //   76: iconst_0
    //   77: istore #9
    //   79: aload #8
    //   81: instanceof me/rerere/matrix/thirdparty/kotlin/UByte
    //   84: ifeq -> 117
    //   87: aload_0
    //   88: aload #8
    //   90: checkcast me/rerere/matrix/thirdparty/kotlin/UByte
    //   93: invokevirtual unbox-impl : ()B
    //   96: invokestatic contains : ([BB)Z
    //   99: ifeq -> 117
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   108: athrow
    //   109: iconst_1
    //   110: goto -> 118
    //   113: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   116: athrow
    //   117: iconst_0
    //   118: ifne -> 53
    //   121: iconst_0
    //   122: goto -> 126
    //   125: iconst_1
    //   126: ireturn
    // Exception table:
    //   from	to	target	type
    //   23	40	40	java/lang/UnsupportedOperationException
    //   79	102	105	java/lang/UnsupportedOperationException
    //   87	113	113	java/lang/UnsupportedOperationException
  }
  
  @NotNull
  public Iterator iterator() {
    return iterator-impl(this.storage);
  }
  
  public static boolean isEmpty-impl(byte[] paramArrayOfbyte) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramArrayOfbyte.length == 0);
  }
  
  public boolean add-7apg3OU(byte paramByte) {
    long l = a ^ 0x7C3533CE50ECL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static final byte get-w2LRezQ(byte[] paramArrayOfbyte, int paramInt) {
    return UByte.constructor-impl(paramArrayOfbyte[paramInt]);
  }
  
  public boolean isEmpty() {
    return isEmpty-impl(this.storage);
  }
  
  public static int hashCode-impl(byte[] paramArrayOfbyte) {
    return Arrays.hashCode(paramArrayOfbyte);
  }
  
  @PublishedApi
  @NotNull
  public static byte[] constructor-impl(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x4775CA21C639L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "storage");
    return paramArrayOfbyte;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0x5BAA609F0DCAL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  public boolean contains-7apg3OU(byte paramByte) {
    return contains-7apg3OU(this.storage, paramByte);
  }
  
  public static int getSize-impl(byte[] paramArrayOfbyte) {
    return paramArrayOfbyte.length;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UByteArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */