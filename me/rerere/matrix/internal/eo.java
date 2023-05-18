package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.permissions.Permission;

public final class eo extends Lambda implements Function1 {
  public static final eo i = new eo();
  
  @NotNull
  public final String b(Permission paramPermission) {
    return paramPermission.getName();
  }
  
  public eo() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\eo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */