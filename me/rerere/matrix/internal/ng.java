package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;

public class ng {
  private final double v;
  
  private final boolean b;
  
  @NotNull
  private final Location i;
  
  private static final long a = o3.a(2611991276990340874L, -3696518826208071874L, MethodHandles.lookup().lookupClass()).a(213827267576981L);
  
  private static final String c;
  
  public boolean b(Object paramObject) {
    return paramObject instanceof ng;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public ng(long paramLong, boolean paramBoolean, double paramDouble, @NotNull Location paramLocation) {
    if (i == 0) {
      try {
        if (paramLocation == null)
          throw new NullPointerException(c); 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      this.b = paramBoolean;
      this.v = paramDouble;
      this.i = paramLocation;
    } 
  }
  
  public double b() {
    return this.v;
  }
  
  @NotNull
  public Location b() {
    return this.i;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ng.a : J
    //   3: ldc2_w 78058036961572
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifeq -> 37
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
    //   39: ifeq -> 62
    //   42: instanceof me/rerere/matrix/internal/ng
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/ng
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifeq -> 98
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual b : ()Z
    //   98: iload #4
    //   100: ifeq -> 148
    //   103: aload #5
    //   105: invokevirtual b : ()Z
    //   108: if_icmpeq -> 124
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   117: athrow
    //   118: iconst_0
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   123: athrow
    //   124: aload_0
    //   125: iload #4
    //   127: ifeq -> 158
    //   130: invokevirtual b : ()D
    //   133: aload #5
    //   135: invokevirtual b : ()D
    //   138: invokestatic compare : (DD)I
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   147: athrow
    //   148: ifeq -> 157
    //   151: iconst_0
    //   152: ireturn
    //   153: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   156: athrow
    //   157: aload_0
    //   158: invokevirtual b : ()Lorg/bukkit/Location;
    //   161: astore #6
    //   163: aload #5
    //   165: invokevirtual b : ()Lorg/bukkit/Location;
    //   168: astore #7
    //   170: aload #6
    //   172: iload #4
    //   174: ifeq -> 208
    //   177: ifnonnull -> 206
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   186: athrow
    //   187: aload #7
    //   189: ifnull -> 234
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   198: athrow
    //   199: goto -> 228
    //   202: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   205: athrow
    //   206: aload #6
    //   208: aload #7
    //   210: invokevirtual equals : (Ljava/lang/Object;)Z
    //   213: iload #4
    //   215: ifeq -> 235
    //   218: ifne -> 234
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   227: athrow
    //   228: iconst_0
    //   229: ireturn
    //   230: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   233: athrow
    //   234: iconst_1
    //   235: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/NullPointerException
    //   19	32	32	java/lang/NullPointerException
    //   37	48	51	java/lang/NullPointerException
    //   42	57	57	java/lang/NullPointerException
    //   67	81	84	java/lang/NullPointerException
    //   78	90	90	java/lang/NullPointerException
    //   98	111	114	java/lang/NullPointerException
    //   103	120	120	java/lang/NullPointerException
    //   124	141	144	java/lang/NullPointerException
    //   148	153	153	java/lang/NullPointerException
    //   170	180	183	java/lang/NullPointerException
    //   177	192	195	java/lang/NullPointerException
    //   187	202	202	java/lang/NullPointerException
    //   208	221	224	java/lang/NullPointerException
    //   218	230	230	java/lang/NullPointerException
  }
  
  public int hashCode() {
    long l = a ^ 0x547998836852L;
    byte b = 59;
    int j = 1;
    int i = yl.r();
    try {
      if (i != 0)
        if (b()) {
        
        } else {
          j = j * 59 + 97;
          long l1 = Double.doubleToLongBits(b());
          j = j * 59 + (int)(l1 >>> 32L ^ l1);
          Location location = b();
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x470E2876B4E2L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ng.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */