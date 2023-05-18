package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public abstract class ReflectiveTypeAdapterFactory$BoundField {
  public final boolean serialized;
  
  public final String name;
  
  public final boolean deserialized;
  
  public abstract boolean writeField(Object paramObject) throws IOException, IllegalAccessException;
  
  public abstract void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException, IllegalAccessException;
  
  public ReflectiveTypeAdapterFactory$BoundField(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.name = paramString;
    this.serialized = paramBoolean1;
    this.deserialized = paramBoolean2;
  }
  
  public abstract void read(JsonReader paramJsonReader, Object paramObject) throws IOException, IllegalAccessException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$BoundField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */