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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.command.CommandSender;

public final class dj extends xl {
  @NotNull
  public static final vg b;
  
  @Nullable
  private final List i;
  
  private static final long a = o3.a(4297416830757199008L, 5414087311941423471L, MethodHandles.lookup().lookupClass()).a(140668520430114L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  @Nullable
  public List b(long paramLong) {
    return this.i;
  }
  
  static {
    long l = a ^ 0x41263EBEDA37L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[23];
    boolean bool = false;
    String str;
    int i = (str = "\"b\024:ww.è=à¬5ö±æÖKÁÿ£¬©Qè \021ÝÂO¹\020vT\007«<bkö.±\035\rYTõ ­ôK\016f\016ºõø`kv\n9ëhK\016PÓíCåk\tH\020\006Æi\000U<ý\037\\ôóy¬\021\030­= Ãi\017ÎÁü&ÕÐQï¿p\034~P¿x ¤Ú~|Ô  Øüþ/Áöò\0026¾`ûª´\t\004ÞQ\b¥D!i\nR \fMM1X(\002|÷ò\024c Û'ÏÉrÁm×\022c×ðë'ä± rÕ\022ðSÜ,5¸JUR5ÄÃËô?ê«F\020¬jÇ(ù\006\026/¦w\tny9\037KÐ RÌs§w¦\006\002+s=J¦e¦Ärò¯\037# Ôn\020\037=ã2cZ²BìxëæÕU\000\037|¹áÅ\005Ø\036i:24P4¶Î.I#þë³âéÆt<ÖÂtÐ/§C¨äúb\002\036²OË7¶\\×ãêìWÁr\003_\016lß\t^bL\037ÿ|Öhd¢\017$lf³[>Ë¸fHv¦éî<\020ª°0oÁ[¾Z\037ÞÿCa(Q{3-¾=V\007\027\022c\027áì«<;d9O²\031ë¦º+µ¸Ð·|ØÄ\007Î(J;4ß²|wp8Ií`1ÖÊXFó±#uÒ\034ÏYuöwÝÄï$¡I8Ay\017\013Æ]&\005ÛÈFñÆ\022Å\032gÍº\036C¾àÅU.Ìê\036\026Søbb\b=ÓX¤?\b°5Á\032)Åµ\020°¹C\"\002¬¢\007ì°E0ú\017~HdËª\001\032\013ù_¦^Ø±i¡~<lqÍ\"®ûÛ\033i\027ÇFÅY¦¶#ñÏD\bEil?L_ÊÎúÝ\bc²ð\001ñg·<¨F¿\032Ø(§¤\bµA;²q©½áûõÊä9ÃÉ{¼àÆÇò\"\035Ka?Ù\032ùlõ\007I ¨ÈÙ\tûú\033×[u\003\004\fÌ*\027ÓÍÑ_\033È$Øç·© \035ªIP!L!ªTQÃQô-¸Ú)[\032\025ýÒS»Ê\t8òúÂ¬ÒF0\ts8J\rMá¦\020Ê<´éÜv¼´\030\031\035÷\\i½U\000\035u§à2Áë²\036âÛ\024»P(Å%ÿl)Ûº1+(`MV(YÛ®FÇà/sùÿÙ:TqØ<\fÍvKtT¨q¾m?\0323÷&v*ôY\032#\025q¸¦diHë\0215/½\036\tu").length();
    byte b2 = 56;
    byte b = -1;
    while (true);
  }
  
  public void b(@NotNull CommandSender paramCommandSender, long paramLong, @NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 74712012505576
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 12004652908223
    //   12: lxor
    //   13: dup2
    //   14: bipush #32
    //   16: lushr
    //   17: l2i
    //   18: istore #7
    //   20: dup2
    //   21: bipush #32
    //   23: lshl
    //   24: bipush #32
    //   26: lushr
    //   27: l2i
    //   28: istore #8
    //   30: pop2
    //   31: dup2
    //   32: ldc2_w 58610639442468
    //   35: lxor
    //   36: lstore #9
    //   38: dup2
    //   39: ldc2_w 340646015403
    //   42: lxor
    //   43: lstore #11
    //   45: dup2
    //   46: ldc2_w 83089816486276
    //   49: lxor
    //   50: lstore #13
    //   52: dup2
    //   53: ldc2_w 76365162294671
    //   56: lxor
    //   57: lstore #15
    //   59: dup2
    //   60: ldc2_w 88091988967312
    //   63: lxor
    //   64: dup2
    //   65: bipush #48
    //   67: lushr
    //   68: l2i
    //   69: istore #17
    //   71: dup2
    //   72: bipush #16
    //   74: lshl
    //   75: bipush #48
    //   77: lushr
    //   78: l2i
    //   79: istore #18
    //   81: dup2
    //   82: bipush #32
    //   84: lshl
    //   85: bipush #32
    //   87: lushr
    //   88: l2i
    //   89: istore #19
    //   91: pop2
    //   92: pop2
    //   93: invokestatic r : ()I
    //   96: istore #20
    //   98: aload #4
    //   100: iload #20
    //   102: ifeq -> 135
    //   105: arraylength
    //   106: iconst_1
    //   107: if_icmpgt -> 133
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   116: athrow
    //   117: getstatic me/rerere/matrix/internal/dj.b : Lme/rerere/matrix/internal/vg;
    //   120: aload_1
    //   121: aload #4
    //   123: lload #5
    //   125: invokevirtual b : (Lorg/bukkit/command/CommandSender;[Ljava/lang/String;J)V
    //   128: return
    //   129: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   132: athrow
    //   133: aload #4
    //   135: iconst_1
    //   136: aaload
    //   137: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   140: dup
    //   141: ifnonnull -> 210
    //   144: pop
    //   145: aload_0
    //   146: checkcast me/rerere/matrix/internal/dj
    //   149: astore #24
    //   151: iconst_0
    //   152: istore #25
    //   154: aload_1
    //   155: new java/lang/StringBuilder
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: sipush #21171
    //   165: ldc2_w 8922797943304831200
    //   168: lload_2
    //   169: lxor
    //   170: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: aload #4
    //   180: iconst_1
    //   181: aaload
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: sipush #7256
    //   188: ldc2_w 3648683342440467983
    //   191: lload_2
    //   192: lxor
    //   193: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual toString : ()Ljava/lang/String;
    //   204: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   209: return
    //   210: astore #21
    //   212: iload #20
    //   214: lload_2
    //   215: lconst_0
    //   216: lcmp
    //   217: iflt -> 264
    //   220: ifeq -> 263
    //   223: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   226: lload #15
    //   228: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   231: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   234: aload #21
    //   236: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   241: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   244: dup
    //   245: ifnonnull -> 322
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: pop
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   262: athrow
    //   263: iconst_0
    //   264: istore #24
    //   266: aload_1
    //   267: new java/lang/StringBuilder
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: sipush #26712
    //   277: ldc2_w 8153382285786708493
    //   280: lload_2
    //   281: lxor
    //   282: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: aload #4
    //   292: iconst_1
    //   293: aaload
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: sipush #20365
    //   300: ldc2_w 7659117719493139919
    //   303: lload_2
    //   304: lxor
    //   305: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   321: return
    //   322: astore #22
    //   324: aload_1
    //   325: new java/lang/StringBuilder
    //   328: dup
    //   329: invokespecial <init> : ()V
    //   332: sipush #20187
    //   335: ldc2_w 7135944246081248414
    //   338: lload_2
    //   339: lxor
    //   340: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: aload #21
    //   350: invokeinterface getName : ()Ljava/lang/String;
    //   355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: sipush #28194
    //   361: ldc2_w 9001510436406819942
    //   364: lload_2
    //   365: lxor
    //   366: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: invokevirtual toString : ()Ljava/lang/String;
    //   377: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   382: aload_1
    //   383: new java/lang/StringBuilder
    //   386: dup
    //   387: invokespecial <init> : ()V
    //   390: sipush #4200
    //   393: ldc2_w 3605646932121322041
    //   396: lload_2
    //   397: lxor
    //   398: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: aload #22
    //   408: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   411: invokevirtual b : ()Ljava/lang/String;
    //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: invokevirtual toString : ()Ljava/lang/String;
    //   420: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   425: aload_1
    //   426: new java/lang/StringBuilder
    //   429: dup
    //   430: invokespecial <init> : ()V
    //   433: sipush #13249
    //   436: ldc2_w 1805375973922906527
    //   439: lload_2
    //   440: lxor
    //   441: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: aload #22
    //   451: invokevirtual j : ()I
    //   454: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   457: sipush #12075
    //   460: ldc2_w 667151309135789421
    //   463: lload_2
    //   464: lxor
    //   465: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: lload #11
    //   475: aload #21
    //   477: invokestatic j : (JLorg/bukkit/entity/Player;)I
    //   480: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   483: invokevirtual toString : ()Ljava/lang/String;
    //   486: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   491: aload_1
    //   492: new java/lang/StringBuilder
    //   495: dup
    //   496: invokespecial <init> : ()V
    //   499: sipush #6367
    //   502: ldc2_w 6374878897177463426
    //   505: lload_2
    //   506: lxor
    //   507: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: aload #22
    //   517: invokevirtual p : ()Z
    //   520: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   523: invokevirtual toString : ()Ljava/lang/String;
    //   526: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   531: iload #20
    //   533: ifeq -> 698
    //   536: aload #22
    //   538: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   541: iload #17
    //   543: i2c
    //   544: ldc_w me/rerere/matrix/internal/fk
    //   547: iload #18
    //   549: i2s
    //   550: iload #19
    //   552: invokevirtual b : (CLjava/lang/Class;SI)Lme/rerere/matrix/internal/zk;
    //   555: checkcast me/rerere/matrix/internal/fk
    //   558: dup
    //   559: ifnull -> 697
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   568: athrow
    //   569: astore #25
    //   571: iconst_0
    //   572: istore #26
    //   574: aload_1
    //   575: new java/lang/StringBuilder
    //   578: dup
    //   579: invokespecial <init> : ()V
    //   582: sipush #6449
    //   585: ldc2_w 3501635167865473899
    //   588: lload_2
    //   589: lxor
    //   590: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   595: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: aload #25
    //   600: invokevirtual b : ()D
    //   603: invokestatic b : (D)D
    //   606: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   609: sipush #2539
    //   612: ldc2_w 2280686364720470952
    //   615: lload_2
    //   616: lxor
    //   617: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: aload #25
    //   627: invokevirtual p : ()I
    //   630: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   633: invokevirtual toString : ()Ljava/lang/String;
    //   636: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   641: aload_1
    //   642: new java/lang/StringBuilder
    //   645: dup
    //   646: invokespecial <init> : ()V
    //   649: sipush #16683
    //   652: ldc2_w 5597084166035428210
    //   655: lload_2
    //   656: lxor
    //   657: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   662: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: aload #22
    //   667: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   670: iload #7
    //   672: iload #8
    //   674: invokevirtual b : (II)I
    //   677: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   680: bipush #41
    //   682: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   685: invokevirtual toString : ()Ljava/lang/String;
    //   688: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   693: nop
    //   694: goto -> 699
    //   697: pop
    //   698: nop
    //   699: aload #22
    //   701: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   704: astore #23
    //   706: iconst_0
    //   707: istore #24
    //   709: invokestatic values : ()[Lme/rerere/matrix/internal/yk;
    //   712: astore #25
    //   714: iconst_0
    //   715: istore #26
    //   717: aload #25
    //   719: arraylength
    //   720: istore #27
    //   722: iload #26
    //   724: iload #27
    //   726: if_icmpge -> 888
    //   729: aload #25
    //   731: iload #26
    //   733: aaload
    //   734: astore #28
    //   736: iload #20
    //   738: lload_2
    //   739: lconst_0
    //   740: lcmp
    //   741: ifle -> 754
    //   744: ifeq -> 883
    //   747: aload #28
    //   749: lload #13
    //   751: invokevirtual b : (J)Z
    //   754: lload_2
    //   755: lconst_0
    //   756: lcmp
    //   757: ifle -> 896
    //   760: iload #20
    //   762: ifeq -> 896
    //   765: goto -> 772
    //   768: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   771: athrow
    //   772: ifeq -> 880
    //   775: goto -> 782
    //   778: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   781: athrow
    //   782: aload #23
    //   784: lload #9
    //   786: aload #28
    //   788: invokevirtual b : (JLme/rerere/matrix/internal/yk;)I
    //   791: istore #29
    //   793: iload #20
    //   795: lload_2
    //   796: lconst_0
    //   797: lcmp
    //   798: ifle -> 885
    //   801: ifeq -> 883
    //   804: iload #29
    //   806: ifle -> 880
    //   809: goto -> 816
    //   812: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   815: athrow
    //   816: aload_1
    //   817: new java/lang/StringBuilder
    //   820: dup
    //   821: invokespecial <init> : ()V
    //   824: sipush #28697
    //   827: ldc2_w 1232712820055269961
    //   830: lload_2
    //   831: lxor
    //   832: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   837: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   840: aload #28
    //   842: invokevirtual j : ()Ljava/lang/String;
    //   845: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   848: sipush #32716
    //   851: ldc2_w 2705619652745424280
    //   854: lload_2
    //   855: lxor
    //   856: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   861: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: iload #29
    //   866: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   869: invokevirtual toString : ()Ljava/lang/String;
    //   872: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   877: iconst_1
    //   878: istore #24
    //   880: iinc #26, 1
    //   883: iload #20
    //   885: ifne -> 722
    //   888: lload_2
    //   889: lconst_0
    //   890: lcmp
    //   891: iflt -> 944
    //   894: iload #24
    //   896: ifne -> 925
    //   899: aload_1
    //   900: sipush #16235
    //   903: ldc2_w 414687343925079348
    //   906: lload_2
    //   907: lxor
    //   908: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   913: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   918: goto -> 925
    //   921: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   924: athrow
    //   925: aload_1
    //   926: sipush #31425
    //   929: ldc2_w 960995956614850714
    //   932: lload_2
    //   933: lxor
    //   934: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   939: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   944: aload #22
    //   946: invokevirtual b : ()Lme/rerere/matrix/internal/oc;
    //   949: invokevirtual b : ()[Ljava/lang/Object;
    //   952: checkcast [Ljava/lang/String;
    //   955: astore #25
    //   957: iconst_0
    //   958: istore #26
    //   960: aload #25
    //   962: arraylength
    //   963: iconst_m1
    //   964: iadd
    //   965: istore #27
    //   967: iconst_0
    //   968: lload_2
    //   969: lconst_0
    //   970: lcmp
    //   971: iflt -> 1058
    //   974: iload #20
    //   976: ifeq -> 1058
    //   979: iload #27
    //   981: if_icmpgt -> 1056
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   990: athrow
    //   991: iload #27
    //   993: istore #28
    //   995: iinc #27, -1
    //   998: aload #25
    //   1000: iload #28
    //   1002: aaload
    //   1003: astore #29
    //   1005: aload #29
    //   1007: ifnull -> 1050
    //   1010: aload_1
    //   1011: new java/lang/StringBuilder
    //   1014: dup
    //   1015: invokespecial <init> : ()V
    //   1018: sipush #20457
    //   1021: ldc2_w 5434531473802091957
    //   1024: lload_2
    //   1025: lxor
    //   1026: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1031: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1034: aload #29
    //   1036: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1039: invokevirtual toString : ()Ljava/lang/String;
    //   1042: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1047: iconst_1
    //   1048: istore #26
    //   1050: iconst_0
    //   1051: iload #27
    //   1053: if_icmple -> 991
    //   1056: iload #26
    //   1058: ifne -> 1087
    //   1061: aload_1
    //   1062: sipush #25182
    //   1065: ldc2_w 174797475460575262
    //   1068: lload_2
    //   1069: lxor
    //   1070: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1075: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1080: goto -> 1087
    //   1083: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1086: athrow
    //   1087: return
    // Exception table:
    //   from	to	target	type
    //   98	110	113	java/lang/RuntimeException
    //   105	129	129	java/lang/RuntimeException
    //   212	248	251	java/lang/RuntimeException
    //   223	256	259	java/lang/RuntimeException
    //   324	562	565	java/lang/RuntimeException
    //   736	765	768	java/lang/RuntimeException
    //   747	775	778	java/lang/RuntimeException
    //   793	809	812	java/lang/RuntimeException
    //   896	918	921	java/lang/RuntimeException
    //   967	984	987	java/lang/RuntimeException
    //   1058	1080	1083	java/lang/RuntimeException
  }
  
  public dj(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/dj.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: sipush #31528
    //   10: ldc2_w 3311411554522655156
    //   13: lload_1
    //   14: lxor
    //   15: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   20: sipush #6066
    //   23: ldc2_w 1976165011569149220
    //   26: lload_1
    //   27: lxor
    //   28: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   33: sipush #9621
    //   36: ldc2_w 1921660159446923015
    //   39: lload_1
    //   40: lxor
    //   41: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   46: sipush #20729
    //   49: ldc2_w 212260568219468410
    //   52: lload_1
    //   53: lxor
    //   54: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   59: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   62: return
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x10A;
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
        throw new RuntimeException("me/rerere/matrix/internal/dj", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/dj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\dj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */