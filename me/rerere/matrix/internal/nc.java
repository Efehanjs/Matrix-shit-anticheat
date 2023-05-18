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

public final class nc {
  @NotNull
  private static final String b;
  
  @NotNull
  public static final nc i;
  
  private static int[] a;
  
  private static final long c = o3.a(-6264525854307967371L, -2152465222205741509L, MethodHandles.lookup().lookupClass()).a(181906323137404L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @NotNull
  public static final String b(long paramLong, @NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/nc.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 64263443031931
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic a : ()I
    //   17: istore #5
    //   19: new me/rerere/matrix/thirdparty/okhttp3/Request$Builder
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: aload_2
    //   27: invokevirtual url : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okhttp3/Request$Builder;
    //   30: sipush #6507
    //   33: ldc2_w 1888403154890146869
    //   36: lload_0
    //   37: lxor
    //   38: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   43: sipush #6148
    //   46: ldc2_w 5071639442980652377
    //   49: lload_0
    //   50: lxor
    //   51: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   56: invokevirtual addHeader : (Ljava/lang/String;Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okhttp3/Request$Builder;
    //   59: invokevirtual build : ()Lme/rerere/matrix/thirdparty/okhttp3/Request;
    //   62: astore #6
    //   64: nop
    //   65: new me/rerere/matrix/thirdparty/okhttp3/OkHttpClient$Builder
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: invokevirtual build : ()Lme/rerere/matrix/thirdparty/okhttp3/OkHttpClient;
    //   75: aload #6
    //   77: invokevirtual newCall : (Lme/rerere/matrix/thirdparty/okhttp3/Request;)Lme/rerere/matrix/thirdparty/okhttp3/Call;
    //   80: invokeinterface execute : ()Lme/rerere/matrix/thirdparty/okhttp3/Response;
    //   85: checkcast java/io/Closeable
    //   88: astore #7
    //   90: aconst_null
    //   91: astore #8
    //   93: nop
    //   94: aload #7
    //   96: checkcast me/rerere/matrix/thirdparty/okhttp3/Response
    //   99: astore #9
    //   101: iconst_0
    //   102: istore #10
    //   104: iload #5
    //   106: ifne -> 147
    //   109: aload #9
    //   111: invokevirtual body : ()Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;
    //   114: dup
    //   115: ifnull -> 139
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   124: athrow
    //   125: invokevirtual string : ()Ljava/lang/String;
    //   128: dup
    //   129: ifnonnull -> 149
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: athrow
    //   139: pop
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   146: athrow
    //   147: ldc ''
    //   149: astore #11
    //   151: aload #7
    //   153: aload #8
    //   155: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   158: aload #11
    //   160: areturn
    //   161: astore #9
    //   163: aload #9
    //   165: astore #8
    //   167: aload #9
    //   169: athrow
    //   170: astore #9
    //   172: aload #7
    //   174: aload #8
    //   176: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   179: aload #9
    //   181: athrow
    //   182: astore #7
    //   184: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   187: new java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial <init> : ()V
    //   194: sipush #16464
    //   197: ldc2_w 8876379535686638860
    //   200: lload_0
    //   201: lxor
    //   202: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: aload #7
    //   212: invokevirtual getClass : ()Ljava/lang/Class;
    //   215: invokevirtual getName : ()Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual toString : ()Ljava/lang/String;
    //   224: lload_3
    //   225: invokevirtual b : (Ljava/lang/String;J)V
    //   228: ldc ''
    //   230: areturn
    // Exception table:
    //   from	to	target	type
    //   64	182	182	java/lang/Exception
    //   93	151	161	java/lang/Throwable
    //   93	151	170	finally
    //   104	118	121	java/lang/Throwable
    //   109	132	135	java/lang/Throwable
    //   125	140	143	java/lang/Throwable
    //   161	170	170	finally
    //   170	172	170	finally
  }
  
  static {
    long l = c ^ 0x4875FC5057C0L;
    f(new int[5]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "ìô­Ùqà8½«¸Et\030gÄ\000Çº2Ú\020­Ã\034cÏÄ§éNq¸² vSj¿\030¨h\"s!/¸ùp.çó÷S17¦Ã´ñ*l ;\025Ý´\007\016\0348^)\0243ìQUÑ÷r\030WdA~\034(\005kæ\013¸Äj\021\006öiÌën_HvÏi\n\031öPusq)Òz\032Ã\000\003¨w©qgº\035à\tÒ_Ok±Z\013]î«¨×\027þÔå\023Ê¿Ì¼\004ÿ\037á°¶Þ\032-\tMÏÚM¼Ù¶&çè=UVagxt¢~§ÿ\003%Ì»hÈ,úp-\bÆz©«¹B\001ÕöR").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public static void f(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] L() {
    return a;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4D3C;
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
        throw new RuntimeException("me/rerere/matrix/internal/nc", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/nc'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */