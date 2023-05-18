package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public enum CharCategory {
  DECIMAL_DIGIT_NUMBER,
  SPACE_SEPARATOR,
  CONNECTOR_PUNCTUATION,
  MODIFIER_LETTER,
  END_PUNCTUATION,
  DASH_PUNCTUATION,
  PRIVATE_USE,
  LINE_SEPARATOR,
  LETTER_NUMBER,
  UPPERCASE_LETTER,
  OTHER_NUMBER,
  OTHER_PUNCTUATION,
  TITLECASE_LETTER,
  MODIFIER_SYMBOL,
  SURROGATE,
  INITIAL_QUOTE_PUNCTUATION,
  CONTROL,
  MATH_SYMBOL,
  FINAL_QUOTE_PUNCTUATION,
  START_PUNCTUATION,
  UNASSIGNED(0, "Cn"),
  FORMAT(0, "Cn"),
  PARAGRAPH_SEPARATOR(0, "Cn"),
  COMBINING_SPACING_MARK(0, "Cn"),
  OTHER_LETTER(0, "Cn"),
  LOWERCASE_LETTER(0, "Cn"),
  ENCLOSING_MARK(0, "Cn"),
  CURRENCY_SYMBOL(0, "Cn"),
  NON_SPACING_MARK(0, "Cn"),
  OTHER_SYMBOL(0, "Cn");
  
  @NotNull
  public static final CharCategory$Companion Companion;
  
  @NotNull
  private final String code;
  
  private final int value;
  
  static {
    UPPERCASE_LETTER = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
    LOWERCASE_LETTER = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
    TITLECASE_LETTER = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
    MODIFIER_LETTER = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
    OTHER_LETTER = new CharCategory("OTHER_LETTER", 5, 5, "Lo");
    NON_SPACING_MARK = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
    ENCLOSING_MARK = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");
    COMBINING_SPACING_MARK = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
    DECIMAL_DIGIT_NUMBER = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    LETTER_NUMBER = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");
    OTHER_NUMBER = new CharCategory("OTHER_NUMBER", 11, 11, "No");
    SPACE_SEPARATOR = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
    LINE_SEPARATOR = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
    PARAGRAPH_SEPARATOR = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    CONTROL = new CharCategory("CONTROL", 15, 15, "Cc");
    FORMAT = new CharCategory("FORMAT", 16, 16, "Cf");
    PRIVATE_USE = new CharCategory("PRIVATE_USE", 17, 18, "Co");
    SURROGATE = new CharCategory("SURROGATE", 18, 19, "Cs");
    DASH_PUNCTUATION = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
    START_PUNCTUATION = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");
    END_PUNCTUATION = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");
    CONNECTOR_PUNCTUATION = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    OTHER_PUNCTUATION = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
    MATH_SYMBOL = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
    CURRENCY_SYMBOL = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
    MODIFIER_SYMBOL = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
    OTHER_SYMBOL = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
    INITIAL_QUOTE_PUNCTUATION = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    FINAL_QUOTE_PUNCTUATION = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");
    $VALUES = $values();
    Companion = new CharCategory$Companion(null);
  }
  
  public final int getValue() {
    return this.value;
  }
  
  public final boolean contains(char paramChar) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Character.getType(paramChar) == this.value);
  }
  
  CharCategory(int paramInt1, String paramString1) {
    this.value = paramInt1;
    this.code = paramString1;
  }
  
  @NotNull
  public final String getCode() {
    return this.code;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    long l = o3.a(4506543218263667696L, 1161237738024991466L, null).a(189364593386372L) ^ 0x7F3B45BC1924L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */