package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.internal.ProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.HostnamesKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class HttpUrl$Builder {
  @NotNull
  private String encodedUsername = "";
  
  @Nullable
  private String host;
  
  @NotNull
  public static final HttpUrl$Builder$Companion Companion;
  
  @NotNull
  private String encodedPassword = "";
  
  @NotNull
  private final List encodedPathSegments = new ArrayList();
  
  @Nullable
  private List encodedQueryNamesAndValues;
  
  @Nullable
  private String scheme;
  
  private int port = -1;
  
  @NotNull
  public static final String INVALID_HOST = "Invalid URL host";
  
  @Nullable
  private String encodedFragment;
  
  private static final long a = o3.a(1994236101371679028L, 4651154754275951567L, MethodHandles.lookup().lookupClass()).a(105569019305751L);
  
  public HttpUrl$Builder() {
    this.encodedPathSegments.add("");
  }
  
  @Nullable
  public final String getEncodedFragment$okhttp() {
    return this.encodedFragment;
  }
  
  @NotNull
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.a : J
    //   3: ldc2_w 137040542795775
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_3
    //   16: aload_3
    //   17: astore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: aload_0
    //   23: invokevirtual getScheme$okhttp : ()Ljava/lang/String;
    //   26: ifnull -> 54
    //   29: aload #4
    //   31: aload_0
    //   32: invokevirtual getScheme$okhttp : ()Ljava/lang/String;
    //   35: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload #4
    //   41: ldc '://'
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: goto -> 62
    //   50: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   53: athrow
    //   54: aload #4
    //   56: ldc '//'
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_0
    //   63: invokevirtual getEncodedUsername$okhttp : ()Ljava/lang/String;
    //   66: checkcast java/lang/CharSequence
    //   69: invokeinterface length : ()I
    //   74: ifle -> 85
    //   77: iconst_1
    //   78: goto -> 86
    //   81: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   84: athrow
    //   85: iconst_0
    //   86: ifne -> 123
    //   89: aload_0
    //   90: invokevirtual getEncodedPassword$okhttp : ()Ljava/lang/String;
    //   93: checkcast java/lang/CharSequence
    //   96: invokeinterface length : ()I
    //   101: ifle -> 119
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   110: athrow
    //   111: iconst_1
    //   112: goto -> 120
    //   115: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   118: athrow
    //   119: iconst_0
    //   120: ifeq -> 200
    //   123: aload #4
    //   125: aload_0
    //   126: invokevirtual getEncodedUsername$okhttp : ()Ljava/lang/String;
    //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_0
    //   134: invokevirtual getEncodedPassword$okhttp : ()Ljava/lang/String;
    //   137: checkcast java/lang/CharSequence
    //   140: invokeinterface length : ()I
    //   145: ifle -> 163
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   154: athrow
    //   155: iconst_1
    //   156: goto -> 164
    //   159: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   162: athrow
    //   163: iconst_0
    //   164: ifeq -> 192
    //   167: aload #4
    //   169: bipush #58
    //   171: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #4
    //   177: aload_0
    //   178: invokevirtual getEncodedPassword$okhttp : ()Ljava/lang/String;
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   191: athrow
    //   192: aload #4
    //   194: bipush #64
    //   196: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload_0
    //   201: invokevirtual getHost$okhttp : ()Ljava/lang/String;
    //   204: ifnull -> 279
    //   207: aload_0
    //   208: invokevirtual getHost$okhttp : ()Ljava/lang/String;
    //   211: dup
    //   212: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   215: checkcast java/lang/CharSequence
    //   218: bipush #58
    //   220: iconst_0
    //   221: iconst_2
    //   222: aconst_null
    //   223: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
    //   226: ifeq -> 269
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   235: athrow
    //   236: aload #4
    //   238: bipush #91
    //   240: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   243: pop
    //   244: aload #4
    //   246: aload_0
    //   247: invokevirtual getHost$okhttp : ()Ljava/lang/String;
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload #4
    //   256: bipush #93
    //   258: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: goto -> 279
    //   265: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   268: athrow
    //   269: aload #4
    //   271: aload_0
    //   272: invokevirtual getHost$okhttp : ()Ljava/lang/String;
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: aload_0
    //   280: invokevirtual getPort$okhttp : ()I
    //   283: iconst_m1
    //   284: if_icmpne -> 301
    //   287: aload_0
    //   288: invokevirtual getScheme$okhttp : ()Ljava/lang/String;
    //   291: ifnull -> 363
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   300: athrow
    //   301: aload_0
    //   302: invokespecial effectivePort : ()I
    //   305: istore #6
    //   307: aload_0
    //   308: invokevirtual getScheme$okhttp : ()Ljava/lang/String;
    //   311: ifnull -> 340
    //   314: iload #6
    //   316: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   319: aload_0
    //   320: invokevirtual getScheme$okhttp : ()Ljava/lang/String;
    //   323: dup
    //   324: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   327: invokevirtual defaultPort : (Ljava/lang/String;)I
    //   330: if_icmpeq -> 363
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   339: athrow
    //   340: aload #4
    //   342: bipush #58
    //   344: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: aload #4
    //   350: iload #6
    //   352: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   362: athrow
    //   363: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   366: aload_0
    //   367: invokevirtual getEncodedPathSegments$okhttp : ()Ljava/util/List;
    //   370: aload #4
    //   372: invokevirtual toPathString$okhttp : (Ljava/util/List;Ljava/lang/StringBuilder;)V
    //   375: aload_0
    //   376: invokevirtual getEncodedQueryNamesAndValues$okhttp : ()Ljava/util/List;
    //   379: ifnull -> 413
    //   382: aload #4
    //   384: bipush #63
    //   386: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   393: aload_0
    //   394: invokevirtual getEncodedQueryNamesAndValues$okhttp : ()Ljava/util/List;
    //   397: dup
    //   398: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   401: aload #4
    //   403: invokevirtual toQueryString$okhttp : (Ljava/util/List;Ljava/lang/StringBuilder;)V
    //   406: goto -> 413
    //   409: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   412: athrow
    //   413: aload_0
    //   414: invokevirtual getEncodedFragment$okhttp : ()Ljava/lang/String;
    //   417: ifnull -> 445
    //   420: aload #4
    //   422: bipush #35
    //   424: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   427: pop
    //   428: aload #4
    //   430: aload_0
    //   431: invokevirtual getEncodedFragment$okhttp : ()Ljava/lang/String;
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: pop
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   444: athrow
    //   445: nop
    //   446: aload_3
    //   447: invokevirtual toString : ()Ljava/lang/String;
    //   450: dup
    //   451: ldc 'StringBuilder().apply(builderAction).toString()'
    //   453: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   456: areturn
    // Exception table:
    //   from	to	target	type
    //   22	50	50	java/lang/IllegalArgumentException
    //   62	81	81	java/lang/IllegalArgumentException
    //   86	104	107	java/lang/IllegalArgumentException
    //   89	115	115	java/lang/IllegalArgumentException
    //   120	148	151	java/lang/IllegalArgumentException
    //   123	159	159	java/lang/IllegalArgumentException
    //   164	185	188	java/lang/IllegalArgumentException
    //   200	229	232	java/lang/IllegalArgumentException
    //   207	265	265	java/lang/IllegalArgumentException
    //   279	294	297	java/lang/IllegalArgumentException
    //   307	333	336	java/lang/IllegalArgumentException
    //   314	356	359	java/lang/IllegalArgumentException
    //   363	406	409	java/lang/IllegalArgumentException
    //   413	438	441	java/lang/IllegalArgumentException
  }
  
  public final void setEncodedPassword$okhttp(@NotNull String paramString) {
    long l = a ^ 0x4A4619FC855AL;
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    this.encodedPassword = paramString;
  }
  
  @NotNull
  public final HttpUrl$Builder addEncodedQueryParameter(@NotNull String paramString1, @Nullable String paramString2) {
    long l = a ^ 0x6FDEC420362L;
    Intrinsics.checkNotNullParameter(paramString1, "encodedName");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp() == null)
        httpUrl$Builder2.setEncodedQueryNamesAndValues$okhttp(new ArrayList()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp());
      httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp().add(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString1, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
      Intrinsics.checkNotNull(httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp());
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramString2.add((paramString2 == null) ? null : HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder parse$okhttp(@Nullable HttpUrl paramHttpUrl, @NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.a : J
    //   3: ldc2_w 98034966820645
    //   6: lxor
    //   7: lstore_3
    //   8: aload_2
    //   9: ldc 'input'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #5
    //   17: aload_2
    //   18: iconst_0
    //   19: iconst_0
    //   20: iconst_3
    //   21: aconst_null
    //   22: invokestatic indexOfFirstNonAsciiWhitespace$default : (Ljava/lang/String;IIILjava/lang/Object;)I
    //   25: istore #5
    //   27: aload_2
    //   28: iload #5
    //   30: iconst_0
    //   31: iconst_2
    //   32: aconst_null
    //   33: invokestatic indexOfLastNonAsciiWhitespace$default : (Ljava/lang/String;IIILjava/lang/Object;)I
    //   36: istore #6
    //   38: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;
    //   41: aload_2
    //   42: iload #5
    //   44: iload #6
    //   46: invokestatic access$schemeDelimiterOffset : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;Ljava/lang/String;II)I
    //   49: istore #7
    //   51: iload #7
    //   53: iconst_m1
    //   54: if_icmpeq -> 179
    //   57: nop
    //   58: aload_2
    //   59: ldc 'https:'
    //   61: iload #5
    //   63: iconst_1
    //   64: invokestatic startsWith : (Ljava/lang/String;Ljava/lang/String;IZ)Z
    //   67: ifeq -> 96
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   76: athrow
    //   77: aload_0
    //   78: ldc 'https'
    //   80: putfield scheme : Ljava/lang/String;
    //   83: iload #5
    //   85: ldc 'https:'
    //   87: invokevirtual length : ()I
    //   90: iadd
    //   91: istore #5
    //   93: goto -> 245
    //   96: aload_2
    //   97: ldc 'http:'
    //   99: iload #5
    //   101: iconst_1
    //   102: invokestatic startsWith : (Ljava/lang/String;Ljava/lang/String;IZ)Z
    //   105: ifeq -> 127
    //   108: aload_0
    //   109: ldc 'http'
    //   111: putfield scheme : Ljava/lang/String;
    //   114: iload #5
    //   116: ldc 'http:'
    //   118: invokevirtual length : ()I
    //   121: iadd
    //   122: istore #5
    //   124: goto -> 245
    //   127: new java/lang/IllegalArgumentException
    //   130: dup
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: ldc 'Expected URL scheme 'http' or 'https' but was ''
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: aload_2
    //   144: astore #8
    //   146: iconst_0
    //   147: istore #9
    //   149: aload #8
    //   151: iload #9
    //   153: iload #7
    //   155: invokevirtual substring : (II)Ljava/lang/String;
    //   158: dup
    //   159: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   161: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: bipush #39
    //   169: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   172: invokevirtual toString : ()Ljava/lang/String;
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: athrow
    //   179: aload_1
    //   180: ifnull -> 198
    //   183: aload_0
    //   184: aload_1
    //   185: invokevirtual scheme : ()Ljava/lang/String;
    //   188: putfield scheme : Ljava/lang/String;
    //   191: goto -> 245
    //   194: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   197: athrow
    //   198: aload_2
    //   199: invokevirtual length : ()I
    //   202: bipush #6
    //   204: if_icmple -> 226
    //   207: aload_2
    //   208: bipush #6
    //   210: invokestatic take : (Ljava/lang/String;I)Ljava/lang/String;
    //   213: ldc_w '...'
    //   216: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   219: goto -> 227
    //   222: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   225: athrow
    //   226: aload_2
    //   227: astore #8
    //   229: new java/lang/IllegalArgumentException
    //   232: dup
    //   233: ldc_w 'Expected URL scheme 'http' or 'https' but no scheme was found for '
    //   236: aload #8
    //   238: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   241: invokespecial <init> : (Ljava/lang/String;)V
    //   244: athrow
    //   245: iconst_0
    //   246: istore #8
    //   248: iconst_0
    //   249: istore #9
    //   251: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;
    //   254: aload_2
    //   255: iload #5
    //   257: iload #6
    //   259: invokestatic access$slashCount : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;Ljava/lang/String;II)I
    //   262: istore #10
    //   264: iload #10
    //   266: iconst_2
    //   267: if_icmpge -> 302
    //   270: aload_1
    //   271: ifnull -> 302
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   280: athrow
    //   281: aload_1
    //   282: invokevirtual scheme : ()Ljava/lang/String;
    //   285: aload_0
    //   286: getfield scheme : Ljava/lang/String;
    //   289: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   292: ifne -> 895
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   301: athrow
    //   302: iload #5
    //   304: iload #10
    //   306: iadd
    //   307: istore #5
    //   309: nop
    //   310: aload_2
    //   311: ldc_w '@/\?#'
    //   314: iload #5
    //   316: iload #6
    //   318: invokestatic delimiterOffset : (Ljava/lang/String;Ljava/lang/String;II)I
    //   321: istore #11
    //   323: iload #11
    //   325: iload #6
    //   327: if_icmpeq -> 343
    //   330: aload_2
    //   331: iload #11
    //   333: invokevirtual charAt : (I)C
    //   336: goto -> 344
    //   339: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   342: athrow
    //   343: iconst_m1
    //   344: istore #12
    //   346: iload #12
    //   348: lookupswitch default -> 892, -1 -> 610, 35 -> 610, 47 -> 610, 63 -> 610, 64 -> 408, 92 -> 610
    //   408: iload #9
    //   410: ifne -> 548
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   419: athrow
    //   420: aload_2
    //   421: bipush #58
    //   423: iload #5
    //   425: iload #11
    //   427: invokestatic delimiterOffset : (Ljava/lang/String;CII)I
    //   430: istore #13
    //   432: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   435: aload_2
    //   436: iload #5
    //   438: iload #13
    //   440: ldc_w ' "':;<=>@[]^`{}|/\?#'
    //   443: iconst_1
    //   444: iconst_0
    //   445: iconst_0
    //   446: iconst_0
    //   447: aconst_null
    //   448: sipush #240
    //   451: aconst_null
    //   452: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   455: astore #14
    //   457: aload_0
    //   458: iload #8
    //   460: ifeq -> 498
    //   463: new java/lang/StringBuilder
    //   466: dup
    //   467: invokespecial <init> : ()V
    //   470: aload_0
    //   471: getfield encodedUsername : Ljava/lang/String;
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: ldc_w '%40'
    //   480: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   483: aload #14
    //   485: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: invokevirtual toString : ()Ljava/lang/String;
    //   491: goto -> 500
    //   494: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   497: athrow
    //   498: aload #14
    //   500: putfield encodedUsername : Ljava/lang/String;
    //   503: iload #13
    //   505: iload #11
    //   507: if_icmpeq -> 542
    //   510: iconst_1
    //   511: istore #9
    //   513: aload_0
    //   514: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   517: aload_2
    //   518: iload #13
    //   520: iconst_1
    //   521: iadd
    //   522: iload #11
    //   524: ldc_w ' "':;<=>@[]^`{}|/\?#'
    //   527: iconst_1
    //   528: iconst_0
    //   529: iconst_0
    //   530: iconst_0
    //   531: aconst_null
    //   532: sipush #240
    //   535: aconst_null
    //   536: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   539: putfield encodedPassword : Ljava/lang/String;
    //   542: iconst_1
    //   543: istore #8
    //   545: goto -> 601
    //   548: aload_0
    //   549: new java/lang/StringBuilder
    //   552: dup
    //   553: invokespecial <init> : ()V
    //   556: aload_0
    //   557: getfield encodedPassword : Ljava/lang/String;
    //   560: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   563: ldc_w '%40'
    //   566: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   572: aload_2
    //   573: iload #5
    //   575: iload #11
    //   577: ldc_w ' "':;<=>@[]^`{}|/\?#'
    //   580: iconst_1
    //   581: iconst_0
    //   582: iconst_0
    //   583: iconst_0
    //   584: aconst_null
    //   585: sipush #240
    //   588: aconst_null
    //   589: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: invokevirtual toString : ()Ljava/lang/String;
    //   598: putfield encodedPassword : Ljava/lang/String;
    //   601: iload #11
    //   603: iconst_1
    //   604: iadd
    //   605: istore #5
    //   607: goto -> 309
    //   610: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;
    //   613: aload_2
    //   614: iload #5
    //   616: iload #11
    //   618: invokestatic access$portColonOffset : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;Ljava/lang/String;II)I
    //   621: istore #13
    //   623: iload #13
    //   625: iconst_1
    //   626: iadd
    //   627: iload #11
    //   629: if_icmpge -> 763
    //   632: aload_0
    //   633: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   636: aload_2
    //   637: iload #5
    //   639: iload #13
    //   641: iconst_0
    //   642: iconst_4
    //   643: aconst_null
    //   644: invokestatic percentDecode$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;
    //   647: invokestatic toCanonicalHost : (Ljava/lang/String;)Ljava/lang/String;
    //   650: putfield host : Ljava/lang/String;
    //   653: aload_0
    //   654: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;
    //   657: aload_2
    //   658: iload #13
    //   660: iconst_1
    //   661: iadd
    //   662: iload #11
    //   664: invokestatic access$parsePort : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder$Companion;Ljava/lang/String;II)I
    //   667: putfield port : I
    //   670: aload_0
    //   671: getfield port : I
    //   674: iconst_m1
    //   675: if_icmpeq -> 693
    //   678: goto -> 685
    //   681: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   684: athrow
    //   685: iconst_1
    //   686: goto -> 694
    //   689: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   692: athrow
    //   693: iconst_0
    //   694: ifne -> 802
    //   697: iconst_0
    //   698: istore #15
    //   700: new java/lang/StringBuilder
    //   703: dup
    //   704: invokespecial <init> : ()V
    //   707: ldc_w 'Invalid URL port: "'
    //   710: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   713: aload_2
    //   714: astore #16
    //   716: iload #13
    //   718: iconst_1
    //   719: iadd
    //   720: istore #17
    //   722: aload #16
    //   724: iload #17
    //   726: iload #11
    //   728: invokevirtual substring : (II)Ljava/lang/String;
    //   731: dup
    //   732: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   734: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: bipush #34
    //   742: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   745: invokevirtual toString : ()Ljava/lang/String;
    //   748: astore #15
    //   750: new java/lang/IllegalArgumentException
    //   753: dup
    //   754: aload #15
    //   756: invokevirtual toString : ()Ljava/lang/String;
    //   759: invokespecial <init> : (Ljava/lang/String;)V
    //   762: athrow
    //   763: aload_0
    //   764: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   767: aload_2
    //   768: iload #5
    //   770: iload #13
    //   772: iconst_0
    //   773: iconst_4
    //   774: aconst_null
    //   775: invokestatic percentDecode$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;
    //   778: invokestatic toCanonicalHost : (Ljava/lang/String;)Ljava/lang/String;
    //   781: putfield host : Ljava/lang/String;
    //   784: aload_0
    //   785: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   788: aload_0
    //   789: getfield scheme : Ljava/lang/String;
    //   792: dup
    //   793: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   796: invokevirtual defaultPort : (Ljava/lang/String;)I
    //   799: putfield port : I
    //   802: aload_0
    //   803: getfield host : Ljava/lang/String;
    //   806: ifnull -> 817
    //   809: iconst_1
    //   810: goto -> 818
    //   813: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   816: athrow
    //   817: iconst_0
    //   818: ifne -> 885
    //   821: iconst_0
    //   822: istore #15
    //   824: new java/lang/StringBuilder
    //   827: dup
    //   828: invokespecial <init> : ()V
    //   831: ldc_w 'Invalid URL host: "'
    //   834: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   837: aload_2
    //   838: astore #16
    //   840: iload #5
    //   842: istore #17
    //   844: aload #16
    //   846: iload #17
    //   848: iload #13
    //   850: invokevirtual substring : (II)Ljava/lang/String;
    //   853: dup
    //   854: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   856: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   859: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   862: bipush #34
    //   864: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   867: invokevirtual toString : ()Ljava/lang/String;
    //   870: astore #15
    //   872: new java/lang/IllegalArgumentException
    //   875: dup
    //   876: aload #15
    //   878: invokevirtual toString : ()Ljava/lang/String;
    //   881: invokespecial <init> : (Ljava/lang/String;)V
    //   884: athrow
    //   885: iload #11
    //   887: istore #5
    //   889: goto -> 994
    //   892: goto -> 309
    //   895: aload_0
    //   896: aload_1
    //   897: invokevirtual encodedUsername : ()Ljava/lang/String;
    //   900: putfield encodedUsername : Ljava/lang/String;
    //   903: aload_0
    //   904: aload_1
    //   905: invokevirtual encodedPassword : ()Ljava/lang/String;
    //   908: putfield encodedPassword : Ljava/lang/String;
    //   911: aload_0
    //   912: aload_1
    //   913: invokevirtual host : ()Ljava/lang/String;
    //   916: putfield host : Ljava/lang/String;
    //   919: aload_0
    //   920: aload_1
    //   921: invokevirtual port : ()I
    //   924: putfield port : I
    //   927: aload_0
    //   928: getfield encodedPathSegments : Ljava/util/List;
    //   931: invokeinterface clear : ()V
    //   936: aload_0
    //   937: getfield encodedPathSegments : Ljava/util/List;
    //   940: aload_1
    //   941: invokevirtual encodedPathSegments : ()Ljava/util/List;
    //   944: checkcast java/util/Collection
    //   947: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   952: pop
    //   953: iload #5
    //   955: iload #6
    //   957: if_icmpeq -> 978
    //   960: aload_2
    //   961: iload #5
    //   963: invokevirtual charAt : (I)C
    //   966: bipush #35
    //   968: if_icmpne -> 994
    //   971: goto -> 978
    //   974: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   977: athrow
    //   978: aload_0
    //   979: aload_1
    //   980: invokevirtual encodedQuery : ()Ljava/lang/String;
    //   983: invokevirtual encodedQuery : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder;
    //   986: pop
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   993: athrow
    //   994: aload_2
    //   995: ldc_w '?#'
    //   998: iload #5
    //   1000: iload #6
    //   1002: invokestatic delimiterOffset : (Ljava/lang/String;Ljava/lang/String;II)I
    //   1005: istore #11
    //   1007: aload_0
    //   1008: aload_2
    //   1009: iload #5
    //   1011: iload #11
    //   1013: invokespecial resolvePath : (Ljava/lang/String;II)V
    //   1016: iload #11
    //   1018: istore #5
    //   1020: iload #5
    //   1022: iload #6
    //   1024: if_icmpge -> 1096
    //   1027: aload_2
    //   1028: iload #5
    //   1030: invokevirtual charAt : (I)C
    //   1033: bipush #63
    //   1035: if_icmpne -> 1096
    //   1038: goto -> 1045
    //   1041: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1044: athrow
    //   1045: aload_2
    //   1046: bipush #35
    //   1048: iload #5
    //   1050: iload #6
    //   1052: invokestatic delimiterOffset : (Ljava/lang/String;CII)I
    //   1055: istore #12
    //   1057: aload_0
    //   1058: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   1061: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   1064: aload_2
    //   1065: iload #5
    //   1067: iconst_1
    //   1068: iadd
    //   1069: iload #12
    //   1071: ldc_w ' "'<>#'
    //   1074: iconst_1
    //   1075: iconst_0
    //   1076: iconst_1
    //   1077: iconst_0
    //   1078: aconst_null
    //   1079: sipush #208
    //   1082: aconst_null
    //   1083: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   1086: invokevirtual toQueryNamesAndValues$okhttp : (Ljava/lang/String;)Ljava/util/List;
    //   1089: putfield encodedQueryNamesAndValues : Ljava/util/List;
    //   1092: iload #12
    //   1094: istore #5
    //   1096: iload #5
    //   1098: iload #6
    //   1100: if_icmpge -> 1156
    //   1103: aload_2
    //   1104: iload #5
    //   1106: invokevirtual charAt : (I)C
    //   1109: bipush #35
    //   1111: if_icmpne -> 1156
    //   1114: goto -> 1121
    //   1117: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1120: athrow
    //   1121: aload_0
    //   1122: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   1125: aload_2
    //   1126: iload #5
    //   1128: iconst_1
    //   1129: iadd
    //   1130: iload #6
    //   1132: ldc ''
    //   1134: iconst_1
    //   1135: iconst_0
    //   1136: iconst_0
    //   1137: iconst_1
    //   1138: aconst_null
    //   1139: sipush #176
    //   1142: aconst_null
    //   1143: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   1146: putfield encodedFragment : Ljava/lang/String;
    //   1149: goto -> 1156
    //   1152: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   1155: athrow
    //   1156: aload_0
    //   1157: areturn
    // Exception table:
    //   from	to	target	type
    //   51	70	73	java/lang/IllegalArgumentException
    //   179	194	194	java/lang/IllegalArgumentException
    //   198	222	222	java/lang/IllegalArgumentException
    //   264	274	277	java/lang/IllegalArgumentException
    //   270	295	298	java/lang/IllegalArgumentException
    //   323	339	339	java/lang/IllegalArgumentException
    //   346	413	416	java/lang/IllegalArgumentException
    //   457	494	494	java/lang/IllegalArgumentException
    //   623	678	681	java/lang/IllegalArgumentException
    //   632	689	689	java/lang/IllegalArgumentException
    //   802	813	813	java/lang/IllegalArgumentException
    //   895	971	974	java/lang/IllegalArgumentException
    //   960	987	990	java/lang/IllegalArgumentException
    //   1020	1038	1041	java/lang/IllegalArgumentException
    //   1096	1114	1117	java/lang/IllegalArgumentException
    //   1103	1149	1152	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final HttpUrl$Builder encodedPassword(@NotNull String paramString) {
    long l = a ^ 0x53D9594B82CDL;
    Intrinsics.checkNotNullParameter(paramString, "encodedPassword");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.setEncodedPassword$okhttp(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
    return httpUrl$Builder1;
  }
  
  public final void setEncodedFragment$okhttp(@Nullable String paramString) {
    this.encodedFragment = paramString;
  }
  
  @NotNull
  public final HttpUrl$Builder encodedUsername(@NotNull String paramString) {
    long l = a ^ 0x35DA4E04BA58L;
    Intrinsics.checkNotNullParameter(paramString, "encodedUsername");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.setEncodedUsername$okhttp(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final String getEncodedUsername$okhttp() {
    return this.encodedUsername;
  }
  
  @NotNull
  public final HttpUrl$Builder username(@NotNull String paramString) {
    long l = a ^ 0xFCE826A75B1L;
    Intrinsics.checkNotNullParameter(paramString, "username");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.setEncodedUsername$okhttp(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder addEncodedPathSegments(@NotNull String paramString) {
    long l = a ^ 0x5536AD75037L;
    Intrinsics.checkNotNullParameter(paramString, "encodedPathSegments");
    return addPathSegments(paramString, true);
  }
  
  @NotNull
  public final HttpUrl$Builder encodedQuery(@Nullable String paramString) {
    long l = a ^ 0x641B923CA8FBL;
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    String str = paramString;
    try {
      String str1 = HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    httpUrl$Builder2.setEncodedQueryNamesAndValues$okhttp((str == null) ? null : ((str1 == null) ? null : HttpUrl.Companion.toQueryNamesAndValues$okhttp(str1)));
    return httpUrl$Builder1;
  }
  
  @Nullable
  public final String getScheme$okhttp() {
    return this.scheme;
  }
  
  @NotNull
  public final HttpUrl$Builder encodedFragment(@Nullable String paramString) {
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramString.setEncodedFragment$okhttp((paramString == null) ? null : HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, "", true, false, false, true, null, 179, null));
    return httpUrl$Builder1;
  }
  
  public final int getPort$okhttp() {
    return this.port;
  }
  
  @NotNull
  public final HttpUrl$Builder query(@Nullable String paramString) {
    long l = a ^ 0x746EE89BCFE8L;
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    String str = paramString;
    try {
      String str1 = HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    httpUrl$Builder2.setEncodedQueryNamesAndValues$okhttp((str == null) ? null : ((str1 == null) ? null : HttpUrl.Companion.toQueryNamesAndValues$okhttp(str1)));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder setEncodedQueryParameter(@NotNull String paramString1, @Nullable String paramString2) {
    long l = a ^ 0x36A250E46B97L;
    Intrinsics.checkNotNullParameter(paramString1, "encodedName");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.removeAllEncodedQueryParameters(paramString1);
    httpUrl$Builder2.addEncodedQueryParameter(paramString1, paramString2);
    return httpUrl$Builder1;
  }
  
  static {
    Companion = new HttpUrl$Builder$Companion(null);
  }
  
  @NotNull
  public final String getEncodedPassword$okhttp() {
    return this.encodedPassword;
  }
  
  @NotNull
  public final HttpUrl$Builder port(int paramInt) {
    long l = a ^ 0x127A9FF1C9EBL;
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (1 <= paramInt) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!false) {
      boolean bool1 = false;
      String str = Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(paramInt));
      throw new IllegalArgumentException(str.toString());
    } 
    httpUrl$Builder2.setPort$okhttp(paramInt);
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder removeAllQueryParameters(@NotNull String paramString) {
    long l = a ^ 0x4831B6A1EFD0L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp() == null)
        return httpUrl$Builder2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null);
    httpUrl$Builder2.removeAllCanonicalQueryParameters(str);
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder fragment(@Nullable String paramString) {
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramString.setEncodedFragment$okhttp((paramString == null) ? null : HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, "", false, false, false, true, null, 187, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder removeAllEncodedQueryParameters(@NotNull String paramString) {
    long l = a ^ 0x6918271A53L;
    Intrinsics.checkNotNullParameter(paramString, "encodedName");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp() == null)
        return httpUrl$Builder2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    httpUrl$Builder2.removeAllCanonicalQueryParameters(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder addEncodedPathSegment(@NotNull String paramString) {
    long l = a ^ 0x39013565BAAAL;
    Intrinsics.checkNotNullParameter(paramString, "encodedPathSegment");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.push(paramString, 0, paramString.length(), false, true);
    return httpUrl$Builder1;
  }
  
  public final void setHost$okhttp(@Nullable String paramString) {
    this.host = paramString;
  }
  
  public final void setPort$okhttp(int paramInt) {
    this.port = paramInt;
  }
  
  @NotNull
  public final HttpUrl$Builder password(@NotNull String paramString) {
    long l = a ^ 0x386B5105840EL;
    Intrinsics.checkNotNullParameter(paramString, "password");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.setEncodedPassword$okhttp(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder removePathSegment(int paramInt) {
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      httpUrl$Builder2.getEncodedPathSegments$okhttp().remove(paramInt);
      if (httpUrl$Builder2.getEncodedPathSegments$okhttp().isEmpty())
        httpUrl$Builder2.getEncodedPathSegments$okhttp().add(""); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder addPathSegment(@NotNull String paramString) {
    long l = a ^ 0x1DE404764A71L;
    Intrinsics.checkNotNullParameter(paramString, "pathSegment");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.push(paramString, 0, paramString.length(), false, false);
    return httpUrl$Builder1;
  }
  
  @Nullable
  public final List getEncodedQueryNamesAndValues$okhttp() {
    return this.encodedQueryNamesAndValues;
  }
  
  @NotNull
  public final HttpUrl$Builder setPathSegment(int paramInt, @NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.a : J
    //   3: ldc2_w 49039618640097
    //   6: lxor
    //   7: lstore_3
    //   8: aload_2
    //   9: ldc_w 'pathSegment'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #5
    //   18: aload #5
    //   20: checkcast me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder
    //   23: astore #6
    //   25: iconst_0
    //   26: istore #7
    //   28: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   31: aload_2
    //   32: iconst_0
    //   33: iconst_0
    //   34: ldc_w ' "<>^`{}|/\?#'
    //   37: iconst_0
    //   38: iconst_0
    //   39: iconst_0
    //   40: iconst_0
    //   41: aconst_null
    //   42: sipush #251
    //   45: aconst_null
    //   46: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   49: astore #8
    //   51: aload #6
    //   53: aload #8
    //   55: invokespecial isDot : (Ljava/lang/String;)Z
    //   58: ifne -> 86
    //   61: aload #6
    //   63: aload #8
    //   65: invokespecial isDotDot : (Ljava/lang/String;)Z
    //   68: ifne -> 86
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   77: athrow
    //   78: iconst_1
    //   79: goto -> 87
    //   82: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   85: athrow
    //   86: iconst_0
    //   87: ifne -> 115
    //   90: iconst_0
    //   91: istore #9
    //   93: ldc_w 'unexpected path segment: '
    //   96: aload_2
    //   97: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   100: astore #9
    //   102: new java/lang/IllegalArgumentException
    //   105: dup
    //   106: aload #9
    //   108: invokevirtual toString : ()Ljava/lang/String;
    //   111: invokespecial <init> : (Ljava/lang/String;)V
    //   114: athrow
    //   115: aload #6
    //   117: invokevirtual getEncodedPathSegments$okhttp : ()Ljava/util/List;
    //   120: iload_1
    //   121: aload #8
    //   123: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: nop
    //   130: aload #5
    //   132: checkcast me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder
    //   135: areturn
    // Exception table:
    //   from	to	target	type
    //   51	71	74	java/lang/IllegalArgumentException
    //   61	82	82	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final HttpUrl$Builder host(@NotNull String paramString) {
    String str;
    long l = a ^ 0xF9707E28D32L;
    Intrinsics.checkNotNullParameter(paramString, "host");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (HostnamesKt.toCanonicalHost(HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, paramString, 0, 0, false, 7, null)) == null) {
        HostnamesKt.toCanonicalHost(HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, paramString, 0, 0, false, 7, null));
        throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", paramString));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    httpUrl$Builder2.setHost$okhttp(str);
    return httpUrl$Builder1;
  }
  
  public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List paramList) {
    this.encodedQueryNamesAndValues = paramList;
  }
  
  public final void setScheme$okhttp(@Nullable String paramString) {
    this.scheme = paramString;
  }
  
  @NotNull
  public final HttpUrl$Builder addQueryParameter(@NotNull String paramString1, @Nullable String paramString2) {
    long l = a ^ 0x2EDEB7B699F7L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp() == null)
        httpUrl$Builder2.setEncodedQueryNamesAndValues$okhttp(new ArrayList()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp());
      httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp().add(HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString1, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
      Intrinsics.checkNotNull(httpUrl$Builder2.getEncodedQueryNamesAndValues$okhttp());
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramString2.add((paramString2 == null) ? null : HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, paramString2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder setQueryParameter(@NotNull String paramString1, @Nullable String paramString2) {
    long l = a ^ 0x5F63A2547767L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    httpUrl$Builder2.removeAllQueryParameters(paramString1);
    httpUrl$Builder2.addQueryParameter(paramString1, paramString2);
    return httpUrl$Builder1;
  }
  
  @NotNull
  public final HttpUrl$Builder scheme(@NotNull String paramString) {
    long l = a ^ 0x1800A3AB44EFL;
    Intrinsics.checkNotNullParameter(paramString, "scheme");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    try {
      if (StringsKt.equals(paramString, "http", true)) {
        httpUrl$Builder2.setScheme$okhttp("http");
      } else {
        try {
          if (StringsKt.equals(paramString, "https", true)) {
            httpUrl$Builder2.setScheme$okhttp("https");
          } else {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", paramString));
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return httpUrl$Builder1;
  }
  
  public final void setEncodedUsername$okhttp(@NotNull String paramString) {
    long l = a ^ 0x6C5F85A7F2DL;
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    this.encodedUsername = paramString;
  }
  
  @NotNull
  public final HttpUrl$Builder setEncodedPathSegment(int paramInt, @NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.a : J
    //   3: ldc2_w 55764731043634
    //   6: lxor
    //   7: lstore_3
    //   8: aload_2
    //   9: ldc_w 'encodedPathSegment'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #5
    //   18: aload #5
    //   20: checkcast me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder
    //   23: astore #6
    //   25: iconst_0
    //   26: istore #7
    //   28: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   31: aload_2
    //   32: iconst_0
    //   33: iconst_0
    //   34: ldc_w ' "<>^`{}|/\?#'
    //   37: iconst_1
    //   38: iconst_0
    //   39: iconst_0
    //   40: iconst_0
    //   41: aconst_null
    //   42: sipush #243
    //   45: aconst_null
    //   46: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   49: astore #8
    //   51: aload #6
    //   53: invokevirtual getEncodedPathSegments$okhttp : ()Ljava/util/List;
    //   56: iload_1
    //   57: aload #8
    //   59: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   64: pop
    //   65: aload #6
    //   67: aload #8
    //   69: invokespecial isDot : (Ljava/lang/String;)Z
    //   72: ifne -> 100
    //   75: aload #6
    //   77: aload #8
    //   79: invokespecial isDotDot : (Ljava/lang/String;)Z
    //   82: ifne -> 100
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   91: athrow
    //   92: iconst_1
    //   93: goto -> 101
    //   96: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   99: athrow
    //   100: iconst_0
    //   101: ifne -> 129
    //   104: iconst_0
    //   105: istore #9
    //   107: ldc_w 'unexpected path segment: '
    //   110: aload_2
    //   111: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   114: astore #9
    //   116: new java/lang/IllegalArgumentException
    //   119: dup
    //   120: aload #9
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: athrow
    //   129: nop
    //   130: aload #5
    //   132: checkcast me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder
    //   135: areturn
    // Exception table:
    //   from	to	target	type
    //   51	85	88	java/lang/IllegalArgumentException
    //   75	96	96	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final List getEncodedPathSegments$okhttp() {
    return this.encodedPathSegments;
  }
  
  @Nullable
  public final String getHost$okhttp() {
    return this.host;
  }
  
  @NotNull
  public final HttpUrl$Builder reencodeForUri$okhttp() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder.a : J
    //   3: ldc2_w 109671452877661
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: aload_3
    //   11: checkcast me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder
    //   14: astore #4
    //   16: iconst_0
    //   17: istore #5
    //   19: aload #4
    //   21: aload #4
    //   23: invokevirtual getHost$okhttp : ()Ljava/lang/String;
    //   26: dup
    //   27: ifnonnull -> 39
    //   30: pop
    //   31: aconst_null
    //   32: goto -> 69
    //   35: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   38: athrow
    //   39: checkcast java/lang/CharSequence
    //   42: astore #7
    //   44: new me/rerere/matrix/thirdparty/kotlin/text/Regex
    //   47: dup
    //   48: ldc_w '["<>^`{|}]'
    //   51: invokespecial <init> : (Ljava/lang/String;)V
    //   54: astore #8
    //   56: ldc ''
    //   58: astore #9
    //   60: aload #8
    //   62: aload #7
    //   64: aload #9
    //   66: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    //   69: invokevirtual setHost$okhttp : (Ljava/lang/String;)V
    //   72: iconst_0
    //   73: istore #6
    //   75: aload #4
    //   77: invokevirtual getEncodedPathSegments$okhttp : ()Ljava/util/List;
    //   80: invokeinterface size : ()I
    //   85: istore #7
    //   87: iload #6
    //   89: iload #7
    //   91: if_icmpge -> 152
    //   94: iload #6
    //   96: istore #8
    //   98: iinc #6, 1
    //   101: aload #4
    //   103: invokevirtual getEncodedPathSegments$okhttp : ()Ljava/util/List;
    //   106: iload #8
    //   108: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   111: aload #4
    //   113: invokevirtual getEncodedPathSegments$okhttp : ()Ljava/util/List;
    //   116: iload #8
    //   118: invokeinterface get : (I)Ljava/lang/Object;
    //   123: checkcast java/lang/String
    //   126: iconst_0
    //   127: iconst_0
    //   128: ldc_w '[]'
    //   131: iconst_1
    //   132: iconst_1
    //   133: iconst_0
    //   134: iconst_0
    //   135: aconst_null
    //   136: sipush #227
    //   139: aconst_null
    //   140: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   143: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   148: pop
    //   149: goto -> 87
    //   152: aload #4
    //   154: invokevirtual getEncodedQueryNamesAndValues$okhttp : ()Ljava/util/List;
    //   157: astore #6
    //   159: aload #6
    //   161: ifnull -> 249
    //   164: iconst_0
    //   165: istore #7
    //   167: aload #6
    //   169: invokeinterface size : ()I
    //   174: istore #8
    //   176: iload #7
    //   178: iload #8
    //   180: if_icmpge -> 249
    //   183: iload #7
    //   185: istore #9
    //   187: iinc #7, 1
    //   190: aload #6
    //   192: iload #9
    //   194: aload #6
    //   196: iload #9
    //   198: invokeinterface get : (I)Ljava/lang/Object;
    //   203: checkcast java/lang/String
    //   206: dup
    //   207: ifnonnull -> 219
    //   210: pop
    //   211: aconst_null
    //   212: goto -> 240
    //   215: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   218: athrow
    //   219: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   222: swap
    //   223: iconst_0
    //   224: iconst_0
    //   225: ldc_w '\^`{|}'
    //   228: iconst_1
    //   229: iconst_1
    //   230: iconst_1
    //   231: iconst_0
    //   232: aconst_null
    //   233: sipush #195
    //   236: aconst_null
    //   237: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   240: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   245: pop
    //   246: goto -> 176
    //   249: aload #4
    //   251: aload #4
    //   253: invokevirtual getEncodedFragment$okhttp : ()Ljava/lang/String;
    //   256: dup
    //   257: ifnonnull -> 269
    //   260: pop
    //   261: aconst_null
    //   262: goto -> 290
    //   265: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   268: athrow
    //   269: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   272: swap
    //   273: iconst_0
    //   274: iconst_0
    //   275: ldc_w ' "#<>\^`{|}'
    //   278: iconst_1
    //   279: iconst_1
    //   280: iconst_0
    //   281: iconst_1
    //   282: aconst_null
    //   283: sipush #163
    //   286: aconst_null
    //   287: invokestatic canonicalize$okhttp$default : (Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    //   290: invokevirtual setEncodedFragment$okhttp : (Ljava/lang/String;)V
    //   293: nop
    //   294: aload_3
    //   295: checkcast me/rerere/matrix/thirdparty/okhttp3/HttpUrl$Builder
    //   298: areturn
    // Exception table:
    //   from	to	target	type
    //   19	35	35	java/lang/IllegalArgumentException
    //   187	215	215	java/lang/IllegalArgumentException
    //   249	265	265	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final HttpUrl build() {
    long l = a ^ 0x5928425410FDL;
    try {
      if (this.scheme == null)
        throw new IllegalStateException("scheme == null"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.host == null)
        throw new IllegalStateException("host == null"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    List list1 = this.encodedPathSegments;
    int i = effectivePort();
    String str4 = this.host;
    String str3 = str4;
    String str2 = HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedPassword, 0, 0, false, 7, null);
    String str1 = HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedUsername, 0, 0, false, 7, null);
    boolean bool1 = false;
    List list2 = list1;
    ArrayList<String> arrayList1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
    boolean bool2 = false;
    for (String str10 : list2) {
      String str11 = str10;
      ArrayList<String> arrayList = arrayList1;
      boolean bool = false;
      arrayList.add(HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, str11, 0, 0, false, 7, null));
    } 
    ArrayList<String> arrayList2 = arrayList1;
    try {
      List list4 = this.encodedQueryNamesAndValues;
      List list6 = list4;
      ArrayList<String> arrayList6 = arrayList2;
      int k = i;
      str3 = str4;
      str2 = str3;
      str1 = str2;
      boolean bool3 = false;
      List list5 = list4;
      ArrayList<String> arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
      boolean bool4 = false;
      for (String str10 : list5) {
        String str11 = str10;
        ArrayList<String> arrayList = arrayList5;
        boolean bool = false;
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        arrayList.add((str11 == null) ? null : HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, str11, 0, 0, true, 3, null));
      } 
      ArrayList<String> arrayList7 = arrayList5;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str5 = toString();
    String str6 = (this.encodedFragment == null) ? null : HttpUrl$Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedFragment, 0, 0, false, 7, null);
    String str7 = this.encodedFragment;
    ArrayList<String> arrayList3 = (this.encodedQueryNamesAndValues == null) ? null : arrayList7;
    List list3 = list6;
    ArrayList<String> arrayList4 = arrayList6;
    int j = k;
    String str8 = str3;
    String str9 = str2;
    return new HttpUrl(str9, str8, j, (String)arrayList4, list3, arrayList3, (List)str7, str6, str5);
  }
  
  @NotNull
  public final HttpUrl$Builder addPathSegments(@NotNull String paramString) {
    long l = a ^ 0x71331C07CCC1L;
    Intrinsics.checkNotNullParameter(paramString, "pathSegments");
    return addPathSegments(paramString, false);
  }
  
  @NotNull
  public final HttpUrl$Builder encodedPath(@NotNull String paramString) {
    long l = a ^ 0x72BA706D0E95L;
    Intrinsics.checkNotNullParameter(paramString, "encodedPath");
    HttpUrl$Builder httpUrl$Builder1 = this;
    HttpUrl$Builder httpUrl$Builder2 = httpUrl$Builder1;
    boolean bool = false;
    if (!StringsKt.startsWith$default(paramString, "/", false, 2, null)) {
      boolean bool1 = false;
      String str = Intrinsics.stringPlus("unexpected encodedPath: ", paramString);
      throw new IllegalArgumentException(str.toString());
    } 
    httpUrl$Builder2.resolvePath(paramString, 0, paramString.length());
    return httpUrl$Builder1;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\HttpUrl$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */