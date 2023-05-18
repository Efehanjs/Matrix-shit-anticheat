package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonArray;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonNull;
import me.rerere.matrix.thirdparty.com.google.gson.JsonObject;
import me.rerere.matrix.thirdparty.com.google.gson.JsonPrimitive;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class JsonTreeWriter extends JsonWriter {
  private String pendingName;
  
  private static final Writer UNWRITABLE_WRITER;
  
  private static final JsonPrimitive SENTINEL_CLOSED;
  
  private JsonElement product = (JsonElement)JsonNull.INSTANCE;
  
  private final List stack = new ArrayList();
  
  private static final long a = o3.a(1775060030666087592L, 365603714259052886L, null).a(2187470706983L);
  
  public void close() throws IOException {
    long l = a ^ 0x6AE04B54CFF0L;
    try {
      if (!this.stack.isEmpty())
        throw new IOException("Incomplete document"); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    this.stack.add(SENTINEL_CLOSED);
  }
  
  public JsonTreeWriter() {
    super(UNWRITABLE_WRITER);
  }
  
  public JsonElement get() {
    long l = a ^ 0xDE9F1BB9859L;
    try {
      if (!this.stack.isEmpty())
        throw new IllegalStateException("Expected one JSON element but was " + this.stack); 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    return this.product;
  }
  
  public JsonWriter value(Boolean paramBoolean) throws IOException {
    try {
      if (paramBoolean == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    put((JsonElement)new JsonPrimitive(paramBoolean));
    return this;
  }
  
  public JsonWriter value(String paramString) throws IOException {
    try {
      if (paramString == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    put((JsonElement)new JsonPrimitive(paramString));
    return this;
  }
  
  public JsonWriter value(Number paramNumber) throws IOException {
    long l = a ^ 0x14415DFC3599L;
    try {
      if (paramNumber == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    if (!isLenient()) {
      double d = paramNumber.doubleValue();
      try {
        if (!Double.isNaN(d)) {
          try {
            if (Double.isInfinite(d))
              throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramNumber); 
          } catch (IOException iOException) {
            throw b(null);
          } 
        } else {
          throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramNumber);
        } 
      } catch (IOException iOException) {
        throw b(null);
      } 
    } 
    put((JsonElement)new JsonPrimitive(paramNumber));
    return this;
  }
  
  public JsonWriter beginArray() throws IOException {
    JsonArray jsonArray = new JsonArray();
    put((JsonElement)jsonArray);
    this.stack.add(jsonArray);
    return this;
  }
  
  public void flush() throws IOException {}
  
  public JsonWriter value(double paramDouble) throws IOException {
    long l = a ^ 0x1205DDE62702L;
    try {
      if (!isLenient())
        try {
          if (!Double.isNaN(paramDouble)) {
            try {
              if (Double.isInfinite(paramDouble))
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramDouble); 
            } catch (IOException iOException) {
              throw b(null);
            } 
          } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramDouble);
          } 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    put((JsonElement)new JsonPrimitive(Double.valueOf(paramDouble)));
    return this;
  }
  
  public JsonWriter nullValue() throws IOException {
    put((JsonElement)JsonNull.INSTANCE);
    return this;
  }
  
  public JsonWriter name(String paramString) throws IOException {
    try {
      if (!this.stack.isEmpty())
        try {
          if (this.pendingName == null) {
            JsonElement jsonElement = peek();
            try {
              if (jsonElement instanceof JsonObject) {
                this.pendingName = paramString;
                return this;
              } 
            } catch (IOException iOException) {
              throw b(null);
            } 
            throw new IllegalStateException();
          } 
          throw new IllegalStateException();
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new IllegalStateException();
  }
  
  public JsonWriter beginObject() throws IOException {
    JsonObject jsonObject = new JsonObject();
    put((JsonElement)jsonObject);
    this.stack.add(jsonObject);
    return this;
  }
  
  static {
    long l = a ^ 0x6E547DFAD79CL;
    UNWRITABLE_WRITER = new JsonTreeWriter$1();
    SENTINEL_CLOSED = new JsonPrimitive("closed");
  }
  
  public JsonWriter value(boolean paramBoolean) throws IOException {
    put((JsonElement)new JsonPrimitive(Boolean.valueOf(paramBoolean)));
    return this;
  }
  
  public JsonWriter endObject() throws IOException {
    try {
      if (!this.stack.isEmpty())
        try {
          if (this.pendingName == null) {
            JsonElement jsonElement = peek();
            try {
              if (jsonElement instanceof JsonObject) {
                this.stack.remove(this.stack.size() - 1);
                return this;
              } 
            } catch (IOException iOException) {
              throw b(null);
            } 
            throw new IllegalStateException();
          } 
          throw new IllegalStateException();
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new IllegalStateException();
  }
  
  public JsonWriter endArray() throws IOException {
    try {
      if (!this.stack.isEmpty())
        try {
          if (this.pendingName == null) {
            JsonElement jsonElement = peek();
            try {
              if (jsonElement instanceof JsonArray) {
                this.stack.remove(this.stack.size() - 1);
                return this;
              } 
            } catch (IOException iOException) {
              throw b(null);
            } 
            throw new IllegalStateException();
          } 
          throw new IllegalStateException();
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new IllegalStateException();
  }
  
  public JsonWriter value(long paramLong) throws IOException {
    put((JsonElement)new JsonPrimitive(Long.valueOf(paramLong)));
    return this;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\JsonTreeWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */