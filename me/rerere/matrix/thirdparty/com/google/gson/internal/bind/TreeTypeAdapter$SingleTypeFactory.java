package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.JsonDeserializer;
import me.rerere.matrix.thirdparty.com.google.gson.JsonSerializer;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TreeTypeAdapter$SingleTypeFactory implements TypeAdapterFactory {
  private final JsonSerializer serializer;
  
  private final TypeToken exactType;
  
  private final Class hierarchyType;
  
  private final boolean matchRawType;
  
  private final JsonDeserializer deserializer;
  
  public TreeTypeAdapter$SingleTypeFactory(Object paramObject, TypeToken paramTypeToken, boolean paramBoolean, Class paramClass) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   9: ifeq -> 19
    //   12: aload_1
    //   13: checkcast me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   16: goto -> 20
    //   19: aconst_null
    //   20: putfield serializer : Lme/rerere/matrix/thirdparty/com/google/gson/JsonSerializer;
    //   23: aload_0
    //   24: aload_1
    //   25: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   28: ifeq -> 42
    //   31: aload_1
    //   32: checkcast me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   35: goto -> 43
    //   38: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   41: athrow
    //   42: aconst_null
    //   43: putfield deserializer : Lme/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer;
    //   46: aload_0
    //   47: getfield serializer : Lme/rerere/matrix/thirdparty/com/google/gson/JsonSerializer;
    //   50: ifnonnull -> 67
    //   53: aload_0
    //   54: getfield deserializer : Lme/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer;
    //   57: ifnull -> 75
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: iconst_1
    //   68: goto -> 76
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: iconst_0
    //   76: invokestatic checkArgument : (Z)V
    //   79: aload_0
    //   80: aload_2
    //   81: putfield exactType : Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   84: aload_0
    //   85: iload_3
    //   86: putfield matchRawType : Z
    //   89: aload_0
    //   90: aload #4
    //   92: putfield hierarchyType : Ljava/lang/Class;
    //   95: return
    // Exception table:
    //   from	to	target	type
    //   20	38	38	java/lang/RuntimeException
    //   43	60	63	java/lang/RuntimeException
    //   53	71	71	java/lang/RuntimeException
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    // Byte code:
    //   0: aload_0
    //   1: getfield exactType : Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   4: ifnull -> 72
    //   7: aload_0
    //   8: getfield exactType : Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   11: aload_2
    //   12: invokevirtual equals : (Ljava/lang/Object;)Z
    //   15: ifne -> 60
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   24: athrow
    //   25: aload_0
    //   26: getfield matchRawType : Z
    //   29: ifeq -> 68
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   38: athrow
    //   39: aload_0
    //   40: getfield exactType : Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   43: invokevirtual getType : ()Ljava/lang/reflect/Type;
    //   46: aload_2
    //   47: invokevirtual getRawType : ()Ljava/lang/Class;
    //   50: if_acmpne -> 68
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: iconst_1
    //   61: goto -> 83
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: iconst_0
    //   69: goto -> 83
    //   72: aload_0
    //   73: getfield hierarchyType : Ljava/lang/Class;
    //   76: aload_2
    //   77: invokevirtual getRawType : ()Ljava/lang/Class;
    //   80: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   83: istore_3
    //   84: iload_3
    //   85: ifeq -> 113
    //   88: new me/rerere/matrix/thirdparty/com/google/gson/internal/bind/TreeTypeAdapter
    //   91: dup
    //   92: aload_0
    //   93: getfield serializer : Lme/rerere/matrix/thirdparty/com/google/gson/JsonSerializer;
    //   96: aload_0
    //   97: getfield deserializer : Lme/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer;
    //   100: aload_1
    //   101: aload_2
    //   102: aload_0
    //   103: invokespecial <init> : (Lme/rerere/matrix/thirdparty/com/google/gson/JsonSerializer;Lme/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer;Lme/rerere/matrix/thirdparty/com/google/gson/Gson;Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory;)V
    //   106: goto -> 114
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aconst_null
    //   114: areturn
    // Exception table:
    //   from	to	target	type
    //   0	18	21	java/lang/RuntimeException
    //   7	32	35	java/lang/RuntimeException
    //   25	53	56	java/lang/RuntimeException
    //   39	64	64	java/lang/RuntimeException
    //   84	109	109	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TreeTypeAdapter$SingleTypeFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */