package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
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

public class kn extends zk {
  private static boolean b;
  
  private static int i;
  
  private static final long a = o3.a(-7147722777936533426L, 6928861602475069677L, MethodHandles.lookup().lookupClass()).a(55257894111044L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/kn.a : J
    //   3: ldc2_w 95170500346236
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #8218
    //   15: ldc2_w 4571176769598573330
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/kn.b : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #10266
    //   41: ldc2_w 3882804443954987793
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   51: bipush #20
    //   53: invokeinterface getInt : (Ljava/lang/String;I)I
    //   58: putstatic me/rerere/matrix/internal/kn.i : I
    //   61: return
  }
  
  public kn(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 115316016290285
    //   12: lxor
    //   13: dup2
    //   14: bipush #32
    //   16: lushr
    //   17: l2i
    //   18: istore #7
    //   20: dup2
    //   21: bipush #32
    //   23: lshl
    //   24: bipush #56
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #40
    //   33: lshl
    //   34: bipush #40
    //   36: lushr
    //   37: l2i
    //   38: istore #9
    //   40: pop2
    //   41: pop2
    //   42: getstatic me/rerere/matrix/internal/kn.b : Z
    //   45: ifeq -> 130
    //   48: aload_1
    //   49: getstatic com/comphenix/protocol/PacketType$Play$Client.ABILITIES : Lcom/comphenix/protocol/PacketType;
    //   52: if_acmpne -> 130
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: aload_0
    //   63: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   66: iload #7
    //   68: iload #8
    //   70: i2b
    //   71: iload #9
    //   73: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   76: astore #10
    //   78: aload #10
    //   80: invokeinterface getAllowFlight : ()Z
    //   85: ifne -> 130
    //   88: aload_0
    //   89: lload #5
    //   91: sipush #22300
    //   94: ldc2_w 1925479747920138476
    //   97: lload_2
    //   98: lxor
    //   99: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   104: sipush #7473
    //   107: ldc2_w 9038426384938490562
    //   110: lload_2
    //   111: lxor
    //   112: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   117: getstatic me/rerere/matrix/internal/kn.i : I
    //   120: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: iconst_0
    //   131: ireturn
    // Exception table:
    //   from	to	target	type
    //   42	55	58	java/lang/RuntimeException
    //   78	123	126	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0xE1E809D3C6DL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "Cæ²|6hFÍ\022Ûb-\013\020ß\033Ið\001P¸ ÷\"Ã¾LùßdOQ1V[t¥i\036ÿ±Æ02Íôç7ºÆ").length();
    byte b2 = 24;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x54C8;
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
        throw new RuntimeException("me/rerere/matrix/internal/kn", exception);
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
    //   65: ldc_w 'me/rerere/matrix/internal/kn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\kn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */