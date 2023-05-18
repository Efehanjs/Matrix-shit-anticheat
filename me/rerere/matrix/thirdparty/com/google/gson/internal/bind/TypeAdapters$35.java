package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters$35 implements TypeAdapterFactory {
  private static final long a = o3.a(-7518995676268623265L, -7630398318896149381L, null).a(221960061147037L);
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Class<?> clazz = paramTypeToken.getRawType();
    try {
      if (!clazz.isAssignableFrom(clazz))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new TypeAdapters$35$1(this, clazz);
  }
  
  public String toString() {
    long l = a ^ 0x35DC24BF22D4L;
    return "Factory[typeHierarchy=" + clazz.getName() + ",adapter=" + typeAdapter + "]";
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$35.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */