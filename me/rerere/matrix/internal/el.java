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
import org.bukkit.util.Vector;

public class el {
  @NotNull
  private final Vector k;
  
  private final int v;
  
  private boolean b;
  
  private long i;
  
  private static final long a = o3.a(-7596352854195161249L, 7721410665575699870L, MethodHandles.lookup().lookupClass()).a(189400736936008L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public el(long paramLong, @NotNull Vector paramVector, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/el.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: invokespecial <init> : ()V
    //   10: invokestatic r : ()I
    //   13: aload_0
    //   14: invokestatic j : ()J
    //   17: putfield i : J
    //   20: istore #5
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield b : Z
    //   27: iload #5
    //   29: ifeq -> 79
    //   32: aload_3
    //   33: ifnonnull -> 68
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   42: athrow
    //   43: new java/lang/NullPointerException
    //   46: dup
    //   47: sipush #25232
    //   50: ldc2_w 9142166057740007981
    //   53: lload_1
    //   54: lxor
    //   55: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: athrow
    //   64: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   67: athrow
    //   68: aload_0
    //   69: aload_3
    //   70: putfield k : Lorg/bukkit/util/Vector;
    //   73: aload_0
    //   74: iload #4
    //   76: putfield v : I
    //   79: return
    // Exception table:
    //   from	to	target	type
    //   22	36	39	java/lang/NullPointerException
    //   32	64	64	java/lang/NullPointerException
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof el;
  }
  
  @NotNull
  public Vector b() {
    return this.k;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public int b() {
    return this.v;
  }
  
  public int hashCode() {
    long l1 = a ^ 0x5CAD17359DEEL;
    byte b = 59;
    int j = 1;
    j = j * 59 + b();
    int i = yl.a();
    long l2 = b();
    j = j * 59 + (int)(l2 >>> 32L ^ l2);
    Vector vector = b();
    try {
      if (i == 0) {
        try {
          if (vector == null) {
          
          } else {
          
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        return j * 59 + vector.hashCode();
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/el.a : J
    //   3: ldc2_w 109373199417377
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/el
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/el
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifne -> 98
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual b : ()I
    //   98: iload #4
    //   100: ifne -> 146
    //   103: aload #5
    //   105: invokevirtual b : ()I
    //   108: if_icmpeq -> 124
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   117: athrow
    //   118: iconst_0
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   123: athrow
    //   124: aload_0
    //   125: iload #4
    //   127: ifne -> 156
    //   130: invokevirtual b : ()J
    //   133: aload #5
    //   135: invokevirtual b : ()J
    //   138: lcmp
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   145: athrow
    //   146: ifeq -> 155
    //   149: iconst_0
    //   150: ireturn
    //   151: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   154: athrow
    //   155: aload_0
    //   156: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   159: astore #6
    //   161: aload #5
    //   163: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   166: astore #7
    //   168: aload #6
    //   170: iload #4
    //   172: ifne -> 206
    //   175: ifnonnull -> 204
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   184: athrow
    //   185: aload #7
    //   187: ifnull -> 232
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   196: athrow
    //   197: goto -> 226
    //   200: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   203: athrow
    //   204: aload #6
    //   206: aload #7
    //   208: invokevirtual equals : (Ljava/lang/Object;)Z
    //   211: iload #4
    //   213: ifne -> 233
    //   216: ifne -> 232
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   225: athrow
    //   226: iconst_0
    //   227: ireturn
    //   228: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   231: athrow
    //   232: iconst_1
    //   233: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/NullPointerException
    //   19	32	32	java/lang/NullPointerException
    //   37	48	51	java/lang/NullPointerException
    //   42	57	57	java/lang/NullPointerException
    //   67	81	84	java/lang/NullPointerException
    //   78	90	90	java/lang/NullPointerException
    //   98	111	114	java/lang/NullPointerException
    //   103	120	120	java/lang/NullPointerException
    //   124	139	142	java/lang/NullPointerException
    //   146	151	151	java/lang/NullPointerException
    //   168	178	181	java/lang/NullPointerException
    //   175	190	193	java/lang/NullPointerException
    //   185	200	200	java/lang/NullPointerException
    //   206	219	222	java/lang/NullPointerException
    //   216	228	228	java/lang/NullPointerException
  }
  
  public void b(long paramLong) {
    this.i = paramLong;
  }
  
  public long b() {
    return this.i;
  }
  
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/el.a : J
    //   3: ldc2_w 35971562840336
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #31571
    //   18: ldc2_w 7510228897310746867
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: sipush #24356
    //   41: ldc2_w 7741723306170879110
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: invokevirtual b : ()I
    //   58: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   61: sipush #20783
    //   64: ldc2_w 1518200675474145931
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: invokevirtual b : ()J
    //   81: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   84: sipush #32481
    //   87: ldc2_w 31015240146660672
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: invokevirtual b : ()Z
    //   104: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   107: ldc ')'
    //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: areturn
  }
  
  static {
    long l = a ^ 0x33CCEBE28AD0L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "B\021(\016¤¯ìÍ8$\020Þ)ÃÒÁ \0167Eõo©\033t]\bÒ%Ãl¨Yßfi\034ðÝYF\n¾\027[\001²¼Tñ\031ñ,Z \r1m>\"Q®ÀïÌ¥ð2=\f\032ûA\003ðqwË:¦Ð\030¢\013e2Æ\nä£iº&Õ¸±!Íðs\"c").length();
    byte b2 = 64;
    byte b = -1;
    while (true);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2469;
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
        throw new RuntimeException("me/rerere/matrix/internal/el", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/el'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\el.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */