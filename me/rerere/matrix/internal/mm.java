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
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class mm {
  private static int a;
  
  private static final long b = o3.a(-1474384591660089557L, -1115466836712146011L, MethodHandles.lookup().lookupClass()).a(64537648494995L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public final void b(@Nullable String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mm.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic getConsoleSender : ()Lorg/bukkit/command/ConsoleCommandSender;
    //   9: getstatic me/rerere/matrix/thirdparty/kotlin/jvm/internal/StringCompanionObject.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/jvm/internal/StringCompanionObject;
    //   12: pop
    //   13: sipush #13375
    //   16: ldc2_w 1995906104068086231
    //   19: lload_2
    //   20: lxor
    //   21: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   26: astore #4
    //   28: iconst_1
    //   29: anewarray java/lang/Object
    //   32: astore #5
    //   34: aload #5
    //   36: iconst_0
    //   37: aload_1
    //   38: aastore
    //   39: aload #5
    //   41: astore #5
    //   43: aload #4
    //   45: aload #5
    //   47: aload #5
    //   49: arraylength
    //   50: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   53: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: dup
    //   57: sipush #14575
    //   60: ldc2_w 6020548499142317313
    //   63: lload_2
    //   64: lxor
    //   65: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   70: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   73: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   78: return
  }
  
  public final void j(boolean paramBoolean) {
    Matrix.j(paramBoolean);
  }
  
  public final void b(int paramInt1, byte paramByte, long paramLong, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #56
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #5
    //   16: i2l
    //   17: bipush #40
    //   19: lshl
    //   20: bipush #40
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/mm.b : J
    //   27: lxor
    //   28: lstore #6
    //   30: lload #6
    //   32: dup2
    //   33: ldc2_w 52566690731500
    //   36: lxor
    //   37: lstore #8
    //   39: pop2
    //   40: aload_0
    //   41: astore #10
    //   43: nop
    //   44: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   47: pop
    //   48: aload #10
    //   50: checkcast me/rerere/matrix/internal/mm
    //   53: astore #11
    //   55: iconst_0
    //   56: istore #12
    //   58: lload_3
    //   59: invokestatic sleep : (J)V
    //   62: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   65: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: astore #11
    //   70: goto -> 89
    //   73: astore #12
    //   75: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   78: pop
    //   79: aload #12
    //   81: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   84: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   87: astore #11
    //   89: aload #11
    //   91: astore #10
    //   93: aload #10
    //   95: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   98: dup
    //   99: ifnull -> 176
    //   102: astore #11
    //   104: aload #11
    //   106: astore #12
    //   108: iconst_0
    //   109: istore #13
    //   111: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   114: lload #8
    //   116: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   119: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   122: new java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: sipush #22531
    //   132: ldc2_w 9128658763166034607
    //   135: lload #6
    //   137: lxor
    //   138: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: lload_3
    //   147: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   150: sipush #27355
    //   153: ldc2_w 4440191166707406966
    //   156: lload #6
    //   158: lxor
    //   159: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual toString : ()Ljava/lang/String;
    //   170: invokevirtual warning : (Ljava/lang/String;)V
    //   173: goto -> 177
    //   176: pop
    //   177: return
    // Exception table:
    //   from	to	target	type
    //   43	70	73	java/lang/Throwable
  }
  
  public final void b(boolean paramBoolean) {
    Matrix.b(paramBoolean);
  }
  
  @NotNull
  public final Matrix b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mm.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic j : ()Lme/rerere/matrix/Matrix;
    //   9: dup
    //   10: ifnull -> 18
    //   13: areturn
    //   14: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   17: athrow
    //   18: pop
    //   19: sipush #18862
    //   22: ldc2_w 8070525923497700747
    //   25: lload_1
    //   26: lxor
    //   27: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   32: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   35: aconst_null
    //   36: areturn
    // Exception table:
    //   from	to	target	type
    //   6	14	14	java/lang/RuntimeException
  }
  
  public final boolean j() {
    return Matrix.b();
  }
  
  public final boolean b() {
    return Matrix.p();
  }
  
  public static void v(int paramInt) {
    a = paramInt;
  }
  
  public static int T() {
    return a;
  }
  
  public static int G() {
    int i = T();
    try {
      if (i == 0)
        return 59; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    v(26);
    long l = b ^ 0x3B5FEBF9E190L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "Ôo9g±J\022ë2sÆ÷ºÈð\002Ne>\033Jc³fP:ê»Ý¦\034\004µÅ®\013\020°ñ6ÓF\bËÿ´Ç[Ûÿç(ZÙQt²\t¹vE¬-\030CÜkqÃÈúþ¯ My\002Ám\017»<YÔ×Û¤").length();
    byte b2 = 40;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5993;
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
        throw new RuntimeException("me/rerere/matrix/internal/mm", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/mm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\mm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */