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
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;

public class pj extends zk {
  private long k;
  
  private int v;
  
  private static int b;
  
  private double i;
  
  private static final long a = o3.a(4776546697476377182L, 1348357478098133074L, MethodHandles.lookup().lookupClass()).a(219385003643925L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pj.a : J
    //   3: ldc2_w 45104373370220
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 52505769969781
    //   15: lxor
    //   16: lstore #6
    //   18: pop2
    //   19: aload_1
    //   20: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   23: astore #8
    //   25: aload #8
    //   27: invokeinterface isRiptiding : ()Z
    //   32: ifeq -> 329
    //   35: aload #8
    //   37: invokeinterface isGliding : ()Z
    //   42: ifne -> 329
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   51: athrow
    //   52: aload_0
    //   53: dup
    //   54: getfield v : I
    //   57: iconst_1
    //   58: iadd
    //   59: putfield v : I
    //   62: aload_3
    //   63: aload_2
    //   64: invokevirtual distance : (Lorg/bukkit/Location;)D
    //   67: dstore #9
    //   69: aload_0
    //   70: getfield v : I
    //   73: iconst_3
    //   74: if_icmple -> 268
    //   77: dload #9
    //   79: aload_0
    //   80: getfield i : D
    //   83: ldc2_w 0.5
    //   86: dadd
    //   87: dcmpl
    //   88: ifle -> 268
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: dload #9
    //   100: ldc2_w 2.5
    //   103: dcmpl
    //   104: ifle -> 268
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: invokestatic j : ()J
    //   117: aload_0
    //   118: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   121: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   124: invokevirtual j : ()J
    //   127: lsub
    //   128: ldc2_w 100
    //   131: lcmp
    //   132: ifle -> 268
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: aload_0
    //   143: lload #6
    //   145: sipush #22495
    //   148: ldc2_w 7274069465630979016
    //   151: lload #4
    //   153: lxor
    //   154: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   159: new java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: sipush #2969
    //   169: ldc2_w 4107354811648536463
    //   172: lload #4
    //   174: lxor
    //   175: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_0
    //   184: getfield i : D
    //   187: invokestatic b : (D)D
    //   190: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   193: sipush #26221
    //   196: ldc2_w 4326444054408528505
    //   199: lload #4
    //   201: lxor
    //   202: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: dload #9
    //   212: invokestatic b : (D)D
    //   215: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   218: ldc ')'
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual toString : ()Ljava/lang/String;
    //   226: getstatic me/rerere/matrix/internal/pj.b : I
    //   229: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   232: aload_1
    //   233: aload_2
    //   234: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   237: aload #8
    //   239: new org/bukkit/util/Vector
    //   242: dup
    //   243: iconst_0
    //   244: iconst_0
    //   245: iconst_0
    //   246: invokespecial <init> : (III)V
    //   249: invokeinterface setVelocity : (Lorg/bukkit/util/Vector;)V
    //   254: aload_0
    //   255: invokestatic currentTimeMillis : ()J
    //   258: putfield k : J
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: aload_0
    //   269: dload #9
    //   271: putfield i : D
    //   274: invokestatic currentTimeMillis : ()J
    //   277: aload_0
    //   278: getfield k : J
    //   281: lsub
    //   282: ldc2_w 2000
    //   285: lcmp
    //   286: ifge -> 326
    //   289: aload_1
    //   290: aload_2
    //   291: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   294: aload #8
    //   296: invokeinterface isGliding : ()Z
    //   301: ifeq -> 326
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   310: athrow
    //   311: aload #8
    //   313: iconst_0
    //   314: invokeinterface setGliding : (Z)V
    //   319: goto -> 326
    //   322: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   325: athrow
    //   326: goto -> 334
    //   329: aload_0
    //   330: iconst_0
    //   331: putfield v : I
    //   334: return
    // Exception table:
    //   from	to	target	type
    //   25	45	48	java/lang/RuntimeException
    //   69	91	94	java/lang/RuntimeException
    //   77	107	110	java/lang/RuntimeException
    //   98	135	138	java/lang/RuntimeException
    //   114	261	264	java/lang/RuntimeException
    //   268	304	307	java/lang/RuntimeException
    //   289	319	322	java/lang/RuntimeException
  }
  
  public pj(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pj.a : J
    //   3: ldc2_w 88517054769458
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #32277
    //   15: ldc2_w 702663802918813278
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   25: bipush #20
    //   27: invokeinterface getInt : (Ljava/lang/String;I)I
    //   32: putstatic me/rerere/matrix/internal/pj.b : I
    //   35: return
  }
  
  static {
    long l = a ^ 0x94404EBAD3BL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "\013\020Ñ²@ \006§§º.ô\007ÅÓÂ½EÎÕôæHm¥Ú(lÌ«mõþ­ ²\035v§Ýv\"fÉÅ@æ\002úhû\033Æ51Ô×óH\017\006\007Ð").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7F88;
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
        throw new RuntimeException("me/rerere/matrix/internal/pj", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/pj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */