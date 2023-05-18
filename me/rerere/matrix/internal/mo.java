package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class mo {
  private static final long a = o3.a(1700964507115594538L, -5903234642842278342L, MethodHandles.lookup().lookupClass()).a(163015619174907L);
  
  @NotNull
  public final xm b(long paramLong, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mo.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic values : ()[Lme/rerere/matrix/internal/xm;
    //   9: astore #6
    //   11: nop
    //   12: iconst_0
    //   13: istore #7
    //   15: invokestatic r : ()I
    //   18: iconst_0
    //   19: istore #8
    //   21: aload #6
    //   23: arraylength
    //   24: istore #9
    //   26: istore #4
    //   28: iload #8
    //   30: iload #9
    //   32: if_icmpge -> 134
    //   35: aload #6
    //   37: iload #8
    //   39: aaload
    //   40: astore #10
    //   42: aload #10
    //   44: iload #4
    //   46: ifeq -> 135
    //   49: astore #11
    //   51: iconst_0
    //   52: istore #12
    //   54: iload_3
    //   55: aload #11
    //   57: invokestatic b : (Lme/rerere/matrix/internal/xm;)I
    //   60: iload #4
    //   62: ifeq -> 100
    //   65: if_icmplt -> 107
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: iload_3
    //   76: iload #4
    //   78: ifeq -> 104
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload #11
    //   90: invokestatic j : (Lme/rerere/matrix/internal/xm;)I
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: if_icmpge -> 107
    //   103: iconst_1
    //   104: goto -> 108
    //   107: iconst_0
    //   108: lload_1
    //   109: lconst_0
    //   110: lcmp
    //   111: iflt -> 131
    //   114: ifeq -> 126
    //   117: aload #10
    //   119: goto -> 135
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: iinc #8, 1
    //   129: iload #4
    //   131: ifne -> 28
    //   134: aconst_null
    //   135: astore #5
    //   137: iload #4
    //   139: ifeq -> 163
    //   142: aload #5
    //   144: dup
    //   145: ifnonnull -> 166
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: pop
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: getstatic me/rerere/matrix/internal/xm.l : Lme/rerere/matrix/internal/xm;
    //   166: areturn
    // Exception table:
    //   from	to	target	type
    //   54	68	71	java/lang/RuntimeException
    //   65	81	84	java/lang/RuntimeException
    //   75	93	96	java/lang/RuntimeException
    //   108	122	122	java/lang/RuntimeException
    //   137	148	151	java/lang/RuntimeException
    //   142	156	159	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\mo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */