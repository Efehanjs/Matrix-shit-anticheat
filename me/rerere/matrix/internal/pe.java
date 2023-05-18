package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class pe {
  private final int z;
  
  private final long k;
  
  private final int v;
  
  private final int b;
  
  @NotNull
  private final String i;
  
  private static String[] a;
  
  private static final long c = o3.a(7006510687648303150L, -669322152664382582L, MethodHandles.lookup().lookupClass()).a(159083797268730L);
  
  private static final String d;
  
  public final long b() {
    return this.k;
  }
  
  public final int p() {
    return this.z;
  }
  
  public pe(@NotNull String paramString, int paramInt1, int paramInt2, int paramInt3) {
    this.i = paramString;
    this.z = paramInt1;
    this.b = paramInt2;
    this.v = paramInt3;
    this.k = pc.j();
  }
  
  public final int j() {
    return this.v;
  }
  
  public int hashCode() {
    null = this.i.hashCode();
    null = 31 * null + this.z;
    null = 31 * null + this.b;
    return 31 * null + this.v;
  }
  
  public final int b() {
    return this.b;
  }
  
  @NotNull
  public final String b() {
    return this.i;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pe.c : J
    //   3: ldc2_w 47609985775721
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_1
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual getClass : ()Ljava/lang/Class;
    //   40: iload #4
    //   42: ifeq -> 80
    //   45: aload_1
    //   46: dup
    //   47: ifnull -> 72
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: invokevirtual getClass : ()Ljava/lang/Class;
    //   60: iload #4
    //   62: ifne -> 81
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: pop
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aconst_null
    //   81: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   84: iload #4
    //   86: ifeq -> 131
    //   89: ifne -> 105
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: iconst_0
    //   100: ireturn
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_1
    //   106: getstatic me/rerere/matrix/internal/pe.d : Ljava/lang/String;
    //   109: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   112: aload_1
    //   113: checkcast me/rerere/matrix/internal/pe
    //   116: pop
    //   117: aload_0
    //   118: getfield i : Ljava/lang/String;
    //   121: aload_1
    //   122: checkcast me/rerere/matrix/internal/pe
    //   125: getfield i : Ljava/lang/String;
    //   128: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   131: iload #4
    //   133: ifeq -> 156
    //   136: ifne -> 152
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: iconst_0
    //   147: ireturn
    //   148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: aload_0
    //   153: getfield z : I
    //   156: aload_1
    //   157: checkcast me/rerere/matrix/internal/pe
    //   160: getfield z : I
    //   163: iload #4
    //   165: ifeq -> 195
    //   168: if_icmpeq -> 184
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: iconst_0
    //   179: ireturn
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_0
    //   185: getfield b : I
    //   188: aload_1
    //   189: checkcast me/rerere/matrix/internal/pe
    //   192: getfield b : I
    //   195: iload #4
    //   197: ifeq -> 239
    //   200: if_icmpeq -> 216
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   209: athrow
    //   210: iconst_0
    //   211: ireturn
    //   212: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   215: athrow
    //   216: aload_0
    //   217: getfield v : I
    //   220: iload #4
    //   222: ifeq -> 249
    //   225: aload_1
    //   226: checkcast me/rerere/matrix/internal/pe
    //   229: getfield v : I
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: if_icmpeq -> 248
    //   242: iconst_0
    //   243: ireturn
    //   244: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   247: athrow
    //   248: iconst_1
    //   249: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	50	53	java/lang/RuntimeException
    //   45	65	68	java/lang/RuntimeException
    //   57	73	76	java/lang/RuntimeException
    //   81	92	95	java/lang/RuntimeException
    //   89	101	101	java/lang/RuntimeException
    //   131	139	142	java/lang/RuntimeException
    //   136	148	148	java/lang/RuntimeException
    //   156	171	174	java/lang/RuntimeException
    //   168	180	180	java/lang/RuntimeException
    //   195	203	206	java/lang/RuntimeException
    //   200	212	212	java/lang/RuntimeException
    //   216	232	235	java/lang/RuntimeException
    //   239	244	244	java/lang/RuntimeException
  }
  
  public static void r(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] Z() {
    return a;
  }
  
  static {
    long l = c ^ 0xC493B19EECFL;
    r(new String[2]);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */