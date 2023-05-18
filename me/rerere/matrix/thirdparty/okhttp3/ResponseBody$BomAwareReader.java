package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ResponseBody$BomAwareReader extends Reader {
  @Nullable
  private Reader delegate;
  
  private boolean closed;
  
  @NotNull
  private final BufferedSource source;
  
  @NotNull
  private final Charset charset;
  
  private static final long a = o3.a(-5855819773677992737L, 1189325804995323626L, MethodHandles.lookup().lookupClass()).a(44399671728449L);
  
  public ResponseBody$BomAwareReader(@NotNull BufferedSource paramBufferedSource, @NotNull Charset paramCharset) {
    this.source = paramBufferedSource;
    this.charset = paramCharset;
  }
  
  public void close() throws IOException {
    try {
      this.closed = true;
      this.delegate.close();
    } catch (IOException iOException) {
      throw a(null);
    } 
    Unit unit = (this.delegate == null) ? null : Unit.INSTANCE;
    if (unit == null) {
      ResponseBody$BomAwareReader responseBody$BomAwareReader = this;
      boolean bool = false;
      responseBody$BomAwareReader.source.close();
    } else {
    
    } 
  }
  
  public int read(@NotNull char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    long l = a ^ 0x58297B4F2E15L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "cbuf");
      if (this.closed)
        throw new IOException("Stream closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Reader reader2 = this.delegate;
    InputStreamReader inputStreamReader1 = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
    InputStreamReader inputStreamReader2 = inputStreamReader1;
    boolean bool = false;
    this.delegate = inputStreamReader2;
    Reader reader1 = (reader2 == null) ? inputStreamReader1 : reader2;
    return reader1.read(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ResponseBody$BomAwareReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */