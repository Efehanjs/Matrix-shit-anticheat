package me.rerere.matrix.thirdparty.okhttp3.internal;

import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class HostnamesKt {
  private static final long a = o3.a(-4421129039485873383L, 483721995185759425L, MethodHandles.lookup().lookupClass()).a(117471564565800L);
  
  @Nullable
  public static final String toCanonicalHost(@NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/HostnamesKt.a : J
    //   3: ldc2_w 81595171560436
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: astore_3
    //   16: aload_3
    //   17: checkcast java/lang/CharSequence
    //   20: ldc ':'
    //   22: checkcast java/lang/CharSequence
    //   25: iconst_0
    //   26: iconst_2
    //   27: aconst_null
    //   28: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   31: ifeq -> 197
    //   34: aload_3
    //   35: ldc '['
    //   37: iconst_0
    //   38: iconst_2
    //   39: aconst_null
    //   40: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   43: ifeq -> 90
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   52: athrow
    //   53: aload_3
    //   54: ldc ']'
    //   56: iconst_0
    //   57: iconst_2
    //   58: aconst_null
    //   59: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   62: ifeq -> 90
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   71: athrow
    //   72: aload_3
    //   73: iconst_1
    //   74: aload_3
    //   75: invokevirtual length : ()I
    //   78: iconst_1
    //   79: isub
    //   80: invokestatic decodeIpv6 : (Ljava/lang/String;II)Ljava/net/InetAddress;
    //   83: goto -> 99
    //   86: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   89: athrow
    //   90: aload_3
    //   91: iconst_0
    //   92: aload_3
    //   93: invokevirtual length : ()I
    //   96: invokestatic decodeIpv6 : (Ljava/lang/String;II)Ljava/net/InetAddress;
    //   99: astore #5
    //   101: aload #5
    //   103: ifnonnull -> 112
    //   106: aconst_null
    //   107: areturn
    //   108: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   111: athrow
    //   112: aload #5
    //   114: astore #4
    //   116: aload #4
    //   118: invokevirtual getAddress : ()[B
    //   121: astore #5
    //   123: aload #5
    //   125: arraylength
    //   126: bipush #16
    //   128: if_icmpne -> 148
    //   131: aload #5
    //   133: ldc 'address'
    //   135: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   138: aload #5
    //   140: invokestatic inet6AddressToAscii : ([B)Ljava/lang/String;
    //   143: areturn
    //   144: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   147: athrow
    //   148: aload #5
    //   150: arraylength
    //   151: iconst_4
    //   152: if_icmpne -> 165
    //   155: aload #4
    //   157: invokevirtual getHostAddress : ()Ljava/lang/String;
    //   160: areturn
    //   161: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   164: athrow
    //   165: new java/lang/AssertionError
    //   168: dup
    //   169: new java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: ldc 'Invalid IPv6 address: ''
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: aload_3
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: bipush #39
    //   187: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   190: invokevirtual toString : ()Ljava/lang/String;
    //   193: invokespecial <init> : (Ljava/lang/Object;)V
    //   196: athrow
    //   197: nop
    //   198: aload_3
    //   199: invokestatic toASCII : (Ljava/lang/String;)Ljava/lang/String;
    //   202: astore #5
    //   204: aload #5
    //   206: ldc 'toASCII(host)'
    //   208: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   211: aload #5
    //   213: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   216: astore #6
    //   218: aload #6
    //   220: ldc 'US'
    //   222: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   225: aload #6
    //   227: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   230: dup
    //   231: ldc 'this as java.lang.String).toLowerCase(locale)'
    //   233: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   236: astore #4
    //   238: aload #4
    //   240: checkcast java/lang/CharSequence
    //   243: invokeinterface length : ()I
    //   248: ifne -> 259
    //   251: iconst_1
    //   252: goto -> 260
    //   255: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   258: athrow
    //   259: iconst_0
    //   260: ifeq -> 269
    //   263: aconst_null
    //   264: areturn
    //   265: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   268: athrow
    //   269: aload #4
    //   271: invokestatic containsInvalidHostnameAsciiCodes : (Ljava/lang/String;)Z
    //   274: ifeq -> 288
    //   277: aconst_null
    //   278: checkcast java/lang/String
    //   281: goto -> 290
    //   284: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   287: athrow
    //   288: aload #4
    //   290: areturn
    //   291: astore #4
    //   293: aconst_null
    //   294: areturn
    // Exception table:
    //   from	to	target	type
    //   16	46	49	java/lang/IllegalArgumentException
    //   34	65	68	java/lang/IllegalArgumentException
    //   53	86	86	java/lang/IllegalArgumentException
    //   101	108	108	java/lang/IllegalArgumentException
    //   123	144	144	java/lang/IllegalArgumentException
    //   148	161	161	java/lang/IllegalArgumentException
    //   197	291	291	java/lang/IllegalArgumentException
    //   238	255	255	java/lang/IllegalArgumentException
    //   260	265	265	java/lang/IllegalArgumentException
    //   269	284	284	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\HostnamesKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */