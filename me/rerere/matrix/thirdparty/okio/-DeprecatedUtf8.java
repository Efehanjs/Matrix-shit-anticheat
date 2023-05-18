package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@Deprecated(message = "changed in Okio 2.x")
public final class -DeprecatedUtf8 {
  @NotNull
  public static final -DeprecatedUtf8 INSTANCE;
  
  private static final long a = o3.a(-8812792084273924517L, 8842369196701304273L, MethodHandles.lookup().lookupClass()).a(207571692375993L);
  
  static {
    INSTANCE = new -DeprecatedUtf8();
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.utf8Size()", imports = {"me.rerere.matrix.thirdparty.okio.utf8Size"}), level = DeprecationLevel.ERROR)
  public final long size(@NotNull String paramString) {
    long l = a ^ 0x3C0A21E43BD6L;
    Intrinsics.checkNotNullParameter(paramString, "string");
    return Utf8.size$default(paramString, 0, 0, 3, null);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"me.rerere.matrix.thirdparty.okio.utf8Size"}), level = DeprecationLevel.ERROR)
  public final long size(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x4D79FC5D2870L;
    Intrinsics.checkNotNullParameter(paramString, "string");
    return Utf8.size(paramString, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-DeprecatedUtf8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */