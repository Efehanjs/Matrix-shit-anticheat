package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.reflect.KTypeParameter;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TypeParameterReference$Companion {
  private static final long a = o3.a(-1295270346294148982L, 1997163069600926809L, null).a(252534885010448L);
  
  @NotNull
  public final String toString(@NotNull KTypeParameter paramKTypeParameter) {
    long l = a ^ 0x182874F49EEL;
    Intrinsics.checkNotNullParameter(paramKTypeParameter, "typeParameter");
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    try {
      switch (TypeParameterReference$Companion$WhenMappings.$EnumSwitchMapping$0[paramKTypeParameter.getVariance().ordinal()]) {
        case 2:
          stringBuilder2.append("in ");
          break;
        case 3:
          stringBuilder2.append("out ");
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    stringBuilder2.append(paramKTypeParameter.getName());
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
    return stringBuilder1.toString();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\TypeParameterReference$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */