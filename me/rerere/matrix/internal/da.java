package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class da {
  private static final Set t;
  
  private static Material g;
  
  public static final Material a;
  
  private static final Set s;
  
  private static final Set u;
  
  public static final Set w;
  
  public static final Material f;
  
  private static final Set l;
  
  private static final Set r;
  
  private static final Set x;
  
  private static final Set z;
  
  private static final Set k;
  
  private static final Set v;
  
  private static final Material b;
  
  private static final Set i;
  
  private static final long c = o3.a(5479496340119763660L, -1542502460626848481L, MethodHandles.lookup().lookupClass()).a(20929091063322L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public static boolean v(Material paramMaterial) {
    return k.contains(paramMaterial);
  }
  
  public static Material j() {
    try {
      if (b.b() >= 13)
        return Material.COBWEB; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return g;
  }
  
  public static boolean f(Material paramMaterial) {
    return i.contains(paramMaterial);
  }
  
  public static Optional b(String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/da.c : J
    //   3: ldc2_w 1041703036706
    //   6: lxor
    //   7: lstore_1
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/Material;
    //   14: astore_3
    //   15: goto -> 103
    //   18: astore #4
    //   20: invokestatic values : ()[Lorg/bukkit/Material;
    //   23: astore #5
    //   25: aload #5
    //   27: arraylength
    //   28: istore #6
    //   30: iconst_0
    //   31: istore #7
    //   33: iload #7
    //   35: iload #6
    //   37: if_icmpge -> 103
    //   40: aload #5
    //   42: iload #7
    //   44: aaload
    //   45: astore #8
    //   47: aload #8
    //   49: invokevirtual name : ()Ljava/lang/String;
    //   52: astore #9
    //   54: aload #9
    //   56: sipush #14395
    //   59: ldc2_w 4585659065554758474
    //   62: lload_1
    //   63: lxor
    //   64: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   69: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   72: ifne -> 97
    //   75: aload #9
    //   77: aload_0
    //   78: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   81: ifeq -> 97
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload #8
    //   93: astore_3
    //   94: goto -> 103
    //   97: iinc #7, 1
    //   100: goto -> 33
    //   103: aload_3
    //   104: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   107: areturn
    // Exception table:
    //   from	to	target	type
    //   10	15	18	java/lang/Exception
    //   54	84	87	java/lang/Exception
  }
  
  public static boolean s(Material paramMaterial) {
    try {
      if (b.b() >= 13) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (paramMaterial == Material.COBWEB);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramMaterial == g);
  }
  
  public static boolean u(Material paramMaterial) {
    return l.contains(paramMaterial);
  }
  
  public static boolean l(Material paramMaterial) {
    return z.contains(paramMaterial);
  }
  
  public static boolean p(Block paramBlock) {
    return r(na.b(paramBlock));
  }
  
  static {
    (new byte[8])[0] = (byte)(int)(l1 >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l1 << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[37];
    boolean bool = false;
    String str;
    int i = (str = "êÐn'b\\a\bS\034J8ôÒ\034\020èkWfðV^£yèÜÆUÙ\0204÷kþOá\005vB\026æÖU¹?¢\020\000Ù0£ÎÌ¢\026OCU¨ú\020eÐI\026J\025\006\r=Í¡ê¢ö\020\037\0232\\æäÏxoRÄ\033Z\020§FºÕ(Ä#ÝÍQ\032®ö~¹ !¥,¥Þ&¥ZeÝ)xN¦öÛ\025ä½ã»Êé¾©kÎ»JT±\020»þ8+§Õ»¿¨Û¬\020æ\0277¾`fòüLÝo(bKy\032WÎ\016Ø\001L\036qÉÃp´Ì64iC«¹.ÔÃÜ\005'C±:\0076\007¢°\030²ä~xIÀ­jO×fÏ Ñ5fvåsûj\020,?g¬gU\023æ ß&Pu]\0206¡TPG\026Uñ¯H\002¢\0209ÿ^ëhr«m«Ñiýóä «85/X8?K\n·|í\022ý\034:\000Á>¨}4ÉÌ­3Ô½\030 Pyi\n(à~\002\026hZ<s\021ÜÎ6Ã|{µ\026«Db\017\rµ%\030¼²j\004Yü\007¢{%Kc\007\007Ð\036Wñ\t\013µ \031y'ö±ñR\\\\ÅHêTà¼úON\032\037éj)\"\020·×gCcák!Eqþ{¶A\020Q³´\003ÖÞów\r/\032{U\036 J6\032¡ØY} :\020\001«è21Êëõ¢Yÿa6 i?A§\020ôiÇáæºÏ\006÷Î\006-5Äh(Û¹{ÒãghØÌÆT¹â`ä\035\035ía\035´¦\023ÇVÄxúG$ìõLÃ õFî\030\024ì-H\030òØþJÌÛui\030¤p&\033K¦5\020öÛ®ì])ë\032é\007\006 \fWq æÍ &ÃÍíÀp\035ÑÍPáÀ¯êÝK]AOi\031wXfÓ­¾º î'\032·\007»Z!k<+\r\000¯VìÕÙ~°c\020\003ñ(ä©\020ÿ[^V`ÐXPÒ9F9½c\020äÜ¿¥b\r¾\025t\025þ\"6ô\0209asÇ-ùÒX\" s%{\0221  O`µ~Ð/ë[¼o- \004ê9&j:c\026ll Qym¹ÓÍ\020n\001T\025EÿI\001\037E\013äH±\020rE ñÓ\004½ØÚè*f>Ï\030\021E\"9aO9/pRSc¨È,\016hqàê#§").length();
    char c = '\020';
    byte b1 = -1;
    while (true)
      c = str.charAt(b1); 
    throw a(-1);
  }
  
  public static Set b() {
    return z;
  }
  
  public static boolean r(Material paramMaterial) {
    try {
      if (b.b() < 13) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (paramMaterial == Material.AIR);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramMaterial != Material.AIR)
        try {
          if (paramMaterial != Material.CAVE_AIR) {
            try {
              if (paramMaterial == Material.VOID_AIR);
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
  }
  
  public static boolean d(Material paramMaterial) {
    return s.contains(paramMaterial);
  }
  
  public static boolean n(Material paramMaterial) {
    return x.contains(paramMaterial);
  }
  
  public static boolean j(Block paramBlock) {
    return s.contains(na.b(paramBlock));
  }
  
  public static boolean c(Material paramMaterial) {
    return t.contains(paramMaterial);
  }
  
  public static Material b(String paramString1, String paramString2) {
    try {
      if (b.b() < 13)
        return Material.valueOf(paramString1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Material.valueOf(paramString2);
  }
  
  public static boolean b(long paramLong, @NotNull Block paramBlock) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/da.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 82879774385412
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic b : ()I
    //   17: bipush #13
    //   19: if_icmpge -> 31
    //   22: aload_2
    //   23: invokestatic j : (Lorg/bukkit/block/Block;)Z
    //   26: ireturn
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: lload_3
    //   32: aload_2
    //   33: invokestatic b : (JLorg/bukkit/block/Block;)Lorg/bukkit/block/data/BlockData;
    //   36: astore #5
    //   38: aload_2
    //   39: invokestatic b : (Lorg/bukkit/block/Block;)Lorg/bukkit/Material;
    //   42: astore #6
    //   44: aload_2
    //   45: invokestatic j : (Lorg/bukkit/block/Block;)Z
    //   48: ifne -> 161
    //   51: aload #5
    //   53: instanceof org/bukkit/block/data/Waterlogged
    //   56: ifeq -> 86
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload #5
    //   68: checkcast org/bukkit/block/data/Waterlogged
    //   71: invokeinterface isWaterlogged : ()Z
    //   76: ifne -> 161
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload #6
    //   88: getstatic org/bukkit/Material.SEAGRASS : Lorg/bukkit/Material;
    //   91: if_acmpeq -> 161
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload #6
    //   103: getstatic org/bukkit/Material.BUBBLE_COLUMN : Lorg/bukkit/Material;
    //   106: if_acmpeq -> 161
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #6
    //   118: getstatic org/bukkit/Material.TALL_SEAGRASS : Lorg/bukkit/Material;
    //   121: if_acmpeq -> 161
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: aload #6
    //   133: getstatic org/bukkit/Material.KELP : Lorg/bukkit/Material;
    //   136: if_acmpeq -> 161
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload #6
    //   148: getstatic org/bukkit/Material.KELP_PLANT : Lorg/bukkit/Material;
    //   151: if_acmpne -> 169
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: iconst_1
    //   162: goto -> 170
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: iconst_0
    //   170: ireturn
    // Exception table:
    //   from	to	target	type
    //   14	27	27	java/lang/RuntimeException
    //   44	59	62	java/lang/RuntimeException
    //   51	79	82	java/lang/RuntimeException
    //   66	94	97	java/lang/RuntimeException
    //   86	109	112	java/lang/RuntimeException
    //   101	124	127	java/lang/RuntimeException
    //   116	139	142	java/lang/RuntimeException
    //   131	154	157	java/lang/RuntimeException
    //   146	165	165	java/lang/RuntimeException
  }
  
  public static boolean h(Material paramMaterial) {
    return w.contains(paramMaterial);
  }
  
  public static Material b() {
    return b;
  }
  
  public static boolean b(char paramChar, Block paramBlock, int paramInt1, int paramInt2, Material paramMaterial) {
    // Byte code:
    //   0: iload_0
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
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/da.c : J
    //   26: lxor
    //   27: lstore #5
    //   29: lload #5
    //   31: dup2
    //   32: ldc2_w 67232252034831
    //   35: lxor
    //   36: lstore #7
    //   38: pop2
    //   39: invokestatic b : ()I
    //   42: bipush #13
    //   44: if_icmpge -> 62
    //   47: getstatic me/rerere/matrix/internal/da.s : Ljava/util/Set;
    //   50: aload #4
    //   52: invokeinterface contains : (Ljava/lang/Object;)Z
    //   57: ireturn
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: lload #7
    //   64: aload_1
    //   65: invokestatic b : (JLorg/bukkit/block/Block;)Lorg/bukkit/block/data/BlockData;
    //   68: astore #9
    //   70: aload_1
    //   71: invokestatic j : (Lorg/bukkit/block/Block;)Z
    //   74: ifne -> 187
    //   77: aload #9
    //   79: instanceof org/bukkit/block/data/Waterlogged
    //   82: ifeq -> 112
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload #9
    //   94: checkcast org/bukkit/block/data/Waterlogged
    //   97: invokeinterface isWaterlogged : ()Z
    //   102: ifne -> 187
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload #4
    //   114: getstatic org/bukkit/Material.SEAGRASS : Lorg/bukkit/Material;
    //   117: if_acmpeq -> 187
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload #4
    //   129: getstatic org/bukkit/Material.BUBBLE_COLUMN : Lorg/bukkit/Material;
    //   132: if_acmpeq -> 187
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: aload #4
    //   144: getstatic org/bukkit/Material.TALL_SEAGRASS : Lorg/bukkit/Material;
    //   147: if_acmpeq -> 187
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload #4
    //   159: getstatic org/bukkit/Material.KELP : Lorg/bukkit/Material;
    //   162: if_acmpeq -> 187
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: aload #4
    //   174: getstatic org/bukkit/Material.KELP_PLANT : Lorg/bukkit/Material;
    //   177: if_acmpne -> 195
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: iconst_1
    //   188: goto -> 196
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: iconst_0
    //   196: ireturn
    // Exception table:
    //   from	to	target	type
    //   39	58	58	java/lang/RuntimeException
    //   70	85	88	java/lang/RuntimeException
    //   77	105	108	java/lang/RuntimeException
    //   92	120	123	java/lang/RuntimeException
    //   112	135	138	java/lang/RuntimeException
    //   127	150	153	java/lang/RuntimeException
    //   142	165	168	java/lang/RuntimeException
    //   157	180	183	java/lang/RuntimeException
    //   172	191	191	java/lang/RuntimeException
  }
  
  public static boolean m(Material paramMaterial) {
    return u.contains(paramMaterial);
  }
  
  public static boolean p(Material paramMaterial) {
    return v.contains(paramMaterial);
  }
  
  public static boolean b(Material paramMaterial) {
    return r.contains(paramMaterial);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2CCE;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])h.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          h.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/da", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/da'
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
    long l1 = c ^ 0x3E7BF82FAD48L;
    long l2 = l1 ^ 0x5C5A401156F4L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\da.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */