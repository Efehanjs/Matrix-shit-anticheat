package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class WebSocketExtensions$Companion {
  private static final long a = o3.a(-7765531352024829728L, 6274205397595105177L, MethodHandles.lookup().lookupClass()).a(197586203881562L);
  
  @NotNull
  public final WebSocketExtensions parse(@NotNull Headers paramHeaders) throws IOException {
    long l = a ^ 0x3AAE93B148BCL;
    Intrinsics.checkNotNullParameter(paramHeaders, "responseHeaders");
    boolean bool1 = false;
    Integer integer1 = null;
    boolean bool2 = false;
    Integer integer2 = null;
    boolean bool3 = false;
    boolean bool4 = false;
    byte b = 0;
    int i = paramHeaders.size();
    while (b < i) {
      byte b1 = b;
      try {
        b++;
        if (!StringsKt.equals(paramHeaders.name(b1), "Sec-WebSocket-Extensions", true))
          continue; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      String str = paramHeaders.value(b1);
      int j = 0;
      while (j < str.length()) {
        int k = Util.delimiterOffset$default(str, ',', j, 0, 4, null);
        int m = Util.delimiterOffset(str, ';', j, k);
        String str1 = Util.trimSubstring(str, j, m);
        j = m + 1;
        try {
          if (StringsKt.equals(str1, "permessage-deflate", true)) {
            if (bool1)
              bool4 = true; 
            bool1 = true;
            while (j < k) {
              int n = Util.delimiterOffset(str, ';', j, k);
              int i1 = Util.delimiterOffset(str, '=', j, n);
              String str2 = Util.trimSubstring(str, j, i1);
              try {
              
              } catch (IOException iOException) {
                throw a(null);
              } 
              String str3 = (i1 < n) ? StringsKt.removeSurrounding(Util.trimSubstring(str, i1 + 1, n), "\"") : (String)null;
              j = n + 1;
              try {
                if (StringsKt.equals(str2, "client_max_window_bits", true)) {
                  if (integer1 != null)
                    bool4 = true; 
                  try {
                  
                  } catch (IOException iOException) {
                    throw a(null);
                  } 
                  integer1 = (str3 == null) ? null : StringsKt.toIntOrNull(str3);
                  if (integer1 == null)
                    bool4 = true; 
                  continue;
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
              try {
                if (StringsKt.equals(str2, "client_no_context_takeover", true)) {
                  if (bool2)
                    bool4 = true; 
                  if (str3 != null)
                    bool4 = true; 
                  bool2 = true;
                  continue;
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
              try {
                if (StringsKt.equals(str2, "server_max_window_bits", true)) {
                  if (integer2 != null)
                    bool4 = true; 
                  try {
                  
                  } catch (IOException iOException) {
                    throw a(null);
                  } 
                  integer2 = (str3 == null) ? null : StringsKt.toIntOrNull(str3);
                  if (integer2 == null)
                    bool4 = true; 
                  continue;
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
              try {
                if (StringsKt.equals(str2, "server_no_context_takeover", true)) {
                  if (bool3)
                    bool4 = true; 
                  if (str3 != null)
                    bool4 = true; 
                  bool3 = true;
                  continue;
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
              bool4 = true;
            } 
            continue;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        bool4 = true;
      } 
    } 
    return new WebSocketExtensions(bool1, integer1, bool2, integer2, bool3, bool4);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\WebSocketExtensions$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */