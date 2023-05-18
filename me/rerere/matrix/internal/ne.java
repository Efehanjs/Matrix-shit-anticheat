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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ne extends xl {
  private static final long a = o3.a(-6937569257259889363L, 1698190583134807165L, MethodHandles.lookup().lookupClass()).a(126667058003016L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public ne(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ne.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 13734682692632
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: sipush #1450
    //   18: ldc2_w 4689774675967023175
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   28: sipush #2689
    //   31: ldc2_w 7414551219713021805
    //   34: lload_1
    //   35: lxor
    //   36: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   41: sipush #1402
    //   44: ldc2_w 6215992037909731487
    //   47: lload_1
    //   48: lxor
    //   49: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   54: lload_3
    //   55: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   58: sipush #13718
    //   61: ldc2_w 1056728231817095288
    //   64: lload_1
    //   65: lxor
    //   66: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   71: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   74: return
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 38689996299661
    //   5: lxor
    //   6: lstore #5
    //   8: pop2
    //   9: invokestatic a : ()I
    //   12: istore #7
    //   14: aload #4
    //   16: iload #7
    //   18: ifne -> 78
    //   21: arraylength
    //   22: iconst_3
    //   23: if_icmpge -> 76
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_1
    //   34: new java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: sipush #25874
    //   50: ldc2_w 8537772317715429989
    //   53: lload_2
    //   54: lxor
    //   55: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   71: return
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: aload #4
    //   78: iconst_1
    //   79: aaload
    //   80: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   83: astore #8
    //   85: aload #8
    //   87: iload #7
    //   89: lload_2
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle -> 112
    //   95: ifne -> 109
    //   98: ifnonnull -> 128
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: aload_1
    //   109: sipush #2340
    //   112: ldc2_w 1717561543069800031
    //   115: lload_2
    //   116: lxor
    //   117: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   122: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   127: return
    //   128: new java/util/ArrayList
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: astore #9
    //   137: iconst_2
    //   138: istore #10
    //   140: iload #10
    //   142: aload #4
    //   144: arraylength
    //   145: if_icmpge -> 200
    //   148: aload #9
    //   150: aload #4
    //   152: iload #10
    //   154: aaload
    //   155: lload #5
    //   157: dup2_x1
    //   158: pop2
    //   159: invokestatic b : (JLjava/lang/String;)Ljava/lang/String;
    //   162: invokeinterface add : (Ljava/lang/Object;)Z
    //   167: pop
    //   168: iinc #10, 1
    //   171: iload #7
    //   173: lload_2
    //   174: lconst_0
    //   175: lcmp
    //   176: ifle -> 184
    //   179: ifne -> 240
    //   182: iload #7
    //   184: ifeq -> 140
    //   187: lload_2
    //   188: lconst_0
    //   189: lcmp
    //   190: ifle -> 171
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   203: invokevirtual b : ()Lme/rerere/matrix/internal/oj;
    //   206: aload #8
    //   208: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   213: invokevirtual b : (Ljava/util/UUID;)V
    //   216: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   219: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   222: aload #8
    //   224: aload #9
    //   226: <illegal opcode> run : (Lorg/bukkit/entity/Player;Ljava/util/List;)Ljava/lang/Runnable;
    //   231: ldc2_w 2
    //   234: invokeinterface runTaskLater : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;J)Lorg/bukkit/scheduler/BukkitTask;
    //   239: pop
    //   240: return
    // Exception table:
    //   from	to	target	type
    //   14	26	29	java/lang/RuntimeException
    //   21	72	72	java/lang/RuntimeException
    //   85	101	104	java/lang/RuntimeException
    //   148	187	196	java/lang/RuntimeException
  }
  
  public List b(long paramLong) {
    return null;
  }
  
  static {
    long l = a ^ 0x62C91820BE72L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[10];
    boolean bool = false;
    String str;
    int i = (str = ")K²Np6\fN\036¹-\b±`({¼H\027S\021Þ\\X ´\005·Ï\006|Îí7¼rC/Y\005Ô=âä½rO\016÷Âw 'È.q\t}¤\fß\026\004\0360ó£sýP;×¡Ú\006S¢\032hæ \b¾cÀj·à\007<\035As?5-M\021èü\0011X»â­¶dkW£ ,4¸Ï®nfr@=a¬®ãCë\rJA\t¿°,ð¹JKâ8R{V]{]XÎFm°þ¡²í\001KxÙ¹\020+û\022qªÓÖó¨iyô0Bùîæ­½H1uÈS-ØÑ\034\030R M}\030\007p·V¤t_l¦þQ\025e´í[R^ÍÆÏ¬\020ãjxÆ¼º\0345*þ2\037eö").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xC22;
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
        throw new RuntimeException("me/rerere/matrix/internal/ne", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ne'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ne.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */