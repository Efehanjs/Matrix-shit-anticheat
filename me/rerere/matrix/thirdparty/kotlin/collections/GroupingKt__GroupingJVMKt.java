package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class GroupingKt__GroupingJVMKt {
  private static final long a = o3.a(-1824004436754624183L, 4904129102654194133L, null).a(216853924441356L);
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Map eachCount(@NotNull Grouping paramGrouping) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/GroupingKt__GroupingJVMKt.a : J
    //   3: ldc2_w 133072851492055
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: astore_3
    //   16: new java/util/LinkedHashMap
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: checkcast java/util/Map
    //   26: astore #4
    //   28: nop
    //   29: iconst_0
    //   30: istore #5
    //   32: aload_3
    //   33: astore #6
    //   35: iconst_0
    //   36: istore #7
    //   38: aload #6
    //   40: invokeinterface sourceIterator : ()Ljava/util/Iterator;
    //   45: astore #8
    //   47: aload #8
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 226
    //   57: aload #8
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: astore #9
    //   66: aload #6
    //   68: aload #9
    //   70: invokeinterface keyOf : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: astore #10
    //   77: aload #4
    //   79: aload #10
    //   81: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore #11
    //   88: aload #4
    //   90: aload #10
    //   92: aload #10
    //   94: aload #11
    //   96: aload #9
    //   98: aload #11
    //   100: ifnonnull -> 130
    //   103: aload #4
    //   105: aload #10
    //   107: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   112: ifne -> 130
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: iconst_1
    //   123: goto -> 131
    //   126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   129: athrow
    //   130: iconst_0
    //   131: istore #12
    //   133: astore #13
    //   135: astore #14
    //   137: astore #15
    //   139: astore #16
    //   141: astore #17
    //   143: iconst_0
    //   144: istore #18
    //   146: aload #15
    //   148: iload #12
    //   150: ifeq -> 171
    //   153: astore #26
    //   155: iconst_0
    //   156: istore #21
    //   158: new me/rerere/matrix/thirdparty/kotlin/jvm/internal/Ref$IntRef
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: aload #26
    //   167: swap
    //   168: goto -> 173
    //   171: aload #14
    //   173: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/internal/Ref$IntRef
    //   176: astore #19
    //   178: pop
    //   179: iconst_0
    //   180: istore #22
    //   182: aload #19
    //   184: astore #23
    //   186: aload #23
    //   188: astore #24
    //   190: iconst_0
    //   191: istore #25
    //   193: aload #24
    //   195: aload #24
    //   197: getfield element : I
    //   200: iconst_1
    //   201: iadd
    //   202: putfield element : I
    //   205: aload #23
    //   207: nop
    //   208: nop
    //   209: astore #20
    //   211: aload #17
    //   213: aload #16
    //   215: aload #20
    //   217: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   222: pop
    //   223: goto -> 47
    //   226: aload #4
    //   228: nop
    //   229: astore_3
    //   230: aload_3
    //   231: invokeinterface entrySet : ()Ljava/util/Set;
    //   236: checkcast java/lang/Iterable
    //   239: astore #4
    //   241: aload #4
    //   243: invokeinterface iterator : ()Ljava/util/Iterator;
    //   248: astore #5
    //   250: aload #5
    //   252: invokeinterface hasNext : ()Z
    //   257: ifeq -> 321
    //   260: aload #5
    //   262: invokeinterface next : ()Ljava/lang/Object;
    //   267: checkcast java/util/Map$Entry
    //   270: astore #6
    //   272: aload #6
    //   274: ldc 'null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>'
    //   276: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   279: aload #6
    //   281: invokestatic asMutableMapEntry : (Ljava/lang/Object;)Ljava/util/Map$Entry;
    //   284: aload #6
    //   286: astore #7
    //   288: astore #26
    //   290: iconst_0
    //   291: istore #8
    //   293: aload #7
    //   295: invokeinterface getValue : ()Ljava/lang/Object;
    //   300: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/internal/Ref$IntRef
    //   303: getfield element : I
    //   306: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   309: aload #26
    //   311: swap
    //   312: invokeinterface setValue : (Ljava/lang/Object;)Ljava/lang/Object;
    //   317: pop
    //   318: goto -> 250
    //   321: aload_3
    //   322: invokestatic asMutableMap : (Ljava/lang/Object;)Ljava/util/Map;
    //   325: areturn
    // Exception table:
    //   from	to	target	type
    //   88	115	118	java/lang/RuntimeException
    //   103	126	126	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\GroupingKt__GroupingJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */