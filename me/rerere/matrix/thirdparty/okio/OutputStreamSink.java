package me.rerere.matrix.thirdparty.okio;

import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class OutputStreamSink implements Sink {
  @NotNull
  private final OutputStream out;
  
  @NotNull
  private final Timeout timeout;
  
  private static final long a = o3.a(-3450224211970105577L, -4894985275716817105L, MethodHandles.lookup().lookupClass()).a(238135507349702L);
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x276E656F360BL;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, paramLong);
    long l2 = paramLong;
    while (l2 > 0L) {
      this.timeout.throwIfReached();
      Intrinsics.checkNotNull(paramBuffer.head);
      Segment segment1 = paramBuffer.head;
      int j = segment1.limit - segment1.pos;
      boolean bool1 = false;
      long l = j;
      boolean bool2 = false;
      int i = (int)Math.min(l2, l);
      this.out.write(segment1.data, segment1.pos, i);
      Segment segment2 = segment1;
      segment2.pos += i;
      l2 -= i;
      Buffer buffer = paramBuffer;
      buffer.setSize$okio(buffer.size() - i);
      if (segment1.pos == segment1.limit) {
        paramBuffer.head = segment1.pop();
        SegmentPool.recycle(segment1);
      } 
    } 
  }
  
  public OutputStreamSink(@NotNull OutputStream paramOutputStream, @NotNull Timeout paramTimeout) {
    this.out = paramOutputStream;
    this.timeout = paramTimeout;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x501644D90A55L;
    return "sink(" + this.out + ')';
  }
  
  public void flush() {
    this.out.flush();
  }
  
  public void close() {
    this.out.close();
  }
  
  @NotNull
  public Timeout timeout() {
    return this.timeout;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\OutputStreamSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */