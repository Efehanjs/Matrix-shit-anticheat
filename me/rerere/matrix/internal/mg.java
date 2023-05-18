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

public class mg extends zk {
  private double b;
  
  private int i;
  
  private static final long a = o3.a(1295857686788819340L, -6122008306790173961L, MethodHandles.lookup().lookupClass()).a(179396800859942L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mg.a : J
    //   3: ldc2_w 115480040126581
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 52505769969781
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 13107208507874
    //   22: lxor
    //   23: dup2
    //   24: bipush #32
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #32
    //   33: lshl
    //   34: bipush #32
    //   36: lushr
    //   37: lstore #9
    //   39: pop2
    //   40: pop2
    //   41: aload_1
    //   42: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   45: astore #11
    //   47: aload #11
    //   49: invokeinterface isInsideVehicle : ()Z
    //   54: ifeq -> 62
    //   57: return
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: aload_2
    //   63: invokevirtual getYaw : ()F
    //   66: aload_3
    //   67: invokevirtual getYaw : ()F
    //   70: iload #8
    //   72: swap
    //   73: lload #9
    //   75: dup2_x1
    //   76: pop2
    //   77: invokestatic b : (FIJF)F
    //   80: f2d
    //   81: dstore #12
    //   83: dload #12
    //   85: aload_0
    //   86: getfield b : D
    //   89: dcmpl
    //   90: ifne -> 260
    //   93: dload #12
    //   95: dconst_1
    //   96: drem
    //   97: dconst_0
    //   98: dcmpl
    //   99: ifne -> 260
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: dload #12
    //   111: ldc2_w 5.0
    //   114: dcmpl
    //   115: ifle -> 260
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload_2
    //   126: invokevirtual getYaw : ()F
    //   129: aload_3
    //   130: invokevirtual getYaw : ()F
    //   133: fmul
    //   134: fconst_0
    //   135: fcmpl
    //   136: ifle -> 260
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: aload_0
    //   147: dup
    //   148: getfield i : I
    //   151: iconst_1
    //   152: iadd
    //   153: dup_x1
    //   154: putfield i : I
    //   157: iconst_2
    //   158: if_icmple -> 265
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   167: athrow
    //   168: aload_0
    //   169: lload #6
    //   171: sipush #8181
    //   174: ldc2_w 3527148429085128524
    //   177: lload #4
    //   179: lxor
    //   180: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   185: new java/lang/StringBuilder
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: sipush #4897
    //   195: ldc2_w 1359422068920531865
    //   198: lload #4
    //   200: lxor
    //   201: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload_2
    //   210: invokevirtual getYaw : ()F
    //   213: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   216: sipush #31367
    //   219: ldc2_w 8895647259374735933
    //   222: lload #4
    //   224: lxor
    //   225: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: aload_3
    //   234: invokevirtual getYaw : ()F
    //   237: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   240: ldc ')'
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: invokevirtual toString : ()Ljava/lang/String;
    //   248: bipush #10
    //   250: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   253: goto -> 265
    //   256: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   259: athrow
    //   260: aload_0
    //   261: iconst_0
    //   262: putfield i : I
    //   265: aload_0
    //   266: dload #12
    //   268: putfield b : D
    //   271: return
    // Exception table:
    //   from	to	target	type
    //   47	58	58	java/lang/RuntimeException
    //   83	102	105	java/lang/RuntimeException
    //   93	118	121	java/lang/RuntimeException
    //   109	139	142	java/lang/RuntimeException
    //   125	161	164	java/lang/RuntimeException
    //   146	256	256	java/lang/RuntimeException
  }
  
  public mg(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  static {
    long l = a ^ 0x19285DE641D0L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "¦õ]rÕ\026b8¬A°@*îáñ\007/?r\007ÆíÅÝ\th\nË\030\002á« \007gN·G>Dra\036½Y(ß\0208ìÑ\nªEéLº\022qm¼Î\"").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3327;
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
        throw new RuntimeException("me/rerere/matrix/internal/mg", exception);
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
    //   65: ldc 'me/rerere/matrix/internal/mg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\mg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */