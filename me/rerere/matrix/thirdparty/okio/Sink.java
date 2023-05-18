package me.rerere.matrix.thirdparty.okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface Sink extends Closeable, Flushable {
  void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException;
  
  @NotNull
  Timeout timeout();
  
  void close() throws IOException;
  
  void flush() throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Sink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */