package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.EOFException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Challenge;
import me.rerere.matrix.thirdparty.okhttp3.Cookie;
import me.rerere.matrix.thirdparty.okhttp3.CookieJar;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class HttpHeaders {
  @NotNull
  private static final ByteString QUOTED_STRING_DELIMITERS;
  
  @NotNull
  private static final ByteString TOKEN_DELIMITERS;
  
  private static final long a = o3.a(254137719838197831L, 1277269704638917889L, MethodHandles.lookup().lookupClass()).a(134475783809460L);
  
  @Deprecated(message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}), level = DeprecationLevel.ERROR)
  public static final boolean hasBody(@NotNull Response paramResponse) {
    long l = a ^ 0xC934A96EEA8L;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    return promisesBody(paramResponse);
  }
  
  public static final void receiveHeaders(@NotNull CookieJar paramCookieJar, @NotNull HttpUrl paramHttpUrl, @NotNull Headers paramHeaders) {
    long l = a ^ 0x3C19BF750BFEL;
    try {
      Intrinsics.checkNotNullParameter(paramCookieJar, "<this>");
      Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
      Intrinsics.checkNotNullParameter(paramHeaders, "headers");
      if (paramCookieJar == CookieJar.NO_COOKIES)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    List list = Cookie.Companion.parseAll(paramHttpUrl, paramHeaders);
    try {
      if (list.isEmpty())
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramCookieJar.saveFromResponse(paramHttpUrl, list);
  }
  
  static {
    long l = a ^ 0x80B06A1B7F0L;
    QUOTED_STRING_DELIMITERS = ByteString.Companion.encodeUtf8("\"\\");
    TOKEN_DELIMITERS = ByteString.Companion.encodeUtf8("\t ,=");
  }
  
  @NotNull
  public static final List parseChallenges(@NotNull Headers paramHeaders, @NotNull String paramString) {
    long l = a ^ 0x771AC7BE1412L;
    Intrinsics.checkNotNullParameter(paramHeaders, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "headerName");
    ArrayList arrayList = new ArrayList();
    byte b = 0;
    int i = paramHeaders.size();
    while (b < i) {
      byte b1 = b;
      b++;
      if (StringsKt.equals(paramString, paramHeaders.name(b1), true)) {
        Buffer buffer = (new Buffer()).writeUtf8(paramHeaders.value(b1));
        try {
          readChallengeHeader(buffer, arrayList);
        } catch (EOFException eOFException) {
          Platform.Companion.get().log("Unable to parse challenge", 5, eOFException);
        } 
      } 
    } 
    return arrayList;
  }
  
  public static final boolean promisesBody(@NotNull Response paramResponse) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http/HttpHeaders.a : J
    //   3: ldc2_w 14027742414661
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokevirtual request : ()Lme/rerere/matrix/thirdparty/okhttp3/Request;
    //   18: invokevirtual method : ()Ljava/lang/String;
    //   21: ldc_w 'HEAD'
    //   24: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   27: ifeq -> 36
    //   30: iconst_0
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual code : ()I
    //   40: istore_3
    //   41: iload_3
    //   42: bipush #100
    //   44: if_icmplt -> 61
    //   47: iload_3
    //   48: sipush #200
    //   51: if_icmplt -> 95
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iload_3
    //   62: sipush #204
    //   65: if_icmpeq -> 95
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: iload_3
    //   76: sipush #304
    //   79: if_icmpeq -> 95
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iconst_1
    //   90: ireturn
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: aload_0
    //   96: invokestatic headersContentLength : (Lme/rerere/matrix/thirdparty/okhttp3/Response;)J
    //   99: ldc2_w -1
    //   102: lcmp
    //   103: ifne -> 133
    //   106: ldc_w 'chunked'
    //   109: aload_0
    //   110: ldc_w 'Transfer-Encoding'
    //   113: aconst_null
    //   114: iconst_2
    //   115: aconst_null
    //   116: invokestatic header$default : (Lme/rerere/matrix/thirdparty/okhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   119: iconst_1
    //   120: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   123: ifeq -> 139
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: iconst_1
    //   134: ireturn
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: iconst_0
    //   140: ireturn
    // Exception table:
    //   from	to	target	type
    //   8	32	32	java/lang/IllegalArgumentException
    //   41	54	57	java/lang/IllegalArgumentException
    //   47	68	71	java/lang/IllegalArgumentException
    //   61	82	85	java/lang/IllegalArgumentException
    //   75	91	91	java/lang/IllegalArgumentException
    //   95	126	129	java/lang/IllegalArgumentException
    //   106	135	135	java/lang/IllegalArgumentException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\HttpHeaders.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */