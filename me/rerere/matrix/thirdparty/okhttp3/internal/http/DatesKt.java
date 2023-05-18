package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.lang.invoke.MethodHandles;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DatesKt {
  @NotNull
  private static final DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT;
  
  public static final long MAX_DATE = 253402300799999L;
  
  @NotNull
  private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
  
  @NotNull
  private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
  
  private static final long a = o3.a(-8703861984084579087L, 6971084985621202285L, MethodHandles.lookup().lookupClass()).a(221793784520756L);
  
  @NotNull
  public static final String toHttpDateString(@NotNull Date paramDate) {
    long l = a ^ 0x3EC2A55053AFL;
    Intrinsics.checkNotNullParameter(paramDate, "<this>");
    String str = ((DateFormat)STANDARD_DATE_FORMAT.get()).format(paramDate);
    Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
    return str;
  }
  
  static {
    long l = a ^ 0x7CD526033F52L;
    STANDARD_DATE_FORMAT = new DatesKt$STANDARD_DATE_FORMAT$1();
    String[] arrayOfString = new String[15];
    arrayOfString[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    arrayOfString[1] = "EEEE, dd-MMM-yy HH:mm:ss zzz";
    arrayOfString[2] = "EEE MMM d HH:mm:ss yyyy";
    arrayOfString[3] = "EEE, dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[4] = "EEE, dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[5] = "EEE, dd MMM yy HH:mm:ss z";
    arrayOfString[6] = "EEE dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[7] = "EEE dd MMM yyyy HH:mm:ss z";
    arrayOfString[8] = "EEE dd-MMM-yyyy HH-mm-ss z";
    arrayOfString[9] = "EEE dd-MMM-yy HH:mm:ss z";
    arrayOfString[10] = "EEE dd MMM yy HH:mm:ss z";
    arrayOfString[11] = "EEE,dd-MMM-yy HH:mm:ss z";
    arrayOfString[12] = "EEE,dd-MMM-yyyy HH:mm:ss z";
    arrayOfString[13] = "EEE, dd-MM-yyyy HH:mm:ss z";
    arrayOfString[14] = "EEE MMM d yyyy HH:mm:ss z";
    BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = arrayOfString;
    BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length];
  }
  
  @Nullable
  public static final Date toHttpDateOrNull(@NotNull String paramString) {
    long l = a ^ 0x6C57573DEE98L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((((CharSequence)paramString).length() == 0))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParsePosition parsePosition = new ParsePosition(0);
    Date date = null;
    date = ((DateFormat)STANDARD_DATE_FORMAT.get()).parse(paramString, parsePosition);
    try {
      if (parsePosition.getIndex() == paramString.length())
        return date; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    synchronized (BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS) {
      boolean bool = false;
      byte b = 0;
      int i = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length;
      while (b < i) {
        byte b1 = b;
        b++;
        DateFormat dateFormat = BROWSER_COMPATIBLE_DATE_FORMATS[b1];
        if (dateFormat == null) {
          SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[b1], Locale.US);
          SimpleDateFormat simpleDateFormat2 = simpleDateFormat1;
          boolean bool1 = false;
          simpleDateFormat2.setTimeZone(Util.UTC);
          dateFormat = simpleDateFormat1;
          BROWSER_COMPATIBLE_DATE_FORMATS[b1] = dateFormat;
        } 
        parsePosition.setIndex(0);
        date = dateFormat.parse(paramString, parsePosition);
        if (parsePosition.getIndex() != 0)
          return date; 
      } 
      Unit unit = Unit.INSTANCE;
    } 
    return null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\DatesKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */