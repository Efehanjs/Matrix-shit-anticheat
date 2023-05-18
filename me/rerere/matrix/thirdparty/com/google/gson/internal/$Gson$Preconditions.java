package me.rerere.matrix.thirdparty.com.google.gson.internal;

public final class $Gson$Preconditions {
  public static void checkArgument(boolean paramBoolean) {
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public static Object checkNotNull(Object paramObject) {
    try {
      if (paramObject == null)
        throw new NullPointerException(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramObject;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\$Gson$Preconditions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */