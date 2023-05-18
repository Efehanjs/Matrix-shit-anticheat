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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.util.Vector;

public class qa implements Cloneable {
  private Vector b;
  
  private Vector i;
  
  private static String[] a;
  
  private static final long c = o3.a(-4967256120874373130L, -3743416353703577157L, MethodHandles.lookup().lookupClass()).a(107852574216737L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public Vector j() {
    return this.i;
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/qa.c : J
    //   3: ldc2_w 82750010492787
    //   6: lxor
    //   7: lstore_1
    //   8: bipush #59
    //   10: istore #4
    //   12: invokestatic a : ()I
    //   15: iconst_1
    //   16: istore #5
    //   18: istore_3
    //   19: aload_0
    //   20: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   23: astore #6
    //   25: iload #5
    //   27: bipush #59
    //   29: imul
    //   30: aload #6
    //   32: iload_3
    //   33: ifne -> 57
    //   36: ifnonnull -> 55
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   45: athrow
    //   46: bipush #43
    //   48: goto -> 60
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload #6
    //   57: invokevirtual hashCode : ()I
    //   60: iadd
    //   61: istore #5
    //   63: aload_0
    //   64: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   67: astore #7
    //   69: iload #5
    //   71: bipush #59
    //   73: imul
    //   74: aload #7
    //   76: iload_3
    //   77: ifne -> 101
    //   80: ifnonnull -> 99
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: bipush #43
    //   92: goto -> 104
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload #7
    //   101: invokevirtual hashCode : ()I
    //   104: iadd
    //   105: istore #5
    //   107: iload #5
    //   109: ireturn
    // Exception table:
    //   from	to	target	type
    //   25	39	42	java/lang/RuntimeException
    //   36	51	51	java/lang/RuntimeException
    //   69	83	86	java/lang/RuntimeException
    //   80	95	95	java/lang/RuntimeException
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/qa.c : J
    //   3: ldc2_w 43871820339614
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifeq -> 62
    //   42: instanceof me/rerere/matrix/internal/qa
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/qa
    //   65: astore #5
    //   67: aload #5
    //   69: iload #4
    //   71: ifeq -> 95
    //   74: aload_0
    //   75: invokevirtual b : (Ljava/lang/Object;)Z
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   98: astore #6
    //   100: aload #5
    //   102: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   105: astore #7
    //   107: aload #6
    //   109: iload #4
    //   111: ifeq -> 153
    //   114: ifnonnull -> 151
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload #7
    //   126: iload #4
    //   128: ifeq -> 183
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: ifnull -> 179
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: goto -> 173
    //   151: aload #6
    //   153: iload #4
    //   155: ifeq -> 183
    //   158: aload #7
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifne -> 179
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: iconst_0
    //   174: ireturn
    //   175: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   178: athrow
    //   179: aload_0
    //   180: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   183: astore #8
    //   185: aload #5
    //   187: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   190: astore #9
    //   192: aload #8
    //   194: iload #4
    //   196: ifeq -> 230
    //   199: ifnonnull -> 228
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   208: athrow
    //   209: aload #9
    //   211: ifnull -> 256
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   220: athrow
    //   221: goto -> 250
    //   224: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   227: athrow
    //   228: aload #8
    //   230: aload #9
    //   232: invokevirtual equals : (Ljava/lang/Object;)Z
    //   235: iload #4
    //   237: ifeq -> 257
    //   240: ifne -> 256
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: iconst_0
    //   251: ireturn
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: iconst_1
    //   257: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	81	84	java/lang/RuntimeException
    //   74	90	90	java/lang/RuntimeException
    //   107	117	120	java/lang/RuntimeException
    //   114	131	134	java/lang/RuntimeException
    //   124	141	144	java/lang/RuntimeException
    //   153	166	169	java/lang/RuntimeException
    //   158	175	175	java/lang/RuntimeException
    //   192	202	205	java/lang/RuntimeException
    //   199	214	217	java/lang/RuntimeException
    //   209	224	224	java/lang/RuntimeException
    //   230	243	246	java/lang/RuntimeException
    //   240	252	252	java/lang/RuntimeException
  }
  
  @Nullable
  public qa b() {
    try {
      qa qa1 = (qa)super.clone();
      qa1.i = this.i.clone();
      qa1.b = this.b.clone();
      return qa1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      cloneNotSupportedException.printStackTrace();
      return null;
    } 
  }
  
  public Vector b() {
    return this.b;
  }
  
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/qa.c : J
    //   3: ldc2_w 40882214644237
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #30756
    //   18: ldc2_w 3245278361920088280
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: sipush #428
    //   41: ldc2_w 1915010735039828305
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: ldc ')'
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: areturn
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof qa;
  }
  
  public qa(Vector paramVector1, Vector paramVector2) {
    this.i = paramVector1;
    this.b = paramVector2;
  }
  
  @NotNull
  public Vector b(double paramDouble) {
    Vector vector1 = new Vector(this.b.getX(), this.b.getY(), this.b.getZ());
    Vector vector2 = new Vector(this.i.getX(), this.i.getY(), this.i.getZ());
    return vector2.add(vector1.multiply(paramDouble));
  }
  
  public static void T(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] C() {
    return a;
  }
  
  static {
    T(null);
    long l = c ^ 0x21D35BDF240L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "JÄ÷ðÀé´>¥\020ã$ÁB\007DyÓNr0ø ,3Ø\034¬åæ¯,x2Zt¡óÒü3@@^Å\034\\Ä\"O\031Cß\n").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5D18;
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
        throw new RuntimeException("me/rerere/matrix/internal/qa", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/qa'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */