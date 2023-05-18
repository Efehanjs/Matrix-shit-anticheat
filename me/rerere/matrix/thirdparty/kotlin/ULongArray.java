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
public final class ULongArray implements Collection, KMappedMarker {
  @NotNull
  private final long[] storage;
  
  private static final long a = o3.a(3175962231914165858L, 4253708440684627726L, null).a(135621589467810L);
  
  public static boolean isEmpty-impl(long[] paramArrayOflong) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramArrayOflong.length == 0);
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.storage, paramObject);
  }
  
  @NotNull
  public static long[] constructor-impl(int paramInt) {
    return constructor-impl(new long[paramInt]);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0x72AE74302A85L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public static boolean containsAll-impl(long[] paramArrayOflong, @NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/ULongArray.a : J
    //   3: ldc2_w 50432341947680
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
    //   81: instanceof me/rerere/matrix/thirdparty/kotlin/ULong
    //   84: ifeq -> 117
    //   87: aload_0
    //   88: aload #8
    //   90: checkcast me/rerere/matrix/thirdparty/kotlin/ULong
    //   93: invokevirtual unbox-impl : ()J
    //   96: invokestatic contains : ([JJ)Z
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
  
  public int hashCode() {
    return hashCode-impl(this.storage);
  }
  
  @PublishedApi
  @NotNull
  public static long[] constructor-impl(@NotNull long[] paramArrayOflong) {
    long l = a ^ 0x3281988BA875L;
    Intrinsics.checkNotNullParameter(paramArrayOflong, "storage");
    return paramArrayOflong;
  }
  
  public void clear() {
    long l = a ^ 0x4F6120B919E1L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean add-VKZWuLQ(long paramLong) {
    long l = a ^ 0x2D1586E7571CL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static final boolean equals-impl0(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    return Intrinsics.areEqual(paramArrayOflong1, paramArrayOflong2);
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x2793BE0814AEL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean isEmpty() {
    return isEmpty-impl(this.storage);
  }
  
  public static int getSize-impl(long[] paramArrayOflong) {
    return paramArrayOflong.length;
  }
  
  public static final void set-k8EXiF4(long[] paramArrayOflong, int paramInt, long paramLong) {
    paramArrayOflong[paramInt] = paramLong;
  }
  
  public String toString() {
    return toString-impl(this.storage);
  }
  
  public static final long get-s-VKNKU(long[] paramArrayOflong, int paramInt) {
    return ULong.constructor-impl(paramArrayOflong[paramInt]);
  }
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x1F0A22C0A598L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains-VKZWuLQ(long paramLong) {
    return contains-VKZWuLQ(this.storage, paramLong);
  }
  
  @NotNull
  public static Iterator iterator-impl(long[] paramArrayOflong) {
    return new ULongArray$Iterator(paramArrayOflong);
  }
  
  public static boolean contains-VKZWuLQ(long[] paramArrayOflong, long paramLong) {
    return ArraysKt.contains(paramArrayOflong, paramLong);
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x3C19D9C84BDCL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return containsAll-impl(this.storage, paramCollection);
  }
  
  public static int hashCode-impl(long[] paramArrayOflong) {
    return Arrays.hashCode(paramArrayOflong);
  }
  
  public static boolean equals-impl(long[] paramArrayOflong, Object paramObject) {
    try {
      if (!(paramObject instanceof ULongArray))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(paramArrayOflong, ((ULongArray)paramObject).unbox-impl()))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return true;
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x4C6D05068402L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static String toString-impl(long[] paramArrayOflong) {
    long l = a ^ 0x63150784EA56L;
    return "ULongArray(storage=" + Arrays.toString(paramArrayOflong) + ')';
  }
  
  public int getSize() {
    return getSize-impl(this.storage);
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x2F91ADE9F8A0L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Iterator iterator() {
    return iterator-impl(this.storage);
  }
  
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ULongArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */