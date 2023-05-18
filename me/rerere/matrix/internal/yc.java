package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class yc {
  private long v;
  
  private ic b;
  
  private PacketType i;
  
  private static boolean a;
  
  private static final long c = o3.a(5347338575627566682L, 8073330949629334742L, MethodHandles.lookup().lookupClass()).a(27292532784695L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @Nullable
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yc.c : J
    //   3: ldc2_w 81579785312781
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: aload_0
    //   16: getfield i : Lcom/comphenix/protocol/PacketType;
    //   19: invokevirtual name : ()Ljava/lang/String;
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: sipush #29977
    //   28: ldc2_w 2105840355284953821
    //   31: lload_1
    //   32: lxor
    //   33: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: getfield v : J
    //   45: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   48: sipush #10341
    //   51: ldc2_w 7710702545077925792
    //   54: lload_1
    //   55: lxor
    //   56: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: aload_0
    //   65: getfield b : Lme/rerere/matrix/internal/ic;
    //   68: ifnull -> 75
    //   71: iconst_1
    //   72: goto -> 76
    //   75: iconst_0
    //   76: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: areturn
  }
  
  public PacketType b() {
    return this.i;
  }
  
  public ic b() {
    return this.b;
  }
  
  public long b() {
    return this.v;
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yc.c : J
    //   3: ldc2_w 115431808467589
    //   6: lxor
    //   7: lstore_1
    //   8: bipush #59
    //   10: istore #4
    //   12: iconst_1
    //   13: istore #5
    //   15: aload_0
    //   16: invokevirtual b : ()J
    //   19: lstore #6
    //   21: iload #5
    //   23: bipush #59
    //   25: imul
    //   26: lload #6
    //   28: bipush #32
    //   30: lushr
    //   31: lload #6
    //   33: lxor
    //   34: l2i
    //   35: iadd
    //   36: istore #5
    //   38: invokestatic a : ()I
    //   41: aload_0
    //   42: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   45: astore #8
    //   47: istore_3
    //   48: iload #5
    //   50: bipush #59
    //   52: imul
    //   53: aload #8
    //   55: iload_3
    //   56: ifne -> 80
    //   59: ifnonnull -> 78
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: bipush #43
    //   71: goto -> 83
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: aload #8
    //   80: invokevirtual hashCode : ()I
    //   83: iadd
    //   84: istore #5
    //   86: aload_0
    //   87: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   90: astore #9
    //   92: iload #5
    //   94: bipush #59
    //   96: imul
    //   97: aload #9
    //   99: iload_3
    //   100: ifne -> 124
    //   103: ifnonnull -> 122
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: bipush #43
    //   115: goto -> 127
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload #9
    //   124: invokevirtual hashCode : ()I
    //   127: iadd
    //   128: istore #5
    //   130: iload #5
    //   132: ireturn
    // Exception table:
    //   from	to	target	type
    //   48	62	65	java/lang/RuntimeException
    //   59	74	74	java/lang/RuntimeException
    //   92	106	109	java/lang/RuntimeException
    //   103	118	118	java/lang/RuntimeException
  }
  
  public void b(ic paramic) {
    this.b = paramic;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof yc;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yc.c : J
    //   3: ldc2_w 15247828342535
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/yc
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/yc
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifne -> 116
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload_0
    //   95: iload #4
    //   97: ifne -> 126
    //   100: invokevirtual b : ()J
    //   103: aload #5
    //   105: invokevirtual b : ()J
    //   108: lcmp
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: ifeq -> 125
    //   119: iconst_0
    //   120: ireturn
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload_0
    //   126: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   129: astore #6
    //   131: aload #5
    //   133: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   136: astore #7
    //   138: aload #6
    //   140: iload #4
    //   142: ifne -> 176
    //   145: ifnonnull -> 174
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: aload #7
    //   157: ifnull -> 198
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: goto -> 196
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload #6
    //   176: aload #7
    //   178: invokevirtual equals : (Ljava/lang/Object;)Z
    //   181: iload #4
    //   183: ifne -> 197
    //   186: ifne -> 198
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: iconst_0
    //   197: ireturn
    //   198: aload_0
    //   199: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   202: astore #8
    //   204: aload #5
    //   206: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   209: astore #9
    //   211: aload #8
    //   213: iload #4
    //   215: ifne -> 249
    //   218: ifnonnull -> 247
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   227: athrow
    //   228: aload #9
    //   230: ifnull -> 275
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   239: athrow
    //   240: goto -> 269
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: aload #8
    //   249: aload #9
    //   251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   254: iload #4
    //   256: ifne -> 276
    //   259: ifne -> 275
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   268: athrow
    //   269: iconst_0
    //   270: ireturn
    //   271: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   274: athrow
    //   275: iconst_1
    //   276: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	81	84	java/lang/RuntimeException
    //   78	90	90	java/lang/RuntimeException
    //   94	109	112	java/lang/RuntimeException
    //   116	121	121	java/lang/RuntimeException
    //   138	148	151	java/lang/RuntimeException
    //   145	160	163	java/lang/RuntimeException
    //   155	170	170	java/lang/RuntimeException
    //   176	189	192	java/lang/RuntimeException
    //   211	221	224	java/lang/RuntimeException
    //   218	233	236	java/lang/RuntimeException
    //   228	243	243	java/lang/RuntimeException
    //   249	262	265	java/lang/RuntimeException
    //   259	271	271	java/lang/RuntimeException
  }
  
  public void b(@NotNull yc paramyc) {
    this.i = paramyc.i;
    this.v = paramyc.v;
    this.b = paramyc.b;
  }
  
  public yc(PacketType paramPacketType, long paramLong, ic paramic) {
    this.i = paramPacketType;
    this.v = paramLong;
    this.b = paramic;
  }
  
  public void b(PacketType paramPacketType) {
    this.i = paramPacketType;
  }
  
  public void b(long paramLong) {
    this.v = paramLong;
  }
  
  public static void Q(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean Y() {
    return a;
  }
  
  public static boolean h() {
    boolean bool = Y();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    Q(true);
    long l = c ^ 0x66AD219D1098L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "¼)\työHzzÍ\róÞùù\020ÉC\005òø¡\030ºÈ9\031\002D").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x584F;
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
        throw new RuntimeException("me/rerere/matrix/internal/yc", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/yc'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */