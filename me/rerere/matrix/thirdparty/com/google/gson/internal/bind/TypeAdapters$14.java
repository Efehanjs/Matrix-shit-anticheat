package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.LazilyParsedNumber;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$14 extends TypeAdapter {
  private static final long a = o3.a(-5575739299001058474L, -6520215812277075871L, null).a(123354871662888L);
  
  public Number read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x301DA57883D0L;
    JsonToken jsonToken = paramJsonReader.peek();
    try {
      switch (TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
        case 4:
          paramJsonReader.nextNull();
          return null;
        case 1:
        case 3:
          return (Number)new LazilyParsedNumber(paramJsonReader.nextString());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new JsonSyntaxException("Expecting number, got: " + jsonToken);
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
    paramJsonWriter.value(paramNumber);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */