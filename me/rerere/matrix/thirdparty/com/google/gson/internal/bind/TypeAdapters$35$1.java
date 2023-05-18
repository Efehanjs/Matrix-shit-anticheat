package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public class TypeAdapters$35$1 extends TypeAdapter {
  private static final long a = o3.a(2176705381778854150L, -3529218151725681272L, null).a(63437814334611L);
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x79EB73421044L;
    Object object = typeAdapter.read(paramJsonReader);
    try {
      if (object != null)
        try {
          if (!requestedType.isInstance(object))
            throw new JsonSyntaxException("Expected a " + requestedType.getName() + " but was " + object.getClass().getName()); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return object;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    typeAdapter.write(paramJsonWriter, paramObject);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$35$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */