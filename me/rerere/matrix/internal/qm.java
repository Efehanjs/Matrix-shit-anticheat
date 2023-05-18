package me.rerere.matrix.internal;

import java.util.Map;
import java.util.UUID;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;

public final class qm extends Lambda implements Function1 {
  public static final qm i = new qm();
  
  @NotNull
  public final Pair b(@NotNull Map.Entry paramEntry) {
    return TuplesKt.to(Bukkit.getPlayer((UUID)paramEntry.getKey()), paramEntry.getValue());
  }
  
  public qm() {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */