package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$8 extends TypeAdapter {
  public AtomicInteger read(JsonReader paramJsonReader) throws IOException {
    try {
      return new AtomicInteger(paramJsonReader.nextInt());
    } catch (NumberFormatException numberFormatException) {
      throw new JsonSyntaxException(numberFormatException);
    } 
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicInteger paramAtomicInteger) throws IOException {
    paramJsonWriter.value(paramAtomicInteger.get());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */