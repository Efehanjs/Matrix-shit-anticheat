package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URL;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$21 extends TypeAdapter {
  private static final long a = o3.a(4481053453922251625L, -3993705142411609446L, null).a(68349777601560L);
  
  public URL read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x5114077F3CD4L;
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
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return "null".equals(str) ? null : new URL(str);
  }
  
  public void write(JsonWriter paramJsonWriter, URL paramURL) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramURL == null) ? null : paramURL.toExternalForm());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */