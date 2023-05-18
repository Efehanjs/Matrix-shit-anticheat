package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.ByteIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ByteStreamsKt {
  private static final long a = o3.a(737899229256957253L, 1947397560152427576L, null).a(16074532116941L);
  
  @NotNull
  public static final ByteIterator iterator(@NotNull BufferedInputStream paramBufferedInputStream) {
    long l = a ^ 0x453CEBFDDB37L;
    Intrinsics.checkNotNullParameter(paramBufferedInputStream, "<this>");
    return new ByteStreamsKt$iterator$1(paramBufferedInputStream);
  }
  
  @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.3", errorSince = "1.5")
  @NotNull
  public static final byte[] readBytes(@NotNull InputStream paramInputStream, int paramInt) {
    long l = a ^ 0x3CC25EC443FBL;
    Intrinsics.checkNotNullParameter(paramInputStream, "<this>");
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(paramInt, paramInputStream.available()));
    copyTo$default(paramInputStream, byteArrayOutputStream, 0, 2, null);
    Intrinsics.checkNotNullExpressionValue(byteArrayOutputStream.toByteArray(), "buffer.toByteArray()");
    return byteArrayOutputStream.toByteArray();
  }
  
  public static final long copyTo(@NotNull InputStream paramInputStream, @NotNull OutputStream paramOutputStream, int paramInt) {
    long l1 = a ^ 0x4ECC153CEA0EL;
    Intrinsics.checkNotNullParameter(paramInputStream, "<this>");
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    long l2 = 0L;
    byte[] arrayOfByte = new byte[paramInt];
    int i;
    for (i = paramInputStream.read(arrayOfByte); i >= 0; i = paramInputStream.read(arrayOfByte)) {
      paramOutputStream.write(arrayOfByte, 0, i);
      l2 += i;
    } 
    return l2;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final byte[] readBytes(@NotNull InputStream paramInputStream) {
    long l = a ^ 0x5586F2A8B1C0L;
    Intrinsics.checkNotNullParameter(paramInputStream, "<this>");
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, paramInputStream.available()));
    copyTo$default(paramInputStream, byteArrayOutputStream, 0, 2, null);
    Intrinsics.checkNotNullExpressionValue(byteArrayOutputStream.toByteArray(), "buffer.toByteArray()");
    return byteArrayOutputStream.toByteArray();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\ByteStreamsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */