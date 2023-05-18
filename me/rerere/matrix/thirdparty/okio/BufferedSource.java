package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface BufferedSource extends Source, ReadableByteChannel {
  @NotNull
  Buffer getBuffer();
  
  void require(long paramLong) throws IOException;
  
  @NotNull
  String readString(@NotNull Charset paramCharset) throws IOException;
  
  @NotNull
  BufferedSource peek();
  
  long indexOf(@NotNull ByteString paramByteString, long paramLong) throws IOException;
  
  @NotNull
  byte[] readByteArray(long paramLong) throws IOException;
  
  boolean request(long paramLong) throws IOException;
  
  int readUtf8CodePoint() throws IOException;
  
  int select(@NotNull Options paramOptions) throws IOException;
  
  long readLongLe() throws IOException;
  
  boolean rangeEquals(long paramLong, @NotNull ByteString paramByteString) throws IOException;
  
  @NotNull
  ByteString readByteString() throws IOException;
  
  @NotNull
  byte[] readByteArray() throws IOException;
  
  int read(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  short readShort() throws IOException;
  
  boolean exhausted() throws IOException;
  
  long indexOf(byte paramByte, long paramLong) throws IOException;
  
  @NotNull
  String readUtf8LineStrict() throws IOException;
  
  short readShortLe() throws IOException;
  
  @NotNull
  ByteString readByteString(long paramLong) throws IOException;
  
  int readInt() throws IOException;
  
  @NotNull
  String readUtf8() throws IOException;
  
  long indexOf(byte paramByte, long paramLong1, long paramLong2) throws IOException;
  
  void readFully(@NotNull Buffer paramBuffer, long paramLong) throws IOException;
  
  long indexOfElement(@NotNull ByteString paramByteString, long paramLong) throws IOException;
  
  long readAll(@NotNull Sink paramSink) throws IOException;
  
  byte readByte() throws IOException;
  
  long readDecimalLong() throws IOException;
  
  long readHexadecimalUnsignedLong() throws IOException;
  
  void skip(long paramLong) throws IOException;
  
  long indexOfElement(@NotNull ByteString paramByteString) throws IOException;
  
  @NotNull
  InputStream inputStream();
  
  void readFully(@NotNull byte[] paramArrayOfbyte) throws IOException;
  
  int readIntLe() throws IOException;
  
  long indexOf(byte paramByte) throws IOException;
  
  boolean rangeEquals(long paramLong, @NotNull ByteString paramByteString, int paramInt1, int paramInt2) throws IOException;
  
  @NotNull
  String readUtf8LineStrict(long paramLong) throws IOException;
  
  @Nullable
  String readUtf8Line() throws IOException;
  
  int read(@NotNull byte[] paramArrayOfbyte) throws IOException;
  
  @NotNull
  String readUtf8(long paramLong) throws IOException;
  
  long indexOf(@NotNull ByteString paramByteString) throws IOException;
  
  @NotNull
  String readString(long paramLong, @NotNull Charset paramCharset) throws IOException;
  
  @Deprecated(message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}), level = DeprecationLevel.WARNING)
  @NotNull
  Buffer buffer();
  
  long readLong() throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\BufferedSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */