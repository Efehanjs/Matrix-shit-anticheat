package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.ArrayIteratorKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.CollectionToArray;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayAsCollection implements Collection, KMappedMarker {
  private final boolean isVarargs;
  
  @NotNull
  private final Object[] values;
  
  private static final long a = o3.a(-2588493043569340259L, 5161609927933626349L, null).a(155854507217279L);
  
  @NotNull
  public final Object[] getValues() {
    return this.values;
  }
  
  @NotNull
  public Iterator iterator() {
    return ArrayIteratorKt.iterator(this.values);
  }
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x31B95F55AE96L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x442125774EC9L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean isVarargs() {
    return this.isVarargs;
  }
  
  public void clear() {
    long l = a ^ 0x405928B10BEBL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.values.length == 0);
  }
  
  public boolean contains(Object paramObject) {
    return ArraysKt.contains(this.values, paramObject);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject) {
    long l = a ^ 0xAB427749D63L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  public ArrayAsCollection(@NotNull Object[] paramArrayOfObject, boolean paramBoolean) {
    this.values = paramArrayOfObject;
    this.isVarargs = paramBoolean;
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x75FDC5CC73C5L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public final Object[] toArray() {
    return CollectionsKt.copyToArrayOfAny(this.values, this.isVarargs);
  }
  
  public boolean add(Object paramObject) {
    long l = a ^ 0x7CC2CE8DC04BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArrayAsCollection.a : J
    //   3: ldc2_w 11871192058783
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
    //   37: goto -> 93
    //   40: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   43: athrow
    //   44: aload #4
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #6
    //   53: aload #6
    //   55: invokeinterface hasNext : ()Z
    //   60: ifeq -> 92
    //   63: aload #6
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: astore #7
    //   72: aload #7
    //   74: astore #8
    //   76: iconst_0
    //   77: istore #9
    //   79: aload_0
    //   80: aload #8
    //   82: invokevirtual contains : (Ljava/lang/Object;)Z
    //   85: ifne -> 53
    //   88: iconst_0
    //   89: goto -> 93
    //   92: iconst_1
    //   93: ireturn
    // Exception table:
    //   from	to	target	type
    //   23	40	40	java/lang/UnsupportedOperationException
  }
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x3EE940219994L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int getSize() {
    return this.values.length;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArrayAsCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */