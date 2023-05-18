package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.ArrayIteratorKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.StringCompanionObject;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.DatesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Headers implements Iterable, KMappedMarker {
  @NotNull
  public static final Headers$Companion Companion;
  
  @NotNull
  private final String[] namesAndValues;
  
  private static final long a = o3.a(8047821575264031334L, -8738669260062749175L, MethodHandles.lookup().lookupClass()).a(146087311335544L);
  
  @NotNull
  public static final Headers of(@NotNull Map paramMap) {
    return Companion.of(paramMap);
  }
  
  public final Instant getInstant(@NotNull String paramString) {
    long l = a ^ 0x29DF7BFC3319L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Date date = getDate(paramString);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (date == null) ? null : date.toInstant();
  }
  
  @NotNull
  public Iterator iterator() {
    int i = 0;
    int j = size();
    Pair[] arrayOfPair = new Pair[j];
    while (i < j) {
      int k = i;
      arrayOfPair[k] = TuplesKt.to(name(k), value(k));
      i++;
    } 
    return ArrayIteratorKt.iterator((Object[])arrayOfPair);
  }
  
  @NotNull
  public final List values(@NotNull String paramString) {
    long l = a ^ 0x44CA7D62DA28L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    ArrayList<String> arrayList = null;
    byte b = 0;
    int i = size();
    while (b < i) {
      byte b1 = b;
      b++;
      if (StringsKt.equals(paramString, name(b1), true)) {
        if (arrayList == null)
          arrayList = new ArrayList(2); 
        arrayList.add(value(b1));
      } 
    } 
    List<String> list = Collections.unmodifiableList(arrayList);
    Intrinsics.checkNotNullExpressionValue(list, "{\n      Collections.unmodifiableList(result)\n    }");
    return (arrayList != null) ? list : CollectionsKt.emptyList();
  }
  
  public final long byteCount() {
    long l = (this.namesAndValues.length * 2);
    byte b = 0;
    int i = this.namesAndValues.length;
    while (b < i) {
      byte b1 = b;
      b++;
      l += this.namesAndValues[b1].length();
    } 
    return l;
  }
  
  @NotNull
  public final Map toMultimap() {
    long l = a ^ 0x388BB2042008L;
    TreeMap<Object, Object> treeMap = new TreeMap<>(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
    byte b = 0;
    int i = size();
    while (b < i) {
      byte b1 = b;
      b++;
      String str2 = name(b1);
      Locale locale = Locale.US;
      Intrinsics.checkNotNullExpressionValue(locale, "US");
      locale = locale;
      Intrinsics.checkNotNullExpressionValue(str2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
      String str1 = str2.toLowerCase(locale);
      List<String> list = (List)treeMap.get(str1);
      if (list == null) {
        list = new ArrayList(2);
        treeMap.put(str1, list);
      } 
      list.add(value(b1));
    } 
    return treeMap;
  }
  
  @Nullable
  public final Date getDate(@NotNull String paramString) {
    long l = a ^ 0x2F282F22A653L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "name");
      get(paramString);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (get(paramString) == null) ? null : DatesKt.toHttpDateOrNull(get(paramString));
  }
  
  @NotNull
  public final Headers$Builder newBuilder() {
    Headers$Builder headers$Builder = new Headers$Builder();
    CollectionsKt.addAll(headers$Builder.getNamesAndValues$okhttp(), (Object[])this.namesAndValues);
    return headers$Builder;
  }
  
  static {
    Companion = new Headers$Companion(null);
  }
  
  @Nullable
  public final String get(@NotNull String paramString) {
    long l = a ^ 0x7C90ABD01F8FL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return Headers$Companion.access$get(Companion, this.namesAndValues, paramString);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x6876A7F59DE9L;
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    byte b = 0;
    int i = size();
    while (b < i) {
      byte b1 = b;
      b++;
      String str1 = name(b1);
      String str2 = value(b1);
      try {
        stringBuilder2.append(str1);
        stringBuilder2.append(": ");
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      stringBuilder2.append(Util.isSensitiveHeader(str1) ? "██" : str2);
      stringBuilder2.append("\n");
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
    return stringBuilder1.toString();
  }
  
  @NotNull
  public final Set names() {
    long l = a ^ 0x5B28311077D5L;
    TreeSet<String> treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
    byte b = 0;
    int i = size();
    while (b < i) {
      byte b1 = b;
      b++;
      treeSet.add(name(b1));
    } 
    Set<String> set = Collections.unmodifiableSet(treeSet);
    Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(result)");
    return set;
  }
  
  @NotNull
  public static final Headers of(@NotNull String... paramVarArgs) {
    return Companion.of(paramVarArgs);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Headers)
        try {
          if (Arrays.equals((Object[])this.namesAndValues, (Object[])((Headers)paramObject).namesAndValues));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public final String name(int paramInt) {
    return this.namesAndValues[paramInt * 2];
  }
  
  @NotNull
  public final String value(int paramInt) {
    return this.namesAndValues[paramInt * 2 + 1];
  }
  
  public final int size() {
    return this.namesAndValues.length / 2;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_size() {
    return size();
  }
  
  public int hashCode() {
    return Arrays.hashCode((Object[])this.namesAndValues);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Headers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */