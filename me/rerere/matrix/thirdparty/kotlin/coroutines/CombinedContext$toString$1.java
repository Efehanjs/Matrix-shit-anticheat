package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CombinedContext$toString$1 extends Lambda implements Function2 {
  public static final CombinedContext$toString$1 INSTANCE;
  
  private static final long a = o3.a(3055372059198043176L, 6526709066501906805L, null).a(148608088489409L);
  
  public CombinedContext$toString$1() {
    super(2);
  }
  
  @NotNull
  public final String invoke(@NotNull String paramString, @NotNull CoroutineContext$Element paramCoroutineContext$Element) {
    long l = a ^ 0x6412E1CD017CL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "acc");
      Intrinsics.checkNotNullParameter(paramCoroutineContext$Element, "element");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((((CharSequence)paramString).length() == 0)) ? paramCoroutineContext$Element.toString() : (paramString + ", " + paramCoroutineContext$Element);
  }
  
  static {
    INSTANCE = new CombinedContext$toString$1();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CombinedContext$toString$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */