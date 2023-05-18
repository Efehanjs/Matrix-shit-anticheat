package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$1 extends TypeAdapter {
  private static final long a = o3.a(437194744760410839L, 7794923729828560895L, null).a(3658918316595L);
  
  public Class read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0xBD681EBBF10L;
    throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
  }
  
  public void write(JsonWriter paramJsonWriter, Class paramClass) throws IOException {
    long l = a ^ 0x49215420A8F5L;
    throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + paramClass.getName() + ". Forgot to register a type adapter?");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */