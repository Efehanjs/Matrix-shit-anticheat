package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DelimitedRangesSequence implements Sequence {
  @NotNull
  private final Function2 getNextMatch;
  
  private final int startIndex;
  
  private final int limit;
  
  @NotNull
  private final CharSequence input;
  
  private static final long a = o3.a(794222008934015187L, -7549952967663846920L, null).a(250619790576631L);
  
  @NotNull
  public Iterator iterator() {
    return new DelimitedRangesSequence$iterator$1(this);
  }
  
  public DelimitedRangesSequence(@NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2, @NotNull Function2 paramFunction2) {
    this.input = paramCharSequence;
    this.startIndex = paramInt1;
    this.limit = paramInt2;
    this.getNextMatch = paramFunction2;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\DelimitedRangesSequence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */