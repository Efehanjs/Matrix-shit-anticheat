package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$27 extends TypeAdapter {
  private static final String MINUTE = "minute";
  
  private static final String HOUR_OF_DAY = "hourOfDay";
  
  private static final String DAY_OF_MONTH = "dayOfMonth";
  
  private static final String YEAR = "year";
  
  private static final String SECOND = "second";
  
  private static final String MONTH = "month";
  
  private static final long a = o3.a(2319436074822023199L, 5091942931041369910L, null).a(150963350325738L);
  
  public Calendar read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x660157DF355DL;
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonReader.beginObject();
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    while (paramJsonReader.peek() != JsonToken.END_OBJECT) {
      String str = paramJsonReader.nextName();
      int i2 = paramJsonReader.nextInt();
      if ("year".equals(str)) {
        i = i2;
        continue;
      } 
      if ("month".equals(str)) {
        j = i2;
        continue;
      } 
      if ("dayOfMonth".equals(str)) {
        k = i2;
        continue;
      } 
      if ("hourOfDay".equals(str)) {
        m = i2;
        continue;
      } 
      if ("minute".equals(str)) {
        n = i2;
        continue;
      } 
      if ("second".equals(str))
        i1 = i2; 
    } 
    paramJsonReader.endObject();
    return new GregorianCalendar(i, j, k, m, n, i1);
  }
  
  public void write(JsonWriter paramJsonWriter, Calendar paramCalendar) throws IOException {
    long l = a ^ 0x50D455EFB3C5L;
    try {
      if (paramCalendar == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.beginObject();
    paramJsonWriter.name("year");
    paramJsonWriter.value(paramCalendar.get(1));
    paramJsonWriter.name("month");
    paramJsonWriter.value(paramCalendar.get(2));
    paramJsonWriter.name("dayOfMonth");
    paramJsonWriter.value(paramCalendar.get(5));
    paramJsonWriter.name("hourOfDay");
    paramJsonWriter.value(paramCalendar.get(11));
    paramJsonWriter.name("minute");
    paramJsonWriter.value(paramCalendar.get(12));
    paramJsonWriter.name("second");
    paramJsonWriter.value(paramCalendar.get(13));
    paramJsonWriter.endObject();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$27.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */