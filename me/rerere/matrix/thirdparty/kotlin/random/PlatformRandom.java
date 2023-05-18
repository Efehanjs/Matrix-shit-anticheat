package me.rerere.matrix.thirdparty.kotlin.random;

import java.io.Serializable;
import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class PlatformRandom extends AbstractPlatformRandom implements Serializable {
  @NotNull
  private final Random impl;
  
  @Deprecated
  private static final long serialVersionUID = 0L;
  
  @NotNull
  private static final PlatformRandom$Companion Companion;
  
  private static final long b = o3.a(-519122796107517681L, 1054308024105968613L, null).a(216893985593166L);
  
  static {
    Companion = new PlatformRandom$Companion(null);
  }
  
  public PlatformRandom(@NotNull Random paramRandom) {
    this.impl = paramRandom;
  }
  
  @NotNull
  public Random getImpl() {
    return this.impl;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\PlatformRandom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */