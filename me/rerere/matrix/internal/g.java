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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.entity.Player;

public class g {
  @Nullable
  private static w b;
  
  private static boolean i;
  
  private static yk[] a;
  
  private static final long c = o3.a(-5893932253348581228L, 1026155673831225498L, MethodHandles.lookup().lookupClass()).a(192261823328032L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public static void p(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/g.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 66276860425078
    //   11: lxor
    //   12: lstore_2
    //   13: pop2
    //   14: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   17: sipush #12256
    //   20: ldc2_w 6146188833573336880
    //   23: lload_0
    //   24: lxor
    //   25: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   30: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   35: ifnull -> 53
    //   38: iconst_1
    //   39: putstatic me/rerere/matrix/internal/g.i : Z
    //   42: lload_2
    //   43: invokestatic j : (J)V
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: return
    // Exception table:
    //   from	to	target	type
    //   14	46	49	java/lang/RuntimeException
  }
  
  public static int b(char paramChar, long paramLong, @Nullable Player paramPlayer) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_1
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/g.c : J
    //   16: lxor
    //   17: lstore #4
    //   19: lload #4
    //   21: dup2
    //   22: ldc2_w 124556047131672
    //   25: lxor
    //   26: lstore #6
    //   28: dup2
    //   29: ldc2_w 95713146259149
    //   32: lxor
    //   33: lstore #8
    //   35: pop2
    //   36: invokestatic r : ()I
    //   39: istore #10
    //   41: aload_3
    //   42: ifnonnull -> 51
    //   45: iconst_m1
    //   46: ireturn
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: getstatic me/rerere/matrix/internal/g.b : Lme/rerere/matrix/internal/w;
    //   54: astore #11
    //   56: aload #11
    //   58: aload_3
    //   59: invokeinterface b : (Lorg/bukkit/entity/Player;)I
    //   64: istore #12
    //   66: aload #11
    //   68: invokeinterface b : ()Z
    //   73: iload #10
    //   75: ifeq -> 177
    //   78: ifeq -> 175
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload #11
    //   90: aload_3
    //   91: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   96: invokeinterface b : (Ljava/util/UUID;)Z
    //   101: iload #10
    //   103: ifeq -> 177
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: ifeq -> 175
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload #11
    //   125: iload #12
    //   127: lload #6
    //   129: invokeinterface b : (IJ)Z
    //   134: iload #10
    //   136: iload_0
    //   137: iflt -> 179
    //   140: ifeq -> 177
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: ifeq -> 175
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: aload_3
    //   161: invokestatic getProtocolVersion : (Lorg/bukkit/entity/Player;)I
    //   164: istore #13
    //   166: iload #12
    //   168: iload #13
    //   170: invokestatic min : (II)I
    //   173: istore #12
    //   175: iload #12
    //   177: iload #10
    //   179: iload_0
    //   180: iflt -> 187
    //   183: ifeq -> 232
    //   186: iconst_m1
    //   187: if_icmpne -> 230
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   196: athrow
    //   197: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   200: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   203: sipush #23107
    //   206: ldc2_w 267604095443018852
    //   209: lload #4
    //   211: lxor
    //   212: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   217: invokevirtual info : (Ljava/lang/String;)V
    //   220: lload #8
    //   222: invokestatic b : (J)Lme/rerere/matrix/internal/q;
    //   225: invokevirtual b : ()I
    //   228: istore #12
    //   230: iload #12
    //   232: ireturn
    // Exception table:
    //   from	to	target	type
    //   41	47	47	java/lang/RuntimeException
    //   66	81	84	java/lang/RuntimeException
    //   78	106	109	java/lang/RuntimeException
    //   88	116	119	java/lang/RuntimeException
    //   113	143	146	java/lang/RuntimeException
    //   123	153	156	java/lang/RuntimeException
    //   177	190	193	java/lang/RuntimeException
  }
  
  static {
    long l = c ^ 0x4851707721B9L;
    G(new yk[4]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "'Sc:\rê\nÀ:^(YIÙ«\034òô\000cþÑÜ\r\016\037\b°iuz\037üF`U\035pJEZÍ\003×B\fç\023:¸Ù¢XBK´èØ\002¨ÐïÖó)wó\f\033ª!\022ÙrÖ¹õ<i8@»ûá\032ü^ëU¡úª4Ö±¢­·>\021Ø\t\004èÛÄÐ³Ãed\007¢Qï.¨Í\020õ[ýÓ\036ßÍäÈ9G0¢\030ô\020\025\001ò\034Ó$ÖLZÝ^Íw}0iUt-\bª³RºÛÚÉ°sö_\034+ÝÁ\f\016uA").length();
    byte b2 = 88;
    byte b = -1;
    while (true);
  }
  
  public static boolean b() {
    return i;
  }
  
  public static void G(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] u() {
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2769;
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
        throw new RuntimeException("me/rerere/matrix/internal/g", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/g'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */