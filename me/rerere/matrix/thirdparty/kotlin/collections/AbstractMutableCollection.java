package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableCollection;

@SinceKotlin(version = "1.1")
public abstract class AbstractMutableCollection extends AbstractCollection implements Collection, KMutableCollection {
  public abstract int getSize();
  
  public abstract boolean add(Object paramObject);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractMutableCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */