package me.rerere.matrix.thirdparty.okio;

import java.io.EOFException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealBufferedSink implements BufferedSink {
  @JvmField
  @NotNull
  public final Sink sink;
  
  @JvmField
  public boolean closed;
  
  @JvmField
  @NotNull
  public final Buffer bufferField;
  
  private static final long a = o3.a(7472309829214290742L, 6092620633600757326L, MethodHandles.lookup().lookupClass()).a(101778937596122L);
  
  public void close() {
    RealBufferedSink realBufferedSink = this;
    boolean bool = false;
    try {
      if (!realBufferedSink.closed) {
        Throwable throwable = null;
        try {
          RealBufferedSink realBufferedSink1 = realBufferedSink;
          boolean bool1 = false;
          if (realBufferedSink1.bufferField.size() > 0L) {
            realBufferedSink1 = realBufferedSink;
            bool1 = false;
            realBufferedSink1 = realBufferedSink;
            bool1 = false;
            realBufferedSink.sink.write(realBufferedSink1.bufferField, realBufferedSink1.bufferField.size());
          } 
        } catch (Throwable throwable1) {
          throwable = throwable1;
        } 
        try {
          realBufferedSink.sink.close();
        } catch (Throwable throwable1) {
          if (throwable == null)
            throwable = throwable1; 
        } 
        try {
          realBufferedSink.closed = true;
          if (throwable != null)
            throw throwable; 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  @NotNull
  public BufferedSink writeString(@NotNull String paramString, int paramInt1, int paramInt2, @NotNull Charset paramCharset) {
    long l = a ^ 0x202AB5E0784DL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "string");
      Intrinsics.checkNotNullParameter(paramCharset, "charset");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool1 = !this.closed ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink = this;
    bool2 = false;
    realBufferedSink.bufferField.writeString(paramString, paramInt1, paramInt2, paramCharset);
    return emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink writeString(@NotNull String paramString, @NotNull Charset paramCharset) {
    long l = a ^ 0x173D91168BB5L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "string");
      Intrinsics.checkNotNullParameter(paramCharset, "charset");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool1 = !this.closed ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink = this;
    bool2 = false;
    realBufferedSink.bufferField.writeString(paramString, paramCharset);
    return emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink writeHexadecimalUnsignedLong(long paramLong) {
    long l = a ^ 0x1D389BEAB837L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeHexadecimalUnsignedLong(paramLong);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink emit() {
    long l1 = a ^ 0x247D6F0EF617L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    boolean bool5 = false;
    long l2 = realBufferedSink2.bufferField.size();
    if (l2 > 0L) {
      realBufferedSink2 = realBufferedSink1;
      bool5 = false;
      realBufferedSink1.sink.write(realBufferedSink2.bufferField, l2);
    } 
    return realBufferedSink1;
  }
  
  @NotNull
  public BufferedSink writeInt(int paramInt) {
    long l = a ^ 0xF10651331B1L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeInt(paramInt);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  public long writeAll(@NotNull Source paramSource) {
    long l1 = a ^ 0x5ECE0B204B9BL;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    RealBufferedSink realBufferedSink = this;
    boolean bool = false;
    long l2 = 0L;
    while (true) {
      RealBufferedSink realBufferedSink1 = realBufferedSink;
      boolean bool1 = false;
      long l = paramSource.read(realBufferedSink1.bufferField, 8192L);
      try {
        if (l == -1L)
          return l2; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      l2 += l;
      realBufferedSink.emitCompleteSegments();
    } 
  }
  
  @NotNull
  public BufferedSink writeIntLe(int paramInt) {
    long l = a ^ 0x6CA7B119C5D0L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeIntLe(paramInt);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink writeUtf8(@NotNull String paramString) {
    long l = a ^ 0x738BD0EEB95CL;
    Intrinsics.checkNotNullParameter(paramString, "string");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeUtf8(paramString);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink write(@NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    long l = a ^ 0x6AC6BB4143DL;
    Intrinsics.checkNotNullParameter(paramByteString, "byteString");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.write(paramByteString, paramInt1, paramInt2);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x5B894356AA40L;
    RealBufferedSink realBufferedSink = this;
    boolean bool = false;
    return "buffer(" + realBufferedSink.sink + ')';
  }
  
  @NotNull
  public BufferedSink writeShort(int paramInt) {
    long l = a ^ 0x744B1410EC56L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeShort(paramInt);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  public RealBufferedSink(@NotNull Sink paramSink) {
    this.sink = paramSink;
    this.bufferField = new Buffer();
  }
  
  @NotNull
  public BufferedSink writeLong(long paramLong) {
    long l = a ^ 0x3C1D4E5BFA5CL;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeLong(paramLong);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink writeDecimalLong(long paramLong) {
    long l = a ^ 0x240670DDE1A9L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeDecimalLong(paramLong);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink writeByte(int paramInt) {
    long l = a ^ 0x7A094096C94CL;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeByte(paramInt);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  public int write(@NotNull ByteBuffer paramByteBuffer) {
    long l = a ^ 0x1B168EB452FAL;
    try {
      Intrinsics.checkNotNullParameter(paramByteBuffer, "source");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = !this.closed ? 1 : 0;
    boolean bool1 = false;
    boolean bool2 = false;
    if (!i) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink = this;
    bool2 = false;
    i = realBufferedSink.bufferField.write(paramByteBuffer);
    emitCompleteSegments();
    return i;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x323138E6A346L;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.write(paramBuffer, paramLong);
    realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink write(@NotNull ByteString paramByteString) {
    long l = a ^ 0x5B3716A943C6L;
    Intrinsics.checkNotNullParameter(paramByteString, "byteString");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.write(paramByteString);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  public void flush() {
    long l = a ^ 0x7749F850EAF6L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    if (realBufferedSink2.bufferField.size() > 0L) {
      realBufferedSink2 = realBufferedSink1;
      bool3 = false;
      realBufferedSink2 = realBufferedSink1;
      bool3 = false;
      realBufferedSink1.sink.write(realBufferedSink2.bufferField, realBufferedSink2.bufferField.size());
    } 
    realBufferedSink1.sink.flush();
  }
  
  @NotNull
  public Buffer getBuffer() {
    boolean bool = false;
    return this.bufferField;
  }
  
  @NotNull
  public BufferedSink writeShortLe(int paramInt) {
    long l = a ^ 0x370FAD757003L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeShortLe(paramInt);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink writeLongLe(long paramLong) {
    long l = a ^ 0x28B0288D181EL;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeLongLe(paramLong);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public Timeout timeout() {
    RealBufferedSink realBufferedSink = this;
    boolean bool = false;
    return realBufferedSink.sink.timeout();
  }
  
  @NotNull
  public BufferedSink write(@NotNull Source paramSource, long paramLong) {
    long l1 = a ^ 0x565CD9971CDFL;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    RealBufferedSink realBufferedSink = this;
    boolean bool = false;
    long l2 = paramLong;
    while (l2 > 0L) {
      RealBufferedSink realBufferedSink1 = realBufferedSink;
      boolean bool1 = false;
      long l = paramSource.read(realBufferedSink1.bufferField, l2);
      try {
        if (l == -1L)
          throw new EOFException(); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      l2 -= l;
      realBufferedSink.emitCompleteSegments();
    } 
    return realBufferedSink;
  }
  
  @NotNull
  public BufferedSink emitCompleteSegments() {
    long l1 = a ^ 0x6F8ADA493854L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    boolean bool5 = false;
    long l2 = realBufferedSink2.bufferField.completeSegmentByteCount();
    if (l2 > 0L) {
      realBufferedSink2 = realBufferedSink1;
      bool5 = false;
      realBufferedSink1.sink.write(realBufferedSink2.bufferField, l2);
    } 
    return realBufferedSink1;
  }
  
  public boolean isOpen() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !this.closed;
  }
  
  @NotNull
  public BufferedSink writeUtf8(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x3DA5C5B9FAECL;
    Intrinsics.checkNotNullParameter(paramString, "string");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeUtf8(paramString, paramInt1, paramInt2);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public OutputStream outputStream() {
    return new RealBufferedSink$outputStream$1(this);
  }
  
  @NotNull
  public BufferedSink writeUtf8CodePoint(int paramInt) {
    long l = a ^ 0x4054AB0921C8L;
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.writeUtf8CodePoint(paramInt);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public BufferedSink write(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x269ED420D0D5L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "source");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.write(paramArrayOfbyte);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  @NotNull
  public Buffer buffer() {
    return this.bufferField;
  }
  
  @NotNull
  public BufferedSink write(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x630464EC03D0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "source");
    RealBufferedSink realBufferedSink1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSink1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSink realBufferedSink2 = realBufferedSink1;
    bool3 = false;
    realBufferedSink2.bufferField.write(paramArrayOfbyte, paramInt1, paramInt2);
    return realBufferedSink1.emitCompleteSegments();
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\RealBufferedSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */