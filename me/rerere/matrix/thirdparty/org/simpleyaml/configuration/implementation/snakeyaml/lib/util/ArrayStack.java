package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.util.ArrayList;

public class ArrayStack {
  private final ArrayList stack;
  
  public ArrayStack(int paramInt) {
    this.stack = new ArrayList(paramInt);
  }
  
  public Object pop() {
    return this.stack.remove(this.stack.size() - 1);
  }
  
  public void clear() {
    this.stack.clear();
  }
  
  public void push(Object paramObject) {
    this.stack.add(paramObject);
  }
  
  public boolean isEmpty() {
    return this.stack.isEmpty();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\ArrayStack.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */