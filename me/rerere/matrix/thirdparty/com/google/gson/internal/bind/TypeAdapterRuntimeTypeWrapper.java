package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapterRuntimeTypeWrapper extends TypeAdapter {
  private final TypeAdapter delegate;
  
  private final Gson context;
  
  private final Type type;
  
  public TypeAdapterRuntimeTypeWrapper(Gson paramGson, TypeAdapter paramTypeAdapter, Type paramType) {
    this.context = paramGson;
    this.delegate = paramTypeAdapter;
    this.type = paramType;
  }
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    return this.delegate.read(paramJsonReader);
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    TypeAdapter typeAdapter = this.delegate;
    Type type = getRuntimeTypeIfMoreSpecific(this.type, paramObject);
    if (type != this.type) {
      TypeAdapter typeAdapter1 = this.context.getAdapter(TypeToken.get(type));
      if (!(typeAdapter1 instanceof ReflectiveTypeAdapterFactory$Adapter)) {
        typeAdapter = typeAdapter1;
      } else if (!(this.delegate instanceof ReflectiveTypeAdapterFactory$Adapter)) {
        typeAdapter = this.delegate;
      } else {
        typeAdapter = typeAdapter1;
      } 
    } 
    typeAdapter.write(paramJsonWriter, paramObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapterRuntimeTypeWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */