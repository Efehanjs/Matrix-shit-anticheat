package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ObjectConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class CollectionTypeAdapterFactory$Adapter extends TypeAdapter {
  private final ObjectConstructor constructor;
  
  private final TypeAdapter elementTypeAdapter;
  
  public void write(JsonWriter paramJsonWriter, Collection paramCollection) throws IOException {
    try {
      if (paramCollection == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.beginArray();
    for (Object object : paramCollection)
      this.elementTypeAdapter.write(paramJsonWriter, object); 
    paramJsonWriter.endArray();
  }
  
  public Collection read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Collection<Object> collection = (Collection)this.constructor.construct();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      Object object = this.elementTypeAdapter.read(paramJsonReader);
      collection.add(object);
    } 
    paramJsonReader.endArray();
    return collection;
  }
  
  public CollectionTypeAdapterFactory$Adapter(Gson paramGson, Type paramType, TypeAdapter paramTypeAdapter, ObjectConstructor paramObjectConstructor) {
    this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(paramGson, paramTypeAdapter, paramType);
    this.constructor = paramObjectConstructor;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\CollectionTypeAdapterFactory$Adapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */