package me.rerere.matrix.thirdparty.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.okio.internal._ByteStringKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ByteString$Companion {
  private static final long a = o3.a(3826176436655619904L, 3073792418655959862L, MethodHandles.lookup().lookupClass()).a(179786202675929L);
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.decodeBase64"}), level = DeprecationLevel.ERROR)
  @Nullable
  public final ByteString -deprecated_decodeBase64(@NotNull String paramString) {
    long l = a ^ 0x60F52412C6E4L;
    Intrinsics.checkNotNullParameter(paramString, "string");
    return decodeBase64(paramString);
  }
  
  @NotNull
  public final ByteString read(@NotNull InputStream paramInputStream, int paramInt) throws IOException {
    long l = a ^ 0x74B785F56F2FL;
    try {
      Intrinsics.checkNotNullParameter(paramInputStream, "<this>");
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    int i = 0;
    int j = 0;
    if (!bool) {
      boolean bool1 = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Integer.valueOf(paramInt));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    byte[] arrayOfByte = new byte[paramInt];
    i = 0;
    j = 0;
    while (i < paramInt) {
      j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      try {
        if (j == -1)
          throw new EOFException(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      i += j;
    } 
    return new ByteString(arrayOfByte);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.toByteString"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_of(@NotNull ByteBuffer paramByteBuffer) {
    long l = a ^ 0x10955E9BF498L;
    Intrinsics.checkNotNullParameter(paramByteBuffer, "buffer");
    return of(paramByteBuffer);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.encodeUtf8"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_encodeUtf8(@NotNull String paramString) {
    long l = a ^ 0x99DAC5A44BL;
    Intrinsics.checkNotNullParameter(paramString, "string");
    return encodeUtf8(paramString);
  }
  
  @NotNull
  public final ByteString of(@NotNull ByteBuffer paramByteBuffer) {
    long l = a ^ 0x1FBFD102317EL;
    Intrinsics.checkNotNullParameter(paramByteBuffer, "<this>");
    byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
    paramByteBuffer.get(arrayOfByte);
    return new ByteString(arrayOfByte);
  }
  
  @NotNull
  public final ByteString encodeString(@NotNull String paramString, @NotNull Charset paramCharset) {
    long l = a ^ 0x6D286B7CD585L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    String str = paramString;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(str.getBytes(paramCharset), "(this as java.lang.String).getBytes(charset)");
    return new ByteString(str.getBytes(paramCharset));
  }
  
  @Nullable
  public final ByteString decodeBase64(@NotNull String paramString) {
    long l = a ^ 0x7F0DA08BE242L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    boolean bool = false;
    byte[] arrayOfByte = _Base64Kt.decodeBase64ToArray(str);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (arrayOfByte != null) ? new ByteString(arrayOfByte) : null;
  }
  
  @NotNull
  public final ByteString of(@NotNull byte... paramVarArgs) {
    long l = a ^ 0x5BB4F6C87F81L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "data");
    boolean bool1 = false;
    byte[] arrayOfByte = paramVarArgs;
    boolean bool2 = false;
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte, arrayOfByte.length), "java.util.Arrays.copyOf(this, size)");
    return new ByteString(Arrays.copyOf(arrayOfByte, arrayOfByte.length));
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.toByteString"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_of(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x323A138BD479L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    return of(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  @NotNull
  public final ByteString of(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x3FF850477D7DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    byte[] arrayOfByte1 = paramArrayOfbyte;
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(arrayOfByte1.length, paramInt1, paramInt2);
    byte[] arrayOfByte2 = arrayOfByte1;
    int i = paramInt1 + paramInt2;
    boolean bool2 = false;
    return new ByteString(ArraysKt.copyOfRange(arrayOfByte2, paramInt1, i));
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.readByteString"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_read(@NotNull InputStream paramInputStream, int paramInt) {
    long l = a ^ 0x34142ABB17FAL;
    Intrinsics.checkNotNullParameter(paramInputStream, "inputstream");
    return read(paramInputStream, paramInt);
  }
  
  @NotNull
  public final ByteString decodeHex(@NotNull String paramString) {
    long l = a ^ 0x573A8F230C74L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (str.length() % 2 == 0) ? true : false;
    byte b = 0;
    int i = 0;
    if (!bool2) {
      boolean bool = false;
      String str1 = Intrinsics.stringPlus("Unexpected hex string: ", str);
      throw (Throwable)new IllegalArgumentException(str1.toString());
    } 
    byte[] arrayOfByte = new byte[str.length() / 2];
    b = 0;
    i = arrayOfByte.length + -1;
    if (b <= i)
      do {
        byte b1 = b;
        b++;
        int j = _ByteStringKt.access$decodeHexDigit(str.charAt(b1 * 2)) << 4;
        int k = _ByteStringKt.access$decodeHexDigit(str.charAt(b1 * 2 + 1));
        arrayOfByte[b1] = (byte)(j + k);
      } while (b <= i); 
    return new ByteString(arrayOfByte);
  }
  
  @NotNull
  public final ByteString encodeUtf8(@NotNull String paramString) {
    long l = a ^ 0x13DB2251E59L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    boolean bool = false;
    ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
    byteString.setUtf8$okio(str);
    return byteString;
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.encode"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_encodeString(@NotNull String paramString, @NotNull Charset paramCharset) {
    long l = a ^ 0x479BA1D5C6EAL;
    Intrinsics.checkNotNullParameter(paramString, "string");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    return encodeString(paramString, paramCharset);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"me.rerere.matrix.thirdparty.okio.ByteString.Companion.decodeHex"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_decodeHex(@NotNull String paramString) {
    long l = a ^ 0x631DF669A42EL;
    Intrinsics.checkNotNullParameter(paramString, "string");
    return decodeHex(paramString);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\ByteString$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */