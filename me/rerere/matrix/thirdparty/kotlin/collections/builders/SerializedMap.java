package me.rerere.matrix.thirdparty.kotlin.collections.builders;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SerializedMap implements Externalizable {
  @NotNull
  private Map map;
  
  private static final long serialVersionUID = 0L;
  
  @NotNull
  public static final SerializedMap$Companion Companion;
  
  private static final long a = o3.a(2464333898691848668L, 5850348056345161327L, null).a(52633430433322L);
  
  public SerializedMap(@NotNull Map paramMap) {
    this.map = paramMap;
  }
  
  public void readExternal(@NotNull ObjectInput paramObjectInput) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/builders/SerializedMap.a : J
    //   3: ldc2_w 35451777361020
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'input'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokeinterface readByte : ()B
    //   20: istore #4
    //   22: iload #4
    //   24: ifeq -> 59
    //   27: new java/io/InvalidObjectException
    //   30: dup
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: ldc 'Unsupported flags value: '
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: iload #4
    //   45: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   48: invokevirtual toString : ()Ljava/lang/String;
    //   51: invokespecial <init> : (Ljava/lang/String;)V
    //   54: athrow
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: aload_1
    //   60: invokeinterface readInt : ()I
    //   65: istore #5
    //   67: iload #5
    //   69: ifge -> 109
    //   72: new java/io/InvalidObjectException
    //   75: dup
    //   76: new java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: ldc 'Illegal size value: '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: iload #5
    //   90: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   93: bipush #46
    //   95: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: athrow
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: aload_0
    //   110: iload #5
    //   112: invokestatic createMapBuilder : (I)Ljava/util/Map;
    //   115: astore #6
    //   117: aload #6
    //   119: astore #7
    //   121: astore #14
    //   123: iconst_0
    //   124: istore #8
    //   126: iconst_0
    //   127: istore #9
    //   129: iload #9
    //   131: iload #5
    //   133: if_icmpge -> 178
    //   136: iload #9
    //   138: istore #10
    //   140: iconst_0
    //   141: istore #11
    //   143: aload_1
    //   144: invokeinterface readObject : ()Ljava/lang/Object;
    //   149: astore #12
    //   151: aload_1
    //   152: invokeinterface readObject : ()Ljava/lang/Object;
    //   157: astore #13
    //   159: aload #7
    //   161: aload #12
    //   163: aload #13
    //   165: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   170: pop
    //   171: nop
    //   172: iinc #9, 1
    //   175: goto -> 129
    //   178: nop
    //   179: aload #14
    //   181: aload #6
    //   183: invokestatic build : (Ljava/util/Map;)Ljava/util/Map;
    //   186: putfield map : Ljava/util/Map;
    //   189: return
    // Exception table:
    //   from	to	target	type
    //   22	55	55	java/lang/RuntimeException
    //   67	105	105	java/lang/RuntimeException
  }
  
  static {
    Companion = new SerializedMap$Companion(null);
  }
  
  public SerializedMap() {
    this(MapsKt.emptyMap());
  }
  
  public void writeExternal(@NotNull ObjectOutput paramObjectOutput) {
    long l = a ^ 0x2349695B1211L;
    Intrinsics.checkNotNullParameter(paramObjectOutput, "output");
    paramObjectOutput.writeByte(0);
    paramObjectOutput.writeInt(this.map.size());
    for (Map.Entry entry : this.map.entrySet()) {
      paramObjectOutput.writeObject(entry.getKey());
      paramObjectOutput.writeObject(entry.getValue());
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\builders\SerializedMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */