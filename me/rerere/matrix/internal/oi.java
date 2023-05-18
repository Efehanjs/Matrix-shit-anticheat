package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class oi extends Lambda implements Function0 {
  public static final oi i;
  
  private static final long a = o3.a(8294319039168280332L, 6640533344146482498L, MethodHandles.lookup().lookupClass()).a(212847367819446L);
  
  private static final String b;
  
  @NotNull
  public final List b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/oi.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: ldc me/rerere/matrix/internal/ni
    //   8: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   11: astore #4
    //   13: nop
    //   14: iconst_0
    //   15: istore #5
    //   17: invokestatic a : ()I
    //   20: aload #4
    //   22: astore #6
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: checkcast java/util/Collection
    //   34: astore #7
    //   36: istore_3
    //   37: iconst_0
    //   38: istore #8
    //   40: iconst_0
    //   41: istore #9
    //   43: aload #6
    //   45: arraylength
    //   46: istore #10
    //   48: iload #9
    //   50: iload #10
    //   52: if_icmpge -> 123
    //   55: aload #6
    //   57: iload #9
    //   59: aaload
    //   60: astore #11
    //   62: aload #11
    //   64: astore #12
    //   66: iconst_0
    //   67: istore #13
    //   69: iload_3
    //   70: lload_1
    //   71: lconst_0
    //   72: lcmp
    //   73: ifle -> 120
    //   76: ifne -> 119
    //   79: ldc me/rerere/matrix/internal/xf
    //   81: aload #12
    //   83: invokevirtual getType : ()Ljava/lang/Class;
    //   86: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   89: ifeq -> 116
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload #7
    //   101: aload #11
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: iinc #9, 1
    //   119: iload_3
    //   120: ifeq -> 48
    //   123: aload #7
    //   125: checkcast java/util/List
    //   128: nop
    //   129: checkcast java/lang/Iterable
    //   132: astore #4
    //   134: nop
    //   135: iconst_0
    //   136: istore #5
    //   138: aload #4
    //   140: astore #6
    //   142: new java/util/ArrayList
    //   145: dup
    //   146: aload #4
    //   148: bipush #10
    //   150: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   153: invokespecial <init> : (I)V
    //   156: checkcast java/util/Collection
    //   159: astore #7
    //   161: iconst_0
    //   162: istore #8
    //   164: aload #6
    //   166: invokeinterface iterator : ()Ljava/util/Iterator;
    //   171: astore #9
    //   173: aload #9
    //   175: invokeinterface hasNext : ()Z
    //   180: ifeq -> 245
    //   183: aload #9
    //   185: invokeinterface next : ()Ljava/lang/Object;
    //   190: astore #10
    //   192: aload #7
    //   194: aload #10
    //   196: checkcast java/lang/reflect/Field
    //   199: astore #11
    //   201: iload_3
    //   202: ifne -> 247
    //   205: astore #14
    //   207: iconst_0
    //   208: istore #12
    //   210: aload #11
    //   212: iconst_1
    //   213: invokevirtual setAccessible : (Z)V
    //   216: aload #11
    //   218: aconst_null
    //   219: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   222: dup
    //   223: getstatic me/rerere/matrix/internal/oi.b : Ljava/lang/String;
    //   226: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   229: checkcast me/rerere/matrix/internal/xf
    //   232: aload #14
    //   234: swap
    //   235: invokeinterface add : (Ljava/lang/Object;)Z
    //   240: pop
    //   241: iload_3
    //   242: ifeq -> 173
    //   245: aload #7
    //   247: checkcast java/util/List
    //   250: nop
    //   251: areturn
    // Exception table:
    //   from	to	target	type
    //   69	92	95	java/lang/RuntimeException
    //   79	109	112	java/lang/RuntimeException
  }
  
  public oi() {
    super(0);
  }
  
  static {
    long l = a ^ 0x518B828062C4L;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\oi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */