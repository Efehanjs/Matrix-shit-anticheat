package me.rerere.matrix.thirdparty.kotlin.time;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.comparisons.ComparisonsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function4;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function5;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.math.MathKt;
import me.rerere.matrix.thirdparty.kotlin.ranges.ClosedRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.LongRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@JvmInline
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
public final class Duration implements Comparable {
  private static final long NEG_INFINITE;
  
  private static final long ZERO;
  
  private final long rawValue;
  
  @NotNull
  public static final Duration$Companion Companion;
  
  private static final long INFINITE;
  
  private static final long a = o3.a(-7228903357067897225L, 4259768145524614363L, null).a(208645841981582L);
  
  public static final long getInWholeMinutes-impl(long paramLong) {
    return toLong-impl(paramLong, DurationUnit.MINUTES);
  }
  
  public static final double getInMilliseconds-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.MILLISECONDS);
  }
  
  public static final long getInWholeNanoseconds-impl(long paramLong) {
    long l = getValue-impl(paramLong);
    try {
      try {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isInNanos-impl(paramLong) ? l : ((l > 9223372036854L) ? Long.MAX_VALUE : ((l < -9223372036854L) ? Long.MIN_VALUE : DurationKt.access$millisToNanos(l)));
  }
  
  public static long constructor-impl(long paramLong) {
    long l1 = a ^ 0x61FB426E4BCBL;
    long l2 = paramLong;
    try {
      if (DurationJvmKt.getDurationAssertionsEnabled())
        try {
          if (isInNanos-impl(l2)) {
            if (!(new LongRange(-4611686018426999999L, 4611686018426999999L)).contains(getValue-impl(l2)))
              throw new AssertionError(getValue-impl(l2) + " ns is out of nanoseconds range"); 
          } else {
            try {
              if (!(new LongRange(-4611686018427387903L, 4611686018427387903L)).contains(getValue-impl(l2)))
                throw new AssertionError(getValue-impl(l2) + " ms is out of milliseconds range"); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if ((new LongRange(-4611686018426L, 4611686018426L)).contains(getValue-impl(l2)))
                throw new AssertionError(getValue-impl(l2) + " ms is denormalized"); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return l2;
  }
  
  public static final long minus-LRDsOJo(long paramLong1, long paramLong2) {
    return plus-LRDsOJo(paramLong1, unaryMinus-UwyO8pc(paramLong2));
  }
  
  public static final double toDouble-impl(long paramLong, @NotNull DurationUnit paramDurationUnit) {
    long l1 = a ^ 0x327F2CEBEB62L;
    Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    long l2 = paramLong;
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (l2 == INFINITE) ? Double.POSITIVE_INFINITY : ((l2 == NEG_INFINITE) ? Double.NEGATIVE_INFINITY : DurationUnitKt.convertDurationUnit(getValue-impl(paramLong), getStorageUnit-impl(paramLong), paramDurationUnit));
  }
  
  @NotNull
  public static final String toString-impl(long paramLong, @NotNull DurationUnit paramDurationUnit, int paramInt) {
    long l = a ^ 0x3A1608907830L;
    try {
      Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "decimals must be not negative, but was " + paramInt;
      throw new IllegalArgumentException(str.toString());
    } 
    double d = toDouble-impl(paramLong, paramDurationUnit);
    try {
      if (Double.isInfinite(d))
        return String.valueOf(d); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return DurationJvmKt.formatToExactDecimals(d, RangesKt.coerceAtMost(paramInt, 12)) + DurationUnitKt.shortName(paramDurationUnit);
  }
  
  public static final int getNanosecondsComponent-impl(long paramLong) {
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isInfinite-impl(paramLong) ? 0 : (isInMillis-impl(paramLong) ? (int)DurationKt.access$millisToNanos(getValue-impl(paramLong) % 1000L) : (int)(getValue-impl(paramLong) % 1000000000L));
  }
  
  public static final long div-UwyO8pc(long paramLong, double paramDouble) {
    int i = MathKt.roundToInt(paramDouble);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if ((i == paramDouble))
        try {
          if (i != 0)
            return div-UwyO8pc(paramLong, i); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    DurationUnit durationUnit = getStorageUnit-impl(paramLong);
    double d = toDouble-impl(paramLong, durationUnit) / paramDouble;
    return DurationKt.toDuration(d, durationUnit);
  }
  
  public static int hashCode-impl(long paramLong) {
    return (int)(paramLong ^ paramLong >>> 32L);
  }
  
  public static final int getMinutesComponent-impl(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isInfinite-impl(paramLong) ? 0 : (int)(getInWholeMinutes-impl(paramLong) % 60L);
  }
  
  public static final long times-UwyO8pc(long paramLong, double paramDouble) {
    int i = MathKt.roundToInt(paramDouble);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if ((i == paramDouble))
        return times-UwyO8pc(paramLong, i); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    DurationUnit durationUnit = getStorageUnit-impl(paramLong);
    double d = toDouble-impl(paramLong, durationUnit) * paramDouble;
    return DurationKt.toDuration(d, durationUnit);
  }
  
  public static final int toInt-impl(long paramLong, @NotNull DurationUnit paramDurationUnit) {
    long l = a ^ 0x1FBF484FF81CL;
    Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    return (int)RangesKt.coerceIn(toLong-impl(paramLong, paramDurationUnit), -2147483648L, 2147483647L);
  }
  
  public static final int getSecondsComponent-impl(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isInfinite-impl(paramLong) ? 0 : (int)(getInWholeSeconds-impl(paramLong) % 60L);
  }
  
  public static final Object toComponents-impl(long paramLong, @NotNull Function4 paramFunction4) {
    long l = a ^ 0x70904C431B50L;
    Intrinsics.checkNotNullParameter(paramFunction4, "action");
    boolean bool = false;
    return paramFunction4.invoke(Long.valueOf(getInWholeHours-impl(paramLong)), Integer.valueOf(getMinutesComponent-impl(paramLong)), Integer.valueOf(getSecondsComponent-impl(paramLong)), Integer.valueOf(getNanosecondsComponent-impl(paramLong)));
  }
  
  @NotNull
  public static final String toIsoString-impl(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/time/Duration.a : J
    //   3: ldc2_w 41068672715304
    //   6: lxor
    //   7: lstore_2
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #4
    //   17: aload #4
    //   19: astore #5
    //   21: iconst_0
    //   22: istore #6
    //   24: lload_0
    //   25: invokestatic isNegative-impl : (J)Z
    //   28: ifeq -> 46
    //   31: aload #5
    //   33: bipush #45
    //   35: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: aload #5
    //   48: ldc_w 'PT'
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: lload_0
    //   56: invokestatic getAbsoluteValue-UwyO8pc : (J)J
    //   59: lstore #7
    //   61: iconst_0
    //   62: istore #9
    //   64: nop
    //   65: lload #7
    //   67: invokestatic getInWholeHours-impl : (J)J
    //   70: lload #7
    //   72: invokestatic getMinutesComponent-impl : (J)I
    //   75: lload #7
    //   77: invokestatic getSecondsComponent-impl : (J)I
    //   80: lload #7
    //   82: invokestatic getNanosecondsComponent-impl : (J)I
    //   85: istore #10
    //   87: istore #11
    //   89: istore #12
    //   91: lstore #13
    //   93: iconst_0
    //   94: istore #15
    //   96: lload #13
    //   98: lstore #16
    //   100: lload_0
    //   101: invokestatic isInfinite-impl : (J)Z
    //   104: ifeq -> 112
    //   107: ldc2_w 9999999999999
    //   110: lstore #16
    //   112: lload #16
    //   114: lconst_0
    //   115: lcmp
    //   116: ifeq -> 127
    //   119: iconst_1
    //   120: goto -> 128
    //   123: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   126: athrow
    //   127: iconst_0
    //   128: istore #18
    //   130: iload #11
    //   132: ifne -> 147
    //   135: iload #10
    //   137: ifeq -> 155
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   146: athrow
    //   147: iconst_1
    //   148: goto -> 156
    //   151: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   154: athrow
    //   155: iconst_0
    //   156: istore #19
    //   158: iload #12
    //   160: ifne -> 187
    //   163: iload #19
    //   165: ifeq -> 195
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   174: athrow
    //   175: iload #18
    //   177: ifeq -> 195
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   186: athrow
    //   187: iconst_1
    //   188: goto -> 196
    //   191: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   194: athrow
    //   195: iconst_0
    //   196: istore #20
    //   198: iload #18
    //   200: ifeq -> 223
    //   203: aload #5
    //   205: lload #16
    //   207: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   210: bipush #72
    //   212: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   222: athrow
    //   223: iload #20
    //   225: ifeq -> 248
    //   228: aload #5
    //   230: iload #12
    //   232: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   235: bipush #77
    //   237: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   247: athrow
    //   248: iload #19
    //   250: ifne -> 277
    //   253: iload #18
    //   255: ifne -> 300
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   264: athrow
    //   265: iload #20
    //   267: ifne -> 300
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   276: athrow
    //   277: lload_0
    //   278: aload #5
    //   280: iload #11
    //   282: iload #10
    //   284: bipush #9
    //   286: ldc_w 'S'
    //   289: iconst_1
    //   290: invokestatic appendFractional-impl : (JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   299: athrow
    //   300: nop
    //   301: nop
    //   302: nop
    //   303: aload #4
    //   305: invokevirtual toString : ()Ljava/lang/String;
    //   308: dup
    //   309: ldc_w 'StringBuilder().apply(builderAction).toString()'
    //   312: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   315: areturn
    // Exception table:
    //   from	to	target	type
    //   24	39	42	java/lang/IllegalArgumentException
    //   112	123	123	java/lang/IllegalArgumentException
    //   130	140	143	java/lang/IllegalArgumentException
    //   135	151	151	java/lang/IllegalArgumentException
    //   158	168	171	java/lang/IllegalArgumentException
    //   163	180	183	java/lang/IllegalArgumentException
    //   175	191	191	java/lang/IllegalArgumentException
    //   198	216	219	java/lang/IllegalArgumentException
    //   223	241	244	java/lang/IllegalArgumentException
    //   248	258	261	java/lang/IllegalArgumentException
    //   253	270	273	java/lang/IllegalArgumentException
    //   265	293	296	java/lang/IllegalArgumentException
  }
  
  public static final int getHoursComponent-impl(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isInfinite-impl(paramLong) ? 0 : (int)(getInWholeHours-impl(paramLong) % 24L);
  }
  
  public static final long getInWholeMilliseconds-impl(long paramLong) {
    try {
      if (isInMillis-impl(paramLong))
        try {
          if (isFinite-impl(paramLong));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return toLong-impl(paramLong, DurationUnit.MILLISECONDS);
  }
  
  @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
  @ExperimentalTime
  public static final long toLongMilliseconds-impl(long paramLong) {
    return getInWholeMilliseconds-impl(paramLong);
  }
  
  public static final long getInWholeDays-impl(long paramLong) {
    return toLong-impl(paramLong, DurationUnit.DAYS);
  }
  
  public static final boolean equals-impl0(long paramLong1, long paramLong2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramLong1 == paramLong2);
  }
  
  public static final double getInMinutes-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.MINUTES);
  }
  
  public static final long getInWholeHours-impl(long paramLong) {
    return toLong-impl(paramLong, DurationUnit.HOURS);
  }
  
  public static final boolean isInfinite-impl(long paramLong) {
    try {
      if (paramLong != INFINITE) {
        try {
          if (paramLong == NEG_INFINITE);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static final boolean isNegative-impl(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramLong < 0L);
  }
  
  @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
  @ExperimentalTime
  public static final long toLongNanoseconds-impl(long paramLong) {
    return getInWholeNanoseconds-impl(paramLong);
  }
  
  public static final long unaryMinus-UwyO8pc(long paramLong) {
    boolean bool = false;
    return DurationKt.access$durationOf(-getValue-impl(paramLong), (int)paramLong & 0x1);
  }
  
  public static final Object toComponents-impl(long paramLong, @NotNull Function5 paramFunction5) {
    long l = a ^ 0x3246D29DDF36L;
    Intrinsics.checkNotNullParameter(paramFunction5, "action");
    boolean bool = false;
    return paramFunction5.invoke(Long.valueOf(getInWholeDays-impl(paramLong)), Integer.valueOf(getHoursComponent-impl(paramLong)), Integer.valueOf(getMinutesComponent-impl(paramLong)), Integer.valueOf(getSecondsComponent-impl(paramLong)), Integer.valueOf(getNanosecondsComponent-impl(paramLong)));
  }
  
  public static final long getAbsoluteValue-UwyO8pc(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isNegative-impl(paramLong) ? unaryMinus-UwyO8pc(paramLong) : paramLong;
  }
  
  public static boolean equals-impl(long paramLong, Object paramObject) {
    try {
      if (!(paramObject instanceof Duration))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l = ((Duration)paramObject).unbox-impl();
    try {
      if (paramLong != l)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return true;
  }
  
  public static final double getInNanoseconds-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.NANOSECONDS);
  }
  
  public static final long toLong-impl(long paramLong, @NotNull DurationUnit paramDurationUnit) {
    long l1 = a ^ 0x10A2CDF8BF09L;
    Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    long l2 = paramLong;
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (l2 == INFINITE) ? Long.MAX_VALUE : ((l2 == NEG_INFINITE) ? Long.MIN_VALUE : DurationUnitKt.convertDurationUnit(getValue-impl(paramLong), getStorageUnit-impl(paramLong), paramDurationUnit));
  }
  
  public static final double getInHours-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.HOURS);
  }
  
  public static final boolean isFinite-impl(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return !isInfinite-impl(paramLong);
  }
  
  public static final double getInMicroseconds-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.MICROSECONDS);
  }
  
  public static final long times-UwyO8pc(long paramLong, int paramInt) {
    long l1 = a ^ 0x3BDB5A453C16L;
    try {
      if (isInfinite-impl(paramLong)) {
        try {
          if (paramInt == 0)
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result."); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramInt > 0) ? paramLong : unaryMinus-UwyO8pc(paramLong);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt == 0)
        return ZERO; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = getValue-impl(paramLong);
    long l3 = l2 * paramInt;
    try {
      try {
        long l4 = DurationKt.access$nanosToMillis(l2);
        long l5 = l2 - DurationKt.access$millisToNanos(l4);
        long l6 = l4 * paramInt;
        long l7 = l6 + DurationKt.access$nanosToMillis(l5 * paramInt);
        try {
          if (l6 / paramInt == l4)
            try {
              if ((l7 ^ l6) >= 0L);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isInNanos-impl(paramLong) ? ((new LongRange(-2147483647L, 2147483647L)).contains(l2) ? DurationKt.access$durationOfNanos(l3) : ((l3 / paramInt == l2) ? DurationKt.access$durationOfNanosNormalized(l3) : ((MathKt.getSign(l2) * MathKt.getSign(paramInt) > 0) ? INFINITE : NEG_INFINITE))) : ((l3 / paramInt == l2) ? DurationKt.access$durationOfMillis(RangesKt.coerceIn(l3, (ClosedRange)new LongRange(-4611686018427387903L, 4611686018427387903L))) : ((MathKt.getSign(l2) * MathKt.getSign(paramInt) > 0) ? INFINITE : NEG_INFINITE));
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.rawValue, paramObject);
  }
  
  @NotNull
  public static String toString-impl(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/time/Duration.a : J
    //   3: ldc2_w 59272270155264
    //   6: lxor
    //   7: lstore_2
    //   8: lload_0
    //   9: lstore #4
    //   11: lload #4
    //   13: lconst_0
    //   14: lcmp
    //   15: ifne -> 28
    //   18: ldc_w '0s'
    //   21: goto -> 678
    //   24: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   27: athrow
    //   28: lload #4
    //   30: getstatic me/rerere/matrix/thirdparty/kotlin/time/Duration.INFINITE : J
    //   33: lcmp
    //   34: ifne -> 47
    //   37: ldc_w 'Infinity'
    //   40: goto -> 678
    //   43: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   46: athrow
    //   47: lload #4
    //   49: getstatic me/rerere/matrix/thirdparty/kotlin/time/Duration.NEG_INFINITE : J
    //   52: lcmp
    //   53: ifne -> 66
    //   56: ldc_w '-Infinity'
    //   59: goto -> 678
    //   62: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   65: athrow
    //   66: lload_0
    //   67: invokestatic isNegative-impl : (J)Z
    //   70: istore #6
    //   72: new java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: astore #7
    //   81: aload #7
    //   83: astore #8
    //   85: iconst_0
    //   86: istore #9
    //   88: iload #6
    //   90: ifeq -> 108
    //   93: aload #8
    //   95: bipush #45
    //   97: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   107: athrow
    //   108: lload_0
    //   109: invokestatic getAbsoluteValue-UwyO8pc : (J)J
    //   112: lstore #10
    //   114: iconst_0
    //   115: istore #12
    //   117: nop
    //   118: lload #10
    //   120: invokestatic getInWholeDays-impl : (J)J
    //   123: lload #10
    //   125: invokestatic getHoursComponent-impl : (J)I
    //   128: lload #10
    //   130: invokestatic getMinutesComponent-impl : (J)I
    //   133: lload #10
    //   135: invokestatic getSecondsComponent-impl : (J)I
    //   138: lload #10
    //   140: invokestatic getNanosecondsComponent-impl : (J)I
    //   143: istore #13
    //   145: istore #14
    //   147: istore #15
    //   149: istore #16
    //   151: lstore #17
    //   153: iconst_0
    //   154: istore #19
    //   156: lload #17
    //   158: lconst_0
    //   159: lcmp
    //   160: ifeq -> 171
    //   163: iconst_1
    //   164: goto -> 172
    //   167: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   170: athrow
    //   171: iconst_0
    //   172: istore #20
    //   174: iload #16
    //   176: ifeq -> 187
    //   179: iconst_1
    //   180: goto -> 188
    //   183: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   186: athrow
    //   187: iconst_0
    //   188: istore #21
    //   190: iload #15
    //   192: ifeq -> 203
    //   195: iconst_1
    //   196: goto -> 204
    //   199: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   202: athrow
    //   203: iconst_0
    //   204: istore #22
    //   206: iload #14
    //   208: ifne -> 223
    //   211: iload #13
    //   213: ifeq -> 231
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   222: athrow
    //   223: iconst_1
    //   224: goto -> 232
    //   227: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   230: athrow
    //   231: iconst_0
    //   232: istore #23
    //   234: iconst_0
    //   235: istore #24
    //   237: iload #20
    //   239: ifeq -> 265
    //   242: aload #8
    //   244: lload #17
    //   246: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   249: bipush #100
    //   251: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: iinc #24, 1
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   264: athrow
    //   265: iload #21
    //   267: ifne -> 306
    //   270: iload #20
    //   272: ifeq -> 349
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   281: athrow
    //   282: iload #22
    //   284: ifne -> 306
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   293: athrow
    //   294: iload #23
    //   296: ifeq -> 349
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   305: athrow
    //   306: iload #24
    //   308: iinc #24, 1
    //   311: ifle -> 336
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   320: athrow
    //   321: aload #8
    //   323: bipush #32
    //   325: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   335: athrow
    //   336: aload #8
    //   338: iload #16
    //   340: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   343: bipush #104
    //   345: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: iload #22
    //   351: ifne -> 390
    //   354: iload #23
    //   356: ifeq -> 433
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   365: athrow
    //   366: iload #21
    //   368: ifne -> 390
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   377: athrow
    //   378: iload #20
    //   380: ifeq -> 433
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   389: athrow
    //   390: iload #24
    //   392: iinc #24, 1
    //   395: ifle -> 420
    //   398: goto -> 405
    //   401: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   404: athrow
    //   405: aload #8
    //   407: bipush #32
    //   409: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   419: athrow
    //   420: aload #8
    //   422: iload #15
    //   424: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   427: bipush #109
    //   429: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   432: pop
    //   433: iload #23
    //   435: ifeq -> 624
    //   438: iload #24
    //   440: iinc #24, 1
    //   443: ifle -> 468
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   452: athrow
    //   453: aload #8
    //   455: bipush #32
    //   457: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   467: athrow
    //   468: nop
    //   469: iload #14
    //   471: ifne -> 510
    //   474: iload #20
    //   476: ifne -> 510
    //   479: goto -> 486
    //   482: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   485: athrow
    //   486: iload #21
    //   488: ifne -> 510
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   497: athrow
    //   498: iload #22
    //   500: ifeq -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   509: athrow
    //   510: lload_0
    //   511: aload #8
    //   513: iload #14
    //   515: iload #13
    //   517: bipush #9
    //   519: ldc_w 's'
    //   522: iconst_0
    //   523: invokestatic appendFractional-impl : (JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    //   526: goto -> 624
    //   529: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   532: athrow
    //   533: iload #13
    //   535: ldc_w 1000000
    //   538: if_icmplt -> 572
    //   541: lload_0
    //   542: aload #8
    //   544: iload #13
    //   546: ldc_w 1000000
    //   549: idiv
    //   550: iload #13
    //   552: ldc_w 1000000
    //   555: irem
    //   556: bipush #6
    //   558: ldc_w 'ms'
    //   561: iconst_0
    //   562: invokestatic appendFractional-impl : (JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    //   565: goto -> 624
    //   568: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   571: athrow
    //   572: iload #13
    //   574: sipush #1000
    //   577: if_icmplt -> 610
    //   580: lload_0
    //   581: aload #8
    //   583: iload #13
    //   585: sipush #1000
    //   588: idiv
    //   589: iload #13
    //   591: sipush #1000
    //   594: irem
    //   595: iconst_3
    //   596: ldc_w 'us'
    //   599: iconst_0
    //   600: invokestatic appendFractional-impl : (JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V
    //   603: goto -> 624
    //   606: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   609: athrow
    //   610: aload #8
    //   612: iload #13
    //   614: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   617: ldc_w 'ns'
    //   620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: pop
    //   624: iload #6
    //   626: ifeq -> 663
    //   629: iload #24
    //   631: iconst_1
    //   632: if_icmple -> 663
    //   635: goto -> 642
    //   638: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   641: athrow
    //   642: aload #8
    //   644: iconst_1
    //   645: bipush #40
    //   647: invokevirtual insert : (IC)Ljava/lang/StringBuilder;
    //   650: bipush #41
    //   652: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   655: pop
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   662: athrow
    //   663: nop
    //   664: nop
    //   665: nop
    //   666: aload #7
    //   668: invokevirtual toString : ()Ljava/lang/String;
    //   671: dup
    //   672: ldc_w 'StringBuilder().apply(builderAction).toString()'
    //   675: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   678: areturn
    // Exception table:
    //   from	to	target	type
    //   11	24	24	java/lang/IllegalArgumentException
    //   28	43	43	java/lang/IllegalArgumentException
    //   47	62	62	java/lang/IllegalArgumentException
    //   88	101	104	java/lang/IllegalArgumentException
    //   156	167	167	java/lang/IllegalArgumentException
    //   174	183	183	java/lang/IllegalArgumentException
    //   190	199	199	java/lang/IllegalArgumentException
    //   206	216	219	java/lang/IllegalArgumentException
    //   211	227	227	java/lang/IllegalArgumentException
    //   237	258	261	java/lang/IllegalArgumentException
    //   265	275	278	java/lang/IllegalArgumentException
    //   270	287	290	java/lang/IllegalArgumentException
    //   282	299	302	java/lang/IllegalArgumentException
    //   294	314	317	java/lang/IllegalArgumentException
    //   306	329	332	java/lang/IllegalArgumentException
    //   349	359	362	java/lang/IllegalArgumentException
    //   354	371	374	java/lang/IllegalArgumentException
    //   366	383	386	java/lang/IllegalArgumentException
    //   378	398	401	java/lang/IllegalArgumentException
    //   390	413	416	java/lang/IllegalArgumentException
    //   433	446	449	java/lang/IllegalArgumentException
    //   438	461	464	java/lang/IllegalArgumentException
    //   468	479	482	java/lang/IllegalArgumentException
    //   474	491	494	java/lang/IllegalArgumentException
    //   486	503	506	java/lang/IllegalArgumentException
    //   498	529	529	java/lang/IllegalArgumentException
    //   533	568	568	java/lang/IllegalArgumentException
    //   572	606	606	java/lang/IllegalArgumentException
    //   624	635	638	java/lang/IllegalArgumentException
    //   629	656	659	java/lang/IllegalArgumentException
  }
  
  public static final Object toComponents-impl(long paramLong, @NotNull Function3 paramFunction3) {
    long l = a ^ 0x65A95552868BL;
    Intrinsics.checkNotNullParameter(paramFunction3, "action");
    boolean bool = false;
    return paramFunction3.invoke(Long.valueOf(getInWholeMinutes-impl(paramLong)), Integer.valueOf(getSecondsComponent-impl(paramLong)), Integer.valueOf(getNanosecondsComponent-impl(paramLong)));
  }
  
  public int hashCode() {
    return hashCode-impl(this.rawValue);
  }
  
  public static int compareTo-LRDsOJo(long paramLong1, long paramLong2) {
    long l = paramLong1 ^ paramLong2;
    try {
      if (l >= 0L)
        try {
          if (((int)l & 0x1) != 0) {
            boolean bool = false;
            bool = false;
            int i = ((int)paramLong1 & 0x1) - ((int)paramLong2 & 0x1);
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return isNegative-impl(paramLong1) ? -i : i;
          } 
          return Intrinsics.compare(paramLong1, paramLong2);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Intrinsics.compare(paramLong1, paramLong2);
  }
  
  static {
    Companion = new Duration$Companion(null);
    ZERO = constructor-impl(0L);
    INFINITE = DurationKt.access$durationOfMillis(4611686018427387903L);
    NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);
  }
  
  public static final double getInDays-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.DAYS);
  }
  
  public static final boolean isPositive-impl(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramLong > 0L);
  }
  
  public static final Object toComponents-impl(long paramLong, @NotNull Function2 paramFunction2) {
    long l = a ^ 0x608129279564L;
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    boolean bool = false;
    return paramFunction2.invoke(Long.valueOf(getInWholeSeconds-impl(paramLong)), Integer.valueOf(getNanosecondsComponent-impl(paramLong)));
  }
  
  public static final double div-LRDsOJo(long paramLong1, long paramLong2) {
    DurationUnit durationUnit = (DurationUnit)ComparisonsKt.maxOf(getStorageUnit-impl(paramLong1), getStorageUnit-impl(paramLong2));
    return toDouble-impl(paramLong1, durationUnit) / toDouble-impl(paramLong2, durationUnit);
  }
  
  public static final long getInWholeMicroseconds-impl(long paramLong) {
    return toLong-impl(paramLong, DurationUnit.MICROSECONDS);
  }
  
  public static final long getInWholeSeconds-impl(long paramLong) {
    return toLong-impl(paramLong, DurationUnit.SECONDS);
  }
  
  public static final long div-UwyO8pc(long paramLong, int paramInt) {
    long l1 = a ^ 0x4973D7EE79BEL;
    try {
      if (paramInt == 0) {
        try {
          try {
            if (isNegative-impl(paramLong)) {
            
            } else {
              throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return isPositive-impl(paramLong) ? INFINITE : "JD-Core does not support Kotlin";
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (isInNanos-impl(paramLong))
        return DurationKt.access$durationOfNanos(getValue-impl(paramLong) / paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (isInfinite-impl(paramLong))
        return times-UwyO8pc(paramLong, MathKt.getSign(paramInt)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = getValue-impl(paramLong) / paramInt;
    if ((new LongRange(-4611686018426L, 4611686018426L)).contains(l2)) {
      long l = DurationKt.access$millisToNanos(getValue-impl(paramLong) - l2 * paramInt) / paramInt;
      return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(l2) + l);
    } 
    return DurationKt.access$durationOfMillis(l2);
  }
  
  public static final long plus-LRDsOJo(long paramLong1, long paramLong2) {
    long l = a ^ 0x2BE8C7B8D82BL;
    try {
      if (isInfinite-impl(paramLong1)) {
        try {
          if (!isFinite-impl(paramLong2))
            try {
              if ((paramLong1 ^ paramLong2) < 0L)
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result."); 
              return paramLong1;
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramLong1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (isInfinite-impl(paramLong2))
        return paramLong2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = false;
    bool = false;
    if (((int)paramLong1 & 0x1) == ((int)paramLong2 & 0x1)) {
      long l1 = getValue-impl(paramLong1) + getValue-impl(paramLong2);
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } else {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return isInMillis-impl(paramLong1) ? addValuesMixedRanges-UwyO8pc(paramLong1, getValue-impl(paramLong1), getValue-impl(paramLong2)) : addValuesMixedRanges-UwyO8pc(paramLong1, getValue-impl(paramLong2), getValue-impl(paramLong1));
  }
  
  @NotNull
  public String toString() {
    return toString-impl(this.rawValue);
  }
  
  public int compareTo-LRDsOJo(long paramLong) {
    return compareTo-LRDsOJo(this.rawValue, paramLong);
  }
  
  public static final double getInSeconds-impl(long paramLong) {
    return toDouble-impl(paramLong, DurationUnit.SECONDS);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\Duration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */