package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
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
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public final class fn extends xl {
  @Nullable
  private final List i;
  
  private static final long a = o3.a(4150536266980591251L, -4778747892510734899L, MethodHandles.lookup().lookupClass()).a(100377955868390L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, @NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 76365162294671
    //   5: lxor
    //   6: lstore #5
    //   8: pop2
    //   9: invokestatic r : ()I
    //   12: istore #7
    //   14: aload #4
    //   16: iload #7
    //   18: ifeq -> 81
    //   21: arraylength
    //   22: iconst_3
    //   23: if_icmpge -> 79
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_1
    //   34: new java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: sipush #12443
    //   53: ldc2_w 8054435150169354369
    //   56: lload_2
    //   57: lxor
    //   58: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   74: return
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: aload #4
    //   81: iconst_1
    //   82: aaload
    //   83: invokestatic toIntOrNull : (Ljava/lang/String;)Ljava/lang/Integer;
    //   86: dup
    //   87: ifnull -> 100
    //   90: invokevirtual intValue : ()I
    //   93: goto -> 162
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: pop
    //   101: aload_0
    //   102: checkcast me/rerere/matrix/internal/fn
    //   105: astore #11
    //   107: iconst_0
    //   108: istore #12
    //   110: aload_1
    //   111: new java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   127: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   130: aload #4
    //   132: iconst_1
    //   133: aaload
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: sipush #32326
    //   140: ldc2_w 873592970195598939
    //   143: lload_2
    //   144: lxor
    //   145: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual toString : ()Ljava/lang/String;
    //   156: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   161: return
    //   162: istore #8
    //   164: aload #4
    //   166: invokestatic asSequence : ([Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   169: iconst_2
    //   170: invokestatic drop : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;I)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   173: ldc ' '
    //   175: checkcast java/lang/CharSequence
    //   178: aconst_null
    //   179: ldc ' '
    //   181: checkcast java/lang/CharSequence
    //   184: iconst_0
    //   185: aconst_null
    //   186: aconst_null
    //   187: bipush #58
    //   189: aconst_null
    //   190: invokestatic joinToString$default : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   193: astore #10
    //   195: nop
    //   196: iconst_0
    //   197: istore #11
    //   199: aload #10
    //   201: checkcast java/lang/CharSequence
    //   204: astore #12
    //   206: iconst_0
    //   207: istore #13
    //   209: iconst_0
    //   210: istore #14
    //   212: aload #12
    //   214: invokeinterface length : ()I
    //   219: iconst_1
    //   220: isub
    //   221: istore #15
    //   223: iconst_0
    //   224: istore #16
    //   226: iload #14
    //   228: iload #15
    //   230: if_icmpgt -> 394
    //   233: iload #16
    //   235: iload #7
    //   237: ifeq -> 252
    //   240: ifne -> 255
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: iload #14
    //   252: goto -> 257
    //   255: iload #15
    //   257: istore #17
    //   259: aload #12
    //   261: iload #17
    //   263: invokeinterface charAt : (I)C
    //   268: istore #18
    //   270: iconst_0
    //   271: istore #19
    //   273: iload #18
    //   275: bipush #32
    //   277: invokestatic compare : (II)I
    //   280: iload #7
    //   282: ifeq -> 296
    //   285: ifgt -> 299
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   294: athrow
    //   295: iconst_1
    //   296: goto -> 300
    //   299: iconst_0
    //   300: istore #18
    //   302: iload #16
    //   304: iload #7
    //   306: ifeq -> 379
    //   309: ifne -> 377
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: iload #18
    //   321: lload_2
    //   322: lconst_0
    //   323: lcmp
    //   324: ifle -> 354
    //   327: iload #7
    //   329: ifeq -> 350
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   338: athrow
    //   339: ifne -> 363
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   348: athrow
    //   349: iconst_1
    //   350: istore #16
    //   352: iload #7
    //   354: lload_2
    //   355: lconst_0
    //   356: lcmp
    //   357: ifle -> 368
    //   360: ifne -> 226
    //   363: iinc #14, 1
    //   366: iload #7
    //   368: lload_2
    //   369: lconst_0
    //   370: lcmp
    //   371: ifle -> 228
    //   374: ifne -> 226
    //   377: iload #18
    //   379: ifne -> 385
    //   382: goto -> 394
    //   385: iinc #15, -1
    //   388: nop
    //   389: iload #7
    //   391: ifne -> 226
    //   394: aload #12
    //   396: iload #14
    //   398: iload #15
    //   400: iconst_1
    //   401: iadd
    //   402: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   407: invokevirtual toString : ()Ljava/lang/String;
    //   410: astore #9
    //   412: lload_2
    //   413: lconst_0
    //   414: lcmp
    //   415: ifle -> 226
    //   418: aload_1
    //   419: aload #9
    //   421: <illegal opcode> run : (Lorg/bukkit/command/CommandSender;Ljava/lang/String;)Ljava/lang/Runnable;
    //   426: astore #10
    //   428: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   431: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   434: lload #5
    //   436: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   439: checkcast org/bukkit/plugin/Plugin
    //   442: aload #10
    //   444: iload #8
    //   446: i2l
    //   447: ldc2_w 20
    //   450: lmul
    //   451: invokeinterface runTaskLater : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;J)Lorg/bukkit/scheduler/BukkitTask;
    //   456: pop
    //   457: aload_1
    //   458: new java/lang/StringBuilder
    //   461: dup
    //   462: invokespecial <init> : ()V
    //   465: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   474: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   477: sipush #24978
    //   480: ldc2_w 6942543050515472780
    //   483: lload_2
    //   484: lxor
    //   485: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: iload #8
    //   495: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   498: sipush #13153
    //   501: ldc2_w 1554121480843735933
    //   504: lload_2
    //   505: lxor
    //   506: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: getstatic org/bukkit/ChatColor.WHITE : Lorg/bukkit/ChatColor;
    //   517: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   520: aload #9
    //   522: astore #11
    //   524: astore #22
    //   526: astore #21
    //   528: iconst_0
    //   529: istore #12
    //   531: aload #11
    //   533: checkcast java/lang/CharSequence
    //   536: astore #13
    //   538: iconst_0
    //   539: istore #14
    //   541: iconst_0
    //   542: istore #15
    //   544: aload #13
    //   546: invokeinterface length : ()I
    //   551: iconst_1
    //   552: isub
    //   553: istore #16
    //   555: iconst_0
    //   556: istore #17
    //   558: iload #15
    //   560: iload #16
    //   562: if_icmpgt -> 726
    //   565: iload #17
    //   567: iload #7
    //   569: ifeq -> 584
    //   572: ifne -> 587
    //   575: goto -> 582
    //   578: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   581: athrow
    //   582: iload #15
    //   584: goto -> 589
    //   587: iload #16
    //   589: istore #18
    //   591: aload #13
    //   593: iload #18
    //   595: invokeinterface charAt : (I)C
    //   600: istore #19
    //   602: iconst_0
    //   603: istore #20
    //   605: iload #19
    //   607: bipush #32
    //   609: invokestatic compare : (II)I
    //   612: iload #7
    //   614: ifeq -> 628
    //   617: ifgt -> 631
    //   620: goto -> 627
    //   623: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   626: athrow
    //   627: iconst_1
    //   628: goto -> 632
    //   631: iconst_0
    //   632: istore #19
    //   634: iload #17
    //   636: iload #7
    //   638: ifeq -> 711
    //   641: ifne -> 709
    //   644: goto -> 651
    //   647: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   650: athrow
    //   651: iload #19
    //   653: lload_2
    //   654: lconst_0
    //   655: lcmp
    //   656: ifle -> 686
    //   659: iload #7
    //   661: ifeq -> 682
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   670: athrow
    //   671: ifne -> 695
    //   674: goto -> 681
    //   677: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   680: athrow
    //   681: iconst_1
    //   682: istore #17
    //   684: iload #7
    //   686: lload_2
    //   687: lconst_0
    //   688: lcmp
    //   689: ifle -> 700
    //   692: ifne -> 558
    //   695: iinc #15, 1
    //   698: iload #7
    //   700: lload_2
    //   701: lconst_0
    //   702: lcmp
    //   703: iflt -> 560
    //   706: ifne -> 558
    //   709: iload #19
    //   711: ifne -> 717
    //   714: goto -> 726
    //   717: iinc #16, -1
    //   720: nop
    //   721: iload #7
    //   723: ifne -> 558
    //   726: aload #13
    //   728: iload #15
    //   730: iload #16
    //   732: iconst_1
    //   733: iadd
    //   734: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   739: invokevirtual toString : ()Ljava/lang/String;
    //   742: astore #23
    //   744: aload #21
    //   746: aload #22
    //   748: aload #23
    //   750: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: invokevirtual toString : ()Ljava/lang/String;
    //   756: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   761: lload_2
    //   762: lconst_0
    //   763: lcmp
    //   764: ifle -> 558
    //   767: return
    // Exception table:
    //   from	to	target	type
    //   14	26	29	java/lang/RuntimeException
    //   21	75	75	java/lang/RuntimeException
    //   81	96	96	java/lang/RuntimeException
    //   233	243	246	java/lang/RuntimeException
    //   273	288	291	java/lang/RuntimeException
    //   302	312	315	java/lang/RuntimeException
    //   309	332	335	java/lang/RuntimeException
    //   319	342	345	java/lang/RuntimeException
    //   565	575	578	java/lang/RuntimeException
    //   605	620	623	java/lang/RuntimeException
    //   634	644	647	java/lang/RuntimeException
    //   641	664	667	java/lang/RuntimeException
    //   651	674	677	java/lang/RuntimeException
  }
  
  @Nullable
  public List b(long paramLong) {
    return this.i;
  }
  
  public fn(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fn.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: sipush #424
    //   10: ldc2_w 7905753282522731896
    //   13: lload_1
    //   14: lxor
    //   15: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   20: sipush #18699
    //   23: ldc2_w 5824227280517406175
    //   26: lload_1
    //   27: lxor
    //   28: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   33: sipush #22881
    //   36: ldc2_w 171245015595224503
    //   39: lload_1
    //   40: lxor
    //   41: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   46: sipush #8611
    //   49: ldc2_w 6529630403519772020
    //   52: lload_1
    //   53: lxor
    //   54: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   59: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   62: return
  }
  
  static {
    long l = a ^ 0x55678B38EDD8L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "õ«WeÇ~\027t¾#Ò3Ên\\\030\016ðè}zda¶¢©qß)¡¥!ÊEm:HF(8Æ¶ùôfñ2÷1¸\025Ú¿\006nuN5 \f1q\"¸Û\016I'ëN\"rrÚ@ªúçM6úÊ\022À\"øKn¾øõ\rÁf°\031­;mL\"ÞÒÑ\\«uð]¯\035§ []×NË5m{»K]\004o(c\003Â.QíüzÍw\003±\"?Sägã:mÅeÙWö*¬±ÿ¼Ù¸\030\\£*É\0058r\025çÈíÂyeÖë\037Á\017ÐøúE³ï\fñ\036ÿ÷²2¸ö|\031\036^=69V\003¦Ëk@\006_7[°º\032d").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1343;
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
        throw new RuntimeException("me/rerere/matrix/internal/fn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/fn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */