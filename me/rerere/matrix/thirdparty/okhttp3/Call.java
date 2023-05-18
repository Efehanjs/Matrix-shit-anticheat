package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import me.rerere.matrix.thirdparty.okio.Timeout;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface Call extends Cloneable {
  @NotNull
  Response execute() throws IOException;
  
  @NotNull
  Call clone();
  
  void cancel();
  
  boolean isCanceled();
  
  @NotNull
  Request request();
  
  @NotNull
  Timeout timeout();
  
  boolean isExecuted();
  
  void enqueue(@NotNull Callback paramCallback);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Call.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */