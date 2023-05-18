package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class LinkedTreeMap$LinkedTreeMapIterator implements Iterator {
  public LinkedTreeMap$Node lastReturned = null;
  
  public int expectedModCount = LinkedTreeMap.this.modCount;
  
  public LinkedTreeMap$Node next = LinkedTreeMap.this.header.next;
  
  public final LinkedTreeMap$Node nextNode() {
    LinkedTreeMap$Node linkedTreeMap$Node = this.next;
    try {
      if (linkedTreeMap$Node == LinkedTreeMap.this.header)
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (LinkedTreeMap.this.modCount != this.expectedModCount)
        throw new ConcurrentModificationException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.next = linkedTreeMap$Node.next;
    return this.lastReturned = linkedTreeMap$Node;
  }
  
  public final void remove() {
    try {
      if (this.lastReturned == null)
        throw new IllegalStateException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    LinkedTreeMap.this.removeInternal(this.lastReturned, true);
    this.lastReturned = null;
    this.expectedModCount = LinkedTreeMap.this.modCount;
  }
  
  public final boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.next != LinkedTreeMap.this.header);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\LinkedTreeMap$LinkedTreeMapIterator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */