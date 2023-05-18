package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
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
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class pi extends zk {
  private double y = 0.0D;
  
  private int m = 0;
  
  private static int o;
  
  private long q;
  
  private final long t;
  
  private long g;
  
  private long a;
  
  private static int s;
  
  private int u;
  
  private boolean w = false;
  
  private static int f;
  
  private static int l;
  
  private boolean r = false;
  
  private int x;
  
  private int z;
  
  private static final int k = 15;
  
  private static int v;
  
  private long b;
  
  private long i;
  
  private static final long c = o3.a(7502663732786079601L, -7810735684683647990L, MethodHandles.lookup().lookupClass()).a(28681955618578L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public pi(yl paramyl) {
    super(paramyl);
    b(yk.o);
    this.t = pc.j();
  }
  
  static {
    long l = c ^ 0x2907A7BCC224L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "\030_E¤\\u\033,¥­I\036$\rýÊu\025x,ñ6}`K*äËFèê¶´Aá/ \f¢\017bTÊ~ôb´ïëÌã\016dP\017 uúª1f\004¨¬nîB 7)Ïã\024\013äµÅ\037ÌÝ9 i©¬Göå)ÄËÔãza\030Çî7>Qÿ½×w]Â\rlÃe¦¬ÿ\030\t\b\035 \b\016N\b\034Y¦\000g¼ÊWÑÔt±PÿdÏÀ Â¶;·ðêHò\037ÉÒÎÂSU_x\r\013O.½Õ.~Á\0002ëÅ\026Æ\013ä8Ê\bfÏ9Wa\030!:\ri~FO»\027%IÙÂsHÏ<~_\027\n\003I )\002©³e/\tÝÓÏ'$bVü¹!c}387@íÈ\003> \001G\006=n\b×\024ï·Ú\000m\031cÓñÖ\032Å\003¨P{Jú \022!%\021ÃÁ¤Q\034ä\036³\026v×\020IM¼.ûÏ\005MÜ2(©L·o\020,ÈÃU`û7°Ó.ü\000òZz\036Ç!£\r²>À¹Ìí­Z©\027FÁs(ì÷l<\006ÈçWYüf¤¥$ \031óu¬\036\017ðó\030r!WF%KÃXÚ\r\005\020èM\0045*¢« óÍz\034µw").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    int i = (int)((paramLong ^ 0x6CC370BBA896L) >>> 32L);
    int j = (int)((paramLong ^ 0x6CC370BBA896L) << 32L >>> 32L);
    paramLong ^ 0x6CC370BBA896L;
    int k = (int)((paramLong ^ 0x3D0FBD2CD595L) >>> 56L);
    long l1 = (paramLong ^ 0x3D0FBD2CD595L) << 8L >>> 8L;
    paramLong ^ 0x3D0FBD2CD595L;
    long l2 = paramLong ^ 0x46C05E07F999L;
    long l3 = paramLong ^ 0x24D765D0E236L;
    long l4 = paramLong ^ 0x5CA621A3128AL;
    int m = (int)((paramLong ^ 0x3E73AE6D3FF4L) >>> 48L);
    int n = (int)((paramLong ^ 0x3E73AE6D3FF4L) << 16L >>> 48L);
    int i1 = (int)((paramLong ^ 0x3E73AE6D3FF4L) << 32L >>> 32L);
    paramLong ^ 0x3E73AE6D3FF4L;
    boolean bool = false;
    if (v.j(l3, paramPacketType))
      bool = b(i, v.b(l4, paramPacketType), j); 
    try {
      if (paramPacketType == PacketType.Play.Client.BLOCK_PLACE)
        try {
          if (ta.b(b((byte)k, l1), l2).ordinal() >= q.f.ordinal()) {
            this.m++;
            ((in)b().b().b((char)m, in.class, (short)n, i1)).h();
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return bool;
  }
  
  public boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, @NotNull PacketEvent paramPacketEvent) {
    try {
      if (paramPacketType == PacketType.Play.Server.POSITION)
        this.m += 2; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void b(@NotNull PlayerChangedWorldEvent paramPlayerChangedWorldEvent, long paramLong) {
    this.m += 15;
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pi.c : J
    //   3: ldc2_w 46406405227885
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #16945
    //   15: ldc2_w 6959300910954968691
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   25: bipush #15
    //   27: invokeinterface getInt : (Ljava/lang/String;I)I
    //   32: putstatic me/rerere/matrix/internal/pi.f : I
    //   35: aload_0
    //   36: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   39: sipush #15160
    //   42: ldc2_w 3230690825338425207
    //   45: lload_1
    //   46: lxor
    //   47: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   52: bipush #30
    //   54: invokeinterface getInt : (Ljava/lang/String;I)I
    //   59: putstatic me/rerere/matrix/internal/pi.v : I
    //   62: getstatic me/rerere/matrix/internal/pi.v : I
    //   65: bipush #10
    //   67: if_icmpge -> 82
    //   70: bipush #20
    //   72: putstatic me/rerere/matrix/internal/pi.v : I
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: aload_0
    //   83: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   86: sipush #30348
    //   89: ldc2_w 4944812993576125126
    //   92: lload_1
    //   93: lxor
    //   94: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   99: sipush #500
    //   102: invokeinterface getInt : (Ljava/lang/String;I)I
    //   107: putstatic me/rerere/matrix/internal/pi.o : I
    //   110: aload_0
    //   111: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   114: sipush #22978
    //   117: ldc2_w 3727627044568001923
    //   120: lload_1
    //   121: lxor
    //   122: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   127: bipush #10
    //   129: invokeinterface getInt : (Ljava/lang/String;I)I
    //   134: putstatic me/rerere/matrix/internal/pi.l : I
    //   137: aload_0
    //   138: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   141: sipush #2691
    //   144: ldc2_w 308682325577121476
    //   147: lload_1
    //   148: lxor
    //   149: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   154: iconst_4
    //   155: invokeinterface getInt : (Ljava/lang/String;I)I
    //   160: putstatic me/rerere/matrix/internal/pi.s : I
    //   163: return
    // Exception table:
    //   from	to	target	type
    //   8	75	78	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l = c ^ 0x53B000F0A133L;
    int i = (int)((l ^ 0x222DB79A085EL) >>> 32L);
    int j = (int)((l ^ 0x222DB79A085EL) << 32L >>> 48L);
    int k = (int)((l ^ 0x222DB79A085EL) << 48L >>> 48L);
    l ^ 0x222DB79A085EL;
    Player player = paramPlayerMoveEvent.getPlayer();
    try {
      if (this.r)
        try {
          this.r = false;
          if (ta.t(i, (short)j, player, k))
            paramPlayerMoveEvent.setTo(paramLocation1); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (System.currentTimeMillis() - this.i < o)
        paramPlayerMoveEvent.setTo(paramLocation1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    Location location1 = paramPlayerTeleportEvent.getTo();
    Location location2 = paramPlayerTeleportEvent.getFrom();
    try {
      if (location1 != null && paramPlayerTeleportEvent.getCause() != PlayerTeleportEvent.TeleportCause.UNKNOWN) {
        double d1 = Math.abs(location1.getX() - location2.getX());
        double d2 = Math.abs(location1.getZ() - location2.getZ());
        try {
          if (d1 + d2 > 80.0D)
            this.m += 15; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xB8A;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])h.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          h.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/pi", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/pi'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */