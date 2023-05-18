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
import org.bukkit.Material;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public final class bi implements Listener {
  private static final long a = o3.a(-9030872012339324936L, 303901083420247275L, MethodHandles.lookup().lookupClass()).a(253751780308575L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  @EventHandler
  public final void b(@NotNull BlockPlaceEvent paramBlockPlaceEvent) {
    long l = a ^ 0x1F8C8A9072DDL;
    int i = yl.r();
    try {
      if (pd.a) {
        try {
          if (i != 0)
            try {
              if (paramBlockPlaceEvent.getBlockPlaced().getType() == Material.TNT) {
                paramBlockPlaceEvent.getBlockPlaced().setType(Material.AIR);
              } else {
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        TNTPrimed tNTPrimed = (TNTPrimed)paramBlockPlaceEvent.getBlockPlaced().getWorld().spawn(paramBlockPlaceEvent.getBlockPlaced().getLocation().clone().add(0.5D, 0.0D, 0.5D), TNTPrimed.class);
        tNTPrimed.setFuseTicks(15);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final void b(@NotNull PlayerInteractEvent paramPlayerInteractEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/bi.a : J
    //   3: ldc2_w 101916397514342
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: invokevirtual getAction : ()Lorg/bukkit/event/block/Action;
    //   17: getstatic org/bukkit/event/block/Action.LEFT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
    //   20: if_acmpne -> 226
    //   23: invokestatic b : ()I
    //   26: bipush #13
    //   28: if_icmplt -> 95
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: aload_1
    //   39: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   42: dup
    //   43: ifnull -> 86
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   58: dup
    //   59: ifnull -> 86
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: invokeinterface getAsString : ()Ljava/lang/String;
    //   74: iload #4
    //   76: ifne -> 181
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: pop
    //   87: aconst_null
    //   88: goto -> 181
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: new java/lang/StringBuilder
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: aload_1
    //   103: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   106: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   109: sipush #25993
    //   112: ldc2_w 8695403259605810798
    //   115: lload_2
    //   116: lxor
    //   117: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: iload #4
    //   127: ifeq -> 174
    //   130: aload_1
    //   131: invokevirtual getClickedBlock : ()Lorg/bukkit/block/Block;
    //   134: dup
    //   135: ifnull -> 173
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   144: athrow
    //   145: invokeinterface getState : ()Lorg/bukkit/block/BlockState;
    //   150: dup
    //   151: ifnull -> 173
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   160: athrow
    //   161: invokeinterface getData : ()Lorg/bukkit/material/MaterialData;
    //   166: goto -> 175
    //   169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   172: athrow
    //   173: pop
    //   174: aconst_null
    //   175: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: astore #5
    //   183: iload #4
    //   185: ifeq -> 209
    //   188: aload #5
    //   190: dup
    //   191: ifnonnull -> 222
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: pop
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   208: athrow
    //   209: sipush #24092
    //   212: ldc2_w 5704186410947626490
    //   215: lload_2
    //   216: lxor
    //   217: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   222: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   225: pop
    //   226: return
    // Exception table:
    //   from	to	target	type
    //   13	31	34	java/lang/RuntimeException
    //   23	46	49	java/lang/RuntimeException
    //   38	62	65	java/lang/RuntimeException
    //   53	79	82	java/lang/RuntimeException
    //   69	91	91	java/lang/RuntimeException
    //   95	138	141	java/lang/RuntimeException
    //   130	154	157	java/lang/RuntimeException
    //   145	169	169	java/lang/RuntimeException
    //   183	194	197	java/lang/RuntimeException
    //   188	202	205	java/lang/RuntimeException
  }
  
  @EventHandler
  public final void b(@NotNull EntityExplodeEvent paramEntityExplodeEvent) {
    long l = a ^ 0x8D2F9383311L;
    try {
      if (pd.a)
        paramEntityExplodeEvent.blockList().clear(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @EventHandler
  public final void b(@NotNull EntityDamageEvent paramEntityDamageEvent) {
    long l = a ^ 0x2E2E1842B25AL;
    int i = yl.r();
    try {
      if (pd.a) {
        try {
          if (i != 0)
            try {
              if (paramEntityDamageEvent.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
              
              } else {
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        paramEntityDamageEvent.setDamage(0.0D);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x6C05DDFE7BBBL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "\0366ï¦·]¡\003úÒÞ#\021½Ù\0208f®ð|\021%èX£3ÍêÓ3 ").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4F80;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/bi", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/bi'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */