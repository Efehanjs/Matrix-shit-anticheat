package me.rerere.matrix.thirdparty.kotlin.random;

import java.util.Random;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FallbackThreadLocalRandom$implStorage$1 extends ThreadLocal {
  @NotNull
  public Random initialValue() {
    return new Random();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\FallbackThreadLocalRandom$implStorage$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */