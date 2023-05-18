package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CombinedContext$writeReplace$1 extends Lambda implements Function2 {
  private static final long a = o3.a(-2430875426793694308L, 9117585187426198230L, null).a(41655724823459L);
  
  public final void invoke(@NotNull Unit paramUnit, @NotNull CoroutineContext$Element paramCoroutineContext$Element) {
    long l = a ^ 0x21304250A26AL;
    Intrinsics.checkNotNullParameter(paramUnit, "<anonymous parameter 0>");
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Element, "element");
    int i = this.$index.element;
    this.$index.element = i + 1;
    this.$elements[i] = paramCoroutineContext$Element;
  }
  
  public CombinedContext$writeReplace$1(CoroutineContext[] paramArrayOfCoroutineContext, Ref.IntRef paramIntRef) {
    super(2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CombinedContext$writeReplace$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */