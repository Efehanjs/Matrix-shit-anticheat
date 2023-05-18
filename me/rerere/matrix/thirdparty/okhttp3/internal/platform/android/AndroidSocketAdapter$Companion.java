package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AndroidSocketAdapter$Companion {
  private static final long a = o3.a(8911256489832352131L, 7679036578136842818L, MethodHandles.lookup().lookupClass()).a(134957093854705L);
  
  @NotNull
  public final DeferredSocketAdapter$Factory factory(@NotNull String paramString) {
    long l = a ^ 0x480242EE4045L;
    Intrinsics.checkNotNullParameter(paramString, "packageName");
    return new AndroidSocketAdapter$Companion$factory$1(paramString);
  }
  
  @NotNull
  public final DeferredSocketAdapter$Factory getPlayProviderFactory() {
    return AndroidSocketAdapter.access$getPlayProviderFactory$cp();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidSocketAdapter$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */