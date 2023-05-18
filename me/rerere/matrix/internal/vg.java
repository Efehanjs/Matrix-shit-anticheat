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
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.command.CommandSender;

public final class vg {
  private static final long a = o3.a(-2369020231838006077L, -6480518708602680630L, MethodHandles.lookup().lookupClass()).a(250622400138023L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public final void b(@NotNull CommandSender paramCommandSender, @NotNull String[] paramArrayOfString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vg.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 200108930272
    //   11: lxor
    //   12: lstore #5
    //   14: pop2
    //   15: invokestatic r : ()I
    //   18: istore #7
    //   20: aload_2
    //   21: arraylength
    //   22: iconst_1
    //   23: if_icmpgt -> 302
    //   26: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   29: lload #5
    //   31: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   34: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   37: invokevirtual b : ()Ljava/util/Map;
    //   40: astore #8
    //   42: aload_1
    //   43: sipush #5595
    //   46: ldc2_w 3465796730200913945
    //   49: lload_3
    //   50: lxor
    //   51: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   56: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   61: aload #8
    //   63: invokestatic asSequence : (Ljava/util/Map;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   66: getstatic me/rerere/matrix/internal/qm.i : Lme/rerere/matrix/internal/qm;
    //   69: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   72: invokestatic map : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   75: getstatic me/rerere/matrix/internal/ol.i : Lme/rerere/matrix/internal/ol;
    //   78: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   81: invokestatic filter : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   84: getstatic me/rerere/matrix/internal/cj.i : Lme/rerere/matrix/internal/cj;
    //   87: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   90: invokestatic filter : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   93: getstatic me/rerere/matrix/internal/aj.i : Lme/rerere/matrix/internal/aj;
    //   96: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   99: invokestatic map : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   102: invokestatic filterNotNull : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   105: ldc ' '
    //   107: checkcast java/lang/CharSequence
    //   110: aconst_null
    //   111: aconst_null
    //   112: iconst_0
    //   113: aconst_null
    //   114: getstatic me/rerere/matrix/internal/mj.i : Lme/rerere/matrix/internal/mj;
    //   117: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   120: bipush #30
    //   122: aconst_null
    //   123: invokestatic joinToString$default : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   126: astore #11
    //   128: aload #11
    //   130: astore #12
    //   132: iconst_0
    //   133: istore #13
    //   135: aload #12
    //   137: checkcast java/lang/CharSequence
    //   140: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   143: iload #7
    //   145: ifeq -> 159
    //   148: ifne -> 162
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: iconst_1
    //   159: goto -> 163
    //   162: iconst_0
    //   163: nop
    //   164: ifeq -> 176
    //   167: aload #11
    //   169: goto -> 177
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: aconst_null
    //   177: astore #10
    //   179: aload #10
    //   181: iload #7
    //   183: ifeq -> 198
    //   186: ifnull -> 259
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: aload #10
    //   198: astore #13
    //   200: iconst_0
    //   201: istore #14
    //   203: new java/lang/StringBuilder
    //   206: dup
    //   207: invokespecial <init> : ()V
    //   210: sipush #32341
    //   213: ldc2_w 4797687767105999764
    //   216: lload_3
    //   217: lxor
    //   218: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: aload #13
    //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: invokevirtual toString : ()Ljava/lang/String;
    //   234: nop
    //   235: astore #11
    //   237: aload #11
    //   239: iload #7
    //   241: ifeq -> 256
    //   244: ifnull -> 259
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: aload #11
    //   256: goto -> 272
    //   259: sipush #30804
    //   262: ldc2_w 3669146086942119319
    //   265: lload_3
    //   266: lxor
    //   267: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   272: astore #9
    //   274: aload_1
    //   275: aload #9
    //   277: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   282: aload_1
    //   283: sipush #16872
    //   286: ldc2_w 4831346110347095080
    //   289: lload_3
    //   290: lxor
    //   291: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   296: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   301: return
    //   302: return
    // Exception table:
    //   from	to	target	type
    //   135	151	154	java/lang/RuntimeException
    //   163	172	172	java/lang/RuntimeException
    //   179	189	192	java/lang/RuntimeException
    //   237	247	250	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x1A93F18E22FEL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "Ö\0309Ú5AMQØë {ØI\0172RswíQàã$¿Ó,¡©\000ÖëÛ\025ÆøÏ¶%qCç\032âÜûW!f|Îóå\0218\016-µÒ=Ð n\004pdRÝ\0063)mS\022\025:?íìÓ¹GáK«·[\bY$÷Z´«Ns \"¥[ú²Ý`xä").length();
    byte b2 = 64;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x27F0;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/vg", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/vg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */