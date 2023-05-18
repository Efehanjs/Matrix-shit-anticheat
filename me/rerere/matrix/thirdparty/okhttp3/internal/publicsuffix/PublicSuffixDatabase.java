package me.rerere.matrix.thirdparty.okhttp3.internal.publicsuffix;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.GzipSource;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class PublicSuffixDatabase {
  @NotNull
  private final AtomicBoolean listRead = new AtomicBoolean(false);
  
  @NotNull
  public static final PublicSuffixDatabase$Companion Companion;
  
  private byte[] publicSuffixExceptionListBytes;
  
  @NotNull
  private static final List PREVAILING_RULE;
  
  private byte[] publicSuffixListBytes;
  
  @NotNull
  public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
  
  private static final char EXCEPTION_MARKER = '!';
  
  @NotNull
  private final CountDownLatch readCompleteLatch = new CountDownLatch(1);
  
  @NotNull
  private static final PublicSuffixDatabase instance;
  
  @NotNull
  private static final byte[] WILDCARD_LABEL;
  
  private static final long a = o3.a(8470011898848413065L, -6195245631877196043L, MethodHandles.lookup().lookupClass()).a(104312618180119L);
  
  static {
    Companion = new PublicSuffixDatabase$Companion(null);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = 42;
    WILDCARD_LABEL = arrayOfByte;
    PREVAILING_RULE = CollectionsKt.listOf("*");
    instance = new PublicSuffixDatabase();
  }
  
  public final void setListBytes(@NotNull byte[] paramArrayOfbyte1, @NotNull byte[] paramArrayOfbyte2) {
    long l = a ^ 0x48DF80665B6AL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte1, "publicSuffixListBytes");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte2, "publicSuffixExceptionListBytes");
    this.publicSuffixListBytes = paramArrayOfbyte1;
    this.publicSuffixExceptionListBytes = paramArrayOfbyte2;
    this.listRead.set(true);
    this.readCompleteLatch.countDown();
  }
  
  @Nullable
  public final String getEffectiveTldPlusOne(@NotNull String paramString) {
    long l = a ^ 0x371A7EEB8C78L;
    Intrinsics.checkNotNullParameter(paramString, "domain");
    String str = IDN.toUnicode(paramString);
    Intrinsics.checkNotNullExpressionValue(str, "unicodeDomain");
    List list = splitDomain(str);
    List<String> list1 = findMatchingRule(list);
    try {
      if (list.size() == list1.size())
        try {
          if (((String)list1.get(0)).charAt(0) != '!')
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = (((String)list1.get(0)).charAt(0) == '!') ? (list.size() - list1.size()) : (list.size() - list1.size() + 1);
    return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(splitDomain(paramString)), i), ".", null, null, 0, null, null, 62, null);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\publicsuffix\PublicSuffixDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */