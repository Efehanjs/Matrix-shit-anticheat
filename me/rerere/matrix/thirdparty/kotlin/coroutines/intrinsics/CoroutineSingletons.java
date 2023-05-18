package me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
@PublishedApi
public enum CoroutineSingletons {
  RESUMED, UNDECIDED, COROUTINE_SUSPENDED;
  
  static {
    UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
    RESUMED = new CoroutineSingletons("RESUMED", 2);
    $VALUES = $values();
  }
  
  static {
    long l = o3.a(-827591590429200081L, 6347696529418757161L, null).a(200879414920254L) ^ 0x45BE8DAECE01L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\intrinsics\CoroutineSingletons.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */