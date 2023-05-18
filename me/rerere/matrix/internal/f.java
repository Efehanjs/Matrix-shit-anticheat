package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import com.comphenix.protocol.wrappers.WrappedGameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class f {
  private final int t;
  
  private final Player g;
  
  private final String a;
  
  private Location s;
  
  private static final float u = 1.40625F;
  
  public boolean w = false;
  
  private final Map f = new HashMap<>();
  
  @NotNull
  private final WrappedDataWatcher l;
  
  private int r = 0;
  
  private final UUID x;
  
  private int z;
  
  private static final float k = 0.7111111F;
  
  public boolean v;
  
  private static final Gson b;
  
  private float i;
  
  private static final long c = o3.a(9162855853560885713L, -4599500700021854753L, MethodHandles.lookup().lookupClass()).a(600072070980L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public Location b() {
    return this.s;
  }
  
  public Player b() {
    return this.g;
  }
  
  public void b(@NotNull EquipmentSlot paramEquipmentSlot, char paramChar, long paramLong, ItemStack paramItemStack) {
    // Byte code:
    //   0: iload_2
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_3
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/f.c : J
    //   16: lxor
    //   17: lstore #6
    //   19: lload #6
    //   21: dup2
    //   22: ldc2_w 106051250671992
    //   25: lxor
    //   26: dup2
    //   27: bipush #8
    //   29: lushr
    //   30: lstore #8
    //   32: dup2
    //   33: bipush #56
    //   35: lshl
    //   36: bipush #56
    //   38: lushr
    //   39: l2i
    //   40: istore #10
    //   42: pop2
    //   43: pop2
    //   44: invokestatic r : ()I
    //   47: istore #11
    //   49: invokestatic b : ()I
    //   52: bipush #16
    //   54: if_icmpge -> 212
    //   57: new com/comphenix/protocol/events/PacketContainer
    //   60: dup
    //   61: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_EQUIPMENT : Lcom/comphenix/protocol/PacketType;
    //   64: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   67: astore #12
    //   69: aload #12
    //   71: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   74: iconst_0
    //   75: aload_0
    //   76: getfield t : I
    //   79: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   82: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   85: pop
    //   86: lload_3
    //   87: lconst_0
    //   88: lcmp
    //   89: ifle -> 109
    //   92: aload #12
    //   94: invokevirtual getItemModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   97: iconst_0
    //   98: aload #5
    //   100: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   103: iload #11
    //   105: ifeq -> 183
    //   108: pop
    //   109: invokestatic b : ()I
    //   112: bipush #8
    //   114: if_icmpne -> 159
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload #12
    //   126: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   129: iconst_1
    //   130: aload_1
    //   131: invokevirtual ordinal : ()I
    //   134: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   137: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   140: pop
    //   141: iload #11
    //   143: lload_3
    //   144: lconst_0
    //   145: lcmp
    //   146: iflt -> 209
    //   149: ifne -> 184
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload #12
    //   161: invokevirtual getItemSlots : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   164: iconst_0
    //   165: invokestatic values : ()[Lcom/comphenix/protocol/wrappers/EnumWrappers$ItemSlot;
    //   168: aload_1
    //   169: invokevirtual ordinal : ()I
    //   172: aaload
    //   173: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   182: athrow
    //   183: pop
    //   184: aload_0
    //   185: getfield g : Lorg/bukkit/entity/Player;
    //   188: lload #8
    //   190: dup2_x1
    //   191: pop2
    //   192: iload #10
    //   194: i2b
    //   195: swap
    //   196: aload #12
    //   198: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   201: lload_3
    //   202: lconst_0
    //   203: lcmp
    //   204: iflt -> 241
    //   207: iload #11
    //   209: ifne -> 304
    //   212: new com/comphenix/protocol/events/PacketContainer
    //   215: dup
    //   216: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_EQUIPMENT : Lcom/comphenix/protocol/PacketType;
    //   219: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   222: astore #12
    //   224: aload #12
    //   226: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   229: iconst_0
    //   230: aload_0
    //   231: getfield t : I
    //   234: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   237: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   240: pop
    //   241: new java/util/ArrayList
    //   244: dup
    //   245: invokespecial <init> : ()V
    //   248: astore #13
    //   250: aload #13
    //   252: new com/comphenix/protocol/wrappers/Pair
    //   255: dup
    //   256: invokestatic values : ()[Lcom/comphenix/protocol/wrappers/EnumWrappers$ItemSlot;
    //   259: aload_1
    //   260: invokevirtual ordinal : ()I
    //   263: aaload
    //   264: aload #5
    //   266: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   269: invokeinterface add : (Ljava/lang/Object;)Z
    //   274: pop
    //   275: aload #12
    //   277: invokevirtual getSlotStackPairLists : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   280: iconst_0
    //   281: aload #13
    //   283: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   286: pop
    //   287: aload_0
    //   288: getfield g : Lorg/bukkit/entity/Player;
    //   291: lload #8
    //   293: dup2_x1
    //   294: pop2
    //   295: iload #10
    //   297: i2b
    //   298: swap
    //   299: aload #12
    //   301: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   304: return
    // Exception table:
    //   from	to	target	type
    //   69	117	120	java/lang/RuntimeException
    //   108	152	155	java/lang/RuntimeException
    //   124	176	179	java/lang/RuntimeException
  }
  
  public String b() {
    return this.a;
  }
  
  public void j(float paramFloat, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 56213224744273
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 116506052847629
    //   18: lxor
    //   19: lstore #6
    //   21: pop2
    //   22: invokestatic a : ()I
    //   25: istore #8
    //   27: fload_1
    //   28: fconst_0
    //   29: fcmpg
    //   30: iload #8
    //   32: ifne -> 53
    //   35: ifgt -> 47
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   44: athrow
    //   45: fconst_1
    //   46: fstore_1
    //   47: aload_0
    //   48: getfield i : F
    //   51: fload_1
    //   52: fcmpl
    //   53: iload #8
    //   55: lload_2
    //   56: lconst_0
    //   57: lcmp
    //   58: iflt -> 97
    //   61: ifne -> 95
    //   64: ifle -> 87
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: bipush #40
    //   77: putfield r : I
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: aload_0
    //   88: fload_1
    //   89: putfield i : F
    //   92: invokestatic b : ()I
    //   95: bipush #14
    //   97: lload_2
    //   98: lconst_0
    //   99: lcmp
    //   100: ifle -> 167
    //   103: iload #8
    //   105: ifne -> 167
    //   108: if_icmplt -> 155
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: aload_0
    //   119: bipush #8
    //   121: aload_0
    //   122: getfield i : F
    //   125: invokestatic valueOf : (F)Ljava/lang/Float;
    //   128: lload #6
    //   130: dup2_x1
    //   131: pop2
    //   132: ldc java/lang/Float
    //   134: invokespecial b : (IJLjava/lang/Object;Ljava/lang/Class;)V
    //   137: lload_2
    //   138: lconst_0
    //   139: lcmp
    //   140: ifle -> 239
    //   143: iload #8
    //   145: ifeq -> 233
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: invokestatic b : ()I
    //   158: bipush #9
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: if_icmplt -> 207
    //   170: aload_0
    //   171: bipush #7
    //   173: aload_0
    //   174: getfield i : F
    //   177: invokestatic valueOf : (F)Ljava/lang/Float;
    //   180: lload #6
    //   182: dup2_x1
    //   183: pop2
    //   184: ldc java/lang/Float
    //   186: invokespecial b : (IJLjava/lang/Object;Ljava/lang/Class;)V
    //   189: lload_2
    //   190: lconst_0
    //   191: lcmp
    //   192: ifle -> 239
    //   195: iload #8
    //   197: ifeq -> 233
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   206: athrow
    //   207: aload_0
    //   208: bipush #6
    //   210: aload_0
    //   211: getfield i : F
    //   214: invokestatic valueOf : (F)Ljava/lang/Float;
    //   217: lload #6
    //   219: dup2_x1
    //   220: pop2
    //   221: ldc java/lang/Float
    //   223: invokespecial b : (IJLjava/lang/Object;Ljava/lang/Class;)V
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: aload_0
    //   234: lload #4
    //   236: invokevirtual j : (J)V
    //   239: return
    // Exception table:
    //   from	to	target	type
    //   27	38	41	java/lang/RuntimeException
    //   53	67	70	java/lang/RuntimeException
    //   64	80	83	java/lang/RuntimeException
    //   95	111	114	java/lang/RuntimeException
    //   108	148	151	java/lang/RuntimeException
    //   118	160	163	java/lang/RuntimeException
    //   167	200	203	java/lang/RuntimeException
    //   170	226	229	java/lang/RuntimeException
  }
  
  public int p() {
    return this.z;
  }
  
  public void i(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 130061803577709
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 56519631525506
    //   17: lxor
    //   18: dup2
    //   19: bipush #8
    //   21: lushr
    //   22: lstore #5
    //   24: dup2
    //   25: bipush #56
    //   27: lshl
    //   28: bipush #56
    //   30: lushr
    //   31: l2i
    //   32: istore #7
    //   34: pop2
    //   35: pop2
    //   36: invokestatic r : ()I
    //   39: istore #8
    //   41: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   44: new me/rerere/matrix/api/events/MatrixKillAuraNPCDestroyEvent
    //   47: dup
    //   48: aload_0
    //   49: getfield g : Lorg/bukkit/entity/Player;
    //   52: aload_0
    //   53: getfield t : I
    //   56: aload_0
    //   57: getfield x : Ljava/util/UUID;
    //   60: aload_0
    //   61: getfield a : Ljava/lang/String;
    //   64: invokespecial <init> : (Lorg/bukkit/entity/Player;ILjava/util/UUID;Ljava/lang/String;)V
    //   67: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   72: new com/comphenix/protocol/events/PacketContainer
    //   75: dup
    //   76: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_DESTROY : Lcom/comphenix/protocol/PacketType;
    //   79: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   82: astore #9
    //   84: iload #8
    //   86: ifeq -> 131
    //   89: invokestatic b : ()I
    //   92: bipush #17
    //   94: if_icmpge -> 142
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: aload #9
    //   106: invokevirtual getIntegerArrays : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   109: iconst_0
    //   110: iconst_1
    //   111: newarray int
    //   113: dup
    //   114: iconst_0
    //   115: aload_0
    //   116: getfield t : I
    //   119: iastore
    //   120: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   123: pop
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iload #8
    //   133: lload_1
    //   134: lconst_0
    //   135: lcmp
    //   136: ifle -> 189
    //   139: ifne -> 169
    //   142: aload #9
    //   144: invokevirtual getIntLists : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   147: iconst_0
    //   148: aload_0
    //   149: getfield t : I
    //   152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   155: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   158: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   161: pop
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   168: athrow
    //   169: aload_0
    //   170: getfield g : Lorg/bukkit/entity/Player;
    //   173: lload #5
    //   175: dup2_x1
    //   176: pop2
    //   177: iload #7
    //   179: i2b
    //   180: swap
    //   181: aload #9
    //   183: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   186: invokestatic b : ()I
    //   189: iload #8
    //   191: lload_1
    //   192: lconst_0
    //   193: lcmp
    //   194: ifle -> 202
    //   197: ifeq -> 239
    //   200: bipush #19
    //   202: if_icmplt -> 242
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: lload_3
    //   213: invokestatic b : (J)Ljava/lang/String;
    //   216: sipush #30573
    //   219: ldc2_w 3562808552311190660
    //   222: lload_1
    //   223: lxor
    //   224: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   229: invokevirtual equals : (Ljava/lang/Object;)Z
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: ifeq -> 346
    //   242: new com/comphenix/protocol/events/PacketContainer
    //   245: dup
    //   246: getstatic com/comphenix/protocol/PacketType$Play$Server.PLAYER_INFO : Lcom/comphenix/protocol/PacketType;
    //   249: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   252: astore #10
    //   254: aload #10
    //   256: invokevirtual getPlayerInfoAction : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   259: iconst_0
    //   260: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerInfoAction.REMOVE_PLAYER : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerInfoAction;
    //   263: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   266: pop
    //   267: new java/util/ArrayList
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: astore #11
    //   276: aload #11
    //   278: new com/comphenix/protocol/wrappers/PlayerInfoData
    //   281: dup
    //   282: aload_0
    //   283: invokevirtual b : ()Lcom/comphenix/protocol/wrappers/WrappedGameProfile;
    //   286: iconst_0
    //   287: getstatic com/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode.SURVIVAL : Lcom/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode;
    //   290: aload_0
    //   291: getfield a : Ljava/lang/String;
    //   294: invokestatic fromText : (Ljava/lang/String;)Lcom/comphenix/protocol/wrappers/WrappedChatComponent;
    //   297: invokespecial <init> : (Lcom/comphenix/protocol/wrappers/WrappedGameProfile;ILcom/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode;Lcom/comphenix/protocol/wrappers/WrappedChatComponent;)V
    //   300: invokeinterface add : (Ljava/lang/Object;)Z
    //   305: pop
    //   306: aload #10
    //   308: invokevirtual getPlayerInfoDataLists : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   311: iconst_0
    //   312: aload #11
    //   314: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   317: pop
    //   318: aload_0
    //   319: getfield g : Lorg/bukkit/entity/Player;
    //   322: lload #5
    //   324: dup2_x1
    //   325: pop2
    //   326: iload #7
    //   328: i2b
    //   329: swap
    //   330: aload #10
    //   332: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   335: lload_1
    //   336: lconst_0
    //   337: lcmp
    //   338: iflt -> 377
    //   341: iload #8
    //   343: ifne -> 394
    //   346: new com/comphenix/protocol/events/PacketContainer
    //   349: dup
    //   350: getstatic com/comphenix/protocol/PacketType$Play$Server.PLAYER_INFO_REMOVE : Lcom/comphenix/protocol/PacketType;
    //   353: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   356: astore #10
    //   358: aload #10
    //   360: ldc java/util/List
    //   362: invokevirtual getSpecificModifier : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   365: iconst_0
    //   366: aload_0
    //   367: getfield x : Ljava/util/UUID;
    //   370: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   373: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   376: pop
    //   377: aload_0
    //   378: getfield g : Lorg/bukkit/entity/Player;
    //   381: lload #5
    //   383: dup2_x1
    //   384: pop2
    //   385: iload #7
    //   387: i2b
    //   388: swap
    //   389: aload #10
    //   391: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   394: return
    // Exception table:
    //   from	to	target	type
    //   84	97	100	java/lang/RuntimeException
    //   89	124	127	java/lang/RuntimeException
    //   131	162	165	java/lang/RuntimeException
    //   169	205	208	java/lang/RuntimeException
    //   200	232	235	java/lang/RuntimeException
  }
  
  public void j(@NotNull Location paramLocation, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 77028574367643
    //   11: lxor
    //   12: dup2
    //   13: bipush #8
    //   15: lushr
    //   16: lstore #5
    //   18: dup2
    //   19: bipush #56
    //   21: lshl
    //   22: bipush #56
    //   24: lushr
    //   25: l2i
    //   26: istore #7
    //   28: pop2
    //   29: pop2
    //   30: invokestatic r : ()I
    //   33: istore #8
    //   35: new com/comphenix/protocol/events/PacketContainer
    //   38: dup
    //   39: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_TELEPORT : Lcom/comphenix/protocol/PacketType;
    //   42: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   45: astore #9
    //   47: aload #9
    //   49: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   52: iconst_0
    //   53: aload_0
    //   54: getfield t : I
    //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   60: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   63: iload #8
    //   65: ifeq -> 201
    //   68: pop
    //   69: invokestatic b : ()I
    //   72: bipush #8
    //   74: if_icmpne -> 156
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload #9
    //   86: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   89: iconst_1
    //   90: aload_1
    //   91: invokevirtual getX : ()D
    //   94: ldc2_w 32.0
    //   97: dmul
    //   98: d2i
    //   99: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   102: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   105: iconst_2
    //   106: aload_1
    //   107: invokevirtual getY : ()D
    //   110: ldc2_w 32.0
    //   113: dmul
    //   114: d2i
    //   115: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   118: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   121: iconst_3
    //   122: aload_1
    //   123: invokevirtual getZ : ()D
    //   126: ldc2_w 32.0
    //   129: dmul
    //   130: d2i
    //   131: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   134: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   137: pop
    //   138: lload_2
    //   139: lconst_0
    //   140: lcmp
    //   141: iflt -> 282
    //   144: iload #8
    //   146: ifne -> 202
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: aload #9
    //   158: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   161: iconst_0
    //   162: aload_1
    //   163: invokevirtual getX : ()D
    //   166: invokestatic valueOf : (D)Ljava/lang/Double;
    //   169: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   172: iconst_1
    //   173: aload_1
    //   174: invokevirtual getY : ()D
    //   177: invokestatic valueOf : (D)Ljava/lang/Double;
    //   180: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   183: iconst_2
    //   184: aload_1
    //   185: invokevirtual getZ : ()D
    //   188: invokestatic valueOf : (D)Ljava/lang/Double;
    //   191: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: pop
    //   202: aload #9
    //   204: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   207: iconst_0
    //   208: aload_1
    //   209: invokevirtual getYaw : ()F
    //   212: ldc_w 256.0
    //   215: fmul
    //   216: ldc_w 360.0
    //   219: fdiv
    //   220: f2i
    //   221: i2b
    //   222: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   225: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   228: iconst_1
    //   229: aload_1
    //   230: invokevirtual getPitch : ()F
    //   233: ldc_w 256.0
    //   236: fmul
    //   237: ldc_w 360.0
    //   240: fdiv
    //   241: f2i
    //   242: i2b
    //   243: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   246: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   249: pop
    //   250: aload #9
    //   252: invokevirtual getBooleans : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   255: iconst_0
    //   256: iload #4
    //   258: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   261: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   264: pop
    //   265: aload_0
    //   266: getfield g : Lorg/bukkit/entity/Player;
    //   269: lload #5
    //   271: dup2_x1
    //   272: pop2
    //   273: iload #7
    //   275: i2b
    //   276: swap
    //   277: aload #9
    //   279: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   282: return
    // Exception table:
    //   from	to	target	type
    //   47	77	80	java/lang/RuntimeException
    //   68	149	152	java/lang/RuntimeException
    //   84	194	197	java/lang/RuntimeException
  }
  
  public void t(long paramLong) {
    paramLong = c ^ paramLong;
    long l = (paramLong ^ 0x3B37ECD2D223L) >>> 8L;
    int i = (int)((paramLong ^ 0x3B37ECD2D223L) << 56L >>> 56L);
    paramLong ^ 0x3B37ECD2D223L;
    PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.ANIMATION);
    packetContainer.getIntegers().write(0, Integer.valueOf(this.t)).write(1, Integer.valueOf(0));
    v.b(l, (byte)i, this.g, packetContainer);
  }
  
  public boolean j() {
    return this.v;
  }
  
  public void b(long paramLong, @NotNull PotionEffect paramPotionEffect) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 52578720838916
    //   11: lxor
    //   12: dup2
    //   13: bipush #8
    //   15: lushr
    //   16: lstore #4
    //   18: dup2
    //   19: bipush #56
    //   21: lshl
    //   22: bipush #56
    //   24: lushr
    //   25: l2i
    //   26: istore #6
    //   28: pop2
    //   29: pop2
    //   30: invokestatic r : ()I
    //   33: istore #7
    //   35: new com/comphenix/protocol/events/PacketContainer
    //   38: dup
    //   39: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_EFFECT : Lcom/comphenix/protocol/PacketType;
    //   42: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   45: astore #8
    //   47: invokestatic b : ()I
    //   50: bipush #18
    //   52: iload #7
    //   54: ifeq -> 190
    //   57: if_icmpge -> 178
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: aload #8
    //   69: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   72: iconst_0
    //   73: aload_0
    //   74: getfield t : I
    //   77: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   80: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   83: iconst_1
    //   84: aload_3
    //   85: invokevirtual getDuration : ()I
    //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   91: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   94: pop
    //   95: aload #8
    //   97: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   100: iconst_0
    //   101: aload_3
    //   102: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   105: invokevirtual getId : ()I
    //   108: i2b
    //   109: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   112: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   115: iconst_1
    //   116: aload_3
    //   117: invokevirtual getAmplifier : ()I
    //   120: i2b
    //   121: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   124: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   127: iconst_2
    //   128: aload_3
    //   129: invokevirtual hasParticles : ()Z
    //   132: iload #7
    //   134: ifeq -> 155
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: ifeq -> 158
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: iconst_1
    //   155: goto -> 159
    //   158: iconst_0
    //   159: i2b
    //   160: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   163: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   166: pop
    //   167: lload_1
    //   168: lconst_0
    //   169: lcmp
    //   170: ifle -> 419
    //   173: iload #7
    //   175: ifne -> 402
    //   178: invokestatic b : ()I
    //   181: bipush #18
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: if_icmpne -> 303
    //   193: aload #8
    //   195: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   198: iconst_0
    //   199: aload_0
    //   200: getfield t : I
    //   203: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   206: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   209: iconst_1
    //   210: aload_3
    //   211: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   214: invokevirtual getId : ()I
    //   217: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   220: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   223: iconst_2
    //   224: aload_3
    //   225: invokevirtual getDuration : ()I
    //   228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   231: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   234: pop
    //   235: aload #8
    //   237: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   240: iconst_0
    //   241: aload_3
    //   242: invokevirtual getAmplifier : ()I
    //   245: i2b
    //   246: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   249: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   252: iconst_1
    //   253: aload_3
    //   254: invokevirtual hasParticles : ()Z
    //   257: iload #7
    //   259: ifeq -> 280
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   268: athrow
    //   269: ifeq -> 283
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: iconst_1
    //   280: goto -> 284
    //   283: iconst_0
    //   284: i2b
    //   285: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   288: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   291: pop
    //   292: lload_1
    //   293: lconst_0
    //   294: lcmp
    //   295: ifle -> 419
    //   298: iload #7
    //   300: ifne -> 402
    //   303: aload #8
    //   305: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   308: iconst_0
    //   309: aload_0
    //   310: getfield t : I
    //   313: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   316: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   319: iconst_1
    //   320: aload_3
    //   321: invokevirtual getDuration : ()I
    //   324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   327: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   330: pop
    //   331: aload #8
    //   333: invokevirtual getEffectTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   336: iconst_0
    //   337: aload_3
    //   338: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   341: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   344: pop
    //   345: aload #8
    //   347: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   350: iconst_0
    //   351: aload_3
    //   352: invokevirtual getAmplifier : ()I
    //   355: i2b
    //   356: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   359: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   362: iconst_1
    //   363: aload_3
    //   364: invokevirtual hasParticles : ()Z
    //   367: iload #7
    //   369: ifeq -> 390
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   378: athrow
    //   379: ifeq -> 393
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   388: athrow
    //   389: iconst_1
    //   390: goto -> 394
    //   393: iconst_0
    //   394: i2b
    //   395: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   398: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   401: pop
    //   402: aload_0
    //   403: getfield g : Lorg/bukkit/entity/Player;
    //   406: lload #4
    //   408: dup2_x1
    //   409: pop2
    //   410: iload #6
    //   412: i2b
    //   413: swap
    //   414: aload #8
    //   416: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   419: return
    // Exception table:
    //   from	to	target	type
    //   47	60	63	java/lang/RuntimeException
    //   57	137	140	java/lang/RuntimeException
    //   67	147	150	java/lang/RuntimeException
    //   159	183	186	java/lang/RuntimeException
    //   190	262	265	java/lang/RuntimeException
    //   193	272	275	java/lang/RuntimeException
    //   284	372	375	java/lang/RuntimeException
    //   303	382	385	java/lang/RuntimeException
  }
  
  public boolean b() {
    return this.w;
  }
  
  public void h(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 31663833740920
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 49160332532952
    //   17: lxor
    //   18: dup2
    //   19: bipush #32
    //   21: lushr
    //   22: l2i
    //   23: istore #5
    //   25: dup2
    //   26: bipush #32
    //   28: lshl
    //   29: bipush #48
    //   31: lushr
    //   32: l2i
    //   33: istore #6
    //   35: dup2
    //   36: bipush #48
    //   38: lshl
    //   39: bipush #48
    //   41: lushr
    //   42: l2i
    //   43: istore #7
    //   45: pop2
    //   46: dup2
    //   47: ldc2_w 98825328476567
    //   50: lxor
    //   51: dup2
    //   52: bipush #8
    //   54: lushr
    //   55: lstore #8
    //   57: dup2
    //   58: bipush #56
    //   60: lshl
    //   61: bipush #56
    //   63: lushr
    //   64: l2i
    //   65: istore #10
    //   67: pop2
    //   68: pop2
    //   69: invokestatic a : ()I
    //   72: istore #11
    //   74: invokestatic b : ()I
    //   77: iload #11
    //   79: ifne -> 121
    //   82: bipush #19
    //   84: if_icmplt -> 124
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: lload_3
    //   95: invokestatic b : (J)Ljava/lang/String;
    //   98: sipush #1620
    //   101: ldc2_w 5344554795634234025
    //   104: lload_1
    //   105: lxor
    //   106: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: ifeq -> 229
    //   124: new com/comphenix/protocol/events/PacketContainer
    //   127: dup
    //   128: getstatic com/comphenix/protocol/PacketType$Play$Server.PLAYER_INFO : Lcom/comphenix/protocol/PacketType;
    //   131: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   134: astore #12
    //   136: aload #12
    //   138: invokevirtual getPlayerInfoAction : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   141: iconst_0
    //   142: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerInfoAction.ADD_PLAYER : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerInfoAction;
    //   145: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   148: pop
    //   149: new java/util/ArrayList
    //   152: dup
    //   153: invokespecial <init> : ()V
    //   156: astore #13
    //   158: new com/comphenix/protocol/wrappers/PlayerInfoData
    //   161: dup
    //   162: aload_0
    //   163: invokevirtual b : ()Lcom/comphenix/protocol/wrappers/WrappedGameProfile;
    //   166: aload_0
    //   167: getfield z : I
    //   170: getstatic com/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode.SURVIVAL : Lcom/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode;
    //   173: aconst_null
    //   174: invokespecial <init> : (Lcom/comphenix/protocol/wrappers/WrappedGameProfile;ILcom/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode;Lcom/comphenix/protocol/wrappers/WrappedChatComponent;)V
    //   177: astore #14
    //   179: aload #13
    //   181: aload #14
    //   183: invokeinterface add : (Ljava/lang/Object;)Z
    //   188: pop
    //   189: aload #12
    //   191: invokevirtual getPlayerInfoDataLists : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   194: iconst_0
    //   195: aload #13
    //   197: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   200: pop
    //   201: aload_0
    //   202: getfield g : Lorg/bukkit/entity/Player;
    //   205: lload #8
    //   207: dup2_x1
    //   208: pop2
    //   209: iload #10
    //   211: i2b
    //   212: swap
    //   213: aload #12
    //   215: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   218: lload_1
    //   219: lconst_0
    //   220: lcmp
    //   221: iflt -> 374
    //   224: iload #11
    //   226: ifeq -> 345
    //   229: new com/comphenix/protocol/events/PacketContainer
    //   232: dup
    //   233: getstatic com/comphenix/protocol/PacketType$Play$Server.PLAYER_INFO : Lcom/comphenix/protocol/PacketType;
    //   236: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   239: astore #12
    //   241: new java/util/HashSet
    //   244: dup
    //   245: invokespecial <init> : ()V
    //   248: astore #13
    //   250: aload #13
    //   252: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerInfoAction.ADD_PLAYER : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerInfoAction;
    //   255: invokeinterface add : (Ljava/lang/Object;)Z
    //   260: pop
    //   261: aload #12
    //   263: invokevirtual getPlayerInfoActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   266: iconst_0
    //   267: aload #13
    //   269: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   272: pop
    //   273: new java/util/ArrayList
    //   276: dup
    //   277: invokespecial <init> : ()V
    //   280: astore #14
    //   282: new com/comphenix/protocol/wrappers/PlayerInfoData
    //   285: dup
    //   286: aload_0
    //   287: invokevirtual b : ()Lcom/comphenix/protocol/wrappers/WrappedGameProfile;
    //   290: aload_0
    //   291: getfield z : I
    //   294: getstatic com/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode.SURVIVAL : Lcom/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode;
    //   297: aconst_null
    //   298: invokespecial <init> : (Lcom/comphenix/protocol/wrappers/WrappedGameProfile;ILcom/comphenix/protocol/wrappers/EnumWrappers$NativeGameMode;Lcom/comphenix/protocol/wrappers/WrappedChatComponent;)V
    //   301: astore #15
    //   303: aload #14
    //   305: aload #15
    //   307: invokeinterface add : (Ljava/lang/Object;)Z
    //   312: pop
    //   313: aload #12
    //   315: invokestatic getConverter : ()Lcom/comphenix/protocol/reflect/EquivalentConverter;
    //   318: invokevirtual getLists : (Lcom/comphenix/protocol/reflect/EquivalentConverter;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   321: iconst_0
    //   322: aload #14
    //   324: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   327: pop
    //   328: aload_0
    //   329: getfield g : Lorg/bukkit/entity/Player;
    //   332: lload #8
    //   334: dup2_x1
    //   335: pop2
    //   336: iload #10
    //   338: i2b
    //   339: swap
    //   340: aload #12
    //   342: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   345: new com/comphenix/protocol/events/PacketContainer
    //   348: dup
    //   349: getstatic com/comphenix/protocol/PacketType$Play$Server.NAMED_ENTITY_SPAWN : Lcom/comphenix/protocol/PacketType;
    //   352: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   355: astore #12
    //   357: aload #12
    //   359: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   362: iconst_0
    //   363: aload_0
    //   364: getfield t : I
    //   367: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   370: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   373: pop
    //   374: lload_1
    //   375: lconst_0
    //   376: lcmp
    //   377: iflt -> 399
    //   380: aload #12
    //   382: invokevirtual getUUIDs : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   385: iconst_0
    //   386: aload_0
    //   387: getfield x : Ljava/util/UUID;
    //   390: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   393: iload #11
    //   395: ifne -> 549
    //   398: pop
    //   399: invokestatic b : ()I
    //   402: bipush #8
    //   404: if_icmpne -> 495
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   413: athrow
    //   414: aload #12
    //   416: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   419: iconst_1
    //   420: aload_0
    //   421: getfield s : Lorg/bukkit/Location;
    //   424: invokevirtual getX : ()D
    //   427: ldc2_w 32.0
    //   430: dmul
    //   431: d2i
    //   432: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   435: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   438: iconst_2
    //   439: aload_0
    //   440: getfield s : Lorg/bukkit/Location;
    //   443: invokevirtual getY : ()D
    //   446: ldc2_w 32.0
    //   449: dmul
    //   450: d2i
    //   451: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   454: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   457: iconst_3
    //   458: aload_0
    //   459: getfield s : Lorg/bukkit/Location;
    //   462: invokevirtual getZ : ()D
    //   465: ldc2_w 32.0
    //   468: dmul
    //   469: d2i
    //   470: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   473: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   476: pop
    //   477: iload #11
    //   479: lload_1
    //   480: lconst_0
    //   481: lcmp
    //   482: iflt -> 607
    //   485: ifeq -> 550
    //   488: goto -> 495
    //   491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   494: athrow
    //   495: aload #12
    //   497: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   500: iconst_0
    //   501: aload_0
    //   502: getfield s : Lorg/bukkit/Location;
    //   505: invokevirtual getX : ()D
    //   508: invokestatic valueOf : (D)Ljava/lang/Double;
    //   511: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   514: iconst_1
    //   515: aload_0
    //   516: getfield s : Lorg/bukkit/Location;
    //   519: invokevirtual getY : ()D
    //   522: invokestatic valueOf : (D)Ljava/lang/Double;
    //   525: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   528: iconst_2
    //   529: aload_0
    //   530: getfield s : Lorg/bukkit/Location;
    //   533: invokevirtual getZ : ()D
    //   536: invokestatic valueOf : (D)Ljava/lang/Double;
    //   539: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   548: athrow
    //   549: pop
    //   550: aload #12
    //   552: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   555: iconst_0
    //   556: aload_0
    //   557: getfield s : Lorg/bukkit/Location;
    //   560: invokevirtual getYaw : ()F
    //   563: ldc_w 256.0
    //   566: fmul
    //   567: ldc_w 360.0
    //   570: fdiv
    //   571: f2i
    //   572: i2b
    //   573: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   576: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   579: iconst_1
    //   580: aload_0
    //   581: getfield s : Lorg/bukkit/Location;
    //   584: invokevirtual getPitch : ()F
    //   587: ldc_w 256.0
    //   590: fmul
    //   591: ldc_w 360.0
    //   594: fdiv
    //   595: f2i
    //   596: i2b
    //   597: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   600: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   603: pop
    //   604: invokestatic b : ()I
    //   607: bipush #8
    //   609: lload_1
    //   610: lconst_0
    //   611: lcmp
    //   612: ifle -> 656
    //   615: iload #11
    //   617: ifne -> 656
    //   620: if_icmpne -> 651
    //   623: goto -> 630
    //   626: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   629: athrow
    //   630: aload #12
    //   632: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   635: iconst_4
    //   636: iconst_0
    //   637: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   640: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   643: pop
    //   644: goto -> 651
    //   647: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   650: athrow
    //   651: invokestatic b : ()I
    //   654: bipush #15
    //   656: if_icmpge -> 680
    //   659: aload #12
    //   661: invokevirtual getDataWatcherModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   664: iconst_0
    //   665: aload_0
    //   666: getfield l : Lcom/comphenix/protocol/wrappers/WrappedDataWatcher;
    //   669: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   672: pop
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   679: athrow
    //   680: aload_0
    //   681: getfield g : Lorg/bukkit/entity/Player;
    //   684: lload #8
    //   686: dup2_x1
    //   687: pop2
    //   688: iload #10
    //   690: i2b
    //   691: swap
    //   692: aload #12
    //   694: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   697: aload_0
    //   698: iload #5
    //   700: iload #6
    //   702: i2c
    //   703: iload #7
    //   705: i2c
    //   706: invokespecial b : (ICC)V
    //   709: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   712: new me/rerere/matrix/api/events/MatrixKillAuraNPCSpawnEvent
    //   715: dup
    //   716: aload_0
    //   717: getfield g : Lorg/bukkit/entity/Player;
    //   720: aload_0
    //   721: getfield t : I
    //   724: aload_0
    //   725: getfield x : Ljava/util/UUID;
    //   728: aload_0
    //   729: getfield a : Ljava/lang/String;
    //   732: invokespecial <init> : (Lorg/bukkit/entity/Player;ILjava/util/UUID;Ljava/lang/String;)V
    //   735: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   740: return
    // Exception table:
    //   from	to	target	type
    //   74	87	90	java/lang/RuntimeException
    //   82	114	117	java/lang/RuntimeException
    //   357	407	410	java/lang/RuntimeException
    //   398	488	491	java/lang/RuntimeException
    //   414	542	545	java/lang/RuntimeException
    //   550	623	626	java/lang/RuntimeException
    //   620	644	647	java/lang/RuntimeException
    //   656	673	676	java/lang/RuntimeException
  }
  
  public int j() {
    return this.r;
  }
  
  public Map b() {
    return this.f;
  }
  
  @NotNull
  public WrappedGameProfile b() {
    return new WrappedGameProfile(this.x, this.a);
  }
  
  public void m(long paramLong) {
    paramLong = c ^ paramLong;
    int i = (int)((paramLong ^ 0x661689D50554L) >>> 48L);
    long l = (paramLong ^ 0x661689D50554L) << 16L >>> 16L;
    paramLong ^ 0x661689D50554L;
    b(EquipmentSlot.HAND, (char)i, l, ha.v[(new Random()).nextInt(ha.v.length)]);
    b(EquipmentSlot.FEET, (char)i, l, ha.z[(new Random()).nextInt(ha.z.length)]);
    b(EquipmentSlot.LEGS, (char)i, l, ha.i[(new Random()).nextInt(ha.i.length)]);
    b(EquipmentSlot.CHEST, (char)i, l, ha.b[(new Random()).nextInt(ha.b.length)]);
    b(EquipmentSlot.HEAD, (char)i, l, ha.k[(new Random()).nextInt(ha.k.length)]);
  }
  
  public void p(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 39127710812015
    //   11: lxor
    //   12: dup2
    //   13: bipush #8
    //   15: lushr
    //   16: lstore_3
    //   17: dup2
    //   18: bipush #56
    //   20: lshl
    //   21: bipush #56
    //   23: lushr
    //   24: l2i
    //   25: istore #5
    //   27: pop2
    //   28: dup2
    //   29: ldc2_w 130217352604997
    //   32: lxor
    //   33: lstore #6
    //   35: pop2
    //   36: invokestatic a : ()I
    //   39: istore #8
    //   41: aload_0
    //   42: aload_0
    //   43: getfield i : F
    //   46: fconst_1
    //   47: fsub
    //   48: lload #6
    //   50: invokevirtual j : (FJ)V
    //   53: invokestatic b : ()I
    //   56: bipush #12
    //   58: if_icmpge -> 125
    //   61: new com/comphenix/protocol/events/PacketContainer
    //   64: dup
    //   65: getstatic com/comphenix/protocol/PacketType$Play$Server.ANIMATION : Lcom/comphenix/protocol/PacketType;
    //   68: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   71: astore #9
    //   73: aload #9
    //   75: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   78: iconst_0
    //   79: aload_0
    //   80: getfield t : I
    //   83: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   86: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   89: iconst_1
    //   90: iconst_1
    //   91: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   94: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   97: pop
    //   98: aload_0
    //   99: getfield g : Lorg/bukkit/entity/Player;
    //   102: lload_3
    //   103: dup2_x1
    //   104: pop2
    //   105: iload #5
    //   107: i2b
    //   108: swap
    //   109: aload #9
    //   111: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   114: lload_1
    //   115: lconst_0
    //   116: lcmp
    //   117: ifle -> 168
    //   120: iload #8
    //   122: ifeq -> 184
    //   125: new com/comphenix/protocol/events/PacketContainer
    //   128: dup
    //   129: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_STATUS : Lcom/comphenix/protocol/PacketType;
    //   132: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   135: astore #9
    //   137: aload #9
    //   139: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   142: iconst_0
    //   143: aload_0
    //   144: getfield t : I
    //   147: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   150: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   153: pop
    //   154: aload #9
    //   156: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   159: iconst_0
    //   160: iconst_2
    //   161: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   164: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   167: pop
    //   168: aload_0
    //   169: getfield g : Lorg/bukkit/entity/Player;
    //   172: lload_3
    //   173: dup2_x1
    //   174: pop2
    //   175: iload #5
    //   177: i2b
    //   178: swap
    //   179: aload #9
    //   181: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   184: return
  }
  
  public void j(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 39536249419924
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 113080567369595
    //   17: lxor
    //   18: dup2
    //   19: bipush #8
    //   21: lushr
    //   22: lstore #5
    //   24: dup2
    //   25: bipush #56
    //   27: lshl
    //   28: bipush #56
    //   30: lushr
    //   31: l2i
    //   32: istore #7
    //   34: pop2
    //   35: pop2
    //   36: invokestatic r : ()I
    //   39: istore #8
    //   41: new com/comphenix/protocol/events/PacketContainer
    //   44: dup
    //   45: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_METADATA : Lcom/comphenix/protocol/PacketType;
    //   48: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   51: astore #9
    //   53: aload #9
    //   55: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   58: iconst_0
    //   59: aload_0
    //   60: getfield t : I
    //   63: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   66: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   69: iload #8
    //   71: ifeq -> 149
    //   74: pop
    //   75: invokestatic b : ()I
    //   78: bipush #19
    //   80: if_icmplt -> 126
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: lload_1
    //   91: lconst_0
    //   92: lcmp
    //   93: ifle -> 167
    //   96: lload_3
    //   97: invokestatic b : (J)Ljava/lang/String;
    //   100: sipush #1620
    //   103: ldc2_w 5344527543925365829
    //   106: lload_1
    //   107: lxor
    //   108: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   113: invokevirtual equals : (Ljava/lang/Object;)Z
    //   116: ifeq -> 150
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: aload #9
    //   128: invokevirtual getWatchableCollectionModifier : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   131: iconst_0
    //   132: aload_0
    //   133: getfield l : Lcom/comphenix/protocol/wrappers/WrappedDataWatcher;
    //   136: invokevirtual getWatchableObjects : ()Ljava/util/List;
    //   139: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: pop
    //   150: aload_0
    //   151: getfield g : Lorg/bukkit/entity/Player;
    //   154: lload #5
    //   156: dup2_x1
    //   157: pop2
    //   158: iload #7
    //   160: i2b
    //   161: swap
    //   162: aload #9
    //   164: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   167: return
    // Exception table:
    //   from	to	target	type
    //   53	83	86	java/lang/RuntimeException
    //   74	119	122	java/lang/RuntimeException
    //   90	142	145	java/lang/RuntimeException
  }
  
  public void b(boolean paramBoolean, long paramLong) {
    paramLong = c ^ paramLong;
    long l1 = paramLong ^ 0x38FEA631946EL;
    long l2 = paramLong ^ 0x254010673747L;
    long l3 = paramLong ^ 0x7F9614C93A1BL;
    this.w = paramBoolean;
    b(0, l3, Byte.valueOf(b(l1)), Byte.class);
    j(l2);
  }
  
  public int b() {
    return this.t;
  }
  
  public void b(float paramFloat, long paramLong) {
    paramLong = c ^ paramLong;
    long l = (paramLong ^ 0xA3114B22867L) >>> 8L;
    int i = (int)((paramLong ^ 0xA3114B22867L) << 56L >>> 56L);
    paramLong ^ 0xA3114B22867L;
    PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.ENTITY_HEAD_ROTATION);
    packetContainer.getIntegers().write(0, Integer.valueOf(this.t));
    packetContainer.getBytes().write(0, Byte.valueOf(b(paramFloat)));
    v.b(l, (byte)i, this.g, packetContainer);
  }
  
  public UUID b() {
    return this.x;
  }
  
  public void b(@NotNull Location paramLocation, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/f.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 17745178883284
    //   11: lxor
    //   12: lstore #5
    //   14: dup2
    //   15: ldc2_w 63241965968348
    //   18: lxor
    //   19: lstore #7
    //   21: dup2
    //   22: ldc2_w 9243114903521
    //   25: lxor
    //   26: dup2
    //   27: bipush #8
    //   29: lushr
    //   30: lstore #9
    //   32: dup2
    //   33: bipush #56
    //   35: lshl
    //   36: bipush #56
    //   38: lushr
    //   39: l2i
    //   40: istore #11
    //   42: pop2
    //   43: dup2
    //   44: ldc2_w 102875788410315
    //   47: lxor
    //   48: lstore #12
    //   50: dup2
    //   51: ldc2_w 129446598720544
    //   54: lxor
    //   55: lstore #14
    //   57: pop2
    //   58: invokestatic a : ()I
    //   61: istore #16
    //   63: aload_0
    //   64: getfield r : I
    //   67: iload #16
    //   69: ifne -> 143
    //   72: ifle -> 140
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: aload_0
    //   83: dup
    //   84: getfield r : I
    //   87: iconst_1
    //   88: isub
    //   89: putfield r : I
    //   92: aload_0
    //   93: getfield r : I
    //   96: iload #16
    //   98: lload_2
    //   99: lconst_0
    //   100: lcmp
    //   101: ifle -> 145
    //   104: ifne -> 143
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: ifgt -> 140
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload_0
    //   125: ldc_w 20.0
    //   128: lload #12
    //   130: invokevirtual j : (FJ)V
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: invokestatic b : ()I
    //   143: bipush #8
    //   145: if_icmple -> 158
    //   148: ldc2_w 8.0
    //   151: goto -> 161
    //   154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   157: athrow
    //   158: ldc2_w 4.0
    //   161: dstore #17
    //   163: aload_1
    //   164: invokevirtual getX : ()D
    //   167: aload_0
    //   168: getfield s : Lorg/bukkit/Location;
    //   171: invokevirtual getX : ()D
    //   174: dsub
    //   175: invokestatic abs : (D)D
    //   178: aload_1
    //   179: invokevirtual getY : ()D
    //   182: aload_0
    //   183: getfield s : Lorg/bukkit/Location;
    //   186: invokevirtual getY : ()D
    //   189: dsub
    //   190: invokestatic abs : (D)D
    //   193: dadd
    //   194: aload_1
    //   195: invokevirtual getZ : ()D
    //   198: aload_0
    //   199: getfield s : Lorg/bukkit/Location;
    //   202: invokevirtual getZ : ()D
    //   205: dsub
    //   206: invokestatic abs : (D)D
    //   209: dadd
    //   210: dstore #19
    //   212: aload_1
    //   213: aload_0
    //   214: getfield s : Lorg/bukkit/Location;
    //   217: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   220: ldc2_w 0.62
    //   223: dcmpl
    //   224: iload #16
    //   226: lload_2
    //   227: lconst_0
    //   228: lcmp
    //   229: iflt -> 265
    //   232: ifne -> 263
    //   235: ifle -> 258
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   244: athrow
    //   245: aload_0
    //   246: lload #5
    //   248: invokevirtual p : (J)V
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: dload #19
    //   260: dload #17
    //   262: dcmpl
    //   263: iload #16
    //   265: lload_2
    //   266: lconst_0
    //   267: lcmp
    //   268: ifle -> 332
    //   271: ifne -> 330
    //   274: ifle -> 311
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   283: athrow
    //   284: aload_0
    //   285: aload_1
    //   286: lload #14
    //   288: iload #4
    //   290: invokevirtual j : (Lorg/bukkit/Location;JZ)V
    //   293: lload_2
    //   294: lconst_0
    //   295: lcmp
    //   296: iflt -> 1297
    //   299: iload #16
    //   301: ifeq -> 1289
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   310: athrow
    //   311: aload_0
    //   312: getfield s : Lorg/bukkit/Location;
    //   315: invokevirtual getYaw : ()F
    //   318: aload_1
    //   319: invokevirtual getYaw : ()F
    //   322: fcmpl
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: iload #16
    //   332: ifne -> 380
    //   335: ifne -> 379
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   344: athrow
    //   345: aload_0
    //   346: getfield s : Lorg/bukkit/Location;
    //   349: invokevirtual getPitch : ()F
    //   352: aload_1
    //   353: invokevirtual getPitch : ()F
    //   356: fcmpl
    //   357: iload #16
    //   359: ifne -> 380
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   368: athrow
    //   369: ifeq -> 383
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   378: athrow
    //   379: iconst_1
    //   380: goto -> 384
    //   383: iconst_0
    //   384: istore #21
    //   386: aload_0
    //   387: getfield s : Lorg/bukkit/Location;
    //   390: invokevirtual getX : ()D
    //   393: aload_1
    //   394: invokevirtual getX : ()D
    //   397: dcmpl
    //   398: iload #16
    //   400: ifne -> 482
    //   403: ifne -> 481
    //   406: goto -> 413
    //   409: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   412: athrow
    //   413: aload_0
    //   414: getfield s : Lorg/bukkit/Location;
    //   417: invokevirtual getY : ()D
    //   420: aload_1
    //   421: invokevirtual getY : ()D
    //   424: dcmpl
    //   425: iload #16
    //   427: ifne -> 482
    //   430: goto -> 437
    //   433: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   436: athrow
    //   437: ifne -> 481
    //   440: goto -> 447
    //   443: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   446: athrow
    //   447: aload_0
    //   448: getfield s : Lorg/bukkit/Location;
    //   451: invokevirtual getZ : ()D
    //   454: aload_1
    //   455: invokevirtual getZ : ()D
    //   458: dcmpl
    //   459: iload #16
    //   461: ifne -> 482
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   470: athrow
    //   471: ifeq -> 485
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   480: athrow
    //   481: iconst_1
    //   482: goto -> 486
    //   485: iconst_0
    //   486: istore #22
    //   488: iload #21
    //   490: iload #16
    //   492: ifne -> 507
    //   495: ifne -> 510
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   504: athrow
    //   505: iload #22
    //   507: ifeq -> 1289
    //   510: aconst_null
    //   511: astore #23
    //   513: iload #22
    //   515: iload #16
    //   517: ifne -> 532
    //   520: ifeq -> 540
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   529: athrow
    //   530: iload #21
    //   532: ifne -> 540
    //   535: getstatic com/comphenix/protocol/PacketType$Play$Server.REL_ENTITY_MOVE : Lcom/comphenix/protocol/PacketType;
    //   538: astore #23
    //   540: iload #22
    //   542: iload #16
    //   544: ifne -> 594
    //   547: ifeq -> 592
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   556: athrow
    //   557: iload #21
    //   559: iload #16
    //   561: lload_2
    //   562: lconst_0
    //   563: lcmp
    //   564: ifle -> 596
    //   567: ifne -> 594
    //   570: goto -> 577
    //   573: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   576: athrow
    //   577: ifeq -> 592
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   586: athrow
    //   587: getstatic com/comphenix/protocol/PacketType$Play$Server.REL_ENTITY_MOVE_LOOK : Lcom/comphenix/protocol/PacketType;
    //   590: astore #23
    //   592: iload #22
    //   594: iload #16
    //   596: ifne -> 611
    //   599: ifne -> 619
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   608: athrow
    //   609: iload #21
    //   611: ifeq -> 619
    //   614: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_LOOK : Lcom/comphenix/protocol/PacketType;
    //   617: astore #23
    //   619: new com/comphenix/protocol/events/PacketContainer
    //   622: dup
    //   623: aload #23
    //   625: invokespecial <init> : (Lcom/comphenix/protocol/PacketType;)V
    //   628: astore #24
    //   630: aload #24
    //   632: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   635: iconst_0
    //   636: aload_0
    //   637: getfield t : I
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   646: pop
    //   647: iload #22
    //   649: iload #16
    //   651: ifne -> 1135
    //   654: ifeq -> 1133
    //   657: goto -> 664
    //   660: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   663: athrow
    //   664: invokestatic b : ()I
    //   667: bipush #8
    //   669: iload #16
    //   671: lload_2
    //   672: lconst_0
    //   673: lcmp
    //   674: iflt -> 822
    //   677: ifne -> 820
    //   680: goto -> 687
    //   683: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   686: athrow
    //   687: lload_2
    //   688: lconst_0
    //   689: lcmp
    //   690: iflt -> 813
    //   693: if_icmpne -> 808
    //   696: goto -> 703
    //   699: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   702: athrow
    //   703: aload #24
    //   705: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   708: iconst_0
    //   709: aload_1
    //   710: invokevirtual getX : ()D
    //   713: ldc2_w 32.0
    //   716: dmul
    //   717: aload_0
    //   718: getfield s : Lorg/bukkit/Location;
    //   721: invokevirtual getX : ()D
    //   724: ldc2_w 32.0
    //   727: dmul
    //   728: dsub
    //   729: d2i
    //   730: i2b
    //   731: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   734: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   737: iconst_1
    //   738: aload_1
    //   739: invokevirtual getY : ()D
    //   742: ldc2_w 32.0
    //   745: dmul
    //   746: aload_0
    //   747: getfield s : Lorg/bukkit/Location;
    //   750: invokevirtual getY : ()D
    //   753: ldc2_w 32.0
    //   756: dmul
    //   757: dsub
    //   758: d2i
    //   759: i2b
    //   760: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   763: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   766: iconst_2
    //   767: aload_1
    //   768: invokevirtual getZ : ()D
    //   771: ldc2_w 32.0
    //   774: dmul
    //   775: aload_0
    //   776: getfield s : Lorg/bukkit/Location;
    //   779: invokevirtual getZ : ()D
    //   782: ldc2_w 32.0
    //   785: dmul
    //   786: dsub
    //   787: d2i
    //   788: i2b
    //   789: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   792: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   795: pop
    //   796: iload #16
    //   798: ifeq -> 1133
    //   801: goto -> 808
    //   804: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   807: athrow
    //   808: invokestatic b : ()I
    //   811: bipush #8
    //   813: goto -> 820
    //   816: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   819: athrow
    //   820: iload #16
    //   822: ifne -> 1018
    //   825: if_icmple -> 988
    //   828: goto -> 835
    //   831: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   834: athrow
    //   835: invokestatic b : ()I
    //   838: bipush #13
    //   840: lload_2
    //   841: lconst_0
    //   842: lcmp
    //   843: ifle -> 1018
    //   846: iload #16
    //   848: ifne -> 1018
    //   851: goto -> 858
    //   854: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   857: athrow
    //   858: lload_2
    //   859: lconst_0
    //   860: lcmp
    //   861: iflt -> 999
    //   864: if_icmpgt -> 988
    //   867: goto -> 874
    //   870: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   873: athrow
    //   874: aload #24
    //   876: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   879: iconst_1
    //   880: aload_1
    //   881: invokevirtual getX : ()D
    //   884: ldc2_w 32.0
    //   887: dmul
    //   888: aload_0
    //   889: getfield s : Lorg/bukkit/Location;
    //   892: invokevirtual getX : ()D
    //   895: ldc2_w 32.0
    //   898: dmul
    //   899: dsub
    //   900: ldc2_w 128.0
    //   903: dmul
    //   904: d2i
    //   905: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   908: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   911: iconst_2
    //   912: aload_1
    //   913: invokevirtual getY : ()D
    //   916: ldc2_w 32.0
    //   919: dmul
    //   920: aload_0
    //   921: getfield s : Lorg/bukkit/Location;
    //   924: invokevirtual getY : ()D
    //   927: ldc2_w 32.0
    //   930: dmul
    //   931: dsub
    //   932: ldc2_w 128.0
    //   935: dmul
    //   936: d2i
    //   937: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   940: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   943: iconst_3
    //   944: aload_1
    //   945: invokevirtual getZ : ()D
    //   948: ldc2_w 32.0
    //   951: dmul
    //   952: aload_0
    //   953: getfield s : Lorg/bukkit/Location;
    //   956: invokevirtual getZ : ()D
    //   959: ldc2_w 32.0
    //   962: dmul
    //   963: dsub
    //   964: ldc2_w 128.0
    //   967: dmul
    //   968: d2i
    //   969: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   972: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   975: pop
    //   976: iload #16
    //   978: ifeq -> 1133
    //   981: goto -> 988
    //   984: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   987: athrow
    //   988: invokestatic b : ()I
    //   991: lload_2
    //   992: lconst_0
    //   993: lcmp
    //   994: ifle -> 1135
    //   997: iload #16
    //   999: ifne -> 1135
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1008: athrow
    //   1009: bipush #14
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1017: athrow
    //   1018: if_icmplt -> 1133
    //   1021: aload #24
    //   1023: invokevirtual getShorts : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1026: iconst_0
    //   1027: aload_1
    //   1028: invokevirtual getX : ()D
    //   1031: ldc2_w 32.0
    //   1034: dmul
    //   1035: aload_0
    //   1036: getfield s : Lorg/bukkit/Location;
    //   1039: invokevirtual getX : ()D
    //   1042: ldc2_w 32.0
    //   1045: dmul
    //   1046: dsub
    //   1047: ldc2_w 128.0
    //   1050: dmul
    //   1051: d2i
    //   1052: i2s
    //   1053: invokestatic valueOf : (S)Ljava/lang/Short;
    //   1056: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1059: iconst_1
    //   1060: aload_1
    //   1061: invokevirtual getY : ()D
    //   1064: ldc2_w 32.0
    //   1067: dmul
    //   1068: aload_0
    //   1069: getfield s : Lorg/bukkit/Location;
    //   1072: invokevirtual getY : ()D
    //   1075: ldc2_w 32.0
    //   1078: dmul
    //   1079: dsub
    //   1080: ldc2_w 128.0
    //   1083: dmul
    //   1084: d2i
    //   1085: i2s
    //   1086: invokestatic valueOf : (S)Ljava/lang/Short;
    //   1089: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1092: iconst_2
    //   1093: aload_1
    //   1094: invokevirtual getZ : ()D
    //   1097: ldc2_w 32.0
    //   1100: dmul
    //   1101: aload_0
    //   1102: getfield s : Lorg/bukkit/Location;
    //   1105: invokevirtual getZ : ()D
    //   1108: ldc2_w 32.0
    //   1111: dmul
    //   1112: dsub
    //   1113: ldc2_w 128.0
    //   1116: dmul
    //   1117: d2i
    //   1118: i2s
    //   1119: invokestatic valueOf : (S)Ljava/lang/Short;
    //   1122: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1125: pop
    //   1126: goto -> 1133
    //   1129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1132: athrow
    //   1133: iload #21
    //   1135: ifeq -> 1247
    //   1138: aload #24
    //   1140: invokevirtual getBytes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1143: invokestatic b : ()I
    //   1146: iload #16
    //   1148: ifne -> 1178
    //   1151: goto -> 1158
    //   1154: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1157: athrow
    //   1158: bipush #8
    //   1160: if_icmple -> 1181
    //   1163: goto -> 1170
    //   1166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1169: athrow
    //   1170: iconst_0
    //   1171: goto -> 1178
    //   1174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1177: athrow
    //   1178: goto -> 1182
    //   1181: iconst_3
    //   1182: aload_1
    //   1183: invokevirtual getYaw : ()F
    //   1186: invokestatic b : (F)B
    //   1189: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   1192: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1195: invokestatic b : ()I
    //   1198: iload #16
    //   1200: lload_2
    //   1201: lconst_0
    //   1202: lcmp
    //   1203: ifle -> 1211
    //   1206: ifne -> 1229
    //   1209: bipush #8
    //   1211: if_icmple -> 1232
    //   1214: goto -> 1221
    //   1217: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1220: athrow
    //   1221: iconst_1
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1228: athrow
    //   1229: goto -> 1233
    //   1232: iconst_4
    //   1233: aload_1
    //   1234: invokevirtual getPitch : ()F
    //   1237: invokestatic b : (F)B
    //   1240: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   1243: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1246: pop
    //   1247: aload #24
    //   1249: invokevirtual getBooleans : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1252: iconst_0
    //   1253: iload #4
    //   1255: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1258: invokevirtual write : (ILjava/lang/Object;)Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1261: pop
    //   1262: aload_0
    //   1263: getfield g : Lorg/bukkit/entity/Player;
    //   1266: lload #9
    //   1268: dup2_x1
    //   1269: pop2
    //   1270: iload #11
    //   1272: i2b
    //   1273: swap
    //   1274: aload #24
    //   1276: invokestatic b : (JBLorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;)V
    //   1279: aload_0
    //   1280: aload_1
    //   1281: invokevirtual getYaw : ()F
    //   1284: lload #7
    //   1286: invokevirtual b : (FJ)V
    //   1289: aload_0
    //   1290: aload_1
    //   1291: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1294: putfield s : Lorg/bukkit/Location;
    //   1297: return
    // Exception table:
    //   from	to	target	type
    //   63	75	78	java/lang/RuntimeException
    //   72	107	110	java/lang/RuntimeException
    //   82	117	120	java/lang/RuntimeException
    //   114	133	136	java/lang/RuntimeException
    //   143	154	154	java/lang/RuntimeException
    //   212	238	241	java/lang/RuntimeException
    //   235	251	254	java/lang/RuntimeException
    //   263	277	280	java/lang/RuntimeException
    //   274	304	307	java/lang/RuntimeException
    //   284	323	326	java/lang/RuntimeException
    //   330	338	341	java/lang/RuntimeException
    //   335	362	365	java/lang/RuntimeException
    //   345	372	375	java/lang/RuntimeException
    //   386	406	409	java/lang/RuntimeException
    //   403	430	433	java/lang/RuntimeException
    //   413	440	443	java/lang/RuntimeException
    //   437	464	467	java/lang/RuntimeException
    //   447	474	477	java/lang/RuntimeException
    //   488	498	501	java/lang/RuntimeException
    //   513	523	526	java/lang/RuntimeException
    //   540	550	553	java/lang/RuntimeException
    //   547	570	573	java/lang/RuntimeException
    //   557	580	583	java/lang/RuntimeException
    //   594	602	605	java/lang/RuntimeException
    //   630	657	660	java/lang/RuntimeException
    //   654	680	683	java/lang/RuntimeException
    //   664	696	699	java/lang/RuntimeException
    //   687	801	804	java/lang/RuntimeException
    //   703	813	816	java/lang/RuntimeException
    //   820	828	831	java/lang/RuntimeException
    //   825	851	854	java/lang/RuntimeException
    //   835	867	870	java/lang/RuntimeException
    //   858	981	984	java/lang/RuntimeException
    //   874	1002	1005	java/lang/RuntimeException
    //   988	1011	1014	java/lang/RuntimeException
    //   1018	1126	1129	java/lang/RuntimeException
    //   1135	1151	1154	java/lang/RuntimeException
    //   1138	1163	1166	java/lang/RuntimeException
    //   1158	1171	1174	java/lang/RuntimeException
    //   1182	1214	1217	java/lang/RuntimeException
    //   1209	1222	1225	java/lang/RuntimeException
  }
  
  static {
    long l = c ^ 0x5B738F61535FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "º;\032³[VËíÜS\r³õS9ü\033\0045µ \\\020c \022¹£±ñ\027lDÎH`Å,è5iq[d\027\031\036~3").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public WrappedDataWatcher b() {
    return this.l;
  }
  
  public float b() {
    return this.i;
  }
  
  public f(Player paramPlayer, String paramString, UUID paramUUID, int paramInt, Location paramLocation) {
    this.g = paramPlayer;
    this.a = paramString;
    this.x = paramUUID;
    this.t = paramInt;
    this.s = paramLocation;
    this.i = 20.0F;
    this.v = false;
    this.z = 10 + (new Random()).nextInt(30);
    this.l = new WrappedDataWatcher();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x464E;
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
        throw new RuntimeException("me/rerere/matrix/internal/f", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/f'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */