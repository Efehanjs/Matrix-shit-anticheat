package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealBufferedSource$inputStream$1 extends InputStream {
  private static final long a = o3.a(7436714704719730919L, -934477407602513654L, MethodHandles.lookup().lookupClass()).a(135145104170754L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x5C8753AABD8BL;
    return RealBufferedSource.this + ".inputStream()";
  }
  
  public int read() {
    long l = a ^ 0xFBC80D04BFAL;
    try {
      if (RealBufferedSource.this.closed)
        throw new IOException("closed"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    RealBufferedSource realBufferedSource = RealBufferedSource.this;
    char c = Character.MIN_VALUE;
    if (realBufferedSource.bufferField.size() == 0L) {
      RealBufferedSource realBufferedSource1 = RealBufferedSource.this;
      boolean bool1 = false;
      long l1 = RealBufferedSource.this.source.read(realBufferedSource1.bufferField, 8192L);
      try {
        if (l1 == -1L)
          return -1; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    realBufferedSource = RealBufferedSource.this;
    c = Character.MIN_VALUE;
    byte b = realBufferedSource.bufferField.readByte();
    c = 'ÿ';
    boolean bool = false;
    return b & c;
  }
  
  public int available() {
    long l1 = a ^ 0x4358C22D2911L;
    try {
      if (RealBufferedSource.this.closed)
        throw new IOException("closed"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    RealBufferedSource realBufferedSource = RealBufferedSource.this;
    boolean bool1 = false;
    long l2 = realBufferedSource.bufferField.size();
    int i = Integer.MAX_VALUE;
    boolean bool2 = false;
    long l3 = i;
    boolean bool3 = false;
    return (int)Math.min(l2, l3);
  }
  
  public int read(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x6BFBAE02FFC6L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "data");
      if (RealBufferedSource.this.closed)
        throw new IOException("closed"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt1, paramInt2);
    RealBufferedSource realBufferedSource = RealBufferedSource.this;
    boolean bool = false;
    if (realBufferedSource.bufferField.size() == 0L) {
      RealBufferedSource realBufferedSource1 = RealBufferedSource.this;
      boolean bool1 = false;
      long l1 = RealBufferedSource.this.source.read(realBufferedSource1.bufferField, 8192L);
      try {
        if (l1 == -1L)
          return -1; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    realBufferedSource = RealBufferedSource.this;
    bool = false;
    return realBufferedSource.bufferField.read(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void close() {
    RealBufferedSource.this.close();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\RealBufferedSource$inputStream$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */