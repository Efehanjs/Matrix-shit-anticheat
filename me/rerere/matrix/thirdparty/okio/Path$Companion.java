package me.rerere.matrix.thirdparty.okio;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.internal._PathKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Path$Companion {
  private static final long a = o3.a(8839398645864361195L, -8812745271734641283L, MethodHandles.lookup().lookupClass()).a(109778448279799L);
  
  @JvmOverloads
  public final Path get(@NotNull Path paramPath, boolean paramBoolean) {
    long l = a ^ 0x6F8460763C2BL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    return get(paramPath.toString(), paramBoolean);
  }
  
  @JvmOverloads
  public final Path get(@NotNull Path paramPath) {
    long l = a ^ 0x50E40109192FL;
    Intrinsics.checkNotNullParameter(paramPath, "<this>");
    return get$default(this, paramPath, false, 1, (Object)null);
  }
  
  @JvmOverloads
  @NotNull
  public final Path get(@NotNull String paramString) {
    long l = a ^ 0x344D6B146B51L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return get$default(this, paramString, false, 1, (Object)null);
  }
  
  @JvmOverloads
  @NotNull
  public final Path get(@NotNull File paramFile, boolean paramBoolean) {
    long l = a ^ 0x5F59C0E0BBC7L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    String str = paramFile.toString();
    Intrinsics.checkNotNullExpressionValue(str, "toString()");
    return get(str, paramBoolean);
  }
  
  @JvmOverloads
  @NotNull
  public final Path get(@NotNull String paramString, boolean paramBoolean) {
    long l = a ^ 0x1167F278BB4EL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return _PathKt.commonToPath(paramString, paramBoolean);
  }
  
  @JvmOverloads
  @NotNull
  public final Path get(@NotNull File paramFile) {
    long l = a ^ 0xD31D2864210L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return get$default(this, paramFile, false, 1, (Object)null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Path$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */