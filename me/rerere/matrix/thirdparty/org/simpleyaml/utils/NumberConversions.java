package me.rerere.matrix.thirdparty.org.simpleyaml.utils;

public final class NumberConversions {
  public static double square(double paramDouble) {
    return paramDouble * paramDouble;
  }
  
  public static float toFloat(Object paramObject) {
    try {
      if (paramObject instanceof Number)
        return ((Number)paramObject).floatValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Float.parseFloat(paramObject.toString());
    } catch (NumberFormatException|NullPointerException numberFormatException) {
      return 0.0F;
    } 
  }
  
  public static int floor(double paramDouble) {
    int i = (int)paramDouble;
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (i == paramDouble) ? i : (i - (int)(Double.doubleToRawLongBits(paramDouble) >>> 63L));
  }
  
  public static int round(double paramDouble) {
    return floor(paramDouble + 0.5D);
  }
  
  public static int ceil(double paramDouble) {
    int i = (int)paramDouble;
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (i == paramDouble) ? i : (i + (int)((Double.doubleToRawLongBits(paramDouble) ^ 0xFFFFFFFFFFFFFFFFL) >>> 63L));
  }
  
  public static int toInt(Object paramObject) {
    try {
      if (paramObject instanceof Number)
        return ((Number)paramObject).intValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Integer.parseInt(paramObject.toString());
    } catch (NumberFormatException|NullPointerException numberFormatException) {
      return 0;
    } 
  }
  
  public static long toLong(Object paramObject) {
    try {
      if (paramObject instanceof Number)
        return ((Number)paramObject).longValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Long.parseLong(paramObject.toString());
    } catch (NumberFormatException|NullPointerException numberFormatException) {
      return 0L;
    } 
  }
  
  public static double toDouble(Object paramObject) {
    try {
      if (paramObject instanceof Number)
        return ((Number)paramObject).doubleValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Double.parseDouble(paramObject.toString());
    } catch (NumberFormatException|NullPointerException numberFormatException) {
      return 0.0D;
    } 
  }
  
  public static short toShort(Object paramObject) {
    try {
      if (paramObject instanceof Number)
        return ((Number)paramObject).shortValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Short.parseShort(paramObject.toString());
    } catch (NumberFormatException|NullPointerException numberFormatException) {
      return 0;
    } 
  }
  
  public static byte toByte(Object paramObject) {
    try {
      if (paramObject instanceof Number)
        return ((Number)paramObject).byteValue(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Byte.parseByte(paramObject.toString());
    } catch (NumberFormatException|NullPointerException numberFormatException) {
      return 0;
    } 
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyam\\utils\NumberConversions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */