package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
public interface Grouping {
  @NotNull
  Iterator sourceIterator();
  
  Object keyOf(Object paramObject);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\Grouping.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */