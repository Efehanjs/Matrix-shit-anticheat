package me.rerere.matrix.thirdparty.okio;

import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class GzipSource implements Source {
  @NotNull
  private final RealBufferedSource source;
  
  private byte section;
  
  @NotNull
  private final CRC32 crc;
  
  @NotNull
  private final InflaterSource inflaterSource;
  
  @NotNull
  private final Inflater inflater;
  
  private static final long a = o3.a(-5113335063350231898L, -3053761017572092508L, MethodHandles.lookup().lookupClass()).a(163259345815554L);
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x7ABA2697199L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool1 = (paramLong >= 0L) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
      if (paramLong == 0L)
        return 0L; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.section == 0) {
        consumeHeader();
        this.section = 1;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (this.section == 1) {
      long l1 = paramBuffer.size();
      long l2 = this.inflaterSource.read(paramBuffer, paramLong);
      try {
        if (l2 != -1L) {
          updateCrc(paramBuffer, l1, l2);
          return l2;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.section = 2;
    } 
    try {
      if (this.section == 2)
        try {
          consumeTrailer();
          this.section = 3;
          if (!this.source.exhausted())
            throw new IOException("gzip finished without exhausting source"); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return -1L;
  }
  
  public GzipSource(@NotNull Source paramSource) {
    this.source = new RealBufferedSource(paramSource);
    this.inflater = new Inflater(true);
    this.inflaterSource = new InflaterSource(this.source, this.inflater);
    this.crc = new CRC32();
  }
  
  @NotNull
  public Timeout timeout() {
    return this.source.timeout();
  }
  
  public void close() throws IOException {
    this.inflaterSource.close();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\GzipSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */