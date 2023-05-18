package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.api.HackType;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.World;

public enum yk {
  c, j, h, e, n, y, m, o, u, f, l, r, x, z, k;
  
  @NotNull
  private String wa;
  
  private int ya;
  
  @Nullable
  private Set p;
  
  private int d;
  
  private int q;
  
  private int t;
  
  @NotNull
  public static final md g;
  
  @NotNull
  private static final List a;
  
  @NotNull
  private Map s;
  
  @Nullable
  private ci w;
  
  private boolean v;
  
  @NotNull
  private final String b;
  
  private static String A;
  
  private static final long B = o3.a(-681512621001680434L, 6308882284762809574L, MethodHandles.lookup().lookupClass()).a(184817370912221L);
  
  private static final String[] C;
  
  private static final String[] D;
  
  private static final Map E = new HashMap<>(13);
  
  public final int m() {
    return this.ya;
  }
  
  public final void b(@Nullable ci paramci) {
    this.w = paramci;
  }
  
  @NotNull
  public final String j() {
    return this.wa;
  }
  
  @Nullable
  public static final yk b(char paramChar1, @Nullable String paramString, int paramInt, char paramChar2) {
    long l1 = (paramChar1 << 48L | paramInt << 32L >>> 16L | paramChar2 << 48L >>> 48L) ^ B;
    long l2 = l1 ^ 0x63C87B5FE99AL;
    return g.b(paramString, l2);
  }
  
  public final void m(int paramInt) {
    this.d = paramInt;
  }
  
  @NotNull
  public final String b() {
    return this.b;
  }
  
  public final void b(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public final void p(int paramInt) {
    this.q = paramInt;
  }
  
  @Nullable
  public final Set b() {
    return this.p;
  }
  
  public final void j(int paramInt) {
    this.ya = paramInt;
  }
  
  @Nullable
  public final ci b() {
    return this.w;
  }
  
  @NotNull
  public final Map b() {
    return this.s;
  }
  
  public final boolean b(long paramLong, @NotNull World paramWorld) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yk.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic a : ()I
    //   9: istore #4
    //   11: aload_0
    //   12: getfield p : Ljava/util/Set;
    //   15: iload #4
    //   17: ifne -> 40
    //   20: ifnonnull -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   35: athrow
    //   36: aload_0
    //   37: getfield p : Ljava/util/Set;
    //   40: dup
    //   41: ifnull -> 117
    //   44: astore #5
    //   46: iconst_0
    //   47: istore #6
    //   49: aload #5
    //   51: aload_3
    //   52: invokeinterface getName : ()Ljava/lang/String;
    //   57: invokeinterface contains : (Ljava/lang/Object;)Z
    //   62: iload #4
    //   64: ifne -> 78
    //   67: ifne -> 81
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   76: athrow
    //   77: iconst_1
    //   78: goto -> 82
    //   81: iconst_0
    //   82: nop
    //   83: iload #4
    //   85: lload_1
    //   86: lconst_0
    //   87: lcmp
    //   88: iflt -> 95
    //   91: ifne -> 114
    //   94: iconst_1
    //   95: if_icmpne -> 113
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   104: athrow
    //   105: iconst_1
    //   106: goto -> 119
    //   109: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   112: athrow
    //   113: iconst_0
    //   114: goto -> 119
    //   117: pop
    //   118: iconst_0
    //   119: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	23	26	java/lang/IllegalStateException
    //   20	32	32	java/lang/IllegalStateException
    //   49	70	73	java/lang/IllegalStateException
    //   82	98	101	java/lang/IllegalStateException
    //   94	109	109	java/lang/IllegalStateException
  }
  
  @NotNull
  public final HackType b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/yk.B : J
    //   17: lxor
    //   18: lstore_3
    //   19: invokestatic values : ()[Lme/rerere/matrix/api/HackType;
    //   22: astore #6
    //   24: nop
    //   25: iconst_0
    //   26: istore #7
    //   28: invokestatic r : ()I
    //   31: iconst_0
    //   32: istore #8
    //   34: istore #5
    //   36: aload #6
    //   38: arraylength
    //   39: istore #9
    //   41: iload #8
    //   43: iload #9
    //   45: if_icmpge -> 127
    //   48: aload #6
    //   50: iload #8
    //   52: aaload
    //   53: astore #10
    //   55: aload #10
    //   57: astore #11
    //   59: iconst_0
    //   60: istore #12
    //   62: iload #5
    //   64: iload_1
    //   65: iflt -> 124
    //   68: ifeq -> 122
    //   71: aload #11
    //   73: iload_2
    //   74: ifgt -> 132
    //   77: iload #5
    //   79: ifeq -> 132
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   88: athrow
    //   89: invokevirtual name : ()Ljava/lang/String;
    //   92: aload_0
    //   93: getfield wa : Ljava/lang/String;
    //   96: iconst_1
    //   97: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   100: ifeq -> 119
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   109: athrow
    //   110: aload #10
    //   112: goto -> 132
    //   115: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   118: athrow
    //   119: iinc #8, 1
    //   122: iload #5
    //   124: ifne -> 41
    //   127: iload_1
    //   128: ifle -> 137
    //   131: aconst_null
    //   132: dup
    //   133: ifnonnull -> 165
    //   136: pop
    //   137: new java/lang/IllegalStateException
    //   140: dup
    //   141: sipush #25920
    //   144: ldc2_w 5547992720090262885
    //   147: lload_3
    //   148: lxor
    //   149: <illegal opcode> d : (IJ)Ljava/lang/String;
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   164: athrow
    //   165: areturn
    // Exception table:
    //   from	to	target	type
    //   62	82	85	java/lang/IllegalStateException
    //   71	103	106	java/lang/IllegalStateException
    //   89	115	115	java/lang/IllegalStateException
    //   132	161	161	java/lang/IllegalStateException
  }
  
  public final int p() {
    return this.q;
  }
  
  yk(String paramString1, int paramInt1, String paramString2) {
    this.wa = paramString1;
    this.ya = paramInt1;
    this.b = paramString2;
    this.v = true;
    this.s = new LinkedHashMap<>();
  }
  
  static {
    p((String)null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[46];
    boolean bool = false;
    String str;
    int i = (str = "ÜÖm`IÑ¿§ì6¡ß\005¹ùèh}ÎÇ#êÖ¨8V\026Mè$btµæ\n¶\b³\020lsHl<Vd¥tz©¡vF\021\020Ê\025!Ê[ÈÎØ\fÀºÝc\030¥\001X KÜ\017M_q!ÒVûNëb\030·5XÛ|°:\022¾õìÍ_×pttø\r¡M«ë¨Û\034ªÚ,$'úæÈ]¯\b[ë¥.åá1«iòÁbi¿h\013pRë.ëNsVÁm6!×A\032\037.\\ñ\020£X+\031¯éqB\036¥\bJ wÀ\001Kh\026\\â¿&x×CÂú\\9«`ã6ðð\034ÝñY\npý¨X|\n±ØJØùxí:\034Ïg­D{¢\"TæËÒÍ\017X\0037K\nãÙ»LËÙ\031ó0F@Y&12\ttO\013\002¥£÷\bWdù?Tm#bÇÎgô>u´©éÁnrî!bÎ\013\020 7¹?O&5\007Ýµ´^ðþ°/^¼Ë\020Bm!ÿ¸\003ÉÄëncÌýX¿ûíå\\½EÏ/Í}\000¦Í¯CÉêDð×ÁyÂ\031l#=\025Ý»þ¾)\032LÓ<Ð<¹È¸Iù¨çT I\022½bS\001Zu¨1Pz\036µÓCØÎ±{e1ÅZ\033yß0 \030NûÚ£¶&ù^À\003K-ÿ\020ñ3ÊoH\017¤aoÛû)jW\020Q¡³î\025}øFa\tSÝ$NY\016\020'á\017\027¥¢XDÕt5!8m\020+©`åJô(õ+|q(Ìx\020µÈ\013+by¬Áu_V\033YÈ,\020êäCñ\027%CR\rët@´?ðp\032Í­çY²¤±^öS<×\034Uê:/?ª3ËE\037$cæµ×9î\024X¢NÜÊ%Z øË;\006NT3&[ ßÊï%üä.\005]êuÇo£¥Ò¹\006ó¿:tê¡Ý{j%õN®Lµ\t\030\000µ\027Q\020Ø³¼ÀB¢{*î[/,q.\027à\030QNrk[æ=@heZÙÝ4¿}Pq\030@4oÁÕèç\030Û\"\rñ$Þú{ùÌ)I¼$\020Â;Ä{»³\017þ^h£ª\000Èp\017æç¡m  Ôé|$þJÇ\027åvÓ@\020nTÖãÀ,\006VâËxêð~q·JpÒRóTCÆv5RÛ:~Ã$\002¼BQ½\001g33Úç\"Î¹È¢\013·«DñîØÔíØæ+âOBîïÂ'WvOïíká&\026síßhßURáºz\tG\005õýu$üÚÂ·Õ\0323û<SK\0163Ò3$ÆááÜU\037 iP'àc\005v\016e\020×xZ ]þQâ\026ðð½¶¼Àã\022\026êëwÙ4\026ÜuÜ\032a,×\nÜ\"Má\tÏxhtÄ`!\025 \034\"hZ%Nó\034½Ú¹KÇ*búY\027 eW#¿·tË£\027Y\036\016»Å0\030·b\002þ!ë~\006ÑNÀ¦ÁÌ*\024  [¡ãØÍDÎ¦&ÏË¤<\025Aàûc}j8]Ï\037=ßMÄ\020ptL\033µÃ%¿\021Þø`áMpc\bËsCý³\013c4\013(ä`Ä@¢)__¸U\0338%än8@~e¤\022·ù\032Eú\026 '±\032X¿\006vSÌÈ\017\"Võ,°B'¹BUAí÷!jÍ=»\"\b¦$Ú\030FÐýüw7ÓHr\"\033\004«:\b}aô)Ã\020Tø²\020í%ÿÀGã±NÞdþ²à&Ù\020\02308²\003f\004k¸p\035)\bÞ\020)\005x%JQ)\036¯àt,Ò`\024\007%õEPÝN\013eY\023Å{\004*ßxðUøâ`.YXc\030Î;\026¶=3W\034©øªÅ©\036\020\031ráK9ÃN¦tå\\ýÝÝÿ\026$Ê1ÒNTueñ\\.=»WÓ÷fä¹ó\035\013®Û¶{\020Z¨\035¥\016Nµ\nâs\030¶ê< 5WÍûqûÓI'cÏ\023?\002Ûe¨SPDq%\030¢Á\032úÖGÛ\022xXª¡i\024¥â|^\"Äe\003êêOÀWj7­×ç\017Ìú#ôþ¬9¢ý`íh-eªþ4Ôëê<v2öÉa`|ÚK\r\006\022ì}ív Å%s{s¹ïdAÚ\036×\rT\013°Æ¤â8¾ú¯äc^vñ1@¦\006¬ûk\020|£uJ cGÎo7Ï¾Î4\nÊæøêßéíýQ«\017FÂøã\020Óþ+äòbwWÜè/Eè\020\016²1çêÒr]ÖQ1C2apß²1\031¯qõ\002+\"QÚ1es0p:Á\022\032R(ýË²\024_è\nÂ%ú¿$·ýó÷\013*¡ànÃÑjpÐ»UN\030h;5¢ñ&¥ªïòMH%\rYÖh_ÇXV\020ÕGMÐÑÑóÍ\b§\004¥û}çýZ M\032Y9\021(\0018\016ª\000as0ß\013­\000÷ÚwE,Åá#\004*ã\020Î\000/I½C¯;n\013\007\006.\013µhß·îbÓ3G\037zmë\nôÛ\037 ö`Ä¸\027æ\035O\031¶\034H<e°T\006ëe1fvù0ád,> ÀtIL¢@ò\005\003GFdBð\\@û/üçvÄ\013@Á?S²R\005J¢Àòy¸æ§\0241»wIN|ª÷C]ÀDÌÛÍ¹Ð\026@{Ä|C\000¿$gt5 ~°\n\rôÿÌÞu\020J\021\fÂo¸Î`0lÛ{ôþ\033\027\036z\020\023ÛTý²DÅj\"\t+öÅ\022\024úgtnÐ6­fÊöÊ!±zi7\b'Õ\007ÿ\013Y\002²H\025\024èH´Mrb`\fMÐ\022­\027jö.å¦om¦p Élß\0261NÍ)ÿq\005ïT>¶­ãhpm¹û #3}×n«F\020Úß®@ýïÝ((¿Q(n _ø\032PÌ²µØ°\035\036Æ#\0133\006¢oVÞÆ¬ø¯Ëýw¤").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  public final void b(@NotNull String paramString) {
    this.wa = paramString;
  }
  
  public final void b(@Nullable Set paramSet) {
    this.p = paramSet;
  }
  
  public final int j() {
    return this.d;
  }
  
  public final void b(int paramInt) {
    this.t = paramInt;
  }
  
  public final boolean b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yk.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic r : ()I
    //   9: istore_3
    //   10: getstatic me/rerere/matrix/internal/ge.y : Z
    //   13: iload_3
    //   14: ifeq -> 101
    //   17: ifeq -> 97
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   26: athrow
    //   27: invokestatic j : ()D
    //   30: getstatic me/rerere/matrix/internal/ge.l : D
    //   33: dcmpg
    //   34: iload_3
    //   35: ifeq -> 101
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   44: athrow
    //   45: ifge -> 97
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   54: athrow
    //   55: getstatic me/rerere/matrix/internal/yk.a : Ljava/util/List;
    //   58: aload_0
    //   59: invokeinterface contains : (Ljava/lang/Object;)Z
    //   64: iload_3
    //   65: lload_1
    //   66: lconst_0
    //   67: lcmp
    //   68: ifle -> 102
    //   71: ifeq -> 101
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   80: athrow
    //   81: ifeq -> 97
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   90: athrow
    //   91: iconst_0
    //   92: ireturn
    //   93: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   96: athrow
    //   97: aload_0
    //   98: getfield q : I
    //   101: iload_3
    //   102: lload_1
    //   103: lconst_0
    //   104: lcmp
    //   105: iflt -> 115
    //   108: ifeq -> 135
    //   111: aload_0
    //   112: getfield q : I
    //   115: if_icmpge -> 131
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   124: athrow
    //   125: iconst_0
    //   126: ireturn
    //   127: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   130: athrow
    //   131: aload_0
    //   132: getfield v : Z
    //   135: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	20	23	java/lang/IllegalStateException
    //   17	38	41	java/lang/IllegalStateException
    //   27	48	51	java/lang/IllegalStateException
    //   45	74	77	java/lang/IllegalStateException
    //   55	84	87	java/lang/IllegalStateException
    //   81	93	93	java/lang/IllegalStateException
    //   101	118	121	java/lang/IllegalStateException
    //   111	127	127	java/lang/IllegalStateException
  }
  
  public final int b() {
    return this.t;
  }
  
  public final void b(@NotNull Map paramMap) {
    this.s = paramMap;
  }
  
  public static void p(String paramString) {
    A = paramString;
  }
  
  public static String g() {
    return A;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7865;
    if (D[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])E.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          E.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/yk", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = C[i].getBytes("ISO-8859-1");
      D[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return D[i];
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
    //   13: ldc [Ljava/lang/Object;
    //   15: aload_2
    //   16: invokevirtual parameterCount : ()I
    //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   22: iconst_0
    //   23: iconst_3
    //   24: anewarray java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_3
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: aload_1
    //   38: aastore
    //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   42: aload_2
    //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   49: goto -> 103
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc_w 'me/rerere/matrix/internal/yk'
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc_w ' : '
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_1
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc_w ' : '
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_2
    //   88: invokevirtual toString : ()Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: aload #4
    //   99: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   102: athrow
    //   103: aload_3
    //   104: areturn
    // Exception table:
    //   from	to	target	type
    //   9	49	52	java/lang/Exception
  }
  
  static {
    long l = B ^ 0x68D2182CC75BL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */