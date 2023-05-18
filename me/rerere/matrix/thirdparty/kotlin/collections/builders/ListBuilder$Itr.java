package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableListIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ListBuilder$Itr implements ListIterator, KMutableListIterator {
  private int lastIndex;
  
  @NotNull
  private final ListBuilder list;
  
  private int index;
  
  private static final long a = o3.a(-3880274940946862345L, -7599794002431695518L, null).a(243267332608377L);
  
  public int nextIndex() {
    return this.index;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.index < ListBuilder.access$getLength$p(this.list));
  }
  
  public Object previous() {
    try {
      if (this.index <= 0)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.lastIndex = --this.index;
    return ListBuilder.access$getArray$p(this.list)[ListBuilder.access$getOffset$p(this.list) + this.lastIndex];
  }
  
  public Object next() {
    try {
      if (this.index >= ListBuilder.access$getLength$p(this.list))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = this.index;
    this.index = i + 1;
    this.lastIndex = i;
    return ListBuilder.access$getArray$p(this.list)[ListBuilder.access$getOffset$p(this.list) + this.lastIndex];
  }
  
  public int previousIndex() {
    return this.index - 1;
  }
  
  public void add(Object paramObject) {
    int i = this.index;
    this.index = i + 1;
    this.list.add(i, paramObject);
    this.lastIndex = -1;
  }
  
  public ListBuilder$Itr(@NotNull ListBuilder paramListBuilder, int paramInt) {
    this.list = paramListBuilder;
    this.index = paramInt;
    this.lastIndex = -1;
  }
  
  public void set(Object paramObject) {
    long l = a ^ 0x27B191B1F9BAL;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (this.lastIndex != -1) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Call next() or previous() before replacing element from the iterator.";
      throw new IllegalStateException(str.toString());
    } 
    this.list.set(this.lastIndex, paramObject);
  }
  
  public void remove() {
    long l = a ^ 0x37D8F8D169AAL;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    boolean bool = (this.lastIndex != -1) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Call next() or previous() before removing element from the iterator.";
      throw new IllegalStateException(str.toString());
    } 
    this.list.remove(this.lastIndex);
    this.index = this.lastIndex;
    this.lastIndex = -1;
  }
  
  public boolean hasPrevious() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.index > 0);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\ListBuilder$Itr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */