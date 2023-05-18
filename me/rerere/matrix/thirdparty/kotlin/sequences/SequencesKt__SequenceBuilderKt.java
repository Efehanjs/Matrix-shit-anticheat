package me.rerere.matrix.thirdparty.kotlin.sequences;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.BuilderInference;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics.IntrinsicsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class SequencesKt__SequenceBuilderKt {
  private static final int State_Failed = 5;
  
  private static final int State_Done = 4;
  
  private static final int State_Ready = 3;
  
  private static final int State_ManyNotReady = 1;
  
  private static final int State_ManyReady = 2;
  
  private static final int State_NotReady = 0;
  
  private static final long a = o3.a(1191231438903013282L, -7879604277136718757L, null).a(108613461751775L);
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Iterator iterator(@BuilderInference @NotNull Function2 paramFunction2) {
    long l = a ^ 0x1FCCDBFDC53DL;
    Intrinsics.checkNotNullParameter(paramFunction2, "block");
    SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
    sequenceBuilderIterator.setNextStep(IntrinsicsKt.createCoroutineUnintercepted(paramFunction2, sequenceBuilderIterator, sequenceBuilderIterator));
    return sequenceBuilderIterator;
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Sequence sequence(@BuilderInference @NotNull Function2 paramFunction2) {
    long l = a ^ 0x621C0FB21D05L;
    Intrinsics.checkNotNullParameter(paramFunction2, "block");
    return new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(paramFunction2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequenceBuilderKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */