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
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public final class on {
  @Nullable
  private final Block k;
  
  @Nullable
  private final Entity v;
  
  @NotNull
  private final Vector b;
  
  @Nullable
  private final BlockFace i;
  
  private static int a;
  
  private static final long c = o3.a(-2396372813226410330L, 1094696051788881869L, MethodHandles.lookup().lookupClass()).a(22707323433098L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @Nullable
  public final BlockFace j() {
    return this.i;
  }
  
  @Nullable
  public final Entity j() {
    return this.v;
  }
  
  @Nullable
  public final Entity b() {
    return this.v;
  }
  
  @Nullable
  public final BlockFace b() {
    return this.i;
  }
  
  @Nullable
  public final Block j() {
    return this.k;
  }
  
  @NotNull
  public final Vector j() {
    return this.b;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/on.c : J
    //   3: ldc2_w 57458757341581
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #19815
    //   18: ldc2_w 5148560247778809152
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: getfield b : Lorg/bukkit/util/Vector;
    //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: sipush #23376
    //   41: ldc2_w 5895648336426140533
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: getfield k : Lorg/bukkit/block/Block;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: sipush #9273
    //   64: ldc2_w 6547096002578840605
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: getfield v : Lorg/bukkit/entity/Entity;
    //   81: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: sipush #8512
    //   87: ldc2_w 8509967497539778918
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: getfield i : Lorg/bukkit/block/BlockFace;
    //   104: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   107: bipush #41
    //   109: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: areturn
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/on.c : J
    //   3: ldc2_w 110562187640512
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic a : ()I
    //   11: istore_3
    //   12: aload_0
    //   13: getfield b : Lorg/bukkit/util/Vector;
    //   16: invokevirtual hashCode : ()I
    //   19: istore #4
    //   21: iload #4
    //   23: bipush #31
    //   25: imul
    //   26: aload_0
    //   27: getfield k : Lorg/bukkit/block/Block;
    //   30: iload_3
    //   31: ifne -> 56
    //   34: ifnonnull -> 52
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   43: athrow
    //   44: iconst_0
    //   45: goto -> 59
    //   48: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   51: athrow
    //   52: aload_0
    //   53: getfield k : Lorg/bukkit/block/Block;
    //   56: invokevirtual hashCode : ()I
    //   59: iadd
    //   60: istore #4
    //   62: iload #4
    //   64: bipush #31
    //   66: imul
    //   67: aload_0
    //   68: getfield v : Lorg/bukkit/entity/Entity;
    //   71: iload_3
    //   72: ifne -> 97
    //   75: ifnonnull -> 93
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: iconst_0
    //   86: goto -> 100
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: aload_0
    //   94: getfield v : Lorg/bukkit/entity/Entity;
    //   97: invokevirtual hashCode : ()I
    //   100: iadd
    //   101: istore #4
    //   103: iload #4
    //   105: bipush #31
    //   107: imul
    //   108: aload_0
    //   109: getfield i : Lorg/bukkit/block/BlockFace;
    //   112: iload_3
    //   113: ifne -> 138
    //   116: ifnonnull -> 134
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: iconst_0
    //   127: goto -> 141
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: aload_0
    //   135: getfield i : Lorg/bukkit/block/BlockFace;
    //   138: invokevirtual hashCode : ()I
    //   141: iadd
    //   142: istore #4
    //   144: iload #4
    //   146: ireturn
    // Exception table:
    //   from	to	target	type
    //   21	37	40	java/lang/RuntimeException
    //   34	48	48	java/lang/RuntimeException
    //   62	78	81	java/lang/RuntimeException
    //   75	89	89	java/lang/RuntimeException
    //   103	119	122	java/lang/RuntimeException
    //   116	130	130	java/lang/RuntimeException
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/on.c : J
    //   3: ldc2_w 106943949653367
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifne -> 37
    //   19: aload_1
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
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/on
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/on
    //   65: astore #5
    //   67: aload_0
    //   68: getfield b : Lorg/bukkit/util/Vector;
    //   71: aload #5
    //   73: getfield b : Lorg/bukkit/util/Vector;
    //   76: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   79: iload #4
    //   81: ifne -> 112
    //   84: ifne -> 100
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: iconst_0
    //   95: ireturn
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: aload_0
    //   101: getfield k : Lorg/bukkit/block/Block;
    //   104: aload #5
    //   106: getfield k : Lorg/bukkit/block/Block;
    //   109: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   112: iload #4
    //   114: ifne -> 157
    //   117: ifne -> 133
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iconst_0
    //   128: ireturn
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload_0
    //   134: iload #4
    //   136: ifne -> 167
    //   139: getfield v : Lorg/bukkit/entity/Entity;
    //   142: aload #5
    //   144: getfield v : Lorg/bukkit/entity/Entity;
    //   147: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: ifne -> 166
    //   160: iconst_0
    //   161: ireturn
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: aload_0
    //   167: getfield i : Lorg/bukkit/block/BlockFace;
    //   170: aload #5
    //   172: getfield i : Lorg/bukkit/block/BlockFace;
    //   175: if_acmpeq -> 184
    //   178: iconst_0
    //   179: ireturn
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: iconst_1
    //   185: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	87	90	java/lang/RuntimeException
    //   84	96	96	java/lang/RuntimeException
    //   112	120	123	java/lang/RuntimeException
    //   117	129	129	java/lang/RuntimeException
    //   133	150	153	java/lang/RuntimeException
    //   157	162	162	java/lang/RuntimeException
    //   167	180	180	java/lang/RuntimeException
  }
  
  @Nullable
  public final Block b() {
    return this.k;
  }
  
  @NotNull
  public final Vector b() {
    return this.b;
  }
  
  @NotNull
  public final on b(@NotNull Vector paramVector, @Nullable Block paramBlock, @Nullable Entity paramEntity, @Nullable BlockFace paramBlockFace) {
    return new on(paramVector, paramBlock, paramEntity, paramBlockFace);
  }
  
  public on(@NotNull Vector paramVector, @Nullable Block paramBlock, @Nullable Entity paramEntity, @Nullable BlockFace paramBlockFace) {
    this.b = paramVector;
    this.k = paramBlock;
    this.v = paramEntity;
    this.i = paramBlockFace;
  }
  
  public static void y(int paramInt) {
    a = paramInt;
  }
  
  public static int C() {
    return a;
  }
  
  public static int A() {
    int i = C();
    try {
      if (i == 0)
        return 27; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    long l = c ^ 0x60E3DFFB4CBAL;
    y(119);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = ">?2ÍÄt¨ßë®ÄÇ\026CÈ¼k00)\024ú¶ov%\004 °nakúÅ\f\rÐ*5(í\007V|6»k©¹ò%TÓo5­\016").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x51F1;
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
        throw new RuntimeException("me/rerere/matrix/internal/on", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/on'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\on.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */