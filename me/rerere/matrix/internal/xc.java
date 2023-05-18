package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class xc {
  private static final long a = o3.a(3570153119762834402L, -1320072086693046092L, MethodHandles.lookup().lookupClass()).a(223151110737670L);
  
  @NotNull
  public static final String j(long paramLong, @NotNull String paramString) {
    paramLong = a ^ paramLong;
    int i = (int)((paramLong ^ 0x68C2B6CA9F5BL) >>> 32L);
    int j = (int)((paramLong ^ 0x68C2B6CA9F5BL) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x68C2B6CA9F5BL) << 48L >>> 48L);
    paramLong ^ 0x68C2B6CA9F5BL;
    return wc.j(i, (short)j, paramString, (char)k);
  }
  
  @NotNull
  public static final String b(@NotNull String paramString) {
    return wc.b(paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */