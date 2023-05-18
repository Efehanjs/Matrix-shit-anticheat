package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number {
  private final String value;
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    if (paramObject instanceof LazilyParsedNumber) {
      LazilyParsedNumber lazilyParsedNumber = (LazilyParsedNumber)paramObject;
      try {
        if (this.value != lazilyParsedNumber.value) {
          try {
            if (this.value.equals(lazilyParsedNumber.value));
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } else {
      return false;
    } 
  }
  
  public String toString() {
    return this.value;
  }
  
  public int intValue() {
    try {
      return Integer.parseInt(this.value);
    } catch (NumberFormatException numberFormatException) {
      try {
        return (int)Long.parseLong(this.value);
      } catch (NumberFormatException numberFormatException1) {
        return (new BigDecimal(this.value)).intValue();
      } 
    } 
  }
  
  public long longValue() {
    try {
      return Long.parseLong(this.value);
    } catch (NumberFormatException numberFormatException) {
      return (new BigDecimal(this.value)).longValue();
    } 
  }
  
  public int hashCode() {
    return this.value.hashCode();
  }
  
  public double doubleValue() {
    return Double.parseDouble(this.value);
  }
  
  public float floatValue() {
    return Float.parseFloat(this.value);
  }
  
  public LazilyParsedNumber(String paramString) {
    this.value = paramString;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\LazilyParsedNumber.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */