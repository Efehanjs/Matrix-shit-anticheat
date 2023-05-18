package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements Function1 {
  private static final long a = o3.a(1912502955183707332L, 5119555616334401206L, MethodHandles.lookup().lookupClass()).a(246299619440429L);
  
  public final void invoke(@NotNull IOException paramIOException) {
    long l = a ^ 0x32DA9E0290ABL;
    Intrinsics.checkNotNullParameter(paramIOException, "it");
    DiskLruCache diskLruCache = DiskLruCache.this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(diskLruCache))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    DiskLruCache.access$setHasJournalErrors$p(DiskLruCache.this, true);
  }
  
  public DiskLruCache$newJournalWriter$faultHidingSink$1() {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\DiskLruCache$newJournalWriter$faultHidingSink$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */