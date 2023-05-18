package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableSet;

@SinceKotlin(version = "1.1")
public abstract class AbstractMutableSet extends AbstractSet implements Set, KMutableSet {
  public abstract boolean add(Object paramObject);
  
  public abstract int getSize();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractMutableSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */