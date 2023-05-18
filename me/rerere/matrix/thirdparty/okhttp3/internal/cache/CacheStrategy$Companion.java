package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CacheStrategy$Companion {
  private static final long a = o3.a(2676423966161131842L, 7857044942324022932L, MethodHandles.lookup().lookupClass()).a(123219633664571L);
  
  public final boolean isCacheable(@NotNull Response paramResponse, @NotNull Request paramRequest) {
    long l = a ^ 0x40C2C90B05CL;
    try {
      Intrinsics.checkNotNullParameter(paramResponse, "response");
      Intrinsics.checkNotNullParameter(paramRequest, "request");
      switch (paramResponse.code()) {
        case 200:
        case 203:
        case 204:
        case 300:
        case 301:
        case 308:
        case 404:
        case 405:
        case 410:
        case 414:
        case 501:
          break;
        case 302:
        case 307:
          try {
            if (Response.header$default(paramResponse, "Expires", null, 2, null) == null)
              try {
                if (paramResponse.cacheControl().maxAgeSeconds() == -1)
                  try {
                    if (!paramResponse.cacheControl().isPublic())
                      try {
                        if (!paramResponse.cacheControl().isPrivate())
                          return false; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
        default:
          return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramResponse.cacheControl().noStore())
        try {
          if (!paramRequest.cacheControl().noStore());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\CacheStrategy$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */