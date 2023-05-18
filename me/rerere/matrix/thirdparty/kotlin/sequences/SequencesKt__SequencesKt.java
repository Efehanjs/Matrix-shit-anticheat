package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.LowPriorityInOverloadResolution;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
  private static final long c = o3.a(6656812149590086939L, 987998044161559852L, null).a(194446524628680L);
  
  @NotNull
  public static final Sequence constrainOnce(@NotNull Sequence paramSequence) {
    long l = c ^ 0x285EED8359E8L;
    try {
      Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramSequence instanceof ConstrainedOnceSequence) ? paramSequence : new ConstrainedOnceSequence(paramSequence);
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Sequence shuffled(@NotNull Sequence paramSequence) {
    long l = c ^ 0x2BA45CA3E714L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return SequencesKt.shuffled(paramSequence, (Random)Random.Default);
  }
  
  @NotNull
  public static final Sequence asSequence(@NotNull Iterator paramIterator) {
    long l = c ^ 0x3661B7854D77L;
    Intrinsics.checkNotNullParameter(paramIterator, "<this>");
    return SequencesKt.constrainOnce(new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(paramIterator));
  }
  
  @NotNull
  public static final Pair unzip(@NotNull Sequence paramSequence) {
    long l = c ^ 0x48B7963BC2CEL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    ArrayList<Object> arrayList1 = new ArrayList();
    ArrayList<Object> arrayList2 = new ArrayList();
    for (Pair pair : paramSequence) {
      arrayList1.add(pair.getFirst());
      arrayList2.add(pair.getSecond());
    } 
    return TuplesKt.to(arrayList1, arrayList2);
  }
  
  @NotNull
  public static final Sequence generateSequence(@NotNull Function0 paramFunction0, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x76330DEE4B41L;
    Intrinsics.checkNotNullParameter(paramFunction0, "seedFunction");
    Intrinsics.checkNotNullParameter(paramFunction1, "nextFunction");
    return new GeneratorSequence(paramFunction0, paramFunction1);
  }
  
  @NotNull
  public static final Sequence generateSequence(@NotNull Function0 paramFunction0) {
    long l = c ^ 0x4609D1084832L;
    Intrinsics.checkNotNullParameter(paramFunction0, "nextFunction");
    return SequencesKt.constrainOnce(new GeneratorSequence(paramFunction0, new SequencesKt__SequencesKt$generateSequence$1(paramFunction0)));
  }
  
  @SinceKotlin(version = "1.4")
  @NotNull
  public static final Sequence shuffled(@NotNull Sequence paramSequence, @NotNull Random paramRandom) {
    long l = c ^ 0x621CC4817062L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    return SequencesKt.sequence(new SequencesKt__SequencesKt$shuffled$1(paramSequence, paramRandom, null));
  }
  
  @NotNull
  public static final Sequence emptySequence() {
    return EmptySequence.INSTANCE;
  }
  
  @NotNull
  public static final Sequence flatten(@NotNull Sequence paramSequence) {
    long l = c ^ 0x57EA90096DC4L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return flatten$SequencesKt__SequencesKt(paramSequence, SequencesKt__SequencesKt$flatten$1.INSTANCE);
  }
  
  @NotNull
  public static final Sequence flatMapIndexed(@NotNull Sequence paramSequence, @NotNull Function2 paramFunction2, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x52D71535D8EFL;
    Intrinsics.checkNotNullParameter(paramSequence, "source");
    Intrinsics.checkNotNullParameter(paramFunction2, "transform");
    Intrinsics.checkNotNullParameter(paramFunction1, "iterator");
    return SequencesKt.sequence(new SequencesKt__SequencesKt$flatMapIndexed$1(paramSequence, paramFunction2, paramFunction1, null));
  }
  
  @NotNull
  public static final Sequence flattenSequenceOfIterable(@NotNull Sequence paramSequence) {
    long l = c ^ 0x415CA369934AL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    return flatten$SequencesKt__SequencesKt(paramSequence, SequencesKt__SequencesKt$flatten$2.INSTANCE);
  }
  
  @NotNull
  public static final Sequence sequenceOf(@NotNull Object... paramVarArgs) {
    long l = c ^ 0x577D3B25166L;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((paramVarArgs.length == 0)) ? SequencesKt.emptySequence() : ArraysKt.asSequence(paramVarArgs);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Sequence ifEmpty(@NotNull Sequence paramSequence, @NotNull Function0 paramFunction0) {
    long l = c ^ 0x747F3BA1CD8FL;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction0, "defaultValue");
    return SequencesKt.sequence(new SequencesKt__SequencesKt$ifEmpty$1(paramSequence, paramFunction0, null));
  }
  
  @LowPriorityInOverloadResolution
  @NotNull
  public static final Sequence generateSequence(@Nullable Object paramObject, @NotNull Function1 paramFunction1) {
    long l = c ^ 0x55049C3FFB03L;
    try {
      Intrinsics.checkNotNullParameter(paramFunction1, "nextFunction");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject == null) ? EmptySequence.INSTANCE : new GeneratorSequence(new SequencesKt__SequencesKt$generateSequence$2(paramObject), paramFunction1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequencesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */