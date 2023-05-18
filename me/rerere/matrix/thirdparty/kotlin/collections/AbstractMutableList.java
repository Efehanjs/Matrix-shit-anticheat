package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableList;

@SinceKotlin(version = "1.1")
public abstract class AbstractMutableList extends AbstractList implements List, KMutableList {
  public abstract Object set(int paramInt, Object paramObject);
  
  public abstract int getSize();
  
  public abstract void add(int paramInt, Object paramObject);
  
  public abstract Object removeAt(int paramInt);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\AbstractMutableList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */