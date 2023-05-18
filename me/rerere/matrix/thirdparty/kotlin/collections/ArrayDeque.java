package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
public final class ArrayDeque extends AbstractMutableList {
  private int size;
  
  @NotNull
  private static final Object[] emptyElementData;
  
  private int head;
  
  @NotNull
  public static final ArrayDeque$Companion Companion;
  
  private static final int defaultMinCapacity = 10;
  
  private static final int maxArraySize = 2147483639;
  
  @NotNull
  private Object[] elementData;
  
  private static final long a = o3.a(5592941231659919606L, -3490926980652093167L, null).a(237087026704543L);
  
  public boolean removeAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x77B8E9D1F154L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    ArrayDeque arrayDeque = this;
    boolean bool = false;
    try {
      if (!arrayDeque.isEmpty()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if ((arrayDeque.elementData.length == 0));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        int i = arrayDeque.positiveMod(arrayDeque.head + arrayDeque.size());
        int j = arrayDeque.head;
        boolean bool1 = false;
        if (arrayDeque.head < i) {
          for (int k = arrayDeque.head; k < i; k++) {
            Object object1 = arrayDeque.elementData[k];
            Object object2 = object1;
            boolean bool2 = false;
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (!paramCollection.contains(object2)) {
                arrayDeque.elementData[j++] = object1;
              } else {
                bool1 = true;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
          ArraysKt.fill(arrayDeque.elementData, (Object)null, j, i);
        } else {
          int k = arrayDeque.head;
          int m = arrayDeque.elementData.length;
          while (k < m) {
            Object object1 = arrayDeque.elementData[k];
            arrayDeque.elementData[k] = null;
            Object object2 = object1;
            boolean bool2 = false;
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (!paramCollection.contains(object2)) {
                arrayDeque.elementData[j++] = object1;
              } else {
                bool1 = true;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            k++;
          } 
          j = arrayDeque.positiveMod(j);
          for (k = 0; k < i; k++) {
            Object object1 = arrayDeque.elementData[k];
            arrayDeque.elementData[k] = null;
            Object object2 = object1;
            boolean bool2 = false;
            try {
              if (!paramCollection.contains(object2)) {
                arrayDeque.elementData[j] = object1;
                j = arrayDeque.incremented(j);
              } else {
                bool1 = true;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
        } 
        try {
          if (bool1)
            arrayDeque.size = arrayDeque.negativeMod(j - arrayDeque.head); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return bool1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public boolean addAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x5B8BCECA7ABFL;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "elements");
      if (paramCollection.isEmpty())
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ensureCapacity(size() + paramCollection.size());
    copyCollectionElements(positiveMod(this.head + size()), paramCollection);
    return true;
  }
  
  public boolean add(Object paramObject) {
    addLast(paramObject);
    return true;
  }
  
  public final Object last() {
    long l = a ^ 0x8B93F264272L;
    try {
      if (isEmpty())
        throw new NoSuchElementException("ArrayDeque is empty."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
  }
  
  @NotNull
  public final Object[] testToArray$kotlin_stdlib(@NotNull Object[] paramArrayOfObject) {
    long l = a ^ 0xA2605FF71AFL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return toArray(paramArrayOfObject);
  }
  
  @NotNull
  public final Object[] testToArray$kotlin_stdlib() {
    return toArray();
  }
  
  public ArrayDeque(int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque.a : J
    //   3: ldc2_w 127944214492203
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: invokespecial <init> : ()V
    //   12: aload_0
    //   13: iload_1
    //   14: ifne -> 23
    //   17: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque.emptyElementData : [Ljava/lang/Object;
    //   20: goto -> 65
    //   23: iload_1
    //   24: ifle -> 38
    //   27: iload_1
    //   28: anewarray java/lang/Object
    //   31: goto -> 65
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: new java/lang/IllegalArgumentException
    //   41: dup
    //   42: new java/lang/StringBuilder
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: ldc 'Illegal Capacity: '
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: iload_1
    //   55: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: invokespecial <init> : (Ljava/lang/String;)V
    //   64: athrow
    //   65: putfield elementData : [Ljava/lang/Object;
    //   68: return
    // Exception table:
    //   from	to	target	type
    //   23	34	34	java/lang/IllegalArgumentException
  }
  
  public int getSize() {
    return this.size;
  }
  
  @NotNull
  public Object[] toArray() {
    return toArray(new Object[size()]);
  }
  
  public Object removeAt(int paramInt) {
    try {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, size());
      if (paramInt == CollectionsKt.getLastIndex(this))
        return removeLast(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt == 0)
        return removeFirst(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = positiveMod(this.head + paramInt);
    Object object = this.elementData[i];
    try {
      if (paramInt < size() >> 1) {
        try {
          if (i >= this.head) {
            ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, i);
          } else {
            ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, i);
            this.elementData[0] = this.elementData[this.elementData.length - 1];
            ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, this.elementData.length - 1);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        this.elementData[this.head] = null;
        this.head = incremented(this.head);
      } else {
        int j = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        try {
          if (i <= j) {
            ArraysKt.copyInto(this.elementData, this.elementData, i, i + 1, j + 1);
          } else {
            ArraysKt.copyInto(this.elementData, this.elementData, i, i + 1, this.elementData.length);
            this.elementData[this.elementData.length - 1] = this.elementData[0];
            ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, j + 1);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        this.elementData[j] = null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.size = size() - 1;
    return object;
  }
  
  public boolean remove(Object paramObject) {
    int i = indexOf(paramObject);
    try {
      if (i == -1)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    remove(i);
    return true;
  }
  
  public final void internalStructure$kotlin_stdlib(@NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque.a : J
    //   3: ldc2_w 33273377355806
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'structure'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: dup
    //   16: getfield head : I
    //   19: aload_0
    //   20: invokevirtual size : ()I
    //   23: iadd
    //   24: invokespecial positiveMod : (I)I
    //   27: istore #4
    //   29: aload_0
    //   30: invokevirtual isEmpty : ()Z
    //   33: ifne -> 52
    //   36: aload_0
    //   37: getfield head : I
    //   40: iload #4
    //   42: if_icmpge -> 63
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   51: athrow
    //   52: aload_0
    //   53: getfield head : I
    //   56: goto -> 73
    //   59: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   62: athrow
    //   63: aload_0
    //   64: getfield head : I
    //   67: aload_0
    //   68: getfield elementData : [Ljava/lang/Object;
    //   71: arraylength
    //   72: isub
    //   73: istore #5
    //   75: aload_1
    //   76: iload #5
    //   78: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   81: aload_0
    //   82: invokevirtual toArray : ()[Ljava/lang/Object;
    //   85: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: pop
    //   91: return
    // Exception table:
    //   from	to	target	type
    //   29	45	48	java/lang/IllegalArgumentException
    //   36	59	59	java/lang/IllegalArgumentException
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (size() == 0);
  }
  
  public final void addFirst(Object paramObject) {
    ensureCapacity(size() + 1);
    this.head = decremented(this.head);
    this.elementData[this.head] = paramObject;
    this.size = size() + 1;
  }
  
  public int indexOf(Object paramObject) {
    int i = positiveMod(this.head + size());
    if (this.head < i) {
      int j = this.head;
      while (true) {
        try {
          if (j < i) {
            try {
              if (Intrinsics.areEqual(paramObject, this.elementData[j]))
                return j - this.head; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            j++;
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      } 
    } else if (this.head >= i) {
      int j = this.head;
      int k = this.elementData.length;
      while (true) {
        try {
          if (j < k) {
            try {
              if (Intrinsics.areEqual(paramObject, this.elementData[j]))
                return j - this.head; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            j++;
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        j = 0;
        while (true) {
          try {
            if (j < i) {
              try {
                if (Intrinsics.areEqual(paramObject, this.elementData[j]))
                  return j + this.elementData.length - this.head; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              j++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          break;
        } 
        break;
      } 
    } 
    return -1;
  }
  
  public ArrayDeque(@NotNull Collection paramCollection) {
    Collection collection1 = paramCollection;
    boolean bool = false;
    Collection collection2 = collection1;
    try {
      Intrinsics.checkNotNull(collection2.toArray(new Object[0]), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      this.elementData = collection2.toArray(new Object[0]);
      this.size = this.elementData.length;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if ((this.elementData.length == 0))
        this.elementData = emptyElementData; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int lastIndexOf(Object paramObject) {
    int i = positiveMod(this.head + size());
    if (this.head < i) {
      int j = i - 1;
      int k = this.head;
      try {
        if (k <= j)
          while (true) {
            try {
              if (Intrinsics.areEqual(paramObject, this.elementData[j]))
                return j - this.head; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (j != k) {
                j--;
                continue;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            break;
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } else if (this.head > i) {
      int j = i - 1;
      while (true) {
        try {
          if (-1 < j) {
            try {
              if (Intrinsics.areEqual(paramObject, this.elementData[j]))
                return j + this.elementData.length - this.head; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            j--;
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        j = ArraysKt.getLastIndex(this.elementData);
        int k = this.head;
        try {
          if (k <= j)
            while (true) {
              try {
                if (Intrinsics.areEqual(paramObject, this.elementData[j]))
                  return j - this.head; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              try {
                if (j != k) {
                  j--;
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              break;
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      } 
    } 
    return -1;
  }
  
  public final Object removeLast() {
    long l = a ^ 0x29E56ABE9689L;
    try {
      if (isEmpty())
        throw new NoSuchElementException("ArrayDeque is empty."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = positiveMod(this.head + CollectionsKt.getLastIndex(this));
    Object object = this.elementData[i];
    this.elementData[i] = null;
    this.size = size() - 1;
    return object;
  }
  
  @Nullable
  public final Object removeFirstOrNull() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? null : removeFirst();
  }
  
  static {
    Companion = new ArrayDeque$Companion(null);
    boolean bool = false;
    emptyElementData = new Object[0];
  }
  
  public void add(int paramInt, Object paramObject) {
    try {
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(paramInt, size());
      if (paramInt == size()) {
        addLast(paramObject);
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt == 0) {
        addFirst(paramObject);
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ensureCapacity(size() + 1);
    int i = positiveMod(this.head + paramInt);
    if (paramInt < size() + 1 >> 1) {
      int j = decremented(i);
      int k = decremented(this.head);
      try {
        if (j >= this.head) {
          this.elementData[k] = this.elementData[this.head];
          ArraysKt.copyInto(this.elementData, this.elementData, this.head, this.head + 1, j + 1);
        } else {
          ArraysKt.copyInto(this.elementData, this.elementData, this.head - 1, this.head, this.elementData.length);
          this.elementData[this.elementData.length - 1] = this.elementData[0];
          ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, j + 1);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.elementData[j] = paramObject;
      this.head = k;
    } else {
      int j = positiveMod(this.head + size());
      try {
        if (i < j) {
          ArraysKt.copyInto(this.elementData, this.elementData, i + 1, i, j);
        } else {
          ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, j);
          this.elementData[0] = this.elementData[this.elementData.length - 1];
          ArraysKt.copyInto(this.elementData, this.elementData, i + 1, i, this.elementData.length - 1);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.elementData[i] = paramObject;
    } 
    this.size = size() + 1;
  }
  
  public void clear() {
    int i = positiveMod(this.head + size());
    try {
      if (this.head < i) {
        ArraysKt.fill(this.elementData, (Object)null, this.head, i);
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (!super.isEmpty()) {
            ArraysKt.fill(this.elementData, (Object)null, this.head, this.elementData.length);
            ArraysKt.fill(this.elementData, (Object)null, 0, i);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.head = 0;
    this.size = 0;
  }
  
  @NotNull
  public Object[] toArray(@NotNull Object[] paramArrayOfObject) {
    long l = a ^ 0x32318EB75ACAL;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull((paramArrayOfObject.length >= size()) ? paramArrayOfObject : ArraysKt.arrayOfNulls(paramArrayOfObject, size()), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    Object object = (paramArrayOfObject.length >= size()) ? paramArrayOfObject : ArraysKt.arrayOfNulls(paramArrayOfObject, size());
    int i = positiveMod(this.head + size());
    try {
      if (this.head < i) {
        ArraysKt.copyInto$default(this.elementData, (Object[])object, 0, this.head, i, 2, (Object)null);
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (!super.isEmpty()) {
            ArraysKt.copyInto(this.elementData, (Object[])object, 0, this.head, this.elementData.length);
            ArraysKt.copyInto(this.elementData, (Object[])object, this.elementData.length - this.head, 0, i);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (object.length > size())
        object[size()] = null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Object[])object;
  }
  
  public final Object removeFirst() {
    long l = a ^ 0x1CA303157717L;
    try {
      if (isEmpty())
        throw new NoSuchElementException("ArrayDeque is empty."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Object object = this.elementData[this.head];
    this.elementData[this.head] = null;
    this.head = incremented(this.head);
    this.size = size() - 1;
    return object;
  }
  
  @Nullable
  public final Object removeLastOrNull() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? null : removeLast();
  }
  
  public boolean retainAll(@NotNull Collection paramCollection) {
    long l = a ^ 0x3BF3ABF7E1DEL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    ArrayDeque arrayDeque = this;
    boolean bool = false;
    try {
      if (!arrayDeque.isEmpty()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if ((arrayDeque.elementData.length == 0));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        int i = arrayDeque.positiveMod(arrayDeque.head + arrayDeque.size());
        int j = arrayDeque.head;
        boolean bool1 = false;
        if (arrayDeque.head < i) {
          for (int k = arrayDeque.head; k < i; k++) {
            Object object1 = arrayDeque.elementData[k];
            Object object2 = object1;
            boolean bool2 = false;
            try {
              if (paramCollection.contains(object2)) {
                arrayDeque.elementData[j++] = object1;
              } else {
                bool1 = true;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
          ArraysKt.fill(arrayDeque.elementData, (Object)null, j, i);
        } else {
          int k = arrayDeque.head;
          int m = arrayDeque.elementData.length;
          while (k < m) {
            Object object1 = arrayDeque.elementData[k];
            arrayDeque.elementData[k] = null;
            Object object2 = object1;
            boolean bool2 = false;
            try {
              if (paramCollection.contains(object2)) {
                arrayDeque.elementData[j++] = object1;
              } else {
                bool1 = true;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            k++;
          } 
          j = arrayDeque.positiveMod(j);
          for (k = 0; k < i; k++) {
            Object object1 = arrayDeque.elementData[k];
            arrayDeque.elementData[k] = null;
            Object object2 = object1;
            boolean bool2 = false;
            if (paramCollection.contains(object2)) {
              arrayDeque.elementData[j] = object1;
              j = arrayDeque.incremented(j);
            } else {
              bool1 = true;
            } 
          } 
        } 
        try {
          if (bool1)
            arrayDeque.size = arrayDeque.negativeMod(j - arrayDeque.head); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return bool1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public boolean contains(Object paramObject) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (indexOf(paramObject) != -1);
  }
  
  @Nullable
  public final Object lastOrNull() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? null : this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
  }
  
  @Nullable
  public final Object firstOrNull() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? null : this.elementData[this.head];
  }
  
  public ArrayDeque() {
    this.elementData = emptyElementData;
  }
  
  public Object get(int paramInt) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, size());
    return this.elementData[positiveMod(this.head + paramInt)];
  }
  
  public final Object first() {
    long l = a ^ 0x31D3AF781780L;
    try {
      if (isEmpty())
        throw new NoSuchElementException("ArrayDeque is empty."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.elementData[this.head];
  }
  
  public boolean addAll(int paramInt, @NotNull Collection paramCollection) {
    long l = a ^ 0x56D98A361D7EL;
    try {
      Intrinsics.checkNotNullParameter(paramCollection, "elements");
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(paramInt, size());
      if (paramCollection.isEmpty())
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt == size())
        return addAll(paramCollection); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ensureCapacity(size() + paramCollection.size());
    int i = positiveMod(this.head + size());
    int j = positiveMod(this.head + paramInt);
    int k = paramCollection.size();
    if (paramInt < size() + 1 >> 1) {
      int m = this.head - k;
      try {
        if (j >= this.head) {
          try {
            if (m >= 0) {
              ArraysKt.copyInto(this.elementData, this.elementData, m, this.head, j);
            } else {
              m += this.elementData.length;
              int n = j - this.head;
              int i1 = this.elementData.length - m;
              try {
                if (i1 >= n) {
                  ArraysKt.copyInto(this.elementData, this.elementData, m, this.head, j);
                } else {
                  ArraysKt.copyInto(this.elementData, this.elementData, m, this.head, this.head + i1);
                  ArraysKt.copyInto(this.elementData, this.elementData, 0, this.head + i1, j);
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          try {
            ArraysKt.copyInto(this.elementData, this.elementData, m, this.head, this.elementData.length);
            if (k >= j) {
              ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - k, 0, j);
            } else {
              ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - k, 0, k);
              ArraysKt.copyInto(this.elementData, this.elementData, 0, k, j);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.head = m;
      copyCollectionElements(negativeMod(j - k), paramCollection);
    } else {
      int m = j + k;
      try {
        if (j < i) {
          try {
            if (i + k <= this.elementData.length) {
              ArraysKt.copyInto(this.elementData, this.elementData, m, j, i);
            } else {
              try {
                if (m >= this.elementData.length) {
                  ArraysKt.copyInto(this.elementData, this.elementData, m - this.elementData.length, j, i);
                } else {
                  int n = i + k - this.elementData.length;
                  ArraysKt.copyInto(this.elementData, this.elementData, 0, i - n, i);
                  ArraysKt.copyInto(this.elementData, this.elementData, m, j, i - n);
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          try {
            ArraysKt.copyInto(this.elementData, this.elementData, k, 0, i);
            if (m >= this.elementData.length) {
              ArraysKt.copyInto(this.elementData, this.elementData, m - this.elementData.length, j, this.elementData.length);
            } else {
              ArraysKt.copyInto(this.elementData, this.elementData, 0, this.elementData.length - k, this.elementData.length);
              ArraysKt.copyInto(this.elementData, this.elementData, m, j, this.elementData.length - k);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      copyCollectionElements(j, paramCollection);
    } 
    return true;
  }
  
  public Object set(int paramInt, Object paramObject) {
    AbstractList.Companion.checkElementIndex$kotlin_stdlib(paramInt, size());
    int i = positiveMod(this.head + paramInt);
    Object object = this.elementData[i];
    this.elementData[i] = paramObject;
    return object;
  }
  
  public final void addLast(Object paramObject) {
    ensureCapacity(size() + 1);
    this.elementData[positiveMod(this.head + size())] = paramObject;
    this.size = size() + 1;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArrayDeque.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */