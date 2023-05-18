package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.StructureModifier;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class sh extends zk {
  private final ThreadLocalRandom v = ThreadLocalRandom.current();
  
  private int b = 0;
  
  @Nullable
  private ih i = null;
  
  private static final long a = o3.a(-3601240011979494886L, -3960444935758506543L, MethodHandles.lookup().lookupClass()).a(236244092231037L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 53878156034261
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 25653092024530
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 38176283899379
    //   19: lxor
    //   20: dup2
    //   21: bipush #16
    //   23: lushr
    //   24: lstore #9
    //   26: dup2
    //   27: bipush #48
    //   29: lshl
    //   30: bipush #48
    //   32: lushr
    //   33: l2i
    //   34: istore #11
    //   36: pop2
    //   37: dup2
    //   38: ldc2_w 67137807635861
    //   41: lxor
    //   42: dup2
    //   43: bipush #56
    //   45: lushr
    //   46: l2i
    //   47: istore #12
    //   49: dup2
    //   50: bipush #8
    //   52: lshl
    //   53: bipush #8
    //   55: lushr
    //   56: lstore #13
    //   58: pop2
    //   59: pop2
    //   60: aload_1
    //   61: getstatic com/comphenix/protocol/PacketType$Play$Client.TRANSACTION : Lcom/comphenix/protocol/PacketType;
    //   64: if_acmpne -> 392
    //   67: aload #4
    //   69: invokevirtual getShorts : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   72: iconst_0
    //   73: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   76: checkcast java/lang/Short
    //   79: invokevirtual shortValue : ()S
    //   82: istore #15
    //   84: aload_0
    //   85: getfield i : Lme/rerere/matrix/internal/ih;
    //   88: ifnull -> 392
    //   91: iload #15
    //   93: aload_0
    //   94: getfield i : Lme/rerere/matrix/internal/ih;
    //   97: getfield r : S
    //   100: if_icmpne -> 392
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: aload_0
    //   111: getfield i : Lme/rerere/matrix/internal/ih;
    //   114: getfield x : Z
    //   117: ifne -> 392
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: aload_0
    //   128: getfield i : Lme/rerere/matrix/internal/ih;
    //   131: iconst_1
    //   132: putfield x : Z
    //   135: new java/lang/StringBuilder
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: sipush #24268
    //   145: ldc2_w 8211698198645227590
    //   148: lload_2
    //   149: lxor
    //   150: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: aload_0
    //   159: iload #12
    //   161: i2b
    //   162: lload #13
    //   164: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   167: invokeinterface getName : ()Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: sipush #3755
    //   178: ldc2_w 8294641833407352870
    //   181: lload_2
    //   182: lxor
    //   183: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: iload #15
    //   193: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   196: sipush #17100
    //   199: ldc2_w 1579355040631872576
    //   202: lload_2
    //   203: lxor
    //   204: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_0
    //   213: getfield i : Lme/rerere/matrix/internal/ih;
    //   216: getfield v : Z
    //   219: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   222: ldc ')'
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual toString : ()Ljava/lang/String;
    //   230: lload #9
    //   232: iload #11
    //   234: i2s
    //   235: invokestatic b : (Ljava/lang/String;JS)V
    //   238: aload_0
    //   239: getfield i : Lme/rerere/matrix/internal/ih;
    //   242: getfield v : Z
    //   245: ifne -> 373
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: aload_0
    //   256: bipush #20
    //   258: aload_0
    //   259: getfield b : I
    //   262: iconst_2
    //   263: iadd
    //   264: invokestatic min : (II)I
    //   267: putfield b : I
    //   270: aload_0
    //   271: getfield b : I
    //   274: iconst_4
    //   275: if_icmple -> 392
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: aload_0
    //   286: lload #7
    //   288: sipush #26598
    //   291: ldc2_w 3342822786499672429
    //   294: lload_2
    //   295: lxor
    //   296: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   301: new java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial <init> : ()V
    //   308: sipush #11917
    //   311: ldc2_w 2398244788009709572
    //   314: lload_2
    //   315: lxor
    //   316: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: aload_0
    //   325: getfield i : Lme/rerere/matrix/internal/ih;
    //   328: lload #5
    //   330: invokevirtual b : (J)Ljava/lang/String;
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: sipush #31064
    //   339: ldc2_w 7492041638272952272
    //   342: lload_2
    //   343: lxor
    //   344: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: aload_0
    //   353: getfield b : I
    //   356: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   359: invokevirtual toString : ()Ljava/lang/String;
    //   362: iconst_1
    //   363: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   366: goto -> 392
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: aload_0
    //   374: iconst_0
    //   375: aload_0
    //   376: dup
    //   377: getfield b : I
    //   380: iconst_3
    //   381: isub
    //   382: dup_x1
    //   383: putfield b : I
    //   386: invokestatic max : (II)I
    //   389: putfield b : I
    //   392: iconst_0
    //   393: ireturn
    // Exception table:
    //   from	to	target	type
    //   84	103	106	java/lang/RuntimeException
    //   91	120	123	java/lang/RuntimeException
    //   110	248	251	java/lang/RuntimeException
    //   127	278	281	java/lang/RuntimeException
    //   255	369	369	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, long paramLong, @NotNull Location paramLocation2, boolean paramBoolean1, boolean paramBoolean2) {
    int i = (int)((paramLong ^ 0x57F0938533A0L) >>> 48L);
    int j = (int)((paramLong ^ 0x57F0938533A0L) << 16L >>> 32L);
    int k = (int)((paramLong ^ 0x57F0938533A0L) << 48L >>> 48L);
    paramLong ^ 0x57F0938533A0L;
    try {
      if (this.i != null && !this.i.v) {
        double d = paramLocation2.getY() - paramLocation1.getY();
        try {
          if (Math.abs(d - this.i.k) <= 0.001D || Math.abs(d - b((char)i, j, (short)k)) <= 0.001D) {
            Vector vector1 = new Vector(this.i.b, 0.0D, this.i.i);
            Vector vector2 = new Vector(paramLocation2.getX() - paramLocation1.getX(), 0.0D, paramLocation2.getZ() - paramLocation1.getZ());
            double d1 = vector1.distance(vector2);
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            double d2 = 0.026D + (paramBoolean1 ? 0.2D : 0.0D);
            try {
              if (d1 <= d2)
                this.i.v = true; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    long l2 = (l1 ^ 0x19CA003B7A47L) >>> 8L;
    int i = (int)((l1 ^ 0x19CA003B7A47L) << 56L >>> 56L);
    l1 ^ 0x19CA003B7A47L;
    int j = (int)((l1 ^ 0x6D1642D7AFCEL) >>> 56L);
    long l3 = (l1 ^ 0x6D1642D7AFCEL) << 8L >>> 8L;
    l1 ^ 0x6D1642D7AFCEL;
    try {
      if (this.i != null && !this.i.l) {
        this.i.l = true;
        PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.TRANSACTION);
        packetContainer.getIntegers().writeSafely(0, Integer.valueOf(0));
        packetContainer.getShorts().writeSafely(0, Short.valueOf(this.i.r));
        packetContainer.getBooleans().writeSafely(0, Boolean.valueOf(false));
        v.b(l2, (byte)i, b((byte)j, l3), packetContainer);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public sh(yl paramyl) {
    super(paramyl);
    b(yk.l);
  }
  
  public boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, @NotNull PacketEvent paramPacketEvent) {
    try {
      if (paramPacketType == PacketType.Play.Server.ENTITY_VELOCITY && !paramPacketEvent.isCancelled()) {
        StructureModifier structureModifier = paramPacketContainer.getIntegers();
        int i = ((Integer)structureModifier.read(0)).intValue();
        Player player = paramPacketEvent.getPlayer();
        try {
          if (player != null && i == player.getEntityId()) {
            double d1 = ((Integer)structureModifier.readSafely(1)).intValue() / 8000.0D;
            double d2 = ((Integer)structureModifier.readSafely(2)).intValue() / 8000.0D;
            double d3 = ((Integer)structureModifier.readSafely(3)).intValue() / 8000.0D;
            try {
              if (d2 > 0.1D)
                try {
                  if (d1 != 0.0D || d3 != 0.0D) {
                    short s = (short)this.v.nextInt(127);
                    this.i = new ih(d1, d2, d3, s);
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
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
  
  static {
    long l = a ^ 0x210B94951EE1L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "Â\031rB\t£}\023Z\022t¶Á\0008ÃKãFa¦òÂ\0046\026oöë<Ñ\0004\004\020 +,­ÎV\017þÍ*-y\013\021w%]2bÅ®\023÷e\017\020ÖôÛ¢h÷³Ö¯Ô,Ûdi\020ÿ\bºê\020Qa§FÙ\002È").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xDB0;
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
        throw new RuntimeException("me/rerere/matrix/internal/sh", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/sh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */