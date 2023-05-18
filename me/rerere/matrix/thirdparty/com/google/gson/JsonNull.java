package me.rerere.matrix.thirdparty.com.google.gson;

public final class JsonNull extends JsonElement {
  public static final JsonNull INSTANCE = new JsonNull();
  
  public JsonNull deepCopy() {
    return INSTANCE;
  }
  
  public int hashCode() {
    return JsonNull.class.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this != paramObject) {
        try {
          if (paramObject instanceof JsonNull);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\JsonNull.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */