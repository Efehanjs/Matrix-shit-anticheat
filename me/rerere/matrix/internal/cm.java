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
import org.bukkit.Material;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerAnimationEvent;

public class cm extends zk {
  private boolean z = false;
  
  private static int k;
  
  private int v = 0;
  
  private static List b;
  
  private static boolean i;
  
  private static final long a = o3.a(-5276322417288572632L, -2593770146164075183L, MethodHandles.lookup().lookupClass()).a(259052123130345L);
  
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
    //   36: ldc2_w 48740968429332
    //   39: lxor
    //   40: lstore #9
    //   42: pop2
    //   43: invokestatic b : ()I
    //   46: bipush #8
    //   48: if_icmpne -> 89
    //   51: invokestatic b : ()Z
    //   54: ifeq -> 89
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: aload_0
    //   65: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   68: invokevirtual b : ()I
    //   71: sipush #335
    //   74: if_icmplt -> 89
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: return
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_2
    //   90: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   93: invokeinterface getType : ()Lorg/bukkit/Material;
    //   98: invokevirtual isSolid : ()Z
    //   101: ifne -> 109
    //   104: return
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: invokestatic b : ()I
    //   112: bipush #14
    //   114: if_icmplt -> 144
    //   117: aload_2
    //   118: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   121: invokeinterface getType : ()Lorg/bukkit/Material;
    //   126: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
    //   129: if_acmpne -> 144
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: return
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: invokestatic b : ()I
    //   147: bipush #8
    //   149: if_icmple -> 200
    //   152: aload_0
    //   153: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   156: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   159: invokevirtual ordinal : ()I
    //   162: getstatic me/rerere/matrix/internal/q.t : Lme/rerere/matrix/internal/q;
    //   165: invokevirtual ordinal : ()I
    //   168: if_icmplt -> 200
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: aload_2
    //   179: invokevirtual getHand : ()Lorg/bukkit/inventory/EquipmentSlot;
    //   182: getstatic org/bukkit/inventory/EquipmentSlot.OFF_HAND : Lorg/bukkit/inventory/EquipmentSlot;
    //   185: if_acmpne -> 200
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: return
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: aload_0
    //   201: getfield z : Z
    //   204: ifeq -> 351
    //   207: aload_2
    //   208: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   211: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   216: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   219: if_acmpne -> 351
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   228: athrow
    //   229: aload_0
    //   230: getfield v : I
    //   233: iconst_5
    //   234: if_icmple -> 351
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   243: athrow
    //   244: getstatic me/rerere/matrix/internal/cm.i : Z
    //   247: ifeq -> 346
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: lload #9
    //   259: invokestatic b : (J)Z
    //   262: ifne -> 346
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   271: athrow
    //   272: aload_2
    //   273: iconst_1
    //   274: invokevirtual setCancelled : (Z)V
    //   277: aload_0
    //   278: lload #7
    //   280: sipush #13740
    //   283: ldc2_w 7270841328456553724
    //   286: lload #5
    //   288: lxor
    //   289: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   294: new java/lang/StringBuilder
    //   297: dup
    //   298: invokespecial <init> : ()V
    //   301: sipush #27465
    //   304: ldc2_w 210974401550125590
    //   307: lload #5
    //   309: lxor
    //   310: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: aload_2
    //   319: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   322: invokeinterface getType : ()Lorg/bukkit/Material;
    //   327: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   330: invokevirtual toString : ()Ljava/lang/String;
    //   333: getstatic me/rerere/matrix/internal/cm.k : I
    //   336: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   345: athrow
    //   346: aload_0
    //   347: iconst_0
    //   348: putfield z : Z
    //   351: aload_2
    //   352: invokevirtual canBuild : ()Z
    //   355: ifeq -> 419
    //   358: aload_2
    //   359: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   362: invokeinterface getType : ()Lorg/bukkit/Material;
    //   367: invokevirtual isBlock : ()Z
    //   370: ifeq -> 419
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   379: athrow
    //   380: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   383: aload_2
    //   384: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   387: invokeinterface getType : ()Lorg/bukkit/Material;
    //   392: invokeinterface contains : (Ljava/lang/Object;)Z
    //   397: ifne -> 419
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   406: athrow
    //   407: aload_0
    //   408: iconst_1
    //   409: putfield z : Z
    //   412: goto -> 419
    //   415: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   418: athrow
    //   419: return
    // Exception table:
    //   from	to	target	type
    //   43	57	60	java/lang/RuntimeException
    //   51	77	80	java/lang/RuntimeException
    //   64	85	85	java/lang/RuntimeException
    //   89	105	105	java/lang/RuntimeException
    //   109	132	135	java/lang/RuntimeException
    //   117	140	140	java/lang/RuntimeException
    //   144	171	174	java/lang/RuntimeException
    //   152	188	191	java/lang/RuntimeException
    //   178	196	196	java/lang/RuntimeException
    //   200	222	225	java/lang/RuntimeException
    //   207	237	240	java/lang/RuntimeException
    //   229	250	253	java/lang/RuntimeException
    //   244	265	268	java/lang/RuntimeException
    //   257	339	342	java/lang/RuntimeException
    //   351	373	376	java/lang/RuntimeException
    //   358	400	403	java/lang/RuntimeException
    //   380	412	415	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerAnimationEvent paramPlayerAnimationEvent) {
    this.z = false;
    this.v = 0;
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/cm.a : J
    //   3: ldc2_w 135185573877067
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #21484
    //   15: ldc2_w 1321281442819615557
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/cm.i : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #11756
    //   41: ldc2_w 1449287827876762946
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/cm.k : I
    //   60: new java/util/ArrayList
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: putstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   70: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   73: getstatic org/bukkit/Material.FIRE : Lorg/bukkit/Material;
    //   76: invokeinterface add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: invokestatic b : ()I
    //   85: bipush #13
    //   87: if_icmpge -> 122
    //   90: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   93: sipush #10979
    //   96: ldc2_w 5649095197011038793
    //   99: lload_1
    //   100: lxor
    //   101: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   106: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/Material;
    //   109: invokeinterface add : (Ljava/lang/Object;)Z
    //   114: pop
    //   115: goto -> 134
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   125: getstatic org/bukkit/Material.LILY_PAD : Lorg/bukkit/Material;
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   137: getstatic org/bukkit/Material.SAND : Lorg/bukkit/Material;
    //   140: invokeinterface add : (Ljava/lang/Object;)Z
    //   145: pop
    //   146: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   149: getstatic org/bukkit/Material.GRAVEL : Lorg/bukkit/Material;
    //   152: invokeinterface add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   161: invokestatic values : ()[Lorg/bukkit/Material;
    //   164: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   167: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   172: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   177: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   182: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   187: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   190: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   195: checkcast java/util/Collection
    //   198: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   203: pop
    //   204: invokestatic b : ()I
    //   207: bipush #12
    //   209: if_icmplt -> 259
    //   212: invokestatic b : ()I
    //   215: bipush #17
    //   217: if_icmpge -> 259
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   230: sipush #9641
    //   233: ldc2_w 2344990679443889410
    //   236: lload_1
    //   237: lxor
    //   238: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   243: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/Material;
    //   246: invokeinterface add : (Ljava/lang/Object;)Z
    //   251: pop
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   258: athrow
    //   259: invokestatic b : ()I
    //   262: bipush #17
    //   264: if_icmplt -> 286
    //   267: getstatic me/rerere/matrix/internal/cm.b : Ljava/util/List;
    //   270: getstatic org/bukkit/Material.DIRT_PATH : Lorg/bukkit/Material;
    //   273: invokeinterface add : (Ljava/lang/Object;)Z
    //   278: pop
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   285: athrow
    //   286: return
    // Exception table:
    //   from	to	target	type
    //   8	118	118	java/lang/RuntimeException
    //   134	220	223	java/lang/RuntimeException
    //   212	252	255	java/lang/RuntimeException
    //   259	279	282	java/lang/RuntimeException
  }
  
  public cm(yl paramyl) {
    super(paramyl);
    b(yk.r);
  }
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (this.v < 20)
        this.v++; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x68B66D6BF5BAL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "©#®Ñ<¤ª\t\007îèZAÞ¼r9d D#[Ä×Õ\td\007ÌWX\013/<\tý)~¾ÑüGpâÔ(¶Üy]ØÚËÒð\006\030Ä\024Q\tJB\023âI\fçwûY02Ä¢\rõs¿\013b(Õ\005?bq5\\\0077È«\020D\024µ\020¡£Äk¾.Pú°R|]Kò\t9¹g8N%á30SZ®¢L\017yc¼zýRt{h|ðÍâ¡ÍNUMÁI:\013D·\020:l\027­\026s\016+oï\030?\023p÷þ_\020í@m)¬\024úiúi¨L\\\020+?Ï$Js\0132r\031(ÇX").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x476B;
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
        throw new RuntimeException("me/rerere/matrix/internal/cm", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/cm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\cm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */