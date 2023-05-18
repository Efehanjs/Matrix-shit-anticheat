package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class HttpUrl$Companion {
  private static final long a = o3.a(7139524805176652580L, -7298434420813419065L, MethodHandles.lookup().lookupClass()).a(55851697561833L);
  
  @NotNull
  public final String canonicalize$okhttp(@NotNull String paramString1, int paramInt1, int paramInt2, @NotNull String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, @Nullable Charset paramCharset) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion.a : J
    //   3: ldc2_w 85186688474088
    //   6: lxor
    //   7: lstore #10
    //   9: aload_1
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload #4
    //   17: ldc 'encodeSet'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: iconst_0
    //   23: istore #12
    //   25: iload_2
    //   26: istore #13
    //   28: iload #13
    //   30: iload_3
    //   31: if_icmpge -> 256
    //   34: aload_1
    //   35: iload #13
    //   37: invokevirtual codePointAt : (I)I
    //   40: istore #12
    //   42: iload #12
    //   44: bipush #32
    //   46: if_icmplt -> 196
    //   49: iload #12
    //   51: bipush #127
    //   53: if_icmpeq -> 196
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   62: athrow
    //   63: iload #12
    //   65: sipush #128
    //   68: if_icmplt -> 90
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: iload #8
    //   80: ifeq -> 196
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   89: athrow
    //   90: aload #4
    //   92: checkcast java/lang/CharSequence
    //   95: iload #12
    //   97: i2c
    //   98: iconst_0
    //   99: iconst_2
    //   100: aconst_null
    //   101: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
    //   104: ifne -> 196
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: iload #12
    //   116: bipush #37
    //   118: if_icmpne -> 170
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   127: athrow
    //   128: iload #5
    //   130: ifeq -> 196
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   139: athrow
    //   140: iload #6
    //   142: ifeq -> 170
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   151: athrow
    //   152: aload_0
    //   153: aload_1
    //   154: iload #13
    //   156: iload_3
    //   157: invokespecial isPercentEncoded : (Ljava/lang/String;II)Z
    //   160: ifeq -> 196
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   169: athrow
    //   170: iload #12
    //   172: bipush #43
    //   174: if_icmpne -> 243
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   183: athrow
    //   184: iload #7
    //   186: ifeq -> 243
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   195: athrow
    //   196: new me/rerere/matrix/thirdparty/okio/Buffer
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: astore #14
    //   205: aload #14
    //   207: aload_1
    //   208: iload_2
    //   209: iload #13
    //   211: invokevirtual writeUtf8 : (Ljava/lang/String;II)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   214: pop
    //   215: aload_0
    //   216: aload #14
    //   218: aload_1
    //   219: iload #13
    //   221: iload_3
    //   222: aload #4
    //   224: iload #5
    //   226: iload #6
    //   228: iload #7
    //   230: iload #8
    //   232: aload #9
    //   234: invokespecial writeCanonicalized : (Lme/rerere/matrix/thirdparty/okio/Buffer;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V
    //   237: aload #14
    //   239: invokevirtual readUtf8 : ()Ljava/lang/String;
    //   242: areturn
    //   243: iload #13
    //   245: iload #12
    //   247: invokestatic charCount : (I)I
    //   250: iadd
    //   251: istore #13
    //   253: goto -> 28
    //   256: aload_1
    //   257: iload_2
    //   258: iload_3
    //   259: invokevirtual substring : (II)Ljava/lang/String;
    //   262: dup
    //   263: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   265: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   268: areturn
    // Exception table:
    //   from	to	target	type
    //   42	56	59	java/lang/IllegalArgumentException
    //   49	71	74	java/lang/IllegalArgumentException
    //   63	83	86	java/lang/IllegalArgumentException
    //   78	107	110	java/lang/IllegalArgumentException
    //   90	121	124	java/lang/IllegalArgumentException
    //   114	133	136	java/lang/IllegalArgumentException
    //   128	145	148	java/lang/IllegalArgumentException
    //   140	163	166	java/lang/IllegalArgumentException
    //   152	177	180	java/lang/IllegalArgumentException
    //   170	189	192	java/lang/IllegalArgumentException
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"me.rerere.matrix.thirdparty.okhttp3.HttpUrl.Companion.toHttpUrl"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final HttpUrl -deprecated_get(@NotNull String paramString) {
    long l = a ^ 0xEBD3A017F32L;
    Intrinsics.checkNotNullParameter(paramString, "url");
    return get(paramString);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"me.rerere.matrix.thirdparty.okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}), level = DeprecationLevel.ERROR)
  @Nullable
  public final HttpUrl -deprecated_get(@NotNull URI paramURI) {
    long l = a ^ 0x19E0E17027E3L;
    Intrinsics.checkNotNullParameter(paramURI, "uri");
    return get(paramURI);
  }
  
  public final int defaultPort(@NotNull String paramString) {
    long l = a ^ 0x7AAB62036415L;
    Intrinsics.checkNotNullParameter(paramString, "scheme");
    String str = paramString;
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Intrinsics.areEqual(str, "http") ? 80 : (Intrinsics.areEqual(str, "https") ? 443 : -1);
  }
  
  @NotNull
  public final HttpUrl get(@NotNull String paramString) {
    long l = a ^ 0x36CCB8EE6992L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return (new HttpUrl$Builder()).parse$okhttp(null, paramString).build();
  }
  
  public final void toPathString$okhttp(@NotNull List<String> paramList, @NotNull StringBuilder paramStringBuilder) {
    long l = a ^ 0x4BABFAD9A2BCL;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramStringBuilder, "out");
    byte b = 0;
    int i = paramList.size();
    while (b < i) {
      byte b1 = b;
      b++;
      paramStringBuilder.append('/');
      paramStringBuilder.append(paramList.get(b1));
    } 
  }
  
  @NotNull
  public final List toQueryNamesAndValues$okhttp(@NotNull String paramString) {
    long l = a ^ 0x2601DE93BECBL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    ArrayList<String> arrayList = new ArrayList();
    int i;
    for (i = 0;; i = SYNTHETIC_LOCAL_VARIABLE_6 + 1) {
      int j;
      if (i <= paramString.length()) {
        j = StringsKt.indexOf$default(paramString, '&', i, false, 4, null);
        if (j == -1)
          j = paramString.length(); 
        int k = StringsKt.indexOf$default(paramString, '=', i, false, 4, null);
        try {
          if (k != -1) {
            try {
              if (k <= j) {
                Intrinsics.checkNotNullExpressionValue(paramString.substring(i, k), "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(paramString.substring(i, k));
                String str = paramString;
                int m = k + 1;
                Intrinsics.checkNotNullExpressionValue(str.substring(m, j), "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(str.substring(m, j));
                continue;
              } 
              Intrinsics.checkNotNullExpressionValue(paramString.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
              arrayList.add(paramString.substring(i, j));
              arrayList.add(null);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        break;
      } 
      Intrinsics.checkNotNullExpressionValue(paramString.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
      arrayList.add(paramString.substring(i, j));
      arrayList.add(null);
    } 
    return arrayList;
  }
  
  @Nullable
  public final HttpUrl get(@NotNull URI paramURI) {
    long l = a ^ 0x311CB3453CB6L;
    Intrinsics.checkNotNullParameter(paramURI, "<this>");
    String str = paramURI.toString();
    Intrinsics.checkNotNullExpressionValue(str, "toString()");
    return parse(str);
  }
  
  @Nullable
  public final HttpUrl get(@NotNull URL paramURL) {
    long l = a ^ 0x3F4DC8F15F5L;
    Intrinsics.checkNotNullParameter(paramURL, "<this>");
    String str = paramURL.toString();
    Intrinsics.checkNotNullExpressionValue(str, "toString()");
    return parse(str);
  }
  
  @NotNull
  public final String percentDecode$okhttp(@NotNull String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = a ^ 0x1536676322AL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = paramInt1;
    while (i < paramInt2) {
      int j = i;
      i++;
      char c = paramString.charAt(j);
      try {
        if (c == '%' || (c == '+' && paramBoolean)) {
          Buffer buffer = new Buffer();
          buffer.writeUtf8(paramString, paramInt1, j);
          writePercentDecoded(buffer, paramString, j, paramInt2, paramBoolean);
          return buffer.readUtf8();
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    Intrinsics.checkNotNullExpressionValue(paramString.substring(paramInt1, paramInt2), "this as java.lang.String…ing(startIndex, endIndex)");
    return paramString.substring(paramInt1, paramInt2);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"me.rerere.matrix.thirdparty.okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}), level = DeprecationLevel.ERROR)
  @Nullable
  public final HttpUrl -deprecated_parse(@NotNull String paramString) {
    long l = a ^ 0x23336400FBBEL;
    Intrinsics.checkNotNullParameter(paramString, "url");
    return parse(paramString);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"me.rerere.matrix.thirdparty.okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}), level = DeprecationLevel.ERROR)
  @Nullable
  public final HttpUrl -deprecated_get(@NotNull URL paramURL) {
    long l = a ^ 0x4FF323CEB388L;
    Intrinsics.checkNotNullParameter(paramURL, "url");
    return get(paramURL);
  }
  
  public final void toQueryString$okhttp(@NotNull List paramList, @NotNull StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion.a : J
    //   3: ldc2_w 12831168487026
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_2
    //   15: ldc 'out'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: aload_1
    //   22: invokeinterface size : ()I
    //   27: invokestatic until : (II)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntRange;
    //   30: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   33: iconst_2
    //   34: invokestatic step : (Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;I)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;
    //   37: astore #5
    //   39: aload #5
    //   41: invokevirtual getFirst : ()I
    //   44: istore #6
    //   46: aload #5
    //   48: invokevirtual getLast : ()I
    //   51: istore #7
    //   53: aload #5
    //   55: invokevirtual getStep : ()I
    //   58: istore #8
    //   60: iload #8
    //   62: ifle -> 79
    //   65: iload #6
    //   67: iload #7
    //   69: if_icmple -> 105
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   78: athrow
    //   79: iload #8
    //   81: ifge -> 196
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: iload #7
    //   93: iload #6
    //   95: if_icmpgt -> 196
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: iload #6
    //   107: istore #9
    //   109: iload #6
    //   111: iload #8
    //   113: iadd
    //   114: istore #6
    //   116: aload_1
    //   117: iload #9
    //   119: invokeinterface get : (I)Ljava/lang/Object;
    //   124: checkcast java/lang/String
    //   127: astore #10
    //   129: aload_1
    //   130: iload #9
    //   132: iconst_1
    //   133: iadd
    //   134: invokeinterface get : (I)Ljava/lang/Object;
    //   139: checkcast java/lang/String
    //   142: astore #11
    //   144: iload #9
    //   146: ifle -> 156
    //   149: aload_2
    //   150: bipush #38
    //   152: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload_2
    //   157: aload #10
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload #11
    //   165: ifnull -> 189
    //   168: aload_2
    //   169: bipush #61
    //   171: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_2
    //   176: aload #11
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   188: athrow
    //   189: iload #9
    //   191: iload #7
    //   193: if_icmpne -> 105
    //   196: return
    // Exception table:
    //   from	to	target	type
    //   60	72	75	java/lang/IllegalArgumentException
    //   65	84	87	java/lang/IllegalArgumentException
    //   79	98	101	java/lang/IllegalArgumentException
    //   156	182	185	java/lang/IllegalArgumentException
  }
  
  @Nullable
  public final HttpUrl parse(@NotNull String paramString) {
    HttpUrl httpUrl;
    long l = a ^ 0x8F4D4F6AC4AL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    try {
      httpUrl = get(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      httpUrl = (HttpUrl)null;
    } 
    return httpUrl;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\HttpUrl$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */