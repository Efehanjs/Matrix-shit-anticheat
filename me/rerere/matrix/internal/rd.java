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
import org.bukkit.event.inventory.InventoryClickEvent;

public final class rd extends zk {
  private static int k;
  
  private static boolean v;
  
  private long b;
  
  @NotNull
  public static final hd i;
  
  private static final long a = o3.a(2227186370869091463L, -1440156149846882126L, MethodHandles.lookup().lookupClass()).a(4059876461901L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rd.a : J
    //   3: ldc2_w 118212985525777
    //   6: lxor
    //   7: lstore_1
    //   8: getstatic me/rerere/matrix/internal/rd.i : Lme/rerere/matrix/internal/hd;
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   16: sipush #14676
    //   19: ldc2_w 8085598686309307823
    //   22: lload_1
    //   23: lxor
    //   24: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   29: iconst_1
    //   30: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   35: putstatic me/rerere/matrix/internal/rd.v : Z
    //   38: getstatic me/rerere/matrix/internal/rd.i : Lme/rerere/matrix/internal/hd;
    //   41: pop
    //   42: aload_0
    //   43: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   46: sipush #28345
    //   49: ldc2_w 271133972002800196
    //   52: lload_1
    //   53: lxor
    //   54: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   59: iconst_1
    //   60: invokeinterface getInt : (Ljava/lang/String;I)I
    //   65: putstatic me/rerere/matrix/internal/rd.k : I
    //   68: return
  }
  
  static {
    long l = a ^ 0x287C4267C945L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "ï¹*ëèå\027\013?0\023KØ*òÛôÓá\003bä S\026±N\"V»{D\013\031¯Çî\031ämd·\034j^KwtZóõ\013pÐn¡ý\bðjèÅ\016|OJ  4¤dGà\030¬\023^/8\034À÷\020Ûrà©n.=qáÿ\024¾\\ X³H7\004¥\023¿³êAÙBoý¼Õ@dOÁßÛ­v ôl(´ ì©Ñ.³i\004vñÿ\017À8$%T_QôVöt\007\n\017Ç 9p\022'Y\020×Ü\005\001\007\020\035\027EeBGlx\030UîÏJ\féÐ­jÿrfÔ\016¯»L¡\020").length();
    byte b2 = 96;
    byte b = -1;
    while (true);
  }
  
  public rd(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.u);
  }
  
  public void b(@NotNull InventoryClickEvent paramInventoryClickEvent, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 125432712143003
    //   5: lxor
    //   6: lstore #4
    //   8: pop2
    //   9: getstatic me/rerere/matrix/internal/rd.k : I
    //   12: ifge -> 20
    //   15: return
    //   16: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   19: athrow
    //   20: aload_1
    //   21: invokevirtual getClickedInventory : ()Lorg/bukkit/inventory/Inventory;
    //   24: ifnonnull -> 32
    //   27: return
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aload_1
    //   33: invokevirtual getClickedInventory : ()Lorg/bukkit/inventory/Inventory;
    //   36: dup
    //   37: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   40: invokeinterface getType : ()Lorg/bukkit/event/inventory/InventoryType;
    //   45: getstatic org/bukkit/event/inventory/InventoryType.PLAYER : Lorg/bukkit/event/inventory/InventoryType;
    //   48: if_acmpeq -> 56
    //   51: return
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: aload_1
    //   57: invokevirtual getAction : ()Lorg/bukkit/event/inventory/InventoryAction;
    //   60: getstatic org/bukkit/event/inventory/InventoryAction.HOTBAR_SWAP : Lorg/bukkit/event/inventory/InventoryAction;
    //   63: if_acmpne -> 330
    //   66: aload_1
    //   67: invokevirtual getRawSlot : ()I
    //   70: bipush #45
    //   72: if_icmpeq -> 188
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: aload_1
    //   83: invokevirtual getCurrentItem : ()Lorg/bukkit/inventory/ItemStack;
    //   86: dup
    //   87: ifnull -> 125
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: invokevirtual getType : ()Lorg/bukkit/Material;
    //   100: dup
    //   101: ifnull -> 125
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: invokevirtual name : ()Ljava/lang/String;
    //   114: dup
    //   115: ifnonnull -> 146
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: pop
    //   126: sipush #12360
    //   129: ldc2_w 4073263994750650674
    //   132: lload_2
    //   133: lxor
    //   134: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: checkcast java/lang/CharSequence
    //   149: sipush #4929
    //   152: ldc2_w 5201968310768495164
    //   155: lload_2
    //   156: lxor
    //   157: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   162: checkcast java/lang/CharSequence
    //   165: iconst_0
    //   166: iconst_2
    //   167: aconst_null
    //   168: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   171: ifeq -> 188
    //   174: aload_0
    //   175: invokestatic j : ()J
    //   178: putfield b : J
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload_1
    //   189: invokevirtual getRawSlot : ()I
    //   192: bipush #45
    //   194: if_icmpne -> 330
    //   197: aload_1
    //   198: invokevirtual getHotbarButton : ()I
    //   201: iflt -> 330
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   210: athrow
    //   211: aload_1
    //   212: invokevirtual getClickedInventory : ()Lorg/bukkit/inventory/Inventory;
    //   215: dup
    //   216: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   219: aload_1
    //   220: invokevirtual getHotbarButton : ()I
    //   223: invokeinterface getItem : (I)Lorg/bukkit/inventory/ItemStack;
    //   228: dup
    //   229: ifnull -> 267
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: invokevirtual getType : ()Lorg/bukkit/Material;
    //   242: dup
    //   243: ifnull -> 267
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   252: athrow
    //   253: invokevirtual name : ()Ljava/lang/String;
    //   256: dup
    //   257: ifnonnull -> 288
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: pop
    //   268: sipush #30592
    //   271: ldc2_w 5251357303254191868
    //   274: lload_2
    //   275: lxor
    //   276: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: checkcast java/lang/CharSequence
    //   291: sipush #19228
    //   294: ldc2_w 6428339961469612643
    //   297: lload_2
    //   298: lxor
    //   299: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   304: checkcast java/lang/CharSequence
    //   307: iconst_0
    //   308: iconst_2
    //   309: aconst_null
    //   310: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   313: ifeq -> 330
    //   316: aload_0
    //   317: aload_1
    //   318: lload #4
    //   320: invokespecial j : (Lorg/bukkit/event/inventory/InventoryClickEvent;J)V
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_1
    //   331: invokevirtual getAction : ()Lorg/bukkit/event/inventory/InventoryAction;
    //   334: getstatic org/bukkit/event/inventory/InventoryAction.PLACE_ALL : Lorg/bukkit/event/inventory/InventoryAction;
    //   337: if_acmpne -> 433
    //   340: aload_1
    //   341: invokevirtual getRawSlot : ()I
    //   344: bipush #45
    //   346: if_icmpne -> 433
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   355: athrow
    //   356: aload_1
    //   357: invokevirtual getCursor : ()Lorg/bukkit/inventory/ItemStack;
    //   360: ifnull -> 433
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   369: athrow
    //   370: aload_1
    //   371: invokevirtual getCursor : ()Lorg/bukkit/inventory/ItemStack;
    //   374: dup
    //   375: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   378: invokevirtual getType : ()Lorg/bukkit/Material;
    //   381: invokevirtual name : ()Ljava/lang/String;
    //   384: checkcast java/lang/CharSequence
    //   387: sipush #19228
    //   390: ldc2_w 6428339961469612643
    //   393: lload_2
    //   394: lxor
    //   395: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   400: checkcast java/lang/CharSequence
    //   403: iconst_0
    //   404: iconst_2
    //   405: aconst_null
    //   406: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   409: ifeq -> 433
    //   412: goto -> 419
    //   415: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   418: athrow
    //   419: aload_0
    //   420: aload_1
    //   421: lload #4
    //   423: invokespecial j : (Lorg/bukkit/event/inventory/InventoryClickEvent;J)V
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   432: athrow
    //   433: aload_1
    //   434: invokevirtual getAction : ()Lorg/bukkit/event/inventory/InventoryAction;
    //   437: getstatic org/bukkit/event/inventory/InventoryAction.PICKUP_ALL : Lorg/bukkit/event/inventory/InventoryAction;
    //   440: if_acmpne -> 520
    //   443: aload_1
    //   444: invokevirtual getCurrentItem : ()Lorg/bukkit/inventory/ItemStack;
    //   447: ifnull -> 520
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   456: athrow
    //   457: aload_1
    //   458: invokevirtual getCurrentItem : ()Lorg/bukkit/inventory/ItemStack;
    //   461: dup
    //   462: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   465: invokevirtual getType : ()Lorg/bukkit/Material;
    //   468: invokevirtual name : ()Ljava/lang/String;
    //   471: checkcast java/lang/CharSequence
    //   474: sipush #19228
    //   477: ldc2_w 6428339961469612643
    //   480: lload_2
    //   481: lxor
    //   482: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   487: checkcast java/lang/CharSequence
    //   490: iconst_0
    //   491: iconst_2
    //   492: aconst_null
    //   493: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   496: ifeq -> 520
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   505: athrow
    //   506: aload_0
    //   507: invokestatic currentTimeMillis : ()J
    //   510: putfield b : J
    //   513: goto -> 520
    //   516: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   519: athrow
    //   520: return
    // Exception table:
    //   from	to	target	type
    //   9	16	16	java/lang/RuntimeException
    //   20	28	28	java/lang/RuntimeException
    //   32	52	52	java/lang/RuntimeException
    //   56	75	78	java/lang/RuntimeException
    //   66	90	93	java/lang/RuntimeException
    //   82	104	107	java/lang/RuntimeException
    //   97	118	121	java/lang/RuntimeException
    //   111	139	142	java/lang/RuntimeException
    //   146	181	184	java/lang/RuntimeException
    //   188	204	207	java/lang/RuntimeException
    //   197	232	235	java/lang/RuntimeException
    //   211	246	249	java/lang/RuntimeException
    //   239	260	263	java/lang/RuntimeException
    //   253	281	284	java/lang/RuntimeException
    //   288	323	326	java/lang/RuntimeException
    //   330	349	352	java/lang/RuntimeException
    //   340	363	366	java/lang/RuntimeException
    //   356	412	415	java/lang/RuntimeException
    //   370	426	429	java/lang/RuntimeException
    //   433	450	453	java/lang/RuntimeException
    //   443	499	502	java/lang/RuntimeException
    //   457	513	516	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x533F;
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
        throw new RuntimeException("me/rerere/matrix/internal/rd", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/rd'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */