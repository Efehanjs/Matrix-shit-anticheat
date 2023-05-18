package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class sf extends xl {
  @Nullable
  private final List i;
  
  private static final long a = o3.a(9152576475432844888L, 8253539204028263728L, MethodHandles.lookup().lookupClass()).a(187019451809952L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @Nullable
  public List b(long paramLong) {
    return this.i;
  }
  
  public sf(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sf.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: sipush #18430
    //   10: ldc2_w 3334702960054074998
    //   13: lload_1
    //   14: lxor
    //   15: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   20: sipush #14806
    //   23: ldc2_w 4007332721678778461
    //   26: lload_1
    //   27: lxor
    //   28: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   33: sipush #30333
    //   36: ldc2_w 3710500458497167353
    //   39: lload_1
    //   40: lxor
    //   41: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   46: sipush #28484
    //   49: ldc2_w 8632696929495996109
    //   52: lload_1
    //   53: lxor
    //   54: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   59: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   62: nop
    //   63: aload_0
    //   64: iconst_1
    //   65: invokevirtual b : (Z)V
    //   68: nop
    //   69: return
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, @NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 83760130826084
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 118264483993130
    //   12: lxor
    //   13: dup2
    //   14: bipush #32
    //   16: lushr
    //   17: l2i
    //   18: istore #7
    //   20: dup2
    //   21: bipush #32
    //   23: lshl
    //   24: bipush #48
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #48
    //   33: lshl
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #9
    //   40: pop2
    //   41: dup2
    //   42: ldc2_w 76365162294671
    //   45: lxor
    //   46: lstore #10
    //   48: pop2
    //   49: invokestatic r : ()I
    //   52: istore #12
    //   54: aload #4
    //   56: iload #12
    //   58: ifeq -> 80
    //   61: arraylength
    //   62: iconst_4
    //   63: if_icmpeq -> 78
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: return
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: aload #4
    //   80: iconst_1
    //   81: aaload
    //   82: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   85: astore #13
    //   87: lload_2
    //   88: lconst_0
    //   89: lcmp
    //   90: iflt -> 165
    //   93: aload #13
    //   95: iload #12
    //   97: ifeq -> 111
    //   100: ifnonnull -> 166
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: aload_1
    //   111: new java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: sipush #14864
    //   121: ldc2_w 1357064155664870681
    //   124: lload_2
    //   125: lxor
    //   126: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload #4
    //   136: iconst_1
    //   137: aaload
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: sipush #8785
    //   144: ldc2_w 8942894580782003543
    //   147: lload_2
    //   148: lxor
    //   149: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   165: return
    //   166: lload_2
    //   167: lconst_0
    //   168: lcmp
    //   169: ifle -> 189
    //   172: getstatic me/rerere/matrix/internal/yk.g : Lme/rerere/matrix/internal/md;
    //   175: aload #4
    //   177: iconst_2
    //   178: aaload
    //   179: lload #5
    //   181: invokevirtual b : (Ljava/lang/String;J)Lme/rerere/matrix/internal/yk;
    //   184: dup
    //   185: ifnonnull -> 194
    //   188: pop
    //   189: return
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: astore #14
    //   196: aload #4
    //   198: iconst_3
    //   199: aaload
    //   200: invokestatic parseInt : (Ljava/lang/String;)I
    //   203: istore #15
    //   205: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   208: lload #10
    //   210: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   213: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   216: astore #16
    //   218: aload #16
    //   220: aload #13
    //   222: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   227: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   230: astore #17
    //   232: aload #17
    //   234: dup
    //   235: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   238: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   241: astore #18
    //   243: aload #16
    //   245: aload #13
    //   247: aload #14
    //   249: iload #15
    //   251: aload #18
    //   253: <illegal opcode> run : (Lme/rerere/matrix/internal/mn;Lorg/bukkit/entity/Player;Lme/rerere/matrix/internal/yk;ILme/rerere/matrix/internal/qd;)Ljava/lang/Runnable;
    //   258: astore #19
    //   260: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   263: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   266: lload #10
    //   268: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   271: checkcast org/bukkit/plugin/Plugin
    //   274: aload #19
    //   276: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   281: pop
    //   282: aload #18
    //   284: aload #17
    //   286: iload #7
    //   288: aload #14
    //   290: iload #15
    //   292: sipush #29162
    //   295: ldc2_w 8905884804834567919
    //   298: lload_2
    //   299: lxor
    //   300: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   305: sipush #2945
    //   308: ldc2_w 4137588407879425166
    //   311: lload_2
    //   312: lxor
    //   313: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   318: iload #8
    //   320: iload #9
    //   322: i2c
    //   323: invokevirtual b : (Lme/rerere/matrix/internal/yl;ILme/rerere/matrix/internal/yk;ILjava/lang/String;Ljava/lang/String;IC)V
    //   326: return
    // Exception table:
    //   from	to	target	type
    //   54	66	69	java/lang/RuntimeException
    //   61	74	74	java/lang/RuntimeException
    //   87	103	106	java/lang/RuntimeException
    //   166	190	190	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x24D5F7A058B7L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "\021ýá/^\036/h\\ \017\004¦Yø\007TO®\022ÄKNl5¯Âvy³öÍkÈÝ¨­\007ëSR@Ü­:\023ZÛDDü(\024^ÅÈÚ©êXlÁÜ«H Ëá·\025¸\002s\t\t×%\027´V\035±pXµP·\017\031´²Sèÿ¶¹ç®'d=pËYfk<Q\020Î§ÜÇ9\001\b*}¬ÿXæ¬ÆRðöFì.0\034 ¯äÂó2rPPi\001%UÑ`Hêv²\r(\004¨rn^tcÓ8=\023ð·yB |W*¼%\\ydÐÈ0u@\026M¦\0263Ã\\{;D\bï\001gÝÙ¼éàvà¾×\017ïgnÎ2ôô+Ç0\036Ç±5¼7ãÂ\023ðfOêûÜ³h¯sù¼±ÇôEy¨ãÅcHQoÞWSu'ú7°\022\020bø«UËßÍb(\025a^Kü \b\000ð\fÆÖ3n½¯\nr¼\033*Eå· .j=é÷£p:ý­\020¦J\036\026<¤MÉïÅ@]~^Úe8\022\001#8°eDkdX¶ÍGi\033Çî\"\021¾Äûz.\036/ê¯ñÝò*¼)a¢×ýjHvààËo\\6\024ÿÒ(ÇAÓ¬BªYÒT$V´¤c¼Écþz\006ÂT¬W\022Ãqñ1\005Ø\035¨b²íº").length();
    byte b2 = 56;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4453;
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
        throw new RuntimeException("me/rerere/matrix/internal/sf", exception);
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
    //   49: goto -> 103
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc_w 'me/rerere/matrix/internal/sf'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */