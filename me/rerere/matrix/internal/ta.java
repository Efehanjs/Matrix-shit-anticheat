package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.entity.Vehicle;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

public class ta {
  private static final Predicate i;
  
  private static String a;
  
  private static final long b = o3.a(7510969440849231688L, 2382539999337541437L, MethodHandles.lookup().lookupClass()).a(76205570723763L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public static boolean b(Player paramPlayer, @NotNull Vehicle paramVehicle) {
    return ((Entity)paramVehicle.getPassengers().get(0)).equals(paramPlayer);
  }
  
  public static int b(@NotNull Player paramPlayer, int paramInt, @NotNull PotionEffectType paramPotionEffectType, short paramShort1, short paramShort2) {
    long l = (paramInt << 32L | paramShort1 << 48L >>> 32L | paramShort2 << 48L >>> 48L) ^ b;
    int i = (int)((l ^ 0x574BDD8E62BEL) >>> 32L);
    int j = (int)((l ^ 0x574BDD8E62BEL) << 32L >>> 48L);
    int k = (int)((l ^ 0x574BDD8E62BEL) << 48L >>> 48L);
    l ^ 0x574BDD8E62BEL;
    return Matrix.b().b().b(i, j, k).b(paramPlayer, paramPotionEffectType);
  }
  
  public static void p(@NotNull Player paramPlayer) {
    Bukkit.getScheduler().runTask((Plugin)Matrix.b(), paramPlayer::updateInventory);
  }
  
  public static boolean c(@NotNull Player paramPlayer, long paramLong) {
    paramLong = b ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (b.b() >= 14) {
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return (paramPlayer.getPose() == Pose.SWIMMING);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public static q b(@Nullable Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 106999288822571
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 58413111747516
    //   17: lxor
    //   18: dup2
    //   19: bipush #32
    //   21: lushr
    //   22: lstore #5
    //   24: dup2
    //   25: bipush #32
    //   27: lshl
    //   28: bipush #32
    //   30: lushr
    //   31: l2i
    //   32: istore #7
    //   34: pop2
    //   35: dup2
    //   36: ldc2_w 116334497964350
    //   39: lxor
    //   40: dup2
    //   41: bipush #48
    //   43: lushr
    //   44: l2i
    //   45: istore #8
    //   47: dup2
    //   48: bipush #16
    //   50: lshl
    //   51: bipush #16
    //   53: lushr
    //   54: lstore #9
    //   56: pop2
    //   57: pop2
    //   58: invokestatic a : ()I
    //   61: istore #11
    //   63: aload_0
    //   64: ifnonnull -> 95
    //   67: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   70: sipush #16385
    //   73: ldc2_w 189999233638869780
    //   76: lload_1
    //   77: lxor
    //   78: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   83: invokevirtual println : (Ljava/lang/String;)V
    //   86: lload_3
    //   87: invokestatic b : (J)Lme/rerere/matrix/internal/q;
    //   90: areturn
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   98: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   101: aload_0
    //   102: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   107: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   110: astore #12
    //   112: iload #11
    //   114: ifne -> 155
    //   117: aload #12
    //   119: ifnonnull -> 160
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   132: sipush #30407
    //   135: ldc2_w 471762960936705488
    //   138: lload_1
    //   139: lxor
    //   140: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   145: invokevirtual println : (Ljava/lang/String;)V
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: lload_3
    //   156: invokestatic b : (J)Lme/rerere/matrix/internal/q;
    //   159: areturn
    //   160: invokestatic b : ()Z
    //   163: iload #11
    //   165: lload_1
    //   166: lconst_0
    //   167: lcmp
    //   168: iflt -> 198
    //   171: ifne -> 196
    //   174: ifeq -> 292
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload #12
    //   186: invokevirtual b : ()I
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: iload #11
    //   198: lload_1
    //   199: lconst_0
    //   200: lcmp
    //   201: iflt -> 208
    //   204: ifne -> 284
    //   207: iconst_m1
    //   208: if_icmpne -> 279
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload #12
    //   220: iload #8
    //   222: i2c
    //   223: lload #9
    //   225: aload_0
    //   226: invokestatic b : (CJLorg/bukkit/entity/Player;)I
    //   229: invokevirtual p : (I)V
    //   232: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   235: new java/lang/StringBuilder
    //   238: dup
    //   239: invokespecial <init> : ()V
    //   242: sipush #20253
    //   245: ldc2_w 1254590422392906763
    //   248: lload_1
    //   249: lxor
    //   250: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: aload #12
    //   260: invokevirtual b : ()I
    //   263: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   266: invokevirtual toString : ()Ljava/lang/String;
    //   269: invokevirtual println : (Ljava/lang/String;)V
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: aload #12
    //   281: invokevirtual b : ()I
    //   284: lload #5
    //   286: iload #7
    //   288: invokestatic b : (IJI)Lme/rerere/matrix/internal/q;
    //   291: areturn
    //   292: lload_3
    //   293: invokestatic b : (J)Lme/rerere/matrix/internal/q;
    //   296: areturn
    // Exception table:
    //   from	to	target	type
    //   63	91	91	java/lang/RuntimeException
    //   112	122	125	java/lang/RuntimeException
    //   117	148	151	java/lang/RuntimeException
    //   160	177	180	java/lang/RuntimeException
    //   174	189	192	java/lang/RuntimeException
    //   196	211	214	java/lang/RuntimeException
    //   207	272	275	java/lang/RuntimeException
  }
  
  public static Optional b(char paramChar, long paramLong, @NotNull Player paramPlayer) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_1
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/ta.b : J
    //   16: lxor
    //   17: lstore #4
    //   19: invokestatic a : ()I
    //   22: istore #6
    //   24: aload_3
    //   25: iload #6
    //   27: ifne -> 90
    //   30: sipush #7551
    //   33: ldc2_w 3171801518063572704
    //   36: lload #4
    //   38: lxor
    //   39: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   44: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   47: pop
    //   48: invokestatic b : ()I
    //   51: bipush #8
    //   53: if_icmpne -> 82
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: aload_3
    //   64: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   69: astore #7
    //   71: lload_1
    //   72: lconst_0
    //   73: lcmp
    //   74: iflt -> 102
    //   77: iload #6
    //   79: ifeq -> 102
    //   82: aload_3
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   95: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   100: astore #7
    //   102: aload #7
    //   104: iload #6
    //   106: ifne -> 135
    //   109: invokevirtual getType : ()Lorg/bukkit/Material;
    //   112: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   115: if_acmpne -> 133
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: invokestatic empty : ()Ljava/util/Optional;
    //   128: areturn
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload #7
    //   135: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   138: areturn
    // Exception table:
    //   from	to	target	type
    //   24	56	59	java/lang/RuntimeException
    //   71	83	86	java/lang/RuntimeException
    //   102	118	121	java/lang/RuntimeException
    //   109	129	129	java/lang/RuntimeException
  }
  
  public static float b(int paramInt1, @NotNull Player paramPlayer, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramInt2 << 32L >>> 32L) ^ b;
    long l2 = l1 ^ 0x7B92DE96D8B5L;
    int i = (int)((l1 ^ 0x324D11AD8B3AL) >>> 32L);
    int j = (int)((l1 ^ 0x324D11AD8B3AL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x324D11AD8B3AL) << 48L >>> 48L);
    l1 ^ 0x324D11AD8B3AL;
    return Matrix.b().b().b(i, j, k).b((LivingEntity)paramPlayer, l2);
  }
  
  public static boolean i(long paramLong, @NotNull Player paramPlayer) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic r : ()I
    //   9: istore_3
    //   10: invokestatic b : ()I
    //   13: iload_3
    //   14: ifeq -> 105
    //   17: bipush #9
    //   19: if_icmplt -> 104
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_2
    //   30: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   35: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
    //   40: lload_0
    //   41: lconst_0
    //   42: lcmp
    //   43: iflt -> 85
    //   46: iload_3
    //   47: ifeq -> 85
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: ifnull -> 102
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: aload_2
    //   68: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   73: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: invokevirtual getType : ()Lorg/bukkit/Material;
    //   88: getstatic org/bukkit/Material.ELYTRA : Lorg/bukkit/Material;
    //   91: if_acmpne -> 102
    //   94: iconst_1
    //   95: goto -> 103
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: iconst_0
    //   103: ireturn
    //   104: iconst_0
    //   105: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	22	25	java/lang/RuntimeException
    //   17	50	53	java/lang/RuntimeException
    //   29	60	63	java/lang/RuntimeException
    //   57	78	81	java/lang/RuntimeException
    //   85	98	98	java/lang/RuntimeException
  }
  
  public static boolean t(int paramInt1, short paramShort, @NotNull Player paramPlayer, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramShort << 48L >>> 32L | paramInt2 << 48L >>> 48L) ^ b;
    long l2 = l1 ^ 0x6A2861D1CBBAL;
    int i = yl.r();
    try {
      if (i != 0)
        if (b.b() >= 9) {
          yl yl = Matrix.b().b().b(paramPlayer.getUniqueId());
          try {
            if (i != 0) {
              if (yl != null)
                return yl.h(); 
            } else {
              return yl.h();
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return p(l2, paramPlayer);
  }
  
  public static int j(@NotNull Player paramPlayer, char paramChar, long paramLong) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_2
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/ta.b : J
    //   16: lxor
    //   17: lstore #4
    //   19: aload_0
    //   20: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   25: invokeinterface getArmorContents : ()[Lorg/bukkit/inventory/ItemStack;
    //   30: astore #7
    //   32: invokestatic r : ()I
    //   35: aload #7
    //   37: astore #8
    //   39: istore #6
    //   41: aload #8
    //   43: arraylength
    //   44: istore #9
    //   46: iconst_0
    //   47: istore #10
    //   49: iload #10
    //   51: iload #9
    //   53: if_icmpge -> 219
    //   56: aload #8
    //   58: iload #10
    //   60: aaload
    //   61: astore #11
    //   63: iload #6
    //   65: lload_2
    //   66: lconst_0
    //   67: lcmp
    //   68: ifle -> 216
    //   71: ifeq -> 214
    //   74: aload #11
    //   76: ifnull -> 211
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: aload #11
    //   88: lload_2
    //   89: lconst_0
    //   90: lcmp
    //   91: ifle -> 131
    //   94: iload #6
    //   96: ifeq -> 131
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: invokevirtual getType : ()Lorg/bukkit/Material;
    //   109: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   112: if_acmpeq -> 211
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload #11
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: invokevirtual hasItemMeta : ()Z
    //   134: iload #6
    //   136: lload_2
    //   137: lconst_0
    //   138: lcmp
    //   139: iflt -> 177
    //   142: ifeq -> 175
    //   145: ifeq -> 211
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: aload #11
    //   157: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   160: getstatic org/bukkit/enchantments/Enchantment.DEPTH_STRIDER : Lorg/bukkit/enchantments/Enchantment;
    //   163: invokeinterface hasEnchant : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: iload #6
    //   177: ifeq -> 210
    //   180: ifeq -> 211
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: aload #11
    //   192: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   195: getstatic org/bukkit/enchantments/Enchantment.DEPTH_STRIDER : Lorg/bukkit/enchantments/Enchantment;
    //   198: invokeinterface getEnchantLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   209: athrow
    //   210: ireturn
    //   211: iinc #10, 1
    //   214: iload #6
    //   216: ifne -> 49
    //   219: iconst_m1
    //   220: ireturn
    // Exception table:
    //   from	to	target	type
    //   63	79	82	java/lang/RuntimeException
    //   74	99	102	java/lang/RuntimeException
    //   86	115	118	java/lang/RuntimeException
    //   106	124	127	java/lang/RuntimeException
    //   131	148	151	java/lang/RuntimeException
    //   145	168	171	java/lang/RuntimeException
    //   175	183	186	java/lang/RuntimeException
    //   180	203	206	java/lang/RuntimeException
  }
  
  @NotNull
  public static Set b(long paramLong, @NotNull Collection paramCollection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: new java/util/HashSet
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #4
    //   15: invokestatic a : ()I
    //   18: aload_2
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore #5
    //   26: istore_3
    //   27: aload #5
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 89
    //   37: aload #5
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast org/bukkit/potion/PotionEffect
    //   47: astore #6
    //   49: lload_0
    //   50: lconst_0
    //   51: lcmp
    //   52: iflt -> 72
    //   55: aload #4
    //   57: iload_3
    //   58: ifne -> 91
    //   61: aload #6
    //   63: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: iload_3
    //   73: ifeq -> 27
    //   76: lload_0
    //   77: lconst_0
    //   78: lcmp
    //   79: iflt -> 49
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload #4
    //   91: areturn
    // Exception table:
    //   from	to	target	type
    //   49	76	85	java/lang/RuntimeException
  }
  
  public static boolean h(@NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic a : ()I
    //   9: istore_3
    //   10: invokestatic b : ()I
    //   13: iload_3
    //   14: ifne -> 42
    //   17: bipush #8
    //   19: if_icmpne -> 35
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: iconst_0
    //   30: ireturn
    //   31: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: invokestatic j : ()D
    //   38: ldc2_w 10.0
    //   41: dcmpg
    //   42: iload_3
    //   43: ifne -> 57
    //   46: ifge -> 58
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: iconst_0
    //   57: ireturn
    //   58: aload_0
    //   59: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   64: astore #4
    //   66: aload_0
    //   67: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   72: ldc2_w 2.0
    //   75: invokestatic j : (Lorg/bukkit/Location;D)Ljava/util/Set;
    //   78: invokeinterface iterator : ()Ljava/util/Iterator;
    //   83: astore #5
    //   85: aload #5
    //   87: invokeinterface hasNext : ()Z
    //   92: ifeq -> 227
    //   95: aload #5
    //   97: invokeinterface next : ()Ljava/lang/Object;
    //   102: checkcast org/bukkit/entity/Entity
    //   105: astore #6
    //   107: aload #6
    //   109: invokeinterface getEntityId : ()I
    //   114: lload_1
    //   115: lconst_0
    //   116: lcmp
    //   117: iflt -> 228
    //   120: iload_3
    //   121: lload_1
    //   122: lconst_0
    //   123: lcmp
    //   124: iflt -> 131
    //   127: ifne -> 228
    //   130: iload_3
    //   131: lload_1
    //   132: lconst_0
    //   133: lcmp
    //   134: ifle -> 176
    //   137: ifne -> 175
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   146: athrow
    //   147: aload_0
    //   148: invokeinterface getEntityId : ()I
    //   153: if_icmpne -> 170
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: goto -> 85
    //   166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   169: athrow
    //   170: aload #6
    //   172: instanceof org/bukkit/entity/LivingEntity
    //   175: iload_3
    //   176: ifne -> 216
    //   179: ifne -> 215
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: aload #6
    //   191: instanceof org/bukkit/entity/Boat
    //   194: iload_3
    //   195: ifne -> 216
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   204: athrow
    //   205: ifeq -> 217
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: iconst_1
    //   216: ireturn
    //   217: iload_3
    //   218: lload_1
    //   219: lconst_0
    //   220: lcmp
    //   221: iflt -> 92
    //   224: ifeq -> 85
    //   227: iconst_0
    //   228: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	22	25	java/lang/RuntimeException
    //   17	31	31	java/lang/RuntimeException
    //   42	49	52	java/lang/RuntimeException
    //   107	140	143	java/lang/RuntimeException
    //   130	156	159	java/lang/RuntimeException
    //   147	166	166	java/lang/RuntimeException
    //   175	182	185	java/lang/RuntimeException
    //   179	198	201	java/lang/RuntimeException
    //   189	208	211	java/lang/RuntimeException
  }
  
  public static boolean b(long paramLong, @NotNull Location paramLocation) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: aload_2
    //   7: invokevirtual clone : ()Lorg/bukkit/Location;
    //   10: astore #4
    //   12: invokestatic r : ()I
    //   15: aload #4
    //   17: invokevirtual getBlockY : ()I
    //   20: istore #5
    //   22: istore_3
    //   23: iload #5
    //   25: getstatic me/rerere/matrix/internal/na.i : I
    //   28: if_icmplt -> 102
    //   31: aload #4
    //   33: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   36: aload #4
    //   38: invokevirtual getBlockX : ()I
    //   41: iload #5
    //   43: aload #4
    //   45: invokevirtual getBlockZ : ()I
    //   48: invokestatic j : (Lorg/bukkit/World;III)Lorg/bukkit/Material;
    //   51: astore #6
    //   53: iload_3
    //   54: lload_0
    //   55: lconst_0
    //   56: lcmp
    //   57: iflt -> 99
    //   60: ifeq -> 98
    //   63: aload #6
    //   65: invokestatic r : (Lorg/bukkit/Material;)Z
    //   68: iload_3
    //   69: ifeq -> 103
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: ifne -> 95
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: iconst_0
    //   90: ireturn
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: iinc #5, -1
    //   98: iload_3
    //   99: ifne -> 23
    //   102: iconst_1
    //   103: ireturn
    // Exception table:
    //   from	to	target	type
    //   53	72	75	java/lang/RuntimeException
    //   63	82	85	java/lang/RuntimeException
    //   79	91	91	java/lang/RuntimeException
  }
  
  public static void j(@NotNull Player paramPlayer, long paramLong) {
    paramLong = b ^ paramLong;
    Location location1 = paramPlayer.getLocation().clone();
    Location location2 = null;
    int j = location1.getBlockY();
    int i = yl.r();
    while (j >= na.i) {
      Material material = na.j(location1.getWorld(), location1.getBlockX(), j, location1.getBlockZ());
      try {
        if (paramLong >= 0L)
          if (i != 0) {
          
          } else {
            continue;
          }  
        if (!da.r(material)) {
          location2 = new Location(location1.getWorld(), location1.getBlockX() + 0.5D, (j + 1), location1.getBlockZ() + 0.5D);
          break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      j--;
    } 
    try {
      if (i != 0)
        if (location2 == null)
          location2 = new Location(location1.getWorld(), location1.getBlockX(), -10.0D, location1.getBlockZ());  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    double d = Math.abs(location1.getY() - location2.getY());
    paramPlayer.setFallDistance((float)(paramPlayer.getFallDistance() + d));
    paramPlayer.teleport(location2);
  }
  
  public static int b(long paramLong, @NotNull Player paramPlayer, @NotNull Enchantment paramEnchantment) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: iconst_0
    //   7: istore #5
    //   9: aload_2
    //   10: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   15: invokeinterface getArmorContents : ()[Lorg/bukkit/inventory/ItemStack;
    //   20: astore #6
    //   22: aload #6
    //   24: arraylength
    //   25: istore #7
    //   27: invokestatic a : ()I
    //   30: iconst_0
    //   31: istore #8
    //   33: istore #4
    //   35: iload #8
    //   37: iload #7
    //   39: if_icmpge -> 185
    //   42: aload #6
    //   44: iload #8
    //   46: aaload
    //   47: astore #9
    //   49: iload #4
    //   51: lload_0
    //   52: lconst_0
    //   53: lcmp
    //   54: ifle -> 182
    //   57: ifne -> 180
    //   60: aload #9
    //   62: ifnull -> 177
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: aload #9
    //   74: invokevirtual hasItemMeta : ()Z
    //   77: iload #4
    //   79: lload_0
    //   80: lconst_0
    //   81: lcmp
    //   82: iflt -> 144
    //   85: ifne -> 142
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: ifeq -> 177
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload #9
    //   107: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   110: sipush #188
    //   113: ldc2_w 7118508144450411302
    //   116: lload_0
    //   117: lxor
    //   118: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   123: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   126: checkcast org/bukkit/inventory/meta/ItemMeta
    //   129: aload_3
    //   130: invokeinterface hasEnchant : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: iload #4
    //   144: ifne -> 175
    //   147: ifeq -> 177
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: iload #5
    //   159: aload #9
    //   161: aload_3
    //   162: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   165: invokestatic max : (II)I
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: istore #5
    //   177: iinc #8, 1
    //   180: iload #4
    //   182: ifeq -> 35
    //   185: iload #5
    //   187: ireturn
    // Exception table:
    //   from	to	target	type
    //   49	65	68	java/lang/RuntimeException
    //   60	88	91	java/lang/RuntimeException
    //   72	98	101	java/lang/RuntimeException
    //   95	135	138	java/lang/RuntimeException
    //   142	150	153	java/lang/RuntimeException
    //   147	168	171	java/lang/RuntimeException
  }
  
  @NotNull
  public static Set b(@NotNull Location paramLocation, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: new java/util/HashSet
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #4
    //   15: invokestatic a : ()I
    //   18: aload_0
    //   19: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   22: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast org/bukkit/World
    //   28: invokeinterface getPlayers : ()Ljava/util/List;
    //   33: invokeinterface iterator : ()Ljava/util/Iterator;
    //   38: astore #5
    //   40: istore_3
    //   41: aload #5
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 162
    //   51: aload #5
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast org/bukkit/entity/Player
    //   61: astore #6
    //   63: aload #6
    //   65: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   70: invokevirtual getY : ()D
    //   73: aload_0
    //   74: invokevirtual getY : ()D
    //   77: dsub
    //   78: invokestatic abs : (D)D
    //   81: ldc2_w 4.0
    //   84: dcmpg
    //   85: iload_3
    //   86: lload_1
    //   87: lconst_0
    //   88: lcmp
    //   89: ifle -> 128
    //   92: ifne -> 127
    //   95: ifgt -> 158
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: aload #6
    //   107: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   112: aload_0
    //   113: invokestatic p : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   116: ldc2_w 4.0
    //   119: dcmpg
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iload_3
    //   128: ifne -> 157
    //   131: ifgt -> 158
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: aload #4
    //   143: aload #6
    //   145: invokeinterface add : (Ljava/lang/Object;)Z
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: pop
    //   158: iload_3
    //   159: ifeq -> 41
    //   162: aload #4
    //   164: lload_1
    //   165: lconst_0
    //   166: lcmp
    //   167: iflt -> 58
    //   170: areturn
    // Exception table:
    //   from	to	target	type
    //   63	98	101	java/lang/RuntimeException
    //   95	120	123	java/lang/RuntimeException
    //   127	134	137	java/lang/RuntimeException
    //   131	150	153	java/lang/RuntimeException
  }
  
  public static void j(long paramLong, @NotNull Player paramPlayer, int paramInt, boolean paramBoolean) {
    long l1 = (paramLong << 32L | paramInt << 32L >>> 32L) ^ b;
    long l2 = l1 ^ 0xDD0ED9C4E06L;
    int i = (int)((l1 ^ 0x396553824423L) >>> 32L);
    int j = (int)((l1 ^ 0x396553824423L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x396553824423L) << 48L >>> 48L);
    l1 ^ 0x396553824423L;
    Matrix.b().b().b(i, j, k).b((Entity)paramPlayer, paramBoolean, l2);
  }
  
  public static void b(long paramLong, @NotNull Player paramPlayer) {
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x3F245ECA2E44L;
    int i = (int)((paramLong ^ 0x57FDE803AE65L) >>> 32L);
    int j = (int)((paramLong ^ 0x57FDE803AE65L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x57FDE803AE65L) << 48L >>> 48L);
    paramLong ^ 0x57FDE803AE65L;
    Matrix.b().b().b(i, j, k).b(paramPlayer, l);
  }
  
  public static boolean m(char paramChar, @NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_2
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/ta.b : J
    //   16: lxor
    //   17: lstore #4
    //   19: lload #4
    //   21: dup2
    //   22: ldc2_w 50780959863243
    //   25: lxor
    //   26: lstore #6
    //   28: dup2
    //   29: ldc2_w 39603027214547
    //   32: lxor
    //   33: dup2
    //   34: bipush #32
    //   36: lushr
    //   37: l2i
    //   38: istore #8
    //   40: dup2
    //   41: bipush #32
    //   43: lshl
    //   44: bipush #48
    //   46: lushr
    //   47: l2i
    //   48: istore #9
    //   50: dup2
    //   51: bipush #48
    //   53: lshl
    //   54: bipush #48
    //   56: lushr
    //   57: l2i
    //   58: istore #10
    //   60: pop2
    //   61: pop2
    //   62: invokestatic a : ()I
    //   65: istore #11
    //   67: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   70: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   73: iload #8
    //   75: iload #9
    //   77: iload #10
    //   79: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   82: aload_1
    //   83: invokeinterface b : (Lorg/bukkit/entity/Player;)Z
    //   88: istore #12
    //   90: iload #12
    //   92: iload #11
    //   94: ifne -> 108
    //   97: ifne -> 109
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: iconst_0
    //   108: ireturn
    //   109: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   112: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   115: iload #8
    //   117: iload #9
    //   119: iload #10
    //   121: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   124: astore #13
    //   126: invokestatic b : ()I
    //   129: iload #11
    //   131: iload_0
    //   132: iflt -> 213
    //   135: ifne -> 211
    //   138: bipush #8
    //   140: if_icmpne -> 191
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: aload_1
    //   151: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   156: astore #14
    //   158: aload #14
    //   160: invokevirtual getType : ()Lorg/bukkit/Material;
    //   163: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   166: if_acmpeq -> 189
    //   169: aload #13
    //   171: aload_1
    //   172: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   177: lload #6
    //   179: invokeinterface b : (Lorg/bukkit/inventory/ItemStack;J)Z
    //   184: ireturn
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: iconst_0
    //   190: ireturn
    //   191: aload #13
    //   193: aload_1
    //   194: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   199: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   204: lload #6
    //   206: invokeinterface b : (Lorg/bukkit/inventory/ItemStack;J)Z
    //   211: iload #11
    //   213: ifne -> 269
    //   216: ifne -> 268
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   225: athrow
    //   226: aload #13
    //   228: aload_1
    //   229: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   234: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   239: lload #6
    //   241: invokeinterface b : (Lorg/bukkit/inventory/ItemStack;J)Z
    //   246: iload #11
    //   248: ifne -> 269
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: ifeq -> 272
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: iconst_1
    //   269: goto -> 273
    //   272: iconst_0
    //   273: ireturn
    // Exception table:
    //   from	to	target	type
    //   90	100	103	java/lang/RuntimeException
    //   126	143	146	java/lang/RuntimeException
    //   158	185	185	java/lang/RuntimeException
    //   211	219	222	java/lang/RuntimeException
    //   216	251	254	java/lang/RuntimeException
    //   226	261	264	java/lang/RuntimeException
  }
  
  public static int b(@NotNull Player paramPlayer, short paramShort1, int paramInt, short paramShort2) {
    long l = (paramShort1 << 48L | paramInt << 32L >>> 16L | paramShort2 << 48L >>> 48L) ^ b;
    int i = yl.r();
    try {
      if (i != 0) {
        try {
          if (b.b() <= 15);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return b.b();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityEquipment entityEquipment = paramPlayer.getEquipment();
    try {
      if (i != 0)
        try {
          if (entityEquipment == null)
            return 0; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ItemStack itemStack = paramPlayer.getEquipment().getBoots();
    try {
      if (i != 0)
        try {
          if (itemStack == null)
            return 0; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return itemStack.getEnchantmentLevel(Enchantment.SOUL_SPEED);
  }
  
  public static boolean p(long paramLong, @NotNull Player paramPlayer) {
    paramLong = b ^ paramLong;
    int i = (int)((paramLong ^ 0x54963CCAEE68L) >>> 32L);
    int j = (int)((paramLong ^ 0x54963CCAEE68L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x54963CCAEE68L) << 48L >>> 48L);
    paramLong ^ 0x54963CCAEE68L;
    return Matrix.b().b().b(i, j, k).b((Entity)paramPlayer);
  }
  
  public static void b(long paramLong, @NotNull Player paramPlayer, boolean paramBoolean) {
    paramLong = b ^ paramLong;
    Location location1 = paramPlayer.getLocation().clone();
    Location location2 = null;
    int i = yl.a();
    for (int j = location1.getBlockY(); j >= na.i; j--) {
      Material material = na.j(location1.getWorld(), location1.getBlockX(), j, location1.getBlockZ());
      try {
        if (paramLong > 0L)
          if (i == 0) {
          
          } else {
            continue;
          }  
        if (!da.r(material)) {
          location2 = new Location(location1.getWorld(), location1.getBlockX() + 0.5D, (j + 1), location1.getBlockZ() + 0.5D);
          break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (i == 0)
        if (location2 == null)
          location2 = new Location(location1.getWorld(), location1.getBlockX(), -10.0D, location1.getBlockZ());  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    double d = Math.abs(location1.getY() - location2.getY());
    try {
      location2.setYaw(paramPlayer.getLocation().getYaw());
      location2.setPitch(paramPlayer.getLocation().getPitch());
      paramPlayer.setFallDistance((float)(paramPlayer.getFallDistance() + d));
      if (paramLong > 0L) {
        if (i == 0)
          try {
            if (paramBoolean)
              paramPlayer.damage(paramPlayer.getFallDistance()); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
        paramPlayer.teleport(location2);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static boolean j(long paramLong, Player paramPlayer) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ta.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic r : ()I
    //   9: istore_3
    //   10: invokestatic b : ()I
    //   13: bipush #14
    //   15: iload_3
    //   16: ifeq -> 109
    //   19: if_icmplt -> 87
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_2
    //   30: invokeinterface getPose : ()Lorg/bukkit/entity/Pose;
    //   35: astore #4
    //   37: aload #4
    //   39: getstatic org/bukkit/entity/Pose.STANDING : Lorg/bukkit/entity/Pose;
    //   42: lload_0
    //   43: lconst_0
    //   44: lcmp
    //   45: ifle -> 74
    //   48: iload_3
    //   49: ifeq -> 74
    //   52: if_acmpeq -> 77
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: aload #4
    //   64: getstatic org/bukkit/entity/Pose.SNEAKING : Lorg/bukkit/entity/Pose;
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: if_acmpne -> 85
    //   77: iconst_1
    //   78: goto -> 86
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: iconst_0
    //   86: ireturn
    //   87: invokestatic b : ()I
    //   90: iload_3
    //   91: lload_0
    //   92: lconst_0
    //   93: lcmp
    //   94: iflt -> 102
    //   97: ifeq -> 152
    //   100: bipush #8
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: lload_0
    //   110: lconst_0
    //   111: lcmp
    //   112: ifle -> 125
    //   115: if_icmple -> 151
    //   118: aload_2
    //   119: invokeinterface isGliding : ()Z
    //   124: iload_3
    //   125: ifeq -> 146
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: ifne -> 149
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: iconst_1
    //   146: goto -> 150
    //   149: iconst_0
    //   150: ireturn
    //   151: iconst_1
    //   152: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	22	25	java/lang/RuntimeException
    //   37	55	58	java/lang/RuntimeException
    //   52	67	70	java/lang/RuntimeException
    //   74	81	81	java/lang/RuntimeException
    //   87	102	105	java/lang/RuntimeException
    //   109	128	131	java/lang/RuntimeException
    //   118	138	141	java/lang/RuntimeException
  }
  
  static {
    long l = b ^ 0xB00B3FC400FL;
    D(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "uæ\000-ÓþûQ\"¶ç~AþòpcVB¦D´x\001v\020éàW6ødLá%Ä6Û:P8y¿s]Z\rñ\006ßæbÑ`\017¿vnÀºÖ¡@\026ý\":^|ôx^çziöd:Ö\034 c7Ä®\017d\bwîÄíÈô\017)ü¡8\022'Ã¢é'²±^NÍu²ºÏÏ<à³nÍ3PPÄÉ>àÉbyÀm+Æ\017êúÖ\006èíW]dá£*q\017Û[X2\017@N\006»#,RV¾\tÖ\024\"Pß¶­Þ)\0174\026(Ôl\000n+mIu= ý").length();
    byte b2 = 72;
    byte b = -1;
    while (true);
  }
  
  public static boolean b(char paramChar, @NotNull Player paramPlayer, int paramInt, short paramShort) {
    long l = (paramChar << 48L | paramInt << 32L >>> 16L | paramShort << 48L >>> 48L) ^ b;
    int i = yl.a();
    try {
      if (i == 0)
        if (b.b() >= 19) {
          ItemStack itemStack = paramPlayer.getInventory().getLeggings();
          try {
            if (i == 0) {
              try {
                if (itemStack != null);
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } else {
              return ((ItemMeta)itemStack).hasEnchant(Enchantment.SWIFT_SNEAK);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void D(String paramString) {
    a = paramString;
  }
  
  public static String W() {
    return a;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xFBE;
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
        throw new RuntimeException("me/rerere/matrix/internal/ta", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ta'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */