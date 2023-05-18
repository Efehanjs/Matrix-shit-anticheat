package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.zip.Inflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.InflaterSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MessageInflater implements Closeable {
  @NotNull
  private final InflaterSource inflaterSource;
  
  @NotNull
  private final Inflater inflater;
  
  @NotNull
  private final Buffer deflatedBytes;
  
  private final boolean noContextTakeover;
  
  private static final long a = o3.a(-6397056333928144530L, -7298223019025682735L, MethodHandles.lookup().lookupClass()).a(226127224117743L);
  
  public void close() throws IOException {
    this.inflaterSource.close();
  }
  
  public final void inflate(@NotNull Buffer paramBuffer) throws IOException {
    long l1 = a ^ 0x56A4095FA1B5L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "buffer");
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (!((this.deflatedBytes.size() == 0L) ? 1 : 0)) {
      String str = "Failed requirement.";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (this.noContextTakeover)
        this.inflater.reset(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.deflatedBytes.writeAll((Source)paramBuffer);
    this.deflatedBytes.writeInt(65535);
    long l2 = this.inflater.getBytesRead() + this.deflatedBytes.size();
    do {
      this.inflaterSource.readOrInflate(paramBuffer, Long.MAX_VALUE);
    } while (this.inflater.getBytesRead() < l2);
  }
  
  public MessageInflater(boolean paramBoolean) {
    this.noContextTakeover = paramBoolean;
    this.deflatedBytes = new Buffer();
    this.inflater = new Inflater(true);
    this.inflaterSource = new InflaterSource((Source)this.deflatedBytes, this.inflater);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\MessageInflater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */