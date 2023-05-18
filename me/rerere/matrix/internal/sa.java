package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.util.Vector;

public final class sa {
  private double x;
  
  private double z;
  
  private double k;
  
  private double v;
  
  private double b;
  
  private double i;
  
  private static yk[] a;
  
  private static final long c = o3.a(6881774649355619838L, -29533679045228898L, MethodHandles.lookup().lookupClass()).a(253307136792027L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @NotNull
  public sa b() {
    return new sa(this.k, this.z, this.i, this.b, this.x, this.v);
  }
  
  @NotNull
  public static sa b(@NotNull Location paramLocation) {
    return new sa(paramLocation.getX(), paramLocation.getY(), paramLocation.getZ(), paramLocation.getX(), paramLocation.getY(), paramLocation.getZ());
  }
  
  public double n() {
    return Math.abs(this.v - this.i);
  }
  
  public boolean j(char paramChar1, int paramInt, @NotNull sa paramsa, char paramChar2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/sa.c : J
    //   27: lxor
    //   28: lstore #5
    //   30: lload #5
    //   32: dup2
    //   33: ldc2_w 53674686113398
    //   36: lxor
    //   37: dup2
    //   38: bipush #48
    //   40: lushr
    //   41: l2i
    //   42: istore #7
    //   44: dup2
    //   45: bipush #16
    //   47: lshl
    //   48: bipush #32
    //   50: lushr
    //   51: l2i
    //   52: istore #8
    //   54: dup2
    //   55: bipush #48
    //   57: lshl
    //   58: bipush #48
    //   60: lushr
    //   61: l2i
    //   62: istore #9
    //   64: pop2
    //   65: pop2
    //   66: invokestatic r : ()I
    //   69: istore #10
    //   71: aload_0
    //   72: iload #7
    //   74: i2c
    //   75: iload #8
    //   77: iload #9
    //   79: i2s
    //   80: aload_0
    //   81: invokespecial b : (CISLme/rerere/matrix/internal/sa;)Z
    //   84: iload #10
    //   86: ifeq -> 142
    //   89: ifne -> 134
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   98: athrow
    //   99: aload_0
    //   100: iload #10
    //   102: ifeq -> 144
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   111: athrow
    //   112: iload #7
    //   114: i2c
    //   115: iload #8
    //   117: iload #9
    //   119: i2s
    //   120: aload_3
    //   121: invokespecial b : (CISLme/rerere/matrix/internal/sa;)Z
    //   124: ifeq -> 143
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   133: athrow
    //   134: iconst_0
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   141: athrow
    //   142: ireturn
    //   143: aload_0
    //   144: invokevirtual i : ()D
    //   147: aload_3
    //   148: invokevirtual i : ()D
    //   151: invokestatic max : (DD)D
    //   154: dstore #11
    //   156: aload_0
    //   157: invokevirtual b : ()D
    //   160: aload_3
    //   161: invokevirtual b : ()D
    //   164: invokestatic max : (DD)D
    //   167: dstore #13
    //   169: aload_0
    //   170: invokevirtual h : ()D
    //   173: aload_3
    //   174: invokevirtual h : ()D
    //   177: invokestatic max : (DD)D
    //   180: dstore #15
    //   182: aload_0
    //   183: invokevirtual m : ()D
    //   186: aload_3
    //   187: invokevirtual m : ()D
    //   190: invokestatic min : (DD)D
    //   193: dstore #17
    //   195: aload_0
    //   196: invokevirtual t : ()D
    //   199: aload_3
    //   200: invokevirtual t : ()D
    //   203: invokestatic min : (DD)D
    //   206: dstore #19
    //   208: aload_0
    //   209: invokevirtual p : ()D
    //   212: aload_3
    //   213: invokevirtual p : ()D
    //   216: invokestatic min : (DD)D
    //   219: dstore #21
    //   221: aload_0
    //   222: invokevirtual c : ()D
    //   225: dconst_0
    //   226: dcmpl
    //   227: iload #10
    //   229: iload_1
    //   230: iflt -> 388
    //   233: ifeq -> 386
    //   236: ifne -> 381
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   245: athrow
    //   246: dload #17
    //   248: dload #11
    //   250: dcmpl
    //   251: iload #10
    //   253: iload_1
    //   254: iflt -> 291
    //   257: ifeq -> 289
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   266: athrow
    //   267: ifle -> 379
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   276: athrow
    //   277: dload #21
    //   279: dload #15
    //   281: dcmpl
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   288: athrow
    //   289: iload #10
    //   291: iload_1
    //   292: iflt -> 326
    //   295: ifeq -> 324
    //   298: ifle -> 379
    //   301: goto -> 308
    //   304: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   307: athrow
    //   308: aload_0
    //   309: invokevirtual t : ()D
    //   312: aload_3
    //   313: invokevirtual b : ()D
    //   316: dcmpl
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   323: athrow
    //   324: iload #10
    //   326: iload #4
    //   328: ifle -> 362
    //   331: ifeq -> 360
    //   334: ifle -> 379
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   343: athrow
    //   344: aload_0
    //   345: invokevirtual t : ()D
    //   348: aload_3
    //   349: invokevirtual t : ()D
    //   352: dcmpg
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   359: athrow
    //   360: iload #10
    //   362: ifeq -> 376
    //   365: ifge -> 379
    //   368: goto -> 375
    //   371: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   374: athrow
    //   375: iconst_1
    //   376: goto -> 380
    //   379: iconst_0
    //   380: ireturn
    //   381: dload #17
    //   383: dload #11
    //   385: dcmpl
    //   386: iload #10
    //   388: iload #4
    //   390: iflt -> 420
    //   393: ifeq -> 418
    //   396: ifle -> 469
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   405: athrow
    //   406: dload #19
    //   408: dload #13
    //   410: dcmpl
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   417: athrow
    //   418: iload #10
    //   420: iload #4
    //   422: ifle -> 452
    //   425: ifeq -> 450
    //   428: ifle -> 469
    //   431: goto -> 438
    //   434: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   437: athrow
    //   438: dload #21
    //   440: dload #15
    //   442: dcmpl
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   449: athrow
    //   450: iload #10
    //   452: ifeq -> 466
    //   455: ifle -> 469
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   464: athrow
    //   465: iconst_1
    //   466: goto -> 470
    //   469: iconst_0
    //   470: ireturn
    // Exception table:
    //   from	to	target	type
    //   71	92	95	java/lang/IllegalStateException
    //   89	105	108	java/lang/IllegalStateException
    //   99	127	130	java/lang/IllegalStateException
    //   112	135	138	java/lang/IllegalStateException
    //   221	239	242	java/lang/IllegalStateException
    //   236	260	263	java/lang/IllegalStateException
    //   246	270	273	java/lang/IllegalStateException
    //   267	282	285	java/lang/IllegalStateException
    //   289	301	304	java/lang/IllegalStateException
    //   298	317	320	java/lang/IllegalStateException
    //   324	337	340	java/lang/IllegalStateException
    //   334	353	356	java/lang/IllegalStateException
    //   360	368	371	java/lang/IllegalStateException
    //   386	399	402	java/lang/IllegalStateException
    //   396	411	414	java/lang/IllegalStateException
    //   418	431	434	java/lang/IllegalStateException
    //   428	443	446	java/lang/IllegalStateException
    //   450	458	461	java/lang/IllegalStateException
  }
  
  public double p(int paramInt1, int paramInt2, @NotNull ca paramca, char paramChar) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/sa.c : J
    //   27: lxor
    //   28: lstore #5
    //   30: getstatic me/rerere/matrix/internal/ua.i : [I
    //   33: aload_3
    //   34: invokevirtual ordinal : ()I
    //   37: iaload
    //   38: tableswitch default -> 83, 1 -> 64, 2 -> 73, 3 -> 78
    //   64: aload_0
    //   65: getfield b : D
    //   68: dreturn
    //   69: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield x : D
    //   77: dreturn
    //   78: aload_0
    //   79: getfield v : D
    //   82: dreturn
    //   83: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   86: sipush #24621
    //   89: ldc2_w 2923804933224604018
    //   92: lload #5
    //   94: lxor
    //   95: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   100: invokevirtual println : (Ljava/lang/String;)V
    //   103: dconst_0
    //   104: dreturn
    // Exception table:
    //   from	to	target	type
    //   30	69	69	java/lang/IllegalStateException
  }
  
  public void t(double paramDouble) {
    this.b = paramDouble;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: ldc2_w 4839076431941
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #17418
    //   18: ldc2_w 9115797248470790990
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield k : D
    //   35: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   38: sipush #24656
    //   41: ldc2_w 7606619570876880663
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield z : D
    //   58: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   61: sipush #23753
    //   64: ldc2_w 368478746261793672
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield i : D
    //   81: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   84: sipush #23121
    //   87: ldc2_w 2279192703851932957
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: getfield b : D
    //   104: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   107: sipush #24465
    //   110: ldc2_w 3135561740223686865
    //   113: lload_1
    //   114: lxor
    //   115: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload_0
    //   124: getfield x : D
    //   127: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   130: sipush #21486
    //   133: ldc2_w 7843519266644796579
    //   136: lload_1
    //   137: lxor
    //   138: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: aload_0
    //   147: getfield v : D
    //   150: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   153: bipush #125
    //   155: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   158: invokevirtual toString : ()Ljava/lang/String;
    //   161: areturn
  }
  
  @NotNull
  public sa p(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.k -= paramDouble1;
    this.b += paramDouble1;
    this.z -= paramDouble2;
    this.x += paramDouble2;
    this.i -= paramDouble3;
    this.v += paramDouble3;
    return this;
  }
  
  public boolean equals(Object paramObject) {
    long l = c ^ 0x3223A8585244L;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (paramObject == this)
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (!(paramObject instanceof sa))
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    sa sa1 = (sa)paramObject;
    try {
      if (i != 0)
        try {
          if (Double.compare(i(), sa1.i()) != 0)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(b(), sa1.b()) != 0)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(h(), sa1.h()) != 0)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(m(), sa1.m()) != 0)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(t(), sa1.t()) != 0)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(p(), sa1.p()) != 0)
            return false; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  public double[] b() {
    double[] arrayOfDouble = new double[3];
    arrayOfDouble[0] = (this.b + this.k) / 2.0D;
    arrayOfDouble[1] = (this.x + this.z) / 2.0D;
    arrayOfDouble[2] = (this.v + this.i) / 2.0D;
    return arrayOfDouble;
  }
  
  public boolean j(@NotNull Vector paramVector, long paramLong, short paramShort) {
    // Byte code:
    //   0: lload_2
    //   1: bipush #16
    //   3: lshl
    //   4: iload #4
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #48
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/sa.c : J
    //   17: lxor
    //   18: lstore #5
    //   20: aload_1
    //   21: invokevirtual getX : ()D
    //   24: dstore #8
    //   26: invokestatic a : ()I
    //   29: aload_1
    //   30: invokevirtual getY : ()D
    //   33: dstore #10
    //   35: aload_1
    //   36: invokevirtual getZ : ()D
    //   39: dstore #12
    //   41: istore #7
    //   43: dload #8
    //   45: aload_0
    //   46: getfield k : D
    //   49: dcmpl
    //   50: iload #7
    //   52: ifne -> 79
    //   55: iflt -> 238
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   64: athrow
    //   65: dload #8
    //   67: aload_0
    //   68: getfield b : D
    //   71: dcmpg
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   78: athrow
    //   79: iload #7
    //   81: lload_2
    //   82: lconst_0
    //   83: lcmp
    //   84: iflt -> 116
    //   87: ifne -> 114
    //   90: ifgt -> 238
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   99: athrow
    //   100: dload #10
    //   102: aload_0
    //   103: getfield z : D
    //   106: dcmpl
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   113: athrow
    //   114: iload #7
    //   116: lload_2
    //   117: lconst_0
    //   118: lcmp
    //   119: iflt -> 151
    //   122: ifne -> 149
    //   125: iflt -> 238
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   134: athrow
    //   135: dload #10
    //   137: aload_0
    //   138: getfield x : D
    //   141: dcmpg
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   148: athrow
    //   149: iload #7
    //   151: lload_2
    //   152: lconst_0
    //   153: lcmp
    //   154: iflt -> 186
    //   157: ifne -> 184
    //   160: ifgt -> 238
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   169: athrow
    //   170: dload #12
    //   172: aload_0
    //   173: getfield i : D
    //   176: dcmpl
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   183: athrow
    //   184: iload #7
    //   186: lload_2
    //   187: lconst_0
    //   188: lcmp
    //   189: iflt -> 221
    //   192: ifne -> 219
    //   195: iflt -> 238
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   204: athrow
    //   205: dload #12
    //   207: aload_0
    //   208: getfield v : D
    //   211: dcmpg
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   218: athrow
    //   219: iload #7
    //   221: ifne -> 235
    //   224: ifgt -> 238
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   233: athrow
    //   234: iconst_1
    //   235: goto -> 239
    //   238: iconst_0
    //   239: ireturn
    // Exception table:
    //   from	to	target	type
    //   43	58	61	java/lang/IllegalStateException
    //   55	72	75	java/lang/IllegalStateException
    //   79	93	96	java/lang/IllegalStateException
    //   90	107	110	java/lang/IllegalStateException
    //   114	128	131	java/lang/IllegalStateException
    //   125	142	145	java/lang/IllegalStateException
    //   149	163	166	java/lang/IllegalStateException
    //   160	177	180	java/lang/IllegalStateException
    //   184	198	201	java/lang/IllegalStateException
    //   195	212	215	java/lang/IllegalStateException
    //   219	227	230	java/lang/IllegalStateException
  }
  
  @NotNull
  public sa j(char paramChar, long paramLong, double paramDouble1, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_2
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/sa.c : J
    //   16: lxor
    //   17: lstore #10
    //   19: invokestatic a : ()I
    //   22: istore #12
    //   24: dload #4
    //   26: dconst_0
    //   27: dcmpg
    //   28: iload #12
    //   30: ifne -> 65
    //   33: ifge -> 61
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   42: athrow
    //   43: aload_0
    //   44: aload_0
    //   45: getfield k : D
    //   48: dload #4
    //   50: dadd
    //   51: putfield k : D
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   60: athrow
    //   61: dload #4
    //   63: dconst_0
    //   64: dcmpl
    //   65: iload #12
    //   67: iload_1
    //   68: iflt -> 108
    //   71: ifne -> 106
    //   74: ifle -> 102
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   83: athrow
    //   84: aload_0
    //   85: aload_0
    //   86: getfield b : D
    //   89: dload #4
    //   91: dadd
    //   92: putfield b : D
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   101: athrow
    //   102: dload #6
    //   104: dconst_0
    //   105: dcmpg
    //   106: iload #12
    //   108: lload_2
    //   109: lconst_0
    //   110: lcmp
    //   111: iflt -> 151
    //   114: ifne -> 149
    //   117: ifge -> 145
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   126: athrow
    //   127: aload_0
    //   128: aload_0
    //   129: getfield z : D
    //   132: dload #6
    //   134: dadd
    //   135: putfield z : D
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   144: athrow
    //   145: dload #6
    //   147: dconst_0
    //   148: dcmpl
    //   149: iload #12
    //   151: iload_1
    //   152: iflt -> 196
    //   155: ifne -> 190
    //   158: ifle -> 186
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   167: athrow
    //   168: aload_0
    //   169: aload_0
    //   170: getfield x : D
    //   173: dload #6
    //   175: dadd
    //   176: putfield x : D
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   185: athrow
    //   186: dload #8
    //   188: dconst_0
    //   189: dcmpg
    //   190: iload_1
    //   191: iflt -> 231
    //   194: iload #12
    //   196: ifne -> 231
    //   199: ifge -> 227
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   208: athrow
    //   209: aload_0
    //   210: aload_0
    //   211: getfield i : D
    //   214: dload #8
    //   216: dadd
    //   217: putfield i : D
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   226: athrow
    //   227: dload #8
    //   229: dconst_0
    //   230: dcmpl
    //   231: ifle -> 252
    //   234: aload_0
    //   235: aload_0
    //   236: getfield v : D
    //   239: dload #8
    //   241: dadd
    //   242: putfield v : D
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   251: athrow
    //   252: aload_0
    //   253: areturn
    // Exception table:
    //   from	to	target	type
    //   24	36	39	java/lang/IllegalStateException
    //   33	54	57	java/lang/IllegalStateException
    //   65	77	80	java/lang/IllegalStateException
    //   74	95	98	java/lang/IllegalStateException
    //   106	120	123	java/lang/IllegalStateException
    //   117	138	141	java/lang/IllegalStateException
    //   149	161	164	java/lang/IllegalStateException
    //   158	179	182	java/lang/IllegalStateException
    //   190	202	205	java/lang/IllegalStateException
    //   199	220	223	java/lang/IllegalStateException
    //   231	245	248	java/lang/IllegalStateException
  }
  
  @NotNull
  public sa j(double paramDouble) {
    this.z -= paramDouble;
    return this;
  }
  
  public void h(double paramDouble) {
    this.i = paramDouble;
  }
  
  @NotNull
  public List b(World paramWorld) {
    ArrayList<Block> arrayList = new ArrayList();
    arrayList.add((new Location(paramWorld, this.k, this.z, this.i)).getBlock());
    arrayList.add((new Location(paramWorld, this.k, this.x, this.i)).getBlock());
    arrayList.add((new Location(paramWorld, this.b, this.x, this.v)).getBlock());
    arrayList.add((new Location(paramWorld, this.b, this.z, this.v)).getBlock());
    return arrayList;
  }
  
  public void m(double paramDouble) {
    this.k = paramDouble;
  }
  
  public double c() {
    return Math.abs(this.x - this.z);
  }
  
  public double i() {
    return this.k;
  }
  
  public void p(double paramDouble) {
    this.z = paramDouble;
  }
  
  public boolean b(long paramLong, sa... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 79693281093307
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #4
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #32
    //   25: lushr
    //   26: l2i
    //   27: istore #5
    //   29: dup2
    //   30: bipush #48
    //   32: lshl
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #6
    //   39: pop2
    //   40: pop2
    //   41: aload_3
    //   42: astore #8
    //   44: invokestatic r : ()I
    //   47: aload #8
    //   49: arraylength
    //   50: istore #9
    //   52: istore #7
    //   54: iconst_0
    //   55: istore #10
    //   57: iload #10
    //   59: iload #9
    //   61: if_icmpge -> 132
    //   64: aload #8
    //   66: iload #10
    //   68: aaload
    //   69: astore #11
    //   71: iload #7
    //   73: lload_1
    //   74: lconst_0
    //   75: lcmp
    //   76: iflt -> 129
    //   79: ifeq -> 127
    //   82: aload_0
    //   83: iload #4
    //   85: i2c
    //   86: iload #5
    //   88: aload #11
    //   90: iload #6
    //   92: i2c
    //   93: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   96: iload #7
    //   98: ifeq -> 133
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   107: athrow
    //   108: ifeq -> 124
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   117: athrow
    //   118: iconst_1
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   123: athrow
    //   124: iinc #10, 1
    //   127: iload #7
    //   129: ifne -> 57
    //   132: iconst_0
    //   133: ireturn
    // Exception table:
    //   from	to	target	type
    //   71	101	104	java/lang/IllegalStateException
    //   82	111	114	java/lang/IllegalStateException
    //   108	120	120	java/lang/IllegalStateException
  }
  
  public int hashCode() {
    byte b = 59;
    null = 1;
    long l1 = Double.doubleToLongBits(i());
    null = null * 59 + (int)(l1 >>> 32L ^ l1);
    long l2 = Double.doubleToLongBits(b());
    null = null * 59 + (int)(l2 >>> 32L ^ l2);
    long l3 = Double.doubleToLongBits(h());
    null = null * 59 + (int)(l3 >>> 32L ^ l3);
    long l4 = Double.doubleToLongBits(m());
    null = null * 59 + (int)(l4 >>> 32L ^ l4);
    long l5 = Double.doubleToLongBits(t());
    null = null * 59 + (int)(l5 >>> 32L ^ l5);
    long l6 = Double.doubleToLongBits(p());
    return null * 59 + (int)(l6 >>> 32L ^ l6);
  }
  
  public static void main(String[] paramArrayOfString) {
    long l1 = c ^ 0xEC67AE19D98L;
    int i = (int)((l1 ^ 0x4BB991AED7BBL) >>> 48L);
    int j = (int)((l1 ^ 0x4BB991AED7BBL) << 16L >>> 32L);
    int k = (int)((l1 ^ 0x4BB991AED7BBL) << 48L >>> 48L);
    l1 ^ 0x4BB991AED7BBL;
    long l2 = l1 ^ 0x745669F6682FL;
    sa sa1 = new sa(0.0D, -1.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    sa sa2 = new sa(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D);
    System.out.println(sa1.j((char)i, j, sa2, (char)k) + "/" + sa2.b(l2));
  }
  
  public boolean b(@NotNull Vector paramVector, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: aload_1
    //   7: invokevirtual getX : ()D
    //   10: dstore #5
    //   12: invokestatic a : ()I
    //   15: aload_1
    //   16: invokevirtual getY : ()D
    //   19: dstore #7
    //   21: istore #4
    //   23: aload_1
    //   24: invokevirtual getZ : ()D
    //   27: dstore #9
    //   29: dload #5
    //   31: aload_0
    //   32: getfield k : D
    //   35: dcmpl
    //   36: iload #4
    //   38: ifne -> 65
    //   41: iflt -> 224
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   50: athrow
    //   51: dload #5
    //   53: aload_0
    //   54: getfield b : D
    //   57: dcmpg
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   64: athrow
    //   65: iload #4
    //   67: lload_2
    //   68: lconst_0
    //   69: lcmp
    //   70: ifle -> 102
    //   73: ifne -> 100
    //   76: ifgt -> 224
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   85: athrow
    //   86: dload #7
    //   88: aload_0
    //   89: getfield z : D
    //   92: dcmpl
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   99: athrow
    //   100: iload #4
    //   102: lload_2
    //   103: lconst_0
    //   104: lcmp
    //   105: iflt -> 137
    //   108: ifne -> 135
    //   111: iflt -> 224
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   120: athrow
    //   121: dload #7
    //   123: aload_0
    //   124: getfield x : D
    //   127: dcmpg
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   134: athrow
    //   135: iload #4
    //   137: lload_2
    //   138: lconst_0
    //   139: lcmp
    //   140: ifle -> 172
    //   143: ifne -> 170
    //   146: ifgt -> 224
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   155: athrow
    //   156: dload #9
    //   158: aload_0
    //   159: getfield i : D
    //   162: dcmpl
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   169: athrow
    //   170: iload #4
    //   172: lload_2
    //   173: lconst_0
    //   174: lcmp
    //   175: ifle -> 207
    //   178: ifne -> 205
    //   181: iflt -> 224
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   190: athrow
    //   191: dload #9
    //   193: aload_0
    //   194: getfield v : D
    //   197: dcmpg
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   204: athrow
    //   205: iload #4
    //   207: ifne -> 221
    //   210: ifgt -> 224
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   219: athrow
    //   220: iconst_1
    //   221: goto -> 225
    //   224: iconst_0
    //   225: ireturn
    // Exception table:
    //   from	to	target	type
    //   29	44	47	java/lang/IllegalStateException
    //   41	58	61	java/lang/IllegalStateException
    //   65	79	82	java/lang/IllegalStateException
    //   76	93	96	java/lang/IllegalStateException
    //   100	114	117	java/lang/IllegalStateException
    //   111	128	131	java/lang/IllegalStateException
    //   135	149	152	java/lang/IllegalStateException
    //   146	163	166	java/lang/IllegalStateException
    //   170	184	187	java/lang/IllegalStateException
    //   181	198	201	java/lang/IllegalStateException
    //   205	213	216	java/lang/IllegalStateException
  }
  
  public sa(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    double d1 = Math.min(paramDouble1, paramDouble4);
    double d2 = Math.max(paramDouble1, paramDouble4);
    double d3 = Math.min(paramDouble2, paramDouble5);
    double d4 = Math.max(paramDouble2, paramDouble5);
    double d5 = Math.min(paramDouble3, paramDouble6);
    double d6 = Math.max(paramDouble3, paramDouble6);
    this.k = d1;
    this.z = d3;
    this.i = d5;
    this.b = d2;
    this.x = d4;
    this.v = d6;
  }
  
  public void j(@NotNull ca paramca, double paramDouble, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload #4
    //   5: lxor
    //   6: lstore #4
    //   8: getstatic me/rerere/matrix/internal/ua.i : [I
    //   11: aload_1
    //   12: invokevirtual ordinal : ()I
    //   15: iaload
    //   16: tableswitch default -> 66, 1 -> 44, 2 -> 54, 3 -> 60
    //   44: aload_0
    //   45: dload_2
    //   46: putfield k : D
    //   49: return
    //   50: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   53: athrow
    //   54: aload_0
    //   55: dload_2
    //   56: putfield z : D
    //   59: return
    //   60: aload_0
    //   61: dload_2
    //   62: putfield i : D
    //   65: return
    //   66: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   69: sipush #16628
    //   72: ldc2_w 6843827964320193792
    //   75: lload #4
    //   77: lxor
    //   78: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   83: invokevirtual println : (Ljava/lang/String;)V
    //   86: return
    // Exception table:
    //   from	to	target	type
    //   8	50	50	java/lang/IllegalStateException
  }
  
  @Nullable
  public Vector b(@NotNull qa paramqa, float paramFloat1, long paramLong, float paramFloat2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: invokestatic a : ()I
    //   9: istore #6
    //   11: new org/bukkit/util/Vector
    //   14: dup
    //   15: dconst_1
    //   16: aload_1
    //   17: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   20: invokevirtual getX : ()D
    //   23: ddiv
    //   24: dconst_1
    //   25: aload_1
    //   26: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   29: invokevirtual getY : ()D
    //   32: ddiv
    //   33: dconst_1
    //   34: aload_1
    //   35: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   38: invokevirtual getZ : ()D
    //   41: ddiv
    //   42: invokespecial <init> : (DDD)V
    //   45: astore #7
    //   47: aload #7
    //   49: invokevirtual getX : ()D
    //   52: dconst_0
    //   53: dcmpg
    //   54: iload #6
    //   56: ifne -> 70
    //   59: ifge -> 73
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   68: athrow
    //   69: iconst_1
    //   70: goto -> 74
    //   73: iconst_0
    //   74: istore #8
    //   76: aload #7
    //   78: invokevirtual getY : ()D
    //   81: dconst_0
    //   82: dcmpg
    //   83: iload #6
    //   85: ifne -> 99
    //   88: ifge -> 102
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   97: athrow
    //   98: iconst_1
    //   99: goto -> 103
    //   102: iconst_0
    //   103: istore #9
    //   105: aload #7
    //   107: invokevirtual getZ : ()D
    //   110: dconst_0
    //   111: dcmpg
    //   112: iload #6
    //   114: ifne -> 128
    //   117: ifge -> 131
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   126: athrow
    //   127: iconst_1
    //   128: goto -> 132
    //   131: iconst_0
    //   132: istore #10
    //   134: new org/bukkit/util/Vector
    //   137: dup
    //   138: aload_0
    //   139: getfield k : D
    //   142: aload_0
    //   143: getfield z : D
    //   146: aload_0
    //   147: getfield i : D
    //   150: invokespecial <init> : (DDD)V
    //   153: astore #11
    //   155: new org/bukkit/util/Vector
    //   158: dup
    //   159: aload_0
    //   160: getfield b : D
    //   163: aload_0
    //   164: getfield x : D
    //   167: aload_0
    //   168: getfield v : D
    //   171: invokespecial <init> : (DDD)V
    //   174: astore #12
    //   176: iload #8
    //   178: ifeq -> 190
    //   181: aload #12
    //   183: goto -> 192
    //   186: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   189: athrow
    //   190: aload #11
    //   192: astore #13
    //   194: aload #13
    //   196: invokevirtual getX : ()D
    //   199: aload_1
    //   200: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   203: invokevirtual getX : ()D
    //   206: dsub
    //   207: aload #7
    //   209: invokevirtual getX : ()D
    //   212: dmul
    //   213: dstore #14
    //   215: iload #8
    //   217: ifeq -> 229
    //   220: aload #11
    //   222: goto -> 231
    //   225: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   228: athrow
    //   229: aload #12
    //   231: astore #13
    //   233: aload #13
    //   235: invokevirtual getX : ()D
    //   238: aload_1
    //   239: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   242: invokevirtual getX : ()D
    //   245: dsub
    //   246: aload #7
    //   248: invokevirtual getX : ()D
    //   251: dmul
    //   252: dstore #16
    //   254: iload #9
    //   256: ifeq -> 268
    //   259: aload #12
    //   261: goto -> 270
    //   264: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   267: athrow
    //   268: aload #11
    //   270: astore #13
    //   272: aload #13
    //   274: invokevirtual getY : ()D
    //   277: aload_1
    //   278: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   281: invokevirtual getY : ()D
    //   284: dsub
    //   285: aload #7
    //   287: invokevirtual getY : ()D
    //   290: dmul
    //   291: dstore #18
    //   293: iload #9
    //   295: ifeq -> 307
    //   298: aload #11
    //   300: goto -> 309
    //   303: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   306: athrow
    //   307: aload #12
    //   309: astore #13
    //   311: aload #13
    //   313: invokevirtual getY : ()D
    //   316: aload_1
    //   317: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   320: invokevirtual getY : ()D
    //   323: dsub
    //   324: aload #7
    //   326: invokevirtual getY : ()D
    //   329: dmul
    //   330: dstore #20
    //   332: dload #14
    //   334: dload #20
    //   336: dcmpl
    //   337: iload #6
    //   339: lload_3
    //   340: lconst_0
    //   341: lcmp
    //   342: iflt -> 372
    //   345: ifne -> 370
    //   348: ifgt -> 391
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   357: athrow
    //   358: dload #18
    //   360: dload #16
    //   362: dcmpl
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   369: athrow
    //   370: iload #6
    //   372: lload_3
    //   373: lconst_0
    //   374: lcmp
    //   375: ifle -> 404
    //   378: ifne -> 402
    //   381: ifle -> 397
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   390: athrow
    //   391: aconst_null
    //   392: areturn
    //   393: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   396: athrow
    //   397: dload #18
    //   399: dload #14
    //   401: dcmpl
    //   402: iload #6
    //   404: lload_3
    //   405: lconst_0
    //   406: lcmp
    //   407: ifle -> 440
    //   410: ifne -> 432
    //   413: ifle -> 427
    //   416: goto -> 423
    //   419: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   422: athrow
    //   423: dload #18
    //   425: dstore #14
    //   427: dload #20
    //   429: dload #16
    //   431: dcmpg
    //   432: lload_3
    //   433: lconst_0
    //   434: lcmp
    //   435: ifle -> 459
    //   438: iload #6
    //   440: ifne -> 459
    //   443: ifge -> 457
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   452: athrow
    //   453: dload #20
    //   455: dstore #16
    //   457: iload #10
    //   459: ifeq -> 471
    //   462: aload #12
    //   464: goto -> 473
    //   467: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   470: athrow
    //   471: aload #11
    //   473: astore #13
    //   475: aload #13
    //   477: invokevirtual getZ : ()D
    //   480: aload_1
    //   481: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   484: invokevirtual getZ : ()D
    //   487: dsub
    //   488: aload #7
    //   490: invokevirtual getZ : ()D
    //   493: dmul
    //   494: dstore #22
    //   496: iload #10
    //   498: ifeq -> 510
    //   501: aload #11
    //   503: goto -> 512
    //   506: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   509: athrow
    //   510: aload #12
    //   512: astore #13
    //   514: aload #13
    //   516: invokevirtual getZ : ()D
    //   519: aload_1
    //   520: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   523: invokevirtual getZ : ()D
    //   526: dsub
    //   527: aload #7
    //   529: invokevirtual getZ : ()D
    //   532: dmul
    //   533: dstore #24
    //   535: dload #14
    //   537: dload #24
    //   539: dcmpl
    //   540: iload #6
    //   542: lload_3
    //   543: lconst_0
    //   544: lcmp
    //   545: ifle -> 575
    //   548: ifne -> 573
    //   551: ifgt -> 594
    //   554: goto -> 561
    //   557: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   560: athrow
    //   561: dload #22
    //   563: dload #16
    //   565: dcmpl
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   572: athrow
    //   573: iload #6
    //   575: lload_3
    //   576: lconst_0
    //   577: lcmp
    //   578: ifle -> 607
    //   581: ifne -> 605
    //   584: ifle -> 600
    //   587: goto -> 594
    //   590: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   593: athrow
    //   594: aconst_null
    //   595: areturn
    //   596: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   599: athrow
    //   600: dload #22
    //   602: dload #14
    //   604: dcmpl
    //   605: iload #6
    //   607: lload_3
    //   608: lconst_0
    //   609: lcmp
    //   610: ifle -> 637
    //   613: ifne -> 635
    //   616: ifle -> 630
    //   619: goto -> 626
    //   622: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   625: athrow
    //   626: dload #22
    //   628: dstore #14
    //   630: dload #24
    //   632: dload #16
    //   634: dcmpg
    //   635: iload #6
    //   637: lload_3
    //   638: lconst_0
    //   639: lcmp
    //   640: ifle -> 674
    //   643: ifne -> 666
    //   646: ifge -> 660
    //   649: goto -> 656
    //   652: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   655: athrow
    //   656: dload #24
    //   658: dstore #16
    //   660: dload #14
    //   662: fload #5
    //   664: f2d
    //   665: dcmpg
    //   666: lload_3
    //   667: lconst_0
    //   668: lcmp
    //   669: iflt -> 699
    //   672: iload #6
    //   674: ifne -> 699
    //   677: ifge -> 713
    //   680: goto -> 687
    //   683: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   686: athrow
    //   687: dload #16
    //   689: fload_2
    //   690: f2d
    //   691: dcmpl
    //   692: goto -> 699
    //   695: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   698: athrow
    //   699: ifle -> 713
    //   702: aload_1
    //   703: dload #14
    //   705: invokevirtual b : (D)Lorg/bukkit/util/Vector;
    //   708: areturn
    //   709: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   712: athrow
    //   713: aconst_null
    //   714: areturn
    // Exception table:
    //   from	to	target	type
    //   47	62	65	java/lang/IllegalStateException
    //   76	91	94	java/lang/IllegalStateException
    //   105	120	123	java/lang/IllegalStateException
    //   176	186	186	java/lang/IllegalStateException
    //   215	225	225	java/lang/IllegalStateException
    //   254	264	264	java/lang/IllegalStateException
    //   293	303	303	java/lang/IllegalStateException
    //   332	351	354	java/lang/IllegalStateException
    //   348	363	366	java/lang/IllegalStateException
    //   370	384	387	java/lang/IllegalStateException
    //   381	393	393	java/lang/IllegalStateException
    //   402	416	419	java/lang/IllegalStateException
    //   432	446	449	java/lang/IllegalStateException
    //   459	467	467	java/lang/IllegalStateException
    //   496	506	506	java/lang/IllegalStateException
    //   535	554	557	java/lang/IllegalStateException
    //   551	566	569	java/lang/IllegalStateException
    //   573	587	590	java/lang/IllegalStateException
    //   584	596	596	java/lang/IllegalStateException
    //   605	619	622	java/lang/IllegalStateException
    //   635	649	652	java/lang/IllegalStateException
    //   666	680	683	java/lang/IllegalStateException
    //   677	692	695	java/lang/IllegalStateException
    //   699	709	709	java/lang/IllegalStateException
  }
  
  public double t() {
    return this.x;
  }
  
  public sa(@NotNull Vector paramVector, double paramDouble1, double paramDouble2) {
    this.k = paramVector.getX() - paramDouble1;
    this.b = paramVector.getX() + paramDouble1;
    this.i = paramVector.getZ() - paramDouble1;
    this.v = paramVector.getZ() + paramDouble1;
    this.z = paramVector.getY();
    this.x = paramVector.getY() + paramDouble2;
  }
  
  @NotNull
  public Location b(World paramWorld) {
    double[] arrayOfDouble = b();
    return new Location(paramWorld, arrayOfDouble[0], arrayOfDouble[1], arrayOfDouble[2]);
  }
  
  @NotNull
  public sa b(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.k - paramDouble1;
    double d2 = this.z - paramDouble2;
    double d3 = this.i - paramDouble3;
    double d4 = this.b + paramDouble1;
    double d5 = this.x + paramDouble2;
    double d6 = this.v + paramDouble3;
    return new sa(d1, d2, d3, d4, d5, d6);
  }
  
  public double h() {
    return this.i;
  }
  
  public boolean b(@NotNull World paramWorld, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic a : ()I
    //   9: istore #4
    //   11: aload_0
    //   12: getfield k : D
    //   15: invokestatic floor : (D)D
    //   18: d2i
    //   19: istore #5
    //   21: iload #5
    //   23: i2d
    //   24: aload_0
    //   25: getfield b : D
    //   28: invokestatic ceil : (D)D
    //   31: dcmpg
    //   32: ifgt -> 219
    //   35: aload_0
    //   36: getfield z : D
    //   39: invokestatic floor : (D)D
    //   42: d2i
    //   43: iload #4
    //   45: ifne -> 220
    //   48: istore #6
    //   50: iload #6
    //   52: i2d
    //   53: aload_0
    //   54: getfield x : D
    //   57: invokestatic ceil : (D)D
    //   60: dcmpg
    //   61: ifgt -> 205
    //   64: aload_0
    //   65: getfield i : D
    //   68: invokestatic floor : (D)D
    //   71: d2i
    //   72: iload #4
    //   74: ifne -> 32
    //   77: istore #7
    //   79: iload #7
    //   81: i2d
    //   82: aload_0
    //   83: getfield v : D
    //   86: invokestatic ceil : (D)D
    //   89: dcmpg
    //   90: ifgt -> 191
    //   93: aload_1
    //   94: iload #5
    //   96: iload #6
    //   98: iload #7
    //   100: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
    //   105: astore #8
    //   107: aload #8
    //   109: invokeinterface getType : ()Lorg/bukkit/Material;
    //   114: invokestatic r : (Lorg/bukkit/Material;)Z
    //   117: iload #4
    //   119: ifne -> 61
    //   122: iload #4
    //   124: lload_2
    //   125: lconst_0
    //   126: lcmp
    //   127: ifle -> 74
    //   130: lload_2
    //   131: lconst_0
    //   132: lcmp
    //   133: iflt -> 168
    //   136: ifne -> 166
    //   139: ifne -> 155
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   148: athrow
    //   149: iconst_1
    //   150: ireturn
    //   151: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   154: athrow
    //   155: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   158: invokevirtual b : ()Lme/rerere/matrix/internal/yf;
    //   161: aload #8
    //   163: invokevirtual b : (Lorg/bukkit/block/Block;)Z
    //   166: iload #4
    //   168: ifne -> 182
    //   171: ifeq -> 183
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   180: athrow
    //   181: iconst_1
    //   182: ireturn
    //   183: iinc #7, 1
    //   186: iload #4
    //   188: ifeq -> 79
    //   191: iinc #6, 1
    //   194: iload #4
    //   196: lload_2
    //   197: lconst_0
    //   198: lcmp
    //   199: iflt -> 61
    //   202: ifeq -> 50
    //   205: iinc #5, 1
    //   208: iload #4
    //   210: lload_2
    //   211: lconst_0
    //   212: lcmp
    //   213: ifle -> 72
    //   216: ifeq -> 21
    //   219: iconst_0
    //   220: ireturn
    // Exception table:
    //   from	to	target	type
    //   122	142	145	java/lang/IllegalStateException
    //   139	151	151	java/lang/IllegalStateException
    //   166	174	177	java/lang/IllegalStateException
  }
  
  public void j(double paramDouble) {
    this.x = paramDouble;
  }
  
  public void b(long paramLong, @NotNull ca paramca, double paramDouble) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: getstatic me/rerere/matrix/internal/ua.i : [I
    //   9: aload_3
    //   10: invokevirtual ordinal : ()I
    //   13: iaload
    //   14: tableswitch default -> 65, 1 -> 40, 2 -> 51, 3 -> 58
    //   40: aload_0
    //   41: dload #4
    //   43: putfield b : D
    //   46: return
    //   47: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   50: athrow
    //   51: aload_0
    //   52: dload #4
    //   54: putfield x : D
    //   57: return
    //   58: aload_0
    //   59: dload #4
    //   61: putfield v : D
    //   64: return
    //   65: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   68: sipush #11242
    //   71: ldc2_w 6082304475800451199
    //   74: lload_1
    //   75: lxor
    //   76: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   81: invokevirtual println : (Ljava/lang/String;)V
    //   84: return
    // Exception table:
    //   from	to	target	type
    //   6	47	47	java/lang/IllegalStateException
  }
  
  public boolean b(double paramDouble1, double paramDouble2, long paramLong, double paramDouble3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload #5
    //   5: lxor
    //   6: lstore #5
    //   8: invokestatic a : ()I
    //   11: istore #9
    //   13: dload_1
    //   14: aload_0
    //   15: getfield k : D
    //   18: dcmpl
    //   19: iload #9
    //   21: ifne -> 47
    //   24: iflt -> 208
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   33: athrow
    //   34: dload_1
    //   35: aload_0
    //   36: getfield b : D
    //   39: dcmpg
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   46: athrow
    //   47: iload #9
    //   49: lload #5
    //   51: lconst_0
    //   52: lcmp
    //   53: ifle -> 84
    //   56: ifne -> 82
    //   59: ifgt -> 208
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   68: athrow
    //   69: dload_3
    //   70: aload_0
    //   71: getfield z : D
    //   74: dcmpl
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   81: athrow
    //   82: iload #9
    //   84: lload #5
    //   86: lconst_0
    //   87: lcmp
    //   88: iflt -> 119
    //   91: ifne -> 117
    //   94: iflt -> 208
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   103: athrow
    //   104: dload_3
    //   105: aload_0
    //   106: getfield x : D
    //   109: dcmpg
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   116: athrow
    //   117: iload #9
    //   119: lload #5
    //   121: lconst_0
    //   122: lcmp
    //   123: ifle -> 155
    //   126: ifne -> 153
    //   129: ifgt -> 208
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   138: athrow
    //   139: dload #7
    //   141: aload_0
    //   142: getfield i : D
    //   145: dcmpl
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   152: athrow
    //   153: iload #9
    //   155: lload #5
    //   157: lconst_0
    //   158: lcmp
    //   159: ifle -> 191
    //   162: ifne -> 189
    //   165: iflt -> 208
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   174: athrow
    //   175: dload #7
    //   177: aload_0
    //   178: getfield v : D
    //   181: dcmpg
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   188: athrow
    //   189: iload #9
    //   191: ifne -> 205
    //   194: ifgt -> 208
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   203: athrow
    //   204: iconst_1
    //   205: goto -> 209
    //   208: iconst_0
    //   209: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	27	30	java/lang/IllegalStateException
    //   24	40	43	java/lang/IllegalStateException
    //   47	62	65	java/lang/IllegalStateException
    //   59	75	78	java/lang/IllegalStateException
    //   82	97	100	java/lang/IllegalStateException
    //   94	110	113	java/lang/IllegalStateException
    //   117	132	135	java/lang/IllegalStateException
    //   129	146	149	java/lang/IllegalStateException
    //   153	168	171	java/lang/IllegalStateException
    //   165	182	185	java/lang/IllegalStateException
    //   189	197	200	java/lang/IllegalStateException
  }
  
  public double b(@NotNull Location paramLocation) {
    Location location = b(paramLocation.getWorld());
    return paramLocation.distance(location);
  }
  
  public double m() {
    return this.b;
  }
  
  public void b(double paramDouble) {
    this.v = paramDouble;
  }
  
  public double p() {
    return this.v;
  }
  
  public double j() {
    return Math.abs(this.b - this.k);
  }
  
  public double b(@NotNull Vector paramVector) {
    double d1 = Math.min(Math.abs(paramVector.getX() - this.b), Math.abs(paramVector.getX() - this.k));
    double d2 = Math.min(Math.abs(paramVector.getY() - this.x), Math.abs(paramVector.getY() - this.z));
    double d3 = Math.min(Math.abs(paramVector.getZ() - this.v), Math.abs(paramVector.getZ() - this.i));
    return Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
  }
  
  public double b(@NotNull sa paramsa) {
    double d1 = Math.min(paramsa.t(), t());
    double d2 = Math.max(paramsa.b(), b());
    return Math.abs(d1 - d2);
  }
  
  public void b(double paramDouble1, double paramDouble2) {
    double d1 = (this.b - this.k) / 2.0D;
    double d2 = (this.v - this.i) / 2.0D;
    this.b = Math.max(d1 + paramDouble1, d1 - paramDouble1);
    this.k = Math.min(d1 + paramDouble1, d1 - paramDouble1);
    this.v = Math.max(d2 + paramDouble2, d2 - paramDouble2);
    this.i = Math.min(d2 + paramDouble2, d2 - paramDouble2);
  }
  
  public double b() {
    return this.z;
  }
  
  public double j(int paramInt, short paramShort1, @NotNull ca paramca, short paramShort2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/sa.c : J
    //   27: lxor
    //   28: lstore #5
    //   30: getstatic me/rerere/matrix/internal/ua.i : [I
    //   33: aload_3
    //   34: invokevirtual ordinal : ()I
    //   37: iaload
    //   38: tableswitch default -> 83, 1 -> 64, 2 -> 73, 3 -> 78
    //   64: aload_0
    //   65: getfield k : D
    //   68: dreturn
    //   69: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield z : D
    //   77: dreturn
    //   78: aload_0
    //   79: getfield i : D
    //   82: dreturn
    //   83: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   86: sipush #12230
    //   89: ldc2_w 7763026651397795051
    //   92: lload #5
    //   94: lxor
    //   95: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   100: invokevirtual println : (Ljava/lang/String;)V
    //   103: dconst_0
    //   104: dreturn
    // Exception table:
    //   from	to	target	type
    //   30	69	69	java/lang/IllegalStateException
  }
  
  public boolean b(double paramDouble1, long paramLong, double paramDouble2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: invokestatic a : ()I
    //   9: istore #7
    //   11: dload_1
    //   12: aload_0
    //   13: getfield k : D
    //   16: dcmpl
    //   17: iload #7
    //   19: ifne -> 45
    //   22: iflt -> 134
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   31: athrow
    //   32: dload_1
    //   33: aload_0
    //   34: getfield b : D
    //   37: dcmpg
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   44: athrow
    //   45: iload #7
    //   47: lload_3
    //   48: lconst_0
    //   49: lcmp
    //   50: ifle -> 82
    //   53: ifne -> 80
    //   56: ifgt -> 134
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   65: athrow
    //   66: dload #5
    //   68: aload_0
    //   69: getfield i : D
    //   72: dcmpl
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   79: athrow
    //   80: iload #7
    //   82: lload_3
    //   83: lconst_0
    //   84: lcmp
    //   85: ifle -> 117
    //   88: ifne -> 115
    //   91: iflt -> 134
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   100: athrow
    //   101: dload #5
    //   103: aload_0
    //   104: getfield v : D
    //   107: dcmpg
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   114: athrow
    //   115: iload #7
    //   117: ifne -> 131
    //   120: ifgt -> 134
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   129: athrow
    //   130: iconst_1
    //   131: goto -> 135
    //   134: iconst_0
    //   135: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	25	28	java/lang/IllegalStateException
    //   22	38	41	java/lang/IllegalStateException
    //   45	59	62	java/lang/IllegalStateException
    //   56	73	76	java/lang/IllegalStateException
    //   80	94	97	java/lang/IllegalStateException
    //   91	108	111	java/lang/IllegalStateException
    //   115	123	126	java/lang/IllegalStateException
  }
  
  @NotNull
  public sa b(double paramDouble) {
    this.x += paramDouble;
    return this;
  }
  
  public double b(long paramLong, @NotNull ca paramca) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sa.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: getstatic me/rerere/matrix/internal/ua.i : [I
    //   9: aload_3
    //   10: invokevirtual ordinal : ()I
    //   13: iaload
    //   14: tableswitch default -> 59, 1 -> 40, 2 -> 54, 3 -> 49
    //   40: aload_0
    //   41: invokevirtual j : ()D
    //   44: dreturn
    //   45: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   48: athrow
    //   49: aload_0
    //   50: invokevirtual n : ()D
    //   53: dreturn
    //   54: aload_0
    //   55: invokevirtual c : ()D
    //   58: dreturn
    //   59: new java/lang/IllegalStateException
    //   62: dup
    //   63: new java/lang/StringBuilder
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: sipush #28887
    //   73: ldc2_w 2236947805055849568
    //   76: lload_1
    //   77: lxor
    //   78: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_3
    //   87: invokevirtual name : ()Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: athrow
    // Exception table:
    //   from	to	target	type
    //   6	45	45	java/lang/IllegalStateException
  }
  
  public void b(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.k += paramDouble1;
    this.z += paramDouble2;
    this.i += paramDouble3;
    this.b += paramDouble1;
    this.x += paramDouble2;
    this.v += paramDouble3;
  }
  
  public static void u(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] q() {
    return a;
  }
  
  static {
    u(new yk[5]);
    long l = c ^ 0x70C5AFF26953L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "\007ç\007À\fÍS:$÷\027X\006L]¨Ð¶ð\021¬!ß\0359Ýøª'~ý®ÔïrWwInÕó¿\füô|$ÏA\026[ªÜ´W=pNÿË:Ê\024¸öêJ\t\003C@6ã*¤¬Ç[ÍµÔ58¢\032e;Ô\030}Qm:Åó¢H1ÂÐâ¥_\tL«$¸úg\006¸\020Wþ©L¥é§Srÿ\020§¬#Ëuº.aç\007G^$êÖ\020è\020YÓ~4\nókMXkçGxFYþÇS,«½U[ÕË\006!©L\016`Ê\021KÅ\025\030Üq\037J¼\013ZU¿®\000ºßsSbéÆ%{è>R\"q{Cò\023Åy\005BÅ\027¸ôÈÄËk±Õ»é4\032APX-\032iñâý\022Xj\036\bP\017½L*.qý~5ý\007Ìø@ÕeËËZÒ|Ìÿ­xv'ûyQ©N¡Ä2\036¢OX\005é­Àj¸Y¥\001rd\t¿K=\031l\003.JØÙ¿«¼Ô\020dÿ·ç8/R×\016Rb¡ø").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x473E;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/sa", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/sa'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */