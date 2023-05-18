package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class Gson$5 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, AtomicLongArray paramAtomicLongArray) throws IOException {
    paramJsonWriter.beginArray();
    byte b = 0;
    int i = paramAtomicLongArray.length();
    try {
      while (b < i) {
        longAdapter.write(paramJsonWriter, Long.valueOf(paramAtomicLongArray.get(b)));
        b++;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.endArray();
  }
  
  public AtomicLongArray read(JsonReader paramJsonReader) throws IOException {
    ArrayList<Long> arrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      long l = ((Number)longAdapter.read(paramJsonReader)).longValue();
      arrayList.add(Long.valueOf(l));
    } 
    paramJsonReader.endArray();
    int i = arrayList.size();
    AtomicLongArray atomicLongArray = new AtomicLongArray(i);
    byte b = 0;
    try {
      while (b < i) {
        atomicLongArray.set(b, ((Long)arrayList.get(b)).longValue());
        b++;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return atomicLongArray;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\Gson$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */