package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;

public final class ij extends zk {
  private double v;
  
  private double b;
  
  private double i;
  
  private static final String[] a;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public final double p() {
    return this.b;
  }
  
  public final double j() {
    return this.i;
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: pop2
    //   9: invokestatic b : ()I
    //   12: bipush #12
    //   14: if_icmpne -> 180
    //   17: aload_1
    //   18: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ITEM : Lcom/comphenix/protocol/PacketType;
    //   21: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   24: ifeq -> 180
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: aload #4
    //   36: invokevirtual getBlockPositionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   39: iconst_0
    //   40: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   43: checkcast com/comphenix/protocol/wrappers/BlockPosition
    //   46: astore #7
    //   48: aload_0
    //   49: getfield i : D
    //   52: aload #7
    //   54: invokevirtual getX : ()I
    //   57: i2d
    //   58: dsub
    //   59: invokestatic abs : (D)D
    //   62: aload_0
    //   63: getfield v : D
    //   66: aload #7
    //   68: invokevirtual getY : ()I
    //   71: i2d
    //   72: dsub
    //   73: invokestatic abs : (D)D
    //   76: dadd
    //   77: aload_0
    //   78: getfield b : D
    //   81: aload #7
    //   83: invokevirtual getZ : ()I
    //   86: i2d
    //   87: dsub
    //   88: invokestatic abs : (D)D
    //   91: dadd
    //   92: dstore #8
    //   94: dload #8
    //   96: ldc2_w 15.0
    //   99: dcmpl
    //   100: ifle -> 180
    //   103: invokestatic random : ()D
    //   106: ldc2_w 0.1
    //   109: dcmpg
    //   110: ifge -> 178
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: aload_0
    //   121: lload #5
    //   123: sipush #21349
    //   126: ldc2_w 5883659359388482011
    //   129: lload_2
    //   130: lxor
    //   131: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   136: new java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: sipush #7572
    //   146: ldc2_w 4544687779587684139
    //   149: lload_2
    //   150: lxor
    //   151: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: dload #8
    //   161: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: iconst_1
    //   168: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: iconst_1
    //   179: ireturn
    //   180: iconst_0
    //   181: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	27	30	java/lang/RuntimeException
    //   94	113	116	java/lang/RuntimeException
    //   103	171	174	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, long paramLong, @NotNull Location paramLocation2, boolean paramBoolean1, boolean paramBoolean2) {
    Location location = paramLocation2;
    boolean bool = false;
    this.i = location.getX();
    this.v = location.getY();
    this.b = location.getZ();
  }
  
  public final void p(double paramDouble) {
    this.b = paramDouble;
  }
  
  public final double b() {
    return this.v;
  }
  
  public final void j(double paramDouble) {
    this.v = paramDouble;
  }
  
  public final void b(double paramDouble) {
    this.i = paramDouble;
  }
  
  public ij(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  static {
    long l = o3.a(635528161744779052L, 4764359750009089874L, MethodHandles.lookup().lookupClass()).a(85173992928474L) ^ 0x8AB718BD15L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "2ä\"I\032ÇxeN¿;on,çµªæÔ9y1T¼&!¦#±u*!ÌÖ\020þ+ÆzvüéÈ9NU[úª9").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7987;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ij", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = a[i].getBytes("ISO-8859-1");
      c[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/ij'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */