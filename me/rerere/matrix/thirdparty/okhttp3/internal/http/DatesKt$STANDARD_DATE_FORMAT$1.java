package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.lang.invoke.MethodHandles;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DatesKt$STANDARD_DATE_FORMAT$1 extends ThreadLocal {
  private static final long a = o3.a(8549846753605655741L, -3882953933077729546L, MethodHandles.lookup().lookupClass()).a(156968053917879L);
  
  @NotNull
  public DateFormat initialValue() {
    long l = a ^ 0x227916F4B3E8L;
    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
    SimpleDateFormat simpleDateFormat2 = simpleDateFormat1;
    boolean bool = false;
    simpleDateFormat2.setLenient(false);
    simpleDateFormat2.setTimeZone(Util.UTC);
    return simpleDateFormat1;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\DatesKt$STANDARD_DATE_FORMAT$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */