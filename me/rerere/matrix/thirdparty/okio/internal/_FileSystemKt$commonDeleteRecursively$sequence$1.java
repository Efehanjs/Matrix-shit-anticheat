package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.ArrayDeque;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics.IntrinsicsKt;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequenceScope;
import me.rerere.matrix.thirdparty.okio.FileSystem;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _FileSystemKt$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements Function2 {
  public int label;
  
  private static final long a = o3.a(-4598767111887738487L, 7577500643831705510L, MethodHandles.lookup().lookupClass()).a(98814062422153L);
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((_FileSystemKt$commonDeleteRecursively$sequence$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    SequenceScope sequenceScope;
    long l = a ^ 0x199891ACE75FL;
    Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    switch (this.label) {
      case 0:
        ResultKt.throwOnFailure(paramObject);
        sequenceScope = (SequenceScope)this.L$0;
        try {
          this.label = 1;
          if (_FileSystemKt.collectRecursively(sequenceScope, this.$this_commonDeleteRecursively, new ArrayDeque(), this.$fileOrDirectory, false, true, (Continuation)this) == object)
            return object; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        _FileSystemKt.collectRecursively(sequenceScope, this.$this_commonDeleteRecursively, new ArrayDeque(), this.$fileOrDirectory, false, true, (Continuation)this);
        return Unit.INSTANCE;
      case 1:
        ResultKt.throwOnFailure(paramObject);
        return Unit.INSTANCE;
    } 
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
  
  public _FileSystemKt$commonDeleteRecursively$sequence$1(FileSystem paramFileSystem, Path paramPath, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    _FileSystemKt$commonDeleteRecursively$sequence$1 _FileSystemKt$commonDeleteRecursively$sequence$11 = new _FileSystemKt$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, paramContinuation);
    _FileSystemKt$commonDeleteRecursively$sequence$11.L$0 = paramObject;
    return (Continuation)_FileSystemKt$commonDeleteRecursively$sequence$11;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_FileSystemKt$commonDeleteRecursively$sequence$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */