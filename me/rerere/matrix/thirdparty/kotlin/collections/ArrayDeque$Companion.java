package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;

public final class ArrayDeque$Companion {
  public final int newCapacity$kotlin_stdlib(int paramInt1, int paramInt2) {
    int i = paramInt1 + (paramInt1 >> 1);
    if (i - paramInt2 < 0)
      i = paramInt2; 
    try {
      if (i - 2147483639 > 0) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        i = (paramInt2 > 2147483639) ? Integer.MAX_VALUE : 2147483639;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return i;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArrayDeque$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */