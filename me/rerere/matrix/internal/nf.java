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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class nf extends zk {
  private int x = 0;
  
  private long z;
  
  private static boolean k;
  
  private long v;
  
  private static boolean b;
  
  private static int i;
  
  private static final long a = o3.a(-3439340790136384642L, -2406047249001746184L, MethodHandles.lookup().lookupClass()).a(93566385411405L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
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
    //   36: ldc2_w 66941059539971
    //   39: lxor
    //   40: lstore #9
    //   42: pop2
    //   43: aload_0
    //   44: getfield x : I
    //   47: ifle -> 70
    //   50: aload_0
    //   51: dup
    //   52: getfield x : I
    //   55: iconst_1
    //   56: isub
    //   57: putfield x : I
    //   60: aload_2
    //   61: iconst_1
    //   62: invokevirtual setCancelled : (Z)V
    //   65: return
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: aload_2
    //   71: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   74: astore #11
    //   76: getstatic me/rerere/matrix/internal/nf.k : Z
    //   79: ifeq -> 489
    //   82: getstatic me/rerere/matrix/internal/nf.b : Z
    //   85: ifeq -> 489
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: aload_2
    //   96: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   99: invokeinterface getY : ()I
    //   104: aload_2
    //   105: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   108: invokeinterface getY : ()I
    //   113: if_icmpne -> 489
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload_2
    //   124: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   127: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   130: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   135: invokeinterface getType : ()Lorg/bukkit/Material;
    //   140: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   143: if_acmpne -> 489
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: aload_2
    //   154: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   157: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   160: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   165: invokeinterface getType : ()Lorg/bukkit/Material;
    //   170: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   173: if_acmpne -> 489
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: aload #11
    //   185: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   190: invokevirtual getY : ()D
    //   193: aload_2
    //   194: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   197: invokeinterface getY : ()I
    //   202: i2d
    //   203: ldc2_w 1.9
    //   206: dadd
    //   207: dcmpl
    //   208: ifle -> 489
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload #11
    //   220: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   225: invokevirtual getY : ()D
    //   228: ldc2_w 60.0
    //   231: dcmpl
    //   232: iflt -> 489
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload_2
    //   243: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   246: invokeinterface getType : ()Lorg/bukkit/Material;
    //   251: invokevirtual isSolid : ()Z
    //   254: ifeq -> 489
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   263: athrow
    //   264: aload_2
    //   265: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   268: lload #9
    //   270: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   273: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   276: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   279: ifeq -> 489
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   288: athrow
    //   289: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   292: invokevirtual j : ()Z
    //   295: ifeq -> 489
    //   298: goto -> 305
    //   301: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   304: athrow
    //   305: invokestatic j : ()J
    //   308: lstore #12
    //   310: lload #12
    //   312: aload_0
    //   313: getfield v : J
    //   316: lsub
    //   317: ldc2_w 550
    //   320: lcmp
    //   321: ifgt -> 483
    //   324: lload #12
    //   326: aload_0
    //   327: getfield z : J
    //   330: lsub
    //   331: ldc2_w 350
    //   334: lcmp
    //   335: ifgt -> 483
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   344: athrow
    //   345: aload #11
    //   347: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   352: aload_2
    //   353: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   356: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   361: invokevirtual clone : ()Lorg/bukkit/Location;
    //   364: ldc2_w 0.5
    //   367: ldc2_w 0.5
    //   370: ldc2_w 0.5
    //   373: invokevirtual add : (DDD)Lorg/bukkit/Location;
    //   376: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   379: ldc2_w 0.6
    //   382: dcmpg
    //   383: ifgt -> 483
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   392: athrow
    //   393: aload_0
    //   394: lload #7
    //   396: sipush #15241
    //   399: ldc2_w 1413282860402701855
    //   402: lload #5
    //   404: lxor
    //   405: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   410: sipush #8081
    //   413: ldc2_w 6761216782218252801
    //   416: lload #5
    //   418: lxor
    //   419: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   424: getstatic me/rerere/matrix/internal/nf.i : I
    //   427: iconst_2
    //   428: idiv
    //   429: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   432: aload_2
    //   433: iconst_1
    //   434: invokevirtual setCancelled : (Z)V
    //   437: aload #11
    //   439: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   444: invokevirtual clone : ()Lorg/bukkit/Location;
    //   447: astore #14
    //   449: aload #14
    //   451: fconst_0
    //   452: invokevirtual setPitch : (F)V
    //   455: aload #14
    //   457: aload #14
    //   459: invokevirtual getYaw : ()F
    //   462: ldc 180.0
    //   464: fsub
    //   465: invokevirtual setYaw : (F)V
    //   468: aload #11
    //   470: aload #14
    //   472: invokeinterface teleport : (Lorg/bukkit/Location;)Z
    //   477: pop
    //   478: aload_0
    //   479: iconst_2
    //   480: putfield x : I
    //   483: aload_0
    //   484: lload #12
    //   486: putfield v : J
    //   489: return
    // Exception table:
    //   from	to	target	type
    //   43	66	66	java/lang/RuntimeException
    //   76	88	91	java/lang/RuntimeException
    //   82	116	119	java/lang/RuntimeException
    //   95	146	149	java/lang/RuntimeException
    //   123	176	179	java/lang/RuntimeException
    //   153	211	214	java/lang/RuntimeException
    //   183	235	238	java/lang/RuntimeException
    //   218	257	260	java/lang/RuntimeException
    //   242	282	285	java/lang/RuntimeException
    //   264	298	301	java/lang/RuntimeException
    //   310	338	341	java/lang/RuntimeException
    //   324	386	389	java/lang/RuntimeException
  }
  
  public nf(yl paramyl) {
    super(paramyl);
    b(yk.x);
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    if (paramLocation2.getY() > paramLocation1.getY()) {
      double d = paramLocation2.getY() - paramLocation1.getY();
      try {
        if (Math.abs(d - 0.42D) <= 0.001D)
          try {
            if (zb.b(paramLocation1, paramLocation2) > 0.25D)
              this.z = pc.j(); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/nf.a : J
    //   3: ldc2_w 90755256184178
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #6068
    //   15: ldc2_w 774820455801603034
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/nf.k : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #1710
    //   41: ldc2_w 8507766151711052481
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   51: iconst_5
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/nf.i : I
    //   60: aload_0
    //   61: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   64: sipush #13798
    //   67: ldc2_w 6135875884296855946
    //   70: lload_1
    //   71: lxor
    //   72: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   77: iconst_1
    //   78: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   83: putstatic me/rerere/matrix/internal/nf.b : Z
    //   86: return
  }
  
  static {
    long l = a ^ 0x6E2929851443L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "½Ö®¨D.Sd-R(ìÓL^\001Ãw\017\035Vm' %v\036¶åB&\000}ûL\024(cÞ\b£\027zjÓzøÀ~KOº/Üë0H\021|7\034D\00389«£'ï\f6\005\0208pk®@\003´F¤!(þµ<µ|µÎO\004àYYùo´v¥õÙ·â\022\027¨[þô¢FÂA±¶\027ÌÞk\027\t\035U;").length();
    byte b2 = 40;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6BAE;
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
        throw new RuntimeException("me/rerere/matrix/internal/nf", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/nf'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */