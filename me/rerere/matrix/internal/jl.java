package me.rerere.matrix.internal;

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
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class jl extends zk {
  private boolean i = false;
  
  private static final long a = o3.a(5713158833292508054L, 5060145521237244014L, MethodHandles.lookup().lookupClass()).a(144850228473538L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jl.a : J
    //   3: ldc2_w 30964251847575
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 52505769969781
    //   15: lxor
    //   16: lstore #6
    //   18: pop2
    //   19: aload_1
    //   20: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   23: astore #8
    //   25: aload_0
    //   26: getfield i : Z
    //   29: ifne -> 37
    //   32: return
    //   33: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   36: athrow
    //   37: aload #8
    //   39: invokeinterface isSleeping : ()Z
    //   44: ifeq -> 177
    //   47: aload_2
    //   48: aload_3
    //   49: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   52: dstore #9
    //   54: dload #9
    //   56: dconst_0
    //   57: dcmpl
    //   58: ifle -> 174
    //   61: aload_2
    //   62: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   65: invokeinterface getType : ()Lorg/bukkit/Material;
    //   70: invokestatic h : (Lorg/bukkit/Material;)Z
    //   73: ifne -> 174
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: aload_3
    //   84: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   87: invokeinterface getType : ()Lorg/bukkit/Material;
    //   92: invokestatic h : (Lorg/bukkit/Material;)Z
    //   95: ifne -> 174
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload_0
    //   106: lload #6
    //   108: sipush #32427
    //   111: ldc2_w 6559967387656477910
    //   114: lload #4
    //   116: lxor
    //   117: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   122: new java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: sipush #6044
    //   132: ldc2_w 696276533167568352
    //   135: lload #4
    //   137: lxor
    //   138: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: dload #9
    //   148: invokestatic b : (D)D
    //   151: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: bipush #10
    //   159: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   162: aload_1
    //   163: aload_2
    //   164: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: goto -> 182
    //   177: aload_0
    //   178: iconst_0
    //   179: putfield i : Z
    //   182: return
    // Exception table:
    //   from	to	target	type
    //   25	33	33	java/lang/RuntimeException
    //   54	76	79	java/lang/RuntimeException
    //   61	98	101	java/lang/RuntimeException
    //   83	167	170	java/lang/RuntimeException
  }
  
  public jl(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  public void b(@NotNull PlayerBedEnterEvent paramPlayerBedEnterEvent) {
    this.i = true;
  }
  
  static {
    long l = a ^ 0x45AB929049CEL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "»Ü¯±ùWùp8å}Xva½|ky³íH\0065Ë\022ÕyR±>1\0002\030ªäf\013\020S1IËÓ?íØ\n\bo\022/_\017fx").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x39E3;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/jl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/jl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\jl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */