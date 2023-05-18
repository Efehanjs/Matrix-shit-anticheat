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
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class am extends zk {
  private long v;
  
  private long b;
  
  private long i;
  
  private static final long a = o3.a(-7897462330634092337L, 8831155943156179390L, MethodHandles.lookup().lookupClass()).a(4416655146974L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    if (paramLocation2.getPitch() != paramLocation1.getPitch()) {
      float f = Math.abs(paramLocation2.getPitch() - paramLocation1.getPitch());
      try {
        if (f > 0.0F && f < 0.001D) {
          double d = zb.b(paramLocation1, paramLocation2);
          try {
            if (d > 0.0D)
              try {
                if (d < 0.1D && pc.j() - this.b > 1000L) {
                  float f1 = Math.abs(paramLocation2.getYaw() - paramLocation1.getYaw());
                  try {
                    if (f1 <= 0.01D)
                      this.i = pc.j(); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public am(yl paramyl, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/am.a : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 56360493065683
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #4
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #32
    //   25: lushr
    //   26: l2i
    //   27: istore #5
    //   29: dup2
    //   30: bipush #48
    //   32: lshl
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #6
    //   39: pop2
    //   40: pop2
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial <init> : (Lme/rerere/matrix/internal/yl;)V
    //   46: aload_0
    //   47: iload #4
    //   49: i2c
    //   50: sipush #30256
    //   53: ldc2_w 8262554922364204652
    //   56: lload_2
    //   57: lxor
    //   58: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   63: iload #5
    //   65: iload #6
    //   67: i2c
    //   68: invokestatic b : (CLjava/lang/String;IC)Lme/rerere/matrix/internal/yk;
    //   71: invokevirtual b : (Lme/rerere/matrix/internal/yk;)V
    //   74: return
  }
  
  public void b(short paramShort, int paramInt1, int paramInt2, @NotNull BlockBreakEvent paramBlockBreakEvent) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: lstore #5
    //   25: lload #5
    //   27: dup2
    //   28: ldc2_w 28219512029728
    //   31: lxor
    //   32: lstore #7
    //   34: dup2
    //   35: ldc2_w 91174915503467
    //   38: lxor
    //   39: lstore #9
    //   41: pop2
    //   42: invokestatic currentTimeMillis : ()J
    //   45: aload_0
    //   46: getfield i : J
    //   49: lsub
    //   50: ldc2_w 1000
    //   53: lcmp
    //   54: ifge -> 188
    //   57: invokestatic j : ()J
    //   60: aload_0
    //   61: getfield v : J
    //   64: lsub
    //   65: ldc2_w 1000
    //   68: lcmp
    //   69: ifle -> 188
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_0
    //   80: istore #11
    //   82: invokestatic b : ()I
    //   85: bipush #14
    //   87: if_icmplt -> 116
    //   90: aload #4
    //   92: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   95: invokeinterface getPose : ()Lorg/bukkit/entity/Pose;
    //   100: getstatic org/bukkit/entity/Pose.STANDING : Lorg/bukkit/entity/Pose;
    //   103: if_acmpeq -> 116
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: iconst_1
    //   114: istore #11
    //   116: iload #11
    //   118: ifne -> 188
    //   121: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   124: lload #9
    //   126: invokevirtual b : (J)Z
    //   129: ifeq -> 188
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload_0
    //   140: lload #7
    //   142: sipush #27183
    //   145: ldc2_w 3249290945905807878
    //   148: lload #5
    //   150: lxor
    //   151: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   156: sipush #23487
    //   159: ldc2_w 5137785079131038612
    //   162: lload #5
    //   164: lxor
    //   165: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   170: iconst_4
    //   171: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   174: aload_0
    //   175: invokestatic j : ()J
    //   178: putfield v : J
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: return
    // Exception table:
    //   from	to	target	type
    //   42	72	75	java/lang/RuntimeException
    //   82	106	109	java/lang/RuntimeException
    //   116	132	135	java/lang/RuntimeException
    //   121	181	184	java/lang/RuntimeException
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    this.b = System.currentTimeMillis();
  }
  
  static {
    long l = a ^ 0x750A49F21E5L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "tÒÆ«\003ÁYOWÖ\005´Å³JK÷!¨Ïç×ú\017íñõm\020$&Æn©`ñØÈVÄ^°HÝ\035å»¾÷¡³×pK\005ø0+î´Tlú)S½³\016H0öZÕ½\032\nrkå4\017i,¶ôàM'#R¶:µr\0002\006ed\t­ÛÕ¬$,ÛpkxX").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x29E3;
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
        throw new RuntimeException("me/rerere/matrix/internal/am", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/am'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */