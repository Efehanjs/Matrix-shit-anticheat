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
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class eb {
  private static final boolean r;
  
  @NotNull
  private static final String x;
  
  @NotNull
  private static final Lazy z;
  
  @NotNull
  private static final Lazy k;
  
  @NotNull
  public static final eb v;
  
  @NotNull
  private static final Lazy b;
  
  @NotNull
  private static final String i;
  
  private static String[] a;
  
  private static final long c = o3.a(4471894293259668095L, -568148343791005132L, MethodHandles.lookup().lookupClass()).a(176445889684807L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public final boolean h(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/eb.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 8963263087923
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore_3
    //   18: dup2
    //   19: bipush #16
    //   21: lshl
    //   22: bipush #16
    //   24: lushr
    //   25: lstore #4
    //   27: pop2
    //   28: dup2
    //   29: ldc2_w 99482137016733
    //   32: lxor
    //   33: lstore #6
    //   35: dup2
    //   36: ldc2_w 4197557099255
    //   39: lxor
    //   40: lstore #8
    //   42: dup2
    //   43: ldc2_w 129986179282069
    //   46: lxor
    //   47: dup2
    //   48: bipush #48
    //   50: lushr
    //   51: l2i
    //   52: istore #10
    //   54: dup2
    //   55: bipush #16
    //   57: lshl
    //   58: bipush #48
    //   60: lushr
    //   61: l2i
    //   62: istore #11
    //   64: dup2
    //   65: bipush #32
    //   67: lshl
    //   68: bipush #32
    //   70: lushr
    //   71: l2i
    //   72: istore #12
    //   74: pop2
    //   75: pop2
    //   76: invokestatic r : ()I
    //   79: istore #13
    //   81: nop
    //   82: aload_0
    //   83: invokespecial j : ()I
    //   86: iload #13
    //   88: ifeq -> 150
    //   91: bipush #17
    //   93: if_icmplt -> 144
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload_0
    //   104: invokespecial b : ()I
    //   107: iload #13
    //   109: lload_1
    //   110: lconst_0
    //   111: lcmp
    //   112: iflt -> 152
    //   115: ifeq -> 150
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   124: athrow
    //   125: iconst_1
    //   126: if_icmplt -> 144
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   135: athrow
    //   136: iconst_0
    //   137: goto -> 314
    //   140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   143: athrow
    //   144: aload_0
    //   145: lload #8
    //   147: invokespecial j : (J)Z
    //   150: iload #13
    //   152: lload_1
    //   153: lconst_0
    //   154: lcmp
    //   155: ifle -> 193
    //   158: ifeq -> 191
    //   161: ifne -> 179
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   170: athrow
    //   171: iconst_0
    //   172: goto -> 314
    //   175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   178: athrow
    //   179: aload_0
    //   180: iload #10
    //   182: i2c
    //   183: iload #11
    //   185: i2c
    //   186: iload #12
    //   188: invokespecial p : (CCI)Z
    //   191: iload #13
    //   193: lload_1
    //   194: lconst_0
    //   195: lcmp
    //   196: ifle -> 228
    //   199: ifeq -> 226
    //   202: ifne -> 220
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   211: athrow
    //   212: iconst_0
    //   213: goto -> 314
    //   216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   219: athrow
    //   220: aload_0
    //   221: lload #6
    //   223: invokespecial m : (J)Z
    //   226: iload #13
    //   228: lload_1
    //   229: lconst_0
    //   230: lcmp
    //   231: iflt -> 260
    //   234: ifeq -> 258
    //   237: ifne -> 255
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: athrow
    //   247: iconst_0
    //   248: goto -> 314
    //   251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   254: athrow
    //   255: getstatic me/rerere/matrix/internal/eb.r : Z
    //   258: iload #13
    //   260: lload_1
    //   261: lconst_0
    //   262: lcmp
    //   263: iflt -> 296
    //   266: ifeq -> 294
    //   269: ifeq -> 313
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload_0
    //   280: iload_3
    //   281: i2c
    //   282: lload #4
    //   284: invokespecial b : (CJ)Z
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   293: athrow
    //   294: iload #13
    //   296: ifeq -> 310
    //   299: ifne -> 313
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   308: athrow
    //   309: iconst_0
    //   310: goto -> 314
    //   313: iconst_1
    //   314: ireturn
    // Exception table:
    //   from	to	target	type
    //   81	96	99	java/lang/RuntimeException
    //   91	118	121	java/lang/RuntimeException
    //   103	129	132	java/lang/RuntimeException
    //   125	140	140	java/lang/RuntimeException
    //   150	164	167	java/lang/RuntimeException
    //   161	175	175	java/lang/RuntimeException
    //   191	205	208	java/lang/RuntimeException
    //   202	216	216	java/lang/RuntimeException
    //   226	240	243	java/lang/RuntimeException
    //   237	251	251	java/lang/RuntimeException
    //   258	272	275	java/lang/RuntimeException
    //   269	287	290	java/lang/RuntimeException
    //   294	302	305	java/lang/RuntimeException
  }
  
  static {
    g(new String[1]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "«û\n\031uêºl\006¢Pí}¿7F kúTMø¹%³ØÍqL~ëq\036¯ß\020^CºBz9:mCcÞ/ìð$Ù?[@ã«À@øè\001fq\034©CfÁð±ÁÇã©â<MËg`ÓI\\U\016BÄìI¯@ÐáØ\023VÝXÞûå¦û\r²\\DáH78ÿÂº|;pHÑÅsÍ½ç¦5ª^\021U±\004¦fTQ\016V\024Xh\002\034áäó©\0160¡Z\022ô¬ÕºÀ®è]i·Þ\0052¸gð\013WtMù{K÷\000\025XwI«¸\030Ie¸·üD>¹Î\"`¯¡é2\016ºµ8«E¦Ê\034îp\002ò\035g\tæ\tÑä,~# äM\033uÅà\004À§.ãP¹MM©è¾ð¹!1Q\f÷uÞ ¤\037\026µ").length();
    byte b2 = 64;
    byte b = -1;
    while (true);
  }
  
  public static void g(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] U() {
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5411;
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
        throw new RuntimeException("me/rerere/matrix/internal/eb", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/eb'
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
    long l = c ^ 0x736ECB165B40L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\eb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */