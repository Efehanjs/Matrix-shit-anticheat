package me.rerere.matrix.thirdparty.kotlin.random;

import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class KotlinRandom extends Random {
  @Deprecated
  private static final long serialVersionUID = 0L;
  
  @NotNull
  private static final KotlinRandom$Companion Companion;
  
  @NotNull
  private final Random impl;
  
  private boolean seedInitialized;
  
  private static final long a = o3.a(-790991928865370717L, -8917601314274351143L, null).a(4347155786384L);
  
  public double nextDouble() {
    return this.impl.nextDouble();
  }
  
  @NotNull
  public final Random getImpl() {
    return this.impl;
  }
  
  public float nextFloat() {
    return this.impl.nextFloat();
  }
  
  public void nextBytes(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x3B8B639243E6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "bytes");
    this.impl.nextBytes(paramArrayOfbyte);
  }
  
  public void setSeed(long paramLong) {
    long l = a ^ 0x4C3242C4AAD8L;
    try {
      if (!this.seedInitialized) {
        this.seedInitialized = true;
      } else {
        throw new UnsupportedOperationException("Setting seed is not supported.");
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  static {
    Companion = new KotlinRandom$Companion(null);
  }
  
  public long nextLong() {
    return this.impl.nextLong();
  }
  
  public int next(int paramInt) {
    return this.impl.nextBits(paramInt);
  }
  
  public boolean nextBoolean() {
    return this.impl.nextBoolean();
  }
  
  public int nextInt(int paramInt) {
    return this.impl.nextInt(paramInt);
  }
  
  public KotlinRandom(@NotNull Random paramRandom) {
    this.impl = paramRandom;
  }
  
  public int nextInt() {
    return this.impl.nextInt();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\KotlinRandom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */