package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class ResponseBody implements Closeable {
  @NotNull
  public static final ResponseBody$Companion Companion;
  
  @Nullable
  private Reader reader;
  
  private static final long b = o3.a(-8460162439828611960L, -454546035205276359L, MethodHandles.lookup().lookupClass()).a(215920851697851L);
  
  @NotNull
  public static final ResponseBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType) {
    return Companion.create(paramArrayOfbyte, paramMediaType);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.toResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final ResponseBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte) {
    return Companion.create(paramMediaType, paramArrayOfbyte);
  }
  
  @Nullable
  public abstract MediaType contentType();
  
  @NotNull
  public final Reader charStream() {
    Reader reader = this.reader;
    ResponseBody$BomAwareReader responseBody$BomAwareReader1 = new ResponseBody$BomAwareReader(source(), charset());
    ResponseBody$BomAwareReader responseBody$BomAwareReader2 = responseBody$BomAwareReader1;
    boolean bool = false;
    this.reader = responseBody$BomAwareReader2;
    return (reader == null) ? responseBody$BomAwareReader1 : reader;
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.toResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final ResponseBody create(@Nullable MediaType paramMediaType, @NotNull ByteString paramByteString) {
    return Companion.create(paramMediaType, paramByteString);
  }
  
  static {
    Companion = new ResponseBody$Companion(null);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.asResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final ResponseBody create(@Nullable MediaType paramMediaType, long paramLong, @NotNull BufferedSource paramBufferedSource) {
    return Companion.create(paramMediaType, paramLong, paramBufferedSource);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.toResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final ResponseBody create(@Nullable MediaType paramMediaType, @NotNull String paramString) {
    return Companion.create(paramMediaType, paramString);
  }
  
  public abstract long contentLength();
  
  @NotNull
  public final InputStream byteStream() {
    return source().inputStream();
  }
  
  @NotNull
  public static final ResponseBody create(@NotNull ByteString paramByteString, @Nullable MediaType paramMediaType) {
    return Companion.create(paramByteString, paramMediaType);
  }
  
  @NotNull
  public abstract BufferedSource source();
  
  @NotNull
  public final byte[] bytes() throws IOException {
    long l1 = b ^ 0x57B900D4755DL;
    ResponseBody responseBody = this;
    boolean bool1 = false;
    long l2 = responseBody.contentLength();
    try {
      if (l2 > 2147483647L)
        throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(l2))); 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Closeable closeable = (Closeable)responseBody.source();
    Throwable throwable = null;
    try {
      BufferedSource bufferedSource = (BufferedSource)closeable;
      boolean bool = false;
      byte[] arrayOfByte = bufferedSource.readByteArray();
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
    byte[] arrayOfByte2 = arrayOfByte;
    byte[] arrayOfByte1 = arrayOfByte2;
    boolean bool2 = false;
    int i = arrayOfByte1.length;
    try {
      if (l2 != -1L)
        try {
          if (l2 != i)
            throw new IOException("Content-Length (" + l2 + ") and stream length (" + i + ") disagree"); 
        } catch (Throwable throwable1) {
          throw a(null);
        }  
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    return arrayOfByte2;
  }
  
  @NotNull
  public final String string() throws IOException {
    Closeable closeable = (Closeable)source();
    Throwable throwable = null;
    try {
      BufferedSource bufferedSource = (BufferedSource)closeable;
      boolean bool = false;
      String str = bufferedSource.readString(Util.readBomAsCharset(bufferedSource, charset()));
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
    return str;
  }
  
  @NotNull
  public final ByteString byteString() throws IOException {
    long l1 = b ^ 0x3B88B4AD11F0L;
    ResponseBody responseBody = this;
    boolean bool1 = false;
    long l2 = responseBody.contentLength();
    try {
      if (l2 > 2147483647L)
        throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(l2))); 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Closeable closeable = (Closeable)responseBody.source();
    Throwable throwable = null;
    try {
      BufferedSource bufferedSource = (BufferedSource)closeable;
      boolean bool = false;
      ByteString byteString = bufferedSource.readByteString();
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
    ByteString byteString2 = byteString;
    ByteString byteString1 = byteString2;
    boolean bool2 = false;
    int i = byteString1.size();
    try {
      if (l2 != -1L)
        try {
          if (l2 != i)
            throw new IOException("Content-Length (" + l2 + ") and stream length (" + i + ") disagree"); 
        } catch (Throwable throwable1) {
          throw a(null);
        }  
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    return byteString2;
  }
  
  @NotNull
  public static final ResponseBody create(@NotNull BufferedSource paramBufferedSource, @Nullable MediaType paramMediaType, long paramLong) {
    return Companion.create(paramBufferedSource, paramMediaType, paramLong);
  }
  
  @NotNull
  public static final ResponseBody create(@NotNull String paramString, @Nullable MediaType paramMediaType) {
    return Companion.create(paramString, paramMediaType);
  }
  
  public void close() {
    Util.closeQuietly((Closeable)source());
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ResponseBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */