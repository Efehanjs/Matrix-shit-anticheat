package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.NoWhenBranchMatchedException;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClassifier;
import me.rerere.matrix.thirdparty.kotlin.reflect.KType;
import me.rerere.matrix.thirdparty.kotlin.reflect.KTypeProjection;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.4")
public final class TypeReference implements KType {
  @Nullable
  private final KType platformTypeUpperBound;
  
  public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
  
  public static final int IS_NOTHING_TYPE = 4;
  
  public static final int IS_MARKED_NULLABLE = 1;
  
  @NotNull
  public static final TypeReference$Companion Companion;
  
  @NotNull
  private final KClassifier classifier;
  
  @NotNull
  private final List arguments;
  
  private final int flags;
  
  private static final long a = o3.a(1881013226878850984L, -1323824945394878451L, null).a(177747464731548L);
  
  public boolean isMarkedNullable() {
    try {
    
    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
      throw a(null);
    } 
    return ((this.flags & 0x1) != 0);
  }
  
  @NotNull
  public List getAnnotations() {
    return CollectionsKt.emptyList();
  }
  
  public TypeReference(@NotNull KClassifier paramKClassifier, @NotNull List paramList, boolean paramBoolean) {
    this(paramKClassifier, paramList, null, paramBoolean ? 1 : 0);
  }
  
  @NotNull
  public List getArguments() {
    return this.arguments;
  }
  
  @NotNull
  public KClassifier getClassifier() {
    return this.classifier;
  }
  
  @Nullable
  public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
    return this.platformTypeUpperBound;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof TypeReference)
        try {
          if (Intrinsics.areEqual(getClassifier(), ((TypeReference)paramObject).getClassifier()))
            try {
              if (Intrinsics.areEqual(getArguments(), ((TypeReference)paramObject).getArguments()))
                try {
                  if (Intrinsics.areEqual(this.platformTypeUpperBound, ((TypeReference)paramObject).platformTypeUpperBound))
                    try {
                      if (this.flags == ((TypeReference)paramObject).flags);
                    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                      throw a(null);
                    }  
                } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                  throw a(null);
                }  
            } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
              throw a(null);
            }  
        } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
          throw a(null);
        }  
    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
      throw a(null);
    } 
    return false;
  }
  
  @SinceKotlin(version = "1.6")
  public TypeReference(@NotNull KClassifier paramKClassifier, @NotNull List paramList, @Nullable KType paramKType, int paramInt) {
    this.classifier = paramKClassifier;
    this.arguments = paramList;
    this.platformTypeUpperBound = paramKType;
    this.flags = paramInt;
  }
  
  static {
    Companion = new TypeReference$Companion(null);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0xA655D197D0AL;
    return asString(false) + " (Kotlin reflection is not available)";
  }
  
  public int hashCode() {
    return (getClassifier().hashCode() * 31 + getArguments().hashCode()) * 31 + Integer.valueOf(this.flags).hashCode();
  }
  
  public final int getFlags$kotlin_stdlib() {
    return this.flags;
  }
  
  private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException paramNoWhenBranchMatchedException) {
    return paramNoWhenBranchMatchedException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\TypeReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */