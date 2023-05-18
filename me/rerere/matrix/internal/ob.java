package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.collections.ArrayDeque;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ob implements Iterable, KMappedMarker {
  private final int b;
  
  @NotNull
  private final ArrayDeque i;
  
  private static int[] a;
  
  private static final long c = o3.a(4477982236133215120L, 7292012144885632178L, MethodHandles.lookup().lookupClass()).a(106881627124763L);
  
  private static final String d;
  
  public final synchronized void b() {
    this.i.clear();
  }
  
  public final void p(long paramLong, Object paramObject) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x193407902474L;
    b(l, paramObject);
  }
  
  public ob(int paramInt) {
    this.b = paramInt;
    this.i = new ArrayDeque();
  }
  
  public final synchronized boolean p(long paramLong) {
    paramLong = c ^ paramLong;
    int i = yl.a();
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.i.size() == this.b);
  }
  
  public final synchronized void j(Object paramObject) {
    this.i.remove(paramObject);
  }
  
  public final synchronized boolean j() {
    return this.i.isEmpty();
  }
  
  public final synchronized boolean b(Object paramObject) {
    return CollectionsKt.contains(this, paramObject);
  }
  
  public final synchronized int b() {
    return this.i.size();
  }
  
  public final void b(@NotNull Function1 paramFunction1, long paramLong, int paramInt) {
    // Byte code:
    //   0: lload_2
    //   1: bipush #32
    //   3: lshl
    //   4: iload #4
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/ob.c : J
    //   17: lxor
    //   18: lstore #5
    //   20: iconst_0
    //   21: istore #8
    //   23: invokestatic a : ()I
    //   26: aload_0
    //   27: astore #9
    //   29: istore #7
    //   31: aload #9
    //   33: monitorenter
    //   34: nop
    //   35: iconst_0
    //   36: istore #10
    //   38: aload_0
    //   39: invokevirtual b : ()Lme/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque;
    //   42: checkcast java/lang/Iterable
    //   45: astore #11
    //   47: iconst_0
    //   48: istore #12
    //   50: aload #11
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore #13
    //   59: aload #13
    //   61: invokeinterface hasNext : ()Z
    //   66: ifeq -> 115
    //   69: aload #13
    //   71: invokeinterface next : ()Ljava/lang/Object;
    //   76: astore #14
    //   78: aload_1
    //   79: aload #14
    //   81: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: pop
    //   87: iload #7
    //   89: iload #4
    //   91: ifge -> 99
    //   94: ifne -> 117
    //   97: iload #7
    //   99: ifeq -> 59
    //   102: lload_2
    //   103: lconst_0
    //   104: lcmp
    //   105: iflt -> 87
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: nop
    //   116: nop
    //   117: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   120: astore #10
    //   122: iconst_1
    //   123: invokestatic finallyStart : (I)V
    //   126: aload #9
    //   128: monitorexit
    //   129: iconst_1
    //   130: invokestatic finallyEnd : (I)V
    //   133: goto -> 152
    //   136: astore #10
    //   138: iconst_1
    //   139: invokestatic finallyStart : (I)V
    //   142: aload #9
    //   144: monitorexit
    //   145: iconst_1
    //   146: invokestatic finallyEnd : (I)V
    //   149: aload #10
    //   151: athrow
    //   152: return
    // Exception table:
    //   from	to	target	type
    //   34	122	136	finally
    //   78	102	111	java/lang/RuntimeException
    //   136	138	136	finally
  }
  
  @NotNull
  public String toString() {
    long l = c ^ 0x60C7BF75B911L;
    return d + this.i + ')';
  }
  
  public final synchronized void b(long paramLong, Object paramObject) {
    paramLong = c ^ paramLong;
    int i = yl.a();
    try {
      this.i.add(paramObject);
      if (i == 0)
        try {
          if (this.i.size() > this.b) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public synchronized Iterator iterator() {
    return this.i.iterator();
  }
  
  public final synchronized Object b() {
    return this.i.last();
  }
  
  public final synchronized boolean b(long paramLong) {
    paramLong = c ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        if (!((Collection)this.i).isEmpty()) {
        
        } else {
          return false;
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final ArrayDeque b() {
    return this.i;
  }
  
  public static void D(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] Y() {
    return a;
  }
  
  static {
    long l = c ^ 0x3286CBAA56A3L;
    D(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */