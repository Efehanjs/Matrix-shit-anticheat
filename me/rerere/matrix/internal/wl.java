package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class wl {
  @NotNull
  private final LivingEntity l;
  
  @NotNull
  private final String r;
  
  private final int x;
  
  @NotNull
  private final List z;
  
  @NotNull
  private final List k;
  
  private final int v;
  
  @NotNull
  private final Location b;
  
  @NotNull
  private final Player i;
  
  private static final long a = o3.a(6384440829712274590L, 808788082502012643L, MethodHandles.lookup().lookupClass()).a(40502904943976L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public Player b() {
    return this.i;
  }
  
  @NotNull
  public Location b() {
    return this.b;
  }
  
  @NotNull
  public List j() {
    return this.k;
  }
  
  @NotNull
  public LivingEntity b() {
    return this.l;
  }
  
  public int j() {
    return this.v;
  }
  
  @NotNull
  public List b() {
    return this.z;
  }
  
  public wl(@NotNull Player paramPlayer, @NotNull LivingEntity paramLivingEntity, @NotNull List paramList1, @NotNull List paramList2, long paramLong, int paramInt1, int paramInt2, @NotNull Location paramLocation, @NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/wl.a : J
    //   3: lload #5
    //   5: lxor
    //   6: lstore #5
    //   8: invokestatic r : ()I
    //   11: istore #11
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_1
    //   18: iload #11
    //   20: ifeq -> 53
    //   23: ifnonnull -> 52
    //   26: new java/lang/NullPointerException
    //   29: dup
    //   30: sipush #31943
    //   33: ldc2_w 1696986305895005266
    //   36: lload #5
    //   38: lxor
    //   39: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   44: invokespecial <init> : (Ljava/lang/String;)V
    //   47: athrow
    //   48: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   51: athrow
    //   52: aload_2
    //   53: ifnonnull -> 82
    //   56: new java/lang/NullPointerException
    //   59: dup
    //   60: sipush #30869
    //   63: ldc2_w 1068772276537980933
    //   66: lload #5
    //   68: lxor
    //   69: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: athrow
    //   78: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   81: athrow
    //   82: aload_3
    //   83: lload #5
    //   85: lconst_0
    //   86: lcmp
    //   87: ifle -> 133
    //   90: iload #11
    //   92: ifeq -> 133
    //   95: ifnonnull -> 131
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   104: athrow
    //   105: new java/lang/NullPointerException
    //   108: dup
    //   109: sipush #1376
    //   112: ldc2_w 1514064730707297782
    //   115: lload #5
    //   117: lxor
    //   118: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   123: invokespecial <init> : (Ljava/lang/String;)V
    //   126: athrow
    //   127: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   130: athrow
    //   131: aload #4
    //   133: ifnonnull -> 162
    //   136: new java/lang/NullPointerException
    //   139: dup
    //   140: sipush #6785
    //   143: ldc2_w 6523619413955549717
    //   146: lload #5
    //   148: lxor
    //   149: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: athrow
    //   158: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   161: athrow
    //   162: lload #5
    //   164: lconst_0
    //   165: lcmp
    //   166: iflt -> 200
    //   169: aload #9
    //   171: ifnonnull -> 200
    //   174: new java/lang/NullPointerException
    //   177: dup
    //   178: sipush #15337
    //   181: ldc2_w 657557980816063358
    //   184: lload #5
    //   186: lxor
    //   187: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   192: invokespecial <init> : (Ljava/lang/String;)V
    //   195: athrow
    //   196: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   199: athrow
    //   200: lload #5
    //   202: lconst_0
    //   203: lcmp
    //   204: iflt -> 283
    //   207: aload #10
    //   209: ifnonnull -> 238
    //   212: new java/lang/NullPointerException
    //   215: dup
    //   216: sipush #29991
    //   219: ldc2_w 8519475905220933046
    //   222: lload #5
    //   224: lxor
    //   225: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   230: invokespecial <init> : (Ljava/lang/String;)V
    //   233: athrow
    //   234: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   237: athrow
    //   238: aload_0
    //   239: aload_1
    //   240: putfield i : Lorg/bukkit/entity/Player;
    //   243: aload_0
    //   244: aload_2
    //   245: putfield l : Lorg/bukkit/entity/LivingEntity;
    //   248: aload_0
    //   249: aload_3
    //   250: putfield k : Ljava/util/List;
    //   253: aload_0
    //   254: aload #4
    //   256: putfield z : Ljava/util/List;
    //   259: aload_0
    //   260: iload #7
    //   262: putfield x : I
    //   265: aload_0
    //   266: iload #8
    //   268: putfield v : I
    //   271: aload_0
    //   272: aload #9
    //   274: putfield b : Lorg/bukkit/Location;
    //   277: aload_0
    //   278: aload #10
    //   280: putfield r : Ljava/lang/String;
    //   283: return
    // Exception table:
    //   from	to	target	type
    //   23	48	48	java/lang/NullPointerException
    //   53	78	78	java/lang/NullPointerException
    //   82	98	101	java/lang/NullPointerException
    //   95	127	127	java/lang/NullPointerException
    //   133	158	158	java/lang/NullPointerException
    //   162	196	196	java/lang/NullPointerException
    //   200	234	234	java/lang/NullPointerException
  }
  
  public int b() {
    return this.x;
  }
  
  @NotNull
  public String b() {
    return this.r;
  }
  
  static {
    long l = a ^ 0x38E411CC67F6L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    String str;
    int i = (str = "å\004¦\032¨to³é1NÑè\005LejÏbJð\036mþ\022_6µ°ÀmÍÔ-ôñ½lNbWKR¼á7<v=\021Óç&\rüÆP9: \004¢¹âÏ\033fvosÆtÀ[ô¸FIù\t/g\007@A%Kòt\r\032\037n\016.hsDYL¶]Ê[3{\026MÊàv/3½R2\036ÂÍx¦:PdÆ%ÿNÉÖc\tf&@ä*\"Ã5¡î¬µZbÑ\"R\020\035\030\022Å/\026R£\017r÷Öz\006ë\007;&;À\0367#Üe°Ö³~[\037ê¸%ôH&s\0043å·?HOÜÎ\032×G\023Vuÿ»\026í\032bôMÀç²(iôyÒ\022¸Ç$§¢é_J}M\026\017¬mí\007HqÙ\bÌrNuÕMüÚK¸Ozk±)ç").length();
    byte b2 = 64;
    byte b = -1;
    while (true);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1EF1;
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
        throw new RuntimeException("me/rerere/matrix/internal/wl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
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
    //   13: ldc [Ljava/lang/Object;
    //   15: aload_2
    //   16: invokevirtual parameterCount : ()I
    //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   22: iconst_0
    //   23: iconst_3
    //   24: anewarray java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_3
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: aload_1
    //   38: aastore
    //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   42: aload_2
    //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   49: goto -> 102
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc 'me/rerere/matrix/internal/wl'
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w ' : '
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_1
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: ldc_w ' : '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_2
    //   87: invokevirtual toString : ()Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: aload #4
    //   98: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: aload_3
    //   103: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */