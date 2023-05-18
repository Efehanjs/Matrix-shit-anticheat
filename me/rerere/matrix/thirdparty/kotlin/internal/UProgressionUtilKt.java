package me.rerere.matrix.thirdparty.kotlin.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;

public final class UProgressionUtilKt {
  private static final long a = o3.a(8807098271368416657L, -2590594932310029556L, null).a(89061902910192L);
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  public static final int getProgressionLastElement-Nkh28Cs(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/internal/UProgressionUtilKt.a : J
    //   3: ldc2_w 53444888260118
    //   6: lxor
    //   7: lstore_3
    //   8: nop
    //   9: iload_2
    //   10: ifle -> 53
    //   13: iload_0
    //   14: iload_1
    //   15: invokestatic uintCompare : (II)I
    //   18: iflt -> 36
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   27: athrow
    //   28: iload_1
    //   29: goto -> 108
    //   32: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   35: athrow
    //   36: iload_1
    //   37: iload_1
    //   38: iload_0
    //   39: iload_2
    //   40: invokestatic constructor-impl : (I)I
    //   43: invokestatic differenceModulo-WZ9TVnA : (III)I
    //   46: isub
    //   47: invokestatic constructor-impl : (I)I
    //   50: goto -> 108
    //   53: iload_2
    //   54: ifge -> 98
    //   57: iload_0
    //   58: iload_1
    //   59: invokestatic uintCompare : (II)I
    //   62: ifgt -> 80
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   71: athrow
    //   72: iload_1
    //   73: goto -> 108
    //   76: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: iload_1
    //   81: iload_0
    //   82: iload_1
    //   83: iload_2
    //   84: ineg
    //   85: invokestatic constructor-impl : (I)I
    //   88: invokestatic differenceModulo-WZ9TVnA : (III)I
    //   91: iadd
    //   92: invokestatic constructor-impl : (I)I
    //   95: goto -> 108
    //   98: new java/lang/IllegalArgumentException
    //   101: dup
    //   102: ldc 'Step is zero.'
    //   104: invokespecial <init> : (Ljava/lang/String;)V
    //   107: athrow
    //   108: ireturn
    // Exception table:
    //   from	to	target	type
    //   8	21	24	java/lang/IllegalArgumentException
    //   13	32	32	java/lang/IllegalArgumentException
    //   53	65	68	java/lang/IllegalArgumentException
    //   57	76	76	java/lang/IllegalArgumentException
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  public static final long getProgressionLastElement-7ftBX0g(long paramLong1, long paramLong2, long paramLong3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/internal/UProgressionUtilKt.a : J
    //   3: ldc2_w 138262415463475
    //   6: lxor
    //   7: lstore #6
    //   9: nop
    //   10: lload #4
    //   12: lconst_0
    //   13: lcmp
    //   14: ifle -> 58
    //   17: lload_0
    //   18: lload_2
    //   19: invokestatic ulongCompare : (JJ)I
    //   22: iflt -> 40
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   31: athrow
    //   32: lload_2
    //   33: goto -> 117
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: lload_2
    //   41: lload_2
    //   42: lload_0
    //   43: lload #4
    //   45: invokestatic constructor-impl : (J)J
    //   48: invokestatic differenceModulo-sambcqE : (JJJ)J
    //   51: lsub
    //   52: invokestatic constructor-impl : (J)J
    //   55: goto -> 117
    //   58: lload #4
    //   60: lconst_0
    //   61: lcmp
    //   62: ifge -> 107
    //   65: lload_0
    //   66: lload_2
    //   67: invokestatic ulongCompare : (JJ)I
    //   70: ifgt -> 88
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: lload_2
    //   81: goto -> 117
    //   84: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   87: athrow
    //   88: lload_2
    //   89: lload_0
    //   90: lload_2
    //   91: lload #4
    //   93: lneg
    //   94: invokestatic constructor-impl : (J)J
    //   97: invokestatic differenceModulo-sambcqE : (JJJ)J
    //   100: ladd
    //   101: invokestatic constructor-impl : (J)J
    //   104: goto -> 117
    //   107: new java/lang/IllegalArgumentException
    //   110: dup
    //   111: ldc 'Step is zero.'
    //   113: invokespecial <init> : (Ljava/lang/String;)V
    //   116: athrow
    //   117: lreturn
    // Exception table:
    //   from	to	target	type
    //   9	25	28	java/lang/IllegalArgumentException
    //   17	36	36	java/lang/IllegalArgumentException
    //   58	73	76	java/lang/IllegalArgumentException
    //   65	84	84	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\UProgressionUtilKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */