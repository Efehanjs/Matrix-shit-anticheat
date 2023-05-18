package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.ByteArrayOutputStream;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ExposingBufferByteArrayOutputStream extends ByteArrayOutputStream {
  private static final long a = o3.a(-2544721603779847108L, -3560677566208403261L, null).a(93229936840023L);
  
  @NotNull
  public final byte[] getBuffer() {
    long l = a ^ 0x13D115849FC7L;
    Intrinsics.checkNotNullExpressionValue(this.buf, "buf");
    return this.buf;
  }
  
  public ExposingBufferByteArrayOutputStream(int paramInt) {
    super(paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\ExposingBufferByteArrayOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */