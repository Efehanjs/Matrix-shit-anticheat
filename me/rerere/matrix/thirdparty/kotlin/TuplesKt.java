package me.rerere.matrix.thirdparty.kotlin;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TuplesKt {
  private static final long a = o3.a(-4891056846756291122L, 912727190427649771L, null).a(259205992238373L);
  
  @NotNull
  public static final Pair to(Object paramObject1, Object paramObject2) {
    return new Pair(paramObject1, paramObject2);
  }
  
  @NotNull
  public static final List toList(@NotNull Pair paramPair) {
    long l = a ^ 0x25EFD8F402FEL;
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramPair.getFirst();
    arrayOfObject[1] = paramPair.getSecond();
    return CollectionsKt.listOf(arrayOfObject);
  }
  
  @NotNull
  public static final List toList(@NotNull Triple paramTriple) {
    long l = a ^ 0x62BCE6913CADL;
    Intrinsics.checkNotNullParameter(paramTriple, "<this>");
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramTriple.getFirst();
    arrayOfObject[1] = paramTriple.getSecond();
    arrayOfObject[2] = paramTriple.getThird();
    return CollectionsKt.listOf(arrayOfObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\TuplesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */