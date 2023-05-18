package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum YamlCommentFormat {
  DEFAULT(YamlCommentFormatter::new),
  RAW(YamlCommentFormatter::new),
  PRETTY(PrettyYamlCommentFormatter::new),
  BLANK_LINE(BlankLineYamlCommentFormatter::new);
  
  private YamlCommentFormatter yamlCommentFormatter;
  
  private final YamlCommentFormat$YamlCommentFormatterFactory yamlCommentFormatterFactory;
  
  public YamlCommentFormatter commentFormatter() {
    try {
      if (this.yamlCommentFormatter == null)
        buildCommentFormatter(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.yamlCommentFormatter;
  }
  
  public static void reset() {
    for (YamlCommentFormat yamlCommentFormat : values()) {
      try {
        if (yamlCommentFormat.yamlCommentFormatter != null)
          yamlCommentFormat.buildCommentFormatter(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  static {
    RAW = new YamlCommentFormat("RAW", 3, () -> (new YamlCommentFormatter()).stripPrefix(false).trim(false));
    $VALUES = new YamlCommentFormat[] { DEFAULT, PRETTY, BLANK_LINE, RAW };
  }
  
  YamlCommentFormat(YamlCommentFormat$YamlCommentFormatterFactory paramYamlCommentFormat$YamlCommentFormatterFactory) {
    this.yamlCommentFormatterFactory = paramYamlCommentFormat$YamlCommentFormatterFactory;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    long l = o3.a(2028800544812856981L, -4996365886503780301L, MethodHandles.lookup().lookupClass()).a(266119544825695L) ^ 0x2CB1B8980EA0L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\YamlCommentFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */