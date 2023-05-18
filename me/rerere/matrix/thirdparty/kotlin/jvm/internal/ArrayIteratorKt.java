package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArrayIteratorKt {
  private static final long a = o3.a(8217961827002373491L, 7829138160594538899L, null).a(10667658601244L);
  
  @NotNull
  public static final Iterator iterator(@NotNull Object[] paramArrayOfObject) {
    long l = a ^ 0x25E91AE37BBL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return new ArrayIterator(paramArrayOfObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ArrayIteratorKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */