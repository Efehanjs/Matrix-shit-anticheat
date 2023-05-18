package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicReference;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SegmentPool {
  private static final int HASH_BUCKET_COUNT;
  
  @NotNull
  private static final AtomicReference[] hashBuckets;
  
  @NotNull
  private static final Segment LOCK;
  
  @NotNull
  public static final SegmentPool INSTANCE;
  
  private static final int MAX_SIZE;
  
  private static final long a = o3.a(3690590573235304471L, 5520302862927655891L, MethodHandles.lookup().lookupClass()).a(137253801511983L);
  
  @NotNull
  public static final Segment take() {
    AtomicReference<Segment> atomicReference = INSTANCE.firstRef();
    Segment segment = atomicReference.getAndSet(LOCK);
    try {
      if (segment == LOCK)
        return new Segment(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (segment == null) {
        atomicReference.set(null);
        return new Segment();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    atomicReference.set(segment.next);
    segment.next = null;
    segment.limit = 0;
    return segment;
  }
  
  public final int getMAX_SIZE() {
    return MAX_SIZE;
  }
  
  public static final void recycle(@NotNull Segment paramSegment) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/SegmentPool.a : J
    //   3: ldc2_w 22224954935171
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc 'segment'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   18: ifnonnull -> 43
    //   21: aload_0
    //   22: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   25: ifnonnull -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: iconst_0
    //   44: istore_3
    //   45: iconst_0
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iconst_0
    //   52: istore #5
    //   54: iconst_0
    //   55: istore #6
    //   57: iload_3
    //   58: ifne -> 84
    //   61: iconst_0
    //   62: istore #7
    //   64: ldc 'Failed requirement.'
    //   66: astore #6
    //   68: new java/lang/IllegalArgumentException
    //   71: dup
    //   72: aload #6
    //   74: invokevirtual toString : ()Ljava/lang/String;
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: checkcast java/lang/Throwable
    //   83: athrow
    //   84: aload_0
    //   85: getfield shared : Z
    //   88: ifeq -> 96
    //   91: return
    //   92: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   95: athrow
    //   96: getstatic me/rerere/matrix/thirdparty/okio/SegmentPool.INSTANCE : Lme/rerere/matrix/thirdparty/okio/SegmentPool;
    //   99: invokespecial firstRef : ()Ljava/util/concurrent/atomic/AtomicReference;
    //   102: astore_3
    //   103: aload_3
    //   104: invokevirtual get : ()Ljava/lang/Object;
    //   107: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   110: astore #4
    //   112: aload #4
    //   114: getstatic me/rerere/matrix/thirdparty/okio/SegmentPool.LOCK : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   117: if_acmpne -> 125
    //   120: return
    //   121: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   124: athrow
    //   125: aload #4
    //   127: astore #6
    //   129: aload #6
    //   131: ifnonnull -> 142
    //   134: iconst_0
    //   135: goto -> 151
    //   138: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   141: athrow
    //   142: aload #6
    //   144: getfield limit : I
    //   147: istore #7
    //   149: iload #7
    //   151: istore #5
    //   153: iload #5
    //   155: getstatic me/rerere/matrix/thirdparty/okio/SegmentPool.INSTANCE : Lme/rerere/matrix/thirdparty/okio/SegmentPool;
    //   158: pop
    //   159: getstatic me/rerere/matrix/thirdparty/okio/SegmentPool.MAX_SIZE : I
    //   162: if_icmplt -> 170
    //   165: return
    //   166: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   169: athrow
    //   170: aload_0
    //   171: aload #4
    //   173: putfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   176: aload_0
    //   177: iconst_0
    //   178: putfield pos : I
    //   181: aload_0
    //   182: iload #5
    //   184: sipush #8192
    //   187: iadd
    //   188: putfield limit : I
    //   191: aload_3
    //   192: aload #4
    //   194: aload_0
    //   195: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   198: ifne -> 213
    //   201: aload_0
    //   202: aconst_null
    //   203: putfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   212: athrow
    //   213: return
    // Exception table:
    //   from	to	target	type
    //   8	28	31	java/lang/IllegalArgumentException
    //   21	39	39	java/lang/IllegalArgumentException
    //   84	92	92	java/lang/IllegalArgumentException
    //   112	121	121	java/lang/IllegalArgumentException
    //   129	138	138	java/lang/IllegalArgumentException
    //   153	166	166	java/lang/IllegalArgumentException
    //   170	206	209	java/lang/IllegalArgumentException
  }
  
  public final int getByteCount() {
    Segment segment2 = firstRef().get();
    try {
      if (segment2 == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Segment segment1 = segment2;
    return segment1.limit;
  }
  
  static {
    INSTANCE = new SegmentPool();
    MAX_SIZE = 65536;
    LOCK = new Segment(new byte[0], 0, 0, false, false);
    HASH_BUCKET_COUNT = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
    int i = 0;
    int j = HASH_BUCKET_COUNT;
    AtomicReference[] arrayOfAtomicReference = new AtomicReference[j];
    while (i < j) {
      int k = i;
      arrayOfAtomicReference[k] = new AtomicReference();
      i++;
    } 
    hashBuckets = arrayOfAtomicReference;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\SegmentPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */