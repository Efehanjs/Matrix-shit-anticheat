package me.rerere.matrix.thirdparty.okhttp3;

import java.net.Socket;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface Connection {
  @NotNull
  Socket socket();
  
  @Nullable
  Handshake handshake();
  
  @NotNull
  Route route();
  
  @NotNull
  Protocol protocol();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Connection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */