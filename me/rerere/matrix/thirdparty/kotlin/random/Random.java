package me.rerere.matrix.thirdparty.kotlin.random;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
public abstract class Random {
  @NotNull
  private static final Random defaultRandom;
  
  @NotNull
  public static final Random$Default Default;
  
  private static final long c = o3.a(-5674821627581324039L, 3546972649227810570L, null).a(207711757380430L);
  
  public abstract int nextBits(int paramInt);
  
  public long nextLong(long paramLong1, long paramLong2) {
    RandomKt.checkRangeBounds(paramLong1, paramLong2);
    long l = paramLong2 - paramLong1;
    if (l > 0L) {
      long l1 = 0L;
      if ((l & -l) == l) {
        int i = (int)l;
        int j = (int)(l >>> 32L);
        int k = RandomKt.fastLog2(i);
        try {
          k = RandomKt.fastLog2(j);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        l1 = (i != 0) ? (nextBits(k) & 0xFFFFFFFFL) : ((j == 1) ? (nextInt() & 0xFFFFFFFFL) : ((nextBits(k) << 32L) + (nextInt() & 0xFFFFFFFFL)));
      } else {
        long l2 = 0L;
        while (true) {
          long l3 = nextLong() >>> 1L;
          l2 = l3 % l;
          if (l3 - l2 + l - 1L >= 0L) {
            l1 = l2;
            return paramLong1 + l1;
          } 
        } 
      } 
      return paramLong1 + l1;
    } 
    while (true) {
      long l1 = nextLong();
      if (paramLong1 <= l1) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
      
      } 
      if (false)
        return l1; 
    } 
  }
  
  public int nextInt() {
    return nextBits(32);
  }
  
  public double nextDouble(double paramDouble) {
    return nextDouble(0.0D, paramDouble);
  }
  
  public double nextDouble(double paramDouble1, double paramDouble2) {
    // Byte code:
    //   0: dload_1
    //   1: dload_3
    //   2: invokestatic checkRangeBounds : (DD)V
    //   5: dload_3
    //   6: dload_1
    //   7: dsub
    //   8: dstore #5
    //   10: dload #5
    //   12: invokestatic isInfinite : (D)Z
    //   15: ifeq -> 120
    //   18: dload_1
    //   19: dstore #9
    //   21: dload #9
    //   23: invokestatic isInfinite : (D)Z
    //   26: ifne -> 52
    //   29: dload #9
    //   31: invokestatic isNaN : (D)Z
    //   34: ifne -> 52
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   51: athrow
    //   52: iconst_0
    //   53: ifeq -> 120
    //   56: dload_3
    //   57: dstore #9
    //   59: dload #9
    //   61: invokestatic isInfinite : (D)Z
    //   64: ifne -> 90
    //   67: dload #9
    //   69: invokestatic isNaN : (D)Z
    //   72: ifne -> 90
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   81: athrow
    //   82: iconst_1
    //   83: goto -> 91
    //   86: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   89: athrow
    //   90: iconst_0
    //   91: ifeq -> 120
    //   94: aload_0
    //   95: invokevirtual nextDouble : ()D
    //   98: dload_3
    //   99: iconst_2
    //   100: i2d
    //   101: ddiv
    //   102: dload_1
    //   103: iconst_2
    //   104: i2d
    //   105: ddiv
    //   106: dsub
    //   107: dmul
    //   108: dstore #9
    //   110: dload_1
    //   111: dload #9
    //   113: dadd
    //   114: dload #9
    //   116: dadd
    //   117: goto -> 129
    //   120: dload_1
    //   121: aload_0
    //   122: invokevirtual nextDouble : ()D
    //   125: dload #5
    //   127: dmul
    //   128: dadd
    //   129: dstore #7
    //   131: dload #7
    //   133: dload_3
    //   134: dcmpl
    //   135: iflt -> 152
    //   138: dload_3
    //   139: ldc2_w -Infinity
    //   142: invokestatic nextAfter : (DD)D
    //   145: goto -> 154
    //   148: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   151: athrow
    //   152: dload #7
    //   154: dreturn
    // Exception table:
    //   from	to	target	type
    //   21	37	40	java/lang/IllegalArgumentException
    //   29	48	48	java/lang/IllegalArgumentException
    //   59	75	78	java/lang/IllegalArgumentException
    //   67	86	86	java/lang/IllegalArgumentException
    //   131	148	148	java/lang/IllegalArgumentException
  }
  
  public long nextLong(long paramLong) {
    return nextLong(0L, paramLong);
  }
  
  public double nextDouble() {
    return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
  }
  
  @NotNull
  public byte[] nextBytes(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/random/Random.c : J
    //   3: ldc2_w 21687993222290
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'array'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: new me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: arraylength
    //   22: invokespecial <init> : (II)V
    //   25: iload_2
    //   26: invokevirtual contains : (I)Z
    //   29: ifeq -> 60
    //   32: new me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   35: dup
    //   36: iconst_0
    //   37: aload_1
    //   38: arraylength
    //   39: invokespecial <init> : (II)V
    //   42: iload_3
    //   43: invokevirtual contains : (I)Z
    //   46: ifeq -> 60
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   55: athrow
    //   56: iconst_1
    //   57: goto -> 61
    //   60: iconst_0
    //   61: istore #6
    //   63: iload #6
    //   65: ifne -> 129
    //   68: iconst_0
    //   69: istore #7
    //   71: new java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: ldc 'fromIndex ('
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: iload_2
    //   84: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   87: ldc ') or toIndex ('
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: iload_3
    //   93: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   96: ldc ') are out of range: 0..'
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_1
    //   102: arraylength
    //   103: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   106: bipush #46
    //   108: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: astore #7
    //   116: new java/lang/IllegalArgumentException
    //   119: dup
    //   120: aload #7
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: athrow
    //   129: iload_2
    //   130: iload_3
    //   131: if_icmpgt -> 142
    //   134: iconst_1
    //   135: goto -> 143
    //   138: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   141: athrow
    //   142: iconst_0
    //   143: istore #6
    //   145: iload #6
    //   147: ifne -> 201
    //   150: iconst_0
    //   151: istore #7
    //   153: new java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: ldc 'fromIndex ('
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: iload_2
    //   166: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   169: ldc ') must be not greater than toIndex ('
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: iload_3
    //   175: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   178: ldc ').'
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual toString : ()Ljava/lang/String;
    //   186: astore #7
    //   188: new java/lang/IllegalArgumentException
    //   191: dup
    //   192: aload #7
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: invokespecial <init> : (Ljava/lang/String;)V
    //   200: athrow
    //   201: iload_3
    //   202: iload_2
    //   203: isub
    //   204: iconst_4
    //   205: idiv
    //   206: istore #6
    //   208: iconst_0
    //   209: istore #7
    //   211: iload_2
    //   212: istore #7
    //   214: iconst_0
    //   215: istore #8
    //   217: iload #8
    //   219: iload #6
    //   221: if_icmpge -> 293
    //   224: iload #8
    //   226: istore #9
    //   228: iconst_0
    //   229: istore #10
    //   231: aload_0
    //   232: invokevirtual nextInt : ()I
    //   235: istore #11
    //   237: aload_1
    //   238: iload #7
    //   240: iload #11
    //   242: i2b
    //   243: bastore
    //   244: aload_1
    //   245: iload #7
    //   247: iconst_1
    //   248: iadd
    //   249: iload #11
    //   251: bipush #8
    //   253: iushr
    //   254: i2b
    //   255: bastore
    //   256: aload_1
    //   257: iload #7
    //   259: iconst_2
    //   260: iadd
    //   261: iload #11
    //   263: bipush #16
    //   265: iushr
    //   266: i2b
    //   267: bastore
    //   268: aload_1
    //   269: iload #7
    //   271: iconst_3
    //   272: iadd
    //   273: iload #11
    //   275: bipush #24
    //   277: iushr
    //   278: i2b
    //   279: bastore
    //   280: iload #7
    //   282: iconst_4
    //   283: iadd
    //   284: istore #7
    //   286: nop
    //   287: iinc #8, 1
    //   290: goto -> 217
    //   293: iload_3
    //   294: iload #7
    //   296: isub
    //   297: istore #8
    //   299: aload_0
    //   300: iload #8
    //   302: bipush #8
    //   304: imul
    //   305: invokevirtual nextBits : (I)I
    //   308: istore #9
    //   310: iconst_0
    //   311: istore #10
    //   313: iload #10
    //   315: iload #8
    //   317: if_icmpge -> 346
    //   320: aload_1
    //   321: iload #7
    //   323: iload #10
    //   325: iadd
    //   326: iload #9
    //   328: iload #10
    //   330: bipush #8
    //   332: imul
    //   333: iushr
    //   334: i2b
    //   335: bastore
    //   336: iinc #10, 1
    //   339: goto -> 313
    //   342: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   345: athrow
    //   346: aload_1
    //   347: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/IllegalArgumentException
    //   129	138	138	java/lang/IllegalArgumentException
    //   313	342	342	java/lang/IllegalArgumentException
  }
  
  static {
    Default = new Random$Default(null);
    defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
  }
  
  public int nextInt(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: iload_2
    //   2: invokestatic checkRangeBounds : (II)V
    //   5: iload_2
    //   6: iload_1
    //   7: isub
    //   8: istore_3
    //   9: iload_3
    //   10: ifgt -> 26
    //   13: iload_3
    //   14: ldc -2147483648
    //   16: if_icmpne -> 101
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   25: athrow
    //   26: iload_3
    //   27: iload_3
    //   28: ineg
    //   29: iand
    //   30: iload_3
    //   31: if_icmpne -> 56
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   40: athrow
    //   41: iload_3
    //   42: invokestatic fastLog2 : (I)I
    //   45: istore #5
    //   47: aload_0
    //   48: iload #5
    //   50: invokevirtual nextBits : (I)I
    //   53: goto -> 94
    //   56: iconst_0
    //   57: istore #5
    //   59: aload_0
    //   60: invokevirtual nextInt : ()I
    //   63: iconst_1
    //   64: iushr
    //   65: istore #6
    //   67: iload #6
    //   69: iload_3
    //   70: irem
    //   71: istore #5
    //   73: iload #6
    //   75: iload #5
    //   77: isub
    //   78: iload_3
    //   79: iconst_1
    //   80: isub
    //   81: iadd
    //   82: iflt -> 59
    //   85: iload #5
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   93: athrow
    //   94: istore #4
    //   96: iload_1
    //   97: iload #4
    //   99: iadd
    //   100: ireturn
    //   101: nop
    //   102: aload_0
    //   103: invokevirtual nextInt : ()I
    //   106: istore #4
    //   108: iload_1
    //   109: iload #4
    //   111: if_icmpgt -> 132
    //   114: iload #4
    //   116: iload_2
    //   117: if_icmpge -> 128
    //   120: iconst_1
    //   121: goto -> 133
    //   124: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   127: athrow
    //   128: iconst_0
    //   129: goto -> 133
    //   132: iconst_0
    //   133: ifeq -> 101
    //   136: iload #4
    //   138: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	19	22	java/lang/IllegalArgumentException
    //   13	34	37	java/lang/IllegalArgumentException
    //   73	87	90	java/lang/IllegalArgumentException
    //   114	124	124	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public byte[] nextBytes(int paramInt) {
    return nextBytes(new byte[paramInt]);
  }
  
  public float nextFloat() {
    return nextBits(24) / 1.6777216E7F;
  }
  
  @NotNull
  public byte[] nextBytes(@NotNull byte[] paramArrayOfbyte) {
    long l = c ^ 0x18BD9FAE6E3AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    return nextBytes(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public long nextLong() {
    return (nextInt() << 32L) + nextInt();
  }
  
  public int nextInt(int paramInt) {
    return nextInt(0, paramInt);
  }
  
  public boolean nextBoolean() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (nextBits(1) != 0);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\Random.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */