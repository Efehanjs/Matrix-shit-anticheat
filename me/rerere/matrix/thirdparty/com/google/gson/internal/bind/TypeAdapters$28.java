package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$28 extends TypeAdapter {
  public Locale read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str1 = paramJsonReader.nextString();
    StringTokenizer stringTokenizer = new StringTokenizer(str1, "_");
    String str2 = null;
    String str3 = null;
    String str4 = null;
    if (stringTokenizer.hasMoreElements())
      str2 = stringTokenizer.nextToken(); 
    if (stringTokenizer.hasMoreElements())
      str3 = stringTokenizer.nextToken(); 
    if (stringTokenizer.hasMoreElements())
      str4 = stringTokenizer.nextToken(); 
    try {
      if (str3 == null)
        try {
          if (str4 == null)
            return new Locale(str2); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (str4 == null)
        return new Locale(str2, str3); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new Locale(str2, str3, str4);
  }
  
  public void write(JsonWriter paramJsonWriter, Locale paramLocale) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramLocale == null) ? null : paramLocale.toString());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$28.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */