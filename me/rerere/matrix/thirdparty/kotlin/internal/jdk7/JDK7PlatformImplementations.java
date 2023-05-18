package me.rerere.matrix.thirdparty.kotlin.internal.jdk7;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementations;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class JDK7PlatformImplementations extends PlatformImplementations {
  private static final long b = o3.a(-4052339527779410861L, 2563284498630495195L, null).a(44687162419724L);
  
  @NotNull
  public List getSuppressed(@NotNull Throwable paramThrowable) {
    long l = b ^ 0x1A0775FB6CE3L;
    try {
      Intrinsics.checkNotNullParameter(paramThrowable, "exception");
      Intrinsics.checkNotNullExpressionValue(paramThrowable.getSuppressed(), "exception.suppressed");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return sdkIsNullOrAtLeast(19) ? ArraysKt.asList((Object[])paramThrowable.getSuppressed()) : super.getSuppressed(paramThrowable);
  }
  
  public void addSuppressed(@NotNull Throwable paramThrowable1, @NotNull Throwable paramThrowable2) {
    long l = b ^ 0x536ED082F223L;
    try {
      Intrinsics.checkNotNullParameter(paramThrowable1, "cause");
      Intrinsics.checkNotNullParameter(paramThrowable2, "exception");
      if (sdkIsNullOrAtLeast(19)) {
        paramThrowable1.addSuppressed(paramThrowable2);
      } else {
        super.addSuppressed(paramThrowable1, paramThrowable2);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\jdk7\JDK7PlatformImplementations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */