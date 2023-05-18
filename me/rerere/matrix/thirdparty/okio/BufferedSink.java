package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface BufferedSink extends Sink, WritableByteChannel {
  @Deprecated(message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}), level = DeprecationLevel.WARNING)
  @NotNull
  Buffer buffer();
  
  @NotNull
  BufferedSink writeUtf8CodePoint(int paramInt) throws IOException;
  
  @NotNull
  BufferedSink writeLong(long paramLong) throws IOException;
  
  @NotNull
  BufferedSink write(@NotNull ByteString paramByteString) throws IOException;
  
  @NotNull
  BufferedSink writeIntLe(int paramInt) throws IOException;
  
  @NotNull
  BufferedSink emitCompleteSegments() throws IOException;
  
  @NotNull
  BufferedSink writeShortLe(int paramInt) throws IOException;
  
  @NotNull
  OutputStream outputStream();
  
  @NotNull
  Buffer getBuffer();
  
  @NotNull
  BufferedSink write(@NotNull ByteString paramByteString, int paramInt1, int paramInt2) throws IOException;
  
  @NotNull
  BufferedSink writeString(@NotNull String paramString, int paramInt1, int paramInt2, @NotNull Charset paramCharset) throws IOException;
  
  @NotNull
  BufferedSink write(@NotNull Source paramSource, long paramLong) throws IOException;
  
  @NotNull
  BufferedSink writeDecimalLong(long paramLong) throws IOException;
  
  @NotNull
  BufferedSink write(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  @NotNull
  BufferedSink writeByte(int paramInt) throws IOException;
  
  @NotNull
  BufferedSink emit() throws IOException;
  
  @NotNull
  BufferedSink writeLongLe(long paramLong) throws IOException;
  
  @NotNull
  BufferedSink write(@NotNull byte[] paramArrayOfbyte) throws IOException;
  
  @NotNull
  BufferedSink writeUtf8(@NotNull String paramString, int paramInt1, int paramInt2) throws IOException;
  
  @NotNull
  BufferedSink writeInt(int paramInt) throws IOException;
  
  @NotNull
  BufferedSink writeUtf8(@NotNull String paramString) throws IOException;
  
  @NotNull
  BufferedSink writeShort(int paramInt) throws IOException;
  
  @NotNull
  BufferedSink writeString(@NotNull String paramString, @NotNull Charset paramCharset) throws IOException;
  
  void flush() throws IOException;
  
  @NotNull
  BufferedSink writeHexadecimalUnsignedLong(long paramLong) throws IOException;
  
  long writeAll(@NotNull Source paramSource) throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\BufferedSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */