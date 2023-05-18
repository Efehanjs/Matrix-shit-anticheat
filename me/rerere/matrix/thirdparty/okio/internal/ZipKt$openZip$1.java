package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ZipKt$openZip$1 extends Lambda implements Function1 {
  public static final ZipKt$openZip$1 INSTANCE;
  
  private static final long a = o3.a(-9174643278536188443L, -6007559181989781711L, MethodHandles.lookup().lookupClass()).a(207345216565920L);
  
  @NotNull
  public final Boolean invoke(@NotNull ZipEntry paramZipEntry) {
    long l = a ^ 0x607F71755C4CL;
    Intrinsics.checkNotNullParameter(paramZipEntry, "it");
    return Boolean.valueOf(true);
  }
  
  public ZipKt$openZip$1() {
    super(1);
  }
  
  static {
    INSTANCE = new ZipKt$openZip$1();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ZipKt$openZip$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */