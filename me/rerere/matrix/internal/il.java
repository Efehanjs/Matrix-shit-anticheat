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
import org.bukkit.command.CommandSender;

public final class il extends xl {
  @Nullable
  private final List i;
  
  private static final long a = o3.a(6677457504121785435L, 2667601875896772142L, MethodHandles.lookup().lookupClass()).a(229096746892206L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public il(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/il.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 12256741499250
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: sipush #27526
    //   18: ldc2_w 8154342188211300214
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   28: ldc ''
    //   30: sipush #19536
    //   33: ldc2_w 17623209883320492
    //   36: lload_1
    //   37: lxor
    //   38: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   43: lload_3
    //   44: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   47: dup
    //   48: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   51: sipush #30557
    //   54: ldc2_w 2459869519381593001
    //   57: lload_1
    //   58: lxor
    //   59: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   64: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   67: return
  }
  
  @Nullable
  public List b(long paramLong) {
    return this.i;
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, @NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 21532826850257
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 76365162294671
    //   12: lxor
    //   13: lstore #7
    //   15: pop2
    //   16: invokestatic a : ()I
    //   19: istore #9
    //   21: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   24: lload #5
    //   26: invokevirtual m : (J)Z
    //   29: iload #9
    //   31: ifne -> 72
    //   34: ifeq -> 68
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   43: athrow
    //   44: aload_1
    //   45: sipush #3548
    //   48: ldc2_w 7439684849692782292
    //   51: lload_2
    //   52: lxor
    //   53: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   58: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   63: return
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload_1
    //   69: instanceof org/bukkit/entity/Player
    //   72: ifne -> 253
    //   75: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   78: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   81: invokevirtual b : ()Z
    //   84: iload #9
    //   86: ifne -> 107
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: ifne -> 110
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: iconst_1
    //   107: goto -> 111
    //   110: iconst_0
    //   111: invokevirtual j : (Z)V
    //   114: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   117: invokevirtual b : ()Z
    //   120: lload_2
    //   121: lconst_0
    //   122: lcmp
    //   123: iflt -> 152
    //   126: ifeq -> 149
    //   129: sipush #10267
    //   132: ldc2_w 8895915674877594399
    //   135: lload_2
    //   136: lxor
    //   137: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   142: goto -> 162
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: sipush #8515
    //   152: ldc2_w 6874002300215067202
    //   155: lload_2
    //   156: lxor
    //   157: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   162: astore #10
    //   164: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   167: invokevirtual b : ()Z
    //   170: ifeq -> 183
    //   173: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   176: goto -> 186
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   186: astore #11
    //   188: aload_1
    //   189: new java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload #11
    //   204: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   207: sipush #11830
    //   210: ldc2_w 7937838276937321777
    //   213: lload_2
    //   214: lxor
    //   215: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload #10
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: sipush #27379
    //   231: ldc2_w 2131712693098367484
    //   234: lload_2
    //   235: lxor
    //   236: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: invokevirtual toString : ()Ljava/lang/String;
    //   247: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   252: return
    //   253: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   256: lload #7
    //   258: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   261: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   264: aload_1
    //   265: checkcast org/bukkit/entity/Player
    //   268: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   273: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   276: dup
    //   277: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   280: astore #10
    //   282: aload #10
    //   284: aload #10
    //   286: invokevirtual b : ()Z
    //   289: iload #9
    //   291: ifne -> 305
    //   294: ifne -> 308
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   303: athrow
    //   304: iconst_1
    //   305: goto -> 309
    //   308: iconst_0
    //   309: invokevirtual b : (Z)V
    //   312: aload #10
    //   314: invokevirtual b : ()Z
    //   317: iload #9
    //   319: lload_2
    //   320: lconst_0
    //   321: lcmp
    //   322: iflt -> 397
    //   325: ifne -> 396
    //   328: ifne -> 393
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: aload_1
    //   339: new java/lang/StringBuilder
    //   342: dup
    //   343: invokespecial <init> : ()V
    //   346: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   355: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   358: sipush #23656
    //   361: ldc2_w 6966205245540859752
    //   364: lload_2
    //   365: lxor
    //   366: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: invokevirtual toString : ()Ljava/lang/String;
    //   377: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   382: aload #10
    //   384: aconst_null
    //   385: invokevirtual b : (Ljava/util/UUID;)V
    //   388: return
    //   389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   392: athrow
    //   393: aload #4
    //   395: arraylength
    //   396: iconst_1
    //   397: lload_2
    //   398: lconst_0
    //   399: lcmp
    //   400: iflt -> 489
    //   403: iload #9
    //   405: ifne -> 489
    //   408: if_icmpne -> 467
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   417: athrow
    //   418: aload_1
    //   419: new java/lang/StringBuilder
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   435: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   438: sipush #16689
    //   441: ldc2_w 1611885125879325245
    //   444: lload_2
    //   445: lxor
    //   446: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: invokevirtual toString : ()Ljava/lang/String;
    //   457: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   462: return
    //   463: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   466: athrow
    //   467: aload #4
    //   469: iload #9
    //   471: lload_2
    //   472: lconst_0
    //   473: lcmp
    //   474: iflt -> 544
    //   477: ifne -> 543
    //   480: arraylength
    //   481: iconst_2
    //   482: goto -> 489
    //   485: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   488: athrow
    //   489: if_icmpeq -> 541
    //   492: aload_1
    //   493: new java/lang/StringBuilder
    //   496: dup
    //   497: invokespecial <init> : ()V
    //   500: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   509: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   512: sipush #30818
    //   515: ldc2_w 914665708517514081
    //   518: lload_2
    //   519: lxor
    //   520: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   525: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: invokevirtual toString : ()Ljava/lang/String;
    //   531: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   536: return
    //   537: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   540: athrow
    //   541: aload #4
    //   543: iconst_1
    //   544: aaload
    //   545: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   548: astore #12
    //   550: aload #12
    //   552: iload #9
    //   554: ifne -> 569
    //   557: ifnull -> 673
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   566: athrow
    //   567: aload #12
    //   569: astore #13
    //   571: aload #13
    //   573: astore #14
    //   575: iconst_0
    //   576: istore #15
    //   578: aload #10
    //   580: aload #14
    //   582: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   587: invokevirtual b : (Ljava/util/UUID;)V
    //   590: aload #13
    //   592: astore #14
    //   594: iconst_0
    //   595: istore #15
    //   597: aload_1
    //   598: new java/lang/StringBuilder
    //   601: dup
    //   602: invokespecial <init> : ()V
    //   605: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   608: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   611: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   614: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   617: sipush #30104
    //   620: ldc2_w 5316129995799615130
    //   623: lload_2
    //   624: lxor
    //   625: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: aload #14
    //   635: invokeinterface getName : ()Ljava/lang/String;
    //   640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: sipush #21814
    //   646: ldc2_w 8638703875201758776
    //   649: lload_2
    //   650: lxor
    //   651: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   656: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   659: invokevirtual toString : ()Ljava/lang/String;
    //   662: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   667: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   670: goto -> 674
    //   673: aconst_null
    //   674: ifnonnull -> 733
    //   677: aload_1
    //   678: new java/lang/StringBuilder
    //   681: dup
    //   682: invokespecial <init> : ()V
    //   685: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   691: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   694: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   697: sipush #13262
    //   700: ldc2_w 2282445602776912072
    //   703: lload_2
    //   704: lxor
    //   705: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   710: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   713: invokevirtual toString : ()Ljava/lang/String;
    //   716: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   721: iload #9
    //   723: ifeq -> 741
    //   726: goto -> 733
    //   729: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   732: athrow
    //   733: nop
    //   734: goto -> 741
    //   737: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   740: athrow
    //   741: return
    // Exception table:
    //   from	to	target	type
    //   21	37	40	java/lang/RuntimeException
    //   34	64	64	java/lang/RuntimeException
    //   72	89	92	java/lang/RuntimeException
    //   75	99	102	java/lang/RuntimeException
    //   111	145	145	java/lang/RuntimeException
    //   164	179	179	java/lang/RuntimeException
    //   282	297	300	java/lang/RuntimeException
    //   309	331	334	java/lang/RuntimeException
    //   328	389	389	java/lang/RuntimeException
    //   396	411	414	java/lang/RuntimeException
    //   408	463	463	java/lang/RuntimeException
    //   467	482	485	java/lang/RuntimeException
    //   489	537	537	java/lang/RuntimeException
    //   550	560	563	java/lang/RuntimeException
    //   674	726	729	java/lang/RuntimeException
    //   677	734	737	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x4CFC16B89BBDL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "juA\020»Q{µ\001/\0005³(\035Z¼öcqÖ~YêÄ\037?èNmk&ââæE0 R'U\031[^¹8úîU\034©ßûT>©\002{W'\037æ\016ç//\027®GY·:\"ß\032ÆÉx-\021\nõ^ê×ï+&\trtBþ³± \002BîÄ1Ñ6u½#¤a\0056ãyG\017Sd_¤\003}ã·óoHR[ªcf{\023ºG¼\f\032Ú\032ßD§#w\007câàº\017ÈV¶¤f_ùt\023aÚADü=:Eû¶Å~ó|´ýÓqÚ\017R*I/}P¸ ßñEQN`d¬ØÆ½<7u§:m4[h0l-yg½= tÔÐ0\001-#Zx5\007EQçRHÑa!\025ì\021 O\032»-\001»K0PH\026¯T6â#J\017ëÎL'Ú\rçõÃ3ê¤·´gTÐÂ¼}ÏU\005\027êQMáò\000H\006æQ\004rÇ\022(æ6\036Á]1ÉÆ©65}KÎ<·Þ\f\007Oz3~é°-í\n¶Ißñzî8ÙòÁ:æ\013{\023\b>\002dO\020{\030Øïóßß\027»¶ t\000áT|¤\022/ê|/ñ8i'\023ÜÊÀ\b &üKGýÜ8Ðx\\Nw\034Ñ\035|Y«¨\003%Ç^$K/Ó\020x:ÓêûñîÌ[f\033³\nª0µk&r¦\r£8\005$\013\032!æNºJ\031\007§¨ª·@\013eÐìx\017§HED1â\000\021}7+").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3058;
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
        throw new RuntimeException("me/rerere/matrix/internal/il", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/il'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\il.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */