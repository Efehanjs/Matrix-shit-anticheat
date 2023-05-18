package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonIOException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$22 extends TypeAdapter {
  private static final long a = o3.a(-5943867642331841010L, -8279961434391021781L, null).a(70151492295660L);
  
  public URI read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x1D112613EE18L;
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      String str = paramJsonReader.nextString();
      try {
      
      } catch (URISyntaxException uRISyntaxException) {
        throw a(null);
      } 
      return "null".equals(str) ? null : new URI(str);
    } catch (URISyntaxException uRISyntaxException) {
      throw new JsonIOException(uRISyntaxException);
    } 
  }
  
  public void write(JsonWriter paramJsonWriter, URI paramURI) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramURI == null) ? null : paramURI.toASCIIString());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */