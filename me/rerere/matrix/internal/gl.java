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
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class gl extends uj {
  private static final Map f;
  
  private static final Map l;
  
  public static String r;
  
  public static String x;
  
  public static boolean z;
  
  @NotNull
  public static final Map k;
  
  public static String v;
  
  public static String b;
  
  public static String i;
  
  private static String a;
  
  private static final long d = o3.a(-221204085625920041L, -6830563082909541795L, MethodHandles.lookup().lookupClass()).a(98334085836607L);
  
  private static final String[] e;
  
  private static final String[] g;
  
  private static final Map j = new HashMap<>(13);
  
  static {
    J("qdWLh");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[76];
    boolean bool = false;
    String str;
    int i = (str = "ÆîË»x} {ùÌM^Ê,q²Tgã<×¤\"\026]\021(ÃæVh³Pôÿ\022¹k(h<L\022£«\031õg\023so\024\rö\0320Ü(v~\n\004Nã`\024eã>¤@\t Ë\"¨Ð íã\016Ï]Iù$B©-\030\nTÅ!ýã\013çðÅÌ\nt ðVh1©0Lo;5~\0359Tãå£¶Dj$\024 ×\0239Þ(!Ê;KKK\030çÏ/È7%Ùßª¤¶ 8«CÉÛ½©¨ecCXqîeZe\022}\020V.Oåû»3,×þ$@¦[\000ºnöñ~ú:/òçª¸\004Þ Se³\027bf6hB]SöT\027ÇN\004M_\024­ÎÖ=Ò\036´_PèhòL}62ë\023xê6cf(\026ûæ\031áäpý©C\000ÒÐ©&Uu,\006s\021s\034ZÞ2ô\004Îm¶Yª8m'iëúgs{\t¹<Y\"Æu¸\nÍ¦Æ1¿;·¡\027\rÆµ)ß\021Wèüï\006\024ê¦EÛ§>V9Ì/8ëK;×àº,óÅi/È¬¤ÛXEõ¥£Ïìi'\002¢×\007\"Â¼F1-R¹%à&t®\0026¨e~D²\030·Q\036\000¦\026y×¨\rDÙ\bO\036Å\033'9¯\030CÜ·éÂ\027j\037\023ãl1´¼§WõÊºé0¶bAd~o8SªîFÙ;õÔmà\fs`oÞãw\005kdo@¯8¬'\f¿<\021EUV=\013R¸8C3Z©vçbÃFã\033©3G\\Ð¾¤B\nÐJaì ³Wü\004¯âÏg¸m\034&ß²O¨\rj\013dü³\021È\026¬hµ\016øÿg\020t\037ÂâR­­Ü{øMìÏFÞ¯òÿq>p\024`§ôù\006\000øÇ\027oþ\016\\äÊ'/cÜàÑ|è\007uºM('¼\030·Á®\002ëÀ,\023¼WußðO[(À\007\006\f7×¦\"î®Ý&ÞÛ+D84\033s\025hÃ\025âÅp0J§Ó\001þõGý¾Dejz\n?9ä,e¸o¢°¨btm¤°ç{§Ílpº\nóôÃP°÷1°QRÊ\\ÙÐöÜrJ\005\007éñ\nfùõÕÑZ\025\\\034mF¼å.á\005#×è×!j S¼øMc+ÌÖ\001&2I#×G0Xj-VY[s\";¬ÿ+ø(:rö«Êh½,V\013\032\026POO±¶\0367^u¿l÷¯\035¤{3\tò\002P(D\037³ÖærÏv|3T\020\020m­õ_c,Ý\001¶AÏgx\003T\036m[2ú­\020Ün\nVøá.ªLw0§kmÞ\022pF\024~ÐHüEPk\026\025ÙÆ¾þWîÿ\022\003àùusìú¢2Y¶Ï2;¹(ó\026ë×É¨ò¦_F¿Èó¼*#Ø1'76Ý³&B¨È\"XßË\030\\çyB\034RH\tÉãY¶²Æö©ÉÆ®­À\027B0ºö? âï\t9(·¡\036\0206ùUØ\t¦ÒËnàÖ´(åQOU\036hIvs¯Ð×ô´&(_Z÷¦\022\033\016¾\006P\024s6:z¢ìÝÈJ w8;?­öt\022¾ñ´ð\0242(w¼\fQÃÝiæ4\001ò^w{\021|éi\006Wª\003T >\000\005M¢\020l\030DK¿ÎÉ¼(×¬n%ØIµ\030b\025\fµî´ÝøC\"Ò\000öÆ ýå¥9¥ß x¥y\003P§Ûèhºx#\022R\002E\"¸ê\007lxäÇ1o8hD¬ó\020¥.øP¥-¡ê£@$ã\0266>\026·>j¥2Ì\001\022\025H¥UVbÿ\024»ýppÎ¿ôç¹dÂ(LõÊ/WÆ¾i§K/9\035-àÒ%PL¨ØóHð¥á&_\fÿPû±¢\017(QË½°\030 \r7ì .½aE\025SÔXL]>q\b[§\024¡`}´l\034÷±|0£\030ª\004QÖÔýî®ÏRÈ%×ìÍ7£L D¦+ê¹Î\003ü@0È3?¬ïä¹D\025º)ëÿ\020| -½zl!\r¬O|\025åö§¢\003\036Ì\034$1þÔe­0¤\031³÷hñð±\033#1\027>e\f­çº0\0331ÒÔ\017(cìÊîYN\003¼\bó×m\not ERIÕF\002ØÃÎ\026\020Ä{Äó¿ôxî:¯Û£ X¥~8öÎ¸i\t\021%â7Ë»Û3¶¿î\037ð\\~7Ä3®T+ÙÑ\035NÏx¸¿ÛU]\n^jhkÂñ\0218CPåYsG#rÇ§]Yà§¸\001tæ¨Á¾«k©¯\020(éó$ÐÝUhAA³0×7röÏz?¤\"Oh¿ñäÙS\fBz<hQ¢Ùm£ëÝÑvkß\rW \031»,«ÅCt}ÕëT\024N`¦w­\035\r(·ÿ\fØ\026¸8>963UF¢©µ\037\016dºM\b^ïÍµêo«)\017}í{´9xIf\016JÒ¸\r÷¸½KZß©\tþ¹\002×ò·¬ç\\aÃ\021I¸¨BÁ«]HF \013\031ç4+^»ÎÊQ¯®·ã&/Ý\000MM\0369±yÓ<8\030ñà2}\005\013¼JÁV\006·h((b¾w\"`ü±[`yÑÏU6³'EÁ©|v¦½^±ÎÖÐX5s`ËÑ0_Ç*«/ä«¯Ø1Ô¶é\034Õå@oV¼*bÒ\004ÜdÂì¯ó\0167¶&*éÞ6u¢\">D<(Ì\033÷3{ö¿H/hË-¶gÃ\034Ýô4±QKx®»xóÝ½7tÜ>øÈP(I[ º6d\026\020&dôOAÐÝÑûSÖ­#ö÷*åÑ¾bV\b<ö6X'²É\004O2Ký\027ÍòCü6Z¹ «Ò£kç±mÒHì\035Hô`É\020âQéj.>÷\002¯!Q\022&8çà{¥J¾¯yG\030À'\rJ%\tè\013ì²¯ÌáC¤QPë\023âhwñ2D0û\001Ø\035N®~ýKåØ§8¹¦M#\"b\006 Ý\036!»»r®â%\034>f\003°!\022ÌMB{1ÎÀJ÷£ÙFh!'Æ*¦¬I}ù\000Ë(GÅÂPÉ}Ç\004è5ÓÖ,ùè\022¬¼I8d,ùÐ(ÿØû¡Òl§¶û:| Õp¶oÒB\\M¿}GY¿gï÷cF3^C02±¢ã@ð `tôê\036ò²¤ä)#iB×8²¤\020M\003©ae¶6v\013\033Ð\022¼o,àì\016Ð¤ôfîW\"¿ÊQt\037\013W\023D'(¡k0oÎ$\017\027±Ã·=-æ¯Á¶æ¥¡9ÍgÊ@\031þ)Q}ák\037ÄÎ0ñ»h\016\031¨äë\017%éâ¸°P^|Ça\002j­\n³\034( \035¶yÍ4µ\nÌBk\027³wÏ*¶±1\0320\026r_ö{9o±#¾q!WÆ.ãÎzG\036È&×Êj°®sx®@\026\023YÜ²\022ÜwÍ$q(¥ÚÁ7Fo\003´\036\002\020W¥\n¶&º\f¿Y>Ax»!ÿª|Rz\\sý¯\026%;(\036°ÙoÀ»cìÚì÷Ø ­·9fäôfpÌ·\017\017\000(·$\020HÝp ë9Ýªöÿ§D¡Gæ L Ür\003_½?Ü£ë¦\\1þ@0-\023\035Wãc\021\023öÈÙ¶»\fkÕ<ÅC]k\020òìÙmV\002?\\Ú,¢avÐ «.7ÖÙ(H\004ê[Í/Lî@í=)\033\b á»ÓpõÒ;°\006³Zþ¼EÕe\016ÛÿZÍÍÖ@F3öù¡®\025\007«°+>\035h+c½çÕóÊ¨ÍÍSF+y+=Sñ\021CF\nxÀX5£_}vp$½a\017½A\006\036o\027\034ó\t\b ãÖh¨WÔO¤{Hz¨5Fb!©ÊÑ}Ö£%\b8v¦_â t^b\025¸º#¸óê½+à\017Øi]$<Z\t>/5N°+\0068tÄ!¤\037ª¶±¾z\"æ\034¨ü\021\003i°Rp\r÷å+M> \000Ì\035E\001½Í_åC\004µ\037+i$ówD»ÁX¼ñ£ Î ×`AKj!R¶oÈTÌ;¢zp9@ÊÔN\b$\001@\b\030å\007È¢\\\023}z5j\034\b¥éçÆ8\016øÌ\030C\003\020Øh°Fh|#ÚÅ\rÈgBGîòql ÝÑ<è\037{7|Ý\013Ø×\002W?ppÅJ{Y\035½ýiçË5\030ÚZ\030\023:J^\034[¾«ìO¢Fõ@AX(èeÛg¦ÀÂ\005ûÛQJ:ån\000\007 Æ´2ò9BÉú|P-tSµ*é\016è\035\006 i;\b\025]\002\005ª»Z²â\025Þ×\"æ¼RBÖÛhåuÈ#®\020ð$ÉÉÛ\037\022ü\004AçZ½¦\rë@À6ÅqY\037Ü[&ÜÕ%\004kÕ\f¦\023JÊåáS\035B\035C½b·£PJôæSÓÎ@aèÕn=hõ^Ú)^\t+8\002¿ìè|^@¯Á\"ÄYG¼ÿN$\0051\"ßKçú\\¤£!\013\0177%áÙË¢¯Qø\026´;ñ«\t0O² »(¦r´°¦ÅÎË\036«ÐXó5º×;møw\023ðñ÷âñÂ°¹)Ïh\f\013÷ULA¼ù°äÓ5Ou\031¬ÿ&9\tJ(|ãü];\007;=»\trrXî¢#\023\016GtM\006Ú^´4ª·\031üØþ±9ù'}\005T~2ÏùW\037¡Z\032¨'6ëÐØ¢²ûô1ÑérÒÓ\nI¥}.@¼?ÛÓíð&ó7«8u¯«P\bZt#C§ð5/\032þÞ£û;%f½åÁjnÏ\022brz\027±+9¥ñKó­&¨ý\035&] zÝ¦¿HË\017®°7\032rå\b÷g5PK¹ý]Vê©¦Êí").length();
    byte b2 = 64;
    byte b = -1;
    while (true);
  }
  
  public gl(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/gl.d : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 123173262473327
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: lload_3
    //   16: sipush #24066
    //   19: ldc2_w 3378236723084731959
    //   22: lload_1
    //   23: lxor
    //   24: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   29: invokespecial <init> : (JLjava/lang/String;)V
    //   32: return
  }
  
  public static String b(@NotNull String paramString, long paramLong) {
    paramLong = d ^ paramLong;
    long l = paramLong ^ 0x7BB5FC812F7DL;
    int i = yl.r();
    try {
      if (i != 0) {
        try {
          if (f.containsKey(paramString));
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } else {
        return (String)f.get(paramString);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    gl gl1 = Matrix.b().b().b();
    String str = gl1.b().getString(paramString);
    try {
      if (i != 0) {
        try {
          if (str == null)
            return (String)l.get(paramString); 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
        str = j(str, l);
        f.put(paramString, str);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return str;
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
    //   18: ldc2_w 74377219455706
    //   21: lxor
    //   22: lstore #6
    //   24: dup2
    //   25: ldc2_w 139143257404556
    //   28: lxor
    //   29: lstore #8
    //   31: dup2
    //   32: ldc2_w 0
    //   35: lxor
    //   36: dup2
    //   37: bipush #56
    //   39: lushr
    //   40: l2i
    //   41: istore #10
    //   43: dup2
    //   44: bipush #8
    //   46: lshl
    //   47: bipush #8
    //   49: lushr
    //   50: lstore #11
    //   52: pop2
    //   53: pop2
    //   54: aload_0
    //   55: iload #10
    //   57: i2b
    //   58: lload #11
    //   60: invokespecial b : (BJ)V
    //   63: invokestatic a : ()I
    //   66: getstatic me/rerere/matrix/internal/gl.f : Ljava/util/Map;
    //   69: invokeinterface clear : ()V
    //   74: aload_0
    //   75: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   78: astore #14
    //   80: istore #13
    //   82: aload #14
    //   84: sipush #14601
    //   87: ldc2_w 2092859048792376756
    //   90: lload #4
    //   92: lxor
    //   93: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   98: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   101: astore #15
    //   103: iload #13
    //   105: ifne -> 507
    //   108: aload #15
    //   110: ifnull -> 335
    //   113: goto -> 120
    //   116: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   119: athrow
    //   120: aload #15
    //   122: iconst_0
    //   123: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   128: invokeinterface iterator : ()Ljava/util/Iterator;
    //   133: astore #16
    //   135: aload #16
    //   137: invokeinterface hasNext : ()Z
    //   142: ifeq -> 273
    //   145: aload #16
    //   147: invokeinterface next : ()Ljava/lang/Object;
    //   152: checkcast java/lang/String
    //   155: astore #17
    //   157: new java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial <init> : ()V
    //   164: sipush #23786
    //   167: ldc2_w 4371057191635591291
    //   170: lload #4
    //   172: lxor
    //   173: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: aload #17
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: ldc_w '%'
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: astore #18
    //   197: aload #15
    //   199: aload #17
    //   201: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   206: astore #19
    //   208: aload #19
    //   210: iload #13
    //   212: lload_2
    //   213: lconst_0
    //   214: lcmp
    //   215: iflt -> 223
    //   218: ifne -> 332
    //   221: iload #13
    //   223: ifne -> 267
    //   226: goto -> 233
    //   229: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: ifnull -> 268
    //   236: goto -> 243
    //   239: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: getstatic me/rerere/matrix/internal/gl.k : Ljava/util/Map;
    //   246: aload #18
    //   248: lload #8
    //   250: aload #19
    //   252: invokestatic b : (JLjava/lang/String;)Ljava/lang/String;
    //   255: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   260: goto -> 267
    //   263: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   266: athrow
    //   267: pop
    //   268: iload #13
    //   270: ifeq -> 135
    //   273: new java/lang/StringBuilder
    //   276: dup
    //   277: invokespecial <init> : ()V
    //   280: sipush #11683
    //   283: ldc2_w 1713530084436267355
    //   286: lload #4
    //   288: lxor
    //   289: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: getstatic me/rerere/matrix/internal/gl.k : Ljava/util/Map;
    //   300: invokeinterface size : ()I
    //   305: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   308: sipush #8242
    //   311: ldc2_w 4506023083547450521
    //   314: lload #4
    //   316: lxor
    //   317: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   322: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: iload_1
    //   326: iflt -> 152
    //   329: invokevirtual toString : ()Ljava/lang/String;
    //   332: invokestatic b : (Ljava/lang/String;)V
    //   335: aload #14
    //   337: sipush #23709
    //   340: ldc2_w 6921342462029373492
    //   343: lload #4
    //   345: lxor
    //   346: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   351: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   354: lload #6
    //   356: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   359: putstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   362: aload #14
    //   364: sipush #25793
    //   367: ldc2_w 2155733046246709306
    //   370: lload #4
    //   372: lxor
    //   373: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   378: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   381: lload #6
    //   383: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   386: putstatic me/rerere/matrix/internal/gl.b : Ljava/lang/String;
    //   389: aload #14
    //   391: sipush #31731
    //   394: ldc2_w 7223622710564849494
    //   397: lload #4
    //   399: lxor
    //   400: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   405: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   408: lload #6
    //   410: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   413: putstatic me/rerere/matrix/internal/gl.v : Ljava/lang/String;
    //   416: aload #14
    //   418: sipush #11618
    //   421: ldc2_w 8690321450472198651
    //   424: lload #4
    //   426: lxor
    //   427: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   432: iconst_1
    //   433: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   436: putstatic me/rerere/matrix/internal/gl.z : Z
    //   439: aload #14
    //   441: sipush #27361
    //   444: ldc2_w 8313516556779066996
    //   447: lload #4
    //   449: lxor
    //   450: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   455: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   458: lload #6
    //   460: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   463: putstatic me/rerere/matrix/internal/gl.i : Ljava/lang/String;
    //   466: aload #14
    //   468: sipush #9548
    //   471: ldc2_w 7064193489631435208
    //   474: lload #4
    //   476: lxor
    //   477: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   482: sipush #15595
    //   485: ldc2_w 3967289910890381429
    //   488: lload #4
    //   490: lxor
    //   491: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   496: invokevirtual getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   499: lload #6
    //   501: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   504: putstatic me/rerere/matrix/internal/gl.x : Ljava/lang/String;
    //   507: return
    // Exception table:
    //   from	to	target	type
    //   103	113	116	java/lang/RuntimeException
    //   208	226	229	java/lang/RuntimeException
    //   221	236	239	java/lang/RuntimeException
    //   233	260	263	java/lang/RuntimeException
  }
  
  public static void J(String paramString) {
    a = paramString;
  }
  
  public static String z() {
    return a;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6E6;
    if (g[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])j.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          j.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/gl", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = e[i].getBytes("ISO-8859-1");
      g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return g[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/gl'
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
  
  static {
    long l = d ^ 0x7A4E9348FAF8L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\gl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */