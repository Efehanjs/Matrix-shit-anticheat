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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ka {
  @NotNull
  private final aa k;
  
  private final boolean v;
  
  private final boolean b;
  
  private final boolean i;
  
  private static String a;
  
  private static final long c = o3.a(-812507205143414660L, 1349975215324756183L, MethodHandles.lookup().lookupClass()).a(150602898838931L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ka.c : J
    //   3: ldc2_w 67982016067717
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
    //   26: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/ka
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/ka
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifne -> 98
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual p : ()Z
    //   98: aload #5
    //   100: invokevirtual p : ()Z
    //   103: iload #4
    //   105: ifne -> 133
    //   108: if_icmpeq -> 124
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   117: athrow
    //   118: iconst_0
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   123: athrow
    //   124: aload_0
    //   125: invokevirtual j : ()Z
    //   128: aload #5
    //   130: invokevirtual j : ()Z
    //   133: iload #4
    //   135: ifne -> 175
    //   138: if_icmpeq -> 154
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   147: athrow
    //   148: iconst_0
    //   149: ireturn
    //   150: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   153: athrow
    //   154: aload_0
    //   155: iload #4
    //   157: ifne -> 185
    //   160: invokevirtual b : ()Z
    //   163: aload #5
    //   165: invokevirtual b : ()Z
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   174: athrow
    //   175: if_icmpeq -> 184
    //   178: iconst_0
    //   179: ireturn
    //   180: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   183: athrow
    //   184: aload_0
    //   185: invokevirtual b : ()Lme/rerere/matrix/internal/aa;
    //   188: astore #6
    //   190: aload #5
    //   192: invokevirtual b : ()Lme/rerere/matrix/internal/aa;
    //   195: astore #7
    //   197: aload #6
    //   199: iload #4
    //   201: ifne -> 235
    //   204: ifnonnull -> 233
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   213: athrow
    //   214: aload #7
    //   216: ifnull -> 261
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   225: athrow
    //   226: goto -> 255
    //   229: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   232: athrow
    //   233: aload #6
    //   235: aload #7
    //   237: invokevirtual equals : (Ljava/lang/Object;)Z
    //   240: iload #4
    //   242: ifne -> 262
    //   245: ifne -> 261
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   254: athrow
    //   255: iconst_0
    //   256: ireturn
    //   257: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   260: athrow
    //   261: iconst_1
    //   262: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/NullPointerException
    //   19	32	32	java/lang/NullPointerException
    //   37	48	51	java/lang/NullPointerException
    //   42	57	57	java/lang/NullPointerException
    //   67	81	84	java/lang/NullPointerException
    //   78	90	90	java/lang/NullPointerException
    //   98	111	114	java/lang/NullPointerException
    //   108	120	120	java/lang/NullPointerException
    //   133	141	144	java/lang/NullPointerException
    //   138	150	150	java/lang/NullPointerException
    //   154	168	171	java/lang/NullPointerException
    //   175	180	180	java/lang/NullPointerException
    //   197	207	210	java/lang/NullPointerException
    //   204	219	222	java/lang/NullPointerException
    //   214	229	229	java/lang/NullPointerException
    //   235	248	251	java/lang/NullPointerException
    //   245	257	257	java/lang/NullPointerException
  }
  
  @NotNull
  public aa b() {
    return this.k;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof ka;
  }
  
  public boolean p() {
    return this.b;
  }
  
  public boolean j() {
    return this.i;
  }
  
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ka.c : J
    //   3: ldc2_w 96513545247618
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #7524
    //   18: ldc2_w 5953533025228460571
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: invokevirtual p : ()Z
    //   35: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   38: sipush #9280
    //   41: ldc2_w 4474933274162735929
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: invokevirtual j : ()Z
    //   58: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   61: sipush #11733
    //   64: ldc2_w 7423097443902464683
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: invokevirtual b : ()Z
    //   81: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   84: sipush #9440
    //   87: ldc2_w 5644424368227036061
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: invokevirtual b : ()Lme/rerere/matrix/internal/aa;
    //   104: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   107: ldc ')'
    //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: areturn
  }
  
  public int hashCode() {
    long l = c ^ 0x646170BC0F26L;
    byte b = 59;
    int j = 1;
    int i = yl.r();
    try {
      if (i != 0)
        if (p()) {
        
        } else {
          j = j * 59 + 97;
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public boolean b() {
    return this.v;
  }
  
  public ka(long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, @NotNull aa paramaa) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ka.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic r : ()I
    //   9: istore #7
    //   11: aload_0
    //   12: invokespecial <init> : ()V
    //   15: iload #7
    //   17: ifeq -> 73
    //   20: aload #6
    //   22: ifnonnull -> 50
    //   25: new java/lang/NullPointerException
    //   28: dup
    //   29: sipush #15474
    //   32: ldc2_w 6897386241419185810
    //   35: lload_1
    //   36: lxor
    //   37: <illegal opcode> y : (IJ)Ljava/lang/String;
    //   42: invokespecial <init> : (Ljava/lang/String;)V
    //   45: athrow
    //   46: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   49: athrow
    //   50: aload_0
    //   51: iload_3
    //   52: putfield b : Z
    //   55: aload_0
    //   56: iload #4
    //   58: putfield i : Z
    //   61: aload_0
    //   62: iload #5
    //   64: putfield v : Z
    //   67: aload_0
    //   68: aload #6
    //   70: putfield k : Lme/rerere/matrix/internal/aa;
    //   73: return
    // Exception table:
    //   from	to	target	type
    //   20	46	46	java/lang/NullPointerException
  }
  
  public static void m(String paramString) {
    a = paramString;
  }
  
  public static String G() {
    return a;
  }
  
  static {
    long l = c ^ 0x452289853D95L;
    m("UUOlOc");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "y\016kPJË+T\033ðþ\024õýaË_m|Ùù\004\025ÚÔæ&ßËÞvF1\026¡yPc4#©ÒÝîVMäãs\016 ôÝ\037r¦Q\nó5UÇ3éY`ïH½\003ñÑ Õ·åÄFdQa\025Ç«6miièWu\001\007\nð·j_#äÉO\027õÓÎ//('ã7¯T\003@·\020\037=£Ð¡Ñ¥BHd\006·<äèaÅÌbÎ°¥ò£\007\021 ~À").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x455C;
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
        throw new RuntimeException("me/rerere/matrix/internal/ka", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ka'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */