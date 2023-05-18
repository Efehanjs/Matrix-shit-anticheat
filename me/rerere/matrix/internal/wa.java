package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.entity.Player;

public class wa {
  private static Method b;
  
  private static Field i;
  
  private static yk[] a;
  
  private static final long c = o3.a(-537935353345754135L, 5235808507523190290L, MethodHandles.lookup().lookupClass()).a(232736980765903L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public static int p(long paramLong, int paramInt, @NotNull Player paramPlayer) {
    // Byte code:
    //   0: lload_0
    //   1: bipush #32
    //   3: lshl
    //   4: iload_2
    //   5: i2l
    //   6: bipush #32
    //   8: lshl
    //   9: bipush #32
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/wa.c : J
    //   16: lxor
    //   17: lstore #4
    //   19: invokestatic r : ()I
    //   22: istore #6
    //   24: getstatic me/rerere/matrix/internal/wa.b : Ljava/lang/reflect/Method;
    //   27: iload #6
    //   29: ifeq -> 103
    //   32: ifnonnull -> 92
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_3
    //   43: invokevirtual getClass : ()Ljava/lang/Class;
    //   46: sipush #12620
    //   49: ldc2_w 2224112488560555351
    //   52: lload #4
    //   54: lxor
    //   55: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   60: iconst_0
    //   61: anewarray java/lang/Class
    //   64: swap
    //   65: dup_x2
    //   66: pop
    //   67: dup2_x1
    //   68: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   71: swap
    //   72: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   75: putstatic me/rerere/matrix/internal/wa.b : Ljava/lang/reflect/Method;
    //   78: getstatic me/rerere/matrix/internal/wa.b : Ljava/lang/reflect/Method;
    //   81: iconst_1
    //   82: invokevirtual setAccessible : (Z)V
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: getstatic me/rerere/matrix/internal/wa.b : Ljava/lang/reflect/Method;
    //   95: aload_3
    //   96: iconst_0
    //   97: anewarray java/lang/Object
    //   100: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   103: astore #7
    //   105: iload_2
    //   106: ifle -> 185
    //   109: getstatic me/rerere/matrix/internal/wa.i : Ljava/lang/reflect/Field;
    //   112: ifnonnull -> 185
    //   115: invokestatic b : ()I
    //   118: bipush #17
    //   120: iload #6
    //   122: ifeq -> 206
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: iload_2
    //   133: ifle -> 190
    //   136: if_icmpge -> 185
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload #7
    //   148: invokevirtual getClass : ()Ljava/lang/Class;
    //   151: sipush #8614
    //   154: ldc2_w 1676697670044739004
    //   157: lload #4
    //   159: lxor
    //   160: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   165: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   168: putstatic me/rerere/matrix/internal/wa.i : Ljava/lang/reflect/Field;
    //   171: getstatic me/rerere/matrix/internal/wa.i : Ljava/lang/reflect/Field;
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: invokestatic b : ()I
    //   188: iload #6
    //   190: iload_2
    //   191: ifle -> 199
    //   194: ifeq -> 224
    //   197: bipush #17
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: if_icmplt -> 216
    //   209: aload_3
    //   210: invokeinterface getPing : ()I
    //   215: ireturn
    //   216: getstatic me/rerere/matrix/internal/wa.i : Ljava/lang/reflect/Field;
    //   219: aload #7
    //   221: invokevirtual getInt : (Ljava/lang/Object;)I
    //   224: istore #8
    //   226: iload #8
    //   228: iconst_0
    //   229: invokestatic max : (II)I
    //   232: ireturn
    //   233: astore #7
    //   235: aload #7
    //   237: invokevirtual printStackTrace : ()V
    //   240: iconst_0
    //   241: ireturn
    // Exception table:
    //   from	to	target	type
    //   24	35	38	java/lang/Exception
    //   24	215	233	java/lang/Exception
    //   32	85	88	java/lang/Exception
    //   105	125	128	java/lang/Exception
    //   115	139	142	java/lang/Exception
    //   132	178	181	java/lang/Exception
    //   185	199	202	java/lang/Exception
    //   216	232	233	java/lang/Exception
  }
  
  public static int j(long paramLong, @NotNull Player paramPlayer) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x3A12FF74A064L;
    int i = yl.r();
    try {
      if (i != 0)
        if (yk.o.b(l)) {
          yl yl = Matrix.b().b().b(paramPlayer.getUniqueId());
          try {
            if (i != 0) {
              if (yl != null)
                return (int)yl.x; 
            } else {
              return (int)yl.x;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 1;
  }
  
  public static int b(long paramLong, @Nullable Player paramPlayer) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/wa.c : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 31278436250456
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 41839308996398
    //   17: lxor
    //   18: dup2
    //   19: bipush #32
    //   21: lushr
    //   22: lstore #5
    //   24: dup2
    //   25: bipush #32
    //   27: lshl
    //   28: bipush #32
    //   30: lushr
    //   31: l2i
    //   32: istore #7
    //   34: pop2
    //   35: pop2
    //   36: invokestatic r : ()I
    //   39: istore #8
    //   41: aload_2
    //   42: iload #8
    //   44: ifeq -> 64
    //   47: ifnonnull -> 63
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: iconst_0
    //   58: ireturn
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_2
    //   64: invokeinterface isOnline : ()Z
    //   69: iload #8
    //   71: lload_0
    //   72: lconst_0
    //   73: lcmp
    //   74: iflt -> 105
    //   77: ifeq -> 103
    //   80: ifne -> 96
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: iconst_0
    //   91: ireturn
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: getstatic me/rerere/matrix/internal/yk.o : Lme/rerere/matrix/internal/yk;
    //   99: lload_3
    //   100: invokevirtual b : (J)Z
    //   103: iload #8
    //   105: ifeq -> 166
    //   108: ifeq -> 158
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   121: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   124: aload_2
    //   125: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   130: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   133: astore #9
    //   135: aload #9
    //   137: iload #8
    //   139: ifeq -> 154
    //   142: ifnull -> 158
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload #9
    //   154: invokevirtual j : ()I
    //   157: ireturn
    //   158: lload #5
    //   160: iload #7
    //   162: aload_2
    //   163: invokestatic p : (JILorg/bukkit/entity/Player;)I
    //   166: ireturn
    // Exception table:
    //   from	to	target	type
    //   41	50	53	java/lang/RuntimeException
    //   47	59	59	java/lang/RuntimeException
    //   64	83	86	java/lang/RuntimeException
    //   80	92	92	java/lang/RuntimeException
    //   103	111	114	java/lang/RuntimeException
    //   135	145	148	java/lang/RuntimeException
  }
  
  public static void U(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] i() {
    return a;
  }
  
  static {
    U(new yk[2]);
    long l = c ^ 0x283578FC84FBL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "wxáh\004Üc\022®`åÄùi4 §­b'\020z\020ÔâGAå¥?R*ýx,s\030­").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4AFE;
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
        throw new RuntimeException("me/rerere/matrix/internal/wa", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/wa'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */