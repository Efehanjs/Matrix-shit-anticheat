package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class ArrayTypeAdapter extends TypeAdapter {
  private final Class componentType;
  
  public static final TypeAdapterFactory FACTORY = new ArrayTypeAdapter$1();
  
  private final TypeAdapter componentTypeAdapter;
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ArrayList<Object> arrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      Object object1 = this.componentTypeAdapter.read(paramJsonReader);
      arrayList.add(object1);
    } 
    paramJsonReader.endArray();
    int i = arrayList.size();
    Object object = Array.newInstance(this.componentType, i);
    byte b = 0;
    try {
      while (b < i) {
        Array.set(object, b, arrayList.get(b));
        b++;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return object;
  }
  
  public ArrayTypeAdapter(Gson paramGson, TypeAdapter paramTypeAdapter, Class paramClass) {
    this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(paramGson, paramTypeAdapter, paramClass);
    this.componentType = paramClass;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (paramObject == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.beginArray();
    byte b = 0;
    int i = Array.getLength(paramObject);
    while (b < i) {
      Object object = Array.get(paramObject, b);
      this.componentTypeAdapter.write(paramJsonWriter, object);
      b++;
    } 
    paramJsonWriter.endArray();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ArrayTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */