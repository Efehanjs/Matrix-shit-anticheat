package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Regex;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.HostnamesKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Cookie$Companion {
  private static final long a = o3.a(-640332136765571795L, 4625646187489229690L, MethodHandles.lookup().lookupClass()).a(147532531231317L);
  
  @Nullable
  public final Cookie parse$okhttp(long paramLong, @NotNull HttpUrl paramHttpUrl, @NotNull String paramString) {
    long l = a ^ 0x30FE281E426L;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    Intrinsics.checkNotNullParameter(paramString, "setCookie");
    int i = Util.delimiterOffset$default(paramString, ';', 0, 0, 6, null);
    int j = Util.delimiterOffset$default(paramString, '=', 0, i, 2, null);
    try {
      if (j == i)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = Util.trimSubstring$default(paramString, 0, j, 1, null);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!((str.length() == 0) ? 1 : 0))
        try {
          if (Util.indexOfControlOrNonAscii(str) == -1) {
            String str1 = Util.trimSubstring(paramString, j + 1, i);
            try {
              if (Util.indexOfControlOrNonAscii(str1) != -1)
                return null; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            long l1 = 253402300799999L;
            long l2 = -1L;
            String str2 = null;
            String str3 = null;
            boolean bool1 = false;
            boolean bool2 = false;
            boolean bool3 = true;
            boolean bool4 = false;
            int k = i + 1;
            int m = paramString.length();
            while (k < m) {
              int n = Util.delimiterOffset(paramString, ';', k, m);
              int i1 = Util.delimiterOffset(paramString, '=', k, n);
              String str5 = Util.trimSubstring(paramString, k, i1);
              try {
              
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              String str6 = (i1 < n) ? Util.trimSubstring(paramString, i1 + 1, n) : "";
              if (StringsKt.equals(str5, "expires", true)) {
                try {
                  l1 = parseExpires(str6, 0, str6.length());
                  bool4 = true;
                } catch (IllegalArgumentException illegalArgumentException) {}
              } else if (StringsKt.equals(str5, "max-age", true)) {
                try {
                  l2 = parseMaxAge(str6);
                  bool4 = true;
                } catch (NumberFormatException numberFormatException) {}
              } else if (StringsKt.equals(str5, "domain", true)) {
                try {
                  str2 = parseDomain(str6);
                  bool3 = false;
                } catch (IllegalArgumentException illegalArgumentException) {}
              } else if (StringsKt.equals(str5, "path", true)) {
                str3 = str6;
              } else if (StringsKt.equals(str5, "secure", true)) {
                bool1 = true;
              } else if (StringsKt.equals(str5, "httponly", true)) {
                bool2 = true;
              } 
              k = n + 1;
            } 
            if (l2 == Long.MIN_VALUE) {
              l1 = Long.MIN_VALUE;
            } else {
              try {
                if (l2 != -1L) {
                  try {
                  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                  long l3 = (l2 <= 9223372036854775L) ? (l2 * 1000L) : Long.MAX_VALUE;
                  l1 = paramLong + l3;
                  try {
                    if (l1 < paramLong || l1 > 253402300799999L)
                      l1 = 253402300799999L; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } 
            String str4 = paramHttpUrl.host();
            if (str2 == null) {
              str2 = str4;
            } else {
              try {
                if (!domainMatch(str4, str2))
                  return null; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } 
            try {
              if (str4.length() != str2.length())
                try {
                  if (PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null)
                    return null; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (str3 == null || !StringsKt.startsWith$default(str3, "/", false, 2, null)) {
                String str5 = paramHttpUrl.encodedPath();
                int n = StringsKt.lastIndexOf$default(str5, '/', 0, false, 6, null);
                String str6 = str5;
                boolean bool = false;
                Intrinsics.checkNotNullExpressionValue(str6.substring(bool, n), "this as java.lang.String…ing(startIndex, endIndex)");
                str3 = (n != 0) ? str6.substring(bool, n) : "/";
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return new Cookie(str, str1, l1, str2, str3, bool1, bool2, bool4, bool3, null);
          } 
          return null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  @NotNull
  public final List parseAll(@NotNull HttpUrl paramHttpUrl, @NotNull Headers paramHeaders) {
    long l = a ^ 0x27EC72B55E15L;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    Intrinsics.checkNotNullParameter(paramHeaders, "headers");
    List<String> list = paramHeaders.values("Set-Cookie");
    ArrayList<Cookie> arrayList = null;
    byte b = 0;
    int i = list.size();
    while (b < i) {
      Cookie cookie;
      byte b1 = b;
      try {
        b++;
        if (parse(paramHttpUrl, list.get(b1)) == null) {
          parse(paramHttpUrl, list.get(b1));
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (arrayList == null)
        arrayList = new ArrayList(); 
      arrayList.add(cookie);
    } 
    List<Cookie> list1 = Collections.unmodifiableList(arrayList);
    Intrinsics.checkNotNullExpressionValue(list1, "{\n        Collections.un…ableList(cookies)\n      }");
    return (arrayList != null) ? list1 : CollectionsKt.emptyList();
  }
  
  @Nullable
  public final Cookie parse(@NotNull HttpUrl paramHttpUrl, @NotNull String paramString) {
    long l = a ^ 0xF9704CDF25AL;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    Intrinsics.checkNotNullParameter(paramString, "setCookie");
    return parse$okhttp(System.currentTimeMillis(), paramHttpUrl, paramString);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cookie$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */