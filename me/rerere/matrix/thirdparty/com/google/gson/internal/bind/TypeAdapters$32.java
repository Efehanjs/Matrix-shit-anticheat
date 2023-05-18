package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters$32 implements TypeAdapterFactory {
  private static final long a = o3.a(-2873371254608364158L, -2653698739751074090L, null).a(25525848954919L);
  
  public String toString() {
    long l = a ^ 0x2868467F6642L;
    return "Factory[type=" + type.getName() + ",adapter=" + typeAdapter + "]";
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramTypeToken.getRawType() == type) ? typeAdapter : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */