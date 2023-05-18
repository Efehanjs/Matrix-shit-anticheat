package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.thirdparty.kotlin.collections.CharIterator;

public final class StringsKt__StringsKt$iterator$1 extends CharIterator {
  private int index;
  
  public boolean hasNext() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.index < this.$this_iterator.length());
  }
  
  public StringsKt__StringsKt$iterator$1(CharSequence paramCharSequence) {}
  
  public char nextChar() {
    int i = this.index;
    this.index = i + 1;
    return this.$this_iterator.charAt(i);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsKt$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */