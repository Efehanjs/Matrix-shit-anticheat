package me.rerere.matrix.thirdparty.kotlin.random;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class XorWowRandom extends Random implements Serializable {
  private int v;
  
  private int w;
  
  @NotNull
  private static final XorWowRandom$Companion Companion;
  
  private int addend;
  
  private int z;
  
  private int y;
  
  private int x;
  
  @Deprecated
  private static final long serialVersionUID = 0L;
  
  private static final long a = o3.a(-7106886663183299847L, 3366047079063922534L, null).a(130242185822200L);
  
  public XorWowRandom(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.x = paramInt1;
    this.y = paramInt2;
    this.z = paramInt3;
    this.w = paramInt4;
    this.v = paramInt5;
    this.addend = paramInt6;
    byte b1 = ((this.x | this.y | this.z | this.w | this.v) != 0) ? 1 : 0;
    if (!b1) {
      boolean bool = false;
      String str = "Initial state must have at least one non-zero element.";
      throw new IllegalArgumentException(str.toString());
    } 
    b1 = 64;
    for (byte b2 = 0; b2 < b1; b2++) {
      byte b = b2;
      boolean bool = false;
      nextInt();
    } 
  }
  
  public XorWowRandom(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, 0, 0, paramInt1 ^ 0xFFFFFFFF, paramInt1 << 10 ^ paramInt2 >>> 4);
  }
  
  public int nextBits(int paramInt) {
    return RandomKt.takeUpperBits(nextInt(), paramInt);
  }
  
  public int nextInt() {
    int i = this.x;
    i ^= i >>> 2;
    this.x = this.y;
    this.y = this.z;
    this.z = this.w;
    int j = this.v;
    this.w = j;
    i = i ^ i << 1 ^ j ^ j << 4;
    this.v = i;
    this.addend += 362437;
    return i + this.addend;
  }
  
  static {
    Companion = new XorWowRandom$Companion(null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\XorWowRandom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */