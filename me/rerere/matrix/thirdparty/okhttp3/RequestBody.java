package me.rerere.matrix.thirdparty.okhttp3;

import java.io.File;
import java.io.IOException;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class RequestBody {
  @NotNull
  public static final RequestBody$Companion Companion = new RequestBody$Companion(null);
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte) {
    return Companion.create(paramMediaType, paramArrayOfbyte);
  }
  
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@NotNull byte[] paramArrayOfbyte) {
    return Companion.create(paramArrayOfbyte);
  }
  
  public abstract void writeTo(@NotNull BufferedSink paramBufferedSink) throws IOException;
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Companion.create(paramMediaType, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final RequestBody create(@Nullable MediaType paramMediaType, @NotNull ByteString paramByteString) {
    return Companion.create(paramMediaType, paramByteString);
  }
  
  @NotNull
  public static final RequestBody create(@NotNull ByteString paramByteString, @Nullable MediaType paramMediaType) {
    return Companion.create(paramByteString, paramMediaType);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.asRequestBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final RequestBody create(@Nullable MediaType paramMediaType, @NotNull File paramFile) {
    return Companion.create(paramMediaType, paramFile);
  }
  
  @Nullable
  public abstract MediaType contentType();
  
  public boolean isDuplex() {
    return false;
  }
  
  @NotNull
  public static final RequestBody create(@NotNull File paramFile, @Nullable MediaType paramMediaType) {
    return Companion.create(paramFile, paramMediaType);
  }
  
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType, int paramInt) {
    return Companion.create(paramArrayOfbyte, paramMediaType, paramInt);
  }
  
  @NotNull
  public static final RequestBody create(@NotNull String paramString, @Nullable MediaType paramMediaType) {
    return Companion.create(paramString, paramMediaType);
  }
  
  public long contentLength() throws IOException {
    return -1L;
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte, int paramInt) {
    return Companion.create(paramMediaType, paramArrayOfbyte, paramInt);
  }
  
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType, int paramInt1, int paramInt2) {
    return Companion.create(paramArrayOfbyte, paramMediaType, paramInt1, paramInt2);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final RequestBody create(@Nullable MediaType paramMediaType, @NotNull String paramString) {
    return Companion.create(paramMediaType, paramString);
  }
  
  public boolean isOneShot() {
    return false;
  }
  
  @JvmOverloads
  @NotNull
  public static final RequestBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType) {
    return Companion.create(paramArrayOfbyte, paramMediaType);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\RequestBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */