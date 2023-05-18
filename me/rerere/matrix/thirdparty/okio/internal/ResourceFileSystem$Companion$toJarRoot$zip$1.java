package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ResourceFileSystem$Companion$toJarRoot$zip$1 extends Lambda implements Function1 {
  public static final ResourceFileSystem$Companion$toJarRoot$zip$1 INSTANCE;
  
  private static final long a = o3.a(362893472514834189L, -7444589794215911753L, MethodHandles.lookup().lookupClass()).a(37878543799330L);
  
  static {
    INSTANCE = new ResourceFileSystem$Companion$toJarRoot$zip$1();
  }
  
  @NotNull
  public final Boolean invoke(@NotNull ZipEntry paramZipEntry) {
    long l = a ^ 0x7CD466373EE3L;
    Intrinsics.checkNotNullParameter(paramZipEntry, "entry");
    return Boolean.valueOf(ResourceFileSystem$Companion.access$keepPath(ResourceFileSystem.access$getCompanion$p(), paramZipEntry.getCanonicalPath()));
  }
  
  public ResourceFileSystem$Companion$toJarRoot$zip$1() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ResourceFileSystem$Companion$toJarRoot$zip$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */