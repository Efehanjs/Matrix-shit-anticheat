package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.file;

import java.util.HashMap;
import java.util.Map;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteStyle;

public final class YamlConfigurationOptions$QuoteStyleDefaults {
  private QuoteStyle defaultQuoteStyle = defaultQuoteStyle();
  
  private final Map typeQuoteStyles = new HashMap<>();
  
  public Map getQuoteStyles() {
    return this.typeQuoteStyles;
  }
  
  public YamlConfigurationOptions$QuoteStyleDefaults setDefaultQuoteStyle(QuoteStyle paramQuoteStyle) {
    if (paramQuoteStyle == null)
      paramQuoteStyle = defaultQuoteStyle(); 
    this.defaultQuoteStyle = paramQuoteStyle;
    return this;
  }
  
  public QuoteStyle getQuoteStyle(Class paramClass) {
    QuoteStyle quoteStyle = getExplicitQuoteStyleInstanceOf(paramClass);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (quoteStyle != null) ? quoteStyle : getDefaultQuoteStyle();
  }
  
  public YamlConfigurationOptions$QuoteStyleDefaults setQuoteStyle(Class<?> paramClass, QuoteStyle paramQuoteStyle) {
    try {
      if (paramQuoteStyle == null) {
        this.typeQuoteStyles.remove(paramClass);
      } else {
        this.typeQuoteStyles.put(paramClass, paramQuoteStyle);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this;
  }
  
  public QuoteStyle getExplicitQuoteStyleInstanceOf(Class<?> paramClass) {
    QuoteStyle quoteStyle = (QuoteStyle)this.typeQuoteStyles.get(paramClass);
    try {
      if (quoteStyle == null && paramClass != null)
        for (Class clazz : this.typeQuoteStyles.keySet()) {
          try {
            if (clazz.isAssignableFrom(paramClass))
              return (QuoteStyle)this.typeQuoteStyles.get(clazz); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return quoteStyle;
  }
  
  public QuoteStyle getDefaultQuoteStyle() {
    return this.defaultQuoteStyle;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\file\YamlConfigurationOptions$QuoteStyleDefaults.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */