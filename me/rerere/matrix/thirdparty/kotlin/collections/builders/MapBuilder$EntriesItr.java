package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MapBuilder$EntriesItr extends MapBuilder$Itr implements Iterator, KMutableIterator {
  private static final long a = o3.a(-1615177590671765977L, -6507236507002812905L, null).a(264509735980308L);
  
  public final int nextHashCode$kotlin_stdlib() {
    try {
      if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib()))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = getIndex$kotlin_stdlib();
    try {
      setIndex$kotlin_stdlib(i + 1);
      setLastIndex$kotlin_stdlib(i);
      MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib()));
      MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    i = ((MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()] != null) ? MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()].hashCode() : 0) ^ ((MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()] != null) ? MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()].hashCode() : 0);
    initNext$kotlin_stdlib();
    return i;
  }
  
  @NotNull
  public MapBuilder$EntryRef next() {
    try {
      if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib()))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = getIndex$kotlin_stdlib();
    setIndex$kotlin_stdlib(i + 1);
    setLastIndex$kotlin_stdlib(i);
    MapBuilder$EntryRef mapBuilder$EntryRef = new MapBuilder$EntryRef(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
    initNext$kotlin_stdlib();
    return mapBuilder$EntryRef;
  }
  
  public MapBuilder$EntriesItr(@NotNull MapBuilder paramMapBuilder) {
    super(paramMapBuilder);
  }
  
  public final void nextAppendString(@NotNull StringBuilder paramStringBuilder) {
    long l = a ^ 0x6E7C5714FC1DL;
    try {
      Intrinsics.checkNotNullParameter(paramStringBuilder, "sb");
      if (getIndex$kotlin_stdlib() >= MapBuilder.access$getLength$p(getMap$kotlin_stdlib()))
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = getIndex$kotlin_stdlib();
    setIndex$kotlin_stdlib(i + 1);
    setLastIndex$kotlin_stdlib(i);
    Object object1 = MapBuilder.access$getKeysArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
    try {
      if (Intrinsics.areEqual(object1, getMap$kotlin_stdlib())) {
        paramStringBuilder.append("(this Map)");
      } else {
        paramStringBuilder.append(object1);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    paramStringBuilder.append('=');
    Intrinsics.checkNotNull(MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib()));
    Object object2 = MapBuilder.access$getValuesArray$p(getMap$kotlin_stdlib())[getLastIndex$kotlin_stdlib()];
    try {
      if (Intrinsics.areEqual(object2, getMap$kotlin_stdlib())) {
        paramStringBuilder.append("(this Map)");
      } else {
        paramStringBuilder.append(object2);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    initNext$kotlin_stdlib();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilder$EntriesItr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */