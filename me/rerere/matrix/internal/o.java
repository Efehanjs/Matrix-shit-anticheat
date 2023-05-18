package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;

public class o {
  public long k;
  
  public double v;
  
  public double b;
  
  public double i;
  
  private static String[] a;
  
  private static final long c = o3.a(1783044338992863440L, 8250643884623126747L, MethodHandles.lookup().lookupClass()).a(272290779508651L);
  
  public boolean equals(Object paramObject) {
    long l = c ^ 0x70E78B80EC47L;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (paramObject == this)
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (!(paramObject instanceof o))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    o o1 = (o)paramObject;
    try {
      if (i != 0)
        try {
          if (!o1.b(this))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(b(), o1.b()) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(j(), o1.j()) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (Double.compare(p(), o1.p()) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public o(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong) {
    this.b = paramDouble1;
    this.v = paramDouble2;
    this.i = paramDouble3;
    this.k = paramLong;
  }
  
  public double p() {
    return this.i;
  }
  
  public o(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.b = paramDouble1;
    this.v = paramDouble2;
    this.i = paramDouble3;
    this.k = pc.j();
  }
  
  public o(@NotNull Location paramLocation) {
    this.b = paramLocation.getX();
    this.v = paramLocation.getY();
    this.i = paramLocation.getZ();
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof o;
  }
  
  public int hashCode() {
    byte b = 59;
    null = 1;
    long l1 = Double.doubleToLongBits(b());
    null = null * 59 + (int)(l1 >>> 32L ^ l1);
    long l2 = Double.doubleToLongBits(j());
    null = null * 59 + (int)(l2 >>> 32L ^ l2);
    long l3 = Double.doubleToLongBits(p());
    return null * 59 + (int)(l3 >>> 32L ^ l3);
  }
  
  public double j() {
    return this.v;
  }
  
  public long b() {
    return this.k;
  }
  
  public double b() {
    return this.b;
  }
  
  public static void e(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] n() {
    return a;
  }
  
  static {
    if (n() != null)
      e(new String[5]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */