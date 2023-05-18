package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.SerializedName;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$EnumTypeAdapter extends TypeAdapter {
  private final Map constantToName = new HashMap<Object, Object>();
  
  private final Map nameToConstant = new HashMap<Object, Object>();
  
  public Enum read(JsonReader paramJsonReader) throws IOException {
    try {
      if (paramJsonReader.peek() == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Enum)this.nameToConstant.get(paramJsonReader.nextString());
  }
  
  public void write(JsonWriter paramJsonWriter, Enum paramEnum) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramJsonWriter.value((paramEnum == null) ? null : (String)this.constantToName.get(paramEnum));
  }
  
  public TypeAdapters$EnumTypeAdapter(Class<Enum> paramClass) {
    try {
      for (Enum enum_ : (Enum[])paramClass.getEnumConstants()) {
        String str = enum_.name();
        SerializedName serializedName = paramClass.getField(str).<SerializedName>getAnnotation(SerializedName.class);
        if (serializedName != null) {
          str = serializedName.value();
          for (String str1 : serializedName.alternate())
            this.nameToConstant.put(str1, enum_); 
        } 
        this.nameToConstant.put(str, enum_);
        this.constantToName.put(enum_, str);
      } 
    } catch (NoSuchFieldException noSuchFieldException) {
      throw new AssertionError(noSuchFieldException);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$EnumTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */