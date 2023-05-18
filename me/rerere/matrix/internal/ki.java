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
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class ki extends zk {
  private int x = 0;
  
  private long z;
  
  private static boolean k;
  
  private long v;
  
  private static int b;
  
  private long i;
  
  private static final long a = o3.a(-5685163042773271528L, -1512283328914661615L, MethodHandles.lookup().lookupClass()).a(159259526701302L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ki.a : J
    //   3: ldc2_w 49818508459731
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   12: invokevirtual b : ()Lme/rerere/matrix/internal/ci;
    //   15: invokevirtual j : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   18: sipush #3192
    //   21: ldc2_w 835393508685758711
    //   24: lload_1
    //   25: lxor
    //   26: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   31: iconst_1
    //   32: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   37: putstatic me/rerere/matrix/internal/ki.k : Z
    //   40: aload_0
    //   41: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   44: sipush #12605
    //   47: ldc2_w 1761363093504490934
    //   50: lload_1
    //   51: lxor
    //   52: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   57: iconst_1
    //   58: invokeinterface getInt : (Ljava/lang/String;I)I
    //   63: putstatic me/rerere/matrix/internal/ki.b : I
    //   66: return
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l1 = paramLong ^ 0x48113204757AL;
    long l2 = paramLong ^ 0x24D765D0E236L;
    if (v.j(l2, paramPacketType)) {
      long l3 = pc.j();
      long l4 = l3 - this.v;
      try {
        this.v = l3;
        if (l4 <= 40L) {
          this.x++;
          this.z = l3;
        } else {
          this.x = 0;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (v.m(paramPacketType, l1))
        this.i = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public ki(yl paramyl) {
    super(paramyl);
    b(yk.u);
  }
  
  public void b(int paramInt, short paramShort, char paramChar, @NotNull PlayerItemConsumeEvent paramPlayerItemConsumeEvent) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: lstore #5
    //   25: lload #5
    //   27: dup2
    //   28: ldc2_w 31532284044548
    //   31: lxor
    //   32: lstore #7
    //   34: dup2
    //   35: ldc2_w 15496421244420
    //   38: lxor
    //   39: lstore #9
    //   41: dup2
    //   42: ldc2_w 67392666033149
    //   45: lxor
    //   46: dup2
    //   47: bipush #32
    //   49: lushr
    //   50: l2i
    //   51: istore #11
    //   53: dup2
    //   54: bipush #32
    //   56: lshl
    //   57: bipush #48
    //   59: lushr
    //   60: l2i
    //   61: istore #12
    //   63: dup2
    //   64: bipush #48
    //   66: lshl
    //   67: bipush #48
    //   69: lushr
    //   70: l2i
    //   71: istore #13
    //   73: pop2
    //   74: pop2
    //   75: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   78: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   81: iload #11
    //   83: iload #12
    //   85: iload #13
    //   87: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   90: aload #4
    //   92: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   95: lload #7
    //   97: dup2_x1
    //   98: pop2
    //   99: invokeinterface b : (JLorg/bukkit/inventory/ItemStack;)I
    //   104: istore #14
    //   106: invokestatic j : ()J
    //   109: aload_0
    //   110: getfield i : J
    //   113: lsub
    //   114: l2d
    //   115: iload #14
    //   117: i2d
    //   118: ldc2_w 50.0
    //   121: dmul
    //   122: ddiv
    //   123: dstore #15
    //   125: dconst_1
    //   126: dload #15
    //   128: dsub
    //   129: ldc2_w 100.0
    //   132: dmul
    //   133: d2i
    //   134: istore #17
    //   136: getstatic me/rerere/matrix/internal/ki.b : I
    //   139: ifle -> 322
    //   142: dload #15
    //   144: ldc2_w 0.82
    //   147: dcmpg
    //   148: ifgt -> 322
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: aload_0
    //   159: getfield x : I
    //   162: bipush #20
    //   164: if_icmplt -> 322
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: invokestatic j : ()J
    //   177: aload_0
    //   178: getfield z : J
    //   181: lsub
    //   182: ldc2_w 75
    //   185: lcmp
    //   186: ifgt -> 322
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: aload_0
    //   197: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   200: invokevirtual j : ()I
    //   203: sipush #160
    //   206: if_icmpge -> 322
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   215: athrow
    //   216: aload_0
    //   217: lload #9
    //   219: sipush #15224
    //   222: ldc2_w 5080907540859004377
    //   225: lload #5
    //   227: lxor
    //   228: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   233: new java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: sipush #26945
    //   243: ldc2_w 3725269470134695907
    //   246: lload #5
    //   248: lxor
    //   249: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: iload #17
    //   259: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   262: sipush #11693
    //   265: ldc2_w 5898397630599508750
    //   268: lload #5
    //   270: lxor
    //   271: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: getstatic me/rerere/matrix/internal/ki.b : I
    //   285: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   288: getstatic me/rerere/matrix/internal/ki.k : Z
    //   291: ifeq -> 322
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: aload #4
    //   303: iconst_1
    //   304: invokevirtual setCancelled : (Z)V
    //   307: aload #4
    //   309: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   312: invokestatic p : (Lorg/bukkit/entity/Player;)V
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   321: athrow
    //   322: return
    // Exception table:
    //   from	to	target	type
    //   136	151	154	java/lang/RuntimeException
    //   142	167	170	java/lang/RuntimeException
    //   158	189	192	java/lang/RuntimeException
    //   174	209	212	java/lang/RuntimeException
    //   196	294	297	java/lang/RuntimeException
    //   216	315	318	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x49E187223EAAL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "\tx;\b1\026X·sÒ\002Å+gÎºMÑ¸\030R×\026L®\027DòËû\003\0139â·~\034ÕDýXL&DÛÂm`ve\035ªªç BìRôbpy\027\017:ï¿n~«+¡\016â;õ6å@OÇê¾§\016¿SÓý)×gðzñò\023¥VDÛ,ßS%\025>Ó$c\037¦\016ï\004\0133\007É×Ú").length();
    byte b2 = 24;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x734E;
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
        throw new RuntimeException("me/rerere/matrix/internal/ki", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ki'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */