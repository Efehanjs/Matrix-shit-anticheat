package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function4;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class GroupingKt__GroupingKt extends GroupingKt__GroupingJVMKt {
  private static final long b = o3.a(9156116312300706046L, 3537413422351990197L, null).a(43424802893899L);
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map reduceTo(@NotNull Grouping paramGrouping, @NotNull Map paramMap, @NotNull Function3 paramFunction3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 51069534909451
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'operation'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: iconst_0
    //   27: istore #5
    //   29: aload_0
    //   30: astore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: aload #6
    //   37: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   42: astore #8
    //   44: aload #8
    //   46: invokeinterface hasNext : ()Z
    //   51: ifeq -> 183
    //   54: aload #8
    //   56: invokeinterface next : ()Ljava/lang/Object;
    //   61: astore #9
    //   63: aload #6
    //   65: aload #9
    //   67: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   72: astore #10
    //   74: aload_1
    //   75: aload #10
    //   77: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   82: astore #11
    //   84: aload_1
    //   85: aload #10
    //   87: aload #10
    //   89: aload #11
    //   91: aload #9
    //   93: aload #11
    //   95: ifnonnull -> 124
    //   98: aload_1
    //   99: aload #10
    //   101: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   106: ifne -> 124
    //   109: goto -> 116
    //   112: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: iconst_1
    //   117: goto -> 125
    //   120: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: iconst_0
    //   125: istore #12
    //   127: astore #13
    //   129: astore #14
    //   131: astore #15
    //   133: astore #18
    //   135: astore #17
    //   137: iconst_0
    //   138: istore #16
    //   140: iload #12
    //   142: ifeq -> 154
    //   145: aload #13
    //   147: goto -> 166
    //   150: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: aload_2
    //   155: aload #15
    //   157: aload #14
    //   159: aload #13
    //   161: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   166: astore #19
    //   168: aload #17
    //   170: aload #18
    //   172: aload #19
    //   174: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   179: pop
    //   180: goto -> 44
    //   183: aload_1
    //   184: areturn
    // Exception table:
    //   from	to	target	type
    //   84	109	112	java/lang/RuntimeException
    //   98	120	120	java/lang/RuntimeException
    //   140	150	150	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map eachCountTo(@NotNull Grouping paramGrouping, @NotNull Map paramMap) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 124752212728877
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: astore #4
    //   23: iconst_0
    //   24: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   27: astore #5
    //   29: iconst_0
    //   30: istore #6
    //   32: aload #4
    //   34: astore #7
    //   36: iconst_0
    //   37: istore #8
    //   39: aload #7
    //   41: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   46: astore #9
    //   48: aload #9
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 192
    //   58: aload #9
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: astore #10
    //   67: aload #7
    //   69: aload #10
    //   71: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: astore #11
    //   78: aload_1
    //   79: aload #11
    //   81: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore #12
    //   88: aload_1
    //   89: aload #11
    //   91: aload #12
    //   93: aload #10
    //   95: aload #12
    //   97: ifnonnull -> 126
    //   100: aload_1
    //   101: aload #11
    //   103: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   108: ifne -> 126
    //   111: goto -> 118
    //   114: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: iconst_1
    //   119: goto -> 127
    //   122: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: iconst_0
    //   127: istore #13
    //   129: astore #14
    //   131: astore #15
    //   133: astore #16
    //   135: astore #17
    //   137: iconst_0
    //   138: istore #18
    //   140: iload #13
    //   142: ifeq -> 154
    //   145: aload #5
    //   147: goto -> 156
    //   150: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: aload #15
    //   156: checkcast java/lang/Number
    //   159: invokevirtual intValue : ()I
    //   162: istore #19
    //   164: iconst_0
    //   165: istore #20
    //   167: iload #19
    //   169: iconst_1
    //   170: iadd
    //   171: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   174: nop
    //   175: astore #19
    //   177: aload #17
    //   179: aload #16
    //   181: aload #19
    //   183: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   188: pop
    //   189: goto -> 48
    //   192: aload_1
    //   193: nop
    //   194: areturn
    // Exception table:
    //   from	to	target	type
    //   88	111	114	java/lang/RuntimeException
    //   100	122	122	java/lang/RuntimeException
    //   140	150	150	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map fold(@NotNull Grouping paramGrouping, Object paramObject, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 74234996290515
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_2
    //   15: ldc 'operation'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore #5
    //   23: aload_0
    //   24: astore #6
    //   26: iconst_0
    //   27: istore #7
    //   29: aload #6
    //   31: astore #8
    //   33: new java/util/LinkedHashMap
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: checkcast java/util/Map
    //   43: astore #9
    //   45: nop
    //   46: iconst_0
    //   47: istore #10
    //   49: aload #8
    //   51: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   56: astore #11
    //   58: aload #11
    //   60: invokeinterface hasNext : ()Z
    //   65: ifeq -> 193
    //   68: aload #11
    //   70: invokeinterface next : ()Ljava/lang/Object;
    //   75: astore #12
    //   77: aload #8
    //   79: aload #12
    //   81: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore #13
    //   88: aload #9
    //   90: aload #13
    //   92: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: astore #14
    //   99: aload #9
    //   101: aload #13
    //   103: aload #14
    //   105: aload #12
    //   107: aload #14
    //   109: ifnonnull -> 139
    //   112: aload #9
    //   114: aload #13
    //   116: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   121: ifne -> 139
    //   124: goto -> 131
    //   127: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_1
    //   132: goto -> 140
    //   135: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: iconst_0
    //   140: istore #15
    //   142: astore #16
    //   144: astore #17
    //   146: astore #20
    //   148: astore #19
    //   150: iconst_0
    //   151: istore #18
    //   153: aload_2
    //   154: iload #15
    //   156: ifeq -> 167
    //   159: aload_1
    //   160: goto -> 169
    //   163: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: aload #17
    //   169: aload #16
    //   171: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   176: astore #21
    //   178: aload #19
    //   180: aload #20
    //   182: aload #21
    //   184: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: goto -> 58
    //   193: aload #9
    //   195: nop
    //   196: areturn
    // Exception table:
    //   from	to	target	type
    //   99	124	127	java/lang/RuntimeException
    //   112	135	135	java/lang/RuntimeException
    //   153	163	163	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map aggregate(@NotNull Grouping paramGrouping, @NotNull Function4 paramFunction4) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 87309540432903
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'operation'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore #4
    //   23: aload_0
    //   24: astore #5
    //   26: new java/util/LinkedHashMap
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: checkcast java/util/Map
    //   36: astore #6
    //   38: nop
    //   39: iconst_0
    //   40: istore #7
    //   42: aload #5
    //   44: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   49: astore #8
    //   51: aload #8
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 153
    //   61: aload #8
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: astore #9
    //   70: aload #5
    //   72: aload #9
    //   74: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   79: astore #10
    //   81: aload #6
    //   83: aload #10
    //   85: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   90: astore #11
    //   92: aload #6
    //   94: aload #10
    //   96: aload_1
    //   97: aload #10
    //   99: aload #11
    //   101: aload #9
    //   103: aload #11
    //   105: ifnonnull -> 135
    //   108: aload #6
    //   110: aload #10
    //   112: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   117: ifne -> 135
    //   120: goto -> 127
    //   123: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iconst_1
    //   128: goto -> 136
    //   131: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: iconst_0
    //   136: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   139: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   144: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   149: pop
    //   150: goto -> 51
    //   153: aload #6
    //   155: areturn
    // Exception table:
    //   from	to	target	type
    //   92	120	123	java/lang/RuntimeException
    //   108	131	131	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map foldTo(@NotNull Grouping paramGrouping, @NotNull Map paramMap, @NotNull Function2 paramFunction2, @NotNull Function3 paramFunction3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 28041998840026
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 'destination'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_2
    //   22: ldc 'initialValueSelector'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: aload_3
    //   28: ldc 'operation'
    //   30: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   33: iconst_0
    //   34: istore #6
    //   36: aload_0
    //   37: astore #7
    //   39: iconst_0
    //   40: istore #8
    //   42: aload #7
    //   44: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   49: astore #9
    //   51: aload #9
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 198
    //   61: aload #9
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: astore #10
    //   70: aload #7
    //   72: aload #10
    //   74: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   79: astore #11
    //   81: aload_1
    //   82: aload #11
    //   84: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   89: astore #12
    //   91: aload_1
    //   92: aload #11
    //   94: aload #11
    //   96: aload #12
    //   98: aload #10
    //   100: aload #12
    //   102: ifnonnull -> 131
    //   105: aload_1
    //   106: aload #11
    //   108: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   113: ifne -> 131
    //   116: goto -> 123
    //   119: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: iconst_1
    //   124: goto -> 132
    //   127: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_0
    //   132: istore #13
    //   134: astore #14
    //   136: astore #15
    //   138: astore #16
    //   140: astore #19
    //   142: astore #18
    //   144: iconst_0
    //   145: istore #17
    //   147: aload_3
    //   148: aload #16
    //   150: iload #13
    //   152: ifeq -> 172
    //   155: aload_2
    //   156: aload #16
    //   158: aload #14
    //   160: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   165: goto -> 174
    //   168: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   171: athrow
    //   172: aload #15
    //   174: aload #14
    //   176: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   181: astore #20
    //   183: aload #18
    //   185: aload #19
    //   187: aload #20
    //   189: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   194: pop
    //   195: goto -> 51
    //   198: aload_1
    //   199: areturn
    // Exception table:
    //   from	to	target	type
    //   91	116	119	java/lang/RuntimeException
    //   105	127	127	java/lang/RuntimeException
    //   147	168	168	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map foldTo(@NotNull Grouping paramGrouping, @NotNull Map paramMap, Object paramObject, @NotNull Function2 paramFunction2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 45178421958172
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 'destination'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_3
    //   22: ldc 'operation'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: iconst_0
    //   28: istore #6
    //   30: aload_0
    //   31: astore #7
    //   33: iconst_0
    //   34: istore #8
    //   36: aload #7
    //   38: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   43: astore #9
    //   45: aload #9
    //   47: invokeinterface hasNext : ()Z
    //   52: ifeq -> 177
    //   55: aload #9
    //   57: invokeinterface next : ()Ljava/lang/Object;
    //   62: astore #10
    //   64: aload #7
    //   66: aload #10
    //   68: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   73: astore #11
    //   75: aload_1
    //   76: aload #11
    //   78: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   83: astore #12
    //   85: aload_1
    //   86: aload #11
    //   88: aload #12
    //   90: aload #10
    //   92: aload #12
    //   94: ifnonnull -> 123
    //   97: aload_1
    //   98: aload #11
    //   100: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   105: ifne -> 123
    //   108: goto -> 115
    //   111: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: iconst_1
    //   116: goto -> 124
    //   119: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: iconst_0
    //   124: istore #13
    //   126: astore #14
    //   128: astore #15
    //   130: astore #18
    //   132: astore #17
    //   134: iconst_0
    //   135: istore #16
    //   137: aload_3
    //   138: iload #13
    //   140: ifeq -> 151
    //   143: aload_2
    //   144: goto -> 153
    //   147: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: aload #15
    //   153: aload #14
    //   155: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   160: astore #19
    //   162: aload #17
    //   164: aload #18
    //   166: aload #19
    //   168: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   173: pop
    //   174: goto -> 45
    //   177: aload_1
    //   178: areturn
    // Exception table:
    //   from	to	target	type
    //   85	108	111	java/lang/RuntimeException
    //   97	119	119	java/lang/RuntimeException
    //   137	147	147	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map fold(@NotNull Grouping paramGrouping, @NotNull Function2 paramFunction2, @NotNull Function3 paramFunction3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 90794299248908
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'initialValueSelector'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'operation'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: iconst_0
    //   27: istore #5
    //   29: aload_0
    //   30: astore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: aload #6
    //   37: astore #8
    //   39: new java/util/LinkedHashMap
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: checkcast java/util/Map
    //   49: astore #9
    //   51: nop
    //   52: iconst_0
    //   53: istore #10
    //   55: aload #8
    //   57: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   62: astore #11
    //   64: aload #11
    //   66: invokeinterface hasNext : ()Z
    //   71: ifeq -> 214
    //   74: aload #11
    //   76: invokeinterface next : ()Ljava/lang/Object;
    //   81: astore #12
    //   83: aload #8
    //   85: aload #12
    //   87: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: astore #13
    //   94: aload #9
    //   96: aload #13
    //   98: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   103: astore #14
    //   105: aload #9
    //   107: aload #13
    //   109: aload #13
    //   111: aload #14
    //   113: aload #12
    //   115: aload #14
    //   117: ifnonnull -> 147
    //   120: aload #9
    //   122: aload #13
    //   124: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   129: ifne -> 147
    //   132: goto -> 139
    //   135: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: iconst_1
    //   140: goto -> 148
    //   143: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: iconst_0
    //   148: istore #15
    //   150: astore #16
    //   152: astore #17
    //   154: astore #18
    //   156: astore #21
    //   158: astore #20
    //   160: iconst_0
    //   161: istore #19
    //   163: aload_2
    //   164: aload #18
    //   166: iload #15
    //   168: ifeq -> 188
    //   171: aload_1
    //   172: aload #18
    //   174: aload #16
    //   176: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   181: goto -> 190
    //   184: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload #17
    //   190: aload #16
    //   192: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   197: astore #22
    //   199: aload #20
    //   201: aload #21
    //   203: aload #22
    //   205: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   210: pop
    //   211: goto -> 64
    //   214: aload #9
    //   216: nop
    //   217: areturn
    // Exception table:
    //   from	to	target	type
    //   105	132	135	java/lang/RuntimeException
    //   120	143	143	java/lang/RuntimeException
    //   163	184	184	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map reduce(@NotNull Grouping paramGrouping, @NotNull Function3 paramFunction3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 21008179525905
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'operation'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: iconst_0
    //   21: istore #4
    //   23: aload_0
    //   24: astore #5
    //   26: iconst_0
    //   27: istore #6
    //   29: aload #5
    //   31: astore #7
    //   33: new java/util/LinkedHashMap
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: checkcast java/util/Map
    //   43: astore #8
    //   45: nop
    //   46: iconst_0
    //   47: istore #9
    //   49: aload #7
    //   51: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   56: astore #10
    //   58: aload #10
    //   60: invokeinterface hasNext : ()Z
    //   65: ifeq -> 200
    //   68: aload #10
    //   70: invokeinterface next : ()Ljava/lang/Object;
    //   75: astore #11
    //   77: aload #7
    //   79: aload #11
    //   81: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore #12
    //   88: aload #8
    //   90: aload #12
    //   92: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: astore #13
    //   99: aload #8
    //   101: aload #12
    //   103: aload #12
    //   105: aload #13
    //   107: aload #11
    //   109: aload #13
    //   111: ifnonnull -> 141
    //   114: aload #8
    //   116: aload #12
    //   118: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   123: ifne -> 141
    //   126: goto -> 133
    //   129: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: iconst_1
    //   134: goto -> 142
    //   137: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: iconst_0
    //   142: istore #14
    //   144: astore #15
    //   146: astore #16
    //   148: astore #17
    //   150: astore #20
    //   152: astore #19
    //   154: iconst_0
    //   155: istore #18
    //   157: iload #14
    //   159: ifeq -> 171
    //   162: aload #15
    //   164: goto -> 183
    //   167: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: aload_1
    //   172: aload #17
    //   174: aload #16
    //   176: aload #15
    //   178: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   183: astore #21
    //   185: aload #19
    //   187: aload #20
    //   189: aload #21
    //   191: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   196: pop
    //   197: goto -> 58
    //   200: aload #8
    //   202: nop
    //   203: areturn
    // Exception table:
    //   from	to	target	type
    //   99	126	129	java/lang/RuntimeException
    //   114	137	137	java/lang/RuntimeException
    //   157	167	167	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map aggregateTo(@NotNull Grouping paramGrouping, @NotNull Map paramMap, @NotNull Function4 paramFunction4) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingKt.b : J
    //   3: ldc2_w 87715081561927
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'destination'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'operation'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: iconst_0
    //   27: istore #5
    //   29: aload_0
    //   30: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   35: astore #6
    //   37: aload #6
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 135
    //   47: aload #6
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: astore #7
    //   56: aload_0
    //   57: aload #7
    //   59: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: astore #8
    //   66: aload_1
    //   67: aload #8
    //   69: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   74: astore #9
    //   76: aload_1
    //   77: aload #8
    //   79: aload_2
    //   80: aload #8
    //   82: aload #9
    //   84: aload #7
    //   86: aload #9
    //   88: ifnonnull -> 117
    //   91: aload_1
    //   92: aload #8
    //   94: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   99: ifne -> 117
    //   102: goto -> 109
    //   105: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: iconst_1
    //   110: goto -> 118
    //   113: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: iconst_0
    //   118: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   121: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   126: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: goto -> 37
    //   135: aload_1
    //   136: areturn
    // Exception table:
    //   from	to	target	type
    //   76	102	105	java/lang/RuntimeException
    //   91	113	113	java/lang/RuntimeException
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\GroupingKt__GroupingKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */