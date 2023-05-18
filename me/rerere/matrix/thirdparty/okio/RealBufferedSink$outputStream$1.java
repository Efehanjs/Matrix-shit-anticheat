package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealBufferedSink$outputStream$1 extends OutputStream {
  private static final long a = o3.a(7579476336459794185L, -5151210805204010094L, MethodHandles.lookup().lookupClass()).a(81156584712004L);
  
  public void close() {
    RealBufferedSink.this.close();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x463133C17FC3L;
    return RealBufferedSink.this + ".outputStream()";
  }
  
  public void write(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x1D038923B833L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "data");
      if (RealBufferedSink.this.closed)
        throw new IOException("closed"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    RealBufferedSink realBufferedSink = RealBufferedSink.this;
    boolean bool = false;
    realBufferedSink.bufferField.write(paramArrayOfbyte, paramInt1, paramInt2);
    RealBufferedSink.this.emitCompleteSegments();
  }
  
  public void write(int paramInt) {
    long l = a ^ 0x2881465BF594L;
    try {
      if (RealBufferedSink.this.closed)
        throw new IOException("closed"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    RealBufferedSink realBufferedSink = RealBufferedSink.this;
    boolean bool = false;
    realBufferedSink.bufferField.writeByte((byte)paramInt);
    RealBufferedSink.this.emitCompleteSegments();
  }
  
  public void flush() {
    try {
      if (!RealBufferedSink.this.closed)
        RealBufferedSink.this.flush(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\RealBufferedSink$outputStream$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */