package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.lang.invoke.MethodHandles;
import java.util.AbstractList;
import me.rerere.matrix.internal.o3;

public class ArrayUtils$CompositeUnmodifiableArrayList extends AbstractList {
  private final Object[] array1;
  
  private final Object[] array2;
  
  private static final long a = o3.a(-3487090048547932111L, -1244229345231866307L, MethodHandles.lookup().lookupClass()).a(200948794368809L);
  
  public ArrayUtils$CompositeUnmodifiableArrayList(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    this.array1 = paramArrayOfObject1;
    this.array2 = paramArrayOfObject2;
  }
  
  public Object get(int paramInt) {
    Object object;
    long l = a ^ 0x2568CAC6A618L;
    if (paramInt < this.array1.length) {
      object = this.array1[paramInt];
    } else if (paramInt - this.array1.length < this.array2.length) {
      object = this.array2[paramInt - this.array1.length];
    } else {
      throw new IndexOutOfBoundsException("Index: " + paramInt + ", Size: " + size());
    } 
    return object;
  }
  
  public int size() {
    return this.array1.length + this.array2.length;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\ArrayUtils$CompositeUnmodifiableArrayList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */