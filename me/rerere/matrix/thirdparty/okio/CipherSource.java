package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CipherSource implements Source {
  private final int blockSize;
  
  private boolean final;
  
  @NotNull
  private final Cipher cipher;
  
  @NotNull
  private final BufferedSource source;
  
  @NotNull
  private final Buffer buffer;
  
  private boolean closed;
  
  private static final long a = o3.a(6815282000856666576L, 6317017836761184603L, MethodHandles.lookup().lookupClass()).a(242655426192448L);
  
  public CipherSource(@NotNull BufferedSource paramBufferedSource, @NotNull Cipher paramCipher) {
    this.source = paramBufferedSource;
    this.cipher = paramCipher;
    this.blockSize = this.cipher.getBlockSize();
    this.buffer = new Buffer();
    boolean bool1 = (this.blockSize > 0) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("Block cipher required ", getCipher());
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
  }
  
  @NotNull
  public Timeout timeout() {
    return this.source.timeout();
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x6029613B8DC6L;
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
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    bool1 = !this.closed ? true : false;
    bool2 = false;
    bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    try {
      if (paramLong == 0L)
        return 0L; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.final)
        return this.buffer.read(paramBuffer, paramLong); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    refill();
    return this.buffer.read(paramBuffer, paramLong);
  }
  
  @NotNull
  public final Cipher getCipher() {
    return this.cipher;
  }
  
  public void close() throws IOException {
    this.closed = true;
    this.source.close();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\CipherSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */