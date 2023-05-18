package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CloseGuard {
  @NotNull
  public static final CloseGuard$Companion Companion;
  
  @Nullable
  private final Method warnIfOpenMethod;
  
  @Nullable
  private final Method getMethod;
  
  @Nullable
  private final Method openMethod;
  
  private static final long a = o3.a(5197897493045291537L, -4350831382934118103L, MethodHandles.lookup().lookupClass()).a(145956989560698L);
  
  static {
    Companion = new CloseGuard$Companion(null);
  }
  
  public CloseGuard(@Nullable Method paramMethod1, @Nullable Method paramMethod2, @Nullable Method paramMethod3) {
    this.getMethod = paramMethod1;
    this.openMethod = paramMethod2;
    this.warnIfOpenMethod = paramMethod3;
  }
  
  @Nullable
  public final Object createAndOpen(@NotNull String paramString) {
    long l = a ^ 0x461C014B6123L;
    Intrinsics.checkNotNullParameter(paramString, "closer");
    if (this.getMethod != null)
      try {
        Object object = this.getMethod.invoke(null, new Object[0]);
        Intrinsics.checkNotNull(this.openMethod);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramString;
        this.openMethod.invoke(object, arrayOfObject);
        return object;
      } catch (Exception exception) {} 
    return null;
  }
  
  public final boolean warnIfOpen(@Nullable Object paramObject) {
    boolean bool = false;
    if (paramObject != null)
      try {
        Intrinsics.checkNotNull(this.warnIfOpenMethod);
        this.warnIfOpenMethod.invoke(paramObject, new Object[0]);
        bool = true;
      } catch (Exception exception) {} 
    return bool;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\CloseGuard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */