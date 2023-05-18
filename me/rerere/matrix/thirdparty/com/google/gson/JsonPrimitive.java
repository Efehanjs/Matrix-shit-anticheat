package me.rerere.matrix.thirdparty.com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import me.rerere.matrix.thirdparty.com.google.gson.internal.LazilyParsedNumber;

public final class JsonPrimitive extends JsonElement {
  private Object value;
  
  private static final Class[] PRIMITIVE_TYPES = new Class[] { 
      int.class, long.class, short.class, float.class, double.class, byte.class, boolean.class, char.class, Integer.class, Long.class, 
      Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
  
  public JsonPrimitive(Character paramCharacter) {
    setValue(paramCharacter);
  }
  
  public JsonPrimitive(Object paramObject) {
    setValue(paramObject);
  }
  
  public double getAsDouble() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
  }
  
  public Number getAsNumber() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.value instanceof String) ? (Number)new LazilyParsedNumber((String)this.value) : (Number)this.value;
  }
  
  public String getAsString() {
    try {
      if (isNumber())
        return getAsNumber().toString(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (isBoolean())
        return getAsBooleanWrapper().toString(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (String)this.value;
  }
  
  public boolean isNumber() {
    return this.value instanceof Number;
  }
  
  public float getAsFloat() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
  }
  
  public char getAsCharacter() {
    return getAsString().charAt(0);
  }
  
  public JsonPrimitive(String paramString) {
    setValue(paramString);
  }
  
  public int getAsInt() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
  }
  
  public short getAsShort() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
  }
  
  public boolean isString() {
    return this.value instanceof String;
  }
  
  public JsonPrimitive deepCopy() {
    return this;
  }
  
  public Boolean getAsBooleanWrapper() {
    return (Boolean)this.value;
  }
  
  public boolean getAsBoolean() {
    try {
      if (isBoolean())
        return getAsBooleanWrapper().booleanValue(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.parseBoolean(getAsString());
  }
  
  public byte getAsByte() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
  }
  
  public int hashCode() {
    try {
      if (this.value == null)
        return 31; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (isIntegral(this)) {
      long l = getAsNumber().longValue();
      return (int)(l ^ l >>> 32L);
    } 
    if (this.value instanceof Number) {
      long l = Double.doubleToLongBits(getAsNumber().doubleValue());
      return (int)(l ^ l >>> 32L);
    } 
    return this.value.hashCode();
  }
  
  public JsonPrimitive(Boolean paramBoolean) {
    setValue(paramBoolean);
  }
  
  public boolean isBoolean() {
    return this.value instanceof Boolean;
  }
  
  public JsonPrimitive(Number paramNumber) {
    setValue(paramNumber);
  }
  
  public long getAsLong() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
  }
  
  public void setValue(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/lang/Character
    //   4: ifeq -> 26
    //   7: aload_1
    //   8: checkcast java/lang/Character
    //   11: invokevirtual charValue : ()C
    //   14: istore_2
    //   15: aload_0
    //   16: iload_2
    //   17: invokestatic valueOf : (C)Ljava/lang/String;
    //   20: putfield value : Ljava/lang/Object;
    //   23: goto -> 64
    //   26: aload_1
    //   27: instanceof java/lang/Number
    //   30: ifne -> 47
    //   33: aload_1
    //   34: invokestatic isPrimitiveOrString : (Ljava/lang/Object;)Z
    //   37: ifeq -> 55
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: iconst_1
    //   48: goto -> 56
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: invokestatic checkArgument : (Z)V
    //   59: aload_0
    //   60: aload_1
    //   61: putfield value : Ljava/lang/Object;
    //   64: return
    // Exception table:
    //   from	to	target	type
    //   26	40	43	java/lang/RuntimeException
    //   33	51	51	java/lang/RuntimeException
  }
  
  public BigInteger getAsBigInteger() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.value instanceof BigInteger) ? (BigInteger)this.value : new BigInteger(this.value.toString());
  }
  
  public BigDecimal getAsBigDecimal() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.value instanceof BigDecimal) ? (BigDecimal)this.value : new BigDecimal(this.value.toString());
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    JsonPrimitive jsonPrimitive = (JsonPrimitive)paramObject;
    try {
      if (this.value == null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (jsonPrimitive.value == null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (isIntegral(this))
        try {
          if (isIntegral(jsonPrimitive)) {
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return (getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue());
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.value instanceof Number && jsonPrimitive.value instanceof Number) {
        double d1 = getAsNumber().doubleValue();
        double d2 = jsonPrimitive.getAsNumber().doubleValue();
        try {
          if (d1 != d2) {
            try {
              if (Double.isNaN(d1))
                try {
                  if (Double.isNaN(d2));
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
      } else {
        return this.value.equals(jsonPrimitive.value);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\JsonPrimitive.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */