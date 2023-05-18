package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RingBuffer extends AbstractList implements RandomAccess {
  private int size;
  
  private final int capacity;
  
  private int startIndex;
  
  @NotNull
  private final Object[] buffer;
  
  private static final long c = o3.a(-2986884040947487009L, 9161723676481070265L, null).a(178561376082088L);
  
  @NotNull
  public final RingBuffer expanded(int paramInt) {
    long l = c ^ 0x29204D7A9D87L;
    int i = RangesKt.coerceAtMost(this.capacity + (this.capacity >> 1) + 1, paramInt);
    try {
      Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, i), "copyOf(this, newSize)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Object[] arrayOfObject = (this.startIndex == 0) ? Arrays.copyOf(this.buffer, i) : toArray(new Object[i]);
    return new RingBuffer(arrayOfObject, size());
  }
  
  @NotNull
  public Object[] toArray(@NotNull Object[] paramArrayOfObject) {
    long l = c ^ 0x6EEBAE9517D8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
      Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfObject, size()), "copyOf(this, newSize)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Object[] arrayOfObject = (paramArrayOfObject.length < size()) ? Arrays.copyOf(paramArrayOfObject, size()) : paramArrayOfObject;
    int i = size();
    byte b = 0;
    int j = this.startIndex;
    while (true) {
      try {
        if (b < i)
          try {
            if (j < this.capacity) {
              arrayOfObject[b] = this.buffer[j];
              b++;
              j++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
    j = 0;
    try {
      while (b < i) {
        arrayOfObject[b] = this.buffer[j];
        b++;
        j++;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (arrayOfObject.length > size())
        arrayOfObject[size()] = null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(arrayOfObject, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
    return arrayOfObject;
  }
  
  public int getSize() {
    return this.size;
  }
  
  @NotNull
  public Iterator iterator() {
    return new RingBuffer$iterator$1(this);
  }
  
  public final void add(Object paramObject) {
    long l = c ^ 0x4E941FA39EB4L;
    try {
      if (isFull())
        throw new IllegalStateException("ring buffer is full"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    RingBuffer ringBuffer = this;
    int j = this.startIndex;
    int k = size();
    boolean bool = false;
    this.buffer[(j + k) % access$getCapacity$p(ringBuffer)] = paramObject;
    int i = size();
    this.size = i + 1;
  }
  
  public RingBuffer(int paramInt) {
    this(new Object[paramInt], 0);
  }
  
  public final boolean isFull() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (size() == this.capacity);
  }
  
  public final void removeFirst(int paramInt) {
    long l = c ^ 0x3DC4858DEFA7L;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = (paramInt >= 0) ? 1 : 0;
    if (!i) {
      boolean bool = false;
      String str = "n shouldn't be negative but it is " + paramInt;
      throw new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    i = (paramInt <= size()) ? 1 : 0;
    if (!i) {
      boolean bool = false;
      String str = "n shouldn't be greater than the buffer size: n = " + paramInt + ", size = " + size();
      throw new IllegalArgumentException(str.toString());
    } 
    if (paramInt > 0) {
      i = this.startIndex;
      RingBuffer ringBuffer = this;
      int k = i;
      boolean bool = false;
      int j = (k + paramInt) % access$getCapacity$p(ringBuffer);
      try {
        if (i > j) {
          ArraysKt.fill(this.buffer, (Object)null, i, this.capacity);
          ArraysKt.fill(this.buffer, (Object)null, 0, j);
        } else {
          ArraysKt.fill(this.buffer, (Object)null, i, j);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.startIndex = j;
      this.size = size() - paramInt;
    } 
  }
  
  @NotNull
  public Object[] toArray() {
    return toArray(new Object[size()]);
  }
  
  public Object get(int paramInt) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, size());
    RingBuffer ringBuffer = this;
    int i = this.startIndex;
    boolean bool = false;
    return this.buffer[(i + paramInt) % access$getCapacity$p(ringBuffer)];
  }
  
  public RingBuffer(@NotNull Object[] paramArrayOfObject, int paramInt) {
    this.buffer = paramArrayOfObject;
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "ring buffer filled size should not be negative but it is " + paramInt;
      throw new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool = (paramInt <= this.buffer.length) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "ring buffer filled size: " + paramInt + " cannot be larger than the buffer size: " + this.buffer.length;
      throw new IllegalArgumentException(str.toString());
    } 
    this.capacity = this.buffer.length;
    this.size = paramInt;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\RingBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */