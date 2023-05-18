package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum YamlCommentReader$ReaderStage {
  END_OF_FILE, QUOTE_OPEN, KEY, END_OF_LINE, AFTER_KEY, QUOTE_CLOSE, VALUE, COMMENT, NEW_LINE, START;
  
  static {
    NEW_LINE = new YamlCommentReader$ReaderStage("NEW_LINE", 1);
    KEY = new YamlCommentReader$ReaderStage("KEY", 2);
    AFTER_KEY = new YamlCommentReader$ReaderStage("AFTER_KEY", 3);
    VALUE = new YamlCommentReader$ReaderStage("VALUE", 4);
    COMMENT = new YamlCommentReader$ReaderStage("COMMENT", 5);
    QUOTE_OPEN = new YamlCommentReader$ReaderStage("QUOTE_OPEN", 6);
    QUOTE_CLOSE = new YamlCommentReader$ReaderStage("QUOTE_CLOSE", 7);
    END_OF_LINE = new YamlCommentReader$ReaderStage("END_OF_LINE", 8);
    END_OF_FILE = new YamlCommentReader$ReaderStage("END_OF_FILE", 9);
    $VALUES = new YamlCommentReader$ReaderStage[] { START, NEW_LINE, KEY, AFTER_KEY, VALUE, COMMENT, QUOTE_OPEN, QUOTE_CLOSE, END_OF_LINE, END_OF_FILE };
  }
  
  static {
    long l = o3.a(-3876001374603556008L, 7257185756874709010L, MethodHandles.lookup().lookupClass()).a(14513595393602L) ^ 0x12602359C838L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\YamlCommentReader$ReaderStage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */