package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class MapBuilderEntries extends AbstractMapBuilderEntrySet {
  @NotNull
  private final MapBuilder backing;
  
  private static final long b = o3.a(-3050205528606156581L, -5177860147778449380L, null).a(268420998570643L);
  
  public boolean removeAll(@NotNull Collection paramCollection) {
    long l = b ^ 0x6CC17051A2E2L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.removeAll(paramCollection);
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    long l = b ^ 0x59B601E43A3BL;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return this.backing.containsAllEntries$kotlin_stdlib(paramCollection);
  }
  
  public int getSize() {
    return this.backing.size();
  }
  
  @NotNull
  public Iterator iterator() {
    return this.backing.entriesIterator$kotlin_stdlib();
  }
  
  public void clear() {
    this.backing.clear();
  }
  
  public boolean remove(@NotNull Map.Entry paramEntry) {
    long l = b ^ 0x3D4436757D7BL;
    Intrinsics.checkNotNullParameter(paramEntry, "element");
    return this.backing.removeEntry$kotlin_stdlib(paramEntry);
  }
  
  public boolean add(@NotNull Map.Entry paramEntry) {
    long l = b ^ 0x5784C137BB60L;
    Intrinsics.checkNotNullParameter(paramEntry, "element");
    throw new UnsupportedOperationException();
  }
  
  public boolean retainAll(@NotNull Collection paramCollection) {
    long l = b ^ 0x2273A7C2C7L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    this.backing.checkIsMutable$kotlin_stdlib();
    return super.retainAll(paramCollection);
  }
  
  public MapBuilderEntries(@NotNull MapBuilder paramMapBuilder) {
    this.backing = paramMapBuilder;
  }
  
  public boolean isEmpty() {
    return this.backing.isEmpty();
  }
  
  @NotNull
  public final MapBuilder getBacking() {
    return this.backing;
  }
  
  public boolean containsEntry(@NotNull Map.Entry paramEntry) {
    long l = b ^ 0x35DFAD7B0809L;
    Intrinsics.checkNotNullParameter(paramEntry, "element");
    return this.backing.containsEntry$kotlin_stdlib(paramEntry);
  }
  
  public boolean addAll(@NotNull Collection paramCollection) {
    long l = b ^ 0x20E5A87FEAE1L;
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\MapBuilderEntries.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */