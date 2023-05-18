package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonArray;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonNull;
import me.rerere.matrix.thirdparty.com.google.gson.JsonObject;
import me.rerere.matrix.thirdparty.com.google.gson.JsonPrimitive;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.LazilyParsedNumber;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$29 extends TypeAdapter {
  private static final long a = o3.a(6852516285753322740L, -2586751986859360427L, null).a(167401017137148L);
  
  public void write(JsonWriter paramJsonWriter, JsonElement paramJsonElement) throws IOException {
    long l = a ^ 0x5440385F7D0FL;
    try {
      if (paramJsonElement != null) {
        try {
          if (paramJsonElement.isJsonNull()) {
            paramJsonWriter.nullValue();
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        if (paramJsonElement.isJsonPrimitive()) {
          JsonPrimitive jsonPrimitive = paramJsonElement.getAsJsonPrimitive();
          try {
            if (jsonPrimitive.isNumber()) {
              paramJsonWriter.value(jsonPrimitive.getAsNumber());
            } else {
              try {
                if (jsonPrimitive.isBoolean()) {
                  paramJsonWriter.value(jsonPrimitive.getAsBoolean());
                } else {
                  paramJsonWriter.value(jsonPrimitive.getAsString());
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } else if (paramJsonElement.isJsonArray()) {
          paramJsonWriter.beginArray();
          for (JsonElement jsonElement : paramJsonElement.getAsJsonArray())
            write(paramJsonWriter, jsonElement); 
          paramJsonWriter.endArray();
        } else if (paramJsonElement.isJsonObject()) {
          paramJsonWriter.beginObject();
          for (Map.Entry entry : paramJsonElement.getAsJsonObject().entrySet()) {
            paramJsonWriter.name((String)entry.getKey());
            write(paramJsonWriter, (JsonElement)entry.getValue());
          } 
          paramJsonWriter.endObject();
        } else {
          throw new IllegalArgumentException("Couldn't write " + paramJsonElement.getClass());
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.nullValue();
  }
  
  public JsonElement read(JsonReader paramJsonReader) throws IOException {
    try {
      String str;
      JsonArray jsonArray;
      JsonObject jsonObject;
      switch (TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()]) {
        case 3:
          return (JsonElement)new JsonPrimitive(paramJsonReader.nextString());
        case 1:
          str = paramJsonReader.nextString();
          return (JsonElement)new JsonPrimitive((Number)new LazilyParsedNumber(str));
        case 2:
          return (JsonElement)new JsonPrimitive(Boolean.valueOf(paramJsonReader.nextBoolean()));
        case 4:
          paramJsonReader.nextNull();
          return (JsonElement)JsonNull.INSTANCE;
        case 5:
          jsonArray = new JsonArray();
          paramJsonReader.beginArray();
          try {
            while (paramJsonReader.hasNext())
              jsonArray.add(read(paramJsonReader)); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          paramJsonReader.endArray();
          return (JsonElement)jsonArray;
        case 6:
          jsonObject = new JsonObject();
          paramJsonReader.beginObject();
          try {
            while (paramJsonReader.hasNext())
              jsonObject.add(paramJsonReader.nextName(), read(paramJsonReader)); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          paramJsonReader.endObject();
          return (JsonElement)jsonObject;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new IllegalArgumentException();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$29.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */