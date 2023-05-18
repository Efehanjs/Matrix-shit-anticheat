package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$4 extends TypeAdapter {
  private static final long a = o3.a(8982039971189914327L, 2783046178762864471L, null).a(216166216028720L);
  
  public Boolean read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Boolean.valueOf(paramJsonReader.nextString());
  }
  
  public void write(JsonWriter paramJsonWriter, Boolean paramBoolean) throws IOException {
    long l = a ^ 0x3ADC9B94C01L;
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramBoolean == null) ? "null" : paramBoolean.toString());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */