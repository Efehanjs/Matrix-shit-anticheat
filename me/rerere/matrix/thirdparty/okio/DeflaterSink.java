package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.zip.Deflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DeflaterSink implements Sink {
  @NotNull
  private final Deflater deflater;
  
  private boolean closed;
  
  @NotNull
  private final BufferedSink sink;
  
  private static final long a = o3.a(-6761335337834950849L, -532676504773005401L, MethodHandles.lookup().lookupClass()).a(126678463603837L);
  
  @NotNull
  public Timeout timeout() {
    return this.sink.timeout();
  }
  
  public void flush() throws IOException {
    deflate(true);
    this.sink.flush();
  }
  
  public void close() throws IOException {
    try {
      if (this.closed)
        return; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    Throwable throwable = null;
    try {
      finishDeflate$okio();
    } catch (Throwable throwable1) {
      throwable = throwable1;
    } 
    try {
      this.deflater.end();
    } catch (Throwable throwable1) {
      if (throwable == null)
        throwable = throwable1; 
    } 
    try {
      this.sink.close();
    } catch (Throwable throwable1) {
      if (throwable == null)
        throwable = throwable1; 
    } 
    try {
      this.closed = true;
      if (throwable != null)
        throw throwable; 
    } catch (Throwable throwable1) {
      throw a(null);
    } 
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x1E38DC928E52L;
    return "DeflaterSink(" + this.sink + ')';
  }
  
  public final void finishDeflate$okio() {
    this.deflater.finish();
    deflate(false);
  }
  
  public DeflaterSink(@NotNull Sink paramSink, @NotNull Deflater paramDeflater) {
    this(Okio.buffer(paramSink), paramDeflater);
  }
  
  public DeflaterSink(@NotNull BufferedSink paramBufferedSink, @NotNull Deflater paramDeflater) {
    this.sink = paramBufferedSink;
    this.deflater = paramDeflater;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l1 = a ^ 0x67966482852BL;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, paramLong);
    long l2;
    for (l2 = paramLong; l2 > 0L; l2 -= i) {
      Intrinsics.checkNotNull(paramBuffer.head);
      Segment segment1 = paramBuffer.head;
      int j = segment1.limit - segment1.pos;
      boolean bool1 = false;
      long l = j;
      boolean bool2 = false;
      int i = (int)Math.min(l2, l);
      this.deflater.setInput(segment1.data, segment1.pos, i);
      deflate(false);
      Buffer buffer = paramBuffer;
      buffer.setSize$okio(buffer.size() - i);
      Segment segment2 = segment1;
      try {
        segment2.pos += i;
        if (segment1.pos == segment1.limit) {
          paramBuffer.head = segment1.pop();
          SegmentPool.recycle(segment1);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\DeflaterSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */