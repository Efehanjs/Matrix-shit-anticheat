package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class HashingSink$Companion {
  private static final long a = o3.a(2024168243507064365L, 6202218326738092896L, MethodHandles.lookup().lookupClass()).a(9429295903181L);
  
  @NotNull
  public final HashingSink sha256(@NotNull Sink paramSink) {
    long l = a ^ 0x415828BAC33FL;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    return new HashingSink(paramSink, "SHA-256");
  }
  
  @NotNull
  public final HashingSink sha1(@NotNull Sink paramSink) {
    long l = a ^ 0x2DECF27CDD52L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    return new HashingSink(paramSink, "SHA-1");
  }
  
  @NotNull
  public final HashingSink hmacSha1(@NotNull Sink paramSink, @NotNull ByteString paramByteString) {
    long l = a ^ 0x40028791F9EDL;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return new HashingSink(paramSink, paramByteString, "HmacSHA1");
  }
  
  @NotNull
  public final HashingSink sha512(@NotNull Sink paramSink) {
    long l = a ^ 0x73442208E094L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    return new HashingSink(paramSink, "SHA-512");
  }
  
  @NotNull
  public final HashingSink md5(@NotNull Sink paramSink) {
    long l = a ^ 0x7CD3AF3D6BB7L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    return new HashingSink(paramSink, "MD5");
  }
  
  @NotNull
  public final HashingSink hmacSha256(@NotNull Sink paramSink, @NotNull ByteString paramByteString) {
    long l = a ^ 0xCEA7C85CB99L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return new HashingSink(paramSink, paramByteString, "HmacSHA256");
  }
  
  @NotNull
  public final HashingSink hmacSha512(@NotNull Sink paramSink, @NotNull ByteString paramByteString) {
    long l = a ^ 0x6BB4325C2DD4L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return new HashingSink(paramSink, paramByteString, "HmacSHA512");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\HashingSink$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */