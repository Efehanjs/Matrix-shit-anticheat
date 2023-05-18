package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState extends FileTreeWalk$DirectoryState {
  @Nullable
  private File[] fileList;
  
  private boolean rootVisited;
  
  private int fileIndex;
  
  private static final long b = o3.a(1804143418651158114L, 5914470820120878258L, null).a(163683809930492L);
  
  public FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState(File paramFile) {
    super(paramFile);
  }
  
  @Nullable
  public File step() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState.b : J
    //   3: ldc2_w 53025226522260
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield rootVisited : Z
    //   12: ifne -> 94
    //   15: aload_0
    //   16: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk$FileTreeWalkIterator;
    //   19: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   22: invokestatic access$getOnEnter$p : (Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;)Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   25: dup
    //   26: ifnull -> 73
    //   29: goto -> 36
    //   32: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual getRoot : ()Ljava/io/File;
    //   40: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   45: checkcast java/lang/Boolean
    //   48: invokevirtual booleanValue : ()Z
    //   51: ifne -> 69
    //   54: goto -> 61
    //   57: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: iconst_1
    //   62: goto -> 75
    //   65: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: iconst_0
    //   70: goto -> 75
    //   73: pop
    //   74: iconst_0
    //   75: ifeq -> 84
    //   78: aconst_null
    //   79: areturn
    //   80: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_0
    //   85: iconst_1
    //   86: putfield rootVisited : Z
    //   89: aload_0
    //   90: invokevirtual getRoot : ()Ljava/io/File;
    //   93: areturn
    //   94: aload_0
    //   95: getfield fileList : [Ljava/io/File;
    //   98: ifnull -> 124
    //   101: aload_0
    //   102: getfield fileIndex : I
    //   105: aload_0
    //   106: getfield fileList : [Ljava/io/File;
    //   109: dup
    //   110: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   113: arraylength
    //   114: if_icmpge -> 308
    //   117: goto -> 124
    //   120: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload_0
    //   125: getfield fileList : [Ljava/io/File;
    //   128: ifnonnull -> 285
    //   131: goto -> 138
    //   134: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: aload_0
    //   139: aload_0
    //   140: invokevirtual getRoot : ()Ljava/io/File;
    //   143: invokevirtual listFiles : ()[Ljava/io/File;
    //   146: putfield fileList : [Ljava/io/File;
    //   149: aload_0
    //   150: getfield fileList : [Ljava/io/File;
    //   153: ifnonnull -> 218
    //   156: goto -> 163
    //   159: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload_0
    //   164: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk$FileTreeWalkIterator;
    //   167: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   170: invokestatic access$getOnFail$p : (Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;)Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;
    //   173: dup
    //   174: ifnull -> 217
    //   177: goto -> 184
    //   180: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_0
    //   185: invokevirtual getRoot : ()Ljava/io/File;
    //   188: new me/rerere/matrix/thirdparty/kotlin/io/AccessDeniedException
    //   191: dup
    //   192: aload_0
    //   193: invokevirtual getRoot : ()Ljava/io/File;
    //   196: aconst_null
    //   197: ldc 'Cannot list files in a directory'
    //   199: iconst_2
    //   200: aconst_null
    //   201: invokespecial <init> : (Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   204: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   209: pop
    //   210: goto -> 218
    //   213: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: pop
    //   218: aload_0
    //   219: getfield fileList : [Ljava/io/File;
    //   222: ifnull -> 244
    //   225: aload_0
    //   226: getfield fileList : [Ljava/io/File;
    //   229: dup
    //   230: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   233: arraylength
    //   234: ifne -> 285
    //   237: goto -> 244
    //   240: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   243: athrow
    //   244: aload_0
    //   245: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk$FileTreeWalkIterator;
    //   248: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   251: invokestatic access$getOnLeave$p : (Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;)Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   254: dup
    //   255: ifnull -> 282
    //   258: goto -> 265
    //   261: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   264: athrow
    //   265: aload_0
    //   266: invokevirtual getRoot : ()Ljava/io/File;
    //   269: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   274: pop
    //   275: goto -> 283
    //   278: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   281: athrow
    //   282: pop
    //   283: aconst_null
    //   284: areturn
    //   285: aload_0
    //   286: getfield fileList : [Ljava/io/File;
    //   289: dup
    //   290: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   293: aload_0
    //   294: getfield fileIndex : I
    //   297: istore_3
    //   298: aload_0
    //   299: iload_3
    //   300: iconst_1
    //   301: iadd
    //   302: putfield fileIndex : I
    //   305: iload_3
    //   306: aaload
    //   307: areturn
    //   308: aload_0
    //   309: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk$FileTreeWalkIterator;
    //   312: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;
    //   315: invokestatic access$getOnLeave$p : (Lme/rerere/matrix/thirdparty/kotlin/io/FileTreeWalk;)Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   318: dup
    //   319: ifnull -> 339
    //   322: aload_0
    //   323: invokevirtual getRoot : ()Ljava/io/File;
    //   326: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   331: pop
    //   332: goto -> 340
    //   335: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   338: athrow
    //   339: pop
    //   340: aconst_null
    //   341: areturn
    // Exception table:
    //   from	to	target	type
    //   8	29	32	java/lang/RuntimeException
    //   15	54	57	java/lang/RuntimeException
    //   36	65	65	java/lang/RuntimeException
    //   75	80	80	java/lang/RuntimeException
    //   94	117	120	java/lang/RuntimeException
    //   101	131	134	java/lang/RuntimeException
    //   124	156	159	java/lang/RuntimeException
    //   138	177	180	java/lang/RuntimeException
    //   163	213	213	java/lang/RuntimeException
    //   218	237	240	java/lang/RuntimeException
    //   225	258	261	java/lang/RuntimeException
    //   244	278	278	java/lang/RuntimeException
    //   308	335	335	java/lang/RuntimeException
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */