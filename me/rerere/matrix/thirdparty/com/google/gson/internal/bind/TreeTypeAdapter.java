package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.JsonDeserializer;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSerializer;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Streams;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TreeTypeAdapter extends TypeAdapter {
  private final TypeToken typeToken;
  
  private final JsonSerializer serializer;
  
  private final JsonDeserializer deserializer;
  
  public final Gson gson;
  
  private final TreeTypeAdapter$GsonContextImpl context = new TreeTypeAdapter$GsonContextImpl(this, null);
  
  private TypeAdapter delegate;
  
  private final TypeAdapterFactory skipPast;
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    try {
      if (this.deserializer == null)
        return delegate().read(paramJsonReader); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    JsonElement jsonElement = Streams.parse(paramJsonReader);
    try {
      if (jsonElement.isJsonNull())
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.deserializer.deserialize(jsonElement, this.typeToken.getType(), this.context);
  }
  
  public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken paramTypeToken, Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (paramTypeToken.getType() == paramTypeToken.getRawType()) ? true : false;
    return new TreeTypeAdapter$SingleTypeFactory(paramObject, paramTypeToken, bool, null);
  }
  
  public TreeTypeAdapter(JsonSerializer paramJsonSerializer, JsonDeserializer paramJsonDeserializer, Gson paramGson, TypeToken paramTypeToken, TypeAdapterFactory paramTypeAdapterFactory) {
    this.serializer = paramJsonSerializer;
    this.deserializer = paramJsonDeserializer;
    this.gson = paramGson;
    this.typeToken = paramTypeToken;
    this.skipPast = paramTypeAdapterFactory;
  }
  
  public static TypeAdapterFactory newFactory(TypeToken paramTypeToken, Object paramObject) {
    return new TreeTypeAdapter$SingleTypeFactory(paramObject, paramTypeToken, false, null);
  }
  
  public static TypeAdapterFactory newTypeHierarchyFactory(Class paramClass, Object paramObject) {
    return new TreeTypeAdapter$SingleTypeFactory(paramObject, null, false, paramClass);
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (this.serializer == null) {
        delegate().write(paramJsonWriter, paramObject);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramObject == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    JsonElement jsonElement = this.serializer.serialize(paramObject, this.typeToken.getType(), this.context);
    Streams.write(jsonElement, paramJsonWriter);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TreeTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */