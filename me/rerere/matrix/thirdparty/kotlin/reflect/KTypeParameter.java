package me.rerere.matrix.thirdparty.kotlin.reflect;

import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
public interface KTypeParameter extends KClassifier {
  boolean isReified();
  
  @NotNull
  KVariance getVariance();
  
  @NotNull
  List getUpperBounds();
  
  @NotNull
  String getName();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KTypeParameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */