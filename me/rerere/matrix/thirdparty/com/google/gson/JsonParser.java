package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Streams;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.MalformedJsonException;

public final class JsonParser {
  private static final long a = o3.a(5766700449254010080L, 2212457589302301308L, null).a(17906437571759L);
  
  public JsonElement parse(JsonReader paramJsonReader) throws JsonIOException, JsonSyntaxException {
    long l = a ^ 0x164F6536E718L;
    boolean bool = paramJsonReader.isLenient();
    paramJsonReader.setLenient(true);
    try {
      return Streams.parse(paramJsonReader);
    } catch (StackOverflowError stackOverflowError) {
      throw new JsonParseException("Failed parsing JSON source: " + paramJsonReader + " to Json", stackOverflowError);
    } catch (OutOfMemoryError outOfMemoryError) {
      throw new JsonParseException("Failed parsing JSON source: " + paramJsonReader + " to Json", outOfMemoryError);
    } finally {
      paramJsonReader.setLenient(bool);
    } 
  }
  
  public JsonElement parse(String paramString) throws JsonSyntaxException {
    return parse(new StringReader(paramString));
  }
  
  public JsonElement parse(Reader paramReader) throws JsonIOException, JsonSyntaxException {
    long l = a ^ 0x50885A11AE75L;
    try {
      JsonReader jsonReader = new JsonReader(paramReader);
      JsonElement jsonElement = parse(jsonReader);
      try {
        if (!jsonElement.isJsonNull())
          try {
            if (jsonReader.peek() != JsonToken.END_DOCUMENT)
              throw new JsonSyntaxException("Did not consume the entire document."); 
          } catch (MalformedJsonException malformedJsonException) {
            throw a(null);
          }  
      } catch (MalformedJsonException malformedJsonException) {
        throw a(null);
      } 
      return jsonElement;
    } catch (MalformedJsonException malformedJsonException) {
      throw new JsonSyntaxException(malformedJsonException);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } catch (NumberFormatException numberFormatException) {
      throw new JsonSyntaxException(numberFormatException);
    } 
  }
  
  private static MalformedJsonException a(MalformedJsonException paramMalformedJsonException) {
    return paramMalformedJsonException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\JsonParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */