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
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

public class dh extends zk {
  private static int g;
  
  private int a;
  
  private int s;
  
  private long u = -1L;
  
  private long w;
  
  private int f;
  
  private double l;
  
  private long r;
  
  private static int x;
  
  private int z;
  
  private static boolean k;
  
  private int v = 0;
  
  private int b;
  
  private long i;
  
  private static final long c = o3.a(-501592197226898636L, 8575711456954880346L, MethodHandles.lookup().lookupClass()).a(37276694394392L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public dh(yl paramyl) {
    super(paramyl);
    b(yk.z);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: pop2
    //   9: aload_1
    //   10: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   13: if_acmpne -> 222
    //   16: aload #4
    //   18: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   21: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   24: astore #7
    //   26: aload #7
    //   28: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_FALL_FLYING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   31: if_acmpne -> 222
    //   34: getstatic me/rerere/matrix/internal/pd.w : Z
    //   37: ifeq -> 72
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   50: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   53: aload_0
    //   54: <illegal opcode> run : (Lme/rerere/matrix/internal/dh;)Ljava/lang/Runnable;
    //   59: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   64: pop
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: invokestatic j : ()J
    //   75: aload_0
    //   76: getfield r : J
    //   79: lsub
    //   80: ldc2_w 75
    //   83: lcmp
    //   84: ifge -> 201
    //   87: aload_0
    //   88: dup
    //   89: getfield s : I
    //   92: iconst_1
    //   93: iadd
    //   94: dup_x1
    //   95: putfield s : I
    //   98: iconst_5
    //   99: if_icmplt -> 215
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: aload_0
    //   110: lload #5
    //   112: sipush #29365
    //   115: ldc2_w 3367111199785444586
    //   118: lload_2
    //   119: lxor
    //   120: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   125: new java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: sipush #26505
    //   135: ldc2_w 2773172837819773434
    //   138: lload_2
    //   139: lxor
    //   140: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: invokestatic currentTimeMillis : ()J
    //   151: aload_0
    //   152: getfield r : J
    //   155: lsub
    //   156: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   159: sipush #27786
    //   162: ldc2_w 6927090219644943054
    //   165: lload_2
    //   166: lxor
    //   167: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload_0
    //   176: getfield s : I
    //   179: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   182: ldc ')'
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual toString : ()Ljava/lang/String;
    //   190: iconst_3
    //   191: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   194: goto -> 215
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: aload_0
    //   202: iconst_0
    //   203: aload_0
    //   204: getfield s : I
    //   207: iconst_1
    //   208: isub
    //   209: invokestatic max : (II)I
    //   212: putfield s : I
    //   215: aload_0
    //   216: invokestatic currentTimeMillis : ()J
    //   219: putfield r : J
    //   222: aload_1
    //   223: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_PLACE : Lcom/comphenix/protocol/PacketType;
    //   226: if_acmpne -> 292
    //   229: aload_0
    //   230: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   233: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   236: invokevirtual ordinal : ()I
    //   239: getstatic me/rerere/matrix/internal/q.f : Lme/rerere/matrix/internal/q;
    //   242: invokevirtual ordinal : ()I
    //   245: if_icmplt -> 292
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: aload_0
    //   256: dup
    //   257: getfield v : I
    //   260: iconst_1
    //   261: iadd
    //   262: putfield v : I
    //   265: aload_0
    //   266: getfield v : I
    //   269: iconst_5
    //   270: if_icmple -> 292
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   279: athrow
    //   280: aload_0
    //   281: iconst_5
    //   282: putfield v : I
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   291: athrow
    //   292: iconst_0
    //   293: ireturn
    // Exception table:
    //   from	to	target	type
    //   26	40	43	java/lang/RuntimeException
    //   34	65	68	java/lang/RuntimeException
    //   72	102	105	java/lang/RuntimeException
    //   87	197	197	java/lang/RuntimeException
    //   222	248	251	java/lang/RuntimeException
    //   229	273	276	java/lang/RuntimeException
    //   255	285	288	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dh.c : J
    //   3: ldc2_w 61503473213314
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 112088494538051
    //   15: lxor
    //   16: dup2
    //   17: bipush #32
    //   19: lushr
    //   20: l2i
    //   21: istore #6
    //   23: dup2
    //   24: bipush #32
    //   26: lshl
    //   27: bipush #40
    //   29: lushr
    //   30: l2i
    //   31: istore #7
    //   33: dup2
    //   34: bipush #56
    //   36: lshl
    //   37: bipush #56
    //   39: lushr
    //   40: l2i
    //   41: istore #8
    //   43: pop2
    //   44: dup2
    //   45: ldc2_w 52505769969781
    //   48: lxor
    //   49: lstore #9
    //   51: dup2
    //   52: ldc2_w 68606977929682
    //   55: lxor
    //   56: lstore #11
    //   58: dup2
    //   59: ldc2_w 31452344419112
    //   62: lxor
    //   63: lstore #13
    //   65: dup2
    //   66: ldc2_w 37579749197918
    //   69: lxor
    //   70: dup2
    //   71: bipush #32
    //   73: lushr
    //   74: l2i
    //   75: istore #15
    //   77: dup2
    //   78: bipush #32
    //   80: lshl
    //   81: bipush #48
    //   83: lushr
    //   84: l2i
    //   85: istore #16
    //   87: dup2
    //   88: bipush #48
    //   90: lshl
    //   91: bipush #48
    //   93: lushr
    //   94: l2i
    //   95: istore #17
    //   97: pop2
    //   98: dup2
    //   99: ldc2_w 47262571950698
    //   102: lxor
    //   103: lstore #18
    //   105: dup2
    //   106: ldc2_w 137896427525439
    //   109: lxor
    //   110: lstore #20
    //   112: pop2
    //   113: aload_0
    //   114: getfield f : I
    //   117: ifle -> 140
    //   120: aload_0
    //   121: dup
    //   122: getfield f : I
    //   125: iconst_1
    //   126: isub
    //   127: putfield f : I
    //   130: aload_1
    //   131: aload_2
    //   132: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   135: return
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: aload_1
    //   141: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   144: astore #25
    //   146: aload #25
    //   148: invokeinterface isGliding : ()Z
    //   153: istore #26
    //   155: iload #26
    //   157: ifne -> 180
    //   160: aload_0
    //   161: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   164: invokevirtual j : ()Z
    //   167: ifeq -> 180
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   176: athrow
    //   177: iconst_1
    //   178: istore #26
    //   180: iload #26
    //   182: ifeq -> 359
    //   185: aload_0
    //   186: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   189: invokevirtual b : ()Lme/rerere/matrix/internal/x;
    //   192: lload #18
    //   194: aload_3
    //   195: invokevirtual b : (JLorg/bukkit/Location;)Z
    //   198: ifeq -> 359
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   207: athrow
    //   208: aload_3
    //   209: invokestatic f : (Lorg/bukkit/Location;)Z
    //   212: ifeq -> 359
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   221: athrow
    //   222: aload_3
    //   223: lload #13
    //   225: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   228: ifne -> 359
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   237: athrow
    //   238: aload_3
    //   239: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   242: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   245: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   250: invokeinterface getType : ()Lorg/bukkit/Material;
    //   255: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   258: if_acmpne -> 359
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: aload_0
    //   269: getfield a : I
    //   272: ifne -> 359
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   281: athrow
    //   282: aload_1
    //   283: aload_2
    //   284: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   287: aload_0
    //   288: lload #9
    //   290: sipush #20418
    //   293: ldc2_w 1738304011826155810
    //   296: lload #4
    //   298: lxor
    //   299: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   304: new java/lang/StringBuilder
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: sipush #22726
    //   314: ldc2_w 2653785177749603899
    //   317: lload #4
    //   319: lxor
    //   320: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload_3
    //   329: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   332: aload_2
    //   333: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   336: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   339: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: invokevirtual toString : ()Ljava/lang/String;
    //   348: iconst_1
    //   349: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   352: goto -> 359
    //   355: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   358: athrow
    //   359: iconst_0
    //   360: istore #27
    //   362: invokestatic j : ()J
    //   365: lstore #28
    //   367: invokestatic b : ()I
    //   370: bipush #13
    //   372: if_icmplt -> 402
    //   375: aload #25
    //   377: invokeinterface isRiptiding : ()Z
    //   382: istore #27
    //   384: iload #27
    //   386: ifeq -> 402
    //   389: aload_0
    //   390: lload #28
    //   392: putfield w : J
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   401: athrow
    //   402: aload_3
    //   403: invokevirtual getY : ()D
    //   406: aload_2
    //   407: invokevirtual getY : ()D
    //   410: dsub
    //   411: dstore #30
    //   413: iload #26
    //   415: ifeq -> 435
    //   418: aload_0
    //   419: dup
    //   420: getfield a : I
    //   423: iconst_1
    //   424: iadd
    //   425: putfield a : I
    //   428: goto -> 440
    //   431: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   434: athrow
    //   435: aload_0
    //   436: iconst_0
    //   437: putfield a : I
    //   440: iconst_0
    //   441: istore #32
    //   443: iconst_0
    //   444: istore #33
    //   446: aload_0
    //   447: getfield u : J
    //   450: lconst_0
    //   451: lcmp
    //   452: ifle -> 497
    //   455: invokestatic j : ()J
    //   458: aload_0
    //   459: getfield u : J
    //   462: lsub
    //   463: ldc2_w 500
    //   466: lcmp
    //   467: ifgt -> 489
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   476: athrow
    //   477: aload_1
    //   478: aload_2
    //   479: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   482: goto -> 496
    //   485: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   488: athrow
    //   489: aload_0
    //   490: ldc2_w -1
    //   493: putfield u : J
    //   496: return
    //   497: iload #26
    //   499: ifeq -> 524
    //   502: iload #15
    //   504: iload #16
    //   506: i2s
    //   507: aload #25
    //   509: iload #17
    //   511: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   514: ifeq -> 536
    //   517: goto -> 524
    //   520: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   523: athrow
    //   524: aload_0
    //   525: iconst_0
    //   526: putfield b : I
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   535: athrow
    //   536: iload #26
    //   538: ifeq -> 3273
    //   541: iload #27
    //   543: ifne -> 3273
    //   546: goto -> 553
    //   549: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   552: athrow
    //   553: aload #25
    //   555: aload_2
    //   556: invokestatic b : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;)Z
    //   559: istore #34
    //   561: iload #34
    //   563: ifeq -> 579
    //   566: aload_0
    //   567: lload #28
    //   569: putfield i : J
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   578: athrow
    //   579: aload_3
    //   580: aload_2
    //   581: invokevirtual distance : (Lorg/bukkit/Location;)D
    //   584: dstore #35
    //   586: ldc2_w 0.5
    //   589: dload #35
    //   591: ldc2_w 2.0
    //   594: invokestatic pow : (DD)D
    //   597: dmul
    //   598: dstore #37
    //   600: dload #37
    //   602: aload_0
    //   603: getfield l : D
    //   606: dsub
    //   607: dstore #39
    //   609: aload_0
    //   610: getfield a : I
    //   613: iconst_5
    //   614: if_icmpge -> 934
    //   617: iload #34
    //   619: ifne -> 934
    //   622: goto -> 629
    //   625: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   628: athrow
    //   629: aload_2
    //   630: aload_3
    //   631: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   634: dstore #41
    //   636: aload_0
    //   637: getfield a : I
    //   640: iconst_1
    //   641: if_icmple -> 790
    //   644: dload #41
    //   646: ldc2_w 0.4
    //   649: dcmpl
    //   650: ifle -> 934
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   659: athrow
    //   660: dload #39
    //   662: ldc2_w 0.2
    //   665: dcmpl
    //   666: ifle -> 934
    //   669: goto -> 676
    //   672: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   675: athrow
    //   676: aload_0
    //   677: lload #9
    //   679: sipush #10781
    //   682: ldc2_w 4919392323790156992
    //   685: lload #4
    //   687: lxor
    //   688: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   693: new java/lang/StringBuilder
    //   696: dup
    //   697: invokespecial <init> : ()V
    //   700: sipush #145
    //   703: ldc2_w 3289225368283324007
    //   706: lload #4
    //   708: lxor
    //   709: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   714: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: dload #41
    //   719: invokestatic b : (D)D
    //   722: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   725: sipush #7131
    //   728: ldc2_w 7799511066028573952
    //   731: lload #4
    //   733: lxor
    //   734: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   739: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: dload #39
    //   744: invokestatic b : (D)D
    //   747: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   750: sipush #3393
    //   753: ldc2_w 3425985476306015152
    //   756: lload #4
    //   758: lxor
    //   759: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: aload_0
    //   768: getfield a : I
    //   771: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   774: invokevirtual toString : ()Ljava/lang/String;
    //   777: iconst_5
    //   778: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   781: iconst_1
    //   782: istore #32
    //   784: iconst_1
    //   785: istore #33
    //   787: goto -> 934
    //   790: aload_0
    //   791: getfield a : I
    //   794: iconst_1
    //   795: if_icmpne -> 934
    //   798: dload #41
    //   800: ldc2_w 0.4
    //   803: dcmpl
    //   804: ifle -> 934
    //   807: goto -> 814
    //   810: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   813: athrow
    //   814: dload #39
    //   816: ldc2_w 0.5
    //   819: dcmpl
    //   820: ifle -> 934
    //   823: goto -> 830
    //   826: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   829: athrow
    //   830: aload_0
    //   831: lload #9
    //   833: sipush #15357
    //   836: ldc2_w 7986117529608365322
    //   839: lload #4
    //   841: lxor
    //   842: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   847: new java/lang/StringBuilder
    //   850: dup
    //   851: invokespecial <init> : ()V
    //   854: sipush #2360
    //   857: ldc2_w 4913230858253572070
    //   860: lload #4
    //   862: lxor
    //   863: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   868: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   871: dload #41
    //   873: invokestatic b : (D)D
    //   876: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   879: sipush #24103
    //   882: ldc2_w 9060666328325701874
    //   885: lload #4
    //   887: lxor
    //   888: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   893: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   896: dload #39
    //   898: invokestatic b : (D)D
    //   901: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   904: sipush #9019
    //   907: ldc2_w 6989800266114416081
    //   910: lload #4
    //   912: lxor
    //   913: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   918: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   921: invokevirtual toString : ()Ljava/lang/String;
    //   924: iconst_5
    //   925: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   928: iconst_1
    //   929: istore #32
    //   931: iconst_1
    //   932: istore #33
    //   934: aload_0
    //   935: getfield a : I
    //   938: iconst_5
    //   939: if_icmple -> 1316
    //   942: dload #35
    //   944: ldc2_w 0.5
    //   947: dcmpl
    //   948: ifle -> 1316
    //   951: goto -> 958
    //   954: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   957: athrow
    //   958: iload #6
    //   960: iload #7
    //   962: aload #25
    //   964: iload #8
    //   966: i2b
    //   967: invokestatic d : (IILorg/bukkit/entity/Player;B)Z
    //   970: ifne -> 1018
    //   973: goto -> 980
    //   976: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   979: athrow
    //   980: aload_3
    //   981: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   984: invokeinterface isLiquid : ()Z
    //   989: ifeq -> 1316
    //   992: goto -> 999
    //   995: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   998: athrow
    //   999: aload_2
    //   1000: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1003: invokeinterface isLiquid : ()Z
    //   1008: ifeq -> 1316
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1017: athrow
    //   1018: iload #34
    //   1020: ifne -> 1316
    //   1023: goto -> 1030
    //   1026: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1029: athrow
    //   1030: lload #28
    //   1032: aload_0
    //   1033: getfield i : J
    //   1036: lsub
    //   1037: ldc2_w 500
    //   1040: lcmp
    //   1041: ifle -> 1316
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1050: athrow
    //   1051: lload #28
    //   1053: aload_0
    //   1054: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1057: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1060: invokevirtual j : ()J
    //   1063: lsub
    //   1064: ldc2_w 1000
    //   1067: lcmp
    //   1068: iflt -> 1316
    //   1071: goto -> 1078
    //   1074: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1077: athrow
    //   1078: lload #28
    //   1080: aload_0
    //   1081: getfield w : J
    //   1084: lsub
    //   1085: ldc2_w 9000
    //   1088: lcmp
    //   1089: ifle -> 1316
    //   1092: goto -> 1099
    //   1095: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1098: athrow
    //   1099: dload #39
    //   1101: dconst_0
    //   1102: dcmpl
    //   1103: iflt -> 1308
    //   1106: goto -> 1113
    //   1109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1112: athrow
    //   1113: iconst_0
    //   1114: istore #41
    //   1116: invokestatic b : ()I
    //   1119: bipush #13
    //   1121: if_icmplt -> 1147
    //   1124: aload #25
    //   1126: getstatic org/bukkit/potion/PotionEffectType.DOLPHINS_GRACE : Lorg/bukkit/potion/PotionEffectType;
    //   1129: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   1134: ifeq -> 1147
    //   1137: goto -> 1144
    //   1140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1143: athrow
    //   1144: iconst_1
    //   1145: istore #41
    //   1147: iload #41
    //   1149: ifne -> 1305
    //   1152: aload_0
    //   1153: dup
    //   1154: getfield z : I
    //   1157: iconst_1
    //   1158: iadd
    //   1159: dup_x1
    //   1160: putfield z : I
    //   1163: iconst_2
    //   1164: if_icmpgt -> 1190
    //   1167: goto -> 1174
    //   1170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1173: athrow
    //   1174: dload #39
    //   1176: ldc2_w 0.6
    //   1179: dcmpl
    //   1180: ifle -> 1305
    //   1183: goto -> 1190
    //   1186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1189: athrow
    //   1190: aload_0
    //   1191: invokespecial b : ()Z
    //   1194: ifeq -> 1305
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1203: athrow
    //   1204: aload_0
    //   1205: lload #9
    //   1207: sipush #4542
    //   1210: ldc2_w 665427236211036013
    //   1213: lload #4
    //   1215: lxor
    //   1216: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1221: new java/lang/StringBuilder
    //   1224: dup
    //   1225: invokespecial <init> : ()V
    //   1228: sipush #20418
    //   1231: ldc2_w 5757906513285566752
    //   1234: lload #4
    //   1236: lxor
    //   1237: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1245: dload #37
    //   1247: invokestatic b : (D)D
    //   1250: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1253: sipush #7033
    //   1256: ldc2_w 8231899701650654627
    //   1259: lload #4
    //   1261: lxor
    //   1262: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: dload #39
    //   1272: invokestatic b : (D)D
    //   1275: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1278: sipush #32734
    //   1281: ldc2_w 767939168325296442
    //   1284: lload #4
    //   1286: lxor
    //   1287: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: invokevirtual toString : ()Ljava/lang/String;
    //   1298: iconst_2
    //   1299: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1302: iconst_1
    //   1303: istore #32
    //   1305: goto -> 1321
    //   1308: aload_0
    //   1309: iconst_0
    //   1310: putfield z : I
    //   1313: goto -> 1321
    //   1316: aload_0
    //   1317: iconst_0
    //   1318: putfield z : I
    //   1321: aload_0
    //   1322: getfield a : I
    //   1325: iconst_5
    //   1326: if_icmple -> 1725
    //   1329: iload #34
    //   1331: ifne -> 1725
    //   1334: goto -> 1341
    //   1337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1340: athrow
    //   1341: lload #28
    //   1343: aload_0
    //   1344: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1347: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1350: invokevirtual j : ()J
    //   1353: lsub
    //   1354: ldc2_w 1500
    //   1357: lcmp
    //   1358: iflt -> 1725
    //   1361: goto -> 1368
    //   1364: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1367: athrow
    //   1368: lload #28
    //   1370: aload_0
    //   1371: getfield w : J
    //   1374: lsub
    //   1375: ldc2_w 1000
    //   1378: lcmp
    //   1379: ifle -> 1725
    //   1382: goto -> 1389
    //   1385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1388: athrow
    //   1389: aload_2
    //   1390: aload_3
    //   1391: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1394: ldc2_w 0.02
    //   1397: dcmpg
    //   1398: ifge -> 1551
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1407: athrow
    //   1408: dload #30
    //   1410: ldc2_w 0.43
    //   1413: dcmpl
    //   1414: ifle -> 1551
    //   1417: goto -> 1424
    //   1420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1423: athrow
    //   1424: aload_2
    //   1425: invokevirtual getPitch : ()F
    //   1428: ldc_w -80.0
    //   1431: fcmpl
    //   1432: ifle -> 1551
    //   1435: goto -> 1442
    //   1438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1441: athrow
    //   1442: aload_0
    //   1443: invokespecial b : ()Z
    //   1446: ifeq -> 1551
    //   1449: goto -> 1456
    //   1452: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1455: athrow
    //   1456: aload_0
    //   1457: lload #9
    //   1459: sipush #28919
    //   1462: ldc2_w 1552844399969725991
    //   1465: lload #4
    //   1467: lxor
    //   1468: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1473: new java/lang/StringBuilder
    //   1476: dup
    //   1477: invokespecial <init> : ()V
    //   1480: sipush #21907
    //   1483: ldc2_w 1436999067492141893
    //   1486: lload #4
    //   1488: lxor
    //   1489: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1497: aload_3
    //   1498: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1501: aload_2
    //   1502: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1505: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   1508: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   1511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1514: sipush #3197
    //   1517: ldc2_w 2353149020551778958
    //   1520: lload #4
    //   1522: lxor
    //   1523: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1531: dload #30
    //   1533: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1536: ldc ')'
    //   1538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1541: invokevirtual toString : ()Ljava/lang/String;
    //   1544: iconst_2
    //   1545: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1548: iconst_1
    //   1549: istore #32
    //   1551: dload #30
    //   1553: dconst_0
    //   1554: dcmpl
    //   1555: ifne -> 1725
    //   1558: aload #25
    //   1560: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   1565: invokevirtual getY : ()D
    //   1568: ldc2_w -1.0
    //   1571: dcmpg
    //   1572: ifge -> 1725
    //   1575: goto -> 1582
    //   1578: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1581: athrow
    //   1582: aload_2
    //   1583: aload_3
    //   1584: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1587: ldc2_w 0.2
    //   1590: dcmpl
    //   1591: ifle -> 1725
    //   1594: goto -> 1601
    //   1597: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1600: athrow
    //   1601: aload_2
    //   1602: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1605: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1610: invokestatic r : (Lorg/bukkit/Material;)Z
    //   1613: ifeq -> 1725
    //   1616: goto -> 1623
    //   1619: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1622: athrow
    //   1623: aload_0
    //   1624: lload #9
    //   1626: sipush #2918
    //   1629: ldc2_w 6324864030283896217
    //   1632: lload #4
    //   1634: lxor
    //   1635: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1640: new java/lang/StringBuilder
    //   1643: dup
    //   1644: invokespecial <init> : ()V
    //   1647: sipush #18102
    //   1650: ldc2_w 5065798053725984848
    //   1653: lload #4
    //   1655: lxor
    //   1656: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1661: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1664: aload_3
    //   1665: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1668: aload_2
    //   1669: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1672: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   1675: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   1678: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1681: sipush #3483
    //   1684: ldc2_w 3127007091097015141
    //   1687: lload #4
    //   1689: lxor
    //   1690: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1695: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1698: dload #30
    //   1700: invokestatic b : (D)D
    //   1703: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1706: ldc ')'
    //   1708: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1711: invokevirtual toString : ()Ljava/lang/String;
    //   1714: iconst_2
    //   1715: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1718: goto -> 1725
    //   1721: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1724: athrow
    //   1725: iload #34
    //   1727: ifeq -> 1831
    //   1730: aload_2
    //   1731: aload_3
    //   1732: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1735: dstore #41
    //   1737: dload #41
    //   1739: ldc2_w 2.0
    //   1742: dcmpl
    //   1743: ifle -> 1831
    //   1746: aload_0
    //   1747: invokespecial b : ()Z
    //   1750: ifeq -> 1831
    //   1753: goto -> 1760
    //   1756: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1759: athrow
    //   1760: aload_0
    //   1761: lload #9
    //   1763: sipush #24326
    //   1766: ldc2_w 5308467840901628369
    //   1769: lload #4
    //   1771: lxor
    //   1772: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1777: new java/lang/StringBuilder
    //   1780: dup
    //   1781: invokespecial <init> : ()V
    //   1784: sipush #2319
    //   1787: ldc2_w 2920127772277970922
    //   1790: lload #4
    //   1792: lxor
    //   1793: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1801: dload #41
    //   1803: invokestatic b : (D)D
    //   1806: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1809: invokevirtual toString : ()Ljava/lang/String;
    //   1812: iconst_3
    //   1813: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1816: iconst_1
    //   1817: istore #32
    //   1819: dload #41
    //   1821: ldc2_w 3.0
    //   1824: dcmpl
    //   1825: ifle -> 1831
    //   1828: iconst_1
    //   1829: istore #33
    //   1831: iload #15
    //   1833: iload #16
    //   1835: i2s
    //   1836: aload #25
    //   1838: iload #17
    //   1840: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   1843: ifne -> 2050
    //   1846: dload #30
    //   1848: dconst_0
    //   1849: dcmpl
    //   1850: ifne -> 2050
    //   1853: goto -> 1860
    //   1856: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1859: athrow
    //   1860: aload_2
    //   1861: invokestatic f : (Lorg/bukkit/Location;)Z
    //   1864: ifeq -> 2050
    //   1867: goto -> 1874
    //   1870: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1873: athrow
    //   1874: aload_2
    //   1875: invokestatic t : (Lorg/bukkit/Location;)Z
    //   1878: ifeq -> 2050
    //   1881: goto -> 1888
    //   1884: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1887: athrow
    //   1888: aload_2
    //   1889: invokestatic j : ()Lorg/bukkit/Material;
    //   1892: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   1895: ifne -> 2050
    //   1898: goto -> 1905
    //   1901: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1904: athrow
    //   1905: aload_0
    //   1906: dup
    //   1907: getfield b : I
    //   1910: iconst_1
    //   1911: iadd
    //   1912: putfield b : I
    //   1915: aload_0
    //   1916: getfield b : I
    //   1919: iconst_2
    //   1920: if_icmple -> 2050
    //   1923: goto -> 1930
    //   1926: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1929: athrow
    //   1930: invokestatic b : ()I
    //   1933: bipush #14
    //   1935: if_icmplt -> 1970
    //   1938: goto -> 1945
    //   1941: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1944: athrow
    //   1945: aload_2
    //   1946: getstatic org/bukkit/Material.SWEET_BERRY_BUSH : Lorg/bukkit/Material;
    //   1949: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   1952: ifeq -> 1970
    //   1955: goto -> 1962
    //   1958: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1961: athrow
    //   1962: iconst_1
    //   1963: goto -> 1971
    //   1966: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1969: athrow
    //   1970: iconst_0
    //   1971: istore #41
    //   1973: iload #41
    //   1975: ifne -> 2050
    //   1978: aload_0
    //   1979: invokespecial b : ()Z
    //   1982: ifeq -> 2050
    //   1985: goto -> 1992
    //   1988: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1991: athrow
    //   1992: aload_0
    //   1993: lload #9
    //   1995: sipush #23487
    //   1998: ldc2_w 4961079370842981709
    //   2001: lload #4
    //   2003: lxor
    //   2004: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2009: new java/lang/StringBuilder
    //   2012: dup
    //   2013: invokespecial <init> : ()V
    //   2016: sipush #28886
    //   2019: ldc2_w 5327486480136334857
    //   2022: lload #4
    //   2024: lxor
    //   2025: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2030: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2033: aload_0
    //   2034: getfield b : I
    //   2037: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2040: invokevirtual toString : ()Ljava/lang/String;
    //   2043: iconst_4
    //   2044: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2047: iconst_1
    //   2048: istore #32
    //   2050: getstatic me/rerere/matrix/internal/pd.w : Z
    //   2053: ifeq -> 2140
    //   2056: sipush #12252
    //   2059: ldc2_w 101480972010729728
    //   2062: lload #4
    //   2064: lxor
    //   2065: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2070: iconst_5
    //   2071: anewarray java/lang/Object
    //   2074: dup
    //   2075: iconst_0
    //   2076: aload #25
    //   2078: invokeinterface getName : ()Ljava/lang/String;
    //   2083: aastore
    //   2084: dup
    //   2085: iconst_1
    //   2086: dload #39
    //   2088: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2091: aastore
    //   2092: dup
    //   2093: iconst_2
    //   2094: dload #30
    //   2096: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2099: aastore
    //   2100: dup
    //   2101: iconst_3
    //   2102: aload #25
    //   2104: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   2109: invokevirtual getY : ()D
    //   2112: invokestatic valueOf : (D)Ljava/lang/Double;
    //   2115: aastore
    //   2116: dup
    //   2117: iconst_4
    //   2118: aload_0
    //   2119: getfield a : I
    //   2122: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2125: aastore
    //   2126: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2129: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   2132: pop
    //   2133: goto -> 2140
    //   2136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2139: athrow
    //   2140: dload #39
    //   2142: dconst_0
    //   2143: dcmpl
    //   2144: iflt -> 3267
    //   2147: lload #28
    //   2149: aload_0
    //   2150: getfield w : J
    //   2153: lsub
    //   2154: ldc2_w 9000
    //   2157: lcmp
    //   2158: ifle -> 3267
    //   2161: goto -> 2168
    //   2164: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2167: athrow
    //   2168: iload #34
    //   2170: ifne -> 3267
    //   2173: goto -> 2180
    //   2176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2179: athrow
    //   2180: lload #28
    //   2182: aload_0
    //   2183: getfield i : J
    //   2186: lsub
    //   2187: ldc2_w 1000
    //   2190: lcmp
    //   2191: ifle -> 3267
    //   2194: goto -> 2201
    //   2197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2200: athrow
    //   2201: lload #28
    //   2203: aload_0
    //   2204: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   2207: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   2210: invokevirtual j : ()J
    //   2213: lsub
    //   2214: ldc2_w 1000
    //   2217: lcmp
    //   2218: iflt -> 3267
    //   2221: goto -> 2228
    //   2224: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2227: athrow
    //   2228: aload #25
    //   2230: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   2233: ifne -> 3267
    //   2236: goto -> 2243
    //   2239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2242: athrow
    //   2243: aload_2
    //   2244: aload_3
    //   2245: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   2248: dstore #41
    //   2250: dload #41
    //   2252: ldc2_w 3.2
    //   2255: dcmpl
    //   2256: ifle -> 2396
    //   2259: aload_0
    //   2260: invokespecial b : ()Z
    //   2263: ifeq -> 2396
    //   2266: goto -> 2273
    //   2269: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2272: athrow
    //   2273: aload_0
    //   2274: lload #9
    //   2276: sipush #12998
    //   2279: ldc2_w 4964472709021477929
    //   2282: lload #4
    //   2284: lxor
    //   2285: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2290: new java/lang/StringBuilder
    //   2293: dup
    //   2294: invokespecial <init> : ()V
    //   2297: sipush #24237
    //   2300: ldc2_w 149816976053125206
    //   2303: lload #4
    //   2305: lxor
    //   2306: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2314: dload #41
    //   2316: invokestatic b : (D)D
    //   2319: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2322: sipush #26977
    //   2325: ldc2_w 5406066480588093333
    //   2328: lload #4
    //   2330: lxor
    //   2331: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2339: aload_0
    //   2340: getfield a : I
    //   2343: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2346: sipush #18784
    //   2349: ldc2_w 5624169814500169650
    //   2352: lload #4
    //   2354: lxor
    //   2355: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2363: dload #30
    //   2365: invokestatic b : (D)D
    //   2368: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2371: ldc ')'
    //   2373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2376: invokevirtual toString : ()Ljava/lang/String;
    //   2379: iconst_2
    //   2380: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2383: iconst_1
    //   2384: istore #32
    //   2386: iconst_1
    //   2387: istore #33
    //   2389: aload_0
    //   2390: invokestatic j : ()J
    //   2393: putfield u : J
    //   2396: dload #30
    //   2398: dconst_0
    //   2399: dcmpg
    //   2400: ifge -> 2834
    //   2403: dload #39
    //   2405: dload #30
    //   2407: dneg
    //   2408: ddiv
    //   2409: dstore #43
    //   2411: dload #43
    //   2413: dconst_0
    //   2414: dcmpl
    //   2415: ifne -> 2441
    //   2418: dload #30
    //   2420: ldc2_w 0.072
    //   2423: dadd
    //   2424: invokestatic abs : (D)D
    //   2427: ldc2_w 0.001
    //   2430: dcmpl
    //   2431: ifgt -> 2457
    //   2434: goto -> 2441
    //   2437: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2440: athrow
    //   2441: dload #43
    //   2443: ldc2_w 0.13
    //   2446: dcmpl
    //   2447: ifle -> 2831
    //   2450: goto -> 2457
    //   2453: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2456: athrow
    //   2457: aload_0
    //   2458: getfield a : I
    //   2461: iconst_5
    //   2462: if_icmple -> 2831
    //   2465: goto -> 2472
    //   2468: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2471: athrow
    //   2472: iconst_0
    //   2473: istore #45
    //   2475: invokestatic b : ()I
    //   2478: bipush #14
    //   2480: if_icmplt -> 2503
    //   2483: aload_2
    //   2484: getstatic org/bukkit/Material.SWEET_BERRY_BUSH : Lorg/bukkit/Material;
    //   2487: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   2490: ifeq -> 2503
    //   2493: goto -> 2500
    //   2496: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2499: athrow
    //   2500: iconst_1
    //   2501: istore #45
    //   2503: iload #45
    //   2505: ifne -> 2556
    //   2508: dload #30
    //   2510: ldc2_w 0.033
    //   2513: dadd
    //   2514: invokestatic abs : (D)D
    //   2517: ldc2_w 0.01
    //   2520: dcmpg
    //   2521: ifgt -> 2556
    //   2524: goto -> 2531
    //   2527: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2530: athrow
    //   2531: aload_3
    //   2532: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2535: invokeinterface getType : ()Lorg/bukkit/Material;
    //   2540: invokestatic s : (Lorg/bukkit/Material;)Z
    //   2543: ifeq -> 2556
    //   2546: goto -> 2553
    //   2549: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2552: athrow
    //   2553: iconst_1
    //   2554: istore #45
    //   2556: iload #45
    //   2558: ifne -> 2612
    //   2561: invokestatic b : ()I
    //   2564: bipush #15
    //   2566: if_icmplt -> 2612
    //   2569: goto -> 2576
    //   2572: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2575: athrow
    //   2576: dload #30
    //   2578: ldc2_w -0.09
    //   2581: dcmpg
    //   2582: ifge -> 2612
    //   2585: goto -> 2592
    //   2588: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2591: athrow
    //   2592: aload_2
    //   2593: getstatic org/bukkit/Material.HONEY_BLOCK : Lorg/bukkit/Material;
    //   2596: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   2599: ifeq -> 2612
    //   2602: goto -> 2609
    //   2605: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2608: athrow
    //   2609: iconst_1
    //   2610: istore #45
    //   2612: iload #45
    //   2614: ifne -> 2831
    //   2617: aload_0
    //   2618: invokespecial b : ()Z
    //   2621: ifeq -> 2831
    //   2624: goto -> 2631
    //   2627: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2630: athrow
    //   2631: aload_0
    //   2632: sipush #12958
    //   2635: ldc2_w 3330907499825441911
    //   2638: lload #4
    //   2640: lxor
    //   2641: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2646: new java/lang/StringBuilder
    //   2649: dup
    //   2650: invokespecial <init> : ()V
    //   2653: sipush #3634
    //   2656: ldc2_w 216329194050031822
    //   2659: lload #4
    //   2661: lxor
    //   2662: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2667: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2670: dload #37
    //   2672: invokestatic b : (D)D
    //   2675: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2678: sipush #6533
    //   2681: ldc2_w 797287208841807709
    //   2684: lload #4
    //   2686: lxor
    //   2687: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2695: dload #39
    //   2697: invokestatic b : (D)D
    //   2700: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2703: sipush #32408
    //   2706: ldc2_w 2264073170523807862
    //   2709: lload #4
    //   2711: lxor
    //   2712: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2717: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2720: dload #30
    //   2722: invokestatic b : (D)D
    //   2725: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2728: sipush #25390
    //   2731: ldc2_w 2400378627669261765
    //   2734: lload #4
    //   2736: lxor
    //   2737: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   2742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2745: dload #43
    //   2747: invokestatic b : (D)D
    //   2750: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2753: invokevirtual toString : ()Ljava/lang/String;
    //   2756: dload #43
    //   2758: dconst_1
    //   2759: dcmpl
    //   2760: ifle -> 2778
    //   2763: goto -> 2770
    //   2766: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2769: athrow
    //   2770: iconst_3
    //   2771: goto -> 2779
    //   2774: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2777: athrow
    //   2778: iconst_1
    //   2779: istore #22
    //   2781: astore #23
    //   2783: astore #24
    //   2785: lload #9
    //   2787: aload #24
    //   2789: aload #23
    //   2791: iload #22
    //   2793: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2796: iconst_1
    //   2797: istore #32
    //   2799: dload #43
    //   2801: dconst_1
    //   2802: dcmpl
    //   2803: ifle -> 2831
    //   2806: invokestatic j : ()J
    //   2809: aload_0
    //   2810: getfield i : J
    //   2813: lsub
    //   2814: ldc2_w 4000
    //   2817: lcmp
    //   2818: iflt -> 2831
    //   2821: goto -> 2828
    //   2824: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2827: athrow
    //   2828: iconst_1
    //   2829: istore #33
    //   2831: goto -> 3267
    //   2834: aload_0
    //   2835: getfield a : I
    //   2838: iconst_4
    //   2839: if_icmpgt -> 2866
    //   2842: aload #25
    //   2844: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   2849: invokevirtual getY : ()D
    //   2852: ldc2_w -0.7
    //   2855: dcmpg
    //   2856: ifge -> 3267
    //   2859: goto -> 2866
    //   2862: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2865: athrow
    //   2866: aload_2
    //   2867: lload #20
    //   2869: invokestatic n : (Lorg/bukkit/Location;J)Z
    //   2872: ifne -> 3267
    //   2875: goto -> 2882
    //   2878: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2881: athrow
    //   2882: aload_2
    //   2883: invokestatic t : (Lorg/bukkit/Location;)Z
    //   2886: ifeq -> 2952
    //   2889: goto -> 2896
    //   2892: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2895: athrow
    //   2896: dload #41
    //   2898: ldc2_w 0.25
    //   2901: dcmpg
    //   2902: ifge -> 2928
    //   2905: goto -> 2912
    //   2908: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2911: athrow
    //   2912: dload #30
    //   2914: ldc2_w 0.421
    //   2917: dcmpl
    //   2918: ifgt -> 2952
    //   2921: goto -> 2928
    //   2924: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2927: athrow
    //   2928: aload #25
    //   2930: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   2935: invokevirtual getY : ()D
    //   2938: ldc2_w -1.0
    //   2941: dcmpg
    //   2942: ifge -> 3267
    //   2945: goto -> 2952
    //   2948: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2951: athrow
    //   2952: aload_2
    //   2953: invokestatic j : ()Lorg/bukkit/Material;
    //   2956: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   2959: ifne -> 3267
    //   2962: goto -> 2969
    //   2965: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2968: athrow
    //   2969: aload_0
    //   2970: invokespecial b : ()Z
    //   2973: ifeq -> 3267
    //   2976: goto -> 2983
    //   2979: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2982: athrow
    //   2983: aload_0
    //   2984: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   2987: invokevirtual b : ()Lme/rerere/matrix/internal/x;
    //   2990: lload #18
    //   2992: aload_2
    //   2993: invokevirtual b : (JLorg/bukkit/Location;)Z
    //   2996: istore #43
    //   2998: aload_0
    //   2999: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   3002: invokevirtual b : ()Lme/rerere/matrix/internal/x;
    //   3005: lload #18
    //   3007: aload_3
    //   3008: invokevirtual b : (JLorg/bukkit/Location;)Z
    //   3011: istore #44
    //   3013: aload_0
    //   3014: sipush #28020
    //   3017: ldc2_w 6113667738794128270
    //   3020: lload #4
    //   3022: lxor
    //   3023: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3028: new java/lang/StringBuilder
    //   3031: dup
    //   3032: invokespecial <init> : ()V
    //   3035: sipush #12921
    //   3038: ldc2_w 7561513533116755092
    //   3041: lload #4
    //   3043: lxor
    //   3044: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3049: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3052: dload #37
    //   3054: invokestatic b : (D)D
    //   3057: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3060: sipush #6533
    //   3063: ldc2_w 797287208841807709
    //   3066: lload #4
    //   3068: lxor
    //   3069: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3074: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3077: dload #39
    //   3079: invokestatic b : (D)D
    //   3082: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3085: sipush #13457
    //   3088: ldc2_w 2793072939756235385
    //   3091: lload #4
    //   3093: lxor
    //   3094: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3099: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3102: dload #30
    //   3104: invokestatic b : (D)D
    //   3107: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3110: sipush #27176
    //   3113: ldc2_w 9078030400770208964
    //   3116: lload #4
    //   3118: lxor
    //   3119: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3127: aload_0
    //   3128: getfield a : I
    //   3131: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3134: sipush #25812
    //   3137: ldc2_w 5648392093326047777
    //   3140: lload #4
    //   3142: lxor
    //   3143: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3151: iconst_2
    //   3152: newarray boolean
    //   3154: dup
    //   3155: iconst_0
    //   3156: iload #43
    //   3158: bastore
    //   3159: dup
    //   3160: iconst_1
    //   3161: iload #44
    //   3163: bastore
    //   3164: invokestatic b : ([Z)Ljava/lang/String;
    //   3167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3170: sipush #7940
    //   3173: ldc2_w 7051356155233141236
    //   3176: lload #4
    //   3178: lxor
    //   3179: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   3184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3187: aload #25
    //   3189: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   3194: invokevirtual getY : ()D
    //   3197: invokestatic b : (D)D
    //   3200: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3203: invokevirtual toString : ()Ljava/lang/String;
    //   3206: aload_0
    //   3207: getfield a : I
    //   3210: iconst_4
    //   3211: if_icmpgt -> 3222
    //   3214: iconst_4
    //   3215: goto -> 3223
    //   3218: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3221: athrow
    //   3222: iconst_2
    //   3223: istore #22
    //   3225: astore #23
    //   3227: astore #24
    //   3229: lload #9
    //   3231: aload #24
    //   3233: aload #23
    //   3235: iload #22
    //   3237: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   3240: iconst_1
    //   3241: istore #32
    //   3243: iconst_1
    //   3244: istore #33
    //   3246: aload_0
    //   3247: getfield a : I
    //   3250: iconst_4
    //   3251: if_icmpgt -> 3267
    //   3254: aload_0
    //   3255: bipush #10
    //   3257: putfield f : I
    //   3260: goto -> 3267
    //   3263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3266: athrow
    //   3267: aload_0
    //   3268: dload #37
    //   3270: putfield l : D
    //   3273: iload #32
    //   3275: ifeq -> 3409
    //   3278: aload_0
    //   3279: lload #11
    //   3281: invokevirtual j : (J)I
    //   3284: istore #34
    //   3286: getstatic me/rerere/matrix/internal/dh.g : I
    //   3289: iconst_m1
    //   3290: if_icmpeq -> 3320
    //   3293: iload #34
    //   3295: getstatic me/rerere/matrix/internal/dh.g : I
    //   3298: if_icmplt -> 3320
    //   3301: goto -> 3308
    //   3304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3307: athrow
    //   3308: aload_1
    //   3309: aload_2
    //   3310: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   3313: goto -> 3320
    //   3316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3319: athrow
    //   3320: getstatic me/rerere/matrix/internal/dh.x : I
    //   3323: iconst_m1
    //   3324: if_icmpeq -> 3357
    //   3327: iload #34
    //   3329: getstatic me/rerere/matrix/internal/dh.x : I
    //   3332: if_icmplt -> 3357
    //   3335: goto -> 3342
    //   3338: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3341: athrow
    //   3342: aload #25
    //   3344: iconst_0
    //   3345: invokeinterface setGliding : (Z)V
    //   3350: goto -> 3357
    //   3353: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3356: athrow
    //   3357: iload #33
    //   3359: ifeq -> 3409
    //   3362: getstatic me/rerere/matrix/internal/dh.k : Z
    //   3365: ifeq -> 3409
    //   3368: goto -> 3375
    //   3371: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3374: athrow
    //   3375: getstatic me/rerere/matrix/internal/dh.g : I
    //   3378: iconst_m1
    //   3379: if_icmpeq -> 3409
    //   3382: goto -> 3389
    //   3385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3388: athrow
    //   3389: aload_1
    //   3390: aload_2
    //   3391: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   3394: aload #25
    //   3396: iconst_0
    //   3397: invokeinterface setGliding : (Z)V
    //   3402: goto -> 3409
    //   3405: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3408: athrow
    //   3409: return
    // Exception table:
    //   from	to	target	type
    //   113	136	136	java/lang/RuntimeException
    //   155	170	173	java/lang/RuntimeException
    //   180	201	204	java/lang/RuntimeException
    //   185	215	218	java/lang/RuntimeException
    //   208	231	234	java/lang/RuntimeException
    //   222	261	264	java/lang/RuntimeException
    //   238	275	278	java/lang/RuntimeException
    //   268	352	355	java/lang/RuntimeException
    //   384	395	398	java/lang/RuntimeException
    //   413	431	431	java/lang/RuntimeException
    //   446	470	473	java/lang/RuntimeException
    //   455	485	485	java/lang/RuntimeException
    //   497	517	520	java/lang/RuntimeException
    //   502	529	532	java/lang/RuntimeException
    //   536	546	549	java/lang/RuntimeException
    //   561	572	575	java/lang/RuntimeException
    //   609	622	625	java/lang/RuntimeException
    //   636	653	656	java/lang/RuntimeException
    //   644	669	672	java/lang/RuntimeException
    //   790	807	810	java/lang/RuntimeException
    //   798	823	826	java/lang/RuntimeException
    //   934	951	954	java/lang/RuntimeException
    //   942	973	976	java/lang/RuntimeException
    //   958	992	995	java/lang/RuntimeException
    //   980	1011	1014	java/lang/RuntimeException
    //   999	1023	1026	java/lang/RuntimeException
    //   1018	1044	1047	java/lang/RuntimeException
    //   1030	1071	1074	java/lang/RuntimeException
    //   1051	1092	1095	java/lang/RuntimeException
    //   1078	1106	1109	java/lang/RuntimeException
    //   1116	1137	1140	java/lang/RuntimeException
    //   1147	1167	1170	java/lang/RuntimeException
    //   1152	1183	1186	java/lang/RuntimeException
    //   1174	1197	1200	java/lang/RuntimeException
    //   1321	1334	1337	java/lang/RuntimeException
    //   1329	1361	1364	java/lang/RuntimeException
    //   1341	1382	1385	java/lang/RuntimeException
    //   1368	1401	1404	java/lang/RuntimeException
    //   1389	1417	1420	java/lang/RuntimeException
    //   1408	1435	1438	java/lang/RuntimeException
    //   1424	1449	1452	java/lang/RuntimeException
    //   1551	1575	1578	java/lang/RuntimeException
    //   1558	1594	1597	java/lang/RuntimeException
    //   1582	1616	1619	java/lang/RuntimeException
    //   1601	1718	1721	java/lang/RuntimeException
    //   1737	1753	1756	java/lang/RuntimeException
    //   1831	1853	1856	java/lang/RuntimeException
    //   1846	1867	1870	java/lang/RuntimeException
    //   1860	1881	1884	java/lang/RuntimeException
    //   1874	1898	1901	java/lang/RuntimeException
    //   1888	1923	1926	java/lang/RuntimeException
    //   1905	1938	1941	java/lang/RuntimeException
    //   1930	1955	1958	java/lang/RuntimeException
    //   1945	1966	1966	java/lang/RuntimeException
    //   1973	1985	1988	java/lang/RuntimeException
    //   2050	2133	2136	java/lang/RuntimeException
    //   2140	2161	2164	java/lang/RuntimeException
    //   2147	2173	2176	java/lang/RuntimeException
    //   2168	2194	2197	java/lang/RuntimeException
    //   2180	2221	2224	java/lang/RuntimeException
    //   2201	2236	2239	java/lang/RuntimeException
    //   2250	2266	2269	java/lang/RuntimeException
    //   2411	2434	2437	java/lang/RuntimeException
    //   2418	2450	2453	java/lang/RuntimeException
    //   2441	2465	2468	java/lang/RuntimeException
    //   2475	2493	2496	java/lang/RuntimeException
    //   2503	2524	2527	java/lang/RuntimeException
    //   2508	2546	2549	java/lang/RuntimeException
    //   2556	2569	2572	java/lang/RuntimeException
    //   2561	2585	2588	java/lang/RuntimeException
    //   2576	2602	2605	java/lang/RuntimeException
    //   2612	2624	2627	java/lang/RuntimeException
    //   2617	2763	2766	java/lang/RuntimeException
    //   2631	2774	2774	java/lang/RuntimeException
    //   2799	2821	2824	java/lang/RuntimeException
    //   2834	2859	2862	java/lang/RuntimeException
    //   2842	2875	2878	java/lang/RuntimeException
    //   2866	2889	2892	java/lang/RuntimeException
    //   2882	2905	2908	java/lang/RuntimeException
    //   2896	2921	2924	java/lang/RuntimeException
    //   2912	2945	2948	java/lang/RuntimeException
    //   2928	2962	2965	java/lang/RuntimeException
    //   2952	2976	2979	java/lang/RuntimeException
    //   3013	3218	3218	java/lang/RuntimeException
    //   3246	3260	3263	java/lang/RuntimeException
    //   3286	3301	3304	java/lang/RuntimeException
    //   3293	3313	3316	java/lang/RuntimeException
    //   3320	3335	3338	java/lang/RuntimeException
    //   3327	3350	3353	java/lang/RuntimeException
    //   3357	3368	3371	java/lang/RuntimeException
    //   3362	3382	3385	java/lang/RuntimeException
    //   3375	3402	3405	java/lang/RuntimeException
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dh.c : J
    //   3: ldc2_w 86222291631068
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #7230
    //   15: ldc2_w 5106303119328552583
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   25: iconst_5
    //   26: invokeinterface getInt : (Ljava/lang/String;I)I
    //   31: putstatic me/rerere/matrix/internal/dh.g : I
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #13455
    //   41: ldc2_w 5661724709225238064
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   51: bipush #20
    //   53: invokeinterface getInt : (Ljava/lang/String;I)I
    //   58: putstatic me/rerere/matrix/internal/dh.x : I
    //   61: aload_0
    //   62: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   65: sipush #16469
    //   68: ldc2_w 8855808042290346706
    //   71: lload_1
    //   72: lxor
    //   73: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   78: iconst_1
    //   79: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   84: putstatic me/rerere/matrix/internal/dh.k : Z
    //   87: return
  }
  
  public static boolean b(@NotNull Player paramPlayer, @NotNull Location paramLocation) {
    World world = paramPlayer.getWorld();
    long l = world.getNearbyEntities(paramLocation, 4.0D, 5.0D, 4.0D).stream().filter(paramEntity -> {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return (paramEntity.getType() == EntityType.FIREWORK);
        }).count();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (l > 0L);
  }
  
  static {
    long l = c ^ 0x16059DF0AF35L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[47];
    boolean bool = false;
    String str;
    int i = (str = "ÉÞc½\007ZVÐã·¸¼\030ema\020ÄQXà]ÛTUX}à¸îè?(ó×\025±Z\tëjÜà°\\Âàêï&Kü\027JRû¶/³¾Ô?Ç®n¿¶~8þkQ¨-7¬k#f\013ú«pôaA\013A­ña9L´¢ÂMÄ®Ð\004Ûp3¾yaH.Í{m´ ¾'~\020vô\"ôç\006Y\b7\027/tá\000P\017Aj³¢VL\007É{ö¹ÂuDE¤t\006é\035\t±ÄA\024Î(Ó\026ê1R\037äM^@^xÂH\037c·kaêy)áÛ¢Ô`_Ä\bF\031$\004µ3ß¥é\fò\002ïg\020K|\020&Õ~\"~IÑ£ôE¯ \035ô'r\blÛ5óï}I¢f\003IËÌIx\\ë@¾ÉE?20S']hÞ^5)i¼p\035Jóµb¡ÓXÃC6ÁSÀéí\001¤úÝ»eìRíðæMê#¥èc\020r\001På<{ó> © AþÍ¡xëk,yÌÆ\bÐîiº\020\037Û\b\017Å(\002½à+Ó¸Goò\020ÿy&4¹\000ÈÜ\032KýóÑ\020pTKt\020\013$êö\n\0236'<\020þUù~a¯)I\024HAPò\020\\\023\b¸áM\030É\nÍ;\004´¢ß\020\";]\004¹f\n\017n\001Ô0h«\030üáQ'\006Å\004\005(C0s\030`U!Á\035,~W\020KG§×Q¹òõ\026Wm¯\020wÀÅÐ°Ô4Éú\f[Ä¬5\0048ÿª\"çÂp¾\"ã>ìU!\rp>\013ªÅqÁony\003ý\037±1\032CðÝ\030Jp¢k\005f³\023kpl/ÆhxtÔ gQ*W°Ë­ñ\\Y4LsD»\"§æ\032:çÌ\013÷\000ì\"åÌ9 \027+=}Ài/i&@%@s®éS;n\007¶9n+7«ZWk ?\001Áöüaà-Ë2Å÷<=)äþ\003\030ñÃìµ°¯Î\031ÿ\020Í\bqJýîâ1ÎÌzE8\001 Å~ÁPô0`2£\023Ì \021\024W\r¡´\002ã~pÈ¯üxBXðUð0¯ÎÚ\006ì8ë`USËf\037d( ÛÍÈÏÍ¡Á­1Ò\rÑÐJ|b¶¸!^\001^äÒ\021\022!õ5¹< ËtFO|¹¢¡SÛñ\013[Á0s¶FÈ?A?¤ë\006Hc@c´W«SÖðñ\037Änoþ±Øã¸M\022P.7É\037\bØ»,ÝÑtxaTSX?\002æú\030NBrGÒ(ûX- )\037nÀ`\034GZA|0\n\000(DY\fæÜöN³rjQëÊ\017±¿\034ÌÊ\n<ö­Ö÷ÕKC;¯ÎäÜ0ËÉµÖâ\020cÛ&!ÍÏ¤g÷x^à\020êÝ¦F\013©@Ù\024aåk éQøâ\000)\002Ã\\É%Ê\022B*\000Á°\017Æ-ÊÙ)]ùÐ81½ZdAçG}\035ÓXI+ÒôÐÝ|[;äw!ô\022¤Ç±'\027\022ìUbË¬\016½Á-L¼ÕÃ®a\031x\006Hó-3Åç©¦Ýú\017¡\005»\016\"\035WþÆû\006\tí=µúÆaj^ÀLÅøE¹°\036ª\003¨÷\005ºÎqüØHµ÷³Løsg\034~¢ ÕóÉØ£@B7|fV\003#pE@çù@>E^4Ï\033ÿ|\002»®FÉj¬úXv|s]/\024S¤Ë8?[ô,_må\r\004²EpËÆðiL\020(2ÏÄV|1×LCîw\036ä@\020ë^Ü^ajQUß¯uÉT»Æ8 »tÎ7\022\bû\031Hý«\031¡<Õ©zÓ\030ø&+h+|Ð&\007\020_©-\"¤üÖÛ*ìÒ_éû| ç1ý|M*uOÏ¿3Y9qMóì\024ñ\fêgÉ|WJ§P¾#³î\f¡üØ/É ÃóTO\tBK¿½¨Ì&m?uþÐ+*?¼c_ï;v:\"2mª5ë~ù\016÷¦e\001üIô¾¼É§Ugn¦s×ÝsYZð~\037 [\020ðÙ@ñOq\0344!puÚVHH(åQîkßÎÌÙÙ­ú\t|\031ÍæÅ:qµ\023¦\026özjÐF½,k\0024\rÙrÖio#\000±\022`9óæQG{ÓY\"\"ôèKüf \001aLv¡cÊ9\n9¾ô¨E¢YJ3\033½µG¸sÔ¨ íT7ïþ­É4:-ß\b\030¿lI­.Ñße]*Ø\b¯ï").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x561;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])h.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          h.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/dh", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/dh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */