package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$16 extends TypeAdapter {
  public String read(JsonReader paramJsonReader) throws IOException {
    JsonToken jsonToken = paramJsonReader.peek();
    try {
      if (jsonToken == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (jsonToken == JsonToken.BOOLEAN)
        return Boolean.toString(paramJsonReader.nextBoolean()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramJsonReader.nextString();
  }
  
  public void write(JsonWriter paramJsonWriter, String paramString) throws IOException {
    paramJsonWriter.value(paramString);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */