package me.rerere.matrix.thirdparty.com.google.gson;

import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Excluder;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.TypeAdapters;

public final class GsonBuilder {
  private Excluder excluder = Excluder.DEFAULT;
  
  private LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
  
  private boolean prettyPrinting = false;
  
  private String datePattern;
  
  private boolean escapeHtmlChars = true;
  
  private boolean complexMapKeySerialization = false;
  
  private final List hierarchyFactories = new ArrayList();
  
  private boolean generateNonExecutableJson = false;
  
  private int dateStyle = 2;
  
  private final List factories = new ArrayList();
  
  private boolean serializeNulls = false;
  
  private boolean serializeSpecialFloatingPointValues = false;
  
  private FieldNamingStrategy fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
  
  private final Map instanceCreators = new HashMap<Object, Object>();
  
  private boolean lenient = false;
  
  private int timeStyle = 2;
  
  public GsonBuilder serializeSpecialFloatingPointValues() {
    this.serializeSpecialFloatingPointValues = true;
    return this;
  }
  
  public GsonBuilder() {}
  
  public GsonBuilder disableInnerClassSerialization() {
    this.excluder = this.excluder.disableInnerClassSerialization();
    return this;
  }
  
  public GsonBuilder setDateFormat(int paramInt) {
    this.dateStyle = paramInt;
    this.datePattern = null;
    return this;
  }
  
  public GsonBuilder setVersion(double paramDouble) {
    this.excluder = this.excluder.withVersion(paramDouble);
    return this;
  }
  
  public GsonBuilder enableComplexMapKeySerialization() {
    this.complexMapKeySerialization = true;
    return this;
  }
  
  public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory paramTypeAdapterFactory) {
    this.factories.add(paramTypeAdapterFactory);
    return this;
  }
  
  public GsonBuilder setDateFormat(String paramString) {
    this.datePattern = paramString;
    return this;
  }
  
  public GsonBuilder generateNonExecutableJson() {
    this.generateNonExecutableJson = true;
    return this;
  }
  
  public GsonBuilder setPrettyPrinting() {
    this.prettyPrinting = true;
    return this;
  }
  
  public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy paramLongSerializationPolicy) {
    this.longSerializationPolicy = paramLongSerializationPolicy;
    return this;
  }
  
  public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy) {
    this.excluder = this.excluder.withExclusionStrategy(paramExclusionStrategy, false, true);
    return this;
  }
  
  public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
    this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
    return this;
  }
  
  public GsonBuilder registerTypeHierarchyAdapter(Class paramClass, Object paramObject) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   4: ifne -> 35
    //   7: aload_2
    //   8: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   11: ifne -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_2
    //   22: instanceof me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: iconst_0
    //   44: invokestatic checkArgument : (Z)V
    //   47: aload_2
    //   48: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   51: ifne -> 68
    //   54: aload_2
    //   55: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   58: ifeq -> 90
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield hierarchyFactories : Ljava/util/List;
    //   72: aload_1
    //   73: aload_2
    //   74: invokestatic newTypeHierarchyFactory : (Ljava/lang/Class;Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory;
    //   77: invokeinterface add : (Ljava/lang/Object;)Z
    //   82: pop
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload_2
    //   91: instanceof me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   94: ifeq -> 122
    //   97: aload_0
    //   98: getfield factories : Ljava/util/List;
    //   101: aload_1
    //   102: aload_2
    //   103: checkcast me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   106: invokestatic newTypeHierarchyFactory : (Ljava/lang/Class;Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;)Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory;
    //   109: invokeinterface add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload_0
    //   123: areturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/RuntimeException
    //   7	28	31	java/lang/RuntimeException
    //   21	39	39	java/lang/RuntimeException
    //   44	61	64	java/lang/RuntimeException
    //   54	83	86	java/lang/RuntimeException
    //   90	115	118	java/lang/RuntimeException
  }
  
  public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy paramFieldNamingStrategy) {
    this.fieldNamingPolicy = paramFieldNamingStrategy;
    return this;
  }
  
  public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy paramFieldNamingPolicy) {
    this.fieldNamingPolicy = paramFieldNamingPolicy;
    return this;
  }
  
  public GsonBuilder setLenient() {
    this.lenient = true;
    return this;
  }
  
  public GsonBuilder(Gson paramGson) {
    this.excluder = paramGson.excluder;
    this.fieldNamingPolicy = paramGson.fieldNamingStrategy;
    this.instanceCreators.putAll(paramGson.instanceCreators);
    this.serializeNulls = paramGson.serializeNulls;
    this.complexMapKeySerialization = paramGson.complexMapKeySerialization;
    this.generateNonExecutableJson = paramGson.generateNonExecutableJson;
    this.escapeHtmlChars = paramGson.htmlSafe;
    this.prettyPrinting = paramGson.prettyPrinting;
    this.lenient = paramGson.lenient;
    this.serializeSpecialFloatingPointValues = paramGson.serializeSpecialFloatingPointValues;
    this.longSerializationPolicy = paramGson.longSerializationPolicy;
    this.datePattern = paramGson.datePattern;
    this.dateStyle = paramGson.dateStyle;
    this.timeStyle = paramGson.timeStyle;
    this.factories.addAll(paramGson.builderFactories);
    this.hierarchyFactories.addAll(paramGson.builderHierarchyFactories);
  }
  
  public Gson create() {
    ArrayList<?> arrayList1 = new ArrayList(this.factories.size() + this.hierarchyFactories.size() + 3);
    arrayList1.addAll(this.factories);
    Collections.reverse(arrayList1);
    ArrayList<?> arrayList2 = new ArrayList(this.hierarchyFactories);
    Collections.reverse(arrayList2);
    arrayList1.addAll(arrayList2);
    addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList1);
    return new Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, this.factories, this.hierarchyFactories, arrayList1);
  }
  
  public GsonBuilder disableHtmlEscaping() {
    this.escapeHtmlChars = false;
    return this;
  }
  
  public GsonBuilder registerTypeAdapter(Type paramType, Object paramObject) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   4: ifne -> 49
    //   7: aload_2
    //   8: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   11: ifne -> 49
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_2
    //   22: instanceof me/rerere/matrix/thirdparty/com/google/gson/InstanceCreator
    //   25: ifne -> 49
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: aload_2
    //   36: instanceof me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   39: ifeq -> 57
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: iconst_1
    //   50: goto -> 58
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: iconst_0
    //   58: invokestatic checkArgument : (Z)V
    //   61: aload_2
    //   62: instanceof me/rerere/matrix/thirdparty/com/google/gson/InstanceCreator
    //   65: ifeq -> 90
    //   68: aload_0
    //   69: getfield instanceCreators : Ljava/util/Map;
    //   72: aload_1
    //   73: aload_2
    //   74: checkcast me/rerere/matrix/thirdparty/com/google/gson/InstanceCreator
    //   77: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload_2
    //   91: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonSerializer
    //   94: ifne -> 111
    //   97: aload_2
    //   98: instanceof me/rerere/matrix/thirdparty/com/google/gson/JsonDeserializer
    //   101: ifeq -> 131
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: aload_1
    //   112: invokestatic get : (Ljava/lang/reflect/Type;)Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   115: astore_3
    //   116: aload_0
    //   117: getfield factories : Ljava/util/List;
    //   120: aload_3
    //   121: aload_2
    //   122: invokestatic newFactoryWithMatchRawType : (Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory;
    //   125: invokeinterface add : (Ljava/lang/Object;)Z
    //   130: pop
    //   131: aload_2
    //   132: instanceof me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   135: ifeq -> 166
    //   138: aload_0
    //   139: getfield factories : Ljava/util/List;
    //   142: aload_1
    //   143: invokestatic get : (Ljava/lang/reflect/Type;)Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;
    //   146: aload_2
    //   147: checkcast me/rerere/matrix/thirdparty/com/google/gson/TypeAdapter
    //   150: invokestatic newFactory : (Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapter;)Lme/rerere/matrix/thirdparty/com/google/gson/TypeAdapterFactory;
    //   153: invokeinterface add : (Ljava/lang/Object;)Z
    //   158: pop
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: aload_0
    //   167: areturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/RuntimeException
    //   7	28	31	java/lang/RuntimeException
    //   21	42	45	java/lang/RuntimeException
    //   35	53	53	java/lang/RuntimeException
    //   58	83	86	java/lang/RuntimeException
    //   90	104	107	java/lang/RuntimeException
    //   131	159	162	java/lang/RuntimeException
  }
  
  public GsonBuilder setDateFormat(int paramInt1, int paramInt2) {
    this.dateStyle = paramInt1;
    this.timeStyle = paramInt2;
    this.datePattern = null;
    return this;
  }
  
  public GsonBuilder setExclusionStrategies(ExclusionStrategy... paramVarArgs) {
    for (ExclusionStrategy exclusionStrategy : paramVarArgs)
      this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true); 
    return this;
  }
  
  public GsonBuilder excludeFieldsWithModifiers(int... paramVarArgs) {
    this.excluder = this.excluder.withModifiers(paramVarArgs);
    return this;
  }
  
  public GsonBuilder serializeNulls() {
    this.serializeNulls = true;
    return this;
  }
  
  public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy) {
    this.excluder = this.excluder.withExclusionStrategy(paramExclusionStrategy, true, false);
    return this;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\GsonBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */