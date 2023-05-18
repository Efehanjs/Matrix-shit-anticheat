package me.rerere.matrix.internal;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
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
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class gm {
  private Location x;
  
  private boolean z;
  
  private final Set k = bc.b();
  
  private long v;
  
  private int b = -1;
  
  private final yl i;
  
  private static int a;
  
  private static final long c = o3.a(-6007851721091701554L, -7695104808849357636L, MethodHandles.lookup().lookupClass()).a(268205514680053L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public yl b() {
    return this.i;
  }
  
  public boolean b(@NotNull Location paramLocation, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/gm.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic a : ()I
    //   9: istore #4
    //   11: aload_0
    //   12: getfield k : Ljava/util/Set;
    //   15: invokeinterface size : ()I
    //   20: iload #4
    //   22: ifne -> 42
    //   25: ifne -> 41
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: iconst_0
    //   36: ireturn
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: iconst_0
    //   42: istore #5
    //   44: aload_0
    //   45: getfield b : I
    //   48: iload #4
    //   50: lload_2
    //   51: lconst_0
    //   52: lcmp
    //   53: iflt -> 165
    //   56: ifne -> 163
    //   59: ifle -> 161
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: aload_0
    //   70: getfield k : Ljava/util/Set;
    //   73: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   78: aload_0
    //   79: <illegal opcode> test : (Lme/rerere/matrix/internal/gm;)Ljava/util/function/Predicate;
    //   84: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   89: invokeinterface findFirst : ()Ljava/util/Optional;
    //   94: aconst_null
    //   95: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   98: checkcast me/rerere/matrix/internal/el
    //   101: astore #6
    //   103: aload_0
    //   104: iconst_0
    //   105: putfield b : I
    //   108: aload #6
    //   110: lload_2
    //   111: lconst_0
    //   112: lcmp
    //   113: iflt -> 147
    //   116: iload #4
    //   118: ifne -> 147
    //   121: ifnull -> 145
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload #6
    //   133: iconst_1
    //   134: invokestatic b : (Lme/rerere/matrix/internal/el;Z)Z
    //   137: pop
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: aload #6
    //   147: ifnull -> 158
    //   150: iconst_1
    //   151: goto -> 159
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: iconst_0
    //   159: istore #5
    //   161: iload #5
    //   163: iload #4
    //   165: ifne -> 312
    //   168: ifne -> 295
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: aload_0
    //   179: getfield k : Ljava/util/Set;
    //   182: invokeinterface iterator : ()Ljava/util/Iterator;
    //   187: astore #6
    //   189: aload #6
    //   191: invokeinterface hasNext : ()Z
    //   196: ifeq -> 295
    //   199: aload #6
    //   201: invokeinterface next : ()Ljava/lang/Object;
    //   206: checkcast me/rerere/matrix/internal/el
    //   209: astore #7
    //   211: aload #7
    //   213: invokestatic b : (Lme/rerere/matrix/internal/el;)Lorg/bukkit/util/Vector;
    //   216: aload_1
    //   217: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: iload #4
    //   225: lload_2
    //   226: lconst_0
    //   227: lcmp
    //   228: ifle -> 236
    //   231: ifne -> 312
    //   234: iload #4
    //   236: ifne -> 265
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: ifeq -> 277
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: iconst_1
    //   257: istore #5
    //   259: aload #7
    //   261: iconst_1
    //   262: invokestatic b : (Lme/rerere/matrix/internal/el;Z)Z
    //   265: pop
    //   266: iload #4
    //   268: lload_2
    //   269: lconst_0
    //   270: lcmp
    //   271: ifle -> 309
    //   274: ifeq -> 295
    //   277: iload #4
    //   279: ifeq -> 189
    //   282: lload_2
    //   283: lconst_0
    //   284: lcmp
    //   285: ifle -> 211
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   294: athrow
    //   295: aload_0
    //   296: getfield k : Ljava/util/Set;
    //   299: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   304: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   309: pop
    //   310: iload #5
    //   312: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	28	31	java/lang/RuntimeException
    //   25	37	37	java/lang/RuntimeException
    //   44	62	65	java/lang/RuntimeException
    //   103	124	127	java/lang/RuntimeException
    //   121	138	141	java/lang/RuntimeException
    //   147	154	154	java/lang/RuntimeException
    //   163	171	174	java/lang/RuntimeException
    //   211	239	242	java/lang/RuntimeException
    //   234	249	252	java/lang/RuntimeException
    //   265	282	291	java/lang/RuntimeException
  }
  
  public void b(int paramInt) {
    this.b = paramInt;
  }
  
  public int b() {
    return this.b;
  }
  
  public long b() {
    return this.v;
  }
  
  public boolean b() {
    return this.z;
  }
  
  public void b(@NotNull PacketEvent paramPacketEvent, @NotNull Player paramPlayer, @NotNull PacketContainer paramPacketContainer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/gm.c : J
    //   3: lload #4
    //   5: lxor
    //   6: lstore #4
    //   8: lload #4
    //   10: dup2
    //   11: ldc2_w 35200530378681
    //   14: lxor
    //   15: lstore #6
    //   17: dup2
    //   18: ldc2_w 37816408695260
    //   21: lxor
    //   22: lstore #8
    //   24: dup2
    //   25: ldc2_w 6911382951160
    //   28: lxor
    //   29: lstore #10
    //   31: dup2
    //   32: ldc2_w 138601291296811
    //   35: lxor
    //   36: lstore #12
    //   38: dup2
    //   39: ldc2_w 123581047926428
    //   42: lxor
    //   43: dup2
    //   44: bipush #32
    //   46: lushr
    //   47: l2i
    //   48: istore #14
    //   50: dup2
    //   51: bipush #32
    //   53: lshl
    //   54: bipush #48
    //   56: lushr
    //   57: l2i
    //   58: istore #15
    //   60: dup2
    //   61: bipush #48
    //   63: lshl
    //   64: bipush #48
    //   66: lushr
    //   67: l2i
    //   68: istore #16
    //   70: pop2
    //   71: dup2
    //   72: ldc2_w 100321965634230
    //   75: lxor
    //   76: lstore #17
    //   78: pop2
    //   79: invokestatic a : ()I
    //   82: istore #19
    //   84: aload_3
    //   85: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
    //   88: astore #20
    //   90: aload #20
    //   92: iload #19
    //   94: ifne -> 121
    //   97: lload #17
    //   99: dup2_x1
    //   100: pop2
    //   101: invokestatic b : (JLcom/comphenix/protocol/PacketType;)Z
    //   104: ifeq -> 119
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: return
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: aload #20
    //   121: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
    //   124: iload #19
    //   126: lload #4
    //   128: lconst_0
    //   129: lcmp
    //   130: ifle -> 160
    //   133: ifne -> 158
    //   136: if_acmpeq -> 214
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: aload #20
    //   148: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: iload #19
    //   160: lload #4
    //   162: lconst_0
    //   163: lcmp
    //   164: ifle -> 194
    //   167: ifne -> 192
    //   170: if_acmpeq -> 214
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: aload #20
    //   182: getstatic com/comphenix/protocol/PacketType$Play$Client.VEHICLE_MOVE : Lcom/comphenix/protocol/PacketType;
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: iload #19
    //   194: lload #4
    //   196: lconst_0
    //   197: lcmp
    //   198: ifle -> 255
    //   201: ifne -> 246
    //   204: if_acmpne -> 241
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   213: athrow
    //   214: aload_3
    //   215: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   218: invokestatic j : (Lcom/comphenix/protocol/reflect/StructureModifier;)Z
    //   221: ifne -> 241
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   230: athrow
    //   231: aload_1
    //   232: iconst_1
    //   233: invokevirtual setCancelled : (Z)V
    //   236: return
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: aload #20
    //   243: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   246: lload #4
    //   248: lconst_0
    //   249: lcmp
    //   250: iflt -> 280
    //   253: iload #19
    //   255: ifne -> 280
    //   258: if_acmpeq -> 283
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: aload #20
    //   270: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   279: athrow
    //   280: if_acmpne -> 317
    //   283: lload #4
    //   285: lconst_0
    //   286: lcmp
    //   287: iflt -> 317
    //   290: aload_3
    //   291: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   294: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Z
    //   297: ifne -> 317
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   306: athrow
    //   307: aload_1
    //   308: iconst_1
    //   309: invokevirtual setCancelled : (Z)V
    //   312: return
    //   313: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   316: athrow
    //   317: aload_0
    //   318: getfield x : Lorg/bukkit/Location;
    //   321: iload #19
    //   323: ifne -> 388
    //   326: ifnull -> 357
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload_0
    //   337: getfield x : Lorg/bukkit/Location;
    //   340: invokevirtual clone : ()Lorg/bukkit/Location;
    //   343: astore #21
    //   345: lload #4
    //   347: lconst_0
    //   348: lcmp
    //   349: iflt -> 390
    //   352: iload #19
    //   354: ifeq -> 390
    //   357: new org/bukkit/Location
    //   360: dup
    //   361: aload_2
    //   362: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   367: ldc2_w -1.0
    //   370: ldc2_w -1.0
    //   373: ldc2_w -1.0
    //   376: fconst_0
    //   377: fconst_0
    //   378: invokespecial <init> : (Lorg/bukkit/World;DDDFF)V
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   387: athrow
    //   388: astore #21
    //   390: aload #20
    //   392: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
    //   395: iload #19
    //   397: lload #4
    //   399: lconst_0
    //   400: lcmp
    //   401: iflt -> 431
    //   404: ifne -> 429
    //   407: if_acmpeq -> 485
    //   410: goto -> 417
    //   413: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   416: athrow
    //   417: aload #20
    //   419: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   422: goto -> 429
    //   425: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   428: athrow
    //   429: iload #19
    //   431: lload #4
    //   433: lconst_0
    //   434: lcmp
    //   435: iflt -> 472
    //   438: ifne -> 463
    //   441: if_acmpeq -> 485
    //   444: goto -> 451
    //   447: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   450: athrow
    //   451: aload #20
    //   453: getstatic com/comphenix/protocol/PacketType$Play$Client.VEHICLE_MOVE : Lcom/comphenix/protocol/PacketType;
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   462: athrow
    //   463: lload #4
    //   465: lconst_0
    //   466: lcmp
    //   467: ifle -> 618
    //   470: iload #19
    //   472: ifne -> 618
    //   475: if_acmpne -> 601
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   484: athrow
    //   485: aload_3
    //   486: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   489: astore #22
    //   491: aload #22
    //   493: iconst_0
    //   494: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   497: checkcast java/lang/Double
    //   500: invokevirtual doubleValue : ()D
    //   503: dstore #23
    //   505: aload #22
    //   507: iconst_1
    //   508: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   511: checkcast java/lang/Double
    //   514: invokevirtual doubleValue : ()D
    //   517: dstore #25
    //   519: aload #22
    //   521: iconst_2
    //   522: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   525: checkcast java/lang/Double
    //   528: invokevirtual doubleValue : ()D
    //   531: dstore #27
    //   533: aload #21
    //   535: dload #23
    //   537: invokevirtual setX : (D)V
    //   540: aload #21
    //   542: dload #25
    //   544: invokevirtual setY : (D)V
    //   547: aload #21
    //   549: dload #27
    //   551: invokevirtual setZ : (D)V
    //   554: lload #4
    //   556: lconst_0
    //   557: lcmp
    //   558: iflt -> 600
    //   561: aload_0
    //   562: aload #21
    //   564: iload #19
    //   566: ifne -> 597
    //   569: lload #12
    //   571: invokevirtual b : (Lorg/bukkit/Location;J)Z
    //   574: ifeq -> 601
    //   577: goto -> 584
    //   580: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   583: athrow
    //   584: aload_0
    //   585: aload #21
    //   587: invokevirtual clone : ()Lorg/bukkit/Location;
    //   590: goto -> 597
    //   593: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   596: athrow
    //   597: putfield x : Lorg/bukkit/Location;
    //   600: return
    //   601: aload #20
    //   603: iload #19
    //   605: ifne -> 663
    //   608: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   617: athrow
    //   618: if_acmpeq -> 648
    //   621: aload #20
    //   623: iload #19
    //   625: ifne -> 663
    //   628: goto -> 635
    //   631: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   634: athrow
    //   635: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   638: if_acmpne -> 701
    //   641: goto -> 648
    //   644: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   647: athrow
    //   648: aload_3
    //   649: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   652: iconst_0
    //   653: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   662: athrow
    //   663: checkcast java/lang/Float
    //   666: invokevirtual floatValue : ()F
    //   669: fstore #22
    //   671: aload_3
    //   672: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   675: iconst_1
    //   676: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   679: checkcast java/lang/Float
    //   682: invokevirtual floatValue : ()F
    //   685: fstore #23
    //   687: aload #21
    //   689: fload #22
    //   691: invokevirtual setYaw : (F)V
    //   694: aload #21
    //   696: fload #23
    //   698: invokevirtual setPitch : (F)V
    //   701: iconst_1
    //   702: istore #22
    //   704: aload #20
    //   706: iload #19
    //   708: ifne -> 739
    //   711: getstatic com/comphenix/protocol/PacketType$Play$Client.VEHICLE_MOVE : Lcom/comphenix/protocol/PacketType;
    //   714: if_acmpeq -> 747
    //   717: goto -> 724
    //   720: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   723: athrow
    //   724: aload_3
    //   725: invokevirtual getBooleans : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   728: iconst_0
    //   729: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   732: goto -> 739
    //   735: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   738: athrow
    //   739: checkcast java/lang/Boolean
    //   742: invokevirtual booleanValue : ()Z
    //   745: istore #22
    //   747: aload_0
    //   748: getfield x : Lorg/bukkit/Location;
    //   751: ifnull -> 969
    //   754: new org/bukkit/event/player/PlayerMoveEvent
    //   757: dup
    //   758: aload_2
    //   759: aload_0
    //   760: getfield x : Lorg/bukkit/Location;
    //   763: aload #21
    //   765: invokespecial <init> : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;Lorg/bukkit/Location;)V
    //   768: astore #23
    //   770: aload_0
    //   771: getfield i : Lme/rerere/matrix/internal/yl;
    //   774: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   777: invokevirtual b : ()Ljava/util/List;
    //   780: invokeinterface iterator : ()Ljava/util/Iterator;
    //   785: astore #24
    //   787: aload #24
    //   789: invokeinterface hasNext : ()Z
    //   794: ifeq -> 969
    //   797: aload #24
    //   799: invokeinterface next : ()Ljava/lang/Object;
    //   804: checkcast me/rerere/matrix/internal/zk
    //   807: astore #25
    //   809: aload #25
    //   811: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   814: lload #8
    //   816: invokevirtual b : (J)Z
    //   819: iload #19
    //   821: lload #4
    //   823: lconst_0
    //   824: lcmp
    //   825: iflt -> 833
    //   828: ifne -> 1013
    //   831: iload #19
    //   833: lload #4
    //   835: lconst_0
    //   836: lcmp
    //   837: ifle -> 890
    //   840: ifne -> 888
    //   843: goto -> 850
    //   846: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   849: athrow
    //   850: lload #4
    //   852: lconst_0
    //   853: lcmp
    //   854: ifle -> 966
    //   857: ifeq -> 964
    //   860: goto -> 867
    //   863: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   866: athrow
    //   867: aload_0
    //   868: getfield i : Lme/rerere/matrix/internal/yl;
    //   871: iload #14
    //   873: iload #15
    //   875: i2s
    //   876: iload #16
    //   878: invokevirtual t : (ISI)Z
    //   881: goto -> 888
    //   884: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   887: athrow
    //   888: iload #19
    //   890: ifne -> 940
    //   893: ifne -> 964
    //   896: goto -> 903
    //   899: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   902: athrow
    //   903: aload #25
    //   905: iload #19
    //   907: ifne -> 945
    //   910: goto -> 917
    //   913: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   916: athrow
    //   917: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   920: aload_2
    //   921: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   926: lload #10
    //   928: dup2_x1
    //   929: pop2
    //   930: invokevirtual b : (JLorg/bukkit/World;)Z
    //   933: goto -> 940
    //   936: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   939: athrow
    //   940: ifeq -> 964
    //   943: aload #25
    //   945: aload #23
    //   947: aload_0
    //   948: getfield x : Lorg/bukkit/Location;
    //   951: lload #6
    //   953: aload #21
    //   955: aload_0
    //   956: getfield z : Z
    //   959: iload #22
    //   961: invokevirtual b : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;JLorg/bukkit/Location;ZZ)V
    //   964: iload #19
    //   966: ifeq -> 787
    //   969: lload #4
    //   971: lconst_0
    //   972: lcmp
    //   973: ifle -> 1230
    //   976: getstatic me/rerere/matrix/internal/pd.i : Ljava/lang/String;
    //   979: iload #19
    //   981: ifne -> 1007
    //   984: ifnull -> 1221
    //   987: goto -> 994
    //   990: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   993: athrow
    //   994: aload_2
    //   995: invokeinterface getName : ()Ljava/lang/String;
    //   1000: goto -> 1007
    //   1003: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1006: athrow
    //   1007: getstatic me/rerere/matrix/internal/pd.i : Ljava/lang/String;
    //   1010: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1013: ifeq -> 1221
    //   1016: invokestatic j : ()J
    //   1019: aload_0
    //   1020: getfield v : J
    //   1023: lsub
    //   1024: lstore #23
    //   1026: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   1029: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1034: astore #25
    //   1036: aload #25
    //   1038: invokeinterface hasNext : ()Z
    //   1043: ifeq -> 1207
    //   1046: aload #25
    //   1048: invokeinterface next : ()Ljava/lang/Object;
    //   1053: checkcast org/bukkit/entity/Player
    //   1056: astore #26
    //   1058: iload #19
    //   1060: ifne -> 1236
    //   1063: aload #26
    //   1065: iload #19
    //   1067: ifne -> 1108
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1076: athrow
    //   1077: invokeinterface isOp : ()Z
    //   1082: lload #4
    //   1084: lconst_0
    //   1085: lcmp
    //   1086: ifle -> 1204
    //   1089: ifeq -> 1202
    //   1092: goto -> 1099
    //   1095: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1098: athrow
    //   1099: aload #26
    //   1101: goto -> 1108
    //   1104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1107: athrow
    //   1108: new java/lang/StringBuilder
    //   1111: dup
    //   1112: invokespecial <init> : ()V
    //   1115: sipush #14454
    //   1118: ldc2_w 2085914863906215311
    //   1121: lload #4
    //   1123: lxor
    //   1124: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   1129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1132: aload_2
    //   1133: invokeinterface getName : ()Ljava/lang/String;
    //   1138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1141: sipush #31137
    //   1144: ldc2_w 362217702167680090
    //   1147: lload #4
    //   1149: lxor
    //   1150: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   1155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1158: lload #23
    //   1160: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1163: sipush #4382
    //   1166: ldc2_w 2207778882975005926
    //   1169: lload #4
    //   1171: lxor
    //   1172: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   1177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1180: aload #20
    //   1182: invokevirtual name : ()Ljava/lang/String;
    //   1185: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   1188: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   1191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1194: invokevirtual toString : ()Ljava/lang/String;
    //   1197: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1202: iload #19
    //   1204: ifeq -> 1036
    //   1207: aload_0
    //   1208: lload #4
    //   1210: lconst_0
    //   1211: lcmp
    //   1212: ifle -> 1053
    //   1215: invokestatic j : ()J
    //   1218: putfield v : J
    //   1221: aload_0
    //   1222: aload #21
    //   1224: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1227: putfield x : Lorg/bukkit/Location;
    //   1230: aload_0
    //   1231: iload #22
    //   1233: putfield z : Z
    //   1236: return
    // Exception table:
    //   from	to	target	type
    //   90	107	110	java/lang/RuntimeException
    //   97	115	115	java/lang/RuntimeException
    //   121	139	142	java/lang/RuntimeException
    //   136	151	154	java/lang/RuntimeException
    //   158	173	176	java/lang/RuntimeException
    //   170	185	188	java/lang/RuntimeException
    //   192	207	210	java/lang/RuntimeException
    //   204	224	227	java/lang/RuntimeException
    //   214	237	237	java/lang/RuntimeException
    //   246	261	264	java/lang/RuntimeException
    //   258	273	276	java/lang/RuntimeException
    //   280	300	303	java/lang/RuntimeException
    //   283	313	313	java/lang/RuntimeException
    //   317	329	332	java/lang/RuntimeException
    //   345	381	384	java/lang/RuntimeException
    //   390	410	413	java/lang/RuntimeException
    //   407	422	425	java/lang/RuntimeException
    //   429	444	447	java/lang/RuntimeException
    //   441	456	459	java/lang/RuntimeException
    //   463	478	481	java/lang/RuntimeException
    //   533	577	580	java/lang/RuntimeException
    //   569	590	593	java/lang/RuntimeException
    //   601	611	614	java/lang/RuntimeException
    //   618	628	631	java/lang/RuntimeException
    //   621	641	644	java/lang/RuntimeException
    //   635	656	659	java/lang/RuntimeException
    //   704	717	720	java/lang/RuntimeException
    //   711	732	735	java/lang/RuntimeException
    //   809	843	846	java/lang/RuntimeException
    //   831	860	863	java/lang/RuntimeException
    //   850	881	884	java/lang/RuntimeException
    //   888	896	899	java/lang/RuntimeException
    //   893	910	913	java/lang/RuntimeException
    //   903	933	936	java/lang/RuntimeException
    //   969	987	990	java/lang/RuntimeException
    //   984	1000	1003	java/lang/RuntimeException
    //   1058	1070	1073	java/lang/RuntimeException
    //   1063	1092	1095	java/lang/RuntimeException
    //   1077	1101	1104	java/lang/RuntimeException
  }
  
  public void b(@NotNull Location paramLocation, int paramInt, long paramLong) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x7C3C06535DE5L;
    this.k.add(new el(l, paramLocation.toVector(), paramInt));
  }
  
  public gm(yl paramyl) {
    this.i = paramyl;
  }
  
  public void j(char paramChar, short paramShort, int paramInt, @NotNull Location paramLocation) {
    long l1 = (paramChar << 48L | paramShort << 48L >>> 16L | paramInt << 32L >>> 32L) ^ c;
    long l2 = l1 ^ 0x1EBDF92E57FAL;
    this.k.add(new el(l2, paramLocation.toVector(), -1));
  }
  
  public Location b() {
    return this.x;
  }
  
  public void b(Location paramLocation) {
    this.x = paramLocation;
  }
  
  public Set b() {
    return this.k;
  }
  
  public static void k(int paramInt) {
    a = paramInt;
  }
  
  public static int h() {
    return a;
  }
  
  public static int u() {
    int i = h();
    try {
      if (i == 0)
        return 74; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    k(0);
    long l = c ^ 0x22ECD2CB3498L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "Ày\007ßC½gòX¥\026ô:Ê\rfCéqP á\017?ó0¢Cß@<ïÄ®Ë·SßúH'0\037³aP5¡úp óùLÓQ3ÓÃëÄñà«Ä¯¢\t¥~G@Dô[Tè").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1EFD;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/gm", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/gm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\gm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */