package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StatusLine$Companion {
  private static final long a = o3.a(5193506968516785614L, 735001613666688704L, MethodHandles.lookup().lookupClass()).a(18084557614297L);
  
  @NotNull
  public final StatusLine parse(@NotNull String paramString) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http/StatusLine$Companion.a : J
    //   3: ldc2_w 85706699351999
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'statusLine'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #4
    //   17: aconst_null
    //   18: astore #5
    //   20: aload_1
    //   21: ldc 'HTTP/1.'
    //   23: iconst_0
    //   24: iconst_2
    //   25: aconst_null
    //   26: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   29: ifeq -> 159
    //   32: aload_1
    //   33: invokevirtual length : ()I
    //   36: bipush #9
    //   38: if_icmplt -> 66
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   47: athrow
    //   48: aload_1
    //   49: bipush #8
    //   51: invokevirtual charAt : (I)C
    //   54: bipush #32
    //   56: if_icmpeq -> 84
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   65: athrow
    //   66: new java/net/ProtocolException
    //   69: dup
    //   70: ldc 'Unexpected status line: '
    //   72: aload_1
    //   73: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: athrow
    //   80: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   83: athrow
    //   84: aload_1
    //   85: bipush #7
    //   87: invokevirtual charAt : (I)C
    //   90: bipush #48
    //   92: isub
    //   93: istore #6
    //   95: bipush #9
    //   97: istore #4
    //   99: iload #6
    //   101: tableswitch default -> 140, 0 -> 124, 1 -> 134
    //   124: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.HTTP_1_0 : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   127: goto -> 154
    //   130: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   133: athrow
    //   134: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.HTTP_1_1 : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   137: goto -> 154
    //   140: new java/net/ProtocolException
    //   143: dup
    //   144: ldc 'Unexpected status line: '
    //   146: aload_1
    //   147: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   150: invokespecial <init> : (Ljava/lang/String;)V
    //   153: athrow
    //   154: astore #5
    //   156: goto -> 196
    //   159: aload_1
    //   160: ldc 'ICY '
    //   162: iconst_0
    //   163: iconst_2
    //   164: aconst_null
    //   165: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   168: ifeq -> 182
    //   171: getstatic me/rerere/matrix/thirdparty/okhttp3/Protocol.HTTP_1_0 : Lme/rerere/matrix/thirdparty/okhttp3/Protocol;
    //   174: astore #5
    //   176: iconst_4
    //   177: istore #4
    //   179: goto -> 196
    //   182: new java/net/ProtocolException
    //   185: dup
    //   186: ldc 'Unexpected status line: '
    //   188: aload_1
    //   189: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokespecial <init> : (Ljava/lang/String;)V
    //   195: athrow
    //   196: aload_1
    //   197: invokevirtual length : ()I
    //   200: iload #4
    //   202: iconst_3
    //   203: iadd
    //   204: if_icmpge -> 225
    //   207: new java/net/ProtocolException
    //   210: dup
    //   211: ldc 'Unexpected status line: '
    //   213: aload_1
    //   214: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   217: invokespecial <init> : (Ljava/lang/String;)V
    //   220: athrow
    //   221: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   224: athrow
    //   225: nop
    //   226: aload_1
    //   227: astore #7
    //   229: iload #4
    //   231: iconst_3
    //   232: iadd
    //   233: istore #8
    //   235: aload #7
    //   237: iload #4
    //   239: iload #8
    //   241: invokevirtual substring : (II)Ljava/lang/String;
    //   244: dup
    //   245: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   247: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   250: invokestatic parseInt : (Ljava/lang/String;)I
    //   253: istore #7
    //   255: goto -> 274
    //   258: astore #8
    //   260: new java/net/ProtocolException
    //   263: dup
    //   264: ldc 'Unexpected status line: '
    //   266: aload_1
    //   267: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   270: invokespecial <init> : (Ljava/lang/String;)V
    //   273: athrow
    //   274: iload #7
    //   276: istore #6
    //   278: ldc ''
    //   280: astore #7
    //   282: aload_1
    //   283: invokevirtual length : ()I
    //   286: iload #4
    //   288: iconst_3
    //   289: iadd
    //   290: if_icmple -> 355
    //   293: aload_1
    //   294: iload #4
    //   296: iconst_3
    //   297: iadd
    //   298: invokevirtual charAt : (I)C
    //   301: bipush #32
    //   303: if_icmpeq -> 331
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   312: athrow
    //   313: new java/net/ProtocolException
    //   316: dup
    //   317: ldc 'Unexpected status line: '
    //   319: aload_1
    //   320: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   323: invokespecial <init> : (Ljava/lang/String;)V
    //   326: athrow
    //   327: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   330: athrow
    //   331: aload_1
    //   332: astore #8
    //   334: iload #4
    //   336: iconst_4
    //   337: iadd
    //   338: istore #9
    //   340: aload #8
    //   342: iload #9
    //   344: invokevirtual substring : (I)Ljava/lang/String;
    //   347: dup
    //   348: ldc 'this as java.lang.String).substring(startIndex)'
    //   350: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   353: astore #7
    //   355: new me/rerere/matrix/thirdparty/okhttp3/internal/http/StatusLine
    //   358: dup
    //   359: aload #5
    //   361: iload #6
    //   363: aload #7
    //   365: invokespecial <init> : (Lme/rerere/matrix/thirdparty/okhttp3/Protocol;ILjava/lang/String;)V
    //   368: areturn
    // Exception table:
    //   from	to	target	type
    //   20	41	44	java/lang/NumberFormatException
    //   32	59	62	java/lang/NumberFormatException
    //   48	80	80	java/lang/NumberFormatException
    //   99	130	130	java/lang/NumberFormatException
    //   196	221	221	java/lang/NumberFormatException
    //   225	255	258	java/lang/NumberFormatException
    //   282	306	309	java/lang/NumberFormatException
    //   293	327	327	java/lang/NumberFormatException
  }
  
  @NotNull
  public final StatusLine get(@NotNull Response paramResponse) {
    long l = a ^ 0x642B22F0537CL;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    return new StatusLine(paramResponse.protocol(), paramResponse.code(), paramResponse.message());
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\StatusLine$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */