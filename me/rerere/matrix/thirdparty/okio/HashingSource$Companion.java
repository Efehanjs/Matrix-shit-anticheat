package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class HashingSource$Companion {
  private static final long a = o3.a(7682340338292927006L, -5534458326057379860L, MethodHandles.lookup().lookupClass()).a(126561514069049L);
  
  @NotNull
  public final HashingSource hmacSha1(@NotNull Source paramSource, @NotNull ByteString paramByteString) {
    long l = a ^ 0x783F9AA31F44L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return new HashingSource(paramSource, paramByteString, "HmacSHA1");
  }
  
  @NotNull
  public final HashingSource md5(@NotNull Source paramSource) {
    long l = a ^ 0x2F3A3A15B767L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    return new HashingSource(paramSource, "MD5");
  }
  
  @NotNull
  public final HashingSource sha512(@NotNull Source paramSource) {
    long l = a ^ 0xBE48E435275L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    return new HashingSource(paramSource, "SHA-512");
  }
  
  @NotNull
  public final HashingSource sha1(@NotNull Source paramSource) {
    long l = a ^ 0x1B2B87169F54L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    return new HashingSource(paramSource, "SHA-1");
  }
  
  @NotNull
  public final HashingSource hmacSha256(@NotNull Source paramSource, @NotNull ByteString paramByteString) {
    long l = a ^ 0x4DFF99FBAF3CL;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return new HashingSource(paramSource, paramByteString, "HmacSHA256");
  }
  
  @NotNull
  public final HashingSource sha256(@NotNull Source paramSource) {
    long l = a ^ 0x28DCCB321329L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    return new HashingSource(paramSource, "SHA-256");
  }
  
  @NotNull
  public final HashingSource hmacSha512(@NotNull Source paramSource, @NotNull ByteString paramByteString) {
    long l = a ^ 0x6319A0FE87E1L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return new HashingSource(paramSource, paramByteString, "HmacSHA512");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\HashingSource$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */