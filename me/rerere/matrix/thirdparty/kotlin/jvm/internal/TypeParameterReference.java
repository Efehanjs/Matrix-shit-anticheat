package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.reflect.KTypeParameter;
import me.rerere.matrix.thirdparty.kotlin.reflect.KVariance;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.4")
public final class TypeParameterReference implements KTypeParameter {
  @NotNull
  private final KVariance variance;
  
  @Nullable
  private final Object container;
  
  @Nullable
  private volatile List bounds;
  
  @NotNull
  private final String name;
  
  private final boolean isReified;
  
  @NotNull
  public static final TypeParameterReference$Companion Companion;
  
  private static final long a = o3.a(7545141717461413979L, -8305112619824608163L, null).a(44981736737730L);
  
  public TypeParameterReference(@Nullable Object paramObject, @NotNull String paramString, @NotNull KVariance paramKVariance, boolean paramBoolean) {
    this.container = paramObject;
    this.name = paramString;
    this.variance = paramKVariance;
    this.isReified = paramBoolean;
  }
  
  @NotNull
  public String getName() {
    return this.name;
  }
  
  @NotNull
  public KVariance getVariance() {
    return this.variance;
  }
  
  @NotNull
  public String toString() {
    return Companion.toString(this);
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ((this.container != null) ? this.container.hashCode() : 0) * 31 + getName().hashCode();
  }
  
  public final void setUpperBounds(@NotNull List paramList) {
    long l = a ^ 0x4F7A683C4402L;
    try {
      Intrinsics.checkNotNullParameter(paramList, "upperBounds");
      if (this.bounds != null)
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.bounds = paramList;
  }
  
  static {
    Companion = new TypeParameterReference$Companion(null);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof TypeParameterReference)
        try {
          if (Intrinsics.areEqual(this.container, ((TypeParameterReference)paramObject).container))
            try {
              if (Intrinsics.areEqual(getName(), ((TypeParameterReference)paramObject).getName()));
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
  
  @NotNull
  public List getUpperBounds() {
    if (this.bounds == null) {
      List list1 = CollectionsKt.listOf(Reflection.nullableTypeOf(Object.class));
      List list2 = list1;
      boolean bool = false;
      this.bounds = list2;
    } 
    return list1;
  }
  
  public boolean isReified() {
    return this.isReified;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\TypeParameterReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */