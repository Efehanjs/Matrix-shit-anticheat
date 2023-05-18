package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ResponseBody$Companion {
  private static final long a = o3.a(-386174401425562714L, -5501809536172794911L, MethodHandles.lookup().lookupClass()).a(66921976785364L);
  
  @NotNull
  public final ResponseBody create(@NotNull String paramString, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x5BD743CA97BDL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Charset charset = Charsets.UTF_8;
    MediaType mediaType = paramMediaType;
    if (paramMediaType != null) {
      Charset charset1 = MediaType.charset$default(paramMediaType, null, 1, null);
      if (charset1 == null) {
        charset = Charsets.UTF_8;
        mediaType = MediaType.Companion.parse(paramMediaType + "; charset=utf-8");
      } else {
        charset = charset1;
      } 
    } 
    Buffer buffer = (new Buffer()).writeString(paramString, charset);
    return create((BufferedSource)buffer, mediaType, buffer.size());
  }
  
  @NotNull
  public final ResponseBody create(@NotNull ByteString paramByteString, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x598712497314L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    return create((BufferedSource)(new Buffer()).write(paramByteString), paramMediaType, paramByteString.size());
  }
  
  @NotNull
  public final ResponseBody create(@NotNull BufferedSource paramBufferedSource, @Nullable MediaType paramMediaType, long paramLong) {
    long l = a ^ 0x2ACED39A8FF5L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "<this>");
    return new ResponseBody$Companion$asResponseBody$1(paramMediaType, paramLong, paramBufferedSource);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.toResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final ResponseBody create(@Nullable MediaType paramMediaType, @NotNull String paramString) {
    long l = a ^ 0x4B7E9DB95D48L;
    Intrinsics.checkNotNullParameter(paramString, "content");
    return create(paramString, paramMediaType);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.asResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final ResponseBody create(@Nullable MediaType paramMediaType, long paramLong, @NotNull BufferedSource paramBufferedSource) {
    long l = a ^ 0x179CE1C65993L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "content");
    return create(paramBufferedSource, paramMediaType, paramLong);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.toResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final ResponseBody create(@Nullable MediaType paramMediaType, @NotNull ByteString paramByteString) {
    long l = a ^ 0x2F05E8790980L;
    Intrinsics.checkNotNullParameter(paramByteString, "content");
    return create(paramByteString, paramMediaType);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.ResponseBody.Companion.toResponseBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final ResponseBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x1AF5B5695F65L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "content");
    return create(paramArrayOfbyte, paramMediaType);
  }
  
  @NotNull
  public final ResponseBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x7F09B0998A75L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return create((BufferedSource)(new Buffer()).write(paramArrayOfbyte), paramMediaType, paramArrayOfbyte.length);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ResponseBody$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */