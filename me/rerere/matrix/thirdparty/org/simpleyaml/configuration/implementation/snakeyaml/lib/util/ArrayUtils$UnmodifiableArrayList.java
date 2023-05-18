package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.lang.invoke.MethodHandles;
import java.util.AbstractList;
import me.rerere.matrix.internal.o3;

public class ArrayUtils$UnmodifiableArrayList extends AbstractList {
  private final Object[] array;
  
  private static final long a = o3.a(-6618258044896247380L, -6446773110014432397L, MethodHandles.lookup().lookupClass()).a(31855071115437L);
  
  public ArrayUtils$UnmodifiableArrayList(Object[] paramArrayOfObject) {
    this.array = paramArrayOfObject;
  }
  
  public Object get(int paramInt) {
    long l = a ^ 0x3CEE788D80EBL;
    try {
      if (paramInt >= this.array.length)
        throw new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + size()); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return this.array[paramInt];
  }
  
  public int size() {
    return this.array.length;
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\ArrayUtils$UnmodifiableArrayList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */