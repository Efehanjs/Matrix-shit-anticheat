package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public final class yl {
  @Nullable
  private Consumer za;
  
  @Nullable
  private UUID oa;
  
  @NotNull
  private final String ma;
  
  private boolean wa;
  
  @NotNull
  private vk ya;
  
  @NotNull
  private q c;
  
  private boolean p;
  
  @NotNull
  private final gb j;
  
  private long d;
  
  @NotNull
  private final sl h;
  
  private boolean e;
  
  @NotNull
  private final hn n;
  
  @Nullable
  private Location y;
  
  @NotNull
  private final qd m;
  
  private boolean o;
  
  @NotNull
  private final UUID q;
  
  @NotNull
  private final Map t;
  
  @Nullable
  private GameMode g;
  
  @NotNull
  private final oc a;
  
  private int s;
  
  @NotNull
  private final AtomicInteger u;
  
  private boolean w;
  
  @Nullable
  private Player f;
  
  private long l;
  
  @NotNull
  private final gm r;
  
  @JvmField
  public double x;
  
  private boolean z;
  
  private int k;
  
  @NotNull
  private final x v;
  
  @NotNull
  private final HashSet b;
  
  private long i;
  
  private static int A;
  
  private static final long B = o3.a(6670308361120041000L, -1789101581343245132L, MethodHandles.lookup().lookupClass()).a(212970428430335L);
  
  private static final String[] C;
  
  private static final String[] D;
  
  private static final Map E = new HashMap<>(13);
  
  @NotNull
  public final String b() {
    return this.ma;
  }
  
  public final void m(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yl.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 12511203465417
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic r : ()I
    //   17: istore #5
    //   19: aload_0
    //   20: iload #5
    //   22: ifeq -> 44
    //   25: getfield w : Z
    //   28: ifeq -> 43
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: return
    //   39: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   42: athrow
    //   43: aload_0
    //   44: iconst_1
    //   45: putfield w : Z
    //   48: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   51: lload_3
    //   52: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   55: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: sipush #4717
    //   68: ldc2_w 4653999930500685599
    //   71: lload_1
    //   72: lxor
    //   73: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: aload_0
    //   82: getfield ma : Ljava/lang/String;
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: sipush #936
    //   91: ldc2_w 260660082190061279
    //   94: lload_1
    //   95: lxor
    //   96: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual toString : ()Ljava/lang/String;
    //   107: invokevirtual info : (Ljava/lang/String;)V
    //   110: return
    // Exception table:
    //   from	to	target	type
    //   19	31	34	java/lang/RuntimeException
    //   25	39	39	java/lang/RuntimeException
  }
  
  public final boolean b(long paramLong, @NotNull yk paramyk) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yl.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 83364745688395
    //   11: lxor
    //   12: dup2
    //   13: bipush #16
    //   15: lushr
    //   16: lstore #4
    //   18: dup2
    //   19: bipush #48
    //   21: lshl
    //   22: bipush #48
    //   24: lushr
    //   25: l2i
    //   26: istore #6
    //   28: pop2
    //   29: dup2
    //   30: ldc2_w 96844557847338
    //   33: lxor
    //   34: dup2
    //   35: bipush #32
    //   37: lushr
    //   38: l2i
    //   39: istore #7
    //   41: dup2
    //   42: bipush #32
    //   44: lshl
    //   45: bipush #56
    //   47: lushr
    //   48: l2i
    //   49: istore #8
    //   51: dup2
    //   52: bipush #40
    //   54: lshl
    //   55: bipush #40
    //   57: lushr
    //   58: l2i
    //   59: istore #9
    //   61: pop2
    //   62: pop2
    //   63: invokestatic r : ()I
    //   66: istore #10
    //   68: aload_0
    //   69: getfield t : Ljava/util/Map;
    //   72: aload_3
    //   73: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast java/lang/Long
    //   81: iload #10
    //   83: ifeq -> 107
    //   86: dup
    //   87: ifnull -> 152
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: checkcast java/lang/Number
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: invokevirtual longValue : ()J
    //   110: lstore #12
    //   112: iconst_0
    //   113: istore #14
    //   115: iload #10
    //   117: lload_1
    //   118: lconst_0
    //   119: lcmp
    //   120: ifle -> 132
    //   123: ifeq -> 149
    //   126: lload #12
    //   128: invokestatic currentTimeMillis : ()J
    //   131: lcmp
    //   132: iflt -> 148
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: iconst_1
    //   143: ireturn
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: nop
    //   149: goto -> 154
    //   152: pop
    //   153: nop
    //   154: getstatic me/rerere/matrix/internal/ge.x : Z
    //   157: iload #10
    //   159: ifeq -> 173
    //   162: ifeq -> 174
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: iconst_0
    //   173: ireturn
    //   174: new java/lang/StringBuilder
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: sipush #20709
    //   184: ldc2_w 5498480048871504497
    //   187: lload_1
    //   188: lxor
    //   189: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload_3
    //   198: invokevirtual name : ()Ljava/lang/String;
    //   201: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   204: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   207: dup
    //   208: sipush #13639
    //   211: ldc2_w 8277960264589942737
    //   214: lload_1
    //   215: lxor
    //   216: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   221: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual toString : ()Ljava/lang/String;
    //   230: astore #11
    //   232: getstatic me/rerere/matrix/internal/rk.i : Lme/rerere/matrix/internal/oh;
    //   235: aload_0
    //   236: iload #7
    //   238: iload #8
    //   240: i2b
    //   241: iload #9
    //   243: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   246: lload #4
    //   248: iload #6
    //   250: i2s
    //   251: aload #11
    //   253: invokevirtual b : (Lorg/bukkit/entity/Player;JSLjava/lang/String;)Z
    //   256: ireturn
    // Exception table:
    //   from	to	target	type
    //   68	90	93	java/lang/RuntimeException
    //   86	100	103	java/lang/RuntimeException
    //   115	135	138	java/lang/RuntimeException
    //   126	144	144	java/lang/RuntimeException
    //   154	165	168	java/lang/RuntimeException
  }
  
  public final long p() {
    return this.i;
  }
  
  @Nullable
  public final UUID j() {
    return this.oa;
  }
  
  public final void t(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  public final void p() {
    long l = System.currentTimeMillis();
    this.b.removeIf(paramObject -> ((Boolean)paramFunction1.invoke(paramObject)).booleanValue());
  }
  
  public final int j() {
    return this.s;
  }
  
  public final void h(boolean paramBoolean) {
    this.wa = paramBoolean;
  }
  
  @NotNull
  public final x b() {
    return this.v;
  }
  
  @NotNull
  public final Player j(int paramInt1, byte paramByte, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramByte << 56L >>> 32L | paramInt2 << 40L >>> 40L) ^ B;
    int i = (int)((l1 ^ 0x4A5866B70F17L) >>> 48L);
    long l2 = (l1 ^ 0x4A5866B70F17L) << 16L >>> 16L;
    l1 ^ 0x4A5866B70F17L;
    return b((short)i, l2);
  }
  
  public final void j(int paramInt1, int paramInt2, short paramShort) {
    long l = (paramInt1 << 32L | paramInt2 << 48L >>> 32L | paramShort << 48L >>> 48L) ^ B;
    int i = a();
    try {
      if (i == 0)
        try {
          if (this.z) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.d = System.currentTimeMillis();
  }
  
  public final boolean t(int paramInt1, short paramShort, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/yl.B : J
    //   26: lxor
    //   27: lstore #4
    //   29: invokestatic a : ()I
    //   32: istore #6
    //   34: aload_0
    //   35: getfield w : Z
    //   38: iload #6
    //   40: ifne -> 64
    //   43: ifeq -> 61
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: iconst_1
    //   54: goto -> 87
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: getstatic me/rerere/matrix/internal/ge.x : Z
    //   64: iload #6
    //   66: ifne -> 80
    //   69: ifeq -> 83
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: iconst_0
    //   80: goto -> 87
    //   83: aload_0
    //   84: getfield wa : Z
    //   87: ireturn
    // Exception table:
    //   from	to	target	type
    //   34	46	49	java/lang/RuntimeException
    //   43	57	57	java/lang/RuntimeException
    //   64	72	75	java/lang/RuntimeException
  }
  
  public final void b() {
    ka ka = this.ya.w;
    this.ya = new vk();
    this.ya.w = ka;
  }
  
  public final boolean h() {
    return this.p;
  }
  
  public final long j() {
    return this.d;
  }
  
  @NotNull
  public final q b() {
    return this.c;
  }
  
  public final void p(int paramInt) {
    this.k = paramInt;
  }
  
  @Nullable
  public final Location b() {
    return this.y;
  }
  
  @Nullable
  public final Consumer b() {
    return this.za;
  }
  
  @NotNull
  public final gm b() {
    return this.r;
  }
  
  @NotNull
  public final vk b() {
    return this.ya;
  }
  
  public final void b(@NotNull q paramq) {
    this.c = paramq;
  }
  
  public final void p(long paramLong) {
    this.i = paramLong;
  }
  
  public final void b(@Nullable Consumer paramConsumer) {
    this.za = paramConsumer;
  }
  
  public final void j(long paramLong) {
    this.l = paramLong;
  }
  
  public final boolean m() {
    return this.e;
  }
  
  public final int b(long paramLong, @NotNull Consumer paramConsumer) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yl.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 19613090849465
    //   11: lxor
    //   12: dup2
    //   13: bipush #8
    //   15: lushr
    //   16: lstore #4
    //   18: dup2
    //   19: bipush #56
    //   21: lshl
    //   22: bipush #56
    //   24: lushr
    //   25: l2i
    //   26: istore #6
    //   28: pop2
    //   29: dup2
    //   30: ldc2_w 134955980494678
    //   33: lxor
    //   34: dup2
    //   35: bipush #16
    //   37: lushr
    //   38: lstore #7
    //   40: dup2
    //   41: bipush #48
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #9
    //   50: pop2
    //   51: dup2
    //   52: ldc2_w 53757465344840
    //   55: lxor
    //   56: dup2
    //   57: bipush #32
    //   59: lushr
    //   60: l2i
    //   61: istore #10
    //   63: dup2
    //   64: bipush #32
    //   66: lshl
    //   67: bipush #56
    //   69: lushr
    //   70: l2i
    //   71: istore #11
    //   73: dup2
    //   74: bipush #40
    //   76: lshl
    //   77: bipush #40
    //   79: lushr
    //   80: l2i
    //   81: istore #12
    //   83: pop2
    //   84: pop2
    //   85: aload_0
    //   86: getfield u : Ljava/util/concurrent/atomic/AtomicInteger;
    //   89: invokevirtual getAndIncrement : ()I
    //   92: istore #16
    //   94: invokestatic a : ()I
    //   97: iconst_0
    //   98: istore #17
    //   100: istore #13
    //   102: iload #16
    //   104: iload #13
    //   106: ifne -> 138
    //   109: sipush #32767
    //   112: if_icmplt -> 141
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload_0
    //   123: getfield u : Ljava/util/concurrent/atomic/AtomicInteger;
    //   126: iconst_0
    //   127: invokevirtual set : (I)V
    //   130: iconst_0
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: goto -> 143
    //   141: iload #16
    //   143: nop
    //   144: nop
    //   145: istore #14
    //   147: aload_0
    //   148: getfield b : Ljava/util/HashSet;
    //   151: checkcast java/util/Collection
    //   154: new me/rerere/matrix/internal/bh
    //   157: dup
    //   158: iload #14
    //   160: new me/rerere/matrix/internal/rj
    //   163: dup
    //   164: aload_3
    //   165: invokespecial <init> : (Ljava/util/function/Consumer;)V
    //   168: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   171: invokestatic currentTimeMillis : ()J
    //   174: invokespecial <init> : (ILme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;J)V
    //   177: invokeinterface add : (Ljava/lang/Object;)Z
    //   182: pop
    //   183: invokestatic b : ()I
    //   186: bipush #17
    //   188: if_icmplt -> 231
    //   191: new com/comphenix/protocol/events/PacketContainer
    //   194: dup
    //   195: getstatic com/comphenix/protocol/PacketType$Play$Server.PING : Lcom/comphenix/protocol/PacketType;
    //   198: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   201: astore #16
    //   203: aload #16
    //   205: astore #17
    //   207: iconst_0
    //   208: istore #18
    //   210: aload #17
    //   212: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   215: iconst_0
    //   216: iload #14
    //   218: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   221: invokevirtual writeSafely : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   224: pop
    //   225: nop
    //   226: aload #16
    //   228: goto -> 297
    //   231: new com/comphenix/protocol/events/PacketContainer
    //   234: dup
    //   235: getstatic com/comphenix/protocol/PacketType$Play$Server.TRANSACTION : Lcom/comphenix/protocol/PacketType;
    //   238: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   241: astore #16
    //   243: aload #16
    //   245: astore #17
    //   247: iconst_0
    //   248: istore #18
    //   250: aload #17
    //   252: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   255: iconst_0
    //   256: iconst_0
    //   257: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   260: invokevirtual writeSafely : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   263: pop
    //   264: aload #17
    //   266: invokevirtual getShorts : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   269: iconst_0
    //   270: iload #14
    //   272: i2s
    //   273: invokestatic valueOf : (S)Ljava/lang/Short;
    //   276: invokevirtual writeSafely : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   279: pop
    //   280: aload #17
    //   282: invokevirtual getBooleans : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   285: iconst_0
    //   286: iconst_0
    //   287: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   290: invokevirtual writeSafely : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   293: pop
    //   294: nop
    //   295: aload #16
    //   297: astore #15
    //   299: aload_0
    //   300: iload #10
    //   302: iload #11
    //   304: i2b
    //   305: iload #12
    //   307: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   310: lload #4
    //   312: dup2_x1
    //   313: pop2
    //   314: iload #6
    //   316: i2b
    //   317: swap
    //   318: aload #15
    //   320: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   323: new java/lang/StringBuilder
    //   326: dup
    //   327: invokespecial <init> : ()V
    //   330: sipush #5088
    //   333: ldc2_w 4251050392922491164
    //   336: lload_1
    //   337: lxor
    //   338: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_0
    //   347: getfield ma : Ljava/lang/String;
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: sipush #5886
    //   356: ldc2_w 987820997079796749
    //   359: lload_1
    //   360: lxor
    //   361: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: iload #14
    //   371: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   374: invokevirtual toString : ()Ljava/lang/String;
    //   377: lload #7
    //   379: iload #9
    //   381: i2s
    //   382: invokestatic b : (Ljava/lang/String;JS)V
    //   385: iload #14
    //   387: ireturn
    // Exception table:
    //   from	to	target	type
    //   102	115	118	java/lang/RuntimeException
    //   109	131	134	java/lang/RuntimeException
  }
  
  public final void j(int paramInt) {
    this.s = paramInt;
  }
  
  public final void m(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public final void b(@NotNull yk paramyk, long paramLong) {
    Long long_ = Long.valueOf(paramLong);
    this.t.put(paramyk, long_);
  }
  
  public final void b(@Nullable GameMode paramGameMode) {
    this.g = paramGameMode;
  }
  
  @Nullable
  public final GameMode b() {
    return this.g;
  }
  
  public final void b(long paramLong, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yl.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: getfield b : Ljava/util/HashSet;
    //   10: checkcast java/lang/Iterable
    //   13: astore #5
    //   15: invokestatic a : ()I
    //   18: aload #5
    //   20: invokeinterface iterator : ()Ljava/util/Iterator;
    //   25: astore #6
    //   27: istore #4
    //   29: aload #6
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 103
    //   39: aload #6
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: astore #7
    //   48: aload #7
    //   50: checkcast me/rerere/matrix/internal/bh
    //   53: astore #8
    //   55: iconst_0
    //   56: istore #9
    //   58: aload #8
    //   60: invokevirtual b : ()I
    //   63: iload #4
    //   65: ifne -> 80
    //   68: iload_3
    //   69: if_icmpne -> 83
    //   72: iconst_1
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: goto -> 84
    //   83: iconst_0
    //   84: ifeq -> 29
    //   87: aload #7
    //   89: lload_1
    //   90: lconst_0
    //   91: lcmp
    //   92: iflt -> 46
    //   95: iload #4
    //   97: ifne -> 50
    //   100: goto -> 104
    //   103: aconst_null
    //   104: checkcast me/rerere/matrix/internal/bh
    //   107: dup
    //   108: ifnull -> 142
    //   111: astore #5
    //   113: iconst_0
    //   114: istore #6
    //   116: aload #5
    //   118: invokevirtual j : ()Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   121: aload #5
    //   123: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: pop
    //   129: aload_0
    //   130: getfield b : Ljava/util/HashSet;
    //   133: aload #5
    //   135: invokevirtual remove : (Ljava/lang/Object;)Z
    //   138: pop
    //   139: goto -> 144
    //   142: pop
    //   143: nop
    //   144: return
    // Exception table:
    //   from	to	target	type
    //   68	73	76	java/lang/RuntimeException
  }
  
  @NotNull
  public final gb b() {
    return this.j;
  }
  
  public final void b(@Nullable UUID paramUUID) {
    this.oa = paramUUID;
  }
  
  public final void b(@NotNull Player paramPlayer) {
    this.f = paramPlayer;
  }
  
  @NotNull
  public final qd b() {
    return this.m;
  }
  
  public final void p(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public final void j(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  @NotNull
  public final sl b() {
    return this.h;
  }
  
  @NotNull
  public final oc b() {
    return this.a;
  }
  
  @NotNull
  public final UUID b() {
    return this.q;
  }
  
  public final boolean p() {
    return this.w;
  }
  
  public final boolean j() {
    return this.z;
  }
  
  @NotNull
  public final hn b() {
    return this.n;
  }
  
  public final int b() {
    return this.k;
  }
  
  public final long b() {
    return this.l;
  }
  
  public final void b(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public final boolean b() {
    return this.o;
  }
  
  public final void b(long paramLong) {
    this.d = paramLong;
  }
  
  public yl(@NotNull UUID paramUUID, @NotNull String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yl.B : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 29097309577902
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 25479798123471
    //   18: lxor
    //   19: lstore #7
    //   21: dup2
    //   22: ldc2_w 21943404129055
    //   25: lxor
    //   26: lstore #9
    //   28: dup2
    //   29: ldc2_w 90420250564618
    //   32: lxor
    //   33: dup2
    //   34: bipush #16
    //   36: lushr
    //   37: lstore #11
    //   39: dup2
    //   40: bipush #48
    //   42: lshl
    //   43: bipush #48
    //   45: lushr
    //   46: l2i
    //   47: istore #13
    //   49: pop2
    //   50: dup2
    //   51: ldc2_w 19200933332775
    //   54: lxor
    //   55: lstore #14
    //   57: dup2
    //   58: ldc2_w 138534672593491
    //   61: lxor
    //   62: dup2
    //   63: bipush #32
    //   65: lushr
    //   66: l2i
    //   67: istore #16
    //   69: dup2
    //   70: bipush #32
    //   72: lshl
    //   73: bipush #56
    //   75: lushr
    //   76: l2i
    //   77: istore #17
    //   79: dup2
    //   80: bipush #40
    //   82: lshl
    //   83: bipush #40
    //   85: lushr
    //   86: l2i
    //   87: istore #18
    //   89: pop2
    //   90: dup2
    //   91: ldc2_w 83034367030498
    //   94: lxor
    //   95: lstore #19
    //   97: dup2
    //   98: ldc2_w 68199991559765
    //   101: lxor
    //   102: lstore #21
    //   104: pop2
    //   105: aload_0
    //   106: invokespecial <init> : ()V
    //   109: aload_0
    //   110: aload_1
    //   111: putfield q : Ljava/util/UUID;
    //   114: aload_0
    //   115: aload_2
    //   116: putfield ma : Ljava/lang/String;
    //   119: aload_0
    //   120: new java/util/EnumMap
    //   123: dup
    //   124: ldc me/rerere/matrix/internal/yk
    //   126: invokespecial <init> : (Ljava/lang/Class;)V
    //   129: checkcast java/util/Map
    //   132: putfield t : Ljava/util/Map;
    //   135: aload_0
    //   136: aload_0
    //   137: getfield ma : Ljava/lang/String;
    //   140: invokestatic getPlayerExact : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   143: putfield f : Lorg/bukkit/entity/Player;
    //   146: aload_0
    //   147: iconst_m1
    //   148: putfield k : I
    //   151: aload_0
    //   152: getstatic me/rerere/matrix/internal/q.l : Lme/rerere/matrix/internal/u;
    //   155: lload #11
    //   157: iload #13
    //   159: i2c
    //   160: invokevirtual b : (JC)Lme/rerere/matrix/internal/q;
    //   163: putfield c : Lme/rerere/matrix/internal/q;
    //   166: invokestatic r : ()I
    //   169: aload_0
    //   170: new me/rerere/matrix/internal/hn
    //   173: dup
    //   174: lload #19
    //   176: aload_0
    //   177: invokespecial <init> : (JLme/rerere/matrix/internal/yl;)V
    //   180: putfield n : Lme/rerere/matrix/internal/hn;
    //   183: aload_0
    //   184: new me/rerere/matrix/internal/qd
    //   187: dup
    //   188: aload_0
    //   189: getfield q : Ljava/util/UUID;
    //   192: lload #9
    //   194: invokespecial <init> : (Ljava/util/UUID;J)V
    //   197: putfield m : Lme/rerere/matrix/internal/qd;
    //   200: aload_0
    //   201: new me/rerere/matrix/internal/sl
    //   204: dup
    //   205: invokespecial <init> : ()V
    //   208: putfield h : Lme/rerere/matrix/internal/sl;
    //   211: istore #23
    //   213: aload_0
    //   214: new me/rerere/matrix/internal/x
    //   217: dup
    //   218: invokespecial <init> : ()V
    //   221: putfield v : Lme/rerere/matrix/internal/x;
    //   224: aload_0
    //   225: new me/rerere/matrix/internal/gb
    //   228: dup
    //   229: lload #14
    //   231: invokespecial <init> : (J)V
    //   234: putfield j : Lme/rerere/matrix/internal/gb;
    //   237: aload_0
    //   238: new me/rerere/matrix/internal/gm
    //   241: dup
    //   242: aload_0
    //   243: invokespecial <init> : (Lme/rerere/matrix/internal/yl;)V
    //   246: putfield r : Lme/rerere/matrix/internal/gm;
    //   249: aload_0
    //   250: iconst_1
    //   251: putfield e : Z
    //   254: aload_0
    //   255: new me/rerere/matrix/internal/vk
    //   258: dup
    //   259: invokespecial <init> : ()V
    //   262: putfield ya : Lme/rerere/matrix/internal/vk;
    //   265: aload_0
    //   266: new me/rerere/matrix/internal/oc
    //   269: dup
    //   270: ldc java/lang/String
    //   272: lload #7
    //   274: iconst_3
    //   275: invokespecial <init> : (Ljava/lang/Class;JI)V
    //   278: putfield a : Lme/rerere/matrix/internal/oc;
    //   281: aload_0
    //   282: new java/util/concurrent/atomic/AtomicInteger
    //   285: dup
    //   286: iconst_0
    //   287: invokespecial <init> : (I)V
    //   290: putfield u : Ljava/util/concurrent/atomic/AtomicInteger;
    //   293: aload_0
    //   294: new java/util/HashSet
    //   297: dup
    //   298: invokespecial <init> : ()V
    //   301: putfield b : Ljava/util/HashSet;
    //   304: aload_0
    //   305: invokestatic b : ()I
    //   308: iload #23
    //   310: ifeq -> 348
    //   313: bipush #8
    //   315: if_icmple -> 351
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   324: athrow
    //   325: aload_0
    //   326: iload #16
    //   328: iload #17
    //   330: i2b
    //   331: iload #18
    //   333: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   336: invokeinterface isGliding : ()Z
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   347: athrow
    //   348: goto -> 352
    //   351: iconst_0
    //   352: putfield z : Z
    //   355: nop
    //   356: invokestatic b : ()Z
    //   359: iload #23
    //   361: lload_3
    //   362: lconst_0
    //   363: lcmp
    //   364: iflt -> 436
    //   367: ifeq -> 434
    //   370: ifeq -> 431
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   379: athrow
    //   380: aload_0
    //   381: getstatic me/rerere/matrix/internal/q.l : Lme/rerere/matrix/internal/u;
    //   384: lload #11
    //   386: iload #13
    //   388: i2c
    //   389: invokevirtual b : (JC)Lme/rerere/matrix/internal/q;
    //   392: invokevirtual b : ()I
    //   395: putfield k : I
    //   398: aload_0
    //   399: <illegal opcode> run : (Lme/rerere/matrix/internal/yl;)Ljava/lang/Runnable;
    //   404: astore #24
    //   406: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   409: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   412: lload #21
    //   414: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   417: checkcast org/bukkit/plugin/Plugin
    //   420: aload #24
    //   422: ldc2_w 10
    //   425: invokeinterface runTaskLater : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;J)Lorg/bukkit/scheduler/BukkitTask;
    //   430: pop
    //   431: getstatic me/rerere/matrix/internal/t.i : Z
    //   434: iload #23
    //   436: ifeq -> 490
    //   439: ifeq -> 561
    //   442: goto -> 449
    //   445: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   448: athrow
    //   449: aload_0
    //   450: iload #23
    //   452: lload_3
    //   453: lconst_0
    //   454: lcmp
    //   455: iflt -> 495
    //   458: ifeq -> 494
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   467: athrow
    //   468: iload #16
    //   470: iload #17
    //   472: i2b
    //   473: iload #18
    //   475: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   478: lload #5
    //   480: invokestatic b : (Lorg/bukkit/entity/Player;J)Z
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   489: athrow
    //   490: ifeq -> 561
    //   493: aload_0
    //   494: iconst_1
    //   495: putfield w : Z
    //   498: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   501: lload #21
    //   503: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   506: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   509: new java/lang/StringBuilder
    //   512: dup
    //   513: invokespecial <init> : ()V
    //   516: sipush #4717
    //   519: ldc2_w 4654014057479422339
    //   522: lload_3
    //   523: lxor
    //   524: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: aload_0
    //   533: getfield ma : Ljava/lang/String;
    //   536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: sipush #13108
    //   542: ldc2_w 1368888584833163474
    //   545: lload_3
    //   546: lxor
    //   547: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: invokevirtual toString : ()Ljava/lang/String;
    //   558: invokevirtual info : (Ljava/lang/String;)V
    //   561: nop
    //   562: return
    // Exception table:
    //   from	to	target	type
    //   213	318	321	java/lang/RuntimeException
    //   313	341	344	java/lang/RuntimeException
    //   352	373	376	java/lang/RuntimeException
    //   434	442	445	java/lang/RuntimeException
    //   439	461	464	java/lang/RuntimeException
    //   449	483	486	java/lang/RuntimeException
  }
  
  public final void b(@Nullable Location paramLocation) {
    this.y = paramLocation;
  }
  
  public static void i(int paramInt) {
    A = paramInt;
  }
  
  public static int r() {
    return A;
  }
  
  public static int a() {
    int i = r();
    try {
      if (i == 0)
        return 78; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    long l = B ^ 0x3881832038E1L;
    i(5);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[12];
    boolean bool = false;
    String str;
    int i = (str = "\"àÿÓ¼nP¿ 3ñ\0077·®Í\b,§\005­hbþûÖDÇZõGç±{O£Øú*'ºnÉµaì 3\025¡§V±\023E×á\026D>V\016\002²ñÁa=\004µõ]0Ì±ÜY PßUY/½>ÄCrÃIcæJ\023(\025ùY¾B\né> ÒyÀ:{ñ§jj\020Z\\§\tÚÜ£\032YÚÎ¤qÜð\022 yÕ-\\SÖÁÞ\0302OñÎÉv?\\ã¶ò[/±¿¸bî\022\030Ð\026µ4DEÐ\025\007Nêø6=ðÍ&\037+ÆÃTijü\032½sÕ×Sn\031lß\000¢?éM÷Ýe\033\001\032ÜÍà\b>µÝ)A\020È-Ça¯\023*XùVpN\035oòìpm<à\033AªÓ¨sÚD>cÛ&|véò\f+ßMÇaA§ d°\007 ¤Ë$(Ò\032÷ð\035ò\033P!Ýô5Bã`ýÉÇH\021F@¸Çäê{Ö&\025*2CO%2*Ï&0\013éx\034%\001QÒpUlzuBÚm\037L¤ßÈk\006²áQ\021>¿Ç ­Uõbm\004\030ø \020öÒÚ´ÔÀ@\006Xñh¥;0\002}\007:¸6¼>Kh\0203t¦{\030uÞaÁÛ³Nw\027|î(¸!^6lZ\017&\036F.£ã\003*Õ¢ê¬Éi_°£u·ªHOR×>\026­ùhHáãÐ³?e1:Æ¡GDß^ý\031\fÌ\005fÇ\031\"t¤þ3cPiIt]\006V\035R¶cR¡t\022­C\020±Ç«J»\036òÏy½àÛb?)\030üëØ÷:aÃ$¨\016ìS²\004FÂ\003q\023sºß\nL").length();
    byte b2 = 88;
    byte b = -1;
    while (true);
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
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2B69;
    if (D[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])E.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          E.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/yl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = C[i].getBytes("ISO-8859-1");
      D[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return D[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/yl'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */