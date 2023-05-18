package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.Grouping;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StringsKt___StringsKt$groupingBy$1 implements Grouping {
  public Object keyOf(char paramChar) {
    return this.$keySelector.invoke(Character.valueOf(paramChar));
  }
  
  public StringsKt___StringsKt$groupingBy$1(CharSequence paramCharSequence, Function1 paramFunction1) {}
  
  @NotNull
  public Iterator sourceIterator() {
    return (Iterator)StringsKt.iterator(this.$this_groupingBy);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt___StringsKt$groupingBy$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */