package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;

public enum RegexOption implements FlagEnum {
  MULTILINE,
  COMMENTS,
  LITERAL,
  UNIX_LINES,
  CANON_EQ,
  IGNORE_CASE(2, 0, 2, null),
  DOT_MATCHES_ALL(2, 0, 2, null);
  
  private final int mask;
  
  private final int value;
  
  public int getValue() {
    return this.value;
  }
  
  static {
    MULTILINE = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
    LITERAL = new RegexOption("LITERAL", 2, 16, 0, 2, null);
    UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
    COMMENTS = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
    DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    CANON_EQ = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);
    $VALUES = $values();
  }
  
  public int getMask() {
    return this.mask;
  }
  
  RegexOption(int paramInt1, int paramInt2) {
    this.value = paramInt1;
    this.mask = paramInt2;
  }
  
  static {
    long l = o3.a(1155068421516536922L, -1102307361590387365L, null).a(45006495856051L) ^ 0x25331879C4F3L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\RegexOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */