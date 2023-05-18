package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;

public abstract class UnsafeAllocator {
  private static final long a = o3.a(1160220318487053455L, 2857741923728542263L, null).a(110920065278366L);
  
  public static UnsafeAllocator create() {
    long l = a ^ 0x23FE52182BF0L;
    try {
      Class<?> clazz = Class.forName("sun.misc.Unsafe");
      Field field = clazz.getDeclaredField("theUnsafe");
      field.setAccessible(true);
      Object object = field.get(null);
      Method method = clazz.getMethod("allocateInstance", new Class[] { Class.class });
      return new UnsafeAllocator$1(method, object);
    } catch (Exception exception) {
      try {
        (new Class[1])[0] = Class.class;
        "getConstructorId";
        Method method1 = ObjectStreamClass.class.getDeclaredMethod(av.b("getConstructorId", ObjectStreamClass.class, new Class[1]), new Class[1]);
        method1.setAccessible(true);
        int i = ((Integer)method1.invoke(null, new Object[] { Object.class })).intValue();
        (new Class[2])[0] = Class.class;
        (new Class[2])[1] = int.class;
        "newInstance";
        Method method2 = ObjectStreamClass.class.getDeclaredMethod(av.b("newInstance", ObjectStreamClass.class, new Class[2]), new Class[2]);
        method2.setAccessible(true);
        return new UnsafeAllocator$2(method2, i);
      } catch (Exception exception1) {
        try {
          (new Class[2])[0] = Class.class;
          (new Class[2])[1] = Class.class;
          "newInstance";
          Method method = ObjectInputStream.class.getDeclaredMethod(av.b("newInstance", ObjectInputStream.class, new Class[2]), new Class[2]);
          method.setAccessible(true);
          return new UnsafeAllocator$3(method);
        } catch (Exception exception2) {
          return new UnsafeAllocator$4();
        } 
      } 
    } 
  }
  
  public static void assertInstantiable(Class paramClass) {
    long l = a ^ 0x3AF9F17EAEFFL;
    int i = paramClass.getModifiers();
    try {
      if (Modifier.isInterface(i))
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + paramClass.getName()); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (Modifier.isAbstract(i))
        throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + paramClass.getName()); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public abstract Object newInstance(Class paramClass) throws Exception;
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\UnsafeAllocator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */