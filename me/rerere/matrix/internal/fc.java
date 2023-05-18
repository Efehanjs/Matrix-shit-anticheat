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
import me.rerere.matrix.Matrix;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class fc {
  public static boolean i;
  
  private static final long a = o3.a(8226985483541987309L, -7563070840382186695L, MethodHandles.lookup().lookupClass()).a(76909589149408L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  static {
    long l = a ^ 0x6FB28173C19L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "ØÜ³m\003eíD¬ÙJlÆ¯\b`¯ÉÃððUÁg\025ÒÊ\032BÕÒ,\027OÉÒÅ¦7¡\026ªPãâ\017Ú\034F\020î<g.»½\r\024[ÙÍ¹cH©sþ\007Xá\031Âé6\r.©¤òò_ö°Tá´\023L1³ÉÓ\r£ÔÞUYècøÿÿÝqÆ\036R¹a¬n¬t}ûQ¤8u`~F7ô­\023\020·NíþJ99å\035Ëà5ÿTM¡õû©\ròÍf\005D¤ó¼¡%ÝÖ¸ðDQÔ@¸ì").length();
    char c = '';
    byte b1 = -1;
    while (true);
  }
  
  public static void b() {
    Bukkit.getScheduler().runTaskAsynchronously((Plugin)Matrix.b(), () -> {
          // Byte code:
          //   0: getstatic me/rerere/matrix/internal/fc.a : J
          //   3: ldc2_w 77777494598824
          //   6: lxor
          //   7: lstore_0
          //   8: lload_0
          //   9: dup2
          //   10: ldc2_w 32110748665231
          //   13: lxor
          //   14: lstore_2
          //   15: dup2
          //   16: ldc2_w 75363880479417
          //   19: lxor
          //   20: lstore #4
          //   22: pop2
          //   23: invokestatic r : ()I
          //   26: istore #6
          //   28: lload_2
          //   29: sipush #20775
          //   32: ldc2_w 6082573694019810233
          //   35: lload_0
          //   36: lxor
          //   37: <illegal opcode> p : (IJ)Ljava/lang/String;
          //   42: invokestatic b : (JLjava/lang/String;)Ljava/lang/String;
          //   45: astore #7
          //   47: aload #7
          //   49: iload #6
          //   51: ifeq -> 135
          //   54: lload #4
          //   56: invokestatic b : (J)Ljava/lang/String;
          //   59: invokevirtual contains : (Ljava/lang/CharSequence;)Z
          //   62: ifeq -> 115
          //   65: goto -> 72
          //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
          //   71: athrow
          //   72: iconst_0
          //   73: putstatic me/rerere/matrix/internal/fc.i : Z
          //   76: sipush #8253
          //   79: ldc2_w 8496768660782891680
          //   82: lload_0
          //   83: lxor
          //   84: <illegal opcode> p : (IJ)Ljava/lang/String;
          //   89: invokestatic b : (Ljava/lang/String;)V
          //   92: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
          //   95: invokestatic b : ()Lme/rerere/matrix/Matrix;
          //   98: invokeinterface disablePlugin : (Lorg/bukkit/plugin/Plugin;)V
          //   103: iload #6
          //   105: ifne -> 138
          //   108: goto -> 115
          //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
          //   114: athrow
          //   115: sipush #29529
          //   118: ldc2_w 5048932602700304838
          //   121: lload_0
          //   122: lxor
          //   123: <illegal opcode> p : (IJ)Ljava/lang/String;
          //   128: goto -> 135
          //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
          //   134: athrow
          //   135: invokestatic b : (Ljava/lang/String;)V
          //   138: goto -> 159
          //   141: astore #7
          //   143: sipush #18122
          //   146: ldc2_w 3744123233275716694
          //   149: lload_0
          //   150: lxor
          //   151: <illegal opcode> p : (IJ)Ljava/lang/String;
          //   156: invokestatic b : (Ljava/lang/String;)V
          //   159: return
          // Exception table:
          //   from	to	target	type
          //   28	138	141	java/lang/Exception
          //   47	65	68	java/lang/Exception
          //   54	108	111	java/lang/Exception
          //   72	128	131	java/lang/Exception
        });
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6E5F;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/fc", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/fc'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */