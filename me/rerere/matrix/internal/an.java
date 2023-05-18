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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class an extends zk {
  private int x = 0;
  
  private static boolean z;
  
  private int k = 0;
  
  @Nullable
  private Vector v;
  
  private static int b;
  
  private static boolean i;
  
  private static final long a = o3.a(947220823781276497L, 4120108967460720758L, MethodHandles.lookup().lookupClass()).a(12653354622404L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/an.a : J
    //   3: ldc2_w 45320521339230
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #30136
    //   15: ldc2_w 5873333344057316994
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/an.z : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #17170
    //   41: ldc2_w 7892062829559668779
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   51: iconst_3
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/an.b : I
    //   60: aload_0
    //   61: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   64: sipush #7388
    //   67: ldc2_w 6738151312432709602
    //   70: lload_1
    //   71: lxor
    //   72: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   77: iconst_1
    //   78: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   83: putstatic me/rerere/matrix/internal/an.i : Z
    //   86: return
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/an.a : J
    //   3: ldc2_w 88771943953664
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 52505769969781
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 31452344419112
    //   22: lxor
    //   23: lstore #8
    //   25: dup2
    //   26: ldc2_w 130918908095474
    //   29: lxor
    //   30: lstore #10
    //   32: dup2
    //   33: ldc2_w 37579749197918
    //   36: lxor
    //   37: dup2
    //   38: bipush #32
    //   40: lushr
    //   41: l2i
    //   42: istore #12
    //   44: dup2
    //   45: bipush #32
    //   47: lshl
    //   48: bipush #48
    //   50: lushr
    //   51: l2i
    //   52: istore #13
    //   54: dup2
    //   55: bipush #48
    //   57: lshl
    //   58: bipush #48
    //   60: lushr
    //   61: l2i
    //   62: istore #14
    //   64: pop2
    //   65: dup2
    //   66: ldc2_w 31421620104588
    //   69: lxor
    //   70: dup2
    //   71: bipush #32
    //   73: lushr
    //   74: l2i
    //   75: istore #15
    //   77: dup2
    //   78: bipush #32
    //   80: lshl
    //   81: bipush #48
    //   83: lushr
    //   84: l2i
    //   85: istore #16
    //   87: dup2
    //   88: bipush #48
    //   90: lshl
    //   91: bipush #48
    //   93: lushr
    //   94: l2i
    //   95: istore #17
    //   97: pop2
    //   98: dup2
    //   99: ldc2_w 120145186448784
    //   102: lxor
    //   103: lstore #18
    //   105: dup2
    //   106: ldc2_w 98054812235790
    //   109: lxor
    //   110: lstore #20
    //   112: pop2
    //   113: aload_0
    //   114: getfield k : I
    //   117: ifgt -> 125
    //   120: return
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload_1
    //   126: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   129: astore #22
    //   131: aload #22
    //   133: invokeinterface isFlying : ()Z
    //   138: ifeq -> 146
    //   141: return
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: invokestatic b : ()I
    //   149: bipush #9
    //   151: if_icmplt -> 176
    //   154: aload #22
    //   156: invokeinterface isGliding : ()Z
    //   161: ifeq -> 176
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: return
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: aload_2
    //   177: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   180: astore #23
    //   182: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   185: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   188: iload #15
    //   190: iload #16
    //   192: iload #17
    //   194: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   197: astore #24
    //   199: aload #23
    //   201: aload_2
    //   202: invokevirtual getX : ()D
    //   205: lload #18
    //   207: invokestatic b : (DJ)I
    //   210: aload_2
    //   211: invokevirtual getY : ()D
    //   214: lload #18
    //   216: invokestatic b : (DJ)I
    //   219: iconst_1
    //   220: isub
    //   221: aload_2
    //   222: invokevirtual getZ : ()D
    //   225: lload #18
    //   227: invokestatic b : (DJ)I
    //   230: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
    //   235: astore #25
    //   237: aload #24
    //   239: lload #10
    //   241: aload #25
    //   243: invokeinterface b : (JLorg/bukkit/block/Block;)F
    //   248: fstore #26
    //   250: aload_3
    //   251: invokevirtual getYaw : ()F
    //   254: fstore #27
    //   256: ldc 0.91
    //   258: fstore #28
    //   260: iload #12
    //   262: iload #13
    //   264: i2s
    //   265: aload #22
    //   267: iload #14
    //   269: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   272: ifeq -> 282
    //   275: fload #26
    //   277: ldc 0.91
    //   279: fmul
    //   280: fstore #28
    //   282: aload_3
    //   283: invokevirtual getX : ()D
    //   286: aload_2
    //   287: invokevirtual getX : ()D
    //   290: dsub
    //   291: dstore #29
    //   293: aload_3
    //   294: invokevirtual getZ : ()D
    //   297: aload_2
    //   298: invokevirtual getZ : ()D
    //   301: dsub
    //   302: dstore #31
    //   304: aload_0
    //   305: getfield v : Lorg/bukkit/util/Vector;
    //   308: ifnonnull -> 340
    //   311: aload_0
    //   312: new org/bukkit/util/Vector
    //   315: dup
    //   316: dload #29
    //   318: fload #28
    //   320: f2d
    //   321: dmul
    //   322: dconst_0
    //   323: dload #31
    //   325: fload #28
    //   327: f2d
    //   328: dmul
    //   329: invokespecial <init> : (DDD)V
    //   332: putfield v : Lorg/bukkit/util/Vector;
    //   335: return
    //   336: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   339: athrow
    //   340: dload #29
    //   342: aload_0
    //   343: getfield v : Lorg/bukkit/util/Vector;
    //   346: invokevirtual getX : ()D
    //   349: dsub
    //   350: dstore #33
    //   352: dload #31
    //   354: aload_0
    //   355: getfield v : Lorg/bukkit/util/Vector;
    //   358: invokevirtual getZ : ()D
    //   361: dsub
    //   362: dstore #35
    //   364: new org/bukkit/util/Vector
    //   367: dup
    //   368: dload #33
    //   370: dconst_0
    //   371: dload #35
    //   373: invokespecial <init> : (DDD)V
    //   376: astore #37
    //   378: iload #12
    //   380: iload #13
    //   382: i2s
    //   383: aload #22
    //   385: iload #14
    //   387: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   390: ifeq -> 695
    //   393: aload_3
    //   394: invokevirtual getY : ()D
    //   397: aload_2
    //   398: invokevirtual getY : ()D
    //   401: dcmpl
    //   402: ifne -> 695
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   411: athrow
    //   412: aload #37
    //   414: invokevirtual length : ()D
    //   417: dconst_0
    //   418: dcmpl
    //   419: ifle -> 695
    //   422: goto -> 429
    //   425: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   428: athrow
    //   429: aload #37
    //   431: aload_0
    //   432: getfield v : Lorg/bukkit/util/Vector;
    //   435: invokevirtual dot : (Lorg/bukkit/util/Vector;)D
    //   438: dconst_0
    //   439: dcmpl
    //   440: ifle -> 695
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   449: athrow
    //   450: aload_3
    //   451: invokevirtual getY : ()D
    //   454: dconst_1
    //   455: drem
    //   456: dconst_0
    //   457: dcmpl
    //   458: ifne -> 695
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   467: athrow
    //   468: aload #37
    //   470: aload_3
    //   471: invokevirtual getDirection : ()Lorg/bukkit/util/Vector;
    //   474: iconst_0
    //   475: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
    //   478: invokevirtual angle : (Lorg/bukkit/util/Vector;)F
    //   481: f2d
    //   482: invokestatic toDegrees : (D)D
    //   485: ldc2_w 45.0
    //   488: drem
    //   489: dstore #38
    //   491: dload #38
    //   493: ldc2_w 5.0
    //   496: dcmpl
    //   497: ifle -> 681
    //   500: dload #38
    //   502: ldc2_w 45.0
    //   505: dsub
    //   506: invokestatic abs : (D)D
    //   509: ldc2_w 5.0
    //   512: dcmpl
    //   513: ifle -> 681
    //   516: goto -> 523
    //   519: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   522: athrow
    //   523: aload_2
    //   524: invokestatic f : (Lorg/bukkit/Location;)Z
    //   527: ifeq -> 681
    //   530: goto -> 537
    //   533: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   536: athrow
    //   537: aload_0
    //   538: aload #22
    //   540: aload_2
    //   541: invokespecial b : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;)Z
    //   544: ifne -> 681
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   553: athrow
    //   554: aload_0
    //   555: aload_2
    //   556: lload #20
    //   558: ldc2_w 0.1
    //   561: invokespecial b : (Lorg/bukkit/Location;JD)Z
    //   564: ifeq -> 681
    //   567: goto -> 574
    //   570: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   573: athrow
    //   574: aload_0
    //   575: dup
    //   576: getfield x : I
    //   579: iconst_1
    //   580: iadd
    //   581: dup_x1
    //   582: putfield x : I
    //   585: bipush #10
    //   587: if_icmplt -> 695
    //   590: goto -> 597
    //   593: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   596: athrow
    //   597: aload_0
    //   598: lload #6
    //   600: sipush #1973
    //   603: ldc2_w 2299142511679275216
    //   606: lload #4
    //   608: lxor
    //   609: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   614: sipush #15397
    //   617: ldc2_w 5300890729059498819
    //   620: lload #4
    //   622: lxor
    //   623: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   628: getstatic me/rerere/matrix/internal/an.b : I
    //   631: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   634: aload_0
    //   635: bipush #10
    //   637: putfield x : I
    //   640: getstatic me/rerere/matrix/internal/an.i : Z
    //   643: ifeq -> 695
    //   646: goto -> 653
    //   649: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   652: athrow
    //   653: aload_2
    //   654: lload #8
    //   656: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   659: ifeq -> 695
    //   662: goto -> 669
    //   665: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   668: athrow
    //   669: aload_1
    //   670: aload_2
    //   671: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   674: goto -> 695
    //   677: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   680: athrow
    //   681: aload_0
    //   682: iconst_0
    //   683: aload_0
    //   684: getfield x : I
    //   687: iconst_2
    //   688: isub
    //   689: invokestatic max : (II)I
    //   692: putfield x : I
    //   695: aload_0
    //   696: new org/bukkit/util/Vector
    //   699: dup
    //   700: dload #29
    //   702: fload #28
    //   704: f2d
    //   705: dmul
    //   706: dconst_0
    //   707: dload #31
    //   709: fload #28
    //   711: f2d
    //   712: dmul
    //   713: invokespecial <init> : (DDD)V
    //   716: putfield v : Lorg/bukkit/util/Vector;
    //   719: return
    // Exception table:
    //   from	to	target	type
    //   113	121	121	java/lang/RuntimeException
    //   131	142	142	java/lang/RuntimeException
    //   146	164	167	java/lang/RuntimeException
    //   154	172	172	java/lang/RuntimeException
    //   304	336	336	java/lang/RuntimeException
    //   378	405	408	java/lang/RuntimeException
    //   393	422	425	java/lang/RuntimeException
    //   412	443	446	java/lang/RuntimeException
    //   429	461	464	java/lang/RuntimeException
    //   491	516	519	java/lang/RuntimeException
    //   500	530	533	java/lang/RuntimeException
    //   523	547	550	java/lang/RuntimeException
    //   537	567	570	java/lang/RuntimeException
    //   554	590	593	java/lang/RuntimeException
    //   574	646	649	java/lang/RuntimeException
    //   597	662	665	java/lang/RuntimeException
    //   653	677	677	java/lang/RuntimeException
  }
  
  public an(yl paramyl) {
    super(paramyl);
    b(yk.n);
  }
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (this.k > 0)
        try {
          this.k--;
          if (this.k == 0)
            this.v = null; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    try {
      if (!z)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.k == 0)
        this.v = null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.k = 15;
  }
  
  static {
    long l = a ^ 0x7B9D1A0BC133L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "ßº,´ßá»æ\022êÊ\f1¹ *m\n7íkÁö[ò7r¾UmÔ1\004Ð §\020ÏCÍÒ¦Ïü²³\026ÆÎJö©¶ª\\í®?Tkà°P¾Ñª\025ÎåúOg²~Ê0jÒ·9áµC\024bÆÌÍ¦ª(Nqó0«Ø£\007WûÎÚúQè~jý ½\nÚ/¶\032_R×ß{\026#h2¢C\nµJÝ").length();
    byte b2 = 40;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1CFB;
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
        throw new RuntimeException("me/rerere/matrix/internal/an", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/an'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */