package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.KotlinNothingValueException;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmClassMappingKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.KotlinReflectionNotSupportedError;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function10;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function11;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function12;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function13;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function14;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function15;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function16;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function17;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function18;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function19;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function20;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function21;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function22;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function4;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function5;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function6;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function7;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function8;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function9;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClass;
import me.rerere.matrix.thirdparty.kotlin.reflect.KVisibility;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ClassReference implements KClass, ClassBasedDeclarationContainer {
  @NotNull
  private static final Map simpleNames;
  
  @NotNull
  private static final HashMap primitiveFqNames;
  
  @NotNull
  public static final ClassReference$Companion Companion;
  
  @NotNull
  private static final HashMap classFqNames;
  
  @NotNull
  private static final Map FUNCTION_CLASSES;
  
  @NotNull
  private final Class jClass;
  
  @NotNull
  private static final HashMap primitiveWrapperFqNames;
  
  private static final long a = o3.a(-5726460124740519060L, 7400431005478316768L, null).a(119697981965439L);
  
  @Nullable
  public String getSimpleName() {
    return Companion.getClassSimpleName(getJClass());
  }
  
  public boolean isSealed() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public ClassReference(@NotNull Class paramClass) {
    this.jClass = paramClass;
  }
  
  static {
    long l = a ^ 0x274F3D5C219CL;
    Companion = new ClassReference$Companion(null);
    Class[] arrayOfClass = new Class[23];
    arrayOfClass[0] = Function0.class;
    arrayOfClass[1] = Function1.class;
    arrayOfClass[2] = Function2.class;
    arrayOfClass[3] = Function3.class;
    arrayOfClass[4] = Function4.class;
    arrayOfClass[5] = Function5.class;
    arrayOfClass[6] = Function6.class;
    arrayOfClass[7] = Function7.class;
    arrayOfClass[8] = Function8.class;
    arrayOfClass[9] = Function9.class;
    arrayOfClass[10] = Function10.class;
    arrayOfClass[11] = Function11.class;
    arrayOfClass[12] = Function12.class;
    arrayOfClass[13] = Function13.class;
    arrayOfClass[14] = Function14.class;
    arrayOfClass[15] = Function15.class;
    arrayOfClass[16] = Function16.class;
    arrayOfClass[17] = Function17.class;
    arrayOfClass[18] = Function18.class;
    arrayOfClass[19] = Function19.class;
    arrayOfClass[20] = Function20.class;
    arrayOfClass[21] = Function21.class;
    arrayOfClass[22] = Function22.class;
    List list1 = CollectionsKt.listOf((Object[])arrayOfClass);
    boolean bool2 = false;
    List list2 = list1;
    ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
    boolean bool4 = false;
    byte b = 0;
    for (Class clazz1 : list2) {
      byte b1 = b++;
      try {
        if (b1 < 0)
          CollectionsKt.throwIndexOverflow(); 
      } catch (KotlinNothingValueException kotlinNothingValueException) {
        throw a(null);
      } 
      Class clazz2 = clazz1;
      byte b2 = b1;
      ArrayList<Pair> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(TuplesKt.to(clazz2, Integer.valueOf(b2)));
    } 
    FUNCTION_CLASSES = MapsKt.toMap(arrayList);
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    HashMap<Object, Object> hashMap2 = hashMap1;
    boolean bool3 = false;
    hashMap2.put("boolean", "me.rerere.matrix.thirdparty.kotlin.Boolean");
    hashMap2.put("char", "me.rerere.matrix.thirdparty.kotlin.Char");
    hashMap2.put("byte", "me.rerere.matrix.thirdparty.kotlin.Byte");
    hashMap2.put("short", "me.rerere.matrix.thirdparty.kotlin.Short");
    hashMap2.put("int", "me.rerere.matrix.thirdparty.kotlin.Int");
    hashMap2.put("float", "me.rerere.matrix.thirdparty.kotlin.Float");
    hashMap2.put("long", "me.rerere.matrix.thirdparty.kotlin.Long");
    hashMap2.put("double", "me.rerere.matrix.thirdparty.kotlin.Double");
    primitiveFqNames = hashMap1;
    hashMap1 = new HashMap<Object, Object>();
    hashMap2 = hashMap1;
    bool3 = false;
    hashMap2.put("java.lang.Boolean", "me.rerere.matrix.thirdparty.kotlin.Boolean");
    hashMap2.put("java.lang.Character", "me.rerere.matrix.thirdparty.kotlin.Char");
    hashMap2.put("java.lang.Byte", "me.rerere.matrix.thirdparty.kotlin.Byte");
    hashMap2.put("java.lang.Short", "me.rerere.matrix.thirdparty.kotlin.Short");
    hashMap2.put("java.lang.Integer", "me.rerere.matrix.thirdparty.kotlin.Int");
    hashMap2.put("java.lang.Float", "me.rerere.matrix.thirdparty.kotlin.Float");
    hashMap2.put("java.lang.Long", "me.rerere.matrix.thirdparty.kotlin.Long");
    hashMap2.put("java.lang.Double", "me.rerere.matrix.thirdparty.kotlin.Double");
    primitiveWrapperFqNames = hashMap1;
    hashMap1 = new HashMap<Object, Object>();
    hashMap2 = hashMap1;
    bool3 = false;
    hashMap2.put("java.lang.Object", "me.rerere.matrix.thirdparty.kotlin.Any");
    hashMap2.put("java.lang.String", "me.rerere.matrix.thirdparty.kotlin.String");
    hashMap2.put("java.lang.CharSequence", "me.rerere.matrix.thirdparty.kotlin.CharSequence");
    hashMap2.put("java.lang.Throwable", "me.rerere.matrix.thirdparty.kotlin.Throwable");
    hashMap2.put("java.lang.Cloneable", "me.rerere.matrix.thirdparty.kotlin.Cloneable");
    hashMap2.put("java.lang.Number", "me.rerere.matrix.thirdparty.kotlin.Number");
    hashMap2.put("java.lang.Comparable", "me.rerere.matrix.thirdparty.kotlin.Comparable");
    hashMap2.put("java.lang.Enum", "me.rerere.matrix.thirdparty.kotlin.Enum");
    hashMap2.put("java.lang.annotation.Annotation", "me.rerere.matrix.thirdparty.kotlin.Annotation");
    hashMap2.put("java.lang.Iterable", "me.rerere.matrix.thirdparty.kotlin.collections.Iterable");
    hashMap2.put("java.util.Iterator", "me.rerere.matrix.thirdparty.kotlin.collections.Iterator");
    hashMap2.put("java.util.Collection", "me.rerere.matrix.thirdparty.kotlin.collections.Collection");
    hashMap2.put("java.util.List", "me.rerere.matrix.thirdparty.kotlin.collections.List");
    hashMap2.put("java.util.Set", "me.rerere.matrix.thirdparty.kotlin.collections.Set");
    hashMap2.put("java.util.ListIterator", "me.rerere.matrix.thirdparty.kotlin.collections.ListIterator");
    hashMap2.put("java.util.Map", "me.rerere.matrix.thirdparty.kotlin.collections.Map");
    hashMap2.put("java.util.Map$Entry", "me.rerere.matrix.thirdparty.kotlin.collections.Map.Entry");
    hashMap2.put("me.rerere.matrix.thirdparty.kotlin.jvm.internal.StringCompanionObject", "me.rerere.matrix.thirdparty.kotlin.String.Companion");
    hashMap2.put("me.rerere.matrix.thirdparty.kotlin.jvm.internal.EnumCompanionObject", "me.rerere.matrix.thirdparty.kotlin.Enum.Companion");
    hashMap2.putAll(primitiveFqNames);
    hashMap2.putAll(primitiveWrapperFqNames);
    Intrinsics.checkNotNullExpressionValue(primitiveFqNames.values(), "primitiveFqNames.values");
    Collection collection = primitiveFqNames.values();
    bool4 = false;
    for (String str1 : collection) {
      HashMap<Object, Object> hashMap = hashMap2;
      String str2 = str1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(str2, "me.rerere.matrix.thirdparty.kotlinName");
      Pair pair = TuplesKt.to("me.rerere.matrix.thirdparty.kotlin.jvm.internal." + StringsKt.substringAfterLast$default(str2, '.', null, 2, null) + "CompanionObject", str2 + ".Companion");
      hashMap.put(pair.getFirst(), pair.getSecond());
    } 
    for (Map.Entry entry : FUNCTION_CLASSES.entrySet()) {
      Class clazz = (Class)entry.getKey();
      int i = ((Number)entry.getValue()).intValue();
      hashMap2.put(clazz.getName(), "me.rerere.matrix.thirdparty.kotlin.Function" + i);
    } 
    classFqNames = hashMap1;
    hashMap1 = classFqNames;
    boolean bool1 = false;
    HashMap<Object, Object> hashMap3 = hashMap1;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(MapsKt.mapCapacity(hashMap1.size()));
    bool4 = false;
    Set<Map.Entry<Object, Object>> set = hashMap3.entrySet();
    boolean bool5 = false;
    for (Map.Entry<Object, Object> entry1 : set) {
      Map.Entry entry = entry1;
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool6 = false;
      Map.Entry<Object, Object> entry2 = entry1;
      Object object = entry.getKey();
      LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1;
      boolean bool7 = false;
      String str1 = (String)entry2.getValue();
      String str2 = StringsKt.substringAfterLast$default(str1, '.', null, 2, null);
      linkedHashMap2.put(object, str2);
    } 
    simpleNames = linkedHashMap;
  }
  
  public boolean isValue() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @NotNull
  public Collection getNestedClasses() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isInstance(@Nullable Object paramObject) {
    return Companion.isInstance(paramObject, getJClass());
  }
  
  public boolean isCompanion() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof ClassReference)
        try {
          if (Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass)paramObject)));
        } catch (KotlinNothingValueException kotlinNothingValueException) {
          throw a(null);
        }  
    } catch (KotlinNothingValueException kotlinNothingValueException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public List getSupertypes() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public boolean isData() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x418E6230F27FL;
    return getJClass().toString() + " (Kotlin reflection is not available)";
  }
  
  @NotNull
  public Collection getMembers() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public boolean isFun() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @NotNull
  public List getAnnotations() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public boolean isOpen() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public boolean isFinal() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public boolean isAbstract() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @NotNull
  public Class getJClass() {
    return this.jClass;
  }
  
  @NotNull
  public List getSealedSubclasses() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @Nullable
  public String getQualifiedName() {
    return Companion.getClassQualifiedName(getJClass());
  }
  
  public boolean isInner() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @Nullable
  public KVisibility getVisibility() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @NotNull
  public List getTypeParameters() {
    error();
    throw new KotlinNothingValueException();
  }
  
  public int hashCode() {
    return JvmClassMappingKt.getJavaObjectType(this).hashCode();
  }
  
  @NotNull
  public Collection getConstructors() {
    error();
    throw new KotlinNothingValueException();
  }
  
  @Nullable
  public Object getObjectInstance() {
    error();
    throw new KotlinNothingValueException();
  }
  
  private static KotlinNothingValueException a(KotlinNothingValueException paramKotlinNothingValueException) {
    return paramKotlinNothingValueException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ClassReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */