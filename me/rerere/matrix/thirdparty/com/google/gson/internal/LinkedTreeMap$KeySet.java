package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

public final class LinkedTreeMap$KeySet extends AbstractSet {
  public int size() {
    return LinkedTreeMap.this.size;
  }
  
  public boolean remove(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (LinkedTreeMap.this.removeInternalByKey(paramObject) != null);
  }
  
  public void clear() {
    LinkedTreeMap.this.clear();
  }
  
  public Iterator iterator() {
    return new LinkedTreeMap$KeySet$1(this);
  }
  
  public boolean contains(Object paramObject) {
    return LinkedTreeMap.this.containsKey(paramObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\LinkedTreeMap$KeySet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */