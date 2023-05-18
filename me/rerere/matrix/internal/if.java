package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public final class if {
  @Nullable
  private xh w;
  
  private int f;
  
  @NotNull
  private final xh l;
  
  @NotNull
  private final jo r;
  
  private final long x;
  
  private final int z;
  
  @NotNull
  private final BlockFace k;
  
  private final int v;
  
  private boolean b;
  
  private final int i;
  
  private static final long a = o3.a(7392264322026020146L, 2094861655156880864L, MethodHandles.lookup().lookupClass()).a(143072062040783L);
  
  private static final String c;
  
  public final int m() {
    return this.z;
  }
  
  @NotNull
  public final BlockFace b() {
    return this.k;
  }
  
  public final int p() {
    return this.f;
  }
  
  public final int j() {
    return this.i;
  }
  
  public final void b(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final long b() {
    return this.x;
  }
  
  @NotNull
  public final jo b() {
    return this.r;
  }
  
  @NotNull
  public final xh j() {
    return this.l;
  }
  
  public final void b(int paramInt) {
    this.f = paramInt;
  }
  
  @Nullable
  public final xh b() {
    return this.w;
  }
  
  @NotNull
  public final Block b(@NotNull World paramWorld) {
    return paramWorld.getBlockAt(this.i, this.z, this.v);
  }
  
  public final boolean b() {
    return this.b;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/if.a : J
    //   3: ldc2_w 61084189364363
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_0
    //   14: iload #4
    //   16: ifne -> 37
    //   19: aload_1
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual getClass : ()Ljava/lang/Class;
    //   40: iload #4
    //   42: ifne -> 80
    //   45: aload_1
    //   46: dup
    //   47: ifnull -> 72
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: invokevirtual getClass : ()Ljava/lang/Class;
    //   60: iload #4
    //   62: ifeq -> 81
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: pop
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aconst_null
    //   81: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   84: iload #4
    //   86: ifne -> 129
    //   89: ifne -> 105
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: iconst_0
    //   100: ireturn
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_1
    //   106: getstatic me/rerere/matrix/internal/if.c : Ljava/lang/String;
    //   109: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   112: aload_1
    //   113: checkcast me/rerere/matrix/internal/if
    //   116: pop
    //   117: aload_0
    //   118: getfield x : J
    //   121: aload_1
    //   122: checkcast me/rerere/matrix/internal/if
    //   125: getfield x : J
    //   128: lcmp
    //   129: iload #4
    //   131: ifne -> 151
    //   134: ifeq -> 150
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: iconst_0
    //   145: ireturn
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: iconst_1
    //   151: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	50	53	java/lang/RuntimeException
    //   45	65	68	java/lang/RuntimeException
    //   57	73	76	java/lang/RuntimeException
    //   81	92	95	java/lang/RuntimeException
    //   89	101	101	java/lang/RuntimeException
    //   129	137	140	java/lang/RuntimeException
    //   134	146	146	java/lang/RuntimeException
  }
  
  public if(long paramLong, @NotNull jo paramjo, int paramInt1, int paramInt2, int paramInt3, @NotNull BlockFace paramBlockFace, @NotNull xh paramxh1, @Nullable xh paramxh2) {
    this.x = paramLong;
    this.r = paramjo;
    this.i = paramInt1;
    this.z = paramInt2;
    this.v = paramInt3;
    this.k = paramBlockFace;
    this.l = paramxh1;
    this.w = paramxh2;
    this.b = true;
  }
  
  public final void b(@Nullable xh paramxh) {
    this.w = paramxh;
  }
  
  public int hashCode() {
    return Long.hashCode(this.x);
  }
  
  public final int b() {
    return this.v;
  }
  
  static {
    long l = a ^ 0x4E9536B7AE28L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\if.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */