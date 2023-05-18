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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.command.CommandSender;

public final class th extends xl {
  @Nullable
  private final List i;
  
  private static final long a = o3.a(-3996796298961004466L, -7593871426617909419L, MethodHandles.lookup().lookupClass()).a(143445620573882L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public th(int paramInt, char paramChar, short paramShort) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/th.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: aload_0
    //   30: sipush #20016
    //   33: ldc2_w 8455786217569388477
    //   36: lload #4
    //   38: lxor
    //   39: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   44: sipush #32256
    //   47: ldc2_w 1002433205711681419
    //   50: lload #4
    //   52: lxor
    //   53: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   58: sipush #9471
    //   61: ldc2_w 5824096745616010615
    //   64: lload #4
    //   66: lxor
    //   67: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   72: sipush #27627
    //   75: ldc2_w 913676076110324327
    //   78: lload #4
    //   80: lxor
    //   81: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   86: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   89: return
  }
  
  @Nullable
  public List b(long paramLong) {
    return this.i;
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, @NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 100956027290005
    //   5: lxor
    //   6: dup2
    //   7: bipush #56
    //   9: lushr
    //   10: l2i
    //   11: istore #5
    //   13: dup2
    //   14: bipush #8
    //   16: lshl
    //   17: bipush #8
    //   19: lushr
    //   20: lstore #6
    //   22: pop2
    //   23: dup2
    //   24: ldc2_w 76365162294671
    //   27: lxor
    //   28: lstore #8
    //   30: pop2
    //   31: invokestatic a : ()I
    //   34: istore #10
    //   36: aload #4
    //   38: iload #10
    //   40: ifne -> 103
    //   43: arraylength
    //   44: iconst_2
    //   45: if_icmpge -> 101
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload_1
    //   56: new java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: sipush #12573
    //   75: ldc2_w 3514436628063925006
    //   78: lload_2
    //   79: lxor
    //   80: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokevirtual toString : ()Ljava/lang/String;
    //   91: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   96: return
    //   97: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   100: athrow
    //   101: aload #4
    //   103: iconst_1
    //   104: aaload
    //   105: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   108: astore #11
    //   110: lload_2
    //   111: lconst_0
    //   112: lcmp
    //   113: iflt -> 174
    //   116: aload #11
    //   118: iload #10
    //   120: ifne -> 134
    //   123: ifnonnull -> 175
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload_1
    //   134: new java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   144: invokevirtual toString : ()Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: sipush #32349
    //   153: ldc2_w 1734710291212401743
    //   156: lload_2
    //   157: lxor
    //   158: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual toString : ()Ljava/lang/String;
    //   169: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   174: return
    //   175: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   178: lload #8
    //   180: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   183: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   186: aload #11
    //   188: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   193: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   196: dup
    //   197: ifnonnull -> 252
    //   200: pop
    //   201: aload_0
    //   202: checkcast me/rerere/matrix/internal/th
    //   205: astore #13
    //   207: iconst_0
    //   208: istore #14
    //   210: aload_1
    //   211: new java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   221: invokevirtual toString : ()Ljava/lang/String;
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: sipush #6440
    //   230: ldc2_w 5825976888463203135
    //   233: lload_2
    //   234: lxor
    //   235: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual toString : ()Ljava/lang/String;
    //   246: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   251: return
    //   252: astore #12
    //   254: aload #12
    //   256: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   259: iload #5
    //   261: i2b
    //   262: lload #6
    //   264: invokevirtual b : (BJ)V
    //   267: aload_1
    //   268: new java/lang/StringBuilder
    //   271: dup
    //   272: invokespecial <init> : ()V
    //   275: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   278: invokevirtual toString : ()Ljava/lang/String;
    //   281: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: sipush #9039
    //   287: ldc2_w 339846087822516571
    //   290: lload_2
    //   291: lxor
    //   292: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: invokevirtual toString : ()Ljava/lang/String;
    //   303: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   308: return
    // Exception table:
    //   from	to	target	type
    //   36	48	51	java/lang/RuntimeException
    //   43	97	97	java/lang/RuntimeException
    //   110	126	129	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x7DBABF8CF3EDL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "³R~*åî­\017¼¢æUÁìRÔ±ÿ\\áXA¦ók-\006,ºp~\0020¹[È*¬,A)(\006ûkþ«H\006\007-ho,Ö\021Oæ(Yí\013þn°É\027\037\033\030Ï ©]vý\020C+EºÌ2qc3\bcHA­ 0?}=Ü'y°JÛ9\024ßÂçOFßxÑv6 \035\026é¾ ùñ\013Ï(¸53®CIå´@n\036\fÌÛ\033\000vj\006 Ê¹¶5@ÿîwÏ;w(1\"yYEm²&-Õ\"@Ôê¹ãvÉ\007O \032$Nè\0309Þ\nH`ÖiqüÏí\006û¿÷VÀx\b").length();
    byte b2 = 48;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x114E;
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
        throw new RuntimeException("me/rerere/matrix/internal/th", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/th'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\th.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */