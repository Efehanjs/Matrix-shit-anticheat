package me.rerere.matrix.thirdparty.kotlin.random;

import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class AbstractPlatformRandom extends Random {
  private static final long a = o3.a(-4465098872357242199L, 1739268159437137573L, null).a(69776040144492L);
  
  public int nextInt(int paramInt) {
    return getImpl().nextInt(paramInt);
  }
  
  public float nextFloat() {
    return getImpl().nextFloat();
  }
  
  public int nextBits(int paramInt) {
    return RandomKt.takeUpperBits(getImpl().nextInt(), paramInt);
  }
  
  public int nextInt() {
    return getImpl().nextInt();
  }
  
  @NotNull
  public abstract Random getImpl();
  
  public long nextLong() {
    return getImpl().nextLong();
  }
  
  @NotNull
  public byte[] nextBytes(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x13AF0F6026B5L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    byte[] arrayOfByte1 = paramArrayOfbyte;
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    getImpl().nextBytes(arrayOfByte2);
    return arrayOfByte1;
  }
  
  public boolean nextBoolean() {
    return getImpl().nextBoolean();
  }
  
  public double nextDouble() {
    return getImpl().nextDouble();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\AbstractPlatformRandom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */