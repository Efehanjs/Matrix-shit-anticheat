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
import org.bukkit.Location;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

@Deprecated
public class wi extends zk {
  private long d;
  
  private int h;
  
  private int e = 0;
  
  private int n;
  
  private int y;
  
  private long m;
  
  private Vector o;
  
  private int q;
  
  private int t;
  
  private long g;
  
  private int a = 0;
  
  private static int s;
  
  private boolean u = false;
  
  private long w;
  
  private static final boolean[] f;
  
  private long l;
  
  private long r;
  
  private long x;
  
  private boolean z = false;
  
  private long k;
  
  private final ec v;
  
  private float b;
  
  private static boolean i;
  
  private static final long c = o3.a(4346983155331282927L, -4678470555079553024L, MethodHandles.lookup().lookupClass()).a(2273306165693L);
  
  private static final String[] j;
  
  private static final String[] p;
  
  private static final Map A = new HashMap<>(13);
  
  public void b(int paramInt, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 1430875225653
    //   5: lxor
    //   6: lstore #4
    //   8: pop2
    //   9: invokestatic j : ()J
    //   12: lstore #6
    //   14: lload #6
    //   16: aload_0
    //   17: getfield m : J
    //   20: lsub
    //   21: ldc2_w 3
    //   24: lcmp
    //   25: ifgt -> 137
    //   28: aload_0
    //   29: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   32: getfield x : D
    //   35: ldc2_w 25.0
    //   38: dcmpg
    //   39: ifge -> 137
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: aload_0
    //   50: dup
    //   51: getfield a : I
    //   54: iconst_1
    //   55: iadd
    //   56: dup_x1
    //   57: putfield a : I
    //   60: bipush #6
    //   62: if_icmple -> 151
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   75: iconst_0
    //   76: baload
    //   77: ifeq -> 129
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload_0
    //   88: lload #4
    //   90: sipush #10154
    //   93: ldc2_w 3329491037972514076
    //   96: lload_2
    //   97: lxor
    //   98: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   103: sipush #13448
    //   106: ldc2_w 4989687556704851507
    //   109: lload_2
    //   110: lxor
    //   111: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   116: getstatic me/rerere/matrix/internal/wi.s : I
    //   119: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: aload_0
    //   130: iconst_1
    //   131: putfield u : Z
    //   134: goto -> 151
    //   137: aload_0
    //   138: iconst_0
    //   139: aload_0
    //   140: getfield a : I
    //   143: iconst_2
    //   144: isub
    //   145: invokestatic max : (II)I
    //   148: putfield a : I
    //   151: lload #6
    //   153: aload_0
    //   154: getfield k : J
    //   157: lsub
    //   158: ldc2_w 100
    //   161: lcmp
    //   162: ifgt -> 256
    //   165: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   168: iconst_3
    //   169: baload
    //   170: ifeq -> 251
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: aload_0
    //   181: lload #4
    //   183: sipush #16806
    //   186: ldc2_w 1602766184292885273
    //   189: lload_2
    //   190: lxor
    //   191: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   196: new java/lang/StringBuilder
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: sipush #1464
    //   206: ldc2_w 9013459316654335771
    //   209: lload_2
    //   210: lxor
    //   211: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: invokestatic j : ()J
    //   222: aload_0
    //   223: getfield k : J
    //   226: lsub
    //   227: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   230: ldc ')'
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: invokevirtual toString : ()Ljava/lang/String;
    //   238: getstatic me/rerere/matrix/internal/wi.s : I
    //   241: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: aload_0
    //   252: iconst_1
    //   253: putfield u : Z
    //   256: lload #6
    //   258: aload_0
    //   259: getfield d : J
    //   262: lsub
    //   263: ldc2_w 150
    //   266: lcmp
    //   267: ifgt -> 387
    //   270: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   273: iconst_4
    //   274: baload
    //   275: ifeq -> 387
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: invokestatic j : ()J
    //   288: aload_0
    //   289: getfield g : J
    //   292: lsub
    //   293: ldc2_w 3000
    //   296: lcmp
    //   297: iflt -> 382
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   306: athrow
    //   307: aload_0
    //   308: lload #4
    //   310: sipush #28671
    //   313: ldc2_w 1454569627874037067
    //   316: lload_2
    //   317: lxor
    //   318: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   323: new java/lang/StringBuilder
    //   326: dup
    //   327: invokespecial <init> : ()V
    //   330: sipush #6063
    //   333: ldc2_w 1871956681834296607
    //   336: lload_2
    //   337: lxor
    //   338: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_0
    //   347: getfield b : F
    //   350: invokestatic b : (F)F
    //   353: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   356: ldc ')'
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: invokevirtual toString : ()Ljava/lang/String;
    //   364: getstatic me/rerere/matrix/internal/wi.s : I
    //   367: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   370: aload_0
    //   371: iconst_1
    //   372: putfield u : Z
    //   375: goto -> 382
    //   378: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   381: athrow
    //   382: aload_0
    //   383: lconst_0
    //   384: putfield d : J
    //   387: lload #6
    //   389: aload_0
    //   390: getfield x : J
    //   393: lsub
    //   394: ldc2_w 5
    //   397: lcmp
    //   398: ifgt -> 475
    //   401: aload_0
    //   402: dup
    //   403: getfield q : I
    //   406: iconst_1
    //   407: iadd
    //   408: dup_x1
    //   409: putfield q : I
    //   412: iconst_3
    //   413: if_icmplt -> 480
    //   416: goto -> 423
    //   419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   422: athrow
    //   423: aload_0
    //   424: lconst_0
    //   425: putfield x : J
    //   428: aload_0
    //   429: iconst_3
    //   430: putfield q : I
    //   433: aload_0
    //   434: lload #4
    //   436: sipush #30037
    //   439: ldc2_w 8882226709725747170
    //   442: lload_2
    //   443: lxor
    //   444: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   449: sipush #31657
    //   452: ldc2_w 2596961839228459284
    //   455: lload_2
    //   456: lxor
    //   457: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   462: getstatic me/rerere/matrix/internal/wi.s : I
    //   465: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   468: goto -> 480
    //   471: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   474: athrow
    //   475: aload_0
    //   476: iconst_0
    //   477: putfield q : I
    //   480: return
    // Exception table:
    //   from	to	target	type
    //   14	42	45	java/lang/RuntimeException
    //   28	65	68	java/lang/RuntimeException
    //   49	80	83	java/lang/RuntimeException
    //   72	122	125	java/lang/RuntimeException
    //   151	173	176	java/lang/RuntimeException
    //   165	244	247	java/lang/RuntimeException
    //   256	278	281	java/lang/RuntimeException
    //   270	300	303	java/lang/RuntimeException
    //   285	375	378	java/lang/RuntimeException
    //   387	416	419	java/lang/RuntimeException
    //   401	471	471	java/lang/RuntimeException
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/wi.c : J
    //   3: ldc2_w 41377348443540
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #19056
    //   15: ldc2_w 7339019842264480470
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/wi.i : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #30016
    //   41: ldc2_w 686791719296009707
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   51: iconst_5
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/wi.s : I
    //   60: iconst_0
    //   61: istore_3
    //   62: iload_3
    //   63: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   66: arraylength
    //   67: if_icmpge -> 127
    //   70: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   73: iload_3
    //   74: aload_0
    //   75: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   78: new java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: sipush #15096
    //   88: ldc2_w 2280919926926297692
    //   91: lload_1
    //   92: lxor
    //   93: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: iload_3
    //   102: iconst_1
    //   103: iadd
    //   104: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: iconst_1
    //   111: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   116: bastore
    //   117: iinc #3, 1
    //   120: goto -> 62
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: return
    // Exception table:
    //   from	to	target	type
    //   62	123	123	java/lang/RuntimeException
  }
  
  static {
    long l = c ^ 0x67BDA46634B8L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[19];
    boolean bool = false;
    String str;
    int i = (str = "SmN Ì;ôÆ\037\021\"\025NAë×e,Ëåc.rÝÿPlG÷¥°F\fqû\027Gì_4HXÕÆt\f?ÿ Òð}\003°ÓÐ9VÂÇúG§qÃ\022g¾\024ÀÃ.NºKæÇ¼\tï\035V9y#²|_Ê®)\005PÍ³»F^\027\037\031>\035AûÇ|Ng\016ñõ©ø`\001\002<£óï7ÜÍ¼ÝHÉ\033\031/¹rÓmþÇGì0:3¬5èr\025ÑL'·]/ÒèÓ`±ñ\007ø-ç\035P/%Ê\027ÞÈØj\fÿökØ\031Ýécy\023»PS\000G]u$F¯\\>k¢ê¾ýr!\\\r®|mC\b$FÛ\030{Å3îéÜ<âY´<zQË»Ãº ú¸ËTÐJ\013æn\r\033hÉdÐÚx\rë2ÊMß1\026Éð\030Ôøj°\ttå{,\030;éÂ¢qåÍÑ%ßÛÓ\022¬\030£Þ>Ê\005AÚÛ\025{×ù!]T(ªd¥i8ü]~Ó0§¹Y±d\031³\020­xà\031>ù¾Æ;s\021\007¿¾\b+ö\f¾æÔ\"ç=ÉAY\022\013e{\f%\000É@3)~beCbÁ\002\b\020ÌÅ½ãj>r%!\024*Ç\027p\000ã\005\"^önÉ.¸)³ûÏc\024¢eËZg¦\"On¯B¦f¾P³f\013ÍB\020iÑÒ\013G:ÜªÉ+*MÆ×Sn´\n\017¦û\022NóJÒ-ºy\036\005ÓeæJËYNú7ifè&ËÇRdÑÉ\020¼á\000Èl&*\\0<«\025@O\030\016{\fMüê-Ãt¿ÆáxÓ\nü\036Ý¹o^#\031y;g(W~h«Ö$UË²íÉP\n-\036\035¨Ððf¦\023þèWªìX:*$HEÇW^-Íÿï¸øç\f­ëüm&¼ð\023¥Öº%Ë[\004õ\023\017ëñµ¦\n\017­ñÈÚÊ½TñX5|\031c ÝX¶ÏJ[ÃíO\034W§à×øIo\020hÐ\ngX?÷Y _ÀÕÁ7Ì\023~ÍúkìÒUi'É\024\033Mýú\037v¥Þ\030\003 ]4¶\007@g\021²Vû2Ôµ²K®¼\025ñÍQiü;ï ¿¶¹\017\030GÿÞ\024PMÔ\023¶å\002rEî§eÔ¼õxX-¨íÁ´\f$\tï&Ô¢\033§Â¾f<B}Fí\036<ÌèM¨àæö@íÂâMú×±Ðeuß)å\031á¾G\bå?ÙU1\024ÛóQ&¶\020?x\tÏØEÄÄs\030^@\032_í¥[ÎnÍ~CøÛ<\007S?'ä\b").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    try {
      if (paramBlockPlaceEvent.canBuild())
        try {
          if (paramBlockPlaceEvent.getBlock().getType().isSolid())
            this.k = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = c ^ 0x5C253F9BF9CAL;
    int i = (int)((l1 ^ 0xBEBC281D1E2L) >>> 32L);
    long l2 = (l1 ^ 0xBEBC281D1E2L) << 32L >>> 32L;
    l1 ^ 0xBEBC281D1E2L;
    float f = jb.b(paramLocation1.getYaw(), i, l2, paramLocation2.getYaw());
    try {
      if (f > 90.0F)
        try {
          if (Math.abs(paramLocation2.getPitch()) <= 60.0F) {
            this.d = pc.j();
            this.b = f;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: lstore_3
    //   15: lload_3
    //   16: dup2
    //   17: ldc2_w 78396785392265
    //   20: lxor
    //   21: lstore #5
    //   23: pop2
    //   24: aload_0
    //   25: dup
    //   26: getfield h : I
    //   29: iconst_1
    //   30: iadd
    //   31: dup_x1
    //   32: putfield h : I
    //   35: bipush #7
    //   37: if_icmple -> 159
    //   40: aload_0
    //   41: getfield t : I
    //   44: iconst_3
    //   45: if_icmple -> 144
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   58: iconst_5
    //   59: baload
    //   60: ifeq -> 139
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: aload_0
    //   71: lload #5
    //   73: sipush #10043
    //   76: ldc2_w 6556998087718764859
    //   79: lload_3
    //   80: lxor
    //   81: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   86: new java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: sipush #2967
    //   96: ldc2_w 8255369802734710162
    //   99: lload_3
    //   100: lxor
    //   101: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload_0
    //   110: getfield t : I
    //   113: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   116: ldc ')'
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: getstatic me/rerere/matrix/internal/wi.s : I
    //   127: iconst_2
    //   128: imul
    //   129: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   138: athrow
    //   139: aload_0
    //   140: iconst_1
    //   141: putfield u : Z
    //   144: aload_0
    //   145: iconst_0
    //   146: putfield y : I
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield t : I
    //   154: aload_0
    //   155: iconst_0
    //   156: putfield h : I
    //   159: return
    // Exception table:
    //   from	to	target	type
    //   24	48	51	java/lang/RuntimeException
    //   40	63	66	java/lang/RuntimeException
    //   55	132	135	java/lang/RuntimeException
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 57264538460161
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 25653092024530
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 111913025362681
    //   19: lxor
    //   20: dup2
    //   21: bipush #56
    //   23: lushr
    //   24: l2i
    //   25: istore #9
    //   27: dup2
    //   28: bipush #8
    //   30: lshl
    //   31: bipush #8
    //   33: lushr
    //   34: lstore #10
    //   36: pop2
    //   37: dup2
    //   38: ldc2_w 47957886284789
    //   41: lxor
    //   42: lstore #12
    //   44: dup2
    //   45: ldc2_w 53778054797842
    //   48: lxor
    //   49: lstore #14
    //   51: dup2
    //   52: ldc2_w 40507544756790
    //   55: lxor
    //   56: lstore #16
    //   58: dup2
    //   59: ldc2_w 92285321630872
    //   62: lxor
    //   63: dup2
    //   64: bipush #48
    //   66: lushr
    //   67: l2i
    //   68: istore #18
    //   70: dup2
    //   71: bipush #16
    //   73: lshl
    //   74: bipush #16
    //   76: lushr
    //   77: lstore #19
    //   79: pop2
    //   80: pop2
    //   81: iconst_0
    //   82: istore #21
    //   84: aload_1
    //   85: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   88: if_acmpne -> 196
    //   91: lload #5
    //   93: aload #4
    //   95: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   98: ifeq -> 196
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: aload_0
    //   109: getfield u : Z
    //   112: ifeq -> 143
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: getstatic me/rerere/matrix/internal/wi.i : Z
    //   125: ifeq -> 138
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: iconst_1
    //   136: istore #21
    //   138: aload_0
    //   139: iconst_0
    //   140: putfield u : Z
    //   143: invokestatic j : ()J
    //   146: aload_0
    //   147: getfield w : J
    //   150: lsub
    //   151: ldc2_w 50
    //   154: lcmp
    //   155: ifgt -> 196
    //   158: iconst_1
    //   159: istore #21
    //   161: aload_0
    //   162: lload #7
    //   164: sipush #2355
    //   167: ldc2_w 965838360235496806
    //   170: lload_2
    //   171: lxor
    //   172: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   177: sipush #870
    //   180: ldc2_w 3212406166109839152
    //   183: lload_2
    //   184: lxor
    //   185: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   190: getstatic me/rerere/matrix/internal/wi.s : I
    //   193: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   196: lload #16
    //   198: aload_1
    //   199: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   202: ifne -> 247
    //   205: aload_1
    //   206: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   209: if_acmpeq -> 247
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   218: athrow
    //   219: aload_1
    //   220: getstatic com/comphenix/protocol/PacketType$Play$Client.ARM_ANIMATION : Lcom/comphenix/protocol/PacketType;
    //   223: if_acmpeq -> 247
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: aload_1
    //   234: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   237: if_acmpne -> 651
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: invokestatic j : ()J
    //   250: aload_0
    //   251: getfield l : J
    //   254: lsub
    //   255: lstore #22
    //   257: aload_0
    //   258: invokestatic j : ()J
    //   261: putfield l : J
    //   264: new me/rerere/matrix/internal/ic
    //   267: dup
    //   268: invokespecial <init> : ()V
    //   271: astore #24
    //   273: aload_0
    //   274: getfield v : Lme/rerere/matrix/internal/ec;
    //   277: aload_1
    //   278: lload #22
    //   280: lload #12
    //   282: aload #24
    //   284: invokevirtual b : (Lcom/comphenix/protocol/PacketType;JJLme/rerere/matrix/internal/ic;)V
    //   287: aload_1
    //   288: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   291: if_acmpne -> 315
    //   294: aload #24
    //   296: aload #4
    //   298: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   301: iconst_0
    //   302: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   305: invokevirtual b : (Ljava/lang/Object;)V
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   314: athrow
    //   315: aload_0
    //   316: getfield v : Lme/rerere/matrix/internal/ec;
    //   319: iload #9
    //   321: i2b
    //   322: lload #10
    //   324: invokevirtual b : (BJ)Z
    //   327: ifeq -> 651
    //   330: aload_1
    //   331: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   334: if_acmpne -> 651
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   343: athrow
    //   344: aload_0
    //   345: getfield v : Lme/rerere/matrix/internal/ec;
    //   348: iconst_0
    //   349: iload #18
    //   351: i2s
    //   352: lload #19
    //   354: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   357: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   360: lload #14
    //   362: dup2_x1
    //   363: pop2
    //   364: invokestatic p : (JLcom/comphenix/protocol/PacketType;)Z
    //   367: ifeq -> 651
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: aload_0
    //   378: getfield v : Lme/rerere/matrix/internal/ec;
    //   381: iconst_1
    //   382: iload #18
    //   384: i2s
    //   385: lload #19
    //   387: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   390: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   393: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   396: if_acmpne -> 651
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   405: athrow
    //   406: aload_0
    //   407: getfield v : Lme/rerere/matrix/internal/ec;
    //   410: iconst_1
    //   411: iload #18
    //   413: i2s
    //   414: lload #19
    //   416: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   419: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   422: ldc_w com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType
    //   425: invokevirtual b : (Ljava/lang/Class;)Ljava/lang/Object;
    //   428: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.RELEASE_USE_ITEM : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   431: if_acmpne -> 651
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   440: athrow
    //   441: aload_0
    //   442: getfield v : Lme/rerere/matrix/internal/ec;
    //   445: iconst_1
    //   446: iload #18
    //   448: i2s
    //   449: lload #19
    //   451: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   454: invokevirtual b : ()J
    //   457: ldc2_w 30
    //   460: lcmp
    //   461: ifle -> 651
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   470: athrow
    //   471: aload_0
    //   472: getfield v : Lme/rerere/matrix/internal/ec;
    //   475: iconst_2
    //   476: iload #18
    //   478: i2s
    //   479: lload #19
    //   481: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   484: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   487: getstatic com/comphenix/protocol/PacketType$Play$Client.ARM_ANIMATION : Lcom/comphenix/protocol/PacketType;
    //   490: if_acmpne -> 651
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   499: athrow
    //   500: aload_0
    //   501: getfield v : Lme/rerere/matrix/internal/ec;
    //   504: iconst_2
    //   505: iload #18
    //   507: i2s
    //   508: lload #19
    //   510: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   513: invokevirtual b : ()J
    //   516: ldc2_w 5
    //   519: lcmp
    //   520: ifge -> 651
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   529: athrow
    //   530: aload_0
    //   531: getfield v : Lme/rerere/matrix/internal/ec;
    //   534: iconst_3
    //   535: iload #18
    //   537: i2s
    //   538: lload #19
    //   540: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   543: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   546: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   549: if_acmpne -> 651
    //   552: goto -> 559
    //   555: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   558: athrow
    //   559: aload_0
    //   560: getfield v : Lme/rerere/matrix/internal/ec;
    //   563: iconst_3
    //   564: iload #18
    //   566: i2s
    //   567: lload #19
    //   569: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   572: invokevirtual b : ()J
    //   575: ldc2_w 5
    //   578: lcmp
    //   579: ifge -> 651
    //   582: goto -> 589
    //   585: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   588: athrow
    //   589: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   592: iconst_2
    //   593: baload
    //   594: ifeq -> 646
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   603: athrow
    //   604: aload_0
    //   605: lload #7
    //   607: sipush #26898
    //   610: ldc2_w 6749746334655067467
    //   613: lload_2
    //   614: lxor
    //   615: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   620: sipush #20986
    //   623: ldc2_w 7245735402221374894
    //   626: lload_2
    //   627: lxor
    //   628: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   633: getstatic me/rerere/matrix/internal/wi.s : I
    //   636: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   639: goto -> 646
    //   642: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   645: athrow
    //   646: aload_0
    //   647: iconst_1
    //   648: putfield u : Z
    //   651: lload #16
    //   653: aload_1
    //   654: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   657: ifeq -> 674
    //   660: aload_0
    //   661: invokestatic j : ()J
    //   664: putfield m : J
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   673: athrow
    //   674: aload_1
    //   675: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   678: if_acmpne -> 767
    //   681: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   684: iconst_1
    //   685: baload
    //   686: ifeq -> 767
    //   689: goto -> 696
    //   692: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   695: athrow
    //   696: aload #4
    //   698: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   701: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   704: astore #22
    //   706: aload #22
    //   708: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SPRINTING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   711: if_acmpne -> 747
    //   714: aload_0
    //   715: getfield z : Z
    //   718: ifeq -> 742
    //   721: goto -> 728
    //   724: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   727: athrow
    //   728: aload_0
    //   729: invokestatic j : ()J
    //   732: putfield x : J
    //   735: goto -> 742
    //   738: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   741: athrow
    //   742: aload_0
    //   743: iconst_1
    //   744: putfield z : Z
    //   747: aload #22
    //   749: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.STOP_SPRINTING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   752: if_acmpne -> 767
    //   755: aload_0
    //   756: iconst_0
    //   757: putfield z : Z
    //   760: goto -> 767
    //   763: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   766: athrow
    //   767: aload_1
    //   768: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   771: if_acmpne -> 879
    //   774: invokestatic b : ()I
    //   777: bipush #8
    //   779: if_icmpne -> 879
    //   782: goto -> 789
    //   785: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   788: athrow
    //   789: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   792: iconst_1
    //   793: baload
    //   794: ifeq -> 879
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   803: athrow
    //   804: invokestatic j : ()J
    //   807: lstore #22
    //   809: lload #22
    //   811: aload_0
    //   812: getfield r : J
    //   815: lsub
    //   816: ldc2_w 5
    //   819: lcmp
    //   820: ifgt -> 859
    //   823: aload_0
    //   824: dup
    //   825: getfield e : I
    //   828: iconst_1
    //   829: iadd
    //   830: dup_x1
    //   831: putfield e : I
    //   834: iconst_2
    //   835: if_icmplt -> 873
    //   838: goto -> 845
    //   841: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   844: athrow
    //   845: aload_0
    //   846: invokestatic j : ()J
    //   849: putfield w : J
    //   852: goto -> 873
    //   855: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   858: athrow
    //   859: aload_0
    //   860: aload_0
    //   861: getfield e : I
    //   864: iconst_1
    //   865: isub
    //   866: iconst_0
    //   867: invokestatic max : (II)I
    //   870: putfield e : I
    //   873: aload_0
    //   874: lload #22
    //   876: putfield r : J
    //   879: iload #21
    //   881: ireturn
    // Exception table:
    //   from	to	target	type
    //   84	101	104	java/lang/RuntimeException
    //   91	115	118	java/lang/RuntimeException
    //   108	128	131	java/lang/RuntimeException
    //   196	212	215	java/lang/RuntimeException
    //   205	226	229	java/lang/RuntimeException
    //   219	240	243	java/lang/RuntimeException
    //   273	308	311	java/lang/RuntimeException
    //   315	337	340	java/lang/RuntimeException
    //   330	370	373	java/lang/RuntimeException
    //   344	399	402	java/lang/RuntimeException
    //   377	434	437	java/lang/RuntimeException
    //   406	464	467	java/lang/RuntimeException
    //   441	493	496	java/lang/RuntimeException
    //   471	523	526	java/lang/RuntimeException
    //   500	552	555	java/lang/RuntimeException
    //   530	582	585	java/lang/RuntimeException
    //   559	597	600	java/lang/RuntimeException
    //   589	639	642	java/lang/RuntimeException
    //   651	667	670	java/lang/RuntimeException
    //   674	689	692	java/lang/RuntimeException
    //   706	721	724	java/lang/RuntimeException
    //   714	735	738	java/lang/RuntimeException
    //   747	760	763	java/lang/RuntimeException
    //   767	782	785	java/lang/RuntimeException
    //   774	797	800	java/lang/RuntimeException
    //   809	838	841	java/lang/RuntimeException
    //   823	855	855	java/lang/RuntimeException
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 101443026386467
    //   5: lxor
    //   6: lstore #4
    //   8: dup2
    //   9: ldc2_w 67215272246197
    //   12: lxor
    //   13: lstore #6
    //   15: pop2
    //   16: aload_1
    //   17: invokevirtual getCause : ()Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   20: getstatic org/bukkit/event/entity/EntityDamageEvent$DamageCause.ENTITY_ATTACK : Lorg/bukkit/event/entity/EntityDamageEvent$DamageCause;
    //   23: if_acmpeq -> 31
    //   26: return
    //   27: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   30: athrow
    //   31: aload_1
    //   32: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   35: invokeinterface getEntityId : ()I
    //   40: istore #8
    //   42: iload #8
    //   44: aload_0
    //   45: getfield n : I
    //   48: if_icmpeq -> 90
    //   51: aload_0
    //   52: dup
    //   53: getfield y : I
    //   56: iconst_1
    //   57: iadd
    //   58: putfield y : I
    //   61: aload_0
    //   62: getfield y : I
    //   65: iconst_1
    //   66: if_icmple -> 90
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: aload_0
    //   77: invokestatic j : ()J
    //   80: putfield g : J
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: iload #8
    //   92: aload_0
    //   93: getfield n : I
    //   96: if_icmpeq -> 181
    //   99: aload_0
    //   100: getfield o : Lorg/bukkit/util/Vector;
    //   103: ifnull -> 181
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aload_0
    //   114: getfield o : Lorg/bukkit/util/Vector;
    //   117: aload_1
    //   118: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   121: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   126: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   129: invokestatic b : (Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;)D
    //   132: dconst_1
    //   133: dcmpl
    //   134: ifle -> 181
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload_0
    //   145: dup
    //   146: getfield t : I
    //   149: iconst_1
    //   150: iadd
    //   151: putfield t : I
    //   154: aload_0
    //   155: getfield t : I
    //   158: iconst_3
    //   159: if_icmple -> 181
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   168: athrow
    //   169: aload_1
    //   170: iconst_1
    //   171: invokevirtual setCancelled : (Z)V
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   180: athrow
    //   181: aload_0
    //   182: iload #8
    //   184: putfield n : I
    //   187: aload_0
    //   188: aload_1
    //   189: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   192: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   197: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   200: putfield o : Lorg/bukkit/util/Vector;
    //   203: aload_1
    //   204: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   207: checkcast org/bukkit/entity/Player
    //   210: astore #9
    //   212: aload #9
    //   214: invokeinterface isBlocking : ()Z
    //   219: ifeq -> 323
    //   222: aload_1
    //   223: iconst_1
    //   224: invokevirtual setCancelled : (Z)V
    //   227: getstatic me/rerere/matrix/internal/wi.f : [Z
    //   230: bipush #6
    //   232: baload
    //   233: ifeq -> 316
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload_0
    //   244: lload #6
    //   246: sipush #22527
    //   249: ldc2_w 2349951239524872413
    //   252: lload_2
    //   253: lxor
    //   254: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   259: new java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial <init> : ()V
    //   266: sipush #10498
    //   269: ldc2_w 97446996196658722
    //   272: lload_2
    //   273: lxor
    //   274: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: aload_0
    //   283: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   286: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   289: invokevirtual b : ()Ljava/lang/String;
    //   292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: ldc ')'
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: invokevirtual toString : ()Ljava/lang/String;
    //   303: getstatic me/rerere/matrix/internal/wi.s : I
    //   306: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   315: athrow
    //   316: lload #4
    //   318: aload #9
    //   320: invokestatic b : (JLorg/bukkit/entity/Player;)V
    //   323: return
    // Exception table:
    //   from	to	target	type
    //   16	27	27	java/lang/RuntimeException
    //   42	69	72	java/lang/RuntimeException
    //   51	83	86	java/lang/RuntimeException
    //   90	106	109	java/lang/RuntimeException
    //   99	137	140	java/lang/RuntimeException
    //   113	162	165	java/lang/RuntimeException
    //   144	174	177	java/lang/RuntimeException
    //   212	236	239	java/lang/RuntimeException
    //   222	309	312	java/lang/RuntimeException
  }
  
  public void b(int paramInt, short paramShort, char paramChar, @NotNull PlayerItemConsumeEvent paramPlayerItemConsumeEvent) {
    this.k = pc.j();
  }
  
  public wi(int paramInt1, char paramChar, yl paramyl, int paramInt2) {
    super(paramyl);
    this.v = new ec(4, l2);
    this.n = -1;
    this.t = 0;
    this.h = 0;
    b(yk.n);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4F6D;
    if (p[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])A.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          A.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/wi", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = j[i].getBytes("ISO-8859-1");
      p[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return p[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/wi'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */