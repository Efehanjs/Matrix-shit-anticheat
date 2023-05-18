package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

@Deprecated
public class sj extends zk {
  private boolean l = false;
  
  private boolean r = true;
  
  private static final double x = 0.0233D;
  
  private int z = 0;
  
  private long k;
  
  private long v;
  
  private double b;
  
  private long i;
  
  private static final long a = o3.a(7191995150417481290L, -4635731842430666266L, MethodHandles.lookup().lookupClass()).a(69534078484878L);
  
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
    //   41: dup2
    //   42: ldc2_w 34647938764182
    //   45: lxor
    //   46: dup2
    //   47: bipush #32
    //   49: lushr
    //   50: lstore #10
    //   52: dup2
    //   53: bipush #32
    //   55: lshl
    //   56: bipush #32
    //   58: lushr
    //   59: l2i
    //   60: istore #12
    //   62: pop2
    //   63: pop2
    //   64: aload_1
    //   65: getstatic com/comphenix/protocol/PacketType$Play$Client.TRANSACTION : Lcom/comphenix/protocol/PacketType;
    //   68: if_acmpne -> 195
    //   71: aload #4
    //   73: invokevirtual getShorts : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   76: iconst_0
    //   77: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   80: checkcast java/lang/Short
    //   83: invokevirtual shortValue : ()S
    //   86: istore #13
    //   88: iload #13
    //   90: sipush #1345
    //   93: if_icmplt -> 195
    //   96: iload #13
    //   98: sipush #1445
    //   101: if_icmpge -> 195
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: invokestatic currentTimeMillis : ()J
    //   114: aload_0
    //   115: getfield v : J
    //   118: lsub
    //   119: lstore #14
    //   121: aload_0
    //   122: getfield r : Z
    //   125: ifeq -> 171
    //   128: aload_0
    //   129: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   132: aload_0
    //   133: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   136: iload #7
    //   138: iload #8
    //   140: i2b
    //   141: iload #9
    //   143: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   146: lload #10
    //   148: dup2_x1
    //   149: pop2
    //   150: iload #12
    //   152: swap
    //   153: invokestatic p : (JILorg/bukkit/entity/Player;)I
    //   156: invokevirtual j : (I)V
    //   159: aload_0
    //   160: iconst_0
    //   161: putfield r : Z
    //   164: goto -> 195
    //   167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: aload_0
    //   172: getfield l : Z
    //   175: ifne -> 195
    //   178: aload_0
    //   179: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   182: lload #14
    //   184: l2i
    //   185: invokevirtual j : (I)V
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: aload_1
    //   196: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
    //   199: if_acmpeq -> 216
    //   202: aload_1
    //   203: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   206: if_acmpne -> 423
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   215: athrow
    //   216: aload #4
    //   218: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   221: iconst_1
    //   222: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   225: checkcast java/lang/Double
    //   228: invokevirtual doubleValue : ()D
    //   231: dstore #13
    //   233: dload #13
    //   235: aload_0
    //   236: getfield b : D
    //   239: dsub
    //   240: dstore #15
    //   242: dload #15
    //   244: ldc2_w 0.0232
    //   247: dcmpl
    //   248: iflt -> 417
    //   251: dload #15
    //   253: ldc2_w 0.0234
    //   256: dcmpg
    //   257: ifgt -> 417
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: invokestatic j : ()J
    //   270: aload_0
    //   271: getfield k : J
    //   274: lsub
    //   275: lstore #17
    //   277: aload_0
    //   278: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   281: invokevirtual j : ()I
    //   284: i2l
    //   285: lload #17
    //   287: lcmp
    //   288: ifle -> 417
    //   291: aload_0
    //   292: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   295: invokevirtual j : ()I
    //   298: i2d
    //   299: lload #17
    //   301: l2d
    //   302: ldc2_w 1.5
    //   305: dmul
    //   306: dcmpl
    //   307: ifle -> 417
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   316: athrow
    //   317: aload_0
    //   318: iconst_1
    //   319: putfield l : Z
    //   322: aload_0
    //   323: lload #5
    //   325: sipush #19721
    //   328: ldc2_w 8822833043649091134
    //   331: lload_2
    //   332: lxor
    //   333: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   338: new java/lang/StringBuilder
    //   341: dup
    //   342: invokespecial <init> : ()V
    //   345: sipush #14121
    //   348: ldc2_w 7407878017957440543
    //   351: lload_2
    //   352: lxor
    //   353: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: aload_0
    //   362: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   365: invokevirtual j : ()I
    //   368: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   371: sipush #31745
    //   374: ldc2_w 8131632776412751668
    //   377: lload_2
    //   378: lxor
    //   379: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: lload #17
    //   389: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   392: invokevirtual toString : ()Ljava/lang/String;
    //   395: bipush #10
    //   397: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   400: aload_0
    //   401: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   404: lload #17
    //   406: l2i
    //   407: invokevirtual j : (I)V
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   416: athrow
    //   417: aload_0
    //   418: dload #13
    //   420: putfield b : D
    //   423: iconst_0
    //   424: ireturn
    // Exception table:
    //   from	to	target	type
    //   88	104	107	java/lang/RuntimeException
    //   121	167	167	java/lang/RuntimeException
    //   171	188	191	java/lang/RuntimeException
    //   195	209	212	java/lang/RuntimeException
    //   242	260	263	java/lang/RuntimeException
    //   277	310	313	java/lang/RuntimeException
    //   291	410	413	java/lang/RuntimeException
  }
  
  public boolean b(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    try {
      if (paramPacketType == PacketType.Play.Server.TRANSACTION)
        this.v = System.currentTimeMillis(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public sj(yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    long l2 = (l1 ^ 0x75F813B95409L) >>> 16L;
    int i = (int)((l1 ^ 0x75F813B95409L) << 48L >>> 48L);
    l1 ^ 0x75F813B95409L;
    int j = (int)((l1 ^ 0x38F8E5CB63B6L) >>> 32L);
    int k = (int)((l1 ^ 0x38F8E5CB63B6L) << 32L >>> 56L);
    int m = (int)((l1 ^ 0x38F8E5CB63B6L) << 40L >>> 40L);
    l1 ^ 0x38F8E5CB63B6L;
    if (System.currentTimeMillis() - this.i >= ge.u * 1000L) {
      PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.TRANSACTION);
      packetContainer.getShorts().write(0, Short.valueOf((short)(1345 + (new Random()).nextInt(100))));
      packetContainer.getBooleans().write(0, Boolean.valueOf(false));
      Player player = b().j(j, (byte)k, m);
      try {
        ProtocolLibrary.getProtocolManager().sendServerPacket(player, packetContainer);
        if (b().j() > 250)
          try {
            if (!this.l)
              try {
                if (this.z < 3) {
                  h(l2, (char)i);
                  this.z++;
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
      this.i = System.currentTimeMillis();
    } 
  }
  
  static {
    long l = a ^ 0x2C452A3AA36BL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "Ý¤-è»´µg\004(ñî\030þÕ¨\t¬S\006y£eöS\037Ë¤ª±\033Í^3_N\020^³Ýå\tcÌGÁ~nK>²").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x80F;
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
        throw new RuntimeException("me/rerere/matrix/internal/sj", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/sj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */