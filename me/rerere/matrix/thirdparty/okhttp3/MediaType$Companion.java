package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MediaType$Companion {
  private static final long a = o3.a(6859534719393970371L, 3764857648368485197L, MethodHandles.lookup().lookupClass()).a(36479054008920L);
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaType()", imports = {"me.rerere.matrix.thirdparty.okhttp3.MediaType.Companion.toMediaType"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final MediaType -deprecated_get(@NotNull String paramString) {
    long l = a ^ 0x69588DFB8A4EL;
    Intrinsics.checkNotNullParameter(paramString, "mediaType");
    return get(paramString);
  }
  
  @Nullable
  public final MediaType parse(@NotNull String paramString) {
    MediaType mediaType;
    long l = a ^ 0x60AE26030176L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    try {
      mediaType = get(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      mediaType = (MediaType)null;
    } 
    return mediaType;
  }
  
  @NotNull
  public final MediaType get(@NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/MediaType$Companion.a : J
    //   3: ldc2_w 25330275624999
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: invokestatic access$getTYPE_SUBTYPE$cp : ()Ljava/util/regex/Pattern;
    //   17: aload_1
    //   18: checkcast java/lang/CharSequence
    //   21: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   24: astore #4
    //   26: aload #4
    //   28: invokevirtual lookingAt : ()Z
    //   31: ifne -> 76
    //   34: iconst_0
    //   35: istore #6
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: ldc 'No subtype found for: "'
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: aload_1
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: bipush #34
    //   55: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: astore #6
    //   63: new java/lang/IllegalArgumentException
    //   66: dup
    //   67: aload #6
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: athrow
    //   76: aload #4
    //   78: iconst_1
    //   79: invokevirtual group : (I)Ljava/lang/String;
    //   82: astore #6
    //   84: aload #6
    //   86: ldc 'typeSubtype.group(1)'
    //   88: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   91: aload #6
    //   93: astore #6
    //   95: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   98: astore #7
    //   100: aload #7
    //   102: ldc 'US'
    //   104: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   107: aload #7
    //   109: astore #7
    //   111: aload #6
    //   113: aload #7
    //   115: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   118: dup
    //   119: ldc 'this as java.lang.String).toLowerCase(locale)'
    //   121: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   124: astore #5
    //   126: aload #4
    //   128: iconst_2
    //   129: invokevirtual group : (I)Ljava/lang/String;
    //   132: astore #7
    //   134: aload #7
    //   136: ldc 'typeSubtype.group(2)'
    //   138: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   141: aload #7
    //   143: astore #7
    //   145: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   148: astore #8
    //   150: aload #8
    //   152: ldc 'US'
    //   154: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   157: aload #8
    //   159: astore #8
    //   161: aload #7
    //   163: aload #8
    //   165: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   168: dup
    //   169: ldc 'this as java.lang.String).toLowerCase(locale)'
    //   171: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   174: astore #6
    //   176: new java/util/ArrayList
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: checkcast java/util/List
    //   186: astore #7
    //   188: invokestatic access$getPARAMETER$cp : ()Ljava/util/regex/Pattern;
    //   191: aload_1
    //   192: checkcast java/lang/CharSequence
    //   195: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   198: astore #8
    //   200: iconst_0
    //   201: istore #9
    //   203: aload #4
    //   205: invokevirtual end : ()I
    //   208: istore #9
    //   210: iload #9
    //   212: aload_1
    //   213: invokevirtual length : ()I
    //   216: if_icmpge -> 489
    //   219: aload #8
    //   221: iload #9
    //   223: aload_1
    //   224: invokevirtual length : ()I
    //   227: invokevirtual region : (II)Ljava/util/regex/Matcher;
    //   230: pop
    //   231: aload #8
    //   233: invokevirtual lookingAt : ()Z
    //   236: ifne -> 308
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   245: athrow
    //   246: iconst_0
    //   247: istore #11
    //   249: new java/lang/StringBuilder
    //   252: dup
    //   253: invokespecial <init> : ()V
    //   256: ldc 'Parameter is not formatted correctly: "'
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload_1
    //   262: iload #9
    //   264: invokevirtual substring : (I)Ljava/lang/String;
    //   267: dup
    //   268: ldc 'this as java.lang.String).substring(startIndex)'
    //   270: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: ldc '" for: "'
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload_1
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: bipush #34
    //   287: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   290: invokevirtual toString : ()Ljava/lang/String;
    //   293: astore #11
    //   295: new java/lang/IllegalArgumentException
    //   298: dup
    //   299: aload #11
    //   301: invokevirtual toString : ()Ljava/lang/String;
    //   304: invokespecial <init> : (Ljava/lang/String;)V
    //   307: athrow
    //   308: aload #8
    //   310: iconst_1
    //   311: invokevirtual group : (I)Ljava/lang/String;
    //   314: astore #10
    //   316: aload #10
    //   318: ifnonnull -> 331
    //   321: aload #8
    //   323: invokevirtual end : ()I
    //   326: istore #9
    //   328: goto -> 210
    //   331: aload #8
    //   333: iconst_2
    //   334: invokevirtual group : (I)Ljava/lang/String;
    //   337: astore #11
    //   339: nop
    //   340: aload #11
    //   342: ifnonnull -> 358
    //   345: aload #8
    //   347: iconst_3
    //   348: invokevirtual group : (I)Ljava/lang/String;
    //   351: goto -> 443
    //   354: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   357: athrow
    //   358: aload #11
    //   360: ldc '''
    //   362: iconst_0
    //   363: iconst_2
    //   364: aconst_null
    //   365: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   368: ifeq -> 441
    //   371: aload #11
    //   373: ldc '''
    //   375: iconst_0
    //   376: iconst_2
    //   377: aconst_null
    //   378: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   381: ifeq -> 441
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   390: athrow
    //   391: aload #11
    //   393: invokevirtual length : ()I
    //   396: iconst_2
    //   397: if_icmple -> 441
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   406: athrow
    //   407: aload #11
    //   409: astore #13
    //   411: iconst_1
    //   412: istore #14
    //   414: aload #11
    //   416: invokevirtual length : ()I
    //   419: iconst_1
    //   420: isub
    //   421: istore #15
    //   423: aload #13
    //   425: iload #14
    //   427: iload #15
    //   429: invokevirtual substring : (II)Ljava/lang/String;
    //   432: dup
    //   433: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   435: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   438: goto -> 443
    //   441: aload #11
    //   443: astore #12
    //   445: aload #7
    //   447: checkcast java/util/Collection
    //   450: astore #13
    //   452: aload #10
    //   454: astore #14
    //   456: aload #13
    //   458: aload #14
    //   460: invokeinterface add : (Ljava/lang/Object;)Z
    //   465: pop
    //   466: aload #7
    //   468: checkcast java/util/Collection
    //   471: aload #12
    //   473: invokeinterface add : (Ljava/lang/Object;)Z
    //   478: pop
    //   479: aload #8
    //   481: invokevirtual end : ()I
    //   484: istore #9
    //   486: goto -> 210
    //   489: new me/rerere/matrix/thirdparty/okhttp3/MediaType
    //   492: dup
    //   493: aload_1
    //   494: aload #5
    //   496: aload #6
    //   498: aload #7
    //   500: checkcast java/util/Collection
    //   503: astore #10
    //   505: iconst_0
    //   506: istore #11
    //   508: aload #10
    //   510: astore #12
    //   512: aload #12
    //   514: iconst_0
    //   515: anewarray java/lang/String
    //   518: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   523: dup
    //   524: ifnonnull -> 538
    //   527: pop
    //   528: new java/lang/NullPointerException
    //   531: dup
    //   532: ldc 'null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>'
    //   534: invokespecial <init> : (Ljava/lang/String;)V
    //   537: athrow
    //   538: checkcast [Ljava/lang/String;
    //   541: aconst_null
    //   542: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   545: areturn
    // Exception table:
    //   from	to	target	type
    //   210	239	242	java/lang/IllegalArgumentException
    //   339	354	354	java/lang/IllegalArgumentException
    //   358	384	387	java/lang/IllegalArgumentException
    //   371	400	403	java/lang/IllegalArgumentException
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"me.rerere.matrix.thirdparty.okhttp3.MediaType.Companion.toMediaTypeOrNull"}), level = DeprecationLevel.ERROR)
  @Nullable
  public final MediaType -deprecated_parse(@NotNull String paramString) {
    long l = a ^ 0x39346F5714B9L;
    Intrinsics.checkNotNullParameter(paramString, "mediaType");
    return parse(paramString);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\MediaType$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */