package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class Gson$3 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
    try {
      if (paramNumber == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value(paramNumber.toString());
  }
  
  public Number read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Long.valueOf(paramJsonReader.nextLong());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\Gson$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */