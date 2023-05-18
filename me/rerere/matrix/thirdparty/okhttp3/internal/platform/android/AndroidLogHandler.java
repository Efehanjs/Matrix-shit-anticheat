package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AndroidLogHandler extends Handler {
  @NotNull
  public static final AndroidLogHandler INSTANCE;
  
  private static final long a = o3.a(8191622183158964646L, 3964667723352858423L, MethodHandles.lookup().lookupClass()).a(217018032918819L);
  
  public void flush() {}
  
  static {
    INSTANCE = new AndroidLogHandler();
  }
  
  public void close() {}
  
  public void publish(@NotNull LogRecord paramLogRecord) {
    long l = a ^ 0x7D90A5D31045L;
    Intrinsics.checkNotNullParameter(paramLogRecord, "record");
    String str = paramLogRecord.getLoggerName();
    Intrinsics.checkNotNullExpressionValue(str, "record.loggerName");
    str = paramLogRecord.getMessage();
    Intrinsics.checkNotNullExpressionValue(str, "record.message");
    AndroidLog.INSTANCE.androidLog$okhttp(str, AndroidLogKt.access$getAndroidLevel(paramLogRecord), str, paramLogRecord.getThrown());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidLogHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */