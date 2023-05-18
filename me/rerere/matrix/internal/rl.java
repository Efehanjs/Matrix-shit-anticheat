package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public final class rl {
  private static int z;
  
  public static boolean k;
  
  public static boolean v;
  
  public static boolean b;
  
  @NotNull
  public static final rl i;
  
  private static int[] a;
  
  private static final long c = o3.a(-2845623201032545743L, -7312766293847134268L, MethodHandles.lookup().lookupClass()).a(178647973441297L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public final boolean m(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rl.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic r : ()I
    //   9: istore_3
    //   10: getstatic me/rerere/matrix/internal/rl.v : Z
    //   13: iload_3
    //   14: ifeq -> 30
    //   17: ifne -> 71
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   26: athrow
    //   27: getstatic me/rerere/matrix/internal/rl.k : Z
    //   30: iload_3
    //   31: lload_1
    //   32: lconst_0
    //   33: lcmp
    //   34: iflt -> 54
    //   37: ifeq -> 53
    //   40: ifne -> 71
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   49: athrow
    //   50: getstatic me/rerere/matrix/internal/rl.b : Z
    //   53: iload_3
    //   54: ifeq -> 68
    //   57: ifne -> 71
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   66: athrow
    //   67: iconst_1
    //   68: goto -> 72
    //   71: iconst_0
    //   72: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	20	23	java/lang/RuntimeException
    //   30	43	46	java/lang/RuntimeException
    //   53	60	63	java/lang/RuntimeException
  }
  
  public final boolean p(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rl.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 41098360341931
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic r : ()I
    //   17: istore #5
    //   19: getstatic me/rerere/matrix/internal/rl.v : Z
    //   22: iload #5
    //   24: ifeq -> 65
    //   27: ifne -> 64
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   36: athrow
    //   37: aload_0
    //   38: lload_3
    //   39: invokevirtual m : (J)Z
    //   42: iload #5
    //   44: ifeq -> 65
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: ifeq -> 68
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   63: athrow
    //   64: iconst_1
    //   65: goto -> 69
    //   68: iconst_0
    //   69: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	30	33	java/lang/RuntimeException
    //   27	47	50	java/lang/RuntimeException
    //   37	57	60	java/lang/RuntimeException
  }
  
  @NotNull
  public final String b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/rl.c : J
    //   17: lxor
    //   18: lstore_3
    //   19: lload_3
    //   20: dup2
    //   21: ldc2_w 97244679527639
    //   24: lxor
    //   25: lstore #5
    //   27: pop2
    //   28: iconst_4
    //   29: anewarray me/rerere/matrix/thirdparty/kotlin/Pair
    //   32: astore #8
    //   34: invokestatic r : ()I
    //   37: aload #8
    //   39: iconst_0
    //   40: sipush #10218
    //   43: ldc2_w 7054106006589040781
    //   46: lload_3
    //   47: lxor
    //   48: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   53: aload_0
    //   54: lload #5
    //   56: invokevirtual m : (J)Z
    //   59: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   62: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   65: aastore
    //   66: istore #7
    //   68: aload #8
    //   70: iconst_1
    //   71: sipush #12315
    //   74: ldc2_w 5329998261855846267
    //   77: lload_3
    //   78: lxor
    //   79: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   84: getstatic me/rerere/matrix/internal/rl.v : Z
    //   87: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   90: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   93: aastore
    //   94: aload #8
    //   96: iconst_2
    //   97: sipush #7126
    //   100: ldc2_w 6576147701582386361
    //   103: lload_3
    //   104: lxor
    //   105: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   110: getstatic me/rerere/matrix/internal/rl.k : Z
    //   113: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   116: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   119: aastore
    //   120: aload #8
    //   122: iconst_3
    //   123: sipush #8844
    //   126: ldc2_w 4766038221735816673
    //   129: lload_3
    //   130: lxor
    //   131: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   136: getstatic me/rerere/matrix/internal/rl.b : Z
    //   139: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   142: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   145: aastore
    //   146: aload #8
    //   148: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
    //   151: checkcast java/lang/Iterable
    //   154: astore #8
    //   156: nop
    //   157: iconst_0
    //   158: istore #9
    //   160: aload #8
    //   162: astore #10
    //   164: new java/util/ArrayList
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: checkcast java/util/Collection
    //   174: astore #11
    //   176: iconst_0
    //   177: istore #12
    //   179: aload #10
    //   181: invokeinterface iterator : ()Ljava/util/Iterator;
    //   186: astore #13
    //   188: aload #13
    //   190: invokeinterface hasNext : ()Z
    //   195: ifeq -> 262
    //   198: aload #13
    //   200: invokeinterface next : ()Ljava/lang/Object;
    //   205: astore #14
    //   207: aload #14
    //   209: checkcast me/rerere/matrix/thirdparty/kotlin/Pair
    //   212: astore #15
    //   214: iconst_0
    //   215: istore #16
    //   217: aload #15
    //   219: invokevirtual getSecond : ()Ljava/lang/Object;
    //   222: checkcast java/lang/Boolean
    //   225: invokevirtual booleanValue : ()Z
    //   228: iload_1
    //   229: ifle -> 259
    //   232: iload #7
    //   234: ifeq -> 256
    //   237: ifeq -> 188
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: athrow
    //   247: aload #11
    //   249: aload #14
    //   251: invokeinterface add : (Ljava/lang/Object;)Z
    //   256: pop
    //   257: iload #7
    //   259: ifne -> 188
    //   262: aload #11
    //   264: checkcast java/util/List
    //   267: nop
    //   268: checkcast java/lang/Iterable
    //   271: aconst_null
    //   272: aconst_null
    //   273: aconst_null
    //   274: iconst_0
    //   275: aconst_null
    //   276: getstatic me/rerere/matrix/internal/vl.i : Lme/rerere/matrix/internal/vl;
    //   279: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   282: bipush #31
    //   284: aconst_null
    //   285: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   288: iload_1
    //   289: ifle -> 205
    //   292: areturn
    // Exception table:
    //   from	to	target	type
    //   217	240	243	java/lang/RuntimeException
  }
  
  public final void j(long paramLong) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x3AC1C027DF19L;
    z = 0;
    hw.d(-2700668079793756444L, paramLong);
    try {
      hw.d(-2700668079793756444L, paramLong).invoke(this, hw.e(0L, l));
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
  }
  
  static {
    long l = c ^ 0x4C66D1F3F7D0L;
    Z(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[15];
    boolean bool = false;
    String str;
    int i = (str = "rÃ£¾!\\w°-W\r9þY0»Ú<>\001,\013ÏBÆà\007ô¥!\004ðm|\007ÄIR&Íø0]cö÷x«\034¡ªÇpÇº*ÍÕW\020BK};[ey§Zï®*\b\020RÚ'\tæ\0330j­/þ@äX&ÈKó\023éýN\003¨^0y\032ðÓ§)x[éÁo5\033N\006ôÇì¢DÈS¡\026\004Ú\016\020\r]³½òJW½ç7$Ì1ÍlhtEkV\002êqHm½U\002/\016_0æ\035óÞ7B\027su©3^²¿ð\001\003?ZF\f\030\b÷\b.ñB.l-\030w©\006\032±U\034¾§M\"E`ÄL9xWüº\001\032ôºº=\003\036²\032õ\022aº«öèPæëdÚ\020­}´kÂ\\dßñiVj9«+r@£JÞ8:~\037î\013NºßO©¯\035.Áè¢(\"¨ÆpCB·ïÅ7Á\b\020ýTÄâÿØ\026y@\021\002\bX]Á>­BÌåmî¬þe]°ªílú'¡\024¢\rfûø\035éi¤FáÁHÃGæ\024\033F\004¸yUs\t&¾\nâ W}Ñ²É[ø»=DÞ\033BÌ(ÑÂg¨$o´^\002ËatXhq\025Wñü\030|²XÝÄX6\024d\006Íy®):\fá¯\004lô¥@n¢o>Y+¿ø1@ñ_Ï¨\035Xúñª ï1(çÏ 2\034z:î\017PP\rÙ\030ÕfÇò\"ðmÒU&\020\030!*õ\000\024ÀCÖw<ú5\030U\022S\025µïçdi\021¡>¼oWZ,Ê.¥W\005-\030Kz\021â%æG9{ýbönÑ3¨½W\025«X\030¦\t}þÎ\033j¡\026è¶Òç\033¼ÂêZ]üå÷å}sïÿû!¾Äc]À÷Uï\b`æÁhÒå2Kfòr }lX+y\020Tl\b.µS\017Gþt3J½ÚZêõ\"ª\f\037\f").length();
    byte b2 = 72;
    byte b = -1;
    while (true);
  }
  
  public final boolean j() {
    return b;
  }
  
  public final boolean b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rl.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic a : ()I
    //   9: istore_3
    //   10: getstatic me/rerere/matrix/internal/rl.k : Z
    //   13: iload_3
    //   14: ifne -> 52
    //   17: ifne -> 51
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   26: athrow
    //   27: getstatic me/rerere/matrix/internal/rl.b : Z
    //   30: iload_3
    //   31: ifne -> 52
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   40: athrow
    //   41: ifeq -> 55
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   50: athrow
    //   51: iconst_1
    //   52: goto -> 56
    //   55: iconst_0
    //   56: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	20	23	java/lang/RuntimeException
    //   17	34	37	java/lang/RuntimeException
    //   27	44	47	java/lang/RuntimeException
  }
  
  public static void Z(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] E() {
    return a;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x533C;
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
        throw new RuntimeException("me/rerere/matrix/internal/rl", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/rl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */