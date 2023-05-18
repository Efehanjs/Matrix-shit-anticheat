package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$9 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, AtomicBoolean paramAtomicBoolean) throws IOException {
    paramJsonWriter.value(paramAtomicBoolean.get());
  }
  
  public AtomicBoolean read(JsonReader paramJsonReader) throws IOException {
    return new AtomicBoolean(paramJsonReader.nextBoolean());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */