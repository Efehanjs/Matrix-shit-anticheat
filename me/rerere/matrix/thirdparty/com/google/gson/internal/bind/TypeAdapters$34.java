package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters$34 implements TypeAdapterFactory {
  private static final long a = o3.a(1313694846232317334L, 8192806702472162771L, null).a(50353934812560L);
  
  public String toString() {
    long l = a ^ 0x7E44C9D3A68AL;
    return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Class clazz = paramTypeToken.getRawType();
    try {
      if (clazz != base) {
        try {
          if (clazz == sub);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$34.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */