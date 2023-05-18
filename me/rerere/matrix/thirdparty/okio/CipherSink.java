package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CipherSink implements Sink {
  private final int blockSize;
  
  @NotNull
  private final Cipher cipher;
  
  @NotNull
  private final BufferedSink sink;
  
  private boolean closed;
  
  private static final long a = o3.a(907400973775093926L, -3205581841184635894L, MethodHandles.lookup().lookupClass()).a(156766038470965L);
  
  @NotNull
  public Timeout timeout() {
    return this.sink.timeout();
  }
  
  public void flush() {
    this.sink.flush();
  }
  
  public void close() throws IOException {
    try {
      if (this.closed)
        return; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    this.closed = true;
    Throwable throwable = doFinal();
    try {
      this.sink.close();
    } catch (Throwable throwable1) {
      if (throwable == null)
        throwable = throwable1; 
    } 
    try {
      if (throwable != null)
        throw throwable; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final Cipher getCipher() {
    return this.cipher;
  }
  
  public CipherSink(@NotNull BufferedSink paramBufferedSink, @NotNull Cipher paramCipher) {
    this.sink = paramBufferedSink;
    this.cipher = paramCipher;
    this.blockSize = this.cipher.getBlockSize();
    boolean bool1 = (this.blockSize > 0) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("Block cipher required ", getCipher());
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l1 = a ^ 0x5263C8176B88L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "source");
      _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, paramLong);
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool1 = !this.closed ? true : false;
    boolean bool2 = false;
    int i = 0;
    if (!bool1) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    long l2;
    for (l2 = paramLong; l2 > 0L; l2 -= i)
      i = update(paramBuffer, l2); 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\CipherSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */