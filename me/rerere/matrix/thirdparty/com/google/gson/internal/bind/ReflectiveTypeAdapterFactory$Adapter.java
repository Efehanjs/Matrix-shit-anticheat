package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Map;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ObjectConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class ReflectiveTypeAdapterFactory$Adapter extends TypeAdapter {
  private final ObjectConstructor constructor;
  
  private final Map boundFields;
  
  public ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor paramObjectConstructor, Map paramMap) {
    this.constructor = paramObjectConstructor;
    this.boundFields = paramMap;
  }
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Object object = this.constructor.construct();
    try {
      paramJsonReader.beginObject();
      while (true) {
        if (paramJsonReader.hasNext()) {
          String str = paramJsonReader.nextName();
          ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField = (ReflectiveTypeAdapterFactory$BoundField)this.boundFields.get(str);
          try {
            if (reflectiveTypeAdapterFactory$BoundField != null) {
              try {
                if (reflectiveTypeAdapterFactory$BoundField.deserialized) {
                  reflectiveTypeAdapterFactory$BoundField.read(paramJsonReader, object);
                  continue;
                } 
                paramJsonReader.skipValue();
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              continue;
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } else {
          break;
        } 
        paramJsonReader.skipValue();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw new JsonSyntaxException(illegalStateException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError(illegalAccessException);
    } 
    paramJsonReader.endObject();
    return object;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (paramObject == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    paramJsonWriter.beginObject();
    try {
      for (ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField : this.boundFields.values()) {
        try {
          if (reflectiveTypeAdapterFactory$BoundField.writeField(paramObject)) {
            paramJsonWriter.name(reflectiveTypeAdapterFactory$BoundField.name);
            reflectiveTypeAdapterFactory$BoundField.write(paramJsonWriter, paramObject);
          } 
        } catch (IllegalAccessException illegalAccessException) {
          throw a(null);
        } 
      } 
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError(illegalAccessException);
    } 
    paramJsonWriter.endObject();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$Adapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */