package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.JsonParser;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.kotlin.LazyKt;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class bk {
  @NotNull
  private final Lazy v = LazyKt.lazy(uk.i);
  
  @NotNull
  private final Lazy b = LazyKt.lazy(uh.i);
  
  @NotNull
  private final Lazy i = LazyKt.lazy(wf.i);
  
  private static final long a = o3.a(-7658962266097962459L, -8414134827456443768L, MethodHandles.lookup().lookupClass()).a(31390073076379L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public final Object b(@NotNull String paramString, int paramInt, long paramLong) {
    pa.v = true;
    pa.i.b("2024-02-13 11:32:12");
    rl.k = true;
    rl.v = true;
    rl.b = true;
    return Collections.emptyList();
  }
  
  static {
    long l = a ^ 0x2DA8946F60D4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[24];
    boolean bool = false;
    String str;
    int i = (str = "hH4eM5ï\023ØëÂ9¶\017 ù@Ô\003Ï\025º&W{tãÞ¾Çµke%\007ÌÍ¦È\037Q9$\"Ü\035 ogÉ¬eòZ°üã5bvB1\002èfû>ð$=Ëë)\035þr!÷\020Å\017ÝP,Ùn\022QT¾\020°iMxÖÛ4]D&e§iYj(¬×\025½ ðg1\030g÷¤,Ò0\r@íGëEÊ²Ô!VÔ\023\032ÀV{xnôÚ ÔÂÓ)39òÍ.2dûä\005\037ûP\0323¤v}\013É\016\032ÞP\n\f«¨ZË=ÃÜ¡AþÒ¤³ñãîÃý\025\026¤Ò@\026\rþ.»Õ\027ÔµéÇ:¥zLfj8nõ»­á:D=½þÖ$ãR±\031f{ô`\013\034þ\020¿»ìbÉço·\030\0027ªòV\023 èâ\005øHUî¹\"\001¤\027æóVø¦B:\001<)/APù3- a Ö\0232µÂ\003\r°#êK\007ãïÛQ\033cðW¸èE wúO\006\020&\006¸¬(ÓUiÑEÐ\030§\030âÄÞðpÙyRÞ\02033Æ«DîPWÂ!ü\020.à¤x\006Ï/ÏÁiEjé [\023VìÆz°¢0\003Ñß\027¤/ Y×m\\ïR\037àæò]Ô\020øÚÔ«ÁzH!ªðñÒn\030f2\004ë¹±\024\034µ\026WYøÿÊEÚ´¥\007\b©°¨ Ëõs~@{\nºX´Y\032>.2\nÒ8³,{¤2\024ÄM\003+8@¤iRÉA¹bÇ¼fTáÇ\021\013B`¢\007'ùS%Rm£OåÃ\020\017á8©þô\005­\"\027C\025+o×zÐªù4À}Às0\024\020ɠðú2¶ \tkÝ.ýæò$y;nÕÆð\\×çc\006\027óe¦\006\bÜ\037Ñ î\"\022ÀC¢ðô6Î¦ÑmÉ-ÚÔCÆ\027\026z-C¸É$\026Ús0Ì-¯Ô\021? ·7µ¶:,Jav\034bpØÉMÄ\016t¦Í¨¶Fæ#|W©ÌÁÛVWTUIºÕíÔ\t\f~\001&p_Í\034m×@ÿ&\013C®ó7ädI«¨G\032úÐ\024ªL7\026ámÎÊúO9#|\032zë¡+KçK@Ú5\005!ÑÛþü[´ê¸¾ª °µQÒÞ\001à2ab\\æ=y2¯³\031>HÂCÊ¯î~Ì P1OYiåzy]}³+ÚâÏ\026¦ÊñÕ×Øÿ¯ù¸ö¶\\U¼ò\023ò/tN$dX<º9\016\013ÈÉ¸ª|\034®¨¨,ÑüÌã\002xÿ%LÉ\fÚK«U\002Ë¹\027¼\000£oø\023+kÇv-\021\023Ë²\030Ëiß(&ëá]¹¢ï-({\\z8\0341æfÆå~IîÑh¤'ðùÙ[ày\034VRkBïxòÅYòà*ÊåTÇñêûÝÂXQÍ}½ôÚ.Ò½¿ÂµqFF0·¼ð\006\006ya]ÑX ZÛ\006#\032Í/q1\025V\022f@:\003ÚåÌ¡\033Ú\000h-Mô\032ÖÆÁÞ\013¡pQ\013õÙ1\026\013ZpýôPb¯¢;¼qjÄ\007%1|jH\007\002E¢{â'W×ñ\tû¶Gµ\021\005Ñ´\000G\022zDdùþ*\"ý\021[^\f <ð'\"\n\004lã,C ZÕáC7/F½xl¯­s°û/\"vÄÂ^¶±Ov\003\034.pÍ´ÒbëOß­¢h¤\001móKÏü\032 '|ôE¸Ë,ù>Èí\r\026^ÑòYÁN\027yÛgF9$q A!¼\000¤f°y¿µÕ\032fõ\020ìv {\022÷÷ \023\035±s\b").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xA9A;
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
        throw new RuntimeException("me/rerere/matrix/internal/bk", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/bk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */