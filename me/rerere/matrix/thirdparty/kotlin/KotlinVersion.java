package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
public final class KotlinVersion implements Comparable {
  @JvmField
  @NotNull
  public static final KotlinVersion CURRENT;
  
  private final int major;
  
  private final int minor;
  
  private final int version;
  
  @NotNull
  public static final KotlinVersion$Companion Companion;
  
  private final int patch;
  
  public static final int MAX_COMPONENT_VALUE = 255;
  
  private static final long a = o3.a(-3020650563927241719L, -7694718895582738316L, null).a(216841509637893L);
  
  public final int getMinor() {
    return this.minor;
  }
  
  public KotlinVersion(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, 0);
  }
  
  public KotlinVersion(int paramInt1, int paramInt2, int paramInt3) {
    this.major = paramInt1;
    this.minor = paramInt2;
    this.patch = paramInt3;
    this.version = versionOf(this.major, this.minor, this.patch);
  }
  
  public final boolean isAtLeast(int paramInt1, int paramInt2) {
    try {
      if (this.major <= paramInt1) {
        try {
          if (this.major == paramInt1)
            try {
              if (this.minor >= paramInt2);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public final int getPatch() {
    return this.patch;
  }
  
  static {
    Companion = new KotlinVersion$Companion(null);
    CURRENT = KotlinVersionCurrentValue.get();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    Object object;
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (((paramObject instanceof KotlinVersion) ? paramObject : null) == null) {
        (paramObject instanceof KotlinVersion) ? paramObject : null;
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.version == ((KotlinVersion)object).version);
  }
  
  public final boolean isAtLeast(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield major : I
    //   4: iload_1
    //   5: if_icmpgt -> 68
    //   8: aload_0
    //   9: getfield major : I
    //   12: iload_1
    //   13: if_icmpne -> 76
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   22: athrow
    //   23: aload_0
    //   24: getfield minor : I
    //   27: iload_2
    //   28: if_icmpgt -> 68
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield minor : I
    //   42: iload_2
    //   43: if_icmpne -> 76
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   52: athrow
    //   53: aload_0
    //   54: getfield patch : I
    //   57: iload_3
    //   58: if_icmplt -> 76
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   67: athrow
    //   68: iconst_1
    //   69: goto -> 77
    //   72: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   75: athrow
    //   76: iconst_0
    //   77: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	16	19	java/lang/IllegalArgumentException
    //   8	31	34	java/lang/IllegalArgumentException
    //   23	46	49	java/lang/IllegalArgumentException
    //   38	61	64	java/lang/IllegalArgumentException
    //   53	72	72	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public String toString() {
    return this.major + '.' + this.minor + '.' + this.patch;
  }
  
  public int hashCode() {
    return this.version;
  }
  
  public final int getMajor() {
    return this.major;
  }
  
  public int compareTo(@NotNull KotlinVersion paramKotlinVersion) {
    long l = a ^ 0x5CD8376439ADL;
    Intrinsics.checkNotNullParameter(paramKotlinVersion, "other");
    return this.version - paramKotlinVersion.version;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\KotlinVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */