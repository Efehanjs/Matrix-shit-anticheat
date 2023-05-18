package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class KotlinVersionCurrentValue {
  @NotNull
  public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();
  
  @NotNull
  public static final KotlinVersion get() {
    return new KotlinVersion(1, 7, 20);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\KotlinVersionCurrentValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */