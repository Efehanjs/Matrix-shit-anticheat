package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class jh extends sm {
  @NotNull
  private String i;
  
  private static final long b = o3.a(-7562555299604583782L, -8926772306424493135L, MethodHandles.lookup().lookupClass()).a(246351951073358L);
  
  @NotNull
  public final String b(@Nullable Object paramObject1, @Nullable Object paramObject2) {
    return this.i;
  }
  
  public jh(@NotNull zi paramzi) {
    super(null);
    this.i = paramzi.b(paramzi, null);
  }
  
  public final void b(@NotNull String paramString) {
    this.i = paramString;
  }
  
  @NotNull
  public final String b() {
    return this.i;
  }
  
  @NotNull
  public final jh b(long paramLong, @NotNull Pair... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jh.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_3
    //   7: astore #5
    //   9: iconst_0
    //   10: istore #6
    //   12: invokestatic a : ()I
    //   15: iconst_0
    //   16: istore #7
    //   18: aload #5
    //   20: arraylength
    //   21: istore #8
    //   23: istore #4
    //   25: iload #7
    //   27: iload #8
    //   29: if_icmpge -> 133
    //   32: aload #5
    //   34: iload #7
    //   36: aaload
    //   37: astore #9
    //   39: aload #9
    //   41: astore #10
    //   43: iconst_0
    //   44: istore #11
    //   46: aload_0
    //   47: lload_1
    //   48: lconst_0
    //   49: lcmp
    //   50: iflt -> 135
    //   53: aload_0
    //   54: getfield i : Ljava/lang/String;
    //   57: new java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: bipush #123
    //   66: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   69: aload #10
    //   71: invokevirtual getFirst : ()Ljava/lang/Object;
    //   74: checkcast java/lang/String
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: bipush #125
    //   82: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   85: invokevirtual toString : ()Ljava/lang/String;
    //   88: aload #10
    //   90: invokevirtual getSecond : ()Ljava/lang/Object;
    //   93: checkcast java/lang/String
    //   96: iconst_0
    //   97: iconst_4
    //   98: aconst_null
    //   99: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   102: putfield i : Ljava/lang/String;
    //   105: nop
    //   106: nop
    //   107: iinc #7, 1
    //   110: iload #4
    //   112: ifne -> 134
    //   115: iload #4
    //   117: ifeq -> 25
    //   120: lload_1
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle -> 110
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: nop
    //   134: aload_0
    //   135: areturn
    // Exception table:
    //   from	to	target	type
    //   46	120	129	java/lang/RuntimeException
  }
  
  @NotNull
  public final jh b(long paramLong) {
    paramLong = b ^ paramLong;
    int i = (int)((paramLong ^ 0x4D3CCC8840D3L) >>> 32L);
    int j = (int)((paramLong ^ 0x4D3CCC8840D3L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x4D3CCC8840D3L) << 48L >>> 48L);
    paramLong ^ 0x4D3CCC8840D3L;
    this.i = rc.b(this.i, false, 1, null, i, (short)j, (short)k);
    return this;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\jh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */