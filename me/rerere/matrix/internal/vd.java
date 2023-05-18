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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.util.Vector;

public class vd extends zk {
  private long r;
  
  private static int x;
  
  private boolean z = false;
  
  private static int k;
  
  @Nullable
  private Vector v;
  
  private int b = 0;
  
  private static boolean i;
  
  private static final long a = o3.a(-1250260896460654355L, 5656870160742323510L, MethodHandles.lookup().lookupClass()).a(16342194378051L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vd.a : J
    //   3: ldc2_w 134936975423372
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #2373
    //   15: ldc2_w 7375050389698927885
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   25: bipush #20
    //   27: invokeinterface getInt : (Ljava/lang/String;I)I
    //   32: putstatic me/rerere/matrix/internal/vd.x : I
    //   35: aload_0
    //   36: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   39: sipush #3126
    //   42: ldc2_w 2118449962321664122
    //   45: lload_1
    //   46: lxor
    //   47: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   52: iconst_1
    //   53: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   58: putstatic me/rerere/matrix/internal/vd.i : Z
    //   61: aload_0
    //   62: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   65: sipush #6131
    //   68: ldc2_w 609162640510665662
    //   71: lload_1
    //   72: lxor
    //   73: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   78: iconst_5
    //   79: invokeinterface getInt : (Ljava/lang/String;I)I
    //   84: putstatic me/rerere/matrix/internal/vd.k : I
    //   87: return
  }
  
  public boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, @NotNull PacketEvent paramPacketEvent) {
    try {
      if (paramPacketType == PacketType.Play.Server.ENTITY_VELOCITY && !paramPacketEvent.isCancelled()) {
        StructureModifier structureModifier = paramPacketContainer.getIntegers();
        int i = ((Integer)structureModifier.read(0)).intValue();
        Player player = paramPacketEvent.getPlayer();
        try {
          if (player != null && i == player.getEntityId()) {
            double d1 = ((Integer)structureModifier.read(1)).intValue() / 8000.0D;
            double d2 = ((Integer)structureModifier.read(2)).intValue() / 8000.0D;
            double d3 = ((Integer)structureModifier.read(3)).intValue() / 8000.0D;
            try {
              if (k >= 0)
                try {
                  if (d2 > 0.1D)
                    try {
                      if (d2 <= 0.5D)
                        try {
                          if (Math.abs(d1) < 1.0D)
                            try {
                              if (Math.abs(d3) < 1.0D) {
                                h();
                                this.v = new Vector(d1, d2, d3);
                                this.z = false;
                                this.b = x;
                              } 
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
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
  
  public void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {
    this.r = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    try {
      if (this.v != null)
        try {
          if (this.b > 0)
            try {
              if (Math.abs(this.v.getY() - paramLocation2.getY() - paramLocation1.getY()) < 0.001D) {
                this.z = true;
                h();
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    this.r = System.currentTimeMillis();
  }
  
  public vd(yl paramyl) {
    super(paramyl);
    b(yk.l);
  }
  
  public void b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: lstore_3
    //   15: lload_3
    //   16: dup2
    //   17: ldc2_w 78396785392265
    //   20: lxor
    //   21: lstore #5
    //   23: dup2
    //   24: ldc2_w 135967213733506
    //   27: lxor
    //   28: lstore #7
    //   30: dup2
    //   31: ldc2_w 62641658356662
    //   34: lxor
    //   35: dup2
    //   36: bipush #32
    //   38: lushr
    //   39: l2i
    //   40: istore #9
    //   42: dup2
    //   43: bipush #32
    //   45: lshl
    //   46: bipush #56
    //   48: lushr
    //   49: l2i
    //   50: istore #10
    //   52: dup2
    //   53: bipush #40
    //   55: lshl
    //   56: bipush #40
    //   58: lushr
    //   59: l2i
    //   60: istore #11
    //   62: pop2
    //   63: pop2
    //   64: aload_0
    //   65: getfield b : I
    //   68: ifle -> 236
    //   71: aload_0
    //   72: dup
    //   73: getfield b : I
    //   76: iconst_1
    //   77: isub
    //   78: putfield b : I
    //   81: aload_0
    //   82: getfield b : I
    //   85: ifne -> 236
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload_0
    //   96: getfield z : Z
    //   99: ifne -> 232
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: aload_0
    //   110: getfield v : Lorg/bukkit/util/Vector;
    //   113: ifnull -> 232
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload_0
    //   124: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   127: iload #9
    //   129: iload #10
    //   131: i2b
    //   132: iload #11
    //   134: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   137: astore #12
    //   139: aload #12
    //   141: ifnull -> 232
    //   144: aload_0
    //   145: aload #12
    //   147: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   152: aload #12
    //   154: lload #7
    //   156: invokespecial b : (Lorg/bukkit/Location;Lorg/bukkit/entity/Player;J)Z
    //   159: ifeq -> 232
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   168: athrow
    //   169: aload_0
    //   170: lload #5
    //   172: sipush #11841
    //   175: ldc2_w 8688119379737652396
    //   178: lload_3
    //   179: lxor
    //   180: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   185: new java/lang/StringBuilder
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: sipush #25613
    //   195: ldc2_w 8713329272037959393
    //   198: lload_3
    //   199: lxor
    //   200: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: aload_0
    //   209: getfield v : Lorg/bukkit/util/Vector;
    //   212: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: iconst_5
    //   222: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: aload_0
    //   233: invokespecial h : ()V
    //   236: return
    // Exception table:
    //   from	to	target	type
    //   64	88	91	java/lang/RuntimeException
    //   71	102	105	java/lang/RuntimeException
    //   95	116	119	java/lang/RuntimeException
    //   139	162	165	java/lang/RuntimeException
    //   144	225	228	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x2C58D1D38CAEL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "µù,f]ðìâ ÍÐ3ö÷\b\027Nì]3-²õp ©°nÀ1à\017÷§_ò\006ÆûgÙfM\021\005»f öp]#ÑÇ@}Ùõn|·®úó§Y\tÑ¾ïÏÍê_\013BüÇ{Øý Pô\005sÀã:¹Âì\020È\001yÂÐ\005â·gª¿ü\013ðg^¨ÿ[å°").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6B8D;
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
        throw new RuntimeException("me/rerere/matrix/internal/vd", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/vd'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */