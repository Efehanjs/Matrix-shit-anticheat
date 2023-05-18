package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.LinkedTreeMap;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class ObjectTypeAdapter extends TypeAdapter {
  public static final TypeAdapterFactory FACTORY = new ObjectTypeAdapter$1();
  
  private final Gson gson;
  
  public Object read(JsonReader paramJsonReader) throws IOException {
    ArrayList<Object> arrayList;
    LinkedTreeMap<String, Object> linkedTreeMap;
    JsonToken jsonToken = paramJsonReader.peek();
    switch (ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
      case 1:
        arrayList = new ArrayList();
        paramJsonReader.beginArray();
        try {
          while (paramJsonReader.hasNext())
            arrayList.add(read(paramJsonReader)); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        paramJsonReader.endArray();
        return arrayList;
      case 2:
        linkedTreeMap = new LinkedTreeMap();
        paramJsonReader.beginObject();
        try {
          while (paramJsonReader.hasNext())
            linkedTreeMap.put(paramJsonReader.nextName(), read(paramJsonReader)); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        paramJsonReader.endObject();
        return linkedTreeMap;
      case 3:
        return paramJsonReader.nextString();
      case 4:
        return Double.valueOf(paramJsonReader.nextDouble());
      case 5:
        return Boolean.valueOf(paramJsonReader.nextBoolean());
      case 6:
        paramJsonReader.nextNull();
        return null;
    } 
    throw new IllegalStateException();
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
    try {
      if (paramObject == null) {
        paramJsonWriter.nullValue();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    TypeAdapter typeAdapter = this.gson.getAdapter(paramObject.getClass());
    try {
      if (typeAdapter instanceof ObjectTypeAdapter) {
        paramJsonWriter.beginObject();
        paramJsonWriter.endObject();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    typeAdapter.write(paramJsonWriter, paramObject);
  }
  
  public ObjectTypeAdapter(Gson paramGson) {
    this.gson = paramGson;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ObjectTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */