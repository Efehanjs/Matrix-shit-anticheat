package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CollectionToArray {
  private static final int MAX_SIZE = 2147483645;
  
  @NotNull
  private static final Object[] EMPTY;
  
  private static final long a = o3.a(1131939725343455983L, 6421198083314701483L, null).a(166092859737674L);
  
  @NotNull
  public static final Object[] toArray(@NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/jvm/internal/CollectionToArray.a : J
    //   3: ldc2_w 58485690933418
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc 'collection'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore_3
    //   16: aload_0
    //   17: invokeinterface size : ()I
    //   22: istore #4
    //   24: iload #4
    //   26: ifne -> 38
    //   29: iconst_0
    //   30: istore #5
    //   32: getstatic me/rerere/matrix/thirdparty/kotlin/jvm/internal/CollectionToArray.EMPTY : [Ljava/lang/Object;
    //   35: goto -> 234
    //   38: aload_0
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #5
    //   46: aload #5
    //   48: invokeinterface hasNext : ()Z
    //   53: ifne -> 65
    //   56: iconst_0
    //   57: istore #6
    //   59: getstatic me/rerere/matrix/thirdparty/kotlin/jvm/internal/CollectionToArray.EMPTY : [Ljava/lang/Object;
    //   62: goto -> 234
    //   65: iload #4
    //   67: istore #6
    //   69: iconst_0
    //   70: istore #7
    //   72: iload #6
    //   74: anewarray java/lang/Object
    //   77: astore #6
    //   79: iconst_0
    //   80: istore #7
    //   82: nop
    //   83: aload #6
    //   85: iload #7
    //   87: iinc #7, 1
    //   90: aload #5
    //   92: invokeinterface next : ()Ljava/lang/Object;
    //   97: aastore
    //   98: iload #7
    //   100: aload #6
    //   102: arraylength
    //   103: if_icmplt -> 197
    //   106: aload #5
    //   108: invokeinterface hasNext : ()Z
    //   113: ifne -> 132
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   122: athrow
    //   123: aload #6
    //   125: goto -> 234
    //   128: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   131: athrow
    //   132: iload #7
    //   134: iconst_3
    //   135: imul
    //   136: iconst_1
    //   137: iadd
    //   138: iconst_1
    //   139: iushr
    //   140: istore #8
    //   142: iload #8
    //   144: iload #7
    //   146: if_icmpgt -> 179
    //   149: iload #7
    //   151: ldc 2147483645
    //   153: if_icmplt -> 175
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   162: athrow
    //   163: new java/lang/OutOfMemoryError
    //   166: dup
    //   167: invokespecial <init> : ()V
    //   170: athrow
    //   171: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   174: athrow
    //   175: ldc 2147483645
    //   177: istore #8
    //   179: aload #6
    //   181: iload #8
    //   183: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   186: dup
    //   187: ldc 'copyOf(result, newSize)'
    //   189: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   192: astore #6
    //   194: goto -> 82
    //   197: aload #5
    //   199: invokeinterface hasNext : ()Z
    //   204: ifne -> 82
    //   207: aload #6
    //   209: iload #7
    //   211: istore #9
    //   213: astore #10
    //   215: iconst_0
    //   216: istore #11
    //   218: aload #10
    //   220: iload #9
    //   222: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   225: dup
    //   226: ldc 'copyOf(result, size)'
    //   228: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   231: goto -> 234
    //   234: areturn
    // Exception table:
    //   from	to	target	type
    //   82	116	119	java/lang/NullPointerException
    //   106	128	128	java/lang/NullPointerException
    //   142	156	159	java/lang/NullPointerException
    //   149	171	171	java/lang/NullPointerException
  }
  
  static {
    boolean bool = false;
    EMPTY = new Object[0];
  }
  
  @NotNull
  public static final Object[] toArray(@NotNull Collection paramCollection, @Nullable Object[] paramArrayOfObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/jvm/internal/CollectionToArray.a : J
    //   3: ldc2_w 110889240506088
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc 'collection'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnonnull -> 30
    //   18: new java/lang/NullPointerException
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: athrow
    //   26: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   29: athrow
    //   30: iconst_0
    //   31: istore #4
    //   33: aload_0
    //   34: invokeinterface size : ()I
    //   39: istore #5
    //   41: iload #5
    //   43: ifne -> 69
    //   46: iconst_0
    //   47: istore #6
    //   49: aload_1
    //   50: arraylength
    //   51: ifle -> 65
    //   54: aload_1
    //   55: iconst_0
    //   56: aconst_null
    //   57: aastore
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   64: athrow
    //   65: aload_1
    //   66: goto -> 330
    //   69: aload_0
    //   70: invokeinterface iterator : ()Ljava/util/Iterator;
    //   75: astore #7
    //   77: aload #7
    //   79: invokeinterface hasNext : ()Z
    //   84: ifne -> 110
    //   87: iconst_0
    //   88: istore #6
    //   90: aload_1
    //   91: arraylength
    //   92: ifle -> 106
    //   95: aload_1
    //   96: iconst_0
    //   97: aconst_null
    //   98: aastore
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   105: athrow
    //   106: aload_1
    //   107: goto -> 330
    //   110: iload #5
    //   112: istore #6
    //   114: iconst_0
    //   115: istore #8
    //   117: iload #6
    //   119: aload_1
    //   120: arraylength
    //   121: if_icmpgt -> 132
    //   124: aload_1
    //   125: goto -> 153
    //   128: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   131: athrow
    //   132: aload_1
    //   133: invokevirtual getClass : ()Ljava/lang/Class;
    //   136: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   139: iload #6
    //   141: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   144: dup
    //   145: ldc 'null cannot be cast to non-null type kotlin.Array<kotlin.Any?>'
    //   147: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   150: checkcast [Ljava/lang/Object;
    //   153: astore #9
    //   155: iconst_0
    //   156: istore #6
    //   158: nop
    //   159: aload #9
    //   161: iload #6
    //   163: iinc #6, 1
    //   166: aload #7
    //   168: invokeinterface next : ()Ljava/lang/Object;
    //   173: aastore
    //   174: iload #6
    //   176: aload #9
    //   178: arraylength
    //   179: if_icmplt -> 273
    //   182: aload #7
    //   184: invokeinterface hasNext : ()Z
    //   189: ifne -> 208
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   198: athrow
    //   199: aload #9
    //   201: goto -> 330
    //   204: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   207: athrow
    //   208: iload #6
    //   210: iconst_3
    //   211: imul
    //   212: iconst_1
    //   213: iadd
    //   214: iconst_1
    //   215: iushr
    //   216: istore #8
    //   218: iload #8
    //   220: iload #6
    //   222: if_icmpgt -> 255
    //   225: iload #6
    //   227: ldc 2147483645
    //   229: if_icmplt -> 251
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   238: athrow
    //   239: new java/lang/OutOfMemoryError
    //   242: dup
    //   243: invokespecial <init> : ()V
    //   246: athrow
    //   247: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   250: athrow
    //   251: ldc 2147483645
    //   253: istore #8
    //   255: aload #9
    //   257: iload #8
    //   259: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   262: dup
    //   263: ldc 'copyOf(result, newSize)'
    //   265: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   268: astore #9
    //   270: goto -> 158
    //   273: aload #7
    //   275: invokeinterface hasNext : ()Z
    //   280: ifne -> 158
    //   283: aload #9
    //   285: iload #6
    //   287: istore #10
    //   289: astore #11
    //   291: iconst_0
    //   292: istore #12
    //   294: aload #11
    //   296: aload_1
    //   297: if_acmpne -> 313
    //   300: aload_1
    //   301: iload #10
    //   303: aconst_null
    //   304: aastore
    //   305: aload_1
    //   306: goto -> 326
    //   309: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   312: athrow
    //   313: aload #11
    //   315: iload #10
    //   317: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   320: dup
    //   321: ldc 'copyOf(result, size)'
    //   323: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   326: nop
    //   327: goto -> 330
    //   330: areturn
    // Exception table:
    //   from	to	target	type
    //   8	26	26	java/lang/NullPointerException
    //   49	58	61	java/lang/NullPointerException
    //   90	99	102	java/lang/NullPointerException
    //   117	128	128	java/lang/NullPointerException
    //   158	192	195	java/lang/NullPointerException
    //   182	204	204	java/lang/NullPointerException
    //   218	232	235	java/lang/NullPointerException
    //   225	247	247	java/lang/NullPointerException
    //   294	309	309	java/lang/NullPointerException
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\CollectionToArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */