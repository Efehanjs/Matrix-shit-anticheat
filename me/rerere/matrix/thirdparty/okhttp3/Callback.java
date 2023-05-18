package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface Callback {
  void onResponse(@NotNull Call paramCall, @NotNull Response paramResponse) throws IOException;
  
  void onFailure(@NotNull Call paramCall, @NotNull IOException paramIOException);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Callback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */