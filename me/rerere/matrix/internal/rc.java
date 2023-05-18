package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.ChatColor;

public final class rc {
  private static final Pattern i;
  
  private static int[] a;
  
  private static final long b = o3.a(-3342967683423720505L, 5992331124540908118L, MethodHandles.lookup().lookupClass()).a(179858342049625L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  static {
    u(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "JÉð\002¥Ïzf\016í-\002Ù\r\030ïcñlõå;¸CÃÚ#¡|º8|´\001Mrõrµ¯7ðì\020¡`t÷õ\"Îõ ëã´[b\024Ý\034\026,h7$\030Ã!\f \003¼\006³R¯ÙE¨ì\001Á/¾$4PUÀIØg.°ñ¶2\035\036N\t1ìÜNÉ¥\004]Í9¤þÆí´\005=§I5N,ër¨W¿Ð\"°\036Ö ´q\027×@\031Î?É@\037â¢]þù¬z\\7s9N\033(ån}çR'\\~\003¸®@\017t«ØNpíÒ´4Û\026ãX\027÷#\001\005]·").length();
    byte b2 = 96;
    byte b = -1;
    while (true);
  }
  
  @JvmOverloads
  @NotNull
  public static final String b(@NotNull String paramString, char paramChar, long paramLong) {
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0xB7D1C7E3491L;
    return ChatColor.translateAlternateColorCodes(paramChar, j(l, paramString));
  }
  
  @JvmOverloads
  @NotNull
  public static final String b(long paramLong, @NotNull String paramString) {
    paramLong = b ^ paramLong;
    int i = (int)((paramLong ^ 0xCEB95D3A835L) >>> 32L);
    int j = (int)((paramLong ^ 0xCEB95D3A835L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0xCEB95D3A835L) << 48L >>> 48L);
    paramLong ^ 0xCEB95D3A835L;
    return b(paramString, false, 1, null, i, (short)j, (short)k);
  }
  
  @NotNull
  public static final List b(int paramInt1, @NotNull List paramList, int paramInt2, char paramChar, short paramShort) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/rc.b : J
    //   27: lxor
    //   28: lstore #5
    //   30: lload #5
    //   32: dup2
    //   33: ldc2_w 97116706439091
    //   36: lxor
    //   37: lstore #7
    //   39: pop2
    //   40: aload_1
    //   41: checkcast java/lang/Iterable
    //   44: astore #10
    //   46: invokestatic a : ()I
    //   49: iconst_0
    //   50: istore #11
    //   52: aload #10
    //   54: astore #12
    //   56: new java/util/ArrayList
    //   59: dup
    //   60: aload #10
    //   62: bipush #10
    //   64: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   67: invokespecial <init> : (I)V
    //   70: checkcast java/util/Collection
    //   73: astore #13
    //   75: iconst_0
    //   76: istore #14
    //   78: istore #9
    //   80: aload #12
    //   82: invokeinterface iterator : ()Ljava/util/Iterator;
    //   87: astore #15
    //   89: aload #15
    //   91: invokeinterface hasNext : ()Z
    //   96: ifeq -> 149
    //   99: aload #15
    //   101: invokeinterface next : ()Ljava/lang/Object;
    //   106: astore #16
    //   108: aload #13
    //   110: aload #16
    //   112: checkcast java/lang/String
    //   115: astore #17
    //   117: iload #9
    //   119: ifne -> 151
    //   122: astore #19
    //   124: iconst_0
    //   125: istore #18
    //   127: aload #17
    //   129: iload_3
    //   130: lload #7
    //   132: invokestatic b : (Ljava/lang/String;CJ)Ljava/lang/String;
    //   135: aload #19
    //   137: swap
    //   138: invokeinterface add : (Ljava/lang/Object;)Z
    //   143: pop
    //   144: iload #9
    //   146: ifeq -> 89
    //   149: aload #13
    //   151: checkcast java/util/List
    //   154: nop
    //   155: areturn
  }
  
  public static void u(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] K() {
    return a;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1A61;
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
        throw new RuntimeException("me/rerere/matrix/internal/rc", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/rc'
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
    long l = b ^ 0xC7875775701L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */