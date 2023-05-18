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

public class dm extends zk {
  private long i;
  
  private static final String[] a;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: pop2
    //   9: iconst_0
    //   10: istore #7
    //   12: aload_1
    //   13: getstatic com/comphenix/protocol/PacketType$Play$Client.CUSTOM_PAYLOAD : Lcom/comphenix/protocol/PacketType;
    //   16: if_acmpne -> 129
    //   19: invokestatic b : ()I
    //   22: bipush #13
    //   24: if_icmpge -> 129
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: aload #4
    //   36: invokevirtual getStrings : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   39: iconst_0
    //   40: invokevirtual read : (I)Ljava/lang/Object;
    //   43: checkcast java/lang/String
    //   46: astore #8
    //   48: aload #8
    //   50: sipush #26221
    //   53: ldc2_w 7646398484528815641
    //   56: lload_2
    //   57: lxor
    //   58: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   63: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   66: ifne -> 97
    //   69: aload #8
    //   71: sipush #6973
    //   74: ldc2_w 1169282170079322958
    //   77: lload_2
    //   78: lxor
    //   79: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   84: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   87: ifeq -> 129
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: invokestatic currentTimeMillis : ()J
    //   100: aload_0
    //   101: getfield i : J
    //   104: lsub
    //   105: ldc2_w 100
    //   108: lcmp
    //   109: ifge -> 122
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: iconst_1
    //   120: istore #7
    //   122: aload_0
    //   123: invokestatic currentTimeMillis : ()J
    //   126: putfield i : J
    //   129: aload_1
    //   130: getstatic com/comphenix/protocol/PacketType$Play$Client.CHAT : Lcom/comphenix/protocol/PacketType;
    //   133: if_acmpne -> 267
    //   136: aload #4
    //   138: invokevirtual getStrings : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   141: iconst_0
    //   142: invokevirtual read : (I)Ljava/lang/Object;
    //   145: checkcast java/lang/String
    //   148: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   151: astore #8
    //   153: aload #8
    //   155: sipush #19445
    //   158: ldc2_w 8701724730131215239
    //   161: lload_2
    //   162: lxor
    //   163: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   168: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   171: ifne -> 202
    //   174: aload #8
    //   176: sipush #7439
    //   179: ldc2_w 5537278740299588991
    //   182: lload_2
    //   183: lxor
    //   184: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   189: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   192: ifeq -> 267
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload #8
    //   204: sipush #14795
    //   207: ldc2_w 842900356788322750
    //   210: lload_2
    //   211: lxor
    //   212: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   217: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   220: ifeq -> 267
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: iconst_1
    //   231: istore #7
    //   233: aload_0
    //   234: lload #5
    //   236: sipush #5726
    //   239: ldc2_w 3629469148618927663
    //   242: lload_2
    //   243: lxor
    //   244: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   249: sipush #21931
    //   252: ldc2_w 2484041779262975452
    //   255: lload_2
    //   256: lxor
    //   257: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   262: bipush #10
    //   264: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   267: iload #7
    //   269: ireturn
    // Exception table:
    //   from	to	target	type
    //   12	27	30	java/lang/RuntimeException
    //   48	90	93	java/lang/RuntimeException
    //   69	112	115	java/lang/RuntimeException
    //   153	195	198	java/lang/RuntimeException
    //   174	223	226	java/lang/RuntimeException
  }
  
  public dm(yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  static {
    long l = o3.a(-5758121347223318521L, -2001385917167255753L, MethodHandles.lookup().lookupClass()).a(15765151160588L) ^ 0x36BFC5E1AE6FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "WæôI\021øÙ¤.\fÁ¶¦RSÐÓät:JÏ¶gÙ/%8·ô\020µàÀõæA9Qù\017<RRéÇÖ\030ê6/Ò\rè\006£°µÆþ/{8\013Àd\0208x]x\020Ëèk£Î!p`Yo¶\005óÜ\020\031ªÞ!{?È´Yý\035Ýª¬\022").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2B49;
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
        throw new RuntimeException("me/rerere/matrix/internal/dm", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = a[i].getBytes("ISO-8859-1");
      c[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   65: ldc_w 'me/rerere/matrix/internal/dm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */