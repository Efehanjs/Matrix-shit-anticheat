package me.rerere.matrix.thirdparty.kotlin.streams.jdk8;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.stream.Stream;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StreamsKt$asSequence$$inlined$Sequence$1 implements Sequence {
  private static final long a = o3.a(1302139195341026501L, 4829914186039062331L, MethodHandles.lookup().lookupClass()).a(57655721697477L);
  
  @NotNull
  public Iterator iterator() {
    long l = a ^ 0x68D67D7C8446L;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(this.$this_asSequence$inlined.iterator(), "iterator()");
    return this.$this_asSequence$inlined.iterator();
  }
  
  public StreamsKt$asSequence$$inlined$Sequence$1(Stream paramStream) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\streams\jdk8\StreamsKt$asSequence$$inlined$Sequence$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */