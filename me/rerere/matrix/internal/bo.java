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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class bo extends zk {
  private float z;
  
  @NotNull
  private static final Set k;
  
  private long v;
  
  private float b;
  
  private long i;
  
  private static final String[] a;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_3
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: lstore #5
    //   26: lload #5
    //   28: dup2
    //   29: ldc2_w 137262009759190
    //   32: lxor
    //   33: lstore #7
    //   35: dup2
    //   36: ldc2_w 82684992244414
    //   39: lxor
    //   40: dup2
    //   41: bipush #48
    //   43: lushr
    //   44: l2i
    //   45: istore #9
    //   47: dup2
    //   48: bipush #16
    //   50: lshl
    //   51: bipush #32
    //   53: lushr
    //   54: l2i
    //   55: istore #10
    //   57: dup2
    //   58: bipush #48
    //   60: lshl
    //   61: bipush #48
    //   63: lushr
    //   64: l2i
    //   65: istore #11
    //   67: pop2
    //   68: pop2
    //   69: invokestatic currentTimeMillis : ()J
    //   72: aload_0
    //   73: getfield v : J
    //   76: lsub
    //   77: ldc2_w 1000
    //   80: lcmp
    //   81: ifge -> 338
    //   84: aload_0
    //   85: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   88: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   91: invokevirtual ordinal : ()I
    //   94: getstatic me/rerere/matrix/internal/q.f : Lme/rerere/matrix/internal/q;
    //   97: invokevirtual ordinal : ()I
    //   100: if_icmpge -> 338
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: aload_2
    //   111: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   114: astore #12
    //   116: aload #12
    //   118: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   123: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   126: invokeinterface getType : ()Lorg/bukkit/Material;
    //   131: invokestatic r : (Lorg/bukkit/Material;)Z
    //   134: ifeq -> 338
    //   137: aload #12
    //   139: invokestatic m : (Lorg/bukkit/entity/Player;)Z
    //   142: ifeq -> 338
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: aload #12
    //   154: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   157: ifne -> 338
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: iload #9
    //   169: i2c
    //   170: aload #12
    //   172: iload #10
    //   174: iload #11
    //   176: invokestatic p : (CLorg/bukkit/entity/Player;II)Z
    //   179: ifne -> 338
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: getstatic me/rerere/matrix/internal/bo.k : Ljava/util/Set;
    //   192: aload #12
    //   194: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   199: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   202: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   205: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   210: invokeinterface getType : ()Lorg/bukkit/Material;
    //   215: invokeinterface contains : (Ljava/lang/Object;)Z
    //   220: ifne -> 338
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   233: invokevirtual j : ()Z
    //   236: ifeq -> 338
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: aload_0
    //   247: lload #7
    //   249: sipush #2898
    //   252: ldc2_w 2255193619830591004
    //   255: lload #5
    //   257: lxor
    //   258: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   263: new java/lang/StringBuilder
    //   266: dup
    //   267: invokespecial <init> : ()V
    //   270: sipush #25627
    //   273: ldc2_w 1515213736766185810
    //   276: lload #5
    //   278: lxor
    //   279: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: aload_0
    //   288: getfield z : F
    //   291: invokestatic b : (F)F
    //   294: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   297: sipush #4819
    //   300: ldc2_w 5329165907782195096
    //   303: lload #5
    //   305: lxor
    //   306: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: aload_0
    //   315: getfield b : F
    //   318: invokestatic b : (F)F
    //   321: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   324: invokevirtual toString : ()Ljava/lang/String;
    //   327: iconst_5
    //   328: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: return
    // Exception table:
    //   from	to	target	type
    //   69	103	106	java/lang/RuntimeException
    //   116	145	148	java/lang/RuntimeException
    //   137	160	163	java/lang/RuntimeException
    //   152	182	185	java/lang/RuntimeException
    //   167	223	226	java/lang/RuntimeException
    //   189	239	242	java/lang/RuntimeException
    //   230	331	334	java/lang/RuntimeException
  }
  
  public bo(yl paramyl) {
    super(paramyl);
    b(yk.x);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    int i = (int)((paramLong ^ 0x68E11A3019EDL) >>> 32L);
    int j = (int)((paramLong ^ 0x68E11A3019EDL) << 32L >>> 56L);
    int k = (int)((paramLong ^ 0x68E11A3019EDL) << 40L >>> 40L);
    paramLong ^ 0x68E11A3019EDL;
    try {
      if (paramPacketType == PacketType.Play.Client.LOOK || paramPacketType == PacketType.Play.Client.POSITION_LOOK) {
        float f1 = ((Float)paramPacketContainer.getFloat().read(0)).floatValue();
        float f2 = ((Float)paramPacketContainer.getFloat().read(1)).floatValue();
        try {
          if (f2 == this.b)
            try {
              if (f1 == this.z && System.currentTimeMillis() - this.i > (1000 + b().j())) {
                Player player = b().j(i, (byte)j, k);
                try {
                  if (!player.isInsideVehicle())
                    this.v = System.currentTimeMillis(); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.z = f1;
        this.b = f2;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "ä\027 ~C·-!\fÑ©·@*\030wá\005Iu÷\007jT7@®H%\001ñQF.ÌDÛ\t(\t{½ôn\003SlÓ¨ö\030uoþ\032Á£Ôßc\025\021\016\\ÎÐ¿dÍ |sNU ?`G­r\016A'\034\002|qè\003\bÖ³\031Àó¬pJnÓ¼\007").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    this.i = System.currentTimeMillis();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6377;
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
        throw new RuntimeException("me/rerere/matrix/internal/bo", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/bo'
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
  
  static {
    long l = o3.a(2316513469452815971L, 5097239367795652662L, MethodHandles.lookup().lookupClass()).a(134716081879715L) ^ 0x1A1B52ECB1EEL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */