package me.rerere.matrix.thirdparty.kotlin.jvm;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class KotlinReflectionNotSupportedError extends Error {
  private static final long a = o3.a(-3200912339654961843L, -8998348594896829038L, null).a(194306958019881L);
  
  public KotlinReflectionNotSupportedError(@Nullable String paramString, @Nullable Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public KotlinReflectionNotSupportedError(@Nullable Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public KotlinReflectionNotSupportedError() {
    super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
  }
  
  public KotlinReflectionNotSupportedError(@Nullable String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\KotlinReflectionNotSupportedError.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */