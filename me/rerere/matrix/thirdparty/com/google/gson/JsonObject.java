package me.rerere.matrix.thirdparty.com.google.gson;

import java.util.Map;
import java.util.Set;
import me.rerere.matrix.thirdparty.com.google.gson.internal.LinkedTreeMap;

public final class JsonObject extends JsonElement {
  private final LinkedTreeMap members = new LinkedTreeMap();
  
  public int hashCode() {
    return this.members.hashCode();
  }
  
  public JsonArray getAsJsonArray(String paramString) {
    return (JsonArray)this.members.get(paramString);
  }
  
  public Set entrySet() {
    return this.members.entrySet();
  }
  
  public void addProperty(String paramString, Character paramCharacter) {
    add(paramString, createJsonElement(paramCharacter));
  }
  
  public void addProperty(String paramString, Boolean paramBoolean) {
    add(paramString, createJsonElement(paramBoolean));
  }
  
  public void addProperty(String paramString, Number paramNumber) {
    add(paramString, createJsonElement(paramNumber));
  }
  
  public int size() {
    return this.members.size();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject != this) {
        try {
          if (paramObject instanceof JsonObject)
            try {
              if (((JsonObject)paramObject).members.equals(this.members));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public JsonObject deepCopy() {
    JsonObject jsonObject = new JsonObject();
    for (Map.Entry entry : this.members.entrySet())
      jsonObject.add((String)entry.getKey(), ((JsonElement)entry.getValue()).deepCopy()); 
    return jsonObject;
  }
  
  public void addProperty(String paramString1, String paramString2) {
    add(paramString1, createJsonElement(paramString2));
  }
  
  public boolean has(String paramString) {
    return this.members.containsKey(paramString);
  }
  
  public JsonElement get(String paramString) {
    return (JsonElement)this.members.get(paramString);
  }
  
  public Set keySet() {
    return this.members.keySet();
  }
  
  public void add(String paramString, JsonElement paramJsonElement) {
    if (paramJsonElement == null)
      paramJsonElement = JsonNull.INSTANCE; 
    this.members.put(paramString, paramJsonElement);
  }
  
  public JsonElement remove(String paramString) {
    return (JsonElement)this.members.remove(paramString);
  }
  
  public JsonObject getAsJsonObject(String paramString) {
    return (JsonObject)this.members.get(paramString);
  }
  
  public JsonPrimitive getAsJsonPrimitive(String paramString) {
    return (JsonPrimitive)this.members.get(paramString);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\JsonObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */