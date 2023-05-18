package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.JsonPrimitive;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSyntaxException;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.JsonReaderInternalAccess;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ObjectConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;

public final class MapTypeAdapterFactory$Adapter extends TypeAdapter {
  private final TypeAdapter keyTypeAdapter;
  
  private final TypeAdapter valueTypeAdapter;
  
  private final ObjectConstructor constructor;
  
  private static final long a = o3.a(2424975407750605960L, 905518981492478140L, null).a(133864178743090L);
  
  public Map read(JsonReader paramJsonReader) throws IOException {
    long l = a ^ 0xB76428C2137L;
    JsonToken jsonToken = paramJsonReader.peek();
    try {
      if (jsonToken == JsonToken.NULL) {
        paramJsonReader.nextNull();
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Map<Object, Object> map = (Map)this.constructor.construct();
    try {
      if (jsonToken == JsonToken.BEGIN_ARRAY) {
        paramJsonReader.beginArray();
        while (paramJsonReader.hasNext()) {
          paramJsonReader.beginArray();
          Object object1 = this.keyTypeAdapter.read(paramJsonReader);
          Object object2 = this.valueTypeAdapter.read(paramJsonReader);
          Object object = map.put(object1, object2);
          try {
            if (object != null)
              throw new JsonSyntaxException("duplicate key: " + object1); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          paramJsonReader.endArray();
        } 
        paramJsonReader.endArray();
      } else {
        paramJsonReader.beginObject();
        while (paramJsonReader.hasNext()) {
          JsonReaderInternalAccess.INSTANCE.promoteNameToValue(paramJsonReader);
          Object object1 = this.keyTypeAdapter.read(paramJsonReader);
          Object object2 = this.valueTypeAdapter.read(paramJsonReader);
          Object object = map.put(object1, object2);
          try {
            if (object != null)
              throw new JsonSyntaxException("duplicate key: " + object1); 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
        paramJsonReader.endObject();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return map;
  }
  
  public void write(JsonWriter paramJsonWriter, Map paramMap) throws IOException {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 14
    //   4: aload_1
    //   5: invokevirtual nullValue : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   8: pop
    //   9: return
    //   10: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   13: athrow
    //   14: aload_0
    //   15: getfield this$0 : Lme/rerere/matrix/thirdparty/com/google/gson/internal/bind/MapTypeAdapterFactory;
    //   18: getfield complexMapKeySerialization : Z
    //   21: ifne -> 100
    //   24: aload_1
    //   25: invokevirtual beginObject : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   28: pop
    //   29: aload_2
    //   30: invokeinterface entrySet : ()Ljava/util/Set;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore_3
    //   41: aload_3
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 94
    //   50: aload_3
    //   51: invokeinterface next : ()Ljava/lang/Object;
    //   56: checkcast java/util/Map$Entry
    //   59: astore #4
    //   61: aload_1
    //   62: aload #4
    //   64: invokeinterface getKey : ()Ljava/lang/Object;
    //   69: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   72: invokevirtual name : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   75: pop
    //   76: aload_0
    //   77: getfield valueTypeAdapter : Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;
    //   80: aload_1
    //   81: aload #4
    //   83: invokeinterface getValue : ()Ljava/lang/Object;
    //   88: invokevirtual write : (Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    //   91: goto -> 41
    //   94: aload_1
    //   95: invokevirtual endObject : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   98: pop
    //   99: return
    //   100: iconst_0
    //   101: istore_3
    //   102: new java/util/ArrayList
    //   105: dup
    //   106: aload_2
    //   107: invokeinterface size : ()I
    //   112: invokespecial <init> : (I)V
    //   115: astore #4
    //   117: new java/util/ArrayList
    //   120: dup
    //   121: aload_2
    //   122: invokeinterface size : ()I
    //   127: invokespecial <init> : (I)V
    //   130: astore #5
    //   132: aload_2
    //   133: invokeinterface entrySet : ()Ljava/util/Set;
    //   138: invokeinterface iterator : ()Ljava/util/Iterator;
    //   143: astore #6
    //   145: aload #6
    //   147: invokeinterface hasNext : ()Z
    //   152: ifeq -> 246
    //   155: aload #6
    //   157: invokeinterface next : ()Ljava/lang/Object;
    //   162: checkcast java/util/Map$Entry
    //   165: astore #7
    //   167: aload_0
    //   168: getfield keyTypeAdapter : Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;
    //   171: aload #7
    //   173: invokeinterface getKey : ()Ljava/lang/Object;
    //   178: invokevirtual toJsonTree : (Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/com/google/gson/JsonElement;
    //   181: astore #8
    //   183: aload #4
    //   185: aload #8
    //   187: invokeinterface add : (Ljava/lang/Object;)Z
    //   192: pop
    //   193: aload #5
    //   195: aload #7
    //   197: invokeinterface getValue : ()Ljava/lang/Object;
    //   202: invokeinterface add : (Ljava/lang/Object;)Z
    //   207: pop
    //   208: iload_3
    //   209: aload #8
    //   211: invokevirtual isJsonArray : ()Z
    //   214: ifne -> 232
    //   217: aload #8
    //   219: invokevirtual isJsonObject : ()Z
    //   222: ifeq -> 240
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: iconst_1
    //   233: goto -> 241
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: iconst_0
    //   241: ior
    //   242: istore_3
    //   243: goto -> 145
    //   246: iload_3
    //   247: ifeq -> 335
    //   250: aload_1
    //   251: invokevirtual beginArray : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   254: pop
    //   255: iconst_0
    //   256: istore #6
    //   258: aload #4
    //   260: invokeinterface size : ()I
    //   265: istore #7
    //   267: iload #6
    //   269: iload #7
    //   271: if_icmpge -> 327
    //   274: aload_1
    //   275: invokevirtual beginArray : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   278: pop
    //   279: aload #4
    //   281: iload #6
    //   283: invokeinterface get : (I)Ljava/lang/Object;
    //   288: checkcast me/rerere/matrix/thirdparty/com/google/gson/JsonElement
    //   291: aload_1
    //   292: invokestatic write : (Lme/rerere/matrix/thirdparty/com/google/gson/JsonElement;Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;)V
    //   295: aload_0
    //   296: getfield valueTypeAdapter : Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;
    //   299: aload_1
    //   300: aload #5
    //   302: iload #6
    //   304: invokeinterface get : (I)Ljava/lang/Object;
    //   309: invokevirtual write : (Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    //   312: aload_1
    //   313: invokevirtual endArray : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   316: pop
    //   317: iinc #6, 1
    //   320: goto -> 267
    //   323: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   326: athrow
    //   327: aload_1
    //   328: invokevirtual endArray : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   331: pop
    //   332: goto -> 412
    //   335: aload_1
    //   336: invokevirtual beginObject : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   339: pop
    //   340: iconst_0
    //   341: istore #6
    //   343: aload #4
    //   345: invokeinterface size : ()I
    //   350: istore #7
    //   352: iload #6
    //   354: iload #7
    //   356: if_icmpge -> 407
    //   359: aload #4
    //   361: iload #6
    //   363: invokeinterface get : (I)Ljava/lang/Object;
    //   368: checkcast me/rerere/matrix/thirdparty/com/google/gson/JsonElement
    //   371: astore #8
    //   373: aload_1
    //   374: aload_0
    //   375: aload #8
    //   377: invokespecial keyToString : (Lme/rerere/matrix/thirdparty/com/google/gson/JsonElement;)Ljava/lang/String;
    //   380: invokevirtual name : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   383: pop
    //   384: aload_0
    //   385: getfield valueTypeAdapter : Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;
    //   388: aload_1
    //   389: aload #5
    //   391: iload #6
    //   393: invokeinterface get : (I)Ljava/lang/Object;
    //   398: invokevirtual write : (Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    //   401: iinc #6, 1
    //   404: goto -> 352
    //   407: aload_1
    //   408: invokevirtual endObject : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonWriter;
    //   411: pop
    //   412: return
    // Exception table:
    //   from	to	target	type
    //   0	10	10	java/io/IOException
    //   183	225	228	java/io/IOException
    //   217	236	236	java/io/IOException
    //   267	323	323	java/io/IOException
  }
  
  public MapTypeAdapterFactory$Adapter(Gson paramGson, Type paramType1, TypeAdapter paramTypeAdapter1, Type paramType2, TypeAdapter paramTypeAdapter2, ObjectConstructor paramObjectConstructor) {
    this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper(paramGson, paramTypeAdapter1, paramType1);
    this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper(paramGson, paramTypeAdapter2, paramType2);
    this.constructor = paramObjectConstructor;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\MapTypeAdapterFactory$Adapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */