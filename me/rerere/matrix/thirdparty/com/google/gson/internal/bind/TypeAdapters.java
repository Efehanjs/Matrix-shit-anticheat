package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import me.rerere.matrix.thirdparty.com.google.gson.JsonElement;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class TypeAdapters {
  public static final TypeAdapter LONG;
  
  public static final TypeAdapterFactory URL_FACTORY;
  
  public static final TypeAdapter BYTE;
  
  public static final TypeAdapter ATOMIC_BOOLEAN;
  
  public static final TypeAdapter URL;
  
  public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
  
  public static final TypeAdapter JSON_ELEMENT;
  
  public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
  
  public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
  
  public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
  
  public static final TypeAdapter CURRENCY;
  
  public static final TypeAdapter BIT_SET;
  
  public static final TypeAdapter STRING;
  
  public static final TypeAdapter STRING_BUFFER;
  
  public static final TypeAdapter INTEGER;
  
  public static final TypeAdapter STRING_BUILDER;
  
  public static final TypeAdapterFactory ENUM_FACTORY;
  
  public static final TypeAdapter CALENDAR;
  
  public static final TypeAdapterFactory LOCALE_FACTORY;
  
  public static final TypeAdapterFactory NUMBER_FACTORY;
  
  public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
  
  public static final TypeAdapterFactory UUID_FACTORY;
  
  public static final TypeAdapter SHORT;
  
  public static final TypeAdapterFactory CALENDAR_FACTORY;
  
  public static final TypeAdapterFactory BOOLEAN_FACTORY;
  
  public static final TypeAdapter BIG_INTEGER;
  
  public static final TypeAdapter CLASS = (new TypeAdapters$1()).nullSafe();
  
  public static final TypeAdapterFactory STRING_FACTORY;
  
  public static final TypeAdapterFactory URI_FACTORY;
  
  public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
  
  public static final TypeAdapterFactory CLASS_FACTORY = newFactory(Class.class, CLASS);
  
  public static final TypeAdapter UUID;
  
  public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
  
  public static final TypeAdapter BIG_DECIMAL;
  
  public static final TypeAdapterFactory CHARACTER_FACTORY;
  
  public static final TypeAdapterFactory SHORT_FACTORY;
  
  public static final TypeAdapter NUMBER;
  
  public static final TypeAdapter DOUBLE;
  
  public static final TypeAdapter BOOLEAN;
  
  public static final TypeAdapter INET_ADDRESS;
  
  public static final TypeAdapter BOOLEAN_AS_STRING;
  
  public static final TypeAdapterFactory BIT_SET_FACTORY;
  
  public static final TypeAdapter URI;
  
  public static final TypeAdapter FLOAT;
  
  public static final TypeAdapter LOCALE;
  
  public static final TypeAdapterFactory BYTE_FACTORY;
  
  public static final TypeAdapterFactory TIMESTAMP_FACTORY;
  
  public static final TypeAdapterFactory CURRENCY_FACTORY;
  
  public static final TypeAdapter CHARACTER;
  
  public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
  
  public static final TypeAdapter ATOMIC_INTEGER;
  
  public static final TypeAdapterFactory INTEGER_FACTORY;
  
  public static TypeAdapterFactory newTypeHierarchyFactory(Class paramClass, TypeAdapter paramTypeAdapter) {
    return new TypeAdapters$35(paramClass, paramTypeAdapter);
  }
  
  static {
    BIT_SET = (new TypeAdapters$2()).nullSafe();
    BIT_SET_FACTORY = newFactory(BitSet.class, BIT_SET);
    BOOLEAN = new TypeAdapters$3();
    BOOLEAN_AS_STRING = new TypeAdapters$4();
    BOOLEAN_FACTORY = newFactory(boolean.class, Boolean.class, BOOLEAN);
    BYTE = new TypeAdapters$5();
    BYTE_FACTORY = newFactory(byte.class, Byte.class, BYTE);
    SHORT = new TypeAdapters$6();
    SHORT_FACTORY = newFactory(short.class, Short.class, SHORT);
    INTEGER = new TypeAdapters$7();
    INTEGER_FACTORY = newFactory(int.class, Integer.class, INTEGER);
    ATOMIC_INTEGER = (new TypeAdapters$8()).nullSafe();
    ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, ATOMIC_INTEGER);
    ATOMIC_BOOLEAN = (new TypeAdapters$9()).nullSafe();
    ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, ATOMIC_BOOLEAN);
    ATOMIC_INTEGER_ARRAY = (new TypeAdapters$10()).nullSafe();
    ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, ATOMIC_INTEGER_ARRAY);
    LONG = new TypeAdapters$11();
    FLOAT = new TypeAdapters$12();
    DOUBLE = new TypeAdapters$13();
    NUMBER = new TypeAdapters$14();
    NUMBER_FACTORY = newFactory(Number.class, NUMBER);
    CHARACTER = new TypeAdapters$15();
    CHARACTER_FACTORY = newFactory(char.class, Character.class, CHARACTER);
    STRING = new TypeAdapters$16();
    BIG_DECIMAL = new TypeAdapters$17();
    BIG_INTEGER = new TypeAdapters$18();
    STRING_FACTORY = newFactory(String.class, STRING);
    STRING_BUILDER = new TypeAdapters$19();
    STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, STRING_BUILDER);
    STRING_BUFFER = new TypeAdapters$20();
    STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, STRING_BUFFER);
    URL = new TypeAdapters$21();
    URL_FACTORY = newFactory(URL.class, URL);
    URI = new TypeAdapters$22();
    URI_FACTORY = newFactory(URI.class, URI);
    INET_ADDRESS = new TypeAdapters$23();
    INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, INET_ADDRESS);
    UUID = new TypeAdapters$24();
    UUID_FACTORY = newFactory(UUID.class, UUID);
    CURRENCY = (new TypeAdapters$25()).nullSafe();
    CURRENCY_FACTORY = newFactory(Currency.class, CURRENCY);
    TIMESTAMP_FACTORY = new TypeAdapters$26();
    CALENDAR = new TypeAdapters$27();
    CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, CALENDAR);
    LOCALE = new TypeAdapters$28();
    LOCALE_FACTORY = newFactory(Locale.class, LOCALE);
    JSON_ELEMENT = new TypeAdapters$29();
    JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT);
    ENUM_FACTORY = new TypeAdapters$30();
  }
  
  public static TypeAdapterFactory newFactory(TypeToken paramTypeToken, TypeAdapter paramTypeAdapter) {
    return new TypeAdapters$31(paramTypeToken, paramTypeAdapter);
  }
  
  public static TypeAdapterFactory newFactory(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter) {
    return new TypeAdapters$33(paramClass1, paramClass2, paramTypeAdapter);
  }
  
  public static TypeAdapterFactory newFactory(Class paramClass, TypeAdapter paramTypeAdapter) {
    return new TypeAdapters$32(paramClass, paramTypeAdapter);
  }
  
  public static TypeAdapterFactory newFactoryForMultipleTypes(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter) {
    return new TypeAdapters$34(paramClass1, paramClass2, paramTypeAdapter);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\TypeAdapters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */