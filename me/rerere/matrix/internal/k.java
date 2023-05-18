package me.rerere.matrix.internal;

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
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public interface k {
  public static final long d = o3.a(-3781319837269716314L, 9191646274116283848L, MethodHandles.lookup().lookupClass()).a(124131112503667L);
  
  public static final String[] e;
  
  public static final String[] h;
  
  public static final Map j = new HashMap<>(13);
  
  boolean b(@NotNull ItemStack paramItemStack, long paramLong);
  
  @NotNull
  sa b(long paramLong, @NotNull Entity paramEntity);
  
  int b(long paramLong, @NotNull ItemStack paramItemStack);
  
  float b(long paramLong, @NotNull Block paramBlock);
  
  boolean b(@NotNull Player paramPlayer);
  
  float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock);
  
  default void b(@NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: new me/rerere/matrix/thirdparty/kotlin/NotImplementedError
    //   3: dup
    //   4: sipush #6079
    //   7: ldc2_w 7871573318490478107
    //   10: lload_2
    //   11: lxor
    //   12: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: athrow
  }
  
  boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2);
  
  boolean b(@NotNull Entity paramEntity);
  
  default int b(@NotNull Player paramPlayer, @NotNull PotionEffectType paramPotionEffectType) {
    for (PotionEffect potionEffect : paramPlayer.getActivePotionEffects()) {
      if (Intrinsics.areEqual(potionEffect.getType(), paramPotionEffectType))
        return potionEffect.getAmplifier() + 1; 
    } 
    return 0;
  }
  
  @Nullable
  default on b(@NotNull World paramWorld, @NotNull Vector paramVector1, @NotNull Vector paramVector2, double paramDouble) {
    RayTraceResult rayTraceResult = paramWorld.rayTraceBlocks(new Location(paramWorld, paramVector1.getX(), paramVector1.getY(), paramVector1.getZ()), paramVector2, paramDouble);
    try {
      Vector vector = rayTraceResult.getHitPosition();
      Block block = rayTraceResult.getHitBlock();
      BlockFace blockFace = rayTraceResult.getHitBlockFace();
      Entity entity = rayTraceResult.getHitEntity();
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (rayTraceResult == null) ? (on)null : new on(vector, block, entity, blockFace);
  }
  
  float b(@NotNull LivingEntity paramLivingEntity, long paramLong);
  
  @Deprecated(message = "Use getBlockShape(block, type)")
  @NotNull
  sa b(@NotNull Block paramBlock);
  
  void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong);
  
  @Nullable
  Object b(@NotNull Block paramBlock, long paramLong);
  
  @Nullable
  sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya);
  
  static {
    long l = d ^ 0x27A08077DA0L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "©\021\\ó_ãwÜ\b\004ÆÈÖÁ÷~]\tîk*Z¬ kÆ´Ú*m,Ljb\025ûÐ­c\034\bÅöª+\004!QW!Ô}K\"yK¢zúÆO8pÀlÌö2Êû8?IÞáQ{ÉmÎÛè\004F\tÓKì \001q7¸NÞøvÄmõ®\022ßä¾\023+\020ÿ7c@7+z\r¸¹\004`ìÉt.@Á(Ãh\027HJ®\006]vBÞ\024«lþgx|\032xéºþe=vÆÇ9t;¦Q").length();
    char c = '';
    byte b1 = -1;
    while (true);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
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
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7797;
    if (h[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])j.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          j.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/k", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = e[i].getBytes("ISO-8859-1");
      h[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return h[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/k'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */