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

public final class HashingSource extends ForwardingSource implements Source {
  @Nullable
  private final MessageDigest messageDigest;
  
  @Nullable
  private final Mac mac;
  
  @NotNull
  public static final HashingSource$Companion Companion;
  
  private static final long a = o3.a(-5915325259864319805L, -7521522131710865164L, MethodHandles.lookup().lookupClass()).a(123962298920201L);
  
  @NotNull
  public static final HashingSource hmacSha1(@NotNull Source paramSource, @NotNull ByteString paramByteString) {
    return Companion.hmacSha1(paramSource, paramByteString);
  }
  
  public HashingSource(@NotNull Source paramSource, @NotNull MessageDigest paramMessageDigest) {
    super(paramSource);
    this.messageDigest = paramMessageDigest;
    this.mac = null;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "hash", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ByteString -deprecated_hash() {
    return hash();
  }
  
  public HashingSource(@NotNull Source paramSource, @NotNull ByteString paramByteString, @NotNull String paramString) {
    this(source, mac1);
  }
  
  @NotNull
  public static final HashingSource sha256(@NotNull Source paramSource) {
    return Companion.sha256(paramSource);
  }
  
  @NotNull
  public final ByteString hash() {
    long l = a ^ 0x40E55CCF0F0CL;
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
  public static final HashingSource hmacSha512(@NotNull Source paramSource, @NotNull ByteString paramByteString) {
    return Companion.hmacSha512(paramSource, paramByteString);
  }
  
  @NotNull
  public static final HashingSource hmacSha256(@NotNull Source paramSource, @NotNull ByteString paramByteString) {
    return Companion.hmacSha256(paramSource, paramByteString);
  }
  
  @NotNull
  public static final HashingSource sha512(@NotNull Source paramSource) {
    return Companion.sha512(paramSource);
  }
  
  public HashingSource(@NotNull Source paramSource, @NotNull Mac paramMac) {
    super(paramSource);
    this.mac = paramMac;
    this.messageDigest = null;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l1 = a ^ 0x45EE4826BDE6L;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    long l2 = super.read(paramBuffer, paramLong);
    if (l2 != -1L) {
      long l3 = paramBuffer.size() - l2;
      long l4 = paramBuffer.size();
      Intrinsics.checkNotNull(paramBuffer.head);
      Segment segment = paramBuffer.head;
      while (l4 > l3) {
        Intrinsics.checkNotNull(segment.prev);
        segment = segment.prev;
        l4 -= (segment.limit - segment.pos);
      } 
      while (l4 < paramBuffer.size()) {
        int i = (int)(segment.pos + l3 - l4);
        try {
          if (this.messageDigest != null) {
            this.messageDigest.update(segment.data, i, segment.limit - i);
          } else {
            Intrinsics.checkNotNull(this.mac);
            this.mac.update(segment.data, i, segment.limit - i);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        l4 += (segment.limit - segment.pos);
        l3 = l4;
        Intrinsics.checkNotNull(segment.next);
        segment = segment.next;
      } 
    } 
    return l2;
  }
  
  public HashingSource(@NotNull Source paramSource, @NotNull String paramString) {
    this(paramSource, messageDigest);
  }
  
  static {
    Companion = new HashingSource$Companion(null);
  }
  
  @NotNull
  public static final HashingSource md5(@NotNull Source paramSource) {
    return Companion.md5(paramSource);
  }
  
  @NotNull
  public static final HashingSource sha1(@NotNull Source paramSource) {
    return Companion.sha1(paramSource);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\HashingSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */