package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public final class mn implements Listener {
  @NotNull
  private final Map v = new LinkedHashMap<>();
  
  @NotNull
  private final ho b = new ho(this);
  
  @NotNull
  private final om i;
  
  private static int a;
  
  private static final long c = o3.a(-5499125360004510776L, -4277419104676018867L, MethodHandles.lookup().lookupClass()).a(117488989681071L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public final void b(@NotNull Player paramPlayer) {
    long l1 = c ^ 0x49DE34619FAL;
    long l2 = l1 ^ 0x48626355ED28L;
    UUID uUID = paramPlayer.getUniqueId();
    yl yl = new yl(uUID, paramPlayer.getName(), l2);
    this.v.put(uUID, yl);
  }
  
  @Nullable
  public final yl b(@NotNull UUID paramUUID) {
    return (yl)this.v.get(paramUUID);
  }
  
  @NotNull
  public final Map b() {
    return this.v;
  }
  
  @EventHandler
  public final void b(@NotNull PlayerJoinEvent paramPlayerJoinEvent) {
    long l = c ^ 0x270164ECFCE9L;
    int i = yl.r();
    Player player = paramPlayerJoinEvent.getPlayer();
    try {
      if (i != 0)
        try {
          if (!player.isOnline())
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (Bukkit.getPlayer(player.getUniqueId()) == null)
      return; 
    try {
      if (fc.i)
        b(player); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final void b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/mn.c : J
    //   3: ldc2_w 54226786753229
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 140136042173507
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 4378516703550
    //   19: lxor
    //   20: lstore #5
    //   22: dup2
    //   23: ldc2_w 121006000779942
    //   26: lxor
    //   27: dup2
    //   28: bipush #8
    //   30: lushr
    //   31: lstore #7
    //   33: dup2
    //   34: bipush #56
    //   36: lshl
    //   37: bipush #56
    //   39: lushr
    //   40: l2i
    //   41: istore #9
    //   43: pop2
    //   44: dup2
    //   45: ldc2_w 10227879479946
    //   48: lxor
    //   49: dup2
    //   50: bipush #48
    //   52: lushr
    //   53: l2i
    //   54: istore #10
    //   56: dup2
    //   57: bipush #16
    //   59: lshl
    //   60: bipush #48
    //   62: lushr
    //   63: l2i
    //   64: istore #11
    //   66: dup2
    //   67: bipush #32
    //   69: lshl
    //   70: bipush #32
    //   72: lushr
    //   73: l2i
    //   74: istore #12
    //   76: pop2
    //   77: pop2
    //   78: aload_0
    //   79: getfield v : Ljava/util/Map;
    //   82: invokeinterface values : ()Ljava/util/Collection;
    //   87: checkcast java/lang/Iterable
    //   90: astore #14
    //   92: invokestatic a : ()I
    //   95: nop
    //   96: iconst_0
    //   97: istore #15
    //   99: aload #14
    //   101: invokeinterface iterator : ()Ljava/util/Iterator;
    //   106: astore #16
    //   108: istore #13
    //   110: aload #16
    //   112: invokeinterface hasNext : ()Z
    //   117: ifeq -> 214
    //   120: aload #16
    //   122: invokeinterface next : ()Ljava/lang/Object;
    //   127: astore #17
    //   129: aload #17
    //   131: checkcast me/rerere/matrix/internal/yl
    //   134: astore #18
    //   136: iconst_0
    //   137: istore #19
    //   139: iload #13
    //   141: ifne -> 204
    //   144: aload #18
    //   146: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   149: iload #10
    //   151: i2c
    //   152: ldc_w me/rerere/matrix/internal/lj
    //   155: iload #11
    //   157: i2s
    //   158: iload #12
    //   160: invokevirtual b : (CLjava/lang/Class;SI)Lme/rerere/matrix/internal/zk;
    //   163: checkcast me/rerere/matrix/internal/lj
    //   166: iload #13
    //   168: ifne -> 270
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: dup
    //   179: ifnull -> 207
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   188: athrow
    //   189: lload #7
    //   191: iload #9
    //   193: i2b
    //   194: invokevirtual h : (JB)V
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   203: athrow
    //   204: goto -> 208
    //   207: pop
    //   208: nop
    //   209: iload #13
    //   211: ifeq -> 110
    //   214: nop
    //   215: aload_0
    //   216: getfield v : Ljava/util/Map;
    //   219: invokeinterface clear : ()V
    //   224: lload #5
    //   226: invokestatic b : (J)V
    //   229: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   232: checkcast java/lang/Iterable
    //   235: astore #14
    //   237: iconst_0
    //   238: istore #15
    //   240: aload #14
    //   242: invokeinterface iterator : ()Ljava/util/Iterator;
    //   247: astore #16
    //   249: aload #16
    //   251: invokeinterface hasNext : ()Z
    //   256: ifeq -> 302
    //   259: aload #16
    //   261: invokeinterface next : ()Ljava/lang/Object;
    //   266: astore #17
    //   268: aload #17
    //   270: checkcast org/bukkit/entity/Player
    //   273: astore #18
    //   275: iconst_0
    //   276: istore #19
    //   278: aload_0
    //   279: aload #18
    //   281: invokevirtual b : (Lorg/bukkit/entity/Player;)V
    //   284: nop
    //   285: iload #13
    //   287: ifne -> 310
    //   290: iload #13
    //   292: ifeq -> 249
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   301: athrow
    //   302: nop
    //   303: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   306: lload_3
    //   307: invokevirtual j : (J)V
    //   310: return
    // Exception table:
    //   from	to	target	type
    //   139	171	174	java/lang/RuntimeException
    //   144	182	185	java/lang/RuntimeException
    //   178	197	200	java/lang/RuntimeException
    //   278	295	298	java/lang/RuntimeException
  }
  
  public mn() {
    this.b.runTaskTimerAsynchronously((Plugin)Matrix.q.b(l2), 20L, 20L);
    this.i = new om();
    this.i.runTaskTimer((Plugin)Matrix.q.b(l2), 20L, 1L);
    j();
  }
  
  @EventHandler
  public final void b(@NotNull PlayerQuitEvent paramPlayerQuitEvent) {
    Player player = paramPlayerQuitEvent.getPlayer();
    this.v.remove(player.getUniqueId());
  }
  
  public final void b(@NotNull UUID paramUUID) {
    this.v.remove(paramUUID);
  }
  
  public static void k(int paramInt) {
    a = paramInt;
  }
  
  public static int n() {
    return a;
  }
  
  public static int w() {
    int i = n();
    try {
      if (i == 0)
        return 105; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    long l = c ^ 0x3B4263EBD852L;
    k(0);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "/ ¡&ê(öªW0f\nDð ¸B/,BPà8Á}á÷\007U\005Ì¼ç\nW\002ñë~T%º9¯õ{k\021\026S$oÌ \023[`'îñG`'}ïÚX+Ø#*×pôÆÙ\004OiÐêãÝ\025#").length();
    byte b2 = 56;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3494;
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
        throw new RuntimeException("me/rerere/matrix/internal/mn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/mn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\mn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */