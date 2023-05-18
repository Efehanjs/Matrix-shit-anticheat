package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.SetsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.StringCompanionObject;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Cache$Companion {
  private static final long a = o3.a(-5219958565858514940L, 6419449630442365217L, MethodHandles.lookup().lookupClass()).a(125541706085738L);
  
  public final boolean hasVaryAll(@NotNull Response paramResponse) {
    long l = a ^ 0x4C542B31BBA4L;
    Intrinsics.checkNotNullParameter(paramResponse, "<this>");
    return varyFields(paramResponse.headers()).contains("*");
  }
  
  public final boolean varyMatches(@NotNull Response paramResponse, @NotNull Headers paramHeaders, @NotNull Request paramRequest) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/Cache$Companion.a : J
    //   3: ldc2_w 21113642730999
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'cachedResponse'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_2
    //   16: ldc 'cachedRequest'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_3
    //   22: ldc 'newRequest'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: aload_0
    //   28: aload_1
    //   29: invokevirtual headers : ()Lme/rerere/matrix/thirdparty/okhttp3/Headers;
    //   32: invokespecial varyFields : (Lme/rerere/matrix/thirdparty/okhttp3/Headers;)Ljava/util/Set;
    //   35: checkcast java/lang/Iterable
    //   38: astore #6
    //   40: iconst_0
    //   41: istore #7
    //   43: aload #6
    //   45: instanceof java/util/Collection
    //   48: ifeq -> 79
    //   51: aload #6
    //   53: checkcast java/util/Collection
    //   56: invokeinterface isEmpty : ()Z
    //   61: ifeq -> 79
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   70: athrow
    //   71: iconst_1
    //   72: goto -> 152
    //   75: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   78: athrow
    //   79: aload #6
    //   81: invokeinterface iterator : ()Ljava/util/Iterator;
    //   86: astore #8
    //   88: aload #8
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 151
    //   98: aload #8
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: astore #9
    //   107: aload #9
    //   109: checkcast java/lang/String
    //   112: astore #10
    //   114: iconst_0
    //   115: istore #11
    //   117: aload_2
    //   118: aload #10
    //   120: invokevirtual values : (Ljava/lang/String;)Ljava/util/List;
    //   123: aload_3
    //   124: aload #10
    //   126: invokevirtual headers : (Ljava/lang/String;)Ljava/util/List;
    //   129: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   132: ifne -> 143
    //   135: iconst_1
    //   136: goto -> 144
    //   139: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   142: athrow
    //   143: iconst_0
    //   144: ifeq -> 88
    //   147: iconst_0
    //   148: goto -> 152
    //   151: iconst_1
    //   152: ireturn
    // Exception table:
    //   from	to	target	type
    //   43	64	67	java/lang/NumberFormatException
    //   51	75	75	java/lang/NumberFormatException
    //   117	139	139	java/lang/NumberFormatException
  }
  
  public final int readInt$okhttp(@NotNull BufferedSource paramBufferedSource) throws IOException {
    long l = a ^ 0x12624282500EL;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    try {
      long l1 = paramBufferedSource.readDecimalLong();
      String str = paramBufferedSource.readUtf8LineStrict();
      try {
        if (l1 >= 0L)
          try {
            if (l1 <= 2147483647L) {
              try {
              
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              try {
                if (!((((CharSequence)str).length() > 0) ? 1 : 0))
                  return (int)l1; 
                throw new IOException("expected an int but was \"" + l1 + str + '"');
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      throw new IOException("expected an int but was \"" + l1 + str + '"');
    } catch (NumberFormatException numberFormatException) {
      throw new IOException(numberFormatException.getMessage());
    } 
  }
  
  @NotNull
  public final Headers varyHeaders(@NotNull Response paramResponse) {
    long l = a ^ 0xFE33088CE6FL;
    Intrinsics.checkNotNullParameter(paramResponse, "<this>");
    Intrinsics.checkNotNull(paramResponse.networkResponse());
    Headers headers1 = paramResponse.networkResponse().request().headers();
    Headers headers2 = paramResponse.headers();
    return varyHeaders(headers1, headers2);
  }
  
  @NotNull
  public final String key(@NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x5E0E1E676926L;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    return ByteString.Companion.encodeUtf8(paramHttpUrl.toString()).md5().hex();
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */