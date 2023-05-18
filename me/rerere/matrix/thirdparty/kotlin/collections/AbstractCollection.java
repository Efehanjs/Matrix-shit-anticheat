package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.CollectionToArray;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
public abstract class AbstractCollection implements Collection, KMappedMarker {
  private static final long a = o3.a(-2867400870539939366L, -4897000139203956410L, null).a(173146113141303L);
  
  public boolean retainAll(Collection paramCollection) {
    long l = a ^ 0x1F9A24F175AAL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean add(Object paramObject) {
    long l = a ^ 0x64FD92024C55L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection paramCollection) {
    long l = a ^ 0x4C56FB5E7345L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean remove(Object paramObject) {
    long l = a ^ 0x609D041C990BL;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void clear() {
    long l = a ^ 0x7D72FAAC4351L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (size() == 0);
  }
  
  public abstract int getSize();
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/AbstractCollection.a : J
    //   3: ldc2_w 137381164245012
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
  
  public boolean removeAll(Collection paramCollection) {
    long l = a ^ 0x120F76978358L;
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  @NotNull
  public Object[] toArray(@NotNull Object[] paramArrayOfObject) {
    long l = a ^ 0x717AC46EAA09L;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    Intrinsics.checkNotNull(CollectionToArray.toArray(this, paramArrayOfObject), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
    return CollectionToArray.toArray(this, paramArrayOfObject);
  }
  
  @NotNull
  public abstract Iterator iterator();
  
  @NotNull
  public String toString() {
    long l = a ^ 0x193A8C607E44L;
    return CollectionsKt.joinToString$default(this, ", ", "[", "]", 0, null, new AbstractCollection$toString$1(this), 24, null);
  }
  
  public boolean contains(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast java/lang/Iterable
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_2
    //   8: instanceof java/util/Collection
    //   11: ifeq -> 41
    //   14: aload_2
    //   15: checkcast java/util/Collection
    //   18: invokeinterface isEmpty : ()Z
    //   23: ifeq -> 41
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   32: athrow
    //   33: iconst_0
    //   34: goto -> 89
    //   37: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   40: athrow
    //   41: aload_2
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #4
    //   49: aload #4
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 88
    //   59: aload #4
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: astore #5
    //   68: aload #5
    //   70: astore #6
    //   72: iconst_0
    //   73: istore #7
    //   75: aload #6
    //   77: aload_1
    //   78: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   81: ifeq -> 49
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: ireturn
    // Exception table:
    //   from	to	target	type
    //   7	26	29	java/lang/UnsupportedOperationException
    //   14	37	37	java/lang/UnsupportedOperationException
  }
  
  @NotNull
  public Object[] toArray() {
    return CollectionToArray.toArray(this);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */