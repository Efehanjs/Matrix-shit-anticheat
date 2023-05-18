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

public class se extends zk {
  private long r;
  
  private int x;
  
  private int z = 0;
  
  private long k;
  
  private int v;
  
  private long b;
  
  private boolean i;
  
  private static final long a = o3.a(-7899578406185732616L, -1039012517949720939L, MethodHandles.lookup().lookupClass()).a(48710284823782L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 115316016290285
    //   12: lxor
    //   13: dup2
    //   14: bipush #32
    //   16: lushr
    //   17: l2i
    //   18: istore #7
    //   20: dup2
    //   21: bipush #32
    //   23: lshl
    //   24: bipush #56
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #40
    //   33: lshl
    //   34: bipush #40
    //   36: lushr
    //   37: l2i
    //   38: istore #9
    //   40: pop2
    //   41: pop2
    //   42: iconst_0
    //   43: istore #10
    //   45: aload_1
    //   46: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   49: if_acmpne -> 181
    //   52: aload #4
    //   54: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   57: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   60: astore #11
    //   62: aload #11
    //   64: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   67: if_acmpne -> 181
    //   70: invokestatic currentTimeMillis : ()J
    //   73: aload_0
    //   74: getfield r : J
    //   77: lsub
    //   78: lstore #12
    //   80: lload #12
    //   82: ldc2_w 45
    //   85: lcmp
    //   86: ifge -> 169
    //   89: aload_0
    //   90: dup
    //   91: getfield z : I
    //   94: iconst_1
    //   95: iadd
    //   96: dup_x1
    //   97: putfield z : I
    //   100: iconst_3
    //   101: if_icmplt -> 174
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: aload_0
    //   112: lload #5
    //   114: sipush #26572
    //   117: ldc2_w 4318048254046949481
    //   120: lload_2
    //   121: lxor
    //   122: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   127: new java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: sipush #15299
    //   137: ldc2_w 4376680738896481383
    //   140: lload_2
    //   141: lxor
    //   142: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: lload #12
    //   152: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: bipush #30
    //   160: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   163: iconst_1
    //   164: istore #10
    //   166: goto -> 174
    //   169: aload_0
    //   170: iconst_0
    //   171: putfield z : I
    //   174: aload_0
    //   175: invokestatic currentTimeMillis : ()J
    //   178: putfield r : J
    //   181: aload_1
    //   182: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   185: if_acmpne -> 360
    //   188: aload #4
    //   190: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   193: iconst_0
    //   194: invokevirtual read : (I)Ljava/lang/Object;
    //   197: checkcast com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType
    //   200: astore #11
    //   202: aload #11
    //   204: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.RELEASE_USE_ITEM : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   207: if_acmpne -> 360
    //   210: invokestatic currentTimeMillis : ()J
    //   213: aload_0
    //   214: getfield b : J
    //   217: lsub
    //   218: lstore #12
    //   220: lload #12
    //   222: ldc2_w 50
    //   225: lcmp
    //   226: ifge -> 343
    //   229: aload_0
    //   230: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   233: iload #7
    //   235: iload #8
    //   237: i2b
    //   238: iload #9
    //   240: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   243: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   248: invokevirtual getType : ()Lorg/bukkit/Material;
    //   251: invokevirtual name : ()Ljava/lang/String;
    //   254: sipush #30933
    //   257: ldc2_w 5998488965865426807
    //   260: lload_2
    //   261: lxor
    //   262: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   267: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   270: ifeq -> 343
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   279: athrow
    //   280: aload_0
    //   281: lload #5
    //   283: sipush #19131
    //   286: ldc2_w 8158443741775330587
    //   289: lload_2
    //   290: lxor
    //   291: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   296: new java/lang/StringBuilder
    //   299: dup
    //   300: invokespecial <init> : ()V
    //   303: sipush #240
    //   306: ldc2_w 4520475150046508881
    //   309: lload_2
    //   310: lxor
    //   311: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: lload #12
    //   321: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   324: invokevirtual toString : ()Ljava/lang/String;
    //   327: iconst_2
    //   328: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   331: aload_0
    //   332: iconst_1
    //   333: putfield i : Z
    //   336: goto -> 343
    //   339: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   342: athrow
    //   343: aload_0
    //   344: invokestatic currentTimeMillis : ()J
    //   347: putfield b : J
    //   350: aload_0
    //   351: dup
    //   352: getfield x : I
    //   355: iconst_1
    //   356: iadd
    //   357: putfield x : I
    //   360: iload #10
    //   362: ireturn
    // Exception table:
    //   from	to	target	type
    //   80	104	107	java/lang/RuntimeException
    //   220	273	276	java/lang/RuntimeException
    //   229	336	339	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l = a ^ 0x39FD73787BCBL;
    int i = (int)((l ^ 0x222DB79A085EL) >>> 32L);
    int j = (int)((l ^ 0x222DB79A085EL) << 32L >>> 48L);
    int k = (int)((l ^ 0x222DB79A085EL) << 48L >>> 48L);
    l ^ 0x222DB79A085EL;
    try {
      if (this.i)
        try {
          this.i = false;
          if (ta.t(i, (short)j, paramPlayerMoveEvent.getPlayer(), k))
            paramPlayerMoveEvent.setTo(paramLocation1); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
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
    //   23: pop2
    //   24: invokestatic currentTimeMillis : ()J
    //   27: aload_0
    //   28: getfield k : J
    //   31: lsub
    //   32: ldc2_w 1000
    //   35: lcmp
    //   36: iflt -> 129
    //   39: aload_0
    //   40: getfield v : I
    //   43: bipush #10
    //   45: if_icmple -> 112
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload_0
    //   56: getfield x : I
    //   59: bipush #8
    //   61: if_icmple -> 112
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: aload_0
    //   72: lload #5
    //   74: sipush #26401
    //   77: ldc2_w 6710927363336153817
    //   80: lload_3
    //   81: lxor
    //   82: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   87: sipush #21061
    //   90: ldc2_w 2677212541457407928
    //   93: lload_3
    //   94: lxor
    //   95: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   100: bipush #10
    //   102: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   111: athrow
    //   112: aload_0
    //   113: invokestatic currentTimeMillis : ()J
    //   116: putfield k : J
    //   119: aload_0
    //   120: iconst_0
    //   121: putfield x : I
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield v : I
    //   129: return
    // Exception table:
    //   from	to	target	type
    //   24	48	51	java/lang/RuntimeException
    //   39	64	67	java/lang/RuntimeException
    //   55	105	108	java/lang/RuntimeException
  }
  
  public se(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  static {
    long l = a ^ 0x25CBB9E159F4L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "(??A÷®\"tiÅ\031Àúj5(jÇq»nXkñlòô´a.Õß1e\023D¶à~ @\000Z\b§±\034Çemê{E±ª~Z\001D¤±¨þ_ÖpÆc¾\0344§Îtá4ÁìÖÏ\020U^cäå\022ÑW\0272~\016÷Ù\020'\000»v\023L>r:Éµ8|o iÚKô\031,©Y#8yÐ]PD·þ\"¯'U´Ýð\000fÊ¥M@l/ ü«}\021';ÌAÃÂ`Îýweïu$\013\031\033Ö½,FÁbYÓm\021Ø«Å¯î\013«mö\007\fô;wPÈÔ9&Â").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2498;
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
        throw new RuntimeException("me/rerere/matrix/internal/se", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/se'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\se.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */