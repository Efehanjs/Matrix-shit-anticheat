package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum YamlCommentReader$ReadingQuoteStyle {
  SINGLE,
  LITERAL,
  DOUBLE,
  NONE(false);
  
  private final char quote;
  
  YamlCommentReader$ReadingQuoteStyle(char paramChar) {
    this.quote = paramChar;
  }
  
  public char getChar() {
    return this.quote;
  }
  
  static {
    SINGLE = new YamlCommentReader$ReadingQuoteStyle("SINGLE", 1, '\'');
    DOUBLE = new YamlCommentReader$ReadingQuoteStyle("DOUBLE", 2, '"');
    LITERAL = new YamlCommentReader$ReadingQuoteStyle("LITERAL", 3, '|');
    $VALUES = new YamlCommentReader$ReadingQuoteStyle[] { NONE, SINGLE, DOUBLE, LITERAL };
  }
  
  static {
    long l = o3.a(7398351840239659595L, -7061259360238939111L, MethodHandles.lookup().lookupClass()).a(202347181963720L) ^ 0x3F9A7CDEA5CCL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentReader$ReadingQuoteStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */