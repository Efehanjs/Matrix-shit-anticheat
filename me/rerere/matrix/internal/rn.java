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
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

public class rn extends zk {
  private static int l;
  
  private long r;
  
  private boolean x = false;
  
  private static boolean z;
  
  private long k;
  
  private long v;
  
  private long b;
  
  private long i;
  
  private static final long a = o3.a(4956063026023700723L, -322982248220579340L, MethodHandles.lookup().lookupClass()).a(276108111202834L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull InventoryClickEvent paramInventoryClickEvent, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 44146554681774
    //   5: lxor
    //   6: lstore #4
    //   8: dup2
    //   9: ldc2_w 130582587941598
    //   12: lxor
    //   13: lstore #6
    //   15: pop2
    //   16: aload_1
    //   17: invokevirtual isCancelled : ()Z
    //   20: ifeq -> 28
    //   23: return
    //   24: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   27: athrow
    //   28: aload_1
    //   29: invokevirtual getClick : ()Lorg/bukkit/event/inventory/ClickType;
    //   32: getstatic org/bukkit/event/inventory/ClickType.SHIFT_LEFT : Lorg/bukkit/event/inventory/ClickType;
    //   35: if_acmpne -> 232
    //   38: aload_1
    //   39: invokevirtual getAction : ()Lorg/bukkit/event/inventory/InventoryAction;
    //   42: getstatic org/bukkit/event/inventory/InventoryAction.MOVE_TO_OTHER_INVENTORY : Lorg/bukkit/event/inventory/InventoryAction;
    //   45: if_acmpne -> 232
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: aload_1
    //   56: invokevirtual getSlotType : ()Lorg/bukkit/event/inventory/InventoryType$SlotType;
    //   59: getstatic org/bukkit/event/inventory/InventoryType$SlotType.CONTAINER : Lorg/bukkit/event/inventory/InventoryType$SlotType;
    //   62: if_acmpne -> 232
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: aload_1
    //   73: invokevirtual getView : ()Lorg/bukkit/inventory/InventoryView;
    //   76: astore #8
    //   78: aload_1
    //   79: invokevirtual getCurrentItem : ()Lorg/bukkit/inventory/ItemStack;
    //   82: astore #9
    //   84: aload #8
    //   86: invokevirtual getTopInventory : ()Lorg/bukkit/inventory/Inventory;
    //   89: invokeinterface getType : ()Lorg/bukkit/event/inventory/InventoryType;
    //   94: getstatic org/bukkit/event/inventory/InventoryType.CRAFTING : Lorg/bukkit/event/inventory/InventoryType;
    //   97: if_acmpne -> 232
    //   100: aload #8
    //   102: invokevirtual getBottomInventory : ()Lorg/bukkit/inventory/Inventory;
    //   105: invokeinterface getType : ()Lorg/bukkit/event/inventory/InventoryType;
    //   110: getstatic org/bukkit/event/inventory/InventoryType.PLAYER : Lorg/bukkit/event/inventory/InventoryType;
    //   113: if_acmpne -> 232
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload #9
    //   125: ifnull -> 232
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload #9
    //   137: invokevirtual getType : ()Lorg/bukkit/Material;
    //   140: lload #6
    //   142: dup2_x1
    //   143: pop2
    //   144: invokestatic b : (JLorg/bukkit/Material;)Z
    //   147: ifeq -> 232
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: invokestatic j : ()J
    //   160: aload_0
    //   161: getfield v : J
    //   164: lsub
    //   165: lstore #10
    //   167: aload_0
    //   168: invokestatic j : ()J
    //   171: putfield v : J
    //   174: lload #10
    //   176: ldc2_w 75
    //   179: lcmp
    //   180: ifge -> 232
    //   183: aload_0
    //   184: lload #4
    //   186: sipush #19735
    //   189: ldc2_w 5935619605397269717
    //   192: lload_2
    //   193: lxor
    //   194: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   199: sipush #11501
    //   202: ldc2_w 1113692756627557671
    //   205: lload_2
    //   206: lxor
    //   207: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   212: getstatic me/rerere/matrix/internal/rn.l : I
    //   215: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   218: aload_1
    //   219: getstatic org/bukkit/event/Event$Result.DENY : Lorg/bukkit/event/Event$Result;
    //   222: invokevirtual setResult : (Lorg/bukkit/event/Event$Result;)V
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   231: athrow
    //   232: aload_0
    //   233: getfield x : Z
    //   236: ifeq -> 278
    //   239: aload_0
    //   240: iconst_0
    //   241: putfield x : Z
    //   244: getstatic me/rerere/matrix/internal/rn.z : Z
    //   247: ifeq -> 278
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: aload_1
    //   258: iconst_1
    //   259: invokevirtual setCancelled : (Z)V
    //   262: aload_1
    //   263: invokevirtual getWhoClicked : ()Lorg/bukkit/entity/HumanEntity;
    //   266: invokeinterface closeInventory : ()V
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   277: athrow
    //   278: return
    // Exception table:
    //   from	to	target	type
    //   16	24	24	java/lang/RuntimeException
    //   28	48	51	java/lang/RuntimeException
    //   38	65	68	java/lang/RuntimeException
    //   84	116	119	java/lang/RuntimeException
    //   100	128	131	java/lang/RuntimeException
    //   123	150	153	java/lang/RuntimeException
    //   167	225	228	java/lang/RuntimeException
    //   232	250	253	java/lang/RuntimeException
    //   239	271	274	java/lang/RuntimeException
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 48154276789486
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 79238690796922
    //   19: lxor
    //   20: lstore #9
    //   22: pop2
    //   23: iconst_0
    //   24: istore #11
    //   26: aload_1
    //   27: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   30: if_acmpeq -> 95
    //   33: aload_1
    //   34: getstatic com/comphenix/protocol/PacketType$Play$Client.CLOSE_WINDOW : Lcom/comphenix/protocol/PacketType;
    //   37: if_acmpeq -> 95
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: aload_1
    //   48: getstatic com/comphenix/protocol/PacketType$Play$Client.WINDOW_CLICK : Lcom/comphenix/protocol/PacketType;
    //   51: if_acmpeq -> 95
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: lload #9
    //   64: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   67: ifne -> 95
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload_1
    //   78: aload #4
    //   80: lload #7
    //   82: invokestatic b : (Lcom/comphenix/protocol/PacketType;Lcom/comphenix/protocol/events/PacketContainer;J)Z
    //   85: ifeq -> 406
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   94: athrow
    //   95: invokestatic j : ()J
    //   98: lstore #12
    //   100: invokestatic b : ()I
    //   103: bipush #8
    //   105: if_icmpne -> 239
    //   108: aload_1
    //   109: getstatic com/comphenix/protocol/PacketType$Play$Client.WINDOW_CLICK : Lcom/comphenix/protocol/PacketType;
    //   112: if_acmpne -> 239
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: invokestatic j : ()J
    //   125: aload_0
    //   126: getfield b : J
    //   129: lsub
    //   130: ldc2_w 50
    //   133: lcmp
    //   134: ifgt -> 239
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload #4
    //   146: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   149: iconst_1
    //   150: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   153: checkcast java/lang/Integer
    //   156: invokevirtual intValue : ()I
    //   159: istore #14
    //   161: iload #14
    //   163: bipush #13
    //   165: if_icmpeq -> 239
    //   168: aload_0
    //   169: lload #5
    //   171: sipush #22124
    //   174: ldc2_w 6980059166243081936
    //   177: lload_2
    //   178: lxor
    //   179: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   184: new java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: sipush #19289
    //   194: ldc2_w 7216616924016661480
    //   197: lload_2
    //   198: lxor
    //   199: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: iload #14
    //   209: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   212: ldc_w ')'
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: getstatic me/rerere/matrix/internal/rn.l : I
    //   224: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   227: aload_0
    //   228: iconst_1
    //   229: putfield x : Z
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: aload_1
    //   240: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   243: if_acmpne -> 340
    //   246: lload #12
    //   248: aload_0
    //   249: getfield k : J
    //   252: lsub
    //   253: ldc2_w 5
    //   256: lcmp
    //   257: ifgt -> 340
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: lload #12
    //   269: aload_0
    //   270: getfield r : J
    //   273: lsub
    //   274: ldc2_w 5
    //   277: lcmp
    //   278: ifgt -> 340
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   287: athrow
    //   288: aload_0
    //   289: invokevirtual b : ()I
    //   292: bipush #23
    //   294: if_icmpgt -> 340
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   303: athrow
    //   304: aload_0
    //   305: lload #5
    //   307: sipush #22124
    //   310: ldc2_w 6980059166243081936
    //   313: lload_2
    //   314: lxor
    //   315: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   320: sipush #25949
    //   323: ldc2_w 7117713044452507117
    //   326: lload_2
    //   327: lxor
    //   328: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   333: iconst_0
    //   334: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   337: iconst_1
    //   338: istore #11
    //   340: aload_1
    //   341: aload #4
    //   343: lload #7
    //   345: invokestatic b : (Lcom/comphenix/protocol/PacketType;Lcom/comphenix/protocol/events/PacketContainer;J)Z
    //   348: ifeq -> 364
    //   351: aload_0
    //   352: lload #12
    //   354: putfield b : J
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   363: athrow
    //   364: aload_1
    //   365: lload #9
    //   367: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   370: ifeq -> 386
    //   373: aload_0
    //   374: lload #12
    //   376: putfield r : J
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   385: athrow
    //   386: aload_1
    //   387: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   390: if_acmpne -> 406
    //   393: aload_0
    //   394: lload #12
    //   396: putfield k : J
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   405: athrow
    //   406: iload #11
    //   408: ireturn
    // Exception table:
    //   from	to	target	type
    //   26	40	43	java/lang/RuntimeException
    //   33	54	57	java/lang/RuntimeException
    //   47	70	73	java/lang/RuntimeException
    //   61	88	91	java/lang/RuntimeException
    //   100	115	118	java/lang/RuntimeException
    //   108	137	140	java/lang/RuntimeException
    //   161	232	235	java/lang/RuntimeException
    //   239	260	263	java/lang/RuntimeException
    //   246	281	284	java/lang/RuntimeException
    //   267	297	300	java/lang/RuntimeException
    //   340	357	360	java/lang/RuntimeException
    //   364	379	382	java/lang/RuntimeException
    //   386	399	402	java/lang/RuntimeException
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rn.a : J
    //   3: ldc2_w 9801302990570
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #21390
    //   15: ldc2_w 7188022569098438597
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/rn.z : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #497
    //   41: ldc2_w 854828482720904636
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/rn.l : I
    //   60: return
  }
  
  static {
    long l = a ^ 0x66EE39FE593L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[11];
    boolean bool = false;
    String str;
    int i = (str = "7\027\t<ï?Ô¾yÖí`.¨ÊLý÷õ\fZÍE¯\005¾jÕÑo\033\035åð\007a'.2\021¶ÙÚ\n\033·ÕÆ¥-¾\026à&\023Ö\016ÙhA³Ä\\Å\031b®F6\025o¹K(\fQ¹òQ[e\007°áv¨rä\r\002´É\021i/\020þRã,\004?/õwÇ\005ðr(ð.9u\026­Â\nË\\$6)osÄ¾i\016\003pF­¹\f´\020.\005iÝíùyÄq¢ EóÈ\bU\\ÈK¾\004\017Äg\025wÓÃ,ö(Kìu>·cu»\030ÄloÔ@Ð7\027â\035tT\fxðlò^D }§\030!F\017\027¾0º\022÷wpmë#¢ÿæU\021``\034\rÉR£yðjRWx\r4öÑ­ëä\002yÀ¨\nrA8ßõZö87}ý¥×Ûãªí\020a\017Wà;P¹\036<»¹^©íóãHtj5ßÉ}<Êú¨-»\033TÆ,1û_cãb1Ö«hðØt9ë\nWð\"Ýlì`#)·Y)¾Àîo¹\032»_ù­E¡Û/6K9Ä©÷n\001\004éÑWJò \034\017ààsU³/ìHïEä|K2Ï7­ð ¤Þz{\001QÃdXæEÞÍª\002Ç\032J&õ1¢| SDÀ¯÷\026H9÷±Ñ\021¶\022ô!\rt\025AÄh±VW;Î\032a").length();
    byte b2 = 104;
    byte b = -1;
    while (true);
  }
  
  public rn(yl paramyl) {
    super(paramyl);
    b(yk.u);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xB8E;
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
        throw new RuntimeException("me/rerere/matrix/internal/rn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/rn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */