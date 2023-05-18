package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;

public final class $Gson$Types$ParameterizedTypeImpl implements ParameterizedType, Serializable {
  private static final long serialVersionUID = 0L;
  
  private final Type ownerType;
  
  private final Type rawType;
  
  private final Type[] typeArguments;
  
  private static final long a = o3.a(-7196800957283593979L, -8992683434054122446L, null).a(101716076364169L);
  
  public Type getRawType() {
    return this.rawType;
  }
  
  public int hashCode() {
    return Arrays.hashCode((Object[])this.typeArguments) ^ this.rawType.hashCode() ^ $Gson$Types.hashCodeOrZero(this.ownerType);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof ParameterizedType)
        try {
          if ($Gson$Types.equals(this, (ParameterizedType)paramObject));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public Type[] getActualTypeArguments() {
    return (Type[])this.typeArguments.clone();
  }
  
  public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_2
    //   5: instanceof java/lang/Class
    //   8: ifeq -> 82
    //   11: aload_2
    //   12: checkcast java/lang/Class
    //   15: astore #4
    //   17: aload #4
    //   19: invokevirtual getModifiers : ()I
    //   22: invokestatic isStatic : (I)Z
    //   25: ifne -> 43
    //   28: aload #4
    //   30: invokevirtual getEnclosingClass : ()Ljava/lang/Class;
    //   33: ifnonnull -> 51
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: iconst_1
    //   44: goto -> 52
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iconst_0
    //   52: istore #5
    //   54: aload_1
    //   55: ifnonnull -> 70
    //   58: iload #5
    //   60: ifeq -> 78
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: iconst_0
    //   79: invokestatic checkArgument : (Z)V
    //   82: aload_0
    //   83: aload_1
    //   84: ifnonnull -> 95
    //   87: aconst_null
    //   88: goto -> 99
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload_1
    //   96: invokestatic canonicalize : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   99: putfield ownerType : Ljava/lang/reflect/Type;
    //   102: aload_0
    //   103: aload_2
    //   104: invokestatic canonicalize : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   107: putfield rawType : Ljava/lang/reflect/Type;
    //   110: aload_0
    //   111: aload_3
    //   112: invokevirtual clone : ()Ljava/lang/Object;
    //   115: checkcast [Ljava/lang/reflect/Type;
    //   118: putfield typeArguments : [Ljava/lang/reflect/Type;
    //   121: iconst_0
    //   122: istore #4
    //   124: aload_0
    //   125: getfield typeArguments : [Ljava/lang/reflect/Type;
    //   128: arraylength
    //   129: istore #5
    //   131: iload #4
    //   133: iload #5
    //   135: if_icmpge -> 186
    //   138: aload_0
    //   139: getfield typeArguments : [Ljava/lang/reflect/Type;
    //   142: iload #4
    //   144: aaload
    //   145: invokestatic checkNotNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   148: pop
    //   149: aload_0
    //   150: getfield typeArguments : [Ljava/lang/reflect/Type;
    //   153: iload #4
    //   155: aaload
    //   156: invokestatic checkNotPrimitive : (Ljava/lang/reflect/Type;)V
    //   159: aload_0
    //   160: getfield typeArguments : [Ljava/lang/reflect/Type;
    //   163: iload #4
    //   165: aload_0
    //   166: getfield typeArguments : [Ljava/lang/reflect/Type;
    //   169: iload #4
    //   171: aaload
    //   172: invokestatic canonicalize : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   175: aastore
    //   176: iinc #4, 1
    //   179: goto -> 131
    //   182: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   185: athrow
    //   186: return
    // Exception table:
    //   from	to	target	type
    //   17	36	39	java/lang/RuntimeException
    //   28	47	47	java/lang/RuntimeException
    //   54	63	66	java/lang/RuntimeException
    //   58	74	74	java/lang/RuntimeException
    //   82	91	91	java/lang/RuntimeException
    //   131	182	182	java/lang/RuntimeException
  }
  
  public Type getOwnerType() {
    return this.ownerType;
  }
  
  public String toString() {
    long l = a ^ 0x7C75D90F5ACEL;
    int i = this.typeArguments.length;
    try {
      if (i == 0)
        return $Gson$Types.typeToString(this.rawType); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(30 * (i + 1));
    stringBuilder.append($Gson$Types.typeToString(this.rawType)).append("<").append($Gson$Types.typeToString(this.typeArguments[0]));
    byte b = 1;
    try {
      while (b < i) {
        stringBuilder.append(", ").append($Gson$Types.typeToString(this.typeArguments[b]));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return stringBuilder.append(">").toString();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\$Gson$Types$ParameterizedTypeImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */