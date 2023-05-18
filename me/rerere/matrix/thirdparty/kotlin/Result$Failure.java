package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Result$Failure implements Serializable {
  @JvmField
  @NotNull
  public final Throwable exception;
  
  private static final long a = o3.a(6498418915012502311L, 1272932220541580991L, null).a(86378225984380L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x6A0F48F5AFCDL;
    return "Failure(" + this.exception + ')';
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Result$Failure)
        try {
          if (Intrinsics.areEqual(this.exception, ((Result$Failure)paramObject).exception));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.exception.hashCode();
  }
  
  public Result$Failure(@NotNull Throwable paramThrowable) {
    this.exception = paramThrowable;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\Result$Failure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */