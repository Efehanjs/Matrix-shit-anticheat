package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
public abstract class AbstractList extends AbstractCollection implements List, KMappedMarker {
  @NotNull
  public static final AbstractList$Companion Companion;
  
  private static final long b = o3.a(364132086276125211L, -1936750988578561931L, null).a(270351573127807L);
  
  public int hashCode() {
    return Companion.orderedHashCode$kotlin_stdlib(this);
  }
  
  @NotNull
  public List subList(int paramInt1, int paramInt2) {
    return new AbstractList$SubList(this, paramInt1, paramInt2);
  }
  
  public abstract int getSize();
  
  public boolean addAll(int paramInt, Collection paramCollection) {
    long l = b ^ 0x7615CD78ADEBL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  static {
    Companion = new AbstractList$Companion(null);
  }
  
  @NotNull
  public ListIterator listIterator() {
    return new AbstractList$ListIteratorImpl(this, 0);
  }
  
  @NotNull
  public ListIterator listIterator(int paramInt) {
    return new AbstractList$ListIteratorImpl(this, paramInt);
  }
  
  public Object set(int paramInt, Object paramObject) {
    long l = b ^ 0x53B40C4C8673L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public abstract Object get(int paramInt);
  
  public void add(int paramInt, Object paramObject) {
    long l = b ^ 0x503AF799B57FL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    try {
      if (!(paramObject instanceof List))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw b(null);
    } 
    return Companion.orderedEquals$kotlin_stdlib(this, (Collection)paramObject);
  }
  
  public int lastIndexOf(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast java/util/List
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_2
    //   8: aload_2
    //   9: invokeinterface size : ()I
    //   14: invokeinterface listIterator : (I)Ljava/util/ListIterator;
    //   19: astore #4
    //   21: aload #4
    //   23: invokeinterface hasPrevious : ()Z
    //   28: ifeq -> 62
    //   31: aload #4
    //   33: invokeinterface previous : ()Ljava/lang/Object;
    //   38: astore #5
    //   40: iconst_0
    //   41: istore #6
    //   43: aload #5
    //   45: aload_1
    //   46: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   49: ifeq -> 21
    //   52: aload #4
    //   54: invokeinterface nextIndex : ()I
    //   59: goto -> 63
    //   62: iconst_m1
    //   63: ireturn
  }
  
  @NotNull
  public Iterator iterator() {
    return new AbstractList$IteratorImpl(this);
  }
  
  public int indexOf(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast java/util/List
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_2
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore #5
    //   18: aload #5
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 68
    //   28: aload #5
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: astore #6
    //   37: aload #6
    //   39: astore #7
    //   41: iconst_0
    //   42: istore #8
    //   44: aload #7
    //   46: aload_1
    //   47: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   50: ifeq -> 62
    //   53: iload #4
    //   55: goto -> 69
    //   58: invokestatic b : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   61: athrow
    //   62: iinc #4, 1
    //   65: goto -> 18
    //   68: iconst_m1
    //   69: ireturn
    // Exception table:
    //   from	to	target	type
    //   44	58	58	java/lang/UnsupportedOperationException
  }
  
  public Object remove(int paramInt) {
    long l = b ^ 0x63071F6846EDL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  private static UnsupportedOperationException b(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */