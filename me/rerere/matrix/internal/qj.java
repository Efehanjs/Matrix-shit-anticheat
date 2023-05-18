package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;

public class qj {
  private long b;
  
  private double i;
  
  private static final long a = o3.a(-5100769359074253744L, 7001087281749014193L, MethodHandles.lookup().lookupClass()).a(121232248929450L);
  
  public boolean equals(Object paramObject) {
    long l = a ^ 0x20C2B8CECE7CL;
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
          if (!(paramObject instanceof qj))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    qj qj1 = (qj)paramObject;
    try {
      if (i != 0)
        try {
          if (!qj1.b(this))
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
          if (Double.compare(b(), qj1.b()) != 0)
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
          if (b() != qj1.b())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public int hashCode() {
    byte b = 59;
    null = 1;
    long l1 = Double.doubleToLongBits(b());
    null = null * 59 + (int)(l1 >>> 32L ^ l1);
    long l2 = b();
    return null * 59 + (int)(l2 >>> 32L ^ l2);
  }
  
  public long b() {
    return this.b;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof qj;
  }
  
  public double b() {
    return this.i;
  }
  
  public qj(double paramDouble, long paramLong) {
    this.i = paramDouble;
    this.b = paramLong;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */