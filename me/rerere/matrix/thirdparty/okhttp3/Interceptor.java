package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface Interceptor {
  @NotNull
  public static final Interceptor$Companion Companion = Interceptor$Companion.$$INSTANCE;
  
  @NotNull
  Response intercept(@NotNull Interceptor$Chain paramInterceptor$Chain) throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Interceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */