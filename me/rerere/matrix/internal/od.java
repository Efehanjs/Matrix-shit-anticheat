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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class od extends zk {
  @Nullable
  private vj x;
  
  private static String z;
  
  private boolean k;
  
  private static final Set v;
  
  private static boolean b;
  
  private double i = 0.0D;
  
  private static final long a = o3.a(3247827881269823704L, -6656900171195152753L, MethodHandles.lookup().lookupClass()).a(19152783504720L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
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
    //   29: ldc2_w 52623127580696
    //   32: lxor
    //   33: lstore #7
    //   35: pop2
    //   36: getstatic me/rerere/matrix/internal/od.b : Z
    //   39: ifne -> 47
    //   42: return
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: getstatic me/rerere/matrix/internal/od.z : Ljava/lang/String;
    //   50: sipush #821
    //   53: ldc2_w 6010204628654072746
    //   56: lload #5
    //   58: lxor
    //   59: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   64: invokevirtual equals : (Ljava/lang/Object;)Z
    //   67: ifne -> 75
    //   70: return
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: aload_0
    //   76: getfield k : Z
    //   79: ifeq -> 99
    //   82: aload_0
    //   83: iconst_0
    //   84: putfield k : Z
    //   87: aload_3
    //   88: iconst_1
    //   89: invokevirtual setCancelled : (Z)V
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: aload_3
    //   100: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   103: astore #9
    //   105: aload #9
    //   107: ifnull -> 145
    //   110: aload_3
    //   111: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   114: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   117: if_acmpne -> 145
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: aload_0
    //   128: aload_3
    //   129: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   132: aload #9
    //   134: aload_3
    //   135: invokespecial b : (Lorg/bukkit/entity/Player;Lorg/bukkit/block/Block;Lorg/bukkit/event/player/PlayerInteractEvent;)V
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: getstatic me/rerere/matrix/internal/pd.l : Z
    //   148: ifeq -> 479
    //   151: aload #9
    //   153: ifnull -> 479
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload #9
    //   165: lload #7
    //   167: getstatic me/rerere/matrix/internal/ya.b : Lme/rerere/matrix/internal/ya;
    //   170: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   173: astore #10
    //   175: aload #9
    //   177: lload #7
    //   179: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   182: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   185: astore #11
    //   187: new java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial <init> : ()V
    //   194: sipush #26426
    //   197: ldc2_w 3788091519599921070
    //   200: lload #5
    //   202: lxor
    //   203: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload #9
    //   213: invokeinterface getType : ()Lorg/bukkit/Material;
    //   218: invokevirtual name : ()Ljava/lang/String;
    //   221: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   224: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: sipush #28186
    //   233: ldc2_w 536449938813308553
    //   236: lload #5
    //   238: lxor
    //   239: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: aload #9
    //   249: invokeinterface getData : ()B
    //   254: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   257: sipush #21931
    //   260: ldc2_w 1150824879596172603
    //   263: lload #5
    //   265: lxor
    //   266: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokevirtual toString : ()Ljava/lang/String;
    //   277: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   280: pop
    //   281: aload #10
    //   283: astore #12
    //   285: aload #12
    //   287: arraylength
    //   288: istore #13
    //   290: iconst_0
    //   291: istore #14
    //   293: iload #14
    //   295: iload #13
    //   297: if_icmpge -> 352
    //   300: aload #12
    //   302: iload #14
    //   304: aaload
    //   305: astore #15
    //   307: new java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: sipush #1330
    //   317: ldc2_w 8303181793090545065
    //   320: lload #5
    //   322: lxor
    //   323: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: aload #15
    //   333: invokevirtual toString : ()Ljava/lang/String;
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual toString : ()Ljava/lang/String;
    //   342: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   345: pop
    //   346: iinc #14, 1
    //   349: goto -> 293
    //   352: aload #11
    //   354: astore #12
    //   356: aload #12
    //   358: arraylength
    //   359: istore #13
    //   361: iconst_0
    //   362: istore #14
    //   364: iload #14
    //   366: iload #13
    //   368: if_icmpge -> 423
    //   371: aload #12
    //   373: iload #14
    //   375: aaload
    //   376: astore #15
    //   378: new java/lang/StringBuilder
    //   381: dup
    //   382: invokespecial <init> : ()V
    //   385: sipush #15566
    //   388: ldc2_w 7132166190999444572
    //   391: lload #5
    //   393: lxor
    //   394: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: aload #15
    //   404: invokevirtual toString : ()Ljava/lang/String;
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: invokevirtual toString : ()Ljava/lang/String;
    //   413: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   416: pop
    //   417: iinc #14, 1
    //   420: goto -> 364
    //   423: invokestatic b : ()I
    //   426: bipush #17
    //   428: if_icmplt -> 479
    //   431: new java/lang/StringBuilder
    //   434: dup
    //   435: invokespecial <init> : ()V
    //   438: sipush #15368
    //   441: ldc2_w 8281040177057602708
    //   444: lload #5
    //   446: lxor
    //   447: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: aload #9
    //   457: invokeinterface getBoundingBox : ()Lorg/bukkit/util/BoundingBox;
    //   462: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   465: invokevirtual toString : ()Ljava/lang/String;
    //   468: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   471: pop
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   478: athrow
    //   479: return
    // Exception table:
    //   from	to	target	type
    //   36	43	43	java/lang/RuntimeException
    //   47	71	71	java/lang/RuntimeException
    //   75	92	95	java/lang/RuntimeException
    //   105	120	123	java/lang/RuntimeException
    //   110	138	141	java/lang/RuntimeException
    //   145	156	159	java/lang/RuntimeException
    //   423	472	475	java/lang/RuntimeException
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    long l2 = l1 ^ 0x372CB43935DDL;
    try {
      if (this.x != null)
        try {
          this.x.x++;
          if (this.x.x > 2) {
            this.x.z = this.x.r;
            b(l2, this.x);
            this.x = null;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = a ^ 0x16DF5BF21999L;
    long l2 = l1 ^ 0x5FA16B76C721L;
    try {
      if (this.x != null) {
        this.x.z = paramLocation1.clone();
        this.x.z.setYaw(paramLocation2.getYaw());
        this.x.z.setPitch(paramLocation2.getPitch());
        b(l2, this.x);
        this.x = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x4790B47DEFDFL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[15];
    boolean bool = false;
    String str;
    int i = (str = "ÇjQ*i75T#\023S¸\001\030-üI×}Ð¨kT\024W-·é²Í'Ë¬ãûª\020\037k¿Ö\024fôbhoÝ6¸(\0271£«9w[ÁýI ?dL\024Mïä \017ÔHù8÷'àô6\rÿx.£ôx{çs\027¯k\f=&~5ÎÚkS«7ttûëÎQx_/\026¨éÏ\006lI\022ÚÄ&2¹wÄ\022Nm\f4w7ÿÆùóåãaB å-u°¶µ«=úâ.yÐLxkþYU÷9¾Ç¬êS~³Õ áÁ`äÖ6\0062ûU)ÏXÓA 8Æ¦û0Ü\020\024Hyûë?!1Ò¥Ý}ô é·¤þª\017ï­x¨fÑÑgQÌZve&rT÷\002a8\007\f\031^Ù RÝÔ+r(\000Á½ãý\006~¬\022®Àd\t\030]Ôé ½NÃë\007\030Ó\rú\000:´_ï\034Às6ù\"fyBû\020fF\0333àþ´p\035q¾©_\b\006\020¾äÂødF\"Ù}M^Þ,éh£=:Ç\021vqW÷'\bAi°à¨k¨ÅxA²\021ç\007\0356ßn¯^r³¹%\002Çx:ù\034E¡5Åþ¸­O¥ÐGL¸5-î\033Ï%X/o£\020¸â~þ¸k\t3é:Ô°ÊRwknu;\000_ ¬sôa¢ãD\020QÝÎ\005ãÊÄ 5ó\nBBôMÁéFº²d").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  public od(yl paramyl) {
    super(paramyl);
    b(yk.k);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/od.a : J
    //   3: ldc2_w 122439020199367
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #306
    //   15: ldc2_w 7982474001545956429
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/od.b : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #20198
    //   41: ldc2_w 2956484406047097751
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   51: sipush #31630
    //   54: ldc2_w 2903488482859251440
    //   57: lload_1
    //   58: lxor
    //   59: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   64: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   69: putstatic me/rerere/matrix/internal/od.z : Ljava/lang/String;
    //   72: return
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x32BD;
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
        throw new RuntimeException("me/rerere/matrix/internal/od", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/od'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\od.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */