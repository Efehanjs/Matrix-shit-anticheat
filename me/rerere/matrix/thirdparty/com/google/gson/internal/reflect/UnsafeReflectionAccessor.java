package me.rerere.matrix.thirdparty.com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonIOException;

public final class UnsafeReflectionAccessor extends ReflectionAccessor {
  private final Field overrideField = getOverrideField();
  
  private static Class unsafeClass;
  
  private final Object theUnsafe = getUnsafeInstance();
  
  private static final long a = o3.a(196083609671884549L, 4545320217143479377L, null).a(139577696750356L);
  
  public boolean makeAccessibleWithUnsafe(AccessibleObject paramAccessibleObject) {
    long l = a ^ 0x26EA48AE170CL;
    try {
      if (this.theUnsafe != null && this.overrideField != null)
        try {
          (new Class[1])[0] = Field.class;
          "objectFieldOffset";
          Method method1 = unsafeClass.getMethod(av.b("objectFieldOffset", unsafeClass, new Class[1]), new Class[1]);
          long l1 = ((Long)method1.invoke(this.theUnsafe, new Object[] { this.overrideField })).longValue();
          (new Class[3])[0] = Object.class;
          (new Class[3])[1] = long.class;
          (new Class[3])[2] = boolean.class;
          "putBoolean";
          Method method2 = unsafeClass.getMethod(av.b("putBoolean", unsafeClass, new Class[3]), new Class[3]);
          method2.invoke(this.theUnsafe, new Object[] { paramAccessibleObject, Long.valueOf(l1), Boolean.valueOf(true) });
          return true;
        } catch (Exception exception) {} 
    } catch (Exception exception) {
      throw a(null);
    } 
    return false;
  }
  
  public void makeAccessible(AccessibleObject paramAccessibleObject) {
    long l = a ^ 0x7D3CC0D256E4L;
    boolean bool = makeAccessibleWithUnsafe(paramAccessibleObject);
    try {
      if (!bool)
        try {
          paramAccessibleObject.setAccessible(true);
        } catch (SecurityException securityException) {
          throw new JsonIOException("Gson couldn't modify fields for " + paramAccessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", securityException);
        }  
    } catch (JsonIOException jsonIOException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\reflect\UnsafeReflectionAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */