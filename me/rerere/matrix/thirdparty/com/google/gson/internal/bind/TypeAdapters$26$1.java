package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class TypeAdapters$26$1 extends TypeAdapter {
  public Timestamp read(JsonReader paramJsonReader) throws IOException {
    Date date = (Date)dateTypeAdapter.read(paramJsonReader);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (date != null) ? new Timestamp(date.getTime()) : null;
  }
  
  public void write(JsonWriter paramJsonWriter, Timestamp paramTimestamp) throws IOException {
    dateTypeAdapter.write(paramJsonWriter, paramTimestamp);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$26$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */