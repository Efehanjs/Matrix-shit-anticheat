package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Settings {
  @NotNull
  public static final Settings$Companion Companion;
  
  public static final int ENABLE_PUSH = 2;
  
  private int set;
  
  public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
  
  public static final int MAX_FRAME_SIZE = 5;
  
  public static final int HEADER_TABLE_SIZE = 1;
  
  public static final int MAX_CONCURRENT_STREAMS = 4;
  
  @NotNull
  private final int[] values = new int[10];
  
  public static final int MAX_HEADER_LIST_SIZE = 6;
  
  public static final int INITIAL_WINDOW_SIZE = 7;
  
  public static final int COUNT = 10;
  
  private static final long a = o3.a(2279852104638344392L, -8924360482254930061L, MethodHandles.lookup().lookupClass()).a(119579594928158L);
  
  public final int size() {
    return Integer.bitCount(this.set);
  }
  
  public final void clear() {
    this.set = 0;
    ArraysKt.fill$default(this.values, 0, 0, 0, 6, null);
  }
  
  public final int getInitialWindowSize() {
    char c = '';
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((c & this.set) != 0) ? this.values[7] : 65535;
  }
  
  static {
    Companion = new Settings$Companion(null);
  }
  
  public final boolean isSet(int paramInt) {
    int i = 1 << paramInt;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((this.set & i) != 0);
  }
  
  @NotNull
  public final Settings set(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 < this.values.length) {
            int i = 1 << paramInt1;
            this.set |= i;
            this.values[paramInt1] = paramInt2;
            return this;
          } 
          return this;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this;
  }
  
  public final int get(int paramInt) {
    return this.values[paramInt];
  }
  
  public final void merge(@NotNull Settings paramSettings) {
    long l = a ^ 0x8B4B6703A72L;
    Intrinsics.checkNotNullParameter(paramSettings, "other");
    byte b = 0;
    while (b < 10) {
      byte b1 = b;
      try {
        b++;
        if (!paramSettings.isSet(b1))
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      set(b1, paramSettings.get(b1));
    } 
  }
  
  public final int getMaxHeaderListSize(int paramInt) {
    byte b = 64;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((b & this.set) != 0) ? this.values[6] : paramInt;
  }
  
  public final int getMaxConcurrentStreams() {
    byte b = 16;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((b & this.set) != 0) ? this.values[4] : Integer.MAX_VALUE;
  }
  
  public final int getMaxFrameSize(int paramInt) {
    byte b = 32;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((b & this.set) != 0) ? this.values[5] : paramInt;
  }
  
  public final int getHeaderTableSize() {
    byte b = 2;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((b & this.set) != 0) ? this.values[1] : -1;
  }
  
  public final boolean getEnablePush(boolean paramBoolean) {
    byte b = 4;
    try {
      if ((b & this.set) != 0) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramBoolean;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Settings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */