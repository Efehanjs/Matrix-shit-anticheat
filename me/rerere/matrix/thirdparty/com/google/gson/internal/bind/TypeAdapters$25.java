package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Currency;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class TypeAdapters$25 extends TypeAdapter {
  public void write(JsonWriter paramJsonWriter, Currency paramCurrency) throws IOException {
    paramJsonWriter.value(paramCurrency.getCurrencyCode());
  }
  
  public Currency read(JsonReader paramJsonReader) throws IOException {
    return Currency.getInstance(paramJsonReader.nextString());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters$25.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */