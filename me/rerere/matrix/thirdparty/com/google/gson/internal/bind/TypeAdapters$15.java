package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$15 extends TypeAdapter {
  private static final long a = o3.a(-8899084377631016399L, 3330658029225633731L, null).a(42259753101731L);
  
  public Character read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x68F0F6859AFEL;
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = paramJsonReader.nextString();
    try {
      if (str.length() != 1)
        throw new JsonSyntaxException("Expecting character, got: " + str); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Character.valueOf(str.charAt(0));
  }
  
  public void write(JsonWriter paramJsonWriter, Character paramCharacter) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramCharacter == null) ? null : String.valueOf(paramCharacter));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */