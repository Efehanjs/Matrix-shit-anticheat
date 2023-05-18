package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.reflect.KTypeProjection;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TypeReference$asString$args$1 extends Lambda implements Function1 {
  private static final long a = o3.a(4755801229095688968L, -430302651257623540L, null).a(217351208862175L);
  
  public TypeReference$asString$args$1() {
    super(1);
  }
  
  @NotNull
  public final CharSequence invoke(@NotNull KTypeProjection paramKTypeProjection) {
    long l = a ^ 0x4E20CA083736L;
    Intrinsics.checkNotNullParameter(paramKTypeProjection, "it");
    return TypeReference.access$asString(TypeReference.this, paramKTypeProjection);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\TypeReference$asString$args$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */