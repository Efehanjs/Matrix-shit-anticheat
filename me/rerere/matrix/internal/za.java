package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.util.NumberConversions;
import org.bukkit.util.Vector;

public class za {
  private static final Vector[] b;
  
  private static final double i = 0.45D;
  
  private static int a;
  
  private static final long c = o3.a(8148006220869829086L, 9115682482652734401L, MethodHandles.lookup().lookupClass()).a(35396302752399L);
  
  public static boolean j(long paramLong, @NotNull Location paramLocation, double paramDouble) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/za.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 21420466839175
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #5
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #32
    //   25: lushr
    //   26: l2i
    //   27: istore #6
    //   29: dup2
    //   30: bipush #48
    //   32: lshl
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #7
    //   39: pop2
    //   40: dup2
    //   41: ldc2_w 32069398195876
    //   44: lxor
    //   45: lstore #8
    //   47: pop2
    //   48: aload_2
    //   49: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   52: astore #11
    //   54: invokestatic r : ()I
    //   57: aload #11
    //   59: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: new me/rerere/matrix/internal/sa
    //   66: dup
    //   67: aload_2
    //   68: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   71: dload_3
    //   72: ldc2_w 1.5
    //   75: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   78: astore #12
    //   80: new me/rerere/matrix/internal/sa
    //   83: dup
    //   84: aload_2
    //   85: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   88: new org/bukkit/util/Vector
    //   91: dup
    //   92: iconst_0
    //   93: iconst_m1
    //   94: iconst_0
    //   95: invokespecial <init> : (III)V
    //   98: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   101: dload_3
    //   102: ldc2_w 2.799999952316284
    //   105: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   108: astore #13
    //   110: istore #10
    //   112: iconst_0
    //   113: istore #14
    //   115: aload #13
    //   117: invokevirtual i : ()D
    //   120: d2i
    //   121: iconst_1
    //   122: isub
    //   123: istore #15
    //   125: iload #15
    //   127: i2d
    //   128: aload #13
    //   130: invokevirtual m : ()D
    //   133: dconst_1
    //   134: dadd
    //   135: dcmpg
    //   136: ifgt -> 520
    //   139: aload #13
    //   141: invokevirtual b : ()D
    //   144: d2i
    //   145: iconst_1
    //   146: isub
    //   147: iload #10
    //   149: lload_0
    //   150: lconst_0
    //   151: lcmp
    //   152: iflt -> 530
    //   155: ifeq -> 528
    //   158: istore #16
    //   160: iload #16
    //   162: i2d
    //   163: aload #13
    //   165: invokevirtual t : ()D
    //   168: dconst_1
    //   169: dadd
    //   170: dcmpg
    //   171: ifgt -> 506
    //   174: aload #13
    //   176: invokevirtual h : ()D
    //   179: d2i
    //   180: iconst_1
    //   181: isub
    //   182: iload #10
    //   184: ifeq -> 136
    //   187: istore #17
    //   189: iload #17
    //   191: i2d
    //   192: aload #13
    //   194: invokevirtual p : ()D
    //   197: dconst_1
    //   198: dadd
    //   199: dcmpg
    //   200: ifgt -> 492
    //   203: aload #11
    //   205: iload #15
    //   207: iload #16
    //   209: iload #17
    //   211: invokestatic b : (Lorg/bukkit/World;III)Lorg/bukkit/block/Block;
    //   214: astore #18
    //   216: aload #18
    //   218: iload #10
    //   220: ifeq -> 252
    //   223: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   226: iload #10
    //   228: ifeq -> 171
    //   231: lload_0
    //   232: lconst_0
    //   233: lcmp
    //   234: iflt -> 182
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   243: athrow
    //   244: ifeq -> 250
    //   247: goto -> 484
    //   250: aload #18
    //   252: lload #8
    //   254: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   257: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   260: astore #19
    //   262: aload #19
    //   264: arraylength
    //   265: istore #20
    //   267: iconst_0
    //   268: istore #21
    //   270: iload #21
    //   272: iload #20
    //   274: if_icmpge -> 484
    //   277: aload #19
    //   279: iload #21
    //   281: aaload
    //   282: astore #22
    //   284: aload #22
    //   286: iload #5
    //   288: i2c
    //   289: iload #6
    //   291: aload #12
    //   293: iload #7
    //   295: i2c
    //   296: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   299: iload #10
    //   301: ifeq -> 200
    //   304: iload #10
    //   306: lload_0
    //   307: lconst_0
    //   308: lcmp
    //   309: iflt -> 274
    //   312: lload_0
    //   313: lconst_0
    //   314: lcmp
    //   315: iflt -> 354
    //   318: ifeq -> 352
    //   321: ifeq -> 337
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: lload_0
    //   332: lconst_0
    //   333: lcmp
    //   334: ifge -> 463
    //   337: aload #22
    //   339: iload #5
    //   341: i2c
    //   342: iload #6
    //   344: aload #13
    //   346: iload #7
    //   348: i2c
    //   349: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   352: iload #10
    //   354: lload_0
    //   355: lconst_0
    //   356: lcmp
    //   357: iflt -> 398
    //   360: ifeq -> 390
    //   363: ifne -> 379
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: lload_0
    //   374: lconst_0
    //   375: lcmp
    //   376: ifge -> 463
    //   379: aload #22
    //   381: invokevirtual t : ()D
    //   384: aload #12
    //   386: invokevirtual b : ()D
    //   389: dcmpg
    //   390: lload_0
    //   391: lconst_0
    //   392: lcmp
    //   393: ifle -> 433
    //   396: iload #10
    //   398: ifeq -> 433
    //   401: ifgt -> 463
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   410: athrow
    //   411: aload #22
    //   413: invokevirtual t : ()D
    //   416: aload #12
    //   418: invokevirtual b : ()D
    //   421: ldc2_w 0.001
    //   424: dsub
    //   425: dcmpl
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   432: athrow
    //   433: lload_0
    //   434: lconst_0
    //   435: lcmp
    //   436: ifle -> 468
    //   439: iflt -> 463
    //   442: iinc #14, 1
    //   445: iload #10
    //   447: lload_0
    //   448: lconst_0
    //   449: lcmp
    //   450: iflt -> 489
    //   453: ifne -> 484
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   462: athrow
    //   463: iinc #21, 1
    //   466: iload #10
    //   468: ifne -> 270
    //   471: lload_0
    //   472: lconst_0
    //   473: lcmp
    //   474: iflt -> 284
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   483: athrow
    //   484: iinc #17, 1
    //   487: iload #10
    //   489: ifne -> 189
    //   492: iinc #16, 1
    //   495: iload #10
    //   497: lload_0
    //   498: lconst_0
    //   499: lcmp
    //   500: ifle -> 171
    //   503: ifne -> 160
    //   506: iinc #15, 1
    //   509: iload #10
    //   511: lload_0
    //   512: lconst_0
    //   513: lcmp
    //   514: ifle -> 182
    //   517: ifne -> 125
    //   520: lload_0
    //   521: lconst_0
    //   522: lcmp
    //   523: iflt -> 547
    //   526: iload #14
    //   528: iload #10
    //   530: ifeq -> 544
    //   533: ifle -> 547
    //   536: goto -> 543
    //   539: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   542: athrow
    //   543: iconst_1
    //   544: goto -> 548
    //   547: iconst_0
    //   548: ireturn
    // Exception table:
    //   from	to	target	type
    //   216	231	240	java/lang/RuntimeException
    //   304	324	327	java/lang/RuntimeException
    //   352	366	369	java/lang/RuntimeException
    //   390	404	407	java/lang/RuntimeException
    //   401	426	429	java/lang/RuntimeException
    //   433	456	459	java/lang/RuntimeException
    //   442	471	480	java/lang/RuntimeException
    //   528	536	539	java/lang/RuntimeException
  }
  
  @NotNull
  public static Block b(@NotNull Location paramLocation, @NotNull Vector paramVector) {
    return paramLocation.getWorld().getBlockAt(b(paramLocation.getX() + paramVector.getX()), b(paramLocation.getY() + paramVector.getY()), b(paramLocation.getZ() + paramVector.getZ()));
  }
  
  static {
    b = new Vector[] { new Vector(0, 0, 0), new Vector(0.45D, 0.0D, 0.45D), new Vector(0.45D, 0.0D, -0.45D), new Vector(-0.45D, 0.0D, 0.45D), new Vector(-0.45D, 0.0D, -0.45D), new Vector(0.45D, 0.0D, 0.0D), new Vector(0.0D, 0.0D, 0.45D), new Vector(-0.45D, 0.0D, 0.0D), new Vector(0.0D, 0.0D, -0.45D) };
    f(29);
  }
  
  public static boolean p(@NotNull Location paramLocation, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/za.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 87306796107131
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore_3
    //   18: dup2
    //   19: bipush #16
    //   21: lshl
    //   22: bipush #32
    //   24: lushr
    //   25: l2i
    //   26: istore #4
    //   28: dup2
    //   29: bipush #48
    //   31: lshl
    //   32: bipush #48
    //   34: lushr
    //   35: l2i
    //   36: istore #5
    //   38: pop2
    //   39: dup2
    //   40: ldc2_w 71701674521944
    //   43: lxor
    //   44: lstore #6
    //   46: dup2
    //   47: ldc2_w 62996412292095
    //   50: lxor
    //   51: lstore #8
    //   53: pop2
    //   54: aload_0
    //   55: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   58: astore #11
    //   60: aload #11
    //   62: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   65: pop
    //   66: invokestatic r : ()I
    //   69: new me/rerere/matrix/internal/sa
    //   72: dup
    //   73: aload_0
    //   74: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   77: ldc2_w 0.30000001192092896
    //   80: ldc2_w 1.5
    //   83: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   86: astore #12
    //   88: new me/rerere/matrix/internal/sa
    //   91: dup
    //   92: aload_0
    //   93: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   96: new org/bukkit/util/Vector
    //   99: dup
    //   100: iconst_0
    //   101: iconst_m1
    //   102: iconst_0
    //   103: invokespecial <init> : (III)V
    //   106: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   109: ldc2_w 0.30000001192092896
    //   112: ldc2_w 2.799999952316284
    //   115: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   118: astore #13
    //   120: istore #10
    //   122: aload #13
    //   124: invokevirtual i : ()D
    //   127: d2i
    //   128: iconst_1
    //   129: isub
    //   130: istore #14
    //   132: iload #14
    //   134: aload #13
    //   136: invokevirtual m : ()D
    //   139: d2i
    //   140: iconst_1
    //   141: iadd
    //   142: if_icmpgt -> 746
    //   145: aload #13
    //   147: invokevirtual b : ()D
    //   150: d2i
    //   151: iconst_1
    //   152: isub
    //   153: iload #10
    //   155: ifeq -> 747
    //   158: istore #15
    //   160: iload #15
    //   162: aload #13
    //   164: invokevirtual t : ()D
    //   167: d2i
    //   168: iconst_1
    //   169: iadd
    //   170: if_icmpgt -> 732
    //   173: aload #13
    //   175: invokevirtual h : ()D
    //   178: d2i
    //   179: iconst_1
    //   180: isub
    //   181: iload #10
    //   183: ifeq -> 134
    //   186: istore #16
    //   188: iload #16
    //   190: aload #13
    //   192: invokevirtual p : ()D
    //   195: d2i
    //   196: iconst_1
    //   197: iadd
    //   198: if_icmpgt -> 718
    //   201: aload #11
    //   203: iload #14
    //   205: iload #15
    //   207: iload #16
    //   209: invokestatic b : (Lorg/bukkit/World;III)Lorg/bukkit/block/Block;
    //   212: astore #17
    //   214: aload #17
    //   216: iload #10
    //   218: ifeq -> 250
    //   221: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   224: iload #10
    //   226: ifeq -> 162
    //   229: lload_1
    //   230: lconst_0
    //   231: lcmp
    //   232: iflt -> 181
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: ifeq -> 248
    //   245: goto -> 704
    //   248: aload #17
    //   250: lload #6
    //   252: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   255: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   258: astore #18
    //   260: aload #18
    //   262: arraylength
    //   263: istore #19
    //   265: iconst_0
    //   266: istore #20
    //   268: iload #20
    //   270: iload #19
    //   272: if_icmpge -> 704
    //   275: aload #18
    //   277: iload #20
    //   279: aaload
    //   280: astore #21
    //   282: aload #21
    //   284: iload_3
    //   285: i2c
    //   286: iload #4
    //   288: aload #12
    //   290: iload #5
    //   292: i2c
    //   293: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   296: iload #10
    //   298: ifeq -> 190
    //   301: iload #10
    //   303: lload_1
    //   304: lconst_0
    //   305: lcmp
    //   306: iflt -> 272
    //   309: lload_1
    //   310: lconst_0
    //   311: lcmp
    //   312: ifle -> 350
    //   315: ifeq -> 348
    //   318: ifeq -> 334
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   327: athrow
    //   328: lload_1
    //   329: lconst_0
    //   330: lcmp
    //   331: ifgt -> 696
    //   334: aload #21
    //   336: iload_3
    //   337: i2c
    //   338: iload #4
    //   340: aload #13
    //   342: iload #5
    //   344: i2c
    //   345: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   348: iload #10
    //   350: lload_1
    //   351: lconst_0
    //   352: lcmp
    //   353: iflt -> 388
    //   356: ifeq -> 386
    //   359: ifne -> 375
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   368: athrow
    //   369: lload_1
    //   370: lconst_0
    //   371: lcmp
    //   372: ifge -> 696
    //   375: aload #21
    //   377: invokevirtual t : ()D
    //   380: aload #12
    //   382: invokevirtual b : ()D
    //   385: dcmpg
    //   386: iload #10
    //   388: ifeq -> 423
    //   391: ifgt -> 696
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   400: athrow
    //   401: aload #21
    //   403: invokevirtual t : ()D
    //   406: aload #12
    //   408: invokevirtual b : ()D
    //   411: ldc2_w 0.001
    //   414: dsub
    //   415: dcmpl
    //   416: goto -> 423
    //   419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   422: athrow
    //   423: iflt -> 696
    //   426: aload #17
    //   428: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   431: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   436: lload #6
    //   438: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   441: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   444: astore #22
    //   446: aload #22
    //   448: arraylength
    //   449: iload #10
    //   451: ifeq -> 695
    //   454: ifeq -> 694
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   463: athrow
    //   464: aload #12
    //   466: lload #8
    //   468: aload #22
    //   470: invokevirtual b : (J[Lme/rerere/matrix/internal/sa;)Z
    //   473: iload #10
    //   475: ifeq -> 695
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   484: athrow
    //   485: ifne -> 694
    //   488: goto -> 495
    //   491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   494: athrow
    //   495: aload #22
    //   497: arraylength
    //   498: iconst_1
    //   499: iload #10
    //   501: lload_1
    //   502: lconst_0
    //   503: lcmp
    //   504: iflt -> 616
    //   507: ifeq -> 614
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   516: athrow
    //   517: lload_1
    //   518: lconst_0
    //   519: lcmp
    //   520: ifle -> 607
    //   523: if_icmpne -> 603
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   532: athrow
    //   533: aload #22
    //   535: iconst_0
    //   536: aaload
    //   537: invokevirtual j : ()D
    //   540: aload #21
    //   542: invokevirtual j : ()D
    //   545: dcmpg
    //   546: iload #10
    //   548: ifeq -> 695
    //   551: goto -> 558
    //   554: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   557: athrow
    //   558: iflt -> 694
    //   561: goto -> 568
    //   564: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   567: athrow
    //   568: aload #22
    //   570: iconst_0
    //   571: aaload
    //   572: invokevirtual n : ()D
    //   575: aload #21
    //   577: invokevirtual n : ()D
    //   580: dcmpg
    //   581: iload #10
    //   583: ifeq -> 695
    //   586: goto -> 593
    //   589: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   592: athrow
    //   593: iflt -> 694
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   602: athrow
    //   603: aload #22
    //   605: arraylength
    //   606: iconst_1
    //   607: goto -> 614
    //   610: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   613: athrow
    //   614: iload #10
    //   616: ifeq -> 691
    //   619: if_icmpne -> 668
    //   622: goto -> 629
    //   625: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   628: athrow
    //   629: aload #22
    //   631: iconst_0
    //   632: aaload
    //   633: invokevirtual b : ()D
    //   636: aload #21
    //   638: invokevirtual t : ()D
    //   641: dsub
    //   642: ldc2_w 1.5
    //   645: dcmpl
    //   646: iload #10
    //   648: ifeq -> 695
    //   651: goto -> 658
    //   654: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   657: athrow
    //   658: ifge -> 694
    //   661: goto -> 668
    //   664: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   667: athrow
    //   668: aload #22
    //   670: arraylength
    //   671: iload #10
    //   673: ifeq -> 695
    //   676: goto -> 683
    //   679: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   682: athrow
    //   683: iconst_1
    //   684: goto -> 691
    //   687: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   690: athrow
    //   691: if_icmple -> 696
    //   694: iconst_1
    //   695: ireturn
    //   696: iinc #20, 1
    //   699: iload #10
    //   701: ifne -> 268
    //   704: iinc #16, 1
    //   707: iload #10
    //   709: lload_1
    //   710: lconst_0
    //   711: lcmp
    //   712: ifle -> 190
    //   715: ifne -> 188
    //   718: iinc #15, 1
    //   721: iload #10
    //   723: lload_1
    //   724: lconst_0
    //   725: lcmp
    //   726: ifle -> 162
    //   729: ifne -> 160
    //   732: iinc #14, 1
    //   735: iload #10
    //   737: lload_1
    //   738: lconst_0
    //   739: lcmp
    //   740: iflt -> 181
    //   743: ifne -> 132
    //   746: iconst_0
    //   747: ireturn
    // Exception table:
    //   from	to	target	type
    //   214	229	238	java/lang/RuntimeException
    //   301	321	324	java/lang/RuntimeException
    //   348	362	365	java/lang/RuntimeException
    //   386	394	397	java/lang/RuntimeException
    //   391	416	419	java/lang/RuntimeException
    //   446	457	460	java/lang/RuntimeException
    //   454	478	481	java/lang/RuntimeException
    //   464	488	491	java/lang/RuntimeException
    //   485	510	513	java/lang/RuntimeException
    //   495	526	529	java/lang/RuntimeException
    //   517	551	554	java/lang/RuntimeException
    //   533	561	564	java/lang/RuntimeException
    //   558	586	589	java/lang/RuntimeException
    //   568	596	599	java/lang/RuntimeException
    //   593	607	610	java/lang/RuntimeException
    //   614	622	625	java/lang/RuntimeException
    //   619	651	654	java/lang/RuntimeException
    //   629	661	664	java/lang/RuntimeException
    //   658	676	679	java/lang/RuntimeException
    //   668	684	687	java/lang/RuntimeException
  }
  
  public static boolean b(@NotNull Location paramLocation, long paramLong, @NotNull yl paramyl) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/za.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 126080761965367
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
    //   40: dup2
    //   41: ldc2_w 137415821941524
    //   44: lxor
    //   45: lstore #7
    //   47: dup2
    //   48: ldc2_w 50388832974168
    //   51: lxor
    //   52: lstore #9
    //   54: dup2
    //   55: ldc2_w 4981009741235
    //   58: lxor
    //   59: lstore #11
    //   61: pop2
    //   62: aload_0
    //   63: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   66: astore #14
    //   68: invokestatic r : ()I
    //   71: aload #14
    //   73: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: istore #13
    //   79: new me/rerere/matrix/internal/sa
    //   82: dup
    //   83: aload_0
    //   84: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   87: ldc2_w 0.30000001192092896
    //   90: ldc2_w 1.5
    //   93: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   96: astore #15
    //   98: new me/rerere/matrix/internal/sa
    //   101: dup
    //   102: aload_0
    //   103: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   106: new org/bukkit/util/Vector
    //   109: dup
    //   110: iconst_0
    //   111: iconst_m1
    //   112: iconst_0
    //   113: invokespecial <init> : (III)V
    //   116: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   119: ldc2_w 0.30000001192092896
    //   122: ldc2_w 2.799999952316284
    //   125: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   128: astore #16
    //   130: aload #16
    //   132: invokevirtual i : ()D
    //   135: d2i
    //   136: iconst_1
    //   137: isub
    //   138: istore #17
    //   140: iload #17
    //   142: aload #16
    //   144: invokevirtual m : ()D
    //   147: d2i
    //   148: iconst_1
    //   149: iadd
    //   150: if_icmpgt -> 757
    //   153: aload #16
    //   155: invokevirtual b : ()D
    //   158: d2i
    //   159: iconst_1
    //   160: isub
    //   161: iload #13
    //   163: ifeq -> 758
    //   166: istore #18
    //   168: iload #18
    //   170: aload #16
    //   172: invokevirtual t : ()D
    //   175: d2i
    //   176: iconst_1
    //   177: iadd
    //   178: if_icmpgt -> 743
    //   181: aload #16
    //   183: invokevirtual h : ()D
    //   186: d2i
    //   187: iconst_1
    //   188: isub
    //   189: iload #13
    //   191: ifeq -> 142
    //   194: istore #19
    //   196: iload #19
    //   198: aload #16
    //   200: invokevirtual p : ()D
    //   203: d2i
    //   204: iconst_1
    //   205: iadd
    //   206: if_icmpgt -> 729
    //   209: aload #14
    //   211: iload #17
    //   213: iload #18
    //   215: iload #19
    //   217: invokestatic b : (Lorg/bukkit/World;III)Lorg/bukkit/block/Block;
    //   220: astore #20
    //   222: aload #20
    //   224: iload #13
    //   226: ifeq -> 258
    //   229: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   232: iload #13
    //   234: ifeq -> 170
    //   237: lload_1
    //   238: lconst_0
    //   239: lcmp
    //   240: iflt -> 189
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: ifeq -> 256
    //   253: goto -> 715
    //   256: aload #20
    //   258: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   261: aload_3
    //   262: lload #9
    //   264: invokestatic b : (Lorg/bukkit/block/Block;Lme/rerere/matrix/internal/ya;Lme/rerere/matrix/internal/yl;J)[Lme/rerere/matrix/internal/sa;
    //   267: astore #21
    //   269: aload #21
    //   271: arraylength
    //   272: istore #22
    //   274: iconst_0
    //   275: istore #23
    //   277: iload #23
    //   279: iload #22
    //   281: if_icmpge -> 715
    //   284: aload #21
    //   286: iload #23
    //   288: aaload
    //   289: astore #24
    //   291: aload #24
    //   293: iload #4
    //   295: i2c
    //   296: iload #5
    //   298: aload #15
    //   300: iload #6
    //   302: i2c
    //   303: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   306: iload #13
    //   308: ifeq -> 198
    //   311: iload #13
    //   313: lload_1
    //   314: lconst_0
    //   315: lcmp
    //   316: ifle -> 281
    //   319: lload_1
    //   320: lconst_0
    //   321: lcmp
    //   322: ifle -> 361
    //   325: ifeq -> 359
    //   328: ifeq -> 344
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: lload_1
    //   339: lconst_0
    //   340: lcmp
    //   341: ifgt -> 707
    //   344: aload #24
    //   346: iload #4
    //   348: i2c
    //   349: iload #5
    //   351: aload #16
    //   353: iload #6
    //   355: i2c
    //   356: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   359: iload #13
    //   361: lload_1
    //   362: lconst_0
    //   363: lcmp
    //   364: ifle -> 399
    //   367: ifeq -> 397
    //   370: ifne -> 386
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   379: athrow
    //   380: lload_1
    //   381: lconst_0
    //   382: lcmp
    //   383: ifge -> 707
    //   386: aload #24
    //   388: invokevirtual t : ()D
    //   391: aload #15
    //   393: invokevirtual b : ()D
    //   396: dcmpg
    //   397: iload #13
    //   399: ifeq -> 434
    //   402: ifgt -> 707
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   411: athrow
    //   412: aload #24
    //   414: invokevirtual t : ()D
    //   417: aload #15
    //   419: invokevirtual b : ()D
    //   422: ldc2_w 0.001
    //   425: dsub
    //   426: dcmpl
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   433: athrow
    //   434: iflt -> 707
    //   437: aload #20
    //   439: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   442: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   447: lload #7
    //   449: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   452: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   455: astore #25
    //   457: aload #25
    //   459: arraylength
    //   460: iload #13
    //   462: ifeq -> 706
    //   465: ifeq -> 705
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   474: athrow
    //   475: aload #15
    //   477: lload #11
    //   479: aload #25
    //   481: invokevirtual b : (J[Lme/rerere/matrix/internal/sa;)Z
    //   484: iload #13
    //   486: ifeq -> 706
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   495: athrow
    //   496: ifne -> 705
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   505: athrow
    //   506: aload #25
    //   508: arraylength
    //   509: iconst_1
    //   510: iload #13
    //   512: lload_1
    //   513: lconst_0
    //   514: lcmp
    //   515: ifle -> 627
    //   518: ifeq -> 625
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   527: athrow
    //   528: lload_1
    //   529: lconst_0
    //   530: lcmp
    //   531: ifle -> 618
    //   534: if_icmpne -> 614
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   543: athrow
    //   544: aload #25
    //   546: iconst_0
    //   547: aaload
    //   548: invokevirtual j : ()D
    //   551: aload #24
    //   553: invokevirtual j : ()D
    //   556: dcmpg
    //   557: iload #13
    //   559: ifeq -> 706
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   568: athrow
    //   569: iflt -> 705
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   578: athrow
    //   579: aload #25
    //   581: iconst_0
    //   582: aaload
    //   583: invokevirtual n : ()D
    //   586: aload #24
    //   588: invokevirtual n : ()D
    //   591: dcmpg
    //   592: iload #13
    //   594: ifeq -> 706
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   603: athrow
    //   604: iflt -> 705
    //   607: goto -> 614
    //   610: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   613: athrow
    //   614: aload #25
    //   616: arraylength
    //   617: iconst_1
    //   618: goto -> 625
    //   621: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   624: athrow
    //   625: iload #13
    //   627: ifeq -> 702
    //   630: if_icmpne -> 679
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   639: athrow
    //   640: aload #25
    //   642: iconst_0
    //   643: aaload
    //   644: invokevirtual b : ()D
    //   647: aload #24
    //   649: invokevirtual t : ()D
    //   652: dsub
    //   653: ldc2_w 1.5
    //   656: dcmpl
    //   657: iload #13
    //   659: ifeq -> 706
    //   662: goto -> 669
    //   665: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   668: athrow
    //   669: ifge -> 705
    //   672: goto -> 679
    //   675: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   678: athrow
    //   679: aload #25
    //   681: arraylength
    //   682: iload #13
    //   684: ifeq -> 706
    //   687: goto -> 694
    //   690: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   693: athrow
    //   694: iconst_1
    //   695: goto -> 702
    //   698: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   701: athrow
    //   702: if_icmple -> 707
    //   705: iconst_1
    //   706: ireturn
    //   707: iinc #23, 1
    //   710: iload #13
    //   712: ifne -> 277
    //   715: iinc #19, 1
    //   718: iload #13
    //   720: lload_1
    //   721: lconst_0
    //   722: lcmp
    //   723: ifle -> 198
    //   726: ifne -> 196
    //   729: iinc #18, 1
    //   732: iload #13
    //   734: lload_1
    //   735: lconst_0
    //   736: lcmp
    //   737: ifle -> 170
    //   740: ifne -> 168
    //   743: iinc #17, 1
    //   746: iload #13
    //   748: lload_1
    //   749: lconst_0
    //   750: lcmp
    //   751: iflt -> 189
    //   754: ifne -> 140
    //   757: iconst_0
    //   758: ireturn
    // Exception table:
    //   from	to	target	type
    //   222	237	246	java/lang/RuntimeException
    //   311	331	334	java/lang/RuntimeException
    //   359	373	376	java/lang/RuntimeException
    //   397	405	408	java/lang/RuntimeException
    //   402	427	430	java/lang/RuntimeException
    //   457	468	471	java/lang/RuntimeException
    //   465	489	492	java/lang/RuntimeException
    //   475	499	502	java/lang/RuntimeException
    //   496	521	524	java/lang/RuntimeException
    //   506	537	540	java/lang/RuntimeException
    //   528	562	565	java/lang/RuntimeException
    //   544	572	575	java/lang/RuntimeException
    //   569	597	600	java/lang/RuntimeException
    //   579	607	610	java/lang/RuntimeException
    //   604	618	621	java/lang/RuntimeException
    //   625	633	636	java/lang/RuntimeException
    //   630	662	665	java/lang/RuntimeException
    //   640	672	675	java/lang/RuntimeException
    //   669	687	690	java/lang/RuntimeException
    //   679	695	698	java/lang/RuntimeException
  }
  
  public static boolean b(long paramLong, @NotNull Location paramLocation, double paramDouble) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/za.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 9434766538958
    //   11: lxor
    //   12: lstore #5
    //   14: pop2
    //   15: invokestatic r : ()I
    //   18: istore #10
    //   20: aload_2
    //   21: iload #10
    //   23: ifeq -> 95
    //   26: invokestatic b : (Lorg/bukkit/Location;)Lorg/bukkit/Material;
    //   29: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   32: if_acmpne -> 94
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aload_2
    //   43: invokevirtual clone : ()Lorg/bukkit/Location;
    //   46: dconst_0
    //   47: lload_0
    //   48: lconst_0
    //   49: lcmp
    //   50: iflt -> 96
    //   53: ldc2_w -1.0
    //   56: dconst_0
    //   57: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   60: iload #10
    //   62: ifeq -> 95
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: invokestatic b : (Lorg/bukkit/Location;)Lorg/bukkit/Material;
    //   75: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   78: if_acmpeq -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_1
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload_2
    //   95: dload_3
    //   96: dstore #7
    //   98: astore #9
    //   100: lload #5
    //   102: aload #9
    //   104: dload #7
    //   106: invokestatic j : (JLorg/bukkit/Location;D)Z
    //   109: ireturn
    // Exception table:
    //   from	to	target	type
    //   20	35	38	java/lang/RuntimeException
    //   26	65	68	java/lang/RuntimeException
    //   42	81	84	java/lang/RuntimeException
    //   72	90	90	java/lang/RuntimeException
  }
  
  public static int b(double paramDouble) {
    return NumberConversions.floor(paramDouble);
  }
  
  public static boolean j(@NotNull Location paramLocation, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/za.c : J
    //   17: lxor
    //   18: lstore_3
    //   19: aload_0
    //   20: invokestatic b : (Lorg/bukkit/Location;)Lme/rerere/matrix/internal/db;
    //   23: astore #6
    //   25: invokestatic r : ()I
    //   28: aload #6
    //   30: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   33: invokevirtual b : (Lorg/bukkit/block/BlockFace;)Lme/rerere/matrix/internal/db;
    //   36: astore #7
    //   38: istore #5
    //   40: aload #6
    //   42: invokevirtual b : ()Lorg/bukkit/Material;
    //   45: invokestatic r : (Lorg/bukkit/Material;)Z
    //   48: iload #5
    //   50: ifeq -> 94
    //   53: ifeq -> 93
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload #7
    //   65: invokevirtual b : ()Lorg/bukkit/Material;
    //   68: invokestatic r : (Lorg/bukkit/Material;)Z
    //   71: iload #5
    //   73: ifeq -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: ifne -> 95
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: iconst_1
    //   94: ireturn
    //   95: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   98: astore #8
    //   100: aload #8
    //   102: arraylength
    //   103: istore #9
    //   105: iconst_0
    //   106: istore #10
    //   108: iload #10
    //   110: iload #9
    //   112: if_icmpge -> 214
    //   115: aload #8
    //   117: iload #10
    //   119: aaload
    //   120: astore #11
    //   122: aload #6
    //   124: aload #11
    //   126: invokevirtual b : (Lorg/bukkit/block/BlockFace;)Lme/rerere/matrix/internal/db;
    //   129: invokevirtual b : ()Lorg/bukkit/Material;
    //   132: invokestatic r : (Lorg/bukkit/Material;)Z
    //   135: iload #5
    //   137: iload_2
    //   138: ifge -> 146
    //   141: ifeq -> 215
    //   144: iload #5
    //   146: iload_1
    //   147: iflt -> 191
    //   150: ifeq -> 189
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: ifne -> 176
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   169: athrow
    //   170: iconst_1
    //   171: ireturn
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: aload #7
    //   178: aload #11
    //   180: invokevirtual b : (Lorg/bukkit/block/BlockFace;)Lme/rerere/matrix/internal/db;
    //   183: invokevirtual b : ()Lorg/bukkit/Material;
    //   186: invokestatic r : (Lorg/bukkit/Material;)Z
    //   189: iload #5
    //   191: ifeq -> 205
    //   194: ifne -> 206
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   203: athrow
    //   204: iconst_1
    //   205: ireturn
    //   206: iinc #10, 1
    //   209: iload #5
    //   211: ifne -> 108
    //   214: iconst_0
    //   215: ireturn
    // Exception table:
    //   from	to	target	type
    //   40	56	59	java/lang/RuntimeException
    //   53	76	79	java/lang/RuntimeException
    //   63	86	89	java/lang/RuntimeException
    //   122	153	156	java/lang/RuntimeException
    //   144	163	166	java/lang/RuntimeException
    //   160	172	172	java/lang/RuntimeException
    //   189	197	200	java/lang/RuntimeException
  }
  
  public static boolean b(long paramLong, @NotNull Location paramLocation) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/za.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: aload_2
    //   7: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   10: astore #4
    //   12: invokestatic a : ()I
    //   15: aload #4
    //   17: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   20: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   25: astore #5
    //   27: istore_3
    //   28: aload #4
    //   30: invokeinterface isLiquid : ()Z
    //   35: iload_3
    //   36: ifne -> 108
    //   39: ifne -> 77
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: aload #5
    //   51: invokeinterface isLiquid : ()Z
    //   56: iload_3
    //   57: ifne -> 242
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: ifeq -> 241
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload_2
    //   78: invokevirtual clone : ()Lorg/bukkit/Location;
    //   81: ldc2_w 0.45
    //   84: ldc2_w -0.5
    //   87: ldc2_w 0.45
    //   90: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   93: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   96: invokeinterface isLiquid : ()Z
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: iload_3
    //   109: ifne -> 242
    //   112: ifeq -> 241
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload_2
    //   123: invokevirtual clone : ()Lorg/bukkit/Location;
    //   126: ldc2_w 0.45
    //   129: ldc2_w -0.5
    //   132: ldc2_w -0.45
    //   135: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   138: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   141: invokeinterface isLiquid : ()Z
    //   146: iload_3
    //   147: ifne -> 242
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: ifeq -> 241
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: aload_2
    //   168: invokevirtual clone : ()Lorg/bukkit/Location;
    //   171: ldc2_w -0.45
    //   174: ldc2_w -0.5
    //   177: ldc2_w 0.45
    //   180: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   183: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   186: invokeinterface isLiquid : ()Z
    //   191: iload_3
    //   192: ifne -> 242
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: ifeq -> 241
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_2
    //   213: invokevirtual clone : ()Lorg/bukkit/Location;
    //   216: ldc2_w -0.45
    //   219: ldc2_w -0.5
    //   222: ldc2_w -0.45
    //   225: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   228: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   231: invokeinterface isLiquid : ()Z
    //   236: ireturn
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: iconst_0
    //   242: ireturn
    // Exception table:
    //   from	to	target	type
    //   28	42	45	java/lang/RuntimeException
    //   39	60	63	java/lang/RuntimeException
    //   49	70	73	java/lang/RuntimeException
    //   67	101	104	java/lang/RuntimeException
    //   108	115	118	java/lang/RuntimeException
    //   112	150	153	java/lang/RuntimeException
    //   122	160	163	java/lang/RuntimeException
    //   157	195	198	java/lang/RuntimeException
    //   167	205	208	java/lang/RuntimeException
    //   202	237	237	java/lang/RuntimeException
  }
  
  @Deprecated
  @NotNull
  public static List b(@NotNull Location paramLocation, long paramLong, short paramShort) {
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
    //   13: getstatic me/rerere/matrix/internal/za.c : J
    //   16: lxor
    //   17: lstore #4
    //   19: new java/util/ArrayList
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #7
    //   28: invokestatic a : ()I
    //   31: aload_0
    //   32: invokevirtual getY : ()D
    //   35: dstore #8
    //   37: aload_0
    //   38: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   41: astore #10
    //   43: istore #6
    //   45: dload #8
    //   47: dconst_1
    //   48: drem
    //   49: dconst_0
    //   50: dcmpl
    //   51: ifne -> 143
    //   54: aload_0
    //   55: invokevirtual clone : ()Lorg/bukkit/Location;
    //   58: dconst_0
    //   59: ldc2_w -1.0
    //   62: dconst_0
    //   63: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   66: astore #11
    //   68: getstatic me/rerere/matrix/internal/za.b : [Lorg/bukkit/util/Vector;
    //   71: astore #12
    //   73: aload #12
    //   75: arraylength
    //   76: istore #13
    //   78: iconst_0
    //   79: istore #14
    //   81: iload #14
    //   83: iload #13
    //   85: if_icmpge -> 138
    //   88: aload #12
    //   90: iload #14
    //   92: aaload
    //   93: astore #15
    //   95: aload #7
    //   97: iload_3
    //   98: ifge -> 420
    //   101: aload #11
    //   103: aload #15
    //   105: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/util/Vector;)Lorg/bukkit/block/Block;
    //   108: invokeinterface add : (Ljava/lang/Object;)Z
    //   113: pop
    //   114: iinc #14, 1
    //   117: iload #6
    //   119: ifne -> 418
    //   122: iload #6
    //   124: ifeq -> 81
    //   127: iload_3
    //   128: ifge -> 117
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: iload #6
    //   140: ifeq -> 418
    //   143: aload_0
    //   144: invokevirtual clone : ()Lorg/bukkit/Location;
    //   147: astore #11
    //   149: aload #11
    //   151: invokevirtual clone : ()Lorg/bukkit/Location;
    //   154: dconst_0
    //   155: ldc2_w -1.0
    //   158: dconst_0
    //   159: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   162: astore #12
    //   164: iconst_0
    //   165: istore #13
    //   167: aload #11
    //   169: invokevirtual getY : ()D
    //   172: aload #11
    //   174: invokevirtual getBlockY : ()I
    //   177: i2d
    //   178: dsub
    //   179: ldc2_w 0.5
    //   182: dcmpg
    //   183: iload #6
    //   185: ifne -> 218
    //   188: ifgt -> 309
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   197: athrow
    //   198: aload #11
    //   200: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   203: invokeinterface getType : ()Lorg/bukkit/Material;
    //   208: invokestatic r : (Lorg/bukkit/Material;)Z
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: ifeq -> 309
    //   221: getstatic me/rerere/matrix/internal/za.b : [Lorg/bukkit/util/Vector;
    //   224: astore #14
    //   226: aload #14
    //   228: arraylength
    //   229: istore #15
    //   231: iconst_0
    //   232: istore #16
    //   234: iload #16
    //   236: iload #15
    //   238: if_icmpge -> 309
    //   241: aload #14
    //   243: iload #16
    //   245: aaload
    //   246: astore #17
    //   248: aload #12
    //   250: aload #17
    //   252: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/util/Vector;)Lorg/bukkit/block/Block;
    //   255: astore #18
    //   257: iload #6
    //   259: iload_3
    //   260: ifge -> 306
    //   263: ifne -> 304
    //   266: aload #18
    //   268: invokeinterface getType : ()Lorg/bukkit/Material;
    //   273: invokestatic p : (Lorg/bukkit/Material;)Z
    //   276: iload #6
    //   278: ifne -> 324
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: ifeq -> 301
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   297: athrow
    //   298: iconst_1
    //   299: istore #13
    //   301: iinc #16, 1
    //   304: iload #6
    //   306: ifeq -> 234
    //   309: getstatic me/rerere/matrix/internal/za.b : [Lorg/bukkit/util/Vector;
    //   312: astore #14
    //   314: aload #14
    //   316: arraylength
    //   317: istore #15
    //   319: iload_3
    //   320: ifgt -> 418
    //   323: iconst_0
    //   324: istore #16
    //   326: iload #16
    //   328: iload #15
    //   330: if_icmpge -> 418
    //   333: aload #14
    //   335: iload #16
    //   337: aaload
    //   338: astore #17
    //   340: iload #13
    //   342: iload #6
    //   344: ifne -> 409
    //   347: ifeq -> 388
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   356: athrow
    //   357: aload #7
    //   359: aload #12
    //   361: aload #17
    //   363: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/util/Vector;)Lorg/bukkit/block/Block;
    //   366: invokeinterface add : (Ljava/lang/Object;)Z
    //   371: pop
    //   372: iload #6
    //   374: iload_3
    //   375: ifgt -> 415
    //   378: ifeq -> 410
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   387: athrow
    //   388: aload #7
    //   390: aload #11
    //   392: aload #17
    //   394: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/util/Vector;)Lorg/bukkit/block/Block;
    //   397: invokeinterface add : (Ljava/lang/Object;)Z
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   408: athrow
    //   409: pop
    //   410: iinc #16, 1
    //   413: iload #6
    //   415: ifeq -> 326
    //   418: aload #7
    //   420: areturn
    // Exception table:
    //   from	to	target	type
    //   95	127	134	java/lang/RuntimeException
    //   167	191	194	java/lang/RuntimeException
    //   188	211	214	java/lang/RuntimeException
    //   257	281	284	java/lang/RuntimeException
    //   266	291	294	java/lang/RuntimeException
    //   340	350	353	java/lang/RuntimeException
    //   347	381	384	java/lang/RuntimeException
    //   357	402	405	java/lang/RuntimeException
  }
  
  public static void f(int paramInt) {
    a = paramInt;
  }
  
  public static int V() {
    return a;
  }
  
  public static int e() {
    int i = V();
    try {
      if (i == 0)
        return 50; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */