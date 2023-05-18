package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters$33 implements TypeAdapterFactory {
  private static final long a = o3.a(-3156714168297960230L, -6554922027043331602L, null).a(202813286322444L);
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Class clazz = paramTypeToken.getRawType();
    try {
      if (clazz != unboxed) {
        try {
          if (clazz == boxed);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String toString() {
    long l = a ^ 0x56CFF8D7EA5CL;
    return "Factory[type=" + boxed.getName() + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]";
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$33.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */