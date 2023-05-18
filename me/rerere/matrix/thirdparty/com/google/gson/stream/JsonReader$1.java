package me.rerere.matrix.thirdparty.com.google.gson.stream;

import java.io.IOException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.JsonReaderInternalAccess;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.JsonTreeReader;

public final class JsonReader$1 extends JsonReaderInternalAccess {
  private static final long a = o3.a(146038438247753520L, -558652151614676445L, null).a(28698779787339L);
  
  public void promoteNameToValue(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x6C1C748EBE15L;
    try {
      if (paramJsonReader instanceof JsonTreeReader) {
        ((JsonTreeReader)paramJsonReader).promoteNameToValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = paramJsonReader.peeked;
    if (i == 0)
      i = paramJsonReader.doPeek(); 
    try {
      if (i == 13) {
        paramJsonReader.peeked = 9;
      } else {
        try {
          if (i == 12) {
            paramJsonReader.peeked = 8;
          } else {
            try {
              if (i == 14) {
                paramJsonReader.peeked = 10;
              } else {
                throw new IllegalStateException("Expected a name but was " + paramJsonReader.peek() + paramJsonReader.locationString());
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\stream\JsonReader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */