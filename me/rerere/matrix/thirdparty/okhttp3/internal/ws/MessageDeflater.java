package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.zip.Deflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.DeflaterSink;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MessageDeflater implements Closeable {
  @NotNull
  private final Buffer deflatedBytes;
  
  @NotNull
  private final Deflater deflater;
  
  @NotNull
  private final DeflaterSink deflaterSink;
  
  private final boolean noContextTakeover;
  
  private static final long a = o3.a(-495013833481905008L, -1038776398703114692L, MethodHandles.lookup().lookupClass()).a(43228056512748L);
  
  public MessageDeflater(boolean paramBoolean) {
    this.noContextTakeover = paramBoolean;
    this.deflatedBytes = new Buffer();
    this.deflater = new Deflater(-1, true);
    this.deflaterSink = new DeflaterSink((Sink)this.deflatedBytes, this.deflater);
  }
  
  public final void deflate(@NotNull Buffer paramBuffer) throws IOException {
    long l = a ^ 0x109DBF8BCD78L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "buffer");
    } catch (Throwable throwable) {
      throw a(null);
    } 
    if (!((this.deflatedBytes.size() == 0L) ? 1 : 0)) {
      String str = "Failed requirement.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (this.noContextTakeover)
        this.deflater.reset(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.deflaterSink.write(paramBuffer, paramBuffer.size());
    this.deflaterSink.flush();
    if (endsWith(this.deflatedBytes, MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p())) {
      long l1 = this.deflatedBytes.size() - 4L;
      Closeable closeable = (Closeable)Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
      Throwable throwable = null;
      try {
        Buffer.UnsafeCursor unsafeCursor = (Buffer.UnsafeCursor)closeable;
        boolean bool = false;
        long l2 = unsafeCursor.resizeBuffer(l1);
      } catch (Throwable throwable1) {
        throwable = throwable1;
        throw throwable1;
      } finally {
        CloseableKt.closeFinally(closeable, throwable);
      } 
    } else {
      this.deflatedBytes.writeByte(0);
    } 
    paramBuffer.write(this.deflatedBytes, this.deflatedBytes.size());
  }
  
  public void close() throws IOException {
    this.deflaterSink.close();
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\MessageDeflater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */