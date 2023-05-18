package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class SqlDateTypeAdapter extends TypeAdapter {
  public static final TypeAdapterFactory FACTORY;
  
  private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");
  
  private static final long a = o3.a(-5105286083591398512L, 7762344581096988735L, null).a(155281600758014L);
  
  static {
    FACTORY = new SqlDateTypeAdapter$1();
  }
  
  public synchronized Date read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (ParseException parseException) {
      throw a(null);
    } 
    try {
      long l = this.format.parse(paramJsonReader.nextString()).getTime();
      return new Date(l);
    } catch (ParseException parseException) {
      throw new JsonSyntaxException(parseException);
    } 
  }
  
  public synchronized void write(JsonWriter paramJsonWriter, Date paramDate) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramDate == null) ? null : this.format.format(paramDate));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\SqlDateTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */