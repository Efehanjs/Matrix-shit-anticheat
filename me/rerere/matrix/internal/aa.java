package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Material;
import org.bukkit.util.Vector;

public class aa {
  private final boolean r;
  
  @NotNull
  private final Vector x;
  
  private final boolean z;
  
  private final boolean k;
  
  @NotNull
  private final Set v;
  
  @NotNull
  private final Set b;
  
  @NotNull
  private final Vector i;
  
  private static int[] a;
  
  private static final long c = o3.a(-3889719056043316347L, 4151994978999924483L, MethodHandles.lookup().lookupClass()).a(143319337096850L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public boolean j(long paramLong, Material... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_3
    //   7: astore #5
    //   9: invokestatic r : ()I
    //   12: aload #5
    //   14: arraylength
    //   15: istore #6
    //   17: istore #4
    //   19: iconst_0
    //   20: istore #7
    //   22: iload #7
    //   24: iload #6
    //   26: if_icmpge -> 94
    //   29: aload #5
    //   31: iload #7
    //   33: aaload
    //   34: astore #8
    //   36: iload #4
    //   38: lload_1
    //   39: lconst_0
    //   40: lcmp
    //   41: ifle -> 91
    //   44: ifeq -> 89
    //   47: aload_0
    //   48: getfield v : Ljava/util/Set;
    //   51: aload #8
    //   53: invokeinterface contains : (Ljava/lang/Object;)Z
    //   58: iload #4
    //   60: ifeq -> 95
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   69: athrow
    //   70: ifeq -> 86
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   79: athrow
    //   80: iconst_1
    //   81: ireturn
    //   82: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   85: athrow
    //   86: iinc #7, 1
    //   89: iload #4
    //   91: ifne -> 22
    //   94: iconst_0
    //   95: ireturn
    // Exception table:
    //   from	to	target	type
    //   36	63	66	java/lang/NullPointerException
    //   47	73	76	java/lang/NullPointerException
    //   70	82	82	java/lang/NullPointerException
  }
  
  public boolean b(long paramLong, Material... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_3
    //   7: astore #5
    //   9: invokestatic r : ()I
    //   12: aload #5
    //   14: arraylength
    //   15: istore #6
    //   17: iconst_0
    //   18: istore #7
    //   20: istore #4
    //   22: iload #7
    //   24: iload #6
    //   26: if_icmpge -> 94
    //   29: aload #5
    //   31: iload #7
    //   33: aaload
    //   34: astore #8
    //   36: iload #4
    //   38: lload_1
    //   39: lconst_0
    //   40: lcmp
    //   41: ifle -> 91
    //   44: ifeq -> 89
    //   47: aload_0
    //   48: getfield b : Ljava/util/Set;
    //   51: aload #8
    //   53: invokeinterface contains : (Ljava/lang/Object;)Z
    //   58: iload #4
    //   60: ifeq -> 95
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   69: athrow
    //   70: ifeq -> 86
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   79: athrow
    //   80: iconst_1
    //   81: ireturn
    //   82: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   85: athrow
    //   86: iinc #7, 1
    //   89: iload #4
    //   91: ifne -> 22
    //   94: iconst_0
    //   95: ireturn
    // Exception table:
    //   from	to	target	type
    //   36	63	66	java/lang/NullPointerException
    //   47	73	76	java/lang/NullPointerException
    //   70	82	82	java/lang/NullPointerException
  }
  
  public boolean p() {
    return this.k;
  }
  
  public boolean j() {
    return this.z;
  }
  
  public boolean j(Set paramSet, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic r : ()I
    //   9: istore #4
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #5
    //   19: aload #5
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 92
    //   29: aload #5
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast org/bukkit/Material
    //   39: astore #6
    //   41: aload_0
    //   42: getfield v : Ljava/util/Set;
    //   45: aload #6
    //   47: invokeinterface contains : (Ljava/lang/Object;)Z
    //   52: iload #4
    //   54: lload_2
    //   55: lconst_0
    //   56: lcmp
    //   57: ifle -> 65
    //   60: ifeq -> 93
    //   63: iload #4
    //   65: ifeq -> 86
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   74: athrow
    //   75: ifeq -> 87
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   84: athrow
    //   85: iconst_1
    //   86: ireturn
    //   87: iload #4
    //   89: ifne -> 19
    //   92: iconst_0
    //   93: ireturn
    // Exception table:
    //   from	to	target	type
    //   41	68	71	java/lang/NullPointerException
    //   63	78	81	java/lang/NullPointerException
  }
  
  public boolean b(Set paramSet, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic a : ()I
    //   9: istore #4
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #5
    //   19: aload #5
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 92
    //   29: aload #5
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast org/bukkit/Material
    //   39: astore #6
    //   41: aload_0
    //   42: getfield b : Ljava/util/Set;
    //   45: aload #6
    //   47: invokeinterface contains : (Ljava/lang/Object;)Z
    //   52: iload #4
    //   54: lload_2
    //   55: lconst_0
    //   56: lcmp
    //   57: ifle -> 65
    //   60: ifne -> 93
    //   63: iload #4
    //   65: ifne -> 86
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   74: athrow
    //   75: ifeq -> 87
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   84: athrow
    //   85: iconst_1
    //   86: ireturn
    //   87: iload #4
    //   89: ifeq -> 19
    //   92: iconst_0
    //   93: ireturn
    // Exception table:
    //   from	to	target	type
    //   41	68	71	java/lang/NullPointerException
    //   63	78	81	java/lang/NullPointerException
  }
  
  @NotNull
  public Set j() {
    return this.v;
  }
  
  public boolean b() {
    return this.r;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: ldc2_w 11716310316030
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #23665
    //   18: ldc2_w 4996769733048117923
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield z : Z
    //   35: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   38: sipush #11740
    //   41: ldc2_w 7356676341105613583
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield v : Ljava/util/Set;
    //   58: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   63: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   68: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   73: ldc ','
    //   75: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   78: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   83: checkcast java/lang/String
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: sipush #13117
    //   92: ldc2_w 5097526567019726312
    //   95: lload_1
    //   96: lxor
    //   97: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload_0
    //   106: getfield b : Ljava/util/Set;
    //   109: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   114: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   119: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   124: ldc ','
    //   126: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   129: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   134: checkcast java/lang/String
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokevirtual toString : ()Ljava/lang/String;
    //   143: areturn
  }
  
  @NotNull
  public Set b() {
    return this.b;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof aa;
  }
  
  @NotNull
  public Vector j() {
    return this.i;
  }
  
  @NotNull
  public Vector b() {
    return this.x;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: ldc2_w 107958441426062
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifeq -> 62
    //   42: instanceof me/rerere/matrix/internal/aa
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/aa
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifeq -> 98
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual j : ()Z
    //   98: aload #5
    //   100: invokevirtual j : ()Z
    //   103: iload #4
    //   105: ifeq -> 133
    //   108: if_icmpeq -> 124
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   117: athrow
    //   118: iconst_0
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   123: athrow
    //   124: aload_0
    //   125: invokevirtual p : ()Z
    //   128: aload #5
    //   130: invokevirtual p : ()Z
    //   133: iload #4
    //   135: ifeq -> 175
    //   138: if_icmpeq -> 154
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   147: athrow
    //   148: iconst_0
    //   149: ireturn
    //   150: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   153: athrow
    //   154: aload_0
    //   155: iload #4
    //   157: ifeq -> 185
    //   160: invokevirtual b : ()Z
    //   163: aload #5
    //   165: invokevirtual b : ()Z
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   174: athrow
    //   175: if_icmpeq -> 184
    //   178: iconst_0
    //   179: ireturn
    //   180: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   183: athrow
    //   184: aload_0
    //   185: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   188: astore #6
    //   190: aload #5
    //   192: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   195: astore #7
    //   197: aload #6
    //   199: iload #4
    //   201: ifeq -> 243
    //   204: ifnonnull -> 241
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   213: athrow
    //   214: aload #7
    //   216: iload #4
    //   218: ifeq -> 273
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   227: athrow
    //   228: ifnull -> 269
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   237: athrow
    //   238: goto -> 263
    //   241: aload #6
    //   243: iload #4
    //   245: ifeq -> 273
    //   248: aload #7
    //   250: invokevirtual equals : (Ljava/lang/Object;)Z
    //   253: ifne -> 269
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   262: athrow
    //   263: iconst_0
    //   264: ireturn
    //   265: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   268: athrow
    //   269: aload_0
    //   270: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   273: astore #8
    //   275: aload #5
    //   277: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   280: astore #9
    //   282: aload #8
    //   284: iload #4
    //   286: ifeq -> 320
    //   289: ifnonnull -> 318
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   298: athrow
    //   299: aload #9
    //   301: ifnull -> 342
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   310: athrow
    //   311: goto -> 340
    //   314: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   317: athrow
    //   318: aload #8
    //   320: aload #9
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: iload #4
    //   327: ifeq -> 341
    //   330: ifne -> 342
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   339: athrow
    //   340: iconst_0
    //   341: ireturn
    //   342: aload_0
    //   343: invokevirtual j : ()Ljava/util/Set;
    //   346: astore #10
    //   348: aload #5
    //   350: invokevirtual j : ()Ljava/util/Set;
    //   353: astore #11
    //   355: aload #10
    //   357: iload #4
    //   359: ifeq -> 401
    //   362: ifnonnull -> 399
    //   365: goto -> 372
    //   368: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   371: athrow
    //   372: aload #11
    //   374: iload #4
    //   376: ifeq -> 431
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   385: athrow
    //   386: ifnull -> 427
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   395: athrow
    //   396: goto -> 421
    //   399: aload #10
    //   401: iload #4
    //   403: ifeq -> 431
    //   406: aload #11
    //   408: invokevirtual equals : (Ljava/lang/Object;)Z
    //   411: ifne -> 427
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   420: athrow
    //   421: iconst_0
    //   422: ireturn
    //   423: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   426: athrow
    //   427: aload_0
    //   428: invokevirtual b : ()Ljava/util/Set;
    //   431: astore #12
    //   433: aload #5
    //   435: invokevirtual b : ()Ljava/util/Set;
    //   438: astore #13
    //   440: aload #12
    //   442: iload #4
    //   444: ifeq -> 478
    //   447: ifnonnull -> 476
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   456: athrow
    //   457: aload #13
    //   459: ifnull -> 504
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   468: athrow
    //   469: goto -> 498
    //   472: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   475: athrow
    //   476: aload #12
    //   478: aload #13
    //   480: invokevirtual equals : (Ljava/lang/Object;)Z
    //   483: iload #4
    //   485: ifeq -> 505
    //   488: ifne -> 504
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   497: athrow
    //   498: iconst_0
    //   499: ireturn
    //   500: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   503: athrow
    //   504: iconst_1
    //   505: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/NullPointerException
    //   19	32	32	java/lang/NullPointerException
    //   37	48	51	java/lang/NullPointerException
    //   42	57	57	java/lang/NullPointerException
    //   67	81	84	java/lang/NullPointerException
    //   78	90	90	java/lang/NullPointerException
    //   98	111	114	java/lang/NullPointerException
    //   108	120	120	java/lang/NullPointerException
    //   133	141	144	java/lang/NullPointerException
    //   138	150	150	java/lang/NullPointerException
    //   154	168	171	java/lang/NullPointerException
    //   175	180	180	java/lang/NullPointerException
    //   197	207	210	java/lang/NullPointerException
    //   204	221	224	java/lang/NullPointerException
    //   214	231	234	java/lang/NullPointerException
    //   243	256	259	java/lang/NullPointerException
    //   248	265	265	java/lang/NullPointerException
    //   282	292	295	java/lang/NullPointerException
    //   289	304	307	java/lang/NullPointerException
    //   299	314	314	java/lang/NullPointerException
    //   320	333	336	java/lang/NullPointerException
    //   355	365	368	java/lang/NullPointerException
    //   362	379	382	java/lang/NullPointerException
    //   372	389	392	java/lang/NullPointerException
    //   401	414	417	java/lang/NullPointerException
    //   406	423	423	java/lang/NullPointerException
    //   440	450	453	java/lang/NullPointerException
    //   447	462	465	java/lang/NullPointerException
    //   457	472	472	java/lang/NullPointerException
    //   478	491	494	java/lang/NullPointerException
    //   488	500	500	java/lang/NullPointerException
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: ldc2_w 78343944843021
    //   6: lxor
    //   7: lstore_1
    //   8: bipush #59
    //   10: istore #4
    //   12: invokestatic a : ()I
    //   15: iconst_1
    //   16: istore #5
    //   18: istore_3
    //   19: iload #5
    //   21: bipush #59
    //   23: imul
    //   24: aload_0
    //   25: invokevirtual j : ()Z
    //   28: iload_3
    //   29: ifne -> 44
    //   32: ifeq -> 47
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   41: athrow
    //   42: bipush #79
    //   44: goto -> 49
    //   47: bipush #97
    //   49: iadd
    //   50: istore #5
    //   52: iload #5
    //   54: bipush #59
    //   56: imul
    //   57: aload_0
    //   58: invokevirtual p : ()Z
    //   61: iload_3
    //   62: ifne -> 77
    //   65: ifeq -> 80
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   74: athrow
    //   75: bipush #79
    //   77: goto -> 82
    //   80: bipush #97
    //   82: iadd
    //   83: istore #5
    //   85: iload #5
    //   87: bipush #59
    //   89: imul
    //   90: aload_0
    //   91: invokevirtual b : ()Z
    //   94: iload_3
    //   95: ifne -> 110
    //   98: ifeq -> 113
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   107: athrow
    //   108: bipush #79
    //   110: goto -> 115
    //   113: bipush #97
    //   115: iadd
    //   116: istore #5
    //   118: aload_0
    //   119: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   122: astore #6
    //   124: iload #5
    //   126: bipush #59
    //   128: imul
    //   129: aload #6
    //   131: iload_3
    //   132: ifne -> 156
    //   135: ifnonnull -> 154
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   144: athrow
    //   145: bipush #43
    //   147: goto -> 159
    //   150: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   153: athrow
    //   154: aload #6
    //   156: invokevirtual hashCode : ()I
    //   159: iadd
    //   160: istore #5
    //   162: aload_0
    //   163: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   166: astore #7
    //   168: iload #5
    //   170: bipush #59
    //   172: imul
    //   173: aload #7
    //   175: iload_3
    //   176: ifne -> 200
    //   179: ifnonnull -> 198
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   188: athrow
    //   189: bipush #43
    //   191: goto -> 203
    //   194: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   197: athrow
    //   198: aload #7
    //   200: invokevirtual hashCode : ()I
    //   203: iadd
    //   204: istore #5
    //   206: aload_0
    //   207: invokevirtual j : ()Ljava/util/Set;
    //   210: astore #8
    //   212: iload #5
    //   214: bipush #59
    //   216: imul
    //   217: aload #8
    //   219: iload_3
    //   220: ifne -> 244
    //   223: ifnonnull -> 242
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   232: athrow
    //   233: bipush #43
    //   235: goto -> 247
    //   238: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   241: athrow
    //   242: aload #8
    //   244: invokevirtual hashCode : ()I
    //   247: iadd
    //   248: istore #5
    //   250: aload_0
    //   251: invokevirtual b : ()Ljava/util/Set;
    //   254: astore #9
    //   256: iload #5
    //   258: bipush #59
    //   260: imul
    //   261: aload #9
    //   263: iload_3
    //   264: ifne -> 288
    //   267: ifnonnull -> 286
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   276: athrow
    //   277: bipush #43
    //   279: goto -> 291
    //   282: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   285: athrow
    //   286: aload #9
    //   288: invokevirtual hashCode : ()I
    //   291: iadd
    //   292: istore #5
    //   294: iload #5
    //   296: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	35	38	java/lang/NullPointerException
    //   52	68	71	java/lang/NullPointerException
    //   85	101	104	java/lang/NullPointerException
    //   124	138	141	java/lang/NullPointerException
    //   135	150	150	java/lang/NullPointerException
    //   168	182	185	java/lang/NullPointerException
    //   179	194	194	java/lang/NullPointerException
    //   212	226	229	java/lang/NullPointerException
    //   223	238	238	java/lang/NullPointerException
    //   256	270	273	java/lang/NullPointerException
    //   267	282	282	java/lang/NullPointerException
  }
  
  public aa(@NotNull Vector paramVector1, long paramLong, @NotNull Vector paramVector2, @NotNull Set paramSet1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, @NotNull Set paramSet2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/aa.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic r : ()I
    //   9: istore #10
    //   11: aload_0
    //   12: invokespecial <init> : ()V
    //   15: aload_1
    //   16: iload #10
    //   18: ifeq -> 51
    //   21: ifnonnull -> 49
    //   24: new java/lang/NullPointerException
    //   27: dup
    //   28: sipush #13539
    //   31: ldc2_w 1944358006505161168
    //   34: lload_2
    //   35: lxor
    //   36: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   41: invokespecial <init> : (Ljava/lang/String;)V
    //   44: athrow
    //   45: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   48: athrow
    //   49: aload #4
    //   51: ifnonnull -> 79
    //   54: new java/lang/NullPointerException
    //   57: dup
    //   58: sipush #7051
    //   61: ldc2_w 673868441258389179
    //   64: lload_2
    //   65: lxor
    //   66: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: athrow
    //   75: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   78: athrow
    //   79: aload #5
    //   81: lload_2
    //   82: lconst_0
    //   83: lcmp
    //   84: ifle -> 129
    //   87: iload #10
    //   89: ifeq -> 129
    //   92: ifnonnull -> 127
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   101: athrow
    //   102: new java/lang/NullPointerException
    //   105: dup
    //   106: sipush #8727
    //   109: ldc2_w 1820857227470853923
    //   112: lload_2
    //   113: lxor
    //   114: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   126: athrow
    //   127: aload #9
    //   129: ifnonnull -> 157
    //   132: new java/lang/NullPointerException
    //   135: dup
    //   136: sipush #808
    //   139: ldc2_w 1548580910495954461
    //   142: lload_2
    //   143: lxor
    //   144: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   156: athrow
    //   157: aload_0
    //   158: aload_1
    //   159: putfield i : Lorg/bukkit/util/Vector;
    //   162: aload_0
    //   163: aload #4
    //   165: putfield x : Lorg/bukkit/util/Vector;
    //   168: aload_0
    //   169: aload #5
    //   171: putfield v : Ljava/util/Set;
    //   174: aload_0
    //   175: iload #6
    //   177: putfield z : Z
    //   180: aload_0
    //   181: iload #7
    //   183: putfield k : Z
    //   186: aload_0
    //   187: iload #8
    //   189: putfield r : Z
    //   192: aload_0
    //   193: aload #9
    //   195: putfield b : Ljava/util/Set;
    //   198: return
    // Exception table:
    //   from	to	target	type
    //   21	45	45	java/lang/NullPointerException
    //   51	75	75	java/lang/NullPointerException
    //   79	95	98	java/lang/NullPointerException
    //   92	123	123	java/lang/NullPointerException
    //   129	153	153	java/lang/NullPointerException
  }
  
  public static void o(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] Y() {
    return a;
  }
  
  static {
    long l = c ^ 0x6679A1D584E1L;
    o(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "Q\024\005rÂ©\037éå\tSÕ£ ÷®\001¢Qö3Ã6ÁF\"\001æ0²\005nöxæ!µ*óR\003ÑÁþêãñª8!(ga5\021Í!F/\013\0278p}YAéÓ\003Ñ°ËH\026\002G@EÎß->ÇZýÈt{xQ!P¡Bæ¿&Ô¬Ì';\035lJX_\003Îl¨Î\005\003»úD\035\f\037Ì²Gq\035C\033ÝÕGSé´\026A\030\003lßµ)wÊ«Åw> qàF\t\024Á£·Ø Ýu«ã<\027\032á*­çß>ËáëÝ>MgäT8ÉÝ\020ëêFÉK§\034Ýo¬ùÛ;ù ").length();
    byte b2 = 88;
    byte b = -1;
    while (true);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x896;
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
        throw new RuntimeException("me/rerere/matrix/internal/aa", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/aa'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */