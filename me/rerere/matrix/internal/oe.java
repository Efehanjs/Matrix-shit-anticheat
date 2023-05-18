package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class oe {
  private final String b;
  
  private long i;
  
  private static yk[] a;
  
  private static final long c = o3.a(9060864712936915184L, 5052023889375175L, MethodHandles.lookup().lookupClass()).a(247482447100738L);
  
  public String b() {
    return this.b;
  }
  
  public void b() {
    this.i = 0L;
  }
  
  public void b(long paramLong) {
    this.i = paramLong;
  }
  
  @NotNull
  public String toString() {
    return this.b + "|" + this.i;
  }
  
  public long b() {
    return this.i;
  }
  
  public oe(String paramString, long paramLong) {
    this.b = paramString;
    this.i = paramLong;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/oe.c : J
    //   3: ldc2_w 119804863967442
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_1
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: ifnull -> 70
    //   40: aload_0
    //   41: invokevirtual getClass : ()Ljava/lang/Class;
    //   44: iload #4
    //   46: ifeq -> 77
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: aload_1
    //   57: invokevirtual getClass : ()Ljava/lang/Class;
    //   60: if_acmpeq -> 76
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: iconst_0
    //   71: ireturn
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: aload_1
    //   77: checkcast me/rerere/matrix/internal/oe
    //   80: astore #5
    //   82: aload_0
    //   83: getfield i : J
    //   86: aload #5
    //   88: getfield i : J
    //   91: lcmp
    //   92: iload #4
    //   94: ifeq -> 126
    //   97: ifne -> 145
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: aload_0
    //   108: getfield b : Ljava/lang/String;
    //   111: aload #5
    //   113: getfield b : Ljava/lang/String;
    //   116: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: iload #4
    //   128: ifeq -> 142
    //   131: ifeq -> 145
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: iconst_1
    //   142: goto -> 146
    //   145: iconst_0
    //   146: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	49	52	java/lang/RuntimeException
    //   40	63	66	java/lang/RuntimeException
    //   56	72	72	java/lang/RuntimeException
    //   82	100	103	java/lang/RuntimeException
    //   97	119	122	java/lang/RuntimeException
    //   126	134	137	java/lang/RuntimeException
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.b, Long.valueOf(this.i) });
  }
  
  public static void k(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] W() {
    return a;
  }
  
  static {
    if (W() == null)
      k(new yk[5]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\oe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */