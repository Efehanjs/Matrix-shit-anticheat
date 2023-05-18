package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableMap;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MapBuilder implements Map, Serializable, KMutableMap {
  private int length;
  
  private int hashShift;
  
  @Deprecated
  private static final int INITIAL_CAPACITY = 8;
  
  @NotNull
  private Object[] keysArray;
  
  private boolean isReadOnly;
  
  @Nullable
  private MapBuilderKeys keysView;
  
  @NotNull
  private static final MapBuilder$Companion Companion;
  
  @Nullable
  private MapBuilderValues valuesView;
  
  private int size;
  
  private int maxProbeDistance;
  
  @Nullable
  private MapBuilderEntries entriesView;
  
  @NotNull
  private int[] presenceArray;
  
  @Deprecated
  private static final int TOMBSTONE = -1;
  
  @NotNull
  private int[] hashArray;
  
  @Deprecated
  private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
  
  @Nullable
  private Object[] valuesArray;
  
  @Deprecated
  private static final int MAGIC = -1640531527;
  
  private static final long a = o3.a(5560305588106772204L, -2366362647445094261L, null).a(240622440336385L);
  
  public final boolean containsEntry$kotlin_stdlib(@NotNull Map.Entry paramEntry) {
    long l = a ^ 0x6882B5AE6721L;
    Intrinsics.checkNotNullParameter(paramEntry, "entry");
    int i = findKey(paramEntry.getKey());
    try {
      if (i < 0)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.valuesArray);
    return Intrinsics.areEqual(this.valuesArray[i], paramEntry.getValue());
  }
  
  public final int removeKey$kotlin_stdlib(Object paramObject) {
    checkIsMutable$kotlin_stdlib();
    int i = findKey(paramObject);
    try {
      if (i < 0)
        return -1; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    removeKeyAt(i);
    return i;
  }
  
  public void putAll(@NotNull Map paramMap) {
    long l = a ^ 0x3E62321B8F55L;
    Intrinsics.checkNotNullParameter(paramMap, "from");
    checkIsMutable$kotlin_stdlib();
    putAllEntries(paramMap.entrySet());
  }
  
  public final boolean isReadOnly$kotlin_stdlib() {
    return this.isReadOnly;
  }
  
  @NotNull
  public final MapBuilder$KeysItr keysIterator$kotlin_stdlib() {
    return new MapBuilder$KeysItr(this);
  }
  
  public int hashCode() {
    int i = 0;
    MapBuilder$EntriesItr mapBuilder$EntriesItr = entriesIterator$kotlin_stdlib();
    while (mapBuilder$EntriesItr.hasNext())
      i += mapBuilder$EntriesItr.nextHashCode$kotlin_stdlib(); 
    return i;
  }
  
  @NotNull
  public Set getKeys() {
    MapBuilderKeys mapBuilderKeys1 = this.keysView;
    MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this);
    this.keysView = mapBuilderKeys2;
    return (mapBuilderKeys1 == null) ? mapBuilderKeys2 : mapBuilderKeys1;
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (size() == 0);
  }
  
  public boolean containsKey(Object paramObject) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (findKey(paramObject) >= 0);
  }
  
  @NotNull
  public Set getEntries() {
    MapBuilderEntries mapBuilderEntries = this.entriesView;
    if (mapBuilderEntries == null) {
      MapBuilderEntries mapBuilderEntries1 = new MapBuilderEntries(this);
      this.entriesView = mapBuilderEntries1;
      return (Set)mapBuilderEntries1;
    } 
    return (Set)mapBuilderEntries;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x6DB731793067L;
    StringBuilder stringBuilder = new StringBuilder(2 + size() * 3);
    stringBuilder.append("{");
    byte b = 0;
    MapBuilder$EntriesItr mapBuilder$EntriesItr = entriesIterator$kotlin_stdlib();
    while (true) {
      try {
        if (mapBuilder$EntriesItr.hasNext()) {
          try {
            if (b)
              stringBuilder.append(", "); 
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
          mapBuilder$EntriesItr.nextAppendString(stringBuilder);
          b++;
          continue;
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      stringBuilder.append("}");
      Intrinsics.checkNotNullExpressionValue(stringBuilder.toString(), "sb.toString()");
      return stringBuilder.toString();
    } 
  }
  
  @NotNull
  public Collection getValues() {
    MapBuilderValues mapBuilderValues1 = this.valuesView;
    MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
    this.valuesView = mapBuilderValues2;
    return (mapBuilderValues1 == null) ? mapBuilderValues2 : mapBuilderValues1;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject != this) {
        try {
          if (paramObject instanceof Map)
            try {
              if (contentEquals((Map)paramObject));
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public final int addKey$kotlin_stdlib(Object paramObject) {
    checkIsMutable$kotlin_stdlib();
    label36: while (true) {
      int i = hash(paramObject);
      int j = RangesKt.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
      byte b = 0;
      while (true) {
        int k = this.hashArray[i];
        try {
          if (k <= 0) {
            try {
              if (this.length >= getCapacity()) {
                ensureExtraCapacity(1);
                continue label36;
              } 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            int n = this.length;
            this.length = n + 1;
            int m = n;
            this.keysArray[m] = paramObject;
            this.presenceArray[m] = i;
            this.hashArray[i] = m + 1;
            n = size();
            try {
              this.size = n + 1;
              if (b > this.maxProbeDistance)
                this.maxProbeDistance = b; 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            return m;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        try {
          if (Intrinsics.areEqual(this.keysArray[k - 1], paramObject))
            return -k; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        try {
          if (++b > j) {
            rehash(getHashSize() * 2);
            continue label36;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        if (i-- == 0)
          i = getHashSize() - 1; 
      } 
      break;
    } 
  }
  
  @NotNull
  public final Map build() {
    checkIsMutable$kotlin_stdlib();
    this.isReadOnly = true;
    return this;
  }
  
  @Nullable
  public Object put(Object paramObject1, Object paramObject2) {
    checkIsMutable$kotlin_stdlib();
    int i = addKey$kotlin_stdlib(paramObject1);
    Object[] arrayOfObject = allocateValuesArray();
    if (i < 0) {
      Object object = arrayOfObject[-i - 1];
      arrayOfObject[-i - 1] = paramObject2;
      return object;
    } 
    arrayOfObject[i] = paramObject2;
    return null;
  }
  
  @Nullable
  public Object get(Object paramObject) {
    int i = findKey(paramObject);
    try {
      if (i < 0)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.valuesArray);
    return this.valuesArray[i];
  }
  
  public int getSize() {
    return this.size;
  }
  
  public final boolean removeEntry$kotlin_stdlib(@NotNull Map.Entry paramEntry) {
    long l = a ^ 0x3F6011B1F5C2L;
    Intrinsics.checkNotNullParameter(paramEntry, "entry");
    checkIsMutable$kotlin_stdlib();
    int i = findKey(paramEntry.getKey());
    try {
      if (i < 0)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(this.valuesArray);
      if (!Intrinsics.areEqual(this.valuesArray[i], paramEntry.getValue()))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    removeKeyAt(i);
    return true;
  }
  
  @NotNull
  public final MapBuilder$EntriesItr entriesIterator$kotlin_stdlib() {
    return new MapBuilder$EntriesItr(this);
  }
  
  @Nullable
  public Object remove(Object paramObject) {
    int i = removeKey$kotlin_stdlib(paramObject);
    try {
      if (i < 0)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.valuesArray);
    Object[] arrayOfObject = this.valuesArray;
    Object object = arrayOfObject[i];
    ListBuilderKt.resetAt(arrayOfObject, i);
    return object;
  }
  
  public boolean containsValue(Object paramObject) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (findValue(paramObject) >= 0);
  }
  
  public void clear() {
    checkIsMutable$kotlin_stdlib();
    IntIterator intIterator = (new IntRange(0, this.length - 1)).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      int j = this.presenceArray[i];
      if (j >= 0) {
        this.hashArray[j] = 0;
        this.presenceArray[i] = -1;
      } 
    } 
    try {
      ListBuilderKt.resetRange(this.keysArray, 0, this.length);
      if (this.valuesArray != null) {
        ListBuilderKt.resetRange(this.valuesArray, 0, this.length);
      } else {
      
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.size = 0;
    this.length = 0;
  }
  
  public MapBuilder(int paramInt) {
    this(ListBuilderKt.arrayOfUninitializedElements(paramInt), null, new int[paramInt], new int[MapBuilder$Companion.access$computeHashSize(Companion, paramInt)], 2, 0);
  }
  
  public final boolean removeValue$kotlin_stdlib(Object paramObject) {
    checkIsMutable$kotlin_stdlib();
    int i = findValue(paramObject);
    try {
      if (i < 0)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    removeKeyAt(i);
    return true;
  }
  
  public final boolean containsAllEntries$kotlin_stdlib(@NotNull Collection paramCollection) {
    Intrinsics.checkNotNullParameter(paramCollection, "m");
    for (Map.Entry entry : paramCollection) {
      try {
        try {
          if (entry == null || !containsEntry$kotlin_stdlib(entry))
            return false; 
        } catch (ClassCastException classCastException) {
          throw a(null);
        } 
      } catch (ClassCastException classCastException) {
        return false;
      } 
    } 
    return true;
  }
  
  public MapBuilder() {
    this(8);
  }
  
  public final void checkIsMutable$kotlin_stdlib() {
    try {
      if (this.isReadOnly)
        throw new UnsupportedOperationException(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final MapBuilder$ValuesItr valuesIterator$kotlin_stdlib() {
    return new MapBuilder$ValuesItr(this);
  }
  
  static {
    Companion = new MapBuilder$Companion(null);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */