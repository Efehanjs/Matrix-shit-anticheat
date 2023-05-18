package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.lang.reflect.Type;
import me.rerere.matrix.thirdparty.com.google.gson.JsonDeserializationContext;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonParseException;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSerializationContext;

public final class TreeTypeAdapter$GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
  public Object deserialize(JsonElement paramJsonElement, Type paramType) throws JsonParseException {
    return TreeTypeAdapter.this.gson.fromJson(paramJsonElement, paramType);
  }
  
  public JsonElement serialize(Object paramObject, Type paramType) {
    return TreeTypeAdapter.this.gson.toJsonTree(paramObject, paramType);
  }
  
  public JsonElement serialize(Object paramObject) {
    return TreeTypeAdapter.this.gson.toJsonTree(paramObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TreeTypeAdapter$GsonContextImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */