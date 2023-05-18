package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.util.Vector;

public class yn {
  private boolean r = false;
  
  private final double x;
  
  private final long z;
  
  private boolean k = false;
  
  private final boolean v;
  
  private final double b;
  
  private final double i;
  
  private static String[] a;
  
  private static final long c = o3.a(-1351822868311016117L, 6678514428420102307L, MethodHandles.lookup().lookupClass()).a(68338261792638L);
  
  public double m() {
    return this.x;
  }
  
  public void j(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  @NotNull
  public Vector b() {
    return new Vector(this.x, this.i, this.b);
  }
  
  public double p() {
    return Math.sqrt(this.x * this.x + this.b * this.b);
  }
  
  public boolean p() {
    return this.v;
  }
  
  public long b() {
    return this.z;
  }
  
  public void b(boolean paramBoolean) {
    this.r = paramBoolean;
  }
  
  public double j() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    long l = c ^ 0x2933FC63D78AL;
    int i = yl.a();
    try {
      if (i == 0)
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
      if (i == 0)
        try {
          if (!(paramObject instanceof yn))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    yn yn1 = (yn)paramObject;
    try {
      if (i == 0)
        try {
          if (!yn1.b(this))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (Double.compare(m(), yn1.m()) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (Double.compare(b(), yn1.b()) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (Double.compare(j(), yn1.j()) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (b() != yn1.b())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        try {
          if (p() != yn1.p())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i == 0) {
        try {
          if (j() != yn1.j())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (i == 0) {
          
          } else {
            return b();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (j() != yn1.j())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public double b() {
    return this.i;
  }
  
  public int hashCode() {
    long l1 = c ^ 0x23445B187CCL;
    byte b = 59;
    int j = 1;
    long l2 = Double.doubleToLongBits(m());
    j = j * 59 + (int)(l2 >>> 32L ^ l2);
    long l3 = Double.doubleToLongBits(b());
    j = j * 59 + (int)(l3 >>> 32L ^ l3);
    long l4 = Double.doubleToLongBits(j());
    j = j * 59 + (int)(l4 >>> 32L ^ l4);
    long l5 = b();
    int i = yl.a();
    j = j * 59 + (int)(l5 >>> 32L ^ l5);
    try {
      if (i == 0)
        if (p()) {
        
        } else {
          j = j * 59 + 97;
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public yn(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong, boolean paramBoolean) {
    this.x = paramDouble1;
    this.i = paramDouble2;
    this.b = paramDouble3;
    this.z = paramLong;
    this.v = paramBoolean;
  }
  
  public boolean j() {
    return this.r;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof yn;
  }
  
  public boolean b() {
    return this.k;
  }
  
  public static void d(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] x() {
    return a;
  }
  
  static {
    if (x() == null)
      d(new String[1]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */