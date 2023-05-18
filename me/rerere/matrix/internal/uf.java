package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
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
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class uf extends zk {
  private boolean b = false;
  
  private long i;
  
  private static boolean a;
  
  private static final long c = o3.a(-2764095005527408768L, -4709190194442996847L, MethodHandles.lookup().lookupClass()).a(25487544080897L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public static boolean b(double paramDouble) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((Double.NEGATIVE_INFINITY < paramDouble)) & ((paramDouble < Double.POSITIVE_INFINITY));
  }
  
  public static boolean j(@NotNull StructureModifier paramStructureModifier) {
    double d1 = ((Double)paramStructureModifier.read(0)).doubleValue();
    double d2 = ((Double)paramStructureModifier.read(1)).doubleValue();
    double d3 = ((Double)paramStructureModifier.read(2)).doubleValue();
    try {
      if (b(d1))
        try {
          if (b(d2))
            try {
              if (b(d3))
                try {
                  if (Math.abs(d1) < 3.0E7D)
                    try {
                      if (Math.abs(d3) < 3.0E7D)
                        try {
                          if (Math.abs(d2) < 3.0E7D);
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
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public uf(yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  public static boolean b(@NotNull StructureModifier paramStructureModifier) {
    try {
      if (b(((Float)paramStructureModifier.read(0)).floatValue()))
        try {
          if (b(((Float)paramStructureModifier.read(1)).floatValue()))
            try {
              if (!((Float)paramStructureModifier.read(0)).isNaN())
                try {
                  if (!((Float)paramStructureModifier.read(1)).isNaN());
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
  
  public static boolean b(@NotNull Location paramLocation) {
    double d1 = paramLocation.getX();
    double d2 = paramLocation.getY();
    double d3 = paramLocation.getZ();
    try {
      if (b(d1))
        try {
          if (b(d2))
            try {
              if (b(d3))
                try {
                  if (Math.abs(d1) < 3.0E7D)
                    try {
                      if (Math.abs(d3) < 3.0E7D)
                        try {
                          if (Math.abs(d2) < 3.0E7D);
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
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 28415404950661
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 40507544756790
    //   19: lxor
    //   20: lstore #9
    //   22: dup2
    //   23: ldc2_w 101868598661770
    //   26: lxor
    //   27: lstore #11
    //   29: pop2
    //   30: lload #9
    //   32: aload_1
    //   33: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   36: ifeq -> 359
    //   39: lload #11
    //   41: aload_1
    //   42: invokestatic b : (JLcom/comphenix/protocol/PacketType;)Z
    //   45: ifne -> 359
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload #4
    //   57: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   60: astore #13
    //   62: aload #4
    //   64: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   67: astore #14
    //   69: aload #13
    //   71: invokestatic j : (Lcom/comphenix/protocol/reflect/StructureModifier;)Z
    //   74: ifne -> 225
    //   77: invokestatic currentTimeMillis : ()J
    //   80: aload_0
    //   81: getfield i : J
    //   84: lsub
    //   85: ldc2_w 1000
    //   88: lcmp
    //   89: ifle -> 132
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   102: sipush #14390
    //   105: ldc2_w 1493324633401242942
    //   108: lload_2
    //   109: lxor
    //   110: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   115: invokevirtual println : (Ljava/lang/String;)V
    //   118: aload_0
    //   119: invokestatic currentTimeMillis : ()J
    //   122: putfield i : J
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: aload_0
    //   133: lload #5
    //   135: sipush #32589
    //   138: ldc2_w 3325617892375294529
    //   141: lload_2
    //   142: lxor
    //   143: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   148: new java/lang/StringBuilder
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: sipush #7390
    //   158: ldc2_w 2543620648564298193
    //   161: lload_2
    //   162: lxor
    //   163: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload #13
    //   173: iconst_0
    //   174: invokevirtual read : (I)Ljava/lang/Object;
    //   177: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   180: ldc ','
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: aload #13
    //   187: iconst_1
    //   188: invokevirtual read : (I)Ljava/lang/Object;
    //   191: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   194: ldc ','
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload #13
    //   201: iconst_2
    //   202: invokevirtual read : (I)Ljava/lang/Object;
    //   205: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   208: invokevirtual toString : ()Ljava/lang/String;
    //   211: sipush #1000
    //   214: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   217: aload_0
    //   218: lload #7
    //   220: invokespecial h : (J)V
    //   223: iconst_1
    //   224: ireturn
    //   225: aload #14
    //   227: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Z
    //   230: ifne -> 359
    //   233: aload #4
    //   235: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   238: iconst_0
    //   239: fconst_0
    //   240: invokestatic valueOf : (F)Ljava/lang/Float;
    //   243: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   246: pop
    //   247: aload #4
    //   249: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   252: iconst_1
    //   253: fconst_0
    //   254: invokestatic valueOf : (F)Ljava/lang/Float;
    //   257: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   260: pop
    //   261: invokestatic currentTimeMillis : ()J
    //   264: aload_0
    //   265: getfield i : J
    //   268: lsub
    //   269: ldc2_w 1000
    //   272: lcmp
    //   273: ifle -> 316
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   286: sipush #16395
    //   289: ldc2_w 5306994744535469317
    //   292: lload_2
    //   293: lxor
    //   294: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   299: invokevirtual println : (Ljava/lang/String;)V
    //   302: aload_0
    //   303: invokestatic currentTimeMillis : ()J
    //   306: putfield i : J
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   315: athrow
    //   316: aload_0
    //   317: lload #5
    //   319: sipush #12381
    //   322: ldc2_w 2503286875387018588
    //   325: lload_2
    //   326: lxor
    //   327: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   332: sipush #24258
    //   335: ldc2_w 6605551554893042633
    //   338: lload_2
    //   339: lxor
    //   340: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   345: sipush #1000
    //   348: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   351: aload_0
    //   352: lload #7
    //   354: invokespecial h : (J)V
    //   357: iconst_1
    //   358: ireturn
    //   359: aload_1
    //   360: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   363: if_acmpeq -> 380
    //   366: aload_1
    //   367: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   370: if_acmpne -> 605
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   379: athrow
    //   380: aload #4
    //   382: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   385: iconst_0
    //   386: invokevirtual read : (I)Ljava/lang/Object;
    //   389: checkcast java/lang/Float
    //   392: invokevirtual floatValue : ()F
    //   395: fstore #13
    //   397: aload #4
    //   399: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   402: iconst_1
    //   403: invokevirtual read : (I)Ljava/lang/Object;
    //   406: checkcast java/lang/Float
    //   409: invokevirtual floatValue : ()F
    //   412: fstore #14
    //   414: fload #13
    //   416: ldc_w -Infinity
    //   419: fcmpl
    //   420: ifne -> 477
    //   423: aload #4
    //   425: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   428: iconst_0
    //   429: fconst_0
    //   430: invokestatic valueOf : (F)Ljava/lang/Float;
    //   433: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   436: pop
    //   437: aload_0
    //   438: lload #5
    //   440: sipush #12381
    //   443: ldc2_w 2503286875387018588
    //   446: lload_2
    //   447: lxor
    //   448: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   453: sipush #8384
    //   456: ldc2_w 7734643497864179149
    //   459: lload_2
    //   460: lxor
    //   461: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   466: iconst_1
    //   467: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   476: athrow
    //   477: fload #14
    //   479: ldc_w -Infinity
    //   482: fcmpl
    //   483: ifne -> 540
    //   486: aload #4
    //   488: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   491: iconst_1
    //   492: fconst_0
    //   493: invokestatic valueOf : (F)Ljava/lang/Float;
    //   496: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   499: pop
    //   500: aload_0
    //   501: lload #5
    //   503: sipush #12381
    //   506: ldc2_w 2503286875387018588
    //   509: lload_2
    //   510: lxor
    //   511: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   516: sipush #11063
    //   519: ldc2_w 4460290419235104317
    //   522: lload_2
    //   523: lxor
    //   524: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   529: iconst_1
    //   530: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   533: goto -> 540
    //   536: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   539: athrow
    //   540: fload #13
    //   542: ldc_w 100000.0
    //   545: fcmpl
    //   546: iflt -> 570
    //   549: aload #4
    //   551: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   554: iconst_0
    //   555: fconst_0
    //   556: invokestatic valueOf : (F)Ljava/lang/Float;
    //   559: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   562: pop
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   569: athrow
    //   570: fload #14
    //   572: invokestatic abs : (F)F
    //   575: ldc_w 90.0
    //   578: fcmpl
    //   579: ifle -> 605
    //   582: aload #4
    //   584: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   587: iconst_0
    //   588: ldc_w 90.0
    //   591: invokestatic valueOf : (F)Ljava/lang/Float;
    //   594: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   597: pop
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   604: athrow
    //   605: iconst_0
    //   606: ireturn
    // Exception table:
    //   from	to	target	type
    //   30	48	51	java/lang/RuntimeException
    //   69	92	95	java/lang/RuntimeException
    //   77	125	128	java/lang/RuntimeException
    //   225	276	279	java/lang/RuntimeException
    //   233	309	312	java/lang/RuntimeException
    //   359	373	376	java/lang/RuntimeException
    //   414	470	473	java/lang/RuntimeException
    //   477	533	536	java/lang/RuntimeException
    //   540	563	566	java/lang/RuntimeException
    //   570	598	601	java/lang/RuntimeException
  }
  
  public static void T(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean q() {
    return a;
  }
  
  public static boolean x() {
    boolean bool = q();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    T(false);
    long l = c ^ 0xEA683F0AA95L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "øfIäê-ÂÜ8\022\fMKOÔ¨.\024¤ç\004ö[ªÉMÓ\t~ª@æ`÷%/Ãlß¯w|¬R ã\027¢\037¿þáEÕ§µèJDµ#\037\021\n\026/AëF*\t):\005\\¢KqViX1*\022\031e\021SHÀ{¦d~\033ðl8±\032a\020ÕÜ«yÉb\004¥Ðùîàôd\021\023à*ò/gÿ\036eí©áD×¥ô|R\026\013Ô\0016KK\032ºpù,ß\030«DómÊà¨8.ä¥Ð«Ó\007ãÈ£\026í1\t¦Í¹\0263\0301u\001`\02373UÓ\035¼Üê\027.^ÇqÅ@À\026·ýÓ0o\f­()Dö\0021\\Óz\000õðÊEèf|yLÃtÓ\001ïûT\b³\021ÒHj4Ki\036Bç8\021ò0VìÃÏÀíÿìÔ<Èwøøõ0F÷¦Õ\f:®\021V%ÊÀ¶ºß¬êBº©ÌÎÅ)\000Uhjcðí r'\034\0367R²jÃ<r@%Î{±hÎWÁ=ä¡ôÁ6ô@¾@ÅX\023ÉK¿-´\004æåÐÚç\034¥Y&ÅIu+yB6+ÆÒ0AV¥Ï\007T_ñL¹ÛÌ\033ä©bàÓ%\031I/").length();
    byte b2 = 104;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1E31;
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
        throw new RuntimeException("me/rerere/matrix/internal/uf", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/uf'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\uf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */