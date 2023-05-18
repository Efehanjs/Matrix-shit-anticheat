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

public class gh extends xl {
  private static final long a = o3.a(-3782754589835451257L, 1801593524387498788L, MethodHandles.lookup().lookupClass()).a(261836988471270L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public gh(long paramLong, byte paramByte) {
    // Byte code:
    //   0: lload_1
    //   1: bipush #8
    //   3: lshl
    //   4: iload_3
    //   5: i2l
    //   6: bipush #56
    //   8: lshl
    //   9: bipush #56
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/gh.a : J
    //   16: lxor
    //   17: lstore #4
    //   19: lload #4
    //   21: dup2
    //   22: ldc2_w 123750058409020
    //   25: lxor
    //   26: lstore #6
    //   28: pop2
    //   29: aload_0
    //   30: sipush #17478
    //   33: ldc2_w 1501857409672750778
    //   36: lload #4
    //   38: lxor
    //   39: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   44: sipush #28580
    //   47: ldc2_w 1127413417446313311
    //   50: lload #4
    //   52: lxor
    //   53: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   58: sipush #4817
    //   61: ldc2_w 8907803120157618217
    //   64: lload #4
    //   66: lxor
    //   67: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   72: lload #6
    //   74: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   77: sipush #4133
    //   80: ldc2_w 7330318240257372888
    //   83: lload #4
    //   85: lxor
    //   86: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   91: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   94: return
  }
  
  public List b(long paramLong) {
    return null;
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, String[] paramArrayOfString) {
    // Byte code:
    //   0: invokestatic r : ()I
    //   3: istore #5
    //   5: aload #4
    //   7: iload #5
    //   9: lload_2
    //   10: lconst_0
    //   11: lcmp
    //   12: ifle -> 76
    //   15: ifeq -> 75
    //   18: arraylength
    //   19: iconst_3
    //   20: if_icmpge -> 73
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: aload_1
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: sipush #7966
    //   47: ldc2_w 5988023438209077075
    //   50: lload_2
    //   51: lxor
    //   52: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   68: return
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: aload #4
    //   75: iconst_1
    //   76: aaload
    //   77: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   80: astore #6
    //   82: aload #6
    //   84: iload #5
    //   86: lload_2
    //   87: lconst_0
    //   88: lcmp
    //   89: iflt -> 109
    //   92: ifeq -> 106
    //   95: ifnonnull -> 125
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_1
    //   106: sipush #31963
    //   109: ldc2_w 494644360280976533
    //   112: lload_2
    //   113: lxor
    //   114: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   119: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   124: return
    //   125: new java/util/ArrayList
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: astore #7
    //   134: iconst_2
    //   135: istore #8
    //   137: iload #8
    //   139: aload #4
    //   141: arraylength
    //   142: if_icmpge -> 195
    //   145: aload #7
    //   147: bipush #38
    //   149: aload #4
    //   151: iload #8
    //   153: aaload
    //   154: invokestatic translateAlternateColorCodes : (CLjava/lang/String;)Ljava/lang/String;
    //   157: invokeinterface add : (Ljava/lang/Object;)Z
    //   162: pop
    //   163: iinc #8, 1
    //   166: iload #5
    //   168: lload_2
    //   169: lconst_0
    //   170: lcmp
    //   171: ifle -> 179
    //   174: ifeq -> 228
    //   177: iload #5
    //   179: ifne -> 137
    //   182: lload_2
    //   183: lconst_0
    //   184: lcmp
    //   185: ifle -> 166
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: aload #6
    //   197: new java/lang/StringBuilder
    //   200: dup
    //   201: invokespecial <init> : ()V
    //   204: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: ldc ' '
    //   212: aload #7
    //   214: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: invokevirtual toString : ()Ljava/lang/String;
    //   223: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   228: return
    // Exception table:
    //   from	to	target	type
    //   5	23	26	java/lang/RuntimeException
    //   18	69	69	java/lang/RuntimeException
    //   82	98	101	java/lang/RuntimeException
    //   145	182	191	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x31C4FB6FA143L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "Ê^W\021×Që\bÞxáá.4ÐÅ%¶Åª\f\0378Å\036÷\004=gÒ®¢ÃeÇ²Ó\026Bö÷\005Hf)é1ú\007w\027¶.¢Ôïú\fª\r\023©×¾¹.QUQ@\022@-ÿÛ§þê¤\032¡\032§¨DÜ\026cê®dÿn^nÎD`ÑsR¶¤o\bí\034,ÏÓJ@bÐµéª6¹÷d}ÔÑ(^¤\002yD©S\024 Ø\033\031ë!+Î~á-@\033PýÌ\031\037\025\023¨Qkc").length();
    byte b2 = 24;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4313;
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
        throw new RuntimeException("me/rerere/matrix/internal/gh", exception);
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
    //   65: ldc_w 'me/rerere/matrix/internal/gh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\gh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */