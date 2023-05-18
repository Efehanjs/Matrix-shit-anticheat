package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Regex$findAll$1 extends Lambda implements Function0 {
  @Nullable
  public final MatchResult invoke() {
    return Regex.this.find(this.$input, this.$startIndex);
  }
  
  public Regex$findAll$1(CharSequence paramCharSequence, int paramInt) {
    super(0);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\Regex$findAll$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */