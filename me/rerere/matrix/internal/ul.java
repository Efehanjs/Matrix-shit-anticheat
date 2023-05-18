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
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class ul extends zk {
  private static final BlockFace[] b;
  
  private boolean i = false;
  
  private static final long a = o3.a(-892637514234043357L, -3269648551580465529L, MethodHandles.lookup().lookupClass()).a(131066823363009L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l = paramLong ^ 0x48113204757AL;
    try {
      if (v.m(paramPacketType, l))
        this.i = true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public ul(yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  static {
    long l = a ^ 0x4C616691304EL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "ýlÃ3\007u×uï¥´ú\037k ?º~\\î$ä¤Zª% c\035Þ0ñ²J\001Fà|\004í¢ØÌ#fá\033\"\026ª\0245\030\004$l¢Ç\032¾\030zACôÛ7\020.ýÖfÙý>\020Ï\032\\dÐ").length();
    byte b2 = 80;
    byte b = -1;
    while (true);
  }
  
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
    //   36: ldc2_w 99697339657240
    //   39: lxor
    //   40: lstore #9
    //   42: pop2
    //   43: aload_0
    //   44: getfield i : Z
    //   47: ifne -> 55
    //   50: return
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload_0
    //   56: iconst_0
    //   57: putfield i : Z
    //   60: aload_2
    //   61: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   64: aload_2
    //   65: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: ifeq -> 299
    //   74: aload_2
    //   75: invokevirtual getClass : ()Ljava/lang/Class;
    //   78: ldc org/bukkit/event/block/BlockPlaceEvent
    //   80: if_acmpeq -> 95
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: return
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload_0
    //   96: aload_2
    //   97: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   100: invokeinterface getType : ()Lorg/bukkit/Material;
    //   105: lload #9
    //   107: dup2_x1
    //   108: pop2
    //   109: invokespecial b : (JLorg/bukkit/Material;)Z
    //   112: ifne -> 120
    //   115: return
    //   116: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: aload_2
    //   121: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   124: astore #11
    //   126: aload_2
    //   127: invokevirtual getBlockReplacedState : ()Lorg/bukkit/block/BlockState;
    //   130: invokeinterface getType : ()Lorg/bukkit/Material;
    //   135: astore #12
    //   137: aload #12
    //   139: ifnonnull -> 147
    //   142: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   145: astore #12
    //   147: aload #11
    //   149: invokestatic b : (Lorg/bukkit/block/Block;)Lorg/bukkit/Material;
    //   152: invokestatic v : (Lorg/bukkit/Material;)Z
    //   155: ifeq -> 178
    //   158: aload #12
    //   160: invokestatic v : (Lorg/bukkit/Material;)Z
    //   163: ifeq -> 178
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: return
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: getstatic me/rerere/matrix/internal/ul.b : [Lorg/bukkit/block/BlockFace;
    //   181: astore #13
    //   183: aload #13
    //   185: arraylength
    //   186: istore #14
    //   188: iconst_0
    //   189: istore #15
    //   191: iload #15
    //   193: iload #14
    //   195: if_icmpge -> 231
    //   198: aload #13
    //   200: iload #15
    //   202: aaload
    //   203: astore #16
    //   205: aload #11
    //   207: aload #16
    //   209: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   214: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   217: ifne -> 225
    //   220: return
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: iinc #15, 1
    //   228: goto -> 191
    //   231: aload_2
    //   232: iconst_1
    //   233: invokevirtual setCancelled : (Z)V
    //   236: aload_0
    //   237: lload #7
    //   239: sipush #11582
    //   242: ldc2_w 8777226169913383689
    //   245: lload #5
    //   247: lxor
    //   248: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   253: new java/lang/StringBuilder
    //   256: dup
    //   257: invokespecial <init> : ()V
    //   260: sipush #4479
    //   263: ldc2_w 3558060154798909257
    //   266: lload #5
    //   268: lxor
    //   269: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   274: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: aload_2
    //   278: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   281: invokeinterface getType : ()Lorg/bukkit/Material;
    //   286: invokevirtual name : ()Ljava/lang/String;
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: invokevirtual toString : ()Ljava/lang/String;
    //   295: iconst_0
    //   296: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   299: return
    // Exception table:
    //   from	to	target	type
    //   43	51	51	java/lang/RuntimeException
    //   55	83	86	java/lang/RuntimeException
    //   74	91	91	java/lang/RuntimeException
    //   95	116	116	java/lang/RuntimeException
    //   147	166	169	java/lang/RuntimeException
    //   158	174	174	java/lang/RuntimeException
    //   205	221	221	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x100A;
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
        throw new RuntimeException("me/rerere/matrix/internal/ul", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ul'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\interna\\ul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */