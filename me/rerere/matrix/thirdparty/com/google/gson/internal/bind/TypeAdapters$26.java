package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.sql.Timestamp;
import java.util.Date;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters$26 implements TypeAdapterFactory {
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    try {
      if (paramTypeToken.getRawType() != Timestamp.class)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    TypeAdapter typeAdapter = paramGson.getAdapter(Date.class);
    return new TypeAdapters$26$1(this, typeAdapter);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$26.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */