package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ScreenFloatValueRegEx {
  @JvmField
  @NotNull
  public static final Regex value;
  
  @NotNull
  public static final ScreenFloatValueRegEx INSTANCE = new ScreenFloatValueRegEx();
  
  static {
    ScreenFloatValueRegEx screenFloatValueRegEx1 = INSTANCE;
    ScreenFloatValueRegEx screenFloatValueRegEx2 = screenFloatValueRegEx1;
    boolean bool = false;
    String str1 = "(\\p{Digit}+)";
    String str2 = "(\\p{XDigit}+)";
    String str3 = "[eE][+-]?" + str1;
    String str4 = "(0[xX]" + str2 + "(\\.)?)|(0[xX]" + str2 + "?(\\.)" + str2 + ')';
    String str5 = '(' + str1 + "(\\.)?(" + str1 + "?)(" + str3 + ")?)|(\\.(" + str1 + ")(" + str3 + ")?)|((" + str4 + ")[pP][+-]?" + str1 + ')';
    String str6 = "[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + str5 + ")[fFdD]?))[\\x00-\\x20]*";
    value = new Regex(str6);
  }
  
  static {
    long l = o3.a(2273789593196223934L, -5064517012574771500L, null).a(122366937571309L) ^ 0x3B5C47348157L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\ScreenFloatValueRegEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */