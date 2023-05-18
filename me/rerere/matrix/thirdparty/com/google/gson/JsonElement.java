package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Streams;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public abstract class JsonElement {
  private static final long a = o3.a(-7817754396707152118L, 4217954939028274470L, null).a(249235889636551L);
  
  public boolean isJsonArray() {
    return this instanceof JsonArray;
  }
  
  public long getAsLong() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public boolean isJsonPrimitive() {
    return this instanceof JsonPrimitive;
  }
  
  public boolean isJsonNull() {
    return this instanceof JsonNull;
  }
  
  public int getAsInt() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public boolean isJsonObject() {
    return this instanceof JsonObject;
  }
  
  public double getAsDouble() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public JsonArray getAsJsonArray() {
    long l = a ^ 0x44CDA0BA3DFAL;
    try {
      if (isJsonArray())
        return (JsonArray)this; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    throw new IllegalStateException("Not a JSON Array: " + this);
  }
  
  public String toString() {
    try {
      StringWriter stringWriter = new StringWriter();
      JsonWriter jsonWriter = new JsonWriter(stringWriter);
      jsonWriter.setLenient(true);
      Streams.write(this, jsonWriter);
      return stringWriter.toString();
    } catch (IOException iOException) {
      throw new AssertionError(iOException);
    } 
  }
  
  public byte getAsByte() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public JsonObject getAsJsonObject() {
    long l = a ^ 0x7EFF841D4AA8L;
    try {
      if (isJsonObject())
        return (JsonObject)this; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    throw new IllegalStateException("Not a JSON Object: " + this);
  }
  
  public Boolean getAsBooleanWrapper() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public BigDecimal getAsBigDecimal() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public short getAsShort() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public String getAsString() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public JsonNull getAsJsonNull() {
    long l = a ^ 0x6D4838465744L;
    try {
      if (isJsonNull())
        return (JsonNull)this; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    throw new IllegalStateException("Not a JSON Null: " + this);
  }
  
  public float getAsFloat() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public JsonPrimitive getAsJsonPrimitive() {
    long l = a ^ 0x26CC0572A2C5L;
    try {
      if (isJsonPrimitive())
        return (JsonPrimitive)this; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    throw new IllegalStateException("Not a JSON Primitive: " + this);
  }
  
  public Number getAsNumber() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public abstract JsonElement deepCopy();
  
  public char getAsCharacter() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public BigInteger getAsBigInteger() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public boolean getAsBoolean() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\JsonElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */