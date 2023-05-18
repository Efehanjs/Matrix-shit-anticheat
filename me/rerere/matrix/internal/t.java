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
import org.bukkit.entity.Player;
import org.geysermc.floodgate.api.FloodgateApi;

public class t {
  public static boolean b;
  
  public static boolean i;
  
  private static boolean a;
  
  private static final long c = o3.a(3533189084308421182L, -1029103615020942632L, MethodHandles.lookup().lookupClass()).a(86057603241771L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  static {
    d(false);
    long l = c ^ 0x7E76CB4B8529L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "ÒÜ'¯\0301ô§µ©¼·r±\006ýù0+\"d\035 ø\027ïz9ô¹2¸ðnûmd\0059\017\023ÞÛ¬b\fïõÄ±\036ìÚ8H\035YOÏ_ºj0\0163VNY¯\016St\\Ü>mð\004ý\035Ø¥rg] ¡¸yP(Û²5û$ç5\027t^\036REÙzí¨ÚÃ¬¬Xýàp²q").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public static void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/t.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic r : ()I
    //   9: istore_2
    //   10: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   13: sipush #24960
    //   16: ldc2_w 2403669085197165848
    //   19: lload_0
    //   20: lxor
    //   21: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   26: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   31: astore_3
    //   32: aload_3
    //   33: iload_2
    //   34: ifeq -> 122
    //   37: ifnull -> 101
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: aload_3
    //   48: iload_2
    //   49: ifeq -> 122
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: invokeinterface isEnabled : ()Z
    //   64: ifeq -> 101
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: iconst_1
    //   75: putstatic me/rerere/matrix/internal/t.i : Z
    //   78: sipush #16698
    //   81: ldc2_w 6857441775493563809
    //   84: lload_0
    //   85: lxor
    //   86: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   91: invokestatic b : (Ljava/lang/String;)V
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   100: athrow
    //   101: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   104: sipush #20682
    //   107: ldc2_w 2544707981015241811
    //   110: lload_0
    //   111: lxor
    //   112: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   117: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   122: astore #4
    //   124: aload #4
    //   126: lload_0
    //   127: lconst_0
    //   128: lcmp
    //   129: ifle -> 148
    //   132: iload_2
    //   133: ifeq -> 148
    //   136: ifnull -> 171
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: aload #4
    //   148: invokeinterface isEnabled : ()Z
    //   153: iload_2
    //   154: ifeq -> 168
    //   157: ifeq -> 171
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: iconst_1
    //   168: putstatic me/rerere/matrix/internal/t.b : Z
    //   171: return
    // Exception table:
    //   from	to	target	type
    //   32	40	43	java/lang/RuntimeException
    //   37	52	55	java/lang/RuntimeException
    //   47	67	70	java/lang/RuntimeException
    //   59	94	97	java/lang/RuntimeException
    //   124	139	142	java/lang/RuntimeException
    //   148	160	163	java/lang/RuntimeException
  }
  
  public static boolean b(@NotNull Player paramPlayer, long paramLong) {
    paramLong = c ^ paramLong;
    int i = (int)((paramLong ^ 0x393096A9D9A8L) >>> 48L);
    int j = (int)((paramLong ^ 0x393096A9D9A8L) << 16L >>> 48L);
    int k = (int)((paramLong ^ 0x393096A9D9A8L) << 32L >>> 32L);
    paramLong ^ 0x393096A9D9A8L;
    int m = yl.a();
    try {
      if (m == 0)
        try {
          if (!b)
            return p.b(paramPlayer, (char)i, (short)j, k); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return FloodgateApi.getInstance().isFloodgatePlayer(paramPlayer.getUniqueId());
  }
  
  public static void d(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean h() {
    return a;
  }
  
  public static boolean I() {
    boolean bool = h();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5AF0;
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
        throw new RuntimeException("me/rerere/matrix/internal/t", exception);
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
    //   13: ldc [Ljava/lang/Object;
    //   15: aload_2
    //   16: invokevirtual parameterCount : ()I
    //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   22: iconst_0
    //   23: iconst_3
    //   24: anewarray java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_3
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: aload_1
    //   38: aastore
    //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   42: aload_2
    //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   49: goto -> 102
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc 'me/rerere/matrix/internal/t'
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w ' : '
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_1
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: ldc_w ' : '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_2
    //   87: invokevirtual toString : ()Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: aload #4
    //   98: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: aload_3
    //   103: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */