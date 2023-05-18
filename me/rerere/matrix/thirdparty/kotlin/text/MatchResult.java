package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface MatchResult {
  @NotNull
  String getValue();
  
  @NotNull
  MatchResult$Destructured getDestructured();
  
  @NotNull
  MatchGroupCollection getGroups();
  
  @NotNull
  IntRange getRange();
  
  @Nullable
  MatchResult next();
  
  @NotNull
  List getGroupValues();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\MatchResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */