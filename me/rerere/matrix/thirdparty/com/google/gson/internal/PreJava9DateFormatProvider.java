package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import me.rerere.matrix.internal.o3;

public class PreJava9DateFormatProvider {
  private static final long a = o3.a(-4071039681675397093L, 8720157944008405554L, null).a(148878672118007L);
  
  public static DateFormat getUSDateTimeFormat(int paramInt1, int paramInt2) {
    String str = getDatePartOfDateTimePattern(paramInt1) + " " + getTimePartOfDateTimePattern(paramInt2);
    return new SimpleDateFormat(str, Locale.US);
  }
  
  public static DateFormat getUSDateFormat(int paramInt) {
    return new SimpleDateFormat(getDateFormatPattern(paramInt), Locale.US);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\PreJava9DateFormatProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */