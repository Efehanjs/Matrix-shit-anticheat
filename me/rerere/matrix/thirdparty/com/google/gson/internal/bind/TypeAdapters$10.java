package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$10 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, AtomicIntegerArray paramAtomicIntegerArray) throws IOException {
    paramJsonWriter.beginArray();
    byte b = 0;
    int i = paramAtomicIntegerArray.length();
    try {
      while (b < i) {
        paramJsonWriter.value(paramAtomicIntegerArray.get(b));
        b++;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.endArray();
  }
  
  public AtomicIntegerArray read(JsonReader paramJsonReader) throws IOException {
    ArrayList<Integer> arrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      try {
        int j = paramJsonReader.nextInt();
        arrayList.add(Integer.valueOf(j));
      } catch (NumberFormatException numberFormatException) {
        throw new JsonSyntaxException(numberFormatException);
      } 
    } 
    paramJsonReader.endArray();
    int i = arrayList.size();
    AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(i);
    byte b = 0;
    try {
      while (b < i) {
        atomicIntegerArray.set(b, ((Integer)arrayList.get(b)).intValue());
        b++;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return atomicIntegerArray;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */