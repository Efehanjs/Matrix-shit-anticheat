package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;

public class x {
  private final Map i = new HashMap<>();
  
  private static yk[] a;
  
  private static final long b = o3.a(5742407917532913548L, 3325807574010978942L, MethodHandles.lookup().lookupClass()).a(231059683502318L);
  
  public boolean b(long paramLong, @NotNull Location paramLocation) {
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x65456ED7CA2BL;
    int i = yl.r();
    synchronized (this) {
      Boolean bool = (Boolean)this.i.get(new o(paramLocation));
      try {
        if (i != 0)
          if (bool == null)
            return za.p(paramLocation, l);  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return bool.booleanValue();
    } 
  }
  
  public void j() {
    synchronized (this) {
      this.i.clear();
    } 
  }
  
  public void b(o paramo, boolean paramBoolean) {
    synchronized (this) {
      this.i.put(paramo, Boolean.valueOf(paramBoolean));
    } 
  }
  
  public void b() {
    synchronized (this) {
      long l = pc.j();
      ((List)this.i.keySet().stream().filter(paramo -> {
            long l = b ^ 0x6A18659B8860L;
            int i = yl.a();
            try {
              if (i == 0)
                if (paramo.k < paramLong - 10000L) {
                
                } else {
                  return false;
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          }).collect(Collectors.toList())).forEach(this.i::remove);
    } 
  }
  
  public static void x(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] t() {
    return a;
  }
  
  static {
    if (t() == null)
      x(new yk[3]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */