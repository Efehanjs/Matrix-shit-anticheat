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
import org.bukkit.Location;

public final class dk {
  private final int k;
  
  private final int v;
  
  private final int b;
  
  private final long i;
  
  private static final long a = o3.a(5240556671887246087L, -5110976786461884557L, MethodHandles.lookup().lookupClass()).a(49426190672293L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dk.a : J
    //   3: ldc2_w 77372661579403
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #14265
    //   18: ldc2_w 8431117330401305909
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield b : I
    //   35: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   38: sipush #2132
    //   41: ldc2_w 8808734590035172059
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield k : I
    //   58: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   61: sipush #19702
    //   64: ldc2_w 2984609829113749112
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield v : I
    //   81: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   84: bipush #41
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: areturn
  }
  
  @NotNull
  public final dk b(int paramInt1, int paramInt2, int paramInt3) {
    return new dk(paramInt1, paramInt2, paramInt3);
  }
  
  public final int t() {
    return this.b;
  }
  
  public int hashCode() {
    null = Integer.hashCode(this.b);
    null = null * 31 + Integer.hashCode(this.k);
    return null * 31 + Integer.hashCode(this.v);
  }
  
  public final int h() {
    return this.v;
  }
  
  public final int m() {
    return this.k;
  }
  
  public final long b() {
    return this.i;
  }
  
  public dk(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.k = paramInt2;
    this.v = paramInt3;
    this.i = pc.j();
  }
  
  public final int p() {
    return this.v;
  }
  
  public final boolean b(long paramLong, @NotNull Location paramLocation) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dk.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic a : ()I
    //   9: istore #4
    //   11: aload_3
    //   12: invokevirtual getY : ()D
    //   15: aload_0
    //   16: getfield k : I
    //   19: i2d
    //   20: dsub
    //   21: invokestatic abs : (D)D
    //   24: ldc2_w 3.0
    //   27: dcmpg
    //   28: iload #4
    //   30: ifne -> 67
    //   33: ifgt -> 131
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_3
    //   44: invokevirtual getZ : ()D
    //   47: aload_0
    //   48: getfield v : I
    //   51: i2d
    //   52: dsub
    //   53: invokestatic abs : (D)D
    //   56: ldc2_w 2.0
    //   59: dcmpg
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: iload #4
    //   69: lload_1
    //   70: lconst_0
    //   71: lcmp
    //   72: ifle -> 114
    //   75: ifne -> 112
    //   78: ifgt -> 131
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload_3
    //   89: invokevirtual getX : ()D
    //   92: aload_0
    //   93: getfield b : I
    //   96: i2d
    //   97: dsub
    //   98: invokestatic abs : (D)D
    //   101: ldc2_w 2.0
    //   104: dcmpg
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: iload #4
    //   114: ifne -> 128
    //   117: ifgt -> 131
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iconst_1
    //   128: goto -> 132
    //   131: iconst_0
    //   132: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	36	39	java/lang/RuntimeException
    //   33	60	63	java/lang/RuntimeException
    //   67	81	84	java/lang/RuntimeException
    //   78	105	108	java/lang/RuntimeException
    //   112	120	123	java/lang/RuntimeException
  }
  
  public final int j() {
    return this.b;
  }
  
  public final int b() {
    return this.k;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    long l = a ^ 0x65D7E629D528L;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          if (this == paramObject)
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (!(paramObject instanceof dk))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    dk dk1 = (dk)paramObject;
    try {
      if (i == 0)
        try {
          if (this.b != dk1.b)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0) {
        try {
          if (this.k != dk1.k)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (i == 0) {
          
          } else {
            return this.v;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.k != dk1.k)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  static {
    long l = a ^ 0x10651A1A1569L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "GÔÒ\01764c\032ÕJí°f0Gu\020à«±90*w\020ðÔH)H|\030¥SPÞRr6¥s-\035}0æ`cØÖ\030\0276$").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x16B7;
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
        throw new RuntimeException("me/rerere/matrix/internal/dk", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/dk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */