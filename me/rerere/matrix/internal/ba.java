package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ba {
  private static boolean a;
  
  private static final long b = o3.a(-8281352448315423682L, -705293594780408720L, MethodHandles.lookup().lookupClass()).a(263958462245924L);
  
  public static double b(long paramLong, @NotNull Player paramPlayer, @NotNull yl paramyl) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ba.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic r : ()I
    //   9: istore #4
    //   11: invokestatic b : ()Z
    //   14: iload #4
    //   16: ifeq -> 43
    //   19: ifne -> 40
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   28: athrow
    //   29: aload_2
    //   30: invokeinterface getEyeHeight : ()D
    //   35: dreturn
    //   36: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   39: athrow
    //   40: invokestatic b : ()I
    //   43: bipush #14
    //   45: lload_0
    //   46: lconst_0
    //   47: lcmp
    //   48: ifle -> 98
    //   51: iload #4
    //   53: ifeq -> 98
    //   56: if_icmpge -> 153
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   65: athrow
    //   66: aload_3
    //   67: invokevirtual b : ()I
    //   70: lload_0
    //   71: lconst_0
    //   72: lcmp
    //   73: ifle -> 126
    //   76: iload #4
    //   78: ifeq -> 126
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   87: athrow
    //   88: sipush #477
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   97: athrow
    //   98: if_icmplt -> 153
    //   101: aload_2
    //   102: iload #4
    //   104: ifeq -> 147
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   113: athrow
    //   114: invokeinterface isSneaking : ()Z
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   125: athrow
    //   126: ifeq -> 146
    //   129: aload_2
    //   130: invokeinterface getEyeHeight : ()D
    //   135: ldc2_w 0.27
    //   138: dsub
    //   139: goto -> 152
    //   142: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   145: athrow
    //   146: aload_2
    //   147: invokeinterface getEyeHeight : ()D
    //   152: dreturn
    //   153: aload_2
    //   154: invokeinterface getEyeHeight : ()D
    //   159: dreturn
    // Exception table:
    //   from	to	target	type
    //   11	22	25	java/lang/IllegalStateException
    //   19	36	36	java/lang/IllegalStateException
    //   43	59	62	java/lang/IllegalStateException
    //   56	81	84	java/lang/IllegalStateException
    //   66	91	94	java/lang/IllegalStateException
    //   98	107	110	java/lang/IllegalStateException
    //   101	119	122	java/lang/IllegalStateException
    //   126	142	142	java/lang/IllegalStateException
  }
  
  @NotNull
  public static List b(@NotNull Location paramLocation, double paramDouble, @NotNull Set paramSet, long paramLong, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ba.b : J
    //   3: lload #4
    //   5: lxor
    //   6: lstore #4
    //   8: invokestatic a : ()I
    //   11: istore #8
    //   13: aload_3
    //   14: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: pop
    //   18: iload #6
    //   20: iload #8
    //   22: ifne -> 46
    //   25: bipush #120
    //   27: if_icmple -> 48
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   36: athrow
    //   37: bipush #120
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   45: athrow
    //   46: istore #6
    //   48: new java/util/ArrayList
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #9
    //   57: new org/bukkit/util/BlockIterator
    //   60: dup
    //   61: aload_0
    //   62: dload_1
    //   63: iload #6
    //   65: invokespecial <init> : (Lorg/bukkit/Location;DI)V
    //   68: astore #10
    //   70: aload #10
    //   72: invokevirtual hasNext : ()Z
    //   75: ifeq -> 224
    //   78: aload #10
    //   80: invokevirtual next : ()Lorg/bukkit/block/Block;
    //   83: astore #11
    //   85: aload #9
    //   87: lload #4
    //   89: lconst_0
    //   90: lcmp
    //   91: iflt -> 238
    //   94: aload #11
    //   96: invokeinterface add : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: iload #8
    //   104: ifne -> 236
    //   107: iload #7
    //   109: iload #8
    //   111: lload #4
    //   113: lconst_0
    //   114: lcmp
    //   115: iflt -> 166
    //   118: ifne -> 164
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   127: athrow
    //   128: ifeq -> 185
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   137: athrow
    //   138: aload #9
    //   140: iload #8
    //   142: ifne -> 184
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   151: athrow
    //   152: invokeinterface size : ()I
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   163: athrow
    //   164: iload #7
    //   166: if_icmple -> 185
    //   169: aload #9
    //   171: iconst_0
    //   172: invokeinterface remove : (I)Ljava/lang/Object;
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   183: athrow
    //   184: pop
    //   185: aload #11
    //   187: invokeinterface getType : ()Lorg/bukkit/Material;
    //   192: astore #12
    //   194: aload_3
    //   195: aload #12
    //   197: invokeinterface contains : (Ljava/lang/Object;)Z
    //   202: lload #4
    //   204: lconst_0
    //   205: lcmp
    //   206: iflt -> 221
    //   209: ifne -> 219
    //   212: goto -> 224
    //   215: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   218: athrow
    //   219: iload #8
    //   221: ifeq -> 70
    //   224: lload #4
    //   226: lconst_0
    //   227: lcmp
    //   228: iflt -> 236
    //   231: goto -> 236
    //   234: astore #10
    //   236: aload #9
    //   238: areturn
    // Exception table:
    //   from	to	target	type
    //   13	30	33	java/lang/IllegalStateException
    //   25	39	42	java/lang/IllegalStateException
    //   57	224	234	java/lang/IllegalStateException
    //   85	121	124	java/lang/IllegalStateException
    //   107	131	134	java/lang/IllegalStateException
    //   128	145	148	java/lang/IllegalStateException
    //   138	157	160	java/lang/IllegalStateException
    //   164	177	180	java/lang/IllegalStateException
    //   194	215	215	java/lang/IllegalStateException
  }
  
  @NotNull
  public static List b(char paramChar, @NotNull Location paramLocation, int paramInt1, double paramDouble, @NotNull Set paramSet, int paramInt2, short paramShort) {
    long l1 = (paramChar << 48L | paramInt1 << 32L >>> 16L | paramShort << 48L >>> 48L) ^ b;
    long l2 = l1 ^ 0x386DC81A7759L;
    return b(paramLocation, paramDouble, paramSet, l2, paramInt2, 0);
  }
  
  public static void z(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean A() {
    return a;
  }
  
  public static boolean f() {
    boolean bool = A();
    try {
      if (!bool)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    if (f())
      z(true); 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */