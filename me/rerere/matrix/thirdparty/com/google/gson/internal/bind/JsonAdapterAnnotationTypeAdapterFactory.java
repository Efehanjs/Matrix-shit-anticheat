package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.JsonAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ConstructorConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
  private final ConstructorConstructor constructorConstructor;
  
  private static final long a = o3.a(831917494765597730L, 4946537049951371626L, null).a(47422471085823L);
  
  public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor) {
    this.constructorConstructor = paramConstructorConstructor;
  }
  
  public TypeAdapter getTypeAdapter(ConstructorConstructor paramConstructorConstructor, Gson paramGson, TypeToken paramTypeToken, JsonAdapter paramJsonAdapter) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory.a : J
    //   3: ldc2_w 58972009786984
    //   6: lxor
    //   7: lstore #5
    //   9: aload_1
    //   10: aload #4
    //   12: invokeinterface value : ()Ljava/lang/Class;
    //   17: invokestatic get : (Ljava/lang/Class;)Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   20: invokevirtual get : (Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;)Lme/rerere/matrix/thirdparty/com/google/gson/internal/ObjectConstructor;
    //   23: invokeinterface construct : ()Ljava/lang/Object;
    //   28: astore #7
    //   30: aload #7
    //   32: instanceof me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   35: ifeq -> 48
    //   38: aload #7
    //   40: checkcast me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   43: astore #8
    //   45: goto -> 219
    //   48: aload #7
    //   50: instanceof me/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory
    //   53: ifeq -> 73
    //   56: aload #7
    //   58: checkcast me/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory
    //   61: aload_2
    //   62: aload_3
    //   63: invokeinterface create : (Lme/rerere/matrix/thirdparty/com/google/gson/Gson;Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;)Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;
    //   68: astore #8
    //   70: goto -> 219
    //   73: aload #7
    //   75: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   78: ifne -> 96
    //   81: aload #7
    //   83: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   86: ifeq -> 168
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   95: athrow
    //   96: aload #7
    //   98: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   101: ifeq -> 123
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   110: athrow
    //   111: aload #7
    //   113: checkcast me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   116: goto -> 124
    //   119: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   122: athrow
    //   123: aconst_null
    //   124: astore #9
    //   126: aload #7
    //   128: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   131: ifeq -> 146
    //   134: aload #7
    //   136: checkcast me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   139: goto -> 147
    //   142: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   145: athrow
    //   146: aconst_null
    //   147: astore #10
    //   149: new me/rerere/matrix/thirdparty/com/google/gson/internal/bind/TreeTypeAdapter
    //   152: dup
    //   153: aload #9
    //   155: aload #10
    //   157: aload_2
    //   158: aload_3
    //   159: aconst_null
    //   160: invokespecial <init> : (Lme/rerere/matrix/thirdparty/com/google/gson/JsonSerializer;Lme/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer;Lme/rerere/matrix/thirdparty/com/google/gson/Gson;Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory;)V
    //   163: astore #8
    //   165: goto -> 219
    //   168: new java/lang/IllegalArgumentException
    //   171: dup
    //   172: new java/lang/StringBuilder
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: ldc 'Invalid attempt to bind an instance of '
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: aload #7
    //   186: invokevirtual getClass : ()Ljava/lang/Class;
    //   189: invokevirtual getName : ()Ljava/lang/String;
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: ldc ' as a @JsonAdapter for '
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload_3
    //   201: invokevirtual toString : ()Ljava/lang/String;
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: ldc '. @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.'
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: athrow
    //   219: aload #8
    //   221: ifnull -> 248
    //   224: aload #4
    //   226: invokeinterface nullSafe : ()Z
    //   231: ifeq -> 248
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   240: athrow
    //   241: aload #8
    //   243: invokevirtual nullSafe : ()Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;
    //   246: astore #8
    //   248: aload #8
    //   250: areturn
    // Exception table:
    //   from	to	target	type
    //   73	89	92	java/lang/IllegalArgumentException
    //   81	104	107	java/lang/IllegalArgumentException
    //   96	119	119	java/lang/IllegalArgumentException
    //   126	142	142	java/lang/IllegalArgumentException
    //   219	234	237	java/lang/IllegalArgumentException
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Class clazz = paramTypeToken.getRawType();
    JsonAdapter jsonAdapter = (JsonAdapter)clazz.getAnnotation(JsonAdapter.class);
    try {
      if (jsonAdapter == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return getTypeAdapter(this.constructorConstructor, paramGson, paramTypeToken, jsonAdapter);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\JsonAdapterAnnotationTypeAdapterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */