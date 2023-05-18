package me.rerere.matrix.internal;

import java.util.concurrent.TimeUnit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class wf extends Lambda implements Function0 {
  public static final wf i = new wf();
  
  public wf() {
    super(0);
  }
  
  @NotNull
  public final OkHttpClient b() {
    return (new OkHttpClient.Builder()).connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(10L, TimeUnit.SECONDS).build();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */