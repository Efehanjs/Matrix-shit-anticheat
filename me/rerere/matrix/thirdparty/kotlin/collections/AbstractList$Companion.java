package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AbstractList$Companion {
  private static final long a = o3.a(-1931153980299420612L, 4039697294047272128L, null).a(251245408166151L);
  
  public final void checkElementIndex$kotlin_stdlib(int paramInt1, int paramInt2) {
    long l = a ^ 0x3503F7139C8CL;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 < paramInt2)
            return; 
          throw new IndexOutOfBoundsException("index: " + paramInt1 + ", size: " + paramInt2);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException("index: " + paramInt1 + ", size: " + paramInt2);
  }
  
  public final void checkPositionIndex$kotlin_stdlib(int paramInt1, int paramInt2) {
    long l = a ^ 0x6BB696F7BC36L;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 <= paramInt2)
            return; 
          throw new IndexOutOfBoundsException("index: " + paramInt1 + ", size: " + paramInt2);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException("index: " + paramInt1 + ", size: " + paramInt2);
  }
  
  public final int orderedHashCode$kotlin_stdlib(@NotNull Collection paramCollection) {
    Intrinsics.checkNotNullParameter(paramCollection, "c");
    int i = 1;
    for (Object object : paramCollection) {
      try {
      
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      i = 31 * i + ((object != null) ? object.hashCode() : 0);
    } 
    return i;
  }
  
  public final boolean orderedEquals$kotlin_stdlib(@NotNull Collection paramCollection1, @NotNull Collection paramCollection2) {
    long l = a ^ 0x65CA6D9C4811L;
    try {
      Intrinsics.checkNotNullParameter(paramCollection1, "c");
      Intrinsics.checkNotNullParameter(paramCollection2, "other");
      if (paramCollection1.size() != paramCollection2.size())
        return false; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Iterator<Object> iterator = paramCollection2.iterator();
    for (Object object1 : paramCollection1) {
      Object object2 = iterator.next();
      if (!Intrinsics.areEqual(object1, object2))
        return false; 
    } 
    return true;
  }
  
  public final void checkBoundsIndexes$kotlin_stdlib(int paramInt1, int paramInt2, int paramInt3) {
    long l = a ^ 0x13B1EC0D6EC6L;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 <= paramInt3) {
            try {
              if (paramInt1 > paramInt2)
                throw new IllegalArgumentException("startIndex: " + paramInt1 + " > endIndex: " + paramInt2); 
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw a(null);
            } 
            return;
          } 
          throw new IndexOutOfBoundsException("startIndex: " + paramInt1 + ", endIndex: " + paramInt2 + ", size: " + paramInt3);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException("startIndex: " + paramInt1 + ", endIndex: " + paramInt2 + ", size: " + paramInt3);
  }
  
  public final void checkRangeIndexes$kotlin_stdlib(int paramInt1, int paramInt2, int paramInt3) {
    long l = a ^ 0x152AD890FE39L;
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt2 <= paramInt3) {
            try {
              if (paramInt1 > paramInt2)
                throw new IllegalArgumentException("fromIndex: " + paramInt1 + " > toIndex: " + paramInt2); 
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw a(null);
            } 
            return;
          } 
          throw new IndexOutOfBoundsException("fromIndex: " + paramInt1 + ", toIndex: " + paramInt2 + ", size: " + paramInt3);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException("fromIndex: " + paramInt1 + ", toIndex: " + paramInt2 + ", size: " + paramInt3);
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractList$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */