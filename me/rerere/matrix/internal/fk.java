package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
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

public class fk extends zk {
  private static int a;
  
  private static boolean s;
  
  private long u;
  
  private static boolean w;
  
  private int f = 0;
  
  private static boolean l;
  
  private int r;
  
  private final List x = new ArrayList();
  
  private static boolean z;
  
  private static int k;
  
  private long v;
  
  private boolean b = false;
  
  private double i = 0.0D;
  
  private static final long c = o3.a(-4288696143664512480L, 8729182453683410174L, MethodHandles.lookup().lookupClass()).a(140074315707645L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map g = new HashMap<>(13);
  
  public fk(yl paramyl) {
    super(paramyl);
    b(yk.m);
  }
  
  public void b(int paramInt, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 1430875225653
    //   5: lxor
    //   6: lstore #4
    //   8: dup2
    //   9: ldc2_w 106414118306332
    //   12: lxor
    //   13: lstore #6
    //   15: pop2
    //   16: aload_0
    //   17: getfield b : Z
    //   20: ifeq -> 153
    //   23: getstatic me/rerere/matrix/internal/fk.z : Z
    //   26: ifeq -> 153
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   40: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   43: getstatic me/rerere/matrix/internal/q.s : Lme/rerere/matrix/internal/q;
    //   46: if_acmpne -> 79
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: invokestatic b : ()I
    //   59: bipush #8
    //   61: if_icmple -> 79
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 80
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_0
    //   80: istore #8
    //   82: iload #8
    //   84: ifne -> 153
    //   87: aload_0
    //   88: lload #4
    //   90: sipush #4759
    //   93: ldc2_w 3407138852364101627
    //   96: lload_2
    //   97: lxor
    //   98: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   103: new java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: sipush #28590
    //   113: ldc2_w 1184416098794691265
    //   116: lload_2
    //   117: lxor
    //   118: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: aload_0
    //   127: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   130: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   133: invokevirtual b : ()Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: iconst_3
    //   143: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: aload_0
    //   154: iconst_1
    //   155: putfield b : Z
    //   158: invokestatic j : ()J
    //   161: lstore #8
    //   163: lload #8
    //   165: aload_0
    //   166: getfield u : J
    //   169: lsub
    //   170: lstore #10
    //   172: lload #10
    //   174: ldc2_w 1500
    //   177: lcmp
    //   178: iflt -> 192
    //   181: aload_0
    //   182: lload #8
    //   184: putfield u : J
    //   187: return
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: aload_0
    //   193: getfield x : Ljava/util/List;
    //   196: lload #10
    //   198: l2f
    //   199: ldc 50.0
    //   201: fdiv
    //   202: invokestatic round : (F)I
    //   205: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   208: invokeinterface add : (Ljava/lang/Object;)Z
    //   213: pop
    //   214: aload_0
    //   215: dup
    //   216: getfield f : I
    //   219: iconst_1
    //   220: iadd
    //   221: putfield f : I
    //   224: lload #8
    //   226: aload_0
    //   227: getfield v : J
    //   230: lsub
    //   231: ldc2_w 1000
    //   234: lcmp
    //   235: ifle -> 509
    //   238: aload_0
    //   239: dup
    //   240: getfield i : D
    //   243: aload_0
    //   244: getfield f : I
    //   247: i2d
    //   248: dadd
    //   249: putfield i : D
    //   252: aload_0
    //   253: dup
    //   254: getfield i : D
    //   257: ldc2_w 2.0
    //   260: ddiv
    //   261: putfield i : D
    //   264: aload_0
    //   265: aload_0
    //   266: getfield f : I
    //   269: putfield r : I
    //   272: aload_0
    //   273: getfield f : I
    //   276: getstatic me/rerere/matrix/internal/fk.a : I
    //   279: if_icmple -> 498
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   288: athrow
    //   289: getstatic me/rerere/matrix/internal/fk.l : Z
    //   292: ifeq -> 498
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   301: athrow
    //   302: getstatic me/rerere/matrix/internal/fk.s : Z
    //   305: ifeq -> 418
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   314: athrow
    //   315: iconst_4
    //   316: bipush #7
    //   318: aload_0
    //   319: getfield f : I
    //   322: getstatic me/rerere/matrix/internal/fk.a : I
    //   325: isub
    //   326: iconst_2
    //   327: idiv
    //   328: invokestatic min : (II)I
    //   331: iadd
    //   332: istore #12
    //   334: aload_0
    //   335: lload #4
    //   337: sipush #18649
    //   340: ldc2_w 1741132983842536888
    //   343: lload_2
    //   344: lxor
    //   345: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   350: new java/lang/StringBuilder
    //   353: dup
    //   354: invokespecial <init> : ()V
    //   357: sipush #24155
    //   360: ldc2_w 8689633943270976318
    //   363: lload_2
    //   364: lxor
    //   365: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload_0
    //   374: getfield f : I
    //   377: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   380: ldc '/'
    //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: getstatic me/rerere/matrix/internal/fk.a : I
    //   388: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   391: sipush #9475
    //   394: ldc2_w 99172374013513834
    //   397: lload_2
    //   398: lxor
    //   399: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: invokevirtual toString : ()Ljava/lang/String;
    //   410: iload #12
    //   412: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   415: goto -> 498
    //   418: aload_0
    //   419: lload #4
    //   421: sipush #6459
    //   424: ldc2_w 6351023506488929363
    //   427: lload_2
    //   428: lxor
    //   429: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   434: new java/lang/StringBuilder
    //   437: dup
    //   438: invokespecial <init> : ()V
    //   441: sipush #13362
    //   444: ldc2_w 2292132041417883989
    //   447: lload_2
    //   448: lxor
    //   449: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   454: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: aload_0
    //   458: getfield f : I
    //   461: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   464: ldc '/'
    //   466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: getstatic me/rerere/matrix/internal/fk.a : I
    //   472: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   475: sipush #15057
    //   478: ldc2_w 4262002066529488821
    //   481: lload_2
    //   482: lxor
    //   483: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   488: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: invokevirtual toString : ()Ljava/lang/String;
    //   494: iconst_4
    //   495: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   498: aload_0
    //   499: lload #8
    //   501: putfield v : J
    //   504: aload_0
    //   505: iconst_0
    //   506: putfield f : I
    //   509: aload_0
    //   510: getfield x : Ljava/util/List;
    //   513: invokeinterface size : ()I
    //   518: getstatic me/rerere/matrix/internal/fk.k : I
    //   521: if_icmplt -> 546
    //   524: aload_0
    //   525: lload #6
    //   527: invokespecial h : (J)V
    //   530: aload_0
    //   531: getfield x : Ljava/util/List;
    //   534: invokeinterface clear : ()V
    //   539: goto -> 546
    //   542: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   545: athrow
    //   546: aload_0
    //   547: lload #8
    //   549: putfield u : J
    //   552: return
    // Exception table:
    //   from	to	target	type
    //   16	29	32	java/lang/RuntimeException
    //   23	49	52	java/lang/RuntimeException
    //   36	64	67	java/lang/RuntimeException
    //   56	75	75	java/lang/RuntimeException
    //   82	146	149	java/lang/RuntimeException
    //   172	188	188	java/lang/RuntimeException
    //   192	282	285	java/lang/RuntimeException
    //   238	295	298	java/lang/RuntimeException
    //   289	308	311	java/lang/RuntimeException
    //   509	539	542	java/lang/RuntimeException
  }
  
  static {
    long l = c ^ 0x1EB9865419E4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[17];
    boolean bool = false;
    String str;
    int i = (str = "m«\005'M\027é! îaDz\003çIRìÀ9x¹ªPÊ¹ ëÕÜ:þÿä\023ÂÆï{õó\024\030r±b\"hwõö@cµ 0>|J\0248îëRî\007çöÛÜ\013¸\017ä>¬+(\023R4!Ze@DË]Ëàp´\030¦»$\027\002ÔÃ|_a\036üh\0375»EÂõèr.ì)¾nðÛL\001rT&1VÍÔ«@yå½à0A\030vr6 ¥ç\034R.ýÚÊ¦Ö\006\006\000}Â`y:=j:¹$²&ÏìãÜ\037ÜÐ\034'gn²Wµq\037\031\037o\030\016PþºóÖk`óÊª\013\027\001qÜÔx1½¶NºEø9ú\021ÑØ\027yí»Ç»Á^*¿Ãùìz%Ñ\0308¯\023ö©\b`\f§¾\027:H \rS*0\021ÎÁ´.±9Gêø|W\004#ñ¹zØôÚË\023Àc8 T2GýH¿GhI`Øîÿ\b\f?q82öF\034x\037z\rÙ:ÕL?ÈÑ`jv|Lc\016\\\031Ë.{w\026 çâDÏÑ\\¸ö\002¦Z\033êp\\þc©o¬wÒ~¼¾0§ú¦õÐ!\003/¢\033ï­¤ð~\016)MÐwú-a.Q7Õ#AY¶\n¼\036clâå#b\033zÊ\f\"ÂXqÄ{Z´E±ª\000 \006\017íb-\024\"\026© `¯WøÿP\0178\021£]ç\002{Ê|U\020<Ü»a?A:\"¢]½­­Õ\030Á@ÝÔ-\017]åÕæÂ1Ç¸DøÍ²;¼®\030ïX¹ÌRíåÛÅ@à^3[@af¥Çé\030½ºz«t7ÀÀÆ³.}Ê\013¨4úõÙå\0330a9I\035ß´Ë\024z¤\006mrÖ$^mÞ¹}^9]Ph~\032úª\nG\rEb\020{(Z¾Ábò").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public int p() {
    return this.r;
  }
  
  public double b() {
    return this.i;
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    try {
      if (paramPacketType == PacketType.Play.Client.ARM_ANIMATION)
        this.b = false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fk.c : J
    //   3: ldc2_w 85339122966661
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: astore_3
    //   13: aload_3
    //   14: sipush #20027
    //   17: ldc2_w 7203320180471458117
    //   20: lload_1
    //   21: lxor
    //   22: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   27: bipush #11
    //   29: invokeinterface getInt : (Ljava/lang/String;I)I
    //   34: putstatic me/rerere/matrix/internal/fk.a : I
    //   37: aload_3
    //   38: sipush #13956
    //   41: ldc2_w 8420480329585201657
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   51: bipush #20
    //   53: invokeinterface getInt : (Ljava/lang/String;I)I
    //   58: putstatic me/rerere/matrix/internal/fk.k : I
    //   61: aload_3
    //   62: sipush #28990
    //   65: ldc2_w 2009557975091926598
    //   68: lload_1
    //   69: lxor
    //   70: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   75: iconst_1
    //   76: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   81: putstatic me/rerere/matrix/internal/fk.l : Z
    //   84: aload_3
    //   85: sipush #13535
    //   88: ldc2_w 7738987350783169451
    //   91: lload_1
    //   92: lxor
    //   93: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   98: iconst_1
    //   99: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   104: putstatic me/rerere/matrix/internal/fk.z : Z
    //   107: aload_3
    //   108: sipush #15172
    //   111: ldc2_w 7495830652449201204
    //   114: lload_1
    //   115: lxor
    //   116: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   121: iconst_1
    //   122: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   127: putstatic me/rerere/matrix/internal/fk.w : Z
    //   130: aload_3
    //   131: sipush #14774
    //   134: ldc2_w 1520885334640402117
    //   137: lload_1
    //   138: lxor
    //   139: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   144: iconst_1
    //   145: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   150: putstatic me/rerere/matrix/internal/fk.s : Z
    //   153: return
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x18B5;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])g.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          g.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/fk", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/fk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */