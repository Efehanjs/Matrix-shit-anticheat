package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequenceScope;
import me.rerere.matrix.thirdparty.okio.FileSystem;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _FileSystemKt$commonListRecursively$1 extends RestrictedSuspendLambda implements Function2 {
  public int label;
  
  public Object L$2;
  
  public Object L$1;
  
  private static final long a = o3.a(824277342434455168L, 3249260950128450467L, MethodHandles.lookup().lookupClass()).a(191365799986533L);
  
  public _FileSystemKt$commonListRecursively$1(Path paramPath, FileSystem paramFileSystem, boolean paramBoolean, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((_FileSystemKt$commonListRecursively$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_FileSystemKt$commonListRecursively$1.a : J
    //   3: ldc2_w 87356306670629
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #8
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 209, 0 -> 40, 1 -> 169
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   51: astore #4
    //   53: new me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore #5
    //   62: aload #5
    //   64: aload_0
    //   65: getfield $dir : Lme/rerere/matrix/thirdparty/okio/Path;
    //   68: invokevirtual addLast : (Ljava/lang/Object;)V
    //   71: aload_0
    //   72: getfield $this_commonListRecursively : Lme/rerere/matrix/thirdparty/okio/FileSystem;
    //   75: aload_0
    //   76: getfield $dir : Lme/rerere/matrix/thirdparty/okio/Path;
    //   79: invokevirtual list : (Lme/rerere/matrix/thirdparty/okio/Path;)Ljava/util/List;
    //   82: invokeinterface iterator : ()Ljava/util/Iterator;
    //   87: astore #6
    //   89: aload #6
    //   91: invokeinterface hasNext : ()Z
    //   96: ifeq -> 205
    //   99: aload #6
    //   101: invokeinterface next : ()Ljava/lang/Object;
    //   106: checkcast me/rerere/matrix/thirdparty/okio/Path
    //   109: astore #7
    //   111: aload #4
    //   113: aload_0
    //   114: getfield $this_commonListRecursively : Lme/rerere/matrix/thirdparty/okio/FileSystem;
    //   117: aload #5
    //   119: aload #7
    //   121: aload_0
    //   122: getfield $followSymlinks : Z
    //   125: iconst_0
    //   126: aload_0
    //   127: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   130: aload_0
    //   131: aload #4
    //   133: putfield L$0 : Ljava/lang/Object;
    //   136: aload_0
    //   137: aload #5
    //   139: putfield L$1 : Ljava/lang/Object;
    //   142: aload_0
    //   143: aload #6
    //   145: putfield L$2 : Ljava/lang/Object;
    //   148: aload_0
    //   149: iconst_1
    //   150: putfield label : I
    //   153: invokestatic collectRecursively : (Lme/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope;Lme/rerere/matrix/thirdparty/okio/FileSystem;Lme/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque;Lme/rerere/matrix/thirdparty/okio/Path;ZZLme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   156: dup
    //   157: aload #8
    //   159: if_acmpne -> 201
    //   162: aload #8
    //   164: areturn
    //   165: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   168: athrow
    //   169: aload_0
    //   170: getfield L$2 : Ljava/lang/Object;
    //   173: checkcast java/util/Iterator
    //   176: astore #6
    //   178: aload_0
    //   179: getfield L$1 : Ljava/lang/Object;
    //   182: checkcast me/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque
    //   185: astore #5
    //   187: aload_0
    //   188: getfield L$0 : Ljava/lang/Object;
    //   191: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   194: astore #4
    //   196: aload_1
    //   197: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   200: aload_1
    //   201: pop
    //   202: goto -> 89
    //   205: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   208: areturn
    //   209: new java/lang/IllegalStateException
    //   212: dup
    //   213: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: athrow
    // Exception table:
    //   from	to	target	type
    //   111	165	165	java/lang/IllegalStateException
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    _FileSystemKt$commonListRecursively$1 _FileSystemKt$commonListRecursively$11 = new _FileSystemKt$commonListRecursively$1(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, paramContinuation);
    _FileSystemKt$commonListRecursively$11.L$0 = paramObject;
    return (Continuation)_FileSystemKt$commonListRecursively$11;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_FileSystemKt$commonListRecursively$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */