package me.rerere.matrix.internal;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ok {
  @NotNull
  public static final ok i;
  
  private static final long a = o3.a(-4822311393218691257L, 2535440294219289784L, MethodHandles.lookup().lookupClass()).a(84855159219211L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public final void j(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ok.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 19322234077137
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 45176999120456
    //   17: lxor
    //   18: lstore #5
    //   20: dup2
    //   21: ldc2_w 36186712842344
    //   24: lxor
    //   25: dup2
    //   26: bipush #48
    //   28: lushr
    //   29: l2i
    //   30: istore #7
    //   32: dup2
    //   33: bipush #16
    //   35: lshl
    //   36: bipush #32
    //   38: lushr
    //   39: l2i
    //   40: istore #8
    //   42: dup2
    //   43: bipush #48
    //   45: lshl
    //   46: bipush #48
    //   48: lushr
    //   49: l2i
    //   50: istore #9
    //   52: pop2
    //   53: dup2
    //   54: ldc2_w 119691017731994
    //   57: lxor
    //   58: dup2
    //   59: bipush #32
    //   61: lushr
    //   62: l2i
    //   63: istore #10
    //   65: dup2
    //   66: bipush #32
    //   68: lshl
    //   69: bipush #32
    //   71: lushr
    //   72: l2i
    //   73: istore #11
    //   75: pop2
    //   76: dup2
    //   77: ldc2_w 135205009632724
    //   80: lxor
    //   81: dup2
    //   82: bipush #48
    //   84: lushr
    //   85: l2i
    //   86: istore #12
    //   88: dup2
    //   89: bipush #16
    //   91: lshl
    //   92: bipush #32
    //   94: lushr
    //   95: l2i
    //   96: istore #13
    //   98: dup2
    //   99: bipush #48
    //   101: lshl
    //   102: bipush #48
    //   104: lushr
    //   105: l2i
    //   106: istore #14
    //   108: pop2
    //   109: pop2
    //   110: invokestatic r : ()I
    //   113: istore #15
    //   115: nop
    //   116: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   119: sipush #1419
    //   122: ldc2_w 1182509868234451557
    //   125: lload_1
    //   126: lxor
    //   127: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   132: invokevirtual info : (Ljava/lang/String;)V
    //   135: aload_0
    //   136: lload_3
    //   137: invokespecial b : (J)Z
    //   140: iload #15
    //   142: ifeq -> 194
    //   145: ifeq -> 179
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   154: athrow
    //   155: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   158: sipush #17422
    //   161: ldc2_w 7378786171759684590
    //   164: lload_1
    //   165: lxor
    //   166: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   171: invokevirtual info : (Ljava/lang/String;)V
    //   174: return
    //   175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   178: athrow
    //   179: aload_0
    //   180: iload #12
    //   182: i2c
    //   183: iload #13
    //   185: iload #14
    //   187: i2c
    //   188: invokespecial b : (CIC)V
    //   191: invokestatic b : ()I
    //   194: lload_1
    //   195: lconst_0
    //   196: lcmp
    //   197: iflt -> 228
    //   200: bipush #17
    //   202: if_icmpge -> 225
    //   205: sipush #2432
    //   208: ldc2_w 5305822712544110187
    //   211: lload_1
    //   212: lxor
    //   213: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   218: goto -> 238
    //   221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   224: athrow
    //   225: sipush #2587
    //   228: ldc2_w 6609114560920036862
    //   231: lload_1
    //   232: lxor
    //   233: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   238: lload #5
    //   240: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   243: astore #16
    //   245: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   248: new java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial <init> : ()V
    //   255: sipush #18122
    //   258: ldc2_w 445943691587479849
    //   261: lload_1
    //   262: lxor
    //   263: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload #16
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokevirtual toString : ()Ljava/lang/String;
    //   279: invokevirtual info : (Ljava/lang/String;)V
    //   282: aload_0
    //   283: iload #10
    //   285: iload #11
    //   287: invokespecial b : (II)Ljava/lang/ClassLoader;
    //   290: astore #17
    //   292: new me/rerere/matrix/thirdparty/org/objectweb/asm/ClassReader
    //   295: dup
    //   296: aload #17
    //   298: new java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial <init> : ()V
    //   305: aload #16
    //   307: bipush #46
    //   309: bipush #47
    //   311: iconst_0
    //   312: iconst_4
    //   313: aconst_null
    //   314: invokestatic replace$default : (Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: sipush #22351
    //   323: ldc2_w 9009325604342986918
    //   326: lload_1
    //   327: lxor
    //   328: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: invokevirtual toString : ()Ljava/lang/String;
    //   339: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   342: invokespecial <init> : (Ljava/io/InputStream;)V
    //   345: astore #18
    //   347: new me/rerere/matrix/thirdparty/org/objectweb/asm/ClassWriter
    //   350: dup
    //   351: iconst_1
    //   352: invokespecial <init> : (I)V
    //   355: astore #19
    //   357: aload #18
    //   359: new me/rerere/matrix/internal/bl
    //   362: dup
    //   363: aload #19
    //   365: checkcast me/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor
    //   368: invokespecial <init> : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor;)V
    //   371: checkcast me/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor
    //   374: iconst_0
    //   375: invokevirtual accept : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor;I)V
    //   378: aload_0
    //   379: aload #19
    //   381: invokevirtual toByteArray : ()[B
    //   384: iload #7
    //   386: i2s
    //   387: swap
    //   388: iload #8
    //   390: swap
    //   391: iload #9
    //   393: i2c
    //   394: swap
    //   395: aload #16
    //   397: aload #17
    //   399: invokespecial b : (SIC[BLjava/lang/String;Ljava/lang/ClassLoader;)V
    //   402: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   405: sipush #13893
    //   408: ldc2_w 1931544481003248053
    //   411: lload_1
    //   412: lxor
    //   413: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   418: invokevirtual info : (Ljava/lang/String;)V
    //   421: goto -> 493
    //   424: astore #16
    //   426: aload #16
    //   428: invokevirtual printStackTrace : ()V
    //   431: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   434: new java/lang/StringBuilder
    //   437: dup
    //   438: invokespecial <init> : ()V
    //   441: sipush #26142
    //   444: ldc2_w 5332230343879641578
    //   447: lload_1
    //   448: lxor
    //   449: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   454: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: aload #16
    //   459: invokevirtual getClass : ()Ljava/lang/Class;
    //   462: invokevirtual getName : ()Ljava/lang/String;
    //   465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: invokevirtual toString : ()Ljava/lang/String;
    //   471: invokevirtual warning : (Ljava/lang/String;)V
    //   474: invokestatic getLogger : ()Ljava/util/logging/Logger;
    //   477: sipush #19713
    //   480: ldc2_w 3985775498424705760
    //   483: lload_1
    //   484: lxor
    //   485: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   490: invokevirtual warning : (Ljava/lang/String;)V
    //   493: return
    // Exception table:
    //   from	to	target	type
    //   115	148	151	java/lang/Exception
    //   115	421	424	java/lang/Exception
    //   145	175	175	java/lang/Exception
    //   194	221	221	java/lang/Exception
  }
  
  static {
    long l = a ^ 0x7BD1380A8741L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[22];
    boolean bool = false;
    String str;
    int i = (str = "bÖÝÆ¦ËUYAÎ\005Í\bâá²\bÙ*U\006åI¶`¦ÊSü\025]\005\030\\MO@_\003E/l!ùä¼·ÔÿÄD)å\031 NÁS\bØQpý\004òhh_\021ýûî~zã<t'\\ÛrôHÑlÈ\002£§\002CÏá<ìîÉ'_¹\\ÈBÙà\000ðgË±\034#/pÞW\030ÂÃ\fÞÀÈ6_h7ûéZ¡}aPòÐ+yß¡\024<-Ë\t\035ë'KXëU\032o¦2äÐÃé )û è6*\b1þîH®¦ <}ÂÂËï\003l¶ï¿8*\035ðº||kð!tô÷Ñ4b¹Á\000¶Ö-öÙ»[(\016+}Åúwù¨{gSIØ\\FÃ\021\rúQ78·ö\\\023õJ\033B\007øãa\">R\006\021ÿh<¤oÆÐ7»£öÈ¿Í\037ÐãhbÇ\024\013S:éÿ\013Å\023/8\nU¦E=Åð¸#ÍnµÊõµWë\025¿æ¥\0170Ø\004äÔ:\000öjàV³ÎW\006áúFÑ\007ì/\020«c\002ú\"¿ö(#úY\007Îl@M8é-\037äWáº°¸T~G\024cJH/ÇiÉªBàãÅÀ§´£s0ÎnRRáçNÇA\026«TÞkpë¥-ãAôêHqñÔ«ÈØRðªKp«4ëéòk«kjÎZ¢ñ§NrGÅ`¥µ\023êKH\016$y)7õltèÞ\032ïÐ\\\021ì¿\032ôû Ã\017\016\b\020%^®<_0¼v4%a\016\017[3 ØÎK[K{ÿøã¦ñä\017\005%`?\033¢µ\035WeF0\006&£(?1¿Y=Ìä(î#÷=(\\êª55Ä®cÜÖ\016¦f+`Ú\022rUë@¼/?P{çe\021[\"ªÁY|êðLÝTj­ó\r<Iñ¡¡âP#pÒÂzË\006!¨â\000ø^+ô¹p\032éØ\030lâ(£²[\006ª\025\004\030øy±ÙF÷MõÁð`K`rdÀ\023º\\Ô¶ÿâÕU6\004aX¦¶í*¥ªÞ¿q`\026:Ëøé\031²:F£[RDíNLZÃV\032çf]L\034\036ÃC¸Ýw'[åúU\026\bE[dmÏky\021\037Ö\004Ð\016õúæ*ôÞÉ£ÓO\033AÐ!7oÙlôs³0:tÇ\025\023¾nÈ,ëk&R¼GÏ¥û\"6´\033Öôe\02479³§:\023¾Ì¯ã\025\027\025\007\032H\032=ä¼l N]\b\002Tz`ä]Úõð²òþÔûÝF\033±ü\035£mW\034½A¹O\016¡\033/Ñcê\017+NZ·ky°ºéCÝ¬ë$3-[8Fâ\021»ÙY\022{\nÃT+£ÍÍ+Ïñ§Ê+t°»'/ÛJò7WÓÔ×Ä¥WÖôðù[§JX²X¥«rÌÞ\0226sé'gÔn\021w=Bú¤Y CáÔ®íl4´yù/\002·éÙ:µ3Û1H\017R×s\024w\025j[\023{§hVäë7{ô®Gz`xb5y÷IÁ\rNÌ}Ñ®D9ÎP©D\006¡éÛÕ\\Ü\\I,]>ÆÔ\nÙ9\006¸e%S$©bD3=\021\017ân¦¨'m|hðeêÃ°9©[ãIµ­-PV?\034J5a\r ô4wÔÇÿyâ").length();
    byte b2 = 72;
    byte b = -1;
    while (true);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1173;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ok", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/ok'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */