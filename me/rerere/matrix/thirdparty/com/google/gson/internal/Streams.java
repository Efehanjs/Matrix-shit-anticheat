package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonIOException;
import me.rerere.matrix.thirdparty.com.google.gson.JsonNull;
import me.rerere.matrix.thirdparty.com.google.gson.JsonParseException;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.TypeAdapters;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.MalformedJsonException;

public final class Streams {
  public static Writer writerForAppendable(Appendable paramAppendable) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramAppendable instanceof Writer) ? (Writer)paramAppendable : new Streams$AppendableWriter(paramAppendable);
  }
  
  public static void write(JsonElement paramJsonElement, JsonWriter paramJsonWriter) throws IOException {
    TypeAdapters.JSON_ELEMENT.write(paramJsonWriter, paramJsonElement);
  }
  
  public static JsonElement parse(JsonReader paramJsonReader) throws JsonParseException {
    boolean bool = true;
    try {
      paramJsonReader.peek();
      bool = false;
      return (JsonElement)TypeAdapters.JSON_ELEMENT.read(paramJsonReader);
    } catch (EOFException eOFException) {
      try {
        if (bool)
          return (JsonElement)JsonNull.INSTANCE; 
      } catch (EOFException eOFException1) {
        throw a(null);
      } 
      throw new JsonSyntaxException(eOFException);
    } catch (MalformedJsonException malformedJsonException) {
      throw new JsonSyntaxException(malformedJsonException);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } catch (NumberFormatException numberFormatException) {
      throw new JsonSyntaxException(numberFormatException);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\Streams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */