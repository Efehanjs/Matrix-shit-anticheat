package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api.QuoteStyle;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;

public class SnakeYamlQuoteValue {
  private static final Map QUOTE_SCALAR_STYLES = mapQuoteScalarStyles();
  
  public static DumperOptions.ScalarStyle getQuoteScalarStyle(QuoteStyle paramQuoteStyle) {
    return (DumperOptions.ScalarStyle)QUOTE_SCALAR_STYLES.get(paramQuoteStyle);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlQuoteValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */