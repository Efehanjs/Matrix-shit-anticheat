package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.misc.premium.Envelop;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class co {
  private static int[] a;
  
  private static final long b = o3.a(-677985316258107080L, 4181748455118069190L, MethodHandles.lookup().lookupClass()).a(270240860489294L);
  
  @NotNull
  public final Envelop j(long paramLong, @NotNull String paramString1, @NotNull String paramString2) {
    paramLong = b ^ paramLong;
    long l1 = paramLong ^ 0xA12ADDA498AL;
    int i = (int)((paramLong ^ 0x6040DE995A0DL) >>> 32L);
    int j = (int)((paramLong ^ 0x6040DE995A0DL) << 32L >>> 40L);
    int k = (int)((paramLong ^ 0x6040DE995A0DL) << 56L >>> 56L);
    paramLong ^ 0x6040DE995A0DL;
    long l2 = paramLong ^ 0x23DEC3F9EF7L;
    String str1 = eg.b.b(i, j, (byte)k);
    String str2 = dl.i.b(str1, paramString2, l1);
    String str3 = eg.b.j(paramString1, l2, str1);
    return new Envelop(str2, str3);
  }
  
  @NotNull
  public final Envelop b(@NotNull String paramString1, @NotNull String paramString2, long paramLong) {
    paramLong = b ^ paramLong;
    int i = (int)((paramLong ^ 0x873DF33D57DL) >>> 32L);
    int j = (int)((paramLong ^ 0x873DF33D57DL) << 32L >>> 40L);
    int k = (int)((paramLong ^ 0x873DF33D57DL) << 56L >>> 56L);
    paramLong ^ 0x873DF33D57DL;
    long l1 = paramLong ^ 0x6A0EED951187L;
    long l2 = paramLong ^ 0x3503D96A0E0AL;
    String str1 = eg.b.b(i, j, (byte)k);
    String str2 = dl.i.p(str1, l2, paramString2);
    String str3 = eg.b.j(paramString1, l1, str1);
    return new Envelop(str2, str3);
  }
  
  public static void X(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] l() {
    return a;
  }
  
  static {
    if (l() != null)
      X(new int[5]); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\co.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */