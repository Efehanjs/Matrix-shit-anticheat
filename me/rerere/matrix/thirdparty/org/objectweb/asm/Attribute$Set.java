package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class Attribute$Set {
  private static final int SIZE_INCREMENT = 6;
  
  private Attribute[] data = new Attribute[6];
  
  private int size;
  
  public Attribute[] toArray() {
    Attribute[] arrayOfAttribute = new Attribute[this.size];
    System.arraycopy(this.data, 0, arrayOfAttribute, 0, this.size);
    return arrayOfAttribute;
  }
  
  public void addAttributes(Attribute paramAttribute) {
    Attribute attribute = paramAttribute;
    while (true) {
      try {
        if (attribute != null) {
          try {
            if (!contains(attribute))
              add(attribute); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          attribute = attribute.nextAttribute;
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\Attribute$Set.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */