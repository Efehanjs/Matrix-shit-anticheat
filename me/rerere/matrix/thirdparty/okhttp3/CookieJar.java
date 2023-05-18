package me.rerere.matrix.thirdparty.okhttp3;

import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface CookieJar {
  @NotNull
  public static final CookieJar$Companion Companion = CookieJar$Companion.$$INSTANCE;
  
  @JvmField
  @NotNull
  public static final CookieJar NO_COOKIES = new CookieJar$Companion$NoCookies();
  
  void saveFromResponse(@NotNull HttpUrl paramHttpUrl, @NotNull List paramList);
  
  @NotNull
  List loadForRequest(@NotNull HttpUrl paramHttpUrl);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CookieJar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */