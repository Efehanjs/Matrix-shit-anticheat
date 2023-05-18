package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class _JvmPlatformKt {
  private static final long a = o3.a(-133000972323942842L, -1319641750791999155L, MethodHandles.lookup().lookupClass()).a(9714438156912L);
  
  @NotNull
  public static final String toUtf8String(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x13AB768D93A3L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    Charset charset = Charsets.UTF_8;
    boolean bool = false;
    return new String(paramArrayOfbyte, charset);
  }
  
  @NotNull
  public static final byte[] asUtf8ToByteArray(@NotNull String paramString) {
    long l = a ^ 0x68A6ECFFF0A5L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    Charset charset = Charsets.UTF_8;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(str.getBytes(charset), "(this as java.lang.String).getBytes(charset)");
    return str.getBytes(charset);
  }
  
  public static final Object synchronized(@NotNull Object paramObject, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x44A12651C597L;
    Intrinsics.checkNotNullParameter(paramObject, "lock");
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject} */
    try {
      Object object = paramFunction0.invoke();
    } finally {
      InlineMarker.finallyStart(1);
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject} */
      InlineMarker.finallyEnd(1);
    } 
    return object;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\_JvmPlatformKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */