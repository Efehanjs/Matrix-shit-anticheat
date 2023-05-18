package me.rerere.matrix.commands.condition;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.Plugin;

public class ConditionalCommands implements CommandExecutor {
  private static final Pattern SPLIT_PATTERN;
  
  private static final long a = o3.a(-3164910713173717173L, -3985248596744770940L, MethodHandles.lookup().lookupClass()).a(266853252318503L);
  
  static {
    long l = a ^ 0x4203EC1C7497L;
    SPLIT_PATTERN = Pattern.compile("/([0-9]*)/");
  }
  
  public boolean onCommand(@NotNull CommandSender paramCommandSender, @NotNull Command paramCommand, @NotNull String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/commands/condition/ConditionalCommands.a : J
    //   3: ldc2_w 126253437648181
    //   6: lxor
    //   7: lstore #5
    //   9: aload_1
    //   10: instanceof org/bukkit/entity/Player
    //   13: istore #7
    //   15: aload #4
    //   17: arraylength
    //   18: ifeq -> 49
    //   21: aload #4
    //   23: arraylength
    //   24: iconst_1
    //   25: if_icmple -> 165
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload #4
    //   37: arraylength
    //   38: iconst_5
    //   39: if_icmpge -> 165
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_1
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: iload #7
    //   59: ifeq -> 79
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   72: goto -> 81
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: ldc ''
    //   81: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: ldc '[ConditionalCommands] > Incorrect number of arguments.'
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   97: aload_1
    //   98: new java/lang/StringBuilder
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: iload #7
    //   107: ifeq -> 120
    //   110: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   113: goto -> 122
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: ldc ''
    //   122: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   125: ldc '[ConditionalCommands] >'
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: iload #7
    //   132: ifeq -> 145
    //   135: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   138: goto -> 147
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: ldc ''
    //   147: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   150: ldc '   /cc help'
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   163: iconst_0
    //   164: ireturn
    //   165: aload #4
    //   167: arraylength
    //   168: iconst_1
    //   169: if_icmpne -> 879
    //   172: aload #4
    //   174: iconst_0
    //   175: aaload
    //   176: ldc 'help'
    //   178: invokevirtual equals : (Ljava/lang/Object;)Z
    //   181: ifeq -> 770
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: aload_1
    //   192: new java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial <init> : ()V
    //   199: iload #7
    //   201: ifeq -> 221
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   214: goto -> 223
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: ldc ''
    //   223: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   226: ldc '--------=ConditionalCommands=--------'
    //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: invokevirtual toString : ()Ljava/lang/String;
    //   234: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   239: aload_1
    //   240: new java/lang/StringBuilder
    //   243: dup
    //   244: invokespecial <init> : ()V
    //   247: iload #7
    //   249: ifeq -> 262
    //   252: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   255: goto -> 264
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: ldc ''
    //   264: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   267: ldc '  /cc help'
    //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokevirtual toString : ()Ljava/lang/String;
    //   275: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   280: aload_1
    //   281: new java/lang/StringBuilder
    //   284: dup
    //   285: invokespecial <init> : ()V
    //   288: iload #7
    //   290: ifeq -> 303
    //   293: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   296: goto -> 305
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: ldc ''
    //   305: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   308: ldc '  /cc <player> unless "'
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: iload #7
    //   315: ifeq -> 328
    //   318: getstatic org/bukkit/ChatColor.LIGHT_PURPLE : Lorg/bukkit/ChatColor;
    //   321: goto -> 330
    //   324: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   327: athrow
    //   328: ldc ''
    //   330: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   333: ldc 'condition'
    //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: iload #7
    //   340: ifeq -> 353
    //   343: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   346: goto -> 355
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: ldc ''
    //   355: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   358: ldc '" do "'
    //   360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: iload #7
    //   365: ifeq -> 378
    //   368: getstatic org/bukkit/ChatColor.LIGHT_PURPLE : Lorg/bukkit/ChatColor;
    //   371: goto -> 380
    //   374: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   377: athrow
    //   378: ldc ''
    //   380: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   383: ldc 'command'
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: iload #7
    //   390: ifeq -> 403
    //   393: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   396: goto -> 405
    //   399: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   402: athrow
    //   403: ldc ''
    //   405: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   408: ldc '"'
    //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: invokevirtual toString : ()Ljava/lang/String;
    //   416: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   421: aload_1
    //   422: new java/lang/StringBuilder
    //   425: dup
    //   426: invokespecial <init> : ()V
    //   429: iload #7
    //   431: ifeq -> 444
    //   434: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   437: goto -> 446
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: ldc ''
    //   446: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   449: ldc '  /cc <player> if "'
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: iload #7
    //   456: ifeq -> 469
    //   459: getstatic org/bukkit/ChatColor.LIGHT_PURPLE : Lorg/bukkit/ChatColor;
    //   462: goto -> 471
    //   465: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   468: athrow
    //   469: ldc ''
    //   471: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   474: ldc 'condition'
    //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: iload #7
    //   481: ifeq -> 494
    //   484: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   487: goto -> 496
    //   490: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   493: athrow
    //   494: ldc ''
    //   496: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   499: ldc '" do "'
    //   501: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: iload #7
    //   506: ifeq -> 519
    //   509: getstatic org/bukkit/ChatColor.LIGHT_PURPLE : Lorg/bukkit/ChatColor;
    //   512: goto -> 521
    //   515: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   518: athrow
    //   519: ldc ''
    //   521: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   524: ldc 'command'
    //   526: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   529: iload #7
    //   531: ifeq -> 544
    //   534: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   537: goto -> 546
    //   540: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   543: athrow
    //   544: ldc ''
    //   546: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   549: ldc '"'
    //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: invokevirtual toString : ()Ljava/lang/String;
    //   557: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   562: aload_1
    //   563: new java/lang/StringBuilder
    //   566: dup
    //   567: invokespecial <init> : ()V
    //   570: iload #7
    //   572: ifeq -> 585
    //   575: getstatic org/bukkit/ChatColor.GRAY : Lorg/bukkit/ChatColor;
    //   578: goto -> 587
    //   581: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   584: athrow
    //   585: ldc ''
    //   587: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   590: ldc 'e.g.'
    //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: invokevirtual toString : ()Ljava/lang/String;
    //   598: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   603: aload_1
    //   604: new java/lang/StringBuilder
    //   607: dup
    //   608: invokespecial <init> : ()V
    //   611: iload #7
    //   613: ifeq -> 626
    //   616: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   619: goto -> 628
    //   622: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   625: athrow
    //   626: ldc ''
    //   628: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   631: ldc '  /cc konsolas unless -ping->100|-tps-<10.0 do kick konsolas'
    //   633: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: invokevirtual toString : ()Ljava/lang/String;
    //   639: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   644: aload_1
    //   645: new java/lang/StringBuilder
    //   648: dup
    //   649: invokespecial <init> : ()V
    //   652: iload #7
    //   654: ifeq -> 667
    //   657: getstatic org/bukkit/ChatColor.GRAY : Lorg/bukkit/ChatColor;
    //   660: goto -> 669
    //   663: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   666: athrow
    //   667: ldc ''
    //   669: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   672: ldc 'Please note that conditions cannot include any spaces.'
    //   674: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   677: invokevirtual toString : ()Ljava/lang/String;
    //   680: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   685: aload_1
    //   686: new java/lang/StringBuilder
    //   689: dup
    //   690: invokespecial <init> : ()V
    //   693: iload #7
    //   695: ifeq -> 708
    //   698: getstatic org/bukkit/ChatColor.GRAY : Lorg/bukkit/ChatColor;
    //   701: goto -> 710
    //   704: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   707: athrow
    //   708: ldc ''
    //   710: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   713: ldc 'For debug information, enable dev mode in the configuration file. '
    //   715: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   718: invokevirtual toString : ()Ljava/lang/String;
    //   721: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   726: aload_1
    //   727: new java/lang/StringBuilder
    //   730: dup
    //   731: invokespecial <init> : ()V
    //   734: iload #7
    //   736: ifeq -> 749
    //   739: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   742: goto -> 751
    //   745: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   748: athrow
    //   749: ldc ''
    //   751: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   754: ldc '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-'
    //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: invokevirtual toString : ()Ljava/lang/String;
    //   762: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   767: goto -> 877
    //   770: aload_1
    //   771: new java/lang/StringBuilder
    //   774: dup
    //   775: invokespecial <init> : ()V
    //   778: iload #7
    //   780: ifeq -> 793
    //   783: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   786: goto -> 795
    //   789: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   792: athrow
    //   793: ldc ''
    //   795: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   798: ldc '[ConditionalCommands] > Incorrect subcommand.'
    //   800: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: invokevirtual toString : ()Ljava/lang/String;
    //   806: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   811: aload_1
    //   812: new java/lang/StringBuilder
    //   815: dup
    //   816: invokespecial <init> : ()V
    //   819: iload #7
    //   821: ifeq -> 834
    //   824: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   827: goto -> 836
    //   830: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   833: athrow
    //   834: ldc ''
    //   836: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   839: ldc '[ConditionalCommands] >'
    //   841: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   844: iload #7
    //   846: ifeq -> 859
    //   849: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   852: goto -> 861
    //   855: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   858: athrow
    //   859: ldc ''
    //   861: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   864: ldc '   /cc help'
    //   866: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   869: invokevirtual toString : ()Ljava/lang/String;
    //   872: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   877: iconst_0
    //   878: ireturn
    //   879: aload #4
    //   881: iconst_1
    //   882: aaload
    //   883: astore #8
    //   885: aload #4
    //   887: iconst_0
    //   888: aaload
    //   889: invokestatic getPlayer : (Ljava/lang/String;)Lorg/bukkit/entity/Player;
    //   892: astore #9
    //   894: aload #9
    //   896: ifnull -> 916
    //   899: aload #9
    //   901: invokeinterface isOnline : ()Z
    //   906: ifne -> 980
    //   909: goto -> 916
    //   912: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   915: athrow
    //   916: aload_1
    //   917: new java/lang/StringBuilder
    //   920: dup
    //   921: invokespecial <init> : ()V
    //   924: iload #7
    //   926: ifeq -> 946
    //   929: goto -> 936
    //   932: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   935: athrow
    //   936: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   939: goto -> 948
    //   942: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   945: athrow
    //   946: ldc ''
    //   948: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   951: ldc_w '[ConditionalCommands] > Not dispatching command because '
    //   954: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   957: aload #4
    //   959: iconst_0
    //   960: aaload
    //   961: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: ldc_w ' is not online...'
    //   967: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   970: invokevirtual toString : ()Ljava/lang/String;
    //   973: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   978: iconst_1
    //   979: ireturn
    //   980: aload #4
    //   982: iconst_2
    //   983: aaload
    //   984: astore #10
    //   986: invokestatic values : ()[Lme/rerere/matrix/commands/condition/Placeholders;
    //   989: astore #11
    //   991: aload #11
    //   993: arraylength
    //   994: istore #12
    //   996: iconst_0
    //   997: istore #13
    //   999: iload #13
    //   1001: iload #12
    //   1003: if_icmpge -> 1099
    //   1006: aload #11
    //   1008: iload #13
    //   1010: aaload
    //   1011: astore #14
    //   1013: aload #14
    //   1015: invokevirtual getPlaceholder : ()Lme/rerere/matrix/commands/condition/placeholders/Placeholder;
    //   1018: aload #10
    //   1020: invokeinterface shouldApply : (Ljava/lang/String;)Z
    //   1025: ifeq -> 1093
    //   1028: aload #14
    //   1030: invokevirtual getPlaceholder : ()Lme/rerere/matrix/commands/condition/placeholders/Placeholder;
    //   1033: aload #10
    //   1035: aload #9
    //   1037: invokeinterface doSubstitution : (Ljava/lang/String;Lorg/bukkit/entity/Player;)Ljava/lang/String;
    //   1042: astore #10
    //   1044: goto -> 1093
    //   1047: astore #15
    //   1049: aload_1
    //   1050: new java/lang/StringBuilder
    //   1053: dup
    //   1054: invokespecial <init> : ()V
    //   1057: iload #7
    //   1059: ifeq -> 1072
    //   1062: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1065: goto -> 1074
    //   1068: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1071: athrow
    //   1072: ldc ''
    //   1074: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1077: ldc_w '[ConditionalCommands] > Couldn't process placeholder.'
    //   1080: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1083: invokevirtual toString : ()Ljava/lang/String;
    //   1086: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1091: iconst_1
    //   1092: ireturn
    //   1093: iinc #13, 1
    //   1096: goto -> 999
    //   1099: new java/lang/StringBuilder
    //   1102: dup
    //   1103: invokespecial <init> : ()V
    //   1106: astore #11
    //   1108: iconst_4
    //   1109: istore #12
    //   1111: iload #12
    //   1113: aload #4
    //   1115: arraylength
    //   1116: if_icmpge -> 1145
    //   1119: aload #11
    //   1121: aload #4
    //   1123: iload #12
    //   1125: aaload
    //   1126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1129: bipush #32
    //   1131: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1134: pop
    //   1135: iinc #12, 1
    //   1138: goto -> 1111
    //   1141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1144: athrow
    //   1145: aload #4
    //   1147: iconst_3
    //   1148: aaload
    //   1149: ldc_w 'do'
    //   1152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1155: ifne -> 1209
    //   1158: aload_1
    //   1159: new java/lang/StringBuilder
    //   1162: dup
    //   1163: invokespecial <init> : ()V
    //   1166: iload #7
    //   1168: ifeq -> 1188
    //   1171: goto -> 1178
    //   1174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1177: athrow
    //   1178: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1181: goto -> 1190
    //   1184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1187: athrow
    //   1188: ldc ''
    //   1190: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1193: ldc_w '[ConditionalCommands] > Command has no action.'
    //   1196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1199: invokevirtual toString : ()Ljava/lang/String;
    //   1202: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1207: iconst_1
    //   1208: ireturn
    //   1209: new me/rerere/matrix/commands/condition/Expression
    //   1212: dup
    //   1213: aload #10
    //   1215: invokespecial <init> : (Ljava/lang/String;)V
    //   1218: astore #12
    //   1220: goto -> 1269
    //   1223: astore #13
    //   1225: aload_1
    //   1226: new java/lang/StringBuilder
    //   1229: dup
    //   1230: invokespecial <init> : ()V
    //   1233: iload #7
    //   1235: ifeq -> 1248
    //   1238: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1241: goto -> 1250
    //   1244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1247: athrow
    //   1248: ldc ''
    //   1250: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1253: ldc_w '[ConditionalCommands] > Couldn't process command (syntax error).'
    //   1256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1259: invokevirtual toString : ()Ljava/lang/String;
    //   1262: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1267: iconst_0
    //   1268: ireturn
    //   1269: aload #8
    //   1271: astore #13
    //   1273: iconst_m1
    //   1274: istore #14
    //   1276: aload #13
    //   1278: invokevirtual hashCode : ()I
    //   1281: lookupswitch default -> 1346, -840451150 -> 1308, 3357 -> 1332
    //   1308: aload #13
    //   1310: ldc_w 'unless'
    //   1313: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1316: ifeq -> 1346
    //   1319: goto -> 1326
    //   1322: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1325: athrow
    //   1326: iconst_0
    //   1327: istore #14
    //   1329: goto -> 1346
    //   1332: aload #13
    //   1334: ldc_w 'if'
    //   1337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1340: ifeq -> 1346
    //   1343: iconst_1
    //   1344: istore #14
    //   1346: iload #14
    //   1348: lookupswitch default -> 1549, 0 -> 1376, 1 -> 1466
    //   1376: aload #12
    //   1378: invokevirtual evaluate : ()Z
    //   1381: ifne -> 1408
    //   1384: goto -> 1391
    //   1387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1390: athrow
    //   1391: aload_0
    //   1392: aload_1
    //   1393: aload #11
    //   1395: invokevirtual toString : ()Ljava/lang/String;
    //   1398: invokespecial dispatchCommand : (Lorg/bukkit/command/CommandSender;Ljava/lang/String;)V
    //   1401: goto -> 1658
    //   1404: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1407: athrow
    //   1408: aload_1
    //   1409: new java/lang/StringBuilder
    //   1412: dup
    //   1413: invokespecial <init> : ()V
    //   1416: iload #7
    //   1418: ifeq -> 1431
    //   1421: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1424: goto -> 1433
    //   1427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1430: athrow
    //   1431: ldc ''
    //   1433: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1436: ldc_w '[ConditionalCommands] > Not dispatching command because "'
    //   1439: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1442: aload #4
    //   1444: iconst_2
    //   1445: aaload
    //   1446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1449: ldc_w '" evaluated to true'
    //   1452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1455: invokevirtual toString : ()Ljava/lang/String;
    //   1458: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1463: goto -> 1658
    //   1466: aload #12
    //   1468: invokevirtual evaluate : ()Z
    //   1471: ifeq -> 1491
    //   1474: aload_0
    //   1475: aload_1
    //   1476: aload #11
    //   1478: invokevirtual toString : ()Ljava/lang/String;
    //   1481: invokespecial dispatchCommand : (Lorg/bukkit/command/CommandSender;Ljava/lang/String;)V
    //   1484: goto -> 1658
    //   1487: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1490: athrow
    //   1491: aload_1
    //   1492: new java/lang/StringBuilder
    //   1495: dup
    //   1496: invokespecial <init> : ()V
    //   1499: iload #7
    //   1501: ifeq -> 1514
    //   1504: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1507: goto -> 1516
    //   1510: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1513: athrow
    //   1514: ldc ''
    //   1516: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1519: ldc_w '[ConditionalCommands] > Not dispatching command because "'
    //   1522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1525: aload #4
    //   1527: iconst_2
    //   1528: aaload
    //   1529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1532: ldc_w '" evaluated to false'
    //   1535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1538: invokevirtual toString : ()Ljava/lang/String;
    //   1541: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1546: goto -> 1658
    //   1549: aload_1
    //   1550: new java/lang/StringBuilder
    //   1553: dup
    //   1554: invokespecial <init> : ()V
    //   1557: iload #7
    //   1559: ifeq -> 1572
    //   1562: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1565: goto -> 1574
    //   1568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1571: athrow
    //   1572: ldc ''
    //   1574: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1577: ldc '[ConditionalCommands] > Incorrect subcommand.'
    //   1579: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1582: invokevirtual toString : ()Ljava/lang/String;
    //   1585: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1590: aload_1
    //   1591: new java/lang/StringBuilder
    //   1594: dup
    //   1595: invokespecial <init> : ()V
    //   1598: iload #7
    //   1600: ifeq -> 1613
    //   1603: getstatic org/bukkit/ChatColor.GOLD : Lorg/bukkit/ChatColor;
    //   1606: goto -> 1615
    //   1609: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1612: athrow
    //   1613: ldc ''
    //   1615: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1618: ldc '[ConditionalCommands] >'
    //   1620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1623: iload #7
    //   1625: ifeq -> 1638
    //   1628: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   1631: goto -> 1640
    //   1634: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1637: athrow
    //   1638: ldc ''
    //   1640: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1643: ldc '   /cc help'
    //   1645: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1648: invokevirtual toString : ()Ljava/lang/String;
    //   1651: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1656: iconst_0
    //   1657: ireturn
    //   1658: iconst_1
    //   1659: ireturn
    // Exception table:
    //   from	to	target	type
    //   15	28	31	java/lang/Exception
    //   21	42	45	java/lang/Exception
    //   35	62	65	java/lang/Exception
    //   49	75	75	java/lang/Exception
    //   81	116	116	java/lang/Exception
    //   122	141	141	java/lang/Exception
    //   165	184	187	java/lang/Exception
    //   172	204	207	java/lang/Exception
    //   191	217	217	java/lang/Exception
    //   223	258	258	java/lang/Exception
    //   264	299	299	java/lang/Exception
    //   305	324	324	java/lang/Exception
    //   330	349	349	java/lang/Exception
    //   355	374	374	java/lang/Exception
    //   380	399	399	java/lang/Exception
    //   405	440	440	java/lang/Exception
    //   446	465	465	java/lang/Exception
    //   471	490	490	java/lang/Exception
    //   496	515	515	java/lang/Exception
    //   521	540	540	java/lang/Exception
    //   546	581	581	java/lang/Exception
    //   587	622	622	java/lang/Exception
    //   628	663	663	java/lang/Exception
    //   669	704	704	java/lang/Exception
    //   710	745	745	java/lang/Exception
    //   770	789	789	java/lang/Exception
    //   795	830	830	java/lang/Exception
    //   836	855	855	java/lang/Exception
    //   894	909	912	java/lang/Exception
    //   899	929	932	java/lang/Exception
    //   916	942	942	java/lang/Exception
    //   1028	1044	1047	java/lang/Exception
    //   1049	1068	1068	java/lang/Exception
    //   1111	1141	1141	java/lang/Exception
    //   1145	1171	1174	java/lang/Exception
    //   1158	1184	1184	java/lang/Exception
    //   1209	1220	1223	me/rerere/matrix/commands/condition/Expression$ParseException
    //   1225	1244	1244	java/lang/Exception
    //   1276	1319	1322	java/lang/Exception
    //   1346	1384	1387	java/lang/Exception
    //   1376	1404	1404	java/lang/Exception
    //   1408	1427	1427	java/lang/Exception
    //   1466	1487	1487	java/lang/Exception
    //   1491	1510	1510	java/lang/Exception
    //   1549	1568	1568	java/lang/Exception
    //   1574	1609	1609	java/lang/Exception
    //   1615	1634	1634	java/lang/Exception
  }
  
  public void enable() {
    long l = a ^ 0x22564A181A3FL;
    for (Placeholders placeholders : Placeholders.values())
      placeholders.getPlaceholder().init((Plugin)Matrix.b()); 
    ((PluginCommand)Objects.<PluginCommand>requireNonNull(Bukkit.getPluginCommand("coc"), "Command `coc` didn't registered in plugin.yml!")).setExecutor(this);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\ConditionalCommands.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */