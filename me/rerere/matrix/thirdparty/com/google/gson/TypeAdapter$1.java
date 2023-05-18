package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class TypeAdapter$1 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (paramObject == null) {
        paramJsonWriter.nullValue();
      } else {
        TypeAdapter.this.write(paramJsonWriter, paramObject);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return TypeAdapter.this.read(paramJsonReader);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\TypeAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */