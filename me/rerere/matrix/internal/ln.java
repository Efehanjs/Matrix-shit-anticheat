package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ln {
  @NotNull
  public static final ln i;
  
  private static final long a = o3.a(7654027951907925554L, 3469964628942709054L, MethodHandles.lookup().lookupClass()).a(106490765990708L);
  
  private static final String b;
  
  @NotNull
  public static final Set b(long paramLong, @NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ln.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: new java/util/HashSet
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: checkcast java/util/Set
    //   16: astore #4
    //   18: invokestatic r : ()I
    //   21: iconst_0
    //   22: istore #5
    //   24: aload_2
    //   25: arraylength
    //   26: iconst_1
    //   27: isub
    //   28: istore #6
    //   30: istore_3
    //   31: iload #5
    //   33: iload #6
    //   35: if_icmpge -> 269
    //   38: aload_2
    //   39: iload #5
    //   41: aaload
    //   42: ldc '-'
    //   44: iconst_0
    //   45: iconst_2
    //   46: aconst_null
    //   47: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   50: iload_3
    //   51: lload_0
    //   52: lconst_0
    //   53: lcmp
    //   54: ifle -> 102
    //   57: ifeq -> 95
    //   60: ifeq -> 262
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: aload_2
    //   71: iload #5
    //   73: aaload
    //   74: iload_3
    //   75: ifeq -> 127
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: invokevirtual length : ()I
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: lload_0
    //   96: lconst_0
    //   97: lcmp
    //   98: ifle -> 266
    //   101: iconst_1
    //   102: if_icmple -> 262
    //   105: aload_2
    //   106: iload #5
    //   108: aaload
    //   109: iconst_1
    //   110: invokevirtual substring : (I)Ljava/lang/String;
    //   113: dup
    //   114: getstatic me/rerere/matrix/internal/ln.b : Ljava/lang/String;
    //   117: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: astore #7
    //   129: new java/util/ArrayList
    //   132: dup
    //   133: invokespecial <init> : ()V
    //   136: checkcast java/util/List
    //   139: astore #8
    //   141: iload #5
    //   143: iconst_1
    //   144: iadd
    //   145: istore #9
    //   147: aload_2
    //   148: arraylength
    //   149: istore #10
    //   151: iload #9
    //   153: iload #10
    //   155: if_icmpge -> 226
    //   158: aload_2
    //   159: iload #9
    //   161: aaload
    //   162: ldc '-'
    //   164: iconst_0
    //   165: iconst_2
    //   166: aconst_null
    //   167: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   170: iload_3
    //   171: lload_0
    //   172: lconst_0
    //   173: lcmp
    //   174: iflt -> 181
    //   177: ifeq -> 261
    //   180: iload_3
    //   181: ifeq -> 218
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   190: athrow
    //   191: ifeq -> 207
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: lload_0
    //   202: lconst_0
    //   203: lcmp
    //   204: ifgt -> 226
    //   207: aload #8
    //   209: aload_2
    //   210: iload #9
    //   212: aaload
    //   213: invokeinterface add : (Ljava/lang/Object;)Z
    //   218: pop
    //   219: iinc #9, 1
    //   222: iload_3
    //   223: ifne -> 151
    //   226: aload #4
    //   228: lload_0
    //   229: lconst_0
    //   230: lcmp
    //   231: iflt -> 277
    //   234: new me/rerere/matrix/internal/cd
    //   237: dup
    //   238: aload #7
    //   240: ldc ' '
    //   242: checkcast java/lang/CharSequence
    //   245: aload #8
    //   247: checkcast java/lang/Iterable
    //   250: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   253: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   256: invokeinterface add : (Ljava/lang/Object;)Z
    //   261: pop
    //   262: iinc #5, 1
    //   265: iload_3
    //   266: ifne -> 31
    //   269: lload_0
    //   270: lconst_0
    //   271: lcmp
    //   272: iflt -> 265
    //   275: aload #4
    //   277: areturn
    // Exception table:
    //   from	to	target	type
    //   38	63	66	java/lang/RuntimeException
    //   60	78	81	java/lang/RuntimeException
    //   70	88	91	java/lang/RuntimeException
    //   95	120	123	java/lang/RuntimeException
    //   158	184	187	java/lang/RuntimeException
    //   180	194	197	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x297AEE4F53C9L;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ln.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */