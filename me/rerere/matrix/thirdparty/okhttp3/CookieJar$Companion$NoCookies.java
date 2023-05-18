package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CookieJar$Companion$NoCookies implements CookieJar {
  private static final long a = o3.a(6533237592460819333L, -2339660454398571989L, MethodHandles.lookup().lookupClass()).a(160552238401174L);
  
  @NotNull
  public List loadForRequest(@NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x63FE18AADA33L;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    return CollectionsKt.emptyList();
  }
  
  public void saveFromResponse(@NotNull HttpUrl paramHttpUrl, @NotNull List paramList) {
    long l = a ^ 0x3E1159E0833FL;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    Intrinsics.checkNotNullParameter(paramList, "cookies");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CookieJar$Companion$NoCookies.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */