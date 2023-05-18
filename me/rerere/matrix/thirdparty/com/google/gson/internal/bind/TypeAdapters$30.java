package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters$30 implements TypeAdapterFactory {
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Class<?> clazz = paramTypeToken.getRawType();
    try {
      if (Enum.class.isAssignableFrom(clazz))
        try {
          if (clazz != Enum.class) {
            if (!clazz.isEnum())
              clazz = clazz.getSuperclass(); 
            return new TypeAdapters$EnumTypeAdapter(clazz);
          } 
          return null;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */