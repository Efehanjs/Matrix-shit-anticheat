package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class Gson$4 extends TypeAdapter {
  public AtomicLong read(JsonReader paramJsonReader) throws IOException {
    Number number = (Number)longAdapter.read(paramJsonReader);
    return new AtomicLong(number.longValue());
  }
  
  public void write(JsonWriter paramJsonWriter, AtomicLong paramAtomicLong) throws IOException {
    longAdapter.write(paramJsonWriter, Long.valueOf(paramAtomicLong.get()));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\Gson$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */