package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.JavaVersion;
import me.rerere.matrix.thirdparty.com.google.gson.internal.PreJava9DateFormatProvider;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.util.ISO8601Utils;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class DefaultDateTypeAdapter extends TypeAdapter {
  private final List dateFormats = new ArrayList();
  
  private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
  
  private final Class dateType;
  
  private static final long a = o3.a(-3736811412013295442L, -5653041963253011551L, null).a(157205488452023L);
  
  public DefaultDateTypeAdapter(int paramInt1, int paramInt2) {
    this(Date.class, paramInt1, paramInt2);
  }
  
  public DefaultDateTypeAdapter(Class paramClass, int paramInt1, int paramInt2) {
    this.dateType = verifyDateType(paramClass);
    this.dateFormats.add(DateFormat.getDateTimeInstance(paramInt1, paramInt2, Locale.US));
    if (!Locale.getDefault().equals(Locale.US))
      this.dateFormats.add(DateFormat.getDateTimeInstance(paramInt1, paramInt2)); 
    try {
      if (JavaVersion.isJava9OrLater())
        this.dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(paramInt1, paramInt2)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public DefaultDateTypeAdapter(Class paramClass, int paramInt) {
    this.dateType = verifyDateType(paramClass);
    this.dateFormats.add(DateFormat.getDateInstance(paramInt, Locale.US));
    if (!Locale.getDefault().equals(Locale.US))
      this.dateFormats.add(DateFormat.getDateInstance(paramInt)); 
    try {
      if (JavaVersion.isJava9OrLater())
        this.dateFormats.add(PreJava9DateFormatProvider.getUSDateFormat(paramInt)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public DefaultDateTypeAdapter(Class paramClass, String paramString) {
    this.dateType = verifyDateType(paramClass);
    this.dateFormats.add(new SimpleDateFormat(paramString, Locale.US));
    if (!Locale.getDefault().equals(Locale.US))
      this.dateFormats.add(new SimpleDateFormat(paramString)); 
  }
  
  public String toString() {
    long l = a ^ 0x17CD9382656FL;
    DateFormat dateFormat = this.dateFormats.get(0);
    try {
      if (dateFormat instanceof SimpleDateFormat)
        return "DefaultDateTypeAdapter(" + ((SimpleDateFormat)dateFormat).toPattern() + ')'; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
  }
  
  public Date read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Date date = deserializeToDate(paramJsonReader.nextString());
    try {
      if (this.dateType == Date.class)
        return date; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.dateType == Timestamp.class)
        return new Timestamp(date.getTime()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.dateType == Date.class)
        return new Date(date.getTime()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new AssertionError();
  }
  
  public DefaultDateTypeAdapter(Class paramClass) {
    this.dateType = verifyDateType(paramClass);
    this.dateFormats.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
    if (!Locale.getDefault().equals(Locale.US))
      this.dateFormats.add(DateFormat.getDateTimeInstance(2, 2)); 
    try {
      if (JavaVersion.isJava9OrLater())
        this.dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void write(JsonWriter paramJsonWriter, Date paramDate) throws IOException {
    try {
      if (paramDate == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    synchronized (this.dateFormats) {
      String str = ((DateFormat)this.dateFormats.get(0)).format(paramDate);
      paramJsonWriter.value(str);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\DefaultDateTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */