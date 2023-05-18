package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ForwardingSink;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class FaultHidingSink extends ForwardingSink {
  private boolean hasErrors;
  
  @NotNull
  private final Function1 onException;
  
  private static final long a = o3.a(4664612952989565833L, 5945804756975467511L, MethodHandles.lookup().lookupClass()).a(59153349135878L);
  
  public FaultHidingSink(@NotNull Sink paramSink, @NotNull Function1 paramFunction1) {
    super(paramSink);
    this.onException = paramFunction1;
  }
  
  public void flush() {
    try {
      if (this.hasErrors)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      super.flush();
    } catch (IOException iOException) {
      this.hasErrors = true;
      this.onException.invoke(iOException);
    } 
  }
  
  public void close() {
    try {
      if (this.hasErrors)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      super.close();
    } catch (IOException iOException) {
      this.hasErrors = true;
      this.onException.invoke(iOException);
    } 
  }
  
  @NotNull
  public final Function1 getOnException() {
    return this.onException;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x65019ED408ABL;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "source");
      if (this.hasErrors) {
        paramBuffer.skip(paramLong);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      super.write(paramBuffer, paramLong);
    } catch (IOException iOException) {
      this.hasErrors = true;
      this.onException.invoke(iOException);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\FaultHidingSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */