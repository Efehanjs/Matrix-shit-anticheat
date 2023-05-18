package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CloseGuard$Companion {
  private static final long a = o3.a(-4702535197548648137L, -1824668270811879274L, MethodHandles.lookup().lookupClass()).a(266854420607018L);
  
  @NotNull
  public final CloseGuard get() {
    long l = a ^ 0x41D706E4EEA0L;
    Method method1 = null;
    Method method2 = null;
    Method method3 = null;
    try {
      Class<?> clazz = Class.forName("dalvik.system.CloseGuard");
      method1 = clazz.getMethod("get", new Class[0]);
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = String.class;
      method2 = clazz.getMethod("open", arrayOfClass);
      method3 = clazz.getMethod("warnIfOpen", new Class[0]);
    } catch (Exception exception) {
      method1 = null;
      method2 = null;
      method3 = null;
    } 
    return new CloseGuard(method1, method2, method3);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\CloseGuard$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */