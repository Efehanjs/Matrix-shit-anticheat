package me.rerere.matrix.thirdparty.kotlin.coroutines;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public final class CombinedContext implements CoroutineContext, Serializable {
  @NotNull
  private final CoroutineContext left;
  
  @NotNull
  private final CoroutineContext$Element element;
  
  private static final long a = o3.a(-249566076017189539L, 8410345901522839067L, null).a(110126452400319L);
  
  @NotNull
  public CoroutineContext plus(@NotNull CoroutineContext paramCoroutineContext) {
    return CoroutineContext$DefaultImpls.plus(this, paramCoroutineContext);
  }
  
  @NotNull
  public CoroutineContext minusKey(@NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x7AA377954349L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
    if (this.element.get(paramCoroutineContext$Key) != null) {
      CoroutineContext$Element coroutineContext$Element1 = this.element.get(paramCoroutineContext$Key);
      CoroutineContext$Element coroutineContext$Element2 = coroutineContext$Element1;
      boolean bool = false;
      return this.left;
    } 
    this.element.get(paramCoroutineContext$Key);
    CoroutineContext coroutineContext = this.left.minusKey(paramCoroutineContext$Key);
    try {
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (coroutineContext == this.left) ? this : ((coroutineContext == EmptyCoroutineContext.INSTANCE) ? this.element : new CombinedContext(coroutineContext, this.element));
  }
  
  public int hashCode() {
    return this.left.hashCode() + this.element.hashCode();
  }
  
  @NotNull
  public String toString() {
    return '[' + (String)fold("", CombinedContext$toString$1.INSTANCE) + ']';
  }
  
  public CombinedContext(@NotNull CoroutineContext paramCoroutineContext, @NotNull CoroutineContext$Element paramCoroutineContext$Element) {
    this.left = paramCoroutineContext;
    this.element = paramCoroutineContext$Element;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this != paramObject) {
        try {
          if (paramObject instanceof CombinedContext)
            try {
              if (((CombinedContext)paramObject).size() == size())
                try {
                  if (((CombinedContext)paramObject).containsAll(this));
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                }  
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public Object fold(Object paramObject, @NotNull Function2 paramFunction2) {
    long l = a ^ 0x1341E7BF865AL;
    Intrinsics.checkNotNullParameter(paramFunction2, "operation");
    return paramFunction2.invoke(this.left.fold(paramObject, paramFunction2), this.element);
  }
  
  @Nullable
  public CoroutineContext$Element get(@NotNull CoroutineContext$Key paramCoroutineContext$Key) {
    long l = a ^ 0x65144348E372L;
    Intrinsics.checkNotNullParameter(paramCoroutineContext$Key, "key");
    CombinedContext combinedContext = this;
    while (true) {
      CoroutineContext$Element coroutineContext$Element = combinedContext.element.get(paramCoroutineContext$Key);
      if (coroutineContext$Element != null) {
        CoroutineContext$Element coroutineContext$Element1 = coroutineContext$Element;
        CoroutineContext$Element coroutineContext$Element2 = coroutineContext$Element1;
        boolean bool = false;
        return coroutineContext$Element2;
      } 
      CoroutineContext coroutineContext = combinedContext.left;
      if (coroutineContext instanceof CombinedContext) {
        combinedContext = (CombinedContext)coroutineContext;
        continue;
      } 
      return coroutineContext.get(paramCoroutineContext$Key);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CombinedContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */