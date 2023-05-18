package me.rerere.matrix.thirdparty.okio;

import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class InflaterSource implements Source {
  private boolean closed;
  
  @NotNull
  private final BufferedSource source;
  
  private int bufferBytesHeldByInflater;
  
  @NotNull
  private final Inflater inflater;
  
  private static final long a = o3.a(-214191224317110105L, 6199844410471354474L, MethodHandles.lookup().lookupClass()).a(201710565270287L);
  
  public void close() throws IOException {
    try {
      if (this.closed)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.inflater.end();
    this.closed = true;
    this.source.close();
  }
  
  public InflaterSource(@NotNull BufferedSource paramBufferedSource, @NotNull Inflater paramInflater) {
    this.source = paramBufferedSource;
    this.inflater = paramInflater;
  }
  
  public InflaterSource(@NotNull Source paramSource, @NotNull Inflater paramInflater) {
    this(Okio.buffer(paramSource), paramInflater);
  }
  
  @NotNull
  public Timeout timeout() {
    return this.source.timeout();
  }
  
  public final boolean refill() throws IOException {
    try {
      if (!this.inflater.needsInput())
        return false; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.source.exhausted())
        return true; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull((this.source.getBuffer()).head);
    Segment segment = (this.source.getBuffer()).head;
    this.bufferBytesHeldByInflater = segment.limit - segment.pos;
    this.inflater.setInput(segment.data, segment.pos, this.bufferBytesHeldByInflater);
    return false;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x4C47737DD03AL;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    while (true) {
      long l1 = readOrInflate(paramBuffer, paramLong);
      if (l1 > 0L)
        return l1; 
      try {
        if (!this.inflater.finished())
          try {
            if (!this.inflater.needsDictionary()) {
              if (this.source.exhausted())
                throw new EOFException("source exhausted prematurely"); 
              continue;
            } 
            return -1L;
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return -1L;
    } 
  }
  
  public final long readOrInflate(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = a ^ 0x6F79B40FBA75L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    } catch (DataFormatException dataFormatException) {
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
    
    } catch (DataFormatException dataFormatException) {
      throw a(null);
    } 
    bool = !this.closed ? true : false;
    i = 0;
    j = 0;
    if (!bool) {
      boolean bool1 = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    try {
      if (paramLong == 0L)
        return 0L; 
    } catch (DataFormatException dataFormatException) {
      throw a(null);
    } 
    try {
      Segment segment = paramBuffer.writableSegment$okio(1);
      j = 8192 - segment.limit;
      boolean bool1 = false;
      long l1 = j;
      boolean bool2 = false;
      i = (int)Math.min(paramLong, l1);
      refill();
      j = this.inflater.inflate(segment.data, segment.limit, i);
      releaseBytesAfterInflate();
      if (j > 0) {
        Segment segment1 = segment;
        segment1.limit += j;
        Buffer buffer = paramBuffer;
        buffer.setSize$okio(buffer.size() + j);
        return j;
      } 
      try {
        if (segment.pos == segment.limit) {
          paramBuffer.head = segment.pop();
          SegmentPool.recycle(segment);
        } 
      } catch (DataFormatException dataFormatException) {
        throw a(null);
      } 
      return 0L;
    } catch (DataFormatException dataFormatException) {
      throw new IOException((Throwable)dataFormatException);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\InflaterSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */