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
public final class UShortArray implements Collection, KMappedMarker {
  @NotNull
  private final short[] storage;
  
  private static final long a = o3.a(-3443099687758370863L, -8812856299631910734L, null).a(155925574874112L);
  
  @NotNull
  public Iterator iterator() {
    return iterator-impl(this.storage);
  }
  
  public static boolean contains-xj2QHRw(short[] paramArrayOfshort, short paramShort) {
    return ArraysKt.contains(paramArrayOfshort, paramShort);
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x64E728C3CA53L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x7EFF1CF9B1FCL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return containsAll-impl(this.storage, paramCollection);
  }
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x7A157568054AL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains-xj2QHRw(short paramShort) {
    return contains-xj2QHRw(this.storage, paramShort);
  }
  
  public static boolean isEmpty-impl(short[] paramArrayOfshort) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramArrayOfshort.length == 0);
  }
  
  public int hashCode() {
    return hashCode-impl(this.storage);
  }
  
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  @NotNull
  public static short[] constructor-impl(int paramInt) {
    return constructor-impl(new short[paramInt]);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0x4C3500847703L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public boolean isEmpty() {
    return isEmpty-impl(this.storage);
  }
  
  public static boolean containsAll-impl(short[] paramArrayOfshort, @NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/UShortArray.a : J
    //   3: ldc2_w 21221013286440
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
    //   81: instanceof me/rerere/matrix/thirdparty/kotlin/UShort
    //   84: ifeq -> 117
    //   87: aload_0
    //   88: aload #8
    //   90: checkcast me/rerere/matrix/thirdparty/kotlin/UShort
    //   93: invokevirtual unbox-impl : ()S
    //   96: invokestatic contains : ([SS)Z
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
  
  public static final void set-01HTLdE(short[] paramArrayOfshort, int paramInt, short paramShort) {
    paramArrayOfshort[paramInt] = paramShort;
  }
  
  @PublishedApi
  @NotNull
  public static short[] constructor-impl(@NotNull short[] paramArrayOfshort) {
    long l = a ^ 0x4781996AAE6CL;
    Intrinsics.checkNotNullParameter(paramArrayOfshort, "storage");
    return paramArrayOfshort;
  }
  
  public String toString() {
    return toString-impl(this.storage);
  }
  
  public static boolean equals-impl(short[] paramArrayOfshort, Object paramObject) {
    try {
      if (!(paramObject instanceof UShortArray))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(paramArrayOfshort, ((UShortArray)paramObject).unbox-impl()))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return true;
  }
  
  public static String toString-impl(short[] paramArrayOfshort) {
    long l = a ^ 0x615F5F8AB6BFL;
    return "UShortArray(storage=" + Arrays.toString(paramArrayOfshort) + ')';
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x564BF2822296L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean add-xj2QHRw(short paramShort) {
    long l = a ^ 0x2D4A8AB781BDL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int getSize() {
    return getSize-impl(this.storage);
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x51590EDDDC02L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static int getSize-impl(short[] paramArrayOfshort) {
    return paramArrayOfshort.length;
  }
  
  public static final short get-Mh2AYeg(short[] paramArrayOfshort, int paramInt) {
    return UShort.constructor-impl(paramArrayOfshort[paramInt]);
  }
  
  @NotNull
  public static Iterator iterator-impl(short[] paramArrayOfshort) {
    return new UShortArray$Iterator(paramArrayOfshort);
  }
  
  public static final boolean equals-impl0(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    return Intrinsics.areEqual(paramArrayOfshort1, paramArrayOfshort2);
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.storage, paramObject);
  }
  
  public static int hashCode-impl(short[] paramArrayOfshort) {
    return Arrays.hashCode(paramArrayOfshort);
  }
  
  public void clear() {
    long l = a ^ 0xCD96C42DCDEL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UShortArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */