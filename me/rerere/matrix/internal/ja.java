package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class ja {
  private static final double b = 0.30000001192D;
  
  private static Set i;
  
  private static yk[] a;
  
  private static final long c = o3.a(3331681164578195214L, 6645161188257324559L, MethodHandles.lookup().lookupClass()).a(237457653158366L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public static double j(long paramLong, @NotNull Player paramPlayer) {
    paramLong = c ^ paramLong;
    int i = (int)((paramLong ^ 0x3D547A0D47D4L) >>> 48L);
    int j = (int)((paramLong ^ 0x3D547A0D47D4L) << 16L >>> 32L);
    int k = (int)((paramLong ^ 0x3D547A0D47D4L) << 48L >>> 48L);
    paramLong ^ 0x3D547A0D47D4L;
    return b(paramPlayer, (char)i, j, (char)k, Boolean.valueOf(true));
  }
  
  public static void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ja.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic r : ()I
    //   9: istore_2
    //   10: invokestatic values : ()[Lorg/bukkit/Material;
    //   13: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   16: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   21: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   26: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   31: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   36: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   39: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   44: checkcast java/util/Collection
    //   47: invokestatic copyOf : (Ljava/util/Collection;)Ljava/util/EnumSet;
    //   50: astore_3
    //   51: invokestatic b : ()I
    //   54: iload_2
    //   55: ifeq -> 139
    //   58: bipush #13
    //   60: if_icmpge -> 140
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: aload_3
    //   71: sipush #17458
    //   74: ldc2_w 8609440443010590095
    //   77: lload_0
    //   78: lxor
    //   79: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   84: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/Material;
    //   87: invokevirtual add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: aload_3
    //   92: sipush #2247
    //   95: ldc2_w 1873283934773700991
    //   98: lload_0
    //   99: lxor
    //   100: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   105: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/Material;
    //   108: invokevirtual add : (Ljava/lang/Object;)Z
    //   111: pop
    //   112: aload_3
    //   113: sipush #30892
    //   116: ldc2_w 8129337703284119818
    //   119: lload_0
    //   120: lxor
    //   121: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   126: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/Material;
    //   129: invokevirtual add : (Ljava/lang/Object;)Z
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: pop
    //   140: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   143: invokevirtual b : ()Lme/rerere/matrix/internal/kd;
    //   146: invokevirtual b : ()Lme/rerere/matrix/internal/al;
    //   149: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   152: astore #4
    //   154: aload #4
    //   156: sipush #7920
    //   159: ldc2_w 4620985594625294147
    //   162: lload_0
    //   163: lxor
    //   164: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   169: invokevirtual getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   172: astore #5
    //   174: aload #5
    //   176: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   181: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   186: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   191: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   196: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   201: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   206: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   211: aload_3
    //   212: dup
    //   213: invokevirtual getClass : ()Ljava/lang/Class;
    //   216: pop
    //   217: <illegal opcode> test : (Ljava/util/EnumSet;)Ljava/util/function/Predicate;
    //   222: invokeinterface negate : ()Ljava/util/function/Predicate;
    //   227: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   232: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   235: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   240: checkcast java/util/Set
    //   243: astore #6
    //   245: aload_3
    //   246: aload #6
    //   248: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   251: pop
    //   252: aload_3
    //   253: putstatic me/rerere/matrix/internal/ja.i : Ljava/util/Set;
    //   256: lload_0
    //   257: lconst_0
    //   258: lcmp
    //   259: ifle -> 334
    //   262: aload #6
    //   264: invokeinterface size : ()I
    //   269: ifle -> 341
    //   272: new java/lang/StringBuilder
    //   275: dup
    //   276: invokespecial <init> : ()V
    //   279: sipush #13024
    //   282: ldc2_w 5805706753145819975
    //   285: lload_0
    //   286: lxor
    //   287: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: aload #6
    //   297: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   302: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   307: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   312: ldc ','
    //   314: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   317: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   322: checkcast java/lang/String
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual toString : ()Ljava/lang/String;
    //   331: invokestatic b : (Ljava/lang/String;)V
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   340: athrow
    //   341: return
    // Exception table:
    //   from	to	target	type
    //   51	63	66	java/lang/RuntimeException
    //   58	132	135	java/lang/RuntimeException
    //   245	334	337	java/lang/RuntimeException
  }
  
  @NotNull
  public static List b(long paramLong, @NotNull World paramWorld, @NotNull sa paramsa, @NotNull yl paramyl) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ja.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 51634619311669
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 137895188083785
    //   18: lxor
    //   19: lstore #7
    //   21: pop2
    //   22: new java/util/ArrayList
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #10
    //   31: invokestatic r : ()I
    //   34: aload_3
    //   35: invokevirtual i : ()D
    //   38: lload #7
    //   40: invokestatic b : (DJ)I
    //   43: istore #11
    //   45: istore #9
    //   47: aload_3
    //   48: invokevirtual b : ()D
    //   51: lload #7
    //   53: invokestatic b : (DJ)I
    //   56: istore #12
    //   58: aload_3
    //   59: invokevirtual h : ()D
    //   62: lload #7
    //   64: invokestatic b : (DJ)I
    //   67: istore #13
    //   69: aload_3
    //   70: invokevirtual m : ()D
    //   73: dconst_1
    //   74: dadd
    //   75: lload #7
    //   77: invokestatic b : (DJ)I
    //   80: istore #14
    //   82: aload_3
    //   83: invokevirtual t : ()D
    //   86: dconst_1
    //   87: dadd
    //   88: lload #7
    //   90: invokestatic b : (DJ)I
    //   93: istore #15
    //   95: aload_3
    //   96: invokevirtual p : ()D
    //   99: dconst_1
    //   100: dadd
    //   101: lload #7
    //   103: invokestatic b : (DJ)I
    //   106: istore #16
    //   108: iload #11
    //   110: istore #17
    //   112: iload #17
    //   114: iload #14
    //   116: if_icmpgt -> 235
    //   119: iload #13
    //   121: istore #18
    //   123: iload #18
    //   125: iload #16
    //   127: if_icmpgt -> 221
    //   130: iload #12
    //   132: iload #9
    //   134: ifeq -> 114
    //   137: istore #19
    //   139: iload #19
    //   141: iload #15
    //   143: if_icmpgt -> 213
    //   146: aload_2
    //   147: iload #17
    //   149: iload #19
    //   151: iload #18
    //   153: invokestatic b : (Lorg/bukkit/World;III)Lorg/bukkit/block/Block;
    //   156: astore #20
    //   158: aload #10
    //   160: aload #20
    //   162: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   165: aload #4
    //   167: lload #5
    //   169: invokestatic b : (Lorg/bukkit/block/Block;Lme/rerere/matrix/internal/ya;Lme/rerere/matrix/internal/yl;J)[Lme/rerere/matrix/internal/sa;
    //   172: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   175: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   180: pop
    //   181: iinc #19, 1
    //   184: iload #9
    //   186: lload_0
    //   187: lconst_0
    //   188: lcmp
    //   189: ifle -> 218
    //   192: ifeq -> 216
    //   195: iload #9
    //   197: ifne -> 139
    //   200: lload_0
    //   201: lconst_0
    //   202: lcmp
    //   203: ifle -> 184
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: iinc #18, 1
    //   216: iload #9
    //   218: ifne -> 123
    //   221: iinc #17, 1
    //   224: iload #9
    //   226: lload_0
    //   227: lconst_0
    //   228: lcmp
    //   229: iflt -> 132
    //   232: ifne -> 112
    //   235: aload #10
    //   237: areturn
    // Exception table:
    //   from	to	target	type
    //   158	200	209	java/lang/RuntimeException
  }
  
  public static double b(char paramChar, int paramInt1, int paramInt2, @NotNull Player paramPlayer, @NotNull yl paramyl, @NotNull World paramWorld, @NotNull Vector paramVector1, @NotNull Vector paramVector2) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_1
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_2
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/ja.c : J
    //   26: lxor
    //   27: lstore #8
    //   29: lload #8
    //   31: dup2
    //   32: ldc2_w 95821039799065
    //   35: lxor
    //   36: dup2
    //   37: bipush #48
    //   39: lushr
    //   40: l2i
    //   41: istore #10
    //   43: dup2
    //   44: bipush #16
    //   46: lshl
    //   47: bipush #32
    //   49: lushr
    //   50: l2i
    //   51: istore #11
    //   53: dup2
    //   54: bipush #48
    //   56: lshl
    //   57: bipush #48
    //   59: lushr
    //   60: l2i
    //   61: istore #12
    //   63: pop2
    //   64: dup2
    //   65: ldc2_w 65109305163167
    //   68: lxor
    //   69: dup2
    //   70: bipush #48
    //   72: lushr
    //   73: l2i
    //   74: istore #13
    //   76: dup2
    //   77: bipush #16
    //   79: lshl
    //   80: bipush #48
    //   82: lushr
    //   83: l2i
    //   84: istore #14
    //   86: dup2
    //   87: bipush #32
    //   89: lshl
    //   90: bipush #32
    //   92: lushr
    //   93: l2i
    //   94: istore #15
    //   96: pop2
    //   97: dup2
    //   98: ldc2_w 106831923479781
    //   101: lxor
    //   102: dup2
    //   103: bipush #48
    //   105: lushr
    //   106: l2i
    //   107: istore #16
    //   109: dup2
    //   110: bipush #16
    //   112: lshl
    //   113: bipush #16
    //   115: lushr
    //   116: lstore #17
    //   118: pop2
    //   119: dup2
    //   120: ldc2_w 97395072141777
    //   123: lxor
    //   124: lstore #19
    //   126: pop2
    //   127: aload_3
    //   128: iload #13
    //   130: i2c
    //   131: iload #14
    //   133: i2c
    //   134: iload #15
    //   136: invokestatic b : (Lorg/bukkit/entity/Player;CCI)D
    //   139: dstore #22
    //   141: new me/rerere/matrix/internal/sa
    //   144: dup
    //   145: aload #6
    //   147: ldc2_w 0.30000001192092896
    //   150: dload #22
    //   152: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   155: astore #24
    //   157: invokestatic a : ()I
    //   160: aload #24
    //   162: aload #7
    //   164: invokevirtual getX : ()D
    //   167: aload #6
    //   169: invokevirtual getX : ()D
    //   172: dsub
    //   173: iload #16
    //   175: i2c
    //   176: dup_x2
    //   177: pop
    //   178: lload #17
    //   180: dup2_x2
    //   181: pop2
    //   182: aload #7
    //   184: invokevirtual getY : ()D
    //   187: aload #6
    //   189: invokevirtual getY : ()D
    //   192: dsub
    //   193: aload #7
    //   195: invokevirtual getZ : ()D
    //   198: aload #6
    //   200: invokevirtual getZ : ()D
    //   203: dsub
    //   204: invokevirtual j : (CJDDD)Lme/rerere/matrix/internal/sa;
    //   207: pop
    //   208: istore #21
    //   210: aload #24
    //   212: iload #16
    //   214: i2c
    //   215: lload #17
    //   217: dconst_0
    //   218: ldc2_w -0.5
    //   221: dconst_0
    //   222: invokevirtual j : (CJDDD)Lme/rerere/matrix/internal/sa;
    //   225: pop
    //   226: aload #24
    //   228: invokevirtual j : ()D
    //   231: ldc2_w 8.0
    //   234: iload #21
    //   236: ifne -> 431
    //   239: dcmpl
    //   240: ifgt -> 320
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: aload #24
    //   252: invokevirtual n : ()D
    //   255: iload_0
    //   256: iflt -> 432
    //   259: ldc2_w 8.0
    //   262: iload #21
    //   264: ifne -> 431
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: iload_1
    //   275: iflt -> 424
    //   278: dcmpl
    //   279: ifgt -> 320
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   288: athrow
    //   289: aload #24
    //   291: iload #21
    //   293: ifne -> 447
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   302: athrow
    //   303: invokevirtual c : ()D
    //   306: ldc2_w 8.0
    //   309: dcmpl
    //   310: ifle -> 433
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   323: new java/lang/StringBuilder
    //   326: dup
    //   327: invokespecial <init> : ()V
    //   330: sipush #26470
    //   333: ldc2_w 6510465846657324093
    //   336: lload #8
    //   338: lxor
    //   339: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: aload #4
    //   349: invokevirtual b : ()Ljava/lang/String;
    //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: sipush #17489
    //   358: ldc2_w 2481804971617236763
    //   361: lload #8
    //   363: lxor
    //   364: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   369: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: aload #24
    //   374: invokevirtual j : ()D
    //   377: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   380: ldc_w '/'
    //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload #24
    //   388: invokevirtual n : ()D
    //   391: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   394: ldc_w '/'
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: aload #24
    //   402: invokevirtual c : ()D
    //   405: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   408: invokevirtual toString : ()Ljava/lang/String;
    //   411: invokevirtual println : (Ljava/lang/String;)V
    //   414: aload #7
    //   416: invokevirtual getY : ()D
    //   419: aload #6
    //   421: invokevirtual getY : ()D
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   430: athrow
    //   431: dsub
    //   432: dreturn
    //   433: new me/rerere/matrix/internal/sa
    //   436: dup
    //   437: aload #6
    //   439: ldc2_w 0.30000001192
    //   442: dload #22
    //   444: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   447: astore #25
    //   449: aload #7
    //   451: invokevirtual getY : ()D
    //   454: dstore #26
    //   456: aload #7
    //   458: invokevirtual getY : ()D
    //   461: aload #6
    //   463: invokevirtual getY : ()D
    //   466: dsub
    //   467: dstore #28
    //   469: dload #28
    //   471: dconst_0
    //   472: dcmpl
    //   473: iload #21
    //   475: ifne -> 707
    //   478: ifle -> 687
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   487: athrow
    //   488: dload #26
    //   490: dload #22
    //   492: dadd
    //   493: dstore #30
    //   495: lload #19
    //   497: aload #5
    //   499: aload #24
    //   501: aload #4
    //   503: invokestatic b : (JLorg/bukkit/World;Lme/rerere/matrix/internal/sa;Lme/rerere/matrix/internal/yl;)Ljava/util/List;
    //   506: invokeinterface iterator : ()Ljava/util/Iterator;
    //   511: astore #32
    //   513: aload #32
    //   515: invokeinterface hasNext : ()Z
    //   520: ifeq -> 675
    //   523: aload #32
    //   525: invokeinterface next : ()Ljava/lang/Object;
    //   530: checkcast me/rerere/matrix/internal/sa
    //   533: astore #33
    //   535: aload #33
    //   537: iload #10
    //   539: i2c
    //   540: iload #11
    //   542: aload #24
    //   544: iload #12
    //   546: i2c
    //   547: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   550: iload #21
    //   552: iload_0
    //   553: iflt -> 597
    //   556: ifne -> 591
    //   559: ifeq -> 670
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   568: athrow
    //   569: aload #33
    //   571: iload #10
    //   573: i2c
    //   574: iload #11
    //   576: aload #25
    //   578: iload #12
    //   580: i2c
    //   581: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   590: athrow
    //   591: iload_2
    //   592: ifle -> 644
    //   595: iload #21
    //   597: ifne -> 644
    //   600: ifne -> 670
    //   603: goto -> 610
    //   606: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   609: athrow
    //   610: aload #33
    //   612: invokevirtual b : ()D
    //   615: iload_1
    //   616: iflt -> 668
    //   619: aload #25
    //   621: invokevirtual t : ()D
    //   624: iload #21
    //   626: ifne -> 665
    //   629: goto -> 636
    //   632: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   635: athrow
    //   636: dcmpl
    //   637: goto -> 644
    //   640: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   643: athrow
    //   644: iload_0
    //   645: iflt -> 672
    //   648: iflt -> 670
    //   651: dload #30
    //   653: aload #33
    //   655: invokevirtual b : ()D
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   664: athrow
    //   665: invokestatic min : (DD)D
    //   668: dstore #30
    //   670: iload #21
    //   672: ifeq -> 513
    //   675: dload #30
    //   677: dload #22
    //   679: dsub
    //   680: aload #6
    //   682: invokevirtual getY : ()D
    //   685: dsub
    //   686: dreturn
    //   687: dload #28
    //   689: iload_1
    //   690: iflt -> 914
    //   693: dconst_0
    //   694: iload #21
    //   696: ifne -> 913
    //   699: dcmpg
    //   700: goto -> 707
    //   703: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   706: athrow
    //   707: ifge -> 903
    //   710: dload #26
    //   712: dstore #30
    //   714: lload #19
    //   716: aload #5
    //   718: aload #24
    //   720: aload #4
    //   722: invokestatic b : (JLorg/bukkit/World;Lme/rerere/matrix/internal/sa;Lme/rerere/matrix/internal/yl;)Ljava/util/List;
    //   725: invokeinterface iterator : ()Ljava/util/Iterator;
    //   730: astore #32
    //   732: aload #32
    //   734: invokeinterface hasNext : ()Z
    //   739: ifeq -> 894
    //   742: aload #32
    //   744: invokeinterface next : ()Ljava/lang/Object;
    //   749: checkcast me/rerere/matrix/internal/sa
    //   752: astore #33
    //   754: aload #33
    //   756: iload #10
    //   758: i2c
    //   759: iload #11
    //   761: aload #24
    //   763: iload #12
    //   765: i2c
    //   766: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   769: iload #21
    //   771: iload_1
    //   772: ifle -> 816
    //   775: ifne -> 810
    //   778: ifeq -> 889
    //   781: goto -> 788
    //   784: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   787: athrow
    //   788: aload #33
    //   790: iload #10
    //   792: i2c
    //   793: iload #11
    //   795: aload #25
    //   797: iload #12
    //   799: i2c
    //   800: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   803: goto -> 810
    //   806: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   809: athrow
    //   810: iload_2
    //   811: iflt -> 863
    //   814: iload #21
    //   816: ifne -> 863
    //   819: ifne -> 889
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   828: athrow
    //   829: aload #33
    //   831: invokevirtual t : ()D
    //   834: iload_1
    //   835: iflt -> 887
    //   838: aload #25
    //   840: invokevirtual b : ()D
    //   843: iload #21
    //   845: ifne -> 884
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   854: athrow
    //   855: dcmpg
    //   856: goto -> 863
    //   859: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   862: athrow
    //   863: iload_2
    //   864: iflt -> 891
    //   867: ifgt -> 889
    //   870: dload #30
    //   872: aload #33
    //   874: invokevirtual t : ()D
    //   877: goto -> 884
    //   880: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   883: athrow
    //   884: invokestatic max : (DD)D
    //   887: dstore #30
    //   889: iload #21
    //   891: ifeq -> 732
    //   894: dload #30
    //   896: aload #6
    //   898: invokevirtual getY : ()D
    //   901: dsub
    //   902: dreturn
    //   903: aload #7
    //   905: invokevirtual getY : ()D
    //   908: aload #6
    //   910: invokevirtual getY : ()D
    //   913: dsub
    //   914: dreturn
    // Exception table:
    //   from	to	target	type
    //   210	243	246	java/lang/RuntimeException
    //   239	267	270	java/lang/RuntimeException
    //   250	282	285	java/lang/RuntimeException
    //   274	296	299	java/lang/RuntimeException
    //   289	313	316	java/lang/RuntimeException
    //   303	424	427	java/lang/RuntimeException
    //   469	481	484	java/lang/RuntimeException
    //   535	562	565	java/lang/RuntimeException
    //   559	584	587	java/lang/RuntimeException
    //   591	603	606	java/lang/RuntimeException
    //   600	629	632	java/lang/RuntimeException
    //   610	637	640	java/lang/RuntimeException
    //   644	658	661	java/lang/RuntimeException
    //   687	700	703	java/lang/RuntimeException
    //   754	781	784	java/lang/RuntimeException
    //   778	803	806	java/lang/RuntimeException
    //   810	822	825	java/lang/RuntimeException
    //   819	848	851	java/lang/RuntimeException
    //   829	856	859	java/lang/RuntimeException
    //   863	877	880	java/lang/RuntimeException
  }
  
  public static EnumSet b(@NotNull Player paramPlayer, @NotNull Location paramLocation1, int paramInt, @NotNull Location paramLocation2, short paramShort1, short paramShort2) {
    long l1 = (paramInt << 32L | paramShort1 << 48L >>> 32L | paramShort2 << 48L >>> 48L) ^ c;
    int i = (int)((l1 ^ 0x2AFD9E160625L) >>> 48L);
    int j = (int)((l1 ^ 0x2AFD9E160625L) << 16L >>> 48L);
    int k = (int)((l1 ^ 0x2AFD9E160625L) << 32L >>> 32L);
    l1 ^ 0x2AFD9E160625L;
    int m = (int)((l1 ^ 0x70E351CEFF5FL) >>> 48L);
    long l2 = (l1 ^ 0x70E351CEFF5FL) << 16L >>> 16L;
    l1 ^ 0x70E351CEFF5FL;
    long l3 = l1 ^ 0x4A0FBDF07CB0L;
    double d = b(paramPlayer, (char)i, (char)j, k);
    HashSet<Enum> hashSet = new HashSet();
    Vector vector = jb.b(paramLocation2.toVector()).subtract(paramLocation1.toVector());
    sa sa = new sa(paramLocation1.toVector(), 0.30000001192D, d);
    (char)m;
    sa.j((char)m, l2, vector.getX(), vector.getY(), vector.getZ());
    int n = yl.a();
    World world = paramPlayer.getWorld();
    int i1 = zb.b(sa.i() + 0.001D, l3);
    while (true) {
      while (i1 <= zb.b(sa.m() - 0.001D, l3)) {
        int i2 = zb.b(sa.h() + 0.001D, l3);
        while (true) {
          if (n == 0);
          continue;
          if (paramShort2 < 0)
            if (n != 0)
              break;  
        } 
      } 
      break;
    } 
    return EnumSet.copyOf(hashSet);
  }
  
  public static boolean b(@NotNull Player paramPlayer, @NotNull Location paramLocation, @NotNull yl paramyl, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ja.c : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 57880812465754
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #5
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #16
    //   25: lushr
    //   26: lstore #6
    //   28: pop2
    //   29: dup2
    //   30: ldc2_w 14402588779374
    //   33: lxor
    //   34: lstore #8
    //   36: pop2
    //   37: new me/rerere/matrix/internal/sa
    //   40: dup
    //   41: aload_1
    //   42: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   45: ldc2_w 0.30000001192092896
    //   48: ldc2_w 1.5
    //   51: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   54: astore #11
    //   56: invokestatic r : ()I
    //   59: aload #11
    //   61: iload #5
    //   63: i2c
    //   64: lload #6
    //   66: dconst_0
    //   67: ldc2_w -1.0
    //   70: dconst_0
    //   71: invokevirtual j : (CJDDD)Lme/rerere/matrix/internal/sa;
    //   74: pop
    //   75: istore #10
    //   77: aload_0
    //   78: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   83: lload #8
    //   85: dup2_x1
    //   86: pop2
    //   87: aload #11
    //   89: aload_2
    //   90: invokestatic b : (JLorg/bukkit/World;Lme/rerere/matrix/internal/sa;Lme/rerere/matrix/internal/yl;)Ljava/util/List;
    //   93: invokeinterface iterator : ()Ljava/util/Iterator;
    //   98: astore #12
    //   100: aload #12
    //   102: invokeinterface hasNext : ()Z
    //   107: ifeq -> 172
    //   110: aload #12
    //   112: invokeinterface next : ()Ljava/lang/Object;
    //   117: checkcast me/rerere/matrix/internal/sa
    //   120: astore #13
    //   122: aload #13
    //   124: invokevirtual t : ()D
    //   127: aload_1
    //   128: invokevirtual getY : ()D
    //   131: dcmpl
    //   132: iload #10
    //   134: lload_3
    //   135: lconst_0
    //   136: lcmp
    //   137: iflt -> 145
    //   140: ifeq -> 173
    //   143: iload #10
    //   145: ifeq -> 166
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: ifne -> 167
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: iconst_1
    //   166: ireturn
    //   167: iload #10
    //   169: ifne -> 100
    //   172: iconst_0
    //   173: ireturn
    // Exception table:
    //   from	to	target	type
    //   122	148	151	java/lang/RuntimeException
    //   143	158	161	java/lang/RuntimeException
  }
  
  @NotNull
  public static aa b(long paramLong, @NotNull Player paramPlayer, @NotNull World paramWorld, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    paramLong = c ^ paramLong;
    long l1 = paramLong ^ 0x74C967FADE3L;
    int i = (int)((paramLong ^ 0x6EC340F5904CL) >>> 48L);
    int j = (int)((paramLong ^ 0x6EC340F5904CL) << 16L >>> 48L);
    int k = (int)((paramLong ^ 0x6EC340F5904CL) << 32L >>> 32L);
    paramLong ^ 0x6EC340F5904CL;
    long l2 = paramLong ^ 0x7E3BE5F93A92L;
    long l3 = paramLong ^ 0x2565B3ACA4CCL;
    int m = yl.r();
    try {
      if (m != 0)
        try {
          if (jb.p(paramLocation1, paramLocation2) > 12.0D)
            return b(l2, paramPlayer, paramWorld, paramLocation2, paramLocation2); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    double d = b(paramPlayer, (char)i, (char)j, k);
    sa sa1 = new sa(paramLocation1.toVector(), 0.30200001192D, d);
    sa sa2 = new sa(paramLocation2.toVector(), 0.30200001192D, d);
    Pair pair1 = b(paramWorld, sa1, l1);
    Pair pair2 = b(paramWorld, sa2, l1);
    sa1.p(sa1.b() - 0.01D);
    Pair pair3 = b(paramWorld, sa1, l1);
    try {
      ((Set)pair1.getFirst()).addAll((Collection)pair2.getFirst());
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Set set1 = (Set)pair3.getFirst();
    boolean bool1 = ((Boolean)pair2.getSecond()).booleanValue();
    boolean bool2 = ((Boolean)pair1.getSecond()).booleanValue();
    boolean bool = (((Boolean)pair1.getSecond()).booleanValue() || ((Boolean)pair2.getSecond()).booleanValue()) ? true : false;
    Set set2 = (Set)pair1.getFirst();
    Vector vector = paramLocation2.toVector();
    return new aa(paramLocation1.toVector(), l3, vector, set2, bool, bool2, bool1, set1);
  }
  
  public static double b(@NotNull Player paramPlayer, char paramChar1, char paramChar2, int paramInt) {
    long l = (paramChar1 << 48L | paramChar2 << 48L >>> 16L | paramInt << 32L >>> 32L) ^ c;
    int i = (int)((l ^ 0x4A59ECF057F5L) >>> 48L);
    int j = (int)((l ^ 0x4A59ECF057F5L) << 16L >>> 32L);
    int k = (int)((l ^ 0x4A59ECF057F5L) << 48L >>> 48L);
    l ^ 0x4A59ECF057F5L;
    return b(paramPlayer, (char)i, j, (char)k, Boolean.valueOf(false));
  }
  
  @NotNull
  public static la b(long paramLong, @NotNull Player paramPlayer, @NotNull Vector paramVector1, @NotNull Vector paramVector2, @NotNull World paramWorld, @NotNull yl paramyl) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ja.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 102114943350160
    //   11: lxor
    //   12: lstore #7
    //   14: dup2
    //   15: ldc2_w 70258808534657
    //   18: lxor
    //   19: lstore #9
    //   21: dup2
    //   22: ldc2_w 40658637508646
    //   25: lxor
    //   26: dup2
    //   27: bipush #48
    //   29: lushr
    //   30: l2i
    //   31: istore #11
    //   33: dup2
    //   34: bipush #16
    //   36: lshl
    //   37: bipush #32
    //   39: lushr
    //   40: l2i
    //   41: istore #12
    //   43: dup2
    //   44: bipush #48
    //   46: lshl
    //   47: bipush #48
    //   49: lushr
    //   50: l2i
    //   51: istore #13
    //   53: pop2
    //   54: dup2
    //   55: ldc2_w 135815269158473
    //   58: lxor
    //   59: lstore #14
    //   61: dup2
    //   62: ldc2_w 20844524265434
    //   65: lxor
    //   66: dup2
    //   67: bipush #48
    //   69: lushr
    //   70: l2i
    //   71: istore #16
    //   73: dup2
    //   74: bipush #16
    //   76: lshl
    //   77: bipush #16
    //   79: lushr
    //   80: lstore #17
    //   82: pop2
    //   83: pop2
    //   84: invokestatic empty : ()Ljava/util/Optional;
    //   87: astore #20
    //   89: iconst_0
    //   90: istore #21
    //   92: lload #9
    //   94: aload_2
    //   95: invokestatic j : (JLorg/bukkit/entity/Player;)D
    //   98: dstore #22
    //   100: invokestatic a : ()I
    //   103: aload #4
    //   105: invokestatic b : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   108: aload_3
    //   109: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   112: astore #24
    //   114: new me/rerere/matrix/internal/sa
    //   117: dup
    //   118: aload_3
    //   119: ldc2_w 0.30000001192
    //   122: dload #22
    //   124: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   127: astore #25
    //   129: aload #25
    //   131: aload #24
    //   133: invokevirtual getX : ()D
    //   136: iload #16
    //   138: i2c
    //   139: dup_x2
    //   140: pop
    //   141: lload #17
    //   143: dup2_x2
    //   144: pop2
    //   145: aload #24
    //   147: invokevirtual getY : ()D
    //   150: aload #24
    //   152: invokevirtual getZ : ()D
    //   155: invokevirtual j : (CJDDD)Lme/rerere/matrix/internal/sa;
    //   158: pop
    //   159: new me/rerere/matrix/internal/sa
    //   162: dup
    //   163: aload_3
    //   164: ldc2_w 0.30000001192
    //   167: dload #22
    //   169: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   172: astore #26
    //   174: istore #19
    //   176: new me/rerere/matrix/internal/sa
    //   179: dup
    //   180: aload #4
    //   182: ldc2_w 0.30000001192
    //   185: dload #22
    //   187: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   190: astore #27
    //   192: aload #25
    //   194: invokevirtual i : ()D
    //   197: d2i
    //   198: iconst_2
    //   199: isub
    //   200: istore #28
    //   202: iload #28
    //   204: i2d
    //   205: aload #25
    //   207: invokevirtual m : ()D
    //   210: dconst_1
    //   211: dadd
    //   212: dcmpg
    //   213: ifgt -> 610
    //   216: aload #25
    //   218: invokevirtual b : ()D
    //   221: d2i
    //   222: iconst_2
    //   223: isub
    //   224: istore #29
    //   226: iload #29
    //   228: i2d
    //   229: aload #25
    //   231: invokevirtual t : ()D
    //   234: dconst_1
    //   235: dadd
    //   236: dcmpg
    //   237: ifgt -> 596
    //   240: aload #25
    //   242: invokevirtual h : ()D
    //   245: d2i
    //   246: iconst_2
    //   247: isub
    //   248: iload #19
    //   250: ifne -> 213
    //   253: istore #30
    //   255: iload #30
    //   257: i2d
    //   258: aload #25
    //   260: invokevirtual p : ()D
    //   263: dconst_1
    //   264: dadd
    //   265: dcmpg
    //   266: ifgt -> 582
    //   269: aload #5
    //   271: iload #28
    //   273: iload #29
    //   275: iload #30
    //   277: invokestatic b : (Lorg/bukkit/World;III)Lorg/bukkit/block/Block;
    //   280: astore #31
    //   282: aload #31
    //   284: invokestatic b : (Lorg/bukkit/block/Block;)Lorg/bukkit/Material;
    //   287: astore #32
    //   289: aload #32
    //   291: invokestatic r : (Lorg/bukkit/Material;)Z
    //   294: iload #19
    //   296: ifne -> 237
    //   299: iload #19
    //   301: lload_0
    //   302: lconst_0
    //   303: lcmp
    //   304: iflt -> 250
    //   307: ifne -> 336
    //   310: ifeq -> 326
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: lload_0
    //   321: lconst_0
    //   322: lcmp
    //   323: ifgt -> 568
    //   326: getstatic me/rerere/matrix/internal/ja.i : Ljava/util/Set;
    //   329: aload #32
    //   331: invokeinterface contains : (Ljava/lang/Object;)Z
    //   336: ifeq -> 342
    //   339: goto -> 568
    //   342: aload #31
    //   344: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   347: aload #6
    //   349: lload #14
    //   351: invokestatic b : (Lorg/bukkit/block/Block;Lme/rerere/matrix/internal/ya;Lme/rerere/matrix/internal/yl;J)[Lme/rerere/matrix/internal/sa;
    //   354: astore #33
    //   356: aload #33
    //   358: arraylength
    //   359: istore #34
    //   361: iconst_0
    //   362: istore #35
    //   364: iload #35
    //   366: iload #34
    //   368: if_icmpge -> 568
    //   371: aload #33
    //   373: iload #35
    //   375: aaload
    //   376: astore #36
    //   378: aload #36
    //   380: invokevirtual c : ()D
    //   383: dconst_0
    //   384: dcmpl
    //   385: iload #19
    //   387: ifne -> 266
    //   390: iload #19
    //   392: lload_0
    //   393: lconst_0
    //   394: lcmp
    //   395: iflt -> 296
    //   398: lload_0
    //   399: lconst_0
    //   400: lcmp
    //   401: ifle -> 440
    //   404: ifne -> 438
    //   407: ifne -> 423
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   416: athrow
    //   417: lload_0
    //   418: lconst_0
    //   419: lcmp
    //   420: ifgt -> 553
    //   423: aload #36
    //   425: iload #11
    //   427: i2c
    //   428: iload #12
    //   430: aload #25
    //   432: iload #13
    //   434: i2c
    //   435: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   438: iload #19
    //   440: lload_0
    //   441: lconst_0
    //   442: lcmp
    //   443: ifle -> 483
    //   446: ifne -> 481
    //   449: ifeq -> 553
    //   452: goto -> 459
    //   455: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   458: athrow
    //   459: aload #36
    //   461: iload #11
    //   463: i2c
    //   464: iload #12
    //   466: aload #27
    //   468: iload #13
    //   470: i2c
    //   471: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   480: athrow
    //   481: iload #19
    //   483: ifne -> 532
    //   486: ifeq -> 553
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   495: athrow
    //   496: iconst_1
    //   497: istore #21
    //   499: iload #19
    //   501: lload_0
    //   502: lconst_0
    //   503: lcmp
    //   504: ifle -> 565
    //   507: ifne -> 563
    //   510: aload #36
    //   512: iload #11
    //   514: i2c
    //   515: iload #12
    //   517: aload #26
    //   519: iload #13
    //   521: i2c
    //   522: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   525: goto -> 532
    //   528: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   531: athrow
    //   532: ifne -> 553
    //   535: aload #31
    //   537: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   540: astore #20
    //   542: lload_0
    //   543: lconst_0
    //   544: lcmp
    //   545: ifle -> 556
    //   548: iload #19
    //   550: ifeq -> 610
    //   553: iinc #35, 1
    //   556: goto -> 563
    //   559: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   562: athrow
    //   563: iload #19
    //   565: ifeq -> 364
    //   568: iinc #30, 1
    //   571: iload #19
    //   573: lload_0
    //   574: lconst_0
    //   575: lcmp
    //   576: ifle -> 266
    //   579: ifeq -> 255
    //   582: iinc #29, 1
    //   585: iload #19
    //   587: lload_0
    //   588: lconst_0
    //   589: lcmp
    //   590: iflt -> 237
    //   593: ifeq -> 226
    //   596: iinc #28, 1
    //   599: iload #19
    //   601: lload_0
    //   602: lconst_0
    //   603: lcmp
    //   604: iflt -> 248
    //   607: ifeq -> 202
    //   610: new me/rerere/matrix/internal/la
    //   613: dup
    //   614: aload #20
    //   616: lload #7
    //   618: iload #21
    //   620: invokespecial <init> : (Ljava/util/Optional;JZ)V
    //   623: areturn
    // Exception table:
    //   from	to	target	type
    //   299	313	316	java/lang/RuntimeException
    //   390	410	413	java/lang/RuntimeException
    //   438	452	455	java/lang/RuntimeException
    //   449	474	477	java/lang/RuntimeException
    //   481	489	492	java/lang/RuntimeException
    //   499	525	528	java/lang/RuntimeException
    //   542	556	559	java/lang/RuntimeException
  }
  
  @NotNull
  public static Pair b(@NotNull World paramWorld, @NotNull sa paramsa, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ja.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 77952046439265
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 135949966668219
    //   18: lxor
    //   19: dup2
    //   20: bipush #48
    //   22: lushr
    //   23: l2i
    //   24: istore #6
    //   26: dup2
    //   27: bipush #16
    //   29: lshl
    //   30: bipush #32
    //   32: lushr
    //   33: l2i
    //   34: istore #7
    //   36: dup2
    //   37: bipush #48
    //   39: lshl
    //   40: bipush #48
    //   42: lushr
    //   43: l2i
    //   44: istore #8
    //   46: pop2
    //   47: dup2
    //   48: ldc2_w 140038039196133
    //   51: lxor
    //   52: lstore #9
    //   54: dup2
    //   55: ldc2_w 137320698403138
    //   58: lxor
    //   59: dup2
    //   60: bipush #48
    //   62: lushr
    //   63: l2i
    //   64: istore #11
    //   66: dup2
    //   67: bipush #16
    //   69: lshl
    //   70: bipush #32
    //   72: lushr
    //   73: l2i
    //   74: istore #12
    //   76: dup2
    //   77: bipush #48
    //   79: lshl
    //   80: bipush #48
    //   82: lushr
    //   83: l2i
    //   84: istore #13
    //   86: pop2
    //   87: dup2
    //   88: ldc2_w 101960640398393
    //   91: lxor
    //   92: dup2
    //   93: bipush #32
    //   95: lushr
    //   96: l2i
    //   97: istore #14
    //   99: dup2
    //   100: bipush #32
    //   102: lshl
    //   103: bipush #48
    //   105: lushr
    //   106: l2i
    //   107: istore #15
    //   109: dup2
    //   110: bipush #48
    //   112: lshl
    //   113: bipush #48
    //   115: lushr
    //   116: l2i
    //   117: istore #16
    //   119: pop2
    //   120: dup2
    //   121: ldc2_w 72111411391753
    //   124: lxor
    //   125: lstore #17
    //   127: dup2
    //   128: ldc2_w 14884698795839
    //   131: lxor
    //   132: lstore #19
    //   134: pop2
    //   135: iconst_0
    //   136: istore #24
    //   138: new java/util/HashSet
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: astore #25
    //   147: invokestatic a : ()I
    //   150: aload_1
    //   151: invokevirtual i : ()D
    //   154: iload #14
    //   156: iload #15
    //   158: i2s
    //   159: iload #16
    //   161: i2c
    //   162: invokestatic b : (DISC)I
    //   165: istore #26
    //   167: aload_1
    //   168: invokevirtual b : ()D
    //   171: iload #14
    //   173: iload #15
    //   175: i2s
    //   176: iload #16
    //   178: i2c
    //   179: invokestatic b : (DISC)I
    //   182: istore #27
    //   184: aload_1
    //   185: invokevirtual h : ()D
    //   188: iload #14
    //   190: iload #15
    //   192: i2s
    //   193: iload #16
    //   195: i2c
    //   196: invokestatic b : (DISC)I
    //   199: istore #28
    //   201: aload_1
    //   202: invokevirtual m : ()D
    //   205: lload #9
    //   207: invokestatic j : (DJ)I
    //   210: istore #29
    //   212: aload_1
    //   213: invokevirtual t : ()D
    //   216: lload #9
    //   218: invokestatic j : (DJ)I
    //   221: istore #30
    //   223: aload_1
    //   224: invokevirtual p : ()D
    //   227: lload #9
    //   229: invokestatic j : (DJ)I
    //   232: istore #31
    //   234: istore #23
    //   236: invokestatic b : ()I
    //   239: iload #23
    //   241: ifne -> 264
    //   244: bipush #12
    //   246: if_icmpgt -> 267
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: iconst_1
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: goto -> 268
    //   267: iconst_0
    //   268: istore #32
    //   270: iload #26
    //   272: istore #33
    //   274: iload #33
    //   276: iload #29
    //   278: if_icmpgt -> 756
    //   281: iload #28
    //   283: istore #34
    //   285: iload #34
    //   287: iload #31
    //   289: if_icmpgt -> 742
    //   292: iload #27
    //   294: iload #23
    //   296: ifne -> 276
    //   299: istore #35
    //   301: iload #35
    //   303: iload #30
    //   305: if_icmpgt -> 728
    //   308: aload_0
    //   309: iload #33
    //   311: iload #35
    //   313: iload #34
    //   315: invokestatic b : (Lorg/bukkit/World;III)Lorg/bukkit/block/Block;
    //   318: astore #36
    //   320: aload #36
    //   322: invokeinterface getType : ()Lorg/bukkit/Material;
    //   327: astore #37
    //   329: iload #23
    //   331: lload_2
    //   332: lconst_0
    //   333: lcmp
    //   334: ifle -> 739
    //   337: ifne -> 737
    //   340: aload #37
    //   342: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   345: if_acmpne -> 362
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   354: athrow
    //   355: goto -> 720
    //   358: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   361: athrow
    //   362: iload #24
    //   364: lload_2
    //   365: lconst_0
    //   366: lcmp
    //   367: iflt -> 419
    //   370: iload #23
    //   372: ifne -> 419
    //   375: ifne -> 632
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   384: athrow
    //   385: aload #36
    //   387: iload #23
    //   389: ifne -> 634
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   398: athrow
    //   399: aload #37
    //   401: astore #21
    //   403: astore #22
    //   405: iload #11
    //   407: i2c
    //   408: aload #22
    //   410: iload #12
    //   412: iload #13
    //   414: aload #21
    //   416: invokestatic b : (CLorg/bukkit/block/Block;IILorg/bukkit/Material;)Z
    //   419: lload_2
    //   420: lconst_0
    //   421: lcmp
    //   422: ifle -> 430
    //   425: ifeq -> 632
    //   428: iload #32
    //   430: iload #23
    //   432: ifne -> 466
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   441: athrow
    //   442: ifeq -> 469
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   451: athrow
    //   452: aload #36
    //   454: invokeinterface getData : ()B
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   465: athrow
    //   466: goto -> 476
    //   469: lload #17
    //   471: aload #36
    //   473: invokestatic b : (JLorg/bukkit/block/Block;)I
    //   476: istore #38
    //   478: iload #38
    //   480: lload_2
    //   481: lconst_0
    //   482: lcmp
    //   483: ifle -> 510
    //   486: bipush #8
    //   488: iload #23
    //   490: ifne -> 509
    //   493: if_icmplt -> 506
    //   496: goto -> 503
    //   499: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   502: athrow
    //   503: iconst_0
    //   504: istore #38
    //   506: iload #35
    //   508: iconst_1
    //   509: iadd
    //   510: i2f
    //   511: iload #38
    //   513: iconst_1
    //   514: iadd
    //   515: i2f
    //   516: ldc_w 9.0
    //   519: fdiv
    //   520: fsub
    //   521: fstore #39
    //   523: aload_1
    //   524: invokevirtual b : ()D
    //   527: fload #39
    //   529: f2d
    //   530: dcmpg
    //   531: iload #23
    //   533: lload_2
    //   534: lconst_0
    //   535: lcmp
    //   536: ifle -> 569
    //   539: ifne -> 567
    //   542: ifgt -> 632
    //   545: goto -> 552
    //   548: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   551: athrow
    //   552: aload_1
    //   553: invokevirtual t : ()D
    //   556: iload #35
    //   558: i2d
    //   559: dcmpl
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   566: athrow
    //   567: iload #23
    //   569: lload_2
    //   570: lconst_0
    //   571: lcmp
    //   572: ifle -> 616
    //   575: ifne -> 614
    //   578: iflt -> 632
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   587: athrow
    //   588: aload_1
    //   589: aload #36
    //   591: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   594: iload #6
    //   596: i2c
    //   597: swap
    //   598: iload #7
    //   600: swap
    //   601: iload #8
    //   603: i2c
    //   604: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   607: goto -> 614
    //   610: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   613: athrow
    //   614: iload #23
    //   616: ifne -> 630
    //   619: ifeq -> 632
    //   622: goto -> 629
    //   625: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   628: athrow
    //   629: iconst_1
    //   630: istore #24
    //   632: aload #36
    //   634: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   637: aload #37
    //   639: lload #4
    //   641: invokestatic b : (Lorg/bukkit/block/Block;Lme/rerere/matrix/internal/ya;Lorg/bukkit/Material;J)[Lme/rerere/matrix/internal/sa;
    //   644: astore #38
    //   646: aload #38
    //   648: arraylength
    //   649: iload #23
    //   651: ifne -> 719
    //   654: ifeq -> 700
    //   657: goto -> 664
    //   660: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   663: athrow
    //   664: aload_1
    //   665: lload #19
    //   667: aload #38
    //   669: invokevirtual b : (J[Lme/rerere/matrix/internal/sa;)Z
    //   672: iload #23
    //   674: ifne -> 719
    //   677: goto -> 684
    //   680: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   683: athrow
    //   684: lload_2
    //   685: lconst_0
    //   686: lcmp
    //   687: ifle -> 725
    //   690: ifeq -> 720
    //   693: goto -> 700
    //   696: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   699: athrow
    //   700: aload #25
    //   702: aload #36
    //   704: invokestatic b : (Lorg/bukkit/block/Block;)Lorg/bukkit/Material;
    //   707: invokeinterface add : (Ljava/lang/Object;)Z
    //   712: goto -> 719
    //   715: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   718: athrow
    //   719: pop
    //   720: iinc #35, 1
    //   723: iload #23
    //   725: ifeq -> 301
    //   728: lload_2
    //   729: lconst_0
    //   730: lcmp
    //   731: ifle -> 737
    //   734: iinc #34, 1
    //   737: iload #23
    //   739: ifeq -> 285
    //   742: iinc #33, 1
    //   745: iload #23
    //   747: lload_2
    //   748: lconst_0
    //   749: lcmp
    //   750: ifle -> 294
    //   753: ifeq -> 274
    //   756: new me/rerere/matrix/thirdparty/kotlin/Pair
    //   759: dup
    //   760: aload #25
    //   762: iload #24
    //   764: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   767: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   770: areturn
    // Exception table:
    //   from	to	target	type
    //   236	249	252	java/lang/RuntimeException
    //   244	257	260	java/lang/RuntimeException
    //   329	348	351	java/lang/RuntimeException
    //   340	358	358	java/lang/RuntimeException
    //   362	378	381	java/lang/RuntimeException
    //   375	392	395	java/lang/RuntimeException
    //   419	435	438	java/lang/RuntimeException
    //   428	445	448	java/lang/RuntimeException
    //   442	459	462	java/lang/RuntimeException
    //   478	496	499	java/lang/RuntimeException
    //   523	545	548	java/lang/RuntimeException
    //   542	560	563	java/lang/RuntimeException
    //   567	581	584	java/lang/RuntimeException
    //   578	607	610	java/lang/RuntimeException
    //   614	622	625	java/lang/RuntimeException
    //   646	657	660	java/lang/RuntimeException
    //   654	677	680	java/lang/RuntimeException
    //   664	693	696	java/lang/RuntimeException
    //   684	712	715	java/lang/RuntimeException
  }
  
  public static boolean b(@NotNull Location paramLocation, @NotNull yl paramyl, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ja.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 58973754511893
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
    //   41: ldc2_w 63842408714461
    //   44: lxor
    //   45: lstore #7
    //   47: pop2
    //   48: new me/rerere/matrix/internal/sa
    //   51: dup
    //   52: aload_0
    //   53: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   56: ldc2_w 0.30000001192
    //   59: ldc2_w 1.7999999523162842
    //   62: invokespecial <init> : (Lorg/bukkit/util/Vector;DD)V
    //   65: astore #10
    //   67: invokestatic a : ()I
    //   70: aload_0
    //   71: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   74: lload #7
    //   76: dup2_x1
    //   77: pop2
    //   78: aload #10
    //   80: aload_1
    //   81: invokestatic b : (JLorg/bukkit/World;Lme/rerere/matrix/internal/sa;Lme/rerere/matrix/internal/yl;)Ljava/util/List;
    //   84: invokeinterface iterator : ()Ljava/util/Iterator;
    //   89: astore #11
    //   91: istore #9
    //   93: aload #11
    //   95: invokeinterface hasNext : ()Z
    //   100: ifeq -> 170
    //   103: aload #11
    //   105: invokeinterface next : ()Ljava/lang/Object;
    //   110: checkcast me/rerere/matrix/internal/sa
    //   113: astore #12
    //   115: aload #12
    //   117: iload #4
    //   119: i2c
    //   120: iload #5
    //   122: aload #10
    //   124: iload #6
    //   126: i2c
    //   127: invokevirtual j : (CILme/rerere/matrix/internal/sa;C)Z
    //   130: iload #9
    //   132: lload_2
    //   133: lconst_0
    //   134: lcmp
    //   135: ifle -> 143
    //   138: ifne -> 171
    //   141: iload #9
    //   143: ifne -> 164
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: ifeq -> 165
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: iconst_0
    //   164: ireturn
    //   165: iload #9
    //   167: ifeq -> 93
    //   170: iconst_1
    //   171: ireturn
    // Exception table:
    //   from	to	target	type
    //   115	146	149	java/lang/RuntimeException
    //   141	156	159	java/lang/RuntimeException
  }
  
  public static void u(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] I() {
    return a;
  }
  
  static {
    long l = c ^ 0x4089AD242016L;
    u(new yk[3]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[20];
    boolean bool = false;
    String str;
    int i = (str = "em¿\000eRI´A7Q§6Ç}»ÝEÉ\033=\0304/Ö]ã\000\020þåìëòÖræú\024\034MËÆñ\020¾`t¸\000U\023ìBËFð@üg¤aWÕÆ\róyrJ35µ=ð\035-0Èm\007\032Öª£ßãÃ\004ö«ïC%½A¼âú÷È\022=ªNor\t\006 _µ>ú(sª×máNåFµ¯è\006}ý\000²ýÒ!\003\020Pµ_Èý\027£Ìçë\017KÂ\037\030;[ÎülÚÐÛç2T\035w«\"´O­)}GH=\020Kíó\f\027.Á6\no]¼Q \030¢æV¸¬3M÷\005\023|\013zhi»ì\001Ì2ùÁ\n}bëM\0204òàëmÞdc\020WÑ{\020©/ñqøb±- +×ÂT\0209\030âèí;¨IpiXÚ ûý[ßmÍ}ÍÍ\0205o\\@\026¢GB¥È·2sÁM\020\035¼6\032æ¹X.V³Û\000¥/b\030>sóÀR\034Æü×L\005õç\034$\035§è±½\0330?(V°¾/8ÿùød6ÈæRü ÜÌì$7I&þ\037c4|6\tß\023Ìÿ· \032±\001é2\024q LÜMÅÇ«nì\\ÊÏ¦3½\002\024¸9(\034 \033ú®¥ä\021RÙ½TZ^<E\"T¦ëôE¼IûQô~Yd\t?0ý%*aÞ\002ìHm\031lü\\#nýºþØþ'Ü¤\030l\t4ÖÒØ\031;Ó\002Òj8\"5]").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xA5D;
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
        throw new RuntimeException("me/rerere/matrix/internal/ja", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ja'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */