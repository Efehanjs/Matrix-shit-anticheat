package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TimeTypeAdapter extends TypeAdapter {
  public static final TypeAdapterFactory FACTORY;
  
  private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");
  
  private static final long a = o3.a(-71114501612877207L, 2958898831458044805L, null).a(143855679028286L);
  
  static {
    FACTORY = new TimeTypeAdapter$1();
  }
  
  public synchronized void write(JsonWriter paramJsonWriter, Time paramTime) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramTime == null) ? null : this.format.format(paramTime));
  }
  
  public synchronized Time read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (ParseException parseException) {
      throw a(null);
    } 
    try {
      Date date = this.format.parse(paramJsonReader.nextString());
      return new Time(date.getTime());
    } catch (ParseException parseException) {
      throw new JsonSyntaxException(parseException);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TimeTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */