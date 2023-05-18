package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class bf extends sm {
  @NotNull
  private List i;
  
  private static final long b = o3.a(-1616864786849926349L, 153477413050742266L, MethodHandles.lookup().lookupClass()).a(47251265655562L);
  
  public bf(@NotNull ie paramie) {
    super(null);
    this.i = paramie.b(paramie, null);
  }
  
  @NotNull
  public final List b() {
    return this.i;
  }
  
  public final void b(@NotNull List paramList) {
    this.i = paramList;
  }
  
  @NotNull
  public final bf b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bf.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 98725780743953
    //   11: lxor
    //   12: dup2
    //   13: bipush #32
    //   15: lushr
    //   16: l2i
    //   17: istore_3
    //   18: dup2
    //   19: bipush #32
    //   21: lshl
    //   22: bipush #48
    //   24: lushr
    //   25: l2i
    //   26: istore #4
    //   28: dup2
    //   29: bipush #48
    //   31: lshl
    //   32: bipush #48
    //   34: lushr
    //   35: l2i
    //   36: istore #5
    //   38: pop2
    //   39: pop2
    //   40: aload_0
    //   41: aload_0
    //   42: getfield i : Ljava/util/List;
    //   45: checkcast java/lang/Iterable
    //   48: astore #7
    //   50: astore #16
    //   52: invokestatic a : ()I
    //   55: iconst_0
    //   56: istore #8
    //   58: aload #7
    //   60: astore #9
    //   62: new java/util/ArrayList
    //   65: dup
    //   66: aload #7
    //   68: bipush #10
    //   70: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   73: invokespecial <init> : (I)V
    //   76: checkcast java/util/Collection
    //   79: astore #10
    //   81: istore #6
    //   83: iconst_0
    //   84: istore #11
    //   86: aload #9
    //   88: invokeinterface iterator : ()Ljava/util/Iterator;
    //   93: astore #12
    //   95: aload #12
    //   97: invokeinterface hasNext : ()Z
    //   102: ifeq -> 181
    //   105: aload #12
    //   107: invokeinterface next : ()Ljava/lang/Object;
    //   112: astore #13
    //   114: aload #10
    //   116: aload #13
    //   118: checkcast java/lang/String
    //   121: astore #14
    //   123: astore #17
    //   125: iconst_0
    //   126: istore #15
    //   128: aload #14
    //   130: iconst_0
    //   131: iconst_1
    //   132: aconst_null
    //   133: iload_3
    //   134: iload #4
    //   136: i2s
    //   137: iload #5
    //   139: i2s
    //   140: invokestatic b : (Ljava/lang/String;CILjava/lang/Object;ISS)Ljava/lang/String;
    //   143: aload #17
    //   145: swap
    //   146: invokeinterface add : (Ljava/lang/Object;)Z
    //   151: pop
    //   152: iload #6
    //   154: lload_1
    //   155: lconst_0
    //   156: lcmp
    //   157: ifle -> 165
    //   160: ifne -> 193
    //   163: iload #6
    //   165: ifeq -> 95
    //   168: lload_1
    //   169: lconst_0
    //   170: lcmp
    //   171: iflt -> 152
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload #10
    //   183: checkcast java/util/List
    //   186: nop
    //   187: aload #16
    //   189: swap
    //   190: putfield i : Ljava/util/List;
    //   193: aload_0
    //   194: areturn
    // Exception table:
    //   from	to	target	type
    //   128	168	177	java/lang/RuntimeException
  }
  
  @NotNull
  public final List b(@Nullable Object paramObject1, @Nullable Object paramObject2) {
    return this.i;
  }
  
  @NotNull
  public final bf b(long paramLong, @NotNull Pair... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bf.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: aload_0
    //   8: getfield i : Ljava/util/List;
    //   11: checkcast java/lang/Iterable
    //   14: astore #5
    //   16: astore #22
    //   18: invokestatic r : ()I
    //   21: iconst_0
    //   22: istore #6
    //   24: aload #5
    //   26: astore #7
    //   28: istore #4
    //   30: new java/util/ArrayList
    //   33: dup
    //   34: aload #5
    //   36: bipush #10
    //   38: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   41: invokespecial <init> : (I)V
    //   44: checkcast java/util/Collection
    //   47: astore #8
    //   49: iconst_0
    //   50: istore #9
    //   52: aload #7
    //   54: invokeinterface iterator : ()Ljava/util/Iterator;
    //   59: astore #10
    //   61: aload #10
    //   63: invokeinterface hasNext : ()Z
    //   68: ifeq -> 247
    //   71: aload #10
    //   73: invokeinterface next : ()Ljava/lang/Object;
    //   78: astore #11
    //   80: aload #8
    //   82: aload #11
    //   84: checkcast java/lang/String
    //   87: astore #12
    //   89: astore #23
    //   91: iconst_0
    //   92: istore #13
    //   94: aconst_null
    //   95: astore #14
    //   97: aload #12
    //   99: astore #14
    //   101: aload_3
    //   102: astore #15
    //   104: iconst_0
    //   105: istore #16
    //   107: iconst_0
    //   108: istore #17
    //   110: iload #4
    //   112: lload_1
    //   113: lconst_0
    //   114: lcmp
    //   115: iflt -> 124
    //   118: ifeq -> 265
    //   121: aload #15
    //   123: arraylength
    //   124: istore #18
    //   126: iload #17
    //   128: iload #18
    //   130: if_icmpge -> 230
    //   133: aload #15
    //   135: iload #17
    //   137: aaload
    //   138: astore #19
    //   140: aload #19
    //   142: astore #20
    //   144: iconst_0
    //   145: istore #21
    //   147: aload #14
    //   149: new java/lang/StringBuilder
    //   152: dup
    //   153: invokespecial <init> : ()V
    //   156: bipush #123
    //   158: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   161: aload #20
    //   163: invokevirtual getFirst : ()Ljava/lang/Object;
    //   166: checkcast java/lang/String
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: bipush #125
    //   174: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   177: invokevirtual toString : ()Ljava/lang/String;
    //   180: aload #20
    //   182: invokevirtual getSecond : ()Ljava/lang/Object;
    //   185: checkcast java/lang/String
    //   188: iconst_0
    //   189: iconst_4
    //   190: aconst_null
    //   191: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   194: astore #14
    //   196: nop
    //   197: nop
    //   198: iinc #17, 1
    //   201: iload #4
    //   203: lload_1
    //   204: lconst_0
    //   205: lcmp
    //   206: ifle -> 244
    //   209: ifeq -> 242
    //   212: iload #4
    //   214: ifne -> 126
    //   217: lload_1
    //   218: lconst_0
    //   219: lcmp
    //   220: iflt -> 201
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: nop
    //   231: aload #14
    //   233: aload #23
    //   235: swap
    //   236: invokeinterface add : (Ljava/lang/Object;)Z
    //   241: pop
    //   242: iload #4
    //   244: ifne -> 61
    //   247: aload #8
    //   249: checkcast java/util/List
    //   252: nop
    //   253: lload_1
    //   254: lconst_0
    //   255: lcmp
    //   256: ifle -> 78
    //   259: aload #22
    //   261: swap
    //   262: putfield i : Ljava/util/List;
    //   265: aload_0
    //   266: areturn
    // Exception table:
    //   from	to	target	type
    //   196	217	226	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */