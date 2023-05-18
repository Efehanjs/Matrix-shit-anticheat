package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class u {
  private static String a;
  
  private static final long b = o3.a(3042567726128511668L, 2392962321109924098L, MethodHandles.lookup().lookupClass()).a(104968907569443L);
  
  @NotNull
  public final q j(int paramInt, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/u.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 69860752808300
    //   11: lxor
    //   12: lstore #4
    //   14: pop2
    //   15: invokestatic values : ()[Lme/rerere/matrix/internal/q;
    //   18: astore #7
    //   20: invokestatic r : ()I
    //   23: iconst_0
    //   24: istore #8
    //   26: istore #6
    //   28: aload #7
    //   30: arraylength
    //   31: istore #9
    //   33: iload #8
    //   35: iload #9
    //   37: if_icmpge -> 110
    //   40: aload #7
    //   42: iload #8
    //   44: aaload
    //   45: iload #6
    //   47: ifeq -> 117
    //   50: astore #10
    //   52: iload #6
    //   54: lload_2
    //   55: lconst_0
    //   56: lcmp
    //   57: iflt -> 107
    //   60: ifeq -> 105
    //   63: iload_1
    //   64: aload #10
    //   66: invokevirtual b : ()I
    //   69: if_icmplt -> 102
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iload_1
    //   80: aload #10
    //   82: invokevirtual p : ()I
    //   85: if_icmpgt -> 102
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload #10
    //   97: areturn
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: iinc #8, 1
    //   105: iload #6
    //   107: ifne -> 33
    //   110: aload_0
    //   111: lload #4
    //   113: iload_1
    //   114: invokevirtual b : (JI)Lme/rerere/matrix/internal/q;
    //   117: areturn
    // Exception table:
    //   from	to	target	type
    //   52	72	75	java/lang/RuntimeException
    //   63	88	91	java/lang/RuntimeException
    //   79	98	98	java/lang/RuntimeException
  }
  
  @NotNull
  public final q b(long paramLong, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/u.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 116547089585962
    //   11: lxor
    //   12: dup2
    //   13: bipush #16
    //   15: lushr
    //   16: lstore #4
    //   18: dup2
    //   19: bipush #48
    //   21: lshl
    //   22: bipush #48
    //   24: lushr
    //   25: l2i
    //   26: istore #6
    //   28: pop2
    //   29: pop2
    //   30: invokestatic values : ()[Lme/rerere/matrix/internal/q;
    //   33: astore #8
    //   35: invokestatic a : ()I
    //   38: iconst_0
    //   39: istore #9
    //   41: istore #7
    //   43: aload #8
    //   45: arraylength
    //   46: iload #7
    //   48: ifne -> 62
    //   51: ifne -> 65
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: iconst_1
    //   62: goto -> 66
    //   65: iconst_0
    //   66: ifeq -> 77
    //   69: aconst_null
    //   70: goto -> 273
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload #8
    //   79: iconst_0
    //   80: aaload
    //   81: astore #10
    //   83: aload #8
    //   85: invokestatic getLastIndex : ([Ljava/lang/Object;)I
    //   88: istore #11
    //   90: iload #11
    //   92: ifne -> 104
    //   95: aload #10
    //   97: goto -> 273
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: aload #10
    //   106: astore #12
    //   108: iconst_0
    //   109: istore #13
    //   111: nop
    //   112: aload #12
    //   114: invokevirtual b : ()I
    //   117: iload_3
    //   118: isub
    //   119: invokestatic abs : (I)I
    //   122: aload #12
    //   124: invokevirtual p : ()I
    //   127: iload_3
    //   128: isub
    //   129: invokestatic abs : (I)I
    //   132: invokestatic min : (II)I
    //   135: nop
    //   136: istore #12
    //   138: new me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   141: dup
    //   142: iconst_1
    //   143: iload #11
    //   145: invokespecial <init> : (II)V
    //   148: invokevirtual iterator : ()Lme/rerere/matrix/thirdparty/kotlin/collections/IntIterator;
    //   151: astore #13
    //   153: aload #13
    //   155: invokevirtual hasNext : ()Z
    //   158: ifeq -> 265
    //   161: aload #13
    //   163: invokevirtual nextInt : ()I
    //   166: istore #14
    //   168: aload #8
    //   170: iload #14
    //   172: aaload
    //   173: astore #15
    //   175: aload #15
    //   177: astore #16
    //   179: iconst_0
    //   180: istore #17
    //   182: nop
    //   183: aload #16
    //   185: invokevirtual b : ()I
    //   188: iload_3
    //   189: isub
    //   190: invokestatic abs : (I)I
    //   193: aload #16
    //   195: invokevirtual p : ()I
    //   198: iload_3
    //   199: isub
    //   200: invokestatic abs : (I)I
    //   203: invokestatic min : (II)I
    //   206: nop
    //   207: istore #16
    //   209: iload #7
    //   211: lload_1
    //   212: lconst_0
    //   213: lcmp
    //   214: iflt -> 222
    //   217: ifne -> 285
    //   220: iload #12
    //   222: lload_1
    //   223: lconst_0
    //   224: lcmp
    //   225: ifle -> 262
    //   228: iload #7
    //   230: ifne -> 258
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   239: athrow
    //   240: iload #16
    //   242: if_icmple -> 153
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   251: athrow
    //   252: aload #15
    //   254: astore #10
    //   256: iload #16
    //   258: istore #12
    //   260: iload #7
    //   262: ifeq -> 153
    //   265: lload_1
    //   266: lconst_0
    //   267: lcmp
    //   268: ifle -> 285
    //   271: aload #10
    //   273: dup
    //   274: ifnonnull -> 294
    //   277: pop
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: aload_0
    //   286: lload #4
    //   288: iload #6
    //   290: i2c
    //   291: invokevirtual b : (JC)Lme/rerere/matrix/internal/q;
    //   294: areturn
    // Exception table:
    //   from	to	target	type
    //   43	54	57	java/lang/RuntimeException
    //   66	73	73	java/lang/RuntimeException
    //   90	100	100	java/lang/RuntimeException
    //   209	233	236	java/lang/RuntimeException
    //   220	245	248	java/lang/RuntimeException
    //   273	278	281	java/lang/RuntimeException
  }
  
  @NotNull
  public final q b(long paramLong, char paramChar) {
    // Byte code:
    //   0: lload_1
    //   1: bipush #16
    //   3: lshl
    //   4: iload_3
    //   5: i2l
    //   6: bipush #48
    //   8: lshl
    //   9: bipush #48
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/u.b : J
    //   16: lxor
    //   17: lstore #4
    //   19: invokestatic b : ()I
    //   22: istore #7
    //   24: invokestatic a : ()I
    //   27: invokestatic values : ()[Lme/rerere/matrix/internal/q;
    //   30: astore #8
    //   32: iconst_0
    //   33: istore #9
    //   35: istore #6
    //   37: aload #8
    //   39: arraylength
    //   40: istore #10
    //   42: iload #9
    //   44: iload #10
    //   46: if_icmpge -> 111
    //   49: aload #8
    //   51: iload #9
    //   53: aaload
    //   54: astore #11
    //   56: iload #6
    //   58: lload_1
    //   59: lconst_0
    //   60: lcmp
    //   61: iflt -> 108
    //   64: ifne -> 106
    //   67: aload #11
    //   69: iload #6
    //   71: ifne -> 114
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: invokevirtual j : ()I
    //   84: iload #7
    //   86: if_icmpne -> 103
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: aload #11
    //   98: areturn
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: iinc #9, 1
    //   106: iload #6
    //   108: ifeq -> 42
    //   111: getstatic me/rerere/matrix/internal/q.x : Lme/rerere/matrix/internal/q;
    //   114: areturn
    // Exception table:
    //   from	to	target	type
    //   56	74	77	java/lang/RuntimeException
    //   67	89	92	java/lang/RuntimeException
    //   81	99	99	java/lang/RuntimeException
  }
  
  public static void K(String paramString) {
    a = paramString;
  }
  
  public static String c() {
    return a;
  }
  
  static {
    if (c() == null)
      K("s8CNCc"); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */