package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.util.Iterator;

public class Yaml$1 implements Iterator {
  public boolean hasNext() {
    return Yaml.this.constructor.checkData();
  }
  
  public Object next() {
    return Yaml.this.constructor.getData();
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\Yaml$1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */