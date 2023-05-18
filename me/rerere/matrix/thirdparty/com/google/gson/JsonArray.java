package me.rerere.matrix.thirdparty.com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray extends JsonElement implements Iterable {
  private final List elements;
  
  public String getAsString() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsString(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public JsonArray deepCopy() {
    if (!this.elements.isEmpty()) {
      JsonArray jsonArray = new JsonArray(this.elements.size());
      for (JsonElement jsonElement : this.elements)
        jsonArray.add(jsonElement.deepCopy()); 
      return jsonArray;
    } 
    return new JsonArray();
  }
  
  public Number getAsNumber() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsNumber(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public JsonElement get(int paramInt) {
    return this.elements.get(paramInt);
  }
  
  public void add(String paramString) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.elements.add((paramString == null) ? JsonNull.INSTANCE : new JsonPrimitive(paramString));
  }
  
  public JsonArray(int paramInt) {
    this.elements = new ArrayList(paramInt);
  }
  
  public void add(Character paramCharacter) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.elements.add((paramCharacter == null) ? JsonNull.INSTANCE : new JsonPrimitive(paramCharacter));
  }
  
  public JsonElement set(int paramInt, JsonElement paramJsonElement) {
    return this.elements.set(paramInt, paramJsonElement);
  }
  
  public boolean getAsBoolean() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsBoolean(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject != this) {
        try {
          if (paramObject instanceof JsonArray)
            try {
              if (((JsonArray)paramObject).elements.equals(this.elements));
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public int hashCode() {
    return this.elements.hashCode();
  }
  
  public void add(JsonElement paramJsonElement) {
    if (paramJsonElement == null)
      paramJsonElement = JsonNull.INSTANCE; 
    this.elements.add(paramJsonElement);
  }
  
  public JsonElement remove(int paramInt) {
    return this.elements.remove(paramInt);
  }
  
  public void add(Boolean paramBoolean) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.elements.add((paramBoolean == null) ? JsonNull.INSTANCE : new JsonPrimitive(paramBoolean));
  }
  
  public void addAll(JsonArray paramJsonArray) {
    this.elements.addAll(paramJsonArray.elements);
  }
  
  public byte getAsByte() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsByte(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public Iterator iterator() {
    return this.elements.iterator();
  }
  
  public void add(Number paramNumber) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.elements.add((paramNumber == null) ? JsonNull.INSTANCE : new JsonPrimitive(paramNumber));
  }
  
  public BigInteger getAsBigInteger() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsBigInteger(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public int size() {
    return this.elements.size();
  }
  
  public double getAsDouble() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsDouble(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public boolean remove(JsonElement paramJsonElement) {
    return this.elements.remove(paramJsonElement);
  }
  
  public boolean contains(JsonElement paramJsonElement) {
    return this.elements.contains(paramJsonElement);
  }
  
  public short getAsShort() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsShort(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public char getAsCharacter() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsCharacter(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public long getAsLong() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsLong(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public BigDecimal getAsBigDecimal() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsBigDecimal(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public JsonArray() {
    this.elements = new ArrayList();
  }
  
  public float getAsFloat() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsFloat(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public int getAsInt() {
    try {
      if (this.elements.size() == 1)
        return ((JsonElement)this.elements.get(0)).getAsInt(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\JsonArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */