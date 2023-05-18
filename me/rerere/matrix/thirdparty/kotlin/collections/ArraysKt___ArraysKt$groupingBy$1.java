package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.ArrayIteratorKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysKt$groupingBy$1 implements Grouping {
  public ArraysKt___ArraysKt$groupingBy$1(Object[] paramArrayOfObject, Function1 paramFunction1) {}
  
  @NotNull
  public Iterator sourceIterator() {
    return ArrayIteratorKt.iterator(this.$this_groupingBy);
  }
  
  public Object keyOf(Object paramObject) {
    return this.$keySelector.invoke(paramObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysKt$groupingBy$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */