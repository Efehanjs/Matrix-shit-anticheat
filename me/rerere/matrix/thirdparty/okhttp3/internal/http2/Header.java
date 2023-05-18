package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Header {
  @JvmField
  @NotNull
  public static final ByteString RESPONSE_STATUS;
  
  @JvmField
  public final int hpackSize;
  
  @JvmField
  @NotNull
  public static final ByteString TARGET_SCHEME;
  
  @JvmField
  @NotNull
  public static final ByteString TARGET_METHOD;
  
  @NotNull
  public static final String TARGET_PATH_UTF8 = ":path";
  
  @NotNull
  public static final String RESPONSE_STATUS_UTF8 = ":status";
  
  @NotNull
  public static final Header$Companion Companion;
  
  @JvmField
  @NotNull
  public final ByteString value;
  
  @JvmField
  @NotNull
  public static final ByteString TARGET_PATH;
  
  @NotNull
  public static final String TARGET_METHOD_UTF8 = ":method";
  
  @NotNull
  public static final String TARGET_AUTHORITY_UTF8 = ":authority";
  
  @JvmField
  @NotNull
  public static final ByteString PSEUDO_PREFIX;
  
  @JvmField
  @NotNull
  public final ByteString name;
  
  @NotNull
  public static final String TARGET_SCHEME_UTF8 = ":scheme";
  
  @JvmField
  @NotNull
  public static final ByteString TARGET_AUTHORITY;
  
  private static final long a = o3.a(769386987633107988L, -3956379361300312160L, MethodHandles.lookup().lookupClass()).a(82645567808006L);
  
  @NotNull
  public final ByteString component2() {
    return this.value;
  }
  
  public Header(@NotNull ByteString paramByteString1, @NotNull ByteString paramByteString2) {
    this.name = paramByteString1;
    this.value = paramByteString2;
    this.hpackSize = 32 + this.name.size() + this.value.size();
  }
  
  @NotNull
  public final Header copy(@NotNull ByteString paramByteString1, @NotNull ByteString paramByteString2) {
    long l = a ^ 0x761A9B1D3CA0L;
    Intrinsics.checkNotNullParameter(paramByteString1, "name");
    Intrinsics.checkNotNullParameter(paramByteString2, "value");
    return new Header(paramByteString1, paramByteString2);
  }
  
  public Header(@NotNull ByteString paramByteString, @NotNull String paramString) {
    this(paramByteString, ByteString.Companion.encodeUtf8(paramString));
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x36068BA6E1CDL;
    return this.name.utf8() + ": " + this.value.utf8();
  }
  
  @NotNull
  public final ByteString component1() {
    return this.name;
  }
  
  static {
    long l = a ^ 0x3675DEADB4C1L;
    Companion = new Header$Companion(null);
    PSEUDO_PREFIX = ByteString.Companion.encodeUtf8(":");
    RESPONSE_STATUS = ByteString.Companion.encodeUtf8(":status");
    TARGET_METHOD = ByteString.Companion.encodeUtf8(":method");
    TARGET_PATH = ByteString.Companion.encodeUtf8(":path");
    TARGET_SCHEME = ByteString.Companion.encodeUtf8(":scheme");
    TARGET_AUTHORITY = ByteString.Companion.encodeUtf8(":authority");
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Header))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Header header = (Header)paramObject;
    try {
      if (!Intrinsics.areEqual(this.name, header.name))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.value, header.value))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public Header(@NotNull String paramString1, @NotNull String paramString2) {
    this(ByteString.Companion.encodeUtf8(paramString1), ByteString.Companion.encodeUtf8(paramString2));
  }
  
  public int hashCode() {
    null = this.name.hashCode();
    return null * 31 + this.value.hashCode();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Header.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */