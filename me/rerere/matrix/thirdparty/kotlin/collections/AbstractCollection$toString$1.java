package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AbstractCollection$toString$1 extends Lambda implements Function1 {
  private static final long a = o3.a(-4551679613423613154L, -5893115809576763374L, null).a(23606372536857L);
  
  @NotNull
  public final CharSequence invoke(Object paramObject) {
    long l = a ^ 0x10F3A07EFA3BL;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject == AbstractCollection.this) ? "(this Collection)" : String.valueOf(paramObject);
  }
  
  public AbstractCollection$toString$1() {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractCollection$toString$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */