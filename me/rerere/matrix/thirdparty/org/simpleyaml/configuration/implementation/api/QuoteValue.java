package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public class QuoteValue {
  public final Object value;
  
  public final QuoteStyle quoteStyle;
  
  private static final long a = o3.a(3137803360867652192L, -1294696359569352666L, MethodHandles.lookup().lookupClass()).a(131370467456519L);
  
  public String toString() {
    long l = a ^ 0x767F1DB88F6FL;
    return this.quoteStyle.toString() + "=" + ((this.value == null) ? "!!null" : StringUtils.quoteNewLines(this.value.toString()));
  }
  
  public Object getValue() {
    return this.value;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    QuoteValue quoteValue = (QuoteValue)paramObject;
    try {
      if (Objects.equals(this.value, quoteValue.value))
        try {
          if (this.quoteStyle == quoteValue.quoteStyle);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public QuoteValue(Object paramObject, QuoteStyle paramQuoteStyle) {
    this.value = paramObject;
    this.quoteStyle = paramQuoteStyle;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.value, this.quoteStyle });
  }
  
  public QuoteStyle getQuoteStyle() {
    return this.quoteStyle;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\api\QuoteValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */