package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.lang.reflect.Type;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class ArrayTypeAdapter$1 implements TypeAdapterFactory {
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Type type1 = paramTypeToken.getType();
    try {
      if (!(type1 instanceof java.lang.reflect.GenericArrayType))
        try {
          if (type1 instanceof Class) {
            try {
              if (!((Class)type1).isArray())
                return null; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return null;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Type type2 = .Gson.Types.getArrayComponentType(type1);
    TypeAdapter typeAdapter = paramGson.getAdapter(TypeToken.get(type2));
    return new ArrayTypeAdapter(paramGson, typeAdapter, .Gson.Types.getRawType(type2));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ArrayTypeAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */