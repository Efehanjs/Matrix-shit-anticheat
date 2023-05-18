package me.rerere.matrix.thirdparty.okhttp3;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RequestBody$Companion {
  private static final long a = o3.a(-2902450539406382945L, -3271923550528034009L, MethodHandles.lookup().lookupClass()).a(157298672596737L);
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final RequestBody create(@Nullable MediaType paramMediaType, @NotNull ByteString paramByteString) {
    long l = a ^ 0x1847708E6D58L;
    Intrinsics.checkNotNullParameter(paramByteString, "content");
    return create(paramByteString, paramMediaType);
  }
  
  @NotNull
  public final RequestBody create(@NotNull ByteString paramByteString, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x2A26912EE9E8L;
    Intrinsics.checkNotNullParameter(paramByteString, "<this>");
    return new RequestBody$Companion$toRequestBody$1(paramMediaType, paramByteString);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @JvmOverloads
  @NotNull
  public final RequestBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x67E8C559C49EL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "content");
    return create$default(this, paramMediaType, paramArrayOfbyte, 0, 0, 12, (Object)null);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final RequestBody create(@Nullable MediaType paramMediaType, @NotNull String paramString) {
    long l = a ^ 0x1AC821569471L;
    Intrinsics.checkNotNullParameter(paramString, "content");
    return create(paramString, paramMediaType);
  }
  
  @JvmOverloads
  @NotNull
  public final RequestBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType, int paramInt1, int paramInt2) {
    long l = a ^ 0x4E2176C5C7C6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Util.checkOffsetAndCount(paramArrayOfbyte.length, paramInt1, paramInt2);
    return new RequestBody$Companion$toRequestBody$2(paramMediaType, paramInt2, paramArrayOfbyte, paramInt1);
  }
  
  @JvmOverloads
  @NotNull
  public final RequestBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType, int paramInt) {
    long l = a ^ 0x518A33AE221BL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return create$default(this, paramArrayOfbyte, paramMediaType, paramInt, 0, 4, (Object)null);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @JvmOverloads
  @NotNull
  public final RequestBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x5F131E8FFA09L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "content");
    return create(paramArrayOfbyte, paramMediaType, paramInt1, paramInt2);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.asRequestBody"}), level = DeprecationLevel.WARNING)
  @NotNull
  public final RequestBody create(@Nullable MediaType paramMediaType, @NotNull File paramFile) {
    long l = a ^ 0x3FE23C31FC1FL;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return create(paramFile, paramMediaType);
  }
  
  @NotNull
  public final RequestBody create(@NotNull String paramString, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x28A759513E12L;
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
    Intrinsics.checkNotNullExpressionValue(paramString.getBytes(charset), "this as java.lang.String).getBytes(charset)");
    byte[] arrayOfByte = paramString.getBytes(charset);
    return create(arrayOfByte, mediaType, 0, arrayOfByte.length);
  }
  
  @Deprecated(message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okhttp3.RequestBody.Companion.toRequestBody"}), level = DeprecationLevel.WARNING)
  @JvmOverloads
  @NotNull
  public final RequestBody create(@Nullable MediaType paramMediaType, @NotNull byte[] paramArrayOfbyte, int paramInt) {
    long l = a ^ 0x7D1394849244L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "content");
    return create$default(this, paramMediaType, paramArrayOfbyte, paramInt, 0, 8, (Object)null);
  }
  
  @JvmOverloads
  @NotNull
  public final RequestBody create(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x550D1B74B408L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return create$default(this, paramArrayOfbyte, (MediaType)null, 0, 0, 7, (Object)null);
  }
  
  @NotNull
  public final RequestBody create(@NotNull File paramFile, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x6F64AB3195AAL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return new RequestBody$Companion$asRequestBody$1(paramMediaType, paramFile);
  }
  
  @JvmOverloads
  @NotNull
  public final RequestBody create(@NotNull byte[] paramArrayOfbyte, @Nullable MediaType paramMediaType) {
    long l = a ^ 0x375B2A75F069L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return create$default(this, paramArrayOfbyte, paramMediaType, 0, 0, 6, (Object)null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\RequestBody$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */