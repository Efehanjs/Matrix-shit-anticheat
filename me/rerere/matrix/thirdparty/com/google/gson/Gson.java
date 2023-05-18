package me.rerere.matrix.thirdparty.com.google.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ConstructorConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Excluder;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Primitives;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Streams;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.ArrayTypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.DateTypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.JsonTreeReader;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.JsonTreeWriter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.MapTypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.ObjectTypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.SqlDateTypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.TimeTypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.internal.bind.TypeAdapters;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonReader;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonToken;
import me.rerere.matrix.thirdparty.com.google.gson.stream.JsonWriter;
import me.rerere.matrix.thirdparty.com.google.gson.stream.MalformedJsonException;

public final class Gson {
  public static final boolean DEFAULT_PRETTY_PRINT = false;
  
  public final boolean htmlSafe;
  
  public final boolean complexMapKeySerialization;
  
  public final LongSerializationPolicy longSerializationPolicy;
  
  public final List builderHierarchyFactories;
  
  public final boolean lenient;
  
  public static final boolean DEFAULT_LENIENT = false;
  
  public final Excluder excluder;
  
  public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
  
  public final boolean generateNonExecutableJson;
  
  public final boolean prettyPrinting;
  
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
  
  public final Map instanceCreators;
  
  public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
  
  private static final TypeToken NULL_KEY_SURROGATE;
  
  public final boolean serializeSpecialFloatingPointValues;
  
  private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
  
  private final Map typeTokenCache = new ConcurrentHashMap<Object, Object>();
  
  private final ConstructorConstructor constructorConstructor;
  
  public final boolean serializeNulls;
  
  private final ThreadLocal calls = new ThreadLocal();
  
  public final List factories;
  
  public final String datePattern;
  
  public final List builderFactories;
  
  public final int dateStyle;
  
  public static final boolean DEFAULT_SERIALIZE_NULLS = false;
  
  public final int timeStyle;
  
  public static final boolean DEFAULT_ESCAPE_HTML = true;
  
  public final FieldNamingStrategy fieldNamingStrategy;
  
  public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
  
  private static final long a = o3.a(1369592504606743826L, -8248914735378464199L, null).a(20390803743932L);
  
  public Object fromJson(Reader paramReader, Class paramClass) throws JsonSyntaxException, JsonIOException {
    JsonReader jsonReader = newJsonReader(paramReader);
    Object object = fromJson(jsonReader, paramClass);
    assertFullConsumption(object, jsonReader);
    return Primitives.wrap(paramClass).cast(object);
  }
  
  public Object fromJson(String paramString, Class paramClass) throws JsonSyntaxException {
    Object object = fromJson(paramString, paramClass);
    return Primitives.wrap(paramClass).cast(object);
  }
  
  public TypeAdapter getDelegateAdapter(TypeAdapterFactory paramTypeAdapterFactory, TypeToken paramTypeToken) {
    JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory;
    long l = a ^ 0x698CD3D618E8L;
    if (!this.factories.contains(paramTypeAdapterFactory))
      jsonAdapterAnnotationTypeAdapterFactory = this.jsonAdapterFactory; 
    boolean bool = false;
    for (TypeAdapterFactory typeAdapterFactory : this.factories) {
      try {
        if (!bool) {
          if (typeAdapterFactory == jsonAdapterAnnotationTypeAdapterFactory)
            bool = true; 
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      TypeAdapter typeAdapter = typeAdapterFactory.create(this, paramTypeToken);
      try {
        if (typeAdapter != null)
          return typeAdapter; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    throw new IllegalArgumentException("GSON cannot serialize " + paramTypeToken);
  }
  
  public Object fromJson(String paramString, Type paramType) throws JsonSyntaxException {
    try {
      if (paramString == null)
        return null; 
    } catch (JsonSyntaxException jsonSyntaxException) {
      throw a(null);
    } 
    StringReader stringReader = new StringReader(paramString);
    return fromJson(stringReader, paramType);
  }
  
  public Object fromJson(JsonElement paramJsonElement, Type paramType) throws JsonSyntaxException {
    try {
      if (paramJsonElement == null)
        return null; 
    } catch (JsonSyntaxException jsonSyntaxException) {
      throw a(null);
    } 
    return fromJson((JsonReader)new JsonTreeReader(paramJsonElement), paramType);
  }
  
  public void toJson(Object paramObject, Appendable paramAppendable) throws JsonIOException {
    try {
      if (paramObject != null) {
        toJson(paramObject, paramObject.getClass(), paramAppendable);
      } else {
        toJson(JsonNull.INSTANCE, paramAppendable);
      } 
    } catch (JsonIOException jsonIOException) {
      throw a(null);
    } 
  }
  
  public Excluder excluder() {
    return this.excluder;
  }
  
  public void toJson(JsonElement paramJsonElement, JsonWriter paramJsonWriter) throws JsonIOException {
    long l = a ^ 0x339DED5D140EL;
    boolean bool1 = paramJsonWriter.isLenient();
    paramJsonWriter.setLenient(true);
    boolean bool2 = paramJsonWriter.isHtmlSafe();
    paramJsonWriter.setHtmlSafe(this.htmlSafe);
    boolean bool3 = paramJsonWriter.getSerializeNulls();
    paramJsonWriter.setSerializeNulls(this.serializeNulls);
    try {
      Streams.write(paramJsonElement, paramJsonWriter);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } catch (AssertionError assertionError) {
      throw new AssertionError("AssertionError (GSON 2.8.5): " + assertionError.getMessage(), assertionError);
    } finally {
      paramJsonWriter.setLenient(bool1);
      paramJsonWriter.setHtmlSafe(bool2);
      paramJsonWriter.setSerializeNulls(bool3);
    } 
  }
  
  public GsonBuilder newBuilder() {
    return new GsonBuilder(this);
  }
  
  public void toJson(Object paramObject, Type paramType, JsonWriter paramJsonWriter) throws JsonIOException {
    long l = a ^ 0x1ADD7E0C5AB3L;
    TypeAdapter typeAdapter = getAdapter(TypeToken.get(paramType));
    boolean bool1 = paramJsonWriter.isLenient();
    paramJsonWriter.setLenient(true);
    boolean bool2 = paramJsonWriter.isHtmlSafe();
    paramJsonWriter.setHtmlSafe(this.htmlSafe);
    boolean bool3 = paramJsonWriter.getSerializeNulls();
    paramJsonWriter.setSerializeNulls(this.serializeNulls);
    try {
      typeAdapter.write(paramJsonWriter, paramObject);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } catch (AssertionError assertionError) {
      throw new AssertionError("AssertionError (GSON 2.8.5): " + assertionError.getMessage(), assertionError);
    } finally {
      paramJsonWriter.setLenient(bool1);
      paramJsonWriter.setHtmlSafe(bool2);
      paramJsonWriter.setSerializeNulls(bool3);
    } 
  }
  
  public boolean serializeNulls() {
    return this.serializeNulls;
  }
  
  public TypeAdapter getAdapter(Class paramClass) {
    return getAdapter(TypeToken.get(paramClass));
  }
  
  public JsonElement toJsonTree(Object paramObject, Type paramType) {
    JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
    toJson(paramObject, paramType, (JsonWriter)jsonTreeWriter);
    return jsonTreeWriter.get();
  }
  
  public TypeAdapter getAdapter(TypeToken paramTypeToken) {
    long l = a ^ 0x56D551831108L;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    TypeAdapter typeAdapter = (TypeAdapter)this.typeTokenCache.get((paramTypeToken == null) ? NULL_KEY_SURROGATE : paramTypeToken);
    try {
      if (typeAdapter != null)
        return typeAdapter; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Map<Object, Object> map = this.calls.get();
    boolean bool = false;
    if (map == null) {
      map = new HashMap<Object, Object>();
      this.calls.set(map);
      bool = true;
    } 
    Gson$FutureTypeAdapter gson$FutureTypeAdapter = (Gson$FutureTypeAdapter)map.get(paramTypeToken);
    try {
      if (gson$FutureTypeAdapter != null)
        return gson$FutureTypeAdapter; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      Gson$FutureTypeAdapter gson$FutureTypeAdapter1 = new Gson$FutureTypeAdapter();
      map.put(paramTypeToken, gson$FutureTypeAdapter1);
      for (TypeAdapterFactory typeAdapterFactory : this.factories) {
        TypeAdapter typeAdapter1 = typeAdapterFactory.create(this, paramTypeToken);
        if (typeAdapter1 != null) {
          gson$FutureTypeAdapter1.setDelegate(typeAdapter1);
          this.typeTokenCache.put(paramTypeToken, typeAdapter1);
          return typeAdapter1;
        } 
      } 
      throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + paramTypeToken);
    } finally {
      try {
        map.remove(paramTypeToken);
        if (bool)
          this.calls.remove(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public Gson(Excluder paramExcluder, FieldNamingStrategy paramFieldNamingStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, LongSerializationPolicy paramLongSerializationPolicy, String paramString, int paramInt1, int paramInt2, List paramList1, List paramList2, List<? extends TypeAdapterFactory> paramList3) {
    this.excluder = paramExcluder;
    this.fieldNamingStrategy = paramFieldNamingStrategy;
    this.instanceCreators = paramMap;
    this.constructorConstructor = new ConstructorConstructor(paramMap);
    this.serializeNulls = paramBoolean1;
    this.complexMapKeySerialization = paramBoolean2;
    this.generateNonExecutableJson = paramBoolean3;
    this.htmlSafe = paramBoolean4;
    this.prettyPrinting = paramBoolean5;
    this.lenient = paramBoolean6;
    this.serializeSpecialFloatingPointValues = paramBoolean7;
    this.longSerializationPolicy = paramLongSerializationPolicy;
    this.datePattern = paramString;
    this.dateStyle = paramInt1;
    this.timeStyle = paramInt2;
    this.builderFactories = paramList1;
    this.builderHierarchyFactories = paramList2;
    ArrayList<TypeAdapterFactory> arrayList = new ArrayList();
    arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
    arrayList.add(ObjectTypeAdapter.FACTORY);
    arrayList.add(paramExcluder);
    arrayList.addAll(paramList3);
    arrayList.add(TypeAdapters.STRING_FACTORY);
    arrayList.add(TypeAdapters.INTEGER_FACTORY);
    arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
    arrayList.add(TypeAdapters.BYTE_FACTORY);
    arrayList.add(TypeAdapters.SHORT_FACTORY);
    TypeAdapter typeAdapter = longAdapter(paramLongSerializationPolicy);
    arrayList.add(TypeAdapters.newFactory(long.class, Long.class, typeAdapter));
    arrayList.add(TypeAdapters.newFactory(double.class, Double.class, doubleAdapter(paramBoolean7)));
    arrayList.add(TypeAdapters.newFactory(float.class, Float.class, floatAdapter(paramBoolean7)));
    arrayList.add(TypeAdapters.NUMBER_FACTORY);
    arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
    arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
    arrayList.add(TypeAdapters.newFactory(AtomicLong.class, atomicLongAdapter(typeAdapter)));
    arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, atomicLongArrayAdapter(typeAdapter)));
    arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
    arrayList.add(TypeAdapters.CHARACTER_FACTORY);
    arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
    arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
    arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
    arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
    arrayList.add(TypeAdapters.URL_FACTORY);
    arrayList.add(TypeAdapters.URI_FACTORY);
    arrayList.add(TypeAdapters.UUID_FACTORY);
    arrayList.add(TypeAdapters.CURRENCY_FACTORY);
    arrayList.add(TypeAdapters.LOCALE_FACTORY);
    arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
    arrayList.add(TypeAdapters.BIT_SET_FACTORY);
    arrayList.add(DateTypeAdapter.FACTORY);
    arrayList.add(TypeAdapters.CALENDAR_FACTORY);
    arrayList.add(TimeTypeAdapter.FACTORY);
    arrayList.add(SqlDateTypeAdapter.FACTORY);
    arrayList.add(TypeAdapters.TIMESTAMP_FACTORY);
    arrayList.add(ArrayTypeAdapter.FACTORY);
    arrayList.add(TypeAdapters.CLASS_FACTORY);
    arrayList.add(new CollectionTypeAdapterFactory(this.constructorConstructor));
    arrayList.add(new MapTypeAdapterFactory(this.constructorConstructor, paramBoolean2));
    this.jsonAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.constructorConstructor);
    arrayList.add(this.jsonAdapterFactory);
    arrayList.add(TypeAdapters.ENUM_FACTORY);
    arrayList.add(new ReflectiveTypeAdapterFactory(this.constructorConstructor, paramFieldNamingStrategy, paramExcluder, this.jsonAdapterFactory));
    this.factories = Collections.unmodifiableList(arrayList);
  }
  
  public FieldNamingStrategy fieldNamingStrategy() {
    return this.fieldNamingStrategy;
  }
  
  public Object fromJson(JsonReader paramJsonReader, Type paramType) throws JsonIOException, JsonSyntaxException {
    long l = a ^ 0x6B413C049747L;
    boolean bool = true;
    boolean bool1 = paramJsonReader.isLenient();
    paramJsonReader.setLenient(true);
    try {
      paramJsonReader.peek();
      bool = false;
      TypeToken typeToken = TypeToken.get(paramType);
      TypeAdapter typeAdapter = getAdapter(typeToken);
      Object object = typeAdapter.read(paramJsonReader);
      return object;
    } catch (EOFException eOFException) {
      if (bool)
        return null; 
      throw new JsonSyntaxException(eOFException);
    } catch (IllegalStateException illegalStateException) {
      throw new JsonSyntaxException(illegalStateException);
    } catch (IOException iOException) {
      throw new JsonSyntaxException(iOException);
    } catch (AssertionError assertionError) {
      throw new AssertionError("AssertionError (GSON 2.8.5): " + assertionError.getMessage(), assertionError);
    } finally {
      paramJsonReader.setLenient(bool1);
    } 
  }
  
  public JsonWriter newJsonWriter(Writer paramWriter) throws IOException {
    long l = a ^ 0x70A091423FE7L;
    try {
      if (this.generateNonExecutableJson)
        paramWriter.write(")]}'\n"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    JsonWriter jsonWriter = new JsonWriter(paramWriter);
    try {
      if (this.prettyPrinting)
        jsonWriter.setIndent("  "); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    jsonWriter.setSerializeNulls(this.serializeNulls);
    return jsonWriter;
  }
  
  public Gson() {
    this(Excluder.DEFAULT, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
  }
  
  public JsonElement toJsonTree(Object paramObject) {
    try {
      if (paramObject == null)
        return JsonNull.INSTANCE; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return toJsonTree(paramObject, paramObject.getClass());
  }
  
  public Object fromJson(Reader paramReader, Type paramType) throws JsonIOException, JsonSyntaxException {
    JsonReader jsonReader = newJsonReader(paramReader);
    Object object = fromJson(jsonReader, paramType);
    assertFullConsumption(object, jsonReader);
    return object;
  }
  
  public static void checkValidFloatingPoint(double paramDouble) {
    long l = a ^ 0x72064B2F8E5AL;
    try {
      if (!Double.isNaN(paramDouble))
        try {
          if (!Double.isInfinite(paramDouble))
            return; 
          throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
  }
  
  public String toJson(Object paramObject, Type paramType) {
    StringWriter stringWriter = new StringWriter();
    toJson(paramObject, paramType, stringWriter);
    return stringWriter.toString();
  }
  
  public String toJson(Object paramObject) {
    try {
      if (paramObject == null)
        return toJson(JsonNull.INSTANCE); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return toJson(paramObject, paramObject.getClass());
  }
  
  public Object fromJson(JsonElement paramJsonElement, Class paramClass) throws JsonSyntaxException {
    Object object = fromJson(paramJsonElement, paramClass);
    return Primitives.wrap(paramClass).cast(object);
  }
  
  public String toJson(JsonElement paramJsonElement) {
    StringWriter stringWriter = new StringWriter();
    toJson(paramJsonElement, stringWriter);
    return stringWriter.toString();
  }
  
  public JsonReader newJsonReader(Reader paramReader) {
    JsonReader jsonReader = new JsonReader(paramReader);
    jsonReader.setLenient(this.lenient);
    return jsonReader;
  }
  
  public boolean htmlSafe() {
    return this.htmlSafe;
  }
  
  public void toJson(Object paramObject, Type paramType, Appendable paramAppendable) throws JsonIOException {
    try {
      JsonWriter jsonWriter = newJsonWriter(Streams.writerForAppendable(paramAppendable));
      toJson(paramObject, paramType, jsonWriter);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } 
  }
  
  public String toString() {
    long l = a ^ 0x758B6E576B7FL;
    return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
  }
  
  static {
    NULL_KEY_SURROGATE = TypeToken.get(Object.class);
  }
  
  public void toJson(JsonElement paramJsonElement, Appendable paramAppendable) throws JsonIOException {
    try {
      JsonWriter jsonWriter = newJsonWriter(Streams.writerForAppendable(paramAppendable));
      toJson(paramJsonElement, jsonWriter);
    } catch (IOException iOException) {
      throw new JsonIOException(iOException);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\Gson.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */