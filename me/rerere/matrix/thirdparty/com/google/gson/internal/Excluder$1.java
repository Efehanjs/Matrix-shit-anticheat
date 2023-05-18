package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class Excluder$1 extends TypeAdapter {
  private TypeAdapter delegate;
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    try {
      if (skipDeserialize) {
        paramJsonReader.skipValue();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return delegate().read(paramJsonReader);
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (skipSerialize) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    delegate().write(paramJsonWriter, paramObject);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\Excluder$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */