package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.JavaVersion;
import me.rerere.matrix.thirdparty.com.google.gson.internal.PreJava9DateFormatProvider;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.util.ISO8601Utils;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class DateTypeAdapter extends TypeAdapter {
  public static final TypeAdapterFactory FACTORY = new DateTypeAdapter$1();
  
  private final List dateFormats = new ArrayList();
  
  public Date read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return deserializeToDate(paramJsonReader.nextString());
  }
  
  public DateTypeAdapter() {
    this.dateFormats.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
    if (!Locale.getDefault().equals(Locale.US))
      this.dateFormats.add(DateFormat.getDateTimeInstance(2, 2)); 
    try {
      if (JavaVersion.isJava9OrLater())
        this.dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2)); 
    } catch (JsonSyntaxException jsonSyntaxException) {
      throw a(null);
    } 
  }
  
  public synchronized void write(JsonWriter paramJsonWriter, Date paramDate) throws IOException {
    try {
      if (paramDate == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = ((DateFormat)this.dateFormats.get(0)).format(paramDate);
    paramJsonWriter.value(str);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\DateTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */