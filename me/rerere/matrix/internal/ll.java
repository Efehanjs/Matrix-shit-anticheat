package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;

public class ll extends zk {
  private static final long a = o3.a(5061177647941946058L, 8407344593018752719L, MethodHandles.lookup().lookupClass()).a(129504269753206L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ll.a : J
    //   3: ldc2_w 66777439439547
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 52505769969781
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 37579749197918
    //   22: lxor
    //   23: dup2
    //   24: bipush #32
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #32
    //   33: lshl
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #9
    //   40: dup2
    //   41: bipush #48
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #10
    //   50: pop2
    //   51: dup2
    //   52: ldc2_w 123110145825184
    //   55: lxor
    //   56: lstore #11
    //   58: dup2
    //   59: ldc2_w 109992742654387
    //   62: lxor
    //   63: dup2
    //   64: bipush #16
    //   66: lushr
    //   67: lstore #13
    //   69: dup2
    //   70: bipush #48
    //   72: lshl
    //   73: bipush #48
    //   75: lushr
    //   76: l2i
    //   77: istore #15
    //   79: pop2
    //   80: dup2
    //   81: ldc2_w 136466596799638
    //   84: lxor
    //   85: dup2
    //   86: bipush #48
    //   88: lushr
    //   89: l2i
    //   90: istore #16
    //   92: dup2
    //   93: bipush #16
    //   95: lshl
    //   96: bipush #16
    //   98: lushr
    //   99: lstore #17
    //   101: pop2
    //   102: pop2
    //   103: aload_1
    //   104: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   107: iload #8
    //   109: swap
    //   110: iload #9
    //   112: i2s
    //   113: swap
    //   114: iload #10
    //   116: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   119: istore #19
    //   121: aload_1
    //   122: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   125: astore #20
    //   127: aload #20
    //   129: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   134: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   137: if_acmpeq -> 165
    //   140: aload #20
    //   142: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   147: getstatic org/bukkit/GameMode.ADVENTURE : Lorg/bukkit/GameMode;
    //   150: if_acmpeq -> 165
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: return
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: iload #19
    //   167: ifeq -> 449
    //   170: aload_2
    //   171: invokevirtual getY : ()D
    //   174: dconst_1
    //   175: drem
    //   176: dconst_0
    //   177: dcmpl
    //   178: ifne -> 449
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload_3
    //   189: invokevirtual getY : ()D
    //   192: dconst_1
    //   193: drem
    //   194: dconst_0
    //   195: dcmpl
    //   196: ifne -> 449
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   205: athrow
    //   206: aload_3
    //   207: invokevirtual getY : ()D
    //   210: aload_2
    //   211: invokevirtual getY : ()D
    //   214: dcmpl
    //   215: ifne -> 449
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: aload_2
    //   226: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   229: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   232: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   237: invokeinterface getType : ()Lorg/bukkit/Material;
    //   242: getstatic org/bukkit/Material.CACTUS : Lorg/bukkit/Material;
    //   245: if_acmpeq -> 285
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: aload_3
    //   256: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   259: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   262: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   267: invokeinterface getType : ()Lorg/bukkit/Material;
    //   272: getstatic org/bukkit/Material.CACTUS : Lorg/bukkit/Material;
    //   275: if_acmpne -> 449
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: aload_3
    //   286: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   289: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   292: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   297: astore #21
    //   299: iconst_0
    //   300: istore #22
    //   302: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   305: astore #23
    //   307: aload #23
    //   309: arraylength
    //   310: istore #24
    //   312: iconst_0
    //   313: istore #25
    //   315: iload #25
    //   317: iload #24
    //   319: if_icmpge -> 369
    //   322: aload #23
    //   324: iload #25
    //   326: aaload
    //   327: astore #26
    //   329: aload #21
    //   331: aload #26
    //   333: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   338: lload #11
    //   340: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   343: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   346: invokestatic j : ([Lme/rerere/matrix/internal/sa;)D
    //   349: aload_3
    //   350: invokevirtual getY : ()D
    //   353: dcmpl
    //   354: ifne -> 363
    //   357: iconst_1
    //   358: istore #22
    //   360: goto -> 369
    //   363: iinc #25, 1
    //   366: goto -> 315
    //   369: iload #22
    //   371: ifne -> 449
    //   374: aload #20
    //   376: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   381: invokevirtual getY : ()D
    //   384: dconst_0
    //   385: dcmpg
    //   386: ifge -> 449
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   395: athrow
    //   396: aload_0
    //   397: lload #6
    //   399: sipush #17337
    //   402: ldc2_w 3366685043590855645
    //   405: lload #4
    //   407: lxor
    //   408: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   413: sipush #23971
    //   416: ldc2_w 3080930893729555908
    //   419: lload #4
    //   421: lxor
    //   422: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   427: bipush #10
    //   429: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   432: aload #20
    //   434: ldc2_w 2.0
    //   437: invokeinterface damage : (D)V
    //   442: goto -> 449
    //   445: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   448: athrow
    //   449: invokestatic b : ()I
    //   452: bipush #14
    //   454: if_icmplt -> 684
    //   457: iload #19
    //   459: ifeq -> 684
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   468: athrow
    //   469: aload_3
    //   470: invokevirtual getY : ()D
    //   473: aload_2
    //   474: invokevirtual getY : ()D
    //   477: dcmpl
    //   478: iflt -> 684
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   487: athrow
    //   488: aload_2
    //   489: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   492: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   495: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   500: invokeinterface getType : ()Lorg/bukkit/Material;
    //   505: getstatic org/bukkit/Material.SWEET_BERRY_BUSH : Lorg/bukkit/Material;
    //   508: if_acmpne -> 684
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   517: athrow
    //   518: iconst_0
    //   519: istore #21
    //   521: aload_2
    //   522: lload #13
    //   524: iload #15
    //   526: i2s
    //   527: invokestatic b : (Lorg/bukkit/Location;JS)Ljava/util/List;
    //   530: invokeinterface iterator : ()Ljava/util/Iterator;
    //   535: astore #22
    //   537: aload #22
    //   539: invokeinterface hasNext : ()Z
    //   544: ifeq -> 601
    //   547: aload #22
    //   549: invokeinterface next : ()Ljava/lang/Object;
    //   554: checkcast org/bukkit/block/Block
    //   557: astore #23
    //   559: aload #23
    //   561: invokeinterface getType : ()Lorg/bukkit/Material;
    //   566: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   569: if_acmpeq -> 598
    //   572: aload #23
    //   574: invokeinterface getType : ()Lorg/bukkit/Material;
    //   579: getstatic org/bukkit/Material.SWEET_BERRY_BUSH : Lorg/bukkit/Material;
    //   582: if_acmpeq -> 598
    //   585: goto -> 592
    //   588: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   591: athrow
    //   592: iconst_1
    //   593: istore #21
    //   595: goto -> 601
    //   598: goto -> 537
    //   601: iload #21
    //   603: ifne -> 684
    //   606: aload_0
    //   607: lload #6
    //   609: sipush #25704
    //   612: ldc2_w 4022712657857633294
    //   615: lload #4
    //   617: lxor
    //   618: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   623: new java/lang/StringBuilder
    //   626: dup
    //   627: invokespecial <init> : ()V
    //   630: sipush #20520
    //   633: ldc2_w 7312970887441934413
    //   636: lload #4
    //   638: lxor
    //   639: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   644: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: aload_2
    //   648: iload #16
    //   650: i2c
    //   651: lload #17
    //   653: invokestatic b : (Lorg/bukkit/Location;CJ)Ljava/lang/String;
    //   656: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   659: invokevirtual toString : ()Ljava/lang/String;
    //   662: iconst_5
    //   663: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   666: aload_1
    //   667: aload_1
    //   668: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   671: invokevirtual clone : ()Lorg/bukkit/Location;
    //   674: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   677: goto -> 684
    //   680: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   683: athrow
    //   684: return
    // Exception table:
    //   from	to	target	type
    //   127	153	156	java/lang/RuntimeException
    //   140	161	161	java/lang/RuntimeException
    //   165	181	184	java/lang/RuntimeException
    //   170	199	202	java/lang/RuntimeException
    //   188	218	221	java/lang/RuntimeException
    //   206	248	251	java/lang/RuntimeException
    //   225	278	281	java/lang/RuntimeException
    //   369	389	392	java/lang/RuntimeException
    //   374	442	445	java/lang/RuntimeException
    //   449	462	465	java/lang/RuntimeException
    //   457	481	484	java/lang/RuntimeException
    //   469	511	514	java/lang/RuntimeException
    //   559	585	588	java/lang/RuntimeException
    //   601	677	680	java/lang/RuntimeException
  }
  
  public ll(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  static {
    long l = a ^ 0x7CCBEC08B1B4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = ":\000-iP«òQi¿J\0320âK\035\017 ååô/\002´ý\022ý0ÄºO§\006ë\005øª\024ïOÍi<¦e:\003\fü\002\031×5¬\001etÄO;\036ôåÝn@Æeã2r").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x23FB;
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
        throw new RuntimeException("me/rerere/matrix/internal/ll", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/ll'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */