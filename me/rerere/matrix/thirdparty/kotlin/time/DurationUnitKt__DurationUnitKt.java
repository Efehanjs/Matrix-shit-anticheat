package me.rerere.matrix.thirdparty.kotlin.time;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {
  private static final long b = o3.a(1189818265846079331L, -7369529640471483608L, null).a(227632315128926L);
  
  @SinceKotlin(version = "1.5")
  @NotNull
  public static final DurationUnit durationUnitByIsoChar(char paramChar, boolean paramBoolean) {
    long l = b ^ 0x31F08928714BL;
    try {
      if (!paramBoolean) {
        try {
          if (paramChar == 'D') {
          
          } else {
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + paramChar);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        char c = paramChar;
        try {
          try {
            try {
              if (c == 'S') {
              
              } else {
                throw new IllegalArgumentException("Invalid duration ISO time unit: " + paramChar);
              } 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (c == 'H') ? DurationUnit.HOURS : ((c == 'M') ? DurationUnit.MINUTES : (DurationUnit)"JD-Core does not support Kotlin");
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final String shortName(@NotNull DurationUnit paramDurationUnit) {
    long l = b ^ 0x1EC5054D6910L;
    try {
      Intrinsics.checkNotNullParameter(paramDurationUnit, "<this>");
      switch (DurationUnitKt__DurationUnitKt$WhenMappings.$EnumSwitchMapping$0[paramDurationUnit.ordinal()]) {
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(("Unknown unit: " + paramDurationUnit).toString());
  }
  
  @SinceKotlin(version = "1.5")
  @NotNull
  public static final DurationUnit durationUnitByShortName(@NotNull String paramString) {
    long l = b ^ 0x389DDAF56ECDL;
    Intrinsics.checkNotNullParameter(paramString, "shortName");
    String str = paramString;
    try {
      switch (str.hashCode()) {
        case 115:
          try {
            if (!str.equals("s"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 100:
          try {
            if (!str.equals("d"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 3525:
          try {
            if (!str.equals("ns"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 3494:
          try {
            if (!str.equals("ms"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 104:
          try {
            if (!str.equals("h"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 109:
          try {
            if (!str.equals("m"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 3742:
          try {
            if (!str.equals("us"))
              break; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalArgumentException("Unknown duration unit short name: " + paramString);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\DurationUnitKt__DurationUnitKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */