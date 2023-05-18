package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
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

public class nk extends zk {
  private int b;
  
  private long i;
  
  private static final long a = o3.a(-8849520402126855684L, 157509130779352746L, MethodHandles.lookup().lookupClass()).a(121139606932477L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (this.b > 0)
        this.b--; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public nk(yl paramyl) {
    super(paramyl);
    b(yk.r);
  }
  
  public boolean b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/nk.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 50169123982231
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic j : ()J
    //   17: aload_0
    //   18: getfield i : J
    //   21: lsub
    //   22: lstore #5
    //   24: aload_0
    //   25: invokestatic j : ()J
    //   28: putfield i : J
    //   31: lload #5
    //   33: ldc2_w 10
    //   36: lcmp
    //   37: ifge -> 57
    //   40: aload_0
    //   41: dup
    //   42: getfield b : I
    //   45: iconst_1
    //   46: iadd
    //   47: putfield b : I
    //   50: goto -> 71
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: aload_0
    //   59: getfield b : I
    //   62: iconst_5
    //   63: isub
    //   64: iconst_0
    //   65: invokestatic max : (II)I
    //   68: putfield b : I
    //   71: aload_0
    //   72: getfield b : I
    //   75: bipush #20
    //   77: if_icmplt -> 177
    //   80: invokestatic j : ()D
    //   83: ldc2_w 18.0
    //   86: dcmpl
    //   87: ifle -> 177
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload_0
    //   98: invokevirtual b : ()I
    //   101: bipush #18
    //   103: if_icmpge -> 177
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aload_0
    //   114: lload_3
    //   115: sipush #2251
    //   118: ldc2_w 1123642354111238449
    //   121: lload_1
    //   122: lxor
    //   123: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   128: new java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: sipush #23367
    //   138: ldc2_w 2240950040459739836
    //   141: lload_1
    //   142: lxor
    //   143: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload_0
    //   152: getfield b : I
    //   155: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   158: ldc ')'
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: iconst_1
    //   167: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   176: athrow
    //   177: aload_0
    //   178: getfield b : I
    //   181: bipush #13
    //   183: if_icmplt -> 194
    //   186: iconst_1
    //   187: goto -> 195
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: iconst_0
    //   195: ireturn
    // Exception table:
    //   from	to	target	type
    //   24	53	53	java/lang/RuntimeException
    //   71	90	93	java/lang/RuntimeException
    //   80	106	109	java/lang/RuntimeException
    //   97	170	173	java/lang/RuntimeException
    //   177	190	190	java/lang/RuntimeException
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l = paramLong ^ 0x46160FAFE882L;
    if (paramPacketType == PacketType.Play.Client.BLOCK_DIG) {
      EnumWrappers.PlayerDigType playerDigType = (EnumWrappers.PlayerDigType)paramPacketContainer.getPlayerDigTypes().read(0);
      try {
        if (playerDigType == EnumWrappers.PlayerDigType.START_DESTROY_BLOCK)
          return b(l); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x1A6C92FC0085L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "\0035ç4\030Ú\025\0236Ã\023JÓÆÄÍj\007c¶òGC[åó4Hú\033ÄÆozô\036ì\021:ÓJ½1\001wu\004ÈEc\031]ÇÃF\\Ô#û¾È\024\003¤óÄøD=Û#¡Û\037w\016ï\034©À:ßCzÔ_ªR\033?;ô&W").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x187;
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
        throw new RuntimeException("me/rerere/matrix/internal/nk", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/nk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */