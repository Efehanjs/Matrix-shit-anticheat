package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonArray;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonObject;
import me.rerere.matrix.thirdparty.com.google.gson.JsonPrimitive;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;

public final class JsonTreeReader extends JsonReader {
  private int stackSize = 0;
  
  private Object[] stack = new Object[32];
  
  private String[] pathNames = new String[32];
  
  private int[] pathIndices = new int[32];
  
  private static final Reader UNREADABLE_READER;
  
  private static final Object SENTINEL_CLOSED;
  
  private static final long a = o3.a(5233240896458917457L, 8040463638147081119L, null).a(26324439308135L);
  
  public void close() throws IOException {
    this.stack = new Object[] { SENTINEL_CLOSED };
    this.stackSize = 1;
  }
  
  public JsonToken peek() throws IOException {
    long l = a ^ 0x1EC1317D379DL;
    try {
      if (this.stackSize == 0)
        return JsonToken.END_DOCUMENT; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object = peekStack();
    if (object instanceof Iterator) {
      boolean bool = this.stack[this.stackSize - 2] instanceof JsonObject;
      Iterator iterator = (Iterator)object;
      try {
        if (iterator.hasNext()) {
          try {
            if (bool)
              return JsonToken.NAME; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          push(iterator.next());
          return peek();
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      return bool ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
    } 
    try {
      if (object instanceof JsonObject)
        return JsonToken.BEGIN_OBJECT; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof JsonArray)
        return JsonToken.BEGIN_ARRAY; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (object instanceof JsonPrimitive) {
      JsonPrimitive jsonPrimitive = (JsonPrimitive)object;
      try {
        if (jsonPrimitive.isString())
          return JsonToken.STRING; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (jsonPrimitive.isBoolean())
          return JsonToken.BOOLEAN; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (jsonPrimitive.isNumber())
          return JsonToken.NUMBER; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      throw new AssertionError();
    } 
    try {
      if (object instanceof me.rerere.matrix.thirdparty.com.google.gson.JsonNull)
        return JsonToken.NULL; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object == SENTINEL_CLOSED)
        throw new IllegalStateException("JsonReader is closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new AssertionError();
  }
  
  public void beginArray() throws IOException {
    expect(JsonToken.BEGIN_ARRAY);
    JsonArray jsonArray = (JsonArray)peekStack();
    push(jsonArray.iterator());
    this.pathIndices[this.stackSize - 1] = 0;
  }
  
  public String getPath() {
    StringBuilder stringBuilder = (new StringBuilder()).append('$');
    byte b = 0;
    while (true) {
      try {
        if (b < this.stackSize) {
          try {
            if (this.stack[b] instanceof JsonArray) {
              try {
                if (this.stack[++b] instanceof Iterator)
                  stringBuilder.append('[').append(this.pathIndices[b]).append(']'); 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } else {
              try {
                if (this.stack[b] instanceof JsonObject)
                  try {
                    if (this.stack[++b] instanceof Iterator)
                      try {
                        stringBuilder.append('.');
                        if (this.pathNames[b] != null)
                          stringBuilder.append(this.pathNames[b]); 
                      } catch (IllegalStateException illegalStateException) {
                        throw a(null);
                      }  
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return stringBuilder.toString();
    } 
  }
  
  public String nextString() throws IOException {
    long l = a ^ 0x796BC73C90F0L;
    JsonToken jsonToken = peek();
    try {
      if (jsonToken != JsonToken.STRING)
        try {
          if (jsonToken != JsonToken.NUMBER)
            throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + jsonToken + locationString()); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = ((JsonPrimitive)popStack()).getAsString();
    try {
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return str;
  }
  
  public void promoteNameToValue() throws IOException {
    expect(JsonToken.NAME);
    Iterator<Map.Entry> iterator = (Iterator)peekStack();
    Map.Entry entry = iterator.next();
    push(entry.getValue());
    push(new JsonPrimitive((String)entry.getKey()));
  }
  
  public boolean nextBoolean() throws IOException {
    expect(JsonToken.BOOLEAN);
    boolean bool = ((JsonPrimitive)popStack()).getAsBoolean();
    try {
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return bool;
  }
  
  public void beginObject() throws IOException {
    expect(JsonToken.BEGIN_OBJECT);
    JsonObject jsonObject = (JsonObject)peekStack();
    push(jsonObject.entrySet().iterator());
  }
  
  public boolean hasNext() throws IOException {
    JsonToken jsonToken = peek();
    try {
      if (jsonToken != JsonToken.END_OBJECT)
        try {
          if (jsonToken != JsonToken.END_ARRAY);
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return false;
  }
  
  public void endObject() throws IOException {
    try {
      expect(JsonToken.END_OBJECT);
      popStack();
      popStack();
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void skipValue() throws IOException {
    long l = a ^ 0x7E53C52FDA49L;
    try {
      if (peek() == JsonToken.NAME) {
        nextName();
        this.pathNames[this.stackSize - 2] = "null";
      } else {
        try {
          popStack();
          if (this.stackSize > 0)
            this.pathNames[this.stackSize - 1] = "null"; 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  static {
    UNREADABLE_READER = new JsonTreeReader$1();
    SENTINEL_CLOSED = new Object();
  }
  
  public long nextLong() throws IOException {
    long l1 = a ^ 0x6E11FF49110BL;
    JsonToken jsonToken = peek();
    try {
      if (jsonToken != JsonToken.NUMBER)
        try {
          if (jsonToken != JsonToken.STRING)
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + jsonToken + locationString()); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    long l2 = ((JsonPrimitive)peekStack()).getAsLong();
    try {
      popStack();
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return l2;
  }
  
  public double nextDouble() throws IOException {
    long l = a ^ 0x50124A7EA25EL;
    JsonToken jsonToken = peek();
    try {
      if (jsonToken != JsonToken.NUMBER)
        try {
          if (jsonToken != JsonToken.STRING)
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + jsonToken + locationString()); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    double d = ((JsonPrimitive)peekStack()).getAsDouble();
    try {
      if (!isLenient())
        try {
          if (!Double.isNaN(d)) {
            try {
              if (Double.isInfinite(d))
                throw new NumberFormatException("JSON forbids NaN and infinities: " + d); 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      popStack();
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return d;
  }
  
  public void nextNull() throws IOException {
    try {
      expect(JsonToken.NULL);
      popStack();
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public JsonTreeReader(JsonElement paramJsonElement) {
    super(UNREADABLE_READER);
    push(paramJsonElement);
  }
  
  public void endArray() throws IOException {
    try {
      expect(JsonToken.END_ARRAY);
      popStack();
      popStack();
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public String nextName() throws IOException {
    expect(JsonToken.NAME);
    Iterator<Map.Entry> iterator = (Iterator)peekStack();
    Map.Entry entry = iterator.next();
    String str = (String)entry.getKey();
    this.pathNames[this.stackSize - 1] = str;
    push(entry.getValue());
    return str;
  }
  
  public int nextInt() throws IOException {
    long l = a ^ 0x52D7343D687AL;
    JsonToken jsonToken = peek();
    try {
      if (jsonToken != JsonToken.NUMBER)
        try {
          if (jsonToken != JsonToken.STRING)
            throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + jsonToken + locationString()); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = ((JsonPrimitive)peekStack()).getAsInt();
    try {
      popStack();
      if (this.stackSize > 0)
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return i;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\JsonTreeReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */