package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class gb {
  @Nullable
  private ab b;
  
  private final oc i;
  
  private static final long a = o3.a(-6506160337473535349L, -3047263508734636331L, MethodHandles.lookup().lookupClass()).a(136356620696353L);
  
  public void b(ab paramab, long paramLong) {
    paramLong = a ^ paramLong;
    int i = (int)((paramLong ^ 0x395E6DB8763BL) >>> 56L);
    int j = (int)((paramLong ^ 0x395E6DB8763BL) << 8L >>> 32L);
    int k = (int)((paramLong ^ 0x395E6DB8763BL) << 40L >>> 40L);
    paramLong ^ 0x395E6DB8763BL;
    this.i.b(paramab, (byte)i, j, k);
    this.b = paramab;
  }
  
  @Nullable
  public ab b() {
    return this.b;
  }
  
  public gb(long paramLong) {
    this.i = new oc(ab.class, l, 5);
  }
  
  public ab b(int paramInt) {
    return ((ab[])this.i.b())[4 - paramInt];
  }
  
  public void b() {
    this.b = null;
    this.i.j();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\gb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */