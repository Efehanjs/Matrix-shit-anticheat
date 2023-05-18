package me.rerere.matrix.internal;

import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.command.CommandSender;

public abstract class xl {
  private boolean z;
  
  @NotNull
  private final String k;
  
  @NotNull
  private final String v;
  
  @NotNull
  private final String b;
  
  @NotNull
  private final String i;
  
  private static String c;
  
  @NotNull
  public final String m() {
    return this.v;
  }
  
  public final boolean b() {
    return this.z;
  }
  
  @Nullable
  public abstract List b(long paramLong);
  
  public abstract void b(@NotNull CommandSender paramCommandSender, long paramLong, @NotNull String[] paramArrayOfString);
  
  public xl(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4) {
    this.b = paramString1;
    this.i = paramString2;
    this.k = paramString3;
    this.v = paramString4;
  }
  
  @NotNull
  public final String p() {
    return this.k;
  }
  
  @NotNull
  public final String j() {
    return this.i;
  }
  
  public final void b(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  @NotNull
  public final String b() {
    return this.b;
  }
  
  public static void I(String paramString) {
    c = paramString;
  }
  
  public static String g() {
    return c;
  }
  
  static {
    if (g() == null)
      I("TnrMC"); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */