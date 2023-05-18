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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class fj extends zk {
  private static boolean x;
  
  private int z = 0;
  
  @Nullable
  private Vector k;
  
  private long v;
  
  private static int b;
  
  private int i = 0;
  
  private static final long a = o3.a(-1090809626350008831L, 4874816574954338044L, MethodHandles.lookup().lookupClass()).a(117625649628689L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fj.a : J
    //   3: ldc2_w 138288529770530
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 130918908095474
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 37579749197918
    //   22: lxor
    //   23: dup2
    //   24: bipush #32
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: dup2
    //   31: bipush #32
    //   33: lshl
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #9
    //   40: dup2
    //   41: bipush #48
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #10
    //   50: pop2
    //   51: dup2
    //   52: ldc2_w 31421620104588
    //   55: lxor
    //   56: dup2
    //   57: bipush #32
    //   59: lushr
    //   60: l2i
    //   61: istore #11
    //   63: dup2
    //   64: bipush #32
    //   66: lshl
    //   67: bipush #48
    //   69: lushr
    //   70: l2i
    //   71: istore #12
    //   73: dup2
    //   74: bipush #48
    //   76: lshl
    //   77: bipush #48
    //   79: lushr
    //   80: l2i
    //   81: istore #13
    //   83: pop2
    //   84: dup2
    //   85: ldc2_w 120145186448784
    //   88: lxor
    //   89: lstore #14
    //   91: pop2
    //   92: aload_0
    //   93: getfield i : I
    //   96: ifgt -> 104
    //   99: return
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: aload_1
    //   105: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   108: astore #16
    //   110: aload #16
    //   112: invokeinterface isFlying : ()Z
    //   117: ifeq -> 125
    //   120: return
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: invokestatic b : ()I
    //   128: bipush #9
    //   130: if_icmplt -> 155
    //   133: aload #16
    //   135: invokeinterface isGliding : ()Z
    //   140: ifeq -> 155
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: return
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: aload_2
    //   156: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   159: astore #17
    //   161: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   164: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   167: iload #11
    //   169: iload #12
    //   171: iload #13
    //   173: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   176: astore #18
    //   178: aload #17
    //   180: aload_2
    //   181: invokevirtual getX : ()D
    //   184: lload #14
    //   186: invokestatic b : (DJ)I
    //   189: aload_2
    //   190: invokevirtual getY : ()D
    //   193: lload #14
    //   195: invokestatic b : (DJ)I
    //   198: iconst_1
    //   199: isub
    //   200: aload_2
    //   201: invokevirtual getZ : ()D
    //   204: lload #14
    //   206: invokestatic b : (DJ)I
    //   209: invokeinterface getBlockAt : (III)Lorg/bukkit/block/Block;
    //   214: astore #19
    //   216: aload #18
    //   218: lload #6
    //   220: aload #19
    //   222: invokeinterface b : (JLorg/bukkit/block/Block;)F
    //   227: fstore #20
    //   229: ldc 0.91
    //   231: fstore #21
    //   233: iload #8
    //   235: iload #9
    //   237: i2s
    //   238: aload #16
    //   240: iload #10
    //   242: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   245: ifeq -> 255
    //   248: fload #20
    //   250: ldc 0.91
    //   252: fmul
    //   253: fstore #21
    //   255: aload_3
    //   256: invokevirtual getX : ()D
    //   259: aload_2
    //   260: invokevirtual getX : ()D
    //   263: dsub
    //   264: dstore #22
    //   266: aload_3
    //   267: invokevirtual getZ : ()D
    //   270: aload_2
    //   271: invokevirtual getZ : ()D
    //   274: dsub
    //   275: dstore #24
    //   277: aload_0
    //   278: getfield k : Lorg/bukkit/util/Vector;
    //   281: ifnonnull -> 313
    //   284: aload_0
    //   285: new org/bukkit/util/Vector
    //   288: dup
    //   289: dload #22
    //   291: fload #21
    //   293: f2d
    //   294: dmul
    //   295: dconst_0
    //   296: dload #24
    //   298: fload #21
    //   300: f2d
    //   301: dmul
    //   302: invokespecial <init> : (DDD)V
    //   305: putfield k : Lorg/bukkit/util/Vector;
    //   308: return
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: dload #22
    //   315: aload_0
    //   316: getfield k : Lorg/bukkit/util/Vector;
    //   319: invokevirtual getX : ()D
    //   322: dsub
    //   323: dstore #26
    //   325: dload #24
    //   327: aload_0
    //   328: getfield k : Lorg/bukkit/util/Vector;
    //   331: invokevirtual getZ : ()D
    //   334: dsub
    //   335: dstore #28
    //   337: new org/bukkit/util/Vector
    //   340: dup
    //   341: dload #26
    //   343: dconst_0
    //   344: dload #28
    //   346: invokespecial <init> : (DDD)V
    //   349: astore #30
    //   351: iload #8
    //   353: iload #9
    //   355: i2s
    //   356: aload #16
    //   358: iload #10
    //   360: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   363: ifeq -> 569
    //   366: aload_3
    //   367: invokevirtual getY : ()D
    //   370: aload_2
    //   371: invokevirtual getY : ()D
    //   374: dcmpl
    //   375: ifne -> 569
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   384: athrow
    //   385: aload #30
    //   387: invokevirtual length : ()D
    //   390: ldc2_w 0.08
    //   393: dcmpl
    //   394: ifle -> 569
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   403: athrow
    //   404: aload #30
    //   406: aload_0
    //   407: getfield k : Lorg/bukkit/util/Vector;
    //   410: invokevirtual dot : (Lorg/bukkit/util/Vector;)D
    //   413: dconst_0
    //   414: dcmpl
    //   415: ifle -> 569
    //   418: goto -> 425
    //   421: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   424: athrow
    //   425: aload_3
    //   426: invokevirtual getY : ()D
    //   429: dconst_1
    //   430: drem
    //   431: dconst_0
    //   432: dcmpl
    //   433: ifne -> 569
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   442: athrow
    //   443: aload #30
    //   445: aload_3
    //   446: invokevirtual getDirection : ()Lorg/bukkit/util/Vector;
    //   449: iconst_0
    //   450: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
    //   453: invokevirtual angle : (Lorg/bukkit/util/Vector;)F
    //   456: f2d
    //   457: invokestatic toDegrees : (D)D
    //   460: ldc2_w 45.0
    //   463: drem
    //   464: dstore #31
    //   466: dload #31
    //   468: ldc2_w 5.0
    //   471: dcmpl
    //   472: ifle -> 555
    //   475: dload #31
    //   477: ldc2_w 45.0
    //   480: dsub
    //   481: invokestatic abs : (D)D
    //   484: ldc2_w 5.0
    //   487: dcmpl
    //   488: ifle -> 555
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   497: athrow
    //   498: aload_2
    //   499: invokestatic f : (Lorg/bukkit/Location;)Z
    //   502: ifeq -> 555
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   511: athrow
    //   512: aload_0
    //   513: dup
    //   514: getfield z : I
    //   517: iconst_1
    //   518: iadd
    //   519: dup_x1
    //   520: putfield z : I
    //   523: bipush #10
    //   525: if_icmplt -> 569
    //   528: goto -> 535
    //   531: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   534: athrow
    //   535: aload_0
    //   536: invokestatic j : ()J
    //   539: putfield v : J
    //   542: aload_0
    //   543: bipush #10
    //   545: putfield z : I
    //   548: goto -> 569
    //   551: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   554: athrow
    //   555: aload_0
    //   556: iconst_0
    //   557: aload_0
    //   558: getfield z : I
    //   561: iconst_2
    //   562: isub
    //   563: invokestatic max : (II)I
    //   566: putfield z : I
    //   569: aload_0
    //   570: new org/bukkit/util/Vector
    //   573: dup
    //   574: dload #22
    //   576: fload #21
    //   578: f2d
    //   579: dmul
    //   580: dconst_0
    //   581: dload #24
    //   583: fload #21
    //   585: f2d
    //   586: dmul
    //   587: invokespecial <init> : (DDD)V
    //   590: putfield k : Lorg/bukkit/util/Vector;
    //   593: return
    // Exception table:
    //   from	to	target	type
    //   92	100	100	java/lang/RuntimeException
    //   110	121	121	java/lang/RuntimeException
    //   125	143	146	java/lang/RuntimeException
    //   133	151	151	java/lang/RuntimeException
    //   277	309	309	java/lang/RuntimeException
    //   351	378	381	java/lang/RuntimeException
    //   366	397	400	java/lang/RuntimeException
    //   385	418	421	java/lang/RuntimeException
    //   404	436	439	java/lang/RuntimeException
    //   466	491	494	java/lang/RuntimeException
    //   475	505	508	java/lang/RuntimeException
    //   498	528	531	java/lang/RuntimeException
    //   512	551	551	java/lang/RuntimeException
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
    //   29: ldc2_w 86143553921412
    //   32: lxor
    //   33: dup2
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #7
    //   40: dup2
    //   41: bipush #16
    //   43: lshl
    //   44: bipush #32
    //   46: lushr
    //   47: l2i
    //   48: istore #8
    //   50: dup2
    //   51: bipush #48
    //   53: lshl
    //   54: bipush #48
    //   56: lushr
    //   57: l2i
    //   58: istore #9
    //   60: pop2
    //   61: dup2
    //   62: ldc2_w 137262009759190
    //   65: lxor
    //   66: lstore #10
    //   68: pop2
    //   69: getstatic me/rerere/matrix/internal/fj.x : Z
    //   72: ifne -> 80
    //   75: return
    //   76: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield i : I
    //   84: ifne -> 99
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield k : Lorg/bukkit/util/Vector;
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload_0
    //   100: bipush #15
    //   102: putfield i : I
    //   105: aload_2
    //   106: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   109: astore #12
    //   111: aload_2
    //   112: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   115: astore #13
    //   117: aload #12
    //   119: invokeinterface getY : ()I
    //   124: aload #13
    //   126: invokeinterface getY : ()I
    //   131: if_icmpne -> 294
    //   134: aload_2
    //   135: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   138: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   143: invokevirtual getY : ()D
    //   146: aload #12
    //   148: invokeinterface getY : ()I
    //   153: iconst_1
    //   154: iadd
    //   155: i2d
    //   156: dcmpl
    //   157: iflt -> 294
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: aload #12
    //   169: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   172: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   177: invokeinterface getType : ()Lorg/bukkit/Material;
    //   182: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   185: if_acmpne -> 294
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: aload_2
    //   196: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   199: iload #7
    //   201: i2c
    //   202: swap
    //   203: iload #8
    //   205: iload #9
    //   207: i2s
    //   208: invokestatic b : (CLorg/bukkit/entity/Player;IS)Z
    //   211: ifne -> 294
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   220: athrow
    //   221: invokestatic j : ()J
    //   224: aload_0
    //   225: getfield v : J
    //   228: lsub
    //   229: ldc2_w 400
    //   232: lcmp
    //   233: ifgt -> 294
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload_0
    //   244: lload #10
    //   246: sipush #15205
    //   249: ldc2_w 2302562793305938266
    //   252: lload #5
    //   254: lxor
    //   255: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   260: sipush #14861
    //   263: ldc2_w 5084370466411583539
    //   266: lload #5
    //   268: lxor
    //   269: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   274: getstatic me/rerere/matrix/internal/fj.b : I
    //   277: iconst_2
    //   278: idiv
    //   279: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   282: aload_2
    //   283: iconst_1
    //   284: invokevirtual setCancelled : (Z)V
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: return
    // Exception table:
    //   from	to	target	type
    //   69	76	76	java/lang/RuntimeException
    //   80	92	95	java/lang/RuntimeException
    //   117	160	163	java/lang/RuntimeException
    //   134	188	191	java/lang/RuntimeException
    //   167	214	217	java/lang/RuntimeException
    //   195	236	239	java/lang/RuntimeException
    //   221	287	290	java/lang/RuntimeException
  }
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (this.i > 0)
        try {
          this.i--;
          if (this.i == 0)
            this.k = null; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public fj(yl paramyl) {
    super(paramyl);
    b(yk.x);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fj.a : J
    //   3: ldc2_w 4677673266300
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #2584
    //   15: ldc2_w 8534062619587031513
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/fj.x : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #26337
    //   41: ldc2_w 1212671896256306465
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   51: iconst_5
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/fj.b : I
    //   60: return
  }
  
  static {
    long l = a ^ 0x168D75CF942L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "´JmÆ­÷XäyW±\001þý\004á­RÌÒÐ\030A\003\031íx0Ì8à%d(½e³¾,DËýú:\037\023¿O,øN-rs\022¦ÿqÌ!±ÑÕébnN\"í").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x400;
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
        throw new RuntimeException("me/rerere/matrix/internal/fj", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/fj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */