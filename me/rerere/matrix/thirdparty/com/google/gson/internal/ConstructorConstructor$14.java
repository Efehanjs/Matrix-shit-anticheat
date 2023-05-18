package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Type;
import me.rerere.matrix.internal.o3;

public class ConstructorConstructor$14 implements ObjectConstructor {
  private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
  
  private static final long a = o3.a(8113223279112580008L, 6200832865557059144L, null).a(253641703380099L);
  
  public Object construct() {
    long l = a ^ 0x5ED36E07BAD3L;
    try {
      return this.unsafeAllocator.newInstance(rawType);
    } catch (Exception exception) {
      throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", exception);
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\ConstructorConstructor$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */