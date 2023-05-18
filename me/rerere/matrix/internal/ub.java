package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.Result;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ub extends Lambda implements Function0 {
  public static final ub i = new ub();
  
  public ub() {
    super(0);
  }
  
  @NotNull
  public final Integer b() {
    try {
      boolean bool = false;
      Intrinsics.checkNotNull(eb.b(eb.v));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = ".";
      object = Result.constructor-impl(Integer.valueOf(Integer.parseInt(StringsKt.split$default(eb.b(eb.v), arrayOfString, false, 0, 6, null).get(1))));
    } catch (Throwable throwable) {
      object = Result.constructor-impl(ResultKt.createFailure(throwable));
    } 
    Object object = object;
    Integer integer = Integer.valueOf(-1);
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    return Result.isFailure-impl(object) ? integer : (Integer)object;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\ub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */