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
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public final class hl extends zk {
  @NotNull
  public static final zh f;
  
  private int l;
  
  @NotNull
  private final sb r = new sb(20);
  
  private static boolean x;
  
  private double z;
  
  private int k;
  
  private static double v;
  
  private long b = pc.j();
  
  private int i;
  
  private static int a;
  
  private static final long c = o3.a(2887304972355897790L, 5056599003527532459L, MethodHandles.lookup().lookupClass()).a(199814754338146L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map g = new HashMap<>(13);
  
  public final void b(double paramDouble) {
    this.z -= paramDouble;
  }
  
  public void b(char paramChar, long paramLong, @NotNull EntityShootBowEvent paramEntityShootBowEvent) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_2
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: lstore #5
    //   15: lload #5
    //   17: dup2
    //   18: ldc2_w 52211906537997
    //   21: lxor
    //   22: lstore #7
    //   24: pop2
    //   25: aload #4
    //   27: invokevirtual getProjectile : ()Lorg/bukkit/entity/Entity;
    //   30: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   35: invokevirtual length : ()D
    //   38: ldc2_w 3.5
    //   41: dcmpl
    //   42: ifle -> 117
    //   45: aload_0
    //   46: getfield r : Lme/rerere/matrix/internal/sb;
    //   49: checkcast java/lang/Iterable
    //   52: invokestatic averageOfLong : (Ljava/lang/Iterable;)D
    //   55: ldc2_w 40.0
    //   58: dcmpg
    //   59: ifge -> 117
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: aload #4
    //   71: iconst_1
    //   72: invokevirtual setCancelled : (Z)V
    //   75: aload_0
    //   76: lload #7
    //   78: sipush #2465
    //   81: ldc2_w 4904245607448549047
    //   84: lload #5
    //   86: lxor
    //   87: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   92: sipush #20881
    //   95: ldc2_w 6219480750044761731
    //   98: lload #5
    //   100: lxor
    //   101: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   106: iconst_0
    //   107: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: return
    // Exception table:
    //   from	to	target	type
    //   25	62	65	java/lang/RuntimeException
    //   45	110	113	java/lang/RuntimeException
  }
  
  public final long b() {
    return this.b;
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    if (this.i > 0) {
      int i = this.i;
      this.i = i + -1;
      if (zb.b(paramLocation1, paramLocation2) < 1.0D) {
        Location location1 = paramPlayerMoveEvent.getFrom().clone();
        Location location2 = location1;
        PlayerMoveEvent playerMoveEvent = paramPlayerMoveEvent;
        boolean bool = false;
        location2.setY(paramLocation2.getY());
        playerMoveEvent.setTo(location1);
      } 
    } 
  }
  
  static {
    long l = c ^ 0x7770CC3F6BF2L;
    k(79);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "¼ï\027öæû\001´\025lÄ¦ÚÜËZ±N\037·/Ü]2ÞÙPE[(h\nÌ\027«püYS\036W®3Ô¯opõÁ¥>4ÝýÉWYÃXTìÊ8ÿ<GH\024B\\\020§³kfÖ69·gS¨$öiw4;\004;c)\b±1gÜ£ÇRw7ç]OÄoúZ¤üÙ0\013Ènì\033N+Ør¥\033;ñ«â\030x\001ºvU\001v>±Î'ÿX¼¢FU\001Ü\f$ÍnðDå").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public final void b(long paramLong) {
    this.b = paramLong;
  }
  
  public boolean b(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    if (Intrinsics.areEqual(paramPacketType, PacketType.Play.Server.POSITION)) {
      int i = this.k;
      this.k = i + 1;
      this.z -= 0.1D;
    } 
    return false;
  }
  
  public hl(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/hl.c : J
    //   3: ldc2_w 32904700224035
    //   6: lxor
    //   7: lstore_1
    //   8: getstatic me/rerere/matrix/internal/hl.f : Lme/rerere/matrix/internal/zh;
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   16: sipush #14626
    //   19: ldc2_w 3815261844572954647
    //   22: lload_1
    //   23: lxor
    //   24: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   29: ldc2_w -15.0
    //   32: invokeinterface getDouble : (Ljava/lang/String;D)D
    //   37: putstatic me/rerere/matrix/internal/hl.v : D
    //   40: getstatic me/rerere/matrix/internal/hl.f : Lme/rerere/matrix/internal/zh;
    //   43: pop
    //   44: aload_0
    //   45: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   48: sipush #8565
    //   51: ldc2_w 4892514632507029570
    //   54: lload_1
    //   55: lxor
    //   56: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   61: iconst_1
    //   62: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   67: putstatic me/rerere/matrix/internal/hl.x : Z
    //   70: return
  }
  
  public final void j(int paramInt) {
    this.i = paramInt;
  }
  
  public final int p() {
    return this.i;
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l1 = paramLong ^ 0x11CAED504C91L;
    long l2 = paramLong ^ 0x24D765D0E236L;
    try {
      if (v.j(l2, paramPacketType))
        if (this.k > 0) {
          int i = this.k;
          this.k = i + -1;
        } else {
          try {
            if (this.l > 0 && Intrinsics.areEqual(paramPacketType, PacketType.Play.Client.POSITION_LOOK)) {
              int i = this.l;
              this.l = i + -1;
            } else {
              h(l1);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void k(int paramInt) {
    a = paramInt;
  }
  
  public static int t() {
    return a;
  }
  
  public static int e() {
    int i = t();
    try {
      if (i == 0)
        return 110; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x66F5;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])g.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          g.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/hl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/hl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\hl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */