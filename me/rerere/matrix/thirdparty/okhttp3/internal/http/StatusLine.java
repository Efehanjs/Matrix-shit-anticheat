package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StatusLine {
  public static final int HTTP_MISDIRECTED_REQUEST = 421;
  
  @JvmField
  @NotNull
  public final String message;
  
  @JvmField
  public final int code;
  
  @NotNull
  public static final StatusLine$Companion Companion;
  
  public static final int HTTP_PERM_REDIRECT = 308;
  
  @JvmField
  @NotNull
  public final Protocol protocol;
  
  public static final int HTTP_TEMP_REDIRECT = 307;
  
  public static final int HTTP_CONTINUE = 100;
  
  private static final long a = o3.a(-6004087390831371906L, -827298115991519353L, MethodHandles.lookup().lookupClass()).a(165939543360055L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x2794C6BF146AL;
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    try {
      if (this.protocol == Protocol.HTTP_1_0) {
        stringBuilder2.append("HTTP/1.0");
      } else {
        stringBuilder2.append("HTTP/1.1");
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    stringBuilder2.append(' ').append(this.code);
    stringBuilder2.append(' ').append(this.message);
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
    return stringBuilder1.toString();
  }
  
  static {
    Companion = new StatusLine$Companion(null);
  }
  
  public StatusLine(@NotNull Protocol paramProtocol, int paramInt, @NotNull String paramString) {
    this.protocol = paramProtocol;
    this.code = paramInt;
    this.message = paramString;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\StatusLine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */