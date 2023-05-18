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

public class pf extends xl {
  private static final long a = o3.a(-7732068943178536647L, -7048435335066178151L, MethodHandles.lookup().lookupClass()).a(273749472154840L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public pf(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pf.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 45200142241824
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: sipush #17495
    //   18: ldc2_w 4295202414721745808
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   28: ldc ''
    //   30: sipush #27700
    //   33: ldc2_w 3193199952052284405
    //   36: lload_1
    //   37: lxor
    //   38: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   43: lload_3
    //   44: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   47: sipush #1596
    //   50: ldc2_w 5888475975413039612
    //   53: lload_1
    //   54: lxor
    //   55: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   60: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   63: return
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, String[] paramArrayOfString) {
    // Byte code:
    //   0: invokestatic a : ()I
    //   3: istore #5
    //   5: aload_1
    //   6: iload #5
    //   8: ifne -> 49
    //   11: instanceof org/bukkit/entity/Player
    //   14: ifne -> 48
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   23: athrow
    //   24: aload_1
    //   25: sipush #29679
    //   28: ldc2_w 3154026166521457280
    //   31: lload_2
    //   32: lxor
    //   33: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   38: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   43: return
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: aload_1
    //   49: checkcast org/bukkit/entity/Player
    //   52: astore #6
    //   54: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   57: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   60: aload #6
    //   62: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   67: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   70: astore #7
    //   72: aload #7
    //   74: aload #7
    //   76: invokevirtual m : ()Z
    //   79: iload #5
    //   81: ifne -> 95
    //   84: ifne -> 98
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 99
    //   98: iconst_0
    //   99: invokevirtual j : (Z)V
    //   102: iload #5
    //   104: lload_2
    //   105: lconst_0
    //   106: lcmp
    //   107: iflt -> 182
    //   110: ifne -> 174
    //   113: aload #7
    //   115: invokevirtual m : ()Z
    //   118: ifeq -> 185
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   127: athrow
    //   128: aload #6
    //   130: new java/lang/StringBuilder
    //   133: dup
    //   134: invokespecial <init> : ()V
    //   137: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: sipush #25800
    //   146: ldc2_w 2032241456294264229
    //   149: lload_2
    //   150: lxor
    //   151: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: invokevirtual toString : ()Ljava/lang/String;
    //   162: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: lload_2
    //   175: lconst_0
    //   176: lcmp
    //   177: ifle -> 224
    //   180: iload #5
    //   182: ifeq -> 231
    //   185: aload #6
    //   187: new java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial <init> : ()V
    //   194: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: sipush #11166
    //   203: ldc2_w 7139498273489335024
    //   206: lload_2
    //   207: lxor
    //   208: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   230: athrow
    //   231: return
    // Exception table:
    //   from	to	target	type
    //   5	17	20	java/lang/RuntimeException
    //   11	44	44	java/lang/RuntimeException
    //   72	87	90	java/lang/RuntimeException
    //   99	121	124	java/lang/RuntimeException
    //   113	167	170	java/lang/RuntimeException
    //   174	224	227	java/lang/RuntimeException
  }
  
  public List b(long paramLong) {
    return null;
  }
  
  static {
    long l = a ^ 0x1E849716943L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "{ÒÏ'ò1$©Îkdy]Z<±E¬írA£\033&\031*]~·VOºX²Æ«\032â\035\006@Õ­~=\0221\003§jÄMt1>ºg­èîÿÒ4@º­mÌþgPì2ç`µPäWYÈªM\035Ò$»Úòìòú¾gOüOãEzcoâð\nkf$ì¼²ô]¦|5\t\0227µ3*9oÖI\022ïà²¯ÄùßîÕÀHG«ÊËïR#æ\023\002#\013K\035äÆó\007ñµé_Gp\neýCÃObiJVV\003wØ¹ÎY\037\rë*©F¡*ÿþ¥\022M£ÏF\017ª\030ÚË¢á\034æJ¬fÖ\020Ü2WQ,\tþ\030 X").length();
    byte b2 = 80;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xA33;
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
        throw new RuntimeException("me/rerere/matrix/internal/pf", exception);
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
    //   65: ldc_w 'me/rerere/matrix/internal/pf'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */