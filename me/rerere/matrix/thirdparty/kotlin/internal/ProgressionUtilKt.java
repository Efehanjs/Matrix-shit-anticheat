package me.rerere.matrix.thirdparty.kotlin.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;

public final class ProgressionUtilKt {
  private static final long a = o3.a(6417203511928525701L, -2665931379520251029L, null).a(189213475352565L);
  
  @PublishedApi
  public static final int getProgressionLastElement(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/internal/ProgressionUtilKt.a : J
    //   3: ldc2_w 67662859692549
    //   6: lxor
    //   7: lstore_3
    //   8: nop
    //   9: iload_2
    //   10: ifle -> 44
    //   13: iload_0
    //   14: iload_1
    //   15: if_icmplt -> 33
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   24: athrow
    //   25: iload_1
    //   26: goto -> 90
    //   29: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   32: athrow
    //   33: iload_1
    //   34: iload_1
    //   35: iload_0
    //   36: iload_2
    //   37: invokestatic differenceModulo : (III)I
    //   40: isub
    //   41: goto -> 90
    //   44: iload_2
    //   45: ifge -> 80
    //   48: iload_0
    //   49: iload_1
    //   50: if_icmpgt -> 68
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   59: athrow
    //   60: iload_1
    //   61: goto -> 90
    //   64: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   67: athrow
    //   68: iload_1
    //   69: iload_0
    //   70: iload_1
    //   71: iload_2
    //   72: ineg
    //   73: invokestatic differenceModulo : (III)I
    //   76: iadd
    //   77: goto -> 90
    //   80: new java/lang/IllegalArgumentException
    //   83: dup
    //   84: ldc 'Step is zero.'
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: athrow
    //   90: ireturn
    // Exception table:
    //   from	to	target	type
    //   8	18	21	java/lang/IllegalArgumentException
    //   13	29	29	java/lang/IllegalArgumentException
    //   44	53	56	java/lang/IllegalArgumentException
    //   48	64	64	java/lang/IllegalArgumentException
  }
  
  @PublishedApi
  public static final long getProgressionLastElement(long paramLong1, long paramLong2, long paramLong3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/internal/ProgressionUtilKt.a : J
    //   3: ldc2_w 87615493369044
    //   6: lxor
    //   7: lstore #6
    //   9: nop
    //   10: lload #4
    //   12: lconst_0
    //   13: lcmp
    //   14: ifle -> 50
    //   17: lload_0
    //   18: lload_2
    //   19: lcmp
    //   20: iflt -> 38
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: lload_2
    //   31: goto -> 101
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: lload_2
    //   39: lload_2
    //   40: lload_0
    //   41: lload #4
    //   43: invokestatic differenceModulo : (JJJ)J
    //   46: lsub
    //   47: goto -> 101
    //   50: lload #4
    //   52: lconst_0
    //   53: lcmp
    //   54: ifge -> 91
    //   57: lload_0
    //   58: lload_2
    //   59: lcmp
    //   60: ifgt -> 78
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   69: athrow
    //   70: lload_2
    //   71: goto -> 101
    //   74: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: lload_2
    //   79: lload_0
    //   80: lload_2
    //   81: lload #4
    //   83: lneg
    //   84: invokestatic differenceModulo : (JJJ)J
    //   87: ladd
    //   88: goto -> 101
    //   91: new java/lang/IllegalArgumentException
    //   94: dup
    //   95: ldc 'Step is zero.'
    //   97: invokespecial <init> : (Ljava/lang/String;)V
    //   100: athrow
    //   101: lreturn
    // Exception table:
    //   from	to	target	type
    //   9	23	26	java/lang/IllegalArgumentException
    //   17	34	34	java/lang/IllegalArgumentException
    //   50	63	66	java/lang/IllegalArgumentException
    //   57	74	74	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\ProgressionUtilKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */