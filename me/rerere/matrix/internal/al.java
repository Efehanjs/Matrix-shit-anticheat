package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class al extends uj {
  public static String v;
  
  public static boolean b;
  
  public static boolean i;
  
  private static int[] a;
  
  private static final long d = o3.a(1823005006009262494L, 9062950621772979L, MethodHandles.lookup().lookupClass()).a(244031721656571L);
  
  private static final String[] e;
  
  private static final String[] f;
  
  private static final Map g = new HashMap<>(13);
  
  public static String b(String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/al.d : J
    //   3: ldc2_w 87871460522749
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic a : ()I
    //   11: istore_3
    //   12: getstatic me/rerere/matrix/internal/gl.k : Ljava/util/Map;
    //   15: invokeinterface size : ()I
    //   20: ifle -> 101
    //   23: aload_0
    //   24: astore #4
    //   26: getstatic me/rerere/matrix/internal/gl.k : Ljava/util/Map;
    //   29: invokeinterface entrySet : ()Ljava/util/Set;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #5
    //   41: aload #5
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 98
    //   51: aload #5
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast java/util/Map$Entry
    //   61: astore #6
    //   63: aload #4
    //   65: aload #6
    //   67: invokeinterface getKey : ()Ljava/lang/Object;
    //   72: checkcast java/lang/CharSequence
    //   75: aload #6
    //   77: invokeinterface getValue : ()Ljava/lang/Object;
    //   82: checkcast java/lang/CharSequence
    //   85: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   88: iload_3
    //   89: ifne -> 100
    //   92: astore #4
    //   94: iload_3
    //   95: ifeq -> 41
    //   98: aload #4
    //   100: areturn
    //   101: aload_0
    //   102: areturn
  }
  
  @Nullable
  public static List b(@Nullable List paramList, long paramLong) {
    paramLong = d ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (paramList == null)
            return null; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (List)paramList.stream().map(al::b).collect(Collectors.toList());
  }
  
  public void b(byte paramByte, long paramLong) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #56
    //   4: lshl
    //   5: lload_2
    //   6: bipush #8
    //   8: lshl
    //   9: bipush #8
    //   11: lushr
    //   12: lor
    //   13: lstore #4
    //   15: lload #4
    //   17: dup2
    //   18: ldc2_w 53879252121136
    //   21: lxor
    //   22: dup2
    //   23: bipush #48
    //   25: lushr
    //   26: l2i
    //   27: istore #6
    //   29: dup2
    //   30: bipush #16
    //   32: lshl
    //   33: bipush #32
    //   35: lushr
    //   36: l2i
    //   37: istore #7
    //   39: dup2
    //   40: bipush #48
    //   42: lshl
    //   43: bipush #48
    //   45: lushr
    //   46: l2i
    //   47: istore #8
    //   49: pop2
    //   50: dup2
    //   51: ldc2_w 60790989892389
    //   54: lxor
    //   55: lstore #9
    //   57: dup2
    //   58: ldc2_w 81016675489952
    //   61: lxor
    //   62: lstore #11
    //   64: dup2
    //   65: ldc2_w 0
    //   68: lxor
    //   69: dup2
    //   70: bipush #56
    //   72: lushr
    //   73: l2i
    //   74: istore #13
    //   76: dup2
    //   77: bipush #8
    //   79: lshl
    //   80: bipush #8
    //   82: lushr
    //   83: lstore #14
    //   85: pop2
    //   86: pop2
    //   87: aload_0
    //   88: iload #13
    //   90: i2b
    //   91: lload #14
    //   93: invokespecial b : (BJ)V
    //   96: iconst_0
    //   97: istore #17
    //   99: invokestatic r : ()I
    //   102: iconst_0
    //   103: istore #18
    //   105: aload_0
    //   106: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   109: iconst_0
    //   110: invokevirtual getKeys : (Z)Ljava/util/Set;
    //   113: invokeinterface iterator : ()Ljava/util/Iterator;
    //   118: astore #19
    //   120: istore #16
    //   122: aload #19
    //   124: invokeinterface hasNext : ()Z
    //   129: ifeq -> 1205
    //   132: aload #19
    //   134: invokeinterface next : ()Ljava/lang/Object;
    //   139: checkcast java/lang/String
    //   142: astore #20
    //   144: iload #6
    //   146: i2c
    //   147: aload #20
    //   149: iload #7
    //   151: iload #8
    //   153: i2c
    //   154: invokestatic b : (CLjava/lang/String;IC)Lme/rerere/matrix/internal/yk;
    //   157: astore #21
    //   159: iload #16
    //   161: iload_1
    //   162: iflt -> 1387
    //   165: ifeq -> 1367
    //   168: aload #21
    //   170: ifnonnull -> 187
    //   173: goto -> 180
    //   176: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: goto -> 122
    //   183: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   186: athrow
    //   187: aload_0
    //   188: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   191: iload_1
    //   192: iflt -> 231
    //   195: aload #20
    //   197: iload #16
    //   199: ifeq -> 228
    //   202: invokevirtual isConfigurationSection : (Ljava/lang/String;)Z
    //   205: ifne -> 222
    //   208: goto -> 215
    //   211: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: goto -> 122
    //   218: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   221: athrow
    //   222: aload_0
    //   223: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   226: aload #20
    //   228: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   231: astore #22
    //   233: aload #22
    //   235: iload #16
    //   237: lload_2
    //   238: lconst_0
    //   239: lcmp
    //   240: iflt -> 281
    //   243: ifeq -> 278
    //   246: ifnonnull -> 260
    //   249: goto -> 256
    //   252: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   255: athrow
    //   256: iload_1
    //   257: ifge -> 122
    //   260: aload #21
    //   262: new me/rerere/matrix/internal/ci
    //   265: dup
    //   266: aload #21
    //   268: aload #22
    //   270: invokespecial <init> : (Lme/rerere/matrix/internal/yk;Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;)V
    //   273: invokevirtual b : (Lme/rerere/matrix/internal/ci;)V
    //   276: aload #22
    //   278: sipush #2027
    //   281: ldc2_w 5829586062862311147
    //   284: lload #4
    //   286: lxor
    //   287: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   292: iconst_1
    //   293: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   298: istore #23
    //   300: iload #16
    //   302: iload_1
    //   303: iflt -> 339
    //   306: ifeq -> 331
    //   309: iload #23
    //   311: ifeq -> 342
    //   314: goto -> 321
    //   317: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   320: athrow
    //   321: iinc #17, 1
    //   324: goto -> 331
    //   327: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: lload_2
    //   332: lconst_0
    //   333: lcmp
    //   334: iflt -> 359
    //   337: iload #16
    //   339: ifne -> 352
    //   342: iinc #18, 1
    //   345: goto -> 352
    //   348: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   351: athrow
    //   352: aload #21
    //   354: iload #23
    //   356: invokevirtual b : (Z)V
    //   359: aload #21
    //   361: getstatic me/rerere/matrix/internal/yk.o : Lme/rerere/matrix/internal/yk;
    //   364: if_acmpne -> 456
    //   367: iload #23
    //   369: iload #16
    //   371: lload_2
    //   372: lconst_0
    //   373: lcmp
    //   374: ifle -> 485
    //   377: ifeq -> 477
    //   380: goto -> 387
    //   383: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   386: athrow
    //   387: ifne -> 456
    //   390: goto -> 397
    //   393: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   396: athrow
    //   397: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   400: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   403: sipush #5777
    //   406: ldc2_w 2566882261177847701
    //   409: lload #4
    //   411: lxor
    //   412: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   417: invokevirtual warning : (Ljava/lang/String;)V
    //   420: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   423: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   426: sipush #20186
    //   429: ldc2_w 3928950166119389120
    //   432: lload #4
    //   434: lxor
    //   435: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   440: invokevirtual warning : (Ljava/lang/String;)V
    //   443: ldc2_w 3000
    //   446: invokestatic b : (J)V
    //   449: goto -> 456
    //   452: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   455: athrow
    //   456: aload #22
    //   458: sipush #18892
    //   461: ldc2_w 1336369650501882065
    //   464: lload #4
    //   466: lxor
    //   467: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   472: invokeinterface contains : (Ljava/lang/String;)Z
    //   477: lload_2
    //   478: lconst_0
    //   479: lcmp
    //   480: ifle -> 643
    //   483: iload #16
    //   485: ifeq -> 643
    //   488: ifeq -> 545
    //   491: goto -> 498
    //   494: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   497: athrow
    //   498: aload #21
    //   500: aload #22
    //   502: sipush #1399
    //   505: ldc2_w 3352710347453684843
    //   508: lload #4
    //   510: lxor
    //   511: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   516: sipush #17600
    //   519: ldc2_w 5402646351578897886
    //   522: lload #4
    //   524: lxor
    //   525: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   530: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   535: invokevirtual b : (Ljava/lang/String;)V
    //   538: goto -> 545
    //   541: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   544: athrow
    //   545: aload #21
    //   547: aload #22
    //   549: sipush #17754
    //   552: ldc2_w 8748098661611314269
    //   555: lload #4
    //   557: lxor
    //   558: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   563: bipush #30
    //   565: invokeinterface getInt : (Ljava/lang/String;I)I
    //   570: invokevirtual m : (I)V
    //   573: aload #21
    //   575: iload #16
    //   577: lload_2
    //   578: lconst_0
    //   579: lcmp
    //   580: iflt -> 612
    //   583: ifeq -> 811
    //   586: aload #22
    //   588: sipush #31544
    //   591: ldc2_w 6119774170953425458
    //   594: lload #4
    //   596: lxor
    //   597: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   602: aload #21
    //   604: invokevirtual m : ()I
    //   607: invokeinterface getInt : (Ljava/lang/String;I)I
    //   612: invokevirtual b : (I)V
    //   615: aload #22
    //   617: sipush #31258
    //   620: ldc2_w 1105185229666919189
    //   623: lload #4
    //   625: lxor
    //   626: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   631: invokeinterface contains : (Ljava/lang/String;)Z
    //   636: goto -> 643
    //   639: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   642: athrow
    //   643: lload_2
    //   644: lconst_0
    //   645: lcmp
    //   646: ifle -> 687
    //   649: ifeq -> 802
    //   652: aload #21
    //   654: new java/util/HashSet
    //   657: dup
    //   658: aload #22
    //   660: sipush #19393
    //   663: ldc2_w 6359795706929844949
    //   666: lload #4
    //   668: lxor
    //   669: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   674: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   679: invokespecial <init> : (Ljava/util/Collection;)V
    //   682: invokevirtual b : (Ljava/util/Set;)V
    //   685: iload #16
    //   687: iload_1
    //   688: iflt -> 799
    //   691: ifeq -> 797
    //   694: goto -> 701
    //   697: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   700: athrow
    //   701: aload #21
    //   703: invokevirtual b : ()Ljava/util/Set;
    //   706: invokeinterface size : ()I
    //   711: ifle -> 815
    //   714: goto -> 721
    //   717: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   720: athrow
    //   721: new java/lang/StringBuilder
    //   724: dup
    //   725: invokespecial <init> : ()V
    //   728: sipush #2260
    //   731: ldc2_w 1006561084259029465
    //   734: lload #4
    //   736: lxor
    //   737: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: aload #21
    //   747: invokevirtual j : ()Ljava/lang/String;
    //   750: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: sipush #3789
    //   756: ldc2_w 7827210921397180360
    //   759: lload #4
    //   761: lxor
    //   762: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   767: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   770: ldc_w ','
    //   773: aload #21
    //   775: invokevirtual b : ()Ljava/util/Set;
    //   778: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   781: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   784: invokevirtual toString : ()Ljava/lang/String;
    //   787: invokestatic b : (Ljava/lang/String;)V
    //   790: goto -> 797
    //   793: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   796: athrow
    //   797: iload #16
    //   799: ifne -> 815
    //   802: aload #21
    //   804: goto -> 811
    //   807: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   810: athrow
    //   811: aconst_null
    //   812: invokevirtual b : (Ljava/util/Set;)V
    //   815: new java/util/HashMap
    //   818: dup
    //   819: invokespecial <init> : ()V
    //   822: astore #24
    //   824: aload #22
    //   826: sipush #31313
    //   829: ldc2_w 8217540079949390663
    //   832: lload #4
    //   834: lxor
    //   835: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   840: invokeinterface getConfigurationSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   845: iconst_0
    //   846: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   851: invokeinterface iterator : ()Ljava/util/Iterator;
    //   856: astore #25
    //   858: aload #25
    //   860: invokeinterface hasNext : ()Z
    //   865: ifeq -> 1156
    //   868: aload #25
    //   870: invokeinterface next : ()Ljava/lang/Object;
    //   875: checkcast java/lang/String
    //   878: astore #26
    //   880: aload #22
    //   882: sipush #9205
    //   885: ldc2_w 7768695396876352224
    //   888: lload #4
    //   890: lxor
    //   891: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   896: invokeinterface getConfigurationSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   901: astore #27
    //   903: aload #26
    //   905: invokestatic b : (Ljava/lang/String;)Z
    //   908: iload #16
    //   910: ifeq -> 129
    //   913: iload #16
    //   915: iload_1
    //   916: iflt -> 1389
    //   919: ifeq -> 1005
    //   922: ifne -> 1000
    //   925: goto -> 932
    //   928: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   931: athrow
    //   932: new java/lang/StringBuilder
    //   935: dup
    //   936: invokespecial <init> : ()V
    //   939: sipush #21676
    //   942: ldc2_w 8954931633953443234
    //   945: lload #4
    //   947: lxor
    //   948: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   953: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   956: aload #20
    //   958: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   961: sipush #19699
    //   964: ldc2_w 5842071157951960546
    //   967: lload #4
    //   969: lxor
    //   970: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   975: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   978: invokevirtual toString : ()Ljava/lang/String;
    //   981: invokestatic b : (Ljava/lang/String;)V
    //   984: iload #16
    //   986: iload_1
    //   987: iflt -> 865
    //   990: ifne -> 858
    //   993: goto -> 1000
    //   996: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   999: athrow
    //   1000: aload #26
    //   1002: invokestatic parseInt : (Ljava/lang/String;)I
    //   1005: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1008: astore #28
    //   1010: aload #27
    //   1012: aload #26
    //   1014: invokeinterface isString : (Ljava/lang/String;)Z
    //   1019: lload_2
    //   1020: lconst_0
    //   1021: lcmp
    //   1022: ifle -> 1111
    //   1025: iload #16
    //   1027: ifeq -> 1111
    //   1030: ifeq -> 1083
    //   1033: goto -> 1040
    //   1036: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1039: athrow
    //   1040: aload #24
    //   1042: aload #28
    //   1044: aload #27
    //   1046: aload #26
    //   1048: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1053: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1056: lload #11
    //   1058: invokestatic b : (Ljava/util/List;J)Ljava/util/List;
    //   1061: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1066: pop
    //   1067: iload #16
    //   1069: iload_1
    //   1070: iflt -> 1153
    //   1073: ifne -> 1151
    //   1076: goto -> 1083
    //   1079: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1082: athrow
    //   1083: aload #27
    //   1085: iload #16
    //   1087: ifeq -> 1150
    //   1090: goto -> 1097
    //   1093: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1096: athrow
    //   1097: aload #26
    //   1099: invokeinterface isList : (Ljava/lang/String;)Z
    //   1104: goto -> 1111
    //   1107: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1110: athrow
    //   1111: lload_2
    //   1112: lconst_0
    //   1113: lcmp
    //   1114: ifle -> 1153
    //   1117: ifeq -> 1151
    //   1120: aload #24
    //   1122: aload #28
    //   1124: aload #27
    //   1126: aload #26
    //   1128: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   1133: lload #11
    //   1135: invokestatic b : (Ljava/util/List;J)Ljava/util/List;
    //   1138: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1143: goto -> 1150
    //   1146: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1149: athrow
    //   1150: pop
    //   1151: iload #16
    //   1153: ifne -> 858
    //   1156: aload #21
    //   1158: aload #24
    //   1160: invokevirtual b : (Ljava/util/Map;)V
    //   1163: aload #21
    //   1165: aload #22
    //   1167: sipush #23356
    //   1170: ldc2_w 8829493721217958447
    //   1173: lload #4
    //   1175: lxor
    //   1176: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1181: iconst_0
    //   1182: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1187: invokevirtual p : (I)V
    //   1190: iload #16
    //   1192: lload_2
    //   1193: lconst_0
    //   1194: lcmp
    //   1195: iflt -> 129
    //   1198: iload_1
    //   1199: iflt -> 1326
    //   1202: ifne -> 122
    //   1205: new java/lang/StringBuilder
    //   1208: dup
    //   1209: invokespecial <init> : ()V
    //   1212: sipush #3468
    //   1215: ldc2_w 3166961019984204928
    //   1218: lload #4
    //   1220: lxor
    //   1221: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1229: iload #17
    //   1231: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1234: sipush #1513
    //   1237: ldc2_w 415026181132999906
    //   1240: lload #4
    //   1242: lxor
    //   1243: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1251: iload #18
    //   1253: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1256: sipush #18063
    //   1259: ldc2_w 4719169431741341582
    //   1262: lload #4
    //   1264: lxor
    //   1265: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1273: invokevirtual toString : ()Ljava/lang/String;
    //   1276: invokestatic b : (Ljava/lang/String;)V
    //   1279: aload_0
    //   1280: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   1283: sipush #23105
    //   1286: ldc2_w 5399498181628592986
    //   1289: lload #4
    //   1291: lxor
    //   1292: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1297: iconst_1
    //   1298: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   1301: putstatic me/rerere/matrix/internal/al.i : Z
    //   1304: aload_0
    //   1305: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   1308: sipush #29259
    //   1311: ldc2_w 4813422257663748936
    //   1314: lload #4
    //   1316: lxor
    //   1317: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1322: iconst_0
    //   1323: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   1326: putstatic me/rerere/matrix/internal/al.b : Z
    //   1329: aload_0
    //   1330: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   1333: sipush #8737
    //   1336: ldc2_w 5238714582123313977
    //   1339: lload #4
    //   1341: lxor
    //   1342: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1347: sipush #21801
    //   1350: ldc2_w 8385783478899379247
    //   1353: lload #4
    //   1355: lxor
    //   1356: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1361: invokevirtual getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1364: putstatic me/rerere/matrix/internal/al.v : Ljava/lang/String;
    //   1367: getstatic me/rerere/matrix/internal/al.v : Ljava/lang/String;
    //   1370: sipush #8860
    //   1373: ldc2_w 192102102858660766
    //   1376: lload #4
    //   1378: lxor
    //   1379: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1384: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1387: iload #16
    //   1389: lload_2
    //   1390: lconst_0
    //   1391: lcmp
    //   1392: ifle -> 1443
    //   1395: ifeq -> 1435
    //   1398: ifeq -> 1432
    //   1401: goto -> 1408
    //   1404: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1407: athrow
    //   1408: sipush #24424
    //   1411: ldc2_w 2060905018753058424
    //   1414: lload #4
    //   1416: lxor
    //   1417: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1422: invokestatic b : (Ljava/lang/String;)V
    //   1425: goto -> 1432
    //   1428: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1431: athrow
    //   1432: getstatic me/rerere/matrix/internal/al.b : Z
    //   1435: lload_2
    //   1436: lconst_0
    //   1437: lcmp
    //   1438: ifle -> 1502
    //   1441: iload #16
    //   1443: ifeq -> 1502
    //   1446: ifeq -> 1480
    //   1449: goto -> 1456
    //   1452: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1455: athrow
    //   1456: sipush #5233
    //   1459: ldc2_w 7547254291046878568
    //   1462: lload #4
    //   1464: lxor
    //   1465: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1470: invokestatic b : (Ljava/lang/String;)V
    //   1473: goto -> 1480
    //   1476: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1479: athrow
    //   1480: aload_0
    //   1481: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   1484: sipush #8571
    //   1487: ldc2_w 7886774041829472361
    //   1490: lload #4
    //   1492: lxor
    //   1493: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1498: iconst_0
    //   1499: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   1502: ifeq -> 1535
    //   1505: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   1508: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   1511: sipush #1747
    //   1514: ldc2_w 8701645308460097476
    //   1517: lload #4
    //   1519: lxor
    //   1520: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   1525: invokevirtual warning : (Ljava/lang/String;)V
    //   1528: goto -> 1535
    //   1531: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1534: athrow
    //   1535: lload #9
    //   1537: invokestatic b : (J)V
    //   1540: return
    // Exception table:
    //   from	to	target	type
    //   159	173	176	java/lang/RuntimeException
    //   168	183	183	java/lang/RuntimeException
    //   187	208	211	java/lang/RuntimeException
    //   202	218	218	java/lang/RuntimeException
    //   233	249	252	java/lang/RuntimeException
    //   300	314	317	java/lang/RuntimeException
    //   309	324	327	java/lang/RuntimeException
    //   331	345	348	java/lang/RuntimeException
    //   352	380	383	java/lang/RuntimeException
    //   367	390	393	java/lang/RuntimeException
    //   387	449	452	java/lang/RuntimeException
    //   477	491	494	java/lang/RuntimeException
    //   488	538	541	java/lang/RuntimeException
    //   545	636	639	java/lang/RuntimeException
    //   643	694	697	java/lang/RuntimeException
    //   652	714	717	java/lang/RuntimeException
    //   701	790	793	java/lang/RuntimeException
    //   797	804	807	java/lang/RuntimeException
    //   913	925	928	java/lang/RuntimeException
    //   922	993	996	java/lang/RuntimeException
    //   1010	1033	1036	java/lang/RuntimeException
    //   1030	1076	1079	java/lang/RuntimeException
    //   1040	1090	1093	java/lang/RuntimeException
    //   1083	1104	1107	java/lang/RuntimeException
    //   1111	1143	1146	java/lang/RuntimeException
    //   1367	1401	1404	java/lang/RuntimeException
    //   1398	1425	1428	java/lang/RuntimeException
    //   1435	1449	1452	java/lang/RuntimeException
    //   1446	1473	1476	java/lang/RuntimeException
    //   1502	1528	1531	java/lang/RuntimeException
  }
  
  public al(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/al.d : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 114196890656300
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: lload_3
    //   16: sipush #28411
    //   19: ldc2_w 37187482875106580
    //   22: lload_1
    //   23: lxor
    //   24: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   29: invokespecial <init> : (JLjava/lang/String;)V
    //   32: return
  }
  
  public static void q(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] e() {
    return a;
  }
  
  static {
    q(null);
    long l = d ^ 0x660FE8D07535L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[30];
    boolean bool = false;
    String str;
    int i = (str = "±²*Ê°ÿÏ#B´8éVè¶\027]M¥d\021äú²«q\021§¶ºÝî^bs½c\023:¤g`Ï³åª?\020QEÅ|\013\"~6óæxD\004¥Ée\"Ò\016«ð=7>7¸3Æ?ìøjBAqöÚÜySãUùbÿþðJÖëÐ¹¢+êÊø©¬¹Á*á;xhçNâÑZ'á\007:÷(7Z`8Åc\003AÏÕv5Xx¿AãÈ7%( ¾þÇb£ÞÕFWWqKý\007(\"ß:bIH\003ýg$¡¬\005u\\+'Oh aá\007Ã\027\"Á|8y7ÅIµt¢Mk¥A¶\002\021xîÏ\035C \002ùMñõ$\0261@q\016[°)FZ.©%é§®³×ïK5òÂÕo \002~lSO§z*¥x*\023¼Cq>\004àZjs\026/Ã(\034,¬Á®«\fSïMoºê2I\005éÉUý¸l[+ý\037_Y¹\\ä·|\031(´\037\004\025û2;!\003>¾\007Ùp³ÿÁV7ècõáµPª²îÜý\025ÿq :\024¶a¿ -\f\027-¾O\003¡Þ)L«ß1\0248î°f\020ØÙ99sÊmóGÎ$P·V¼+ü2 ï~¾\005\fV\005ìPÆÇ\036=\032íî\027-G|ÐW\031~Ê*Sþ`.ñÐ>½Ð;AÌÜ\001%g%`³Q\\ÛAJ³F\025)ª¬\016\rÄ|7a#\006I9\t<\021{G%<ÖT$C!ã²EKVäk38ãSÜ ¥~Ã¢=îçVë\002lÚ}K­If\036Lú:hü\000¬\020\r\005\0208Õ£üGBÚt<=\t){Ê÷\020%`Ú»|VQB:¯\030\\Hã\020´·­\024$ ÍÀ\034în°b8¯ÌøñÃ·á\037þkµµ\033ÌD×I%y ¯§â\020\bYþº'|·?|Õ¾gâX×~d\002\021aG÷ý`tÑðX§Ç?¥Öæ¶j\füÛe2Ímà¡7ýv} gçFüòa þÐÌàE\016¬sZ°\nÓ#ø<6å«\017éBôrS¦qÍç¡æ ±âå+¢Rìs6XÃ¹\020óýf\007MÊ¾uD1`\0227ñc\006[Mß}®rZq8î\005Í÷!Hgø<Ã¤úù\030ügÿý$k)\004\031Þç-H»t&\022\036é\002SÓ|°¦Êî³°ýe°ÄHCä ä£¬Þ¼yé\031Öü^Ä\035yNÀGB¶F;Ò).£\f\023^Ö\022-­¥\001V'V£\t\030D_®â\036+z·~â¤\036ÿaÂX ¼¤ÄUóÃ 9#â»\\2\017cYXV¢~÷\026û\\ÎÜ\030=wJ¢Ô\006c0¼ëèØ\005|RúYî\026½²ÄÙ\020«î¨\025\f!eÐm§A|o@(Þ%ô6LÍÐ\017j\031ji9O\024¹oeW1uJ[ÈÜ^\013/ùj@nî`)Mñd±\003\007*^\032Ù7{Ä=#\030lP!©\032rö>Ôf´á\rÊ$HJz\035¤jÍÀ\022f¼Èp\026]úîì`æ©\021þÌFÎ(\"W\000ÆY&æ\031\000\b\034´\034êÎ\003cøx9,MÂ@X?\037BVJRTlu;¦åíh0%­¢\003ÎÛ2I\"ÑÒ7lÈë ë&\022nÝJët®¡\027×\022Èmu2þZ>;¸¸!\020ûâ'TTÕ\002ÃÆ2\017öj¬X\020Ç£\026\000\003¯<é\0230XÕ9ØÄb\020zzT\023õó§Ø\027xK\025fº s¬kÙãmÖ\023÷tÇ\026°q¹\037\036x\003?¾ÒË¨®u[S½X2\\ú7³>©t:£)ñõHa\030æx®u\002\000HÚºH)o\034~­CY«²t¥Éð÷T\0246«É$\027ÑÓì¢>.oeÉëh\016­ ¤8Óë«|zS°@\000·½\030Â\030\016r\017Õ³{EixËÑ¾xï/i¸eñH\026³ \bV¯(>ÿI1#K;`\007$ûF!\000ÅÆªR0À@8m×ñ").length();
    char c = 'Ð';
    byte b1 = -1;
    while (true);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x234A;
    if (f[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])g.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          g.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/al", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = e[i].getBytes("ISO-8859-1");
      f[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return f[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/al'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */