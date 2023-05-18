package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface Interceptor$Chain {
  int readTimeoutMillis();
  
  @Nullable
  Connection connection();
  
  @NotNull
  Call call();
  
  @NotNull
  Interceptor$Chain withReadTimeout(int paramInt, @NotNull TimeUnit paramTimeUnit);
  
  @NotNull
  Interceptor$Chain withConnectTimeout(int paramInt, @NotNull TimeUnit paramTimeUnit);
  
  @NotNull
  Response proceed(@NotNull Request paramRequest) throws IOException;
  
  @NotNull
  Interceptor$Chain withWriteTimeout(int paramInt, @NotNull TimeUnit paramTimeUnit);
  
  int connectTimeoutMillis();
  
  @NotNull
  Request request();
  
  int writeTimeoutMillis();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Interceptor$Chain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */