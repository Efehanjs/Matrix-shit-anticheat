package me.rerere.matrix.thirdparty.okio;

import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Buffer$inputStream$1 extends InputStream {
  private static final long a = o3.a(-8846765333455286501L, 2467468010838139314L, MethodHandles.lookup().lookupClass()).a(114334746436692L);
  
  public int read() {
    byte b = Buffer.this.readByte();
    char c = 'ÿ';
    boolean bool = false;
    return (Buffer.this.size() > 0L) ? (b & c) : -1;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x70B5A0747F51L;
    return Buffer.this + ".inputStream()";
  }
  
  public void close() {}
  
  public int read(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x7AD909A4FDFEL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    return Buffer.this.read(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int available() {
    long l1 = Buffer.this.size();
    int i = Integer.MAX_VALUE;
    boolean bool1 = false;
    long l2 = i;
    boolean bool2 = false;
    return (int)Math.min(l1, l2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Buffer$inputStream$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */