package me.rerere.matrix.internal;

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
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class qh extends zk {
  private static boolean b;
  
  private static final Set i;
  
  private static final long a = o3.a(-7148708851481769847L, 3682836535351422456L, MethodHandles.lookup().lookupClass()).a(152190846989104L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/qh.a : J
    //   3: ldc2_w 91219947982246
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #3157
    //   15: ldc2_w 7636697013746245606
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/qh.b : Z
    //   34: return
  }
  
  public qh(yl paramyl) {
    super(paramyl);
    b(yk.k);
  }
  
  static {
    long l = a ^ 0x17DB5D0336A0L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "ò\013Ü8çãwEUo'ÁÂøíÕ?8=µÈü7ÉUÜÂi\035§ 3\\Ä åT\n!\005Ír»ñu³ö¶|6oà\033ÜÞ!Bq*\020Àìºó'M³à\023\b1\000Kç").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 71711536919156
    //   5: lxor
    //   6: lstore #4
    //   8: dup2
    //   9: ldc2_w 132879607042508
    //   12: lxor
    //   13: lstore #6
    //   15: dup2
    //   16: ldc2_w 67215272246197
    //   19: lxor
    //   20: lstore #8
    //   22: dup2
    //   23: ldc2_w 137537287547488
    //   26: lxor
    //   27: lstore #10
    //   29: dup2
    //   30: ldc2_w 85936794681108
    //   33: lxor
    //   34: lstore #12
    //   36: dup2
    //   37: ldc2_w 126495505647027
    //   40: lxor
    //   41: dup2
    //   42: bipush #48
    //   44: lushr
    //   45: l2i
    //   46: istore #14
    //   48: dup2
    //   49: bipush #16
    //   51: lshl
    //   52: bipush #32
    //   54: lushr
    //   55: l2i
    //   56: istore #15
    //   58: dup2
    //   59: bipush #48
    //   61: lshl
    //   62: bipush #48
    //   64: lushr
    //   65: l2i
    //   66: istore #16
    //   68: pop2
    //   69: pop2
    //   70: getstatic me/rerere/matrix/internal/qh.b : Z
    //   73: ifne -> 81
    //   76: return
    //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   80: athrow
    //   81: aload_1
    //   82: invokevirtual getCause : ()Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   85: getstatic org/bukkit/event/entity/EntityDamageEvent$DamageCause.ENTITY_ATTACK : Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   88: if_acmpeq -> 96
    //   91: return
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: aload_1
    //   97: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   100: checkcast org/bukkit/entity/Player
    //   103: astore #17
    //   105: aload_1
    //   106: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   109: checkcast org/bukkit/entity/LivingEntity
    //   112: astore #18
    //   114: aload #17
    //   116: invokeinterface getEyeLocation : ()Lorg/bukkit/Location;
    //   121: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   124: invokeinterface getType : ()Lorg/bukkit/Material;
    //   129: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   132: if_acmpeq -> 140
    //   135: return
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: new me/rerere/matrix/internal/qa
    //   143: dup
    //   144: aload #17
    //   146: invokeinterface getEyeLocation : ()Lorg/bukkit/Location;
    //   151: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   154: aload #17
    //   156: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   161: invokevirtual getDirection : ()Lorg/bukkit/util/Vector;
    //   164: invokespecial <init> : (Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;)V
    //   167: astore #19
    //   169: lload #4
    //   171: aload #18
    //   173: invokestatic b : (JLorg/bukkit/entity/LivingEntity;)Lme/rerere/matrix/internal/sa;
    //   176: astore #20
    //   178: aload #20
    //   180: ifnonnull -> 188
    //   183: return
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload #20
    //   190: aload #19
    //   192: fconst_0
    //   193: lload #12
    //   195: ldc_w 10.0
    //   198: invokevirtual b : (Lme/rerere/matrix/internal/qa;FJF)Lorg/bukkit/util/Vector;
    //   201: astore #21
    //   203: aload #21
    //   205: ifnonnull -> 213
    //   208: return
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: aload #21
    //   215: aload #17
    //   217: invokeinterface getEyeLocation : ()Lorg/bukkit/Location;
    //   222: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   225: invokevirtual distance : (Lorg/bukkit/util/Vector;)D
    //   228: dstore #22
    //   230: iconst_0
    //   231: istore #24
    //   233: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   236: astore #25
    //   238: aload #17
    //   240: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   245: iload #14
    //   247: i2c
    //   248: swap
    //   249: lload #6
    //   251: aload #17
    //   253: aload_0
    //   254: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   257: invokestatic b : (JLorg/bukkit/entity/Player;Lme/rerere/matrix/internal/yl;)D
    //   260: iload #15
    //   262: dup_x2
    //   263: pop
    //   264: getstatic me/rerere/matrix/internal/qh.i : Ljava/util/Set;
    //   267: bipush #7
    //   269: iload #16
    //   271: i2s
    //   272: invokestatic b : (CLorg/bukkit/Location;IDLjava/util/Set;IS)Ljava/util/List;
    //   275: invokeinterface iterator : ()Ljava/util/Iterator;
    //   280: astore #26
    //   282: aload #26
    //   284: invokeinterface hasNext : ()Z
    //   289: ifeq -> 456
    //   292: aload #26
    //   294: invokeinterface next : ()Ljava/lang/Object;
    //   299: checkcast org/bukkit/block/Block
    //   302: astore #27
    //   304: aload #27
    //   306: invokeinterface getType : ()Lorg/bukkit/Material;
    //   311: invokestatic r : (Lorg/bukkit/Material;)Z
    //   314: ifne -> 282
    //   317: aload #27
    //   319: invokeinterface isLiquid : ()Z
    //   324: ifeq -> 334
    //   327: goto -> 282
    //   330: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   333: athrow
    //   334: aload #27
    //   336: lload #10
    //   338: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   341: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   344: astore #28
    //   346: aload #28
    //   348: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   351: ifne -> 361
    //   354: goto -> 282
    //   357: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   360: athrow
    //   361: aload #28
    //   363: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   366: ifeq -> 453
    //   369: aload #27
    //   371: invokeinterface getType : ()Lorg/bukkit/Material;
    //   376: invokevirtual isSolid : ()Z
    //   379: ifeq -> 453
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   388: athrow
    //   389: aload #28
    //   391: iconst_0
    //   392: aaload
    //   393: aload #19
    //   395: fconst_0
    //   396: lload #12
    //   398: ldc_w 10.0
    //   401: invokevirtual b : (Lme/rerere/matrix/internal/qa;FJF)Lorg/bukkit/util/Vector;
    //   404: astore #29
    //   406: aload #29
    //   408: ifnonnull -> 418
    //   411: goto -> 282
    //   414: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   417: athrow
    //   418: aload #29
    //   420: aload #19
    //   422: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   425: invokevirtual distance : (Lorg/bukkit/util/Vector;)D
    //   428: dload #22
    //   430: ldc2_w 0.1
    //   433: dsub
    //   434: dcmpg
    //   435: ifge -> 453
    //   438: iconst_1
    //   439: istore #24
    //   441: aload #27
    //   443: invokeinterface getType : ()Lorg/bukkit/Material;
    //   448: astore #25
    //   450: goto -> 456
    //   453: goto -> 282
    //   456: iload #24
    //   458: ifeq -> 560
    //   461: aload_0
    //   462: lload #8
    //   464: sipush #5151
    //   467: ldc2_w 150681646372048944
    //   470: lload_2
    //   471: lxor
    //   472: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   477: new java/lang/StringBuilder
    //   480: dup
    //   481: invokespecial <init> : ()V
    //   484: sipush #28362
    //   487: ldc2_w 6486389288986847974
    //   490: lload_2
    //   491: lxor
    //   492: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: aload #25
    //   502: invokevirtual name : ()Ljava/lang/String;
    //   505: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: sipush #6894
    //   514: ldc2_w 3315555021311860422
    //   517: lload_2
    //   518: lxor
    //   519: <illegal opcode> q : (IJ)Ljava/lang/String;
    //   524: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: dload #22
    //   529: invokestatic b : (D)D
    //   532: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   535: ldc_w ')'
    //   538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: invokevirtual toString : ()Ljava/lang/String;
    //   544: iconst_1
    //   545: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   548: aload_1
    //   549: iconst_1
    //   550: invokevirtual setCancelled : (Z)V
    //   553: goto -> 560
    //   556: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   559: athrow
    //   560: return
    // Exception table:
    //   from	to	target	type
    //   70	77	77	java/lang/RuntimeException
    //   81	92	92	java/lang/RuntimeException
    //   114	136	136	java/lang/RuntimeException
    //   178	184	184	java/lang/RuntimeException
    //   203	209	209	java/lang/RuntimeException
    //   317	330	330	java/lang/RuntimeException
    //   346	357	357	java/lang/RuntimeException
    //   361	382	385	java/lang/RuntimeException
    //   406	414	414	java/lang/RuntimeException
    //   456	553	556	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2C73;
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
        throw new RuntimeException("me/rerere/matrix/internal/qh", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/qh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */