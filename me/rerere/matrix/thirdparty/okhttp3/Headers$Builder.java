package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.ProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.DatesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Headers$Builder {
  @NotNull
  private final List namesAndValues = new ArrayList(20);
  
  private static final long a = o3.a(-8780458545038714862L, 4339470366928939778L, MethodHandles.lookup().lookupClass()).a(229882327041592L);
  
  @NotNull
  public final Headers$Builder set(@NotNull String paramString, @NotNull Date paramDate) {
    long l = a ^ 0x67EA4C6F78F4L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramDate, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    headers$Builder2.set(paramString, DatesKt.toHttpDateString(paramDate));
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers$Builder addAll(@NotNull Headers paramHeaders) {
    long l = a ^ 0x6CD616D43C0FL;
    Intrinsics.checkNotNullParameter(paramHeaders, "headers");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    byte b = 0;
    int i = paramHeaders.size();
    while (b < i) {
      byte b1 = b;
      b++;
      headers$Builder2.addLenient$okhttp(paramHeaders.name(b1), paramHeaders.value(b1));
    } 
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers$Builder addLenient$okhttp(@NotNull String paramString) {
    long l = a ^ 0x7524A2914641L;
    Intrinsics.checkNotNullParameter(paramString, "line");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    int i = StringsKt.indexOf$default(paramString, ':', 1, false, 4, null);
    if (i != -1) {
      String str = paramString;
      int j = 0;
      Intrinsics.checkNotNullExpressionValue(str.substring(j, i), "this as java.lang.String…ing(startIndex, endIndex)");
      str = paramString;
      j = i + 1;
      Intrinsics.checkNotNullExpressionValue(str.substring(j), "this as java.lang.String).substring(startIndex)");
      headers$Builder2.addLenient$okhttp(str.substring(j, i), str.substring(j));
    } else if (paramString.charAt(0) == ':') {
      String str = paramString;
      boolean bool1 = true;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool1), "this as java.lang.String).substring(startIndex)");
      headers$Builder2.addLenient$okhttp("", str.substring(bool1));
    } else {
      headers$Builder2.addLenient$okhttp("", paramString);
    } 
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers$Builder removeAll(@NotNull String paramString) {
    long l = a ^ 0x50AAA663828EL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    byte b = 0;
    while (true) {
      try {
        if (b < headers$Builder2.getNamesAndValues$okhttp().size()) {
          try {
            if (StringsKt.equals(paramString, headers$Builder2.getNamesAndValues$okhttp().get(b), true)) {
              headers$Builder2.getNamesAndValues$okhttp().remove(b);
              headers$Builder2.getNamesAndValues$okhttp().remove(b);
              b -= 2;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          b += 2;
          continue;
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      return headers$Builder1;
    } 
  }
  
  @Nullable
  public final String get(@NotNull String paramString) {
    long l = a ^ 0x5182DEE8F5A4L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    int i = this.namesAndValues.size() - 2;
    int j = i;
    int k = ProgressionUtilKt.getProgressionLastElement(i, 0, -2);
    if (k <= j) {
      int m;
      do {
        m = j;
        j -= 2;
        if (StringsKt.equals(paramString, this.namesAndValues.get(m), true))
          return this.namesAndValues.get(m + 1); 
      } while (m != k);
    } 
    return null;
  }
  
  @NotNull
  public final List getNamesAndValues$okhttp() {
    return this.namesAndValues;
  }
  
  @NotNull
  public final Headers$Builder set(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x38D36D8A4191L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    Headers$Companion.access$checkName(Headers.Companion, paramString1);
    Headers$Companion.access$checkValue(Headers.Companion, paramString2, paramString1);
    headers$Builder2.removeAll(paramString1);
    headers$Builder2.addLenient$okhttp(paramString1, paramString2);
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers build() {
    long l = a ^ 0x6F5F077F4CA0L;
    List list1 = this.namesAndValues;
    boolean bool = false;
    List list2 = list1;
    if (list2.toArray((Object[])new String[0]) == null) {
      list2.toArray((Object[])new String[0]);
      throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    } 
    super((String[])list2.toArray((Object[])new String[0]), null);
    return new Headers();
  }
  
  @NotNull
  public final Headers$Builder add(@NotNull String paramString, @NotNull Date paramDate) {
    long l = a ^ 0x5E35D1F6627L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramDate, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    headers$Builder2.add(paramString, DatesKt.toHttpDateString(paramDate));
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers$Builder add(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x4471BAA2DF86L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    Headers$Companion.access$checkName(Headers.Companion, paramString1);
    Headers$Companion.access$checkValue(Headers.Companion, paramString2, paramString1);
    headers$Builder2.addLenient$okhttp(paramString1, paramString2);
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers$Builder addUnsafeNonAscii(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x7F24198173E3L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    Headers$Companion.access$checkName(Headers.Companion, paramString1);
    headers$Builder2.addLenient$okhttp(paramString1, paramString2);
    return headers$Builder1;
  }
  
  public final Headers$Builder add(@NotNull String paramString, @NotNull Instant paramInstant) {
    long l = a ^ 0x34425622142EL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramInstant, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    headers$Builder2.add(paramString, new Date(paramInstant.toEpochMilli()));
    return headers$Builder1;
  }
  
  public final Headers$Builder set(@NotNull String paramString, @NotNull Instant paramInstant) {
    long l = a ^ 0x59B3B5A45EA2L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramInstant, "value");
    Headers$Builder headers$Builder = this;
    boolean bool = false;
    return headers$Builder.set(paramString, new Date(paramInstant.toEpochMilli()));
  }
  
  @NotNull
  public final Headers$Builder addLenient$okhttp(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x314614FC7751L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    headers$Builder2.getNamesAndValues$okhttp().add(paramString1);
    headers$Builder2.getNamesAndValues$okhttp().add(StringsKt.trim(paramString2).toString());
    return headers$Builder1;
  }
  
  @NotNull
  public final Headers$Builder add(@NotNull String paramString) {
    long l = a ^ 0x2F588BD805B1L;
    Intrinsics.checkNotNullParameter(paramString, "line");
    Headers$Builder headers$Builder1 = this;
    Headers$Builder headers$Builder2 = headers$Builder1;
    boolean bool = false;
    int i = StringsKt.indexOf$default(paramString, ':', 0, false, 6, null);
    try {
      if (!((i != -1) ? 1 : 0)) {
        boolean bool1 = false;
        String str1 = Intrinsics.stringPlus("Unexpected header: ", paramString);
        throw new IllegalArgumentException(str1.toString());
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    String str = paramString;
    int j = 0;
    Intrinsics.checkNotNullExpressionValue(str.substring(j, i), "this as java.lang.String…ing(startIndex, endIndex)");
    str = paramString;
    j = i + 1;
    Intrinsics.checkNotNullExpressionValue(str.substring(j), "this as java.lang.String).substring(startIndex)");
    headers$Builder2.add(StringsKt.trim(str.substring(j, i)).toString(), str.substring(j));
    return headers$Builder1;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Headers$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */