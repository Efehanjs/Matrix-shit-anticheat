package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public final class oh {
  private static yk[] a;
  
  private static final long b = o3.a(7037987762780852395L, -2112109924240897420L, MethodHandles.lookup().lookupClass()).a(131376877255646L);
  
  public final boolean b(@NotNull Player paramPlayer, long paramLong, short paramShort, @NotNull String paramString) {
    long l1 = (paramLong << 16L | paramShort << 48L >>> 48L) ^ b;
    long l2 = l1 ^ 0x57A6FA7BD619L;
    return Matrix.q.b(l2).b().b(paramPlayer, paramString);
  }
  
  public static void E(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] I() {
    return a;
  }
  
  static {
    if (I() == null)
      E(new yk[2]); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\oh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */