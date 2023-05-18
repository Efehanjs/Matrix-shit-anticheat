package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

public class ek implements k {
  private static MethodHandle o;
  
  private static MethodHandle q;
  
  private static MethodHandle t;
  
  private static Method g;
  
  private static MethodHandle a;
  
  private static MethodHandle s;
  
  private static MethodHandle u;
  
  private static MethodHandle w;
  
  private static MethodHandle f;
  
  private static MethodHandle l;
  
  private static MethodHandle r;
  
  private static MethodHandle x;
  
  private static MethodHandle[] z;
  
  private static MethodHandle k;
  
  private static MethodHandle v;
  
  private static MethodHandle b;
  
  private static MethodHandle i;
  
  private static final long c;
  
  private static final String[] m;
  
  private static final String[] n;
  
  private static final Map p;
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    try {
      Object object = i.invoke(paramPlayer);
      q.invoke(object);
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    } 
  }
  
  @Nullable
  public Object b(@NotNull Block paramBlock, long paramLong) {
    try {
      Object object = v.invoke(paramBlock);
      return x.invoke(object);
    } catch (Throwable throwable) {
      throwable.printStackTrace();
      return null;
    } 
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 476846890126049997
    //   3: ldc2_w -2768267754650091039
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 163258199601443
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/internal/ek.c : J
    //   26: getstatic me/rerere/matrix/internal/ek.c : J
    //   29: ldc2_w 26835126931127
    //   32: lxor
    //   33: lstore #9
    //   35: lload #9
    //   37: dup2
    //   38: ldc2_w 115461194397413
    //   41: lxor
    //   42: lstore #11
    //   44: dup2
    //   45: ldc2_w 116511654078532
    //   48: lxor
    //   49: lstore #13
    //   51: pop2
    //   52: new java/util/HashMap
    //   55: dup
    //   56: bipush #13
    //   58: invokespecial <init> : (I)V
    //   61: putstatic me/rerere/matrix/internal/ek.p : Ljava/util/Map;
    //   64: ldc 'DES/CBC/PKCS5Padding'
    //   66: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   69: dup
    //   70: astore_0
    //   71: iconst_2
    //   72: ldc 'DES'
    //   74: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   77: bipush #8
    //   79: newarray byte
    //   81: dup
    //   82: iconst_0
    //   83: lload #9
    //   85: bipush #56
    //   87: lushr
    //   88: l2i
    //   89: i2b
    //   90: bastore
    //   91: iconst_1
    //   92: istore_1
    //   93: iload_1
    //   94: bipush #8
    //   96: if_icmpge -> 120
    //   99: dup
    //   100: iload_1
    //   101: lload #9
    //   103: iload_1
    //   104: bipush #8
    //   106: imul
    //   107: lshl
    //   108: bipush #56
    //   110: lushr
    //   111: l2i
    //   112: i2b
    //   113: bastore
    //   114: iinc #1, 1
    //   117: goto -> 93
    //   120: new javax/crypto/spec/DESKeySpec
    //   123: dup_x1
    //   124: swap
    //   125: invokespecial <init> : ([B)V
    //   128: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   131: new javax/crypto/spec/IvParameterSpec
    //   134: dup
    //   135: bipush #8
    //   137: newarray byte
    //   139: invokespecial <init> : ([B)V
    //   142: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   145: bipush #33
    //   147: anewarray java/lang/String
    //   150: astore #7
    //   152: iconst_0
    //   153: istore #5
    //   155: ldc 'Å7nñK¸£Á#Ð#´Z:=kz:ð2öÀñE×¶O\\r©1ð§à<[gþÉ><Áh wáJè2DoY¡p?ÚÂÁ6vàSn<ÃYl@{)+h8n\¼m,%D¬qÀ!×.TVãpáÿ¶4¶+/3ÆÈÊWz´¼ÍWëÌ º];ãëÍÀÔ¢.wÞE¬l7`¸l¨ö"l¦ kÆÁ;ãnS)ÜxÁÅÏ²¦E2¬eÂ0$æ¦2¾9òÓBç ·}ê¾ïëü?jî[]§Ü&r(Í7At¾84j³d­ó ¦)443l3r~ý}2ÃÅû-å\\féÆÏ*TêáºÝô­?Ê·;±£.?jg¬86 L+*}Ùÿ*+hokaÓbs]û·F©¥A¢Ö³J0ZVàßFsý3Ìä¨Ð×íJ£ÆE×Ù´æQd9!óÎ-AýÌïû+²5¶NÂv÷0üj­çä¨\1ÌG4»$0¿l¹(uÔ%]æ\\nføÅ")EýÞ¡¹iNáÑ!¡û úîm~(ÿ Áv ämDV¨qb¶§¥"«ÂÝRºSñÇä6÷Ó²84SLùÑÕXÔ £Çõß#Féy®Yv\w\\b¾ôvÌÎD&XæéM'»Gûý¯=ëMZØUk(* ôÝ2©AÃÜú¼¾Î[Ñ6ÐÉ.24bK7Á¤Ü>\\f)Ëh= yÂ7]¤ãè«M\.hÝ?e<\\t(Ø¡Ê<X}v8x¢eöþÂ­ïûsåívÄsDx +¼ Aî&ã"_ç9í§\«+ómwGùpÁ465PxôyþëØ\\tçEúwÈB¥gý´ß]þÃjq`¾ûÒüíîKyé¬(\\f\ðCÀþ6ú°¹IöõIÚk,ßmh¶d÷éÂ³°Äð3Á½\\f¿èñÜÇaÂËÔÓø¬(+[Ì¡¡\\n ÀÓý¦ÔT.qïvÿ]8}?ýÖßEà±*Ü_ ¤E9¼gMñáÞn%ó$O»ÞrTÞù] ú\\r~Á~Õiå«RZúp!ëÞÄZôé\\rØ~è Õ%;gàÑ1]º¾3ª\Ãåmç2ïiVù{/²|8Ü)Þ(ªÓÆyHè¤s6¦(¸#0Û<hØ:^É^ùÈðÑB%oJ_å®®ÃÜc¥(x½ðd²GÉèïÃõ\\b*e]Ëæ¿Qòwpß:.vãJÔzE(ü?)÷ð¶¶ý-èìUìHx:kZä5"Ð[Ä ¬JÈÜ=Ô¿hg_w§¬`ÿWqÊ(GÆK^¾ Ç{=¾®[,ÐiýN+=HJ6m.Øòæb×Ø'
    //   157: dup
    //   158: astore #4
    //   160: invokevirtual length : ()I
    //   163: istore #6
    //   165: bipush #40
    //   167: istore_3
    //   168: iconst_m1
    //   169: istore_2
    //   170: iinc #2, 1
    //   173: aload #4
    //   175: iload_2
    //   176: dup
    //   177: iload_3
    //   178: iadd
    //   179: invokevirtual substring : (II)Ljava/lang/String;
    //   182: iconst_m1
    //   183: goto -> 293
    //   186: aload #7
    //   188: swap
    //   189: iload #5
    //   191: iinc #5, 1
    //   194: swap
    //   195: aastore
    //   196: iload_2
    //   197: iload_3
    //   198: iadd
    //   199: dup
    //   200: istore_2
    //   201: iload #6
    //   203: if_icmpge -> 216
    //   206: aload #4
    //   208: iload_2
    //   209: invokevirtual charAt : (I)C
    //   212: istore_3
    //   213: goto -> 170
    //   216: ldc 'Ï®µíÇ¾grVã´WãõÞÃ¡÷lû)JÓ àºâ\\r%ae4}þà\\rµRZ1ûçßþ[%è@q\\rO'
    //   218: dup
    //   219: astore #4
    //   221: invokevirtual length : ()I
    //   224: istore #6
    //   226: bipush #24
    //   228: istore_3
    //   229: iconst_m1
    //   230: istore_2
    //   231: iinc #2, 1
    //   234: aload #4
    //   236: iload_2
    //   237: dup
    //   238: iload_3
    //   239: iadd
    //   240: invokevirtual substring : (II)Ljava/lang/String;
    //   243: iconst_0
    //   244: goto -> 293
    //   247: aload #7
    //   249: swap
    //   250: iload #5
    //   252: iinc #5, 1
    //   255: swap
    //   256: aastore
    //   257: iload_2
    //   258: iload_3
    //   259: iadd
    //   260: dup
    //   261: istore_2
    //   262: iload #6
    //   264: if_icmpge -> 277
    //   267: aload #4
    //   269: iload_2
    //   270: invokevirtual charAt : (I)C
    //   273: istore_3
    //   274: goto -> 231
    //   277: aload #7
    //   279: putstatic me/rerere/matrix/internal/ek.m : [Ljava/lang/String;
    //   282: bipush #33
    //   284: anewarray java/lang/String
    //   287: putstatic me/rerere/matrix/internal/ek.n : [Ljava/lang/String;
    //   290: goto -> 332
    //   293: swap
    //   294: ldc 'ISO-8859-1'
    //   296: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   299: aload_0
    //   300: swap
    //   301: invokevirtual doFinal : ([B)[B
    //   304: astore #8
    //   306: aload #8
    //   308: invokestatic b : ([B)Ljava/lang/String;
    //   311: invokevirtual intern : ()Ljava/lang/String;
    //   314: swap
    //   315: tableswitch default -> 186, 0 -> 247
    //   332: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   335: astore #15
    //   337: aload #15
    //   339: sipush #24307
    //   342: ldc2_w 6509771729601465800
    //   345: lload #9
    //   347: lxor
    //   348: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   353: lload #11
    //   355: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   358: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   361: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   364: sipush #7352
    //   367: ldc2_w 7707015471069089694
    //   370: lload #9
    //   372: lxor
    //   373: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   378: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   381: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   384: putstatic me/rerere/matrix/internal/ek.i : Ljava/lang/invoke/MethodHandle;
    //   387: aload #15
    //   389: sipush #6912
    //   392: ldc2_w 2845009152516704310
    //   395: lload #9
    //   397: lxor
    //   398: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   403: lload #11
    //   405: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   408: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   411: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   414: sipush #6786
    //   417: ldc2_w 4021529585396664750
    //   420: lload #9
    //   422: lxor
    //   423: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   428: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   431: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   434: putstatic me/rerere/matrix/internal/ek.w : Ljava/lang/invoke/MethodHandle;
    //   437: aload #15
    //   439: sipush #5060
    //   442: ldc2_w 1215425597408329971
    //   445: lload #9
    //   447: lxor
    //   448: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   453: lload #13
    //   455: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   458: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   461: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   464: sipush #12122
    //   467: ldc2_w 8442169901947190378
    //   470: lload #9
    //   472: lxor
    //   473: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   478: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   481: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   484: putstatic me/rerere/matrix/internal/ek.q : Ljava/lang/invoke/MethodHandle;
    //   487: aload #15
    //   489: sipush #22478
    //   492: ldc2_w 4912884411039810800
    //   495: lload #9
    //   497: lxor
    //   498: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   503: lload #13
    //   505: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   508: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   511: iconst_3
    //   512: anewarray java/lang/Class
    //   515: dup
    //   516: iconst_0
    //   517: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   520: aastore
    //   521: dup
    //   522: iconst_1
    //   523: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   526: aastore
    //   527: dup
    //   528: iconst_2
    //   529: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   532: aastore
    //   533: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   536: invokevirtual unreflectConstructor : (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
    //   539: putstatic me/rerere/matrix/internal/ek.k : Ljava/lang/invoke/MethodHandle;
    //   542: aload #15
    //   544: sipush #7804
    //   547: ldc2_w 2621309450767125837
    //   550: lload #9
    //   552: lxor
    //   553: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   558: lload #11
    //   560: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   563: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   566: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   569: sipush #6786
    //   572: ldc2_w 4021529585396664750
    //   575: lload #9
    //   577: lxor
    //   578: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   583: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   586: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   589: putstatic me/rerere/matrix/internal/ek.r : Ljava/lang/invoke/MethodHandle;
    //   592: sipush #29290
    //   595: ldc2_w 4896292535949435230
    //   598: lload #9
    //   600: lxor
    //   601: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   606: lload #13
    //   608: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   611: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   614: sipush #16180
    //   617: ldc2_w 4089503139565104147
    //   620: lload #9
    //   622: lxor
    //   623: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   628: iconst_1
    //   629: anewarray java/lang/Class
    //   632: dup
    //   633: iconst_0
    //   634: sipush #15374
    //   637: ldc2_w 8950914384097734435
    //   640: lload #9
    //   642: lxor
    //   643: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   648: lload #13
    //   650: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   653: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   656: aastore
    //   657: swap
    //   658: dup_x2
    //   659: pop
    //   660: dup2_x1
    //   661: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   664: swap
    //   665: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   668: putstatic me/rerere/matrix/internal/ek.g : Ljava/lang/reflect/Method;
    //   671: aload #15
    //   673: sipush #3993
    //   676: ldc2_w 8974925121080057017
    //   679: lload #9
    //   681: lxor
    //   682: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   687: lload #13
    //   689: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   692: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   695: sipush #13111
    //   698: ldc2_w 3094260961977491471
    //   701: lload #9
    //   703: lxor
    //   704: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   709: iconst_1
    //   710: anewarray java/lang/Class
    //   713: dup
    //   714: iconst_0
    //   715: sipush #15374
    //   718: ldc2_w 8950914384097734435
    //   721: lload #9
    //   723: lxor
    //   724: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   729: lload #13
    //   731: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   734: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   737: aastore
    //   738: swap
    //   739: dup_x2
    //   740: pop
    //   741: dup2_x1
    //   742: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   745: swap
    //   746: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   749: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   752: putstatic me/rerere/matrix/internal/ek.b : Ljava/lang/invoke/MethodHandle;
    //   755: aload #15
    //   757: sipush #18452
    //   760: ldc2_w 1893576595627055912
    //   763: lload #9
    //   765: lxor
    //   766: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   771: lload #13
    //   773: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   776: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   779: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   782: sipush #27370
    //   785: ldc2_w 3370088460082919934
    //   788: lload #9
    //   790: lxor
    //   791: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   796: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   799: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   802: putstatic me/rerere/matrix/internal/ek.s : Ljava/lang/invoke/MethodHandle;
    //   805: aload #15
    //   807: sipush #7389
    //   810: ldc2_w 6141774617634426872
    //   813: lload #9
    //   815: lxor
    //   816: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   821: lload #13
    //   823: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   826: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   829: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   832: sipush #27702
    //   835: ldc2_w 6607987280106635033
    //   838: lload #9
    //   840: lxor
    //   841: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   846: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   849: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   852: putstatic me/rerere/matrix/internal/ek.f : Ljava/lang/invoke/MethodHandle;
    //   855: aload #15
    //   857: sipush #800
    //   860: ldc2_w 3163232123388284942
    //   863: lload #9
    //   865: lxor
    //   866: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   871: lload #13
    //   873: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   876: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   879: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   882: invokevirtual getMethods : ()Ljava/util/Set;
    //   885: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   890: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   895: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   900: invokeinterface findFirst : ()Ljava/util/Optional;
    //   905: invokevirtual get : ()Ljava/lang/Object;
    //   908: checkcast java/lang/reflect/Method
    //   911: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   914: putstatic me/rerere/matrix/internal/ek.t : Ljava/lang/invoke/MethodHandle;
    //   917: bipush #6
    //   919: anewarray java/lang/String
    //   922: dup
    //   923: iconst_0
    //   924: ldc_w 'a'
    //   927: aastore
    //   928: dup
    //   929: iconst_1
    //   930: ldc_w 'b'
    //   933: aastore
    //   934: dup
    //   935: iconst_2
    //   936: ldc_w 'c'
    //   939: aastore
    //   940: dup
    //   941: iconst_3
    //   942: ldc_w 'd'
    //   945: aastore
    //   946: dup
    //   947: iconst_4
    //   948: ldc_w 'e'
    //   951: aastore
    //   952: dup
    //   953: iconst_5
    //   954: ldc_w 'f'
    //   957: aastore
    //   958: astore #16
    //   960: iconst_0
    //   961: istore #17
    //   963: bipush #6
    //   965: anewarray java/lang/invoke/MethodHandle
    //   968: astore #18
    //   970: aload #16
    //   972: astore #19
    //   974: aload #19
    //   976: arraylength
    //   977: istore #20
    //   979: iconst_0
    //   980: istore #21
    //   982: iload #21
    //   984: iload #20
    //   986: if_icmpge -> 1046
    //   989: aload #19
    //   991: iload #21
    //   993: aaload
    //   994: astore #22
    //   996: aload #18
    //   998: iload #17
    //   1000: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   1003: sipush #13996
    //   1006: ldc2_w 5807877592864777619
    //   1009: lload #9
    //   1011: lxor
    //   1012: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1017: lload #13
    //   1019: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   1022: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1025: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1028: aload #22
    //   1030: invokevirtual getFieldByName : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   1033: invokevirtual unreflectGetter : (Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;
    //   1036: aastore
    //   1037: iinc #17, 1
    //   1040: iinc #21, 1
    //   1043: goto -> 982
    //   1046: aload #18
    //   1048: putstatic me/rerere/matrix/internal/ek.z : [Ljava/lang/invoke/MethodHandle;
    //   1051: aload #15
    //   1053: sipush #13554
    //   1056: ldc2_w 5746115438350723019
    //   1059: lload #9
    //   1061: lxor
    //   1062: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1067: lload #11
    //   1069: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   1072: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1075: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1078: sipush #3043
    //   1081: ldc2_w 9016674479392151746
    //   1084: lload #9
    //   1086: lxor
    //   1087: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1092: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   1095: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   1098: putstatic me/rerere/matrix/internal/ek.v : Ljava/lang/invoke/MethodHandle;
    //   1101: aload #15
    //   1103: sipush #7389
    //   1106: ldc2_w 6141774617634426872
    //   1109: lload #9
    //   1111: lxor
    //   1112: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1117: lload #13
    //   1119: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   1122: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1125: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1128: sipush #27579
    //   1131: ldc2_w 5321148673104689296
    //   1134: lload #9
    //   1136: lxor
    //   1137: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1142: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   1145: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   1148: putstatic me/rerere/matrix/internal/ek.x : Ljava/lang/invoke/MethodHandle;
    //   1151: aload #15
    //   1153: sipush #27532
    //   1156: ldc2_w 3407023103312804004
    //   1159: lload #9
    //   1161: lxor
    //   1162: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1167: lload #13
    //   1169: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   1172: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1175: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1178: sipush #13275
    //   1181: ldc2_w 2893802654139932913
    //   1184: lload #9
    //   1186: lxor
    //   1187: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1192: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   1195: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   1198: putstatic me/rerere/matrix/internal/ek.a : Ljava/lang/invoke/MethodHandle;
    //   1201: aload #15
    //   1203: sipush #30837
    //   1206: ldc2_w 7847150982170291031
    //   1209: lload #9
    //   1211: lxor
    //   1212: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1217: lload #13
    //   1219: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   1222: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1225: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1228: sipush #10014
    //   1231: ldc2_w 1766077827922719787
    //   1234: lload #9
    //   1236: lxor
    //   1237: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1242: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   1245: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   1248: putstatic me/rerere/matrix/internal/ek.u : Ljava/lang/invoke/MethodHandle;
    //   1251: aload #15
    //   1253: sipush #31209
    //   1256: ldc2_w 8819813838402464458
    //   1259: lload #9
    //   1261: lxor
    //   1262: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1267: lload #13
    //   1269: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   1272: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1275: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1278: invokevirtual getMethods : ()Ljava/util/Set;
    //   1281: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   1286: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   1291: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   1296: invokeinterface findFirst : ()Ljava/util/Optional;
    //   1301: invokevirtual get : ()Ljava/lang/Object;
    //   1304: checkcast java/lang/reflect/Method
    //   1307: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   1310: putstatic me/rerere/matrix/internal/ek.o : Ljava/lang/invoke/MethodHandle;
    //   1313: aload #15
    //   1315: sipush #24870
    //   1318: ldc2_w 8271970955876971036
    //   1321: lload #9
    //   1323: lxor
    //   1324: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1329: lload #11
    //   1331: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   1334: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1337: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   1340: sipush #25820
    //   1343: ldc2_w 7213163528871884792
    //   1346: lload #9
    //   1348: lxor
    //   1349: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   1354: invokevirtual getMethodByName : (Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   1357: invokevirtual unreflect : (Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   1360: putstatic me/rerere/matrix/internal/ek.l : Ljava/lang/invoke/MethodHandle;
    //   1363: goto -> 1373
    //   1366: astore #15
    //   1368: aload #15
    //   1370: invokevirtual printStackTrace : ()V
    //   1373: return
    // Exception table:
    //   from	to	target	type
    //   332	1363	1366	java/lang/IllegalAccessException
    //   332	1363	1366	java/lang/ClassNotFoundException
    //   332	1363	1366	java/lang/NoSuchMethodException
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    return paramBlock.getBreakSpeed(paramPlayer);
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ek.l : Ljava/lang/invoke/MethodHandle;
    //   3: aconst_null
    //   4: aload_1
    //   5: invokevirtual invoke : (Ljava/lang/Void;Lorg/bukkit/inventory/ItemStack;)Ljava/lang/Object;
    //   8: astore #4
    //   10: getstatic me/rerere/matrix/internal/ek.u : Ljava/lang/invoke/MethodHandle;
    //   13: aload #4
    //   15: invokevirtual invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   18: astore #5
    //   20: getstatic me/rerere/matrix/internal/ek.o : Ljava/lang/invoke/MethodHandle;
    //   23: aload #5
    //   25: invokevirtual invoke : (Ljava/lang/Object;)Ljava/lang/Enum;
    //   28: astore #6
    //   30: aload #6
    //   32: invokevirtual ordinal : ()I
    //   35: ifle -> 46
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   45: athrow
    //   46: iconst_0
    //   47: ireturn
    //   48: astore #4
    //   50: aload #4
    //   52: invokevirtual printStackTrace : ()V
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: sipush #16858
    //   62: ldc2_w 260204918027881853
    //   65: lload_2
    //   66: lxor
    //   67: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: athrow
    // Exception table:
    //   from	to	target	type
    //   0	47	48	java/lang/Throwable
    //   30	42	42	java/lang/Throwable
  }
  
  public boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2) {
    return paramWorld.isChunkLoaded(paramInt1, paramInt2);
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    Object object = b(paramBlock, l);
    try {
      return a.invoke(object);
    } catch (Throwable throwable) {
      throwable.printStackTrace();
      return 0.6F;
    } 
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return paramEntity.isOnGround();
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    // Byte code:
    //   0: new java/lang/RuntimeException
    //   3: dup
    //   4: sipush #3538
    //   7: ldc2_w 7690074217164443278
    //   10: lload_1
    //   11: lxor
    //   12: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: athrow
  }
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic org/bukkit/attribute/Attribute.GENERIC_MOVEMENT_SPEED : Lorg/bukkit/attribute/Attribute;
    //   4: invokeinterface getAttribute : (Lorg/bukkit/attribute/Attribute;)Lorg/bukkit/attribute/AttributeInstance;
    //   9: astore #4
    //   11: aload #4
    //   13: sipush #17297
    //   16: ldc2_w 4085142261806116271
    //   19: lload_2
    //   20: lxor
    //   21: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   26: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   29: checkcast org/bukkit/attribute/AttributeInstance
    //   32: invokeinterface getValue : ()D
    //   37: d2f
    //   38: freturn
  }
  
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    try {
      Object object1 = w.invoke(paramBlock.getWorld());
      Object object2 = k.invoke(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
      Object object3 = r.invoke(paramBlock.getChunk());
      Object object4 = b.invoke(object3, object2);
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Object object5 = (paramya == ya.v) ? s.invoke(object4, object1, object2) : f.invoke(object4, object1, object2);
      List list = t.invoke(object5);
      sa[] arrayOfSa = new sa[list.size()];
      byte b = 0;
      for (Object object : list) {
        double d1 = z[0].invoke(object);
        double d2 = z[1].invoke(object);
        double d3 = z[2].invoke(object);
        double d4 = z[3].invoke(object);
        double d5 = z[4].invoke(object);
        double d6 = z[5].invoke(object);
        arrayOfSa[b++] = new sa(paramBlock.getX() + d1, paramBlock.getY() + d2, paramBlock.getZ() + d3, paramBlock.getX() + d4, paramBlock.getY() + d5, paramBlock.getZ() + d6);
      } 
      return arrayOfSa;
    } catch (Throwable throwable) {
      throwable.printStackTrace();
      System.out.println(g.getDeclaringClass().getName());
      System.out.println(g.getName());
      for (Class<?> clazz : g.getParameterTypes())
        System.out.println(clazz.getName()); 
      return null;
    } 
  }
  
  @NotNull
  public sa b(long paramLong, @NotNull Entity paramEntity) {
    BoundingBox boundingBox = paramEntity.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {}
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
  
  private static String b(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xBAB;
    if (n[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])p.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          p.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ek", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = m[i].getBytes("ISO-8859-1");
      n[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return n[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = b(i, l);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ek'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */