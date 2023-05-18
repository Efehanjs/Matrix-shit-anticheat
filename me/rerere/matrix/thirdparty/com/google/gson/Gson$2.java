package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class Gson$2 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
    try {
      if (paramNumber == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    float f = paramNumber.floatValue();
    Gson.checkValidFloatingPoint(f);
    paramJsonWriter.value(paramNumber);
  }
  
  public Float read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Float.valueOf((float)paramJsonReader.nextDouble());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\Gson$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */