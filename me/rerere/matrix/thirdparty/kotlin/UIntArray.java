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
public final class UIntArray implements Collection, KMappedMarker {
  @NotNull
  private final int[] storage;
  
  private static final long a = o3.a(-2950346881624120499L, 5273844526516875110L, null).a(260691487032183L);
  
  @PublishedApi
  @NotNull
  public static int[] constructor-impl(@NotNull int[] paramArrayOfint) {
    long l = a ^ 0x6B8129CDEB21L;
    Intrinsics.checkNotNullParameter(paramArrayOfint, "storage");
    return paramArrayOfint;
  }
  
  public int hashCode() {
    return hashCode-impl(this.storage);
  }
  
  public boolean contains-WZ4Q5Ns(int paramInt) {
    return contains-WZ4Q5Ns(this.storage, paramInt);
  }
  
  public static String toString-impl(int[] paramArrayOfint) {
    long l = a ^ 0x9C3D372E584L;
    return "UIntArray(storage=" + Arrays.toString(paramArrayOfint) + ')';
  }
  
  public static boolean containsAll-impl(int[] paramArrayOfint, @NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/UIntArray.a : J
    //   3: ldc2_w 111579597729083
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
    //   81: instanceof me/rerere/matrix/thirdparty/kotlin/UInt
    //   84: ifeq -> 117
    //   87: aload_0
    //   88: aload #8
    //   90: checkcast me/rerere/matrix/thirdparty/kotlin/UInt
    //   93: invokevirtual unbox-impl : ()I
    //   96: invokestatic contains : ([II)Z
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
  
  public static final int get-pVg5ArA(int[] paramArrayOfint, int paramInt) {
    return UInt.constructor-impl(paramArrayOfint[paramInt]);
  }
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x6752856BB997L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void clear() {
    long l = a ^ 0x420FE0166ADBL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  public boolean add-WZ4Q5Ns(int paramInt) {
    long l = a ^ 0x340AD166D997L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static boolean contains-WZ4Q5Ns(int[] paramArrayOfint, int paramInt) {
    return ArraysKt.contains(paramArrayOfint, paramInt);
  }
  
  @NotNull
  public static Iterator iterator-impl(int[] paramArrayOfint) {
    return new UIntArray$Iterator(paramArrayOfint);
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x5B90A0B14BE9L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return containsAll-impl(this.storage, paramCollection);
  }
  
  public static int getSize-impl(int[] paramArrayOfint) {
    return paramArrayOfint.length;
  }
  
  public boolean isEmpty() {
    return isEmpty-impl(this.storage);
  }
  
  public static boolean isEmpty-impl(int[] paramArrayOfint) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramArrayOfint.length == 0);
  }
  
  public String toString() {
    return toString-impl(this.storage);
  }
  
  @NotNull
  public static int[] constructor-impl(int paramInt) {
    return constructor-impl(new int[paramInt]);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0x2F8FE8DA8EBCL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public static final boolean equals-impl0(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return Intrinsics.areEqual(paramArrayOfint1, paramArrayOfint2);
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x63E73ECAB294L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Iterator iterator() {
    return iterator-impl(this.storage);
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.storage, paramObject);
  }
  
  public static int hashCode-impl(int[] paramArrayOfint) {
    return Arrays.hashCode(paramArrayOfint);
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x6491EC0699CCL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public static boolean equals-impl(int[] paramArrayOfint, Object paramObject) {
    try {
      if (!(paramObject instanceof UIntArray))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(paramArrayOfint, ((UIntArray)paramObject).unbox-impl()))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return true;
  }
  
  public int getSize() {
    return getSize-impl(this.storage);
  }
  
  public static final void set-VXSXFK8(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    paramArrayOfint[paramInt1] = paramInt2;
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x5EE505509CADL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UIntArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */