package me.rerere.matrix.thirdparty.com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import me.rerere.matrix.internal.o3;

public class ISO8601Utils {
  private static final String UTC_ID = "UTC";
  
  private static final TimeZone TIMEZONE_UTC;
  
  private static final long a = o3.a(-3628660213530881665L, -2734330272984733429L, null).a(180459389804495L);
  
  public static Date parse(String paramString, ParsePosition paramParsePosition) throws ParseException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/com/google/gson/internal/bind/util/ISO8601Utils.a : J
    //   3: ldc2_w 79700392621531
    //   6: lxor
    //   7: lstore_2
    //   8: aconst_null
    //   9: astore #4
    //   11: aload_1
    //   12: invokevirtual getIndex : ()I
    //   15: istore #5
    //   17: aload_0
    //   18: iload #5
    //   20: iinc #5, 4
    //   23: iload #5
    //   25: invokestatic parseInt : (Ljava/lang/String;II)I
    //   28: istore #6
    //   30: aload_0
    //   31: iload #5
    //   33: bipush #45
    //   35: invokestatic checkOffset : (Ljava/lang/String;IC)Z
    //   38: ifeq -> 51
    //   41: iinc #5, 1
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: aload_0
    //   52: iload #5
    //   54: iinc #5, 2
    //   57: iload #5
    //   59: invokestatic parseInt : (Ljava/lang/String;II)I
    //   62: istore #7
    //   64: aload_0
    //   65: iload #5
    //   67: bipush #45
    //   69: invokestatic checkOffset : (Ljava/lang/String;IC)Z
    //   72: ifeq -> 85
    //   75: iinc #5, 1
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: aload_0
    //   86: iload #5
    //   88: iinc #5, 2
    //   91: iload #5
    //   93: invokestatic parseInt : (Ljava/lang/String;II)I
    //   96: istore #8
    //   98: iconst_0
    //   99: istore #9
    //   101: iconst_0
    //   102: istore #10
    //   104: iconst_0
    //   105: istore #11
    //   107: iconst_0
    //   108: istore #12
    //   110: aload_0
    //   111: iload #5
    //   113: bipush #84
    //   115: invokestatic checkOffset : (Ljava/lang/String;IC)Z
    //   118: istore #13
    //   120: iload #13
    //   122: ifne -> 170
    //   125: aload_0
    //   126: invokevirtual length : ()I
    //   129: iload #5
    //   131: if_icmpgt -> 170
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: new java/util/GregorianCalendar
    //   144: dup
    //   145: iload #6
    //   147: iload #7
    //   149: iconst_1
    //   150: isub
    //   151: iload #8
    //   153: invokespecial <init> : (III)V
    //   156: astore #14
    //   158: aload_1
    //   159: iload #5
    //   161: invokevirtual setIndex : (I)V
    //   164: aload #14
    //   166: invokevirtual getTime : ()Ljava/util/Date;
    //   169: areturn
    //   170: iload #13
    //   172: ifeq -> 440
    //   175: aload_0
    //   176: iinc #5, 1
    //   179: iload #5
    //   181: iinc #5, 2
    //   184: iload #5
    //   186: invokestatic parseInt : (Ljava/lang/String;II)I
    //   189: istore #9
    //   191: aload_0
    //   192: iload #5
    //   194: bipush #58
    //   196: invokestatic checkOffset : (Ljava/lang/String;IC)Z
    //   199: ifeq -> 212
    //   202: iinc #5, 1
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload_0
    //   213: iload #5
    //   215: iinc #5, 2
    //   218: iload #5
    //   220: invokestatic parseInt : (Ljava/lang/String;II)I
    //   223: istore #10
    //   225: aload_0
    //   226: iload #5
    //   228: bipush #58
    //   230: invokestatic checkOffset : (Ljava/lang/String;IC)Z
    //   233: ifeq -> 246
    //   236: iinc #5, 1
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: aload_0
    //   247: invokevirtual length : ()I
    //   250: iload #5
    //   252: if_icmple -> 440
    //   255: aload_0
    //   256: iload #5
    //   258: invokevirtual charAt : (I)C
    //   261: istore #14
    //   263: iload #14
    //   265: bipush #90
    //   267: if_icmpeq -> 440
    //   270: iload #14
    //   272: bipush #43
    //   274: if_icmpeq -> 440
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   283: athrow
    //   284: iload #14
    //   286: bipush #45
    //   288: if_icmpeq -> 440
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   297: athrow
    //   298: aload_0
    //   299: iload #5
    //   301: iinc #5, 2
    //   304: iload #5
    //   306: invokestatic parseInt : (Ljava/lang/String;II)I
    //   309: istore #11
    //   311: iload #11
    //   313: bipush #59
    //   315: if_icmple -> 336
    //   318: iload #11
    //   320: bipush #63
    //   322: if_icmpge -> 336
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   331: athrow
    //   332: bipush #59
    //   334: istore #11
    //   336: aload_0
    //   337: iload #5
    //   339: bipush #46
    //   341: invokestatic checkOffset : (Ljava/lang/String;IC)Z
    //   344: ifeq -> 440
    //   347: iinc #5, 1
    //   350: aload_0
    //   351: iload #5
    //   353: iconst_1
    //   354: iadd
    //   355: invokestatic indexOfNonDigit : (Ljava/lang/String;I)I
    //   358: istore #15
    //   360: iload #15
    //   362: iload #5
    //   364: iconst_3
    //   365: iadd
    //   366: invokestatic min : (II)I
    //   369: istore #16
    //   371: aload_0
    //   372: iload #5
    //   374: iload #16
    //   376: invokestatic parseInt : (Ljava/lang/String;II)I
    //   379: istore #17
    //   381: iload #16
    //   383: iload #5
    //   385: isub
    //   386: lookupswitch default -> 432, 1 -> 422, 2 -> 412
    //   412: iload #17
    //   414: bipush #10
    //   416: imul
    //   417: istore #12
    //   419: goto -> 436
    //   422: iload #17
    //   424: bipush #100
    //   426: imul
    //   427: istore #12
    //   429: goto -> 436
    //   432: iload #17
    //   434: istore #12
    //   436: iload #15
    //   438: istore #5
    //   440: aload_0
    //   441: invokevirtual length : ()I
    //   444: iload #5
    //   446: if_icmpgt -> 463
    //   449: new java/lang/IllegalArgumentException
    //   452: dup
    //   453: ldc 'No time zone indicator'
    //   455: invokespecial <init> : (Ljava/lang/String;)V
    //   458: athrow
    //   459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   462: athrow
    //   463: aconst_null
    //   464: astore #14
    //   466: aload_0
    //   467: iload #5
    //   469: invokevirtual charAt : (I)C
    //   472: istore #15
    //   474: iload #15
    //   476: bipush #90
    //   478: if_icmpne -> 492
    //   481: getstatic me/rerere/matrix/thirdparty/com/google/gson/internal/bind/util/ISO8601Utils.TIMEZONE_UTC : Ljava/util/TimeZone;
    //   484: astore #14
    //   486: iinc #5, 1
    //   489: goto -> 754
    //   492: iload #15
    //   494: bipush #43
    //   496: if_icmpeq -> 513
    //   499: iload #15
    //   501: bipush #45
    //   503: if_icmpne -> 721
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   512: athrow
    //   513: aload_0
    //   514: iload #5
    //   516: invokevirtual substring : (I)Ljava/lang/String;
    //   519: astore #16
    //   521: aload #16
    //   523: invokevirtual length : ()I
    //   526: iconst_5
    //   527: if_icmplt -> 539
    //   530: aload #16
    //   532: goto -> 559
    //   535: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   538: athrow
    //   539: new java/lang/StringBuilder
    //   542: dup
    //   543: invokespecial <init> : ()V
    //   546: aload #16
    //   548: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   551: ldc '00'
    //   553: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: invokevirtual toString : ()Ljava/lang/String;
    //   559: astore #16
    //   561: iload #5
    //   563: aload #16
    //   565: invokevirtual length : ()I
    //   568: iadd
    //   569: istore #5
    //   571: ldc '+0000'
    //   573: aload #16
    //   575: invokevirtual equals : (Ljava/lang/Object;)Z
    //   578: ifne -> 598
    //   581: ldc '+00:00'
    //   583: aload #16
    //   585: invokevirtual equals : (Ljava/lang/Object;)Z
    //   588: ifeq -> 606
    //   591: goto -> 598
    //   594: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   597: athrow
    //   598: getstatic me/rerere/matrix/thirdparty/com/google/gson/internal/bind/util/ISO8601Utils.TIMEZONE_UTC : Ljava/util/TimeZone;
    //   601: astore #14
    //   603: goto -> 718
    //   606: new java/lang/StringBuilder
    //   609: dup
    //   610: invokespecial <init> : ()V
    //   613: ldc 'GMT'
    //   615: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: aload #16
    //   620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: invokevirtual toString : ()Ljava/lang/String;
    //   626: astore #17
    //   628: aload #17
    //   630: invokestatic getTimeZone : (Ljava/lang/String;)Ljava/util/TimeZone;
    //   633: astore #14
    //   635: aload #14
    //   637: invokevirtual getID : ()Ljava/lang/String;
    //   640: astore #18
    //   642: aload #18
    //   644: aload #17
    //   646: invokevirtual equals : (Ljava/lang/Object;)Z
    //   649: ifne -> 718
    //   652: aload #18
    //   654: ldc ':'
    //   656: ldc ''
    //   658: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   661: astore #19
    //   663: aload #19
    //   665: aload #17
    //   667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   670: ifne -> 718
    //   673: new java/lang/IndexOutOfBoundsException
    //   676: dup
    //   677: new java/lang/StringBuilder
    //   680: dup
    //   681: invokespecial <init> : ()V
    //   684: ldc 'Mismatching time zone indicator: '
    //   686: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: aload #17
    //   691: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   694: ldc ' given, resolves to '
    //   696: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: aload #14
    //   701: invokevirtual getID : ()Ljava/lang/String;
    //   704: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: invokevirtual toString : ()Ljava/lang/String;
    //   710: invokespecial <init> : (Ljava/lang/String;)V
    //   713: athrow
    //   714: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   717: athrow
    //   718: goto -> 754
    //   721: new java/lang/IndexOutOfBoundsException
    //   724: dup
    //   725: new java/lang/StringBuilder
    //   728: dup
    //   729: invokespecial <init> : ()V
    //   732: ldc 'Invalid time zone indicator ''
    //   734: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   737: iload #15
    //   739: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   742: ldc '''
    //   744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: invokevirtual toString : ()Ljava/lang/String;
    //   750: invokespecial <init> : (Ljava/lang/String;)V
    //   753: athrow
    //   754: new java/util/GregorianCalendar
    //   757: dup
    //   758: aload #14
    //   760: invokespecial <init> : (Ljava/util/TimeZone;)V
    //   763: astore #16
    //   765: aload #16
    //   767: iconst_0
    //   768: invokevirtual setLenient : (Z)V
    //   771: aload #16
    //   773: iconst_1
    //   774: iload #6
    //   776: invokevirtual set : (II)V
    //   779: aload #16
    //   781: iconst_2
    //   782: iload #7
    //   784: iconst_1
    //   785: isub
    //   786: invokevirtual set : (II)V
    //   789: aload #16
    //   791: iconst_5
    //   792: iload #8
    //   794: invokevirtual set : (II)V
    //   797: aload #16
    //   799: bipush #11
    //   801: iload #9
    //   803: invokevirtual set : (II)V
    //   806: aload #16
    //   808: bipush #12
    //   810: iload #10
    //   812: invokevirtual set : (II)V
    //   815: aload #16
    //   817: bipush #13
    //   819: iload #11
    //   821: invokevirtual set : (II)V
    //   824: aload #16
    //   826: bipush #14
    //   828: iload #12
    //   830: invokevirtual set : (II)V
    //   833: aload_1
    //   834: iload #5
    //   836: invokevirtual setIndex : (I)V
    //   839: aload #16
    //   841: invokevirtual getTime : ()Ljava/util/Date;
    //   844: areturn
    //   845: astore #5
    //   847: aload #5
    //   849: astore #4
    //   851: goto -> 869
    //   854: astore #5
    //   856: aload #5
    //   858: astore #4
    //   860: goto -> 869
    //   863: astore #5
    //   865: aload #5
    //   867: astore #4
    //   869: aload_0
    //   870: ifnonnull -> 881
    //   873: aconst_null
    //   874: goto -> 905
    //   877: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   880: athrow
    //   881: new java/lang/StringBuilder
    //   884: dup
    //   885: invokespecial <init> : ()V
    //   888: bipush #34
    //   890: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   893: aload_0
    //   894: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   897: bipush #34
    //   899: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   902: invokevirtual toString : ()Ljava/lang/String;
    //   905: astore #5
    //   907: aload #4
    //   909: invokevirtual getMessage : ()Ljava/lang/String;
    //   912: astore #6
    //   914: aload #6
    //   916: ifnull -> 934
    //   919: aload #6
    //   921: invokevirtual isEmpty : ()Z
    //   924: ifeq -> 967
    //   927: goto -> 934
    //   930: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   933: athrow
    //   934: new java/lang/StringBuilder
    //   937: dup
    //   938: invokespecial <init> : ()V
    //   941: ldc '('
    //   943: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   946: aload #4
    //   948: invokevirtual getClass : ()Ljava/lang/Class;
    //   951: invokevirtual getName : ()Ljava/lang/String;
    //   954: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   957: ldc ')'
    //   959: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   962: invokevirtual toString : ()Ljava/lang/String;
    //   965: astore #6
    //   967: new java/text/ParseException
    //   970: dup
    //   971: new java/lang/StringBuilder
    //   974: dup
    //   975: invokespecial <init> : ()V
    //   978: ldc 'Failed to parse date ['
    //   980: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   983: aload #5
    //   985: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   988: ldc ']: '
    //   990: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   993: aload #6
    //   995: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   998: invokevirtual toString : ()Ljava/lang/String;
    //   1001: aload_1
    //   1002: invokevirtual getIndex : ()I
    //   1005: invokespecial <init> : (Ljava/lang/String;I)V
    //   1008: astore #7
    //   1010: aload #7
    //   1012: aload #4
    //   1014: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: pop
    //   1018: aload #7
    //   1020: athrow
    // Exception table:
    //   from	to	target	type
    //   11	169	845	java/lang/IndexOutOfBoundsException
    //   11	169	854	java/lang/NumberFormatException
    //   11	169	863	java/lang/IllegalArgumentException
    //   30	44	47	java/lang/IndexOutOfBoundsException
    //   64	78	81	java/lang/IndexOutOfBoundsException
    //   120	134	137	java/lang/IndexOutOfBoundsException
    //   170	844	845	java/lang/IndexOutOfBoundsException
    //   170	844	854	java/lang/NumberFormatException
    //   170	844	863	java/lang/IllegalArgumentException
    //   191	205	208	java/lang/IndexOutOfBoundsException
    //   225	239	242	java/lang/IndexOutOfBoundsException
    //   263	277	280	java/lang/IndexOutOfBoundsException
    //   270	291	294	java/lang/IndexOutOfBoundsException
    //   311	325	328	java/lang/IndexOutOfBoundsException
    //   440	459	459	java/lang/IndexOutOfBoundsException
    //   492	506	509	java/lang/IndexOutOfBoundsException
    //   521	535	535	java/lang/IndexOutOfBoundsException
    //   571	591	594	java/lang/IndexOutOfBoundsException
    //   663	714	714	java/lang/IndexOutOfBoundsException
    //   869	877	877	java/lang/IndexOutOfBoundsException
    //   914	927	930	java/lang/IndexOutOfBoundsException
  }
  
  public static String format(Date paramDate, boolean paramBoolean) {
    return format(paramDate, paramBoolean, TIMEZONE_UTC);
  }
  
  public static String format(Date paramDate, boolean paramBoolean, TimeZone paramTimeZone) {
    long l = a ^ 0x6075D4941B1FL;
    GregorianCalendar gregorianCalendar = new GregorianCalendar(paramTimeZone, Locale.US);
    gregorianCalendar.setTime(paramDate);
    int i = "yyyy-MM-ddThh:mm:ss".length();
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    i += paramBoolean ? ".sss".length() : 0;
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    i += (paramTimeZone.getRawOffset() == 0) ? "Z".length() : "+hh:mm".length();
    StringBuilder stringBuilder = new StringBuilder(i);
    try {
      padInt(stringBuilder, gregorianCalendar.get(1), "yyyy".length());
      stringBuilder.append('-');
      padInt(stringBuilder, gregorianCalendar.get(2) + 1, "MM".length());
      stringBuilder.append('-');
      padInt(stringBuilder, gregorianCalendar.get(5), "dd".length());
      stringBuilder.append('T');
      padInt(stringBuilder, gregorianCalendar.get(11), "hh".length());
      stringBuilder.append(':');
      padInt(stringBuilder, gregorianCalendar.get(12), "mm".length());
      stringBuilder.append(':');
      padInt(stringBuilder, gregorianCalendar.get(13), "ss".length());
      if (paramBoolean) {
        stringBuilder.append('.');
        padInt(stringBuilder, gregorianCalendar.get(14), "sss".length());
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    int j = paramTimeZone.getOffset(gregorianCalendar.getTimeInMillis());
    if (j != 0) {
      int k = Math.abs(j / 60000 / 60);
      int m = Math.abs(j / 60000 % 60);
      try {
      
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      stringBuilder.append((j < 0) ? 45 : 43);
      padInt(stringBuilder, k, "hh".length());
      stringBuilder.append(':');
      padInt(stringBuilder, m, "mm".length());
    } else {
      stringBuilder.append('Z');
    } 
    return stringBuilder.toString();
  }
  
  public static String format(Date paramDate) {
    return format(paramDate, false, TIMEZONE_UTC);
  }
  
  static {
    long l = a ^ 0x18D2A81C236L;
    TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bin\\util\ISO8601Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */