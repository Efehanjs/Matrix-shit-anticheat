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
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public final class nm extends zk {
  private long l;
  
  private double r;
  
  private int x;
  
  private double z;
  
  @NotNull
  private final ob k = new ob(20);
  
  private float v;
  
  private float b;
  
  private double i;
  
  private static final long a = o3.a(-9007593739077690281L, -2656402222401136872L, MethodHandles.lookup().lookupClass()).a(222049645626716L);
  
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
    //   29: ldc2_w 83547578593017
    //   32: lxor
    //   33: lstore #7
    //   35: dup2
    //   36: ldc2_w 106493274303074
    //   39: lxor
    //   40: lstore #9
    //   42: pop2
    //   43: aload_0
    //   44: lload #9
    //   46: invokespecial h : (J)V
    //   49: aload_0
    //   50: getfield k : Lme/rerere/matrix/internal/ob;
    //   53: lload #7
    //   55: invokevirtual b : (J)Z
    //   58: ifeq -> 315
    //   61: aload_3
    //   62: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   65: dup
    //   66: ifnull -> 313
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: astore #12
    //   78: iconst_0
    //   79: istore #13
    //   81: aload_0
    //   82: getfield k : Lme/rerere/matrix/internal/ob;
    //   85: checkcast java/lang/Iterable
    //   88: astore #14
    //   90: iconst_0
    //   91: istore #15
    //   93: aload #14
    //   95: astore #16
    //   97: new java/util/ArrayList
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: checkcast java/util/Collection
    //   107: astore #17
    //   109: iconst_0
    //   110: istore #18
    //   112: aload #16
    //   114: invokeinterface iterator : ()Ljava/util/Iterator;
    //   119: astore #19
    //   121: aload #19
    //   123: invokeinterface hasNext : ()Z
    //   128: ifeq -> 264
    //   131: aload #19
    //   133: invokeinterface next : ()Ljava/lang/Object;
    //   138: astore #20
    //   140: aload #20
    //   142: checkcast me/rerere/matrix/internal/if
    //   145: astore #21
    //   147: iconst_0
    //   148: istore #22
    //   150: aload #21
    //   152: invokevirtual b : ()Lme/rerere/matrix/internal/xh;
    //   155: ifnonnull -> 247
    //   158: aload #21
    //   160: invokevirtual j : ()I
    //   163: aload #12
    //   165: invokeinterface getX : ()I
    //   170: if_icmpne -> 247
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: aload #21
    //   182: invokevirtual m : ()I
    //   185: aload #12
    //   187: invokeinterface getY : ()I
    //   192: if_icmpne -> 247
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload #21
    //   204: invokevirtual b : ()I
    //   207: aload #12
    //   209: invokeinterface getZ : ()I
    //   214: if_icmpne -> 247
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: aload #21
    //   226: invokevirtual b : ()Z
    //   229: ifne -> 247
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: iconst_1
    //   240: goto -> 248
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: iconst_0
    //   248: ifeq -> 121
    //   251: aload #17
    //   253: aload #20
    //   255: invokeinterface add : (Ljava/lang/Object;)Z
    //   260: pop
    //   261: goto -> 121
    //   264: aload #17
    //   266: checkcast java/util/List
    //   269: nop
    //   270: astore #23
    //   272: aload #23
    //   274: checkcast java/util/Collection
    //   277: invokeinterface isEmpty : ()Z
    //   282: ifne -> 293
    //   285: iconst_1
    //   286: goto -> 294
    //   289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   292: athrow
    //   293: iconst_0
    //   294: ifeq -> 309
    //   297: aload_3
    //   298: iconst_1
    //   299: invokevirtual setCancelled : (Z)V
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: nop
    //   310: goto -> 315
    //   313: pop
    //   314: nop
    //   315: aload_3
    //   316: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   319: ifnull -> 356
    //   322: aload_0
    //   323: getfield x : I
    //   326: ifle -> 356
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload_0
    //   337: getfield x : I
    //   340: istore #11
    //   342: aload_0
    //   343: iload #11
    //   345: iconst_m1
    //   346: iadd
    //   347: putfield x : I
    //   350: aload_3
    //   351: iconst_1
    //   352: invokevirtual setCancelled : (Z)V
    //   355: return
    //   356: return
    // Exception table:
    //   from	to	target	type
    //   43	69	72	java/lang/RuntimeException
    //   150	173	176	java/lang/RuntimeException
    //   158	195	198	java/lang/RuntimeException
    //   180	217	220	java/lang/RuntimeException
    //   202	232	235	java/lang/RuntimeException
    //   224	243	243	java/lang/RuntimeException
    //   272	289	289	java/lang/RuntimeException
    //   294	302	305	java/lang/RuntimeException
    //   315	329	332	java/lang/RuntimeException
  }
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    if (this.x > 0) {
      int i = this.x;
      this.x = i + -1;
      paramBlockPlaceEvent.setCancelled(true);
      return;
    } 
  }
  
  public nm(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.k);
  }
  
  public void b(short paramShort, int paramInt1, int paramInt2, @NotNull BlockBreakEvent paramBlockBreakEvent) {
    if (this.x > 0) {
      int i = this.x;
      this.x = i + -1;
      paramBlockBreakEvent.setCancelled(true);
      return;
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : I
    //   4: bipush #8
    //   6: if_icmple -> 22
    //   9: aload_0
    //   10: bipush #8
    //   12: putfield x : I
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   21: athrow
    //   22: aload_0
    //   23: getfield k : Lme/rerere/matrix/internal/ob;
    //   26: invokevirtual j : ()Z
    //   29: ifeq -> 37
    //   32: return
    //   33: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   36: athrow
    //   37: aload_0
    //   38: getfield k : Lme/rerere/matrix/internal/ob;
    //   41: checkcast java/lang/Iterable
    //   44: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
    //   47: checkcast java/lang/Iterable
    //   50: astore_3
    //   51: nop
    //   52: iconst_0
    //   53: istore #4
    //   55: aload_3
    //   56: astore #5
    //   58: new java/util/ArrayList
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: checkcast java/util/Collection
    //   68: astore #6
    //   70: iconst_0
    //   71: istore #7
    //   73: aload #5
    //   75: invokeinterface iterator : ()Ljava/util/Iterator;
    //   80: astore #8
    //   82: aload #8
    //   84: invokeinterface hasNext : ()Z
    //   89: ifeq -> 144
    //   92: aload #8
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: astore #9
    //   101: aload #9
    //   103: checkcast me/rerere/matrix/internal/if
    //   106: astore #10
    //   108: iconst_0
    //   109: istore #11
    //   111: aload #10
    //   113: invokevirtual b : ()Lme/rerere/matrix/internal/xh;
    //   116: ifnonnull -> 127
    //   119: iconst_1
    //   120: goto -> 128
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iconst_0
    //   128: ifeq -> 82
    //   131: aload #6
    //   133: aload #9
    //   135: invokeinterface add : (Ljava/lang/Object;)Z
    //   140: pop
    //   141: goto -> 82
    //   144: aload #6
    //   146: checkcast java/util/List
    //   149: nop
    //   150: checkcast java/lang/Iterable
    //   153: astore_3
    //   154: nop
    //   155: iconst_0
    //   156: istore #4
    //   158: aload_3
    //   159: invokeinterface iterator : ()Ljava/util/Iterator;
    //   164: astore #5
    //   166: aload #5
    //   168: invokeinterface hasNext : ()Z
    //   173: ifeq -> 250
    //   176: aload #5
    //   178: invokeinterface next : ()Ljava/lang/Object;
    //   183: astore #6
    //   185: aload #6
    //   187: checkcast me/rerere/matrix/internal/if
    //   190: astore #7
    //   192: iconst_0
    //   193: istore #8
    //   195: aload #7
    //   197: invokevirtual p : ()I
    //   200: istore #9
    //   202: aload #7
    //   204: iload #9
    //   206: iconst_1
    //   207: iadd
    //   208: invokevirtual b : (I)V
    //   211: aload #7
    //   213: invokevirtual p : ()I
    //   216: bipush #6
    //   218: if_icmple -> 245
    //   221: aload #7
    //   223: aload #7
    //   225: invokevirtual j : ()Lme/rerere/matrix/internal/xh;
    //   228: invokevirtual b : (Lme/rerere/matrix/internal/xh;)V
    //   231: aload_0
    //   232: getfield x : I
    //   235: istore #9
    //   237: aload_0
    //   238: iload #9
    //   240: iconst_1
    //   241: iadd
    //   242: putfield x : I
    //   245: nop
    //   246: nop
    //   247: goto -> 166
    //   250: nop
    //   251: return
    // Exception table:
    //   from	to	target	type
    //   0	15	18	java/lang/RuntimeException
    //   22	33	33	java/lang/RuntimeException
    //   111	123	123	java/lang/RuntimeException
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25693249853437
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 56366502506470
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 22032165234896
    //   19: lxor
    //   20: lstore #9
    //   22: dup2
    //   23: ldc2_w 79238690796922
    //   26: lxor
    //   27: lstore #11
    //   29: dup2
    //   30: ldc2_w 136387791455483
    //   33: lxor
    //   34: lstore #13
    //   36: dup2
    //   37: ldc2_w 40507544756790
    //   40: lxor
    //   41: lstore #15
    //   43: pop2
    //   44: aload_0
    //   45: lload #13
    //   47: invokespecial b : (J)Z
    //   50: ifne -> 59
    //   53: iconst_0
    //   54: ireturn
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: aload_1
    //   60: lload #11
    //   62: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   65: ifeq -> 813
    //   68: invokestatic b : ()I
    //   71: istore #22
    //   73: bipush #8
    //   75: iload #22
    //   77: if_icmpgt -> 106
    //   80: iload #22
    //   82: bipush #14
    //   84: if_icmpge -> 102
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 107
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: iconst_0
    //   103: goto -> 107
    //   106: iconst_0
    //   107: ifeq -> 129
    //   110: aload #4
    //   112: invokevirtual getBlockPositionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   115: iconst_0
    //   116: invokevirtual read : (I)Ljava/lang/Object;
    //   119: checkcast com/comphenix/protocol/wrappers/BlockPosition
    //   122: goto -> 144
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: aload #4
    //   131: invokevirtual getMovingBlockPositions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   134: iconst_0
    //   135: invokevirtual read : (I)Ljava/lang/Object;
    //   138: checkcast com/comphenix/protocol/wrappers/MovingObjectPositionBlock
    //   141: invokevirtual getBlockPosition : ()Lcom/comphenix/protocol/wrappers/BlockPosition;
    //   144: astore #21
    //   146: invokestatic b : ()I
    //   149: istore #23
    //   151: iload #23
    //   153: bipush #8
    //   155: if_icmpne -> 377
    //   158: aload #4
    //   160: iconst_0
    //   161: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)Ljava/lang/Integer;
    //   164: astore #24
    //   166: aload #24
    //   168: dup
    //   169: ifnonnull -> 180
    //   172: pop
    //   173: goto -> 196
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: invokevirtual intValue : ()I
    //   183: ifne -> 196
    //   186: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   189: goto -> 655
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: aload #24
    //   198: iconst_1
    //   199: istore #25
    //   201: dup
    //   202: ifnonnull -> 213
    //   205: pop
    //   206: goto -> 231
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: invokevirtual intValue : ()I
    //   216: iload #25
    //   218: if_icmpne -> 231
    //   221: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   224: goto -> 655
    //   227: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   230: athrow
    //   231: aload #24
    //   233: iconst_2
    //   234: istore #25
    //   236: dup
    //   237: ifnonnull -> 248
    //   240: pop
    //   241: goto -> 266
    //   244: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   247: athrow
    //   248: invokevirtual intValue : ()I
    //   251: iload #25
    //   253: if_icmpne -> 266
    //   256: getstatic org/bukkit/block/BlockFace.NORTH : Lorg/bukkit/block/BlockFace;
    //   259: goto -> 655
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: aload #24
    //   268: iconst_3
    //   269: istore #25
    //   271: dup
    //   272: ifnonnull -> 283
    //   275: pop
    //   276: goto -> 301
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: invokevirtual intValue : ()I
    //   286: iload #25
    //   288: if_icmpne -> 301
    //   291: getstatic org/bukkit/block/BlockFace.SOUTH : Lorg/bukkit/block/BlockFace;
    //   294: goto -> 655
    //   297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   300: athrow
    //   301: aload #24
    //   303: iconst_4
    //   304: istore #25
    //   306: dup
    //   307: ifnonnull -> 318
    //   310: pop
    //   311: goto -> 336
    //   314: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   317: athrow
    //   318: invokevirtual intValue : ()I
    //   321: iload #25
    //   323: if_icmpne -> 336
    //   326: getstatic org/bukkit/block/BlockFace.WEST : Lorg/bukkit/block/BlockFace;
    //   329: goto -> 655
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload #24
    //   338: iconst_5
    //   339: istore #25
    //   341: dup
    //   342: ifnonnull -> 353
    //   345: pop
    //   346: goto -> 371
    //   349: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   352: athrow
    //   353: invokevirtual intValue : ()I
    //   356: iload #25
    //   358: if_icmpne -> 371
    //   361: getstatic org/bukkit/block/BlockFace.EAST : Lorg/bukkit/block/BlockFace;
    //   364: goto -> 655
    //   367: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   370: athrow
    //   371: getstatic org/bukkit/block/BlockFace.SELF : Lorg/bukkit/block/BlockFace;
    //   374: goto -> 655
    //   377: bipush #12
    //   379: iload #23
    //   381: if_icmpgt -> 410
    //   384: iload #23
    //   386: bipush #14
    //   388: if_icmpge -> 406
    //   391: goto -> 398
    //   394: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   397: athrow
    //   398: iconst_1
    //   399: goto -> 411
    //   402: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   405: athrow
    //   406: iconst_0
    //   407: goto -> 411
    //   410: iconst_0
    //   411: ifeq -> 538
    //   414: aload #4
    //   416: invokevirtual getDirections : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   419: iconst_0
    //   420: invokevirtual read : (I)Ljava/lang/Object;
    //   423: checkcast com/comphenix/protocol/wrappers/EnumWrappers$Direction
    //   426: dup
    //   427: ifnonnull -> 446
    //   430: goto -> 437
    //   433: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   436: athrow
    //   437: pop
    //   438: iconst_m1
    //   439: goto -> 454
    //   442: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   445: athrow
    //   446: getstatic me/rerere/matrix/internal/nn.i : [I
    //   449: swap
    //   450: invokevirtual ordinal : ()I
    //   453: iaload
    //   454: tableswitch default -> 532, 1 -> 492, 2 -> 502, 3 -> 508, 4 -> 514, 5 -> 520, 6 -> 526
    //   492: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   495: goto -> 655
    //   498: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   501: athrow
    //   502: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   505: goto -> 655
    //   508: getstatic org/bukkit/block/BlockFace.NORTH : Lorg/bukkit/block/BlockFace;
    //   511: goto -> 655
    //   514: getstatic org/bukkit/block/BlockFace.SOUTH : Lorg/bukkit/block/BlockFace;
    //   517: goto -> 655
    //   520: getstatic org/bukkit/block/BlockFace.EAST : Lorg/bukkit/block/BlockFace;
    //   523: goto -> 655
    //   526: getstatic org/bukkit/block/BlockFace.WEST : Lorg/bukkit/block/BlockFace;
    //   529: goto -> 655
    //   532: getstatic org/bukkit/block/BlockFace.SELF : Lorg/bukkit/block/BlockFace;
    //   535: goto -> 655
    //   538: aload #4
    //   540: invokevirtual getMovingBlockPositions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   543: iconst_0
    //   544: invokevirtual read : (I)Ljava/lang/Object;
    //   547: checkcast com/comphenix/protocol/wrappers/MovingObjectPositionBlock
    //   550: invokevirtual getDirection : ()Lcom/comphenix/protocol/wrappers/EnumWrappers$Direction;
    //   553: dup
    //   554: ifnonnull -> 566
    //   557: pop
    //   558: iconst_m1
    //   559: goto -> 574
    //   562: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   565: athrow
    //   566: getstatic me/rerere/matrix/internal/nn.i : [I
    //   569: swap
    //   570: invokevirtual ordinal : ()I
    //   573: iaload
    //   574: tableswitch default -> 652, 1 -> 612, 2 -> 622, 3 -> 628, 4 -> 634, 5 -> 640, 6 -> 646
    //   612: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   615: goto -> 655
    //   618: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   621: athrow
    //   622: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   625: goto -> 655
    //   628: getstatic org/bukkit/block/BlockFace.NORTH : Lorg/bukkit/block/BlockFace;
    //   631: goto -> 655
    //   634: getstatic org/bukkit/block/BlockFace.SOUTH : Lorg/bukkit/block/BlockFace;
    //   637: goto -> 655
    //   640: getstatic org/bukkit/block/BlockFace.EAST : Lorg/bukkit/block/BlockFace;
    //   643: goto -> 655
    //   646: getstatic org/bukkit/block/BlockFace.WEST : Lorg/bukkit/block/BlockFace;
    //   649: goto -> 655
    //   652: getstatic org/bukkit/block/BlockFace.SELF : Lorg/bukkit/block/BlockFace;
    //   655: astore #22
    //   657: aload #21
    //   659: invokevirtual getX : ()I
    //   662: iconst_m1
    //   663: if_icmpeq -> 1473
    //   666: aload #21
    //   668: invokevirtual getY : ()I
    //   671: iconst_m1
    //   672: if_icmpeq -> 1473
    //   675: goto -> 682
    //   678: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   681: athrow
    //   682: aload #21
    //   684: invokevirtual getZ : ()I
    //   687: iconst_m1
    //   688: if_icmpeq -> 1473
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   697: athrow
    //   698: aload_0
    //   699: getfield k : Lme/rerere/matrix/internal/ob;
    //   702: aload_0
    //   703: getfield l : J
    //   706: lstore #25
    //   708: aload_0
    //   709: lload #25
    //   711: lconst_1
    //   712: ladd
    //   713: putfield l : J
    //   716: lload #25
    //   718: lstore #23
    //   720: getstatic me/rerere/matrix/internal/jo.b : Lme/rerere/matrix/internal/jo;
    //   723: astore #25
    //   725: aload #21
    //   727: invokevirtual getX : ()I
    //   730: istore #26
    //   732: aload #21
    //   734: invokevirtual getY : ()I
    //   737: istore #27
    //   739: aload #21
    //   741: invokevirtual getZ : ()I
    //   744: istore #28
    //   746: new me/rerere/matrix/internal/xh
    //   749: dup
    //   750: aload_0
    //   751: getfield i : D
    //   754: aload_0
    //   755: getfield r : D
    //   758: aload_0
    //   759: getfield z : D
    //   762: aload_0
    //   763: getfield v : F
    //   766: aload_0
    //   767: getfield b : F
    //   770: invokespecial <init> : (DDDFF)V
    //   773: astore #29
    //   775: new me/rerere/matrix/internal/if
    //   778: dup
    //   779: lload #23
    //   781: aload #25
    //   783: iload #26
    //   785: iload #27
    //   787: iload #28
    //   789: aload #22
    //   791: lload #5
    //   793: aload #29
    //   795: aconst_null
    //   796: sipush #128
    //   799: aconst_null
    //   800: invokespecial <init> : (JLme/rerere/matrix/internal/jo;IIILorg/bukkit/block/BlockFace;JLme/rerere/matrix/internal/xh;Lme/rerere/matrix/internal/xh;ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   803: lload #9
    //   805: dup2_x1
    //   806: pop2
    //   807: invokevirtual p : (JLjava/lang/Object;)V
    //   810: goto -> 1473
    //   813: aload_1
    //   814: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   817: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   820: ifeq -> 1084
    //   823: aload #4
    //   825: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   828: iconst_0
    //   829: invokevirtual read : (I)Ljava/lang/Object;
    //   832: checkcast com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType
    //   835: astore #21
    //   837: aload #21
    //   839: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.START_DESTROY_BLOCK : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   842: if_acmpne -> 1473
    //   845: aload #4
    //   847: invokevirtual getBlockPositionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   850: iconst_0
    //   851: invokevirtual read : (I)Ljava/lang/Object;
    //   854: checkcast com/comphenix/protocol/wrappers/BlockPosition
    //   857: astore #22
    //   859: aload #4
    //   861: invokevirtual getDirections : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   864: iconst_0
    //   865: invokevirtual read : (I)Ljava/lang/Object;
    //   868: checkcast com/comphenix/protocol/wrappers/EnumWrappers$Direction
    //   871: dup
    //   872: ifnonnull -> 884
    //   875: pop
    //   876: iconst_m1
    //   877: goto -> 892
    //   880: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   883: athrow
    //   884: getstatic me/rerere/matrix/internal/nn.i : [I
    //   887: swap
    //   888: invokevirtual ordinal : ()I
    //   891: iaload
    //   892: tableswitch default -> 972, 1 -> 932, 2 -> 942, 3 -> 948, 4 -> 954, 5 -> 960, 6 -> 966
    //   932: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   935: goto -> 975
    //   938: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   941: athrow
    //   942: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   945: goto -> 975
    //   948: getstatic org/bukkit/block/BlockFace.NORTH : Lorg/bukkit/block/BlockFace;
    //   951: goto -> 975
    //   954: getstatic org/bukkit/block/BlockFace.SOUTH : Lorg/bukkit/block/BlockFace;
    //   957: goto -> 975
    //   960: getstatic org/bukkit/block/BlockFace.EAST : Lorg/bukkit/block/BlockFace;
    //   963: goto -> 975
    //   966: getstatic org/bukkit/block/BlockFace.WEST : Lorg/bukkit/block/BlockFace;
    //   969: goto -> 975
    //   972: getstatic org/bukkit/block/BlockFace.SELF : Lorg/bukkit/block/BlockFace;
    //   975: astore #23
    //   977: aload_0
    //   978: getfield k : Lme/rerere/matrix/internal/ob;
    //   981: new me/rerere/matrix/internal/if
    //   984: dup
    //   985: aload_0
    //   986: getfield l : J
    //   989: lstore #24
    //   991: aload_0
    //   992: lload #24
    //   994: lconst_1
    //   995: ladd
    //   996: putfield l : J
    //   999: lload #24
    //   1001: getstatic me/rerere/matrix/internal/jo.i : Lme/rerere/matrix/internal/jo;
    //   1004: aload #22
    //   1006: invokevirtual getX : ()I
    //   1009: aload #22
    //   1011: invokevirtual getY : ()I
    //   1014: aload #22
    //   1016: invokevirtual getZ : ()I
    //   1019: aload #23
    //   1021: new me/rerere/matrix/internal/xh
    //   1024: dup
    //   1025: aload_0
    //   1026: getfield i : D
    //   1029: aload_0
    //   1030: getfield r : D
    //   1033: aload_0
    //   1034: getfield z : D
    //   1037: aload_0
    //   1038: getfield v : F
    //   1041: aload_0
    //   1042: getfield b : F
    //   1045: invokespecial <init> : (DDDFF)V
    //   1048: aconst_null
    //   1049: sipush #128
    //   1052: aconst_null
    //   1053: astore #17
    //   1055: istore #18
    //   1057: astore #19
    //   1059: astore #20
    //   1061: lload #5
    //   1063: aload #20
    //   1065: aload #19
    //   1067: iload #18
    //   1069: aload #17
    //   1071: invokespecial <init> : (JLme/rerere/matrix/internal/jo;IIILorg/bukkit/block/BlockFace;JLme/rerere/matrix/internal/xh;Lme/rerere/matrix/internal/xh;ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   1074: lload #9
    //   1076: dup2_x1
    //   1077: pop2
    //   1078: invokevirtual p : (JLjava/lang/Object;)V
    //   1081: goto -> 1473
    //   1084: lload #15
    //   1086: aload_1
    //   1087: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   1090: ifeq -> 1473
    //   1093: aload_1
    //   1094: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
    //   1097: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1100: ifne -> 1127
    //   1103: goto -> 1110
    //   1106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1109: athrow
    //   1110: aload_1
    //   1111: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   1114: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1117: ifeq -> 1135
    //   1120: goto -> 1127
    //   1123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1126: athrow
    //   1127: iconst_1
    //   1128: goto -> 1136
    //   1131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1134: athrow
    //   1135: iconst_0
    //   1136: istore #21
    //   1138: aload_1
    //   1139: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   1142: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1145: ifne -> 1165
    //   1148: aload_1
    //   1149: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   1152: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1155: ifeq -> 1173
    //   1158: goto -> 1165
    //   1161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1164: athrow
    //   1165: iconst_1
    //   1166: goto -> 1174
    //   1169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1172: athrow
    //   1173: iconst_0
    //   1174: istore #22
    //   1176: iload #21
    //   1178: ifeq -> 1194
    //   1181: aload #4
    //   1183: iconst_0
    //   1184: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)D
    //   1187: goto -> 1198
    //   1190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1193: athrow
    //   1194: aload_0
    //   1195: getfield i : D
    //   1198: dstore #23
    //   1200: iload #21
    //   1202: ifeq -> 1218
    //   1205: aload #4
    //   1207: iconst_1
    //   1208: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)D
    //   1211: goto -> 1222
    //   1214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1217: athrow
    //   1218: aload_0
    //   1219: getfield r : D
    //   1222: dstore #25
    //   1224: iload #21
    //   1226: ifeq -> 1242
    //   1229: aload #4
    //   1231: iconst_2
    //   1232: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)D
    //   1235: goto -> 1246
    //   1238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1241: athrow
    //   1242: aload_0
    //   1243: getfield z : D
    //   1246: dstore #27
    //   1248: iload #22
    //   1250: ifeq -> 1266
    //   1253: aload #4
    //   1255: iconst_0
    //   1256: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)F
    //   1259: goto -> 1270
    //   1262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1265: athrow
    //   1266: aload_0
    //   1267: getfield v : F
    //   1270: fstore #29
    //   1272: iload #22
    //   1274: ifeq -> 1290
    //   1277: aload #4
    //   1279: iconst_1
    //   1280: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)F
    //   1283: goto -> 1294
    //   1286: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1289: athrow
    //   1290: aload_0
    //   1291: getfield b : F
    //   1294: fstore #30
    //   1296: aload_0
    //   1297: getfield k : Lme/rerere/matrix/internal/ob;
    //   1300: lload #7
    //   1302: invokevirtual b : (J)Z
    //   1305: ifeq -> 1443
    //   1308: aload_0
    //   1309: getfield k : Lme/rerere/matrix/internal/ob;
    //   1312: astore #31
    //   1314: iconst_0
    //   1315: istore #32
    //   1317: aload #31
    //   1319: astore #33
    //   1321: aload #33
    //   1323: monitorenter
    //   1324: nop
    //   1325: iconst_0
    //   1326: istore #34
    //   1328: aload #31
    //   1330: invokevirtual b : ()Lme/rerere/matrix/thirdparty/kotlin/collections/ArrayDeque;
    //   1333: checkcast java/lang/Iterable
    //   1336: astore #35
    //   1338: iconst_0
    //   1339: istore #36
    //   1341: aload #35
    //   1343: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1348: astore #37
    //   1350: aload #37
    //   1352: invokeinterface hasNext : ()Z
    //   1357: ifeq -> 1421
    //   1360: aload #37
    //   1362: invokeinterface next : ()Ljava/lang/Object;
    //   1367: astore #38
    //   1369: aload #38
    //   1371: checkcast me/rerere/matrix/internal/if
    //   1374: astore #39
    //   1376: iconst_0
    //   1377: istore #40
    //   1379: aload #39
    //   1381: invokevirtual b : ()Lme/rerere/matrix/internal/xh;
    //   1384: ifnonnull -> 1416
    //   1387: aload #39
    //   1389: new me/rerere/matrix/internal/xh
    //   1392: dup
    //   1393: dload #23
    //   1395: dload #25
    //   1397: dload #27
    //   1399: fload #29
    //   1401: fload #30
    //   1403: invokespecial <init> : (DDDFF)V
    //   1406: invokevirtual b : (Lme/rerere/matrix/internal/xh;)V
    //   1409: goto -> 1416
    //   1412: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1415: athrow
    //   1416: nop
    //   1417: nop
    //   1418: goto -> 1350
    //   1421: nop
    //   1422: nop
    //   1423: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1426: astore #34
    //   1428: aload #33
    //   1430: monitorexit
    //   1431: goto -> 1442
    //   1434: astore #34
    //   1436: aload #33
    //   1438: monitorexit
    //   1439: aload #34
    //   1441: athrow
    //   1442: nop
    //   1443: aload_0
    //   1444: dload #23
    //   1446: putfield i : D
    //   1449: aload_0
    //   1450: dload #25
    //   1452: putfield r : D
    //   1455: aload_0
    //   1456: dload #27
    //   1458: putfield z : D
    //   1461: aload_0
    //   1462: fload #29
    //   1464: putfield v : F
    //   1467: aload_0
    //   1468: fload #30
    //   1470: putfield b : F
    //   1473: iconst_0
    //   1474: ireturn
    // Exception table:
    //   from	to	target	type
    //   44	55	55	java/lang/RuntimeException
    //   73	87	90	java/lang/RuntimeException
    //   80	98	98	java/lang/RuntimeException
    //   107	125	125	java/lang/RuntimeException
    //   166	176	176	java/lang/RuntimeException
    //   180	192	192	java/lang/RuntimeException
    //   201	209	209	java/lang/RuntimeException
    //   213	227	227	java/lang/RuntimeException
    //   236	244	244	java/lang/RuntimeException
    //   248	262	262	java/lang/RuntimeException
    //   271	279	279	java/lang/RuntimeException
    //   283	297	297	java/lang/RuntimeException
    //   306	314	314	java/lang/RuntimeException
    //   318	332	332	java/lang/RuntimeException
    //   341	349	349	java/lang/RuntimeException
    //   353	367	367	java/lang/RuntimeException
    //   377	391	394	java/lang/RuntimeException
    //   384	402	402	java/lang/RuntimeException
    //   411	430	433	java/lang/RuntimeException
    //   414	442	442	java/lang/RuntimeException
    //   454	498	498	java/lang/RuntimeException
    //   538	562	562	java/lang/RuntimeException
    //   574	618	618	java/lang/RuntimeException
    //   657	675	678	java/lang/RuntimeException
    //   666	691	694	java/lang/RuntimeException
    //   859	880	880	java/lang/RuntimeException
    //   892	938	938	java/lang/RuntimeException
    //   1084	1103	1106	java/lang/RuntimeException
    //   1093	1120	1123	java/lang/RuntimeException
    //   1110	1131	1131	java/lang/RuntimeException
    //   1138	1158	1161	java/lang/RuntimeException
    //   1148	1169	1169	java/lang/RuntimeException
    //   1176	1190	1190	java/lang/RuntimeException
    //   1200	1214	1214	java/lang/RuntimeException
    //   1224	1238	1238	java/lang/RuntimeException
    //   1248	1262	1262	java/lang/RuntimeException
    //   1272	1286	1286	java/lang/RuntimeException
    //   1324	1428	1434	finally
    //   1379	1409	1412	java/lang/RuntimeException
    //   1434	1436	1434	finally
  }
  
  static {
    long l = a ^ 0x547D7E34F34BL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "-\\º¼ªOtÞ(\t\037ÀÄª=T\006^0¬**6æsÖ\026\030G»4;\000ÒóVVCQ\020ßO/{\005Ð").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4375;
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
        throw new RuntimeException("me/rerere/matrix/internal/nm", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/nm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */