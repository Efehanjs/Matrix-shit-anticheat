package me.rerere.matrix.thirdparty.kotlin.math;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;

public class MathKt__MathJVMKt extends MathKt__MathHKt {
  private static final long a = o3.a(-1064374161393403120L, 8798544440309362132L, null).a(39894686179256L);
  
  @SinceKotlin(version = "1.2")
  public static final double log(double paramDouble1, double paramDouble2) {
    try {
      if (paramDouble2 > 0.0D) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          return !((paramDouble2 == 1.0D) ? 1 : 0) ? (Math.log(paramDouble1) / Math.log(paramDouble2)) : Double.NaN;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Double.NaN;
  }
  
  @SinceKotlin(version = "1.2")
  public static final long roundToLong(float paramFloat) {
    return MathKt.roundToLong(paramFloat);
  }
  
  public static final int getSign(int paramInt) {
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt < 0) ? -1 : ((paramInt > 0) ? 1 : 0);
  }
  
  @SinceKotlin(version = "1.2")
  public static final double truncate(double paramDouble) {
    try {
      if (!Double.isNaN(paramDouble)) {
        try {
          if (Double.isInfinite(paramDouble));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramDouble > 0.0D) ? Math.floor(paramDouble) : Math.ceil(paramDouble);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.2")
  public static final double atanh(double paramDouble) {
    if (Math.abs(paramDouble) < Constants.taylor_n_bound) {
      double d = paramDouble;
      if (Math.abs(paramDouble) > Constants.taylor_2_bound)
        d += paramDouble * paramDouble * paramDouble / 3; 
      return d;
    } 
    return Math.log((true + paramDouble) / (true - paramDouble)) / 2;
  }
  
  @SinceKotlin(version = "1.2")
  public static final int roundToInt(double paramDouble) {
    long l = a ^ 0x158C9417057L;
    try {
      if (Double.isNaN(paramDouble))
        throw new IllegalArgumentException("Cannot round NaN value."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramDouble > 2.147483647E9D) ? Integer.MAX_VALUE : ((paramDouble < -2.147483648E9D) ? Integer.MIN_VALUE : (int)Math.round(paramDouble));
  }
  
  @SinceKotlin(version = "1.2")
  public static final double acosh(double paramDouble) {
    try {
      try {
        try {
          double d1 = Math.sqrt(paramDouble - true);
          double d2 = d1;
          if (d1 >= Constants.taylor_2_bound)
            d2 -= d1 * d1 * d1 / 12; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramDouble < 1.0D) ? Double.NaN : ((paramDouble > Constants.upper_taylor_2_bound) ? (Math.log(paramDouble) + Constants.LN2) : ((paramDouble - true >= Constants.taylor_n_bound) ? Math.log(paramDouble + Math.sqrt(paramDouble * paramDouble - true)) : (Math.sqrt(2.0D) * d2)));
  }
  
  @SinceKotlin(version = "1.2")
  public static final int roundToInt(float paramFloat) {
    long l = a ^ 0x375F11874A35L;
    try {
      if (Float.isNaN(paramFloat))
        throw new IllegalArgumentException("Cannot round NaN value."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Math.round(paramFloat);
  }
  
  @SinceKotlin(version = "1.2")
  public static final double asinh(double paramDouble) {
    try {
      if (paramDouble >= Constants.taylor_n_bound) {
        try {
          if (paramDouble > Constants.upper_taylor_n_bound) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
          double d = paramDouble;
          if (Math.abs(paramDouble) >= Constants.taylor_2_bound)
            d -= paramDouble * paramDouble * paramDouble / 6; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramDouble <= -Constants.taylor_n_bound) ? -MathKt.asinh(-paramDouble) : d;
  }
  
  @SinceKotlin(version = "1.2")
  public static final double log2(double paramDouble) {
    return Math.log(paramDouble) / Constants.LN2;
  }
  
  @SinceKotlin(version = "1.2")
  public static final long roundToLong(double paramDouble) {
    long l = a ^ 0x11CB76263F51L;
    try {
      if (Double.isNaN(paramDouble))
        throw new IllegalArgumentException("Cannot round NaN value."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Math.round(paramDouble);
  }
  
  @SinceKotlin(version = "1.2")
  public static final float log2(float paramFloat) {
    return (float)(Math.log(paramFloat) / Constants.LN2);
  }
  
  public static final int getSign(long paramLong) {
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramLong < 0L) ? -1 : ((paramLong > 0L) ? 1 : 0);
  }
  
  @SinceKotlin(version = "1.2")
  public static final float truncate(float paramFloat) {
    try {
      if (!Float.isNaN(paramFloat)) {
        try {
          if (Float.isInfinite(paramFloat));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramFloat > 0.0F) ? (float)Math.floor(paramFloat) : (float)Math.ceil(paramFloat);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.2")
  public static final float log(float paramFloat1, float paramFloat2) {
    try {
      if (paramFloat2 > 0.0F) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          return !((paramFloat2 == 1.0F) ? 1 : 0) ? (float)(Math.log(paramFloat1) / Math.log(paramFloat2)) : Float.NaN;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Float.NaN;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\math\MathKt__MathJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */