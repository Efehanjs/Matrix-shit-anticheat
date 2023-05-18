package me.rerere.matrix.thirdparty.kotlin.text.jdk8;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.MatchGroup;
import me.rerere.matrix.thirdparty.kotlin.text.MatchGroupCollection;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RegexExtensionsJDK8Kt {
  private static final long a = o3.a(9049292041786755182L, -3555558495409256551L, MethodHandles.lookup().lookupClass()).a(734820103162L);
  
  @SinceKotlin(version = "1.2")
  @Nullable
  public static final MatchGroup get(@NotNull MatchGroupCollection paramMatchGroupCollection, @NotNull String paramString) {
    Object object;
    long l = a ^ 0x23FE4EDEF7E1L;
    try {
      Intrinsics.checkNotNullParameter(paramMatchGroupCollection, "<this>");
      Intrinsics.checkNotNullParameter(paramString, "name");
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (((paramMatchGroupCollection instanceof me.rerere.matrix.thirdparty.kotlin.text.MatchNamedGroupCollection) ? paramMatchGroupCollection : null) == null) {
        (paramMatchGroupCollection instanceof me.rerere.matrix.thirdparty.kotlin.text.MatchNamedGroupCollection) ? paramMatchGroupCollection : null;
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return object.get(paramString);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\jdk8\RegexExtensionsJDK8Kt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */