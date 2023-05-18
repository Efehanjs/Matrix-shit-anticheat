package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ConnectionSpec$Builder {
  private boolean supportsTlsExtensions;
  
  @Nullable
  private String[] cipherSuites;
  
  @Nullable
  private String[] tlsVersions;
  
  private boolean tls;
  
  private static final long a = o3.a(-3059614981025099725L, -7017581205065377688L, MethodHandles.lookup().lookupClass()).a(42627619463588L);
  
  @Nullable
  public final String[] getTlsVersions$okhttp() {
    return this.tlsVersions;
  }
  
  public final void setSupportsTlsExtensions$okhttp(boolean paramBoolean) {
    this.supportsTlsExtensions = paramBoolean;
  }
  
  @NotNull
  public final ConnectionSpec$Builder cipherSuites(@NotNull CipherSuite... paramVarArgs) {
    String[] arrayOfString;
    long l = a ^ 0x4675EB350B16L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "cipherSuites");
    ConnectionSpec$Builder connectionSpec$Builder = this;
    boolean bool1 = false;
    if (!connectionSpec$Builder.getTls$okhttp()) {
      boolean bool = false;
      String str = "no cipher suites for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    CipherSuite[] arrayOfCipherSuite1 = paramVarArgs;
    boolean bool2 = false;
    CipherSuite[] arrayOfCipherSuite2 = arrayOfCipherSuite1;
    ArrayList<String> arrayList3 = new ArrayList(arrayOfCipherSuite1.length);
    boolean bool3 = false;
    byte b = 0;
    int i = arrayOfCipherSuite2.length;
    while (b < i) {
      CipherSuite cipherSuite1 = arrayOfCipherSuite2[b];
      CipherSuite cipherSuite2 = cipherSuite1;
      ArrayList<String> arrayList = arrayList3;
      boolean bool = false;
      arrayList.add(cipherSuite2.javaName());
      b++;
    } 
    ArrayList<String> arrayList1 = arrayList3;
    bool2 = false;
    ArrayList<String> arrayList2 = arrayList1;
    try {
      if (arrayList2.toArray(new String[0]) == null) {
        arrayList2.toArray(new String[0]);
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return connectionSpec$Builder.cipherSuites(Arrays.<String>copyOf(arrayOfString, arrayOfString.length));
  }
  
  public ConnectionSpec$Builder(boolean paramBoolean) {
    this.tls = paramBoolean;
  }
  
  @NotNull
  public final ConnectionSpec$Builder allEnabledCipherSuites() {
    long l = a ^ 0x623CC11401ACL;
    ConnectionSpec$Builder connectionSpec$Builder1 = this;
    ConnectionSpec$Builder connectionSpec$Builder2 = connectionSpec$Builder1;
    boolean bool = false;
    if (!connectionSpec$Builder2.getTls$okhttp()) {
      boolean bool1 = false;
      String str = "no cipher suites for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    connectionSpec$Builder2.setCipherSuites$okhttp(null);
    return connectionSpec$Builder1;
  }
  
  public final void setCipherSuites$okhttp(@Nullable String[] paramArrayOfString) {
    this.cipherSuites = paramArrayOfString;
  }
  
  public final boolean getSupportsTlsExtensions$okhttp() {
    return this.supportsTlsExtensions;
  }
  
  @Nullable
  public final String[] getCipherSuites$okhttp() {
    return this.cipherSuites;
  }
  
  @NotNull
  public final ConnectionSpec$Builder allEnabledTlsVersions() {
    long l = a ^ 0x348DDA44C12CL;
    ConnectionSpec$Builder connectionSpec$Builder1 = this;
    ConnectionSpec$Builder connectionSpec$Builder2 = connectionSpec$Builder1;
    boolean bool = false;
    if (!connectionSpec$Builder2.getTls$okhttp()) {
      boolean bool1 = false;
      String str = "no TLS versions for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    connectionSpec$Builder2.setTlsVersions$okhttp(null);
    return connectionSpec$Builder1;
  }
  
  @NotNull
  public final ConnectionSpec build() {
    return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
  }
  
  @NotNull
  public final ConnectionSpec$Builder cipherSuites(@NotNull String... paramVarArgs) {
    long l = a ^ 0x4625D1341CF6L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "cipherSuites");
    ConnectionSpec$Builder connectionSpec$Builder1 = this;
    ConnectionSpec$Builder connectionSpec$Builder2 = connectionSpec$Builder1;
    boolean bool = false;
    if (!connectionSpec$Builder2.getTls$okhttp()) {
      boolean bool1 = false;
      String str = "no cipher suites for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!(!((paramVarArgs.length == 0) ? 1 : 0) ? 1 : 0)) {
      boolean bool1 = false;
      String str = "At least one cipher suite is required";
      throw new IllegalArgumentException(str.toString());
    } 
    connectionSpec$Builder2.setCipherSuites$okhttp((String[])paramVarArgs.clone());
    return connectionSpec$Builder1;
  }
  
  @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
  @NotNull
  public final ConnectionSpec$Builder supportsTlsExtensions(boolean paramBoolean) {
    long l = a ^ 0x3761468320E0L;
    ConnectionSpec$Builder connectionSpec$Builder1 = this;
    ConnectionSpec$Builder connectionSpec$Builder2 = connectionSpec$Builder1;
    boolean bool = false;
    if (!connectionSpec$Builder2.getTls$okhttp()) {
      boolean bool1 = false;
      String str = "no TLS extensions for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    connectionSpec$Builder2.setSupportsTlsExtensions$okhttp(paramBoolean);
    return connectionSpec$Builder1;
  }
  
  public ConnectionSpec$Builder(@NotNull ConnectionSpec paramConnectionSpec) {
    this.tls = paramConnectionSpec.isTls();
    this.cipherSuites = ConnectionSpec.access$getCipherSuitesAsString$p(paramConnectionSpec);
    this.tlsVersions = ConnectionSpec.access$getTlsVersionsAsString$p(paramConnectionSpec);
    this.supportsTlsExtensions = paramConnectionSpec.supportsTlsExtensions();
  }
  
  public final void setTls$okhttp(boolean paramBoolean) {
    this.tls = paramBoolean;
  }
  
  @NotNull
  public final ConnectionSpec$Builder tlsVersions(@NotNull String... paramVarArgs) {
    long l = a ^ 0x77DFD1231362L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "tlsVersions");
    ConnectionSpec$Builder connectionSpec$Builder1 = this;
    ConnectionSpec$Builder connectionSpec$Builder2 = connectionSpec$Builder1;
    boolean bool = false;
    if (!connectionSpec$Builder2.getTls$okhttp()) {
      boolean bool1 = false;
      String str = "no TLS versions for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!(!((paramVarArgs.length == 0) ? 1 : 0) ? 1 : 0)) {
      boolean bool1 = false;
      String str = "At least one TLS version is required";
      throw new IllegalArgumentException(str.toString());
    } 
    connectionSpec$Builder2.setTlsVersions$okhttp((String[])paramVarArgs.clone());
    return connectionSpec$Builder1;
  }
  
  public final void setTlsVersions$okhttp(@Nullable String[] paramArrayOfString) {
    this.tlsVersions = paramArrayOfString;
  }
  
  public final boolean getTls$okhttp() {
    return this.tls;
  }
  
  @NotNull
  public final ConnectionSpec$Builder tlsVersions(@NotNull TlsVersion... paramVarArgs) {
    String[] arrayOfString;
    long l = a ^ 0x36CBF8479C58L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "tlsVersions");
    ConnectionSpec$Builder connectionSpec$Builder = this;
    boolean bool1 = false;
    if (!connectionSpec$Builder.getTls$okhttp()) {
      boolean bool = false;
      String str = "no TLS versions for cleartext connections";
      throw new IllegalArgumentException(str.toString());
    } 
    TlsVersion[] arrayOfTlsVersion1 = paramVarArgs;
    boolean bool2 = false;
    TlsVersion[] arrayOfTlsVersion2 = arrayOfTlsVersion1;
    ArrayList<String> arrayList3 = new ArrayList(arrayOfTlsVersion1.length);
    boolean bool3 = false;
    byte b = 0;
    int i = arrayOfTlsVersion2.length;
    while (b < i) {
      TlsVersion tlsVersion1 = arrayOfTlsVersion2[b];
      TlsVersion tlsVersion2 = tlsVersion1;
      ArrayList<String> arrayList = arrayList3;
      boolean bool = false;
      arrayList.add(tlsVersion2.javaName());
      b++;
    } 
    ArrayList<String> arrayList1 = arrayList3;
    bool2 = false;
    ArrayList<String> arrayList2 = arrayList1;
    try {
      if (arrayList2.toArray(new String[0]) == null) {
        arrayList2.toArray(new String[0]);
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return connectionSpec$Builder.tlsVersions(Arrays.<String>copyOf(arrayOfString, arrayOfString.length));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\ConnectionSpec$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */