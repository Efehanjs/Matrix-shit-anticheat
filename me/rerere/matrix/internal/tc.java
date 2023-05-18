package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;

public class tc {
  private static String a;
  
  private static final long b = o3.a(5226908372691492025L, 628393955356531978L, MethodHandles.lookup().lookupClass()).a(270575952996929L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public static Set b(Predicate paramPredicate) {
    return (Set)Bukkit.getOnlinePlayers().stream().filter(paramPredicate).collect(Collectors.toSet());
  }
  
  public static int b() {
    return Bukkit.getOnlinePlayers().size();
  }
  
  public static boolean b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/tc.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: iconst_0
    //   7: istore_3
    //   8: new java/lang/Exception
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
    //   18: astore #4
    //   20: invokestatic a : ()I
    //   23: aload #4
    //   25: arraylength
    //   26: istore #5
    //   28: istore_2
    //   29: iconst_0
    //   30: istore #6
    //   32: iload #6
    //   34: iload #5
    //   36: if_icmpge -> 266
    //   39: aload #4
    //   41: iload #6
    //   43: aaload
    //   44: astore #7
    //   46: iload_3
    //   47: iload_2
    //   48: lload_0
    //   49: lconst_0
    //   50: lcmp
    //   51: ifle -> 58
    //   54: ifne -> 267
    //   57: iload_2
    //   58: lload_0
    //   59: lconst_0
    //   60: lcmp
    //   61: iflt -> 196
    //   64: ifne -> 195
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: ifeq -> 174
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload #7
    //   86: invokevirtual getClassName : ()Ljava/lang/String;
    //   89: sipush #15426
    //   92: ldc2_w 6193292513340976527
    //   95: lload_0
    //   96: lxor
    //   97: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   102: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   105: iload_2
    //   106: ifne -> 267
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: ifne -> 266
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: aload #7
    //   128: invokevirtual getClassName : ()Ljava/lang/String;
    //   131: sipush #14937
    //   134: ldc2_w 1946005295149804437
    //   137: lload_0
    //   138: lxor
    //   139: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   144: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   147: iload_2
    //   148: ifne -> 267
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: ifne -> 266
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   167: athrow
    //   168: iconst_1
    //   169: ireturn
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload #7
    //   176: invokevirtual getClassName : ()Ljava/lang/String;
    //   179: sipush #30817
    //   182: ldc2_w 6880672604204247471
    //   185: lload_0
    //   186: lxor
    //   187: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   192: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   195: iload_2
    //   196: lload_0
    //   197: lconst_0
    //   198: lcmp
    //   199: iflt -> 244
    //   202: ifne -> 243
    //   205: ifeq -> 259
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: aload #7
    //   217: invokevirtual getMethodName : ()Ljava/lang/String;
    //   220: sipush #15852
    //   223: ldc2_w 6319221934691576867
    //   226: lload_0
    //   227: lxor
    //   228: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   233: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: iload_2
    //   244: ifne -> 258
    //   247: ifeq -> 259
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: iconst_1
    //   258: istore_3
    //   259: iinc #6, 1
    //   262: iload_2
    //   263: ifeq -> 32
    //   266: iconst_0
    //   267: ireturn
    // Exception table:
    //   from	to	target	type
    //   46	67	70	java/lang/RuntimeException
    //   57	77	80	java/lang/RuntimeException
    //   74	109	112	java/lang/RuntimeException
    //   84	119	122	java/lang/RuntimeException
    //   116	151	154	java/lang/RuntimeException
    //   126	161	164	java/lang/RuntimeException
    //   158	170	170	java/lang/RuntimeException
    //   195	208	211	java/lang/RuntimeException
    //   205	236	239	java/lang/RuntimeException
    //   243	250	253	java/lang/RuntimeException
  }
  
  public static void X(String paramString) {
    a = paramString;
  }
  
  public static String w() {
    return a;
  }
  
  static {
    long l = b ^ 0x44CA8D214A60L;
    X(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "½%\024ðÆnÖ\030!\té`D ý_ cÝ\023)9ÔEÏëö¹ð¿RÀ@mTúþeAðÀ\007k)\035#\026øÙo \003É¾Í>$\002m\"O\020{mY,\024¸M)îÞGIÈAE;ÖúF\b*¯3ÄXú3").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7BB3;
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
        throw new RuntimeException("me/rerere/matrix/internal/tc", exception);
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
    //   49: goto -> 103
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc_w 'me/rerere/matrix/internal/tc'
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc_w ' : '
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_1
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc_w ' : '
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_2
    //   88: invokevirtual toString : ()Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: aload #4
    //   99: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   102: athrow
    //   103: aload_3
    //   104: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\tc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */