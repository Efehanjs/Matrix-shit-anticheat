package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
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
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class ye extends zk {
  private static boolean z;
  
  private long k;
  
  private float v;
  
  private static int b;
  
  private long i;
  
  private static final long a = o3.a(-8009390094880473406L, -4357652031959785422L, MethodHandles.lookup().lookupClass()).a(199470013858365L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public ye(yl paramyl) {
    super(paramyl);
    b(yk.u);
  }
  
  public void b(@NotNull PlayerItemHeldEvent paramPlayerItemHeldEvent) {
    int i = paramPlayerItemHeldEvent.getNewSlot();
    int j = paramPlayerItemHeldEvent.getPreviousSlot();
    int k = Math.min(Math.abs(i - j), 9 - Math.abs(i - j));
    try {
      if (k > 1)
        this.k = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ye.a : J
    //   3: ldc2_w 36630280193996
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #12635
    //   15: ldc2_w 7167258201557572625
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/ye.z : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #3837
    //   41: ldc2_w 6383695411229533108
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   51: iconst_2
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/ye.b : I
    //   60: return
  }
  
  public void b(long paramLong, @NotNull PacketType paramPacketType, float paramFloat1, float paramFloat2) {
    float f = Math.abs(paramFloat2 - this.v);
    try {
      if (paramFloat2 >= 80.0F)
        try {
          if (f > 65.0F)
            this.i = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.v = paramFloat2;
  }
  
  public void b(char paramChar, int paramInt, @NotNull PlayerInteractEvent paramPlayerInteractEvent, short paramShort) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
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
    //   29: ldc2_w 123056812294605
    //   32: lxor
    //   33: lstore #7
    //   35: pop2
    //   36: aload_3
    //   37: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   40: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_AIR : Lorg/bukkit/event/block/Action;
    //   43: if_acmpeq -> 63
    //   46: aload_3
    //   47: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   50: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   53: if_acmpne -> 237
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_3
    //   64: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   67: ifnull -> 237
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: getstatic me/rerere/matrix/internal/ye.b : I
    //   80: iflt -> 237
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload_3
    //   91: invokevirtual getItem : ()Lorg/bukkit/inventory/ItemStack;
    //   94: invokestatic b : (Lorg/bukkit/inventory/ItemStack;)Z
    //   97: ifeq -> 237
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: invokestatic j : ()J
    //   110: aload_0
    //   111: getfield k : J
    //   114: lsub
    //   115: ldc2_w 50
    //   118: lcmp
    //   119: ifgt -> 237
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: invokestatic j : ()J
    //   132: aload_0
    //   133: getfield i : J
    //   136: lsub
    //   137: ldc2_w 50
    //   140: lcmp
    //   141: ifgt -> 237
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: aload_0
    //   152: lload #7
    //   154: sipush #30916
    //   157: ldc2_w 3116314444118358121
    //   160: lload #5
    //   162: lxor
    //   163: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   168: sipush #10060
    //   171: ldc2_w 7524027809003120610
    //   174: lload #5
    //   176: lxor
    //   177: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   182: getstatic me/rerere/matrix/internal/ye.b : I
    //   185: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   188: getstatic me/rerere/matrix/internal/ye.z : Z
    //   191: ifeq -> 227
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: aload_3
    //   202: iconst_1
    //   203: invokevirtual setCancelled : (Z)V
    //   206: aload_3
    //   207: getstatic org/bukkit/event/Event$Result.DENY : Lorg/bukkit/event/Event$Result;
    //   210: invokevirtual setUseItemInHand : (Lorg/bukkit/event/Event$Result;)V
    //   213: aload_3
    //   214: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   217: invokestatic p : (Lorg/bukkit/entity/Player;)V
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: aload_0
    //   228: lconst_0
    //   229: putfield k : J
    //   232: aload_0
    //   233: lconst_0
    //   234: putfield i : J
    //   237: return
    // Exception table:
    //   from	to	target	type
    //   36	56	59	java/lang/RuntimeException
    //   46	70	73	java/lang/RuntimeException
    //   63	83	86	java/lang/RuntimeException
    //   77	100	103	java/lang/RuntimeException
    //   90	122	125	java/lang/RuntimeException
    //   107	144	147	java/lang/RuntimeException
    //   129	194	197	java/lang/RuntimeException
    //   151	220	223	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0xA5C4B8D96D0L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "âTbÌân&åðHQÝÆ>\000â ß=,¼9óÐ# \033û,0\002Óê SoA°8ÿèäkÑm9 ©¡Ao|\\").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x128B;
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
        throw new RuntimeException("me/rerere/matrix/internal/ye", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ye'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ye.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */