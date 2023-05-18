package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class LinkedTreeMap$EntrySet extends AbstractSet {
  public boolean contains(Object paramObject) {
    try {
      if (paramObject instanceof Map.Entry)
        try {
          if (LinkedTreeMap.this.findByEntry((Map.Entry)paramObject) != null);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public Iterator iterator() {
    return new LinkedTreeMap$EntrySet$1(this);
  }
  
  public void clear() {
    LinkedTreeMap.this.clear();
  }
  
  public int size() {
    return LinkedTreeMap.this.size;
  }
  
  public boolean remove(Object paramObject) {
    try {
      if (!(paramObject instanceof Map.Entry))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    LinkedTreeMap$Node linkedTreeMap$Node = LinkedTreeMap.this.findByEntry((Map.Entry)paramObject);
    try {
      if (linkedTreeMap$Node == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    LinkedTreeMap.this.removeInternal(linkedTreeMap$Node, true);
    return true;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\LinkedTreeMap$EntrySet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */