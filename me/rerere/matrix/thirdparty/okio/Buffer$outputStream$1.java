package me.rerere.matrix.thirdparty.okio;

import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Buffer$outputStream$1 extends OutputStream {
  private static final long a = o3.a(-6984072331224135300L, -8451307334098619451L, MethodHandles.lookup().lookupClass()).a(25027004751127L);
  
  public void write(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x24489C7930A6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "data");
    Buffer.this.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void write(int paramInt) {
    Buffer.this.writeByte(paramInt);
  }
  
  public void flush() {}
  
  public void close() {}
  
  @NotNull
  public String toString() {
    long l = a ^ 0x26398FB67774L;
    return Buffer.this + ".outputStream()";
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Buffer$outputStream$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */