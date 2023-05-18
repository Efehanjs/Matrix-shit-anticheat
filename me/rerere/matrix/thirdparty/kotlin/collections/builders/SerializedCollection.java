package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SerializedCollection implements Externalizable {
  @NotNull
  private Collection collection;
  
  private final int tag;
  
  @NotNull
  public static final SerializedCollection$Companion Companion;
  
  public static final int tagList = 0;
  
  public static final int tagSet = 1;
  
  private static final long serialVersionUID = 0L;
  
  private static final long a = o3.a(-5510667340239517432L, 6751047946716786110L, null).a(207946785246411L);
  
  static {
    Companion = new SerializedCollection$Companion(null);
  }
  
  public void writeExternal(@NotNull ObjectOutput paramObjectOutput) {
    long l = a ^ 0xED445FBFE24L;
    Intrinsics.checkNotNullParameter(paramObjectOutput, "output");
    paramObjectOutput.writeByte(this.tag);
    paramObjectOutput.writeInt(this.collection.size());
    for (Object object : this.collection)
      paramObjectOutput.writeObject(object); 
  }
  
  public SerializedCollection() {
    this(CollectionsKt.emptyList(), 0);
  }
  
  public void readExternal(@NotNull ObjectInput paramObjectInput) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/builders/SerializedCollection.a : J
    //   3: ldc2_w 91220133045956
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'input'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokeinterface readByte : ()B
    //   20: istore #4
    //   22: iload #4
    //   24: iconst_1
    //   25: iand
    //   26: istore #5
    //   28: iload #4
    //   30: bipush #-2
    //   32: iand
    //   33: istore #6
    //   35: iload #6
    //   37: ifeq -> 77
    //   40: new java/io/InvalidObjectException
    //   43: dup
    //   44: new java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: ldc 'Unsupported flags value: '
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: iload #4
    //   58: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   61: bipush #46
    //   63: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: athrow
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload_1
    //   78: invokeinterface readInt : ()I
    //   83: istore #7
    //   85: iload #7
    //   87: ifge -> 127
    //   90: new java/io/InvalidObjectException
    //   93: dup
    //   94: new java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: ldc 'Illegal size value: '
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: iload #7
    //   108: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   111: bipush #46
    //   113: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: aload_0
    //   128: iload #5
    //   130: tableswitch default -> 286, 0 -> 152, 1 -> 219
    //   152: iload #7
    //   154: invokestatic createListBuilder : (I)Ljava/util/List;
    //   157: astore #8
    //   159: aload #8
    //   161: astore #9
    //   163: astore #14
    //   165: iconst_0
    //   166: istore #10
    //   168: iconst_0
    //   169: istore #11
    //   171: iload #11
    //   173: iload #7
    //   175: if_icmpge -> 205
    //   178: iload #11
    //   180: istore #12
    //   182: iconst_0
    //   183: istore #13
    //   185: aload #9
    //   187: aload_1
    //   188: invokeinterface readObject : ()Ljava/lang/Object;
    //   193: invokeinterface add : (Ljava/lang/Object;)Z
    //   198: pop
    //   199: iinc #11, 1
    //   202: goto -> 171
    //   205: nop
    //   206: aload #14
    //   208: aload #8
    //   210: invokestatic build : (Ljava/util/List;)Ljava/util/List;
    //   213: checkcast java/util/Collection
    //   216: goto -> 319
    //   219: iload #7
    //   221: invokestatic createSetBuilder : (I)Ljava/util/Set;
    //   224: astore #8
    //   226: aload #8
    //   228: astore #9
    //   230: astore #14
    //   232: iconst_0
    //   233: istore #10
    //   235: iconst_0
    //   236: istore #11
    //   238: iload #11
    //   240: iload #7
    //   242: if_icmpge -> 272
    //   245: iload #11
    //   247: istore #12
    //   249: iconst_0
    //   250: istore #13
    //   252: aload #9
    //   254: aload_1
    //   255: invokeinterface readObject : ()Ljava/lang/Object;
    //   260: invokeinterface add : (Ljava/lang/Object;)Z
    //   265: pop
    //   266: iinc #11, 1
    //   269: goto -> 238
    //   272: nop
    //   273: aload #14
    //   275: aload #8
    //   277: invokestatic build : (Ljava/util/Set;)Ljava/util/Set;
    //   280: checkcast java/util/Collection
    //   283: goto -> 319
    //   286: new java/io/InvalidObjectException
    //   289: dup
    //   290: new java/lang/StringBuilder
    //   293: dup
    //   294: invokespecial <init> : ()V
    //   297: ldc 'Unsupported collection type tag: '
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: iload #5
    //   304: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   307: bipush #46
    //   309: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   312: invokevirtual toString : ()Ljava/lang/String;
    //   315: invokespecial <init> : (Ljava/lang/String;)V
    //   318: athrow
    //   319: putfield collection : Ljava/util/Collection;
    //   322: return
    // Exception table:
    //   from	to	target	type
    //   35	73	73	java/lang/RuntimeException
    //   85	123	123	java/lang/RuntimeException
  }
  
  public SerializedCollection(@NotNull Collection paramCollection, int paramInt) {
    this.collection = paramCollection;
    this.tag = paramInt;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\SerializedCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */