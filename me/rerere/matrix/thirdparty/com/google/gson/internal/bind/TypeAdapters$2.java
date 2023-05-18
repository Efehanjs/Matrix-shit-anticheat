package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.BitSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$2 extends TypeAdapter {
  private static final long a = o3.a(-5294464488010855002L, 155693436500066360L, null).a(70913152688915L);
  
  public void write(JsonWriter paramJsonWriter, BitSet paramBitSet) throws IOException {
    paramJsonWriter.beginArray();
    byte b = 0;
    int i = paramBitSet.length();
    while (true) {
      try {
        if (b < i) {
          try {
          
          } catch (IOException iOException) {
            throw a(null);
          } 
          boolean bool = paramBitSet.get(b) ? true : false;
          paramJsonWriter.value(bool);
          b++;
          continue;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramJsonWriter.endArray();
      return;
    } 
  }
  
  public BitSet read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0x31CF342E4026L;
    BitSet bitSet = new BitSet();
    paramJsonReader.beginArray();
    byte b = 0;
    JsonToken jsonToken = paramJsonReader.peek();
    while (true) {
      try {
        if (jsonToken != JsonToken.END_ARRAY) {
          boolean bool;
          try {
            String str;
            switch (TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
              case 1:
                try {
                
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                } 
                bool = (paramJsonReader.nextInt() != 0);
                break;
              case 2:
                bool = paramJsonReader.nextBoolean();
                break;
              case 3:
                str = paramJsonReader.nextString();
                try {
                  try {
                  
                  } catch (NumberFormatException numberFormatException) {
                    throw a(null);
                  } 
                  bool = (Integer.parseInt(str) != 0);
                } catch (NumberFormatException numberFormatException) {
                  throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + str);
                } 
                break;
              default:
                throw new JsonSyntaxException("Invalid bitset value type: " + jsonToken);
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          try {
            if (bool)
              bitSet.set(b); 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          b++;
          jsonToken = paramJsonReader.peek();
          continue;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      paramJsonReader.endArray();
      return bitSet;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */