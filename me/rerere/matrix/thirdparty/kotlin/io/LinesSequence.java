package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class LinesSequence implements Sequence {
  @NotNull
  private final BufferedReader reader;
  
  private static final long a = o3.a(326154319504974128L, 3970600616373621600L, null).a(39565855979442L);
  
  public LinesSequence(@NotNull BufferedReader paramBufferedReader) {
    this.reader = paramBufferedReader;
  }
  
  @NotNull
  public Iterator iterator() {
    return new LinesSequence$iterator$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\LinesSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */