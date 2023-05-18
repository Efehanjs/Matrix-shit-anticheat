package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

@Deprecated
public class lo extends zk {
  private Set i;
  
  private static final long a = o3.a(2489143104831471325L, -2155060530248630026L, MethodHandles.lookup().lookupClass()).a(67385722036212L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public lo(yl paramyl, long paramLong) {
    super(paramyl);
    b(yk.n);
    h(l);
  }
  
  public void b(zk paramzk, int paramInt1, String paramString1, String paramString2, char paramChar1, int paramInt2, char paramChar2) {
    // Byte code:
    //   0: iload_2
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload #5
    //   7: i2l
    //   8: bipush #48
    //   10: lshl
    //   11: bipush #32
    //   13: lushr
    //   14: lor
    //   15: iload #7
    //   17: i2l
    //   18: bipush #48
    //   20: lshl
    //   21: bipush #48
    //   23: lushr
    //   24: lor
    //   25: lstore #8
    //   27: lload #8
    //   29: dup2
    //   30: ldc2_w 82475655067304
    //   33: lxor
    //   34: lstore #10
    //   36: dup2
    //   37: ldc2_w 53516389491385
    //   40: lxor
    //   41: lstore #12
    //   43: pop2
    //   44: aload_0
    //   45: getfield i : Ljava/util/Set;
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #14
    //   55: aload #14
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 233
    //   65: aload #14
    //   67: invokeinterface next : ()Ljava/lang/Object;
    //   72: checkcast me/rerere/matrix/internal/tg
    //   75: astore #15
    //   77: aload #15
    //   79: lload #12
    //   81: aload_3
    //   82: invokevirtual b : (JLjava/lang/String;)Ljava/util/Optional;
    //   85: astore #16
    //   87: aload #16
    //   89: invokevirtual isPresent : ()Z
    //   92: ifeq -> 230
    //   95: aload #16
    //   97: invokevirtual get : ()Ljava/lang/Object;
    //   100: checkcast me/rerere/matrix/internal/oe
    //   103: invokestatic j : ()J
    //   106: invokevirtual b : (J)V
    //   109: aload #15
    //   111: invokevirtual b : ()Ljava/util/List;
    //   114: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   119: aload #15
    //   121: <illegal opcode> test : (Lme/rerere/matrix/internal/tg;)Ljava/util/function/Predicate;
    //   126: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   131: ifeq -> 230
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: aload_0
    //   142: lload #10
    //   144: sipush #2698
    //   147: ldc2_w 1236867268632663386
    //   150: lload #8
    //   152: lxor
    //   153: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   158: new java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: sipush #4017
    //   168: ldc2_w 377756509498855522
    //   171: lload #8
    //   173: lxor
    //   174: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: aload #15
    //   184: invokevirtual b : ()Ljava/lang/String;
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: sipush #8643
    //   193: ldc2_w 5141037024654884372
    //   196: lload #8
    //   198: lxor
    //   199: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual toString : ()Ljava/lang/String;
    //   210: aload #15
    //   212: invokevirtual j : ()I
    //   215: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   218: aload #15
    //   220: invokevirtual b : ()V
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: goto -> 55
    //   233: return
    // Exception table:
    //   from	to	target	type
    //   87	134	137	java/lang/RuntimeException
    //   95	223	226	java/lang/RuntimeException
  }
  
  public void h(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lo.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: new java/util/HashSet
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: putfield i : Ljava/util/Set;
    //   17: aload_0
    //   18: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   21: sipush #24412
    //   24: ldc2_w 8714147607663199904
    //   27: lload_1
    //   28: lxor
    //   29: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   34: invokeinterface getConfigurationSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnonnull -> 49
    //   44: return
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: aload_3
    //   50: iconst_0
    //   51: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   56: invokeinterface iterator : ()Ljava/util/Iterator;
    //   61: astore #4
    //   63: aload #4
    //   65: invokeinterface hasNext : ()Z
    //   70: ifeq -> 256
    //   73: aload #4
    //   75: invokeinterface next : ()Ljava/lang/Object;
    //   80: checkcast java/lang/String
    //   83: astore #5
    //   85: aload_3
    //   86: new java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: aload #5
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: sipush #19631
    //   101: ldc2_w 6252769041190507856
    //   104: lload_1
    //   105: lxor
    //   106: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   122: astore #6
    //   124: aload_3
    //   125: new java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: aload #5
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: bipush #36
    //   139: ldc2_w 6691534024639388126
    //   142: lload_1
    //   143: lxor
    //   144: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokeinterface getInt : (Ljava/lang/String;)I
    //   160: istore #7
    //   162: aload_3
    //   163: new java/lang/StringBuilder
    //   166: dup
    //   167: invokespecial <init> : ()V
    //   170: aload #5
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: sipush #1835
    //   178: ldc2_w 4137908716204302035
    //   181: lload_1
    //   182: lxor
    //   183: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: invokeinterface getInt : (Ljava/lang/String;)I
    //   199: istore #8
    //   201: new java/util/ArrayList
    //   204: dup
    //   205: invokespecial <init> : ()V
    //   208: astore #9
    //   210: aload #6
    //   212: aload #9
    //   214: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   219: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   224: new me/rerere/matrix/internal/tg
    //   227: dup
    //   228: aload #5
    //   230: iload #7
    //   232: aload #9
    //   234: iload #8
    //   236: invokespecial <init> : (Ljava/lang/String;ILjava/util/List;I)V
    //   239: astore #10
    //   241: aload_0
    //   242: getfield i : Ljava/util/Set;
    //   245: aload #10
    //   247: invokeinterface add : (Ljava/lang/Object;)Z
    //   252: pop
    //   253: goto -> 63
    //   256: return
    // Exception table:
    //   from	to	target	type
    //   40	45	45	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x1A8CE63619CL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "¢a)!\031Í|ÞÎ#\024xÙßör\t\023®P`\026bèJ|ä<ÚÉ(/È¤Nq_Öô\t#ß£4»ïã/¨\033Þ\031Ø\b±Vd\030\004\020j=áÀsh\013\027KÖCØßÔ\030÷eÜýçHYQÏ¡J\016ô1àæþIt¿\020øÛ*]Þdâ\\FfÌ^").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3A90;
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
        throw new RuntimeException("me/rerere/matrix/internal/lo", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/lo'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\lo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */