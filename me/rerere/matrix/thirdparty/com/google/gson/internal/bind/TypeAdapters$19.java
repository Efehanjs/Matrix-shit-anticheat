package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$19 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, StringBuilder paramStringBuilder) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramStringBuilder == null) ? null : paramStringBuilder.toString());
  }
  
  public StringBuilder read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new StringBuilder(paramJsonReader.nextString());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$19.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */