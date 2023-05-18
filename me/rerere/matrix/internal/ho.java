package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.scheduler.BukkitRunnable;

@Deprecated(message = "Use New VL System")
public final class ho extends BukkitRunnable {
  @NotNull
  private final Map b;
  
  @NotNull
  private final mn i;
  
  private static final long a = o3.a(-750135646239159776L, 3965977014520839076L, MethodHandles.lookup().lookupClass()).a(5291117380750L);
  
  public void run() {
    long l1 = a ^ 0x713399EE56ABL;
    long l2 = l1 ^ 0x5F5ADD766DF9L;
    int i = yl.r();
    Iterator<yl> iterator = this.i.b().values().iterator();
    label35: while (iterator.hasNext()) {
      label33: while (true) {
        yl yl = iterator.next();
        qd qd = yl.b();
        Iterator<Map.Entry> iterator1 = qd.j().entrySet().iterator();
        while (true) {
          if (iterator1.hasNext()) {
            Map.Entry entry = iterator1.next();
            yk yk = (yk)entry.getKey();
            zg zg = (zg)entry.getValue();
            try {
              if (i != 0) {
                if (i != 0) {
                  if (i != 0) {
                    try {
                      if ((Integer)this.b.get(yk) != null) {
                      
                      } else {
                        ((Integer)this.b.get(yk)).intValue();
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    int j = 0 + 1;
                    Integer integer = Integer.valueOf(j);
                    try {
                      this.b.put(yk, integer);
                      if (i != 0)
                        if (j >= RangesKt.coerceAtLeast(yk.j(), 1)) {
                          this.b.put(yk, Integer.valueOf(0));
                          zg.p(l2, yk.b());
                        } else {
                          continue;
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    if (i == 0)
                      break label33; 
                    continue;
                  } 
                  continue label33;
                } 
                continue label33;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            break;
          } 
        } 
        continue label35;
      } 
    } 
  }
  
  public ho(@NotNull mn parammn) {
    this.i = parammn;
    this.b = new LinkedHashMap<>();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */