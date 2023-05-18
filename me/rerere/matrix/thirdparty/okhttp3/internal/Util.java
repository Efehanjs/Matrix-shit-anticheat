package me.rerere.matrix.thirdparty.okhttp3.internal;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.ArrayIteratorKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.TypeIntrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.text.Regex;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Call;
import me.rerere.matrix.thirdparty.okhttp3.EventListener;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.RequestBody;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.ResponseBody;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.Header;
import me.rerere.matrix.thirdparty.okhttp3.internal.io.FileSystem;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.Options;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Util {
  @NotNull
  private static final Regex VERIFY_AS_IP_ADDRESS;
  
  @JvmField
  @NotNull
  public static final String okHttpName;
  
  @JvmField
  @NotNull
  public static final Headers EMPTY_HEADERS;
  
  @JvmField
  @NotNull
  public static final ResponseBody EMPTY_RESPONSE;
  
  @JvmField
  @NotNull
  public static final byte[] EMPTY_BYTE_ARRAY;
  
  @JvmField
  public static final boolean assertionsEnabled;
  
  @JvmField
  @NotNull
  public static final RequestBody EMPTY_REQUEST;
  
  @JvmField
  @NotNull
  public static final TimeZone UTC;
  
  @NotNull
  private static final Options UNICODE_BOMS;
  
  @NotNull
  public static final String userAgent = "okhttp/4.10.0";
  
  private static final long a = o3.a(6212015474599523838L, -5387717092892027888L, MethodHandles.lookup().lookupClass()).a(206420366760472L);
  
  public static final void addIfAbsent(@NotNull List<Object> paramList, Object paramObject) {
    long l = a ^ 0x2EE5E842CB47L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "<this>");
      if (!paramList.contains(paramObject))
        paramList.add(paramObject); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final String toHostHeader(@NotNull HttpUrl paramHttpUrl, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.a : J
    //   3: ldc2_w 129679121189811
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokevirtual host : ()Ljava/lang/String;
    //   18: checkcast java/lang/CharSequence
    //   21: ldc ':'
    //   23: checkcast java/lang/CharSequence
    //   26: iconst_0
    //   27: iconst_2
    //   28: aconst_null
    //   29: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   32: ifeq -> 69
    //   35: new java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: bipush #91
    //   44: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   47: aload_0
    //   48: invokevirtual host : ()Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: bipush #93
    //   56: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: goto -> 73
    //   65: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   68: athrow
    //   69: aload_0
    //   70: invokevirtual host : ()Ljava/lang/String;
    //   73: astore #4
    //   75: iload_1
    //   76: ifne -> 103
    //   79: aload_0
    //   80: invokevirtual port : ()I
    //   83: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.Companion : Lme/rerere/matrix/thirdparty/okhttp3/HttpUrl$Companion;
    //   86: aload_0
    //   87: invokevirtual scheme : ()Ljava/lang/String;
    //   90: invokevirtual defaultPort : (Ljava/lang/String;)I
    //   93: if_icmpeq -> 137
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: new java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: aload #4
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: bipush #58
    //   117: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   120: aload_0
    //   121: invokevirtual port : ()I
    //   124: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: goto -> 139
    //   133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   136: athrow
    //   137: aload #4
    //   139: areturn
    // Exception table:
    //   from	to	target	type
    //   8	65	65	java/lang/IllegalStateException
    //   75	96	99	java/lang/IllegalStateException
    //   79	133	133	java/lang/IllegalStateException
  }
  
  public static final int checkDuration(@NotNull String paramString, long paramLong, @Nullable TimeUnit paramTimeUnit) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.a : J
    //   3: ldc2_w 76315817862808
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc 'name'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: lload_1
    //   16: lconst_0
    //   17: lcmp
    //   18: iflt -> 29
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   28: athrow
    //   29: iconst_0
    //   30: ifne -> 57
    //   33: iconst_0
    //   34: istore #7
    //   36: aload_0
    //   37: ldc ' < 0'
    //   39: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   42: astore #7
    //   44: new java/lang/IllegalStateException
    //   47: dup
    //   48: aload #7
    //   50: invokevirtual toString : ()Ljava/lang/String;
    //   53: invokespecial <init> : (Ljava/lang/String;)V
    //   56: athrow
    //   57: aload_3
    //   58: ifnull -> 69
    //   61: iconst_1
    //   62: goto -> 70
    //   65: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   68: athrow
    //   69: iconst_0
    //   70: ifne -> 93
    //   73: iconst_0
    //   74: istore #7
    //   76: ldc 'unit == null'
    //   78: astore #7
    //   80: new java/lang/IllegalStateException
    //   83: dup
    //   84: aload #7
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: athrow
    //   93: aload_3
    //   94: lload_1
    //   95: invokevirtual toMillis : (J)J
    //   98: lstore #6
    //   100: lload #6
    //   102: ldc2_w 2147483647
    //   105: lcmp
    //   106: ifgt -> 117
    //   109: iconst_1
    //   110: goto -> 118
    //   113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   116: athrow
    //   117: iconst_0
    //   118: ifne -> 145
    //   121: iconst_0
    //   122: istore #8
    //   124: aload_0
    //   125: ldc ' too large.'
    //   127: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   130: astore #8
    //   132: new java/lang/IllegalArgumentException
    //   135: dup
    //   136: aload #8
    //   138: invokevirtual toString : ()Ljava/lang/String;
    //   141: invokespecial <init> : (Ljava/lang/String;)V
    //   144: athrow
    //   145: lload #6
    //   147: lconst_0
    //   148: lcmp
    //   149: ifne -> 165
    //   152: lload_1
    //   153: lconst_0
    //   154: lcmp
    //   155: ifgt -> 173
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   164: athrow
    //   165: iconst_1
    //   166: goto -> 174
    //   169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   172: athrow
    //   173: iconst_0
    //   174: ifne -> 201
    //   177: iconst_0
    //   178: istore #8
    //   180: aload_0
    //   181: ldc ' too small.'
    //   183: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   186: astore #8
    //   188: new java/lang/IllegalArgumentException
    //   191: dup
    //   192: aload #8
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: invokespecial <init> : (Ljava/lang/String;)V
    //   200: athrow
    //   201: lload #6
    //   203: l2i
    //   204: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	25	25	java/lang/IllegalStateException
    //   57	65	65	java/lang/IllegalStateException
    //   100	113	113	java/lang/IllegalStateException
    //   145	158	161	java/lang/IllegalStateException
    //   152	169	169	java/lang/IllegalStateException
  }
  
  @NotNull
  public static final List filterList(@NotNull Iterable paramIterable, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x3AA99EE71E90L;
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    List list = CollectionsKt.emptyList();
    for (Object object : paramIterable) {
      if (((Boolean)paramFunction1.invoke(object)).booleanValue()) {
        if (list.isEmpty())
          list = new ArrayList(); 
        TypeIntrinsics.asMutableList(list).add(object);
      } 
    } 
    return list;
  }
  
  @NotNull
  public static final String toHexString(long paramLong) {
    long l = a ^ 0x79BEC9710E55L;
    String str = Long.toHexString(paramLong);
    Intrinsics.checkNotNullExpressionValue(str, "toHexString(this)");
    return str;
  }
  
  public static final boolean hasIntersection(@NotNull String[] paramArrayOfString1, @Nullable String[] paramArrayOfString2, @NotNull Comparator<String> paramComparator) {
    long l = a ^ 0x2959AE0BD104L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfString1, "<this>");
      Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!((paramArrayOfString1.length == 0) ? 1 : 0))
        try {
          if (paramArrayOfString2 != null) {
            try {
            
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            try {
              if (!((paramArrayOfString2.length == 0) ? 1 : 0)) {
                byte b = 0;
                int i = paramArrayOfString1.length;
                while (b < i) {
                  String str = paramArrayOfString1[b];
                  b++;
                  Iterator<String> iterator = ArrayIteratorKt.iterator((Object[])paramArrayOfString2);
                  while (iterator.hasNext()) {
                    String str1 = iterator.next();
                    if (paramComparator.compare(str, str1) == 0)
                      return true; 
                  } 
                } 
                return false;
              } 
              return false;
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static final int indexOfLastNonAsciiWhitespace(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x23F0992361L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = paramInt2 - 1;
    if (paramInt1 <= i)
      while (true) {
        int j = i;
        i--;
        char c = paramString.charAt(j);
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        if (((((c == '\t') ? true : ((c == '\n'))) ? true : ((c == '\f'))) ? true : ((c == '\r'))) ? true : ((c == ' '))) {
          if (j == paramInt1)
            break; 
          continue;
        } 
        return j + 1;
      }  
    return paramInt1;
  }
  
  public static final void notifyAll(@NotNull Object paramObject) {
    long l = a ^ 0x1C00041AE39L;
    Intrinsics.checkNotNullParameter(paramObject, "<this>");
    boolean bool = false;
    paramObject.notifyAll();
  }
  
  public static final long toLongOrDefault(@NotNull String paramString, long paramLong) {
    long l2;
    long l1 = a ^ 0x309496B5DA9BL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    try {
      l2 = Long.parseLong(paramString);
    } catch (NumberFormatException numberFormatException) {
      l2 = paramLong;
    } 
    return l2;
  }
  
  @NotNull
  public static final Headers toHeaders(@NotNull List paramList) {
    long l = a ^ 0x79FBCE26811L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Headers.Builder builder = new Headers.Builder();
    for (Header header : paramList) {
      ByteString byteString1 = header.component1();
      ByteString byteString2 = header.component2();
      builder.addLenient$okhttp(byteString1.utf8(), byteString2.utf8());
    } 
    return builder.build();
  }
  
  @NotNull
  public static final Charset readBomAsCharset(@NotNull BufferedSource paramBufferedSource, @NotNull Charset paramCharset) throws IOException {
    Charset charset;
    long l = a ^ 0x872476570DBL;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "default");
    switch (paramBufferedSource.select(UNICODE_BOMS)) {
      case 0:
        charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
      case 1:
        charset = StandardCharsets.UTF_16BE;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_16BE");
      case 2:
        charset = StandardCharsets.UTF_16LE;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_16LE");
      case 3:
      
      case 4:
      
      case -1:
      
    } 
    throw new AssertionError();
  }
  
  public static final void notify(@NotNull Object paramObject) {
    long l = a ^ 0x53C788DC3C47L;
    Intrinsics.checkNotNullParameter(paramObject, "<this>");
    boolean bool = false;
    paramObject.notify();
  }
  
  public static final int indexOfFirstNonAsciiWhitespace(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x719C14F0C104L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = paramInt1;
    while (i < paramInt2) {
      int j = i;
      i++;
      char c = paramString.charAt(j);
      try {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      if (((((c == '\t') ? true : ((c == '\n'))) ? true : ((c == '\f'))) ? true : ((c == '\r'))) ? true : ((c == ' ')))
        continue; 
      return j;
    } 
    return paramInt2;
  }
  
  public static final void assertThreadHoldsLock(@NotNull Object paramObject) {
    long l = a ^ 0x81F883674D8L;
    Intrinsics.checkNotNullParameter(paramObject, "<this>");
    boolean bool = false;
    try {
      if (assertionsEnabled)
        try {
          if (!Thread.holdsLock(paramObject))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + paramObject); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static final void threadName(@NotNull String paramString, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x6FF7331D0815L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool = false;
    Thread thread = Thread.currentThread();
    String str = thread.getName();
    thread.setName(paramString);
    try {
      paramFunction0.invoke();
    } finally {
      InlineMarker.finallyStart(1);
      thread.setName(str);
      InlineMarker.finallyEnd(1);
    } 
  }
  
  public static final int indexOfControlOrNonAscii(@NotNull String paramString) {
    long l = a ^ 0x5B4D7E0A91CFL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    byte b = 0;
    int i = paramString.length();
    while (b < i) {
      byte b1 = b;
      b++;
      char c = paramString.charAt(b1);
      try {
        if (Intrinsics.compare(c, 31) <= 0 || Intrinsics.compare(c, 127) >= 0)
          return b1; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return -1;
  }
  
  @NotNull
  public static final List toHeaderList(@NotNull Headers paramHeaders) {
    long l = a ^ 0xE91B83496F2L;
    Intrinsics.checkNotNullParameter(paramHeaders, "<this>");
    Iterable iterable1 = (Iterable)RangesKt.until(0, paramHeaders.size());
    boolean bool1 = false;
    Iterable iterable2 = iterable1;
    ArrayList<Header> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10));
    boolean bool2 = false;
    Iterator iterator = iterable2.iterator();
    while (iterator.hasNext()) {
      int i = ((IntIterator)iterator).nextInt();
      int j = i;
      ArrayList<Header> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(new Header(paramHeaders.name(j), paramHeaders.value(j)));
    } 
    return arrayList;
  }
  
  public static final int readMedium(@NotNull BufferedSource paramBufferedSource) throws IOException {
    long l = a ^ 0x44751E9874D6L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<this>");
    return and(paramBufferedSource.readByte(), 255) << 16 | and(paramBufferedSource.readByte(), 255) << 8 | and(paramBufferedSource.readByte(), 255);
  }
  
  public static final long and(int paramInt, long paramLong) {
    return paramInt & paramLong;
  }
  
  public static final int skipAll(@NotNull Buffer paramBuffer, byte paramByte) {
    long l = a ^ 0x11404B368E20L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    int i = 0;
    while (true) {
      try {
        if (!paramBuffer.exhausted() && paramBuffer.getByte(0L) == paramByte) {
          int j = i;
          i = j + 1;
          paramBuffer.readByte();
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      break;
    } 
    return i;
  }
  
  @SafeVarargs
  @NotNull
  public static final List immutableListOf(@NotNull Object... paramVarArgs) {
    long l = a ^ 0x706110416132L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    Object[] arrayOfObject = (Object[])paramVarArgs.clone();
    List<?> list = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(arrayOfObject, arrayOfObject.length)));
    Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(listOf(*elements.clone()))");
    return list;
  }
  
  public static final boolean isCivilized(@NotNull FileSystem paramFileSystem, @NotNull File paramFile) {
    long l = a ^ 0x2B656288D1ACL;
    Intrinsics.checkNotNullParameter(paramFileSystem, "<this>");
    Intrinsics.checkNotNullParameter(paramFile, "file");
    Closeable closeable = (Closeable)paramFileSystem.sink(paramFile);
    Throwable throwable = null;
    try {
      Sink sink = (Sink)closeable;
      boolean bool = false;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
    paramFileSystem.delete(paramFile);
    return false;
  }
  
  public static final void closeQuietly(@NotNull Socket paramSocket) {
    long l = a ^ 0x32D9088B55A0L;
    Intrinsics.checkNotNullParameter(paramSocket, "<this>");
    try {
      paramSocket.close();
    } catch (AssertionError assertionError) {
      throw assertionError;
    } catch (RuntimeException runtimeException) {
      try {
        if (Intrinsics.areEqual(runtimeException.getMessage(), "bio == null"))
          return; 
      } catch (AssertionError assertionError) {
        throw a(null);
      } 
      throw runtimeException;
    } catch (Exception exception) {}
  }
  
  @NotNull
  public static final ThreadFactory threadFactory(@NotNull String paramString, boolean paramBoolean) {
    long l = a ^ 0x6F33D000AC3AL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return paramRunnable -> {
        long l = a ^ 0x456F124CCD42L;
        Intrinsics.checkNotNullParameter(paramString, "$name");
        Thread thread1 = new Thread(paramRunnable, paramString);
        Thread thread2 = thread1;
        boolean bool = false;
        thread2.setDaemon(paramBoolean);
        return thread1;
      };
  }
  
  public static final void closeQuietly(@NotNull ServerSocket paramServerSocket) {
    long l = a ^ 0x2DAF1DB35CD5L;
    Intrinsics.checkNotNullParameter(paramServerSocket, "<this>");
    try {
      paramServerSocket.close();
    } catch (RuntimeException runtimeException) {
      throw runtimeException;
    } catch (Exception exception) {}
  }
  
  public static final void ignoreIoExceptions(@NotNull Function0 paramFunction0) {
    long l = a ^ 0x6DA2898DE644L;
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool = false;
    try {
      paramFunction0.invoke();
    } catch (IOException iOException) {}
  }
  
  public static final int and(short paramShort, int paramInt) {
    return paramShort & paramInt;
  }
  
  public static final boolean canParseAsIpAddress(@NotNull String paramString) {
    long l = a ^ 0x89D85786D71L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return VERIFY_AS_IP_ADDRESS.matches(paramString);
  }
  
  public static final int indexOf(@NotNull String[] paramArrayOfString, @NotNull String paramString, @NotNull Comparator<String> paramComparator) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.a : J
    //   3: ldc2_w 96464092510725
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'value'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_2
    //   22: ldc 'comparator'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: aload_0
    //   28: astore #5
    //   30: iconst_0
    //   31: istore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: aload #5
    //   38: arraylength
    //   39: istore #8
    //   41: iload #7
    //   43: iload #8
    //   45: if_icmpge -> 97
    //   48: aload #5
    //   50: iload #7
    //   52: aaload
    //   53: astore #9
    //   55: iconst_0
    //   56: istore #10
    //   58: aload_2
    //   59: aload #9
    //   61: aload_1
    //   62: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   67: ifne -> 78
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   77: athrow
    //   78: iconst_0
    //   79: ifeq -> 91
    //   82: iload #7
    //   84: goto -> 98
    //   87: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   90: athrow
    //   91: iinc #7, 1
    //   94: goto -> 41
    //   97: iconst_m1
    //   98: ireturn
    // Exception table:
    //   from	to	target	type
    //   58	74	74	java/lang/IllegalStateException
    //   79	87	87	java/lang/IllegalStateException
  }
  
  @NotNull
  public static final String peerName(@NotNull Socket paramSocket) {
    long l = a ^ 0x78709215B51L;
    Intrinsics.checkNotNullParameter(paramSocket, "<this>");
    SocketAddress socketAddress = paramSocket.getRemoteSocketAddress();
    String str = ((InetSocketAddress)socketAddress).getHostName();
    Intrinsics.checkNotNullExpressionValue(str, "address.hostName");
    return (socketAddress instanceof InetSocketAddress) ? str : socketAddress.toString();
  }
  
  public static final boolean discard(@NotNull Source paramSource, int paramInt, @NotNull TimeUnit paramTimeUnit) {
    boolean bool;
    long l = a ^ 0x102462329C5EL;
    Intrinsics.checkNotNullParameter(paramSource, "<this>");
    Intrinsics.checkNotNullParameter(paramTimeUnit, "timeUnit");
    try {
      bool = skipAll(paramSource, paramInt, paramTimeUnit);
    } catch (IOException iOException) {
      bool = false;
    } 
    return bool;
  }
  
  @NotNull
  public static final String trimSubstring(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x599AC7CDE303L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = indexOfFirstNonAsciiWhitespace(paramString, paramInt1, paramInt2);
    int j = indexOfLastNonAsciiWhitespace(paramString, i, paramInt2);
    Intrinsics.checkNotNullExpressionValue(paramString.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
    return paramString.substring(i, j);
  }
  
  public static final void checkOffsetAndCount(long paramLong1, long paramLong2, long paramLong3) {
    try {
      if ((paramLong2 | paramLong3) >= 0L)
        try {
          if (paramLong2 <= paramLong1)
            try {
              if (paramLong1 - paramLong2 >= paramLong3)
                return; 
              throw new ArrayIndexOutOfBoundsException();
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public static final int and(byte paramByte, int paramInt) {
    return paramByte & paramInt;
  }
  
  public static final void writeMedium(@NotNull BufferedSink paramBufferedSink, int paramInt) throws IOException {
    long l = a ^ 0x5D703C0A313EL;
    Intrinsics.checkNotNullParameter(paramBufferedSink, "<this>");
    paramBufferedSink.writeByte(paramInt >>> 16 & 0xFF);
    paramBufferedSink.writeByte(paramInt >>> 8 & 0xFF);
    paramBufferedSink.writeByte(paramInt & 0xFF);
  }
  
  public static final boolean skipAll(@NotNull Source paramSource, int paramInt, @NotNull TimeUnit paramTimeUnit) throws IOException {
    boolean bool;
    long l1 = a ^ 0x664577538740L;
    Intrinsics.checkNotNullParameter(paramSource, "<this>");
    Intrinsics.checkNotNullParameter(paramTimeUnit, "timeUnit");
    long l2 = System.nanoTime();
    try {
    
    } catch (InterruptedIOException interruptedIOException) {
      throw a(null);
    } 
    long l3 = paramSource.timeout().hasDeadline() ? (paramSource.timeout().deadlineNanoTime() - l2) : Long.MAX_VALUE;
    long l4 = paramTimeUnit.toNanos(paramInt);
    paramSource.timeout().deadlineNanoTime(l2 + Math.min(l3, l4));
    try {
      Buffer buffer = new Buffer();
      try {
        while (paramSource.read(buffer, 8192L) != -1L)
          buffer.clear(); 
      } catch (InterruptedIOException interruptedIOException) {
        throw a(null);
      } 
      bool = true;
    } catch (InterruptedIOException interruptedIOException) {
      bool = false;
    } finally {
      try {
        if (l3 == Long.MAX_VALUE) {
          paramSource.timeout().clearDeadline();
        } else {
          paramSource.timeout().deadlineNanoTime(l2 + l3);
        } 
      } catch (InterruptedIOException interruptedIOException) {
        throw a(null);
      } 
    } 
    return bool;
  }
  
  public static final void closeQuietly(@NotNull Closeable paramCloseable) {
    long l = a ^ 0x760E75483A59L;
    Intrinsics.checkNotNullParameter(paramCloseable, "<this>");
    try {
      paramCloseable.close();
    } catch (RuntimeException runtimeException) {
      throw runtimeException;
    } catch (Exception exception) {}
  }
  
  public static final int parseHexDigit(char paramChar) {
    char c = paramChar;
    try {
      if ('0' <= c) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      try {
        if ('a' <= c) {
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } else {
        
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        try {
          if ('A' <= c) {
            try {
            
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false ? (paramChar - 48) : (false ? (paramChar - 97 + 10) : (false ? (paramChar - 65 + 10) : -1));
  }
  
  @NotNull
  public static final String format(@NotNull String paramString, @NotNull Object... paramVarArgs) {
    long l = a ^ 0x1436CE3040D5L;
    Intrinsics.checkNotNullParameter(paramString, "format");
    Intrinsics.checkNotNullParameter(paramVarArgs, "args");
    Locale locale = Locale.US;
    Object[] arrayOfObject = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
    Intrinsics.checkNotNullExpressionValue(String.format(locale, paramString, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(locale, format, *args)");
    return String.format(locale, paramString, Arrays.copyOf(arrayOfObject, arrayOfObject.length));
  }
  
  public static final boolean canReuseConnectionFor(@NotNull HttpUrl paramHttpUrl1, @NotNull HttpUrl paramHttpUrl2) {
    long l = a ^ 0x49B31E418501L;
    try {
      Intrinsics.checkNotNullParameter(paramHttpUrl1, "<this>");
      Intrinsics.checkNotNullParameter(paramHttpUrl2, "other");
      if (Intrinsics.areEqual(paramHttpUrl1.host(), paramHttpUrl2.host()))
        try {
          if (paramHttpUrl1.port() == paramHttpUrl2.port())
            try {
              if (Intrinsics.areEqual(paramHttpUrl1.scheme(), paramHttpUrl2.scheme()));
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static final void assertThreadDoesntHoldLock(@NotNull Object paramObject) {
    long l = a ^ 0x692121CA9249L;
    Intrinsics.checkNotNullParameter(paramObject, "<this>");
    boolean bool = false;
    try {
      if (assertionsEnabled)
        try {
          if (Thread.holdsLock(paramObject))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + paramObject); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static final int indexOfNonWhitespace(@NotNull String paramString, int paramInt) {
    long l = a ^ 0x41B7EEBDE17L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = paramInt;
    int j = paramString.length();
    while (i < j) {
      int k = i;
      i++;
      char c = paramString.charAt(k);
      if (c != ' ' && c != '\t')
        return k; 
    } 
    return paramString.length();
  }
  
  public static final int delimiterOffset(@NotNull String paramString1, @NotNull String paramString2, int paramInt1, int paramInt2) {
    long l = a ^ 0x30C5A95D1BB4L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiters");
    int i = paramInt1;
    while (i < paramInt2) {
      int j = i;
      i++;
      if (StringsKt.contains$default(paramString2, paramString1.charAt(j), false, 2, null))
        return j; 
    } 
    return paramInt2;
  }
  
  public static final void wait(@NotNull Object paramObject) {
    long l = a ^ 0x5E90E79AE97BL;
    Intrinsics.checkNotNullParameter(paramObject, "<this>");
    boolean bool = false;
    paramObject.wait();
  }
  
  @NotNull
  public static final String[] concat(@NotNull String[] paramArrayOfString, @NotNull String paramString) {
    long l = a ^ 0x7C5731C540A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfString, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "value");
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(paramArrayOfString, paramArrayOfString.length + 1), "copyOf(this, newSize)");
    String[] arrayOfString = Arrays.copyOf(paramArrayOfString, paramArrayOfString.length + 1);
    arrayOfString[ArraysKt.getLastIndex((Object[])arrayOfString)] = paramString;
    return arrayOfString;
  }
  
  @NotNull
  public static final String toHexString(int paramInt) {
    long l = a ^ 0x1D4ABCC50575L;
    String str = Integer.toHexString(paramInt);
    Intrinsics.checkNotNullExpressionValue(str, "toHexString(this)");
    return str;
  }
  
  public static final boolean isHealthy(@NotNull Socket paramSocket, @NotNull BufferedSource paramBufferedSource) {
    boolean bool;
    long l = a ^ 0x25CB8BB7F3CL;
    Intrinsics.checkNotNullParameter(paramSocket, "<this>");
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    try {
      boolean bool1;
      bool = paramSocket.getSoTimeout();
      try {
        try {
          paramSocket.setSoTimeout(1);
        } catch (SocketTimeoutException socketTimeoutException) {
          throw a(null);
        } 
        bool1 = !paramBufferedSource.exhausted() ? true : false;
      } finally {
        paramSocket.setSoTimeout(bool);
      } 
      bool = bool1;
    } catch (SocketTimeoutException socketTimeoutException) {
      bool = true;
    } catch (IOException iOException) {
      bool = false;
    } 
    return bool;
  }
  
  @Nullable
  public static final Object readFieldOrNull(@NotNull Object paramObject, @NotNull Class paramClass, @NotNull String paramString) {
    long l = a ^ 0x1B5EB43BE7C7L;
    Intrinsics.checkNotNullParameter(paramObject, "instance");
    Intrinsics.checkNotNullParameter(paramClass, "fieldType");
    Intrinsics.checkNotNullParameter(paramString, "fieldName");
    Class<?> clazz = paramObject.getClass();
    while (!Intrinsics.areEqual(clazz, Object.class)) {
      try {
        Field field = clazz.getDeclaredField(paramString);
        field.setAccessible(true);
        Object object = field.get(paramObject);
        try {
        
        } catch (NoSuchFieldException noSuchFieldException) {
          throw a(null);
        } 
        return !paramClass.isInstance(object) ? null : paramClass.cast(object);
      } catch (NoSuchFieldException noSuchFieldException) {
        Class<?> clazz1 = clazz.getSuperclass();
        Intrinsics.checkNotNullExpressionValue(clazz1, "c.superclass");
        clazz = clazz1;
      } 
    } 
    if (!Intrinsics.areEqual(paramString, "delegate")) {
      Object object = readFieldOrNull(paramObject, Object.class, "delegate");
      try {
        if (object != null)
          return readFieldOrNull(object, paramClass, paramString); 
      } catch (NoSuchFieldException noSuchFieldException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  @NotNull
  public static final Throwable withSuppressed(@NotNull Exception paramException, @NotNull List paramList) {
    long l = a ^ 0x703230F4A135L;
    Intrinsics.checkNotNullParameter(paramException, "<this>");
    Intrinsics.checkNotNullParameter(paramList, "suppressed");
    Exception exception1 = paramException;
    Exception exception2 = exception1;
    boolean bool = false;
    try {
      if (paramList.size() > 1)
        System.out.println(paramList); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (Exception exception : paramList)
      ExceptionsKt.addSuppressed(exception2, exception); 
    return exception1;
  }
  
  static {
    long l = a ^ 0x22BA88524E71L;
    EMPTY_BYTE_ARRAY = new byte[0];
    EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, EMPTY_BYTE_ARRAY, null, 1, null);
    EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, EMPTY_BYTE_ARRAY, null, 0, 0, 7, null);
    ByteString[] arrayOfByteString = new ByteString[5];
    arrayOfByteString[0] = ByteString.Companion.decodeHex("efbbbf");
    arrayOfByteString[1] = ByteString.Companion.decodeHex("feff");
    arrayOfByteString[2] = ByteString.Companion.decodeHex("fffe");
    arrayOfByteString[3] = ByteString.Companion.decodeHex("0000ffff");
    arrayOfByteString[4] = ByteString.Companion.decodeHex("ffff0000");
    UNICODE_BOMS = Options.Companion.of(arrayOfByteString);
    Intrinsics.checkNotNull(TimeZone.getTimeZone("GMT"));
    UTC = TimeZone.getTimeZone("GMT");
    VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    assertionsEnabled = OkHttpClient.class.desiredAssertionStatus();
    String str = OkHttpClient.class.getName();
    Intrinsics.checkNotNullExpressionValue(str, "OkHttpClient::class.java.name");
    okHttpName = StringsKt.removeSuffix(StringsKt.removePrefix(str, "me.rerere.matrix.thirdparty.okhttp3."), "Client");
  }
  
  public static final int toNonNegativeInt(@Nullable String paramString, int paramInt) {
    try {
      String str = paramString;
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (((str == null) ? null : Long.valueOf(Long.parseLong(str))) == null) {
          (str == null) ? null : Long.valueOf(Long.parseLong(str));
          return paramInt;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      long l = ((str == null) ? null : Long.valueOf(Long.parseLong(str))).longValue();
      try {
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return (l > 2147483647L) ? Integer.MAX_VALUE : ((l < 0L) ? 0 : (int)l);
    } catch (NumberFormatException numberFormatException) {
      return paramInt;
    } 
  }
  
  @NotNull
  public static final List toImmutableList(@NotNull List paramList) {
    long l = a ^ 0x684039B14E22L;
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    List<?> list = Collections.unmodifiableList(CollectionsKt.toMutableList(paramList));
    Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(toMutableList())");
    return list;
  }
  
  public static final int delimiterOffset(@NotNull String paramString, char paramChar, int paramInt1, int paramInt2) {
    long l = a ^ 0xBDF40FC3F84L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = paramInt1;
    while (i < paramInt2) {
      int j = i;
      i++;
      if (paramString.charAt(j) == paramChar)
        return j; 
    } 
    return paramInt2;
  }
  
  @NotNull
  public static final Map toImmutableMap(@NotNull Map<?, ?> paramMap) {
    long l = a ^ 0x6E55DDA9524FL;
    try {
      Intrinsics.checkNotNullParameter(paramMap, "<this>");
      Map<?, ?> map = Collections.unmodifiableMap(new LinkedHashMap<>(paramMap));
      Intrinsics.checkNotNullExpressionValue(map, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramMap.isEmpty() ? MapsKt.emptyMap() : map;
  }
  
  public static final boolean isSensitiveHeader(@NotNull String paramString) {
    long l = a ^ 0x786D11CB5D08L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "name");
      if (!StringsKt.equals(paramString, "Authorization", true))
        try {
          if (!StringsKt.equals(paramString, "Cookie", true))
            try {
              if (!StringsKt.equals(paramString, "Proxy-Authorization", true)) {
                try {
                  if (StringsKt.equals(paramString, "Set-Cookie", true));
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static final long headersContentLength(@NotNull Response paramResponse) {
    long l = a ^ 0x3D8A57EBB67CL;
    try {
      Intrinsics.checkNotNullParameter(paramResponse, "<this>");
      paramResponse.headers().get("Content-Length");
      long l1 = toLongOrDefault(paramResponse.headers().get("Content-Length"), -1L);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramResponse.headers().get("Content-Length") == null) ? -1L : l1;
  }
  
  @NotNull
  public static final EventListener.Factory asFactory(@NotNull EventListener paramEventListener) {
    long l = a ^ 0x77701194B85L;
    Intrinsics.checkNotNullParameter(paramEventListener, "<this>");
    return paramCall -> {
        long l = a ^ 0x168ADF21276BL;
        Intrinsics.checkNotNullParameter(paramEventListener, "$this_asFactory");
        Intrinsics.checkNotNullParameter(paramCall, "it");
        return (EventListener.Factory)paramEventListener;
      };
  }
  
  @NotNull
  public static final String[] intersect(@NotNull String[] paramArrayOfString1, @NotNull String[] paramArrayOfString2, @NotNull Comparator<String> paramComparator) {
    long l = a ^ 0x835E5B78E3FL;
    Intrinsics.checkNotNullParameter(paramArrayOfString1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfString2, "other");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    ArrayList<String> arrayList1 = new ArrayList();
    byte b = 0;
    int i = paramArrayOfString1.length;
    while (b < i) {
      String str = paramArrayOfString1[b];
      b++;
      byte b1 = 0;
      int j = paramArrayOfString2.length;
      while (b1 < j) {
        String str1 = paramArrayOfString2[b1];
        b1++;
        if (paramComparator.compare(str, str1) == 0)
          arrayList1.add(str); 
      } 
    } 
    ArrayList<String> arrayList2 = arrayList1;
    i = 0;
    ArrayList<String> arrayList3 = arrayList2;
    try {
      if (arrayList3.toArray(new String[0]) == null) {
        arrayList3.toArray(new String[0]);
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return arrayList3.toArray(new String[0]);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */