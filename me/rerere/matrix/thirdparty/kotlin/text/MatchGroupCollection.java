package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Collection;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface MatchGroupCollection extends Collection, KMappedMarker {
  @Nullable
  MatchGroup get(int paramInt);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatchGroupCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */