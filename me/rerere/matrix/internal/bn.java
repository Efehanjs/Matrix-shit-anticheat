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
import org.bukkit.command.CommandSender;

public class bn extends xl {
  private static final long a = o3.a(-8560253443318753123L, -9207602178665862395L, MethodHandles.lookup().lookupClass()).a(272251592886792L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public List b(long paramLong) {
    return null;
  }
  
  public bn(char paramChar1, char paramChar2, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #32
    //   18: lshl
    //   19: bipush #32
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/bn.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: aload_0
    //   30: sipush #16195
    //   33: ldc2_w 2517110284059306207
    //   36: lload #4
    //   38: lxor
    //   39: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   44: sipush #26728
    //   47: ldc2_w 1758657547855675377
    //   50: lload #4
    //   52: lxor
    //   53: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   58: sipush #25065
    //   61: ldc2_w 6898639892538439287
    //   64: lload #4
    //   66: lxor
    //   67: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   72: sipush #10685
    //   75: ldc2_w 95297850358660650
    //   78: lload #4
    //   80: lxor
    //   81: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   86: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   89: return
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 119556231962417
    //   5: lxor
    //   6: dup2
    //   7: bipush #48
    //   9: lushr
    //   10: l2i
    //   11: istore #5
    //   13: dup2
    //   14: bipush #16
    //   16: lshl
    //   17: bipush #32
    //   19: lushr
    //   20: l2i
    //   21: istore #6
    //   23: dup2
    //   24: bipush #48
    //   26: lshl
    //   27: bipush #48
    //   29: lushr
    //   30: l2i
    //   31: istore #7
    //   33: pop2
    //   34: dup2
    //   35: ldc2_w 100225347193598
    //   38: lxor
    //   39: dup2
    //   40: bipush #32
    //   42: lushr
    //   43: l2i
    //   44: istore #8
    //   46: dup2
    //   47: bipush #32
    //   49: lshl
    //   50: bipush #32
    //   52: lushr
    //   53: l2i
    //   54: istore #9
    //   56: pop2
    //   57: pop2
    //   58: invokestatic r : ()I
    //   61: istore #10
    //   63: aload #4
    //   65: iload #10
    //   67: ifeq -> 127
    //   70: arraylength
    //   71: iconst_4
    //   72: if_icmpge -> 125
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_1
    //   83: new java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: sipush #28565
    //   99: ldc2_w 5841249512234117302
    //   102: lload_2
    //   103: lxor
    //   104: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   120: return
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload #4
    //   127: iconst_1
    //   128: aaload
    //   129: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   132: astore #11
    //   134: aload #11
    //   136: iload #10
    //   138: lload_2
    //   139: lconst_0
    //   140: lcmp
    //   141: iflt -> 161
    //   144: ifeq -> 158
    //   147: ifnonnull -> 177
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload_1
    //   158: sipush #11963
    //   161: ldc2_w 9202173875331836310
    //   164: lload_2
    //   165: lxor
    //   166: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   171: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   176: return
    //   177: aload #4
    //   179: iconst_2
    //   180: aaload
    //   181: iload #5
    //   183: i2c
    //   184: swap
    //   185: iload #6
    //   187: iload #7
    //   189: i2c
    //   190: invokestatic b : (CLjava/lang/String;IC)Lme/rerere/matrix/internal/yk;
    //   193: astore #12
    //   195: iload #10
    //   197: ifeq -> 258
    //   200: aload #12
    //   202: ifnonnull -> 259
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: aload_1
    //   213: new java/lang/StringBuilder
    //   216: dup
    //   217: invokespecial <init> : ()V
    //   220: sipush #30280
    //   223: ldc2_w 9081263996475404644
    //   226: lload_2
    //   227: lxor
    //   228: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: aload #4
    //   238: iconst_2
    //   239: aaload
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual toString : ()Ljava/lang/String;
    //   246: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   257: athrow
    //   258: return
    //   259: lconst_0
    //   260: lstore #13
    //   262: aload #4
    //   264: iconst_3
    //   265: aaload
    //   266: invokestatic parseLong : (Ljava/lang/String;)J
    //   269: lstore #13
    //   271: goto -> 316
    //   274: astore #15
    //   276: aload_1
    //   277: new java/lang/StringBuilder
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: sipush #145
    //   287: ldc2_w 5114710823911393206
    //   290: lload_2
    //   291: lxor
    //   292: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: aload #4
    //   302: iconst_2
    //   303: aaload
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual toString : ()Ljava/lang/String;
    //   310: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   315: return
    //   316: invokestatic getAPI : ()Lme/rerere/matrix/api/MatrixAPI;
    //   319: aload #11
    //   321: aload #12
    //   323: iload #8
    //   325: iload #9
    //   327: invokevirtual b : (II)Lme/rerere/matrix/api/HackType;
    //   330: lload #13
    //   332: invokestatic valueOf : (J)Ljava/lang/Long;
    //   335: invokeinterface tempBypass : (Lorg/bukkit/entity/Player;Lme/rerere/matrix/api/HackType;Ljava/lang/Long;)V
    //   340: aload_1
    //   341: new java/lang/StringBuilder
    //   344: dup
    //   345: invokespecial <init> : ()V
    //   348: sipush #18927
    //   351: ldc2_w 2328859895407234762
    //   354: lload_2
    //   355: lxor
    //   356: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: aload #12
    //   366: invokevirtual j : ()Ljava/lang/String;
    //   369: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: sipush #25792
    //   375: ldc2_w 2502389592744322016
    //   378: lload_2
    //   379: lxor
    //   380: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: lload #13
    //   390: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   393: sipush #12461
    //   396: ldc2_w 3890459804243179407
    //   399: lload_2
    //   400: lxor
    //   401: <illegal opcode> u : (IJ)Ljava/lang/String;
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: invokevirtual toString : ()Ljava/lang/String;
    //   412: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   417: return
    // Exception table:
    //   from	to	target	type
    //   63	75	78	java/lang/Exception
    //   70	121	121	java/lang/Exception
    //   134	150	153	java/lang/Exception
    //   195	205	208	java/lang/Exception
    //   200	251	254	java/lang/Exception
    //   262	271	274	java/lang/Exception
  }
  
  static {
    long l = a ^ 0x33693DAE376BL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "û\n^fØa¨Ò;ÁWe(ÅÙùÔ{¶\013¬µÁ«7{q*piSGy4¡è23a\nÁk7ªê;\024( y¤û©\tuÚ£'øù!\030å;\016fGW=?X\025ª¬æx{\030b\017»'Âª7\n4<\017âL×qËÝEM@ûHç=$§¥t+2SÜ:\016\003=¯U·;](\007wõV! »¾Î\f+ÑHË\034x;{\000 R=¤Ú-\005îhRIVúÚ1Æ\\Õ¯¦æ9æy@¨2ÿª¨gr.ýæ#©\000[=Ñ|=¨ð·\032C\034\022ìø\004 +\\àIþi¬ç4ý\004J'«îe:á\"Úå\013k¢\034¡1[= ¥rýe74«à\"P3ÿ DbmhÀEpNW\023Ôë@Ê=îf>\000¾ÝU_n\013D¶Ñóà\004AÏùÍ,9\017¤ðÜ]ô~Ó.^´Õr¿T¬!\034 3%á^~¦2¼¬ÿ*Rÿ \nÕ\026zì\013ç\016EÞ÷\034r´QJ\022#lÓ5Ö¨Qý=!ªÂ0z:ÑIÈ\034ð¨ÇyÝUÞØ¥Â·M,íms\033\"®h.ÊØÔ§QÆ¨+zyëäÔKþ").length();
    byte b2 = 56;
    byte b = -1;
    while (true);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1479;
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
        throw new RuntimeException("me/rerere/matrix/internal/bn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/bn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */