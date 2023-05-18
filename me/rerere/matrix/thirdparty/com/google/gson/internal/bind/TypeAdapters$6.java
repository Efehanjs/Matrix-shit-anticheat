package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$6 extends TypeAdapter {
  public Number read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Short.valueOf((short)paramJsonReader.nextInt());
    } catch (NumberFormatException numberFormatException) {
      throw new JsonSyntaxException(numberFormatException);
    } 
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
    paramJsonWriter.value(paramNumber);
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */