package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class fa {
  private static final Material[] z;
  
  private static final sa[] k;
  
  private static final Material v;
  
  @Nullable
  private static final Material b;
  
  private static final Material i;
  
  private static final long a = o3.a(6680001908606074390L, -5134473227488150805L, MethodHandles.lookup().lookupClass()).a(254681783480775L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public static boolean b(@Nullable Material paramMaterial) {
    try {
      if (paramMaterial == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (Material material : z) {
      try {
        if (material == paramMaterial)
          return true; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static sa[] b(@Nullable Block paramBlock, @NotNull ya paramya, @NotNull yl paramyl, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fa.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 6867340580357
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 102955693240561
    //   18: lxor
    //   19: lstore #7
    //   21: dup2
    //   22: ldc2_w 7538657893972
    //   25: lxor
    //   26: lstore #9
    //   28: dup2
    //   29: ldc2_w 51432359609565
    //   32: lxor
    //   33: dup2
    //   34: bipush #32
    //   36: lushr
    //   37: l2i
    //   38: istore #11
    //   40: dup2
    //   41: bipush #32
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #12
    //   50: dup2
    //   51: bipush #48
    //   53: lshl
    //   54: bipush #48
    //   56: lushr
    //   57: l2i
    //   58: istore #13
    //   60: pop2
    //   61: pop2
    //   62: aload_0
    //   63: invokestatic b : (Lorg/bukkit/block/Block;)Lorg/bukkit/Material;
    //   66: astore #14
    //   68: aload_0
    //   69: ifnull -> 87
    //   72: aload #14
    //   74: invokestatic r : (Lorg/bukkit/Material;)Z
    //   77: ifeq -> 95
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: getstatic me/rerere/matrix/internal/fa.k : [Lme/rerere/matrix/internal/sa;
    //   90: areturn
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload #14
    //   97: invokestatic b : (Lorg/bukkit/Material;)Z
    //   100: ifeq -> 119
    //   103: iconst_1
    //   104: anewarray me/rerere/matrix/internal/sa
    //   107: dup
    //   108: iconst_0
    //   109: aload_0
    //   110: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   113: aastore
    //   114: areturn
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: invokestatic b : ()Z
    //   122: ifeq -> 216
    //   125: aload_1
    //   126: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   129: if_acmpne -> 216
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload #14
    //   141: getstatic me/rerere/matrix/internal/fa.v : Lorg/bukkit/Material;
    //   144: if_acmpne -> 216
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: aload_2
    //   155: invokevirtual b : ()I
    //   158: getstatic me/rerere/matrix/internal/q.s : Lme/rerere/matrix/internal/q;
    //   161: invokevirtual p : ()I
    //   164: if_icmple -> 204
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload_0
    //   175: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   178: astore #15
    //   180: aload #15
    //   182: aload #15
    //   184: invokevirtual b : ()D
    //   187: ldc2_w 0.9375
    //   190: dadd
    //   191: invokevirtual j : (D)V
    //   194: iconst_1
    //   195: anewarray me/rerere/matrix/internal/sa
    //   198: dup
    //   199: iconst_0
    //   200: aload #15
    //   202: aastore
    //   203: areturn
    //   204: iconst_1
    //   205: anewarray me/rerere/matrix/internal/sa
    //   208: dup
    //   209: iconst_0
    //   210: aload_0
    //   211: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   214: aastore
    //   215: areturn
    //   216: invokestatic b : ()I
    //   219: bipush #8
    //   221: if_icmple -> 299
    //   224: invokestatic b : ()Z
    //   227: ifeq -> 299
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   236: athrow
    //   237: aload_1
    //   238: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   241: if_acmpne -> 299
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: aload #14
    //   253: getstatic me/rerere/matrix/internal/fa.b : Lorg/bukkit/Material;
    //   256: if_acmpne -> 299
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: aload_2
    //   267: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   270: getstatic me/rerere/matrix/internal/q.s : Lme/rerere/matrix/internal/q;
    //   273: if_acmpne -> 299
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: iconst_1
    //   284: anewarray me/rerere/matrix/internal/sa
    //   287: dup
    //   288: iconst_0
    //   289: aload_0
    //   290: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   293: aastore
    //   294: areturn
    //   295: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   298: athrow
    //   299: invokestatic b : ()I
    //   302: bipush #14
    //   304: if_icmplt -> 350
    //   307: aload #14
    //   309: getstatic org/bukkit/Material.BAMBOO : Lorg/bukkit/Material;
    //   312: if_acmpne -> 350
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   321: athrow
    //   322: aload_1
    //   323: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   326: if_acmpne -> 350
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload_0
    //   337: lload #7
    //   339: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   342: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   345: areturn
    //   346: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   349: athrow
    //   350: invokestatic b : ()Z
    //   353: ifeq -> 506
    //   356: aload #14
    //   358: getstatic me/rerere/matrix/internal/fa.i : Lorg/bukkit/Material;
    //   361: if_acmpne -> 506
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   370: athrow
    //   371: aload_0
    //   372: invokeinterface getX : ()I
    //   377: istore #15
    //   379: aload_0
    //   380: invokeinterface getY : ()I
    //   385: istore #16
    //   387: aload_0
    //   388: invokeinterface getZ : ()I
    //   393: istore #17
    //   395: aload_2
    //   396: invokevirtual b : ()I
    //   399: getstatic me/rerere/matrix/internal/q.s : Lme/rerere/matrix/internal/q;
    //   402: invokevirtual p : ()I
    //   405: if_icmple -> 465
    //   408: iconst_1
    //   409: anewarray me/rerere/matrix/internal/sa
    //   412: dup
    //   413: iconst_0
    //   414: new me/rerere/matrix/internal/sa
    //   417: dup
    //   418: iload #15
    //   420: i2d
    //   421: ldc2_w 0.0625
    //   424: dadd
    //   425: iload #16
    //   427: i2d
    //   428: iload #17
    //   430: i2d
    //   431: ldc2_w 0.0625
    //   434: dadd
    //   435: iload #15
    //   437: i2d
    //   438: ldc2_w 0.9375
    //   441: dadd
    //   442: iload #16
    //   444: i2d
    //   445: ldc2_w 0.09375
    //   448: dadd
    //   449: iload #17
    //   451: i2d
    //   452: ldc2_w 0.9375
    //   455: dadd
    //   456: invokespecial <init> : (DDDDDD)V
    //   459: aastore
    //   460: areturn
    //   461: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   464: athrow
    //   465: iconst_1
    //   466: anewarray me/rerere/matrix/internal/sa
    //   469: dup
    //   470: iconst_0
    //   471: new me/rerere/matrix/internal/sa
    //   474: dup
    //   475: iload #15
    //   477: i2d
    //   478: iload #16
    //   480: i2d
    //   481: iload #17
    //   483: i2d
    //   484: iload #15
    //   486: i2d
    //   487: dconst_1
    //   488: dadd
    //   489: iload #16
    //   491: i2f
    //   492: ldc 0.015625
    //   494: fadd
    //   495: f2d
    //   496: iload #17
    //   498: i2d
    //   499: dconst_1
    //   500: dadd
    //   501: invokespecial <init> : (DDDDDD)V
    //   504: aastore
    //   505: areturn
    //   506: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   509: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   512: iload #11
    //   514: iload #12
    //   516: iload #13
    //   518: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   521: astore #15
    //   523: aload #15
    //   525: aload_0
    //   526: lload #9
    //   528: aload_1
    //   529: invokeinterface b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   534: astore #16
    //   536: aload #16
    //   538: ifnonnull -> 613
    //   541: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   544: new java/lang/StringBuilder
    //   547: dup
    //   548: invokespecial <init> : ()V
    //   551: sipush #24131
    //   554: ldc2_w 6163857023989445855
    //   557: lload_3
    //   558: lxor
    //   559: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   564: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: aload_0
    //   568: invokeinterface getType : ()Lorg/bukkit/Material;
    //   573: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   576: sipush #1881
    //   579: ldc2_w 8137989457091997127
    //   582: lload_3
    //   583: lxor
    //   584: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: lload #5
    //   594: invokestatic b : (J)Ljava/lang/String;
    //   597: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   600: invokevirtual toString : ()Ljava/lang/String;
    //   603: invokevirtual println : (Ljava/lang/String;)V
    //   606: goto -> 613
    //   609: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   612: athrow
    //   613: aload #16
    //   615: areturn
    // Exception table:
    //   from	to	target	type
    //   68	80	83	java/lang/RuntimeException
    //   72	91	91	java/lang/RuntimeException
    //   95	115	115	java/lang/RuntimeException
    //   119	132	135	java/lang/RuntimeException
    //   125	147	150	java/lang/RuntimeException
    //   139	167	170	java/lang/RuntimeException
    //   216	230	233	java/lang/RuntimeException
    //   224	244	247	java/lang/RuntimeException
    //   237	259	262	java/lang/RuntimeException
    //   251	276	279	java/lang/RuntimeException
    //   266	295	295	java/lang/RuntimeException
    //   299	315	318	java/lang/RuntimeException
    //   307	329	332	java/lang/RuntimeException
    //   322	346	346	java/lang/RuntimeException
    //   350	364	367	java/lang/RuntimeException
    //   395	461	461	java/lang/RuntimeException
    //   536	606	609	java/lang/RuntimeException
  }
  
  public static double p(sa[] paramArrayOfsa) {
    try {
      if (paramArrayOfsa.length == 0)
        return 0.0D; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramArrayOfsa[0].c();
  }
  
  public static sa[] b(Block paramBlock, ya paramya, Material paramMaterial, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fa.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 109957528576688
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 110933318675169
    //   18: lxor
    //   19: lstore #7
    //   21: dup2
    //   22: ldc2_w 84630477566056
    //   25: lxor
    //   26: dup2
    //   27: bipush #32
    //   29: lushr
    //   30: l2i
    //   31: istore #9
    //   33: dup2
    //   34: bipush #32
    //   36: lshl
    //   37: bipush #48
    //   39: lushr
    //   40: l2i
    //   41: istore #10
    //   43: dup2
    //   44: bipush #48
    //   46: lshl
    //   47: bipush #48
    //   49: lushr
    //   50: l2i
    //   51: istore #11
    //   53: pop2
    //   54: pop2
    //   55: aload_0
    //   56: ifnull -> 73
    //   59: aload_2
    //   60: invokestatic r : (Lorg/bukkit/Material;)Z
    //   63: ifeq -> 81
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: getstatic me/rerere/matrix/internal/fa.k : [Lme/rerere/matrix/internal/sa;
    //   76: areturn
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: aload_2
    //   82: invokestatic b : (Lorg/bukkit/Material;)Z
    //   85: ifeq -> 104
    //   88: iconst_1
    //   89: anewarray me/rerere/matrix/internal/sa
    //   92: dup
    //   93: iconst_0
    //   94: aload_0
    //   95: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   98: aastore
    //   99: areturn
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: invokestatic b : ()I
    //   107: bipush #8
    //   109: if_icmple -> 142
    //   112: aload_2
    //   113: invokestatic l : (Lorg/bukkit/Material;)Z
    //   116: ifeq -> 142
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: iconst_1
    //   127: anewarray me/rerere/matrix/internal/sa
    //   130: dup
    //   131: iconst_0
    //   132: aload_0
    //   133: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   136: aastore
    //   137: areturn
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   145: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   148: iload #9
    //   150: iload #10
    //   152: iload #11
    //   154: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   157: astore #12
    //   159: aload #12
    //   161: aload_0
    //   162: lload #7
    //   164: aload_1
    //   165: invokeinterface b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   170: astore #13
    //   172: aload #13
    //   174: ifnonnull -> 249
    //   177: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   180: new java/lang/StringBuilder
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: sipush #24131
    //   190: ldc2_w 6163749424689627242
    //   193: lload_3
    //   194: lxor
    //   195: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: aload_0
    //   204: invokeinterface getType : ()Lorg/bukkit/Material;
    //   209: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   212: sipush #1881
    //   215: ldc2_w 8137881882824841586
    //   218: lload_3
    //   219: lxor
    //   220: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: lload #5
    //   230: invokestatic b : (J)Ljava/lang/String;
    //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual toString : ()Ljava/lang/String;
    //   239: invokevirtual println : (Ljava/lang/String;)V
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: aload #13
    //   251: areturn
    // Exception table:
    //   from	to	target	type
    //   55	66	69	java/lang/RuntimeException
    //   59	77	77	java/lang/RuntimeException
    //   81	100	100	java/lang/RuntimeException
    //   104	119	122	java/lang/RuntimeException
    //   112	138	138	java/lang/RuntimeException
    //   172	242	245	java/lang/RuntimeException
  }
  
  public static boolean b(long paramLong, @NotNull Block paramBlock) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x45104A4284BFL;
    try {
      if (da.r(paramBlock.getType()))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((b(paramBlock, l, ya.b)).length == 0);
  }
  
  public static boolean b(@NotNull Block paramBlock, long paramLong, @NotNull Location paramLocation) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x1D6A81F2B479L;
    sa[] arrayOfSa = b(paramBlock, l, ya.b);
    try {
      if (arrayOfSa.length == 0)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramLocation.getY() >= b(arrayOfSa) && paramLocation.getY() <= j(arrayOfSa) + 0.031D) {
        Block block = na.b(paramBlock.getWorld(), paramBlock.getX(), paramBlock.getY() + 1, paramBlock.getZ());
        sa[] arrayOfSa1 = b(block, l, ya.b);
        try {
          if (arrayOfSa1.length != 0) {
            try {
              if (Arrays.<sa>stream(arrayOfSa1).anyMatch(paramsa -> {
                    try {
                      if (paramsa.j() >= 1.0D)
                        try {
                          if (paramsa.n() >= 1.0D) {
                            try {
                              if (paramsa.t() <= paramLocation.getY());
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            } 
                            return false;
                          } 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  }));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "¹\0310\016¾¹áoöÝ\035-õ=w\020ËÞ\013æ\032Ô¬\027{\r(£Å\020Ü,&³Z[ù&o½\030ãC»Ì\020,\033\035ä\001Ó\r\r\t¿Oþ¸(Ô>&\035B§×3WÁ \f\013J>M\fÛxÀÙq¬\033\026Iû1-\021¤îÊ´Ï\026 ^*A)HÕr-~ÊS#\001\013Î*½*\022µ3moQQÑ~/ ÜÙê\034Ù½ñ\fåRÿ¯\tÛ?£\022¿{\000ó¾×SÖÏ,nÈX\030®µ¸Ó\017Ð\036gõÏ5NÌ5õâèÌÈ\020ø»\022#BEÇ7m³g\023t¼(ó%Q¥¸ê\037O\027¢¾H=(à[b\b$êÚãÿqòWòDVAÉ± '¤").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public static sa b(long paramLong, @NotNull LivingEntity paramLivingEntity) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x66A9466A32E2L;
    int i = (int)((paramLong ^ 0x43C7CB3E3285L) >>> 32L);
    int j = (int)((paramLong ^ 0x43C7CB3E3285L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x43C7CB3E3285L) << 48L >>> 48L);
    paramLong ^ 0x43C7CB3E3285L;
    k k1 = Matrix.b().b().b(i, j, k);
    return k1.b(l, (Entity)paramLivingEntity);
  }
  
  public static double j(sa[] paramArrayOfsa) {
    return Stream.<sa>of(paramArrayOfsa).mapToDouble(sa::t).max().orElse(0.0D);
  }
  
  @Deprecated
  @NotNull
  public static sa j(short paramShort, char paramChar, @NotNull Block paramBlock, int paramInt) {
    long l = (paramShort << 48L | paramChar << 48L >>> 16L | paramInt << 32L >>> 32L) ^ a;
    int i = (int)((l ^ 0x56F01953B4B8L) >>> 32L);
    int j = (int)((l ^ 0x56F01953B4B8L) << 32L >>> 48L);
    int k = (int)((l ^ 0x56F01953B4B8L) << 48L >>> 48L);
    l ^ 0x56F01953B4B8L;
    k k1 = Matrix.b().b().b(i, j, k);
    return k1.b(paramBlock);
  }
  
  public static sa[] b(@Nullable Block paramBlock, long paramLong, @NotNull ya paramya) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fa.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 95727847536713
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 96712835936280
    //   18: lxor
    //   19: lstore #6
    //   21: dup2
    //   22: ldc2_w 140641031678609
    //   25: lxor
    //   26: dup2
    //   27: bipush #32
    //   29: lushr
    //   30: l2i
    //   31: istore #8
    //   33: dup2
    //   34: bipush #32
    //   36: lshl
    //   37: bipush #48
    //   39: lushr
    //   40: l2i
    //   41: istore #9
    //   43: dup2
    //   44: bipush #48
    //   46: lshl
    //   47: bipush #48
    //   49: lushr
    //   50: l2i
    //   51: istore #10
    //   53: pop2
    //   54: pop2
    //   55: aload_0
    //   56: invokestatic b : (Lorg/bukkit/block/Block;)Lorg/bukkit/Material;
    //   59: astore #11
    //   61: aload_0
    //   62: ifnull -> 80
    //   65: aload #11
    //   67: invokestatic r : (Lorg/bukkit/Material;)Z
    //   70: ifeq -> 88
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: getstatic me/rerere/matrix/internal/fa.k : [Lme/rerere/matrix/internal/sa;
    //   83: areturn
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload #11
    //   90: invokestatic b : (Lorg/bukkit/Material;)Z
    //   93: ifeq -> 112
    //   96: iconst_1
    //   97: anewarray me/rerere/matrix/internal/sa
    //   100: dup
    //   101: iconst_0
    //   102: aload_0
    //   103: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   106: aastore
    //   107: areturn
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: invokestatic b : ()I
    //   115: bipush #8
    //   117: if_icmple -> 151
    //   120: aload #11
    //   122: invokestatic l : (Lorg/bukkit/Material;)Z
    //   125: ifeq -> 151
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: iconst_1
    //   136: anewarray me/rerere/matrix/internal/sa
    //   139: dup
    //   140: iconst_0
    //   141: aload_0
    //   142: invokestatic b : (Lorg/bukkit/block/Block;)Lme/rerere/matrix/internal/sa;
    //   145: aastore
    //   146: areturn
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   154: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   157: iload #8
    //   159: iload #9
    //   161: iload #10
    //   163: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   166: astore #12
    //   168: aload #12
    //   170: aload_0
    //   171: lload #6
    //   173: aload_3
    //   174: invokeinterface b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   179: astore #13
    //   181: aload #13
    //   183: ifnonnull -> 258
    //   186: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   189: new java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: sipush #12891
    //   199: ldc2_w 7923122841403111040
    //   202: lload_1
    //   203: lxor
    //   204: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_0
    //   213: invokeinterface getType : ()Lorg/bukkit/Material;
    //   218: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   221: sipush #21444
    //   224: ldc2_w 7333573196222060317
    //   227: lload_1
    //   228: lxor
    //   229: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: lload #4
    //   239: invokestatic b : (J)Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: invokevirtual toString : ()Ljava/lang/String;
    //   248: invokevirtual println : (Ljava/lang/String;)V
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: aload #13
    //   260: areturn
    // Exception table:
    //   from	to	target	type
    //   61	73	76	java/lang/RuntimeException
    //   65	84	84	java/lang/RuntimeException
    //   88	108	108	java/lang/RuntimeException
    //   112	128	131	java/lang/RuntimeException
    //   120	147	147	java/lang/RuntimeException
    //   181	251	254	java/lang/RuntimeException
  }
  
  public static boolean b(sa[] paramArrayOfsa) {
    try {
      if (paramArrayOfsa.length == 1)
        try {
          if (paramArrayOfsa[0].j() == 1.0D)
            try {
              if (paramArrayOfsa[0].c() == 1.0D)
                try {
                  if (paramArrayOfsa[0].n() == 1.0D);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public static double b(sa[] paramArrayOfsa) {
    return Stream.<sa>of(paramArrayOfsa).mapToDouble(sa::t).min().orElse(0.0D);
  }
  
  public static sa b(@NotNull Block paramBlock) {
    return new sa(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ(), (paramBlock.getX() + 1), (paramBlock.getY() + 1), (paramBlock.getZ() + 1));
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x585A;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/fa", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/fa'
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
  
  static {
    long l = a ^ 0x1DB0CC3374AFL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */