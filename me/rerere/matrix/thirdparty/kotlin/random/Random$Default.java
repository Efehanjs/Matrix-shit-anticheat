package me.rerere.matrix.thirdparty.kotlin.random;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Random$Default extends Random implements Serializable {
  private static final long a = o3.a(9085764004724806467L, 1419584212611617559L, null).a(99504496424405L);
  
  public double nextDouble(double paramDouble) {
    return Random.access$getDefaultRandom$cp().nextDouble(paramDouble);
  }
  
  public long nextLong() {
    return Random.access$getDefaultRandom$cp().nextLong();
  }
  
  public int nextInt() {
    return Random.access$getDefaultRandom$cp().nextInt();
  }
  
  public double nextDouble(double paramDouble1, double paramDouble2) {
    return Random.access$getDefaultRandom$cp().nextDouble(paramDouble1, paramDouble2);
  }
  
  @NotNull
  public byte[] nextBytes(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x50B61DB2CFA3L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    return Random.access$getDefaultRandom$cp().nextBytes(paramArrayOfbyte);
  }
  
  public long nextLong(long paramLong) {
    return Random.access$getDefaultRandom$cp().nextLong(paramLong);
  }
  
  public double nextDouble() {
    return Random.access$getDefaultRandom$cp().nextDouble();
  }
  
  public int nextBits(int paramInt) {
    return Random.access$getDefaultRandom$cp().nextBits(paramInt);
  }
  
  public int nextInt(int paramInt1, int paramInt2) {
    return Random.access$getDefaultRandom$cp().nextInt(paramInt1, paramInt2);
  }
  
  public int nextInt(int paramInt) {
    return Random.access$getDefaultRandom$cp().nextInt(paramInt);
  }
  
  @NotNull
  public byte[] nextBytes(int paramInt) {
    return Random.access$getDefaultRandom$cp().nextBytes(paramInt);
  }
  
  public long nextLong(long paramLong1, long paramLong2) {
    return Random.access$getDefaultRandom$cp().nextLong(paramLong1, paramLong2);
  }
  
  public boolean nextBoolean() {
    return Random.access$getDefaultRandom$cp().nextBoolean();
  }
  
  public float nextFloat() {
    return Random.access$getDefaultRandom$cp().nextFloat();
  }
  
  @NotNull
  public byte[] nextBytes(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x5BB2233D650BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    return Random.access$getDefaultRandom$cp().nextBytes(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\Random$Default.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */