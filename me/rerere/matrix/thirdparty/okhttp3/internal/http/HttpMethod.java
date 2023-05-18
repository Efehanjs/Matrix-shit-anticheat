package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class HttpMethod {
  @NotNull
  public static final HttpMethod INSTANCE;
  
  private static final long a = o3.a(-7091553710252861894L, -2229065790051870280L, MethodHandles.lookup().lookupClass()).a(48540432632799L);
  
  static {
    INSTANCE = new HttpMethod();
  }
  
  public final boolean invalidatesCache(@NotNull String paramString) {
    long l = a ^ 0x4A690B6A6D92L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "method");
      if (!Intrinsics.areEqual(paramString, "POST"))
        try {
          if (!Intrinsics.areEqual(paramString, "PATCH"))
            try {
              if (!Intrinsics.areEqual(paramString, "PUT"))
                try {
                  if (!Intrinsics.areEqual(paramString, "DELETE")) {
                    try {
                      if (Intrinsics.areEqual(paramString, "MOVE"));
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    return false;
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
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final boolean redirectsWithBody(@NotNull String paramString) {
    long l = a ^ 0x312F434598F9L;
    Intrinsics.checkNotNullParameter(paramString, "method");
    return Intrinsics.areEqual(paramString, "PROPFIND");
  }
  
  public static final boolean requiresRequestBody(@NotNull String paramString) {
    long l = a ^ 0x7391ADCBC480L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "method");
      if (!Intrinsics.areEqual(paramString, "POST"))
        try {
          if (!Intrinsics.areEqual(paramString, "PUT"))
            try {
              if (!Intrinsics.areEqual(paramString, "PATCH"))
                try {
                  if (!Intrinsics.areEqual(paramString, "PROPPATCH")) {
                    try {
                      if (Intrinsics.areEqual(paramString, "REPORT"));
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    return false;
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
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static final boolean permitsRequestBody(@NotNull String paramString) {
    long l = a ^ 0x79E94BBD321FL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "method");
      if (!Intrinsics.areEqual(paramString, "GET"))
        try {
          if (!Intrinsics.areEqual(paramString, "HEAD"));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public final boolean redirectsToGet(@NotNull String paramString) {
    long l = a ^ 0x365538782413L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "method");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !Intrinsics.areEqual(paramString, "PROPFIND");
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\HttpMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */