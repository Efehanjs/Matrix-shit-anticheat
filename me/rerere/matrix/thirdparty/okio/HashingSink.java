package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.MessageDigest;
import javax.crypto.Mac;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class HashingSink extends ForwardingSink implements Sink {
  @NotNull
  public static final HashingSink$Companion Companion;
  
  @Nullable
  private final Mac mac;
  
  @Nullable
  private final MessageDigest messageDigest;
  
  private static final long a = o3.a(5104820296115338855L, -3341117039108096580L, MethodHandles.lookup().lookupClass()).a(48942009071087L);
  
  @NotNull
  public static final HashingSink sha256(@NotNull Sink paramSink) {
    return Companion.sha256(paramSink);
  }
  
  @NotNull
  public static final HashingSink sha1(@NotNull Sink paramSink) {
    return Companion.sha1(paramSink);
  }
  
  public HashingSink(@NotNull Sink paramSink, @NotNull Mac paramMac) {
    super(paramSink);
    this.mac = paramMac;
    this.messageDigest = null;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l1 = a ^ 0x683985D8E36BL;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, paramLong);
    long l2 = 0L;
    Intrinsics.checkNotNull(paramBuffer.head);
    for (Segment segment = paramBuffer.head; l2 < paramLong; segment = segment.next) {
      long l3 = paramLong - l2;
      int j = segment.limit - segment.pos;
      boolean bool1 = false;
      long l4 = j;
      boolean bool2 = false;
      int i = (int)Math.min(l3, l4);
      try {
        if (this.messageDigest != null) {
          this.messageDigest.update(segment.data, segment.pos, i);
        } else {
          Intrinsics.checkNotNull(this.mac);
          this.mac.update(segment.data, segment.pos, i);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      l2 += i;
      Intrinsics.checkNotNull(segment.next);
    } 
    super.write(paramBuffer, paramLong);
  }
  
  public HashingSink(@NotNull Sink paramSink, @NotNull MessageDigest paramMessageDigest) {
    super(paramSink);
    this.messageDigest = paramMessageDigest;
    this.mac = null;
  }
  
  @NotNull
  public static final HashingSink hmacSha1(@NotNull Sink paramSink, @NotNull ByteString paramByteString) {
    return Companion.hmacSha1(paramSink, paramByteString);
  }
  
  @NotNull
  public final ByteString hash() {
    long l = a ^ 0x2C93C901C6A0L;
    try {
      Intrinsics.checkNotNull(this.mac);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = (this.messageDigest != null) ? this.messageDigest.digest() : this.mac.doFinal();
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "result");
    return new ByteString(arrayOfByte);
  }
  
  @NotNull
  public static final HashingSink hmacSha512(@NotNull Sink paramSink, @NotNull ByteString paramByteString) {
    return Companion.hmacSha512(paramSink, paramByteString);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "hash", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_hash() {
    return hash();
  }
  
  @NotNull
  public static final HashingSink sha512(@NotNull Sink paramSink) {
    return Companion.sha512(paramSink);
  }
  
  @NotNull
  public static final HashingSink hmacSha256(@NotNull Sink paramSink, @NotNull ByteString paramByteString) {
    return Companion.hmacSha256(paramSink, paramByteString);
  }
  
  public HashingSink(@NotNull Sink paramSink, @NotNull ByteString paramByteString, @NotNull String paramString) {
    this(sink, mac1);
  }
  
  static {
    Companion = new HashingSink$Companion(null);
  }
  
  @NotNull
  public static final HashingSink md5(@NotNull Sink paramSink) {
    return Companion.md5(paramSink);
  }
  
  public HashingSink(@NotNull Sink paramSink, @NotNull String paramString) {
    this(paramSink, messageDigest);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\HashingSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */