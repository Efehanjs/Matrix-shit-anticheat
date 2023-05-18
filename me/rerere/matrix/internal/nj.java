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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class nj extends zk {
  private boolean x = false;
  
  private static boolean z;
  
  private boolean k = false;
  
  private int v;
  
  private static int b;
  
  @Nullable
  private yi i;
  
  private static final long a = o3.a(-3554359033843955089L, 7680612580478700115L, MethodHandles.lookup().lookupClass()).a(131968436421456L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    try {
      if (this.k) {
        this.k = false;
        paramBlockPlaceEvent.setCancelled(true);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 79238690796922
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 67137807635861
    //   12: lxor
    //   13: dup2
    //   14: bipush #56
    //   16: lushr
    //   17: l2i
    //   18: istore #7
    //   20: dup2
    //   21: bipush #8
    //   23: lshl
    //   24: bipush #8
    //   26: lushr
    //   27: lstore #8
    //   29: pop2
    //   30: pop2
    //   31: aload_1
    //   32: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   35: if_acmpne -> 88
    //   38: aload #4
    //   40: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   43: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   46: astore #10
    //   48: aload #10
    //   50: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   53: if_acmpne -> 68
    //   56: aload_0
    //   57: iconst_1
    //   58: putfield x : Z
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload #10
    //   70: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.STOP_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   73: if_acmpne -> 88
    //   76: aload_0
    //   77: iconst_0
    //   78: putfield x : Z
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload_1
    //   89: lload #5
    //   91: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   94: ifeq -> 465
    //   97: invokestatic b : ()I
    //   100: bipush #13
    //   102: if_icmpgt -> 465
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: aload_0
    //   113: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   116: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   119: invokevirtual ordinal : ()I
    //   122: getstatic me/rerere/matrix/internal/q.b : Lme/rerere/matrix/internal/q;
    //   125: invokevirtual ordinal : ()I
    //   128: if_icmpgt -> 465
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: aload #4
    //   140: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   143: iconst_0
    //   144: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   147: checkcast java/lang/Float
    //   150: invokevirtual floatValue : ()F
    //   153: fstore #10
    //   155: aload #4
    //   157: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   160: iconst_1
    //   161: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   164: checkcast java/lang/Float
    //   167: invokevirtual floatValue : ()F
    //   170: fstore #11
    //   172: aload #4
    //   174: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   177: iconst_2
    //   178: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   181: checkcast java/lang/Float
    //   184: invokevirtual floatValue : ()F
    //   187: fstore #12
    //   189: aload #4
    //   191: invokevirtual getBlockPositionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   194: iconst_0
    //   195: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   198: checkcast com/comphenix/protocol/wrappers/BlockPosition
    //   201: astore #13
    //   203: new org/bukkit/util/Vector
    //   206: dup
    //   207: aload #13
    //   209: invokevirtual getX : ()I
    //   212: i2f
    //   213: fload #10
    //   215: fadd
    //   216: aload #13
    //   218: invokevirtual getY : ()I
    //   221: i2f
    //   222: fload #11
    //   224: fadd
    //   225: aload #13
    //   227: invokevirtual getZ : ()I
    //   230: i2f
    //   231: fload #12
    //   233: fadd
    //   234: invokespecial <init> : (FFF)V
    //   237: astore #14
    //   239: iconst_0
    //   240: istore #15
    //   242: invokestatic b : ()I
    //   245: bipush #8
    //   247: if_icmpne -> 300
    //   250: aload #4
    //   252: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   255: iconst_0
    //   256: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   259: checkcast java/lang/Integer
    //   262: invokevirtual intValue : ()I
    //   265: istore #16
    //   267: iload #16
    //   269: iconst_2
    //   270: if_icmplt -> 294
    //   273: iload #16
    //   275: iconst_5
    //   276: if_icmpgt -> 294
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   285: athrow
    //   286: iconst_1
    //   287: goto -> 295
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: iconst_0
    //   295: istore #15
    //   297: goto -> 378
    //   300: aload #4
    //   302: invokevirtual getDirections : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   305: iconst_0
    //   306: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   309: checkcast com/comphenix/protocol/wrappers/EnumWrappers$Direction
    //   312: astore #16
    //   314: aload #16
    //   316: getstatic com/comphenix/protocol/wrappers/EnumWrappers$Direction.NORTH : Lcom/comphenix/protocol/wrappers/EnumWrappers$Direction;
    //   319: if_acmpeq -> 367
    //   322: aload #16
    //   324: getstatic com/comphenix/protocol/wrappers/EnumWrappers$Direction.EAST : Lcom/comphenix/protocol/wrappers/EnumWrappers$Direction;
    //   327: if_acmpeq -> 367
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   336: athrow
    //   337: aload #16
    //   339: getstatic com/comphenix/protocol/wrappers/EnumWrappers$Direction.WEST : Lcom/comphenix/protocol/wrappers/EnumWrappers$Direction;
    //   342: if_acmpeq -> 367
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   351: athrow
    //   352: aload #16
    //   354: getstatic com/comphenix/protocol/wrappers/EnumWrappers$Direction.SOUTH : Lcom/comphenix/protocol/wrappers/EnumWrappers$Direction;
    //   357: if_acmpne -> 375
    //   360: goto -> 367
    //   363: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   366: athrow
    //   367: iconst_1
    //   368: goto -> 376
    //   371: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   374: athrow
    //   375: iconst_0
    //   376: istore #15
    //   378: iload #15
    //   380: ifeq -> 465
    //   383: aload #13
    //   385: invokevirtual getY : ()I
    //   388: iconst_m1
    //   389: if_icmpeq -> 465
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   398: athrow
    //   399: getstatic me/rerere/matrix/internal/nj.z : Z
    //   402: ifeq -> 465
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   411: athrow
    //   412: aload_0
    //   413: iload #7
    //   415: i2b
    //   416: lload #8
    //   418: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   421: astore #16
    //   423: aload_0
    //   424: new me/rerere/matrix/internal/yi
    //   427: dup
    //   428: aload #16
    //   430: aload #13
    //   432: aload #16
    //   434: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   439: invokevirtual toLocation : (Lorg/bukkit/World;)Lorg/bukkit/Location;
    //   442: aload #16
    //   444: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   449: invokevirtual clone : ()Lorg/bukkit/Location;
    //   452: aconst_null
    //   453: aload #14
    //   455: aload_0
    //   456: getfield x : Z
    //   459: invokespecial <init> : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;Lorg/bukkit/Location;Lorg/bukkit/Location;Lorg/bukkit/util/Vector;Z)V
    //   462: putfield i : Lme/rerere/matrix/internal/yi;
    //   465: iconst_0
    //   466: ireturn
    // Exception table:
    //   from	to	target	type
    //   48	61	64	java/lang/RuntimeException
    //   68	81	84	java/lang/RuntimeException
    //   88	105	108	java/lang/RuntimeException
    //   97	131	134	java/lang/RuntimeException
    //   267	279	282	java/lang/RuntimeException
    //   273	290	290	java/lang/RuntimeException
    //   314	330	333	java/lang/RuntimeException
    //   322	345	348	java/lang/RuntimeException
    //   337	360	363	java/lang/RuntimeException
    //   352	371	371	java/lang/RuntimeException
    //   378	392	395	java/lang/RuntimeException
    //   383	405	408	java/lang/RuntimeException
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    long l2 = l1 ^ 0x77D3CB4AABB6L;
    try {
      if (this.i != null)
        try {
          if (this.i.k != null) {
            h(l2);
            this.i = null;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, long paramLong, @NotNull Location paramLocation2, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (this.i != null && this.i.k == null) {
        Location location = paramLocation1.clone();
        location.setYaw(paramLocation2.getYaw());
        location.setPitch(paramLocation2.getPitch());
        this.i.k = location;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/nj.a : J
    //   3: ldc2_w 80471347287254
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #16663
    //   15: ldc2_w 8109763711816136379
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/nj.z : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #26075
    //   41: ldc2_w 2019142120509002358
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   51: iconst_5
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/nj.b : I
    //   60: return
  }
  
  public nj(yl paramyl) {
    super(paramyl);
    b(yk.x);
  }
  
  static {
    long l = a ^ 0x17B47C35471L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "rEdì:\fÉm\f#ÕûTÏnh\fü:§#\013 IêqÛ\002&'V/Ãðá«3ÃG\bC_[×þ\000=\027´ãD(¥·ÃÚu<¸,¹\0270è\005çé\020Îaä7èÉàfuQ>\t YØ\0229\022(v(Ñ\017v+ä\032 -¦¿\021\007ta:_M¶\033)â7\024ã/q/²[dîç> C\002àolÅR\023¥\fe¹Æ¡I£~µÝä}Dâ+@ô¦OÖ\030;Ö8©8Æ@e\n½L¾\007w·îÝ~hï@t±\030sÕ\027÷mËZâÈ kÇÓA\035Âµ\tÎÜ¦").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x86F;
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
        throw new RuntimeException("me/rerere/matrix/internal/nj", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/nj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */