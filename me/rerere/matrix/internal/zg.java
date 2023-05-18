package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@Deprecated(message = "Use New VL System")
public final class zg {
  @NotNull
  private final yk v;
  
  private int b;
  
  @NotNull
  private final UUID i;
  
  private static yk[] a;
  
  private static final long c = o3.a(-34031700054742561L, -8708486870801690431L, MethodHandles.lookup().lookupClass()).a(179346410896303L);
  
  private static final String d;
  
  @NotNull
  public final yk b() {
    return this.v;
  }
  
  public int hashCode() {
    null = this.i.hashCode();
    return 31 * null + this.v.hashCode();
  }
  
  @NotNull
  public final UUID b() {
    return this.i;
  }
  
  public final void p(long paramLong, int paramInt) {
    paramLong = c ^ paramLong;
    int i = yl.r();
    try {
      this.b -= paramInt;
      if (i != 0)
        try {
          if (this.b < 0) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = 0;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/zg.c : J
    //   3: ldc2_w 43696890063018
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifne -> 37
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
    //   42: ifne -> 80
    //   45: aload_1
    //   46: dup
    //   47: ifnull -> 72
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: invokevirtual getClass : ()Ljava/lang/Class;
    //   60: iload #4
    //   62: ifeq -> 81
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
    //   86: ifne -> 143
    //   89: ifne -> 105
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: iconst_0
    //   100: ireturn
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_1
    //   106: getstatic me/rerere/matrix/internal/zg.d : Ljava/lang/String;
    //   109: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   112: aload_1
    //   113: checkcast me/rerere/matrix/internal/zg
    //   116: pop
    //   117: aload_0
    //   118: iload #4
    //   120: ifne -> 153
    //   123: getfield i : Ljava/util/UUID;
    //   126: aload_1
    //   127: checkcast me/rerere/matrix/internal/zg
    //   130: getfield i : Ljava/util/UUID;
    //   133: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   142: athrow
    //   143: ifne -> 152
    //   146: iconst_0
    //   147: ireturn
    //   148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: aload_0
    //   153: getfield v : Lme/rerere/matrix/internal/yk;
    //   156: aload_1
    //   157: checkcast me/rerere/matrix/internal/zg
    //   160: getfield v : Lme/rerere/matrix/internal/yk;
    //   163: if_acmpeq -> 172
    //   166: iconst_0
    //   167: ireturn
    //   168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: iconst_1
    //   173: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	50	53	java/lang/RuntimeException
    //   45	65	68	java/lang/RuntimeException
    //   57	73	76	java/lang/RuntimeException
    //   81	92	95	java/lang/RuntimeException
    //   89	101	101	java/lang/RuntimeException
    //   105	136	139	java/lang/RuntimeException
    //   143	148	148	java/lang/RuntimeException
    //   153	168	168	java/lang/RuntimeException
  }
  
  public zg(@NotNull UUID paramUUID, @NotNull yk paramyk) {
    this.i = paramUUID;
    this.v = paramyk;
  }
  
  public final int b() {
    return this.b;
  }
  
  public final void j(int paramInt) {
    this.b = paramInt;
  }
  
  public final void b(long paramLong, int paramInt) {
    paramLong = c ^ paramLong;
    int i = yl.a();
    try {
      this.b += paramInt;
      if (i == 0)
        try {
          if (this.b < 0) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = 0;
  }
  
  public final void b() {
    this.b = 0;
  }
  
  public static void S(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] K() {
    return a;
  }
  
  static {
    long l = c ^ 0x1095BAD2E8CEL;
    S(null);
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */