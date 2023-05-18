package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.util.Vector;

public class sl {
  private long k;
  
  private yn v;
  
  private final List b = new CopyOnWriteArrayList();
  
  private long i = 0L;
  
  private static boolean a;
  
  private static final long c = o3.a(-7058696197451574889L, 4145514138630571069L, MethodHandles.lookup().lookupClass()).a(97560617759885L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public yn p() {
    return this.v;
  }
  
  public void j(double paramDouble1, long paramLong, double paramDouble2, double paramDouble3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sl.c : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 80426893568706
    //   11: lxor
    //   12: dup2
    //   13: bipush #16
    //   15: lushr
    //   16: lstore #9
    //   18: dup2
    //   19: bipush #48
    //   21: lshl
    //   22: bipush #48
    //   24: lushr
    //   25: l2i
    //   26: istore #11
    //   28: pop2
    //   29: pop2
    //   30: new me/rerere/matrix/internal/yn
    //   33: dup
    //   34: dload_1
    //   35: dload #5
    //   37: dload #7
    //   39: invokestatic j : ()J
    //   42: iconst_0
    //   43: invokespecial <init> : (DDDJZ)V
    //   46: astore #13
    //   48: invokestatic a : ()I
    //   51: aload_0
    //   52: aload #13
    //   54: putfield v : Lme/rerere/matrix/internal/yn;
    //   57: istore #12
    //   59: aload_0
    //   60: getfield b : Ljava/util/List;
    //   63: aload #13
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: iload #12
    //   73: ifne -> 203
    //   76: invokestatic currentTimeMillis : ()J
    //   79: aload_0
    //   80: getfield i : J
    //   83: lsub
    //   84: ldc2_w 1500
    //   87: lcmp
    //   88: ifle -> 116
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   97: athrow
    //   98: aload_0
    //   99: invokevirtual b : ()V
    //   102: aload_0
    //   103: invokestatic currentTimeMillis : ()J
    //   106: putfield i : J
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: aload_0
    //   117: invokestatic currentTimeMillis : ()J
    //   120: putfield k : J
    //   123: new java/lang/StringBuilder
    //   126: dup
    //   127: invokespecial <init> : ()V
    //   130: sipush #1684
    //   133: ldc2_w 3582773780824973849
    //   136: lload_3
    //   137: lxor
    //   138: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: dload_1
    //   147: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   150: sipush #30314
    //   153: ldc2_w 5439618025317503718
    //   156: lload_3
    //   157: lxor
    //   158: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: dload #5
    //   168: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   171: sipush #30314
    //   174: ldc2_w 5439618025317503718
    //   177: lload_3
    //   178: lxor
    //   179: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: dload #7
    //   189: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: lload #9
    //   197: iload #11
    //   199: i2s
    //   200: invokestatic b : (Ljava/lang/String;JS)V
    //   203: return
    // Exception table:
    //   from	to	target	type
    //   59	91	94	java/lang/RuntimeException
    //   76	109	112	java/lang/RuntimeException
  }
  
  public Set b(double paramDouble, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sl.c : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: invokestatic currentTimeMillis : ()J
    //   9: lstore #6
    //   11: new java/util/HashSet
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #8
    //   20: invokestatic a : ()I
    //   23: aload_0
    //   24: getfield b : Ljava/util/List;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #9
    //   34: istore #5
    //   36: aload #9
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 180
    //   46: aload #9
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast me/rerere/matrix/internal/yn
    //   56: astore #10
    //   58: lload #6
    //   60: aload #10
    //   62: invokestatic b : (Lme/rerere/matrix/internal/yn;)J
    //   65: lsub
    //   66: ldc2_w 1500
    //   69: lcmp
    //   70: iload #5
    //   72: lload_3
    //   73: lconst_0
    //   74: lcmp
    //   75: iflt -> 114
    //   78: ifne -> 112
    //   81: ifge -> 175
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: dload_1
    //   92: aload #10
    //   94: invokestatic b : (Lme/rerere/matrix/internal/yn;)D
    //   97: dsub
    //   98: invokestatic abs : (D)D
    //   101: ldc2_w 0.005
    //   104: dcmpg
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: iload #5
    //   114: lload_3
    //   115: lconst_0
    //   116: lcmp
    //   117: ifle -> 147
    //   120: ifne -> 145
    //   123: ifgt -> 175
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload #10
    //   135: invokestatic j : (Lme/rerere/matrix/internal/yn;)Z
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: iload #5
    //   147: ifne -> 174
    //   150: ifne -> 175
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: aload #8
    //   162: aload #10
    //   164: invokevirtual add : (Ljava/lang/Object;)Z
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: pop
    //   175: iload #5
    //   177: ifeq -> 36
    //   180: aload #8
    //   182: lload_3
    //   183: lconst_0
    //   184: lcmp
    //   185: iflt -> 53
    //   188: areturn
    // Exception table:
    //   from	to	target	type
    //   58	84	87	java/lang/RuntimeException
    //   81	105	108	java/lang/RuntimeException
    //   112	126	129	java/lang/RuntimeException
    //   123	138	141	java/lang/RuntimeException
    //   145	153	156	java/lang/RuntimeException
    //   150	167	170	java/lang/RuntimeException
  }
  
  public void b(double paramDouble1, int paramInt1, double paramDouble2, double paramDouble3, int paramInt2, short paramShort) {
    // Byte code:
    //   0: iload_3
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload #8
    //   7: i2l
    //   8: bipush #48
    //   10: lshl
    //   11: bipush #32
    //   13: lushr
    //   14: lor
    //   15: iload #9
    //   17: i2l
    //   18: bipush #48
    //   20: lshl
    //   21: bipush #48
    //   23: lushr
    //   24: lor
    //   25: getstatic me/rerere/matrix/internal/sl.c : J
    //   28: lxor
    //   29: lstore #10
    //   31: lload #10
    //   33: dup2
    //   34: ldc2_w 110797283494341
    //   37: lxor
    //   38: dup2
    //   39: bipush #16
    //   41: lushr
    //   42: lstore #12
    //   44: dup2
    //   45: bipush #48
    //   47: lshl
    //   48: bipush #48
    //   50: lushr
    //   51: l2i
    //   52: istore #14
    //   54: pop2
    //   55: pop2
    //   56: invokestatic a : ()I
    //   59: istore #15
    //   61: aload_0
    //   62: getfield b : Ljava/util/List;
    //   65: new me/rerere/matrix/internal/yn
    //   68: dup
    //   69: dload_1
    //   70: dload #4
    //   72: dload #6
    //   74: invokestatic j : ()J
    //   77: iconst_1
    //   78: invokespecial <init> : (DDDJZ)V
    //   81: invokeinterface add : (Ljava/lang/Object;)Z
    //   86: pop
    //   87: iload #15
    //   89: ifne -> 222
    //   92: invokestatic currentTimeMillis : ()J
    //   95: aload_0
    //   96: getfield i : J
    //   99: lsub
    //   100: ldc2_w 1500
    //   103: lcmp
    //   104: ifle -> 132
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: aload_0
    //   115: invokevirtual b : ()V
    //   118: aload_0
    //   119: invokestatic currentTimeMillis : ()J
    //   122: putfield i : J
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: aload_0
    //   133: invokestatic currentTimeMillis : ()J
    //   136: putfield k : J
    //   139: new java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: sipush #19329
    //   149: ldc2_w 8904117760159009806
    //   152: lload #10
    //   154: lxor
    //   155: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: dload_1
    //   164: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   167: sipush #3523
    //   170: ldc2_w 6119238513246276170
    //   173: lload #10
    //   175: lxor
    //   176: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: dload #4
    //   186: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   189: sipush #30314
    //   192: ldc2_w 5439585455359062497
    //   195: lload #10
    //   197: lxor
    //   198: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: dload #6
    //   208: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   211: invokevirtual toString : ()Ljava/lang/String;
    //   214: lload #12
    //   216: iload #14
    //   218: i2s
    //   219: invokestatic b : (Ljava/lang/String;JS)V
    //   222: return
    // Exception table:
    //   from	to	target	type
    //   61	107	110	java/lang/RuntimeException
    //   92	125	128	java/lang/RuntimeException
  }
  
  public boolean j(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/sl.c : J
    //   17: lxor
    //   18: lstore_3
    //   19: new java/util/HashSet
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #6
    //   28: invokestatic a : ()I
    //   31: aload_0
    //   32: getfield b : Ljava/util/List;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore #7
    //   42: istore #5
    //   44: aload #7
    //   46: invokeinterface hasNext : ()Z
    //   51: ifeq -> 159
    //   54: aload #7
    //   56: invokeinterface next : ()Ljava/lang/Object;
    //   61: checkcast me/rerere/matrix/internal/yn
    //   64: astore #8
    //   66: aload #8
    //   68: invokevirtual p : ()Z
    //   71: iload #5
    //   73: iload_1
    //   74: ifle -> 82
    //   77: ifne -> 176
    //   80: iload #5
    //   82: iload_2
    //   83: ifgt -> 124
    //   86: ifne -> 122
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: iload_2
    //   97: ifgt -> 156
    //   100: ifeq -> 154
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: aload #8
    //   112: invokevirtual b : ()Z
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: iload #5
    //   124: ifne -> 153
    //   127: ifeq -> 154
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: aload #6
    //   139: aload #8
    //   141: invokevirtual add : (Ljava/lang/Object;)Z
    //   144: pop
    //   145: iconst_1
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: ireturn
    //   154: iload #5
    //   156: ifeq -> 44
    //   159: aload_0
    //   160: getfield b : Ljava/util/List;
    //   163: aload #6
    //   165: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   170: iload_1
    //   171: iflt -> 176
    //   174: pop
    //   175: iconst_0
    //   176: ireturn
    // Exception table:
    //   from	to	target	type
    //   66	89	92	java/lang/RuntimeException
    //   80	103	106	java/lang/RuntimeException
    //   96	115	118	java/lang/RuntimeException
    //   122	130	133	java/lang/RuntimeException
    //   127	146	149	java/lang/RuntimeException
  }
  
  public List b() {
    return this.b;
  }
  
  public void b() {
    long l = System.currentTimeMillis();
    this.b.removeIf(paramyn -> {
          long l = c ^ 0x126DA268393L;
          int i = yl.a();
          try {
            if (i == 0)
              if (paramLong - yn.b(paramyn) > 1500L) {
              
              } else {
                return false;
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        });
  }
  
  public String b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sl.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: getfield b : Ljava/util/List;
    //   10: invokeinterface size : ()I
    //   15: ifne -> 36
    //   18: sipush #165
    //   21: ldc2_w 5343456654014567844
    //   24: lload_1
    //   25: lxor
    //   26: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   31: areturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: invokestatic currentTimeMillis : ()J
    //   39: lstore_3
    //   40: aload_0
    //   41: getfield b : Ljava/util/List;
    //   44: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   49: lload_3
    //   50: <illegal opcode> test : (J)Ljava/util/function/Predicate;
    //   55: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   60: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   65: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   70: sipush #30314
    //   73: ldc2_w 5439640167099605870
    //   76: lload_1
    //   77: lxor
    //   78: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   83: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   86: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   91: checkcast java/lang/String
    //   94: areturn
    // Exception table:
    //   from	to	target	type
    //   6	32	32	java/lang/RuntimeException
  }
  
  public yn j() {
    return this.v;
  }
  
  @Nullable
  public yn b(double paramDouble, char paramChar, long paramLong) {
    // Byte code:
    //   0: iload_3
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload #4
    //   7: bipush #16
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/sl.c : J
    //   17: lxor
    //   18: lstore #6
    //   20: invokestatic currentTimeMillis : ()J
    //   23: lstore #9
    //   25: invokestatic a : ()I
    //   28: aload_0
    //   29: getfield b : Ljava/util/List;
    //   32: invokeinterface iterator : ()Ljava/util/Iterator;
    //   37: astore #11
    //   39: istore #8
    //   41: aload #11
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 137
    //   51: aload #11
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast me/rerere/matrix/internal/yn
    //   61: astore #12
    //   63: lload #9
    //   65: aload #12
    //   67: invokestatic b : (Lme/rerere/matrix/internal/yn;)J
    //   70: lsub
    //   71: ldc2_w 1500
    //   74: lcmp
    //   75: iload_3
    //   76: iflt -> 115
    //   79: iload #8
    //   81: ifne -> 115
    //   84: ifge -> 132
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: dload_1
    //   95: aload #12
    //   97: invokestatic b : (Lme/rerere/matrix/internal/yn;)D
    //   100: dsub
    //   101: invokestatic abs : (D)D
    //   104: ldc2_w 0.005
    //   107: dcmpg
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: lload #4
    //   117: lconst_0
    //   118: lcmp
    //   119: iflt -> 134
    //   122: ifgt -> 132
    //   125: aload #12
    //   127: areturn
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: iload #8
    //   134: ifeq -> 41
    //   137: aconst_null
    //   138: areturn
    // Exception table:
    //   from	to	target	type
    //   63	87	90	java/lang/RuntimeException
    //   84	108	111	java/lang/RuntimeException
    //   115	128	128	java/lang/RuntimeException
  }
  
  public boolean b(byte paramByte, long paramLong) {
    long l = (paramByte << 56L | paramLong << 8L >>> 8L) ^ c;
    int i = yl.r();
    try {
      if (i != 0)
        if (pc.b() - this.k <= 1500L) {
        
        } else {
          return false;
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(Vector paramVector, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sl.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 82038464013085
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
    //   29: pop2
    //   30: new me/rerere/matrix/internal/yn
    //   33: dup
    //   34: aload_1
    //   35: invokevirtual getX : ()D
    //   38: ldc2_w 114514.191981
    //   41: aload_1
    //   42: invokevirtual getZ : ()D
    //   45: invokestatic j : ()J
    //   48: iconst_1
    //   49: invokespecial <init> : (DDDJZ)V
    //   52: astore #7
    //   54: aload #7
    //   56: iconst_1
    //   57: invokevirtual j : (Z)V
    //   60: aload_0
    //   61: getfield b : Ljava/util/List;
    //   64: aload #7
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_0
    //   73: invokestatic currentTimeMillis : ()J
    //   76: putfield k : J
    //   79: sipush #152
    //   82: ldc2_w 8795020687273848264
    //   85: lload_2
    //   86: lxor
    //   87: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   92: lload #4
    //   94: iload #6
    //   96: i2s
    //   97: invokestatic b : (Ljava/lang/String;JS)V
    //   100: return
  }
  
  public double j(long paramLong) {
    paramLong = c ^ paramLong;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          if (System.currentTimeMillis() - this.k > 1500L)
            return 0.0D; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l = System.currentTimeMillis();
    double d = 0.0D;
    Iterator<yn> iterator = this.b.iterator();
    label28: while (true) {
      while (iterator.hasNext()) {
        yn yn1 = iterator.next();
        try {
          if (yn1 == null)
            continue label28; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (paramLong > 0L)
          if (l - yn.b(yn1) <= 1500L)
            d += yn1.p();  
        if (paramLong > 0L && i != 0)
          break; 
      } 
      break;
    } 
    return d;
  }
  
  public long j() {
    return this.k;
  }
  
  public double b(long paramLong, byte paramByte) {
    long l1 = (paramLong << 8L | paramByte << 56L >>> 56L) ^ c;
    int i = yl.a();
    long l2 = System.currentTimeMillis();
    try {
      if (l2 - this.k > 1500L)
        return 0.0D; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    double d = 0.0D;
    Iterator<yn> iterator = this.b.iterator();
    label23: while (true) {
      while (iterator.hasNext()) {
        yn yn1 = iterator.next();
        try {
          if (yn1 == null)
            continue label23; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (paramByte > 0)
          if (l2 - yn.b(yn1) <= 1500L) {
            double d1 = Math.abs(yn1.b());
            d = Math.max(d, d1);
          }  
        if (paramLong > 0L && i != 0)
          break; 
      } 
      break;
    } 
    return d;
  }
  
  public boolean b(Vector paramVector, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2) {
    // Byte code:
    //   0: iload_2
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_3
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/sl.c : J
    //   27: lxor
    //   28: lstore #9
    //   30: lload #9
    //   32: dup2
    //   33: ldc2_w 117605197544930
    //   36: lxor
    //   37: dup2
    //   38: bipush #16
    //   40: lushr
    //   41: lstore #11
    //   43: dup2
    //   44: bipush #48
    //   46: lshl
    //   47: bipush #48
    //   49: lushr
    //   50: l2i
    //   51: istore #13
    //   53: pop2
    //   54: pop2
    //   55: invokestatic r : ()I
    //   58: istore #14
    //   60: aload_0
    //   61: getfield b : Ljava/util/List;
    //   64: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   69: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   74: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   79: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   84: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   89: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   94: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   99: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   104: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   109: invokestatic toList : ()Ljava/util/stream/Collector;
    //   112: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   117: checkcast java/util/List
    //   120: astore #15
    //   122: aload #15
    //   124: iload #14
    //   126: ifeq -> 152
    //   129: invokeinterface isEmpty : ()Z
    //   134: ifeq -> 150
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: iconst_0
    //   145: ireturn
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: aload #15
    //   152: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   157: <illegal opcode> applyAsDouble : ()Ljava/util/function/ToDoubleFunction;
    //   162: invokeinterface mapToDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
    //   167: invokeinterface sum : ()D
    //   172: dload #5
    //   174: invokestatic abs : (D)D
    //   177: dadd
    //   178: dstore #16
    //   180: aload #15
    //   182: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   187: <illegal opcode> applyAsDouble : ()Ljava/util/function/ToDoubleFunction;
    //   192: invokeinterface mapToDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;
    //   197: invokeinterface sum : ()D
    //   202: dload #7
    //   204: invokestatic abs : (D)D
    //   207: dadd
    //   208: dstore #18
    //   210: aload_1
    //   211: invokestatic b : (Lorg/bukkit/util/Vector;)D
    //   214: dload #16
    //   216: dcmpl
    //   217: iload #14
    //   219: ifeq -> 357
    //   222: ifgt -> 264
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: aload_1
    //   233: invokevirtual getY : ()D
    //   236: invokestatic abs : (D)D
    //   239: dload #18
    //   241: dcmpl
    //   242: iload #14
    //   244: ifeq -> 357
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: ifle -> 358
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: sipush #6793
    //   267: ldc2_w 3690486948533463331
    //   270: lload #9
    //   272: lxor
    //   273: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   278: bipush #6
    //   280: anewarray java/lang/Object
    //   283: dup
    //   284: iconst_0
    //   285: aload_1
    //   286: invokestatic b : (Lorg/bukkit/util/Vector;)D
    //   289: invokestatic valueOf : (D)Ljava/lang/Double;
    //   292: aastore
    //   293: dup
    //   294: iconst_1
    //   295: dload #16
    //   297: invokestatic valueOf : (D)Ljava/lang/Double;
    //   300: aastore
    //   301: dup
    //   302: iconst_2
    //   303: aload_1
    //   304: invokevirtual getY : ()D
    //   307: invokestatic abs : (D)D
    //   310: invokestatic valueOf : (D)Ljava/lang/Double;
    //   313: aastore
    //   314: dup
    //   315: iconst_3
    //   316: dload #18
    //   318: invokestatic valueOf : (D)Ljava/lang/Double;
    //   321: aastore
    //   322: dup
    //   323: iconst_4
    //   324: dload #5
    //   326: invokestatic valueOf : (D)Ljava/lang/Double;
    //   329: aastore
    //   330: dup
    //   331: iconst_5
    //   332: dload #7
    //   334: invokestatic valueOf : (D)Ljava/lang/Double;
    //   337: aastore
    //   338: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   341: lload #11
    //   343: iload #13
    //   345: i2s
    //   346: invokestatic b : (Ljava/lang/String;JS)V
    //   349: iconst_0
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   356: athrow
    //   357: ireturn
    //   358: aload #15
    //   360: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   365: <illegal opcode> applyAsLong : ()Ljava/util/function/ToLongFunction;
    //   370: invokestatic comparingLong : (Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;
    //   373: invokeinterface min : (Ljava/util/Comparator;)Ljava/util/Optional;
    //   378: astore #20
    //   380: iconst_1
    //   381: ireturn
    // Exception table:
    //   from	to	target	type
    //   122	137	140	java/lang/RuntimeException
    //   129	146	146	java/lang/RuntimeException
    //   210	225	228	java/lang/RuntimeException
    //   222	247	250	java/lang/RuntimeException
    //   232	257	260	java/lang/RuntimeException
    //   254	350	353	java/lang/RuntimeException
  }
  
  public long b() {
    return this.i;
  }
  
  @Nullable
  public yn b(int paramInt1, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramInt2 << 32L >>> 32L) ^ c;
    long l2 = System.currentTimeMillis();
    Iterator<yn> iterator = this.b.iterator();
    int i = yl.r();
    while (iterator.hasNext()) {
      yn yn1 = iterator.next();
      try {
        if (i != 0)
          try {
            if (l2 - yn.b(yn1) < 1500L) {
              try {
                if (i != 0) {
                
                } else {
                  return yn.b(yn1) cmp 0.0D;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } else {
              continue;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (l2 - yn.b(yn1) < 1500L)
        return yn1; 
      continue;
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  public static void U(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean B() {
    return a;
  }
  
  public static boolean X() {
    boolean bool = B();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = c ^ 0x2BDC09801027L;
    U(false);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "ÅÄ\0172ËÔ0gie?gG¸Ä\030È\000\rkêÌxsHÑ\\\033¼V¨ST\016«\020Ú^´\002xåC\n\020YÝm»8là\035ºáæbvÙäþÝ°9×Ò>?\023\036â£KEð[jÏ\031X¯ÂÖ]Ò3\t.ø\031à¥½AeÛ\017ª« ¦hÇ\fwÍ\035®\036\030îÐ\f\022Y2\001ð¦í¨¬}Í¶È").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2885;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/sl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/sl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */