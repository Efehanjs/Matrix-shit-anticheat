package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.NoWhenBranchMatchedException;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
public final class KTypeProjection {
  @Nullable
  private final KVariance variance;
  
  @JvmField
  @NotNull
  public static final KTypeProjection star;
  
  @NotNull
  public static final KTypeProjection$Companion Companion;
  
  @Nullable
  private final KType type;
  
  private static final long a = o3.a(2538760755237467145L, 5706493723194948480L, null).a(75271949569011L);
  
  @NotNull
  public static final KTypeProjection covariant(@NotNull KType paramKType) {
    return Companion.covariant(paramKType);
  }
  
  public KTypeProjection(@Nullable KVariance paramKVariance, @Nullable KType paramKType) {
    this.variance = paramKVariance;
    this.type = paramKType;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (((this.variance == null) ? true : false) == ((this.type == null) ? true : false)) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      String str = (this.variance == null) ? "Star projection must have no type specified." : ("The projection variance " + this.variance + " requires type to be specified.");
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  @NotNull
  public static final KTypeProjection invariant(@NotNull KType paramKType) {
    return Companion.invariant(paramKType);
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    null = (this.variance == null) ? 0 : this.variance.hashCode();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null * 31 + ((this.type == null) ? 0 : this.type.hashCode());
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof KTypeProjection))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    KTypeProjection kTypeProjection = (KTypeProjection)paramObject;
    try {
      if (this.variance != kTypeProjection.variance)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.type, kTypeProjection.type))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return true;
  }
  
  @Nullable
  public final KVariance getVariance() {
    return this.variance;
  }
  
  @NotNull
  public static final KTypeProjection contravariant(@NotNull KType paramKType) {
    return Companion.contravariant(paramKType);
  }
  
  @Nullable
  public final KVariance component1() {
    return this.variance;
  }
  
  @Nullable
  public final KType component2() {
    return this.type;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x24B61EFDB98DL;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      switch ((this.variance == null) ? -1 : KTypeProjection$WhenMappings.$EnumSwitchMapping$0[this.variance.ordinal()]) {
        case true:
        
        case true:
        
        case true:
        
        case true:
        
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new NoWhenBranchMatchedException();
  }
  
  @Nullable
  public final KType getType() {
    return this.type;
  }
  
  static {
    Companion = new KTypeProjection$Companion(null);
    star = new KTypeProjection(null, null);
  }
  
  @NotNull
  public final KTypeProjection copy(@Nullable KVariance paramKVariance, @Nullable KType paramKType) {
    return new KTypeProjection(paramKVariance, paramKType);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KTypeProjection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */