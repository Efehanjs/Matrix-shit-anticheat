package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Field;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class ReflectiveTypeAdapterFactory$1 extends ReflectiveTypeAdapterFactory$BoundField {
  public void read(JsonReader paramJsonReader, Object paramObject) throws IOException, IllegalAccessException {
    Object object = typeAdapter.read(paramJsonReader);
    try {
      if (object == null) {
        try {
          if (!isPrimitive) {
            field.set(paramObject, object);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    field.set(paramObject, object);
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException, IllegalAccessException {
    Object object = field.get(paramObject);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    TypeAdapter typeAdapter = jsonAdapterPresent ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType());
    typeAdapter.write(paramJsonWriter, object);
  }
  
  public ReflectiveTypeAdapterFactory$1(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramString, paramBoolean1, paramBoolean2);
  }
  
  public boolean writeField(Object paramObject) throws IOException, IllegalAccessException {
    try {
      if (!this.serialized)
        return false; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object = field.get(paramObject);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (object != paramObject);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */