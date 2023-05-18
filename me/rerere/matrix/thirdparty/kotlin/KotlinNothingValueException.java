package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.4")
@PublishedApi
public final class KotlinNothingValueException extends RuntimeException {
  public KotlinNothingValueException(@Nullable Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public KotlinNothingValueException(@Nullable String paramString) {
    super(paramString);
  }
  
  public KotlinNothingValueException(@Nullable String paramString, @Nullable Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public KotlinNothingValueException() {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\KotlinNothingValueException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */