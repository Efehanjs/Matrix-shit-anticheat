package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.command.CommandSender;

public class dd extends xl {
  private static final long a = o3.a(-68666998251537375L, -2479618107262348504L, MethodHandles.lookup().lookupClass()).a(92457646805905L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public dd(long paramLong, byte paramByte) {
    // Byte code:
    //   0: lload_1
    //   1: bipush #8
    //   3: lshl
    //   4: iload_3
    //   5: i2l
    //   6: bipush #56
    //   8: lshl
    //   9: bipush #56
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/dd.a : J
    //   16: lxor
    //   17: lstore #4
    //   19: lload #4
    //   21: dup2
    //   22: ldc2_w 64098083217130
    //   25: lxor
    //   26: lstore #6
    //   28: pop2
    //   29: aload_0
    //   30: sipush #27861
    //   33: ldc2_w 7087662794187803200
    //   36: lload #4
    //   38: lxor
    //   39: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   44: sipush #19691
    //   47: ldc2_w 1418148686441785979
    //   50: lload #4
    //   52: lxor
    //   53: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   58: sipush #6754
    //   61: ldc2_w 8153355383495785718
    //   64: lload #4
    //   66: lxor
    //   67: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   72: lload #6
    //   74: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   77: sipush #10711
    //   80: ldc2_w 8567544636205322054
    //   83: lload #4
    //   85: lxor
    //   86: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   91: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   94: return
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 55309360335476
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 38689996299661
    //   12: lxor
    //   13: lstore #7
    //   15: pop2
    //   16: invokestatic a : ()I
    //   19: istore #9
    //   21: aload #4
    //   23: arraylength
    //   24: iconst_2
    //   25: if_icmpge -> 71
    //   28: aload_1
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: sipush #2161
    //   45: ldc2_w 8507014530832400003
    //   48: lload_2
    //   49: lxor
    //   50: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   66: return
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: new java/util/ArrayList
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #10
    //   80: iconst_1
    //   81: istore #11
    //   83: iload #11
    //   85: aload #4
    //   87: arraylength
    //   88: if_icmpge -> 168
    //   91: aload #4
    //   93: iload #11
    //   95: aaload
    //   96: iload #9
    //   98: ifne -> 181
    //   101: ldc '-'
    //   103: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   106: lload_2
    //   107: lconst_0
    //   108: lcmp
    //   109: iflt -> 165
    //   112: iload #9
    //   114: ifne -> 159
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: ifeq -> 140
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: lload_2
    //   135: lconst_0
    //   136: lcmp
    //   137: ifgt -> 168
    //   140: aload #10
    //   142: aload #4
    //   144: iload #11
    //   146: aaload
    //   147: lload #7
    //   149: dup2_x1
    //   150: pop2
    //   151: invokestatic b : (JLjava/lang/String;)Ljava/lang/String;
    //   154: invokeinterface add : (Ljava/lang/Object;)Z
    //   159: pop
    //   160: iinc #11, 1
    //   163: iload #9
    //   165: ifeq -> 83
    //   168: ldc ' '
    //   170: lload_2
    //   171: lconst_0
    //   172: lcmp
    //   173: ifle -> 96
    //   176: aload #10
    //   178: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   181: astore #11
    //   183: lload #5
    //   185: aload #4
    //   187: invokestatic b : (J[Ljava/lang/String;)Ljava/util/Set;
    //   190: astore #12
    //   192: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   195: invokeinterface iterator : ()Ljava/util/Iterator;
    //   200: astore #13
    //   202: aload #13
    //   204: invokeinterface hasNext : ()Z
    //   209: ifeq -> 613
    //   212: aload #13
    //   214: invokeinterface next : ()Ljava/lang/Object;
    //   219: checkcast org/bukkit/entity/Player
    //   222: astore #14
    //   224: iload #9
    //   226: lload_2
    //   227: lconst_0
    //   228: lcmp
    //   229: iflt -> 244
    //   232: ifne -> 648
    //   235: aload #14
    //   237: aload_0
    //   238: invokevirtual m : ()Ljava/lang/String;
    //   241: invokestatic j : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Z
    //   244: lload_2
    //   245: lconst_0
    //   246: lcmp
    //   247: iflt -> 610
    //   250: ifeq -> 608
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   259: athrow
    //   260: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   263: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   266: aload #14
    //   268: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   273: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   276: astore #15
    //   278: aload #15
    //   280: iload #9
    //   282: ifne -> 297
    //   285: ifnull -> 608
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   294: athrow
    //   295: aload #15
    //   297: invokevirtual m : ()Z
    //   300: lload_2
    //   301: lconst_0
    //   302: lcmp
    //   303: ifle -> 610
    //   306: ifeq -> 608
    //   309: new net/md_5/bungee/api/chat/TextComponent
    //   312: dup
    //   313: new java/lang/StringBuilder
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: aload #11
    //   328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: invokevirtual toString : ()Ljava/lang/String;
    //   334: invokespecial <init> : (Ljava/lang/String;)V
    //   337: astore #16
    //   339: aload #12
    //   341: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   346: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   351: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   356: lload_2
    //   357: lconst_0
    //   358: lcmp
    //   359: iflt -> 526
    //   362: iload #9
    //   364: ifne -> 526
    //   367: ifeq -> 491
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   376: athrow
    //   377: aload #12
    //   379: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   384: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   389: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   394: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   399: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   404: invokeinterface findFirst : ()Ljava/util/Optional;
    //   409: sipush #21247
    //   412: ldc2_w 722542670489527308
    //   415: lload_2
    //   416: lxor
    //   417: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   422: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   425: checkcast java/lang/String
    //   428: astore #17
    //   430: aload #16
    //   432: new net/md_5/bungee/api/chat/HoverEvent
    //   435: dup
    //   436: getstatic net/md_5/bungee/api/chat/HoverEvent$Action.SHOW_TEXT : Lnet/md_5/bungee/api/chat/HoverEvent$Action;
    //   439: new net/md_5/bungee/api/chat/ComponentBuilder
    //   442: dup
    //   443: new java/lang/StringBuilder
    //   446: dup
    //   447: invokespecial <init> : ()V
    //   450: sipush #15063
    //   453: ldc2_w 4612505053829090337
    //   456: lload_2
    //   457: lxor
    //   458: <illegal opcode> t : (IJ)Ljava/lang/String;
    //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: bipush #38
    //   468: aload #17
    //   470: invokestatic translateAlternateColorCodes : (CLjava/lang/String;)Ljava/lang/String;
    //   473: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: invokevirtual toString : ()Ljava/lang/String;
    //   479: invokespecial <init> : (Ljava/lang/String;)V
    //   482: invokevirtual create : ()[Lnet/md_5/bungee/api/chat/BaseComponent;
    //   485: invokespecial <init> : (Lnet/md_5/bungee/api/chat/HoverEvent$Action;[Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   488: invokevirtual setHoverEvent : (Lnet/md_5/bungee/api/chat/HoverEvent;)V
    //   491: aload #12
    //   493: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   498: lload_2
    //   499: lconst_0
    //   500: lcmp
    //   501: iflt -> 574
    //   504: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   509: iload #9
    //   511: ifne -> 548
    //   514: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   525: athrow
    //   526: ifeq -> 596
    //   529: aload #12
    //   531: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   536: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   541: goto -> 548
    //   544: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   547: athrow
    //   548: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   553: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   558: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   563: invokeinterface findFirst : ()Ljava/util/Optional;
    //   568: ldc_w ''
    //   571: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   574: checkcast java/lang/String
    //   577: astore #17
    //   579: aload #16
    //   581: new net/md_5/bungee/api/chat/ClickEvent
    //   584: dup
    //   585: getstatic net/md_5/bungee/api/chat/ClickEvent$Action.RUN_COMMAND : Lnet/md_5/bungee/api/chat/ClickEvent$Action;
    //   588: aload #17
    //   590: invokespecial <init> : (Lnet/md_5/bungee/api/chat/ClickEvent$Action;Ljava/lang/String;)V
    //   593: invokevirtual setClickEvent : (Lnet/md_5/bungee/api/chat/ClickEvent;)V
    //   596: aload #14
    //   598: invokeinterface spigot : ()Lorg/bukkit/entity/Player$Spigot;
    //   603: aload #16
    //   605: invokevirtual sendMessage : (Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   608: iload #9
    //   610: ifeq -> 202
    //   613: invokestatic getConsoleSender : ()Lorg/bukkit/command/ConsoleCommandSender;
    //   616: lload_2
    //   617: lconst_0
    //   618: lcmp
    //   619: ifle -> 219
    //   622: new java/lang/StringBuilder
    //   625: dup
    //   626: invokespecial <init> : ()V
    //   629: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: aload #11
    //   637: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   640: invokevirtual toString : ()Ljava/lang/String;
    //   643: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   648: return
    // Exception table:
    //   from	to	target	type
    //   21	67	67	java/lang/RuntimeException
    //   91	117	120	java/lang/RuntimeException
    //   101	127	130	java/lang/RuntimeException
    //   224	253	256	java/lang/RuntimeException
    //   278	288	291	java/lang/RuntimeException
    //   339	370	373	java/lang/RuntimeException
    //   491	519	522	java/lang/RuntimeException
    //   526	541	544	java/lang/RuntimeException
  }
  
  public List b(long paramLong) {
    return null;
  }
  
  static {
    long l = a ^ 0x6368F031263AL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[7];
    boolean bool = false;
    String str;
    int i = (str = "rÃ(rÍÙ)ÁTÎ\004åS!»\022#+~û û¼¾î¹\030\037q¡8/Óe}êç\032BEpê½,å4Ì@\017÷dÞûËÃlÈ,h\021tÏ\035rH*½èè\023xÕ0n&7ê,ùâcúT'v\005+<E¼]\002°Ì\034ÔÀUïn6ªî\020\022É;qû§§â!n¬ôá_=\020ù\026Ûß\032U\002@eRág\"D").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x65AC;
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
        throw new RuntimeException("me/rerere/matrix/internal/dd", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/dd'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */