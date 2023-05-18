package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.JsonTreeReader;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.JsonTreeWriter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public abstract class TypeAdapter {
  public final Object fromJson(String paramString) throws IOException {
    return fromJson(new StringReader(paramString));
  }
  
  public final void toJson(Writer paramWriter, Object paramObject) throws IOException {
    JsonWriter jsonWriter = new JsonWriter(paramWriter);
    write(jsonWriter, paramObject);
  }
  
  public final JsonElement toJsonTree(Object paramObject) {
    try {
      JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
      write((JsonWriter)jsonTreeWriter, paramObject);
      return jsonTreeWriter.get();
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } 
  }
  
  public abstract Object read(JsonReader paramJsonReader) throws IOException;
  
  public final Object fromJson(Reader paramReader) throws IOException {
    JsonReader jsonReader = new JsonReader(paramReader);
    return read(jsonReader);
  }
  
  public final String toJson(Object paramObject) {
    StringWriter stringWriter = new StringWriter();
    try {
      toJson(stringWriter, paramObject);
    } catch (IOException iOException) {
      throw new AssertionError(iOException);
    } 
    return stringWriter.toString();
  }
  
  public abstract void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException;
  
  public final Object fromJsonTree(JsonElement paramJsonElement) {
    try {
      JsonTreeReader jsonTreeReader = new JsonTreeReader(paramJsonElement);
      return read((JsonReader)jsonTreeReader);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } 
  }
  
  public final TypeAdapter nullSafe() {
    return new TypeAdapter$1(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\TypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */