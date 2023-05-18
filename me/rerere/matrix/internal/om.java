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
import org.bukkit.scheduler.BukkitRunnable;

public class om extends BukkitRunnable {
  private static long v;
  
  public static int b;
  
  public static long i;
  
  private static final long a = o3.a(155377478359179824L, -5542683917322464385L, MethodHandles.lookup().lookupClass()).a(140205616502386L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void run() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/om.a : J
    //   3: ldc2_w 80844900953139
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 93052816541181
    //   13: lxor
    //   14: dup2
    //   15: bipush #32
    //   17: lushr
    //   18: l2i
    //   19: istore_3
    //   20: dup2
    //   21: bipush #32
    //   23: lshl
    //   24: bipush #48
    //   26: lushr
    //   27: l2i
    //   28: istore #4
    //   30: dup2
    //   31: bipush #48
    //   33: lshl
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #5
    //   40: pop2
    //   41: dup2
    //   42: ldc2_w 61058864547370
    //   45: lxor
    //   46: lstore #6
    //   48: dup2
    //   49: ldc2_w 98539557076722
    //   52: lxor
    //   53: lstore #8
    //   55: dup2
    //   56: ldc2_w 138207624055766
    //   59: lxor
    //   60: lstore #10
    //   62: dup2
    //   63: ldc2_w 12775961571762
    //   66: lxor
    //   67: dup2
    //   68: bipush #32
    //   70: lushr
    //   71: l2i
    //   72: istore #12
    //   74: dup2
    //   75: bipush #32
    //   77: lshl
    //   78: bipush #48
    //   80: lushr
    //   81: l2i
    //   82: istore #13
    //   84: dup2
    //   85: bipush #48
    //   87: lshl
    //   88: bipush #48
    //   90: lushr
    //   91: l2i
    //   92: istore #14
    //   94: pop2
    //   95: dup2
    //   96: ldc2_w 22552510211839
    //   99: lxor
    //   100: dup2
    //   101: bipush #32
    //   103: lushr
    //   104: l2i
    //   105: istore #15
    //   107: dup2
    //   108: bipush #32
    //   110: lshl
    //   111: bipush #56
    //   113: lushr
    //   114: l2i
    //   115: istore #16
    //   117: dup2
    //   118: bipush #40
    //   120: lshl
    //   121: bipush #40
    //   123: lushr
    //   124: l2i
    //   125: istore #17
    //   127: pop2
    //   128: dup2
    //   129: ldc2_w 48902759204169
    //   132: lxor
    //   133: dup2
    //   134: bipush #32
    //   136: lushr
    //   137: l2i
    //   138: istore #18
    //   140: dup2
    //   141: bipush #32
    //   143: lshl
    //   144: bipush #32
    //   146: lushr
    //   147: l2i
    //   148: istore #19
    //   150: pop2
    //   151: pop2
    //   152: lload #6
    //   154: invokestatic b : (J)V
    //   157: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   160: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   163: invokevirtual b : ()Ljava/util/Map;
    //   166: invokeinterface values : ()Ljava/util/Collection;
    //   171: invokeinterface iterator : ()Ljava/util/Iterator;
    //   176: astore #20
    //   178: aload #20
    //   180: invokeinterface hasNext : ()Z
    //   185: ifeq -> 426
    //   188: aload #20
    //   190: invokeinterface next : ()Ljava/lang/Object;
    //   195: checkcast me/rerere/matrix/internal/yl
    //   198: astore #21
    //   200: aload #21
    //   202: invokevirtual p : ()V
    //   205: aload #21
    //   207: iload_3
    //   208: iload #4
    //   210: iload #5
    //   212: i2s
    //   213: invokevirtual j : (IIS)V
    //   216: aload #21
    //   218: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   221: astore #22
    //   223: aload #22
    //   225: invokevirtual b : ()Ljava/util/List;
    //   228: invokeinterface iterator : ()Ljava/util/Iterator;
    //   233: astore #23
    //   235: aload #23
    //   237: invokeinterface hasNext : ()Z
    //   242: ifeq -> 423
    //   245: aload #23
    //   247: invokeinterface next : ()Ljava/lang/Object;
    //   252: checkcast me/rerere/matrix/internal/zk
    //   255: astore #24
    //   257: aload #24
    //   259: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   262: lload #8
    //   264: invokevirtual b : (J)Z
    //   267: ifeq -> 420
    //   270: aload #21
    //   272: iload #12
    //   274: iload #13
    //   276: i2s
    //   277: iload #14
    //   279: invokevirtual t : (ISI)Z
    //   282: ifne -> 420
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   291: athrow
    //   292: aload #24
    //   294: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   297: aload #21
    //   299: iload #15
    //   301: iload #16
    //   303: i2b
    //   304: iload #17
    //   306: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   309: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   314: lload #10
    //   316: dup2_x1
    //   317: pop2
    //   318: invokevirtual b : (JLorg/bukkit/World;)Z
    //   321: ifeq -> 420
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   330: athrow
    //   331: aload #24
    //   333: iload #18
    //   335: iload #19
    //   337: invokevirtual b : (II)V
    //   340: goto -> 420
    //   343: astore #25
    //   345: aload #25
    //   347: invokevirtual printStackTrace : ()V
    //   350: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   353: new java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: sipush #19839
    //   363: ldc2_w 6319791163266465038
    //   366: lload_1
    //   367: lxor
    //   368: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: aload #24
    //   378: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   381: invokevirtual name : ()Ljava/lang/String;
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: sipush #27677
    //   390: ldc2_w 6192767583033154670
    //   393: lload_1
    //   394: lxor
    //   395: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: aload #25
    //   405: invokevirtual getClass : ()Ljava/lang/Class;
    //   408: invokevirtual getName : ()Ljava/lang/String;
    //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: invokevirtual toString : ()Ljava/lang/String;
    //   417: invokevirtual println : (Ljava/lang/String;)V
    //   420: goto -> 235
    //   423: goto -> 178
    //   426: return
    // Exception table:
    //   from	to	target	type
    //   257	285	288	java/lang/Exception
    //   270	324	327	java/lang/Exception
    //   331	340	343	java/lang/Exception
  }
  
  public static void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/om.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 139285176995026
    //   11: lxor
    //   12: dup2
    //   13: bipush #16
    //   15: lushr
    //   16: lstore_2
    //   17: dup2
    //   18: bipush #48
    //   20: lshl
    //   21: bipush #48
    //   23: lushr
    //   24: l2i
    //   25: istore #4
    //   27: pop2
    //   28: pop2
    //   29: getstatic me/rerere/matrix/internal/ge.y : Z
    //   32: ifeq -> 138
    //   35: getstatic me/rerere/matrix/internal/om.v : J
    //   38: getstatic me/rerere/matrix/internal/ge.b : J
    //   41: ladd
    //   42: invokestatic b : ()J
    //   45: lcmp
    //   46: ifge -> 138
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: getstatic me/rerere/matrix/internal/pd.w : Z
    //   59: ifeq -> 132
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: invokestatic b : ()J
    //   72: getstatic me/rerere/matrix/internal/om.v : J
    //   75: lsub
    //   76: lstore #5
    //   78: new java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: sipush #29043
    //   88: ldc2_w 2362593078318565168
    //   91: lload_0
    //   92: lxor
    //   93: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: lload #5
    //   103: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   106: sipush #29991
    //   109: ldc2_w 6328080602809238374
    //   112: lload_0
    //   113: lxor
    //   114: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: lload_2
    //   126: iload #4
    //   128: i2s
    //   129: invokestatic b : (Ljava/lang/String;JS)V
    //   132: invokestatic b : ()J
    //   135: putstatic me/rerere/matrix/internal/om.i : J
    //   138: invokestatic b : ()J
    //   141: putstatic me/rerere/matrix/internal/om.v : J
    //   144: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   147: invokeinterface size : ()I
    //   152: putstatic me/rerere/matrix/internal/om.b : I
    //   155: return
    // Exception table:
    //   from	to	target	type
    //   29	49	52	java/lang/RuntimeException
    //   35	62	65	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x242460BBD2FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "ým±8O»Ï³pëâj5$\020AÛ³ÐD·½?µ\bã¸").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1C58;
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
        throw new RuntimeException("me/rerere/matrix/internal/om", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/om'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\om.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */