package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class Gson$FutureTypeAdapter extends TypeAdapter {
  private TypeAdapter delegate;
  
  public void setDelegate(TypeAdapter paramTypeAdapter) {
    try {
      if (this.delegate != null)
        throw new AssertionError(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.delegate = paramTypeAdapter;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (this.delegate == null)
        throw new IllegalStateException(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.delegate.write(paramJsonWriter, paramObject);
  }
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    try {
      if (this.delegate == null)
        throw new IllegalStateException(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.delegate.read(paramJsonReader);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\Gson$FutureTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */