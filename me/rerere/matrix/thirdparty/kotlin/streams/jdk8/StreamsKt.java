package me.rerere.matrix.thirdparty.kotlin.streams.jdk8;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StreamsKt {
  private static final long a = o3.a(8476880624297320831L, 6711731080333321089L, MethodHandles.lookup().lookupClass()).a(277641079352708L);
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List toList(@NotNull DoubleStream paramDoubleStream) {
    long l = a ^ 0x974C22358DBL;
    Intrinsics.checkNotNullParameter(paramDoubleStream, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramDoubleStream.toArray(), "toArray()");
    return ArraysKt.asList(paramDoubleStream.toArray());
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Stream asStream(@NotNull Sequence paramSequence) {
    long l = a ^ 0x2CB149FF60CCL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullExpressionValue(StreamSupport.stream(() -> {
            long l = a ^ 0x16246C42C8B4L;
            Intrinsics.checkNotNullParameter(paramSequence, "$this_asStream");
            return Spliterators.spliteratorUnknownSize(paramSequence.iterator(), 16);
          }16, false), "stream({ Spliterators.sp…literator.ORDERED, false)");
    return StreamSupport.stream(() -> {
          long l = a ^ 0x16246C42C8B4L;
          Intrinsics.checkNotNullParameter(paramSequence, "$this_asStream");
          return Spliterators.spliteratorUnknownSize(paramSequence.iterator(), 16);
        }16, false);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence asSequence(@NotNull LongStream paramLongStream) {
    long l = a ^ 0x5FE56D5348A8L;
    Intrinsics.checkNotNullParameter(paramLongStream, "<this>");
    return new StreamsKt$asSequence$$inlined$Sequence$3(paramLongStream);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence asSequence(@NotNull Stream paramStream) {
    long l = a ^ 0x6A4459DFCD7L;
    Intrinsics.checkNotNullParameter(paramStream, "<this>");
    return new StreamsKt$asSequence$$inlined$Sequence$1(paramStream);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List toList(@NotNull Stream paramStream) {
    long l = a ^ 0xE482DBA3E82L;
    Intrinsics.checkNotNullParameter(paramStream, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramStream.collect(Collectors.toList()), "collect(Collectors.toList<T>())");
    return (List)paramStream.collect(Collectors.toList());
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List toList(@NotNull LongStream paramLongStream) {
    long l = a ^ 0x2DEA7420DC85L;
    Intrinsics.checkNotNullParameter(paramLongStream, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramLongStream.toArray(), "toArray()");
    return ArraysKt.asList(paramLongStream.toArray());
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence asSequence(@NotNull DoubleStream paramDoubleStream) {
    long l = a ^ 0x56323E4C0229L;
    Intrinsics.checkNotNullParameter(paramDoubleStream, "<this>");
    return new StreamsKt$asSequence$$inlined$Sequence$4(paramDoubleStream);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final Sequence asSequence(@NotNull IntStream paramIntStream) {
    long l = a ^ 0x7DBE45684236L;
    Intrinsics.checkNotNullParameter(paramIntStream, "<this>");
    return new StreamsKt$asSequence$$inlined$Sequence$2(paramIntStream);
  }
  
  @SinceKotlin(version = "1.2")
  @NotNull
  public static final List toList(@NotNull IntStream paramIntStream) {
    long l = a ^ 0xF4EC2861928L;
    Intrinsics.checkNotNullParameter(paramIntStream, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramIntStream.toArray(), "toArray()");
    return ArraysKt.asList(paramIntStream.toArray());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\streams\jdk8\StreamsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */