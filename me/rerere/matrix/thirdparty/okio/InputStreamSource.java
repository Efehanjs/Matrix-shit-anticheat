package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class InputStreamSource implements Source {
  @NotNull
  private final InputStream input;
  
  @NotNull
  private final Timeout timeout;
  
  private static final long a = o3.a(4290067582570535373L, -100775657746287696L, MethodHandles.lookup().lookupClass()).a(22956009515936L);
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x31AF5CDC7817L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "sink");
      if (paramLong == 0L)
        return 0L; 
    } catch (AssertionError assertionError) {
      throw a(null);
    } 
    try {
    
    } catch (AssertionError assertionError) {
      throw a(null);
    } 
    boolean bool = (paramLong >= 0L) ? true : false;
    int i = 0;
    int j = 0;
    if (!bool) {
      boolean bool1 = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
      this.timeout.throwIfReached();
      Segment segment1 = paramBuffer.writableSegment$okio(1);
      j = 8192 - segment1.limit;
      boolean bool1 = false;
      long l1 = j;
      boolean bool2 = false;
      i = (int)Math.min(paramLong, l1);
      j = this.input.read(segment1.data, segment1.limit, i);
      try {
        if (j == -1) {
          try {
            if (segment1.pos == segment1.limit) {
              paramBuffer.head = segment1.pop();
              SegmentPool.recycle(segment1);
            } 
          } catch (AssertionError assertionError) {
            throw a(null);
          } 
          return -1L;
        } 
      } catch (AssertionError assertionError) {
        throw a(null);
      } 
      Segment segment2 = segment1;
      segment2.limit += j;
      Buffer buffer = paramBuffer;
      buffer.setSize$okio(buffer.size() + j);
      return j;
    } catch (AssertionError assertionError) {
      try {
        if (Okio.isAndroidGetsocknameError(assertionError))
          throw new IOException(assertionError); 
      } catch (AssertionError assertionError1) {
        throw a(null);
      } 
      throw assertionError;
    } 
  }
  
  public InputStreamSource(@NotNull InputStream paramInputStream, @NotNull Timeout paramTimeout) {
    this.input = paramInputStream;
    this.timeout = paramTimeout;
  }
  
  @NotNull
  public Timeout timeout() {
    return this.timeout;
  }
  
  public void close() {
    this.input.close();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x21864AC67124L;
    return "source(" + this.input + ')';
  }
  
  private static AssertionError a(AssertionError paramAssertionError) {
    return paramAssertionError;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\InputStreamSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */