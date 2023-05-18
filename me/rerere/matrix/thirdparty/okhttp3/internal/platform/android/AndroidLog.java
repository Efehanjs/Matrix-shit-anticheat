package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import android.util.Log;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.OkHttpClient;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.http2.Http2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SuppressSignatureCheck
public final class AndroidLog {
  @NotNull
  private static final CopyOnWriteArraySet configuredLoggers;
  
  @NotNull
  public static final AndroidLog INSTANCE;
  
  private static final int MAX_LOG_LENGTH = 4000;
  
  @NotNull
  private static final Map knownLoggers;
  
  private static final long a = o3.a(4952792631837129478L, -6758033531673604139L, MethodHandles.lookup().lookupClass()).a(159288387098034L);
  
  static {
    long l = a ^ 0x70E259A11332L;
    INSTANCE = new AndroidLog();
    configuredLoggers = new CopyOnWriteArraySet();
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<>();
    LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
    boolean bool = false;
    try {
      OkHttpClient.class.getPackage();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str1 = (OkHttpClient.class.getPackage() == null) ? null : OkHttpClient.class.getPackage().getName();
    if (str1 != null) {
      LinkedHashMap<Object, Object> linkedHashMap = linkedHashMap2;
      String str = "OkHttp";
      linkedHashMap.put(str1, str);
    } 
    LinkedHashMap<Object, Object> linkedHashMap3 = linkedHashMap2;
    String str2 = OkHttpClient.class.getName();
    Intrinsics.checkNotNullExpressionValue(str2, "OkHttpClient::class.java.name");
    str2 = str2;
    String str3 = "okhttp.OkHttpClient";
    linkedHashMap3.put(str2, str3);
    linkedHashMap3 = linkedHashMap2;
    str2 = Http2.class.getName();
    Intrinsics.checkNotNullExpressionValue(str2, "Http2::class.java.name");
    str2 = str2;
    str3 = "okhttp.Http2";
    linkedHashMap3.put(str2, str3);
    linkedHashMap3 = linkedHashMap2;
    str2 = TaskRunner.class.getName();
    Intrinsics.checkNotNullExpressionValue(str2, "TaskRunner::class.java.name");
    str2 = str2;
    str3 = "okhttp.TaskRunner";
    linkedHashMap3.put(str2, str3);
    linkedHashMap3 = linkedHashMap2;
    str2 = "me.rerere.matrix.thirdparty.okhttp3.mockwebserver.MockWebServer";
    str3 = "okhttp.MockWebServer";
    linkedHashMap3.put(str2, str3);
    knownLoggers = MapsKt.toMap(linkedHashMap1);
  }
  
  public final void enable() {
    for (Map.Entry entry : knownLoggers.entrySet()) {
      String str1 = (String)entry.getKey();
      String str2 = (String)entry.getValue();
      enableLogging(str1, str2);
    } 
  }
  
  public final void androidLog$okhttp(@NotNull String paramString1, int paramInt, @NotNull String paramString2, @Nullable Throwable paramThrowable) {
    long l = a ^ 0x12D94EB06F06L;
    Intrinsics.checkNotNullParameter(paramString1, "loggerName");
    Intrinsics.checkNotNullParameter(paramString2, "message");
    String str = loggerTag(paramString1);
    if (Log.isLoggable(str, paramInt)) {
      String str1 = paramString2;
      if (paramThrowable != null)
        str1 = str1 + '\n' + Log.getStackTraceString(paramThrowable); 
      int i = 0;
      int j = str1.length();
      while (i < j) {
        int k = StringsKt.indexOf$default(str1, '\n', i, false, 4, null);
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        k = (k != -1) ? k : j;
        while (true) {
          int n = i + 4000;
          int m = Math.min(k, n);
          Intrinsics.checkNotNullExpressionValue(str1.substring(i, m), "this as java.lang.String…ing(startIndex, endIndex)");
          Log.println(paramInt, str, str1.substring(i, m));
          i = m;
          if (i >= k) {
            m = i;
            i = m + 1;
          } 
        } 
      } 
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */