package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Map;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface MapWithDefault extends Map, KMappedMarker {
  Object getOrImplicitDefault(Object paramObject);
  
  @NotNull
  Map getMap();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\MapWithDefault.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */