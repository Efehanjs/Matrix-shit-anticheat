package me.rerere.matrix.thirdparty.kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.HidesMembers;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.PlatformImplementationsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ExceptionsKt__ExceptionsKt {
  private static final long a = o3.a(-7923704619803777274L, 3571571780632458517L, null).a(214051052458622L);
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final String stackTraceToString(@NotNull Throwable paramThrowable) {
    long l = a ^ 0x2666FC225210L;
    Intrinsics.checkNotNullParameter(paramThrowable, "<this>");
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    paramThrowable.printStackTrace(printWriter);
    printWriter.flush();
    Intrinsics.checkNotNullExpressionValue(stringWriter.toString(), "sw.toString()");
    return stringWriter.toString();
  }
  
  @NotNull
  public static final List getSuppressedExceptions(@NotNull Throwable paramThrowable) {
    long l = a ^ 0x7D3DC18AE06AL;
    Intrinsics.checkNotNullParameter(paramThrowable, "<this>");
    return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(paramThrowable);
  }
  
  @SinceKotlin(version = "1.1")
  @HidesMembers
  public static final void addSuppressed(@NotNull Throwable paramThrowable1, @NotNull Throwable paramThrowable2) {
    long l = a ^ 0x5F417F54D075L;
    try {
      Intrinsics.checkNotNullParameter(paramThrowable1, "<this>");
      Intrinsics.checkNotNullParameter(paramThrowable2, "exception");
      if (paramThrowable1 != paramThrowable2)
        PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(paramThrowable1, paramThrowable2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final StackTraceElement[] getStackTrace(@NotNull Throwable paramThrowable) {
    long l = a ^ 0x151E2455A217L;
    Intrinsics.checkNotNullParameter(paramThrowable, "<this>");
    Intrinsics.checkNotNull(paramThrowable.getStackTrace());
    return paramThrowable.getStackTrace();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ExceptionsKt__ExceptionsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */