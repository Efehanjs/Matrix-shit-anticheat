package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.Closeable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CloseableKt {
  private static final long a = o3.a(-7626019129990033134L, -7095929584271566845L, null).a(203577493929832L);
  
  @SinceKotlin(version = "1.1")
  @PublishedApi
  public static final void closeFinally(@Nullable Closeable paramCloseable, @Nullable Throwable paramThrowable) {
    try {
      if (paramCloseable != null)
        try {
          if (paramThrowable == null) {
            paramCloseable.close();
          } else {
            try {
              paramCloseable.close();
            } catch (Throwable throwable) {
              ExceptionsKt.addSuppressed(paramThrowable, throwable);
            } 
          } 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\CloseableKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */