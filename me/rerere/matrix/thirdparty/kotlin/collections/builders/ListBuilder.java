package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractMutableList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArrayDeque;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableList;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ListBuilder extends AbstractMutableList implements List, RandomAccess, Serializable, KMutableList {
  private int length;
  
  private boolean isReadOnly;
  
  @Nullable
  private final ListBuilder backing;
  
  @NotNull
  private Object[] array;
  
  @Nullable
  private final ListBuilder root;
  
  private int offset;
  
  private static final long a = o3.a(-59140816125169457L, 7281289991219466335L, null).a(139635698178198L);
  
  public int getSize() {
    return this.length;
  }
  
  public void add(int paramInt, Object paramObject) {
    checkIsMutable();
    AbstractList.Companion.checkPositionIndex$kotlin_stdlib(paramInt, this.length);
    addAtInternal(this.offset + paramInt, paramObject);
  }
  
  public int indexOf(Object paramObject) {
    byte b = 0;
    while (true) {
      try {
        if (b < this.length) {
          try {
            if (Intrinsics.areEqual(this.array[this.offset + b], paramObject))
              return b; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  public boolean removeAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x1676D2D9BF92L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "elements");
      checkIsMutable();
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (retainOrRemoveAllInternal(this.offset, this.length, paramCollection, false) > 0);
  }
  
  @NotNull
  public ListIterator listIterator() {
    return new ListBuilder$Itr(this, 0);
  }
  
  public boolean addAll(int paramInt, @NotNull Collection paramCollection) {
    long l = a ^ 0x73AA1B4FD9AFL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    checkIsMutable();
    AbstractList.Companion.checkPositionIndex$kotlin_stdlib(paramInt, this.length);
    int i = paramCollection.size();
    try {
      addAllInternal(this.offset + paramInt, paramCollection, i);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (i > 0);
  }
  
  public boolean remove(Object paramObject) {
    checkIsMutable();
    int i = indexOf(paramObject);
    try {
      if (i >= 0)
        remove(i); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (i >= 0);
  }
  
  public ListBuilder(int paramInt) {
    this(ListBuilderKt.arrayOfUninitializedElements(paramInt), 0, 0, false, null, null);
  }
  
  public Object removeAt(int paramInt) {
    checkIsMutable();
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, this.length);
    return removeAtInternal(this.offset + paramInt);
  }
  
  @NotNull
  public List subList(int paramInt1, int paramInt2) {
    try {
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(paramInt1, paramInt2, this.length);
      if (this.root == null);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    super(this.offset + paramInt1, paramInt2 - paramInt1, this.isReadOnly, this, this.root, this);
    return new ListBuilder();
  }
  
  @NotNull
  public String toString() {
    return ListBuilderKt.access$subarrayContentToString(this.array, this.offset, this.length);
  }
  
  public Object set(int paramInt, Object paramObject) {
    checkIsMutable();
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, this.length);
    Object object = this.array[this.offset + paramInt];
    this.array[this.offset + paramInt] = paramObject;
    return object;
  }
  
  public int hashCode() {
    return ListBuilderKt.access$subarrayContentHashCode(this.array, this.offset, this.length);
  }
  
  @NotNull
  public Object[] toArray() {
    long l = a ^ 0x141B64D8F553L;
    Object[] arrayOfObject = this.array;
    int i = this.offset;
    int j = this.offset + this.length;
    Intrinsics.checkNotNull(ArraysKt.copyOfRange(arrayOfObject, i, j), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    return ArraysKt.copyOfRange(arrayOfObject, i, j);
  }
  
  @NotNull
  public Iterator iterator() {
    return new ListBuilder$Itr(this, 0);
  }
  
  @NotNull
  public Object[] toArray(@NotNull Object[] paramArrayOfObject) {
    long l = a ^ 0x2EDC1CDD81E5L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "destination");
      if (paramArrayOfObject.length < this.length) {
        Intrinsics.checkNotNullExpressionValue(Arrays.copyOfRange(this.array, this.offset, this.offset + this.length, paramArrayOfObject.getClass()), "copyOfRange(array, offse…h, destination.javaClass)");
        return Arrays.copyOfRange(this.array, this.offset, this.offset + this.length, paramArrayOfObject.getClass());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(this.array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
      ArraysKt.copyInto(this.array, paramArrayOfObject, 0, this.offset, this.offset + this.length);
      if (paramArrayOfObject.length > this.length)
        paramArrayOfObject[this.length] = null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramArrayOfObject;
  }
  
  @NotNull
  public final List build() {
    try {
      if (this.backing != null)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    checkIsMutable();
    this.isReadOnly = true;
    return this;
  }
  
  public boolean add(Object paramObject) {
    checkIsMutable();
    addAtInternal(this.offset + this.length, paramObject);
    return true;
  }
  
  public void clear() {
    checkIsMutable();
    removeRangeInternal(this.offset, this.length);
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.length == 0);
  }
  
  @NotNull
  public ListIterator listIterator(int paramInt) {
    AbstractList.Companion.checkPositionIndex$kotlin_stdlib(paramInt, this.length);
    return new ListBuilder$Itr(this, paramInt);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject != this) {
        try {
          if (paramObject instanceof List)
            try {
              if (contentEquals((List)paramObject));
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public Object get(int paramInt) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, this.length);
    return this.array[this.offset + paramInt];
  }
  
  public int lastIndexOf(Object paramObject) {
    int i = this.length - 1;
    while (true) {
      try {
        if (i >= 0) {
          try {
            if (Intrinsics.areEqual(this.array[this.offset + i], paramObject))
              return i; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          i--;
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return -1;
    } 
  }
  
  public boolean retainAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x13D1A21A0229L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "elements");
      checkIsMutable();
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (retainOrRemoveAllInternal(this.offset, this.length, paramCollection, true) > 0);
  }
  
  public ListBuilder() {
    this(10);
  }
  
  public boolean addAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x14006D8AB3C1L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    checkIsMutable();
    int i = paramCollection.size();
    try {
      addAllInternal(this.offset + this.length, paramCollection, i);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (i > 0);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\ListBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */