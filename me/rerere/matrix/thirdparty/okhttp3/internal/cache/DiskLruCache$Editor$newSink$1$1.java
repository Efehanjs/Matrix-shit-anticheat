package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DiskLruCache$Editor$newSink$1$1 extends Lambda implements Function1 {
  private static final long a = o3.a(-4503155746348667933L, -2375327194137843363L, MethodHandles.lookup().lookupClass()).a(160238336976393L);
  
  public final void invoke(@NotNull IOException paramIOException) {
    long l = a ^ 0x51AB5F1ABFB4L;
    Intrinsics.checkNotNullParameter(paramIOException, "it");
    DiskLruCache diskLruCache = this.this$0;
    DiskLruCache$Editor diskLruCache$Editor = DiskLruCache$Editor.this;
    synchronized (diskLruCache) {
      boolean bool = false;
      diskLruCache$Editor.detach$okhttp();
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  public DiskLruCache$Editor$newSink$1$1(DiskLruCache$Editor paramDiskLruCache$Editor) {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$Editor$newSink$1$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */